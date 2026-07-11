package ef;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f63830n = new ArrayList();

    void n(s4 s4Var) {
        this.f63830n.add(s4Var);
    }

    public void rl(Path path) {
        for (int size = this.f63830n.size() - 1; size >= 0; size--) {
            x0.eO.rl(path, (s4) this.f63830n.get(size));
        }
    }
}
