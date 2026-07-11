package TiW;

import GJW.FKk;
import GJW.lej;
import dzu.DAz;
import dzu.qf;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n extends FKk implements Executor {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final n f10577O = new n();
    private static final lej J2 = lej.How(C.f10541t, qf.O("kotlinx.coroutines.io.parallelism", RangesKt.coerceAtLeast(64, DAz.n()), 0, 0, 12, null), null, 2, null);

    @Override // GJW.FKk
    public Executor T3L() {
        return this;
    }

    @Override // GJW.lej
    public lej K(int i2, String str) {
        return C.f10541t.K(i2, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        n1(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // GJW.lej
    public void n1(CoroutineContext coroutineContext, Runnable runnable) {
        J2.n1(coroutineContext, runnable);
    }

    @Override // GJW.lej
    public void qm(CoroutineContext coroutineContext, Runnable runnable) {
        J2.qm(coroutineContext, runnable);
    }

    @Override // GJW.lej
    public String toString() {
        return "Dispatchers.IO";
    }

    private n() {
    }
}
