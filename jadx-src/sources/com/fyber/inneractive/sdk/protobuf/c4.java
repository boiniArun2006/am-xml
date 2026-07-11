package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class c4 extends z3 {
    public static int a(byte[] bArr, int i2, long j2, int i3) {
        if (i3 == 0) {
            z3 z3Var = d4.f56549a;
            if (i2 > -12) {
                return -1;
            }
            return i2;
        }
        if (i3 == 1) {
            return d4.a(i2, x3.f56720c.b(bArr, x3.f56723f + j2));
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        w3 w3Var = x3.f56720c;
        long j3 = x3.f56723f;
        return d4.a(i2, w3Var.b(bArr, j3 + j2), w3Var.b(bArr, j2 + 1 + j3));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String b(ByteBuffer byteBuffer, int i2, int i3) throws n1 {
        long j2;
        if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        long j3 = x3.f56720c.f56706a.getLong(byteBuffer, x3.f56724g) + ((long) i2);
        long j4 = ((long) i3) + j3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (true) {
            j2 = 1;
            if (j3 >= j4) {
                break;
            }
            byte bA2 = x3.f56720c.a(j3);
            if (!y3.a(bA2)) {
                break;
            }
            j3++;
            cArr[i5] = (char) bA2;
            i5++;
        }
        int i7 = i5;
        while (j3 < j4) {
            long j5 = j3 + j2;
            w3 w3Var = x3.f56720c;
            byte bA3 = w3Var.a(j3);
            if (y3.a(bA3)) {
                cArr[i7] = (char) bA3;
                i7++;
                j3 = j5;
                while (j3 < j4) {
                    byte bA4 = x3.f56720c.a(j3);
                    if (!y3.a(bA4)) {
                        break;
                    }
                    j3 += j2;
                    cArr[i7] = (char) bA4;
                    i7++;
                }
            } else if (bA3 < -32) {
                if (j5 >= j4) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                j3 += 2;
                y3.a(bA3, w3Var.a(j5), cArr, i7);
                i7++;
            } else if (bA3 < -16) {
                if (j5 >= j4 - j2) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                long j6 = j3 + 2;
                j3 += 3;
                y3.a(bA3, w3Var.a(j5), w3Var.a(j6), cArr, i7);
                i7++;
            } else {
                if (j5 >= j4 - 2) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                byte bA5 = w3Var.a(j5);
                long j7 = j3 + 3;
                byte bA6 = w3Var.a(j3 + 2);
                j3 += 4;
                y3.a(bA3, bA5, bA6, w3Var.a(j7), cArr, i7);
                i7 += 2;
                j2 = 1;
            }
        }
        return new String(cArr, 0, i7);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int c(byte[] bArr, int i2, int i3) {
        int i5;
        long j2;
        if ((i2 | i3 | (bArr.length - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        long j3 = i2;
        int i7 = (int) (((long) i3) - j3);
        byte b2 = 0;
        long j4 = 1;
        if (i7 >= 16) {
            long j5 = j3;
            i5 = 0;
            while (true) {
                if (i5 >= i7) {
                    i5 = i7;
                    break;
                }
                long j6 = j5 + 1;
                if (x3.f56720c.b(bArr, x3.f56723f + j5) < 0) {
                    break;
                }
                i5++;
                j5 = j6;
            }
        } else {
            i5 = 0;
        }
        int i8 = i7 - i5;
        long j7 = j3 + ((long) i5);
        while (true) {
            byte b4 = b2;
            while (true) {
                if (i8 <= 0) {
                    break;
                }
                long j9 = j7 + j4;
                b4 = x3.f56720c.b(bArr, x3.f56723f + j7);
                if (b4 < 0) {
                    j7 = j9;
                    break;
                }
                i8--;
                j7 = j9;
            }
            if (i8 == 0) {
                return b2;
            }
            int i9 = i8 - 1;
            if (b4 >= -32) {
                if (b4 >= -16) {
                    j2 = j4;
                    if (i9 < 3) {
                        return a(bArr, b4, j7, i9);
                    }
                    i8 -= 4;
                    long j10 = j7 + j2;
                    w3 w3Var = x3.f56720c;
                    long j11 = x3.f56723f;
                    byte b5 = w3Var.b(bArr, j11 + j7);
                    if (b5 > -65) {
                        return -1;
                    }
                    if ((((b5 + 112) + (b4 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    long j12 = 2 + j7;
                    if (w3Var.b(bArr, j10 + j11) > -65) {
                        return -1;
                    }
                    j7 += 3;
                    if (w3Var.b(bArr, j11 + j12) > -65) {
                        return -1;
                    }
                } else {
                    if (i9 < 2) {
                        return a(bArr, b4, j7, i9);
                    }
                    i8 -= 3;
                    long j13 = j7 + j4;
                    w3 w3Var2 = x3.f56720c;
                    long j14 = x3.f56723f;
                    j2 = j4;
                    byte b6 = w3Var2.b(bArr, j14 + j7);
                    if (b6 > -65) {
                        return -1;
                    }
                    if (b4 == -32 && b6 < -96) {
                        return -1;
                    }
                    if (b4 == -19 && b6 >= -96) {
                        return -1;
                    }
                    j7 += 2;
                    if (w3Var2.b(bArr, j14 + j13) > -65) {
                        return -1;
                    }
                }
                j4 = j2;
                b2 = 0;
            } else {
                if (i9 == 0) {
                    return b4;
                }
                i8 -= 2;
                if (b4 < -62) {
                    return -1;
                }
                long j15 = j7 + j4;
                if (x3.f56720c.b(bArr, x3.f56723f + j7) > -65) {
                    return -1;
                }
                j7 = j15;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String a(byte[] bArr, int i2, int i3) throws n1 {
        if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
            int i5 = i2 + i3;
            char[] cArr = new char[i3];
            int i7 = i2;
            int i8 = 0;
            while (i7 < i5) {
                byte b2 = x3.f56720c.b(bArr, x3.f56723f + ((long) i7));
                if (!y3.a(b2)) {
                    break;
                }
                i7++;
                cArr[i8] = (char) b2;
                i8++;
            }
            int i9 = i8;
            while (i7 < i5) {
                int i10 = i7 + 1;
                w3 w3Var = x3.f56720c;
                long j2 = x3.f56723f;
                byte b4 = w3Var.b(bArr, ((long) i7) + j2);
                if (y3.a(b4)) {
                    cArr[i9] = (char) b4;
                    i9++;
                    i7 = i10;
                    while (i7 < i5) {
                        byte b5 = x3.f56720c.b(bArr, x3.f56723f + ((long) i7));
                        if (!y3.a(b5)) {
                            break;
                        }
                        i7++;
                        cArr[i9] = (char) b5;
                        i9++;
                    }
                } else if (b4 < -32) {
                    if (i10 < i5) {
                        i7 += 2;
                        y3.a(b4, w3Var.b(bArr, j2 + ((long) i10)), cArr, i9);
                        i9++;
                    } else {
                        throw new n1("Protocol message had invalid UTF-8.");
                    }
                } else if (b4 < -16) {
                    if (i10 < i5 - 1) {
                        int i11 = i7 + 2;
                        i7 += 3;
                        y3.a(b4, w3Var.b(bArr, ((long) i10) + j2), w3Var.b(bArr, j2 + ((long) i11)), cArr, i9);
                        i9++;
                    } else {
                        throw new n1("Protocol message had invalid UTF-8.");
                    }
                } else if (i10 < i5 - 2) {
                    y3.a(b4, w3Var.b(bArr, ((long) i10) + j2), w3Var.b(bArr, ((long) (i7 + 2)) + j2), w3Var.b(bArr, j2 + ((long) (i7 + 3))), cArr, i9);
                    i9 += 2;
                    i7 += 4;
                } else {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
            }
            return new String(cArr, 0, i9);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int a(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        long j2;
        char c2;
        long j3;
        long j4;
        int i5;
        char c4;
        char cCharAt;
        long j5 = i2;
        long j6 = ((long) i3) + j5;
        int length = charSequence.length();
        if (length > i3 || bArr.length - i3 < i2) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i2 + i3));
        }
        int i7 = 0;
        while (true) {
            j2 = 1;
            c2 = 128;
            if (i7 >= length || (cCharAt = charSequence.charAt(i7)) >= 128) {
                break;
            }
            x3.f56720c.a((Object) bArr, x3.f56723f + j5, (byte) cCharAt);
            i7++;
            j5 = 1 + j5;
        }
        if (i7 == length) {
            return (int) j5;
        }
        while (i7 < length) {
            char cCharAt2 = charSequence.charAt(i7);
            if (cCharAt2 >= c2 || j5 >= j6) {
                j3 = j2;
                if (cCharAt2 >= 2048 || j5 > j6 - 2) {
                    long j7 = j5;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j7 > j6 - 3) {
                        if (j7 <= j6 - 4) {
                            int i8 = i7 + 1;
                            if (i8 != length) {
                                char cCharAt3 = charSequence.charAt(i8);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    w3 w3Var = x3.f56720c;
                                    long j9 = x3.f56723f;
                                    w3Var.a((Object) bArr, j9 + j7, (byte) ((codePoint >>> 18) | 240));
                                    c4 = 128;
                                    w3Var.a((Object) bArr, j9 + j7 + j3, (byte) (((codePoint >>> 12) & 63) | 128));
                                    w3Var.a((Object) bArr, j9 + j7 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    w3Var.a((Object) bArr, j9 + j7 + 3, (byte) ((codePoint & 63) | 128));
                                    i7 = i8;
                                    j5 = j7 + 4;
                                    i7++;
                                    j2 = j3;
                                    c2 = c4;
                                } else {
                                    i7 = i8;
                                }
                            }
                            throw new b4(i7 - 1, length);
                        }
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i7 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i5)))) {
                            throw new b4(i7, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j7);
                    }
                    w3 w3Var2 = x3.f56720c;
                    long j10 = x3.f56723f;
                    w3Var2.a((Object) bArr, j10 + j7, (byte) ((cCharAt2 >>> '\f') | 480));
                    w3Var2.a((Object) bArr, j10 + j7 + j3, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    w3Var2.a((Object) bArr, j10 + j7 + 2, (byte) ((cCharAt2 & '?') | 128));
                    j4 = j7 + 3;
                } else {
                    long j11 = j5 + j3;
                    w3 w3Var3 = x3.f56720c;
                    long j12 = x3.f56723f;
                    long j13 = j5;
                    w3Var3.a((Object) bArr, j12 + j13, (byte) ((cCharAt2 >>> 6) | 960));
                    j5 = j13 + 2;
                    w3Var3.a((Object) bArr, j12 + j11, (byte) ((cCharAt2 & '?') | 128));
                    c4 = 128;
                    i7++;
                    j2 = j3;
                    c2 = c4;
                }
            } else {
                j4 = j5 + j2;
                j3 = j2;
                x3.f56720c.a((Object) bArr, x3.f56723f + j5, (byte) cCharAt2);
            }
            j5 = j4;
            c4 = 128;
            i7++;
            j2 = j3;
            c2 = c4;
        }
        return (int) j5;
    }
}
