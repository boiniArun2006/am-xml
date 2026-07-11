package FSZ;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Z f2616n;
    private final LinkedHashMap rl = new LinkedHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2617t = 0;

    public synchronized Object KN(Object obj) {
        Object objRemove;
        objRemove = this.rl.remove(obj);
        this.f2617t -= J2(objRemove);
        return objRemove;
    }

    public synchronized int O() {
        return this.f2617t;
    }

    public synchronized Object Uo(Object obj, Object obj2) {
        Object objRemove;
        objRemove = this.rl.remove(obj);
        this.f2617t -= J2(objRemove);
        this.rl.put(obj, obj2);
        this.f2617t += J2(obj2);
        return objRemove;
    }

    public synchronized boolean n(Object obj) {
        return this.rl.containsKey(obj);
    }

    public synchronized Object nr() {
        return this.rl.isEmpty() ? null : this.rl.keySet().iterator().next();
    }

    public synchronized Object rl(Object obj) {
        return this.rl.get(obj);
    }

    public synchronized int t() {
        return this.rl.size();
    }

    public synchronized void xMQ() {
        if (this.rl.isEmpty()) {
            this.f2617t = 0;
        }
    }

    private int J2(Object obj) {
        if (obj == null) {
            return 0;
        }
        return this.f2616n.n(obj);
    }

    public o(Z z2) {
        this.f2616n = z2;
    }
}
