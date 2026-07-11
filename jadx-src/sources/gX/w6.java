package gX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f67605n;
    private final Class rl;

    class j extends w6 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ n f67606t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Class cls, Class cls2, n nVar) {
            super(cls, cls2, null);
            this.f67606t = nVar;
        }
    }

    public interface n {
    }

    /* synthetic */ w6(Class cls, Class cls2, j jVar) {
        this(cls, cls2);
    }

    private w6(Class cls, Class cls2) {
        this.f67605n = cls;
        this.rl = cls2;
    }

    public static w6 n(n nVar, Class cls, Class cls2) {
        return new j(cls, cls2, nVar);
    }

    public Class rl() {
        return this.f67605n;
    }

    public Class t() {
        return this.rl;
    }
}
