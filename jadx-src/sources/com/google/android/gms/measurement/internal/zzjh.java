package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public enum zzjh {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    private final String zze;

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }

    zzjh(String str) {
        this.zze = str;
    }
}
