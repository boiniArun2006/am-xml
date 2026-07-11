package B8M;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class CN3 implements gAe.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IFj.I28 f356n;

    @Override // gAe.j
    public byte[] n(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrT = eO.t(12);
        byteBufferAllocate.put(bArrT);
        this.f356n.rl(byteBufferAllocate, bArrT, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // gAe.j
    public byte[] rl(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return this.f356n.n(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }

    public CN3(byte[] bArr) {
        this.f356n = new IFj.I28(bArr);
    }
}
