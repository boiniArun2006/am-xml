package com.google.android.recaptcha.internal;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzku {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zzb(byte[] bArr, int i2) {
        int i3 = bArr[i2] & UByte.MAX_VALUE;
        int i5 = bArr[i2 + 1] & UByte.MAX_VALUE;
        int i7 = bArr[i2 + 2] & UByte.MAX_VALUE;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    static int zzf(byte[] bArr, int i2, zznk zznkVar, zzkt zzktVar) throws IOException {
        zzne zzneVar = (zzne) zznkVar;
        int iZzi = zzi(bArr, i2, zzktVar);
        int i3 = zzktVar.zza + iZzi;
        while (iZzi < i3) {
            iZzi = zzi(bArr, iZzi, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        if (iZzi == i3) {
            return iZzi;
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzh(int i2, byte[] bArr, int i3, int i5, zzpm zzpmVar, zzkt zzktVar) throws zznn {
        if ((i2 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            int iZzl = zzl(bArr, i3, zzktVar);
            zzpmVar.zzj(i2, Long.valueOf(zzktVar.zzb));
            return iZzl;
        }
        if (i7 == 1) {
            zzpmVar.zzj(i2, Long.valueOf(zzp(bArr, i3)));
            return i3 + 8;
        }
        if (i7 == 2) {
            int iZzi = zzi(bArr, i3, zzktVar);
            int i8 = zzktVar.zza;
            if (i8 < 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 > bArr.length - iZzi) {
                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i8 == 0) {
                zzpmVar.zzj(i2, zzle.zzb);
            } else {
                zzpmVar.zzj(i2, zzle.zzk(bArr, iZzi, i8));
            }
            return iZzi + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new zznn("Protocol message contained an invalid tag (zero).");
            }
            zzpmVar.zzj(i2, Integer.valueOf(zzb(bArr, i3)));
            return i3 + 4;
        }
        int i9 = (i2 & (-8)) | 4;
        zzpm zzpmVarZzf = zzpm.zzf();
        int i10 = zzktVar.zze + 1;
        zzktVar.zze = i10;
        zzq(i10);
        int i11 = 0;
        while (true) {
            if (i3 >= i5) {
                break;
            }
            int iZzi2 = zzi(bArr, i3, zzktVar);
            int i12 = zzktVar.zza;
            if (i12 == i9) {
                i11 = i12;
                i3 = iZzi2;
                break;
            }
            i3 = zzh(i12, bArr, iZzi2, i5, zzpmVarZzf, zzktVar);
            i11 = i12;
        }
        zzktVar.zze--;
        if (i3 > i5 || i11 != i9) {
            throw new zznn("Failed to parse the message.");
        }
        zzpmVar.zzj(i2, zzpmVarZzf);
        return i3;
    }

    static int zzi(byte[] bArr, int i2, zzkt zzktVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzj(b2, bArr, i3, zzktVar);
        }
        zzktVar.zza = b2;
        return i3;
    }

    static int zzj(int i2, byte[] bArr, int i3, zzkt zzktVar) {
        byte b2 = bArr[i3];
        int i5 = i3 + 1;
        int i7 = i2 & 127;
        if (b2 >= 0) {
            zzktVar.zza = i7 | (b2 << 7);
            return i5;
        }
        int i8 = i7 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i9 = i3 + 2;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            zzktVar.zza = i8 | (b4 << 14);
            return i9;
        }
        int i10 = i8 | ((b4 & ByteCompanionObject.MAX_VALUE) << 14);
        int i11 = i3 + 3;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzktVar.zza = i10 | (b5 << 21);
            return i11;
        }
        int i12 = i10 | ((b5 & ByteCompanionObject.MAX_VALUE) << 21);
        int i13 = i3 + 4;
        byte b6 = bArr[i11];
        if (b6 >= 0) {
            zzktVar.zza = i12 | (b6 << 28);
            return i13;
        }
        int i14 = i12 | ((b6 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzktVar.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int zzk(int i2, byte[] bArr, int i3, int i5, zznk zznkVar, zzkt zzktVar) {
        zzne zzneVar = (zzne) zznkVar;
        int iZzi = zzi(bArr, i3, zzktVar);
        zzneVar.zzh(zzktVar.zza);
        while (iZzi < i5) {
            int iZzi2 = zzi(bArr, iZzi, zzktVar);
            if (i2 != zzktVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        return iZzi;
    }

    static int zzl(byte[] bArr, int i2, zzkt zzktVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zzktVar.zzb = j2;
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
        zzktVar.zzb = j3;
        return i5;
    }

    static int zzm(Object obj, zzow zzowVar, byte[] bArr, int i2, int i3, int i5, zzkt zzktVar) throws IOException {
        int i7 = zzktVar.zze + 1;
        zzktVar.zze = i7;
        zzq(i7);
        int iZzc = ((zzol) zzowVar).zzc(obj, bArr, i2, i3, i5, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return iZzc;
    }

    static int zzn(Object obj, zzow zzowVar, byte[] bArr, int i2, int i3, zzkt zzktVar) throws IOException {
        int iZzj = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            iZzj = zzj(i5, bArr, iZzj, zzktVar);
            i5 = zzktVar.zza;
        }
        int i7 = iZzj;
        if (i5 < 0 || i5 > i3 - i7) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i8 = zzktVar.zze + 1;
        zzktVar.zze = i8;
        zzq(i8);
        int i9 = i7 + i5;
        zzowVar.zzi(obj, bArr, i7, i9, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return i9;
    }

    static int zzo(int i2, byte[] bArr, int i3, int i5, zzkt zzktVar) throws zznn {
        if ((i2 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return zzl(bArr, i3, zzktVar);
        }
        if (i7 == 1) {
            return i3 + 8;
        }
        if (i7 == 2) {
            return zzi(bArr, i3, zzktVar) + zzktVar.zza;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                return i3 + 4;
            }
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i8 = (i2 & (-8)) | 4;
        int i9 = 0;
        while (i3 < i5) {
            i3 = zzi(bArr, i3, zzktVar);
            i9 = zzktVar.zza;
            if (i9 == i8) {
                break;
            }
            i3 = zzo(i9, bArr, i3, i5, zzktVar);
        }
        if (i3 > i5 || i9 != i8) {
            throw new zznn("Failed to parse the message.");
        }
        return i3;
    }

    static long zzp(byte[] bArr, int i2) {
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    private static void zzq(int i2) throws zznn {
        if (i2 >= zzb) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    static int zza(byte[] bArr, int i2, zzkt zzktVar) throws zznn {
        int iZzi = zzi(bArr, i2, zzktVar);
        int i3 = zzktVar.zza;
        if (i3 >= 0) {
            if (i3 <= bArr.length - iZzi) {
                if (i3 == 0) {
                    zzktVar.zzc = zzle.zzb;
                    return iZzi;
                }
                zzktVar.zzc = zzle.zzk(bArr, iZzi, i3);
                return iZzi + i3;
            }
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static int zzc(zzow zzowVar, byte[] bArr, int i2, int i3, int i5, zzkt zzktVar) throws IOException {
        Object objZze = zzowVar.zze();
        int iZzm = zzm(objZze, zzowVar, bArr, i2, i3, i5, zzktVar);
        zzowVar.zzf(objZze);
        zzktVar.zzc = objZze;
        return iZzm;
    }

    static int zzd(zzow zzowVar, byte[] bArr, int i2, int i3, zzkt zzktVar) throws IOException {
        Object objZze = zzowVar.zze();
        int iZzn = zzn(objZze, zzowVar, bArr, i2, i3, zzktVar);
        zzowVar.zzf(objZze);
        zzktVar.zzc = objZze;
        return iZzn;
    }

    static int zze(zzow zzowVar, int i2, byte[] bArr, int i3, int i5, zznk zznkVar, zzkt zzktVar) throws IOException {
        int iZzd = zzd(zzowVar, bArr, i3, i5, zzktVar);
        zznkVar.add(zzktVar.zzc);
        while (iZzd < i5) {
            int iZzi = zzi(bArr, iZzd, zzktVar);
            if (i2 != zzktVar.zza) {
                break;
            }
            iZzd = zzd(zzowVar, bArr, iZzi, i5, zzktVar);
            zznkVar.add(zzktVar.zzc);
        }
        return iZzd;
    }

    static int zzg(byte[] bArr, int i2, zzkt zzktVar) throws zznn {
        int iZzi = zzi(bArr, i2, zzktVar);
        int i3 = zzktVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzktVar.zzc = "";
                return iZzi;
            }
            zzktVar.zzc = new String(bArr, iZzi, i3, zznl.zza);
            return iZzi + i3;
        }
        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
