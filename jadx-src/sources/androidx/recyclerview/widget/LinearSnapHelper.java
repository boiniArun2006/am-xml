package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class LinearSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private OrientationHelper f41124O;
    private OrientationHelper nr;

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] t(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.ViF()) {
            iArr[0] = ty(view, Ik(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.nY()) {
            iArr[1] = ty(view, r(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    private OrientationHelper Ik(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f41124O;
        if (orientationHelper == null || orientationHelper.f41143n != layoutManager) {
            this.f41124O = OrientationHelper.n(layoutManager);
        }
        return this.f41124O;
    }

    private OrientationHelper r(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.nr;
        if (orientationHelper == null || orientationHelper.f41143n != layoutManager) {
            this.nr = OrientationHelper.t(layoutManager);
        }
        return this.nr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public int xMQ(RecyclerView.LayoutManager layoutManager, int i2, int i3) {
        int iN;
        View viewKN;
        int iFcU;
        int i5;
        PointF pointFKN;
        int iHI;
        int iHI2;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (iN = layoutManager.n()) == 0 || (viewKN = KN(layoutManager)) == null || (iFcU = layoutManager.fcU(viewKN)) == -1 || (pointFKN = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).KN(iN - 1)) == null) {
            return -1;
        }
        if (layoutManager.ViF()) {
            iHI = HI(layoutManager, Ik(layoutManager), i2, 0);
            if (pointFKN.x < 0.0f) {
                iHI = -iHI;
            }
        } else {
            iHI = 0;
        }
        if (layoutManager.nY()) {
            iHI2 = HI(layoutManager, r(layoutManager), 0, i3);
            if (pointFKN.y < 0.0f) {
                iHI2 = -iHI2;
            }
        } else {
            iHI2 = 0;
        }
        if (layoutManager.nY()) {
            iHI = iHI2;
        }
        if (iHI == 0) {
            return -1;
        }
        int i7 = iFcU + iHI;
        int i8 = i7 >= 0 ? i7 : 0;
        return i8 >= iN ? i5 : i8;
    }

    private int HI(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i2, int i3) {
        int i5;
        int[] iArrNr = nr(i2, i3);
        float fAz = az(layoutManager, orientationHelper);
        if (fAz <= 0.0f) {
            return 0;
        }
        if (Math.abs(iArrNr[0]) > Math.abs(iArrNr[1])) {
            i5 = iArrNr[0];
        } else {
            i5 = iArrNr[1];
        }
        return Math.round(i5 / fAz);
    }

    private float az(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int iM = layoutManager.M();
        if (iM == 0) {
            return 1.0f;
        }
        View view = null;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < iM; i5++) {
            View viewE = layoutManager.E(i5);
            int iFcU = layoutManager.fcU(viewE);
            if (iFcU != -1) {
                if (iFcU < i3) {
                    view = viewE;
                    i3 = iFcU;
                }
                if (iFcU > i2) {
                    view2 = viewE;
                    i2 = iFcU;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int iMax = Math.max(orientationHelper.nr(view), orientationHelper.nr(view2)) - Math.min(orientationHelper.Uo(view), orientationHelper.Uo(view2));
        if (iMax == 0) {
            return 1.0f;
        }
        return (iMax * 1.0f) / ((i2 - i3) + 1);
    }

    private View ck(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
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

    private int ty(View view, OrientationHelper orientationHelper) {
        return (orientationHelper.Uo(view) + (orientationHelper.O(view) / 2)) - (orientationHelper.az() + (orientationHelper.ty() / 2));
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public View KN(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.nY()) {
            return ck(layoutManager, r(layoutManager));
        }
        if (layoutManager.ViF()) {
            return ck(layoutManager, Ik(layoutManager));
        }
        return null;
    }
}
