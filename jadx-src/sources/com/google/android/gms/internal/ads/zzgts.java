package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzgts {
    private static final zzgts zza = new zzgtq();
    private static final zzgts zzb = new zzgtr(-1);
    private static final zzgts zzc = new zzgtr(1);

    /* synthetic */ zzgts(byte[] bArr) {
    }

    public static zzgts zzg() {
        return zza;
    }

    public abstract zzgts zza(Object obj, Object obj2, Comparator comparator);

    public abstract zzgts zzb(int i2, int i3);

    public abstract zzgts zzc(boolean z2, boolean z3);

    public abstract zzgts zzd(boolean z2, boolean z3);

    public abstract int zze();
}
