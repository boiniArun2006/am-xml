package IFj;

import B8M.QJ;
import B8M.z;
import gVA.n;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SecretKey f4113n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n.EnumC0945n f4112t = n.EnumC0945n.f67570t;
    private static final ThreadLocal nr = new j();

    class j extends ThreadLocal {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) B8M.Dsr.rl.n("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }

        j() {
        }
    }

    private static AlgorithmParameterSpec t(byte[] bArr) {
        return nr(bArr, 0, bArr.length);
    }

    public byte[] n(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z2 = this.rl;
        if (bArr2.length < (z2 ? 28 : 16)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z2 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec algorithmParameterSpecT = t(bArr);
        ThreadLocal threadLocal = nr;
        ((Cipher) threadLocal.get()).init(2, this.f4113n, algorithmParameterSpecT);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        boolean z3 = this.rl;
        return ((Cipher) threadLocal.get()).doFinal(bArr2, z3 ? 12 : 0, z3 ? bArr2.length - 12 : bArr2.length);
    }

    public byte[] rl(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z2 = this.rl;
        byte[] bArr4 = new byte[z2 ? bArr2.length + 28 : bArr2.length + 16];
        if (z2) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpecT = t(bArr);
        ThreadLocal threadLocal = nr;
        ((Cipher) threadLocal.get()).init(1, this.f4113n, algorithmParameterSpecT);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, bArr2.length, bArr4, this.rl ? 12 : 0);
        if (iDoFinal == bArr2.length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr2.length)));
    }

    public n(byte[] bArr, boolean z2) throws GeneralSecurityException {
        if (f4112t.n()) {
            QJ.n(bArr.length);
            this.f4113n = new SecretKeySpec(bArr, "AES");
            this.rl = z2;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    private static AlgorithmParameterSpec nr(byte[] bArr, int i2, int i3) {
        if (z.rl() && z.n() <= 19) {
            return new IvParameterSpec(bArr, i2, i3);
        }
        return new GCMParameterSpec(128, bArr, i2, i3);
    }
}
