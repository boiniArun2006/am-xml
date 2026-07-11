package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzqb extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzqb(int i2, boolean z2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26);
        sb.append("AudioOutput write failed: ");
        sb.append(i2);
        super(sb.toString());
        this.zzb = z2;
        this.zza = i2;
    }
}
