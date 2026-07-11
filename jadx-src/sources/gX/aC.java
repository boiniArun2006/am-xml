package gX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final nri.j f67596n;
    private final Class rl;

    class j extends aC {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ n f67597t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(nri.j jVar, Class cls, n nVar) {
            super(jVar, cls, null);
            this.f67597t = nVar;
        }
    }

    public interface n {
    }

    /* synthetic */ aC(nri.j jVar, Class cls, j jVar2) {
        this(jVar, cls);
    }

    private aC(nri.j jVar, Class cls) {
        this.f67596n = jVar;
        this.rl = cls;
    }

    public static aC n(n nVar, nri.j jVar, Class cls) {
        return new j(jVar, cls, nVar);
    }

    public final nri.j rl() {
        return this.f67596n;
    }

    public final Class t() {
        return this.rl;
    }
}
