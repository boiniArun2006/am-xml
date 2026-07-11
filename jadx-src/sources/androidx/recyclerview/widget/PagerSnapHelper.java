package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class PagerSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private OrientationHelper f41145O;
    private OrientationHelper nr;

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] t(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.ViF()) {
            iArr[0] = az(view, HI(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.nY()) {
            iArr[1] = az(view, Ik(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    private OrientationHelper HI(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f41145O;
        if (orientationHelper == null || orientationHelper.f41143n != layoutManager) {
            this.f41145O = OrientationHelper.n(layoutManager);
        }
        return this.f41145O;
    }

    private OrientationHelper Ik(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.nr;
        if (orientationHelper == null || orientationHelper.f41143n != layoutManager) {
            this.nr = OrientationHelper.t(layoutManager);
        }
        return this.nr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    protected RecyclerView.SmoothScroller O(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.f41197n.getContext()) { // from class: androidx.recyclerview.widget.PagerSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                protected void HI(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    PagerSnapHelper pagerSnapHelper = PagerSnapHelper.this;
                    int[] iArrT = pagerSnapHelper.t(pagerSnapHelper.f41197n.getLayoutManager(), view);
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

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected int aYN(int i2) {
                    return Math.min(100, super.aYN(i2));
                }
            };
        }
        return null;
    }

    private int az(View view, OrientationHelper orientationHelper) {
        return (orientationHelper.Uo(view) + (orientationHelper.O(view) / 2)) - (orientationHelper.az() + (orientationHelper.ty() / 2));
    }

    private OrientationHelper ck(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.nY()) {
            return Ik(layoutManager);
        }
        if (layoutManager.ViF()) {
            return HI(layoutManager);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean o(RecyclerView.LayoutManager layoutManager) {
        PointF pointFKN;
        int iN = layoutManager.n();
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (pointFKN = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).KN(iN - 1)) == null) {
            return false;
        }
        if (pointFKN.x >= 0.0f && pointFKN.y >= 0.0f) {
            return false;
        }
        return true;
    }

    private boolean r(RecyclerView.LayoutManager layoutManager, int i2, int i3) {
        if (layoutManager.ViF()) {
            if (i2 <= 0) {
                return false;
            }
            return true;
        }
        if (i3 <= 0) {
            return false;
        }
        return true;
    }

    private View ty(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int iM = layoutManager.M();
        View view = null;
        if (iM == 0) {
            return null;
        }
        int iAz = orientationHelper.az() + (orientationHelper.ty() / 2);
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iM; i3++) {
            View viewE = layoutManager.E(i3);
            int iAbs = Math.abs((orientationHelper.Uo(viewE) + (orientationHelper.O(viewE) / 2)) - iAz);
            if (iAbs < i2) {
                view = viewE;
                i2 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public View KN(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.nY()) {
            return ty(layoutManager, Ik(layoutManager));
        }
        if (layoutManager.ViF()) {
            return ty(layoutManager, HI(layoutManager));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int xMQ(RecyclerView.LayoutManager layoutManager, int i2, int i3) {
        OrientationHelper orientationHelperCk;
        int i5;
        int iN = layoutManager.n();
        if (iN == 0 || (orientationHelperCk = ck(layoutManager)) == null) {
            return -1;
        }
        int iM = layoutManager.M();
        View view = null;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i9 = 0; i9 < iM; i9++) {
            View viewE = layoutManager.E(i9);
            if (viewE != null) {
                int iAz = az(viewE, orientationHelperCk);
                if (iAz <= 0 && iAz > i8) {
                    view2 = viewE;
                    i8 = iAz;
                }
                if (iAz >= 0 && iAz < i7) {
                    view = viewE;
                    i7 = iAz;
                }
            }
        }
        boolean zR = r(layoutManager, i2, i3);
        if (zR && view != null) {
            return layoutManager.fcU(view);
        }
        if (!zR && view2 != null) {
            return layoutManager.fcU(view2);
        }
        if (zR) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iFcU = layoutManager.fcU(view);
        if (o(layoutManager) == zR) {
            i5 = -1;
        } else {
            i5 = 1;
        }
        int i10 = iFcU + i5;
        if (i10 < 0 || i10 >= iN) {
            return -1;
        }
        return i10;
    }
}
