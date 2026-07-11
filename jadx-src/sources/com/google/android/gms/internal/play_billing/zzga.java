package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzga {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zzb(byte[] bArr, int i2) {
        int i3 = bArr[i2] & UByte.MAX_VALUE;
        int i5 = bArr[i2 + 1] & UByte.MAX_VALUE;
        int i7 = bArr[i2 + 2] & UByte.MAX_VALUE;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    static int zzf(byte[] bArr, int i2, zzho zzhoVar, zzfz zzfzVar) throws IOException {
        zzhl zzhlVar = (zzhl) zzhoVar;
        int iZzh = zzh(bArr, i2, zzfzVar);
        int i3 = zzfzVar.zza + iZzh;
        while (iZzh < i3) {
            iZzh = zzh(bArr, iZzh, zzfzVar);
            zzhlVar.zzg(zzfzVar.zza);
        }
        if (iZzh == i3) {
            return iZzh;
        }
        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzg(int i2, byte[] bArr, int i3, int i5, zzjk zzjkVar, zzfz zzfzVar) throws zzhr {
        if ((i2 >>> 3) == 0) {
            throw new zzhr("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            int iZzk = zzk(bArr, i3, zzfzVar);
            zzjkVar.zzj(i2, Long.valueOf(zzfzVar.zzb));
            return iZzk;
        }
        if (i7 == 1) {
            zzjkVar.zzj(i2, Long.valueOf(zzn(bArr, i3)));
            return i3 + 8;
        }
        if (i7 == 2) {
            int iZzh = zzh(bArr, i3, zzfzVar);
            int i8 = zzfzVar.zza;
            if (i8 < 0) {
                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 > bArr.length - iZzh) {
                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i8 == 0) {
                zzjkVar.zzj(i2, zzgk.zzb);
            } else {
                zzjkVar.zzj(i2, zzgk.zzj(bArr, iZzh, i8));
            }
            return iZzh + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new zzhr("Protocol message contained an invalid tag (zero).");
            }
            zzjkVar.zzj(i2, Integer.valueOf(zzb(bArr, i3)));
            return i3 + 4;
        }
        int i9 = (i2 & (-8)) | 4;
        zzjk zzjkVarZzf = zzjk.zzf();
        int i10 = zzfzVar.zze + 1;
        zzfzVar.zze = i10;
        zzo(i10);
        int i11 = 0;
        while (true) {
            if (i3 >= i5) {
                break;
            }
            int iZzh2 = zzh(bArr, i3, zzfzVar);
            int i12 = zzfzVar.zza;
            if (i12 == i9) {
                i11 = i12;
                i3 = iZzh2;
                break;
            }
            i3 = zzg(i12, bArr, iZzh2, i5, zzjkVarZzf, zzfzVar);
            i11 = i12;
        }
        zzfzVar.zze--;
        if (i3 > i5 || i11 != i9) {
            throw new zzhr("Failed to parse the message.");
        }
        zzjkVar.zzj(i2, zzjkVarZzf);
        return i3;
    }

    static int zzh(byte[] bArr, int i2, zzfz zzfzVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzi(b2, bArr, i3, zzfzVar);
        }
        zzfzVar.zza = b2;
        return i3;
    }

    static int zzi(int i2, byte[] bArr, int i3, zzfz zzfzVar) {
        byte b2 = bArr[i3];
        int i5 = i3 + 1;
        int i7 = i2 & 127;
        if (b2 >= 0) {
            zzfzVar.zza = i7 | (b2 << 7);
            return i5;
        }
        int i8 = i7 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i9 = i3 + 2;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            zzfzVar.zza = i8 | (b4 << 14);
            return i9;
        }
        int i10 = i8 | ((b4 & ByteCompanionObject.MAX_VALUE) << 14);
        int i11 = i3 + 3;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzfzVar.zza = i10 | (b5 << 21);
            return i11;
        }
        int i12 = i10 | ((b5 & ByteCompanionObject.MAX_VALUE) << 21);
        int i13 = i3 + 4;
        byte b6 = bArr[i11];
        if (b6 >= 0) {
            zzfzVar.zza = i12 | (b6 << 28);
            return i13;
        }
        int i14 = i12 | ((b6 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzfzVar.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int zzj(int i2, byte[] bArr, int i3, int i5, zzho zzhoVar, zzfz zzfzVar) {
        zzhl zzhlVar = (zzhl) zzhoVar;
        int iZzh = zzh(bArr, i3, zzfzVar);
        zzhlVar.zzg(zzfzVar.zza);
        while (iZzh < i5) {
            int iZzh2 = zzh(bArr, iZzh, zzfzVar);
            if (i2 != zzfzVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzfzVar);
            zzhlVar.zzg(zzfzVar.zza);
        }
        return iZzh;
    }

    static int zzk(byte[] bArr, int i2, zzfz zzfzVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zzfzVar.zzb = j2;
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
        zzfzVar.zzb = j3;
        return i5;
    }

    static int zzl(Object obj, zzix zzixVar, byte[] bArr, int i2, int i3, int i5, zzfz zzfzVar) throws IOException {
        int i7 = zzfzVar.zze + 1;
        zzfzVar.zze = i7;
        zzo(i7);
        int iZzc = ((zzip) zzixVar).zzc(obj, bArr, i2, i3, i5, zzfzVar);
        zzfzVar.zze--;
        zzfzVar.zzc = obj;
        return iZzc;
    }

    static int zzm(Object obj, zzix zzixVar, byte[] bArr, int i2, int i3, zzfz zzfzVar) throws IOException {
        int iZzi = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            iZzi = zzi(i5, bArr, iZzi, zzfzVar);
            i5 = zzfzVar.zza;
        }
        int i7 = iZzi;
        if (i5 < 0 || i5 > i3 - i7) {
            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i8 = zzfzVar.zze + 1;
        zzfzVar.zze = i8;
        zzo(i8);
        int i9 = i7 + i5;
        zzixVar.zzh(obj, bArr, i7, i9, zzfzVar);
        zzfzVar.zze--;
        zzfzVar.zzc = obj;
        return i9;
    }

    static long zzn(byte[] bArr, int i2) {
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    private static void zzo(int i2) throws zzhr {
        if (i2 >= zzb) {
            throw new zzhr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    static int zza(byte[] bArr, int i2, zzfz zzfzVar) throws zzhr {
        int iZzh = zzh(bArr, i2, zzfzVar);
        int i3 = zzfzVar.zza;
        if (i3 >= 0) {
            if (i3 <= bArr.length - iZzh) {
                if (i3 == 0) {
                    zzfzVar.zzc = zzgk.zzb;
                    return iZzh;
                }
                zzfzVar.zzc = zzgk.zzj(bArr, iZzh, i3);
                return iZzh + i3;
            }
            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static int zzc(zzix zzixVar, byte[] bArr, int i2, int i3, int i5, zzfz zzfzVar) throws IOException {
        Object objZze = zzixVar.zze();
        int iZzl = zzl(objZze, zzixVar, bArr, i2, i3, i5, zzfzVar);
        zzixVar.zzf(objZze);
        zzfzVar.zzc = objZze;
        return iZzl;
    }

    static int zzd(zzix zzixVar, byte[] bArr, int i2, int i3, zzfz zzfzVar) throws IOException {
        Object objZze = zzixVar.zze();
        int iZzm = zzm(objZze, zzixVar, bArr, i2, i3, zzfzVar);
        zzixVar.zzf(objZze);
        zzfzVar.zzc = objZze;
        return iZzm;
    }

    static int zze(zzix zzixVar, int i2, byte[] bArr, int i3, int i5, zzho zzhoVar, zzfz zzfzVar) throws IOException {
        int iZzd = zzd(zzixVar, bArr, i3, i5, zzfzVar);
        zzhoVar.add(zzfzVar.zzc);
        while (iZzd < i5) {
            int iZzh = zzh(bArr, iZzd, zzfzVar);
            if (i2 != zzfzVar.zza) {
                break;
            }
            iZzd = zzd(zzixVar, bArr, iZzh, i5, zzfzVar);
            zzhoVar.add(zzfzVar.zzc);
        }
        return iZzd;
    }
}
