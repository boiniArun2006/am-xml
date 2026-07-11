package B;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f209n;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f210t;

    public List n() {
        return this.f209n;
    }

    public List rl() {
        return this.f210t;
    }

    public List t() {
        return this.rl;
    }

    public fuX(List list) {
        this.f210t = list;
        this.f209n = new ArrayList(list.size());
        this.rl = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f209n.add(((QJ.Dsr) list.get(i2)).rl().n());
            this.rl.add(((QJ.Dsr) list.get(i2)).t().n());
        }
    }
}
