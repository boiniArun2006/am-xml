package GJW;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class CN3 extends j {
    private final Thread J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final KH f3392r;

    public CN3(CoroutineContext coroutineContext, Thread thread, KH kh) {
        super(coroutineContext, true, true);
        this.J2 = thread;
        this.f3392r = kh;
    }

    @Override // GJW.L0y
    protected boolean dR0() {
        return true;
    }

    @Override // GJW.L0y
    protected void S(Object obj) {
        if (!Intrinsics.areEqual(Thread.currentThread(), this.J2)) {
            Thread thread = this.J2;
            w6.n();
            LockSupport.unpark(thread);
        }
    }

    public final Object a63() throws Throwable {
        long jX4T;
        w6.n();
        try {
            KH kh = this.f3392r;
            Z z2 = null;
            if (kh != null) {
                KH.Qu(kh, false, 1, null);
            }
            while (true) {
                try {
                    KH kh2 = this.f3392r;
                    if (kh2 != null) {
                        jX4T = kh2.X4T();
                    } else {
                        jX4T = Long.MAX_VALUE;
                    }
                    if (isCompleted()) {
                        break;
                    }
                    w6.n();
                    LockSupport.parkNanos(this, jX4T);
                    if (Thread.interrupted()) {
                        nY(new InterruptedException());
                    }
                } catch (Throwable th) {
                    KH kh3 = this.f3392r;
                    if (kh3 != null) {
                        KH.Bu(kh3, false, 1, null);
                    }
                    throw th;
                }
            }
            KH kh4 = this.f3392r;
            if (kh4 != null) {
                KH.Bu(kh4, false, 1, null);
            }
            w6.n();
            Object objKN = CM.KN(J());
            if (objKN instanceof Z) {
                z2 = (Z) objKN;
            }
            if (z2 == null) {
                return objKN;
            }
            throw z2.f3468n;
        } catch (Throwable th2) {
            w6.n();
            throw th2;
        }
    }
}
