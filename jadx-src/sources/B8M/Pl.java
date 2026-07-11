package B8M;

import gVA.n;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Pl implements BdT.j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final n.EnumC0945n f372O = n.EnumC0945n.f67570t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ThreadLocal f373n;
    private final int nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Key f374t;

    class j extends ThreadLocal {
        j() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac mac = (Mac) Dsr.f358t.n(Pl.this.rl);
                mac.init(Pl.this.f374t);
                return mac;
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    @Override // BdT.j
    public byte[] n(byte[] bArr, int i2) throws InvalidAlgorithmParameterException {
        if (i2 > this.nr) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f373n.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f373n.get()).doFinal(), i2);
    }

    public Pl(String str, Key key) throws GeneralSecurityException {
        j jVar = new j();
        this.f373n = jVar;
        if (f372O.n()) {
            this.rl = str;
            this.f374t = key;
            if (key.getEncoded().length >= 16) {
                str.getClass();
                switch (str) {
                    case "HMACSHA1":
                        this.nr = 20;
                        break;
                    case "HMACSHA224":
                        this.nr = 28;
                        break;
                    case "HMACSHA256":
                        this.nr = 32;
                        break;
                    case "HMACSHA384":
                        this.nr = 48;
                        break;
                    case "HMACSHA512":
                        this.nr = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
                }
                jVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
