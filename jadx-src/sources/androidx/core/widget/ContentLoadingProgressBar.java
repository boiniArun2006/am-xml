package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f36928O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f36929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f36930o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f36931r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f36932t;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f36929n = -1L;
        this.f36932t = false;
        this.f36928O = false;
        this.J2 = false;
        this.f36931r = new Runnable() { // from class: androidx.core.widget.j
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.t(this.f36970n);
            }
        };
        this.f36930o = new Runnable() { // from class: androidx.core.widget.n
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.rl(this.f36971n);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        this.J2 = true;
        removeCallbacks(this.f36930o);
        this.f36928O = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.f36929n;
        long j3 = jCurrentTimeMillis - j2;
        if (j3 >= 500 || j2 == -1) {
            setVisibility(8);
        } else {
            if (this.f36932t) {
                return;
            }
            postDelayed(this.f36931r, 500 - j3);
            this.f36932t = true;
        }
    }

    public static /* synthetic */ void rl(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f36928O = false;
        if (contentLoadingProgressBar.J2) {
            return;
        }
        contentLoadingProgressBar.f36929n = System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }

    public static /* synthetic */ void t(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f36932t = false;
        contentLoadingProgressBar.f36929n = -1L;
        contentLoadingProgressBar.setVisibility(8);
    }

    private void J2() {
        removeCallbacks(this.f36931r);
        removeCallbacks(this.f36930o);
    }

    public void nr() {
        post(new Runnable() { // from class: androidx.core.widget.w6
            @Override // java.lang.Runnable
            public final void run() {
                this.f36972n.O();
            }
        });
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        J2();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        J2();
    }
}
