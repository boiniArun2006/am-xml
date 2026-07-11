package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.d1;
import com.fyber.inneractive.sdk.protobuf.e1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum n0 implements d1 {
    UNITDISPLAYTYPEUNKNOWN(0),
    BANNER(1),
    INTERSTITIAL(2),
    REWARDED(3),
    MRECT(4),
    TYPENATIVE(5),
    UNRECOGNIZED(-1);

    public static final int BANNER_VALUE = 1;
    public static final int INTERSTITIAL_VALUE = 2;
    public static final int MRECT_VALUE = 4;
    public static final int REWARDED_VALUE = 3;
    public static final int TYPENATIVE_VALUE = 5;
    public static final int UNITDISPLAYTYPEUNKNOWN_VALUE = 0;
    private static final e1 internalValueMap = new e1() { // from class: com.fyber.inneractive.sdk.bidder.m0
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final d1 a(int i2) {
            return n0.a(i2);
        }
    };
    private final int value;

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    n0(int i2) {
        this.value = i2;
    }

    public static n0 a(int i2) {
        if (i2 == 0) {
            return UNITDISPLAYTYPEUNKNOWN;
        }
        if (i2 == 1) {
            return BANNER;
        }
        if (i2 == 2) {
            return INTERSTITIAL;
        }
        if (i2 == 3) {
            return REWARDED;
        }
        if (i2 == 4) {
            return MRECT;
        }
        if (i2 != 5) {
            return null;
        }
        return TYPENATIVE;
    }
}
