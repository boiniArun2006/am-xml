package androidx.content.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class Utf8 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Processor f38196n;

    private static class DecodeUtil {
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

    static abstract class Processor {
        abstract int HI(int i2, ByteBuffer byteBuffer, int i3, int i5);

        abstract void KN(String str, ByteBuffer byteBuffer);

        abstract int O(String str, byte[] bArr, int i2, int i3);

        final boolean mUb(byte[] bArr, int i2, int i3) {
            return qie(0, bArr, i2, i3) == 0;
        }

        abstract String nr(ByteBuffer byteBuffer, int i2, int i3);

        abstract int qie(int i2, byte[] bArr, int i3, int i5);

        abstract String rl(byte[] bArr, int i2, int i3);

        final boolean xMQ(ByteBuffer byteBuffer, int i2, int i3) {
            return gh(0, byteBuffer, i2, i3) == 0;
        }

        final String t(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i5 = i2 + i3;
            char[] cArr = new char[i3];
            int i7 = 0;
            while (i2 < i5) {
                byte b2 = byteBuffer.get(i2);
                if (!DecodeUtil.ty(b2)) {
                    break;
                }
                i2++;
                DecodeUtil.xMQ(b2, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (i2 < i5) {
                int i9 = i2 + 1;
                byte b4 = byteBuffer.get(i2);
                if (DecodeUtil.ty(b4)) {
                    int i10 = i8 + 1;
                    DecodeUtil.xMQ(b4, cArr, i8);
                    int i11 = i9;
                    while (i11 < i5) {
                        byte b5 = byteBuffer.get(i11);
                        if (!DecodeUtil.ty(b5)) {
                            break;
                        }
                        i11++;
                        DecodeUtil.xMQ(b5, cArr, i10);
                        i10++;
                    }
                    i8 = i10;
                    i2 = i11;
                } else if (DecodeUtil.ck(b4)) {
                    if (i9 >= i5) {
                        throw InvalidProtocolBufferException.nr();
                    }
                    i2 += 2;
                    DecodeUtil.gh(b4, byteBuffer.get(i9), cArr, i8);
                    i8++;
                } else if (DecodeUtil.HI(b4)) {
                    if (i9 >= i5 - 1) {
                        throw InvalidProtocolBufferException.nr();
                    }
                    int i12 = i2 + 2;
                    i2 += 3;
                    DecodeUtil.mUb(b4, byteBuffer.get(i9), byteBuffer.get(i12), cArr, i8);
                    i8++;
                } else {
                    if (i9 >= i5 - 2) {
                        throw InvalidProtocolBufferException.nr();
                    }
                    byte b6 = byteBuffer.get(i9);
                    int i13 = i2 + 3;
                    byte b7 = byteBuffer.get(i2 + 2);
                    i2 += 4;
                    DecodeUtil.KN(b4, b6, b7, byteBuffer.get(i13), cArr, i8);
                    i8 += 2;
                }
            }
            return new String(cArr, 0, i8);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int ty(int i2, ByteBuffer byteBuffer, int i3, int i5) {
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
                        byte b6 = byteBuffer.get(i3);
                        if (i9 >= i5) {
                            return Utf8.HI(b4, b6);
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
                    b7 = byteBuffer.get(i3);
                    if (i7 >= i5) {
                        return Utf8.HI(b4, b7);
                    }
                    b2 = 0;
                } else {
                    b2 = (byte) (i2 >> 16);
                    i7 = i3;
                }
                if (b2 == 0) {
                    int i10 = i7 + 1;
                    byte b8 = byteBuffer.get(i7);
                    if (i10 >= i5) {
                        return Utf8.ck(b4, b7, b8);
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
            return az(byteBuffer, i3, i5);
        }

        Processor() {
        }

        private static int az(ByteBuffer byteBuffer, int i2, int i3) {
            int iAz = i2 + Utf8.az(byteBuffer, i2, i3);
            while (iAz < i3) {
                int i5 = iAz + 1;
                byte b2 = byteBuffer.get(iAz);
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i5 >= i3) {
                            return b2;
                        }
                        if (b2 < -62 || byteBuffer.get(i5) > -65) {
                            return -1;
                        }
                        iAz += 2;
                    } else if (b2 < -16) {
                        if (i5 >= i3 - 1) {
                            return Utf8.Ik(byteBuffer, b2, i5, i3 - i5);
                        }
                        int i7 = iAz + 2;
                        byte b4 = byteBuffer.get(i5);
                        if (b4 > -65 || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || byteBuffer.get(i7) > -65))) {
                            return -1;
                        }
                        iAz += 3;
                    } else {
                        if (i5 >= i3 - 2) {
                            return Utf8.Ik(byteBuffer, b2, i5, i3 - i5);
                        }
                        int i8 = iAz + 2;
                        byte b5 = byteBuffer.get(i5);
                        if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0) {
                            int i9 = iAz + 3;
                            if (byteBuffer.get(i8) <= -65) {
                                iAz += 4;
                                if (byteBuffer.get(i9) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                } else {
                    iAz = i5;
                }
            }
            return 0;
        }

        final void J2(String str, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.t(byteBuffer, Utf8.xMQ(str, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                KN(str, byteBuffer);
            } else {
                Uo(str, byteBuffer);
            }
        }

        final void Uo(String str, ByteBuffer byteBuffer) {
            int i2;
            int length = str.length();
            int iPosition = byteBuffer.position();
            int i3 = 0;
            while (i3 < length) {
                try {
                    char cCharAt = str.charAt(i3);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i3, (byte) cCharAt);
                    i3++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i3) + " at index " + (byteBuffer.position() + Math.max(i3, (iPosition - byteBuffer.position()) + 1)));
                }
            }
            if (i3 == length) {
                Java8Compatibility.t(byteBuffer, iPosition + i3);
                return;
            }
            iPosition += i3;
            while (i3 < length) {
                char cCharAt2 = str.charAt(i3);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i5 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i5, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i5;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i5;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i3) + " at index " + (byteBuffer.position() + Math.max(i3, (iPosition - byteBuffer.position()) + 1)));
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i7 = i3 + 1;
                        if (i7 != length) {
                            try {
                                char cCharAt3 = str.charAt(i7);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i8 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        i2 = iPosition + 2;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        iPosition = i8;
                                        i3 = i7;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i3) + " at index " + (byteBuffer.position() + Math.max(i3, (iPosition - byteBuffer.position()) + 1)));
                                    }
                                    try {
                                        byteBuffer.put(i8, (byte) (((codePoint >>> 12) & 63) | 128));
                                        iPosition += 3;
                                        byteBuffer.put(i2, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                        i3 = i7;
                                    } catch (IndexOutOfBoundsException unused4) {
                                        i3 = i7;
                                        iPosition = i2;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i3) + " at index " + (byteBuffer.position() + Math.max(i3, (iPosition - byteBuffer.position()) + 1)));
                                    }
                                } else {
                                    i3 = i7;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new UnpairedSurrogateException(i3, length);
                    }
                    int i9 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i9, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i3++;
                iPosition++;
            }
            Java8Compatibility.t(byteBuffer, iPosition);
        }

        final int gh(int i2, ByteBuffer byteBuffer, int i3, int i5) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                return qie(i2, byteBuffer.array(), i3 + iArrayOffset, iArrayOffset + i5);
            }
            if (byteBuffer.isDirect()) {
                return HI(i2, byteBuffer, i3, i5);
            }
            return ty(i2, byteBuffer, i3, i5);
        }

        final String n(ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                return rl(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3);
            }
            if (byteBuffer.isDirect()) {
                return nr(byteBuffer, i2, i3);
            }
            return t(byteBuffer, i2, i3);
        }
    }

    static final class SafeProcessor extends Processor {
        private static int Ik(byte[] bArr, int i2, int i3) {
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
                            return Utf8.r(bArr, i5, i3);
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
                        return Utf8.r(bArr, i5, i3);
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

        private static int ck(byte[] bArr, int i2, int i3) {
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 >= i3) {
                return 0;
            }
            return Ik(bArr, i2, i3);
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
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int qie(int i2, byte[] bArr, int i3, int i5) {
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
                            return Utf8.HI(b4, b6);
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
                        return Utf8.HI(b4, b7);
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
                        return Utf8.ck(b4, b7, b8);
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
            return ck(bArr, i3, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String rl(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i5 = i2 + i3;
            char[] cArr = new char[i3];
            int i7 = 0;
            while (i2 < i5) {
                byte b2 = bArr[i2];
                if (!DecodeUtil.ty(b2)) {
                    break;
                }
                i2++;
                DecodeUtil.xMQ(b2, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (i2 < i5) {
                int i9 = i2 + 1;
                byte b4 = bArr[i2];
                if (DecodeUtil.ty(b4)) {
                    int i10 = i8 + 1;
                    DecodeUtil.xMQ(b4, cArr, i8);
                    int i11 = i9;
                    while (i11 < i5) {
                        byte b5 = bArr[i11];
                        if (!DecodeUtil.ty(b5)) {
                            break;
                        }
                        i11++;
                        DecodeUtil.xMQ(b5, cArr, i10);
                        i10++;
                    }
                    i8 = i10;
                    i2 = i11;
                } else if (DecodeUtil.ck(b4)) {
                    if (i9 >= i5) {
                        throw InvalidProtocolBufferException.nr();
                    }
                    i2 += 2;
                    DecodeUtil.gh(b4, bArr[i9], cArr, i8);
                    i8++;
                } else if (DecodeUtil.HI(b4)) {
                    if (i9 >= i5 - 1) {
                        throw InvalidProtocolBufferException.nr();
                    }
                    int i12 = i2 + 2;
                    i2 += 3;
                    DecodeUtil.mUb(b4, bArr[i9], bArr[i12], cArr, i8);
                    i8++;
                } else {
                    if (i9 >= i5 - 2) {
                        throw InvalidProtocolBufferException.nr();
                    }
                    byte b6 = bArr[i9];
                    int i13 = i2 + 3;
                    byte b7 = bArr[i2 + 2];
                    i2 += 4;
                    DecodeUtil.KN(b4, b6, b7, bArr[i13], cArr, i8);
                    i8 += 2;
                }
            }
            return new String(cArr, 0, i8);
        }

        SafeProcessor() {
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int HI(int i2, ByteBuffer byteBuffer, int i3, int i5) {
            return ty(i2, byteBuffer, i3, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        void KN(String str, ByteBuffer byteBuffer) {
            Uo(str, byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int O(String str, byte[] bArr, int i2, int i3) {
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
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && i10 <= i8 - 3) {
                    bArr[i10] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i12 = i10 + 2;
                    bArr[i10 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i10 += 3;
                    bArr[i12] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if (i10 <= i8 - 4) {
                        int i13 = i9 + 1;
                        if (i13 != str.length()) {
                            char cCharAt3 = str.charAt(i13);
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
                        throw new UnpairedSurrogateException(i9 - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                        throw new UnpairedSurrogateException(i9, length);
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i10);
                }
                i9++;
            }
            return i10;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String nr(ByteBuffer byteBuffer, int i2, int i3) {
            return t(byteBuffer, i2, i3);
        }
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    static final class UnsafeProcessor extends Processor {
        private static int S(byte[] bArr, int i2, long j2, int i3) {
            if (i3 == 0) {
                return Utf8.ty(i2);
            }
            if (i3 == 1) {
                return Utf8.HI(i2, UnsafeUtil.ViF(bArr, j2));
            }
            if (i3 == 2) {
                return Utf8.ck(i2, UnsafeUtil.ViF(bArr, j2), UnsafeUtil.ViF(bArr, j2 + 1));
            }
            throw new AssertionError();
        }

        private static int XQ(long j2, int i2, int i3) {
            if (i3 == 0) {
                return Utf8.ty(i2);
            }
            if (i3 == 1) {
                return Utf8.HI(i2, UnsafeUtil.aYN(j2));
            }
            if (i3 == 2) {
                return Utf8.ck(i2, UnsafeUtil.aYN(j2), UnsafeUtil.aYN(j2 + 1));
            }
            throw new AssertionError();
        }

        private static int Z(byte[] bArr, long j2, int i2) {
            int i3 = 0;
            if (i2 < 16) {
                return 0;
            }
            int i5 = 8 - (((int) j2) & 7);
            while (i3 < i5) {
                long j3 = 1 + j2;
                if (UnsafeUtil.ViF(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j3;
            }
            while (true) {
                int i7 = i3 + 8;
                if (i7 > i2 || (UnsafeUtil.e(bArr, UnsafeUtil.KN + j2) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j2 += 8;
                i3 = i7;
            }
            while (i3 < i2) {
                long j4 = j2 + 1;
                if (UnsafeUtil.ViF(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j4;
            }
            return i2;
        }

        private static int o(long j2, int i2) {
            if (i2 < 16) {
                return 0;
            }
            int i3 = (int) ((-j2) & 7);
            int i5 = i3;
            while (i5 > 0) {
                long j3 = 1 + j2;
                if (UnsafeUtil.aYN(j2) < 0) {
                    return i3 - i5;
                }
                i5--;
                j2 = j3;
            }
            int i7 = i2 - i3;
            while (i7 >= 8 && (UnsafeUtil.E2(j2) & (-9187201950435737472L)) == 0) {
                j2 += 8;
                i7 -= 8;
            }
            return i2 - i7;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (androidx.content.preferences.protobuf.UnsafeUtil.aYN(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (androidx.content.preferences.protobuf.UnsafeUtil.aYN(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (androidx.content.preferences.protobuf.UnsafeUtil.aYN(r0) > (-65)) goto L57;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int HI(int i2, ByteBuffer byteBuffer, int i3, int i5) {
            byte bAYN;
            long j2;
            if ((i3 | i5 | (byteBuffer.limit() - i5)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i3), Integer.valueOf(i5)));
            }
            long jGh = UnsafeUtil.gh(byteBuffer) + ((long) i3);
            long j3 = ((long) (i5 - i3)) + jGh;
            if (i2 != 0) {
                if (jGh >= j3) {
                    return i2;
                }
                byte b2 = (byte) i2;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        j2 = 1 + jGh;
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte bAYN2 = (byte) (~(i2 >> 8));
                    if (bAYN2 == 0) {
                        long j4 = jGh + 1;
                        bAYN2 = UnsafeUtil.aYN(jGh);
                        if (j4 >= j3) {
                            return Utf8.HI(b2, bAYN2);
                        }
                        jGh = j4;
                    }
                    if (bAYN2 <= -65 && ((b2 != -32 || bAYN2 >= -96) && (b2 != -19 || bAYN2 < -96))) {
                        j2 = 1 + jGh;
                    }
                    return -1;
                }
                byte bAYN3 = (byte) (~(i2 >> 8));
                if (bAYN3 == 0) {
                    long j5 = jGh + 1;
                    bAYN3 = UnsafeUtil.aYN(jGh);
                    if (j5 >= j3) {
                        return Utf8.HI(b2, bAYN3);
                    }
                    bAYN = 0;
                    jGh = j5;
                } else {
                    bAYN = (byte) (i2 >> 16);
                }
                if (bAYN == 0) {
                    long j6 = jGh + 1;
                    bAYN = UnsafeUtil.aYN(jGh);
                    if (j6 >= j3) {
                        return Utf8.ck(b2, bAYN3, bAYN);
                    }
                    jGh = j6;
                }
                if (bAYN3 <= -65 && (((b2 << 28) + (bAYN3 + 112)) >> 30) == 0 && bAYN <= -65) {
                    j2 = 1 + jGh;
                }
                return -1;
                jGh = j2;
            }
            return Ik(jGh, (int) (j3 - jGh));
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        void KN(String str, ByteBuffer byteBuffer) {
            long j2;
            char c2;
            long j3;
            long j4;
            long j5;
            int i2;
            char c4;
            char cCharAt;
            long jGh = UnsafeUtil.gh(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jGh;
            long jLimit = ((long) byteBuffer.limit()) + jGh;
            int length = str.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i3 = 0;
            while (true) {
                j2 = 1;
                c2 = 128;
                if (i3 >= length || (cCharAt = str.charAt(i3)) >= 128) {
                    break;
                }
                UnsafeUtil.jB(jPosition, (byte) cCharAt);
                i3++;
                jPosition = 1 + jPosition;
            }
            if (i3 == length) {
                Java8Compatibility.t(byteBuffer, (int) (jPosition - jGh));
                return;
            }
            while (i3 < length) {
                char cCharAt2 = str.charAt(i3);
                if (cCharAt2 >= c2 || jPosition >= jLimit) {
                    j3 = j2;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j6 = jPosition + j3;
                        UnsafeUtil.jB(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        UnsafeUtil.jB(j6, (byte) ((cCharAt2 & '?') | 128));
                        j4 = jGh;
                        j5 = jLimit;
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            j4 = jGh;
                            j5 = jLimit;
                            if (jPosition > j5 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i2 = i3 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i2)))) {
                                    throw new UnpairedSurrogateException(i3, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i5 = i3 + 1;
                            if (i5 != length) {
                                char cCharAt3 = str.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    UnsafeUtil.jB(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c4 = 128;
                                    UnsafeUtil.jB(jPosition + j3, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j7 = jPosition + 3;
                                    UnsafeUtil.jB(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    UnsafeUtil.jB(j7, (byte) ((codePoint & 63) | 128));
                                    i3 = i5;
                                } else {
                                    i3 = i5;
                                }
                            }
                            throw new UnpairedSurrogateException(i3 - 1, length);
                        }
                        UnsafeUtil.jB(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        j4 = jGh;
                        long j9 = jPosition + 2;
                        j5 = jLimit;
                        UnsafeUtil.jB(jPosition + j3, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        UnsafeUtil.jB(j9, (byte) ((cCharAt2 & '?') | 128));
                    }
                    c4 = 128;
                } else {
                    UnsafeUtil.jB(jPosition, (byte) cCharAt2);
                    j4 = jGh;
                    j5 = jLimit;
                    c4 = c2;
                    jPosition += j2;
                    j3 = j2;
                }
                i3++;
                c2 = c4;
                j2 = j3;
                jGh = j4;
                jLimit = j5;
            }
            Java8Compatibility.t(byteBuffer, (int) (jPosition - jGh));
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int O(String str, byte[] bArr, int i2, int i3) {
            long j2;
            long j3;
            long j4;
            int i5;
            char cCharAt;
            long j5 = i2;
            long j6 = ((long) i3) + j5;
            int length = str.length();
            if (length > i3 || bArr.length - i3 < i2) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i2 + i3));
            }
            int i7 = 0;
            while (true) {
                j2 = 1;
                if (i7 >= length || (cCharAt = str.charAt(i7)) >= 128) {
                    break;
                }
                UnsafeUtil.U(bArr, j5, (byte) cCharAt);
                i7++;
                j5 = 1 + j5;
            }
            if (i7 == length) {
                return (int) j5;
            }
            while (i7 < length) {
                char cCharAt2 = str.charAt(i7);
                if (cCharAt2 < 128 && j5 < j6) {
                    UnsafeUtil.U(bArr, j5, (byte) cCharAt2);
                    j4 = j6;
                    j3 = j2;
                    j5 += j2;
                } else if (cCharAt2 >= 2048 || j5 > j6 - 2) {
                    j3 = j2;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j5 > j6 - 3) {
                        j4 = j6;
                        if (j5 > j4 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i7 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                                throw new UnpairedSurrogateException(i7, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j5);
                        }
                        int i8 = i7 + 1;
                        if (i8 != length) {
                            char cCharAt3 = str.charAt(i8);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.U(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                UnsafeUtil.U(bArr, j5 + j3, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j7 = j5 + 3;
                                UnsafeUtil.U(bArr, j5 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j5 += 4;
                                UnsafeUtil.U(bArr, j7, (byte) ((codePoint & 63) | 128));
                                i7 = i8;
                            } else {
                                i7 = i8;
                            }
                        }
                        throw new UnpairedSurrogateException(i7 - 1, length);
                    }
                    UnsafeUtil.U(bArr, j5, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j9 = j5 + 2;
                    j4 = j6;
                    UnsafeUtil.U(bArr, j5 + j3, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j5 += 3;
                    UnsafeUtil.U(bArr, j9, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j3 = j2;
                    long j10 = j5 + j3;
                    UnsafeUtil.U(bArr, j5, (byte) ((cCharAt2 >>> 6) | 960));
                    j5 += 2;
                    UnsafeUtil.U(bArr, j10, (byte) ((cCharAt2 & '?') | 128));
                    j4 = j6;
                }
                i7++;
                j2 = j3;
                j6 = j4;
            }
            return (int) j5;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String nr(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long jGh = UnsafeUtil.gh(byteBuffer) + ((long) i2);
            long j2 = ((long) i3) + jGh;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (jGh < j2) {
                byte bAYN = UnsafeUtil.aYN(jGh);
                if (!DecodeUtil.ty(bAYN)) {
                    break;
                }
                jGh++;
                DecodeUtil.xMQ(bAYN, cArr, i5);
                i5++;
            }
            int i7 = i5;
            while (jGh < j2) {
                long j3 = jGh + 1;
                byte bAYN2 = UnsafeUtil.aYN(jGh);
                if (DecodeUtil.ty(bAYN2)) {
                    int i8 = i7 + 1;
                    DecodeUtil.xMQ(bAYN2, cArr, i7);
                    long j4 = j3;
                    while (j4 < j2) {
                        byte bAYN3 = UnsafeUtil.aYN(j4);
                        if (!DecodeUtil.ty(bAYN3)) {
                            break;
                        }
                        j4++;
                        DecodeUtil.xMQ(bAYN3, cArr, i8);
                        i8++;
                    }
                    i7 = i8;
                    jGh = j4;
                } else if (DecodeUtil.ck(bAYN2)) {
                    if (j3 >= j2) {
                        throw InvalidProtocolBufferException.nr();
                    }
                    jGh += 2;
                    DecodeUtil.gh(bAYN2, UnsafeUtil.aYN(j3), cArr, i7);
                    i7++;
                } else if (DecodeUtil.HI(bAYN2)) {
                    if (j3 >= j2 - 1) {
                        throw InvalidProtocolBufferException.nr();
                    }
                    long j5 = 2 + jGh;
                    jGh += 3;
                    DecodeUtil.mUb(bAYN2, UnsafeUtil.aYN(j3), UnsafeUtil.aYN(j5), cArr, i7);
                    i7++;
                } else {
                    if (j3 >= j2 - 2) {
                        throw InvalidProtocolBufferException.nr();
                    }
                    byte bAYN4 = UnsafeUtil.aYN(j3);
                    long j6 = jGh + 3;
                    byte bAYN5 = UnsafeUtil.aYN(2 + jGh);
                    jGh += 4;
                    DecodeUtil.KN(bAYN2, bAYN4, bAYN5, UnsafeUtil.aYN(j6), cArr, i7);
                    i7 += 2;
                }
            }
            return new String(cArr, 0, i7);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (androidx.content.preferences.protobuf.UnsafeUtil.ViF(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (androidx.content.preferences.protobuf.UnsafeUtil.ViF(r12, r0) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int qie(int i2, byte[] bArr, int i3, int i5) {
            byte bViF;
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
                        if (UnsafeUtil.ViF(bArr, j3) <= -65) {
                            j3 = j5;
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte bViF2 = (byte) (~(i2 >> 8));
                    if (bViF2 == 0) {
                        long j6 = j3 + 1;
                        bViF2 = UnsafeUtil.ViF(bArr, j3);
                        if (j6 >= j4) {
                            return Utf8.HI(b2, bViF2);
                        }
                        j3 = j6;
                    }
                    if (bViF2 <= -65 && ((b2 != -32 || bViF2 >= -96) && (b2 != -19 || bViF2 < -96))) {
                        j2 = j3 + 1;
                    }
                    return -1;
                }
                byte bViF3 = (byte) (~(i2 >> 8));
                if (bViF3 == 0) {
                    long j7 = j3 + 1;
                    bViF3 = UnsafeUtil.ViF(bArr, j3);
                    if (j7 >= j4) {
                        return Utf8.HI(b2, bViF3);
                    }
                    bViF = 0;
                    j3 = j7;
                } else {
                    bViF = (byte) (i2 >> 16);
                }
                if (bViF == 0) {
                    long j9 = j3 + 1;
                    bViF = UnsafeUtil.ViF(bArr, j3);
                    if (j9 >= j4) {
                        return Utf8.ck(b2, bViF3, bViF);
                    }
                    j3 = j9;
                }
                if (bViF3 <= -65 && (((b2 << 28) + (bViF3 + 112)) >> 30) == 0 && bViF <= -65) {
                    j2 = j3 + 1;
                }
                return -1;
                j3 = j2;
            }
            return r(bArr, j3, (int) (j4 - j3));
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String rl(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            Charset charset = Internal.rl;
            String str = new String(bArr, i2, i3, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                throw InvalidProtocolBufferException.nr();
            }
            return str;
        }

        UnsafeProcessor() {
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
        private static int Ik(long j2, int i2) {
            int iO = o(j2, i2);
            long j3 = j2 + ((long) iO);
            int i3 = i2 - iO;
            while (true) {
                byte bAYN = 0;
                while (true) {
                    if (i3 <= 0) {
                        break;
                    }
                    long j4 = j3 + 1;
                    bAYN = UnsafeUtil.aYN(j3);
                    if (bAYN >= 0) {
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
                if (bAYN < -32) {
                    if (i5 == 0) {
                        return bAYN;
                    }
                    i3 -= 2;
                    if (bAYN < -62) {
                        break;
                    }
                    long j5 = 1 + j3;
                    if (UnsafeUtil.aYN(j3) > -65) {
                        break;
                    }
                    j3 = j5;
                } else if (bAYN < -16) {
                    if (i5 < 2) {
                        return XQ(j3, bAYN, i5);
                    }
                    i3 -= 3;
                    long j6 = 1 + j3;
                    byte bAYN2 = UnsafeUtil.aYN(j3);
                    if (bAYN2 > -65 || ((bAYN == -32 && bAYN2 < -96) || (bAYN == -19 && bAYN2 >= -96))) {
                        break;
                    }
                    j3 += 2;
                    if (UnsafeUtil.aYN(j6) > -65) {
                        break;
                    }
                } else {
                    if (i5 < 3) {
                        return XQ(j3, bAYN, i5);
                    }
                    i3 -= 4;
                    long j7 = 1 + j3;
                    byte bAYN3 = UnsafeUtil.aYN(j3);
                    if (bAYN3 <= -65 && (((bAYN << 28) + (bAYN3 + 112)) >> 30) == 0) {
                        long j9 = 2 + j3;
                        if (UnsafeUtil.aYN(j7) > -65) {
                            break;
                        }
                        j3 += 3;
                        if (UnsafeUtil.aYN(j9) > -65) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return -1;
        }

        static boolean ck() {
            if (UnsafeUtil.nHg() && UnsafeUtil.s7N()) {
                return true;
            }
            return false;
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
        private static int r(byte[] bArr, long j2, int i2) {
            int iZ = Z(bArr, j2, i2);
            int i3 = i2 - iZ;
            long j3 = j2 + ((long) iZ);
            while (true) {
                byte bViF = 0;
                while (true) {
                    if (i3 <= 0) {
                        break;
                    }
                    long j4 = j3 + 1;
                    bViF = UnsafeUtil.ViF(bArr, j3);
                    if (bViF >= 0) {
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
                if (bViF < -32) {
                    if (i5 == 0) {
                        return bViF;
                    }
                    i3 -= 2;
                    if (bViF < -62) {
                        break;
                    }
                    long j5 = 1 + j3;
                    if (UnsafeUtil.ViF(bArr, j3) > -65) {
                        break;
                    }
                    j3 = j5;
                } else if (bViF < -16) {
                    if (i5 < 2) {
                        return S(bArr, bViF, j3, i5);
                    }
                    i3 -= 3;
                    long j6 = 1 + j3;
                    byte bViF2 = UnsafeUtil.ViF(bArr, j3);
                    if (bViF2 > -65 || ((bViF == -32 && bViF2 < -96) || (bViF == -19 && bViF2 >= -96))) {
                        break;
                    }
                    j3 += 2;
                    if (UnsafeUtil.ViF(bArr, j6) > -65) {
                        break;
                    }
                } else {
                    if (i5 < 3) {
                        return S(bArr, bViF, j3, i5);
                    }
                    i3 -= 4;
                    long j7 = 1 + j3;
                    byte bViF3 = UnsafeUtil.ViF(bArr, j3);
                    if (bViF3 <= -65 && (((bViF << 28) + (bViF3 + 112)) >> 30) == 0) {
                        long j9 = 2 + j3;
                        if (UnsafeUtil.ViF(bArr, j7) > -65) {
                            break;
                        }
                        j3 += 3;
                        if (UnsafeUtil.ViF(bArr, j9) > -65) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int HI(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ck(int i2, int i3, int i5) {
        if (i2 > -12 || i3 > -65 || i5 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i5 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ty(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Ik(ByteBuffer byteBuffer, int i2, int i3, int i5) {
        if (i5 == 0) {
            return ty(i2);
        }
        if (i5 == 1) {
            return HI(i2, byteBuffer.get(i3));
        }
        if (i5 == 2) {
            return ck(i2, byteBuffer.get(i3), byteBuffer.get(i3 + 1));
        }
        throw new AssertionError();
    }

    static String KN(byte[] bArr, int i2, int i3) {
        return f38196n.rl(bArr, i2, i3);
    }

    static int S(int i2, ByteBuffer byteBuffer, int i3, int i5) {
        return f38196n.gh(i2, byteBuffer, i3, i5);
    }

    static String Uo(ByteBuffer byteBuffer, int i2, int i3) {
        return f38196n.n(byteBuffer, i2, i3);
    }

    static int WPU(int i2, byte[] bArr, int i3, int i5) {
        return f38196n.qie(i2, bArr, i3, i5);
    }

    static boolean XQ(byte[] bArr, int i2, int i3) {
        return f38196n.mUb(bArr, i2, i3);
    }

    static boolean Z(byte[] bArr) {
        return f38196n.mUb(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int az(ByteBuffer byteBuffer, int i2, int i3) {
        int i5 = i3 - 7;
        int i7 = i2;
        while (i7 < i5 && (byteBuffer.getLong(i7) & (-9187201950435737472L)) == 0) {
            i7 += 8;
        }
        return i7 - i2;
    }

    static void mUb(String str, ByteBuffer byteBuffer) {
        f38196n.J2(str, byteBuffer);
    }

    static boolean o(ByteBuffer byteBuffer) {
        return f38196n.xMQ(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i5 = i3 - i2;
        if (i5 == 0) {
            return ty(b2);
        }
        if (i5 == 1) {
            return HI(b2, bArr[i2]);
        }
        if (i5 == 2) {
            return ck(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    static int xMQ(String str, byte[] bArr, int i2, int i3) {
        return f38196n.O(str, bArr, i2, i3);
    }

    static {
        Processor safeProcessor;
        if (UnsafeProcessor.ck() && !Android.t()) {
            safeProcessor = new UnsafeProcessor();
        } else {
            safeProcessor = new SafeProcessor();
        }
        f38196n = safeProcessor;
    }

    static int gh(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int iQie = length;
        while (true) {
            if (i2 < length) {
                char cCharAt = str.charAt(i2);
                if (cCharAt < 2048) {
                    iQie += (127 - cCharAt) >>> 31;
                    i2++;
                } else {
                    iQie += qie(str, i2);
                    break;
                }
            } else {
                break;
            }
        }
        if (iQie >= length) {
            return iQie;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iQie) + 4294967296L));
    }

    private static int qie(String str, int i2) {
        int length = str.length();
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i2) >= 65536) {
                        i2++;
                    } else {
                        throw new UnpairedSurrogateException(i2, length);
                    }
                }
            }
            i2++;
        }
        return i3;
    }
}
