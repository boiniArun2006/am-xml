package com.google.android.gms.internal.measurement;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzkw {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i2, zzkv zzkvVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzb(b2, bArr, i3, zzkvVar);
        }
        zzkvVar.zza = b2;
        return i3;
    }

    static int zzb(int i2, byte[] bArr, int i3, zzkv zzkvVar) {
        byte b2 = bArr[i3];
        int i5 = i3 + 1;
        int i7 = i2 & 127;
        if (b2 >= 0) {
            zzkvVar.zza = i7 | (b2 << 7);
            return i5;
        }
        int i8 = i7 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i9 = i3 + 2;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            zzkvVar.zza = i8 | (b4 << 14);
            return i9;
        }
        int i10 = i8 | ((b4 & ByteCompanionObject.MAX_VALUE) << 14);
        int i11 = i3 + 3;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzkvVar.zza = i10 | (b5 << 21);
            return i11;
        }
        int i12 = i10 | ((b5 & ByteCompanionObject.MAX_VALUE) << 21);
        int i13 = i3 + 4;
        byte b6 = bArr[i11];
        if (b6 >= 0) {
            zzkvVar.zza = i12 | (b6 << 28);
            return i13;
        }
        int i14 = i12 | ((b6 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzkvVar.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int zzc(byte[] bArr, int i2, zzkv zzkvVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zzkvVar.zzb = j2;
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
        zzkvVar.zzb = j3;
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

    static int zzj(Object obj, zznw zznwVar, byte[] bArr, int i2, int i3, zzkv zzkvVar) throws IOException {
        int iZzb = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            iZzb = zzb(i5, bArr, iZzb, zzkvVar);
            i5 = zzkvVar.zza;
        }
        int i7 = iZzb;
        if (i5 < 0 || i5 > i3 - i7) {
            throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i8 = zzkvVar.zze + 1;
        zzkvVar.zze = i8;
        zzq(i8);
        int i9 = i7 + i5;
        zznwVar.zzi(obj, bArr, i7, i9, zzkvVar);
        zzkvVar.zze--;
        zzkvVar.zzc = obj;
        return i9;
    }

    static int zzk(Object obj, zznw zznwVar, byte[] bArr, int i2, int i3, int i5, zzkv zzkvVar) throws IOException {
        int i7 = zzkvVar.zze + 1;
        zzkvVar.zze = i7;
        zzq(i7);
        int iZzh = ((zzno) zznwVar).zzh(obj, bArr, i2, i3, i5, zzkvVar);
        zzkvVar.zze--;
        zzkvVar.zzc = obj;
        return iZzh;
    }

    static int zzl(int i2, byte[] bArr, int i3, int i5, zzmn zzmnVar, zzkv zzkvVar) {
        zzmf zzmfVar = (zzmf) zzmnVar;
        int iZza = zza(bArr, i3, zzkvVar);
        zzmfVar.zzh(zzkvVar.zza);
        while (iZza < i5) {
            int iZza2 = zza(bArr, iZza, zzkvVar);
            if (i2 != zzkvVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzkvVar);
            zzmfVar.zzh(zzkvVar.zza);
        }
        return iZza;
    }

    static int zzm(byte[] bArr, int i2, zzmn zzmnVar, zzkv zzkvVar) throws IOException {
        zzmf zzmfVar = (zzmf) zzmnVar;
        int iZza = zza(bArr, i2, zzkvVar);
        int i3 = zzkvVar.zza + iZza;
        while (iZza < i3) {
            iZza = zza(bArr, iZza, zzkvVar);
            zzmfVar.zzh(zzkvVar.zza);
        }
        if (iZza == i3) {
            return iZza;
        }
        throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzo(int i2, byte[] bArr, int i3, int i5, zzoi zzoiVar, zzkv zzkvVar) throws zzmq {
        if ((i2 >>> 3) == 0) {
            throw new zzmq("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            int iZzc = zzc(bArr, i3, zzkvVar);
            zzoiVar.zzk(i2, Long.valueOf(zzkvVar.zzb));
            return iZzc;
        }
        if (i7 == 1) {
            zzoiVar.zzk(i2, Long.valueOf(zze(bArr, i3)));
            return i3 + 8;
        }
        if (i7 == 2) {
            int iZza = zza(bArr, i3, zzkvVar);
            int i8 = zzkvVar.zza;
            if (i8 < 0) {
                throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 > bArr.length - iZza) {
                throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i8 == 0) {
                zzoiVar.zzk(i2, zzlg.zzb);
            } else {
                zzoiVar.zzk(i2, zzlg.zzh(bArr, iZza, i8));
            }
            return iZza + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new zzmq("Protocol message contained an invalid tag (zero).");
            }
            zzoiVar.zzk(i2, Integer.valueOf(zzd(bArr, i3)));
            return i3 + 4;
        }
        int i9 = (i2 & (-8)) | 4;
        zzoi zzoiVarZzb = zzoi.zzb();
        int i10 = zzkvVar.zze + 1;
        zzkvVar.zze = i10;
        zzq(i10);
        int i11 = 0;
        while (true) {
            if (i3 >= i5) {
                break;
            }
            int iZza2 = zza(bArr, i3, zzkvVar);
            int i12 = zzkvVar.zza;
            if (i12 == i9) {
                i11 = i12;
                i3 = iZza2;
                break;
            }
            i3 = zzo(i12, bArr, iZza2, i5, zzoiVarZzb, zzkvVar);
            i11 = i12;
        }
        zzkvVar.zze--;
        if (i3 > i5 || i11 != i9) {
            throw new zzmq("Failed to parse the message.");
        }
        zzoiVar.zzk(i2, zzoiVarZzb);
        return i3;
    }

    static int zzp(int i2, byte[] bArr, int i3, int i5, zzkv zzkvVar) throws zzmq {
        if ((i2 >>> 3) == 0) {
            throw new zzmq("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return zzc(bArr, i3, zzkvVar);
        }
        if (i7 == 1) {
            return i3 + 8;
        }
        if (i7 == 2) {
            return zza(bArr, i3, zzkvVar) + zzkvVar.zza;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                return i3 + 4;
            }
            throw new zzmq("Protocol message contained an invalid tag (zero).");
        }
        int i8 = (i2 & (-8)) | 4;
        int i9 = 0;
        while (i3 < i5) {
            i3 = zza(bArr, i3, zzkvVar);
            i9 = zzkvVar.zza;
            if (i9 == i8) {
                break;
            }
            i3 = zzp(i9, bArr, i3, i5, zzkvVar);
        }
        if (i3 > i5 || i9 != i8) {
            throw new zzmq("Failed to parse the message.");
        }
        return i3;
    }

    private static void zzq(int i2) throws zzmq {
        if (i2 >= zzb) {
            throw new zzmq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    static int zzf(byte[] bArr, int i2, zzkv zzkvVar) throws zzmq {
        int i3;
        int iZza = zza(bArr, i2, zzkvVar);
        int i5 = zzkvVar.zza;
        if (i5 >= 0) {
            if (i5 == 0) {
                zzkvVar.zzc = "";
                return iZza;
            }
            int i7 = zzor.zza;
            int length = bArr.length;
            if ((((length - iZza) - i5) | iZza | i5) >= 0) {
                int i8 = iZza + i5;
                char[] cArr = new char[i5];
                int i9 = 0;
                while (iZza < i8) {
                    byte b2 = bArr[iZza];
                    if (!zzop.zza(b2)) {
                        break;
                    }
                    iZza++;
                    cArr[i9] = (char) b2;
                    i9++;
                }
                int i10 = i9;
                while (iZza < i8) {
                    int i11 = iZza + 1;
                    byte b4 = bArr[iZza];
                    if (zzop.zza(b4)) {
                        cArr[i10] = (char) b4;
                        i10++;
                        iZza = i11;
                        while (iZza < i8) {
                            byte b5 = bArr[iZza];
                            if (zzop.zza(b5)) {
                                iZza++;
                                cArr[i10] = (char) b5;
                                i10++;
                            }
                        }
                    } else {
                        if (b4 < -32) {
                            if (i11 < i8) {
                                i3 = i10 + 1;
                                iZza += 2;
                                zzop.zzb(b4, bArr[i11], cArr, i10);
                            } else {
                                throw new zzmq("Protocol message had invalid UTF-8.");
                            }
                        } else if (b4 < -16) {
                            if (i11 < i8 - 1) {
                                i3 = i10 + 1;
                                int i12 = iZza + 2;
                                iZza += 3;
                                zzop.zzc(b4, bArr[i11], bArr[i12], cArr, i10);
                            } else {
                                throw new zzmq("Protocol message had invalid UTF-8.");
                            }
                        } else if (i11 < i8 - 2) {
                            byte b6 = bArr[i11];
                            int i13 = iZza + 3;
                            byte b7 = bArr[iZza + 2];
                            iZza += 4;
                            zzop.zzd(b4, b6, b7, bArr[i13], cArr, i10);
                            i10 += 2;
                        } else {
                            throw new zzmq("Protocol message had invalid UTF-8.");
                        }
                        i10 = i3;
                    }
                }
                zzkvVar.zzc = new String(cArr, 0, i10);
                return i8;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZza), Integer.valueOf(i5)));
        }
        throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static int zzg(byte[] bArr, int i2, zzkv zzkvVar) throws zzmq {
        int iZza = zza(bArr, i2, zzkvVar);
        int i3 = zzkvVar.zza;
        if (i3 >= 0) {
            if (i3 <= bArr.length - iZza) {
                if (i3 == 0) {
                    zzkvVar.zzc = zzlg.zzb;
                    return iZza;
                }
                zzkvVar.zzc = zzlg.zzh(bArr, iZza, i3);
                return iZza + i3;
            }
            throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static int zzh(zznw zznwVar, byte[] bArr, int i2, int i3, zzkv zzkvVar) throws IOException {
        Object objZza = zznwVar.zza();
        int iZzj = zzj(objZza, zznwVar, bArr, i2, i3, zzkvVar);
        zznwVar.zzj(objZza);
        zzkvVar.zzc = objZza;
        return iZzj;
    }

    static int zzi(zznw zznwVar, byte[] bArr, int i2, int i3, int i5, zzkv zzkvVar) throws IOException {
        Object objZza = zznwVar.zza();
        int iZzk = zzk(objZza, zznwVar, bArr, i2, i3, i5, zzkvVar);
        zznwVar.zzj(objZza);
        zzkvVar.zzc = objZza;
        return iZzk;
    }

    static int zzn(zznw zznwVar, int i2, byte[] bArr, int i3, int i5, zzmn zzmnVar, zzkv zzkvVar) throws IOException {
        int iZzh = zzh(zznwVar, bArr, i3, i5, zzkvVar);
        zzmnVar.add(zzkvVar.zzc);
        while (iZzh < i5) {
            int iZza = zza(bArr, iZzh, zzkvVar);
            if (i2 != zzkvVar.zza) {
                break;
            }
            iZzh = zzh(zznwVar, bArr, iZza, i5, zzkvVar);
            zzmnVar.add(zzkvVar.zzc);
        }
        return iZzh;
    }
}
