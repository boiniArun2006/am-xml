package IFj;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f4111n = O(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static void n(int[] iArr, int i2, int i3, int i5, int i7) {
        int i8 = iArr[i2] + iArr[i3];
        iArr[i2] = i8;
        int iRl = rl(i8 ^ iArr[i7], 16);
        iArr[i7] = iRl;
        int i9 = iArr[i5] + iRl;
        iArr[i5] = i9;
        int iRl2 = rl(iArr[i3] ^ i9, 12);
        iArr[i3] = iRl2;
        int i10 = iArr[i2] + iRl2;
        iArr[i2] = i10;
        int iRl3 = rl(iArr[i7] ^ i10, 8);
        iArr[i7] = iRl3;
        int i11 = iArr[i5] + iRl3;
        iArr[i5] = i11;
        iArr[i3] = rl(iArr[i3] ^ i11, 7);
    }

    static void nr(int[] iArr) {
        for (int i2 = 0; i2 < 10; i2++) {
            n(iArr, 0, 4, 8, 12);
            n(iArr, 1, 5, 9, 13);
            n(iArr, 2, 6, 10, 14);
            n(iArr, 3, 7, 11, 15);
            n(iArr, 0, 5, 10, 15);
            n(iArr, 1, 6, 11, 12);
            n(iArr, 2, 7, 8, 13);
            n(iArr, 3, 4, 9, 14);
        }
    }

    private static int rl(int i2, int i3) {
        return (i2 >>> (-i3)) | (i2 << i3);
    }

    static void t(int[] iArr, int[] iArr2) {
        int[] iArr3 = f4111n;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static int[] O(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
