package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzapd {
    private static void zzc(zzeq zzeqVar) {
        int iZzj;
        int iZzj2 = zzeqVar.zzj(2);
        if (iZzj2 == 0) {
            zzeqVar.zzh(6);
            return;
        }
        int iZzf = zzf(zzeqVar, 5, 8, 16) + 1;
        if (iZzj2 == 1) {
            zzeqVar.zzh(iZzf * 7);
            return;
        }
        if (iZzj2 == 2) {
            boolean zZzi = zzeqVar.zzi();
            int i2 = true != zZzi ? 5 : 1;
            int i3 = true == zZzi ? 7 : 5;
            int i5 = true == zZzi ? 8 : 6;
            int i7 = 0;
            while (i7 < iZzf) {
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(7);
                    iZzj = 0;
                } else {
                    if (zzeqVar.zzj(2) == 3 && zzeqVar.zzj(i3) * i2 != 0) {
                        zzeqVar.zzg();
                    }
                    iZzj = zzeqVar.zzj(i5) * i2;
                    if (iZzj != 0 && iZzj != 180) {
                        zzeqVar.zzg();
                    }
                    zzeqVar.zzg();
                }
                if (iZzj != 0 && iZzj != 180 && zzeqVar.zzi()) {
                    i7++;
                }
                i7++;
            }
        }
    }

    private static boolean zzd(zzeq zzeqVar) {
        zzeqVar.zzh(3);
        boolean zZzi = zzeqVar.zzi();
        if (zZzi) {
            zzeqVar.zzh(13);
        }
        return zZzi;
    }

    private static void zze(zzeq zzeqVar) {
        zzeqVar.zzh(3);
        zzeqVar.zzh(8);
        boolean zZzi = zzeqVar.zzi();
        boolean zZzi2 = zzeqVar.zzi();
        if (zZzi) {
            zzeqVar.zzh(5);
        }
        if (zZzi2) {
            zzeqVar.zzh(6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(zzeq zzeqVar, zzapb zzapbVar) throws zzat {
        long jZzk;
        zzeqVar.zze();
        int iZzf = zzf(zzeqVar, 3, 8, 8);
        zzapbVar.zza = iZzf;
        if (iZzf == -1) {
            return false;
        }
        zzgrc.zza(Math.max(Math.max(2, 8), 32) <= 63);
        Math.addExact(Math.addExact(3L, 255L), 4294967296L);
        if (zzeqVar.zzc() < 2) {
            jZzk = -1;
        } else {
            jZzk = zzeqVar.zzk(2);
            if (jZzk == 3) {
                if (zzeqVar.zzc() >= 8) {
                    long jZzk2 = zzeqVar.zzk(8);
                    long j2 = jZzk2 + 3;
                    if (jZzk2 != 255) {
                        jZzk = j2;
                    } else if (zzeqVar.zzc() >= 32) {
                        jZzk = j2 + zzeqVar.zzk(32);
                    }
                }
            }
        }
        zzapbVar.zzb = jZzk;
        if (jZzk == -1) {
            return false;
        }
        if (jZzk > 16) {
            StringBuilder sb = new StringBuilder(String.valueOf(jZzk).length() + 49);
            sb.append("Contains sub-stream with an invalid packet label ");
            sb.append(jZzk);
            throw zzat.zzc(sb.toString());
        }
        if (jZzk == 0) {
            int i2 = zzapbVar.zza;
            if (i2 == 1) {
                throw zzat.zzb("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i2 == 2) {
                throw zzat.zzb("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i2 == 17) {
                throw zzat.zzb("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iZzf2 = zzf(zzeqVar, 11, 24, 24);
        zzapbVar.zzc = iZzf2;
        return iZzf2 != -1;
    }

    public static zzapc zzb(zzeq zzeqVar) throws zzat {
        int iZzj;
        int i2;
        char c2;
        int i3;
        int i5;
        int iZzj2;
        char c4;
        int iZzj3 = zzeqVar.zzj(8);
        int i7 = 5;
        int iZzj4 = zzeqVar.zzj(5);
        if (iZzj4 != 31) {
            switch (iZzj4) {
                case 0:
                    iZzj = 96000;
                    break;
                case 1:
                    iZzj = 88200;
                    break;
                case 2:
                    iZzj = 64000;
                    break;
                case 3:
                    iZzj = 48000;
                    break;
                case 4:
                    iZzj = 44100;
                    break;
                case 5:
                    iZzj = 32000;
                    break;
                case 6:
                    iZzj = 24000;
                    break;
                case 7:
                    iZzj = 22050;
                    break;
                case 8:
                    iZzj = 16000;
                    break;
                case 9:
                    iZzj = 12000;
                    break;
                case 10:
                    iZzj = 11025;
                    break;
                case 11:
                    iZzj = 8000;
                    break;
                case 12:
                    iZzj = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzj4).length() + 32);
                    sb.append("Unsupported sampling rate index ");
                    sb.append(iZzj4);
                    throw zzat.zzc(sb.toString());
                case 15:
                    iZzj = 57600;
                    break;
                case 16:
                    iZzj = 51200;
                    break;
                case 17:
                    iZzj = 40000;
                    break;
                case 18:
                    iZzj = 38400;
                    break;
                case 19:
                    iZzj = 34150;
                    break;
                case 20:
                    iZzj = 28800;
                    break;
                case 21:
                    iZzj = 25600;
                    break;
                case 22:
                    iZzj = BrandSafetyUtils.f61442h;
                    break;
                case 23:
                    iZzj = 19200;
                    break;
                case 24:
                    iZzj = 17075;
                    break;
                case 25:
                    iZzj = 14400;
                    break;
                case 26:
                    iZzj = 12800;
                    break;
                case 27:
                    iZzj = 9600;
                    break;
            }
        } else {
            iZzj = zzeqVar.zzj(24);
        }
        int iZzj5 = zzeqVar.zzj(3);
        int i8 = 1;
        if (iZzj5 == 0) {
            i2 = 768;
        } else if (iZzj5 == 1) {
            i2 = 1024;
        } else if (iZzj5 == 2 || iZzj5 == 3) {
            i2 = 2048;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj5).length() + 36);
                sb2.append("Unsupported coreSbrFrameLengthIndex ");
                sb2.append(iZzj5);
                throw zzat.zzc(sb2.toString());
            }
            i2 = 4096;
        }
        if (iZzj5 == 0 || iZzj5 == 1) {
            c2 = 0;
        } else if (iZzj5 == 2) {
            c2 = 2;
        } else if (iZzj5 == 3) {
            c2 = 3;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj5).length() + 36);
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(iZzj5);
                throw zzat.zzc(sb3.toString());
            }
            c2 = 1;
        }
        zzeqVar.zzh(2);
        zzc(zzeqVar);
        int iZzj6 = zzeqVar.zzj(5);
        int i9 = 0;
        int iZzf = 0;
        while (true) {
            int i10 = 16;
            if (i9 < iZzj6 + 1) {
                int iZzj7 = zzeqVar.zzj(3);
                iZzf += zzf(zzeqVar, 5, 8, 16) + 1;
                if ((iZzj7 == 0 || iZzj7 == 2) && zzeqVar.zzi()) {
                    zzc(zzeqVar);
                }
                i9++;
            } else {
                int iZzf2 = zzf(zzeqVar, 4, 8, 16) + 1;
                zzeqVar.zzg();
                int i11 = 0;
                while (true) {
                    double d2 = 2.0d;
                    if (i11 >= iZzf2) {
                        int i12 = iZzj3;
                        byte[] bArr = null;
                        if (zzeqVar.zzi()) {
                            int iZzf3 = zzf(zzeqVar, 2, 4, 8) + 1;
                            for (int i13 = 0; i13 < iZzf3; i13++) {
                                int iZzf4 = zzf(zzeqVar, 4, 8, 16);
                                int iZzf5 = zzf(zzeqVar, 4, 8, 16);
                                if (iZzf4 == 7) {
                                    int iZzj8 = zzeqVar.zzj(4) + 1;
                                    zzeqVar.zzh(4);
                                    byte[] bArr2 = new byte[iZzj8];
                                    for (int i14 = 0; i14 < iZzj8; i14++) {
                                        bArr2[i14] = (byte) zzeqVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzeqVar.zzh(iZzf5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzj) {
                            case 14700:
                            case 16000:
                                d2 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d2 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d2 = 1.0d;
                                break;
                            default:
                                StringBuilder sb4 = new StringBuilder(String.valueOf(iZzj).length() + 26);
                                sb4.append("Unsupported sampling rate ");
                                sb4.append(iZzj);
                                throw zzat.zzc(sb4.toString());
                        }
                        return new zzapc(i12, (int) (((double) iZzj) * d2), (int) (((double) i2) * d2), bArr3, null);
                    }
                    int iZzj9 = zzeqVar.zzj(2);
                    if (iZzj9 == 0) {
                        i3 = iZzj3;
                        i5 = i8;
                        zzd(zzeqVar);
                        if (c2 > 0) {
                            zze(zzeqVar);
                        }
                    } else if (iZzj9 == i8) {
                        i5 = i8;
                        if (zzd(zzeqVar)) {
                            zzeqVar.zzg();
                        }
                        if (c2 > 0) {
                            zze(zzeqVar);
                            iZzj2 = zzeqVar.zzj(2);
                            c4 = c2;
                        } else {
                            iZzj2 = 0;
                            c4 = 0;
                        }
                        if (iZzj2 > 0) {
                            zzeqVar.zzh(6);
                            int iZzj10 = zzeqVar.zzj(2);
                            zzeqVar.zzh(4);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(i7);
                            }
                            if (iZzj2 == 2 || iZzj2 == 3) {
                                zzeqVar.zzh(6);
                            }
                            if (iZzj10 == 2) {
                                zzeqVar.zzg();
                            }
                        }
                        i3 = iZzj3;
                        int iFloor = ((int) Math.floor(Math.log(iZzf - 1) / Math.log(2.0d))) + 1;
                        int iZzj11 = zzeqVar.zzj(2);
                        if (iZzj11 > 0 && zzeqVar.zzi()) {
                            zzeqVar.zzh(iFloor);
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(iFloor);
                        }
                        if (c4 == 0 && iZzj11 == 0) {
                            zzeqVar.zzg();
                        }
                    } else if (iZzj9 != 3) {
                        i3 = iZzj3;
                        i5 = i8;
                    } else {
                        zzf(zzeqVar, 4, 8, i10);
                        int iZzf6 = zzf(zzeqVar, 4, 8, i10);
                        i5 = i8;
                        if (zzeqVar.zzi()) {
                            zzf(zzeqVar, 8, i10, 0);
                        }
                        zzeqVar.zzg();
                        if (iZzf6 > 0) {
                            zzeqVar.zzh(iZzf6 * 8);
                        }
                        i3 = iZzj3;
                    }
                    i11++;
                    iZzj3 = i3;
                    i8 = i5;
                    i7 = 5;
                    i10 = 16;
                }
            }
        }
    }

    private static int zzf(zzeq zzeqVar, int i2, int i3, int i5) {
        boolean z2;
        if (Math.max(Math.max(i2, i3), i5) <= 31) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zza(z2);
        int i7 = (1 << i2) - 1;
        int i8 = (1 << i3) - 1;
        Math.addExact(Math.addExact(i7, i8), 1 << i5);
        if (zzeqVar.zzc() < i2) {
            return -1;
        }
        int iZzj = zzeqVar.zzj(i2);
        if (iZzj == i7) {
            if (zzeqVar.zzc() < i3) {
                return -1;
            }
            int iZzj2 = zzeqVar.zzj(i3);
            int i9 = iZzj + iZzj2;
            if (iZzj2 == i8) {
                if (zzeqVar.zzc() < i5) {
                    return -1;
                }
                return i9 + zzeqVar.zzj(i5);
            }
            return i9;
        }
        return iZzj;
    }
}
