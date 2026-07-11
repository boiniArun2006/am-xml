package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zziac {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i2, zziab zziabVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzb(b2, bArr, i3, zziabVar);
        }
        zziabVar.zza = b2;
        return i3;
    }

    static int zzb(int i2, byte[] bArr, int i3, zziab zziabVar) {
        byte b2 = bArr[i3];
        int i5 = i3 + 1;
        int i7 = i2 & 127;
        if (b2 >= 0) {
            zziabVar.zza = i7 | (b2 << 7);
            return i5;
        }
        int i8 = i7 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i9 = i3 + 2;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            zziabVar.zza = i8 | (b4 << 14);
            return i9;
        }
        int i10 = i8 | ((b4 & ByteCompanionObject.MAX_VALUE) << 14);
        int i11 = i3 + 3;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zziabVar.zza = i10 | (b5 << 21);
            return i11;
        }
        int i12 = i10 | ((b5 & ByteCompanionObject.MAX_VALUE) << 21);
        int i13 = i3 + 4;
        byte b6 = bArr[i11];
        if (b6 >= 0) {
            zziabVar.zza = i12 | (b6 << 28);
            return i13;
        }
        int i14 = i12 | ((b6 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zziabVar.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int zzc(byte[] bArr, int i2, zziab zziabVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zziabVar.zzb = j2;
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
        zziabVar.zzb = j3;
        return i5;
    }

    static int zzd(byte[] bArr, int i2) {
        int i3 = bArr[i2] & UByte.MAX_VALUE;
        int i5 = bArr[i2 + 1] & UByte.MAX_VALUE;
        int i7 = bArr[i2 + 2] & UByte.MAX_VALUE;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    static long zze(byte[] bArr, int i2) {
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    static int zzj(Object obj, zzidu zziduVar, byte[] bArr, int i2, int i3, zziab zziabVar) throws IOException {
        int iZzb = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            iZzb = zzb(i5, bArr, iZzb, zziabVar);
            i5 = zziabVar.zza;
        }
        int i7 = iZzb;
        if (i5 < 0 || i5 > i3 - i7) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i8 = zziabVar.zze + 1;
        zziabVar.zze = i8;
        zzq(i8);
        int i9 = i7 + i5;
        zziduVar.zzj(obj, bArr, i7, i9, zziabVar);
        zziabVar.zze--;
        zziabVar.zzc = obj;
        return i9;
    }

    static int zzk(Object obj, zzidu zziduVar, byte[] bArr, int i2, int i3, int i5, zziab zziabVar) throws IOException {
        int i7 = zziabVar.zze + 1;
        zziabVar.zze = i7;
        zzq(i7);
        int iZzi = ((zzidf) zziduVar).zzi(obj, bArr, i2, i3, i5, zziabVar);
        zziabVar.zze--;
        zziabVar.zzc = obj;
        return iZzi;
    }

    static int zzl(int i2, byte[] bArr, int i3, int i5, zzicd zzicdVar, zziab zziabVar) {
        zzibs zzibsVar = (zzibs) zzicdVar;
        int iZza = zza(bArr, i3, zziabVar);
        zzibsVar.zzi(zziabVar.zza);
        while (iZza < i5) {
            int iZza2 = zza(bArr, iZza, zziabVar);
            if (i2 != zziabVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zziabVar);
            zzibsVar.zzi(zziabVar.zza);
        }
        return iZza;
    }

    static int zzm(byte[] bArr, int i2, zzicd zzicdVar, zziab zziabVar) throws IOException {
        zzibs zzibsVar = (zzibs) zzicdVar;
        int iZza = zza(bArr, i2, zziabVar);
        int i3 = zziabVar.zza + iZza;
        while (iZza < i3) {
            iZza = zza(bArr, iZza, zziabVar);
            zzibsVar.zzi(zziabVar.zza);
        }
        if (iZza == i3) {
            return iZza;
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzo(int i2, byte[] bArr, int i3, int i5, zzieg zziegVar, zziab zziabVar) throws zzicg {
        if ((i2 >>> 3) == 0) {
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            int iZzc = zzc(bArr, i3, zziabVar);
            zziegVar.zzk(i2, Long.valueOf(zziabVar.zzb));
            return iZzc;
        }
        if (i7 == 1) {
            zziegVar.zzk(i2, Long.valueOf(zze(bArr, i3)));
            return i3 + 8;
        }
        if (i7 == 2) {
            int iZza = zza(bArr, i3, zziabVar);
            int i8 = zziabVar.zza;
            if (i8 < 0) {
                throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 > bArr.length - iZza) {
                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i8 == 0) {
                zziegVar.zzk(i2, zzian.zza);
            } else {
                zziegVar.zzk(i2, zzian.zzs(bArr, iZza, i8));
            }
            return iZza + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new zzicg("Protocol message contained an invalid tag (zero).");
            }
            zziegVar.zzk(i2, Integer.valueOf(zzd(bArr, i3)));
            return i3 + 4;
        }
        int i9 = (i2 & (-8)) | 4;
        zzieg zziegVarZzb = zzieg.zzb();
        int i10 = zziabVar.zze + 1;
        zziabVar.zze = i10;
        zzq(i10);
        int i11 = 0;
        while (true) {
            if (i3 >= i5) {
                break;
            }
            int iZza2 = zza(bArr, i3, zziabVar);
            int i12 = zziabVar.zza;
            if (i12 == i9) {
                i11 = i12;
                i3 = iZza2;
                break;
            }
            i3 = zzo(i12, bArr, iZza2, i5, zziegVarZzb, zziabVar);
            i11 = i12;
        }
        zziabVar.zze--;
        if (i3 > i5 || i11 != i9) {
            throw new zzicg("Failed to parse the message.");
        }
        zziegVar.zzk(i2, zziegVarZzb);
        return i3;
    }

    static int zzp(int i2, byte[] bArr, int i3, int i5, zziab zziabVar) throws zzicg {
        if ((i2 >>> 3) == 0) {
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return zzc(bArr, i3, zziabVar);
        }
        if (i7 == 1) {
            return i3 + 8;
        }
        if (i7 == 2) {
            return zza(bArr, i3, zziabVar) + zziabVar.zza;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                return i3 + 4;
            }
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i8 = (i2 & (-8)) | 4;
        int i9 = 0;
        while (i3 < i5) {
            i3 = zza(bArr, i3, zziabVar);
            i9 = zziabVar.zza;
            if (i9 == i8) {
                break;
            }
            i3 = zzp(i9, bArr, i3, i5, zziabVar);
        }
        if (i3 > i5 || i9 != i8) {
            throw new zzicg("Failed to parse the message.");
        }
        return i3;
    }

    private static void zzq(int i2) throws zzicg {
        if (i2 >= zzb) {
            throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    static int zzf(byte[] bArr, int i2, zziab zziabVar) throws zzicg {
        int iZza = zza(bArr, i2, zziabVar);
        int i3 = zziabVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zziabVar.zzc = "";
                return iZza;
            }
            zziabVar.zzc = zzier.zze(bArr, iZza, i3);
            return iZza + i3;
        }
        throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static int zzg(byte[] bArr, int i2, zziab zziabVar) throws zzicg {
        int iZza = zza(bArr, i2, zziabVar);
        int i3 = zziabVar.zza;
        if (i3 >= 0) {
            if (i3 <= bArr.length - iZza) {
                if (i3 == 0) {
                    zziabVar.zzc = zzian.zza;
                    return iZza;
                }
                zziabVar.zzc = zzian.zzs(bArr, iZza, i3);
                return iZza + i3;
            }
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static int zzh(zzidu zziduVar, byte[] bArr, int i2, int i3, zziab zziabVar) throws IOException {
        Object objZza = zziduVar.zza();
        int iZzj = zzj(objZza, zziduVar, bArr, i2, i3, zziabVar);
        zziduVar.zzk(objZza);
        zziabVar.zzc = objZza;
        return iZzj;
    }

    static int zzi(zzidu zziduVar, byte[] bArr, int i2, int i3, int i5, zziab zziabVar) throws IOException {
        Object objZza = zziduVar.zza();
        int iZzk = zzk(objZza, zziduVar, bArr, i2, i3, i5, zziabVar);
        zziduVar.zzk(objZza);
        zziabVar.zzc = objZza;
        return iZzk;
    }

    static int zzn(zzidu zziduVar, int i2, byte[] bArr, int i3, int i5, zzicd zzicdVar, zziab zziabVar) throws IOException {
        int iZzh = zzh(zziduVar, bArr, i3, i5, zziabVar);
        zzicdVar.add(zziabVar.zzc);
        while (iZzh < i5) {
            int iZza = zza(bArr, iZzh, zziabVar);
            if (i2 != zziabVar.zza) {
                break;
            }
            iZzh = zzh(zziduVar, bArr, iZza, i5, zziabVar);
            zzicdVar.add(zziabVar.zzc);
        }
        return iZzh;
    }
}
