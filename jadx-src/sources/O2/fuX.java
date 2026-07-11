package O2;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class fuX implements ViewTreeObserver.OnPreDrawListener {
    private final Runnable J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Runnable f7254O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f7255n = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicReference f7256t;

    public static void n(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new fuX(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View view = (View) this.f7256t.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f7255n.post(this.f7254O);
        this.f7255n.postAtFrontOfQueue(this.J2);
        return true;
    }

    private fuX(View view, Runnable runnable, Runnable runnable2) {
        this.f7256t = new AtomicReference(view);
        this.f7254O = runnable;
        this.J2 = runnable2;
    }
}
