package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaoz implements zzaon {
    private final zzer zza;
    private final zzafr zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private final String zze;
    private zzagh zzf;
    private String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i2) {
        this.zzn = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) {
        this.zzf.getClass();
        while (zzerVar.zzd() > 0) {
            int i2 = this.zzh;
            if (i2 == 0) {
                byte[] bArrZzi = zzerVar.zzi();
                int iZzg = zzerVar.zzg();
                int iZze = zzerVar.zze();
                while (true) {
                    if (iZzg >= iZze) {
                        zzerVar.zzh(iZze);
                        break;
                    }
                    int i3 = iZzg + 1;
                    byte b2 = bArrZzi[iZzg];
                    boolean z2 = (b2 & UByte.MAX_VALUE) == 255;
                    boolean z3 = this.zzk && (b2 & 224) == 224;
                    this.zzk = z2;
                    if (z3) {
                        zzerVar.zzh(i3);
                        this.zzk = false;
                        this.zza.zzi()[1] = bArrZzi[iZzg];
                        this.zzi = 2;
                        this.zzh = 1;
                        break;
                    }
                    iZzg = i3;
                }
            } else if (i2 != 1) {
                int iMin = Math.min(zzerVar.zzd(), this.zzm - this.zzi);
                this.zzf.zzc(zzerVar, iMin);
                int i5 = this.zzi + iMin;
                this.zzi = i5;
                if (i5 >= this.zzm) {
                    zzgrc.zzi(this.zzn != -9223372036854775807L);
                    this.zzf.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int iMin2 = Math.min(zzerVar.zzd(), 4 - this.zzi);
                zzer zzerVar2 = this.zza;
                zzerVar.zzm(zzerVar2.zzi(), this.zzi, iMin2);
                int i7 = this.zzi + iMin2;
                this.zzi = i7;
                if (i7 >= 4) {
                    zzerVar2.zzh(0);
                    zzafr zzafrVar = this.zzb;
                    if (zzafrVar.zza(zzerVar2.zzB())) {
                        this.zzm = zzafrVar.zzc;
                        if (!this.zzj) {
                            this.zzl = (((long) zzafrVar.zzg) * 1000000) / ((long) zzafrVar.zzd);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzg);
                            zztVar.zzl(this.zze);
                            zztVar.zzm(zzafrVar.zzb);
                            zztVar.zzn(4096);
                            zztVar.zzE(zzafrVar.zze);
                            zztVar.zzF(zzafrVar.zzd);
                            zztVar.zze(this.zzc);
                            zztVar.zzg(this.zzd);
                            this.zzf.zzz(zztVar.zzM());
                            this.zzj = true;
                        }
                        zzerVar2.zzh(0);
                        this.zzf.zzc(zzerVar2, 4);
                        this.zzh = 2;
                    } else {
                        this.zzi = 0;
                        this.zzh = 1;
                    }
                }
            }
        }
    }

    public zzaoz(@Nullable String str, int i2, String str2) {
        zzer zzerVar = new zzer(4);
        this.zza = zzerVar;
        zzerVar.zzi()[0] = -1;
        this.zzb = new zzafr();
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i2;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzg = zzaqbVar.zzc();
        this.zzf = zzaexVar.zzu(zzaqbVar.zzb(), 1);
    }
}
