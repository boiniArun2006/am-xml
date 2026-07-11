package P3;

import B8M.Dsr;
import B8M.QJ;
import B8M.eO;
import B8M.z;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements gAe.j {
    private static final ThreadLocal rl = new C0263j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SecretKey f7571n;

    /* JADX INFO: renamed from: P3.j$j, reason: collision with other inner class name */
    class C0263j extends ThreadLocal {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) Dsr.rl.n("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }

        C0263j() {
        }
    }

    private static AlgorithmParameterSpec t(byte[] bArr) {
        return nr(bArr, 0, bArr.length);
    }

    @Override // gAe.j
    public byte[] n(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrT = eO.t(12);
        System.arraycopy(bArrT, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecT = t(bArrT);
        ThreadLocal threadLocal = rl;
        ((Cipher) threadLocal.get()).init(1, this.f7571n, algorithmParameterSpecT);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }

    @Override // gAe.j
    public byte[] rl(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecNr = nr(bArr, 0, 12);
        ThreadLocal threadLocal = rl;
        ((Cipher) threadLocal.get()).init(2, this.f7571n, algorithmParameterSpecNr);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr, 12, bArr.length - 12);
    }

    private static AlgorithmParameterSpec nr(byte[] bArr, int i2, int i3) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i2, i3);
        } catch (ClassNotFoundException unused) {
            if (z.rl()) {
                return new IvParameterSpec(bArr, i2, i3);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    public j(byte[] bArr) throws InvalidAlgorithmParameterException {
        QJ.n(bArr.length);
        this.f7571n = new SecretKeySpec(bArr, "AES");
    }
}
