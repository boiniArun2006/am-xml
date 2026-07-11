package GO;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class I28 implements Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f3524n;

    @Override // GO.Xo
    public List getKeyframes() {
        return this.f3524n;
    }

    @Override // GO.Xo
    public boolean isStatic() {
        return this.f3524n.size() == 1 && ((Ect.j) this.f3524n.get(0)).xMQ();
    }

    @Override // GO.Xo
    public B.j n() {
        return ((Ect.j) this.f3524n.get(0)).xMQ() ? new B.C(this.f3524n) : new B.aC(this.f3524n);
    }

    public I28(List list) {
        this.f3524n = list;
    }
}
