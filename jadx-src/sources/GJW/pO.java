package GJW;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class pO extends dzu.g9s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3500r = AtomicIntegerFieldUpdater.newUpdater(pO.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public pO(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext, continuation);
    }

    private final boolean VwL() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3500r;
        do {
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f3500r.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean tFV() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3500r;
        do {
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f3500r.compareAndSet(this, 0, 2));
        return true;
    }

    public final Object F() {
        if (VwL()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object objKN = CM.KN(J());
        if (!(objKN instanceof Z)) {
            return objKN;
        }
        throw ((Z) objKN).f3468n;
    }

    @Override // dzu.g9s, GJW.L0y
    protected void S(Object obj) {
        lLA(obj);
    }

    @Override // dzu.g9s, GJW.j
    protected void lLA(Object obj) {
        if (tFV()) {
            return;
        }
        dzu.Dsr.rl(IntrinsicsKt.intercepted(this.J2), Ew.n(obj, this.J2));
    }
}
