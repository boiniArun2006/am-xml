package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class OneShotPreDrawListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Runnable f36745O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View f36746n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ViewTreeObserver f36747t;

    public static OneShotPreDrawListener n(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        OneShotPreDrawListener oneShotPreDrawListener = new OneShotPreDrawListener(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListener);
        view.addOnAttachStateChangeListener(oneShotPreDrawListener);
        return oneShotPreDrawListener;
    }

    public void rl() {
        if (this.f36747t.isAlive()) {
            this.f36747t.removeOnPreDrawListener(this);
        } else {
            this.f36746n.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f36746n.removeOnAttachStateChangeListener(this);
    }

    private OneShotPreDrawListener(View view, Runnable runnable) {
        this.f36746n = view;
        this.f36747t = view.getViewTreeObserver();
        this.f36745O = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        rl();
        this.f36745O.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f36747t = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        rl();
    }
}
