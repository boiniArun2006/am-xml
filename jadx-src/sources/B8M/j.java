package B8M;

import gVA.n;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SecretKeySpec f382n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f383t;
    public static final n.EnumC0945n nr = n.EnumC0945n.f67570t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ThreadLocal f381O = new C0008j();

    /* JADX INFO: renamed from: B8M.j$j, reason: collision with other inner class name */
    class C0008j extends ThreadLocal {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) Dsr.rl.n("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }

        C0008j() {
        }
    }

    @Override // B8M.o
    public byte[] n(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.rl;
        if (length > Integer.MAX_VALUE - i2) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.rl));
        }
        byte[] bArr2 = new byte[bArr.length + i2];
        byte[] bArrT = eO.t(i2);
        System.arraycopy(bArrT, 0, bArr2, 0, this.rl);
        t(bArr, 0, bArr.length, bArr2, this.rl, bArrT, true);
        return bArr2;
    }

    @Override // B8M.o
    public byte[] rl(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.rl;
        if (length < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        int length2 = bArr.length;
        int i3 = this.rl;
        byte[] bArr3 = new byte[length2 - i3];
        t(bArr, i3, bArr.length - i3, bArr3, 0, bArr2, false);
        return bArr3;
    }

    private void t(byte[] bArr, int i2, int i3, byte[] bArr2, int i5, byte[] bArr3, boolean z2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f381O.get();
        byte[] bArr4 = new byte[this.f383t];
        System.arraycopy(bArr3, 0, bArr4, 0, this.rl);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z2) {
            cipher.init(1, this.f382n, ivParameterSpec);
        } else {
            cipher.init(2, this.f382n, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i2, i3, bArr2, i5) != i3) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    public j(byte[] bArr, int i2) throws GeneralSecurityException {
        if (nr.n()) {
            QJ.n(bArr.length);
            this.f382n = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f381O.get()).getBlockSize();
            this.f383t = blockSize;
            if (i2 >= 12 && i2 <= blockSize) {
                this.rl = i2;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }
}
