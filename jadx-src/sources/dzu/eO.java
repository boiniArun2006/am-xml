package dzu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f63563n = AtomicReferenceFieldUpdater.newUpdater(eO.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public eO(boolean z2) {
        this._cur$volatile = new C1959z(8, z2);
    }

    public final Object O() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63563n;
        while (true) {
            C1959z c1959z = (C1959z) atomicReferenceFieldUpdater.get(this);
            Object objAz = c1959z.az();
            if (objAz != C1959z.KN) {
                return objAz;
            }
            androidx.concurrent.futures.j.n(f63563n, this, c1959z, c1959z.qie());
        }
    }

    public final boolean n(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63563n;
        while (true) {
            C1959z c1959z = (C1959z) atomicReferenceFieldUpdater.get(this);
            int iN = c1959z.n(obj);
            if (iN == 0) {
                return true;
            }
            if (iN != 1) {
                if (iN == 2) {
                    return false;
                }
            } else {
                androidx.concurrent.futures.j.n(f63563n, this, c1959z, c1959z.qie());
            }
        }
    }

    public final void rl() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63563n;
        while (true) {
            C1959z c1959z = (C1959z) atomicReferenceFieldUpdater.get(this);
            if (c1959z.nr()) {
                return;
            } else {
                androidx.concurrent.futures.j.n(f63563n, this, c1959z, c1959z.qie());
            }
        }
    }

    public final int t() {
        return ((C1959z) f63563n.get(this)).Uo();
    }
}
