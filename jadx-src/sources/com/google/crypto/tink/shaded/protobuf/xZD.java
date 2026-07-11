package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class xZD {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final n f60035n;

    static final class I28 extends n {
        private static int KN(byte[] bArr, int i2, long j2, int i3) {
            if (i3 == 0) {
                return xZD.xMQ(i2);
            }
            if (i3 == 1) {
                return xZD.mUb(i2, o7q.XQ(bArr, j2));
            }
            if (i3 == 2) {
                return xZD.gh(i2, o7q.XQ(bArr, j2), o7q.XQ(bArr, j2 + 1));
            }
            throw new AssertionError();
        }

        private static int Uo(byte[] bArr, long j2, int i2) {
            int i3 = 0;
            if (i2 < 16) {
                return 0;
            }
            int i5 = 8 - (((int) j2) & 7);
            while (i3 < i5) {
                long j3 = 1 + j2;
                if (o7q.XQ(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j3;
            }
            while (true) {
                int i7 = i3 + 8;
                if (i7 > i2 || (o7q.g(bArr, o7q.KN + j2) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j2 += 8;
                i3 = i7;
            }
            while (i3 < i2) {
                long j4 = j2 + 1;
                if (o7q.XQ(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j4;
            }
            return i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.xZD.n
        String n(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            Charset charset = SPz.rl;
            String str = new String(bArr, i2, i3, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                throw InvalidProtocolBufferException.nr();
            }
            return str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.o7q.XQ(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.o7q.XQ(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.xZD.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int nr(int i2, byte[] bArr, int i3, int i5) {
            byte bXQ;
            long j2;
            if ((i3 | i5 | (bArr.length - i5)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i5)));
            }
            long j3 = i3;
            long j4 = i5;
            if (i2 != 0) {
                if (j3 >= j4) {
                    return i2;
                }
                byte b2 = (byte) i2;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        long j5 = 1 + j3;
                        if (o7q.XQ(bArr, j3) <= -65) {
                            j3 = j5;
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte bXQ2 = (byte) (~(i2 >> 8));
                    if (bXQ2 == 0) {
                        long j6 = j3 + 1;
                        bXQ2 = o7q.XQ(bArr, j3);
                        if (j6 >= j4) {
                            return xZD.mUb(b2, bXQ2);
                        }
                        j3 = j6;
                    }
                    if (bXQ2 <= -65 && ((b2 != -32 || bXQ2 >= -96) && (b2 != -19 || bXQ2 < -96))) {
                        j2 = j3 + 1;
                    }
                    return -1;
                }
                byte bXQ3 = (byte) (~(i2 >> 8));
                if (bXQ3 == 0) {
                    long j7 = j3 + 1;
                    bXQ3 = o7q.XQ(bArr, j3);
                    if (j7 >= j4) {
                        return xZD.mUb(b2, bXQ3);
                    }
                    bXQ = 0;
                    j3 = j7;
                } else {
                    bXQ = (byte) (i2 >> 16);
                }
                if (bXQ == 0) {
                    long j9 = j3 + 1;
                    bXQ = o7q.XQ(bArr, j3);
                    if (j9 >= j4) {
                        return xZD.gh(b2, bXQ3, bXQ);
                    }
                    j3 = j9;
                }
                if (bXQ3 <= -65 && (((b2 << 28) + (bXQ3 + 112)) >> 30) == 0 && bXQ <= -65) {
                    j2 = j3 + 1;
                }
                return -1;
                j3 = j2;
            }
            return J2(bArr, j3, (int) (j4 - j3));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.xZD.n
        int rl(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            long j2;
            long j3;
            long j4;
            int i5;
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
                if (i7 >= length || (cCharAt = charSequence.charAt(i7)) >= 128) {
                    break;
                }
                o7q.s7N(bArr, j5, (byte) cCharAt);
                i7++;
                j5 = 1 + j5;
            }
            if (i7 == length) {
                return (int) j5;
            }
            while (i7 < length) {
                char cCharAt2 = charSequence.charAt(i7);
                if (cCharAt2 < 128 && j5 < j6) {
                    o7q.s7N(bArr, j5, (byte) cCharAt2);
                    j4 = j6;
                    j3 = j2;
                    j5 += j2;
                } else if (cCharAt2 >= 2048 || j5 > j6 - 2) {
                    j3 = j2;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j5 > j6 - 3) {
                        j4 = j6;
                        if (j5 > j4 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i7 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i5)))) {
                                throw new Ml(i7, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j5);
                        }
                        int i8 = i7 + 1;
                        if (i8 != length) {
                            char cCharAt3 = charSequence.charAt(i8);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                o7q.s7N(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                o7q.s7N(bArr, j5 + j3, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j7 = j5 + 3;
                                o7q.s7N(bArr, j5 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j5 += 4;
                                o7q.s7N(bArr, j7, (byte) ((codePoint & 63) | 128));
                                i7 = i8;
                            } else {
                                i7 = i8;
                            }
                        }
                        throw new Ml(i7 - 1, length);
                    }
                    o7q.s7N(bArr, j5, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j9 = j5 + 2;
                    j4 = j6;
                    o7q.s7N(bArr, j5 + j3, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j5 += 3;
                    o7q.s7N(bArr, j9, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j3 = j2;
                    long j10 = j5 + j3;
                    o7q.s7N(bArr, j5, (byte) ((cCharAt2 >>> 6) | 960));
                    j5 += 2;
                    o7q.s7N(bArr, j10, (byte) ((cCharAt2 & '?') | 128));
                    j4 = j6;
                }
                i7++;
                j2 = j3;
                j6 = j4;
            }
            return (int) j5;
        }

        I28() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int J2(byte[] bArr, long j2, int i2) {
            int iUo = Uo(bArr, j2, i2);
            int i3 = i2 - iUo;
            long j3 = j2 + ((long) iUo);
            while (true) {
                byte bXQ = 0;
                while (true) {
                    if (i3 <= 0) {
                        break;
                    }
                    long j4 = j3 + 1;
                    bXQ = o7q.XQ(bArr, j3);
                    if (bXQ >= 0) {
                        i3--;
                        j3 = j4;
                    } else {
                        j3 = j4;
                        break;
                    }
                }
                if (i3 == 0) {
                    return 0;
                }
                int i5 = i3 - 1;
                if (bXQ < -32) {
                    if (i5 == 0) {
                        return bXQ;
                    }
                    i3 -= 2;
                    if (bXQ < -62) {
                        break;
                    }
                    long j5 = 1 + j3;
                    if (o7q.XQ(bArr, j3) > -65) {
                        break;
                    }
                    j3 = j5;
                } else if (bXQ < -16) {
                    if (i5 < 2) {
                        return KN(bArr, bXQ, j3, i5);
                    }
                    i3 -= 3;
                    long j6 = 1 + j3;
                    byte bXQ2 = o7q.XQ(bArr, j3);
                    if (bXQ2 > -65 || ((bXQ == -32 && bXQ2 < -96) || (bXQ == -19 && bXQ2 >= -96))) {
                        break;
                    }
                    j3 += 2;
                    if (o7q.XQ(bArr, j6) > -65) {
                        break;
                    }
                } else {
                    if (i5 < 3) {
                        return KN(bArr, bXQ, j3, i5);
                    }
                    i3 -= 4;
                    long j7 = 1 + j3;
                    byte bXQ3 = o7q.XQ(bArr, j3);
                    if (bXQ3 <= -65 && (((bXQ << 28) + (bXQ3 + 112)) >> 30) == 0) {
                        long j9 = 2 + j3;
                        if (o7q.XQ(bArr, j7) > -65) {
                            break;
                        }
                        j3 += 3;
                        if (o7q.XQ(bArr, j9) > -65) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return -1;
        }

        static boolean O() {
            if (o7q.E2() && o7q.e()) {
                return true;
            }
            return false;
        }
    }

    static class Ml extends IllegalArgumentException {
        Ml(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    private static class j {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean HI(byte b2) {
            return b2 < -16;
        }

        private static char Ik(int i2) {
            return (char) ((i2 & 1023) + 56320);
        }

        private static boolean az(byte b2) {
            return b2 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean ck(byte b2) {
            return b2 < -32;
        }

        private static char qie(int i2) {
            return (char) ((i2 >>> 10) + 55232);
        }

        private static int r(byte b2) {
            return b2 & 63;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean ty(byte b2) {
            return b2 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void xMQ(byte b2, char[] cArr, int i2) {
            cArr[i2] = (char) b2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void gh(byte b2, byte b4, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (b2 < -62 || az(b4)) {
                throw InvalidProtocolBufferException.nr();
            }
            cArr[i2] = (char) (((b2 & 31) << 6) | r(b4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void KN(byte b2, byte b4, byte b5, byte b6, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (!az(b4) && (((b2 << 28) + (b4 + 112)) >> 30) == 0 && !az(b5) && !az(b6)) {
                int iR = ((b2 & 7) << 18) | (r(b4) << 12) | (r(b5) << 6) | r(b6);
                cArr[i2] = qie(iR);
                cArr[i2 + 1] = Ik(iR);
                return;
            }
            throw InvalidProtocolBufferException.nr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void mUb(byte b2, byte b4, byte b5, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (!az(b4) && ((b2 != -32 || b4 >= -96) && ((b2 != -19 || b4 < -96) && !az(b5)))) {
                cArr[i2] = (char) (((b2 & 15) << 12) | (r(b4) << 6) | r(b5));
                return;
            }
            throw InvalidProtocolBufferException.nr();
        }
    }

    static final class w6 extends n {
        private static int J2(byte[] bArr, int i2, int i3) {
            while (i2 < i3) {
                int i5 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 < 0) {
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
                    if (b2 >= -16) {
                        if (i5 >= i3 - 2) {
                            return xZD.qie(bArr, i5, i3);
                        }
                        int i7 = i2 + 2;
                        byte b4 = bArr[i5];
                        if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0) {
                            int i8 = i2 + 3;
                            if (bArr[i7] <= -65) {
                                i2 += 4;
                                if (bArr[i8] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i5 >= i3 - 1) {
                        return xZD.qie(bArr, i5, i3);
                    }
                    int i9 = i2 + 2;
                    byte b5 = bArr[i5];
                    if (b5 <= -65 && ((b2 != -32 || b5 >= -96) && (b2 != -19 || b5 < -96))) {
                        i2 += 3;
                        if (bArr[i9] > -65) {
                        }
                    }
                    return -1;
                }
                i2 = i5;
            }
            return 0;
        }

        private static int O(byte[] bArr, int i2, int i3) {
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 >= i3) {
                return 0;
            }
            return J2(bArr, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.xZD.n
        String n(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i5 = i2 + i3;
            char[] cArr = new char[i3];
            int i7 = 0;
            while (i2 < i5) {
                byte b2 = bArr[i2];
                if (!j.ty(b2)) {
                    break;
                }
                i2++;
                j.xMQ(b2, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (i2 < i5) {
                int i9 = i2 + 1;
                byte b4 = bArr[i2];
                if (j.ty(b4)) {
                    int i10 = i8 + 1;
                    j.xMQ(b4, cArr, i8);
                    int i11 = i9;
                    while (i11 < i5) {
                        byte b5 = bArr[i11];
                        if (!j.ty(b5)) {
                            break;
                        }
                        i11++;
                        j.xMQ(b5, cArr, i10);
                        i10++;
                    }
                    i8 = i10;
                    i2 = i11;
                } else if (j.ck(b4)) {
                    if (i9 >= i5) {
                        throw InvalidProtocolBufferException.nr();
                    }
                    i2 += 2;
                    j.gh(b4, bArr[i9], cArr, i8);
                    i8++;
                } else if (j.HI(b4)) {
                    if (i9 >= i5 - 1) {
                        throw InvalidProtocolBufferException.nr();
                    }
                    int i12 = i2 + 2;
                    i2 += 3;
                    j.mUb(b4, bArr[i9], bArr[i12], cArr, i8);
                    i8++;
                } else {
                    if (i9 >= i5 - 2) {
                        throw InvalidProtocolBufferException.nr();
                    }
                    byte b6 = bArr[i9];
                    int i13 = i2 + 3;
                    byte b7 = bArr[i2 + 2];
                    i2 += 4;
                    j.KN(b4, b6, b7, bArr[i13], cArr, i8);
                    i8 += 2;
                }
            }
            return new String(cArr, 0, i8);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.xZD.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int nr(int i2, byte[] bArr, int i3, int i5) {
            byte b2;
            int i7;
            int i8;
            if (i2 != 0) {
                if (i3 >= i5) {
                    return i2;
                }
                byte b4 = (byte) i2;
                if (b4 < -32) {
                    if (b4 >= -62) {
                        i8 = i3 + 1;
                    }
                    return -1;
                }
                if (b4 < -16) {
                    byte b5 = (byte) (~(i2 >> 8));
                    if (b5 == 0) {
                        int i9 = i3 + 1;
                        byte b6 = bArr[i3];
                        if (i9 >= i5) {
                            return xZD.mUb(b4, b6);
                        }
                        i3 = i9;
                        b5 = b6;
                    }
                    if (b5 <= -65 && ((b4 != -32 || b5 >= -96) && (b4 != -19 || b5 < -96))) {
                        i8 = i3 + 1;
                    }
                    return -1;
                }
                byte b7 = (byte) (~(i2 >> 8));
                if (b7 == 0) {
                    i7 = i3 + 1;
                    b7 = bArr[i3];
                    if (i7 >= i5) {
                        return xZD.mUb(b4, b7);
                    }
                    b2 = 0;
                } else {
                    b2 = (byte) (i2 >> 16);
                    i7 = i3;
                }
                if (b2 == 0) {
                    int i10 = i7 + 1;
                    byte b8 = bArr[i7];
                    if (i10 >= i5) {
                        return xZD.gh(b4, b7, b8);
                    }
                    b2 = b8;
                    i7 = i10;
                }
                if (b7 <= -65 && (((b4 << 28) + (b7 + 112)) >> 30) == 0 && b2 <= -65) {
                    i3 = i7 + 1;
                }
                return -1;
                i3 = i8;
            }
            return O(bArr, i3, i5);
        }

        w6() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.xZD.n
        int rl(CharSequence charSequence, byte[] bArr, int i2, int i3) {
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
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && i10 <= i8 - 3) {
                    bArr[i10] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i12 = i10 + 2;
                    bArr[i10 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i10 += 3;
                    bArr[i12] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if (i10 <= i8 - 4) {
                        int i13 = i9 + 1;
                        if (i13 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i14 = i10 + 3;
                                bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i10 += 4;
                                bArr[i14] = (byte) ((codePoint & 63) | 128);
                                i9 = i13;
                            } else {
                                i9 = i13;
                            }
                        }
                        throw new Ml(i9 - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i9 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i5)))) {
                        throw new Ml(i9, length);
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i10);
                }
                i9++;
            }
            return i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int gh(int i2, int i3, int i5) {
        if (i2 > -12 || i3 > -65 || i5 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i5 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mUb(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int xMQ(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    static abstract class n {
        abstract String n(byte[] bArr, int i2, int i3);

        abstract int nr(int i2, byte[] bArr, int i3, int i5);

        abstract int rl(CharSequence charSequence, byte[] bArr, int i2, int i3);

        final boolean t(byte[] bArr, int i2, int i3) {
            return nr(0, bArr, i2, i3) == 0;
        }

        n() {
        }
    }

    static int J2(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return f60035n.rl(charSequence, bArr, i2, i3);
    }

    static String O(byte[] bArr, int i2, int i3) {
        return f60035n.n(bArr, i2, i3);
    }

    static boolean az(byte[] bArr) {
        return f60035n.t(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int qie(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i5 = i3 - i2;
        if (i5 == 0) {
            return xMQ(b2);
        }
        if (i5 == 1) {
            return mUb(b2, bArr[i2]);
        }
        if (i5 == 2) {
            return gh(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    static boolean ty(byte[] bArr, int i2, int i3) {
        return f60035n.t(bArr, i2, i3);
    }

    static {
        n w6Var;
        if (I28.O() && !com.google.crypto.tink.shaded.protobuf.Ml.t()) {
            w6Var = new I28();
        } else {
            w6Var = new w6();
        }
        f60035n = w6Var;
    }

    private static int KN(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i2) >= 65536) {
                        i2++;
                    } else {
                        throw new Ml(i2, length);
                    }
                }
            }
            i2++;
        }
        return i3;
    }

    static int Uo(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int iKN = length;
        while (true) {
            if (i2 < length) {
                char cCharAt = charSequence.charAt(i2);
                if (cCharAt < 2048) {
                    iKN += (127 - cCharAt) >>> 31;
                    i2++;
                } else {
                    iKN += KN(charSequence, i2);
                    break;
                }
            } else {
                break;
            }
        }
        if (iKN >= length) {
            return iKN;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iKN) + 4294967296L));
    }
}
