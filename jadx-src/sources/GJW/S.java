package GJW;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class S extends g9 {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3450Z = AtomicIntegerFieldUpdater.newUpdater(S.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private O f3451o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Thread f3452r = Thread.currentThread();

    @Override // GJW.g9
    public boolean S() {
        return true;
    }

    public final void te(xuv xuvVar) {
        int i2;
        this.f3451o = cA.HI(xuvVar, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3450Z;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 == 2 || i2 == 3) {
                    return;
                }
                g(i2);
                throw new KotlinNothingValueException();
            }
        } while (!f3450Z.compareAndSet(this, i2, 0));
    }

    private final Void g(int i2) {
        throw new IllegalStateException(("Illegal state " + i2).toString());
    }

    public final void ViF() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3450Z;
        while (true) {
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        g(i2);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f3450Z.compareAndSet(this, i2, 1)) {
                O o2 = this.f3451o;
                if (o2 != null) {
                    o2.n();
                    return;
                }
                return;
            }
        }
    }

    @Override // GJW.g9
    public void WPU(Throwable th) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3450Z;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    g(i2);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!f3450Z.compareAndSet(this, i2, 2));
        this.f3452r.interrupt();
        f3450Z.set(this, 3);
    }
}
