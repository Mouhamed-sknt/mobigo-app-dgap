package com.morpho.morphosmart.sdk;

import android.util.Log;
import com.morpho.android.annotation.WakeLockAspect;
import com.morpho.android.annotation.WakeLockabble;
import java.util.Observer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

/* JADX INFO: loaded from: classes.dex */
public class MorphoUser implements Cloneable {
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static MorphoUserNative morphoUserNative;
    protected boolean cppMemOwn;
    private Long morphoUserPointerCPP;
    private String userID;

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("MorphoUser.java", MorphoUser.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "dbDelete", "com.morpho.morphosmart.sdk.MorphoUser", "", "", "", "int"), 212);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "dbStore", "com.morpho.morphosmart.sdk.MorphoUser", "", "", "", "int"), 256);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "enroll", "com.morpho.morphosmart.sdk.MorphoUser", "int:int:int:com.morpho.morphosmart.sdk.CompressionAlgorithm:int:boolean:int:com.morpho.morphosmart.sdk.TemplateType:com.morpho.morphosmart.sdk.TemplateFVPType:boolean:com.morpho.morphosmart.sdk.Coder:int:com.morpho.morphosmart.sdk.TemplateList:int:java.util.Observer", "timeout:acquisitionThreshold:advancedSecurityLevelsRequired:compressAlgo:compressRate:exportMinutiae:fingerNumber:templateType:templateFVPType:saveRecord:coder:detectModeChoice:templateList:callbackCmd:callback", "", "int"), 400);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "enroll", "com.morpho.morphosmart.sdk.MorphoUser", "int:int:int:com.morpho.morphosmart.sdk.CompressionAlgorithm:int:int:int:com.morpho.morphosmart.sdk.TemplateType:com.morpho.morphosmart.sdk.TemplateFVPType:boolean:com.morpho.morphosmart.sdk.Coder:int:com.morpho.morphosmart.sdk.TemplateList:int:java.util.Observer", "timeout:acquisitionThreshold:advancedSecurityLevelsRequired:compressAlgo:compressRate:exportMinutiae:fingerNumber:templateType:templateFVPType:saveRecord:coder:detectModeChoice:templateList:callbackCmd:callback", "", "int"), 537);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "verify", "com.morpho.morphosmart.sdk.MorphoUser", "int:int:com.morpho.morphosmart.sdk.Coder:int:com.morpho.morphosmart.sdk.MatchingStrategy:int:java.util.Observer:com.morpho.morphosmart.sdk.ResultMatching", "timeout:far:coder:detectModeChoice:matchingStrategy:callbackCmd:callback:resultMatching", "", "int"), 598);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "dbUpdatePublicFields", "com.morpho.morphosmart.sdk.MorphoUser", "", "", "", "int"), 668);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "dbVerifyAndUpdate", "com.morpho.morphosmart.sdk.MorphoUser", "int:int:com.morpho.morphosmart.sdk.Coder:int:com.morpho.morphosmart.sdk.MatchingStrategy:int:java.util.Observer", "timeout:far:coder:detectModeChoice:matchingStrategy:callbackCmd:callback", "", "int"), 716);
    }

    @WakeLockabble
    public int dbDelete() {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_0, this, this);
        return Conversions.intValue(dbDelete_aroundBody1$advice(this, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int dbStore() {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_1, this, this);
        return Conversions.intValue(dbStore_aroundBody3$advice(this, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int dbUpdatePublicFields() {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_5, this, this);
        return Conversions.intValue(dbUpdatePublicFields_aroundBody11$advice(this, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int dbVerifyAndUpdate(int timeout, int far, Coder coder, int detectModeChoice, MatchingStrategy matchingStrategy, int callbackCmd, Observer callback) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_6, (Object) this, (Object) this, new Object[]{Conversions.intObject(timeout), Conversions.intObject(far), coder, Conversions.intObject(detectModeChoice), matchingStrategy, Conversions.intObject(callbackCmd), callback});
        return Conversions.intValue(dbVerifyAndUpdate_aroundBody13$advice(this, timeout, far, coder, detectModeChoice, matchingStrategy, callbackCmd, callback, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int enroll(int timeout, int acquisitionThreshold, int advancedSecurityLevelsRequired, CompressionAlgorithm compressAlgo, int compressRate, int exportMinutiae, int fingerNumber, TemplateType templateType, TemplateFVPType templateFVPType, boolean saveRecord, Coder coder, int detectModeChoice, TemplateList templateList, int callbackCmd, Observer callback) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_3, (Object) this, (Object) this, new Object[]{Conversions.intObject(timeout), Conversions.intObject(acquisitionThreshold), Conversions.intObject(advancedSecurityLevelsRequired), compressAlgo, Conversions.intObject(compressRate), Conversions.intObject(exportMinutiae), Conversions.intObject(fingerNumber), templateType, templateFVPType, Conversions.booleanObject(saveRecord), coder, Conversions.intObject(detectModeChoice), templateList, Conversions.intObject(callbackCmd), callback});
        return Conversions.intValue(enroll_aroundBody7$advice(this, timeout, acquisitionThreshold, advancedSecurityLevelsRequired, compressAlgo, compressRate, exportMinutiae, fingerNumber, templateType, templateFVPType, saveRecord, coder, detectModeChoice, templateList, callbackCmd, callback, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int enroll(int timeout, int acquisitionThreshold, int advancedSecurityLevelsRequired, CompressionAlgorithm compressAlgo, int compressRate, boolean exportMinutiae, int fingerNumber, TemplateType templateType, TemplateFVPType templateFVPType, boolean saveRecord, Coder coder, int detectModeChoice, TemplateList templateList, int callbackCmd, Observer callback) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_2, (Object) this, (Object) this, new Object[]{Conversions.intObject(timeout), Conversions.intObject(acquisitionThreshold), Conversions.intObject(advancedSecurityLevelsRequired), compressAlgo, Conversions.intObject(compressRate), Conversions.booleanObject(exportMinutiae), Conversions.intObject(fingerNumber), templateType, templateFVPType, Conversions.booleanObject(saveRecord), coder, Conversions.intObject(detectModeChoice), templateList, Conversions.intObject(callbackCmd), callback});
        return Conversions.intValue(enroll_aroundBody5$advice(this, timeout, acquisitionThreshold, advancedSecurityLevelsRequired, compressAlgo, compressRate, exportMinutiae, fingerNumber, templateType, templateFVPType, saveRecord, coder, detectModeChoice, templateList, callbackCmd, callback, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int verify(int timeout, int far, Coder coder, int detectModeChoice, MatchingStrategy matchingStrategy, int callbackCmd, Observer callback, ResultMatching resultMatching) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_4, (Object) this, (Object) this, new Object[]{Conversions.intObject(timeout), Conversions.intObject(far), coder, Conversions.intObject(detectModeChoice), matchingStrategy, Conversions.intObject(callbackCmd), callback, resultMatching});
        return Conversions.intValue(verify_aroundBody9$advice(this, timeout, far, coder, detectModeChoice, matchingStrategy, callbackCmd, callback, resultMatching, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    static {
        ajc$preClinit();
        morphoUserNative = new MorphoUserNative();
    }

    public MorphoUser() {
        this.morphoUserPointerCPP = new Long(0L);
        this.cppMemOwn = false;
        long cppPtr = morphoUserNative.getCPPInstance();
        if (cppPtr != 0) {
            this.cppMemOwn = true;
            this.morphoUserPointerCPP = Long.valueOf(cppPtr);
        } else {
            try {
                throw new MorphoSmartException("classe non instantiÃƒÂ©");
            } catch (MorphoSmartException e) {
                e.printStackTrace();
            }
        }
    }

    public MorphoUser(String userID) {
        this.morphoUserPointerCPP = new Long(0L);
        this.cppMemOwn = false;
        if (userID == null) {
            try {
                throw new MorphoSmartException("USer ID object is null");
            } catch (MorphoSmartException e) {
                e.printStackTrace();
                return;
            }
        }
        long cppPtr = morphoUserNative.getCPPInstance(userID);
        if (cppPtr != 0) {
            this.cppMemOwn = true;
            this.morphoUserPointerCPP = Long.valueOf(cppPtr);
            this.userID = userID;
        } else {
            try {
                throw new MorphoSmartException("cppPtr is null");
            } catch (MorphoSmartException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static final /* synthetic */ Object dbDelete_aroundBody1$advice(MorphoUser ajc$this, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(dbDelete_aroundBody0(ajc$this, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object dbStore_aroundBody3$advice(MorphoUser ajc$this, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(dbStore_aroundBody2(ajc$this, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object dbUpdatePublicFields_aroundBody11$advice(MorphoUser ajc$this, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(dbUpdatePublicFields_aroundBody10(ajc$this, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object dbVerifyAndUpdate_aroundBody13$advice(MorphoUser ajc$this, int timeout, int far, Coder coder, int detectModeChoice, MatchingStrategy matchingStrategy, int callbackCmd, Observer callback, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(dbVerifyAndUpdate_aroundBody12(ajc$this, timeout, far, coder, detectModeChoice, matchingStrategy, callbackCmd, callback, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object enroll_aroundBody5$advice(MorphoUser ajc$this, int timeout, int acquisitionThreshold, int advancedSecurityLevelsRequired, CompressionAlgorithm compressAlgo, int compressRate, boolean exportMinutiae, int fingerNumber, TemplateType templateType, TemplateFVPType templateFVPType, boolean saveRecord, Coder coder, int detectModeChoice, TemplateList templateList, int callbackCmd, Observer callback, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(enroll_aroundBody4(ajc$this, timeout, acquisitionThreshold, advancedSecurityLevelsRequired, compressAlgo, compressRate, exportMinutiae, fingerNumber, templateType, templateFVPType, saveRecord, coder, detectModeChoice, templateList, callbackCmd, callback, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object enroll_aroundBody7$advice(MorphoUser ajc$this, int timeout, int acquisitionThreshold, int advancedSecurityLevelsRequired, CompressionAlgorithm compressAlgo, int compressRate, int exportMinutiae, int fingerNumber, TemplateType templateType, TemplateFVPType templateFVPType, boolean saveRecord, Coder coder, int detectModeChoice, TemplateList templateList, int callbackCmd, Observer callback, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(enroll_aroundBody6(ajc$this, timeout, acquisitionThreshold, advancedSecurityLevelsRequired, compressAlgo, compressRate, exportMinutiae, fingerNumber, templateType, templateFVPType, saveRecord, coder, detectModeChoice, templateList, callbackCmd, callback, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object verify_aroundBody9$advice(MorphoUser ajc$this, int timeout, int far, Coder coder, int detectModeChoice, MatchingStrategy matchingStrategy, int callbackCmd, Observer callback, ResultMatching resultMatching, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(verify_aroundBody8(ajc$this, timeout, far, coder, detectModeChoice, matchingStrategy, callbackCmd, callback, resultMatching, joinPoint));
            return returnObject;
        } finally {
        }
    }

    public MorphoUser(MorphoUser user) {
        this.morphoUserPointerCPP = new Long(0L);
        this.cppMemOwn = false;
        if (user == null) {
            try {
                throw new MorphoSmartException("MorphoUser object is null");
            } catch (MorphoSmartException e) {
                e.printStackTrace();
            }
        } else {
            if (!user.cppMemOwn) {
                long cppPtr = morphoUserNative.getCPPInstance(user.morphoUserPointerCPP.longValue());
                if (cppPtr != 0) {
                    this.cppMemOwn = true;
                    this.morphoUserPointerCPP = Long.valueOf(cppPtr);
                    return;
                } else {
                    try {
                        throw new MorphoSmartException("cppPtr is null");
                    } catch (MorphoSmartException e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
            }
            try {
                throw new MorphoSmartException("cppMemOwn is true");
            } catch (MorphoSmartException e3) {
                e3.printStackTrace();
            }
        }
    }

    protected void finalize() {
        if (this.cppMemOwn) {
            morphoUserNative.deleteInstance(this.morphoUserPointerCPP.longValue());
            this.cppMemOwn = false;
        }
    }

    public Object clone() {
        return new MorphoUser(this);
    }

    public void setMorphoUserPointerCPP(long morphoUserPointerCPP) {
        this.morphoUserPointerCPP = Long.valueOf(morphoUserPointerCPP);
        this.cppMemOwn = true;
    }

    public String getUserID() {
        return this.userID;
    }

    public long getMorphoUserPointerCPP() {
        return this.morphoUserPointerCPP.longValue();
    }

    public int cancelLiveAcquisition() {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoUserNative.cancelLiveAcquisition(this.morphoUserPointerCPP.longValue());
    }

    private static final /* synthetic */ int dbDelete_aroundBody0(MorphoUser ajc$this, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        return morphoUserNative.dbDelete(ajc$this.morphoUserPointerCPP.longValue());
    }

    private static final /* synthetic */ int dbStore_aroundBody2(MorphoUser ajc$this, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        return morphoUserNative.dbStore(ajc$this.morphoUserPointerCPP.longValue());
    }

    public int setNoCheckOnTemplateForDBStore(boolean noCheckOnTemplate) {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoUserNative.setNoCheckOnTemplateForDBStore(this.morphoUserPointerCPP.longValue(), noCheckOnTemplate);
    }

    public int setMaskCheckOnTemplateForDBStore(int maskCheckOnTemplate) {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoUserNative.setMaskCheckOnTemplateForDBStore(this.morphoUserPointerCPP.longValue(), maskCheckOnTemplate);
    }

    public int putField(int fieldIndex, String fieldData) {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoUserNative.putField(this.morphoUserPointerCPP.longValue(), fieldIndex, fieldData);
    }

    public int putBufferField(int fieldIndex, byte[] fieldData) {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoUserNative.putBufferField(this.morphoUserPointerCPP.longValue(), fieldIndex, fieldData);
    }

    public String getField(int fieldIndex) throws MorphoSmartException {
        MorphoString fieldData = new MorphoString();
        int ret = morphoUserNative.getField(this.morphoUserPointerCPP.longValue(), fieldIndex, fieldData);
        if (ret != 0) {
            throw new MorphoSmartException(ErrorCodes.getError(ret, 0));
        }
        return fieldData.getData();
    }

    public byte[] getBufferField(int fieldIndex) throws MorphoSmartException {
        MorphoString fieldData = new MorphoString();
        int ret = morphoUserNative.getBufferField(this.morphoUserPointerCPP.longValue(), fieldIndex, fieldData);
        if (ret != 0) {
            throw new MorphoSmartException(ErrorCodes.getError(ret, 0));
        }
        return fieldData.getBufferData();
    }

    private static final /* synthetic */ int enroll_aroundBody4(MorphoUser ajc$this, int timeout, int acquisitionThreshold, int advancedSecurityLevelsRequired, CompressionAlgorithm compressAlgo, int compressRate, boolean exportMinutiae, int fingerNumber, TemplateType templateType, TemplateFVPType templateFVPType, boolean saveRecord, Coder coder, int detectModeChoice, TemplateList templateList, int callbackCmd, Observer callback, JoinPoint joinPoint) {
        int exportMinutiaeInt;
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (compressAlgo == null || templateType == null || templateFVPType == null || coder == null || templateList == null) {
            return -5;
        }
        if (!exportMinutiae) {
            exportMinutiaeInt = 0;
        } else {
            exportMinutiaeInt = 1;
        }
        return morphoUserNative.enroll(ajc$this.morphoUserPointerCPP.longValue(), timeout, acquisitionThreshold, advancedSecurityLevelsRequired, compressAlgo.getCode(), compressRate, exportMinutiaeInt, fingerNumber, templateType.getCode(), templateFVPType.getCode(), saveRecord, coder.getCode(), detectModeChoice, templateList, callbackCmd, callback);
    }

    private static final /* synthetic */ int enroll_aroundBody6(MorphoUser ajc$this, int timeout, int acquisitionThreshold, int advancedSecurityLevelsRequired, CompressionAlgorithm compressAlgo, int compressRate, int exportMinutiae, int fingerNumber, TemplateType templateType, TemplateFVPType templateFVPType, boolean saveRecord, Coder coder, int detectModeChoice, TemplateList templateList, int callbackCmd, Observer callback, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (compressAlgo == null || templateType == null || templateFVPType == null || coder == null || templateList == null) {
            return -5;
        }
        return morphoUserNative.enroll(ajc$this.morphoUserPointerCPP.longValue(), timeout, acquisitionThreshold, advancedSecurityLevelsRequired, compressAlgo.getCode(), compressRate, exportMinutiae, fingerNumber, templateType.getCode(), templateFVPType.getCode(), saveRecord, coder.getCode(), detectModeChoice, templateList, callbackCmd, callback);
    }

    private static final /* synthetic */ int verify_aroundBody8(MorphoUser ajc$this, int timeout, int far, Coder coder, int detectModeChoice, MatchingStrategy matchingStrategy, int callbackCmd, Observer callback, ResultMatching resultMatching, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (coder == null || matchingStrategy == null) {
            return -5;
        }
        return morphoUserNative.verify(ajc$this.morphoUserPointerCPP.longValue(), timeout, far, coder.getCode(), detectModeChoice, matchingStrategy.getValue(), callbackCmd, callback, resultMatching);
    }

    public int putTemplate(Template template, Integer templateIndex) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (template == null || templateIndex == null) {
            return -5;
        }
        return morphoUserNative.putTemplate(this.morphoUserPointerCPP.longValue(), template, templateIndex);
    }

    private static final /* synthetic */ int dbUpdatePublicFields_aroundBody10(MorphoUser ajc$this, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        return morphoUserNative.dbUpdatePublicFields(ajc$this.morphoUserPointerCPP.longValue());
    }

    private static final /* synthetic */ int dbVerifyAndUpdate_aroundBody12(MorphoUser ajc$this, int timeout, int far, Coder coder, int detectModeChoice, MatchingStrategy matchingStrategy, int callbackCmd, Observer callback, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (coder == null || matchingStrategy == null) {
            return -5;
        }
        return morphoUserNative.dbVerifyAndUpdate(ajc$this.morphoUserPointerCPP.longValue(), timeout, far, coder.getCode(), detectModeChoice, matchingStrategy.getValue(), callbackCmd, callback);
    }

    public int getEnrollmentType() {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoUserNative.getEnrollmentType(this.morphoUserPointerCPP.longValue());
    }

    public int setEnrollmentType(EnrollmentType enrollmentType) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (enrollmentType == null) {
            return -5;
        }
        return morphoUserNative.setEnrollmentType(this.morphoUserPointerCPP.longValue(), enrollmentType.getValue());
    }

    public int getUserTemplateQuality(int indexDB, String userID, int userIdSize, long userIndex, TemplateQuality templateQuality, FingerNumber fingerNumber) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (userID == null || templateQuality == null || fingerNumber == null) {
            return -5;
        }
        return morphoUserNative.getUserTemplateQuality(this.morphoUserPointerCPP.longValue(), indexDB, userID, userIdSize, userIndex, templateQuality, fingerNumber);
    }

    public int putFVPTemplate(TemplateFVP templateFVP, CustomInteger templateFVPIndex) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (templateFVP == null || templateFVPIndex == null) {
            return -5;
        }
        if (ErrorCodes.IntegrerInitializationValueOf(templateFVPIndex).booleanValue()) {
            return -94;
        }
        return morphoUserNative.putFVPTemplate(this.morphoUserPointerCPP.longValue(), templateFVP, templateFVPIndex);
    }

    public int getTemplate(int templateIndex, Template template) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (template == null) {
            return -5;
        }
        return morphoUserNative.getTemplate(this.morphoUserPointerCPP.longValue(), templateIndex, template);
    }

    public int getFVPTemplate(int templateIndex, TemplateFVP templateFVP) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (templateFVP == null) {
            return -5;
        }
        return morphoUserNative.getFVPTemplate(this.morphoUserPointerCPP.longValue(), templateIndex, templateFVP);
    }

    public int getNbTemplate(CustomInteger nbTemplate) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (nbTemplate == null) {
            return -5;
        }
        if (ErrorCodes.IntegrerInitializationValueOf(nbTemplate).booleanValue()) {
            return -94;
        }
        return morphoUserNative.getNbTemplate(this.morphoUserPointerCPP.longValue(), nbTemplate);
    }

    public int getNbTemplateFVP(CustomInteger nbTemplateFVP) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (nbTemplateFVP == null) {
            return -5;
        }
        if (ErrorCodes.IntegrerInitializationValueOf(nbTemplateFVP).booleanValue()) {
            return -94;
        }
        return morphoUserNative.getNbTemplateFVP(this.morphoUserPointerCPP.longValue(), nbTemplateFVP);
    }

    public int setTemplateUpdateMask(boolean[] fingerprintUpdateMask) {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoUserNative.setTemplateUpdateMask(this.morphoUserPointerCPP.longValue(), fingerprintUpdateMask);
    }
}
