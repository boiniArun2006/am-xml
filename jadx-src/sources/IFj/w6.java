package IFj;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class w6 extends Ml {
    @Override // IFj.Ml
    public int[] rl(int[] iArr, int i2) {
        if (iArr.length != O() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        j.t(iArr2, this.f4108n);
        iArr2[12] = i2;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // IFj.Ml
    public int O() {
        return 12;
    }

    public w6(byte[] bArr, int i2) {
        super(bArr, i2);
    }

    @Override // IFj.Ml
    public /* bridge */ /* synthetic */ void nr(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.nr(byteBuffer, bArr, bArr2);
    }

    @Override // IFj.Ml
    public /* bridge */ /* synthetic */ byte[] t(byte[] bArr, ByteBuffer byteBuffer) {
        return super.t(bArr, byteBuffer);
    }
}
