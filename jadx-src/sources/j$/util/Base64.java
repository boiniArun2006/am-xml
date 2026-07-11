package j$.util;

import j$.sun.nio.cs.c;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public class Base64 {
    public static Encoder getEncoder() {
        return Encoder.f69234c;
    }

    public static Decoder getDecoder() {
        return Decoder.f69231c;
    }

    public static class Encoder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final char[] f69232a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final char[] f69233b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final Encoder f69234c = new Encoder();

        public String encodeToString(byte[] bArr) {
            int length = ((bArr.length + 2) / 3) * 4;
            byte[] bArrCopyOf = new byte[length];
            int length2 = bArr.length;
            char[] cArr = f69232a;
            int i2 = (length2 / 3) * 3;
            int i3 = 0;
            int i5 = 0;
            while (i3 < i2) {
                int iMin = Math.min(i3 + i2, i2);
                int i7 = i3;
                int i8 = i5;
                while (i7 < iMin) {
                    int i9 = i7 + 2;
                    int i10 = ((bArr[i7 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i7] & UByte.MAX_VALUE) << 16);
                    i7 += 3;
                    int i11 = i10 | (bArr[i9] & UByte.MAX_VALUE);
                    bArrCopyOf[i8] = (byte) cArr[(i11 >>> 18) & 63];
                    bArrCopyOf[i8 + 1] = (byte) cArr[(i11 >>> 12) & 63];
                    int i12 = i8 + 3;
                    bArrCopyOf[i8 + 2] = (byte) cArr[(i11 >>> 6) & 63];
                    i8 += 4;
                    bArrCopyOf[i12] = (byte) cArr[i11 & 63];
                }
                int i13 = ((iMin - i3) / 3) * 4;
                i5 += i13;
                if (i13 == -1 && iMin < length2) {
                    throw null;
                }
                i3 = iMin;
            }
            if (i3 < length2) {
                int i14 = i3 + 1;
                int i15 = bArr[i3] & UByte.MAX_VALUE;
                int i16 = i5 + 1;
                bArrCopyOf[i5] = (byte) cArr[i15 >> 2];
                if (i14 == length2) {
                    bArrCopyOf[i16] = (byte) cArr[(i15 << 4) & 63];
                    int i17 = i5 + 3;
                    bArrCopyOf[i5 + 2] = kotlin.io.encoding.Base64.padSymbol;
                    i5 += 4;
                    bArrCopyOf[i17] = kotlin.io.encoding.Base64.padSymbol;
                } else {
                    int i18 = bArr[i14] & UByte.MAX_VALUE;
                    bArrCopyOf[i16] = (byte) cArr[((i15 << 4) & 63) | (i18 >> 4)];
                    int i19 = i5 + 3;
                    bArrCopyOf[i5 + 2] = (byte) cArr[(i18 << 2) & 63];
                    i5 += 4;
                    bArrCopyOf[i19] = kotlin.io.encoding.Base64.padSymbol;
                }
            }
            if (i5 != length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
            }
            return new String(bArrCopyOf, 0, 0, bArrCopyOf.length);
        }
    }

    public static class Decoder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int[] f69229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int[] f69230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final Decoder f69231c;

        static {
            int[] iArr = new int[256];
            f69229a = iArr;
            Arrays.fill(iArr, -1);
            for (int i2 = 0; i2 < 64; i2++) {
                f69229a[Encoder.f69232a[i2]] = i2;
            }
            f69229a[61] = -2;
            int[] iArr2 = new int[256];
            f69230b = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i3 = 0; i3 < 64; i3++) {
                f69230b[Encoder.f69233b[i3]] = i3;
            }
            f69230b[61] = -2;
            f69231c = new Decoder();
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
        
            if (r10 != 18) goto L55;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public byte[] decode(String str) {
            int i2;
            int i3;
            int i5;
            char c2;
            byte[] bytes = str.getBytes(c.f68895a);
            int length = bytes.length;
            int[] iArr = f69229a;
            char c4 = 2;
            if (length == 0) {
                i3 = 0;
            } else {
                if (length < 2) {
                    throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
                }
                if (bytes[length - 1] == 61) {
                    i2 = bytes[length + (-2)] == 61 ? 2 : 1;
                } else {
                    i2 = 0;
                }
                if (i2 == 0 && (i5 = length & 3) != 0) {
                    i2 = 4 - i5;
                }
                i3 = (((length + 3) / 4) * 3) - i2;
            }
            byte[] bArr = new byte[i3];
            int length2 = bytes.length;
            int i7 = 18;
            int i8 = 18;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i9 >= length2) {
                    break;
                }
                if (i8 == i7 && i9 + 4 < length2) {
                    int i12 = ((length2 - i9) & (-4)) + i9;
                    while (true) {
                        if (i9 >= i12) {
                            c2 = c4;
                            break;
                        }
                        c2 = c4;
                        int i13 = iArr[bytes[i9] & UByte.MAX_VALUE];
                        int i14 = iArr[bytes[i9 + 1] & UByte.MAX_VALUE];
                        int i15 = iArr[bytes[i9 + 2] & UByte.MAX_VALUE];
                        int i16 = i9 + 4;
                        int i17 = iArr[bytes[i9 + 3] & UByte.MAX_VALUE];
                        if ((i13 | i14 | i15 | i17) < 0) {
                            break;
                        }
                        int i18 = (i13 << 18) | (i14 << 12) | (i15 << 6) | i17;
                        bArr[i10] = (byte) (i18 >> 16);
                        int i19 = i10 + 2;
                        bArr[i10 + 1] = (byte) (i18 >> 8);
                        i10 += 3;
                        bArr[i19] = (byte) i18;
                        c4 = c2;
                        i9 = i16;
                    }
                    if (i9 < length2) {
                        break;
                        break;
                    }
                    break;
                }
                c2 = c4;
                int i20 = i9 + 1;
                int i21 = iArr[bytes[i9] & UByte.MAX_VALUE];
                if (i21 >= 0) {
                    i7 = 18;
                    int i22 = (i21 << i8) | i11;
                    i8 -= 6;
                    if (i8 < 0) {
                        bArr[i10] = (byte) (i22 >> 16);
                        int i23 = i10 + 2;
                        bArr[i10 + 1] = (byte) (i22 >> 8);
                        i10 += 3;
                        bArr[i23] = (byte) i22;
                        i8 = 18;
                        i11 = 0;
                    } else {
                        i11 = i22;
                    }
                    i9 = i20;
                    c4 = c2;
                } else {
                    if (i21 != -2) {
                        throw new IllegalArgumentException("Illegal base64 character " + Integer.toString(bytes[i9], 16));
                    }
                    if (i8 == 6) {
                        if (i20 != length2) {
                            i9 += 2;
                            if (bytes[i20] == 61) {
                            }
                        }
                        throw new IllegalArgumentException("Input byte array has wrong 4-byte ending unit");
                    }
                    i9 = i20;
                }
            }
            if (i8 == 6) {
                bArr[i10] = (byte) (i11 >> 16);
                i10++;
            } else if (i8 == 0) {
                int i24 = i10 + 1;
                bArr[i10] = (byte) (i11 >> 16);
                i10 += 2;
                bArr[i24] = (byte) (i11 >> 8);
            } else if (i8 == 12) {
                throw new IllegalArgumentException("Last unit does not have enough valid bits");
            }
            if (i9 >= length2) {
                return i10 != i3 ? Arrays.copyOf(bArr, i10) : bArr;
            }
            throw new IllegalArgumentException("Input byte array has incorrect ending byte at " + i9);
        }
    }
}
