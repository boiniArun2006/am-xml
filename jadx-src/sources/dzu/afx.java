package dzu;

import GJW.U4;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class afx extends w6 implements U4 {
    private static final /* synthetic */ AtomicIntegerFieldUpdater nr = AtomicIntegerFieldUpdater.newUpdater(afx.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f63562t;

    public abstract void o(int i2, Throwable th, CoroutineContext coroutineContext);

    public abstract int r();

    public afx(long j2, afx afxVar, int i2) {
        super(afxVar);
        this.f63562t = j2;
        this.cleanedAndPointers$volatile = i2 << 16;
    }

    public final boolean XQ() {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = nr;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == r() && !qie()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }

    public final void Z() {
        if (nr.incrementAndGet(this) == r()) {
            ty();
        }
    }

    public final boolean ck() {
        if (nr.addAndGet(this, -65536) == r() && !qie()) {
            return true;
        }
        return false;
    }

    @Override // dzu.w6
    public boolean gh() {
        if (nr.get(this) == r() && !qie()) {
            return true;
        }
        return false;
    }
}
