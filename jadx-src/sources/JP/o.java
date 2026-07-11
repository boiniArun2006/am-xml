package JP;

import JP.Dsr;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class o {
    private static final o rl = new o(new Dsr.j(), Dsr.n.f4494n);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConcurrentMap f4548n = new ConcurrentHashMap();

    public static o n() {
        return rl;
    }

    public C rl(String str) {
        return (C) this.f4548n.get(str);
    }

    o(C... cArr) {
        for (C c2 : cArr) {
            this.f4548n.put(c2.n(), c2);
        }
    }
}
