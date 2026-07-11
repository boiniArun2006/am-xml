package com.google.protobuf;

import com.google.protobuf.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public enum gnv implements nKK.w6 {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final nKK.Ml internalValueMap = new nKK.Ml() { // from class: com.google.protobuf.gnv.j
        @Override // com.google.protobuf.nKK.Ml
        public gnv findValueByNumber(int i2) {
            return gnv.forNumber(i2);
        }
    };
    private final int value;

    private static final class n implements nKK.I28 {
        static final nKK.I28 INSTANCE = new n();

        private n() {
        }

        @Override // com.google.protobuf.nKK.I28
        public boolean isInRange(int i2) {
            if (gnv.forNumber(i2) != null) {
                return true;
            }
            return false;
        }
    }

    public static gnv forNumber(int i2) {
        if (i2 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static nKK.Ml internalGetValueMap() {
        return internalValueMap;
    }

    public static nKK.I28 internalGetVerifier() {
        return n.INSTANCE;
    }

    @Deprecated
    public static gnv valueOf(int i2) {
        return forNumber(i2);
    }

    @Override // com.google.protobuf.nKK.w6
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    gnv(int i2) {
        this.value = i2;
    }
}
