package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class ChildHelper {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private View f40995O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Callback f40996n;
    private int nr = 0;
    final Bucket rl = new Bucket();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final List f40997t = new ArrayList();

    static class Bucket {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f40998n = 0;
        Bucket rl;

        private void t() {
            if (this.rl == null) {
                this.rl = new Bucket();
            }
        }

        boolean J2(int i2) {
            if (i2 >= 64) {
                t();
                return this.rl.J2(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.f40998n;
            boolean z2 = (j3 & j2) != 0;
            long j4 = j3 & (~j2);
            this.f40998n = j4;
            long j5 = j2 - 1;
            this.f40998n = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
            Bucket bucket = this.rl;
            if (bucket != null) {
                if (bucket.nr(0)) {
                    KN(63);
                }
                this.rl.J2(0);
            }
            return z2;
        }

        void KN(int i2) {
            if (i2 < 64) {
                this.f40998n |= 1 << i2;
            } else {
                t();
                this.rl.KN(i2 - 64);
            }
        }

        void O(int i2, boolean z2) {
            if (i2 >= 64) {
                t();
                this.rl.O(i2 - 64, z2);
                return;
            }
            long j2 = this.f40998n;
            boolean z3 = (Long.MIN_VALUE & j2) != 0;
            long j3 = (1 << i2) - 1;
            this.f40998n = ((j2 & (~j3)) << 1) | (j2 & j3);
            if (z2) {
                KN(i2);
            } else {
                n(i2);
            }
            if (z3 || this.rl != null) {
                t();
                this.rl.O(0, z3);
            }
        }

        void Uo() {
            this.f40998n = 0L;
            Bucket bucket = this.rl;
            if (bucket != null) {
                bucket.Uo();
            }
        }

        void n(int i2) {
            if (i2 < 64) {
                this.f40998n &= ~(1 << i2);
                return;
            }
            Bucket bucket = this.rl;
            if (bucket != null) {
                bucket.n(i2 - 64);
            }
        }

        boolean nr(int i2) {
            if (i2 < 64) {
                return (this.f40998n & (1 << i2)) != 0;
            }
            t();
            return this.rl.nr(i2 - 64);
        }

        int rl(int i2) {
            Bucket bucket = this.rl;
            return bucket == null ? i2 >= 64 ? Long.bitCount(this.f40998n) : Long.bitCount(this.f40998n & ((1 << i2) - 1)) : i2 < 64 ? Long.bitCount(this.f40998n & ((1 << i2) - 1)) : bucket.rl(i2 - 64) + Long.bitCount(this.f40998n);
        }

        public String toString() {
            if (this.rl == null) {
                return Long.toBinaryString(this.f40998n);
            }
            return this.rl.toString() + "xx" + Long.toBinaryString(this.f40998n);
        }

        Bucket() {
        }
    }

    interface Callback {
        void J2();

        void KN(View view);

        void O(int i2);

        int Uo(View view);

        void addView(View view, int i2);

        void mUb(View view, int i2, ViewGroup.LayoutParams layoutParams);

        View n(int i2);

        RecyclerView.ViewHolder nr(View view);

        void rl(View view);

        int t();

        void xMQ(int i2);
    }

    private int KN(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int iT = this.f40996n.t();
        int i3 = i2;
        while (i3 < iT) {
            int iRl = i2 - (i3 - this.rl.rl(i3));
            if (iRl == 0) {
                while (this.rl.nr(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iRl;
        }
        return -1;
    }

    void rl(View view, boolean z2) {
        n(view, -1, z2);
    }

    private boolean Z(View view) {
        if (!this.f40997t.remove(view)) {
            return false;
        }
        this.f40996n.KN(view);
        return true;
    }

    private void qie(View view) {
        this.f40997t.add(view);
        this.f40996n.rl(view);
    }

    void HI() {
        this.rl.Uo();
        for (int size = this.f40997t.size() - 1; size >= 0; size--) {
            this.f40996n.KN((View) this.f40997t.get(size));
            this.f40997t.remove(size);
        }
        this.f40996n.J2();
    }

    void Ik(int i2) {
        int i3 = this.nr;
        if (i3 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i3 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iKN = KN(i2);
            View viewN = this.f40996n.n(iKN);
            if (viewN != null) {
                this.nr = 1;
                this.f40995O = viewN;
                if (this.rl.J2(iKN)) {
                    Z(viewN);
                }
                this.f40996n.xMQ(iKN);
            }
            this.nr = 0;
            this.f40995O = null;
        } catch (Throwable th) {
            this.nr = 0;
            this.f40995O = null;
            throw th;
        }
    }

    View O(int i2) {
        int size = this.f40997t.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.f40997t.get(i3);
            RecyclerView.ViewHolder viewHolderNr = this.f40996n.nr(view);
            if (viewHolderNr.getLayoutPosition() == i2 && !viewHolderNr.isInvalid() && !viewHolderNr.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    int Uo() {
        return this.f40996n.t() - this.f40997t.size();
    }

    int az(View view) {
        int iUo = this.f40996n.Uo(view);
        if (iUo == -1 || this.rl.nr(iUo)) {
            return -1;
        }
        return iUo - this.rl.rl(iUo);
    }

    void ck(View view) {
        int i2 = this.nr;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.nr = 1;
            this.f40995O = view;
            int iUo = this.f40996n.Uo(view);
            if (iUo >= 0) {
                if (this.rl.J2(iUo)) {
                    Z(view);
                }
                this.f40996n.xMQ(iUo);
            }
            this.nr = 0;
            this.f40995O = null;
        } catch (Throwable th) {
            this.nr = 0;
            this.f40995O = null;
            throw th;
        }
    }

    void gh(View view) {
        int iUo = this.f40996n.Uo(view);
        if (iUo >= 0) {
            this.rl.KN(iUo);
            qie(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int mUb() {
        return this.f40996n.t();
    }

    void n(View view, int i2, boolean z2) {
        int iT = i2 < 0 ? this.f40996n.t() : KN(i2);
        this.rl.O(iT, z2);
        if (z2) {
            qie(view);
        }
        this.f40996n.addView(view, iT);
    }

    void o(View view) {
        int iUo = this.f40996n.Uo(view);
        if (iUo < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.rl.nr(iUo)) {
            this.rl.n(iUo);
            Z(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    boolean r(View view) {
        int i2 = this.nr;
        if (i2 == 1) {
            if (this.f40995O == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.nr = 2;
            int iUo = this.f40996n.Uo(view);
            if (iUo == -1) {
                Z(view);
                return true;
            }
            if (!this.rl.nr(iUo)) {
                return false;
            }
            this.rl.J2(iUo);
            Z(view);
            this.f40996n.xMQ(iUo);
            return true;
        } finally {
            this.nr = 0;
        }
    }

    void t(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        int iT = i2 < 0 ? this.f40996n.t() : KN(i2);
        this.rl.O(iT, z2);
        if (z2) {
            qie(view);
        }
        this.f40996n.mUb(view, iT, layoutParams);
    }

    public String toString() {
        return this.rl.toString() + ", hidden list:" + this.f40997t.size();
    }

    boolean ty(View view) {
        return this.f40997t.contains(view);
    }

    View xMQ(int i2) {
        return this.f40996n.n(i2);
    }

    ChildHelper(Callback callback) {
        this.f40996n = callback;
    }

    View J2(int i2) {
        return this.f40996n.n(KN(i2));
    }

    void nr(int i2) {
        int iKN = KN(i2);
        this.rl.J2(iKN);
        this.f40996n.O(iKN);
    }
}
