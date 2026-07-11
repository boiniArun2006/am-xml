package B8M;

import B8M.aC;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f359n;
    public static final Dsr rl = new Dsr(new aC.j());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Dsr f358t = new Dsr(new aC.I28());
    public static final Dsr nr = new Dsr(new aC.CN3());

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Dsr f357O = new Dsr(new aC.Wre());
    public static final Dsr J2 = new Dsr(new aC.n());
    public static final Dsr Uo = new Dsr(new aC.Ml());
    public static final Dsr KN = new Dsr(new aC.w6());

    private interface I28 {
        Object n(String str);
    }

    private static class Ml implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final aC f360n;

        private Ml(aC aCVar) {
            this.f360n = aCVar;
        }

        @Override // B8M.Dsr.I28
        public Object n(String str) throws GeneralSecurityException {
            Iterator it = Dsr.rl("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f360n.n(str, (Provider) it.next());
                } catch (Exception e2) {
                    if (exc == null) {
                        exc = e2;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    private static class n implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final aC f361n;

        private n(aC aCVar) {
            this.f361n = aCVar;
        }

        @Override // B8M.Dsr.I28
        public Object n(String str) {
            Iterator it = Dsr.rl("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f361n.n(str, (Provider) it.next());
                } catch (Exception e2) {
                    if (exc == null) {
                        exc = e2;
                    }
                }
            }
            return this.f361n.n(str, null);
        }
    }

    private static class w6 implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final aC f362n;

        private w6(aC aCVar) {
            this.f362n = aCVar;
        }

        @Override // B8M.Dsr.I28
        public Object n(String str) {
            return this.f362n.n(str, null);
        }
    }

    public static List rl(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object n(String str) {
        return this.f359n.n(str);
    }

    public Dsr(aC aCVar) {
        if (gVA.n.t()) {
            this.f359n = new Ml(aCVar);
        } else if (z.rl()) {
            this.f359n = new n(aCVar);
        } else {
            this.f359n = new w6(aCVar);
        }
    }
}
