package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaol implements zzaon {
    private final zzer zza;

    @Nullable
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzagh zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i2) {
        this.zzq = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z2) {
    }

    private final void zzg(zzaes zzaesVar) {
        int i2;
        int i3 = zzaesVar.zzb;
        if (i3 == -2147483647 || (i2 = zzaesVar.zzc) == -1) {
            return;
        }
        zzv zzvVar = this.zzl;
        if (zzvVar != null && i2 == zzvVar.zzG && i3 == zzvVar.zzH && Objects.equals(zzaesVar.zza, zzvVar.zzo)) {
            return;
        }
        zzv zzvVar2 = this.zzl;
        zzt zztVar = zzvVar2 == null ? new zzt() : zzvVar2.zza();
        zztVar.zza(this.zzf);
        zztVar.zzl(this.zze);
        zztVar.zzm(zzaesVar.zza);
        zztVar.zzE(i2);
        zztVar.zzF(i3);
        zztVar.zze(this.zzc);
        zztVar.zzg(this.zzd);
        zzv zzvVarZzM = zztVar.zzM();
        this.zzl = zzvVarZzM;
        this.zzg.zzz(zzvVarZzM);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) throws zzat {
        int i2;
        byte b2;
        int i3;
        byte b4;
        this.zzg.getClass();
        while (zzerVar.zzd() > 0) {
            int i5 = this.zzh;
            if (i5 == 0) {
                while (true) {
                    if (zzerVar.zzd() > 0) {
                        int i7 = this.zzj << 8;
                        this.zzj = i7;
                        int iZzs = i7 | zzerVar.zzs();
                        this.zzj = iZzs;
                        int iZza = zzaet.zza(iZzs);
                        this.zzn = iZza;
                        if (iZza != 0) {
                            byte[] bArrZzi = this.zza.zzi();
                            int i8 = this.zzj;
                            bArrZzi[0] = (byte) ((i8 >> 24) & 255);
                            bArrZzi[1] = (byte) ((i8 >> 16) & 255);
                            bArrZzi[2] = (byte) ((i8 >> 8) & 255);
                            bArrZzi[3] = (byte) (i8 & 255);
                            this.zzi = 4;
                            this.zzj = 0;
                            if (iZza == 3 || iZza == 4) {
                                this.zzh = 4;
                            } else if (iZza == 1) {
                                this.zzh = 1;
                            } else {
                                this.zzh = 2;
                            }
                        }
                    }
                }
            } else if (i5 == 1) {
                zzer zzerVar2 = this.zza;
                if (zzf(zzerVar, zzerVar2.zzi(), 18)) {
                    byte[] bArrZzi2 = zzerVar2.zzi();
                    if (this.zzl == null) {
                        zzv zzvVarZzb = zzaet.zzb(bArrZzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzvVarZzb;
                        this.zzg.zzz(zzvVarZzb);
                    }
                    this.zzm = zzaet.zzc(bArrZzi2);
                    byte b5 = bArrZzi2[0];
                    if (b5 != -2) {
                        if (b5 == -1) {
                            i2 = (bArrZzi2[4] & 7) << 4;
                            b4 = bArrZzi2[7];
                        } else if (b5 != 31) {
                            i2 = (bArrZzi2[4] & 1) << 6;
                            b2 = bArrZzi2[5];
                        } else {
                            i2 = (bArrZzi2[5] & 7) << 4;
                            b4 = bArrZzi2[6];
                        }
                        i3 = b4 & 60;
                        this.zzk = zzgxz.zza(zzfj.zzr(((i2 | (i3 >> 2)) + 1) * 32, this.zzl.zzH));
                        zzerVar2.zzh(0);
                        this.zzg.zzc(zzerVar2, 18);
                        this.zzh = 6;
                    } else {
                        i2 = (bArrZzi2[5] & 1) << 6;
                        b2 = bArrZzi2[4];
                    }
                    i3 = b2 & 252;
                    this.zzk = zzgxz.zza(zzfj.zzr(((i2 | (i3 >> 2)) + 1) * 32, this.zzl.zzH));
                    zzerVar2.zzh(0);
                    this.zzg.zzc(zzerVar2, 18);
                    this.zzh = 6;
                }
            } else if (i5 != 2) {
                if (i5 == 3) {
                    zzer zzerVar3 = this.zza;
                    if (zzf(zzerVar, zzerVar3.zzi(), this.zzo)) {
                        zzaes zzaesVarZzd = zzaet.zzd(zzerVar3.zzi());
                        zzg(zzaesVarZzd);
                        this.zzm = zzaesVarZzd.zzd;
                        long j2 = zzaesVarZzd.zze;
                        this.zzk = j2 != -9223372036854775807L ? j2 : 0L;
                        zzerVar3.zzh(0);
                        this.zzg.zzc(zzerVar3, this.zzo);
                        this.zzh = 6;
                    }
                } else if (i5 == 4) {
                    zzer zzerVar4 = this.zza;
                    if (zzf(zzerVar, zzerVar4.zzi(), 6)) {
                        int iZzg = zzaet.zzg(zzerVar4.zzi());
                        this.zzp = iZzg;
                        int i9 = this.zzi;
                        if (i9 > iZzg) {
                            int i10 = i9 - iZzg;
                            this.zzi = i9 - i10;
                            zzerVar.zzh(zzerVar.zzg() - i10);
                        }
                        this.zzh = 5;
                    }
                } else if (i5 != 5) {
                    int iMin = Math.min(zzerVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzc(zzerVar, iMin);
                    int i11 = this.zzi + iMin;
                    this.zzi = i11;
                    if (i11 == this.zzm) {
                        zzgrc.zzi(this.zzq != -9223372036854775807L);
                        this.zzg.zze(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    zzer zzerVar5 = this.zza;
                    if (zzf(zzerVar, zzerVar5.zzi(), this.zzp)) {
                        zzaes zzaesVarZzf = zzaet.zzf(zzerVar5.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzaesVarZzf);
                        }
                        this.zzm = zzaesVarZzf.zzd;
                        long j3 = zzaesVarZzf.zze;
                        this.zzk = j3 != -9223372036854775807L ? j3 : 0L;
                        zzerVar5.zzh(0);
                        this.zzg.zzc(zzerVar5, this.zzp);
                        this.zzh = 6;
                    }
                }
            } else {
                zzer zzerVar6 = this.zza;
                if (zzf(zzerVar, zzerVar6.zzi(), 7)) {
                    this.zzo = zzaet.zze(zzerVar6.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    public zzaol(@Nullable String str, int i2, int i3, String str2) {
        this.zza = new zzer(new byte[i3]);
        this.zzc = str;
        this.zzd = i2;
    }

    private final boolean zzf(zzer zzerVar, byte[] bArr, int i2) {
        int iMin = Math.min(zzerVar.zzd(), i2 - this.zzi);
        zzerVar.zzm(bArr, this.zzi, iMin);
        int i3 = this.zzi + iMin;
        this.zzi = i3;
        if (i3 == i2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzf = zzaqbVar.zzc();
        this.zzg = zzaexVar.zzu(zzaqbVar.zzb(), 1);
    }
}
