package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class z3 {
    public static String a(ByteBuffer byteBuffer, int i2, int i3) throws n1 {
        if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i5 = i2 + i3;
        char[] cArr = new char[i3];
        int i7 = 0;
        while (i2 < i5) {
            byte b2 = byteBuffer.get(i2);
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
            byte b4 = byteBuffer.get(i2);
            if (y3.a(b4)) {
                cArr[i8] = (char) b4;
                i8++;
                i2 = i9;
                while (i2 < i5) {
                    byte b5 = byteBuffer.get(i2);
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
                y3.a(b4, byteBuffer.get(i9), cArr, i8);
                i8++;
            } else if (b4 < -16) {
                if (i9 >= i5 - 1) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                int i10 = i2 + 2;
                i2 += 3;
                y3.a(b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i8);
                i8++;
            } else {
                if (i9 >= i5 - 2) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                byte b6 = byteBuffer.get(i9);
                int i11 = i2 + 3;
                byte b7 = byteBuffer.get(i2 + 2);
                i2 += 4;
                y3.a(b4, b6, b7, byteBuffer.get(i11), cArr, i8);
                i8 += 2;
            }
        }
        return new String(cArr, 0, i8);
    }

    public abstract int a(CharSequence charSequence, byte[] bArr, int i2, int i3);

    public abstract String a(byte[] bArr, int i2, int i3);

    public abstract String b(ByteBuffer byteBuffer, int i2, int i3);

    public final boolean b(byte[] bArr, int i2, int i3) {
        return c(bArr, i2, i3) == 0;
    }

    public abstract int c(byte[] bArr, int i2, int i3);
}
