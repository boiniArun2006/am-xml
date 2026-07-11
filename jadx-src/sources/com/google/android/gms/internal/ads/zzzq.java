package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzzq extends zzzs implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        return false;
    }

    public zzzq(int i2, zzbg zzbgVar, int i3, zzzl zzzlVar, int i5, @Nullable String str, @Nullable String str2) {
        boolean z2;
        boolean z3;
        zzguf zzgufVarZzj;
        int iZzj;
        int i7;
        boolean z4;
        boolean z5;
        boolean z6;
        super(i2, zzbgVar, i3);
        int i8 = 0;
        this.zzf = zzmn.zzaa(i5, false);
        int i9 = this.zzd.zze;
        int i10 = zzzlVar.zzC;
        if (1 != (i9 & 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.zzg = z2;
        if ((i9 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.zzh = z3;
        if (str2 != null) {
            zzgufVarZzj = zzguf.zzj(str2);
        } else if (zzzlVar.zzy.isEmpty()) {
            zzgufVarZzj = zzguf.zzj("");
        } else {
            zzgufVarZzj = zzzlVar.zzy;
        }
        int i11 = 0;
        while (true) {
            if (i11 < zzgufVarZzj.size()) {
                iZzj = zzaaa.zzj(this.zzd, (String) zzgufVarZzj.get(i11), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i11++;
                }
            } else {
                iZzj = 0;
                i11 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzi = i11;
        this.zzj = iZzj;
        if (str2 != null) {
            i7 = 1088;
        } else {
            i7 = 0;
        }
        int iZzm = zzaaa.zzm(this.zzd.zzf, i7);
        this.zzk = iZzm;
        zzv zzvVar = this.zzd;
        if ((1088 & zzvVar.zzf) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.zzn = z4;
        int iZzn = zzaaa.zzn(zzvVar, zzzlVar.zzz);
        this.zzl = iZzn;
        if (zzaaa.zzi(str) == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        int iZzj2 = zzaaa.zzj(this.zzd, str, z5);
        this.zzm = iZzj2;
        if (iZzj > 0 || ((zzzlVar.zzy.isEmpty() && iZzm > 0) || ((zzzlVar.zzy.isEmpty() && iZzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && iZzj2 > 0)))) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (zzmn.zzaa(i5, zzzlVar.zzV) && z6) {
            i8 = 1;
        }
        this.zze = i8;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzq zzzqVar) {
        zzgvz zzgvzVarZza;
        zzgts zzgtsVarZza = zzgts.zzg().zzd(this.zzf, zzzqVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzzqVar.zzi), zzgvz.zzb().zza());
        int i2 = this.zzj;
        zzgts zzgtsVarZzb = zzgtsVarZza.zzb(i2, zzzqVar.zzj);
        int i3 = this.zzk;
        zzgts zzgtsVarZzd = zzgtsVarZzb.zzb(i3, zzzqVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzzqVar.zzl), zzgvz.zzb().zza()).zzd(this.zzg, zzzqVar.zzg);
        Boolean boolValueOf = Boolean.valueOf(this.zzh);
        Boolean boolValueOf2 = Boolean.valueOf(zzzqVar.zzh);
        if (i2 == 0) {
            zzgvzVarZza = zzgvz.zzb();
        } else {
            zzgvzVarZza = zzgvz.zzb().zza();
        }
        zzgts zzgtsVarZzb2 = zzgtsVarZzd.zza(boolValueOf, boolValueOf2, zzgvzVarZza).zzb(this.zzm, zzzqVar.zzm);
        if (i3 == 0) {
            zzgtsVarZzb2 = zzgtsVarZzb2.zzc(this.zzn, zzzqVar.zzn);
        }
        return zzgtsVarZzb2.zze();
    }
}
