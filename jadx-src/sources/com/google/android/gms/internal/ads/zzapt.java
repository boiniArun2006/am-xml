package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzapt {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfg zza = new zzfg(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzer zzb = new zzer();

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzaev zzaevVar, zzafv zzafvVar, int i2) throws IOException {
        if (i2 <= 0) {
            zze(zzaevVar);
            return 0;
        }
        long j2 = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzaevVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zze(zzaevVar);
                    return 0;
                }
                zzfg zzfgVar = this.zza;
                this.zzh = zzfgVar.zzf(this.zzg) - zzfgVar.zze(j3);
                zze(zzaevVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzaevVar.zzo());
            if (zzaevVar.zzn() != 0) {
                zzafvVar.zza = 0L;
                return 1;
            }
            zzer zzerVar = this.zzb;
            zzerVar.zza(iMin);
            zzaevVar.zzl();
            zzaevVar.zzi(zzerVar.zzi(), 0, iMin);
            int iZzg = zzerVar.zzg();
            int iZze = zzerVar.zze();
            while (true) {
                if (iZzg >= iZze) {
                    break;
                }
                if (zzerVar.zzi()[iZzg] == 71) {
                    long jZzb = zzaqd.zzb(zzerVar, iZzg, i2);
                    if (jZzb != -9223372036854775807L) {
                        j2 = jZzb;
                        break;
                    }
                }
                iZzg++;
            }
            this.zzf = j2;
            this.zzd = true;
            return 0;
        }
        long jZzo = zzaevVar.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j4 = jZzo - ((long) iMin2);
        if (zzaevVar.zzn() != j4) {
            zzafvVar.zza = j4;
            return 1;
        }
        zzer zzerVar2 = this.zzb;
        zzerVar2.zza(iMin2);
        zzaevVar.zzl();
        zzaevVar.zzi(zzerVar2.zzi(), 0, iMin2);
        int iZzg2 = zzerVar2.zzg();
        int iZze2 = zzerVar2.zze();
        int i3 = iZze2 - 188;
        while (true) {
            if (i3 < iZzg2) {
                break;
            }
            byte[] bArrZzi = zzerVar2.zzi();
            int i5 = -4;
            int i7 = 0;
            while (true) {
                if (i5 > 4) {
                    break;
                }
                int i8 = (i5 * 188) + i3;
                if (i8 < iZzg2 || i8 >= iZze2 || bArrZzi[i8] != 71) {
                    i7 = 0;
                } else {
                    i7++;
                    if (i7 == 5) {
                        long jZzb2 = zzaqd.zzb(zzerVar2, i3, i2);
                        if (jZzb2 != -9223372036854775807L) {
                            j2 = jZzb2;
                            break;
                        }
                    }
                }
                i5++;
            }
            i3--;
        }
        this.zzg = j2;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfg zzd() {
        return this.zza;
    }

    private final int zze(zzaev zzaevVar) {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzaevVar.zzl();
        return 0;
    }

    zzapt(int i2) {
    }
}
