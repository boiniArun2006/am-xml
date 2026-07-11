package Pe;

import java.util.Map;
import java.util.Set;
import pUk.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class o {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Set f7736O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final UGc f7737n;
    private final Map nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f7738t;

    public Map O() {
        return this.f7738t;
    }

    public Map n() {
        return this.nr;
    }

    public Map nr() {
        return this.rl;
    }

    public Set rl() {
        return this.f7736O;
    }

    public UGc t() {
        return this.f7737n;
    }

    public String toString() {
        return "RemoteEvent{snapshotVersion=" + this.f7737n + ", targetChanges=" + this.rl + ", targetMismatches=" + this.f7738t + ", documentUpdates=" + this.nr + ", resolvedLimboDocuments=" + this.f7736O + '}';
    }

    public o(UGc uGc, Map map, Map map2, Map map3, Set set) {
        this.f7737n = uGc;
        this.rl = map;
        this.f7738t = map2;
        this.nr = map3;
        this.f7736O = set;
    }
}
