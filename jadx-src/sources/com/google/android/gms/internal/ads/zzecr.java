package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class zzecr extends Exception {
    private final int zza;

    public zzecr(int i2) {
        this.zza = i2;
    }

    public final int zza() {
        return this.zza;
    }

    public zzecr(int i2, String str) {
        super(str);
        this.zza = i2;
    }

    public zzecr(int i2, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
