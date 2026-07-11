package com.google.android.gms.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    private final int zza;

    public int getValue() {
        return this.zza;
    }

    AdFormat(int i2) {
        this.zza = i2;
    }

    @Nullable
    public static AdFormat getAdFormat(int i2) {
        for (AdFormat adFormat : values()) {
            if (adFormat.getValue() == i2) {
                return adFormat;
            }
        }
        return null;
    }
}
