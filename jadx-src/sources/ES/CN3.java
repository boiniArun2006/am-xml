package ES;

import androidx.collection.LruCache;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class CN3 {
    private static final CN3 rl = new CN3();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LruCache f2303n = new LruCache(20);

    public static CN3 rl() {
        return rl;
    }

    public FQq.Dsr n(String str) {
        if (str == null) {
            return null;
        }
        return (FQq.Dsr) this.f2303n.get(str);
    }

    public void t(String str, FQq.Dsr dsr) {
        if (str == null) {
            return;
        }
        this.f2303n.put(str, dsr);
    }

    CN3() {
    }
}
