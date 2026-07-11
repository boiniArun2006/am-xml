package veW;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class z implements bF.Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f74752n;
    private final eO rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2407c f74753t;

    @Override // bF.Dsr
    public bF.fuX n(String str, Class cls, bF.n nVar, bF.CN3 cn3) {
        if (this.f74752n.contains(nVar)) {
            return new l3D(this.rl, str, nVar, cn3, this.f74753t);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", nVar, this.f74752n));
    }

    z(Set set, eO eOVar, InterfaceC2407c interfaceC2407c) {
        this.f74752n = set;
        this.rl = eOVar;
        this.f74753t = interfaceC2407c;
    }
}
