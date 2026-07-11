package B8M;

import gAe.InterfaceC2113c;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class fuX implements gAe.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o f379n;
    private final InterfaceC2113c rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f380t;

    @Override // gAe.j
    public byte[] rl(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.f380t;
        if (length < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f380t, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.rl.n(bArrCopyOfRange2, Wre.n(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.f379n.rl(bArrCopyOfRange);
    }

    @Override // gAe.j
    public byte[] n(byte[] bArr, byte[] bArr2) {
        byte[] bArrN = this.f379n.n(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return Wre.n(bArrN, this.rl.rl(Wre.n(bArr2, bArrN, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    public fuX(o oVar, InterfaceC2113c interfaceC2113c, int i2) {
        this.f379n = oVar;
        this.rl = interfaceC2113c;
        this.f380t = i2;
    }
}
