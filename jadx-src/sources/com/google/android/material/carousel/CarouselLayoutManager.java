package com.google.android.material.carousel;

import Rxk.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.Wre;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements com.google.android.material.carousel.n, RecyclerView.SmoothScroller.ScrollVectorProvider {
    private int E2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f58773S;
    private CN3 ViF;
    private final w6 WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f58774X;
    int XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f58775Z;
    private com.google.android.material.carousel.Ml aYN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58776e;
    private final View.OnLayoutChangeListener fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f58777g;
    private com.google.android.material.carousel.w6 iF;
    private Wre nY;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f58778o;
    private Map te;

    class j extends LinearSmoothScroller {
        j(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int XQ(View view, int i2) {
            if (CarouselLayoutManager.this.ViF == null || CarouselLayoutManager.this.t()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.l2(carouselLayoutManager.fcU(view));
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int Z(View view, int i2) {
            if (CarouselLayoutManager.this.ViF == null || !CarouselLayoutManager.this.t()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.l2(carouselLayoutManager.fcU(view));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public PointF n(int i2) {
            return CarouselLayoutManager.this.KN(i2);
        }
    }

    private static class w6 extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Paint f58782n;
        private List rl;

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void gh(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            super.gh(canvas, recyclerView, state);
            this.f58782n.setStrokeWidth(recyclerView.getResources().getDimension(Rxk.Ml.Ik));
            for (Wre.w6 w6Var : this.rl) {
                this.f58782n.setColor(ColorUtils.nr(-65281, -16776961, w6Var.f58791t));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).t()) {
                    canvas.drawLine(w6Var.rl, ((CarouselLayoutManager) recyclerView.getLayoutManager()).x(), w6Var.rl, ((CarouselLayoutManager) recyclerView.getLayoutManager()).gxH(), this.f58782n);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).c(), w6Var.rl, ((CarouselLayoutManager) recyclerView.getLayoutManager()).Sax(), w6Var.rl, this.f58782n);
                }
            }
        }

        w6() {
            Paint paint = new Paint();
            this.f58782n = paint;
            this.rl = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        void qie(List list) {
            this.rl = Collections.unmodifiableList(list);
        }
    }

    public CarouselLayoutManager() {
        this(new fuX());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void GRh() {
        this.ViF = null;
        QgZ();
    }

    private static int Om(int i2, int i3, int i5, int i7) {
        int i8 = i3 + i2;
        return i8 < i5 ? i5 - i3 : i8 > i7 ? i7 - i3 : i2;
    }

    private static Ml V5F(List list, float f3, boolean z2) {
        float f4 = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = -1;
        int i5 = -1;
        int i7 = -1;
        float f5 = -3.4028235E38f;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        for (int i8 = 0; i8 < list.size(); i8++) {
            Wre.w6 w6Var = (Wre.w6) list.get(i8);
            float f8 = z2 ? w6Var.rl : w6Var.f58790n;
            float fAbs = Math.abs(f8 - f3);
            if (f8 <= f3 && fAbs <= f4) {
                i2 = i8;
                f4 = fAbs;
            }
            if (f8 > f3 && fAbs <= f6) {
                i5 = i8;
                f6 = fAbs;
            }
            if (f8 <= f7) {
                i3 = i8;
                f7 = f8;
            }
            if (f8 > f5) {
                i7 = i8;
                f5 = f8;
            }
        }
        if (i2 == -1) {
            i2 = i3;
        }
        if (i5 == -1) {
            i5 = i7;
        }
        return new Ml((Wre.w6) list.get(i2), (Wre.w6) list.get(i5));
    }

    private void pr(View view, float f3, Ml ml) {
    }

    private void tdZ(RecyclerView.Recycler recycler) {
        View viewHI = recycler.HI(0);
        W(viewHI, 0, 0);
        Wre wreUo = this.aYN.Uo(this, viewHI);
        if (sFO()) {
            wreUo = Wre.ty(wreUo, Xli());
        }
        this.ViF = CN3.J2(this, wreUo, C7B(), TVk(), XUb());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean Po6() {
        return true;
    }

    private static class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Wre.w6 f58779n;
        final Wre.w6 rl;

        Ml(Wre.w6 w6Var, Wre.w6 w6Var2) {
            boolean z2;
            if (w6Var.f58790n <= w6Var2.f58790n) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.n(z2);
            this.f58779n = w6Var;
            this.rl = w6Var2;
        }
    }

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final View f58780n;
        final Ml nr;
        final float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final float f58781t;

        n(View view, float f3, float f4, Ml ml) {
            this.f58780n = view;
            this.rl = f3;
            this.f58781t = f4;
            this.nr = ml;
        }
    }

    public CarouselLayoutManager(com.google.android.material.carousel.Ml ml) {
        this(ml, 0);
    }

    private float HE(View view, float f3, Ml ml) {
        Wre.w6 w6Var = ml.f58779n;
        float f4 = w6Var.rl;
        Wre.w6 w6Var2 = ml.rl;
        float fRl = G7.j.rl(f4, w6Var2.rl, w6Var.f58790n, w6Var2.f58790n, f3);
        if (ml.rl != this.nY.t() && ml.f58779n != this.nY.mUb()) {
            return fRl;
        }
        float fNr = this.iF.nr((RecyclerView.LayoutParams) view.getLayoutParams()) / this.nY.J2();
        Wre.w6 w6Var3 = ml.rl;
        return fRl + ((f3 - w6Var3.f58790n) * ((1.0f - w6Var3.f58791t) + fNr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Sax() {
        return this.iF.KN();
    }

    private void Vd() {
        if (!this.f58773S || M() < 1) {
            return;
        }
        int i2 = 0;
        while (i2 < M() - 1) {
            int iFcU = fcU(E(i2));
            int i3 = i2 + 1;
            int iFcU2 = fcU(E(i3));
            if (iFcU > iFcU2) {
                jX();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i2 + "] had adapter position [" + iFcU + "] and child at index [" + i3 + "] had adapter position [" + iFcU2 + "].");
            }
            i2 = i3;
        }
    }

    private int YiW() {
        return this.iF.J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        return this.iF.Uo();
    }

    private void ex(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.UhV);
            NC9(typedArrayObtainStyledAttributes.getInt(o.f8868i, 0));
            W1c(typedArrayObtainStyledAttributes.getInt(o.vdt, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private float fq(View view) {
        super.I(view, new Rect());
        return t() ? r0.centerX() : r0.centerY();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int gxH() {
        return this.iF.O();
    }

    private void jX() {
        if (this.f58773S && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i2 = 0; i2 < M(); i2++) {
                View viewE = E(i2);
                Log.d("CarouselLayoutManager", "item position " + fcU(viewE) + ", center:" + fq(viewE) + ", child index:" + i2);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private int kQ() {
        return this.iF.xMQ();
    }

    private float lRt(float f3, Ml ml) {
        Wre.w6 w6Var = ml.f58779n;
        float f4 = w6Var.nr;
        Wre.w6 w6Var2 = ml.rl;
        return G7.j.rl(f4, w6Var2.nr, w6Var.rl, w6Var2.rl, f3);
    }

    private void ni(CN3 cn3) {
        int i2 = this.XQ;
        int i3 = this.f58775Z;
        if (i2 <= i3) {
            this.nY = sFO() ? cn3.KN() : cn3.qie();
        } else {
            this.nY = cn3.mUb(this.f58778o, i3, i2);
        }
        this.WPU.qie(this.nY.Uo());
    }

    private void oz(View view, int i2, n nVar) {
        float fJ2 = this.nY.J2() / 2.0f;
        o(view, i2);
        float f3 = nVar.f58781t;
        this.iF.gh(view, (int) (f3 - fJ2), (int) (f3 + fJ2));
        pr(view, nVar.rl, nVar.nr);
    }

    private void rT(RecyclerView.Recycler recycler, int i2, int i3) {
        if (i2 < 0 || i2 >= n()) {
            return;
        }
        n nVarIu = iu(recycler, fW(i2), i2);
        oz(nVarIu.f58780n, i3, nVarIu);
    }

    private Wre wYi(int i2) {
        Wre wre;
        Map map = this.te;
        return (map == null || (wre = (Wre) map.get(Integer.valueOf(MathUtils.rl(i2, 0, Math.max(0, n() + (-1)))))) == null) ? this.ViF.Uo() : wre;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int x() {
        return this.iF.mUb();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF KN(int i2) {
        if (this.ViF == null) {
            return null;
        }
        int iN7u = n7u(i2, wYi(i2));
        return t() ? new PointF(iN7u, 0.0f) : new PointF(0.0f, iN7u);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void LPV(int i2) {
        this.f58776e = i2;
        if (this.ViF == null) {
            return;
        }
        this.f58778o = rR(i2, wYi(i2));
        this.f58777g = MathUtils.rl(i2, 0, Math.max(0, n() - 1));
        ni(this.ViF);
        QgZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int N(RecyclerView.State state) {
        return this.f58778o;
    }

    public void NC9(int i2) {
        this.f58774X = i2;
        GRh();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean NP(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int iMPw;
        if (this.ViF == null || (iMPw = MPw(fcU(view), wYi(fcU(view)))) == 0) {
            return false;
        }
        W5k(recyclerView, MPw(fcU(view), this.ViF.mUb(this.f58778o + Om(iMPw, this.f58778o, this.f58775Z, this.XQ), this.f58775Z, this.XQ)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams U() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void W(View view, int i2, int i3) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public void W1c(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        XQ(null);
        com.google.android.material.carousel.w6 w6Var = this.iF;
        if (w6Var == null || i2 != w6Var.f58797n) {
            this.iF = com.google.android.material.carousel.w6.rl(this, i2);
            GRh();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int X(RecyclerView.State state) {
        return this.XQ - this.f58775Z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int e(RecyclerView.State state) {
        return this.f58778o;
    }

    @Override // com.google.android.material.carousel.n
    public int gh() {
        return this.f58774X;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int nHg(RecyclerView.State state) {
        return this.XQ - this.f58775Z;
    }

    public void poH(com.google.android.material.carousel.Ml ml) {
        this.aYN = ml;
        GRh();
    }

    @Override // com.google.android.material.carousel.n
    public boolean t() {
        return this.iF.f58797n == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void uQ(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        j jVar = new j(recyclerView.getContext());
        jVar.ck(i2);
        wKY(jVar);
    }

    public int yA() {
        return this.iF.f58797n;
    }

    public CarouselLayoutManager(com.google.android.material.carousel.Ml ml, int i2) {
        this.f58773S = false;
        this.WPU = new w6();
        this.f58777g = 0;
        this.fD = new View.OnLayoutChangeListener() { // from class: qXb.j
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i5, int i7, int i8, int i9, int i10, int i11, int i12) {
                CarouselLayoutManager.I4p(this.f72468n, view, i3, i5, i7, i8, i9, i10, i11, i12);
            }
        };
        this.f58776e = -1;
        this.f58774X = 0;
        poH(ml);
        W1c(i2);
    }

    private int C7B() {
        int i2;
        int i3;
        if (M() <= 0) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) E(0).getLayoutParams();
        if (this.iF.f58797n == 0) {
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i3 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i2 + i3;
    }

    private int GH3(int i2) {
        int iYA = yA();
        if (i2 == 1) {
            return -1;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        Log.d("CarouselLayoutManager", "Unknown focus request:" + i2);
                        return Integer.MIN_VALUE;
                    }
                    if (iYA == 1) {
                        return 1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (iYA != 0) {
                    return Integer.MIN_VALUE;
                }
                if (sFO()) {
                    return -1;
                }
                return 1;
            }
            if (iYA == 1) {
                return -1;
            }
            return Integer.MIN_VALUE;
        }
        if (iYA != 0) {
            return Integer.MIN_VALUE;
        }
        if (!sFO()) {
            return -1;
        }
        return 1;
    }

    private void GT() {
        int iN = n();
        int i2 = this.E2;
        if (iN != i2 && this.ViF != null) {
            if (this.aYN.KN(this, i2)) {
                GRh();
            }
            this.E2 = iN;
        }
    }

    private View HFS() {
        int iM;
        if (sFO()) {
            iM = 0;
        } else {
            iM = M() - 1;
        }
        return E(iM);
    }

    public static /* synthetic */ void I4p(final CarouselLayoutManager carouselLayoutManager, View view, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11) {
        carouselLayoutManager.getClass();
        if (i2 == i8 && i3 == i9 && i5 == i10 && i7 == i11) {
            return;
        }
        view.post(new Runnable() { // from class: qXb.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f72469n.GRh();
            }
        });
    }

    private boolean JI(float f3, Ml ml) {
        float fD = d(f3, lRt(f3, ml) / 2.0f);
        if (sFO()) {
            if (fD >= 0.0f) {
                return false;
            }
            return true;
        }
        if (fD <= Xli()) {
            return false;
        }
        return true;
    }

    private void L(RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
        float fFW = fW(i2);
        while (i2 < state.rl()) {
            n nVarIu = iu(recycler, fFW, i2);
            if (!JI(nVarIu.f58781t, nVarIu.nr)) {
                fFW = qva(fFW, this.nY.J2());
                if (!Of6(nVarIu.f58781t, nVarIu.nr)) {
                    oz(nVarIu.f58780n, -1, nVarIu);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private void Lu(RecyclerView.Recycler recycler, int i2) {
        float fFW = fW(i2);
        while (i2 >= 0) {
            n nVarIu = iu(recycler, fFW, i2);
            if (!Of6(nVarIu.f58781t, nVarIu.nr)) {
                fFW = d(fFW, this.nY.J2());
                if (!JI(nVarIu.f58781t, nVarIu.nr)) {
                    oz(nVarIu.f58780n, 0, nVarIu);
                }
                i2--;
            } else {
                return;
            }
        }
    }

    private int MPw(int i2, Wre wre) {
        int iXli;
        int i3 = Integer.MAX_VALUE;
        for (Wre.w6 w6Var : wre.O()) {
            float fJ2 = (i2 * wre.J2()) + (wre.J2() / 2.0f);
            if (sFO()) {
                iXli = (int) ((Xli() - w6Var.f58790n) - fJ2);
            } else {
                iXli = (int) (fJ2 - w6Var.f58790n);
            }
            int i5 = iXli - this.f58778o;
            if (Math.abs(i3) > Math.abs(i5)) {
                i3 = i5;
            }
        }
        return i3;
    }

    private boolean Of6(float f3, Ml ml) {
        float fQva = qva(f3, lRt(f3, ml) / 2.0f);
        if (sFO()) {
            if (fQva <= Xli()) {
                return false;
            }
            return true;
        }
        if (fQva >= 0.0f) {
            return false;
        }
        return true;
    }

    private float Qg8(View view, float f3, float f4, Rect rect) {
        float fQva = qva(f3, f4);
        Ml mlV5F = V5F(this.nY.Uo(), fQva, false);
        float fHE = HE(view, fQva, mlV5F);
        super.I(view, rect);
        pr(view, fQva, mlV5F);
        this.iF.qie(view, rect, f4, fHE);
        return fHE;
    }

    private void Rc(RecyclerView.Recycler recycler) {
        while (M() > 0) {
            View viewE = E(0);
            float fFq = fq(viewE);
            if (!Of6(fFq, V5F(this.nY.Uo(), fFq, true))) {
                break;
            } else {
                wKp(viewE, recycler);
            }
        }
        while (M() - 1 >= 0) {
            View viewE2 = E(M() - 1);
            float fFq2 = fq(viewE2);
            if (JI(fFq2, V5F(this.nY.Uo(), fFq2, true))) {
                wKp(viewE2, recycler);
            } else {
                return;
            }
        }
    }

    private int TVk() {
        if (!J() && this.aYN.J2()) {
            if (yA() == 1) {
                return G7();
            }
            return C();
        }
        return 0;
    }

    private int UR(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        float f3;
        if (M() == 0 || i2 == 0) {
            return 0;
        }
        if (this.ViF == null) {
            tdZ(recycler);
        }
        int iOm = Om(i2, this.f58778o, this.f58775Z, this.XQ);
        this.f58778o += iOm;
        ni(this.ViF);
        float fJ2 = this.nY.J2() / 2.0f;
        float fFW = fW(fcU(E(0)));
        Rect rect = new Rect();
        if (sFO()) {
            f3 = this.nY.KN().rl;
        } else {
            f3 = this.nY.n().rl;
        }
        float f4 = Float.MAX_VALUE;
        for (int i3 = 0; i3 < M(); i3++) {
            View viewE = E(i3);
            float fAbs = Math.abs(f3 - Qg8(viewE, fFW, fJ2, rect));
            if (viewE != null && fAbs < f4) {
                this.f58776e = fcU(viewE);
                f4 = fAbs;
            }
            fFW = qva(fFW, this.nY.J2());
        }
        w(recycler, state);
        return iOm;
    }

    private void W5k(RecyclerView recyclerView, int i2) {
        if (t()) {
            recyclerView.scrollBy(i2, 0);
        } else {
            recyclerView.scrollBy(0, i2);
        }
    }

    private int XUb() {
        if (!J() && this.aYN.J2()) {
            if (yA() == 1) {
                return ofS();
            }
            return Mx();
        }
        return 0;
    }

    private int Xli() {
        if (t()) {
            return J2();
        }
        return Uo();
    }

    private int c32(RecyclerView.State state, CN3 cn3) {
        Wre wreKN;
        Wre.w6 w6VarKN;
        float f3;
        float f4;
        boolean zSFO = sFO();
        if (zSFO) {
            wreKN = cn3.qie();
        } else {
            wreKN = cn3.KN();
        }
        if (zSFO) {
            w6VarKN = wreKN.n();
        } else {
            w6VarKN = wreKN.KN();
        }
        float fRl = (state.rl() - 1) * wreKN.J2();
        if (zSFO) {
            f3 = -1.0f;
        } else {
            f3 = 1.0f;
        }
        float f5 = fRl * f3;
        if (zSFO) {
            f4 = -w6VarKN.Uo;
        } else {
            f4 = w6VarKN.KN;
        }
        int iKQ = (int) ((f5 - (w6VarKN.f58790n - kQ())) + (YiW() - w6VarKN.f58790n) + f4);
        if (zSFO) {
            return Math.min(0, iKQ);
        }
        return Math.max(0, iKQ);
    }

    private float d(float f3, float f4) {
        if (sFO()) {
            return f3 + f4;
        }
        return f3 - f4;
    }

    private View eb() {
        int iM;
        if (sFO()) {
            iM = M() - 1;
        } else {
            iM = 0;
        }
        return E(iM);
    }

    private float fW(int i2) {
        return qva(kQ() - this.f58778o, this.nY.J2() * i2);
    }

    private n iu(RecyclerView.Recycler recycler, float f3, int i2) {
        View viewHI = recycler.HI(i2);
        W(viewHI, 0, 0);
        float fQva = qva(f3, this.nY.J2() / 2.0f);
        Ml mlV5F = V5F(this.nY.Uo(), fQva, false);
        return new n(viewHI, fQva, HE(viewHI, fQva, mlV5F), mlV5F);
    }

    private float qva(float f3, float f4) {
        if (sFO()) {
            return f3 - f4;
        }
        return f3 + f4;
    }

    private int rR(int i2, Wre wre) {
        if (sFO()) {
            return (int) (((Xli() - wre.KN().f58790n) - (i2 * wre.J2())) - (wre.J2() / 2.0f));
        }
        return (int) (((i2 * wre.J2()) - wre.n().f58790n) + (wre.J2() / 2.0f));
    }

    private int t1J(CN3 cn3) {
        Wre wreQie;
        Wre.w6 w6VarN;
        boolean zSFO = sFO();
        if (zSFO) {
            wreQie = cn3.KN();
        } else {
            wreQie = cn3.qie();
        }
        if (zSFO) {
            w6VarN = wreQie.KN();
        } else {
            w6VarN = wreQie.n();
        }
        return (int) (kQ() - d(w6VarN.f58790n, wreQie.J2() / 2.0f));
    }

    private void w(RecyclerView.Recycler recycler, RecyclerView.State state) {
        Rc(recycler);
        if (M() == 0) {
            Lu(recycler, this.f58777g - 1);
            L(recycler, state, this.f58777g);
        } else {
            int iFcU = fcU(E(0));
            int iFcU2 = fcU(E(M() - 1));
            Lu(recycler, iFcU - 1);
            L(recycler, state, iFcU2 + 1);
        }
        Vd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View Bu(View view, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iGH3;
        if (M() == 0 || (iGH3 = GH3(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iGH3 == -1) {
            if (fcU(view) == 0) {
                return null;
            }
            rT(recycler, fcU(E(0)) - 1, 0);
            return eb();
        }
        if (fcU(view) == n() - 1) {
            return null;
        }
        rT(recycler, fcU(E(M() - 1)) + 1, -1);
        return HFS();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int E2(RecyclerView.State state) {
        if (M() != 0 && this.ViF != null && n() > 1) {
            return (int) (mYa() * (this.ViF.Uo().J2() / X(state)));
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void I(View view, Rect rect) {
        float fWidth;
        super.I(view, rect);
        float fCenterY = rect.centerY();
        if (t()) {
            fCenterY = rect.centerX();
        }
        float fLRt = lRt(fCenterY, V5F(this.nY.Uo(), fCenterY, true));
        float fHeight = 0.0f;
        if (t()) {
            fWidth = (rect.width() - fLRt) / 2.0f;
        } else {
            fWidth = 0.0f;
        }
        if (!t()) {
            fHeight = (rect.height() - fLRt) / 2.0f;
        }
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // com.google.android.material.carousel.n
    public int J2() {
        return mYa();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int T(RecyclerView.State state) {
        if (M() != 0 && this.ViF != null && n() > 1) {
            return (int) (piY() * (this.ViF.Uo().J2() / nHg(state)));
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void T3L(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.T3L(recyclerView, recycler);
        recyclerView.removeOnLayoutChangeListener(this.fD);
    }

    @Override // com.google.android.material.carousel.n
    public int Uo() {
        return piY();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean ViF() {
        return t();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void Vvq(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z2;
        int i2;
        if (state.rl() > 0 && Xli() > 0.0f) {
            boolean zSFO = sFO();
            if (this.ViF == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                tdZ(recycler);
            }
            int iT1J = t1J(this.ViF);
            int iC32 = c32(state, this.ViF);
            if (zSFO) {
                i2 = iC32;
            } else {
                i2 = iT1J;
            }
            this.f58775Z = i2;
            if (zSFO) {
                iC32 = iT1J;
            }
            this.XQ = iC32;
            if (z2) {
                this.f58778o = iT1J;
                this.te = this.ViF.xMQ(n(), this.f58775Z, this.XQ, sFO());
                int i3 = this.f58776e;
                if (i3 != -1) {
                    this.f58778o = rR(i3, wYi(i3));
                }
            }
            int i5 = this.f58778o;
            this.f58778o = i5 + Om(0, i5, this.f58775Z, this.XQ);
            this.f58777g = MathUtils.rl(this.f58777g, 0, state.rl());
            ni(this.ViF);
            s7N(recycler);
            w(recycler, state);
            this.E2 = n();
            return;
        }
        jO(recycler);
        this.f58777g = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void VwL(RecyclerView recyclerView) {
        super.VwL(recyclerView);
        this.aYN.O(recyclerView.getContext());
        GRh();
        recyclerView.addOnLayoutChangeListener(this.fD);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void X4T(RecyclerView recyclerView, int i2, int i3) {
        super.X4T(recyclerView, i2, i3);
        GT();
    }

    int l2(int i2) {
        return (int) (this.f58778o - rR(i2, wYi(i2)));
    }

    int n7u(int i2, Wre wre) {
        return rR(i2, wre) - this.f58778o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean nY() {
        return !t();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void p0N(AccessibilityEvent accessibilityEvent) {
        super.p0N(accessibilityEvent);
        if (M() > 0) {
            accessibilityEvent.setFromIndex(fcU(E(0)));
            accessibilityEvent.setToIndex(fcU(E(M() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int rxp(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (nY()) {
            return UR(i2, recycler, state);
        }
        return 0;
    }

    boolean sFO() {
        if (t() && m() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int waP(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (ViF()) {
            return UR(i2, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void xVH(RecyclerView recyclerView, int i2, int i3) {
        super.xVH(recyclerView, i2, i3);
        GT();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void y(RecyclerView.State state) {
        super.y(state);
        if (M() == 0) {
            this.f58777g = 0;
        } else {
            this.f58777g = fcU(E(0));
        }
        Vd();
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f58773S = false;
        this.WPU = new w6();
        this.f58777g = 0;
        this.fD = new View.OnLayoutChangeListener() { // from class: qXb.j
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i32, int i5, int i7, int i8, int i9, int i10, int i11, int i12) {
                CarouselLayoutManager.I4p(this.f72468n, view, i32, i5, i7, i8, i9, i10, i11, i12);
            }
        };
        this.f58776e = -1;
        this.f58774X = 0;
        poH(new fuX());
        ex(context, attributeSet);
    }
}
