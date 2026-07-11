package pl2;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {
    private static final C1104j rl = new C1104j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Cipher f72038n;

    /* JADX INFO: renamed from: pl2.j$j, reason: collision with other inner class name */
    private static final class C1104j {
        public /* synthetic */ C1104j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1104j() {
        }
    }

    public j(Cipher cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.f72038n = cipher;
    }

    private final Cipher n(int i2, byte[] bArr, byte[] bArr2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr.length != 16) {
            throw new RuntimeException("SecretKey length is not 16 chars");
        }
        this.f72038n.init(i2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return this.f72038n;
    }

    public /* synthetic */ j(Cipher cipher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Cipher.getInstance("AES/CBC/PKCS5Padding") : cipher);
    }

    public final byte[] rl(byte[] ba, byte[] secretKey, byte[] iv) throws BadPaddingException, IllegalBlockSizeException {
        Intrinsics.checkNotNullParameter(ba, "ba");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(iv, "iv");
        byte[] bArrDoFinal = n(2, secretKey, iv).doFinal(ba);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public final byte[] t(byte[] ba, byte[] secretKey, byte[] iv) throws BadPaddingException, IllegalBlockSizeException {
        Intrinsics.checkNotNullParameter(ba, "ba");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(iv, "iv");
        byte[] bArrDoFinal = n(1, secretKey, iv).doFinal(ba);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }
}
