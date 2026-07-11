package h1M;

import IRN.eO;
import oSp.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oSp.j f67948n;

    public void rl(eO eOVar) {
        if (eOVar == null) {
            CN3.J2().gh("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final I28 i28 = new I28(eOVar);
            this.f67948n.n(new j.InterfaceC1084j() { // from class: h1M.C
                @Override // oSp.j.InterfaceC1084j
                public final void n(oSp.n nVar) {
                    o.n(i28, nVar);
                }
            });
        }
    }

    public o(oSp.j jVar) {
        this.f67948n = jVar;
    }

    public static /* synthetic */ void n(I28 i28, oSp.n nVar) {
        ((FP.j) nVar.get()).n("firebase", i28);
        CN3.J2().rl("Registering RemoteConfig Rollouts subscriber");
    }
}
