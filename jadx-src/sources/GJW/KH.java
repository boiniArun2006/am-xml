package GJW;

import kotlin.collections.ArrayDeque;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class KH extends lej {
    private ArrayDeque J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f3403O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f3404t;

    public boolean JVN() {
        return false;
    }

    public abstract long X4T();

    public abstract void shutdown();

    public static /* synthetic */ void Bu(KH kh, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        kh.T3L(z2);
    }

    public static /* synthetic */ void Qu(KH kh, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        kh.ub(z2);
    }

    private final long p0N(boolean z2) {
        return z2 ? 4294967296L : 1L;
    }

    public final boolean HBN() {
        return this.f3404t >= p0N(true);
    }

    public final void T3L(boolean z2) {
        long jP0N = this.f3404t - p0N(z2);
        this.f3404t = jP0N;
        if (jP0N <= 0 && this.f3403O) {
            shutdown();
        }
    }

    public final boolean UF() {
        ArrayDeque arrayDeque = this.J2;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    public final void Uf(Sis sis) {
        ArrayDeque arrayDeque = this.J2;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            this.J2 = arrayDeque;
        }
        arrayDeque.addLast(sis);
    }

    public final boolean Zmq() {
        Sis sis;
        ArrayDeque arrayDeque = this.J2;
        if (arrayDeque == null || (sis = (Sis) arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        sis.run();
        return true;
    }

    protected long f() {
        ArrayDeque arrayDeque = this.J2;
        return (arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void ub(boolean z2) {
        this.f3404t += p0N(z2);
        if (z2) {
            return;
        }
        this.f3403O = true;
    }

    @Override // GJW.lej
    public final lej K(int i2, String str) {
        dzu.o.n(i2);
        return dzu.o.rl(this, str);
    }
}
