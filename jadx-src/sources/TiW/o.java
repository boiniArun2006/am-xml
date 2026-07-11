package TiW;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class o {
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReferenceArray f10580n = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int producerIndex$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater rl = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10579t = AtomicIntegerFieldUpdater.newUpdater(o.class, "producerIndex$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater nr = AtomicIntegerFieldUpdater.newUpdater(o.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10578O = AtomicIntegerFieldUpdater.newUpdater(o.class, "blockingTasksInBuffer$volatile");

    public final fuX qie() {
        return HI(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r(int i2, Ref.ObjectRef objectRef) {
        T tAz = i2 == 3 ? az() : ck(i2);
        if (tAz == 0) {
            return o(i2, objectRef);
        }
        objectRef.element = tAz;
        return -1L;
    }

    private final fuX Ik(int i2, boolean z2) {
        int i3 = i2 & 127;
        fuX fux = (fuX) this.f10580n.get(i3);
        if (fux == null || fux.f10552t != z2 || !ILs.o.n(this.f10580n, i3, fux, null)) {
            return null;
        }
        if (z2) {
            f10578O.decrementAndGet(this);
        }
        return fux;
    }

    private final void t(fuX fux) {
        if (fux == null || !fux.f10552t) {
            return;
        }
        f10578O.decrementAndGet(this);
    }

    public final fuX n(fuX fux, boolean z2) {
        if (z2) {
            return rl(fux);
        }
        fuX fux2 = (fuX) rl.getAndSet(this, fux);
        if (fux2 == null) {
            return null;
        }
        return rl(fux2);
    }

    private final fuX HI(boolean z2) {
        fuX fux;
        do {
            fux = (fuX) rl.get(this);
            if (fux == null || fux.f10552t != z2) {
                int i2 = nr.get(this);
                int i3 = f10579t.get(this);
                while (i2 != i3) {
                    if (z2 && f10578O.get(this) == 0) {
                        return null;
                    }
                    i3--;
                    fuX fuxIk = Ik(i3, z2);
                    if (fuxIk != null) {
                        return fuxIk;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.j.n(rl, this, fux, null));
        return fux;
    }

    private final int O() {
        return f10579t.get(this) - nr.get(this);
    }

    private final fuX az() {
        fuX fux;
        while (true) {
            int i2 = nr.get(this);
            if (i2 - f10579t.get(this) == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (nr.compareAndSet(this, i2, i2 + 1) && (fux = (fuX) this.f10580n.getAndSet(i3, null)) != null) {
                t(fux);
                return fux;
            }
        }
    }

    private final fuX ck(int i2) {
        int i3 = nr.get(this);
        int i5 = f10579t.get(this);
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        while (i3 != i5) {
            if (z2 && f10578O.get(this) == 0) {
                return null;
            }
            int i7 = i3 + 1;
            fuX fuxIk = Ik(i3, z2);
            if (fuxIk == null) {
                i3 = i7;
            } else {
                return fuxIk;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, TiW.fuX, java.lang.Object] */
    private final long o(int i2, Ref.ObjectRef objectRef) {
        ?? r02;
        int i3;
        do {
            r02 = (fuX) rl.get(this);
            if (r02 == 0) {
                return -2L;
            }
            if (r02.f10552t) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            if ((i3 & i2) == 0) {
                return -2L;
            }
            long jN = aC.J2.n() - r02.f10551n;
            long j2 = aC.rl;
            if (jN < j2) {
                return j2 - jN;
            }
        } while (!androidx.concurrent.futures.j.n(rl, this, r02, null));
        objectRef.element = r02;
        return -1L;
    }

    private final fuX rl(fuX fux) {
        if (O() == 127) {
            return fux;
        }
        if (fux.f10552t) {
            f10578O.incrementAndGet(this);
        }
        int i2 = f10579t.get(this) & 127;
        while (this.f10580n.get(i2) != null) {
            Thread.yield();
        }
        this.f10580n.lazySet(i2, fux);
        f10579t.incrementAndGet(this);
        return null;
    }

    private final boolean ty(Ml ml) {
        fuX fuxAz = az();
        if (fuxAz == null) {
            return false;
        }
        ml.n(fuxAz);
        return true;
    }

    public final fuX gh() {
        fuX fux = (fuX) rl.getAndSet(this, null);
        if (fux == null) {
            return az();
        }
        return fux;
    }

    public final void mUb(Ml ml) {
        fuX fux = (fuX) rl.getAndSet(this, null);
        if (fux != null) {
            ml.n(fux);
        }
        while (ty(ml)) {
        }
    }

    public final int xMQ() {
        if (rl.get(this) != null) {
            return O() + 1;
        }
        return O();
    }
}
