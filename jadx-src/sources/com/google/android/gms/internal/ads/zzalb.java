package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.mp4.Sniffer;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzalb {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Mp4Box.TYPE_avc1, Mp4Box.TYPE_hvc1, Mp4Box.TYPE_hev1, Mp4Box.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    @Nullable
    public static zzagc zza(zzaev zzaevVar) throws IOException {
        return zzc(zzaevVar, true, false);
    }

    @Nullable
    public static zzagc zzb(zzaev zzaevVar, boolean z2) throws IOException {
        return zzc(zzaevVar, false, z2);
    }

    @Nullable
    private static zzagc zzc(zzaev zzaevVar, boolean z2, boolean z3) throws IOException {
        zzagc zzagcVar;
        long j2;
        zzer zzerVar;
        int i2;
        int i3;
        long j3;
        int i5;
        int i7;
        int[] iArr;
        long jZzo = zzaevVar.zzo();
        long j4 = -1;
        long j5 = 4096;
        if (jZzo != -1 && jZzo <= 4096) {
            j5 = jZzo;
        }
        zzer zzerVar2 = new zzer(64);
        int i8 = (int) j5;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            zzerVar2.zza(8);
            if (!zzaevVar.zzh(zzerVar2.zzi(), i9, 8, true)) {
                break;
            }
            long jZzz = zzerVar2.zzz();
            int iZzB = zzerVar2.zzB();
            if (jZzz == 1) {
                j2 = j4;
                zzaevVar.zzi(zzerVar2.zzi(), 8, 8);
                i2 = 16;
                zzerVar2.zzf(16);
                jZzz = zzerVar2.zzD();
                zzerVar = zzerVar2;
            } else {
                j2 = j4;
                if (jZzz == 0) {
                    long jZzo2 = zzaevVar.zzo();
                    if (jZzo2 != j2) {
                        jZzz = (jZzo2 - zzaevVar.zzm()) + 8;
                    }
                }
                zzerVar = zzerVar2;
                i2 = 8;
            }
            long j6 = jZzz;
            zzagcVar = null;
            long j7 = i2;
            if (j6 < j7) {
                i3 = 1;
                if (iZzB == 1718773093) {
                    if (i2 == 8) {
                        j6 = 8;
                        iZzB = 1718773093;
                    } else {
                        iZzB = 1718773093;
                    }
                }
                return new zzajv(iZzB, j6, i2);
            }
            i3 = 1;
            i10 += i2;
            if (iZzB == 1836019574) {
                i8 += (int) j6;
                if (jZzo != -1 && i8 > jZzo) {
                    i8 = (int) jZzo;
                }
                zzerVar2 = zzerVar;
                j4 = j2;
                i9 = 0;
            } else {
                if (iZzB == 1953653099 || iZzB == 1835297121 || iZzB == 1835626086) {
                    j3 = jZzo;
                    i5 = 0;
                } else {
                    if (iZzB == 1836019558 || iZzB == 1836475768) {
                        i9 = i3;
                        break;
                    }
                    i11 |= (iZzB == 1835295092 ? 0 : i3) ^ 1;
                    if (iZzB == 1937007212) {
                        if (j6 > 1000000) {
                            i9 = 0;
                            break;
                        }
                        iZzB = 1937007212;
                    }
                    j3 = jZzo;
                    if ((((long) i10) + j6) - j7 >= i8) {
                        i9 = 0;
                        break;
                    }
                    int i12 = (int) (j6 - j7);
                    i10 += i12;
                    if (iZzB != 1718909296) {
                        i5 = 0;
                        if (i12 != 0) {
                            zzaevVar.zzk(i12);
                        }
                    } else {
                        if (i12 < 8) {
                            return new zzajv(Mp4Box.TYPE_ftyp, i12, 8);
                        }
                        zzerVar.zza(i12);
                        i5 = 0;
                        zzaevVar.zzi(zzerVar.zzi(), 0, i12);
                        int iZzB2 = zzerVar.zzB();
                        int i13 = (zzd(iZzB2, z3) ? 1 : 0) | i11;
                        zzerVar.zzk(4);
                        int iZzd = zzerVar.zzd() / 4;
                        if (i13 == 0 && iZzd > 0) {
                            iArr = new int[iZzd];
                            int i14 = 0;
                            while (true) {
                                if (i14 >= iZzd) {
                                    i7 = i13;
                                    break;
                                }
                                int iZzB3 = zzerVar.zzB();
                                iArr[i14] = iZzB3;
                                if (zzd(iZzB3, z3)) {
                                    i7 = i3;
                                    break;
                                }
                                i14++;
                            }
                        } else {
                            i7 = i13;
                            iArr = null;
                        }
                        if (i7 == 0) {
                            return new zzalg(iZzB2, iArr);
                        }
                        i11 = i7;
                    }
                }
                i9 = i5;
                zzerVar2 = zzerVar;
                jZzo = j3;
                j4 = j2;
            }
        }
        zzagcVar = null;
        return i11 == 0 ? zzakx.zza : z2 != i9 ? i9 != 0 ? zzakp.zza : zzakp.zzb : zzagcVar;
    }

    private static boolean zzd(int i2, boolean z2) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579) {
            if (z2) {
                return true;
            }
            i2 = 1751476579;
        }
        int[] iArr = zza;
        for (int i3 = 0; i3 < 29; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }
}
