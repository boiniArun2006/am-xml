package com.applovin.adview;

import androidx.view.Lifecycle;
import androidx.view.LifecycleObserver;
import androidx.view.OnLifecycleEvent;
import com.applovin.impl.n2;
import com.applovin.impl.w1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class AppLovinFullscreenAdViewObserver implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lifecycle f47682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n2 f47683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f47684c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w1 f47685d;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.f47682a.nr(this);
        n2 n2Var = this.f47683b;
        if (n2Var != null) {
            n2Var.a();
            this.f47683b = null;
        }
        w1 w1Var = this.f47685d;
        if (w1Var != null) {
            w1Var.a("lifecycle_on_destroy");
            this.f47685d.r();
            this.f47685d = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        w1 w1Var = this.f47685d;
        if (w1Var != null) {
            w1Var.s();
            this.f47685d.v();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        w1 w1Var;
        if (this.f47684c.getAndSet(false) || (w1Var = this.f47685d) == null) {
            return;
        }
        w1Var.t();
        this.f47685d.b(0L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        w1 w1Var = this.f47685d;
        if (w1Var != null) {
            w1Var.u();
        }
    }

    public void setPresenter(w1 w1Var) {
        this.f47685d = w1Var;
    }

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, n2 n2Var) {
        this.f47682a = lifecycle;
        this.f47683b = n2Var;
        lifecycle.n(this);
    }
}
