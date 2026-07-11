package Dj9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Wre implements OM5.j, OM5.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f1908n = new HashSet();
    private boolean rl = false;

    public void n() {
        SNR.n.n();
        this.rl = true;
        Iterator it = this.f1908n.iterator();
        if (!it.hasNext()) {
            return;
        }
        android.support.v4.media.j.n(it.next());
        throw null;
    }
}
