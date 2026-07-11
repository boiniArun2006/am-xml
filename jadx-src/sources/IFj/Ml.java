package IFj;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int[] f4108n;
    private final int rl;

    private void J2(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != O()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + O());
        }
        int iRemaining = byteBuffer2.remaining();
        int i2 = iRemaining / 64;
        int i3 = i2 + 1;
        for (int i5 = 0; i5 < i3; i5++) {
            ByteBuffer byteBufferN = n(bArr, this.rl + i5);
            if (i5 == i2) {
                B8M.Wre.t(byteBuffer, byteBuffer2, byteBufferN, iRemaining % 64);
            } else {
                B8M.Wre.t(byteBuffer, byteBuffer2, byteBufferN, 64);
            }
        }
    }

    abstract int O();

    abstract int[] rl(int[] iArr, int i2);

    public Ml(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f4108n = j.O(bArr);
            this.rl = i2;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    ByteBuffer n(byte[] bArr, int i2) {
        int[] iArrRl = rl(j.O(bArr), i2);
        int[] iArr = (int[]) iArrRl.clone();
        j.nr(iArr);
        for (int i3 = 0; i3 < iArrRl.length; i3++) {
            iArrRl[i3] = iArrRl[i3] + iArr[i3];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrRl, 0, 16);
        return byteBufferOrder;
    }

    public void nr(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            J2(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public byte[] t(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        J2(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }
}
