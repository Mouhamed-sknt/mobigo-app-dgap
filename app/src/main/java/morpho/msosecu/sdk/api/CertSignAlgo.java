package morpho.msosecu.sdk.api;

/* JADX INFO: loaded from: classes.dex */
public enum CertSignAlgo {
    SHA1_SIGN_ALGO(MsoSecuJNI.SHA1_SIGN_ALGO_get()),
    SHA256_SIGN_ALGO(MsoSecuJNI.SHA256_SIGN_ALGO_get());

    private final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static CertSignAlgo swigToEnum(int swigValue) {
        CertSignAlgo[] swigValues = (CertSignAlgo[]) CertSignAlgo.class.getEnumConstants();
        if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue) {
            return swigValues[swigValue];
        }
        for (CertSignAlgo swigEnum : swigValues) {
            if (swigEnum.swigValue == swigValue) {
                return swigEnum;
            }
        }
        throw new IllegalArgumentException("No enum " + CertSignAlgo.class + " with value " + swigValue);
    }

    CertSignAlgo() {
        this.swigValue = SwigNext.access$008();
    }

    CertSignAlgo(int swigValue) {
        this.swigValue = swigValue;
        int unused = SwigNext.next = swigValue + 1;
    }

    CertSignAlgo(CertSignAlgo swigEnum) {
        this.swigValue = swigEnum.swigValue;
        int unused = SwigNext.next = this.swigValue + 1;
    }

    private static class SwigNext {
        private static int next = 0;

        private SwigNext() {
        }

        static /* synthetic */ int access$008() {
            int i = next;
            next = i + 1;
            return i;
        }
    }
}
