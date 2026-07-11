package gX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f67571n;
    private final Class rl;

    class j extends C {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ n f67572t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Class cls, Class cls2, n nVar) {
            super(cls, cls2, null);
            this.f67572t = nVar;
        }
    }

    public interface n {
    }

    /* synthetic */ C(Class cls, Class cls2, j jVar) {
        this(cls, cls2);
    }

    private C(Class cls, Class cls2) {
        this.f67571n = cls;
        this.rl = cls2;
    }

    public static C n(n nVar, Class cls, Class cls2) {
        return new j(cls, cls2, nVar);
    }

    public Class rl() {
        return this.f67571n;
    }

    public Class t() {
        return this.rl;
    }
}
