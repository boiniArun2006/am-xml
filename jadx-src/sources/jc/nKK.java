package jc;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class nKK implements gAe.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f69506t = new byte[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final uBO.g9s f69507n;
    private final gAe.j rl;

    private byte[] t(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // gAe.j
    public byte[] n(byte[] bArr, byte[] bArr2) {
        byte[] byteArray = gAe.r.mUb(this.f69507n).toByteArray();
        return t(this.rl.n(byteArray, f69506t), ((gAe.j) gAe.r.J2(this.f69507n.p5(), byteArray, gAe.j.class)).n(bArr, bArr2));
    }

    @Override // gAe.j
    public byte[] rl(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i2 = byteBufferWrap.getInt();
            if (i2 <= 0 || i2 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i2];
            byteBufferWrap.get(bArr3, 0, i2);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((gAe.j) gAe.r.J2(this.f69507n.p5(), this.rl.rl(bArr3, f69506t), gAe.j.class)).rl(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e4) {
            e = e4;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    public nKK(uBO.g9s g9sVar, gAe.j jVar) {
        this.f69507n = g9sVar;
        this.rl = jVar;
    }
}
