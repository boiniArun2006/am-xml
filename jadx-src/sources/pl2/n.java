package pl2;

import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Cipher f72039n;

    public n(Cipher cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.f72039n = cipher;
    }

    public /* synthetic */ n(Cipher cipher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Cipher.getInstance("RSA/ECB/PKCS1Padding") : cipher);
    }

    public final byte[] n(byte[] data, Key publicKey) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        this.f72039n.init(1, publicKey);
        byte[] bArrDoFinal = this.f72039n.doFinal(data);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public final PublicKey rl(byte[] base64EncodedKey) throws InvalidKeySpecException, NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(base64EncodedKey, "base64EncodedKey");
        byte[] bArrDecode = Base64.decode(base64EncodedKey, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArrDecode);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        Intrinsics.checkNotNullExpressionValue(keyFactory, "getInstance(...)");
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(x509EncodedKeySpec);
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, aNrWBQYwFf.yJNw);
        return publicKeyGeneratePublic;
    }
}
