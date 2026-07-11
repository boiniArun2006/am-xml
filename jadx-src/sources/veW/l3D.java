package veW;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class l3D implements bF.fuX {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final InterfaceC2407c f74733O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final eO f74734n;
    private final bF.CN3 nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final bF.n f74735t;

    public static /* synthetic */ void t(Exception exc) {
    }

    @Override // bF.fuX
    public void n(bF.w6 w6Var) {
        rl(w6Var, new bF.aC() { // from class: veW.QJ
            @Override // bF.aC
            public final void n(Exception exc) {
                l3D.t(exc);
            }
        });
    }

    eO nr() {
        return this.f74734n;
    }

    @Override // bF.fuX
    public void rl(bF.w6 w6Var, bF.aC aCVar) {
        this.f74733O.n(Xo.n().O(this.f74734n).t(w6Var).J2(this.rl).nr(this.nr).rl(this.f74735t).n(), aCVar);
    }

    l3D(eO eOVar, String str, bF.n nVar, bF.CN3 cn3, InterfaceC2407c interfaceC2407c) {
        this.f74734n = eOVar;
        this.rl = str;
        this.f74735t = nVar;
        this.nr = cn3;
        this.f74733O = interfaceC2407c;
    }
}
