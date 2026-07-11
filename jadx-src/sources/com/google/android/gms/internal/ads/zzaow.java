package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaow implements zzaon {
    private final zzapq zza;
    private String zzb;
    private zzagh zzc;
    private zzaov zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzape zzg = new zzape(32, 128);
    private final zzape zzh = new zzape(33, 128);
    private final zzape zzi = new zzape(34, 128);
    private final zzape zzj = new zzape(39, 128);
    private final zzape zzk = new zzape(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzer zzn = new zzer();

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i2) {
        this.zzm = j2;
    }

    private final void zzf(long j2, int i2, int i3, long j3) {
        this.zzd.zzb(j2, i2, i3, j3, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i3);
            this.zzh.zzc(i3);
            this.zzi.zzc(i3);
        }
        this.zzj.zzc(i3);
        this.zzk.zzc(i3);
    }

    private final void zzg(byte[] bArr, int i2, int i3) {
        this.zzd.zzc(bArr, i2, i3);
        if (!this.zze) {
            this.zzg.zzd(bArr, i2, i3);
            this.zzh.zzd(bArr, i2, i3);
            this.zzi.zzd(bArr, i2, i3);
        }
        this.zzj.zzd(bArr, i2, i3);
        this.zzk.zzd(bArr, i2, i3);
    }

    private final void zzh(long j2, int i2, int i3, long j3) {
        this.zzd.zzd(j2, i2, this.zze);
        if (!this.zze) {
            zzape zzapeVar = this.zzg;
            zzapeVar.zze(i3);
            zzape zzapeVar2 = this.zzh;
            zzapeVar2.zze(i3);
            zzape zzapeVar3 = this.zzi;
            zzapeVar3.zze(i3);
            if (zzapeVar.zzb() && zzapeVar2.zzb() && zzapeVar3.zzb()) {
                String str = this.zzb;
                int i5 = zzapeVar.zzb;
                byte[] bArr = new byte[zzapeVar2.zzb + i5 + zzapeVar3.zzb];
                System.arraycopy(zzapeVar.zza, 0, bArr, 0, i5);
                System.arraycopy(zzapeVar2.zza, 0, bArr, zzapeVar.zzb, zzapeVar2.zzb);
                System.arraycopy(zzapeVar3.zza, 0, bArr, zzapeVar.zzb + zzapeVar2.zzb, zzapeVar3.zzb);
                String strZzb = null;
                zzgg zzggVarZzg = zzgm.zzg(zzapeVar2.zza, 3, zzapeVar2.zzb, null);
                zzgb zzgbVar = zzggVarZzg.zzb;
                if (zzgbVar != null) {
                    int i7 = zzgbVar.zzf;
                    int[] iArr = zzgbVar.zze;
                    int i8 = zzgbVar.zzd;
                    strZzb = zzdo.zzb(zzgbVar.zza, zzgbVar.zzb, zzgbVar.zzc, i8, iArr, i7);
                }
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzl("video/mp2t");
                zztVar.zzm("video/hevc");
                zztVar.zzj(strZzb);
                zztVar.zzt(zzggVarZzg.zze);
                zztVar.zzu(zzggVarZzg.zzf);
                zztVar.zzv(zzggVarZzg.zzg);
                zztVar.zzw(zzggVarZzg.zzh);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzggVarZzg.zzk);
                zzhVar.zzb(zzggVarZzg.zzl);
                zzhVar.zzc(zzggVarZzg.zzm);
                zzhVar.zze(zzggVarZzg.zzc + 8);
                zzhVar.zzf(zzggVarZzg.zzd + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zzggVarZzg.zzi);
                zztVar.zzo(zzggVarZzg.zzj);
                zztVar.zzD(zzggVarZzg.zza + 1);
                zztVar.zzp(Collections.singletonList(bArr));
                zzv zzvVarZzM = zztVar.zzM();
                this.zzc.zzz(zzvVarZzM);
                int i9 = zzvVarZzM.zzq;
                zzgrc.zzi(i9 != -1);
                this.zza.zzb(i9);
                this.zze = true;
            }
        }
        zzape zzapeVar4 = this.zzj;
        if (zzapeVar4.zze(i3)) {
            int iZza = zzgm.zza(zzapeVar4.zza, zzapeVar4.zzb);
            zzer zzerVar = this.zzn;
            zzerVar.zzb(zzapeVar4.zza, iZza);
            zzerVar.zzk(5);
            this.zza.zzc(j3, zzerVar);
        }
        zzape zzapeVar5 = this.zzk;
        if (zzapeVar5.zze(i3)) {
            int iZza2 = zzgm.zza(zzapeVar5.zza, zzapeVar5.zzb);
            zzer zzerVar2 = this.zzn;
            zzerVar2.zzb(zzapeVar5.zza, iZza2);
            zzerVar2.zzk(5);
            this.zza.zzc(j3, zzerVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgm.zzj(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzaov zzaovVar = this.zzd;
        if (zzaovVar != null) {
            zzaovVar.zza();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzer zzerVar) {
        int i2;
        int i3;
        this.zzc.getClass();
        String str = zzfj.zza;
        while (zzerVar.zzd() > 0) {
            int iZzg = zzerVar.zzg();
            int iZze = zzerVar.zze();
            byte[] bArrZzi = zzerVar.zzi();
            this.zzl += (long) zzerVar.zzd();
            this.zzc.zzc(zzerVar, zzerVar.zzd());
            while (iZzg < iZze) {
                int iZzi = zzgm.zzi(bArrZzi, iZzg, iZze, this.zzf);
                if (iZzi == iZze) {
                    zzg(bArrZzi, iZzg, iZze);
                    return;
                }
                int i5 = bArrZzi[iZzi + 3] & 126;
                if (iZzi > 0) {
                    int i7 = iZzi - 1;
                    if (bArrZzi[i7] == 0) {
                        i3 = 4;
                        i2 = i7;
                    } else {
                        i2 = iZzi;
                        i3 = 3;
                    }
                }
                int i8 = i2 - iZzg;
                if (i8 > 0) {
                    zzg(bArrZzi, iZzg, i2);
                }
                int i9 = iZze - i2;
                long j2 = this.zzl - ((long) i9);
                zzh(j2, i9, i8 < 0 ? -i8 : 0, this.zzm);
                zzf(j2, i9, i5 >> 1, this.zzm);
                iZzg = i2 + i3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z2) {
        this.zzc.getClass();
        String str = zzfj.zza;
        if (z2) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }

    public zzaow(zzapq zzapqVar, String str) {
        this.zza = zzapqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzb = zzaqbVar.zzc();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzc = zzaghVarZzu;
        this.zzd = new zzaov(zzaghVarZzu);
        this.zza.zza(zzaexVar, zzaqbVar);
    }
}
