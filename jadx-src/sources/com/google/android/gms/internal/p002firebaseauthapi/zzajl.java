package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzajl {
    private static volatile int zza = 100;

    static double zza(byte[] bArr, int i2) {
        return Double.longBitsToDouble(zzd(bArr, i2));
    }

    static float zzb(byte[] bArr, int i2) {
        return Float.intBitsToFloat(zzc(bArr, i2));
    }

    static int zzc(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
    }

    static int zzd(byte[] bArr, int i2, zzajk zzajkVar) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            zzajkVar.zzb = j2;
            return i3;
        }
        int i5 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & ByteCompanionObject.MAX_VALUE)) << 7);
        int i7 = 7;
        while (b2 < 0) {
            int i8 = i5 + 1;
            byte b4 = bArr[i5];
            i7 += 7;
            j3 |= ((long) (b4 & ByteCompanionObject.MAX_VALUE)) << i7;
            b2 = b4;
            i5 = i8;
        }
        zzajkVar.zzb = j3;
        return i5;
    }

    static int zza(byte[] bArr, int i2, zzajk zzajkVar) throws zzalf {
        int iZzc = zzc(bArr, i2, zzajkVar);
        int i3 = zzajkVar.zza;
        if (i3 < 0) {
            throw zzalf.zzf();
        }
        if (i3 > bArr.length - iZzc) {
            throw zzalf.zzj();
        }
        if (i3 == 0) {
            zzajkVar.zzc = zzajp.zza;
            return iZzc;
        }
        zzajkVar.zzc = zzajp.zza(bArr, iZzc, i3);
        return iZzc + i3;
    }

    static int zzb(zzamv<?> zzamvVar, int i2, byte[] bArr, int i3, int i5, zzalc<?> zzalcVar, zzajk zzajkVar) throws IOException {
        int iZza = zza(zzamvVar, bArr, i3, i5, zzajkVar);
        zzalcVar.add(zzajkVar.zzc);
        while (iZza < i5) {
            int iZzc = zzc(bArr, iZza, zzajkVar);
            if (i2 != zzajkVar.zza) {
                break;
            }
            iZza = zza(zzamvVar, bArr, iZzc, i5, zzajkVar);
            zzalcVar.add(zzajkVar.zzc);
        }
        return iZza;
    }

    static int zzc(byte[] bArr, int i2, zzajk zzajkVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zza(b2, bArr, i3, zzajkVar);
        }
        zzajkVar.zza = b2;
        return i3;
    }

    static long zzd(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    static int zzb(byte[] bArr, int i2, zzajk zzajkVar) throws zzalf {
        int iZzc = zzc(bArr, i2, zzajkVar);
        int i3 = zzajkVar.zza;
        if (i3 < 0) {
            throw zzalf.zzf();
        }
        if (i3 == 0) {
            zzajkVar.zzc = "";
            return iZzc;
        }
        zzajkVar.zzc = zzant.zzb(bArr, iZzc, i3);
        return iZzc + i3;
    }

    static int zza(int i2, byte[] bArr, int i3, int i5, Object obj, zzamc zzamcVar, zzano<zzann, zzann> zzanoVar, zzajk zzajkVar) throws IOException {
        if (zzajkVar.zzd.zza(zzamcVar, i2 >>> 3) == null) {
            return zza(i2, bArr, i3, i5, zzamg.zzc(obj), zzajkVar);
        }
        zzaky.zzb zzbVar = (zzaky.zzb) obj;
        zzbVar.zza();
        zzakr<zzaky.zze> zzakrVar = zzbVar.zzc;
        throw new NoSuchMethodError();
    }

    private static <T> int zza(zzamv<T> zzamvVar, byte[] bArr, int i2, int i3, int i5, zzajk zzajkVar) throws IOException {
        T tZza = zzamvVar.zza();
        int iZza = zza(tZza, zzamvVar, bArr, i2, i3, i5, zzajkVar);
        zzamvVar.zzd(tZza);
        zzajkVar.zzc = tZza;
        return iZza;
    }

    static int zza(zzamv<?> zzamvVar, int i2, byte[] bArr, int i3, int i5, zzalc<Object> zzalcVar, zzajk zzajkVar) throws IOException {
        int i7 = (i2 & (-8)) | 4;
        int iZza = zza(zzamvVar, bArr, i3, i5, i7, zzajkVar);
        zzalcVar.add(zzajkVar.zzc);
        while (iZza < i5) {
            int iZzc = zzc(bArr, iZza, zzajkVar);
            if (i2 != zzajkVar.zza) {
                break;
            }
            iZza = zza(zzamvVar, bArr, iZzc, i5, i7, zzajkVar);
            zzalcVar.add(zzajkVar.zzc);
        }
        return iZza;
    }

    static <T> int zza(zzamv<T> zzamvVar, byte[] bArr, int i2, int i3, zzajk zzajkVar) throws IOException {
        T tZza = zzamvVar.zza();
        int iZza = zza(tZza, zzamvVar, bArr, i2, i3, zzajkVar);
        zzamvVar.zzd(tZza);
        zzajkVar.zzc = tZza;
        return iZza;
    }

    static int zza(byte[] bArr, int i2, zzalc<?> zzalcVar, zzajk zzajkVar) throws IOException {
        zzakz zzakzVar = (zzakz) zzalcVar;
        int iZzc = zzc(bArr, i2, zzajkVar);
        int i3 = zzajkVar.zza + iZzc;
        while (iZzc < i3) {
            iZzc = zzc(bArr, iZzc, zzajkVar);
            zzakzVar.zzc(zzajkVar.zza);
        }
        if (iZzc == i3) {
            return iZzc;
        }
        throw zzalf.zzj();
    }

    static int zza(int i2, byte[] bArr, int i3, int i5, zzann zzannVar, zzajk zzajkVar) throws zzalf {
        if ((i2 >>> 3) == 0) {
            throw zzalf.zzc();
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            int iZzd = zzd(bArr, i3, zzajkVar);
            zzannVar.zza(i2, Long.valueOf(zzajkVar.zzb));
            return iZzd;
        }
        if (i7 == 1) {
            zzannVar.zza(i2, Long.valueOf(zzd(bArr, i3)));
            return i3 + 8;
        }
        if (i7 == 2) {
            int iZzc = zzc(bArr, i3, zzajkVar);
            int i8 = zzajkVar.zza;
            if (i8 >= 0) {
                if (i8 > bArr.length - iZzc) {
                    throw zzalf.zzj();
                }
                if (i8 == 0) {
                    zzannVar.zza(i2, zzajp.zza);
                } else {
                    zzannVar.zza(i2, zzajp.zza(bArr, iZzc, i8));
                }
                return iZzc + i8;
            }
            throw zzalf.zzf();
        }
        if (i7 != 3) {
            if (i7 == 5) {
                zzannVar.zza(i2, Integer.valueOf(zzc(bArr, i3)));
                return i3 + 4;
            }
            throw zzalf.zzc();
        }
        zzann zzannVarZzd = zzann.zzd();
        int i9 = (i2 & (-8)) | 4;
        int i10 = zzajkVar.zze + 1;
        zzajkVar.zze = i10;
        zza(i10);
        int i11 = 0;
        while (true) {
            if (i3 >= i5) {
                break;
            }
            int iZzc2 = zzc(bArr, i3, zzajkVar);
            i11 = zzajkVar.zza;
            if (i11 == i9) {
                i3 = iZzc2;
                break;
            }
            i3 = zza(i11, bArr, iZzc2, i5, zzannVarZzd, zzajkVar);
        }
        zzajkVar.zze--;
        if (i3 <= i5 && i11 == i9) {
            zzannVar.zza(i2, zzannVarZzd);
            return i3;
        }
        throw zzalf.zzg();
    }

    static int zza(int i2, byte[] bArr, int i3, zzajk zzajkVar) {
        int i5 = i2 & 127;
        int i7 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzajkVar.zza = i5 | (b2 << 7);
            return i7;
        }
        int i8 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i9 = i3 + 2;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zzajkVar.zza = i8 | (b4 << 14);
            return i9;
        }
        int i10 = i8 | ((b4 & ByteCompanionObject.MAX_VALUE) << 14);
        int i11 = i3 + 3;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzajkVar.zza = i10 | (b5 << 21);
            return i11;
        }
        int i12 = i10 | ((b5 & ByteCompanionObject.MAX_VALUE) << 21);
        int i13 = i3 + 4;
        byte b6 = bArr[i11];
        if (b6 >= 0) {
            zzajkVar.zza = i12 | (b6 << 28);
            return i13;
        }
        int i14 = i12 | ((b6 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzajkVar.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int zza(int i2, byte[] bArr, int i3, int i5, zzalc<?> zzalcVar, zzajk zzajkVar) {
        zzakz zzakzVar = (zzakz) zzalcVar;
        int iZzc = zzc(bArr, i3, zzajkVar);
        zzakzVar.zzc(zzajkVar.zza);
        while (iZzc < i5) {
            int iZzc2 = zzc(bArr, iZzc, zzajkVar);
            if (i2 != zzajkVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzajkVar);
            zzakzVar.zzc(zzajkVar.zza);
        }
        return iZzc;
    }

    static <T> int zza(Object obj, zzamv<T> zzamvVar, byte[] bArr, int i2, int i3, int i5, zzajk zzajkVar) throws IOException {
        int i7 = zzajkVar.zze + 1;
        zzajkVar.zze = i7;
        zza(i7);
        int iZza = ((zzamg) zzamvVar).zza(obj, bArr, i2, i3, i5, zzajkVar);
        zzajkVar.zze--;
        zzajkVar.zzc = obj;
        return iZza;
    }

    static <T> int zza(Object obj, zzamv<T> zzamvVar, byte[] bArr, int i2, int i3, zzajk zzajkVar) throws IOException {
        int iZza = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            iZza = zza(i5, bArr, iZza, zzajkVar);
            i5 = zzajkVar.zza;
        }
        int i7 = iZza;
        if (i5 >= 0 && i5 <= i3 - i7) {
            int i8 = zzajkVar.zze + 1;
            zzajkVar.zze = i8;
            zza(i8);
            int i9 = i7 + i5;
            zzamvVar.zza(obj, bArr, i7, i9, zzajkVar);
            zzajkVar.zze--;
            zzajkVar.zzc = obj;
            return i9;
        }
        throw zzalf.zzj();
    }

    static int zza(int i2, byte[] bArr, int i3, int i5, zzajk zzajkVar) throws zzalf {
        if ((i2 >>> 3) == 0) {
            throw zzalf.zzc();
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return zzd(bArr, i3, zzajkVar);
        }
        if (i7 == 1) {
            return i3 + 8;
        }
        if (i7 == 2) {
            return zzc(bArr, i3, zzajkVar) + zzajkVar.zza;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                return i3 + 4;
            }
            throw zzalf.zzc();
        }
        int i8 = (i2 & (-8)) | 4;
        int i9 = 0;
        while (i3 < i5) {
            i3 = zzc(bArr, i3, zzajkVar);
            i9 = zzajkVar.zza;
            if (i9 == i8) {
                break;
            }
            i3 = zza(i9, bArr, i3, i5, zzajkVar);
        }
        if (i3 > i5 || i9 != i8) {
            throw zzalf.zzg();
        }
        return i3;
    }

    private static void zza(int i2) throws zzalf {
        if (i2 >= zza) {
            throw zzalf.zzh();
        }
    }
}
