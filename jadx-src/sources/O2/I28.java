package O2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class I28 implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Runnable f7245O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f7246n = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicReference f7247t;

    class j implements View.OnAttachStateChangeListener {
        j() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(I28.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public static void nr(View view, Runnable runnable) {
        I28 i28 = new I28(view, runnable);
        if (Build.VERSION.SDK_INT >= 26 || rl(view)) {
            view.getViewTreeObserver().addOnDrawListener(i28);
        } else {
            view.addOnAttachStateChangeListener(i28.new j());
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.f7247t.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: O2.Ml
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                I28.n(this.f7249n, view);
            }
        });
        this.f7246n.postAtFrontOfQueue(this.f7245O);
    }

    private I28(View view, Runnable runnable) {
        this.f7247t = new AtomicReference(view);
        this.f7245O = runnable;
    }

    public static /* synthetic */ void n(I28 i28, View view) {
        i28.getClass();
        view.getViewTreeObserver().removeOnDrawListener(i28);
    }

    private static boolean rl(View view) {
        if (view.getViewTreeObserver().isAlive() && t(view)) {
            return true;
        }
        return false;
    }

    private static boolean t(View view) {
        return view.isAttachedToWindow();
    }
}
