package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzanu extends zzanv {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanv
    final int zza(String str, byte[] bArr, int i2, int i3) {
        int i5;
        int i7;
        char cCharAt;
        int length = str.length();
        int i8 = i3 + i2;
        int i9 = 0;
        while (i9 < length && (i7 = i9 + i2) < i8 && (cCharAt = str.charAt(i9)) < 128) {
            bArr[i7] = (byte) cCharAt;
            i9++;
        }
        if (i9 == length) {
            return i2 + length;
        }
        int i10 = i2 + i9;
        while (i9 < length) {
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 128 && i10 < i8) {
                bArr[i10] = (byte) cCharAt2;
                i10++;
            } else if (cCharAt2 < 2048 && i10 <= i8 - 2) {
                int i11 = i10 + 1;
                bArr[i10] = (byte) ((cCharAt2 >>> 6) | 960);
                i10 += 2;
                bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i10 > i8 - 3) {
                    if (i10 > i8 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                            throw new zzanx(i9, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i10);
                    }
                    int i12 = i9 + 1;
                    if (i12 != str.length()) {
                        char cCharAt3 = str.charAt(i12);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i13 = i10 + 3;
                            bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i10 += 4;
                            bArr[i13] = (byte) ((codePoint & 63) | 128);
                            i9 = i12;
                        } else {
                            i9 = i12;
                        }
                    }
                    throw new zzanx(i9 - 1, length);
                }
                bArr[i10] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i14 = i10 + 2;
                bArr[i10 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i10 += 3;
                bArr[i14] = (byte) ((cCharAt2 & '?') | 128);
            }
            i9++;
        }
        return i10;
    }

    zzanu() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanv
    final int zza(int i2, byte[] bArr, int i3, int i5) {
        while (i3 < i5 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i5) {
            return 0;
        }
        while (i3 < i5) {
            int i7 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i7 >= i5) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i3 += 2;
                        if (bArr[i7] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 >= -16) {
                    if (i7 >= i5 - 2) {
                        return zzant.zza(bArr, i7, i5);
                    }
                    int i8 = i3 + 2;
                    byte b4 = bArr[i7];
                    if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0) {
                        int i9 = i3 + 3;
                        if (bArr[i8] <= -65) {
                            i3 += 4;
                            if (bArr[i9] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i7 >= i5 - 1) {
                    return zzant.zza(bArr, i7, i5);
                }
                int i10 = i3 + 2;
                byte b5 = bArr[i7];
                if (b5 <= -65 && ((b2 != -32 || b5 >= -96) && (b2 != -19 || b5 < -96))) {
                    i3 += 3;
                    if (bArr[i10] > -65) {
                    }
                }
                return -1;
            }
            i3 = i7;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanv
    final String zza(byte[] bArr, int i2, int i3) throws zzalf {
        if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
            int i5 = i2 + i3;
            char[] cArr = new char[i3];
            int i7 = 0;
            while (i2 < i5) {
                byte b2 = bArr[i2];
                if (b2 < 0) {
                    break;
                }
                i2++;
                zzans.zza(b2, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (i2 < i5) {
                int i9 = i2 + 1;
                byte b4 = bArr[i2];
                if (b4 >= 0) {
                    int i10 = i8 + 1;
                    zzans.zza(b4, cArr, i8);
                    int i11 = i9;
                    while (i11 < i5) {
                        byte b5 = bArr[i11];
                        if (b5 < 0) {
                            break;
                        }
                        i11++;
                        zzans.zza(b5, cArr, i10);
                        i10++;
                    }
                    i8 = i10;
                    i2 = i11;
                } else if (b4 < -32) {
                    if (i9 < i5) {
                        i2 += 2;
                        zzans.zza(b4, bArr[i9], cArr, i8);
                        i8++;
                    } else {
                        throw zzalf.zzd();
                    }
                } else if (b4 < -16) {
                    if (i9 < i5 - 1) {
                        int i12 = i2 + 2;
                        i2 += 3;
                        zzans.zza(b4, bArr[i9], bArr[i12], cArr, i8);
                        i8++;
                    } else {
                        throw zzalf.zzd();
                    }
                } else if (i9 < i5 - 2) {
                    byte b6 = bArr[i9];
                    int i13 = i2 + 3;
                    byte b7 = bArr[i2 + 2];
                    i2 += 4;
                    zzans.zza(b4, b6, b7, bArr[i13], cArr, i8);
                    i8 += 2;
                } else {
                    throw zzalf.zzd();
                }
            }
            return new String(cArr, 0, i8);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}
