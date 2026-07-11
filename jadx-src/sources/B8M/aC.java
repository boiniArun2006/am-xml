package B8M;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface aC {

    public static class CN3 implements aC {
        @Override // B8M.aC
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Signature n(String str, Provider provider) {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    public static class I28 implements aC {
        @Override // B8M.aC
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Mac n(String str, Provider provider) {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    public static class Ml implements aC {
        @Override // B8M.aC
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public KeyPairGenerator n(String str, Provider provider) {
            return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
        }
    }

    public static class Wre implements aC {
        @Override // B8M.aC
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public MessageDigest n(String str, Provider provider) {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    public static class j implements aC {
        @Override // B8M.aC
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Cipher n(String str, Provider provider) {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    public static class n implements aC {
        @Override // B8M.aC
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public KeyAgreement n(String str, Provider provider) {
            return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
        }
    }

    public static class w6 implements aC {
        @Override // B8M.aC
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public KeyFactory n(String str, Provider provider) {
            return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
        }
    }

    Object n(String str, Provider provider);
}
