package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.d1;
import com.fyber.inneractive.sdk.protobuf.e1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum t0 implements d1 {
    NOCLICK(0),
    CTABUTTON(1),
    COMPANION(2),
    VIDEOVIEW(3),
    APPINFO(4),
    STOREPROMO(5),
    UNRECOGNIZED(-1);

    public static final int APPINFO_VALUE = 4;
    public static final int COMPANION_VALUE = 2;
    public static final int CTABUTTON_VALUE = 1;
    public static final int NOCLICK_VALUE = 0;
    public static final int STOREPROMO_VALUE = 5;
    public static final int VIDEOVIEW_VALUE = 3;
    private static final e1 internalValueMap = new e1() { // from class: com.fyber.inneractive.sdk.bidder.s0
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final d1 a(int i2) {
            if (i2 == 0) {
                return t0.NOCLICK;
            }
            if (i2 == 1) {
                return t0.CTABUTTON;
            }
            if (i2 == 2) {
                return t0.COMPANION;
            }
            if (i2 == 3) {
                return t0.VIDEOVIEW;
            }
            if (i2 == 4) {
                return t0.APPINFO;
            }
            if (i2 != 5) {
                return null;
            }
            return t0.STOREPROMO;
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

    t0(int i2) {
        this.value = i2;
    }
}
