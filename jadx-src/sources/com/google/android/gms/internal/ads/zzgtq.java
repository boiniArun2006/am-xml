package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgtq extends zzgts {
    zzgtq() {
        super(null);
    }

    static final zzgts zzf(int i2) {
        return i2 < 0 ? zzgts.zzb : i2 > 0 ? zzgts.zzc : zzgts.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzb(int i2, int i3) {
        return zzf(Integer.compare(i2, i3));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzc(boolean z2, boolean z3) {
        return zzf(Boolean.compare(z3, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzd(boolean z2, boolean z3) {
        return zzf(Boolean.compare(z2, z3));
    }
}
