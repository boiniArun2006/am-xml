package Qt;

import android.util.Pair;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SecretKey f8624n = null;
    public final AlgorithmParameterSpec nr = new Acl.j().n();
    public Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n f8625t;

    public final Pair n(String str) {
        if (this.rl != null) {
            return Ml.n(this.f8624n, str);
        }
        return null;
    }

    public final String rl(String str, byte[] bArr) {
        if (this.f8625t != null) {
            return j.n(j.rl(2, bArr, this.f8624n), str);
        }
        return null;
    }

    public final void t() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        eh.n.n("%s : init", "EncryptionManager");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("dtx_ignite_service_storage")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(this.nr);
            keyGenerator.generateKey();
        }
        Key key = keyStore.getKey("dtx_ignite_service_storage", null);
        if (key instanceof SecretKey) {
            this.f8624n = (SecretKey) key;
            this.rl = new Ml();
            this.f8625t = new n();
        }
    }
}
