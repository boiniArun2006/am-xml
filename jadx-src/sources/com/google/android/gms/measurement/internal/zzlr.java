package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public enum zzlr {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    public final int zza() {
        return this.zzg;
    }

    zzlr(int i2) {
        this.zzg = i2;
    }

    public static zzlr zzb(int i2) {
        for (zzlr zzlrVar : values()) {
            if (zzlrVar.zzg == i2) {
                return zzlrVar;
            }
        }
        return UNKNOWN;
    }
}
