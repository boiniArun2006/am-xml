package IRN;

import androidx.core.database.sqlite.cL.PtsLKY;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f4198n = new ArrayList();
    private final int rl;

    public synchronized List rl() {
        return Collections.unmodifiableList(new ArrayList(this.f4198n));
    }

    public synchronized boolean t(List list) {
        this.f4198n.clear();
        if (list.size() <= this.rl) {
            return this.f4198n.addAll(list);
        }
        h1M.CN3.J2().gh("Ignored 0" + PtsLKY.UOihAnM + this.rl);
        return this.f4198n.addAll(list.subList(0, this.rl));
    }

    public C(int i2) {
        this.rl = i2;
    }

    public List n() {
        List listRl = rl();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listRl.size(); i2++) {
            arrayList.add(((aC) listRl.get(i2)).KN());
        }
        return arrayList;
    }
}
