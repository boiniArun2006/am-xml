package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzier {
    private static final zzieo zza;

    static String zze(byte[] bArr, int i2, int i3) throws zzicg {
        int i5;
        int length = bArr.length;
        if ((((length - i2) - i3) | i2 | i3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i7 = i2 + i3;
        char[] cArr = new char[i3];
        int i8 = 0;
        while (i2 < i7) {
            byte b2 = bArr[i2];
            if (!zzien.zza(b2)) {
                break;
            }
            i2++;
            cArr[i8] = (char) b2;
            i8++;
        }
        int i9 = i8;
        while (i2 < i7) {
            int i10 = i2 + 1;
            byte b4 = bArr[i2];
            if (zzien.zza(b4)) {
                cArr[i9] = (char) b4;
                i9++;
                i2 = i10;
                while (i2 < i7) {
                    byte b5 = bArr[i2];
                    if (zzien.zza(b5)) {
                        i2++;
                        cArr[i9] = (char) b5;
                        i9++;
                    }
                }
            } else {
                if (b4 < -32) {
                    if (i10 >= i7) {
                        throw new zzicg("Protocol message had invalid UTF-8.");
                    }
                    i5 = i9 + 1;
                    i2 += 2;
                    zzien.zzb(b4, bArr[i10], cArr, i9);
                } else if (b4 < -16) {
                    if (i10 >= i7 - 1) {
                        throw new zzicg("Protocol message had invalid UTF-8.");
                    }
                    i5 = i9 + 1;
                    int i11 = i2 + 2;
                    i2 += 3;
                    zzien.zzc(b4, bArr[i10], bArr[i11], cArr, i9);
                } else {
                    if (i10 >= i7 - 2) {
                        throw new zzicg("Protocol message had invalid UTF-8.");
                    }
                    byte b6 = bArr[i10];
                    int i12 = i2 + 3;
                    byte b7 = bArr[i2 + 2];
                    i2 += 4;
                    zzien.zzd(b4, b6, b7, bArr[i12], cArr, i9);
                    i9 += 2;
                }
                i9 = i5;
            }
        }
        return new String(cArr, 0, i9);
    }

    static /* synthetic */ int zzf(byte[] bArr, int i2, int i3) {
        int i5 = i3 - i2;
        byte b2 = bArr[i2 - 1];
        if (i5 == 0) {
            if (b2 <= -12) {
                return b2;
            }
            return -1;
        }
        if (i5 == 1) {
            byte b4 = bArr[i2];
            if (b2 > -12 || b4 > -65) {
                return -1;
            }
            return (b4 << 8) ^ b2;
        }
        if (i5 != 2) {
            throw new AssertionError();
        }
        byte b5 = bArr[i2];
        byte b6 = bArr[i2 + 1];
        if (b2 > -12 || b5 > -65 || b6 > -65) {
            return -1;
        }
        return (b6 << 16) ^ ((b5 << 8) ^ b2);
    }

    static {
        if (System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") == null) {
            if (zziem.zza() && zziem.zzb()) {
                int i2 = zziaa.zza;
            }
        }
        zza = new zziep();
    }

    static boolean zza(byte[] bArr) {
        return zza.zza(bArr, 0, bArr.length);
    }

    static boolean zzb(byte[] bArr, int i2, int i3) {
        return zza.zza(bArr, i2, i3);
    }

    static int zzc(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i5 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt < 2048) {
                i5 += (127 - cCharAt) >>> 31;
                i3++;
            } else {
                try {
                    int length2 = str.length();
                    while (i3 < length2) {
                        char cCharAt2 = str.charAt(i3);
                        if (cCharAt2 < 2048) {
                            i2 += (127 - cCharAt2) >>> 31;
                        } else {
                            i2 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i3) >= 65536) {
                                    i3++;
                                } else {
                                    throw new zzieq(i3, length2);
                                }
                            }
                        }
                        i3++;
                    }
                    i5 += i2;
                } catch (zzieq unused) {
                    return str.getBytes(zzice.zza).length;
                }
            }
        }
        if (i5 >= length) {
            return i5;
        }
        long j2 = ((long) i5) + 4294967296L;
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 34);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    static int zzd(String str, byte[] bArr, int i2, int i3) {
        int i5;
        int i7;
        int i8;
        char cCharAt;
        int length = str.length();
        int i9 = 0;
        while (true) {
            i5 = i2 + i3;
            if (i9 >= length || (i8 = i9 + i2) >= i5 || (cCharAt = str.charAt(i9)) >= 128) {
                break;
            }
            bArr[i8] = (byte) cCharAt;
            i9++;
        }
        if (i9 == length) {
            return i2 + length;
        }
        int i10 = i2 + i9;
        while (i9 < length) {
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 128 && i10 < i5) {
                bArr[i10] = (byte) cCharAt2;
                i10++;
            } else if (cCharAt2 < 2048 && i10 <= i5 - 2) {
                bArr[i10] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i10 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i10 += 2;
            } else if ((cCharAt2 < 55296 || cCharAt2 > 57343) && i10 <= i5 - 3) {
                bArr[i10] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i10 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i10 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i10 += 3;
            } else {
                if (i10 <= i5 - 4) {
                    i9++;
                    if (i9 != str.length()) {
                        char cCharAt3 = str.charAt(i9);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i11 = i10 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i10 += 4;
                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    return zzieo.zzc(str, bArr, i2, i3);
                }
                if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i7 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i7)))) {
                    return zzieo.zzc(str, bArr, i2, i3);
                }
                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
            }
            i9++;
        }
        return i10;
    }
}
