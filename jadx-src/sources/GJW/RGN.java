package GJW;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class RGN extends g9 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3447o = AtomicIntegerFieldUpdater.newUpdater(RGN.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Function1 f3448r;

    @Override // GJW.g9
    public boolean S() {
        return true;
    }

    public RGN(Function1 function1) {
        this.f3448r = function1;
    }

    @Override // GJW.g9
    public void WPU(Throwable th) {
        if (f3447o.compareAndSet(this, 0, 1)) {
            this.f3448r.invoke(th);
        }
    }
}
