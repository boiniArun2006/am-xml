package uOq;

import oSp.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class SPz implements oSp.n, oSp.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j.InterfaceC1084j f74372n;
    private volatile oSp.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final j.InterfaceC1084j f74371t = new j.InterfaceC1084j() { // from class: uOq.UGc
        @Override // oSp.j.InterfaceC1084j
        public final void n(oSp.n nVar) {
            SPz.nr(nVar);
        }
    };
    private static final oSp.n nr = new oSp.n() { // from class: uOq.Q
        @Override // oSp.n
        public final Object get() {
            return SPz.rl();
        }
    };

    public static /* synthetic */ void nr(oSp.n nVar) {
    }

    public static /* synthetic */ Object rl() {
        return null;
    }

    static SPz J2(oSp.n nVar) {
        return new SPz(null, nVar);
    }

    static SPz O() {
        return new SPz(f74371t, nr);
    }

    void Uo(oSp.n nVar) {
        j.InterfaceC1084j interfaceC1084j;
        if (this.rl != nr) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC1084j = this.f74372n;
            this.f74372n = null;
            this.rl = nVar;
        }
        interfaceC1084j.n(nVar);
    }

    @Override // oSp.n
    public Object get() {
        return this.rl.get();
    }

    @Override // oSp.j
    public void n(final j.InterfaceC1084j interfaceC1084j) {
        oSp.n nVar;
        oSp.n nVar2;
        oSp.n nVar3 = this.rl;
        oSp.n nVar4 = nr;
        if (nVar3 != nVar4) {
            interfaceC1084j.n(nVar3);
            return;
        }
        synchronized (this) {
            nVar = this.rl;
            if (nVar != nVar4) {
                nVar2 = nVar;
            } else {
                final j.InterfaceC1084j interfaceC1084j2 = this.f74372n;
                this.f74372n = new j.InterfaceC1084j() { // from class: uOq.r
                    @Override // oSp.j.InterfaceC1084j
                    public final void n(oSp.n nVar5) {
                        SPz.t(interfaceC1084j2, interfaceC1084j, nVar5);
                    }
                };
                nVar2 = null;
            }
        }
        if (nVar2 != null) {
            interfaceC1084j.n(nVar);
        }
    }

    private SPz(j.InterfaceC1084j interfaceC1084j, oSp.n nVar) {
        this.f74372n = interfaceC1084j;
        this.rl = nVar;
    }

    public static /* synthetic */ void t(j.InterfaceC1084j interfaceC1084j, j.InterfaceC1084j interfaceC1084j2, oSp.n nVar) {
        interfaceC1084j.n(nVar);
        interfaceC1084j2.n(nVar);
    }
}
