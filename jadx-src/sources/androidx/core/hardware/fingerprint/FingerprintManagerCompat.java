package androidx.core.hardware.fingerprint;

import android.hardware.fingerprint.FingerprintManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
@Deprecated
public class FingerprintManagerCompat {

    /* JADX INFO: renamed from: androidx.core.hardware.fingerprint.FingerprintManagerCompat$1, reason: invalid class name */
    class AnonymousClass1 extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AuthenticationCallback f36452n;

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i2, CharSequence charSequence) {
            this.f36452n.n(i2, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f36452n.rl();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i2, CharSequence charSequence) {
            this.f36452n.t(i2, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f36452n.nr(new AuthenticationResult(FingerprintManagerCompat.n(Api23Impl.n(authenticationResult))));
        }
    }

    @RequiresApi
    static class Api23Impl {
        static FingerprintManager.CryptoObject n(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static CryptoObject rl(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new CryptoObject(cryptoObject.getMac());
            }
            return null;
        }
    }

    public static abstract class AuthenticationCallback {
        public void n(int i2, CharSequence charSequence) {
        }

        public void nr(AuthenticationResult authenticationResult) {
        }

        public void rl() {
        }

        public void t(int i2, CharSequence charSequence) {
        }
    }

    public static final class AuthenticationResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CryptoObject f36453n;

        public AuthenticationResult(CryptoObject cryptoObject) {
            this.f36453n = cryptoObject;
        }
    }

    static CryptoObject n(FingerprintManager.CryptoObject cryptoObject) {
        return Api23Impl.rl(cryptoObject);
    }

    public static class CryptoObject {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Signature f36454n;
        private final Cipher rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Mac f36455t;

        public CryptoObject(Signature signature) {
            this.f36454n = signature;
            this.rl = null;
            this.f36455t = null;
        }

        public CryptoObject(Cipher cipher) {
            this.rl = cipher;
            this.f36454n = null;
            this.f36455t = null;
        }

        public CryptoObject(Mac mac) {
            this.f36455t = mac;
            this.rl = null;
            this.f36454n = null;
        }
    }
}
