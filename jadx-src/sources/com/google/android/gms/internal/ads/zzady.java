package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzady {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE, Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE, 2048};

    public static void zzc(int i2, zzer zzerVar) {
        zzerVar.zza(7);
        byte[] bArrZzi = zzerVar.zzi();
        bArrZzi[0] = -84;
        bArrZzi[1] = 64;
        bArrZzi[2] = -1;
        bArrZzi[3] = -1;
        bArrZzi[4] = (byte) ((i2 >> 16) & 255);
        bArrZzi[5] = (byte) ((i2 >> 8) & 255);
        bArrZzi[6] = (byte) (i2 & 255);
    }

    private static void zzd(zzeq zzeqVar, zzadw zzadwVar) throws zzat {
        int iZzj = zzeqVar.zzj(5);
        zzeqVar.zzh(2);
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(5);
        }
        if (iZzj >= 7 && iZzj <= 10) {
            zzeqVar.zzg();
        }
        if (zzeqVar.zzi()) {
            int iZzj2 = zzeqVar.zzj(3);
            if (zzadwVar.zzb == -1 && iZzj >= 0 && iZzj <= 15 && (iZzj2 == 0 || iZzj2 == 1)) {
                zzadwVar.zzb = iZzj;
            }
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zze(zzeq zzeqVar, zzadw zzadwVar) throws zzat {
        zzeqVar.zzh(2);
        boolean zZzi = zzeqVar.zzi();
        int iZzj = zzeqVar.zzj(8);
        for (int i2 = 0; i2 < iZzj; i2++) {
            zzeqVar.zzh(2);
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(5);
            }
            if (zZzi) {
                zzeqVar.zzh(24);
            } else {
                if (zzeqVar.zzi()) {
                    if (!zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                    }
                    zzadwVar.zzc = zzeqVar.zzj(6) + 1;
                }
                zzeqVar.zzh(4);
            }
        }
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(3);
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zzf(zzeq zzeqVar) throws zzat {
        int iZzj = zzeqVar.zzj(6);
        if (iZzj < 2 || iZzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzj)));
        }
        zzeqVar.zzh(iZzj * 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzv zza(zzer zzerVar, String str, @Nullable String str2, @Nullable zzq zzqVar) throws zzat {
        int i2;
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean zZzi;
        int i12;
        int iZzj;
        int iZzj2;
        int iZzc;
        int i13;
        int i14;
        int iZzj3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int iZzc2 = zzeqVar.zzc();
        int iZzj4 = zzeqVar.zzj(3);
        int i21 = 1;
        if (iZzj4 > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzj4).length() + 30);
            sb.append("Unsupported AC-4 DSI version: ");
            sb.append(iZzj4);
            throw zzat.zzc(sb.toString());
        }
        int iZzj5 = zzeqVar.zzj(7);
        int i22 = true != zzeqVar.zzi() ? 44100 : 48000;
        zzeqVar.zzh(4);
        int iZzj6 = zzeqVar.zzj(9);
        if (iZzj5 > 1) {
            if (iZzj4 == 0) {
                throw zzat.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(16);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(128);
                }
            }
        }
        if (iZzj4 == 1) {
            if (!zzg(zzeqVar)) {
                throw zzat.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzeqVar.zzm();
        }
        zzadw zzadwVar = new zzadw(null);
        int i23 = 0;
        while (i23 < iZzj6) {
            if (iZzj4 == 0) {
                zZzi = zzeqVar.zzi();
                i12 = i20;
                iZzj = zzeqVar.zzj(5);
                iZzj2 = zzeqVar.zzj(5);
                iZzc = 0;
                i13 = 0;
                i14 = i21;
                iZzj3 = 0;
            } else {
                int iZzj7 = zzeqVar.zzj(i20);
                i14 = i21;
                iZzj3 = zzeqVar.zzj(i20);
                i12 = i20;
                if (iZzj3 == 255) {
                    iZzj3 = zzeqVar.zzj(16) + 255;
                }
                if (iZzj7 > 2) {
                    zzeqVar.zzh(iZzj3 * 8);
                    i23++;
                    i21 = i14;
                    i20 = i12;
                } else {
                    iZzc = (iZzc2 - zzeqVar.zzc()) / 8;
                    int iZzj8 = zzeqVar.zzj(5);
                    i13 = iZzj8 == 31 ? i14 : 0;
                    iZzj2 = iZzj7;
                    iZzj = iZzj8;
                    zZzi = false;
                }
            }
            zzadwVar.zzf = iZzj2;
            if (!zZzi && i13 == 0 && iZzj == 6) {
                i15 = iZzc;
                i7 = 7;
            } else {
                zzadwVar.zzg = zzeqVar.zzj(3);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(5);
                }
                zzeqVar.zzh(2);
                int i24 = i14;
                if (iZzj4 == i24) {
                    if (iZzj2 == i24) {
                        zzeqVar.zzh(2);
                    } else if (iZzj2 == 2) {
                        iZzj2 = 2;
                        zzeqVar.zzh(2);
                    }
                    if (zzadwVar.zza) {
                        int i25 = zzadwVar.zzc;
                        if (i25 > 0) {
                            i9 = i25 + 1;
                            if (zzadwVar.zzg == 4 && i9 == 17) {
                                i9 = 21;
                            }
                        } else {
                            int i26 = zzadwVar.zzg;
                            if (i26 == 0) {
                                i8 = 2;
                            } else if (i26 != 1) {
                                i8 = 2;
                                if (i26 == 2) {
                                    i9 = i2;
                                } else if (i26 == 3) {
                                    i9 = 10;
                                } else if (i26 != 4) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(i26).length() + 33);
                                    sb2.append("AC-4 level ");
                                    sb2.append(i26);
                                    sb2.append(" has not been defined.");
                                    zzee.zzc("Ac4Util", sb2.toString());
                                } else {
                                    i9 = 12;
                                }
                            } else {
                                i9 = 6;
                            }
                            i9 = i8;
                        }
                    } else {
                        int i27 = zzadwVar.zzb;
                        boolean z2 = zzadwVar.zzd;
                        int i28 = zzadwVar.zze;
                        switch (i27) {
                            case 0:
                                i10 = 11;
                                i11 = 1;
                                break;
                            case 1:
                                i10 = 11;
                                i11 = 2;
                                break;
                            case 2:
                                i10 = 11;
                                i11 = 3;
                                break;
                            case 3:
                                i11 = i3;
                                i10 = 11;
                                break;
                            case 4:
                                i10 = 11;
                                i11 = 6;
                                break;
                            case 5:
                            case 7:
                            case 9:
                                i11 = i7;
                                i10 = 11;
                                break;
                            case 6:
                            case 8:
                            case 10:
                                i11 = i2;
                                i10 = 11;
                                break;
                            case 11:
                                i10 = 11;
                                i11 = 11;
                                break;
                            case 12:
                                i11 = 12;
                                i10 = 11;
                                break;
                            case 13:
                                i11 = 13;
                                i10 = 11;
                                break;
                            case 14:
                                i10 = 11;
                                i11 = 14;
                                break;
                            case 15:
                                i10 = 11;
                                i11 = 24;
                                break;
                            default:
                                i11 = i5;
                                i10 = 11;
                                break;
                        }
                        if (i27 == i10 || i27 == 12 || i27 == 13 || i27 == 14) {
                            if (!z2) {
                                i11 -= 2;
                            }
                            i9 = i11;
                            if (i28 == 0) {
                                i9 -= 4;
                            } else if (i28 == 1) {
                                i9 -= 2;
                            }
                        } else {
                            i9 = i11;
                        }
                    }
                    if (i9 > 0) {
                        throw zzat.zzc("Cannot determine channel count of presentation.");
                    }
                    Object[] objArr = {Integer.valueOf(iZzj5), Integer.valueOf(zzadwVar.zzf), Integer.valueOf(zzadwVar.zzg)};
                    String str3 = zzfj.zza;
                    String str4 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                    zzt zztVar = new zzt();
                    zztVar.zza(str);
                    zztVar.zzm("audio/ac4");
                    zztVar.zzE(i9);
                    zztVar.zzF(i22);
                    zztVar.zzq(zzqVar);
                    zztVar.zze(str2);
                    zztVar.zzj(str4);
                    return zztVar.zzM();
                }
                zzeqVar.zzh(5);
                zzeqVar.zzh(10);
                if (iZzj4 == i24) {
                    if (iZzj2 > 0) {
                        zzadwVar.zza = zzeqVar.zzi();
                    }
                    if (zzadwVar.zza) {
                        if (iZzj2 != i24) {
                            i16 = 2;
                            if (iZzj2 == 2) {
                                i18 = 2;
                            } else {
                                i15 = iZzc;
                                i18 = iZzj2;
                                zzeqVar.zzh(24);
                                i17 = 1;
                            }
                        } else {
                            i18 = 1;
                        }
                        i15 = iZzc;
                        int iZzj9 = zzeqVar.zzj(5);
                        if (iZzj9 >= 0 && iZzj9 <= 15) {
                            zzadwVar.zzb = iZzj9;
                        }
                        if (iZzj9 < 11 || iZzj9 > 14) {
                            i16 = 2;
                        } else {
                            zzadwVar.zzd = zzeqVar.zzi();
                            i16 = 2;
                            zzadwVar.zze = zzeqVar.zzj(2);
                        }
                        zzeqVar.zzh(24);
                        i17 = 1;
                    } else {
                        i15 = iZzc;
                        i16 = 2;
                        i17 = i24;
                        i18 = iZzj2;
                    }
                    if (iZzj2 == i17 || iZzj2 == i16) {
                        if (zzeqVar.zzi() && zzeqVar.zzi()) {
                            zzeqVar.zzh(i16);
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzg();
                            int i29 = i12;
                            int iZzj10 = zzeqVar.zzj(i29);
                            int i30 = 0;
                            while (i30 < iZzj10) {
                                zzeqVar.zzh(i29);
                                i30++;
                                i29 = 8;
                            }
                        }
                    }
                    iZzj2 = i18;
                } else {
                    i15 = iZzc;
                }
                if (!zZzi && i13 == 0) {
                    zzeqVar.zzg();
                    if (iZzj == 0 || iZzj == 1 || iZzj == 2) {
                        if (iZzj2 == 0) {
                            for (int i31 = 0; i31 < 2; i31++) {
                                zzd(zzeqVar, zzadwVar);
                            }
                            iZzj2 = 0;
                            zzeqVar.zzg();
                            i7 = 7;
                            if (zzeqVar.zzi()) {
                            }
                            if (iZzj2 <= 0) {
                            }
                        } else {
                            for (int i32 = 0; i32 < 2; i32++) {
                                zze(zzeqVar, zzadwVar);
                            }
                            zzeqVar.zzg();
                            i7 = 7;
                            if (zzeqVar.zzi()) {
                            }
                            if (iZzj2 <= 0) {
                            }
                        }
                    } else if (iZzj != 3 && iZzj != 4) {
                        if (iZzj != 5) {
                            int iZzj11 = zzeqVar.zzj(7);
                            for (int i33 = 0; i33 < iZzj11; i33++) {
                                zzeqVar.zzh(8);
                            }
                        } else if (iZzj2 == 0) {
                            zzd(zzeqVar, zzadwVar);
                            iZzj2 = 0;
                        } else {
                            int iZzj12 = zzeqVar.zzj(3);
                            for (int i34 = 0; i34 < iZzj12 + 2; i34++) {
                                zze(zzeqVar, zzadwVar);
                            }
                        }
                        zzeqVar.zzg();
                        i7 = 7;
                        if (zzeqVar.zzi()) {
                        }
                        if (iZzj2 <= 0) {
                        }
                    } else if (iZzj2 == 0) {
                        for (int i35 = 0; i35 < 3; i35++) {
                            zzd(zzeqVar, zzadwVar);
                        }
                        iZzj2 = 0;
                        zzeqVar.zzg();
                        i7 = 7;
                        if (zzeqVar.zzi()) {
                        }
                        if (iZzj2 <= 0) {
                        }
                    } else {
                        for (int i36 = 0; i36 < 3; i36++) {
                            zze(zzeqVar, zzadwVar);
                        }
                        zzeqVar.zzg();
                        i7 = 7;
                        if (zzeqVar.zzi()) {
                        }
                        if (iZzj2 <= 0) {
                        }
                    }
                } else if (iZzj2 == 0) {
                    zzd(zzeqVar, zzadwVar);
                    iZzj2 = 0;
                    zzeqVar.zzg();
                    i7 = 7;
                    if (zzeqVar.zzi()) {
                    }
                    if (iZzj2 <= 0) {
                        i19 = 1;
                        i2 = 8;
                        i3 = 5;
                        zzeqVar.zzm();
                        if (iZzj4 == i19) {
                            int iZzc3 = ((iZzc2 - zzeqVar.zzc()) / i2) - i15;
                            if (iZzj3 < iZzc3) {
                                throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                            }
                            zzeqVar.zzo(iZzj3 - iZzc3);
                        }
                        if (zzadwVar.zza) {
                            i5 = -1;
                        } else {
                            i5 = -1;
                            if (zzadwVar.zzb == -1) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(i23).length() + 45);
                                sb3.append("Can't determine channel mode of presentation ");
                                sb3.append(i23);
                                throw zzat.zzc(sb3.toString());
                            }
                        }
                    } else {
                        if (zzeqVar.zzi() && !zzg(zzeqVar)) {
                            throw zzat.zzc("Can't parse bitrate DSI.");
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzm();
                            zzeqVar.zzo(zzeqVar.zzj(16));
                            i3 = 5;
                            int iZzj13 = zzeqVar.zzj(5);
                            for (int i37 = 0; i37 < iZzj13; i37++) {
                                zzeqVar.zzh(3);
                                zzeqVar.zzh(8);
                            }
                            i19 = 1;
                            i2 = 8;
                        }
                        zzeqVar.zzm();
                        if (iZzj4 == i19) {
                        }
                        if (zzadwVar.zza) {
                        }
                    }
                } else {
                    zze(zzeqVar, zzadwVar);
                    zzeqVar.zzg();
                    i7 = 7;
                    if (zzeqVar.zzi()) {
                    }
                    if (iZzj2 <= 0) {
                    }
                }
                if (zzadwVar.zza) {
                }
                if (i9 > 0) {
                }
            }
            int iZzj14 = zzeqVar.zzj(i7);
            for (int i38 = 0; i38 < iZzj14; i38++) {
                zzeqVar.zzh(15);
            }
            if (iZzj2 <= 0) {
            }
            if (zzadwVar.zza) {
            }
            if (i9 > 0) {
            }
        }
        i2 = i20;
        i3 = 5;
        i5 = -1;
        i7 = 7;
        if (zzadwVar.zza) {
        }
        if (i9 > 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzadx zzb(zzeq zzeqVar) {
        int i2;
        int i3;
        int iZzj;
        int iZzj2 = zzeqVar.zzj(16);
        int iZzj3 = zzeqVar.zzj(16);
        if (iZzj3 == 65535) {
            iZzj3 = zzeqVar.zzj(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i5 = iZzj3 + i2;
        if (iZzj2 == 44097) {
            i5 += 2;
        }
        int i7 = i5;
        int iZzj4 = zzeqVar.zzj(2);
        int i8 = 0;
        if (iZzj4 == 3) {
            int i9 = 0;
            while (true) {
                iZzj = i9 + zzeqVar.zzj(2);
                if (!zzeqVar.zzi()) {
                    break;
                }
                i9 = (iZzj + 1) << 2;
            }
            iZzj4 = iZzj + 3;
        }
        int i10 = iZzj4;
        int iZzj5 = zzeqVar.zzj(10);
        if (zzeqVar.zzi() && zzeqVar.zzj(3) > 0) {
            zzeqVar.zzh(2);
        }
        int i11 = 48000;
        if (true != zzeqVar.zzi()) {
            i3 = 48000;
            i11 = 44100;
        } else {
            i3 = 48000;
        }
        int iZzj6 = zzeqVar.zzj(4);
        if (i11 == 44100 && iZzj6 == 13) {
            i8 = zzb[13];
        } else if (i11 == i3 && iZzj6 < 14) {
            i8 = zzb[iZzj6];
            int i12 = iZzj5 % 5;
            if (i12 == 1) {
                if (iZzj6 == 3 || iZzj6 == 8) {
                    i8++;
                }
            } else if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4 && (iZzj6 == 3 || iZzj6 == 8 || iZzj6 == 11)) {
                    }
                }
            } else if (iZzj6 == 8 || iZzj6 == 11) {
            }
        }
        return new zzadx(i10, 2, i11, i7, i8, null);
    }

    private static boolean zzg(zzeq zzeqVar) {
        if (zzeqVar.zzc() < 66) {
            return false;
        }
        zzeqVar.zzh(66);
        return true;
    }
}
