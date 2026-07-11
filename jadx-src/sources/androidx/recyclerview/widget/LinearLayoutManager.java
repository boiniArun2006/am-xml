package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {
    final AnchorInfo E2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f41106S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int[] f41107T;
    private boolean ViF;
    private boolean WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f41108X;
    OrientationHelper XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private LayoutState f41109Z;
    boolean aYN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayoutChunkResult f41110e;
    SavedState fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f41111g;
    private boolean iF;
    private boolean nY;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f41112o;
    int te;

    static class AnchorInfo {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f41113O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        OrientationHelper f41114n;
        boolean nr;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f41115t;

        void O() {
            this.rl = -1;
            this.f41115t = Integer.MIN_VALUE;
            this.nr = false;
            this.f41113O = false;
        }

        void n() {
            this.f41115t = this.nr ? this.f41114n.xMQ() : this.f41114n.az();
        }

        public void rl(View view, int i2) {
            if (this.nr) {
                this.f41115t = this.f41114n.nr(view) + this.f41114n.HI();
            } else {
                this.f41115t = this.f41114n.Uo(view);
            }
            this.rl = i2;
        }

        public void t(View view, int i2) {
            int iHI = this.f41114n.HI();
            if (iHI >= 0) {
                rl(view, i2);
                return;
            }
            this.rl = i2;
            if (this.nr) {
                int iXMQ = (this.f41114n.xMQ() - iHI) - this.f41114n.nr(view);
                this.f41115t = this.f41114n.xMQ() - iXMQ;
                if (iXMQ > 0) {
                    int iO = this.f41115t - this.f41114n.O(view);
                    int iAz = this.f41114n.az();
                    int iMin = iO - (iAz + Math.min(this.f41114n.Uo(view) - iAz, 0));
                    if (iMin < 0) {
                        this.f41115t += Math.min(iXMQ, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iUo = this.f41114n.Uo(view);
            int iAz2 = iUo - this.f41114n.az();
            this.f41115t = iUo;
            if (iAz2 > 0) {
                int iXMQ2 = (this.f41114n.xMQ() - Math.min(0, (this.f41114n.xMQ() - iHI) - this.f41114n.nr(view))) - (iUo + this.f41114n.O(view));
                if (iXMQ2 < 0) {
                    this.f41115t -= Math.min(iAz2, -iXMQ2);
                }
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.rl + ", mCoordinate=" + this.f41115t + ", mLayoutFromEnd=" + this.nr + ", mValid=" + this.f41113O + '}';
        }

        AnchorInfo() {
            O();
        }

        boolean nr(View view, RecyclerView.State state) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.t() && layoutParams.n() >= 0 && layoutParams.n() < state.rl()) {
                return true;
            }
            return false;
        }
    }

    static class LayoutState {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f41118O;
        int Uo;
        boolean az;
        int gh;
        int nr;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f41120t;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f41119n = true;
        int KN = 0;
        int xMQ = 0;
        boolean mUb = false;
        List qie = null;

        public void n() {
            rl(null);
        }

        private View O() {
            int size = this.qie.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = ((RecyclerView.ViewHolder) this.qie.get(i2)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.t() && this.nr == layoutParams.n()) {
                    rl(view);
                    return view;
                }
            }
            return null;
        }

        public View J2(View view) {
            int iN;
            int size = this.qie.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = ((RecyclerView.ViewHolder) this.qie.get(i3)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.t() && (iN = (layoutParams.n() - this.nr) * this.f41118O) >= 0 && iN < i2) {
                    if (iN == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i2 = iN;
                }
            }
            return view2;
        }

        View nr(RecyclerView.Recycler recycler) {
            if (this.qie != null) {
                return O();
            }
            View viewHI = recycler.HI(this.nr);
            this.nr += this.f41118O;
            return viewHI;
        }

        boolean t(RecyclerView.State state) {
            int i2 = this.nr;
            return i2 >= 0 && i2 < state.rl();
        }

        LayoutState() {
        }

        public void rl(View view) {
            View viewJ2 = J2(view);
            if (viewJ2 == null) {
                this.nr = -1;
            } else {
                this.nr = ((RecyclerView.LayoutParams) viewJ2.getLayoutParams()).n();
            }
        }
    }

    @RestrictTo
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.LinearLayoutManager.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f41121O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41122n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f41123t;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        void rl() {
            this.f41122n = -1;
        }

        SavedState(Parcel parcel) {
            this.f41122n = parcel.readInt();
            this.f41123t = parcel.readInt();
            this.f41121O = parcel.readInt() == 1;
        }

        boolean n() {
            return this.f41122n >= 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f41122n);
            parcel.writeInt(this.f41123t);
            parcel.writeInt(this.f41121O ? 1 : 0);
        }

        public SavedState(SavedState savedState) {
            this.f41122n = savedState.f41122n;
            this.f41123t = savedState.f41123t;
            this.f41121O = savedState.f41121O;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private View d() {
        return c32(0, M());
    }

    int A(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.f41112o == 1) ? 1 : Integer.MIN_VALUE : this.f41112o == 0 ? 1 : Integer.MIN_VALUE : this.f41112o == 1 ? -1 : Integer.MIN_VALUE : this.f41112o == 0 ? -1 : Integer.MIN_VALUE : (this.f41112o != 1 && wYi()) ? -1 : 1 : (this.f41112o != 1 && wYi()) ? 1 : -1;
    }

    public void JI(boolean z2) {
        XQ(null);
        if (this.ViF == z2) {
            return;
        }
        this.ViF = z2;
        QgZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean Po6() {
        return true;
    }

    public void sFO(boolean z2) {
        XQ(null);
        if (z2 == this.WPU) {
            return;
        }
        this.WPU = z2;
        QgZ();
    }

    void yA(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo, int i2) {
    }

    protected static class LayoutChunkResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f41116n;
        public boolean nr;
        public boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f41117t;

        void n() {
            this.f41116n = 0;
            this.rl = false;
            this.f41117t = false;
            this.nr = false;
        }

        protected LayoutChunkResult() {
        }
    }

    public LinearLayoutManager(Context context, int i2, boolean z2) {
        this.f41112o = 1;
        this.WPU = false;
        this.aYN = false;
        this.ViF = false;
        this.nY = true;
        this.f41111g = -1;
        this.te = Integer.MIN_VALUE;
        this.fD = null;
        this.E2 = new AnchorInfo();
        this.f41110e = new LayoutChunkResult();
        this.f41108X = 2;
        this.f41107T = new int[2];
        V5F(i2);
        sFO(z2);
    }

    private void GRh(AnchorInfo anchorInfo) {
        tdZ(anchorInfo.rl, anchorInfo.f41115t);
    }

    private int HFS(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int iAz;
        int iAz2 = i2 - this.XQ.az();
        if (iAz2 <= 0) {
            return 0;
        }
        int i3 = -XUb(iAz2, recycler, state);
        int i5 = i2 + i3;
        if (!z2 || (iAz = i5 - this.XQ.az()) <= 0) {
            return i3;
        }
        this.XQ.r(-iAz);
        return i3 - iAz;
    }

    private View Om() {
        return this.aYN ? d() : HE();
    }

    private void Qg8(int i2, int i3, boolean z2, RecyclerView.State state) {
        int iAz;
        this.f41109Z.az = kQ();
        this.f41109Z.J2 = i2;
        int[] iArr = this.f41107T;
        iArr[0] = 0;
        iArr[1] = 0;
        iV(state, iArr);
        int iMax = Math.max(0, this.f41107T[0]);
        int iMax2 = Math.max(0, this.f41107T[1]);
        boolean z3 = i2 == 1;
        LayoutState layoutState = this.f41109Z;
        int i5 = z3 ? iMax2 : iMax;
        layoutState.KN = i5;
        if (!z3) {
            iMax = iMax2;
        }
        layoutState.xMQ = iMax;
        if (z3) {
            layoutState.KN = i5 + this.XQ.mUb();
            View viewEb = eb();
            LayoutState layoutState2 = this.f41109Z;
            layoutState2.f41118O = this.aYN ? -1 : 1;
            int iFcU = fcU(viewEb);
            LayoutState layoutState3 = this.f41109Z;
            layoutState2.nr = iFcU + layoutState3.f41118O;
            layoutState3.rl = this.XQ.nr(viewEb);
            iAz = this.XQ.nr(viewEb) - this.XQ.xMQ();
        } else {
            View viewXli = Xli();
            this.f41109Z.KN += this.XQ.az();
            LayoutState layoutState4 = this.f41109Z;
            layoutState4.f41118O = this.aYN ? 1 : -1;
            int iFcU2 = fcU(viewXli);
            LayoutState layoutState5 = this.f41109Z;
            layoutState4.nr = iFcU2 + layoutState5.f41118O;
            layoutState5.rl = this.XQ.Uo(viewXli);
            iAz = (-this.XQ.Uo(viewXli)) + this.XQ.az();
        }
        LayoutState layoutState6 = this.f41109Z;
        layoutState6.f41120t = i3;
        if (z2) {
            layoutState6.f41120t = i3 - iAz;
        }
        layoutState6.Uo = iAz;
    }

    private void Rc(int i2, int i3) {
        this.f41109Z.f41120t = i3 - this.XQ.az();
        LayoutState layoutState = this.f41109Z;
        layoutState.nr = i2;
        layoutState.f41118O = this.aYN ? 1 : -1;
        layoutState.J2 = -1;
        layoutState.rl = i3;
        layoutState.Uo = Integer.MIN_VALUE;
    }

    private void Sax(RecyclerView.Recycler recycler, int i2, int i3) {
        if (i2 < 0) {
            return;
        }
        int i5 = i2 - i3;
        int iM = M();
        if (!this.aYN) {
            for (int i7 = 0; i7 < iM; i7++) {
                View viewE = E(i7);
                if (this.XQ.nr(viewE) > i5 || this.XQ.ck(viewE) > i5) {
                    YiW(recycler, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewE2 = E(i9);
            if (this.XQ.nr(viewE2) > i5 || this.XQ.ck(viewE2) > i5) {
                YiW(recycler, i8, i9);
                return;
            }
        }
    }

    private void UR(AnchorInfo anchorInfo) {
        Rc(anchorInfo.rl, anchorInfo.f41115t);
    }

    private View Xli() {
        return E(this.aYN ? M() - 1 : 0);
    }

    private void YiW(RecyclerView.Recycler recycler, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                Th(i2, recycler);
                i2--;
            }
        } else {
            for (int i5 = i3 - 1; i5 >= i2; i5--) {
                Th(i5, recycler);
            }
        }
    }

    private View eb() {
        return E(this.aYN ? 0 : M() - 1);
    }

    private void gxH(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.f41119n || layoutState.az) {
            return;
        }
        int i2 = layoutState.Uo;
        int i3 = layoutState.xMQ;
        if (layoutState.J2 == -1) {
            c(recycler, i2, i3);
        } else {
            Sax(recycler, i2, i3);
        }
    }

    private View t1J() {
        return this.aYN ? HE() : d();
    }

    private void tdZ(int i2, int i3) {
        this.f41109Z.f41120t = this.XQ.xMQ() - i3;
        LayoutState layoutState = this.f41109Z;
        layoutState.f41118O = this.aYN ? -1 : 1;
        layoutState.nr = i2;
        layoutState.J2 = 1;
        layoutState.rl = i3;
        layoutState.Uo = Integer.MIN_VALUE;
    }

    private int w(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int iXMQ;
        int iXMQ2 = this.XQ.xMQ() - i2;
        if (iXMQ2 <= 0) {
            return 0;
        }
        int i3 = -XUb(-iXMQ2, recycler, state);
        int i5 = i2 + i3;
        if (!z2 || (iXMQ = this.XQ.xMQ() - i5) <= 0) {
            return i3;
        }
        this.XQ.r(iXMQ);
        return iXMQ + i3;
    }

    private void x() {
        if (this.f41112o == 1 || !wYi()) {
            this.aYN = this.WPU;
        } else {
            this.aYN = !this.WPU;
        }
    }

    public int C7B() {
        return this.f41112o;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    View GH3(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2, boolean z3) {
        int i2;
        int iM;
        int i3;
        oz();
        int iM2 = M();
        if (z3) {
            iM = M() - 1;
            i2 = -1;
            i3 = -1;
        } else {
            i2 = iM2;
            iM = 0;
            i3 = 1;
        }
        int iRl = state.rl();
        int iAz = this.XQ.az();
        int iXMQ = this.XQ.xMQ();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM != i2) {
            View viewE = E(iM);
            int iFcU = fcU(viewE);
            int iUo = this.XQ.Uo(viewE);
            int iNr = this.XQ.nr(viewE);
            if (iFcU >= 0 && iFcU < iRl) {
                if (!((RecyclerView.LayoutParams) viewE.getLayoutParams()).t()) {
                    boolean z4 = iNr <= iAz && iUo < iAz;
                    boolean z5 = iUo >= iXMQ && iNr > iXMQ;
                    if (!z4 && !z5) {
                        return viewE;
                    }
                    if (z2) {
                        if (z5) {
                            view2 = viewE;
                        } else if (view == null) {
                            view = viewE;
                        }
                    } else if (!z4) {
                        if (view == null) {
                        }
                    }
                } else if (view3 == null) {
                    view3 = viewE;
                }
            }
            iM += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    void I4p(RecyclerView.State state, LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i2 = layoutState.nr;
        if (i2 < 0 || i2 >= state.rl()) {
            return;
        }
        layoutPrefetchRegistry.n(i2, Math.max(0, layoutState.Uo));
    }

    View L(boolean z2, boolean z3) {
        return this.aYN ? l2(M() - 1, -1, z2, z3) : l2(0, M(), z2, z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void LPV(int i2) {
        this.f41111g = i2;
        this.te = Integer.MIN_VALUE;
        SavedState savedState = this.fD;
        if (savedState != null) {
            savedState.rl();
        }
        QgZ();
    }

    public void MPw(int i2) {
        this.f41108X = i2;
    }

    public boolean TVk() {
        return this.nY;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams U() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public void V5F(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        XQ(null);
        if (i2 != this.f41112o || this.XQ == null) {
            OrientationHelper orientationHelperRl = OrientationHelper.rl(this, i2);
            this.XQ = orientationHelperRl;
            this.E2.f41114n = orientationHelperRl;
            this.f41112o = i2;
            QgZ();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean ViF() {
        return this.f41112o == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void Vvq(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        int i3;
        int i5;
        int i7;
        int iW;
        int i8;
        View viewJB;
        int iUo;
        int iXMQ;
        int i9 = -1;
        if (!(this.fD == null && this.f41111g == -1) && state.rl() == 0) {
            jO(recycler);
            return;
        }
        SavedState savedState = this.fD;
        if (savedState != null && savedState.n()) {
            this.f41111g = this.fD.f41122n;
        }
        oz();
        this.f41109Z.f41119n = false;
        x();
        View viewZ = z();
        AnchorInfo anchorInfo = this.E2;
        if (!anchorInfo.f41113O || this.f41111g != -1 || this.fD != null) {
            anchorInfo.O();
            AnchorInfo anchorInfo2 = this.E2;
            anchorInfo2.nr = this.aYN ^ this.ViF;
            iu(recycler, state, anchorInfo2);
            this.E2.f41113O = true;
        } else if (viewZ != null && (this.XQ.Uo(viewZ) >= this.XQ.xMQ() || this.XQ.nr(viewZ) <= this.XQ.az())) {
            this.E2.t(viewZ, fcU(viewZ));
        }
        LayoutState layoutState = this.f41109Z;
        layoutState.J2 = layoutState.gh >= 0 ? 1 : -1;
        int[] iArr = this.f41107T;
        iArr[0] = 0;
        iArr[1] = 0;
        iV(state, iArr);
        int iMax = Math.max(0, this.f41107T[0]) + this.XQ.az();
        int iMax2 = Math.max(0, this.f41107T[1]) + this.XQ.mUb();
        if (state.O() && (i8 = this.f41111g) != -1 && this.te != Integer.MIN_VALUE && (viewJB = jB(i8)) != null) {
            if (this.aYN) {
                iXMQ = this.XQ.xMQ() - this.XQ.nr(viewJB);
                iUo = this.te;
            } else {
                iUo = this.XQ.Uo(viewJB) - this.XQ.az();
                iXMQ = this.te;
            }
            int i10 = iXMQ - iUo;
            if (i10 > 0) {
                iMax += i10;
            } else {
                iMax2 -= i10;
            }
        }
        AnchorInfo anchorInfo3 = this.E2;
        if (!anchorInfo3.nr ? !this.aYN : this.aYN) {
            i9 = 1;
        }
        yA(recycler, state, anchorInfo3, i9);
        s7N(recycler);
        this.f41109Z.az = kQ();
        this.f41109Z.mUb = state.O();
        this.f41109Z.xMQ = 0;
        AnchorInfo anchorInfo4 = this.E2;
        if (anchorInfo4.nr) {
            UR(anchorInfo4);
            LayoutState layoutState2 = this.f41109Z;
            layoutState2.KN = iMax;
            qva(recycler, layoutState2, state, false);
            LayoutState layoutState3 = this.f41109Z;
            i3 = layoutState3.rl;
            int i11 = layoutState3.nr;
            int i12 = layoutState3.f41120t;
            if (i12 > 0) {
                iMax2 += i12;
            }
            GRh(this.E2);
            LayoutState layoutState4 = this.f41109Z;
            layoutState4.KN = iMax2;
            layoutState4.nr += layoutState4.f41118O;
            qva(recycler, layoutState4, state, false);
            LayoutState layoutState5 = this.f41109Z;
            i2 = layoutState5.rl;
            int i13 = layoutState5.f41120t;
            if (i13 > 0) {
                Rc(i11, i3);
                LayoutState layoutState6 = this.f41109Z;
                layoutState6.KN = i13;
                qva(recycler, layoutState6, state, false);
                i3 = this.f41109Z.rl;
            }
        } else {
            GRh(anchorInfo4);
            LayoutState layoutState7 = this.f41109Z;
            layoutState7.KN = iMax2;
            qva(recycler, layoutState7, state, false);
            LayoutState layoutState8 = this.f41109Z;
            i2 = layoutState8.rl;
            int i14 = layoutState8.nr;
            int i15 = layoutState8.f41120t;
            if (i15 > 0) {
                iMax += i15;
            }
            UR(this.E2);
            LayoutState layoutState9 = this.f41109Z;
            layoutState9.KN = iMax;
            layoutState9.nr += layoutState9.f41118O;
            qva(recycler, layoutState9, state, false);
            LayoutState layoutState10 = this.f41109Z;
            i3 = layoutState10.rl;
            int i16 = layoutState10.f41120t;
            if (i16 > 0) {
                tdZ(i14, i2);
                LayoutState layoutState11 = this.f41109Z;
                layoutState11.KN = i16;
                qva(recycler, layoutState11, state, false);
                i2 = this.f41109Z.rl;
            }
        }
        if (M() > 0) {
            if (this.aYN ^ this.ViF) {
                int iW2 = w(i2, recycler, state, true);
                i5 = i3 + iW2;
                i7 = i2 + iW2;
                iW = HFS(i5, recycler, state, false);
            } else {
                int iHFS = HFS(i3, recycler, state, true);
                i5 = i3 + iHFS;
                i7 = i2 + iHFS;
                iW = w(i7, recycler, state, false);
            }
            i3 = i5 + iW;
            i2 = i7 + iW;
        }
        n7u(recycler, state, i3, i2);
        if (state.O()) {
            this.E2.O();
        } else {
            this.XQ.o();
        }
        this.f41106S = this.ViF;
    }

    LayoutState WH() {
        return new LayoutState();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void XQ(String str) {
        if (this.fD == null) {
            super.XQ(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void fD(int i2, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z2;
        int i3;
        SavedState savedState = this.fD;
        if (savedState == null || !savedState.n()) {
            x();
            z2 = this.aYN;
            i3 = this.f41111g;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.fD;
            z2 = savedState2.f41121O;
            i3 = savedState2.f41122n;
        }
        int i5 = z2 ? -1 : 1;
        for (int i7 = 0; i7 < this.f41108X && i3 >= 0 && i3 < i2; i7++) {
            layoutPrefetchRegistry.n(i3, 0);
            i3 += i5;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean i() {
        return this.WPU;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void iF(int i2, int i3, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.f41112o != 0) {
            i2 = i3;
        }
        if (M() == 0 || i2 == 0) {
            return;
        }
        oz();
        Qg8(i2 > 0 ? 1 : -1, Math.abs(i2), true, state);
        I4p(state, this.f41109Z, layoutPrefetchRegistry);
    }

    boolean kQ() {
        return this.XQ.gh() == 0 && this.XQ.KN() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean lS() {
        return this.fD == null && this.f41106S == this.ViF;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
    public void mUb(View view, View view2, int i2, int i3) {
        XQ("Cannot drop a view during a scroll or layout calculation");
        oz();
        x();
        int iFcU = fcU(view);
        int iFcU2 = fcU(view2);
        byte b2 = iFcU < iFcU2 ? (byte) 1 : (byte) -1;
        if (this.aYN) {
            if (b2 == 1) {
                rR(iFcU2, this.XQ.xMQ() - (this.XQ.Uo(view2) + this.XQ.O(view)));
                return;
            } else {
                rR(iFcU2, this.XQ.xMQ() - this.XQ.nr(view2));
                return;
            }
        }
        if (b2 == -1) {
            rR(iFcU2, this.XQ.Uo(view2));
        } else {
            rR(iFcU2, this.XQ.nr(view2) - this.XQ.O(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean nY() {
        return this.f41112o == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable o9() {
        if (this.fD != null) {
            return new SavedState(this.fD);
        }
        SavedState savedState = new SavedState();
        if (M() <= 0) {
            savedState.rl();
            return savedState;
        }
        oz();
        boolean z2 = this.f41106S ^ this.aYN;
        savedState.f41121O = z2;
        if (z2) {
            View viewEb = eb();
            savedState.f41123t = this.XQ.xMQ() - this.XQ.nr(viewEb);
            savedState.f41122n = fcU(viewEb);
            return savedState;
        }
        View viewXli = Xli();
        savedState.f41122n = fcU(viewXli);
        savedState.f41123t = this.XQ.Uo(viewXli) - this.XQ.az();
        return savedState;
    }

    void oz() {
        if (this.f41109Z == null) {
            this.f41109Z = WH();
        }
    }

    int qva(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state, boolean z2) {
        int i2 = layoutState.f41120t;
        int i3 = layoutState.Uo;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                layoutState.Uo = i3 + i2;
            }
            gxH(recycler, layoutState);
        }
        int i5 = layoutState.f41120t + layoutState.KN;
        LayoutChunkResult layoutChunkResult = this.f41110e;
        while (true) {
            if ((!layoutState.az && i5 <= 0) || !layoutState.t(state)) {
                break;
            }
            layoutChunkResult.n();
            lRt(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.rl) {
                layoutState.rl += layoutChunkResult.f41116n * layoutState.J2;
                if (!layoutChunkResult.f41117t || layoutState.qie != null || !state.O()) {
                    int i7 = layoutState.f41120t;
                    int i8 = layoutChunkResult.f41116n;
                    layoutState.f41120t = i7 - i8;
                    i5 -= i8;
                }
                int i9 = layoutState.Uo;
                if (i9 != Integer.MIN_VALUE) {
                    int i10 = i9 + layoutChunkResult.f41116n;
                    layoutState.Uo = i10;
                    int i11 = layoutState.f41120t;
                    if (i11 < 0) {
                        layoutState.Uo = i10 + i11;
                    }
                    gxH(recycler, layoutState);
                }
                if (z2 && layoutChunkResult.nr) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - layoutState.f41120t;
    }

    public void rR(int i2, int i3) {
        this.f41111g = i2;
        this.te = i3;
        SavedState savedState = this.fD;
        if (savedState != null) {
            savedState.rl();
        }
        QgZ();
    }

    View rT(boolean z2, boolean z3) {
        return this.aYN ? l2(0, M(), z2, z3) : l2(M() - 1, -1, z2, z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int rxp(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f41112o == 0) {
            return 0;
        }
        return XUb(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void uQ(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.ck(i2);
        wKY(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void v0j(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.fD = savedState;
            if (this.f41111g != -1) {
                savedState.rl();
            }
            QgZ();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int waP(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f41112o == 1) {
            return 0;
        }
        return XUb(i2, recycler, state);
    }

    private int Co(RecyclerView.State state) {
        if (M() == 0) {
            return 0;
        }
        oz();
        return ScrollbarHelper.rl(state, this.XQ, L(!this.nY, true), rT(!this.nY, true), this, this.nY, this.aYN);
    }

    private View HE() {
        return c32(M() - 1, -1);
    }

    private boolean Of6(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
        View viewGH3;
        boolean z2;
        boolean z3 = false;
        if (M() == 0) {
            return false;
        }
        View viewZ = z();
        if (viewZ != null && anchorInfo.nr(viewZ, state)) {
            anchorInfo.t(viewZ, fcU(viewZ));
            return true;
        }
        boolean z4 = this.f41106S;
        boolean z5 = this.ViF;
        if (z4 != z5 || (viewGH3 = GH3(recycler, state, anchorInfo.nr, z5)) == null) {
            return false;
        }
        anchorInfo.rl(viewGH3, fcU(viewGH3));
        if (!state.O() && lS()) {
            int iUo = this.XQ.Uo(viewGH3);
            int iNr = this.XQ.nr(viewGH3);
            int iAz = this.XQ.az();
            int iXMQ = this.XQ.xMQ();
            if (iNr <= iAz && iUo < iAz) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (iUo >= iXMQ && iNr > iXMQ) {
                z3 = true;
            }
            if (z2 || z3) {
                if (anchorInfo.nr) {
                    iAz = iXMQ;
                }
                anchorInfo.f41115t = iAz;
            }
        }
        return true;
    }

    private int bZm(RecyclerView.State state) {
        if (M() == 0) {
            return 0;
        }
        oz();
        return ScrollbarHelper.n(state, this.XQ, L(!this.nY, true), rT(!this.nY, true), this, this.nY);
    }

    private void c(RecyclerView.Recycler recycler, int i2, int i3) {
        int iM = M();
        if (i2 >= 0) {
            int iKN = (this.XQ.KN() - i2) + i3;
            if (this.aYN) {
                for (int i5 = 0; i5 < iM; i5++) {
                    View viewE = E(i5);
                    if (this.XQ.Uo(viewE) < iKN || this.XQ.Ik(viewE) < iKN) {
                        YiW(recycler, 0, i5);
                        return;
                    }
                }
                return;
            }
            int i7 = iM - 1;
            for (int i8 = i7; i8 >= 0; i8--) {
                View viewE2 = E(i8);
                if (this.XQ.Uo(viewE2) < iKN || this.XQ.Ik(viewE2) < iKN) {
                    YiW(recycler, i7, i8);
                    return;
                }
            }
        }
    }

    private void iu(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
        int iRl;
        if (jX(state, anchorInfo) || Of6(recycler, state, anchorInfo)) {
            return;
        }
        anchorInfo.n();
        if (this.ViF) {
            iRl = state.rl() - 1;
        } else {
            iRl = 0;
        }
        anchorInfo.rl = iRl;
    }

    private boolean jX(RecyclerView.State state, AnchorInfo anchorInfo) {
        int i2;
        boolean z2;
        int iUo;
        boolean z3 = false;
        if (!state.O() && (i2 = this.f41111g) != -1) {
            if (i2 >= 0 && i2 < state.rl()) {
                anchorInfo.rl = this.f41111g;
                SavedState savedState = this.fD;
                if (savedState != null && savedState.n()) {
                    boolean z4 = this.fD.f41121O;
                    anchorInfo.nr = z4;
                    if (z4) {
                        anchorInfo.f41115t = this.XQ.xMQ() - this.fD.f41123t;
                    } else {
                        anchorInfo.f41115t = this.XQ.az() + this.fD.f41123t;
                    }
                    return true;
                }
                if (this.te == Integer.MIN_VALUE) {
                    View viewJB = jB(this.f41111g);
                    if (viewJB != null) {
                        if (this.XQ.O(viewJB) > this.XQ.ty()) {
                            anchorInfo.n();
                            return true;
                        }
                        if (this.XQ.Uo(viewJB) - this.XQ.az() < 0) {
                            anchorInfo.f41115t = this.XQ.az();
                            anchorInfo.nr = false;
                            return true;
                        }
                        if (this.XQ.xMQ() - this.XQ.nr(viewJB) < 0) {
                            anchorInfo.f41115t = this.XQ.xMQ();
                            anchorInfo.nr = true;
                            return true;
                        }
                        if (anchorInfo.nr) {
                            iUo = this.XQ.nr(viewJB) + this.XQ.HI();
                        } else {
                            iUo = this.XQ.Uo(viewJB);
                        }
                        anchorInfo.f41115t = iUo;
                    } else {
                        if (M() > 0) {
                            if (this.f41111g < fcU(E(0))) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2 == this.aYN) {
                                z3 = true;
                            }
                            anchorInfo.nr = z3;
                        }
                        anchorInfo.n();
                    }
                    return true;
                }
                boolean z5 = this.aYN;
                anchorInfo.nr = z5;
                if (z5) {
                    anchorInfo.f41115t = this.XQ.xMQ() - this.te;
                } else {
                    anchorInfo.f41115t = this.XQ.az() + this.te;
                }
                return true;
            }
            this.f41111g = -1;
            this.te = Integer.MIN_VALUE;
        }
        return false;
    }

    private void n7u(RecyclerView.Recycler recycler, RecyclerView.State state, int i2, int i3) {
        boolean z2;
        if (state.Uo() && M() != 0 && !state.O() && lS()) {
            List listGh = recycler.gh();
            int size = listGh.size();
            int iFcU = fcU(E(0));
            int iO = 0;
            int iO2 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) listGh.get(i5);
                if (!viewHolder.isRemoved()) {
                    if (viewHolder.getLayoutPosition() < iFcU) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 != this.aYN) {
                        iO += this.XQ.O(viewHolder.itemView);
                    } else {
                        iO2 += this.XQ.O(viewHolder.itemView);
                    }
                }
            }
            this.f41109Z.qie = listGh;
            if (iO > 0) {
                Rc(fcU(Xli()), i2);
                LayoutState layoutState = this.f41109Z;
                layoutState.KN = iO;
                layoutState.f41120t = 0;
                layoutState.n();
                qva(recycler, this.f41109Z, state, false);
            }
            if (iO2 > 0) {
                tdZ(fcU(eb()), i3);
                LayoutState layoutState2 = this.f41109Z;
                layoutState2.KN = iO2;
                layoutState2.f41120t = 0;
                layoutState2.n();
                qva(recycler, this.f41109Z, state, false);
            }
            this.f41109Z.qie = null;
        }
    }

    private int q9(RecyclerView.State state) {
        if (M() == 0) {
            return 0;
        }
        oz();
        return ScrollbarHelper.t(state, this.XQ, L(!this.nY, true), rT(!this.nY, true), this, this.nY);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View Bu(View view, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iA;
        View viewOm;
        View viewEb;
        x();
        if (M() == 0 || (iA = A(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        oz();
        Qg8(iA, (int) (this.XQ.ty() * 0.33333334f), false, state);
        LayoutState layoutState = this.f41109Z;
        layoutState.Uo = Integer.MIN_VALUE;
        layoutState.f41119n = false;
        qva(recycler, layoutState, state, true);
        if (iA == -1) {
            viewOm = t1J();
        } else {
            viewOm = Om();
        }
        if (iA == -1) {
            viewEb = Xli();
        } else {
            viewEb = eb();
        }
        if (viewEb.hasFocusable()) {
            if (viewOm == null) {
                return null;
            }
            return viewEb;
        }
        return viewOm;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int E2(RecyclerView.State state) {
        return bZm(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF KN(int i2) {
        if (M() == 0) {
            return null;
        }
        boolean z2 = false;
        int i3 = 1;
        if (i2 < fcU(E(0))) {
            z2 = true;
        }
        if (z2 != this.aYN) {
            i3 = -1;
        }
        if (this.f41112o == 0) {
            return new PointF(i3, 0.0f);
        }
        return new PointF(0.0f, i3);
    }

    public int Lu() {
        View viewL2 = l2(0, M(), false, true);
        if (viewL2 == null) {
            return -1;
        }
        return fcU(viewL2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int N(RecyclerView.State state) {
        return Co(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int T(RecyclerView.State state) {
        return bZm(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void T3L(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.T3L(recyclerView, recycler);
        if (this.iF) {
            jO(recycler);
            recycler.t();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int X(RecyclerView.State state) {
        return q9(state);
    }

    int XUb(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i3;
        if (M() == 0 || i2 == 0) {
            return 0;
        }
        oz();
        this.f41109Z.f41119n = true;
        if (i2 > 0) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int iAbs = Math.abs(i2);
        Qg8(i3, iAbs, true, state);
        LayoutState layoutState = this.f41109Z;
        int iQva = layoutState.Uo + qva(recycler, layoutState, state, false);
        if (iQva < 0) {
            return 0;
        }
        if (iAbs > iQva) {
            i2 = i3 * iQva;
        }
        this.XQ.r(-i2);
        this.f41109Z.gh = i2;
        return i2;
    }

    View c32(int i2, int i3) {
        int i5;
        int i7;
        oz();
        if (i3 > i2 || i3 < i2) {
            if (this.XQ.Uo(E(i2)) < this.XQ.az()) {
                i5 = 16644;
                i7 = 16388;
            } else {
                i5 = 4161;
                i7 = 4097;
            }
            if (this.f41112o == 0) {
                return this.f41161O.n(i2, i3, i5, i7);
            }
            return this.J2.n(i2, i3, i5, i7);
        }
        return E(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int e(RecyclerView.State state) {
        return Co(state);
    }

    public int fW() {
        View viewL2 = l2(M() - 1, -1, false, true);
        if (viewL2 == null) {
            return -1;
        }
        return fcU(viewL2);
    }

    protected int fq(RecyclerView.State state) {
        if (state.nr()) {
            return this.XQ.ty();
        }
        return 0;
    }

    protected void iV(RecyclerView.State state, int[] iArr) {
        int i2;
        int iFq = fq(state);
        if (this.f41109Z.J2 == -1) {
            i2 = 0;
        } else {
            i2 = iFq;
            iFq = 0;
        }
        iArr[0] = iFq;
        iArr[1] = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View jB(int i2) {
        int iM = M();
        if (iM == 0) {
            return null;
        }
        int iFcU = i2 - fcU(E(0));
        if (iFcU >= 0 && iFcU < iM) {
            View viewE = E(iFcU);
            if (fcU(viewE) == i2) {
                return viewE;
            }
        }
        return super.jB(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    boolean l() {
        if (ijL() != 1073741824 && Org() != 1073741824 && HV()) {
            return true;
        }
        return false;
    }

    View l2(int i2, int i3, boolean z2, boolean z3) {
        int i5;
        oz();
        int i7 = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        if (z2) {
            i5 = 24579;
        } else {
            i5 = 320;
        }
        if (!z3) {
            i7 = 0;
        }
        if (this.f41112o == 0) {
            return this.f41161O.n(i2, i3, i5, i7);
        }
        return this.J2.n(i2, i3, i5, i7);
    }

    void lRt(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        boolean z2;
        int i2;
        int i3;
        int i5;
        int i7;
        int iC;
        int iJ2;
        int i8;
        int i9;
        boolean z3;
        View viewNr = layoutState.nr(recycler);
        if (viewNr == null) {
            layoutChunkResult.rl = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewNr.getLayoutParams();
        if (layoutState.qie == null) {
            boolean z4 = this.aYN;
            if (layoutState.J2 == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z4 == z3) {
                r(viewNr);
            } else {
                o(viewNr, 0);
            }
        } else {
            boolean z5 = this.aYN;
            if (layoutState.J2 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z5 == z2) {
                ck(viewNr);
            } else {
                Ik(viewNr, 0);
            }
        }
        W(viewNr, 0, 0);
        layoutChunkResult.f41116n = this.XQ.O(viewNr);
        if (this.f41112o == 1) {
            if (wYi()) {
                iJ2 = mYa() - Mx();
                iC = iJ2 - this.XQ.J2(viewNr);
            } else {
                iC = C();
                iJ2 = this.XQ.J2(viewNr) + iC;
            }
            if (layoutState.J2 == -1) {
                i9 = layoutState.rl;
                i8 = i9 - layoutChunkResult.f41116n;
            } else {
                i8 = layoutState.rl;
                i9 = layoutChunkResult.f41116n + i8;
            }
            int i10 = iC;
            i7 = i8;
            i5 = i10;
            i3 = i9;
            i2 = iJ2;
        } else {
            int iG7 = G7();
            int iJ22 = this.XQ.J2(viewNr) + iG7;
            if (layoutState.J2 == -1) {
                int i11 = layoutState.rl;
                i5 = i11 - layoutChunkResult.f41116n;
                i2 = i11;
                i3 = iJ22;
            } else {
                int i12 = layoutState.rl;
                i2 = layoutChunkResult.f41116n + i12;
                i3 = iJ22;
                i5 = i12;
            }
            i7 = iG7;
        }
        lLA(viewNr, i5, i7, i2, i3);
        if (layoutParams.t() || layoutParams.rl()) {
            layoutChunkResult.f41117t = true;
        }
        layoutChunkResult.nr = viewNr.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int nHg(RecyclerView.State state) {
        return q9(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void p0N(AccessibilityEvent accessibilityEvent) {
        super.p0N(accessibilityEvent);
        if (M() > 0) {
            accessibilityEvent.setFromIndex(Lu());
            accessibilityEvent.setToIndex(fW());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    boolean s(int i2, Bundle bundle) {
        int iMin;
        if (super.s(i2, bundle)) {
            return true;
        }
        if (i2 == 16908343 && bundle != null) {
            if (this.f41112o == 1) {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.rl;
                iMin = Math.min(i3, n1(recyclerView.mRecycler, recyclerView.mState) - 1);
            } else {
                int i5 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i5 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.rl;
                iMin = Math.min(i5, D(recyclerView2.mRecycler, recyclerView2.mState) - 1);
            }
            if (iMin >= 0) {
                rR(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void ub(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.ub(recycler, state, accessibilityNodeInfoCompat);
        RecyclerView.Adapter adapter = this.rl.mAdapter;
        if (adapter != null && adapter.getItemCount() > 0) {
            accessibilityNodeInfoCompat.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.te);
        }
    }

    protected boolean wYi() {
        if (m() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void y(RecyclerView.State state) {
        super.y(state);
        this.fD = null;
        this.f41111g = -1;
        this.te = Integer.MIN_VALUE;
        this.E2.O();
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f41112o = 1;
        this.WPU = false;
        this.aYN = false;
        this.ViF = false;
        this.nY = true;
        this.f41111g = -1;
        this.te = Integer.MIN_VALUE;
        this.fD = null;
        this.E2 = new AnchorInfo();
        this.f41110e = new LayoutChunkResult();
        this.f41108X = 2;
        this.f41107T = new int[2];
        RecyclerView.LayoutManager.Properties propertiesEWT = RecyclerView.LayoutManager.eWT(context, attributeSet, i2, i3);
        V5F(propertiesEWT.f41167n);
        sFO(propertiesEWT.f41168t);
        JI(propertiesEWT.nr);
    }
}
