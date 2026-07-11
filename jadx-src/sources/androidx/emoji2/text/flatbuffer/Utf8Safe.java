package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Utf8Safe extends Utf8 {

    static class UnpairedSurrogateException extends IllegalArgumentException {
    }

    public static String rl(byte[] bArr, int i2, int i3) {
        if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i5 = i2 + i3;
        char[] cArr = new char[i3];
        int i7 = 0;
        while (i2 < i5) {
            byte b2 = bArr[i2];
            if (!Utf8.DecodeUtil.Uo(b2)) {
                break;
            }
            i2++;
            Utf8.DecodeUtil.rl(b2, cArr, i7);
            i7++;
        }
        int i8 = i7;
        while (i2 < i5) {
            int i9 = i2 + 1;
            byte b4 = bArr[i2];
            if (Utf8.DecodeUtil.Uo(b4)) {
                int i10 = i8 + 1;
                Utf8.DecodeUtil.rl(b4, cArr, i8);
                int i11 = i9;
                while (i11 < i5) {
                    byte b5 = bArr[i11];
                    if (!Utf8.DecodeUtil.Uo(b5)) {
                        break;
                    }
                    i11++;
                    Utf8.DecodeUtil.rl(b5, cArr, i10);
                    i10++;
                }
                i8 = i10;
                i2 = i11;
            } else if (Utf8.DecodeUtil.xMQ(b4)) {
                if (i9 >= i5) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i2 += 2;
                Utf8.DecodeUtil.nr(b4, bArr[i9], cArr, i8);
                i8++;
            } else if (Utf8.DecodeUtil.KN(b4)) {
                if (i9 >= i5 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i12 = i2 + 2;
                i2 += 3;
                Utf8.DecodeUtil.t(b4, bArr[i9], bArr[i12], cArr, i8);
                i8++;
            } else {
                if (i9 >= i5 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b6 = bArr[i9];
                int i13 = i2 + 3;
                byte b7 = bArr[i2 + 2];
                i2 += 4;
                Utf8.DecodeUtil.n(b4, b6, b7, bArr[i13], cArr, i8);
                i8 += 2;
            }
        }
        return new String(cArr, 0, i8);
    }

    public static String t(ByteBuffer byteBuffer, int i2, int i3) {
        if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i5 = i2 + i3;
        char[] cArr = new char[i3];
        int i7 = 0;
        while (i2 < i5) {
            byte b2 = byteBuffer.get(i2);
            if (!Utf8.DecodeUtil.Uo(b2)) {
                break;
            }
            i2++;
            Utf8.DecodeUtil.rl(b2, cArr, i7);
            i7++;
        }
        int i8 = i7;
        while (i2 < i5) {
            int i9 = i2 + 1;
            byte b4 = byteBuffer.get(i2);
            if (Utf8.DecodeUtil.Uo(b4)) {
                int i10 = i8 + 1;
                Utf8.DecodeUtil.rl(b4, cArr, i8);
                int i11 = i9;
                while (i11 < i5) {
                    byte b5 = byteBuffer.get(i11);
                    if (!Utf8.DecodeUtil.Uo(b5)) {
                        break;
                    }
                    i11++;
                    Utf8.DecodeUtil.rl(b5, cArr, i10);
                    i10++;
                }
                i8 = i10;
                i2 = i11;
            } else if (Utf8.DecodeUtil.xMQ(b4)) {
                if (i9 >= i5) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i2 += 2;
                Utf8.DecodeUtil.nr(b4, byteBuffer.get(i9), cArr, i8);
                i8++;
            } else if (Utf8.DecodeUtil.KN(b4)) {
                if (i9 >= i5 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i12 = i2 + 2;
                i2 += 3;
                Utf8.DecodeUtil.t(b4, byteBuffer.get(i9), byteBuffer.get(i12), cArr, i8);
                i8++;
            } else {
                if (i9 >= i5 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b6 = byteBuffer.get(i9);
                int i13 = i2 + 3;
                byte b7 = byteBuffer.get(i2 + 2);
                i2 += 4;
                Utf8.DecodeUtil.n(b4, b6, b7, byteBuffer.get(i13), cArr, i8);
                i8 += 2;
            }
        }
        return new String(cArr, 0, i8);
    }
}
