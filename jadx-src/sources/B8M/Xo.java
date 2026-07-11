package B8M;

import gAe.InterfaceC2113c;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Xo implements InterfaceC2113c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final BdT.j f377n;
    private final int rl;

    @Override // gAe.InterfaceC2113c
    public byte[] rl(byte[] bArr) {
        return this.f377n.n(bArr, this.rl);
    }

    public Xo(BdT.j jVar, int i2) throws InvalidAlgorithmParameterException {
        this.f377n = jVar;
        this.rl = i2;
        if (i2 >= 10) {
            jVar.n(new byte[0], i2);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // gAe.InterfaceC2113c
    public void n(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (Wre.rl(rl(bArr2), bArr)) {
        } else {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
