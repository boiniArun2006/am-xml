package FjR;

import androidx.view.DefaultLifecycleObserver;
import androidx.view.Lifecycle;
import androidx.view.LifecycleObserver;
import androidx.view.LifecycleOwner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class CN3 extends Lifecycle {
    public static final CN3 rl = new CN3();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final j f3008t = new j();

    public static final class j implements LifecycleOwner {
        @Override // androidx.view.LifecycleOwner
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public CN3 getLifecycle() {
            return CN3.rl;
        }

        j() {
        }
    }

    @Override // androidx.view.Lifecycle
    public void nr(LifecycleObserver lifecycleObserver) {
    }

    @Override // androidx.view.Lifecycle
    public void n(LifecycleObserver lifecycleObserver) {
        if (!(lifecycleObserver instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((lifecycleObserver + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) lifecycleObserver;
        j jVar = f3008t;
        defaultLifecycleObserver.Uo(jVar);
        defaultLifecycleObserver.M(jVar);
        defaultLifecycleObserver.jB(jVar);
    }

    @Override // androidx.view.Lifecycle
    public Lifecycle.State rl() {
        return Lifecycle.State.f38884r;
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }

    private CN3() {
    }
}
