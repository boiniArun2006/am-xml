package com.google.android.material.badge;

import Rxk.C;
import Rxk.Wre;
import Rxk.aC;
import X4.Ml;
import X4.w6;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.Pl;
import com.google.android.material.internal.eO;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import mfo.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class j extends Drawable implements Pl.n {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final int f58645N = C.ck;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f58646v = Rxk.n.f8810t;
    private float E2;
    private final Rect J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Pl f58647O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f58648S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private WeakReference f58649T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private WeakReference f58650X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f58651Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f58652e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f58653g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WeakReference f58654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f58655o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final BadgeState f58656r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CN3 f58657t;

    /* JADX INFO: renamed from: com.google.android.material.badge.j$j, reason: collision with other inner class name */
    class RunnableC0783j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f58659n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ FrameLayout f58660t;

        RunnableC0783j(View view, FrameLayout frameLayout) {
            this.f58659n = view;
            this.f58660t = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.rV9(this.f58659n, this.f58660t);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    private void E2() {
        WeakReference weakReference = this.f58650X;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f58650X.get();
        WeakReference weakReference2 = this.f58649T;
        rV9(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    private String HI() {
        if (this.f58648S == -2 || ty() <= this.f58648S) {
            return NumberFormat.getInstance(this.f58656r.aYN()).format(ty());
        }
        Context context = (Context) this.f58654n.get();
        return context == null ? "" : String.format(this.f58656r.aYN(), context.getString(aC.ck), Integer.valueOf(this.f58648S), "+");
    }

    private void T() {
        this.f58647O.Uo().setColor(this.f58656r.mUb());
        invalidateSelf();
    }

    private int WPU() {
        int iTe = this.f58656r.te();
        if (aYN()) {
            iTe = this.f58656r.g();
            Context context = (Context) this.f58654n.get();
            if (context != null) {
                iTe = G7.j.t(iTe, iTe - this.f58656r.Z(), G7.j.rl(0.0f, 1.0f, 0.3f, 1.0f, w6.O(context) - 1.0f));
            }
        }
        if (this.f58656r.gh == 0) {
            iTe -= Math.round(this.f58652e);
        }
        return iTe + this.f58656r.t();
    }

    private void X() {
        Ml ml;
        Context context = (Context) this.f58654n.get();
        if (context == null || this.f58647O.O() == (ml = new Ml(context, this.f58656r.nY()))) {
            return;
        }
        this.f58647O.gh(ml, context);
        T();
        bzg();
        invalidateSelf();
    }

    private float XQ(View view, float f3) {
        return (this.f58651Z - this.f58652e) + view.getY() + f3;
    }

    private CharSequence Z() {
        CharSequence charSequenceHI = this.f58656r.HI();
        return charSequenceHI != null ? charSequenceHI : r();
    }

    private void bzg() {
        Context context = (Context) this.f58654n.get();
        WeakReference weakReference = this.f58650X;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.J2);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f58649T;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null || n.f58661n) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        t(rect2, view);
        n.nr(this.J2, this.f58655o, this.f58651Z, this.E2, this.f58652e);
        float f3 = this.f58653g;
        if (f3 != -1.0f) {
            this.f58657t.U(f3);
        }
        if (rect.equals(this.J2)) {
            return;
        }
        this.f58657t.setBounds(this.J2);
    }

    private String ck() {
        Context context;
        if (this.f58656r.Ik() == 0 || (context = (Context) this.f58654n.get()) == null) {
            return null;
        }
        return (this.f58648S == -2 || ty() <= this.f58648S) ? context.getResources().getQuantityString(this.f58656r.Ik(), ty(), Integer.valueOf(ty())) : context.getString(this.f58656r.ty(), Integer.valueOf(this.f58648S));
    }

    private void e() {
        Context context = (Context) this.f58654n.get();
        if (context == null) {
            return;
        }
        this.f58657t.setShapeAppearanceModel(mfo.C.rl(context, aYN() ? this.f58656r.az() : this.f58656r.xMQ(), aYN() ? this.f58656r.qie() : this.f58656r.KN()).az());
        invalidateSelf();
    }

    private void fD() {
        this.f58647O.qie(true);
        e();
        bzg();
        invalidateSelf();
    }

    private float gh(View view, float f3) {
        return (this.f58655o - this.E2) + view.getX() + f3;
    }

    private void iF() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f58656r.O());
        if (this.f58657t.S() != colorStateListValueOf) {
            this.f58657t.p5(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private CharSequence mUb() {
        return this.f58656r.ck();
    }

    private void nHg() {
        boolean zE = this.f58656r.e();
        setVisible(zE, false);
        if (!n.f58661n || xMQ() == null || zE) {
            return;
        }
        ((ViewGroup) xMQ().getParent()).invalidate();
    }

    public static j nr(Context context) {
        return new j(context, 0, f58646v, f58645N, null);
    }

    private void te() {
        this.f58647O.Uo().setAlpha(getAlpha());
        invalidateSelf();
    }

    public boolean ViF() {
        return !this.f58656r.fD() && this.f58656r.iF();
    }

    public int az() {
        return this.f58656r.S();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f58656r.nr();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.J2.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.J2.width();
    }

    public boolean nY() {
        return this.f58656r.fD();
    }

    public int qie() {
        return this.f58656r.XQ();
    }

    public String r() {
        return this.f58656r.ViF();
    }

    public void rV9(View view, FrameLayout frameLayout) {
        this.f58650X = new WeakReference(view);
        boolean z2 = n.f58661n;
        if (z2 && frameLayout == null) {
            wTp(view);
        } else {
            this.f58649T = new WeakReference(frameLayout);
        }
        if (!z2) {
            v(view);
        }
        bzg();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f58656r.T(i2);
        te();
    }

    public int ty() {
        if (this.f58656r.iF()) {
            return this.f58656r.WPU();
        }
        return 0;
    }

    public FrameLayout xMQ() {
        WeakReference weakReference = this.f58649T;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    private j(Context context, int i2, int i3, int i5, BadgeState.State state) {
        int iXMQ;
        int iKN;
        this.f58654n = new WeakReference(context);
        eO.t(context);
        this.J2 = new Rect();
        Pl pl = new Pl(this);
        this.f58647O = pl;
        pl.Uo().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i2, i3, i5, state);
        this.f58656r = badgeState;
        if (aYN()) {
            iXMQ = badgeState.az();
        } else {
            iXMQ = badgeState.xMQ();
        }
        if (aYN()) {
            iKN = badgeState.qie();
        } else {
            iKN = badgeState.KN();
        }
        this.f58657t = new CN3(mfo.C.rl(context, iXMQ, iKN).az());
        s7N();
    }

    private float Ik(View view, float f3) {
        if (view.getParent() instanceof View) {
            return ((this.f58655o + this.E2) - (((View) view.getParent()).getWidth() - view.getX())) + f3;
        }
        return 0.0f;
    }

    private String J2() {
        if (nY()) {
            return o();
        }
        if (ViF()) {
            return HI();
        }
        return null;
    }

    private void N() {
        Xw();
        this.f58647O.qie(true);
        bzg();
        invalidateSelf();
    }

    private void O(Canvas canvas) {
        int iRound;
        String strJ2 = J2();
        if (strJ2 != null) {
            Rect rect = new Rect();
            this.f58647O.Uo().getTextBounds(strJ2, 0, strJ2.length(), rect);
            float fExactCenterY = this.f58651Z - rect.exactCenterY();
            float f3 = this.f58655o;
            if (rect.bottom <= 0) {
                iRound = (int) fExactCenterY;
            } else {
                iRound = Math.round(fExactCenterY);
            }
            canvas.drawText(strJ2, f3, iRound, this.f58647O.Uo());
        }
    }

    private int S() {
        int iO;
        int i2;
        if (aYN()) {
            iO = this.f58656r.r();
        } else {
            iO = this.f58656r.o();
        }
        if (this.f58656r.gh == 1) {
            if (aYN()) {
                i2 = this.f58656r.mUb;
            } else {
                i2 = this.f58656r.xMQ;
            }
            iO += i2;
        }
        return iO + this.f58656r.rl();
    }

    private float Uo(View view, float f3) {
        if (view.getParent() instanceof View) {
            return ((this.f58651Z + this.f58652e) - (((View) view.getParent()).getHeight() - view.getY())) + f3;
        }
        return 0.0f;
    }

    private void Xw() {
        if (qie() != -2) {
            this.f58648S = ((int) Math.pow(10.0d, ((double) qie()) - 1.0d)) - 1;
        } else {
            this.f58648S = az();
        }
    }

    private boolean aYN() {
        if (!nY() && !ViF()) {
            return false;
        }
        return true;
    }

    private boolean g() {
        FrameLayout frameLayoutXMQ = xMQ();
        if (frameLayoutXMQ != null && frameLayoutXMQ.getId() == Wre.f8764S) {
            return true;
        }
        return false;
    }

    private String o() {
        String strR = r();
        int iQie = qie();
        if (iQie != -2 && strR != null && strR.length() > iQie) {
            Context context = (Context) this.f58654n.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(aC.xMQ), strR.substring(0, iQie - 1), "…");
        }
        return strR;
    }

    private void rl(View view) {
        float y2;
        float x2;
        View viewXMQ = xMQ();
        if (viewXMQ == null) {
            if (view.getParent() instanceof View) {
                float y3 = view.getY();
                x2 = view.getX();
                viewXMQ = (View) view.getParent();
                y2 = y3;
            } else {
                return;
            }
        } else if (g()) {
            if (viewXMQ.getParent() instanceof View) {
                y2 = viewXMQ.getY();
                x2 = viewXMQ.getX();
                viewXMQ = (View) viewXMQ.getParent();
            } else {
                return;
            }
        } else {
            y2 = 0.0f;
            x2 = 0.0f;
        }
        float fXQ = XQ(viewXMQ, y2);
        float fGh = gh(viewXMQ, x2);
        float fUo = Uo(viewXMQ, y2);
        float fIk = Ik(viewXMQ, x2);
        if (fXQ < 0.0f) {
            this.f58651Z += Math.abs(fXQ);
        }
        if (fGh < 0.0f) {
            this.f58655o += Math.abs(fGh);
        }
        if (fUo > 0.0f) {
            this.f58651Z -= Math.abs(fUo);
        }
        if (fIk > 0.0f) {
            this.f58655o -= Math.abs(fIk);
        }
    }

    private void s7N() {
        e();
        X();
        N();
        fD();
        te();
        iF();
        T();
        E2();
        bzg();
        nHg();
    }

    private void t(Rect rect, View view) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        if (aYN()) {
            f3 = this.f58656r.nr;
        } else {
            f3 = this.f58656r.f58622t;
        }
        this.f58653g = f3;
        if (f3 != -1.0f) {
            this.E2 = f3;
            this.f58652e = f3;
        } else {
            if (aYN()) {
                f4 = this.f58656r.Uo;
            } else {
                f4 = this.f58656r.f58620O;
            }
            this.E2 = Math.round(f4 / 2.0f);
            if (aYN()) {
                f5 = this.f58656r.KN;
            } else {
                f5 = this.f58656r.J2;
            }
            this.f58652e = Math.round(f5 / 2.0f);
        }
        if (aYN()) {
            String strJ2 = J2();
            this.E2 = Math.max(this.E2, (this.f58647O.KN(strJ2) / 2.0f) + this.f58656r.Uo());
            float fMax = Math.max(this.f58652e, (this.f58647O.J2(strJ2) / 2.0f) + this.f58656r.gh());
            this.f58652e = fMax;
            this.E2 = Math.max(this.E2, fMax);
        }
        int iWPU = WPU();
        int iJ2 = this.f58656r.J2();
        if (iJ2 != 8388691 && iJ2 != 8388693) {
            this.f58651Z = rect.top + iWPU;
        } else {
            this.f58651Z = rect.bottom - iWPU;
        }
        int iS = S();
        int iJ22 = this.f58656r.J2();
        if (iJ22 != 8388659 && iJ22 != 8388691) {
            if (ViewCompat.nY(view) == 0) {
                f7 = (rect.right + this.E2) - iS;
            } else {
                f7 = (rect.left - this.E2) + iS;
            }
            this.f58655o = f7;
        } else {
            if (ViewCompat.nY(view) == 0) {
                f6 = (rect.left - this.E2) + iS;
            } else {
                f6 = (rect.right + this.E2) - iS;
            }
            this.f58655o = f6;
        }
        if (this.f58656r.E2()) {
            rl(view);
        }
    }

    private static void v(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void wTp(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != Wre.f8764S) {
            WeakReference weakReference = this.f58649T;
            if (weakReference != null && weakReference.get() == viewGroup) {
                return;
            }
            v(view);
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setId(Wre.f8764S);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(view.getLayoutParams());
            frameLayout.setMinimumWidth(view.getWidth());
            frameLayout.setMinimumHeight(view.getHeight());
            int iIndexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(iIndexOfChild);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(view);
            viewGroup.addView(frameLayout, iIndexOfChild);
            this.f58649T = new WeakReference(frameLayout);
            frameLayout.post(new RunnableC0783j(view, frameLayout));
        }
    }

    public CharSequence KN() {
        if (!isVisible()) {
            return null;
        }
        if (nY()) {
            return Z();
        }
        if (ViF()) {
            return ck();
        }
        return mUb();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f58657t.draw(canvas);
            if (aYN()) {
                O(canvas);
            }
        }
    }

    @Override // com.google.android.material.internal.Pl.n
    public void n() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.Pl.n
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
