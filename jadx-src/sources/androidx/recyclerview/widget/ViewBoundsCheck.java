package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class ViewBoundsCheck {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Callback f41237n;
    BoundFlags rl = new BoundFlags();

    static class BoundFlags {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f41238O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41239n = 0;
        int nr;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f41240t;

        void nr() {
            this.f41239n = 0;
        }

        int t(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }

        void O(int i2, int i3, int i5, int i7) {
            this.rl = i2;
            this.f41240t = i3;
            this.nr = i5;
            this.f41238O = i7;
        }

        void n(int i2) {
            this.f41239n = i2 | this.f41239n;
        }

        boolean rl() {
            int i2 = this.f41239n;
            if ((i2 & 7) != 0 && (i2 & t(this.nr, this.rl)) == 0) {
                return false;
            }
            int i3 = this.f41239n;
            if ((i3 & 112) != 0 && (i3 & (t(this.nr, this.f41240t) << 4)) == 0) {
                return false;
            }
            int i5 = this.f41239n;
            if ((i5 & 1792) != 0 && (i5 & (t(this.f41238O, this.rl) << 8)) == 0) {
                return false;
            }
            int i7 = this.f41239n;
            return (i7 & 28672) == 0 || (i7 & (t(this.f41238O, this.f41240t) << 12)) != 0;
        }

        BoundFlags() {
        }
    }

    interface Callback {
        int O(View view);

        View n(int i2);

        int nr();

        int rl(View view);

        int t();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    View n(int i2, int i3, int i5, int i7) {
        int iT = this.f41237n.t();
        int iNr = this.f41237n.nr();
        int i8 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View viewN = this.f41237n.n(i2);
            this.rl.O(iT, iNr, this.f41237n.rl(viewN), this.f41237n.O(viewN));
            if (i5 != 0) {
                this.rl.nr();
                this.rl.n(i5);
                if (this.rl.rl()) {
                    return viewN;
                }
            }
            if (i7 != 0) {
                this.rl.nr();
                this.rl.n(i7);
                if (this.rl.rl()) {
                    view = viewN;
                }
            }
            i2 += i8;
        }
        return view;
    }

    boolean rl(View view, int i2) {
        this.rl.O(this.f41237n.t(), this.f41237n.nr(), this.f41237n.rl(view), this.f41237n.O(view));
        if (i2 == 0) {
            return false;
        }
        this.rl.nr();
        this.rl.n(i2);
        return this.rl.rl();
    }

    ViewBoundsCheck(Callback callback) {
        this.f41237n = callback;
    }
}
