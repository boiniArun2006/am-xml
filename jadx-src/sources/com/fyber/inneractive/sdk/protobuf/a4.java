package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class a4 extends z3 {
    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String a(byte[] bArr, int i2, int i3) throws n1 {
        if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i5 = i2 + i3;
        char[] cArr = new char[i3];
        int i7 = 0;
        while (i2 < i5) {
            byte b2 = bArr[i2];
            if (!y3.a(b2)) {
                break;
            }
            i2++;
            cArr[i7] = (char) b2;
            i7++;
        }
        int i8 = i7;
        while (i2 < i5) {
            int i9 = i2 + 1;
            byte b4 = bArr[i2];
            if (y3.a(b4)) {
                cArr[i8] = (char) b4;
                i8++;
                i2 = i9;
                while (i2 < i5) {
                    byte b5 = bArr[i2];
                    if (!y3.a(b5)) {
                        break;
                    }
                    i2++;
                    cArr[i8] = (char) b5;
                    i8++;
                }
            } else if (b4 < -32) {
                if (i9 >= i5) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                i2 += 2;
                y3.a(b4, bArr[i9], cArr, i8);
                i8++;
            } else if (b4 < -16) {
                if (i9 >= i5 - 1) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                int i10 = i2 + 2;
                i2 += 3;
                y3.a(b4, bArr[i9], bArr[i10], cArr, i8);
                i8++;
            } else {
                if (i9 >= i5 - 2) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                byte b6 = bArr[i9];
                int i11 = i2 + 3;
                byte b7 = bArr[i2 + 2];
                i2 += 4;
                y3.a(b4, b6, b7, bArr[i11], cArr, i8);
                i8 += 2;
            }
        }
        return new String(cArr, 0, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0098 A[RETURN] */
    @Override // com.fyber.inneractive.sdk.protobuf.z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i5 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                i2 = i5;
            } else {
                if (b2 < -32) {
                    if (i5 >= i3) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i2 += 2;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    if (i5 >= i3 - 1) {
                        int i7 = i3 - i5;
                        if (i7 == 0) {
                            if (b2 > -12) {
                                return -1;
                            }
                            return b2;
                        }
                        if (i7 == 1) {
                            return d4.a(b2, bArr[i5]);
                        }
                        if (i7 == 2) {
                            return d4.a(b2, bArr[i5], bArr[i2 + 2]);
                        }
                        throw new AssertionError();
                    }
                    int i8 = i2 + 2;
                    byte b4 = bArr[i5];
                    if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                        i2 += 3;
                        if (bArr[i8] > -65) {
                        }
                    }
                    return -1;
                }
                if (i5 < i3 - 2) {
                    int i9 = i2 + 2;
                    byte b5 = bArr[i5];
                    if (b5 <= -65) {
                        if ((((b5 + 112) + (b2 << 28)) >> 30) == 0) {
                            int i10 = i2 + 3;
                            if (bArr[i9] <= -65) {
                                i2 += 4;
                                if (bArr[i10] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                int i11 = i3 - i5;
                if (i11 != 0) {
                    if (i11 == 1) {
                        return d4.a(b2, bArr[i5]);
                    }
                    if (i11 == 2) {
                        return d4.a(b2, bArr[i5], bArr[i2 + 2]);
                    }
                    throw new AssertionError();
                }
                if (b2 > -12) {
                }
            }
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String b(ByteBuffer byteBuffer, int i2, int i3) {
        return z3.a(byteBuffer, i2, i3);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int a(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        int i5;
        int i7;
        char cCharAt;
        int length = charSequence.length();
        int i8 = i3 + i2;
        int i9 = 0;
        while (i9 < length && (i7 = i9 + i2) < i8 && (cCharAt = charSequence.charAt(i9)) < 128) {
            bArr[i7] = (byte) cCharAt;
            i9++;
        }
        if (i9 == length) {
            return i2 + length;
        }
        int i10 = i2 + i9;
        while (i9 < length) {
            char cCharAt2 = charSequence.charAt(i9);
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
                    if (i10 <= i8 - 4) {
                        int i12 = i9 + 1;
                        if (i12 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i12);
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
                        throw new b4(i9 - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i9 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i5)))) {
                        throw new b4(i9, length);
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i10);
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
}
