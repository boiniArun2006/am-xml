package gX;

import gAe.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final nri.j f67600n;
    private final Class rl;

    class j extends n {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC0948n f67601t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(nri.j jVar, Class cls, InterfaceC0948n interfaceC0948n) {
            super(jVar, cls, null);
            this.f67601t = interfaceC0948n;
        }

        @Override // gX.n
        public gAe.CN3 nr(z zVar, SPz sPz) {
            return this.f67601t.n(zVar, sPz);
        }
    }

    /* JADX INFO: renamed from: gX.n$n, reason: collision with other inner class name */
    public interface InterfaceC0948n {
        gAe.CN3 n(z zVar, SPz sPz);
    }

    /* synthetic */ n(nri.j jVar, Class cls, j jVar2) {
        this(jVar, cls);
    }

    public abstract gAe.CN3 nr(z zVar, SPz sPz);

    private n(nri.j jVar, Class cls) {
        this.f67600n = jVar;
        this.rl = cls;
    }

    public static n n(InterfaceC0948n interfaceC0948n, nri.j jVar, Class cls) {
        return new j(jVar, cls, interfaceC0948n);
    }

    public final nri.j rl() {
        return this.f67600n;
    }

    public final Class t() {
        return this.rl;
    }
}
