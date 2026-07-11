package gX;

import Cvc.n;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class CN3 {
    private static final CN3 rl = new CN3();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final n f67573t = new n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReference f67574n = new AtomicReference();

    private static class n implements Cvc.n {
        private n() {
        }

        @Override // Cvc.n
        public n.j n(Cvc.w6 w6Var, String str, String str2) {
            return Wre.f67591n;
        }
    }

    public static CN3 rl() {
        return rl;
    }

    public Cvc.n n() {
        Cvc.n nVar = (Cvc.n) this.f67574n.get();
        return nVar == null ? f67573t : nVar;
    }
}
