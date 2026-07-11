package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzapg implements zzaqc {
    private final zzaon zza;
    private final zzeq zzb = new zzeq(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfg zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzapg(zzaon zzaonVar) {
        this.zza = zzaonVar;
    }

    private final void zze(int i2) {
        this.zzc = i2;
        this.zzd = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    public final boolean zzd(boolean z2) {
        return this.zzc == 3 && this.zzj == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
        this.zze = zzfgVar;
        this.zza.zzb(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzc(zzer zzerVar, int i2) throws zzat {
        int i3;
        int i5;
        long jZze;
        long j2;
        this.zze.getClass();
        int i7 = -1;
        int i8 = 2;
        if ((i2 & 1) != 0) {
            int i9 = this.zzc;
            if (i9 != 0 && i9 != 1) {
                if (i9 != 2) {
                    int i10 = this.zzj;
                    if (i10 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i10);
                        sb.append(" more bytes");
                        zzee.zzc("PesReader", sb.toString());
                    }
                    this.zza.zze(zzerVar.zze() == 0);
                } else {
                    zzee.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i11 = i2;
        while (zzerVar.zzd() > 0) {
            int i12 = this.zzc;
            if (i12 == 0) {
                i3 = i8;
                zzerVar.zzk(zzerVar.zzd());
            } else if (i12 != 1) {
                if (i12 != i8) {
                    int iZzd = zzerVar.zzd();
                    int i13 = this.zzj;
                    int i14 = i13 == i7 ? 0 : iZzd - i13;
                    if (i14 > 0) {
                        iZzd -= i14;
                        zzerVar.zzf(zzerVar.zzg() + iZzd);
                    }
                    zzaon zzaonVar = this.zza;
                    zzaonVar.zzd(zzerVar);
                    int i15 = this.zzj;
                    if (i15 != i7) {
                        int i16 = i15 - iZzd;
                        this.zzj = i16;
                        if (i16 == 0) {
                            zzaonVar.zze(false);
                            zze(1);
                        }
                    }
                } else {
                    int iMin = Math.min(10, this.zzi);
                    zzeq zzeqVar = this.zzb;
                    if (zzf(zzerVar, zzeqVar.zza, iMin) && zzf(zzerVar, null, this.zzi)) {
                        zzeqVar.zzf(0);
                        if (this.zzf) {
                            zzeqVar.zzh(4);
                            long jZzj = zzeqVar.zzj(3);
                            zzeqVar.zzh(1);
                            int iZzj = zzeqVar.zzj(15) << 15;
                            zzeqVar.zzh(1);
                            long jZzj2 = zzeqVar.zzj(15);
                            zzeqVar.zzh(1);
                            if (this.zzh || !this.zzg) {
                                j2 = jZzj;
                            } else {
                                zzeqVar.zzh(4);
                                j2 = jZzj;
                                long jZzj3 = ((long) zzeqVar.zzj(3)) << 30;
                                zzeqVar.zzh(1);
                                int iZzj2 = zzeqVar.zzj(15) << 15;
                                zzeqVar.zzh(1);
                                long jZzj4 = zzeqVar.zzj(15);
                                zzeqVar.zzh(1);
                                this.zze.zze(jZzj3 | ((long) iZzj2) | jZzj4);
                                this.zzh = true;
                            }
                            jZze = this.zze.zze(jZzj2 | (j2 << 30) | ((long) iZzj));
                        } else {
                            jZze = -9223372036854775807L;
                        }
                        i11 |= true != this.zzk ? 0 : 4;
                        this.zza.zzc(jZze, i11);
                        zze(3);
                        i7 = -1;
                        i8 = 2;
                    }
                }
                i3 = i8;
            } else {
                zzeq zzeqVar2 = this.zzb;
                if (zzf(zzerVar, zzeqVar2.zza, 9)) {
                    zzeqVar2.zzf(0);
                    int iZzj3 = zzeqVar2.zzj(24);
                    if (iZzj3 != 1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj3).length() + 30);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(iZzj3);
                        zzee.zzc("PesReader", sb2.toString());
                        i7 = -1;
                        this.zzj = -1;
                        i5 = 0;
                        i3 = 2;
                    } else {
                        zzeqVar2.zzh(8);
                        int iZzj4 = zzeqVar2.zzj(16);
                        zzeqVar2.zzh(5);
                        this.zzk = zzeqVar2.zzi();
                        i3 = 2;
                        zzeqVar2.zzh(2);
                        this.zzf = zzeqVar2.zzi();
                        this.zzg = zzeqVar2.zzi();
                        zzeqVar2.zzh(6);
                        int iZzj5 = zzeqVar2.zzj(8);
                        this.zzi = iZzj5;
                        if (iZzj4 == 0) {
                            this.zzj = -1;
                            i7 = -1;
                        } else {
                            int i17 = (iZzj4 - 3) - iZzj5;
                            this.zzj = i17;
                            if (i17 < 0) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(i17).length() + 36);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i17);
                                zzee.zzc("PesReader", sb3.toString());
                                i7 = -1;
                                this.zzj = -1;
                            } else {
                                i7 = -1;
                            }
                        }
                        i5 = 2;
                    }
                    zze(i5);
                } else {
                    i7 = -1;
                    i3 = 2;
                }
            }
            i8 = i3;
        }
    }

    private final boolean zzf(zzer zzerVar, @Nullable byte[] bArr, int i2) {
        int iMin = Math.min(zzerVar.zzd(), i2 - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzerVar.zzk(iMin);
        } else {
            zzerVar.zzm(bArr, this.zzd, iMin);
        }
        int i3 = this.zzd + iMin;
        this.zzd = i3;
        if (i3 == i2) {
            return true;
        }
        return false;
    }
}
