package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class L0y {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final n processor;

    static final class I28 extends n {
        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j2, int i2) {
            int i3 = 0;
            if (i2 < 16) {
                return 0;
            }
            int i5 = 8 - (((int) j2) & 7);
            while (i3 < i5) {
                long j3 = 1 + j2;
                if (g9.getByte(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j3;
            }
            while (true) {
                int i7 = i3 + 8;
                if (i7 > i2 || (g9.getLong((Object) bArr, g9.BYTE_ARRAY_BASE_OFFSET + j2) & L0y.ASCII_MASK_LONG) != 0) {
                    break;
                }
                j2 += 8;
                i3 = i7;
            }
            while (i3 < i2) {
                long j4 = j2 + 1;
                if (g9.getByte(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j4;
            }
            return i2;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i2, long j2, int i3) {
            if (i3 == 0) {
                return L0y.incompleteStateFor(i2);
            }
            if (i3 == 1) {
                return L0y.incompleteStateFor(i2, g9.getByte(bArr, j2));
            }
            if (i3 == 2) {
                return L0y.incompleteStateFor(i2, g9.getByte(bArr, j2), g9.getByte(bArr, j2 + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.protobuf.g9.getByte(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.g9.getByte(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.L0y.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i5) {
            byte b2;
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
                byte b4 = (byte) i2;
                if (b4 < -32) {
                    if (b4 >= -62) {
                        long j5 = 1 + j3;
                        if (g9.getByte(bArr, j3) <= -65) {
                            j3 = j5;
                        }
                    }
                    return -1;
                }
                if (b4 < -16) {
                    byte b5 = (byte) (~(i2 >> 8));
                    if (b5 == 0) {
                        long j6 = j3 + 1;
                        b5 = g9.getByte(bArr, j3);
                        if (j6 >= j4) {
                            return L0y.incompleteStateFor(b4, b5);
                        }
                        j3 = j6;
                    }
                    if (b5 <= -65 && ((b4 != -32 || b5 >= -96) && (b4 != -19 || b5 < -96))) {
                        j2 = j3 + 1;
                    }
                    return -1;
                }
                byte b6 = (byte) (~(i2 >> 8));
                if (b6 == 0) {
                    long j7 = j3 + 1;
                    b6 = g9.getByte(bArr, j3);
                    if (j7 >= j4) {
                        return L0y.incompleteStateFor(b4, b6);
                    }
                    b2 = 0;
                    j3 = j7;
                } else {
                    b2 = (byte) (i2 >> 16);
                }
                if (b2 == 0) {
                    long j9 = j3 + 1;
                    b2 = g9.getByte(bArr, j3);
                    if (j9 >= j4) {
                        return L0y.incompleteStateFor(b4, b6, b2);
                    }
                    j3 = j9;
                }
                if (b6 <= -65 && (((b4 << 28) + (b6 + 112)) >> 30) == 0 && b2 <= -65) {
                    j2 = j3 + 1;
                }
                return -1;
                j3 = j2;
            }
            return partialIsValidUtf8(bArr, j3, (int) (j4 - j3));
        }

        @Override // com.google.protobuf.L0y.n
        String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            Charset charset = nKK.UTF_8;
            String str = new String(bArr, i2, i3, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.L0y.n
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long jAddressOffset = g9.addressOffset(byteBuffer) + ((long) i2);
            long j2 = ((long) i3) + jAddressOffset;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (jAddressOffset < j2) {
                byte b2 = g9.getByte(jAddressOffset);
                if (!j.isOneByte(b2)) {
                    break;
                }
                jAddressOffset++;
                j.handleOneByte(b2, cArr, i5);
                i5++;
            }
            int i7 = i5;
            while (jAddressOffset < j2) {
                long j3 = jAddressOffset + 1;
                byte b4 = g9.getByte(jAddressOffset);
                if (j.isOneByte(b4)) {
                    int i8 = i7 + 1;
                    j.handleOneByte(b4, cArr, i7);
                    long j4 = j3;
                    while (j4 < j2) {
                        byte b5 = g9.getByte(j4);
                        if (!j.isOneByte(b5)) {
                            break;
                        }
                        j4++;
                        j.handleOneByte(b5, cArr, i8);
                        i8++;
                    }
                    i7 = i8;
                    jAddressOffset = j4;
                } else if (j.isTwoBytes(b4)) {
                    if (j3 >= j2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    j.handleTwoBytes(b4, g9.getByte(j3), cArr, i7);
                    i7++;
                } else if (j.isThreeBytes(b4)) {
                    if (j3 >= j2 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j5 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    j.handleThreeBytes(b4, g9.getByte(j3), g9.getByte(j5), cArr, i7);
                    i7++;
                } else {
                    if (j3 >= j2 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b6 = g9.getByte(j3);
                    long j6 = jAddressOffset + 3;
                    byte b7 = g9.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    j.handleFourBytes(b4, b6, b7, g9.getByte(j6), cArr, i7);
                    i7 += 2;
                }
            }
            return new String(cArr, 0, i7);
        }

        @Override // com.google.protobuf.L0y.n
        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i2, int i3) {
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
                g9.putByte(bArr, j5, (byte) cCharAt);
                i7++;
                j5 = 1 + j5;
            }
            if (i7 == length) {
                return (int) j5;
            }
            while (i7 < length) {
                char cCharAt2 = charSequence.charAt(i7);
                if (cCharAt2 < 128 && j5 < j6) {
                    g9.putByte(bArr, j5, (byte) cCharAt2);
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
                                g9.putByte(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                g9.putByte(bArr, j5 + j3, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j7 = j5 + 3;
                                g9.putByte(bArr, j5 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j5 += 4;
                                g9.putByte(bArr, j7, (byte) ((codePoint & 63) | 128));
                                i7 = i8;
                            } else {
                                i7 = i8;
                            }
                        }
                        throw new Ml(i7 - 1, length);
                    }
                    g9.putByte(bArr, j5, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j9 = j5 + 2;
                    j4 = j6;
                    g9.putByte(bArr, j5 + j3, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j5 += 3;
                    g9.putByte(bArr, j9, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j3 = j2;
                    long j10 = j5 + j3;
                    g9.putByte(bArr, j5, (byte) ((cCharAt2 >>> 6) | 960));
                    j5 += 2;
                    g9.putByte(bArr, j10, (byte) ((cCharAt2 & '?') | 128));
                    j4 = j6;
                }
                i7++;
                j2 = j3;
                j6 = j4;
            }
            return (int) j5;
        }

        @Override // com.google.protobuf.L0y.n
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j2;
            char c2;
            long j3;
            long j4;
            long j5;
            int i2;
            char c4;
            char cCharAt;
            long jAddressOffset = g9.addressOffset(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            long jLimit = ((long) byteBuffer.limit()) + jAddressOffset;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i3 = 0;
            while (true) {
                j2 = 1;
                c2 = 128;
                if (i3 >= length || (cCharAt = charSequence.charAt(i3)) >= 128) {
                    break;
                }
                g9.putByte(jPosition, (byte) cCharAt);
                i3++;
                jPosition = 1 + jPosition;
            }
            if (i3 == length) {
                qf.position(byteBuffer, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i3 < length) {
                char cCharAt2 = charSequence.charAt(i3);
                if (cCharAt2 >= c2 || jPosition >= jLimit) {
                    j3 = j2;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j6 = jPosition + j3;
                        g9.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        g9.putByte(j6, (byte) ((cCharAt2 & '?') | 128));
                        j4 = jAddressOffset;
                        j5 = jLimit;
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            j4 = jAddressOffset;
                            j5 = jLimit;
                            if (jPosition > j5 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i2 = i3 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i2)))) {
                                    throw new Ml(i3, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i5 = i3 + 1;
                            if (i5 != length) {
                                char cCharAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    g9.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c4 = 128;
                                    g9.putByte(jPosition + j3, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j7 = jPosition + 3;
                                    g9.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    g9.putByte(j7, (byte) ((codePoint & 63) | 128));
                                    i3 = i5;
                                } else {
                                    i3 = i5;
                                }
                            }
                            throw new Ml(i3 - 1, length);
                        }
                        g9.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        j4 = jAddressOffset;
                        long j9 = jPosition + 2;
                        j5 = jLimit;
                        g9.putByte(jPosition + j3, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        g9.putByte(j9, (byte) ((cCharAt2 & '?') | 128));
                    }
                    c4 = 128;
                } else {
                    g9.putByte(jPosition, (byte) cCharAt2);
                    j4 = jAddressOffset;
                    j5 = jLimit;
                    c4 = c2;
                    jPosition += j2;
                    j3 = j2;
                }
                i3++;
                c2 = c4;
                j2 = j3;
                jAddressOffset = j4;
                jLimit = j5;
            }
            qf.position(byteBuffer, (int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.protobuf.g9.getByte(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (com.google.protobuf.g9.getByte(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.g9.getByte(r0) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.L0y.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8Direct(int i2, ByteBuffer byteBuffer, int i3, int i5) {
            byte b2;
            long j2;
            if ((i3 | i5 | (byteBuffer.limit() - i5)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i3), Integer.valueOf(i5)));
            }
            long jAddressOffset = g9.addressOffset(byteBuffer) + ((long) i3);
            long j3 = ((long) (i5 - i3)) + jAddressOffset;
            if (i2 != 0) {
                if (jAddressOffset >= j3) {
                    return i2;
                }
                byte b4 = (byte) i2;
                if (b4 < -32) {
                    if (b4 >= -62) {
                        j2 = 1 + jAddressOffset;
                    }
                    return -1;
                }
                if (b4 < -16) {
                    byte b5 = (byte) (~(i2 >> 8));
                    if (b5 == 0) {
                        long j4 = jAddressOffset + 1;
                        b5 = g9.getByte(jAddressOffset);
                        if (j4 >= j3) {
                            return L0y.incompleteStateFor(b4, b5);
                        }
                        jAddressOffset = j4;
                    }
                    if (b5 <= -65 && ((b4 != -32 || b5 >= -96) && (b4 != -19 || b5 < -96))) {
                        j2 = 1 + jAddressOffset;
                    }
                    return -1;
                }
                byte b6 = (byte) (~(i2 >> 8));
                if (b6 == 0) {
                    long j5 = jAddressOffset + 1;
                    b6 = g9.getByte(jAddressOffset);
                    if (j5 >= j3) {
                        return L0y.incompleteStateFor(b4, b6);
                    }
                    b2 = 0;
                    jAddressOffset = j5;
                } else {
                    b2 = (byte) (i2 >> 16);
                }
                if (b2 == 0) {
                    long j6 = jAddressOffset + 1;
                    b2 = g9.getByte(jAddressOffset);
                    if (j6 >= j3) {
                        return L0y.incompleteStateFor(b4, b6, b2);
                    }
                    jAddressOffset = j6;
                }
                if (b6 <= -65 && (((b4 << 28) + (b6 + 112)) >> 30) == 0 && b2 <= -65) {
                    j2 = 1 + jAddressOffset;
                }
                return -1;
                jAddressOffset = j2;
            }
            return partialIsValidUtf8(jAddressOffset, (int) (j3 - jAddressOffset));
        }

        I28() {
        }

        static boolean isAvailable() {
            if (g9.hasUnsafeArrayOperations() && g9.hasUnsafeByteBufferOperations()) {
                return true;
            }
            return false;
        }

        private static int unsafeEstimateConsecutiveAscii(long j2, int i2) {
            if (i2 < 16) {
                return 0;
            }
            int i3 = (int) ((-j2) & 7);
            int i5 = i3;
            while (i5 > 0) {
                long j3 = 1 + j2;
                if (g9.getByte(j2) < 0) {
                    return i3 - i5;
                }
                i5--;
                j2 = j3;
            }
            int i7 = i2 - i3;
            while (i7 >= 8 && (g9.getLong(j2) & L0y.ASCII_MASK_LONG) == 0) {
                j2 += 8;
                i7 -= 8;
            }
            return i2 - i7;
        }

        private static int unsafeIncompleteStateFor(long j2, int i2, int i3) {
            if (i3 == 0) {
                return L0y.incompleteStateFor(i2);
            }
            if (i3 == 1) {
                return L0y.incompleteStateFor(i2, g9.getByte(j2));
            }
            if (i3 == 2) {
                return L0y.incompleteStateFor(i2, g9.getByte(j2), g9.getByte(j2 + 1));
            }
            throw new AssertionError();
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
        private static int partialIsValidUtf8(byte[] bArr, long j2, int i2) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j2, i2);
            int i3 = i2 - iUnsafeEstimateConsecutiveAscii;
            long j3 = j2 + ((long) iUnsafeEstimateConsecutiveAscii);
            while (true) {
                byte b2 = 0;
                while (true) {
                    if (i3 <= 0) {
                        break;
                    }
                    long j4 = j3 + 1;
                    b2 = g9.getByte(bArr, j3);
                    if (b2 < 0) {
                        j3 = j4;
                        break;
                    }
                    i3--;
                    j3 = j4;
                }
                if (i3 != 0) {
                    int i5 = i3 - 1;
                    if (b2 >= -32) {
                        if (b2 >= -16) {
                            if (i5 < 3) {
                                return unsafeIncompleteStateFor(bArr, b2, j3, i5);
                            }
                            i3 -= 4;
                            long j5 = 1 + j3;
                            byte b4 = g9.getByte(bArr, j3);
                            if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0) {
                                long j6 = 2 + j3;
                                if (g9.getByte(bArr, j5) > -65) {
                                    break;
                                }
                                j3 += 3;
                                if (g9.getByte(bArr, j6) > -65) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            if (i5 < 2) {
                                return unsafeIncompleteStateFor(bArr, b2, j3, i5);
                            }
                            i3 -= 3;
                            long j7 = 1 + j3;
                            byte b5 = g9.getByte(bArr, j3);
                            if (b5 > -65 || ((b2 == -32 && b5 < -96) || (b2 == -19 && b5 >= -96))) {
                                break;
                            }
                            j3 += 2;
                            if (g9.getByte(bArr, j7) > -65) {
                                break;
                            }
                        }
                    } else if (i5 != 0) {
                        i3 -= 2;
                        if (b2 < -62) {
                            break;
                        }
                        long j9 = 1 + j3;
                        if (g9.getByte(bArr, j3) > -65) {
                            break;
                        }
                        j3 = j9;
                    } else {
                        return b2;
                    }
                } else {
                    return 0;
                }
            }
            return -1;
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
        private static int partialIsValidUtf8(long j2, int i2) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j2, i2);
            long j3 = j2 + ((long) iUnsafeEstimateConsecutiveAscii);
            int i3 = i2 - iUnsafeEstimateConsecutiveAscii;
            while (true) {
                byte b2 = 0;
                while (true) {
                    if (i3 <= 0) {
                        break;
                    }
                    long j4 = j3 + 1;
                    b2 = g9.getByte(j3);
                    if (b2 < 0) {
                        j3 = j4;
                        break;
                    }
                    i3--;
                    j3 = j4;
                }
                if (i3 != 0) {
                    int i5 = i3 - 1;
                    if (b2 >= -32) {
                        if (b2 >= -16) {
                            if (i5 < 3) {
                                return unsafeIncompleteStateFor(j3, b2, i5);
                            }
                            i3 -= 4;
                            long j5 = 1 + j3;
                            byte b4 = g9.getByte(j3);
                            if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0) {
                                long j6 = 2 + j3;
                                if (g9.getByte(j5) > -65) {
                                    break;
                                }
                                j3 += 3;
                                if (g9.getByte(j6) > -65) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            if (i5 < 2) {
                                return unsafeIncompleteStateFor(j3, b2, i5);
                            }
                            i3 -= 3;
                            long j7 = 1 + j3;
                            byte b5 = g9.getByte(j3);
                            if (b5 > -65 || ((b2 == -32 && b5 < -96) || (b2 == -19 && b5 >= -96))) {
                                break;
                            }
                            j3 += 2;
                            if (g9.getByte(j7) > -65) {
                                break;
                            }
                        }
                    } else if (i5 != 0) {
                        i3 -= 2;
                        if (b2 < -62) {
                            break;
                        }
                        long j9 = 1 + j3;
                        if (g9.getByte(j3) > -65) {
                            break;
                        }
                        j3 = j9;
                    } else {
                        return b2;
                    }
                } else {
                    return 0;
                }
            }
            return -1;
        }
    }

    static class Ml extends IllegalArgumentException {
        Ml(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    private static class j {
        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b2, char[] cArr, int i2) {
            cArr[i2] = (char) b2;
        }

        private static char highSurrogate(int i2) {
            return (char) ((i2 >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b2) {
            return b2 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b2) {
            return b2 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b2) {
            return b2 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b2) {
            return b2 < -32;
        }

        private static char lowSurrogate(int i2) {
            return (char) ((i2 & 1023) + 56320);
        }

        private static int trailingByteValue(byte b2) {
            return b2 & 63;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b2, byte b4, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (b2 < -62 || isNotTrailingByte(b4)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i2] = (char) (((b2 & 31) << 6) | trailingByteValue(b4));
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b2, byte b4, byte b5, byte b6, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(b4) && (((b2 << 28) + (b4 + 112)) >> 30) == 0 && !isNotTrailingByte(b5) && !isNotTrailingByte(b6)) {
                int iTrailingByteValue = ((b2 & 7) << 18) | (trailingByteValue(b4) << 12) | (trailingByteValue(b5) << 6) | trailingByteValue(b6);
                cArr[i2] = highSurrogate(iTrailingByteValue);
                cArr[i2 + 1] = lowSurrogate(iTrailingByteValue);
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b2, byte b4, byte b5, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(b4) && ((b2 != -32 || b4 >= -96) && ((b2 != -19 || b4 < -96) && !isNotTrailingByte(b5)))) {
                cArr[i2] = (char) (((b2 & 15) << 12) | (trailingByteValue(b4) << 6) | trailingByteValue(b5));
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }
    }

    static abstract class n {
        final String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i2, i3) : decodeUtf8Default(byteBuffer, i2, i3);
        }

        abstract String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException;

        abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException;

        abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i2, int i3);

        final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                qf.position(byteBuffer, L0y.encode(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        final boolean isValidUtf8(byte[] bArr, int i2, int i3) {
            return partialIsValidUtf8(0, bArr, i2, i3) == 0;
        }

        final int partialIsValidUtf8(int i2, ByteBuffer byteBuffer, int i3, int i5) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i2, byteBuffer, i3, i5) : partialIsValidUtf8Default(i2, byteBuffer, i3, i5);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i2, byteBuffer.array(), i3 + iArrayOffset, iArrayOffset + i5);
        }

        abstract int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i5);

        abstract int partialIsValidUtf8Direct(int i2, ByteBuffer byteBuffer, int i3, int i5);

        final String decodeUtf8Default(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i5 = i2 + i3;
            char[] cArr = new char[i3];
            int i7 = 0;
            while (i2 < i5) {
                byte b2 = byteBuffer.get(i2);
                if (!j.isOneByte(b2)) {
                    break;
                }
                i2++;
                j.handleOneByte(b2, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (i2 < i5) {
                int i9 = i2 + 1;
                byte b4 = byteBuffer.get(i2);
                if (j.isOneByte(b4)) {
                    int i10 = i8 + 1;
                    j.handleOneByte(b4, cArr, i8);
                    int i11 = i9;
                    while (i11 < i5) {
                        byte b5 = byteBuffer.get(i11);
                        if (!j.isOneByte(b5)) {
                            break;
                        }
                        i11++;
                        j.handleOneByte(b5, cArr, i10);
                        i10++;
                    }
                    i8 = i10;
                    i2 = i11;
                } else if (j.isTwoBytes(b4)) {
                    if (i9 >= i5) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i2 += 2;
                    j.handleTwoBytes(b4, byteBuffer.get(i9), cArr, i8);
                    i8++;
                } else if (j.isThreeBytes(b4)) {
                    if (i9 >= i5 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i12 = i2 + 2;
                    i2 += 3;
                    j.handleThreeBytes(b4, byteBuffer.get(i9), byteBuffer.get(i12), cArr, i8);
                    i8++;
                } else {
                    if (i9 >= i5 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b6 = byteBuffer.get(i9);
                    int i13 = i2 + 3;
                    byte b7 = byteBuffer.get(i2 + 2);
                    i2 += 4;
                    j.handleFourBytes(b4, b6, b7, byteBuffer.get(i13), cArr, i8);
                    i8 += 2;
                }
            }
            return new String(cArr, 0, i8);
        }

        final boolean isValidUtf8(ByteBuffer byteBuffer, int i2, int i3) {
            return partialIsValidUtf8(0, byteBuffer, i2, i3) == 0;
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
        final int partialIsValidUtf8Default(int i2, ByteBuffer byteBuffer, int i3, int i5) {
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
                            return L0y.incompleteStateFor(b4, b6);
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
                        return L0y.incompleteStateFor(b4, b7);
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
                        return L0y.incompleteStateFor(b4, b7, b8);
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
            return partialIsValidUtf8(byteBuffer, i3, i5);
        }

        n() {
        }

        final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int i2;
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i3 = 0;
            while (i3 < length) {
                try {
                    char cCharAt = charSequence.charAt(i3);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i3, (byte) cCharAt);
                    i3++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i3) + " at index " + (byteBuffer.position() + Math.max(i3, (iPosition - byteBuffer.position()) + 1)));
                }
            }
            if (i3 == length) {
                qf.position(byteBuffer, iPosition + i3);
                return;
            }
            iPosition += i3;
            while (i3 < length) {
                char cCharAt2 = charSequence.charAt(i3);
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
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i3) + " at index " + (byteBuffer.position() + Math.max(i3, (iPosition - byteBuffer.position()) + 1)));
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i7 = i3 + 1;
                        if (i7 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i7);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i8 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        i2 = iPosition + 2;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        iPosition = i8;
                                        i3 = i7;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i3) + " at index " + (byteBuffer.position() + Math.max(i3, (iPosition - byteBuffer.position()) + 1)));
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
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i3) + " at index " + (byteBuffer.position() + Math.max(i3, (iPosition - byteBuffer.position()) + 1)));
                                    }
                                } else {
                                    i3 = i7;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new Ml(i3, length);
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
            qf.position(byteBuffer, iPosition);
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i2, int i3) {
            int iEstimateConsecutiveAscii = i2 + L0y.estimateConsecutiveAscii(byteBuffer, i2, i3);
            while (iEstimateConsecutiveAscii < i3) {
                int i5 = iEstimateConsecutiveAscii + 1;
                byte b2 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b2 >= 0) {
                    iEstimateConsecutiveAscii = i5;
                } else if (b2 < -32) {
                    if (i5 >= i3) {
                        return b2;
                    }
                    if (b2 < -62 || byteBuffer.get(i5) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b2 >= -16) {
                        if (i5 >= i3 - 2) {
                            return L0y.incompleteStateFor(byteBuffer, b2, i5, i3 - i5);
                        }
                        int i7 = iEstimateConsecutiveAscii + 2;
                        byte b4 = byteBuffer.get(i5);
                        if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0) {
                            int i8 = iEstimateConsecutiveAscii + 3;
                            if (byteBuffer.get(i7) <= -65) {
                                iEstimateConsecutiveAscii += 4;
                                if (byteBuffer.get(i8) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i5 >= i3 - 1) {
                        return L0y.incompleteStateFor(byteBuffer, b2, i5, i3 - i5);
                    }
                    int i9 = iEstimateConsecutiveAscii + 2;
                    byte b5 = byteBuffer.get(i5);
                    if (b5 > -65 || ((b2 == -32 && b5 < -96) || ((b2 == -19 && b5 >= -96) || byteBuffer.get(i9) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    static final class w6 extends n {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.L0y.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i5) {
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
                            return L0y.incompleteStateFor(b4, b6);
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
                        return L0y.incompleteStateFor(b4, b7);
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
                        return L0y.incompleteStateFor(b4, b7, b8);
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
            return partialIsValidUtf8(bArr, i3, i5);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i2, int i3) {
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
                            return L0y.incompleteStateFor(bArr, i5, i3);
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
                        return L0y.incompleteStateFor(bArr, i5, i3);
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

        @Override // com.google.protobuf.L0y.n
        String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i5 = i2 + i3;
            char[] cArr = new char[i3];
            int i7 = 0;
            while (i2 < i5) {
                byte b2 = bArr[i2];
                if (!j.isOneByte(b2)) {
                    break;
                }
                i2++;
                j.handleOneByte(b2, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (i2 < i5) {
                int i9 = i2 + 1;
                byte b4 = bArr[i2];
                if (j.isOneByte(b4)) {
                    int i10 = i8 + 1;
                    j.handleOneByte(b4, cArr, i8);
                    int i11 = i9;
                    while (i11 < i5) {
                        byte b5 = bArr[i11];
                        if (!j.isOneByte(b5)) {
                            break;
                        }
                        i11++;
                        j.handleOneByte(b5, cArr, i10);
                        i10++;
                    }
                    i8 = i10;
                    i2 = i11;
                } else if (j.isTwoBytes(b4)) {
                    if (i9 >= i5) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i2 += 2;
                    j.handleTwoBytes(b4, bArr[i9], cArr, i8);
                    i8++;
                } else if (j.isThreeBytes(b4)) {
                    if (i9 >= i5 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i12 = i2 + 2;
                    i2 += 3;
                    j.handleThreeBytes(b4, bArr[i9], bArr[i12], cArr, i8);
                    i8++;
                } else {
                    if (i9 >= i5 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b6 = bArr[i9];
                    int i13 = i2 + 3;
                    byte b7 = bArr[i2 + 2];
                    i2 += 4;
                    j.handleFourBytes(b4, b6, b7, bArr[i13], cArr, i8);
                    i8 += 2;
                }
            }
            return new String(cArr, 0, i8);
        }

        w6() {
        }

        @Override // com.google.protobuf.L0y.n
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i2, i3);
        }

        @Override // com.google.protobuf.L0y.n
        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i2, int i3) {
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

        @Override // com.google.protobuf.L0y.n
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        @Override // com.google.protobuf.L0y.n
        int partialIsValidUtf8Direct(int i2, ByteBuffer byteBuffer, int i3, int i5) {
            return partialIsValidUtf8Default(i2, byteBuffer, i3, i5);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i2, int i3) {
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 >= i3) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i2, i3);
        }
    }

    static String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    static int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i5) {
        return processor.partialIsValidUtf8(i2, bArr, i3, i5);
    }

    static String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i2, i3);
    }

    static int encode(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return processor.encodeUtf8(charSequence, bArr, i2, i3);
    }

    static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i2, int i3) {
        int i5 = i3 - 7;
        int i7 = i2;
        while (i7 < i5 && (byteBuffer.getLong(i7) & ASCII_MASK_LONG) == 0) {
            i7 += 8;
        }
        return i7 - i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    static boolean isValidUtf8(byte[] bArr, int i2, int i3) {
        return processor.isValidUtf8(bArr, i2, i3);
    }

    static int partialIsValidUtf8(int i2, ByteBuffer byteBuffer, int i3, int i5) {
        return processor.partialIsValidUtf8(i2, byteBuffer, i3, i5);
    }

    static {
        n w6Var;
        if (I28.isAvailable() && !com.google.protobuf.Ml.isOnAndroidDevice()) {
            w6Var = new I28();
        } else {
            w6Var = new w6();
        }
        processor = w6Var;
    }

    private L0y() {
    }

    static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i2 < length) {
                char cCharAt = charSequence.charAt(i2);
                if (cCharAt < 2048) {
                    iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                    i2++;
                } else {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i2);
                    break;
                }
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i2) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i2, int i3, int i5) {
        if (i2 > -12 || i3 > -65 || i5 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i5 << 16);
    }

    static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i5 = i3 - i2;
        if (i5 == 0) {
            return incompleteStateFor(b2);
        }
        if (i5 == 1) {
            return incompleteStateFor(b2, bArr[i2]);
        }
        if (i5 == 2) {
            return incompleteStateFor(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i2, int i3, int i5) {
        if (i5 == 0) {
            return incompleteStateFor(i2);
        }
        if (i5 == 1) {
            return incompleteStateFor(i2, byteBuffer.get(i3));
        }
        if (i5 == 2) {
            return incompleteStateFor(i2, byteBuffer.get(i3), byteBuffer.get(i3 + 1));
        }
        throw new AssertionError();
    }
}
