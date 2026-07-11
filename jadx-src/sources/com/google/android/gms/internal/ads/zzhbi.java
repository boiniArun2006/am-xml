package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhbi {
    private static final zzhbg zza = zzhbh.zza;
    private final zzhaz zzb;
    private final zzhbb zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzhbg zzg;
    private final int zzh;

    /* synthetic */ zzhbi(zzhaz zzhazVar, int i2, int i3, boolean z2, boolean z3, zzhbg zzhbgVar, byte[] bArr) {
        this.zzb = zzhazVar;
        this.zzh = i2;
        int i5 = i2 - 2;
        this.zzc = i5 != 1 ? i5 != 3 ? zzhbb.zzb : zzhbb.zzc : zzhbb.zza;
        this.zzd = i3;
        this.zze = z2;
        this.zzf = z3;
        this.zzg = zzhbgVar;
    }

    public final zzhbb zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    final /* synthetic */ zzhaz zzf() {
        return this.zzb;
    }

    final /* synthetic */ int zzg() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzh() {
        return this.zze;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    final /* synthetic */ int zzj() {
        return this.zzh;
    }

    public final zzhaz zza() {
        this.zzg.zza(this);
        return this.zzb;
    }
}
