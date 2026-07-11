package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzor {
    public static final /* synthetic */ int zza = 0;

    static /* synthetic */ int zzd(byte[] bArr, int i2, int i3) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean zza(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return true;
        }
        while (i2 < i3) {
            int i5 = i2 + 1;
            int iZzd = bArr[i2];
            if (iZzd >= 0) {
                i2 = i5;
            } else if (iZzd < -32) {
                if (i5 >= i3) {
                    return iZzd == 0;
                }
                if (iZzd < -62) {
                    return false;
                }
                i2 += 2;
                if (bArr[i5] > -65) {
                    return false;
                }
            } else if (iZzd < -16) {
                if (i5 >= i3 - 1) {
                    iZzd = zzd(bArr, i5, i3);
                    if (iZzd == 0) {
                    }
                } else {
                    int i7 = i2 + 2;
                    char c2 = bArr[i5];
                    if (c2 > -65) {
                        return false;
                    }
                    if (iZzd == -32 && c2 < -96) {
                        return false;
                    }
                    if (iZzd == -19 && c2 >= -96) {
                        return false;
                    }
                    i2 += 3;
                    if (bArr[i7] > -65) {
                        return false;
                    }
                }
            } else if (i5 >= i3 - 2) {
                iZzd = zzd(bArr, i5, i3);
                if (iZzd == 0) {
                }
            } else {
                int i8 = i2 + 2;
                int i9 = bArr[i5];
                if (i9 > -65 || (((iZzd << 28) + (i9 + 112)) >> 30) != 0) {
                    return false;
                }
                int i10 = i2 + 3;
                if (bArr[i8] > -65) {
                    return false;
                }
                i2 += 4;
                if (bArr[i10] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    static {
        if (zzoo.zza() && zzoo.zzb()) {
            int i2 = zzku.zza;
        }
    }

    static int zzb(String str) {
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
                                throw new zzoq(i3, length2);
                            }
                        }
                    }
                    i3++;
                }
                i5 += i2;
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

    static int zzc(String str, byte[] bArr, int i2, int i3) {
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
                    int i11 = i9 + 1;
                    if (i11 != str.length()) {
                        char cCharAt3 = str.charAt(i11);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i12 = i10 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i10 += 4;
                            bArr[i12] = (byte) ((codePoint & 63) | 128);
                            i9 = i11;
                        } else {
                            i9 = i11;
                        }
                    }
                    throw new zzoq(i9 - 1, length);
                }
                if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i7 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i7)))) {
                    throw new zzoq(i9, length);
                }
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt2).length() + 25 + String.valueOf(i10).length());
                sb.append("Failed writing ");
                sb.append(cCharAt2);
                sb.append(" at index ");
                sb.append(i10);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            i9++;
        }
        return i10;
    }
}
