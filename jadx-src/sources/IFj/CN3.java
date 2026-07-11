package IFj;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class CN3 extends Ml {
    @Override // IFj.Ml
    int[] rl(int[] iArr, int i2) {
        if (iArr.length != O() / 4) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        j.t(iArr2, Uo(this.f4108n, iArr));
        iArr2[12] = i2;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    static int[] Uo(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        j.t(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        j.nr(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    @Override // IFj.Ml
    int O() {
        return 24;
    }

    public CN3(byte[] bArr, int i2) {
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
