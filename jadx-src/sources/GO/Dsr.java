package GO;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Dsr implements Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f3523n;
    private final n rl;

    @Override // GO.Xo
    public List getKeyframes() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // GO.Xo
    public boolean isStatic() {
        return this.f3523n.isStatic() && this.rl.isStatic();
    }

    @Override // GO.Xo
    public B.j n() {
        return new B.Pl(this.f3523n.n(), this.rl.n());
    }

    public Dsr(n nVar, n nVar2) {
        this.f3523n = nVar;
        this.rl = nVar2;
    }
}
