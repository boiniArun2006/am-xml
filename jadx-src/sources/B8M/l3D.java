package B8M;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class l3D implements gAe.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IFj.fuX f384n;

    @Override // gAe.j
    public byte[] n(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrT = eO.t(24);
        byteBufferAllocate.put(bArrT);
        this.f384n.rl(byteBufferAllocate, bArrT, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // gAe.j
    public byte[] rl(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.f384n.n(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    public l3D(byte[] bArr) {
        this.f384n = new IFj.fuX(bArr);
    }
}
