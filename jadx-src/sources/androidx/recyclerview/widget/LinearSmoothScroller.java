package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class LinearSmoothScroller extends RecyclerView.SmoothScroller {
    protected PointF gh;
    private final DisplayMetrics qie;
    private float ty;
    protected final LinearInterpolator xMQ = new LinearInterpolator();
    protected final DecelerateInterpolator mUb = new DecelerateInterpolator();
    private boolean az = false;
    protected int HI = 0;
    protected int ck = 0;

    private int ViF(int i2, int i3) {
        int i5 = i2 - i3;
        if (i2 * i5 <= 0) {
            return 0;
        }
        return i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    protected void az() {
    }

    public int o(int i2, int i3, int i5, int i7, int i8) {
        if (i8 == -1) {
            return i5 - i2;
        }
        if (i8 != 0) {
            if (i8 == 1) {
                return i7 - i3;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i9 = i5 - i2;
        if (i9 > 0) {
            return i9;
        }
        int i10 = i7 - i3;
        if (i10 < 0) {
            return i10;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    protected void ty() {
        this.ck = 0;
        this.HI = 0;
        this.gh = null;
    }

    private float g() {
        if (!this.az) {
            this.ty = S(this.qie);
            this.az = true;
        }
        return this.ty;
    }

    protected float S(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int nY() {
        PointF pointF = this.gh;
        if (pointF == null) {
            return 0;
        }
        float f3 = pointF.x;
        if (f3 == 0.0f) {
            return 0;
        }
        return f3 > 0.0f ? 1 : -1;
    }

    protected int te() {
        PointF pointF = this.gh;
        if (pointF == null) {
            return 0;
        }
        float f3 = pointF.y;
        if (f3 == 0.0f) {
            return 0;
        }
        return f3 > 0.0f ? 1 : -1;
    }

    public LinearSmoothScroller(Context context) {
        this.qie = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    protected void HI(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        int iZ = Z(view, nY());
        int iXQ = XQ(view, te());
        int iWPU = WPU((int) Math.sqrt((iZ * iZ) + (iXQ * iXQ)));
        if (iWPU > 0) {
            action.nr(-iZ, -iXQ, iWPU, this.mUb);
        }
    }

    protected int WPU(int i2) {
        return (int) Math.ceil(((double) aYN(i2)) / 0.3356d);
    }

    public int XQ(View view, int i2) {
        RecyclerView.LayoutManager layoutManagerO = O();
        if (layoutManagerO != null && layoutManagerO.nY()) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return o(layoutManagerO.dR0(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutManagerO.a(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutManagerO.G7(), layoutManagerO.piY() - layoutManagerO.ofS(), i2);
        }
        return 0;
    }

    public int Z(View view, int i2) {
        RecyclerView.LayoutManager layoutManagerO = O();
        if (layoutManagerO != null && layoutManagerO.ViF()) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return o(layoutManagerO.GR(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, layoutManagerO.k(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, layoutManagerO.C(), layoutManagerO.mYa() - layoutManagerO.Mx(), i2);
        }
        return 0;
    }

    protected int aYN(int i2) {
        return (int) Math.ceil(Math.abs(i2) * g());
    }

    protected void iF(RecyclerView.SmoothScroller.Action action) {
        PointF pointFN = n(J2());
        if (pointFN != null && (pointFN.x != 0.0f || pointFN.y != 0.0f)) {
            xMQ(pointFN);
            this.gh = pointFN;
            this.HI = (int) (pointFN.x * 10000.0f);
            this.ck = (int) (pointFN.y * 10000.0f);
            action.nr((int) (this.HI * 1.2f), (int) (this.ck * 1.2f), (int) (aYN(10000) * 1.2f), this.xMQ);
            return;
        }
        action.rl(J2());
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    protected void qie(int i2, int i3, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        if (t() == 0) {
            r();
            return;
        }
        this.HI = ViF(this.HI, i2);
        int iViF = ViF(this.ck, i3);
        this.ck = iViF;
        if (this.HI == 0 && iViF == 0) {
            iF(action);
        }
    }
}
