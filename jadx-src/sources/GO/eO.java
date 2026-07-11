package GO;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class eO implements Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final List f3528n;

    @Override // GO.Xo
    public List getKeyframes() {
        return this.f3528n;
    }

    @Override // GO.Xo
    public boolean isStatic() {
        return this.f3528n.isEmpty() || (this.f3528n.size() == 1 && ((Ect.j) this.f3528n.get(0)).xMQ());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f3528n.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f3528n.toArray()));
        }
        return sb.toString();
    }

    eO(List list) {
        this.f3528n = list;
    }
}
