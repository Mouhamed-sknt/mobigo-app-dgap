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
public class MorphoDatabase implements Cloneable {
    public static final int MORPHO_FINGER_MAX = 2;
    public static final int MORPHO_LEN_FIELD_MAX = 128;
    public static final int MORPHO_NB_DATABASE_MAX = 5;
    public static final int MORPHO_NB_FIELD_MAX = 20;
    public static final int MORPHO_NB_RECORD_MIN = 1;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static MorphoDatabaseNative morphoDatabaseNative;
    protected boolean cppMemOwn;
    private Long morphoDatabasePointerCPP;

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("MorphoDatabase.java", MorphoDatabase.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "dbCreate", "com.morpho.morphosmart.sdk.MorphoDatabase", "int:int:com.morpho.morphosmart.sdk.TemplateType:int:boolean", "maxRecord:maxNbFinger:templateType:dataBaseIndex:encryptDB", "", "int"), 309);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "dbCreate", "com.morpho.morphosmart.sdk.MorphoDatabase", "int:int:com.morpho.morphosmart.sdk.TemplateType:int", "maxRecord:maxNbFinger:templateType:dataBaseIndex", "", "int"), 328);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "dbCreate", "com.morpho.morphosmart.sdk.MorphoDatabase", "int:int:com.morpho.morphosmart.sdk.TemplateType", "maxRecord:maxNbFinger:templateType", "", "int"), 347);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "dbDelete", "com.morpho.morphosmart.sdk.MorphoDatabase", "com.morpho.morphosmart.sdk.MorphoTypeDeletion", "morphoTypeDeletion", "", "int"), 413);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "identify", "com.morpho.morphosmart.sdk.MorphoDatabase", "int:int:com.morpho.morphosmart.sdk.Coder:int:com.morpho.morphosmart.sdk.MatchingStrategy:int:java.util.Observer:com.morpho.morphosmart.sdk.ResultMatching:int:com.morpho.morphosmart.sdk.MorphoUser", "timeout:far:coder:detectModeChoice:matchingStrategy:callbackCmd:callback:resultMatching:nbFingersToMatch:morphoUser", "", "int"), 479);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "identify", "com.morpho.morphosmart.sdk.MorphoDatabase", "int:int:com.morpho.morphosmart.sdk.Coder:int:com.morpho.morphosmart.sdk.MatchingStrategy:int:java.util.Observer:com.morpho.morphosmart.sdk.ResultMatching:com.morpho.morphosmart.sdk.MorphoUser", "timeout:far:coder:detectModeChoice:matchingStrategy:callbackCmd:callback:resultMatching:morphoUser", "", "int"), 498);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "identifyMatch", "com.morpho.morphosmart.sdk.MorphoDatabase", "int:com.morpho.morphosmart.sdk.TemplateList:com.morpho.morphosmart.sdk.MorphoUser:com.morpho.morphosmart.sdk.ResultMatching", "far:templateList:morphoUser:resultMatching", "", "int"), 544);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "identifyMatch", "com.morpho.morphosmart.sdk.MorphoDatabase", "int:com.morpho.morphosmart.sdk.TemplateList:com.morpho.morphosmart.sdk.MorphoUser", "far:templateList:morphoUser", "", "int"), 563);
    }

    @WakeLockabble
    public int dbCreate(int maxRecord, int maxNbFinger, TemplateType templateType) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_2, (Object) this, (Object) this, new Object[]{Conversions.intObject(maxRecord), Conversions.intObject(maxNbFinger), templateType});
        return Conversions.intValue(dbCreate_aroundBody5$advice(this, maxRecord, maxNbFinger, templateType, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int dbCreate(int maxRecord, int maxNbFinger, TemplateType templateType, int dataBaseIndex) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_1, (Object) this, (Object) this, new Object[]{Conversions.intObject(maxRecord), Conversions.intObject(maxNbFinger), templateType, Conversions.intObject(dataBaseIndex)});
        return Conversions.intValue(dbCreate_aroundBody3$advice(this, maxRecord, maxNbFinger, templateType, dataBaseIndex, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int dbCreate(int maxRecord, int maxNbFinger, TemplateType templateType, int dataBaseIndex, boolean encryptDB) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_0, (Object) this, (Object) this, new Object[]{Conversions.intObject(maxRecord), Conversions.intObject(maxNbFinger), templateType, Conversions.intObject(dataBaseIndex), Conversions.booleanObject(encryptDB)});
        return Conversions.intValue(dbCreate_aroundBody1$advice(this, maxRecord, maxNbFinger, templateType, dataBaseIndex, encryptDB, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int dbDelete(MorphoTypeDeletion morphoTypeDeletion) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_3, this, this, morphoTypeDeletion);
        return Conversions.intValue(dbDelete_aroundBody7$advice(this, morphoTypeDeletion, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int identify(int timeout, int far, Coder coder, int detectModeChoice, MatchingStrategy matchingStrategy, int callbackCmd, Observer callback, ResultMatching resultMatching, int nbFingersToMatch, MorphoUser morphoUser) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_4, (Object) this, (Object) this, new Object[]{Conversions.intObject(timeout), Conversions.intObject(far), coder, Conversions.intObject(detectModeChoice), matchingStrategy, Conversions.intObject(callbackCmd), callback, resultMatching, Conversions.intObject(nbFingersToMatch), morphoUser});
        return Conversions.intValue(identify_aroundBody9$advice(this, timeout, far, coder, detectModeChoice, matchingStrategy, callbackCmd, callback, resultMatching, nbFingersToMatch, morphoUser, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int identify(int timeout, int far, Coder coder, int detectModeChoice, MatchingStrategy matchingStrategy, int callbackCmd, Observer callback, ResultMatching resultMatching, MorphoUser morphoUser) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_5, (Object) this, (Object) this, new Object[]{Conversions.intObject(timeout), Conversions.intObject(far), coder, Conversions.intObject(detectModeChoice), matchingStrategy, Conversions.intObject(callbackCmd), callback, resultMatching, morphoUser});
        return Conversions.intValue(identify_aroundBody11$advice(this, timeout, far, coder, detectModeChoice, matchingStrategy, callbackCmd, callback, resultMatching, morphoUser, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int identifyMatch(int far, TemplateList templateList, MorphoUser morphoUser) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_7, (Object) this, (Object) this, new Object[]{Conversions.intObject(far), templateList, morphoUser});
        return Conversions.intValue(identifyMatch_aroundBody15$advice(this, far, templateList, morphoUser, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int identifyMatch(int far, TemplateList templateList, MorphoUser morphoUser, ResultMatching resultMatching) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_6, (Object) this, (Object) this, new Object[]{Conversions.intObject(far), templateList, morphoUser, resultMatching});
        return Conversions.intValue(identifyMatch_aroundBody13$advice(this, far, templateList, morphoUser, resultMatching, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    static {
        ajc$preClinit();
        morphoDatabaseNative = new MorphoDatabaseNative();
    }

    public MorphoDatabase() {
        this.morphoDatabasePointerCPP = new Long(0L);
        this.cppMemOwn = false;
        long cppPtr = morphoDatabaseNative.getCPPInstance();
        if (cppPtr != 0) {
            this.cppMemOwn = true;
            this.morphoDatabasePointerCPP = Long.valueOf(cppPtr);
        } else {
            try {
                throw new MorphoSmartException("cppPtr is null");
            } catch (MorphoSmartException e) {
                e.printStackTrace();
            }
        }
    }

    public MorphoDatabase(MorphoDatabase database) {
        this.morphoDatabasePointerCPP = new Long(0L);
        this.cppMemOwn = false;
        if (database == null) {
            try {
                throw new MorphoSmartException("MorphoDatabase object is null");
            } catch (MorphoSmartException e) {
                e.printStackTrace();
            }
        } else if (!database.cppMemOwn) {
            long cppPtr = morphoDatabaseNative.getCPPInstance(database.morphoDatabasePointerCPP.longValue());
            if (cppPtr != 0) {
                this.cppMemOwn = true;
                this.morphoDatabasePointerCPP = Long.valueOf(cppPtr);
            } else {
                try {
                    throw new MorphoSmartException("cppPtr is null");
                } catch (MorphoSmartException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private static final /* synthetic */ Object dbCreate_aroundBody1$advice(MorphoDatabase ajc$this, int maxRecord, int maxNbFinger, TemplateType templateType, int dataBaseIndex, boolean encryptDB, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(dbCreate_aroundBody0(ajc$this, maxRecord, maxNbFinger, templateType, dataBaseIndex, encryptDB, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object dbCreate_aroundBody3$advice(MorphoDatabase ajc$this, int maxRecord, int maxNbFinger, TemplateType templateType, int dataBaseIndex, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(dbCreate_aroundBody2(ajc$this, maxRecord, maxNbFinger, templateType, dataBaseIndex, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object dbCreate_aroundBody5$advice(MorphoDatabase ajc$this, int maxRecord, int maxNbFinger, TemplateType templateType, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(dbCreate_aroundBody4(ajc$this, maxRecord, maxNbFinger, templateType, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object dbDelete_aroundBody7$advice(MorphoDatabase ajc$this, MorphoTypeDeletion morphoTypeDeletion, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(dbDelete_aroundBody6(ajc$this, morphoTypeDeletion, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object identifyMatch_aroundBody13$advice(MorphoDatabase ajc$this, int far, TemplateList templateList, MorphoUser morphoUser, ResultMatching resultMatching, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(identifyMatch_aroundBody12(ajc$this, far, templateList, morphoUser, resultMatching, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object identifyMatch_aroundBody15$advice(MorphoDatabase ajc$this, int far, TemplateList templateList, MorphoUser morphoUser, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(identifyMatch_aroundBody14(ajc$this, far, templateList, morphoUser, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object identify_aroundBody11$advice(MorphoDatabase ajc$this, int timeout, int far, Coder coder, int detectModeChoice, MatchingStrategy matchingStrategy, int callbackCmd, Observer callback, ResultMatching resultMatching, MorphoUser morphoUser, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(identify_aroundBody10(ajc$this, timeout, far, coder, detectModeChoice, matchingStrategy, callbackCmd, callback, resultMatching, morphoUser, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object identify_aroundBody9$advice(MorphoDatabase ajc$this, int timeout, int far, Coder coder, int detectModeChoice, MatchingStrategy matchingStrategy, int callbackCmd, Observer callback, ResultMatching resultMatching, int nbFingersToMatch, MorphoUser morphoUser, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(identify_aroundBody8(ajc$this, timeout, far, coder, detectModeChoice, matchingStrategy, callbackCmd, callback, resultMatching, nbFingersToMatch, morphoUser, joinPoint));
            return returnObject;
        } finally {
        }
    }

    protected void finalize() {
        if (this.cppMemOwn) {
            morphoDatabaseNative.deleteInstance(this.morphoDatabasePointerCPP.longValue());
            this.cppMemOwn = false;
        }
    }

    public Object clone() {
        return new MorphoDatabase(this);
    }

    public long getMorphoDatabasePointerCPP() {
        return this.morphoDatabasePointerCPP.longValue();
    }

    public void setMorphoDatabasePointerCPP(long morphoDatabasePointerCPP) {
        this.morphoDatabasePointerCPP = Long.valueOf(morphoDatabasePointerCPP);
        this.cppMemOwn = true;
    }

    public int getUser(String userID, MorphoUser morphoUser) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (morphoUser == null) {
            return -5;
        }
        return morphoDatabaseNative.getUser(this.morphoDatabasePointerCPP.longValue(), userID, morphoUser);
    }

    public int getUserBuffer(byte[] userID, MorphoUser morphoUser) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (morphoUser == null) {
            return -5;
        }
        return morphoDatabaseNative.getUserBuffer(this.morphoDatabasePointerCPP.longValue(), userID, morphoUser);
    }

    public int putField(MorphoField morphoField, CustomInteger index) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (index == null || morphoField == null) {
            return -5;
        }
        if (ErrorCodes.IntegrerInitializationValueOf(index).booleanValue()) {
            return -94;
        }
        return morphoDatabaseNative.putField(this.morphoDatabasePointerCPP.longValue(), morphoField, index);
    }

    public int getField(int index, MorphoField morphoField) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (morphoField == null) {
            return -5;
        }
        return morphoDatabaseNative.getField(this.morphoDatabasePointerCPP.longValue(), index, morphoField);
    }

    public int getDbEncryptionStatus(CustomInteger encryptDB) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (encryptDB == null) {
            return -5;
        }
        if (ErrorCodes.IntegrerInitializationValueOf(encryptDB).booleanValue()) {
            return -94;
        }
        return morphoDatabaseNative.getDbEncryptionStatus(this.morphoDatabasePointerCPP.longValue(), encryptDB);
    }

    private static final /* synthetic */ int dbCreate_aroundBody0(MorphoDatabase morphoDatabase, int i, int i2, TemplateType templateType, int i3, boolean z, JoinPoint joinPoint) {
        if (!morphoDatabase.cppMemOwn) {
            return -98;
        }
        if (templateType == null) {
            return -5;
        }
        return morphoDatabaseNative.dbCreate(morphoDatabase.morphoDatabasePointerCPP.longValue(), i, i2, templateType.getCode(), i3, z ? 1 : 0);
    }

    private static final /* synthetic */ int dbCreate_aroundBody2(MorphoDatabase ajc$this, int maxRecord, int maxNbFinger, TemplateType templateType, int dataBaseIndex, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (templateType == null) {
            return -5;
        }
        return morphoDatabaseNative.dbCreate(ajc$this.morphoDatabasePointerCPP.longValue(), maxRecord, maxNbFinger, templateType.getCode(), dataBaseIndex, 0);
    }

    private static final /* synthetic */ int dbCreate_aroundBody4(MorphoDatabase ajc$this, int maxRecord, int maxNbFinger, TemplateType templateType, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (templateType == null) {
            return -5;
        }
        return morphoDatabaseNative.dbCreate(ajc$this.morphoDatabasePointerCPP.longValue(), maxRecord, maxNbFinger, templateType.getCode(), 0, 0);
    }

    public int readPublicFields(int[] fieldsIndex, MorphoUserList morphoUserList) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (morphoUserList == null || fieldsIndex == null) {
            return -5;
        }
        return morphoDatabaseNative.readPublicFields(this.morphoDatabasePointerCPP.longValue(), fieldsIndex, morphoUserList);
    }

    private static final /* synthetic */ int dbDelete_aroundBody6(MorphoDatabase ajc$this, MorphoTypeDeletion morphoTypeDeletion, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (morphoTypeDeletion == null) {
            return -5;
        }
        return morphoDatabaseNative.dbDelete(ajc$this.morphoDatabasePointerCPP.longValue(), morphoTypeDeletion.ordinal());
    }

    private static final /* synthetic */ int identify_aroundBody8(MorphoDatabase ajc$this, int timeout, int far, Coder coder, int detectModeChoice, MatchingStrategy matchingStrategy, int callbackCmd, Observer callback, ResultMatching resultMatching, int nbFingersToMatch, MorphoUser morphoUser, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (coder == null || matchingStrategy == null || morphoUser == null) {
            return -5;
        }
        return morphoDatabaseNative.identify(ajc$this.morphoDatabasePointerCPP.longValue(), timeout, far, coder.getCode(), detectModeChoice, matchingStrategy.getValue(), callbackCmd, callback, resultMatching, morphoUser, nbFingersToMatch);
    }

    private static final /* synthetic */ int identify_aroundBody10(MorphoDatabase ajc$this, int timeout, int far, Coder coder, int detectModeChoice, MatchingStrategy matchingStrategy, int callbackCmd, Observer callback, ResultMatching resultMatching, MorphoUser morphoUser, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (coder == null || matchingStrategy == null || morphoUser == null) {
            return -5;
        }
        return morphoDatabaseNative.identify(ajc$this.morphoDatabasePointerCPP.longValue(), timeout, far, coder.getCode(), detectModeChoice, matchingStrategy.getValue(), callbackCmd, callback, resultMatching, morphoUser, -1);
    }

    private static final /* synthetic */ int identifyMatch_aroundBody12(MorphoDatabase ajc$this, int far, TemplateList templateList, MorphoUser morphoUser, ResultMatching resultMatching, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (templateList != null && morphoUser != null) {
            return morphoDatabaseNative.identifyMatch(ajc$this.morphoDatabasePointerCPP.longValue(), far, templateList, morphoUser, resultMatching);
        }
        return -5;
    }

    private static final /* synthetic */ int identifyMatch_aroundBody14(MorphoDatabase ajc$this, int far, TemplateList templateList, MorphoUser morphoUser, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (templateList != null && morphoUser != null) {
            return morphoDatabaseNative.identifyMatch(ajc$this.morphoDatabasePointerCPP.longValue(), far, templateList, morphoUser, null);
        }
        return -5;
    }

    public int cancelLiveAcquisition() {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoDatabaseNative.cancelLiveAcquisition(this.morphoDatabasePointerCPP.longValue());
    }

    public int dbQueryFirst(int fieldIndex, String dataToFind, MorphoUser morphoUser) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (morphoUser != null && dataToFind != null) {
            return morphoDatabaseNative.dbQueryFirst(this.morphoDatabasePointerCPP.longValue(), fieldIndex, dataToFind, morphoUser);
        }
        return -5;
    }

    public int dbQueryNext(MorphoUser morphoUser) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (morphoUser == null) {
            return -5;
        }
        return morphoDatabaseNative.dbQueryNext(this.morphoDatabasePointerCPP.longValue(), morphoUser);
    }

    public int getFormatPK(CustomInteger templateType) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (templateType == null) {
            return -5;
        }
        if (ErrorCodes.IntegrerInitializationValueOf(templateType).booleanValue()) {
            return -94;
        }
        return morphoDatabaseNative.getFormatPK(this.morphoDatabasePointerCPP.longValue(), templateType);
    }

    public int getMaxDataBase(CustomInteger maxdataBase) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (maxdataBase == null) {
            return -5;
        }
        if (ErrorCodes.IntegrerInitializationValueOf(maxdataBase).booleanValue()) {
            return -94;
        }
        return morphoDatabaseNative.getMaxDataBase(this.morphoDatabasePointerCPP.longValue(), maxdataBase);
    }

    public int getMaxUser(CustomInteger maxUser, CustomInteger maxFinger) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (maxUser == null || maxFinger == null) {
            return -5;
        }
        if (ErrorCodes.IntegrerInitializationValueOf(maxUser).booleanValue() || ErrorCodes.IntegrerInitializationValueOf(maxFinger).booleanValue()) {
            return -94;
        }
        return morphoDatabaseNative.getMaxUser(this.morphoDatabasePointerCPP.longValue(), maxUser, maxFinger);
    }

    public int getMaxUser(CustomInteger maxUser) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (maxUser == null) {
            return -5;
        }
        if (ErrorCodes.IntegrerInitializationValueOf(maxUser).booleanValue()) {
            return -94;
        }
        return morphoDatabaseNative.getMaxUser(this.morphoDatabasePointerCPP.longValue(), maxUser, null);
    }

    public int getNbField(CustomLong nbField) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (nbField == null) {
            return -5;
        }
        if (ErrorCodes.LongInitializationValueOf(nbField).booleanValue()) {
            return -93;
        }
        return morphoDatabaseNative.getNbField(this.morphoDatabasePointerCPP.longValue(), nbField);
    }

    public int getNbFinger(CustomInteger nbFinger) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (nbFinger == null) {
            return -5;
        }
        if (ErrorCodes.IntegrerInitializationValueOf(nbFinger).booleanValue()) {
            return -94;
        }
        return morphoDatabaseNative.getNbFinger(this.morphoDatabasePointerCPP.longValue(), nbFinger);
    }

    public int getNbFreeRecord(CustomLong nbFreeRecord) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (nbFreeRecord == null) {
            return -5;
        }
        if (ErrorCodes.LongInitializationValueOf(nbFreeRecord).booleanValue()) {
            return -93;
        }
        return morphoDatabaseNative.getNbFreeRecord(this.morphoDatabasePointerCPP.longValue(), nbFreeRecord);
    }

    public int getNbTotalRecord(CustomLong nbTotalRecord) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (nbTotalRecord == null) {
            return -5;
        }
        if (ErrorCodes.LongInitializationValueOf(nbTotalRecord).booleanValue()) {
            return -93;
        }
        return morphoDatabaseNative.getNbTotalRecord(this.morphoDatabasePointerCPP.longValue(), nbTotalRecord);
    }

    public int getNbUsedRecord(CustomLong nbUsedRecord) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (nbUsedRecord == null) {
            return -5;
        }
        if (ErrorCodes.LongInitializationValueOf(nbUsedRecord).booleanValue()) {
            return -93;
        }
        return morphoDatabaseNative.getNbUsedRecord(this.morphoDatabasePointerCPP.longValue(), nbUsedRecord);
    }
}
