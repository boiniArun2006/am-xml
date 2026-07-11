package GJW;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class l3D extends Z {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3493t = AtomicIntegerFieldUpdater.newUpdater(l3D.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public l3D(Continuation continuation, Throwable th, boolean z2) {
        if (th == null) {
            th = new CancellationException("Continuation " + continuation + " was cancelled normally");
        }
        super(th, z2);
    }

    public final boolean O() {
        return f3493t.compareAndSet(this, 0, 1);
    }
}
