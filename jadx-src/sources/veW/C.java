package veW;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C implements lK3.n {

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final C f74695n = new C();
    }

    public static C n() {
        return j.f74695n;
    }

    public static Executor rl() {
        return (Executor) lK3.Ml.nr(aC.n());
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return rl();
    }
}
