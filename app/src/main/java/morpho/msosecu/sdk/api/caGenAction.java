package morpho.msosecu.sdk.api;

/* JADX INFO: loaded from: classes.dex */
public enum caGenAction {
    FIRST_GENERATION(MsoSecuJNI.FIRST_GENERATION_get()),
    REGENERATION(MsoSecuJNI.REGENERATION_get());

    private final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static caGenAction swigToEnum(int swigValue) {
        caGenAction[] swigValues = (caGenAction[]) caGenAction.class.getEnumConstants();
        if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue) {
            return swigValues[swigValue];
        }
        for (caGenAction swigEnum : swigValues) {
            if (swigEnum.swigValue == swigValue) {
                return swigEnum;
            }
        }
        throw new IllegalArgumentException("No enum " + caGenAction.class + " with value " + swigValue);
    }

    caGenAction() {
        this.swigValue = SwigNext.access$008();
    }

    caGenAction(int swigValue) {
        this.swigValue = swigValue;
        int unused = SwigNext.next = swigValue + 1;
    }

    caGenAction(caGenAction swigEnum) {
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
