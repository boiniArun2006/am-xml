package T5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f10144n = new n();
    public static final j rl = new C0353n();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static w6 f10145t;

    public interface j {
    }

    /* JADX INFO: renamed from: T5.n$n, reason: collision with other inner class name */
    private static final class C0353n implements j {
    }

    public interface w6 {
        boolean isTracing();

        void n(String str);

        void rl();
    }

    public static final void n(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        f10144n.t().n(name);
    }

    public static final boolean nr() {
        return f10144n.t().isTracing();
    }

    public static final void rl() {
        f10144n.t().rl();
    }

    private final w6 t() {
        T5.j jVar;
        w6 w6Var = f10145t;
        if (w6Var != null) {
            return w6Var;
        }
        synchronized (n.class) {
            jVar = new T5.j();
            f10145t = jVar;
        }
        return jVar;
    }

    private n() {
    }
}
