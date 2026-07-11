package fJf;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class s4 implements g9s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f66898n = new HashSet();
    private final C rl = new C();

    @Override // fJf.g9s
    public void rl(Object obj) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.f66898n.add(obj);
        }
        if (zAdd) {
            this.rl.O(n(obj), obj);
        }
    }

    private Object t(Object obj) {
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            this.f66898n.remove(obj);
        }
        return obj;
    }

    @Override // fJf.g9s
    public Object get(int i2) {
        return t(this.rl.n(i2));
    }

    @Override // fJf.g9s
    public Object pop() {
        return t(this.rl.J2());
    }
}
