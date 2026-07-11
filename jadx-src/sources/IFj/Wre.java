package IFj;

import gVA.n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class Wre {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n.EnumC0945n f4109t = n.EnumC0945n.f67569n;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f4110n;
    private final Ml rl;

    private static byte[] nr(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i2 = iRemaining % 16;
        int i3 = (i2 == 0 ? iRemaining : (iRemaining + 16) - i2) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i3);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    abstract Ml O(byte[] bArr, int i2);

    private byte[] t(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.rl.n(bArr, 0).get(bArr2);
        return bArr2;
    }

    public Wre(byte[] bArr) throws GeneralSecurityException {
        if (f4109t.n()) {
            this.f4110n = O(bArr, 1);
            this.rl = O(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public byte[] n(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= 16) {
            int iPosition = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(iPosition);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                Dsr.J2(t(bArr), nr(bArr2, byteBuffer), bArr3);
                byteBuffer.position(iPosition);
                return this.f4110n.t(bArr, byteBuffer);
            } catch (GeneralSecurityException e2) {
                throw new AEADBadTagException(e2.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public void rl(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int iPosition = byteBuffer.position();
            this.f4110n.nr(byteBuffer, bArr, bArr2);
            byteBuffer.position(iPosition);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            byte[] bArrN = Dsr.n(t(bArr), nr(bArr3, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(bArrN);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
