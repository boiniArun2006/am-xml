package UnP;

import java.util.Queue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Queue f10836n = UrZ.j.rl(20);

    abstract CN3 n();

    CN3 rl() {
        CN3 cn3 = (CN3) this.f10836n.poll();
        return cn3 == null ? n() : cn3;
    }

    public void t(CN3 cn3) {
        if (this.f10836n.size() < 20) {
            this.f10836n.offer(cn3);
        }
    }

    n() {
    }
}
