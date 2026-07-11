package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzri extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzv zzc;

    public zzri(int i2, zzv zzvVar, boolean z2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 25);
        sb.append("AudioTrack write failed: ");
        sb.append(i2);
        super(sb.toString());
        this.zzb = z2;
        this.zza = i2;
        this.zzc = zzvVar;
    }
}
