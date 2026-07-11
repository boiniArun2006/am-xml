package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaou implements zzaon {
    private final zzapq zza;
    private long zzf;
    private String zzh;
    private zzagh zzi;
    private zzaot zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzape zzc = new zzape(7, 128);
    private final zzape zzd = new zzape(8, 128);
    private final zzape zze = new zzape(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzer zzn = new zzer();

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i2) {
        this.zzl = j2;
        int i3 = i2 & 2;
        this.zzm = (i3 != 0) | this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzer zzerVar) {
        int i2;
        int i3;
        this.zzi.getClass();
        String str = zzfj.zza;
        int iZzg = zzerVar.zzg();
        int iZze = zzerVar.zze();
        byte[] bArrZzi = zzerVar.zzi();
        this.zzf += (long) zzerVar.zzd();
        this.zzi.zzc(zzerVar, zzerVar.zzd());
        while (true) {
            int iZzi = zzgm.zzi(bArrZzi, iZzg, iZze, this.zzg);
            if (iZzi == iZze) {
                zzg(bArrZzi, iZzg, iZze);
                return;
            }
            int i5 = bArrZzi[iZzi + 3] & 31;
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
            long j2 = this.zzf - ((long) i9);
            zzh(j2, i9, i8 < 0 ? -i8 : 0, this.zzl);
            zzf(j2, i5, this.zzl);
            iZzg = i2 + i3;
        }
    }

    private final void zzf(long j2, int i2, long j3) {
        if (!this.zzk) {
            this.zzc.zzc(i2);
            this.zzd.zzc(i2);
        }
        this.zze.zzc(i2);
        this.zzj.zzd(j2, i2, j3, this.zzm);
    }

    private final void zzg(byte[] bArr, int i2, int i3) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i2, i3);
            this.zzd.zzd(bArr, i2, i3);
        }
        this.zze.zzd(bArr, i2, i3);
    }

    private final void zzh(long j2, int i2, int i3, long j3) {
        if (!this.zzk) {
            zzape zzapeVar = this.zzc;
            zzapeVar.zze(i3);
            zzape zzapeVar2 = this.zzd;
            zzapeVar2.zze(i3);
            if (this.zzk) {
                if (zzapeVar.zzb()) {
                    zzgl zzglVarZze = zzgm.zze(zzapeVar.zza, 4, zzapeVar.zzb);
                    this.zza.zzb(zzglVarZze.zzm);
                    this.zzj.zza(zzglVarZze);
                    zzapeVar.zza();
                } else if (zzapeVar2.zzb()) {
                    this.zzj.zzb(zzgm.zzh(zzapeVar2.zza, 4, zzapeVar2.zzb));
                    zzapeVar2.zza();
                }
            } else if (zzapeVar.zzb() && zzapeVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzapeVar.zza, zzapeVar.zzb));
                arrayList.add(Arrays.copyOf(zzapeVar2.zza, zzapeVar2.zzb));
                zzgl zzglVarZze2 = zzgm.zze(zzapeVar.zza, 4, zzapeVar.zzb);
                zzgk zzgkVarZzh = zzgm.zzh(zzapeVar2.zza, 4, zzapeVar2.zzb);
                String strZza = zzdo.zza(zzglVarZze2.zza, zzglVarZze2.zzb, zzglVarZze2.zzc);
                zzagh zzaghVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzl(this.zzb);
                zztVar.zzm("video/avc");
                zztVar.zzj(strZza);
                zztVar.zzt(zzglVarZze2.zze);
                zztVar.zzu(zzglVarZze2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzglVarZze2.zzj);
                zzhVar.zzb(zzglVarZze2.zzk);
                zzhVar.zzc(zzglVarZze2.zzl);
                zzhVar.zze(zzglVarZze2.zzh + 8);
                zzhVar.zzf(zzglVarZze2.zzi + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zzglVarZze2.zzg);
                zztVar.zzp(arrayList);
                int i5 = zzglVarZze2.zzm;
                zztVar.zzo(i5);
                zzaghVar.zzz(zztVar.zzM());
                this.zzk = true;
                this.zza.zzb(i5);
                this.zzj.zza(zzglVarZze2);
                this.zzj.zzb(zzgkVarZzh);
                zzapeVar.zza();
                zzapeVar2.zza();
            }
        }
        zzape zzapeVar3 = this.zze;
        if (zzapeVar3.zze(i3)) {
            int iZza = zzgm.zza(zzapeVar3.zza, zzapeVar3.zzb);
            zzer zzerVar = this.zzn;
            zzerVar.zzb(zzapeVar3.zza, iZza);
            zzerVar.zzh(4);
            this.zza.zzc(j3, zzerVar);
        }
        if (this.zzj.zze(j2, i2, this.zzk)) {
            this.zzm = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzgm.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzaot zzaotVar = this.zzj;
        if (zzaotVar != null) {
            zzaotVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z2) {
        this.zzi.getClass();
        String str = zzfj.zza;
        if (z2) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }

    public zzaou(zzapq zzapqVar, boolean z2, boolean z3, String str) {
        this.zza = zzapqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzh = zzaqbVar.zzc();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzi = zzaghVarZzu;
        this.zzj = new zzaot(zzaghVarZzu, false, false);
        this.zza.zza(zzaexVar, zzaqbVar);
    }
}
