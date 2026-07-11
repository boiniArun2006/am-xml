package B8M;

import gVA.n;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n implements gAe.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f386n;
    private final int nr;
    private final byte[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SecretKeySpec f387t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final n.EnumC0945n f385O = n.EnumC0945n.f67569n;
    private static final ThreadLocal J2 = new j();
    private static final ThreadLocal Uo = new C0009n();

    class j extends ThreadLocal {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) Dsr.rl.n("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }

        j() {
        }
    }

    /* JADX INFO: renamed from: B8M.n$n, reason: collision with other inner class name */
    class C0009n extends ThreadLocal {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) Dsr.rl.n("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }

        C0009n() {
        }
    }

    private static byte[] J2(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    private byte[] O(byte[] bArr) {
        if (bArr.length == 16) {
            return J2(bArr, this.f386n);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.rl, 16);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArrCopyOf[i2] = (byte) (bArrCopyOf[i2] ^ bArr[i2]);
        }
        bArrCopyOf[bArr.length] = (byte) (bArrCopyOf[bArr.length] ^ ByteCompanionObject.MIN_VALUE);
        return bArrCopyOf;
    }

    @Override // gAe.j
    public byte[] n(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.nr;
        if (length > 2147483631 - i2) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i2 + 16];
        byte[] bArrT = eO.t(i2);
        System.arraycopy(bArrT, 0, bArr3, 0, this.nr);
        Cipher cipher = (Cipher) J2.get();
        cipher.init(1, this.f387t);
        byte[] bArrNr = nr(cipher, 0, bArrT, 0, bArrT.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrNr2 = nr(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) Uo.get();
        cipher2.init(1, this.f387t, new IvParameterSpec(bArrNr));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.nr);
        byte[] bArrNr3 = nr(cipher, 2, bArr3, this.nr, bArr.length);
        int length2 = bArr.length + this.nr;
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[length2 + i3] = (byte) ((bArrNr2[i3] ^ bArrNr[i3]) ^ bArrNr3[i3]);
        }
        return bArr3;
    }

    @Override // gAe.j
    public byte[] rl(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = (bArr.length - this.nr) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) J2.get();
        cipher.init(1, this.f387t);
        byte[] bArrNr = nr(cipher, 0, bArr, 0, this.nr);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrNr2 = nr(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrNr3 = nr(cipher, 2, bArr, this.nr, length);
        int length2 = bArr.length - 16;
        byte b2 = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            b2 = (byte) (b2 | (((bArr[length2 + i2] ^ bArrNr2[i2]) ^ bArrNr[i2]) ^ bArrNr3[i2]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) Uo.get();
        cipher2.init(1, this.f387t, new IvParameterSpec(bArrNr));
        return cipher2.doFinal(bArr, this.nr, length);
    }

    private byte[] nr(Cipher cipher, int i2, byte[] bArr, int i3, int i5) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i2;
        if (i5 == 0) {
            return cipher.doFinal(J2(bArr2, this.f386n));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i7 = 0;
        while (i5 - i7 > 16) {
            for (int i8 = 0; i8 < 16; i8++) {
                bArrDoFinal[i8] = (byte) (bArrDoFinal[i8] ^ bArr[(i3 + i7) + i8]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i7 += 16;
        }
        return cipher.doFinal(J2(bArrDoFinal, O(Arrays.copyOfRange(bArr, i7 + i3, i3 + i5))));
    }

    private static byte[] t(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) (((bArr[i2] << 1) ^ ((bArr[i3] & UByte.MAX_VALUE) >>> 7)) & 255);
            i2 = i3;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public n(byte[] bArr, int i2) throws GeneralSecurityException {
        if (f385O.n()) {
            if (i2 != 12 && i2 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.nr = i2;
            QJ.n(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f387t = secretKeySpec;
            Cipher cipher = (Cipher) J2.get();
            cipher.init(1, secretKeySpec);
            byte[] bArrT = t(cipher.doFinal(new byte[16]));
            this.f386n = bArrT;
            this.rl = t(bArrT);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }
}
