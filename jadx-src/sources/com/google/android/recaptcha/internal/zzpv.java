package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzpv {
    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i2, int i3) {
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

    static String zzd(byte[] bArr, int i2, int i3) throws zznn {
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
            if (!zzpt.zzd(b2)) {
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
            if (zzpt.zzd(b4)) {
                cArr[i9] = (char) b4;
                i9++;
                i2 = i10;
                while (i2 < i7) {
                    byte b5 = bArr[i2];
                    if (zzpt.zzd(b5)) {
                        i2++;
                        cArr[i9] = (char) b5;
                        i9++;
                    }
                }
            } else {
                if (b4 < -32) {
                    if (i10 >= i7) {
                        throw new zznn("Protocol message had invalid UTF-8.");
                    }
                    i5 = i9 + 1;
                    i2 += 2;
                    zzpt.zzc(b4, bArr[i10], cArr, i9);
                } else if (b4 < -16) {
                    if (i10 >= i7 - 1) {
                        throw new zznn("Protocol message had invalid UTF-8.");
                    }
                    i5 = i9 + 1;
                    int i11 = i2 + 2;
                    i2 += 3;
                    zzpt.zzb(b4, bArr[i10], bArr[i11], cArr, i9);
                } else {
                    if (i10 >= i7 - 2) {
                        throw new zznn("Protocol message had invalid UTF-8.");
                    }
                    byte b6 = bArr[i10];
                    int i12 = i2 + 3;
                    byte b7 = bArr[i2 + 2];
                    i2 += 4;
                    zzpt.zza(b4, b6, b7, bArr[i12], cArr, i9);
                    i9 += 2;
                }
                i9 = i5;
            }
        }
        return new String(cArr, 0, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean zze(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return true;
        }
        while (i2 < i3) {
            int i5 = i2 + 1;
            int iZza = bArr[i2];
            if (iZza >= 0) {
                i2 = i5;
            } else if (iZza < -32) {
                if (i5 >= i3) {
                    return iZza == 0;
                }
                if (iZza < -62) {
                    return false;
                }
                i2 += 2;
                if (bArr[i5] > -65) {
                    return false;
                }
            } else if (iZza < -16) {
                if (i5 >= i3 - 1) {
                    iZza = zza(bArr, i5, i3);
                    if (iZza == 0) {
                    }
                } else {
                    int i7 = i2 + 2;
                    char c2 = bArr[i5];
                    if (c2 > -65) {
                        return false;
                    }
                    if (iZza == -32 && c2 < -96) {
                        return false;
                    }
                    if (iZza == -19 && c2 >= -96) {
                        return false;
                    }
                    i2 += 3;
                    if (bArr[i7] > -65) {
                        return false;
                    }
                }
            } else if (i5 >= i3 - 2) {
                iZza = zza(bArr, i5, i3);
                if (iZza == 0) {
                }
            } else {
                int i8 = i2 + 2;
                int i9 = bArr[i5];
                if (i9 > -65 || (((iZza << 28) + (i9 + 112)) >> 30) != 0) {
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
        if (zzps.zzx() && zzps.zzy()) {
            int i2 = zzks.zza;
        }
    }

    static int zzb(String str, byte[] bArr, int i2, int i3) {
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
                    throw new zzpu(i9 - 1, length);
                }
                if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i7 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i7)))) {
                    throw new zzpu(i9, length);
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i10);
            }
            i9++;
        }
        return i10;
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
                                throw new zzpu(i3, length2);
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
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i5) + 4294967296L));
    }
}
