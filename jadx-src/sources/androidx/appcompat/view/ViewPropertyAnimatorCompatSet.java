package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class ViewPropertyAnimatorCompatSet {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f13788O;
    ViewPropertyAnimatorListener nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Interpolator f13790t;
    private long rl = -1;
    private final ViewPropertyAnimatorListenerAdapter J2 = new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.view.ViewPropertyAnimatorCompatSet.1

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f13791n = false;
        private int rl = 0;

        void nr() {
            this.rl = 0;
            this.f13791n = false;
            ViewPropertyAnimatorCompatSet.this.rl();
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void rl(View view) {
            int i2 = this.rl + 1;
            this.rl = i2;
            if (i2 == ViewPropertyAnimatorCompatSet.this.f13789n.size()) {
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.nr;
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.rl(null);
                }
                nr();
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void t(View view) {
            if (this.f13791n) {
                return;
            }
            this.f13791n = true;
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.nr;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.t(null);
            }
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ArrayList f13789n = new ArrayList();

    void rl() {
        this.f13788O = false;
    }

    public ViewPropertyAnimatorCompatSet J2(Interpolator interpolator) {
        if (!this.f13788O) {
            this.f13790t = interpolator;
        }
        return this;
    }

    public void KN() {
        if (this.f13788O) {
            return;
        }
        for (ViewPropertyAnimatorCompat viewPropertyAnimatorCompat : this.f13789n) {
            long j2 = this.rl;
            if (j2 >= 0) {
                viewPropertyAnimatorCompat.O(j2);
            }
            Interpolator interpolator = this.f13790t;
            if (interpolator != null) {
                viewPropertyAnimatorCompat.J2(interpolator);
            }
            if (this.nr != null) {
                viewPropertyAnimatorCompat.Uo(this.J2);
            }
            viewPropertyAnimatorCompat.gh();
        }
        this.f13788O = true;
    }

    public ViewPropertyAnimatorCompatSet O(long j2) {
        if (!this.f13788O) {
            this.rl = j2;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet Uo(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.f13788O) {
            this.nr = viewPropertyAnimatorListener;
        }
        return this;
    }

    public void n() {
        if (this.f13788O) {
            Iterator it = this.f13789n.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimatorCompat) it.next()).t();
            }
            this.f13788O = false;
        }
    }

    public ViewPropertyAnimatorCompatSet nr(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.f13789n.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.xMQ(viewPropertyAnimatorCompat.nr());
        this.f13789n.add(viewPropertyAnimatorCompat2);
        return this;
    }

    public ViewPropertyAnimatorCompatSet t(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.f13788O) {
            this.f13789n.add(viewPropertyAnimatorCompat);
        }
        return this;
    }
}
