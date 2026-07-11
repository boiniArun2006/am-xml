package B8M;

import gVA.n;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml implements gAe.I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final qz f371n;
    private final byte[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n.EnumC0945n f370t = n.EnumC0945n.f67569n;
    private static final Collection nr = Arrays.asList(64);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final byte[] f369O = new byte[16];
    private static final byte[] J2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    private byte[] t(byte[]... bArr) throws GeneralSecurityException {
        if (bArr.length == 0) {
            return this.f371n.n(J2, 16);
        }
        byte[] bArrN = this.f371n.n(f369O, 16);
        for (int i2 = 0; i2 < bArr.length - 1; i2++) {
            byte[] bArr2 = bArr[i2];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrN = Wre.O(ykH.j.rl(bArrN), this.f371n.n(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f371n.n(bArr3.length >= 16 ? Wre.J2(bArr3, bArrN) : Wre.O(ykH.j.n(bArr3), ykH.j.rl(bArrN)), 16);
    }

    @Override // gAe.I28
    public byte[] n(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) Dsr.rl.n("AES/CTR/NoPadding");
        byte[] bArrT = t(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrT.clone();
        bArr3[8] = (byte) (bArr3[8] & ByteCompanionObject.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & ByteCompanionObject.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.rl, "AES"), new IvParameterSpec(bArr3));
        return Wre.n(bArrT, cipher.doFinal(bArr));
    }

    @Override // gAe.I28
    public byte[] rl(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) Dsr.rl.n("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & ByteCompanionObject.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & ByteCompanionObject.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.rl, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && z.rl()) {
            bArrDoFinal = new byte[0];
        }
        if (Wre.rl(bArrCopyOfRange, t(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public Ml(byte[] bArr) throws GeneralSecurityException {
        if (f370t.n()) {
            if (nr.contains(Integer.valueOf(bArr.length))) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
                this.rl = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
                this.f371n = new qz(bArrCopyOfRange);
                return;
            } else {
                throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
            }
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }
}
