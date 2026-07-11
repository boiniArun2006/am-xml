package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzapj {
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

    public final zzfg zzb() {
        return this.zza;
    }

    public final long zzd() {
        return this.zzh;
    }

    public static long zze(zzer zzerVar) {
        int iZzg = zzerVar.zzg();
        if (zzerVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzerVar.zzm(bArr, 0, 9);
        zzerVar.zzh(iZzg);
        byte b2 = bArr[0];
        if ((b2 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b4 = bArr[2];
        if ((b4 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b5 = bArr[4];
        if ((b5 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j2 = b2;
        long j3 = b4;
        long j4 = (248 & j3) >> 3;
        long j5 = (j3 & 3) << 13;
        return j5 | ((bArr[1] & 255) << 20) | ((j2 & 3) << 28) | (((j2 & 56) >> 3) << 30) | (j4 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b5) & 248) >> 3);
    }

    private final int zzf(zzaev zzaevVar) {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzaevVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & UByte.MAX_VALUE) | ((bArr[i2] & UByte.MAX_VALUE) << 24) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 8);
    }

    public final int zzc(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        long j2 = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zzaevVar.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j3 = jZzo - ((long) iMin);
            if (zzaevVar.zzn() != j3) {
                zzafvVar.zza = j3;
                return 1;
            }
            zzer zzerVar = this.zzb;
            zzerVar.zza(iMin);
            zzaevVar.zzl();
            zzaevVar.zzi(zzerVar.zzi(), 0, iMin);
            int iZzg = zzerVar.zzg();
            int iZze = zzerVar.zze() - 4;
            while (true) {
                if (iZze < iZzg) {
                    break;
                }
                if (zzg(zzerVar.zzi(), iZze) == 442) {
                    zzerVar.zzh(iZze + 4);
                    long jZze = zze(zzerVar);
                    if (jZze != -9223372036854775807L) {
                        j2 = jZze;
                        break;
                    }
                }
                iZze--;
            }
            this.zzg = j2;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzaevVar);
            return 0;
        }
        if (this.zzd) {
            long j4 = this.zzf;
            if (j4 == -9223372036854775807L) {
                zzf(zzaevVar);
                return 0;
            }
            zzfg zzfgVar = this.zza;
            this.zzh = zzfgVar.zzf(this.zzg) - zzfgVar.zze(j4);
            zzf(zzaevVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzaevVar.zzo());
        if (zzaevVar.zzn() != 0) {
            zzafvVar.zza = 0L;
            return 1;
        }
        zzer zzerVar2 = this.zzb;
        zzerVar2.zza(iMin2);
        zzaevVar.zzl();
        zzaevVar.zzi(zzerVar2.zzi(), 0, iMin2);
        int iZzg2 = zzerVar2.zzg();
        int iZze2 = zzerVar2.zze();
        while (true) {
            if (iZzg2 >= iZze2 - 3) {
                break;
            }
            if (zzg(zzerVar2.zzi(), iZzg2) == 442) {
                zzerVar2.zzh(iZzg2 + 4);
                long jZze2 = zze(zzerVar2);
                if (jZze2 != -9223372036854775807L) {
                    j2 = jZze2;
                    break;
                }
            }
            iZzg2++;
        }
        this.zzf = j2;
        this.zzd = true;
        return 0;
    }

    zzapj() {
    }
}
