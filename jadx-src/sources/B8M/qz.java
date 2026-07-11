package B8M;

import gVA.n;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class qz implements BdT.j {
    public static final n.EnumC0945n nr = n.EnumC0945n.f67569n;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SecretKey f388n;
    private byte[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private byte[] f389t;

    private static Cipher t() throws GeneralSecurityException {
        if (nr.n()) {
            return (Cipher) Dsr.rl.n("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // BdT.j
    public byte[] n(byte[] bArr, int i2) throws GeneralSecurityException {
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherT = t();
        cipherT.init(1, this.f388n);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        byte[] bArrNr = iMax * 16 == bArr.length ? Wre.nr(bArr, (iMax - 1) * 16, this.rl, 0, 16) : Wre.O(ykH.j.n(Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length)), this.f389t);
        byte[] bArrDoFinal = new byte[16];
        for (int i3 = 0; i3 < iMax - 1; i3++) {
            bArrDoFinal = cipherT.doFinal(Wre.nr(bArrDoFinal, 0, bArr, i3 * 16, 16));
        }
        return Arrays.copyOf(cipherT.doFinal(Wre.O(bArrNr, bArrDoFinal)), i2);
    }

    public qz(byte[] bArr) throws GeneralSecurityException {
        QJ.n(bArr.length);
        this.f388n = new SecretKeySpec(bArr, "AES");
        rl();
    }

    private void rl() throws GeneralSecurityException {
        Cipher cipherT = t();
        cipherT.init(1, this.f388n);
        byte[] bArrRl = ykH.j.rl(cipherT.doFinal(new byte[16]));
        this.rl = bArrRl;
        this.f389t = ykH.j.rl(bArrRl);
    }
}
