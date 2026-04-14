package com.morpho.android.annotation;

import android.os.PowerManager;
import android.util.Log;
import com.morpho.android.usb.USBManager;
import org.aspectj.lang.NoAspectBoundException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/* JADX INFO: loaded from: classes.dex */
@Aspect
public class WakeLockAspect {
    public static final String TAG = WakeLockAspect.class.getSimpleName();
    private static /* synthetic */ Throwable ajc$initFailureCause;
    public static /* synthetic */ WakeLockAspect ajc$perSingletonInstance = null;
    private PowerManager.WakeLock wakeLock = null;

    private static /* synthetic */ void ajc$postClinit() {
        ajc$perSingletonInstance = new WakeLockAspect();
    }

    public static WakeLockAspect aspectOf() {
        if (ajc$perSingletonInstance != null) {
            return ajc$perSingletonInstance;
        }
        throw new NoAspectBoundException("com.morpho.android.annotation.WakeLockAspect", ajc$initFailureCause);
    }

    public static boolean hasAspect() {
        return ajc$perSingletonInstance != null;
    }

    static {
        try {
            ajc$postClinit();
        } catch (Throwable th) {
            ajc$initFailureCause = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void acquireWakeLock() {
        USBManager.getInstance();
        if (!USBManager.WakeLockEnabled) {
            Log.e(TAG, "Wakelock not used");
            return;
        }
        try {
            PowerManager pm = (PowerManager) USBManager.context.getSystemService("power");
            this.wakeLock = pm.newWakeLock(1, "CaptureWakelockTag");
            this.wakeLock.acquire();
            Log.e(TAG, "Creates and Acquires a new wake lock.");
        } catch (Exception e) {
            Log.e(TAG, "Failed to acquire wakelock : " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void releaseWakeLock() {
        USBManager.getInstance();
        if (!USBManager.WakeLockEnabled) {
            Log.e(TAG, "Wakelock not used");
            return;
        }
        if (this.wakeLock != null) {
            try {
                this.wakeLock.release();
                Log.e(TAG, "Releases the wake lock.");
            } catch (Exception e) {
                Log.e(TAG, "Failed to release wakelock : " + e.getMessage());
            }
            this.wakeLock = null;
        }
    }

    @Pointcut("@annotation(WakeLockabble)")
    public /* synthetic */ void annotationPointCutDefinition() {
    }

    @Pointcut("execution(* *(..))")
    public /* synthetic */ void atExecution() {
    }

    @Around("@annotation(WakeLockabble) && execution(* *(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = joinPoint.proceed();
            return returnObject;
        } finally {
        }
    }
}
