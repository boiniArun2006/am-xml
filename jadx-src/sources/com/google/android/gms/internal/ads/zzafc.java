package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzafc {
    public static boolean zza(zzer zzerVar, zzafh zzafhVar, int i2, zzafb zzafbVar) {
        int iZzg = zzerVar.zzg();
        long jZzz = zzerVar.zzz();
        long j2 = jZzz >>> 16;
        if (j2 != i2) {
            return false;
        }
        boolean z2 = (j2 & 1) == 1;
        long j3 = jZzz >> 12;
        long j4 = jZzz >> 8;
        long j5 = jZzz >> 4;
        long j6 = jZzz >> 1;
        long j7 = jZzz & 1;
        int i3 = (int) (j5 & 15);
        if (i3 <= 7) {
            if (i3 != zzafhVar.zzg - 1) {
                return false;
            }
        } else if (i3 > 10 || zzafhVar.zzg != 2) {
            return false;
        }
        int i5 = (int) (j6 & 7);
        if ((i5 != 0 && i5 != zzafhVar.zzi) || j7 == 1 || !zzd(zzerVar, zzafhVar, z2, zzafbVar)) {
            return false;
        }
        long j9 = zzafbVar.zza;
        int iZzc = zzc(zzerVar, (int) (j3 & 15));
        long j10 = zzafhVar.zzj;
        boolean z3 = j10 == 0 || j9 + ((long) iZzc) >= j10;
        if (iZzc == -1) {
            return false;
        }
        if ((!z3 && iZzc < zzafhVar.zza) || iZzc > zzafhVar.zzb) {
            return false;
        }
        int i7 = zzafhVar.zze;
        int i8 = (int) (j4 & 15);
        if (i8 != 0) {
            if (i8 <= 11) {
                if (i8 != zzafhVar.zzf) {
                    return false;
                }
            } else if (i8 == 12) {
                if (zzerVar.zzs() * 1000 != i7) {
                    return false;
                }
            } else {
                if (i8 > 14) {
                    return false;
                }
                int iZzt = zzerVar.zzt();
                if (i8 == 14) {
                    iZzt *= 10;
                }
                if (iZzt != i7) {
                    return false;
                }
            }
        }
        if (zzerVar.zzs() != zzfj.zzI(zzerVar.zzi(), iZzg, zzerVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzerVar.zzd() != 0) {
            int iZzn = zzerVar.zzn();
            if ((iZzn & 128) != 0) {
                return false;
            }
            int i9 = (iZzn & 126) >> 1;
            if ((i9 >= 2 && i9 <= 7) || (i9 >= 13 && i9 <= 31)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 57);
                sb.append("Ignoring frame where first subframe has a reserved type: ");
                sb.append(i9);
                zzee.zzb("FlacFrameReader", sb.toString());
                return false;
            }
        }
        return true;
    }

    public static long zzb(zzaev zzaevVar, zzafh zzafhVar) throws IOException {
        boolean z2;
        int i2;
        zzaevVar.zzl();
        zzaevVar.zzk(1);
        byte[] bArr = new byte[1];
        zzaevVar.zzi(bArr, 0, 1);
        int i3 = bArr[0] & 1;
        if (1 != i3) {
            z2 = false;
        } else {
            z2 = true;
        }
        zzaevVar.zzk(2);
        if (1 != i3) {
            i2 = 6;
        } else {
            i2 = 7;
        }
        zzer zzerVar = new zzer(i2);
        zzerVar.zzf(zzaey.zzb(zzaevVar, zzerVar.zzi(), 0, i2));
        zzaevVar.zzl();
        zzafb zzafbVar = new zzafb();
        if (zzd(zzerVar, zzafhVar, z2, zzafbVar)) {
            return zzafbVar.zza;
        }
        throw zzat.zzb(null, null);
    }

    public static int zzc(zzer zzerVar, int i2) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return zzerVar.zzs() + 1;
            case 7:
                return zzerVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzer zzerVar, zzafh zzafhVar, boolean z2, zzafb zzafbVar) {
        try {
            long jZzO = zzerVar.zzO();
            if (!z2) {
                jZzO *= (long) zzafhVar.zzb;
            }
            long j2 = zzafhVar.zzj;
            if (j2 == 0 || jZzO <= j2) {
                zzafbVar.zza = jZzO;
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
