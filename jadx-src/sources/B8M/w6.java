package B8M;

import gVA.n;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 implements gAe.j {
    public static final n.EnumC0945n rl = n.EnumC0945n.f67570t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IFj.n f390n;

    @Override // gAe.j
    public byte[] n(byte[] bArr, byte[] bArr2) {
        return this.f390n.rl(eO.t(12), bArr, bArr2);
    }

    @Override // gAe.j
    public byte[] rl(byte[] bArr, byte[] bArr2) {
        return this.f390n.n(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    public w6(byte[] bArr) throws GeneralSecurityException {
        if (rl.n()) {
            this.f390n = new IFj.n(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
