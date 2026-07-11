package com.google.android.gms.internal.auth;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzdu {
    static int zzb(byte[] bArr, int i2) {
        int i3 = bArr[i2] & UByte.MAX_VALUE;
        int i5 = bArr[i2 + 1] & UByte.MAX_VALUE;
        int i7 = bArr[i2 + 2] & UByte.MAX_VALUE;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    static int zzf(byte[] bArr, int i2, zzez zzezVar, zzdt zzdtVar) throws IOException {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i2, zzdtVar);
        int i3 = zzdtVar.zza + iZzh;
        while (iZzh < i3) {
            iZzh = zzh(bArr, iZzh, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (iZzh == i3) {
            return iZzh;
        }
        throw zzfb.zzf();
    }

    static int zzg(int i2, byte[] bArr, int i3, int i5, zzha zzhaVar, zzdt zzdtVar) throws zzfb {
        if ((i2 >>> 3) == 0) {
            throw zzfb.zza();
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            int iZzk = zzk(bArr, i3, zzdtVar);
            zzhaVar.zzh(i2, Long.valueOf(zzdtVar.zzb));
            return iZzk;
        }
        if (i7 == 1) {
            zzhaVar.zzh(i2, Long.valueOf(zzn(bArr, i3)));
            return i3 + 8;
        }
        if (i7 == 2) {
            int iZzh = zzh(bArr, i3, zzdtVar);
            int i8 = zzdtVar.zza;
            if (i8 < 0) {
                throw zzfb.zzc();
            }
            if (i8 > bArr.length - iZzh) {
                throw zzfb.zzf();
            }
            if (i8 == 0) {
                zzhaVar.zzh(i2, zzef.zzb);
            } else {
                zzhaVar.zzh(i2, zzef.zzk(bArr, iZzh, i8));
            }
            return iZzh + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw zzfb.zza();
            }
            zzhaVar.zzh(i2, Integer.valueOf(zzb(bArr, i3)));
            return i3 + 4;
        }
        int i9 = (i2 & (-8)) | 4;
        zzha zzhaVarZzd = zzha.zzd();
        int i10 = 0;
        while (true) {
            if (i3 >= i5) {
                break;
            }
            int iZzh2 = zzh(bArr, i3, zzdtVar);
            i10 = zzdtVar.zza;
            if (i10 == i9) {
                i3 = iZzh2;
                break;
            }
            i3 = zzg(i10, bArr, iZzh2, i5, zzhaVarZzd, zzdtVar);
        }
        if (i3 > i5 || i10 != i9) {
            throw zzfb.zzd();
        }
        zzhaVar.zzh(i2, zzhaVarZzd);
        return i3;
    }

    static int zzh(byte[] bArr, int i2, zzdt zzdtVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzi(b2, bArr, i3, zzdtVar);
        }
        zzdtVar.zza = b2;
        return i3;
    }

    static int zzi(int i2, byte[] bArr, int i3, zzdt zzdtVar) {
        byte b2 = bArr[i3];
        int i5 = i3 + 1;
        int i7 = i2 & 127;
        if (b2 >= 0) {
            zzdtVar.zza = i7 | (b2 << 7);
            return i5;
        }
        int i8 = i7 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i9 = i3 + 2;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            zzdtVar.zza = i8 | (b4 << 14);
            return i9;
        }
        int i10 = i8 | ((b4 & ByteCompanionObject.MAX_VALUE) << 14);
        int i11 = i3 + 3;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzdtVar.zza = i10 | (b5 << 21);
            return i11;
        }
        int i12 = i10 | ((b5 & ByteCompanionObject.MAX_VALUE) << 21);
        int i13 = i3 + 4;
        byte b6 = bArr[i11];
        if (b6 >= 0) {
            zzdtVar.zza = i12 | (b6 << 28);
            return i13;
        }
        int i14 = i12 | ((b6 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzdtVar.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int zzj(int i2, byte[] bArr, int i3, int i5, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i3, zzdtVar);
        zzewVar.zze(zzdtVar.zza);
        while (iZzh < i5) {
            int iZzh2 = zzh(bArr, iZzh, zzdtVar);
            if (i2 != zzdtVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        return iZzh;
    }

    static int zzk(byte[] bArr, int i2, zzdt zzdtVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zzdtVar.zzb = j2;
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
        zzdtVar.zzb = j3;
        return i5;
    }

    static int zzl(Object obj, zzgi zzgiVar, byte[] bArr, int i2, int i3, int i5, zzdt zzdtVar) throws IOException {
        int iZzb = ((zzga) zzgiVar).zzb(obj, bArr, i2, i3, i5, zzdtVar);
        zzdtVar.zzc = obj;
        return iZzb;
    }

    static int zzm(Object obj, zzgi zzgiVar, byte[] bArr, int i2, int i3, zzdt zzdtVar) throws IOException {
        int iZzi = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            iZzi = zzi(i5, bArr, iZzi, zzdtVar);
            i5 = zzdtVar.zza;
        }
        int i7 = iZzi;
        if (i5 < 0 || i5 > i3 - i7) {
            throw zzfb.zzf();
        }
        int i8 = i7 + i5;
        zzgiVar.zzg(obj, bArr, i7, i8, zzdtVar);
        zzdtVar.zzc = obj;
        return i8;
    }

    static long zzn(byte[] bArr, int i2) {
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    static int zza(byte[] bArr, int i2, zzdt zzdtVar) throws zzfb {
        int iZzh = zzh(bArr, i2, zzdtVar);
        int i3 = zzdtVar.zza;
        if (i3 >= 0) {
            if (i3 <= bArr.length - iZzh) {
                if (i3 == 0) {
                    zzdtVar.zzc = zzef.zzb;
                    return iZzh;
                }
                zzdtVar.zzc = zzef.zzk(bArr, iZzh, i3);
                return iZzh + i3;
            }
            throw zzfb.zzf();
        }
        throw zzfb.zzc();
    }

    static int zzc(zzgi zzgiVar, byte[] bArr, int i2, int i3, int i5, zzdt zzdtVar) throws IOException {
        Object objZzd = zzgiVar.zzd();
        int iZzl = zzl(objZzd, zzgiVar, bArr, i2, i3, i5, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzl;
    }

    static int zzd(zzgi zzgiVar, byte[] bArr, int i2, int i3, zzdt zzdtVar) throws IOException {
        Object objZzd = zzgiVar.zzd();
        int iZzm = zzm(objZzd, zzgiVar, bArr, i2, i3, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzm;
    }

    static int zze(zzgi zzgiVar, int i2, byte[] bArr, int i3, int i5, zzez zzezVar, zzdt zzdtVar) throws IOException {
        int iZzd = zzd(zzgiVar, bArr, i3, i5, zzdtVar);
        zzezVar.add(zzdtVar.zzc);
        while (iZzd < i5) {
            int iZzh = zzh(bArr, iZzd, zzdtVar);
            if (i2 != zzdtVar.zza) {
                break;
            }
            iZzd = zzd(zzgiVar, bArr, iZzh, i5, zzdtVar);
            zzezVar.add(zzdtVar.zzc);
        }
        return iZzd;
    }
}
