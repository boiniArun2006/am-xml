package uOq;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class s4 implements oSp.n {
    private volatile Set rl = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Set f74395n = Collections.newSetFromMap(new ConcurrentHashMap());

    private synchronized void nr() {
        try {
            Iterator it = this.f74395n.iterator();
            while (it.hasNext()) {
                this.rl.add(((oSp.n) it.next()).get());
            }
            this.f74395n = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void n(oSp.n nVar) {
        try {
            if (this.rl == null) {
                this.f74395n.add(nVar);
            } else {
                this.rl.add(nVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    static s4 rl(Collection collection) {
        return new s4((Set) collection);
    }

    @Override // oSp.n
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.rl == null) {
            synchronized (this) {
                try {
                    if (this.rl == null) {
                        this.rl = Collections.newSetFromMap(new ConcurrentHashMap());
                        nr();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.rl);
    }

    s4(Collection collection) {
        this.f74395n.addAll(collection);
    }
}
