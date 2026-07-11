package androidx.recyclerview.widget;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class SnapHelper extends RecyclerView.OnFlingListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    RecyclerView f41197n;
    private Scroller rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final RecyclerView.OnScrollListener f41198t = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.SnapHelper.1

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f41199n = false;

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void rl(RecyclerView recyclerView, int i2, int i3) {
            if (i2 == 0 && i3 == 0) {
                return;
            }
            this.f41199n = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void n(RecyclerView recyclerView, int i2) {
            super.n(recyclerView, i2);
            if (i2 == 0 && this.f41199n) {
                this.f41199n = false;
                SnapHelper.this.qie();
            }
        }
    };

    public abstract View KN(RecyclerView.LayoutManager layoutManager);

    public abstract int[] t(RecyclerView.LayoutManager layoutManager, View view);

    public abstract int xMQ(RecyclerView.LayoutManager layoutManager, int i2, int i3);

    private void Uo() {
        this.f41197n.removeOnScrollListener(this.f41198t);
        this.f41197n.setOnFlingListener(null);
    }

    private boolean gh(RecyclerView.LayoutManager layoutManager, int i2, int i3) {
        RecyclerView.SmoothScroller smoothScrollerO;
        int iXMQ;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (smoothScrollerO = O(layoutManager)) == null || (iXMQ = xMQ(layoutManager, i2, i3)) == -1) {
            return false;
        }
        smoothScrollerO.ck(iXMQ);
        layoutManager.wKY(smoothScrollerO);
        return true;
    }

    private void mUb() {
        if (this.f41197n.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f41197n.addOnScrollListener(this.f41198t);
        this.f41197n.setOnFlingListener(this);
    }

    protected LinearSmoothScroller J2(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.f41197n.getContext()) { // from class: androidx.recyclerview.widget.SnapHelper.2
                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                protected void HI(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    SnapHelper snapHelper = SnapHelper.this;
                    RecyclerView recyclerView = snapHelper.f41197n;
                    if (recyclerView == null) {
                        return;
                    }
                    int[] iArrT = snapHelper.t(recyclerView.getLayoutManager(), view);
                    int i2 = iArrT[0];
                    int i3 = iArrT[1];
                    int iWPU = WPU(Math.max(Math.abs(i2), Math.abs(i3)));
                    if (iWPU > 0) {
                        action.nr(i2, i3, iWPU, this.mUb);
                    }
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected float S(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean n(int i2, int i3) {
        RecyclerView.LayoutManager layoutManager = this.f41197n.getLayoutManager();
        if (layoutManager == null || this.f41197n.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f41197n.getMinFlingVelocity();
        return (Math.abs(i3) > minFlingVelocity || Math.abs(i2) > minFlingVelocity) && gh(layoutManager, i2, i3);
    }

    public int[] nr(int i2, int i3) {
        this.rl.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.rl.getFinalX(), this.rl.getFinalY()};
    }

    void qie() {
        RecyclerView.LayoutManager layoutManager;
        View viewKN;
        RecyclerView recyclerView = this.f41197n;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewKN = KN(layoutManager)) == null) {
            return;
        }
        int[] iArrT = t(layoutManager, viewKN);
        int i2 = iArrT[0];
        if (i2 == 0 && iArrT[1] == 0) {
            return;
        }
        this.f41197n.smoothScrollBy(i2, iArrT[1]);
    }

    public void rl(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f41197n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            Uo();
        }
        this.f41197n = recyclerView;
        if (recyclerView != null) {
            mUb();
            this.rl = new Scroller(this.f41197n.getContext(), new DecelerateInterpolator());
            qie();
        }
    }

    protected RecyclerView.SmoothScroller O(RecyclerView.LayoutManager layoutManager) {
        return J2(layoutManager);
    }
}
