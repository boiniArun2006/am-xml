package FSZ;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f2597n;
    private final LinkedHashSet rl;

    public final synchronized boolean n(Object obj) {
        try {
            if (this.rl.size() == this.f2597n) {
                LinkedHashSet linkedHashSet = this.rl;
                linkedHashSet.remove(linkedHashSet.iterator().next());
            }
            this.rl.remove(obj);
        } catch (Throwable th) {
            throw th;
        }
        return this.rl.add(obj);
    }

    public final synchronized boolean rl(Object obj) {
        return this.rl.contains(obj);
    }

    public Ml(int i2) {
        this.f2597n = i2;
        this.rl = new LinkedHashSet(i2);
    }
}
