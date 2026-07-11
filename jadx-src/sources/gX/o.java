package gX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f67602n;
    private final Class rl;

    class j extends o {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ n f67603t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Class cls, Class cls2, n nVar) {
            super(cls, cls2, null);
            this.f67603t = nVar;
        }

        @Override // gX.o
        public Object n(gAe.CN3 cn3) {
            return this.f67603t.n(cn3);
        }
    }

    public interface n {
        Object n(gAe.CN3 cn3);
    }

    /* synthetic */ o(Class cls, Class cls2, j jVar) {
        this(cls, cls2);
    }

    public abstract Object n(gAe.CN3 cn3);

    private o(Class cls, Class cls2) {
        this.f67602n = cls;
        this.rl = cls2;
    }

    public static o rl(n nVar, Class cls, Class cls2) {
        return new j(cls, cls2, nVar);
    }

    public Class nr() {
        return this.rl;
    }

    public Class t() {
        return this.f67602n;
    }
}
