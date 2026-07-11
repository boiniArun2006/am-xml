package B8M;

import java.security.SecureRandom;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f378n = new j();

    class j extends ThreadLocal {
        j() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return eO.rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom rl() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] t(int i2) {
        byte[] bArr = new byte[i2];
        ((SecureRandom) f378n.get()).nextBytes(bArr);
        return bArr;
    }
}
