package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class LayoutState {
    boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f41103O;
    int nr;
    int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f41105t;
    boolean xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f41104n = true;
    int J2 = 0;
    int Uo = 0;

    boolean n(RecyclerView.State state) {
        int i2 = this.f41105t;
        return i2 >= 0 && i2 < state.rl();
    }

    View rl(RecyclerView.Recycler recycler) {
        View viewHI = recycler.HI(this.f41105t);
        this.f41105t += this.nr;
        return viewHI;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.rl + ", mCurrentPosition=" + this.f41105t + ", mItemDirection=" + this.nr + ", mLayoutDirection=" + this.f41103O + ", mStartLine=" + this.J2 + ", mEndLine=" + this.Uo + '}';
    }

    LayoutState() {
    }
}
