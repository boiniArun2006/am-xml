package com.google.android.material.tabs;

import Rxk.C;
import Rxk.o;
import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.internal.eO;
import com.google.android.material.internal.l3D;
import com.safedk.android.internal.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final int f59215B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ValueAnimator f59216C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f59217D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final int f59218E;
    private final int E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private final int f59219FX;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private PagerAdapter f59220G7;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    int f59221GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f59222I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final int f59223J;
    final Wre J2;
    private int Jk;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f59224M;
    float M7;
    ViewPager Mx;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    ColorStateList f59225N;
    int Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private CN3 f59226O;
    PorterDuff.Mode P5;
    private final Pools.Pool Rl;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f59227S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f59228T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f59229U;
    ColorStateList Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f59230a;
    boolean dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f59231e;
    float eF;
    private final TimeInterpolator eTf;
    private fuX eWT;
    private DataSetObserver fcU;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f59232g;
    boolean ijL;
    Drawable jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f59233k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.android.material.tabs.w6 f59234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f59235n;
    private boolean n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f59236o;
    private w6 ofS;
    float p5;
    private final ArrayList pJg;
    int piY;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f59237r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList f59238t;
    private n ul;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ColorStateList f59239v;
    private w6 xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f59240z;
    private static final int qm = C.qie;
    private static final Pools.Pool mYa = new Pools.SynchronizedPool(16);

    public static class CN3 {
        private View J2;
        public TabLayout KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f59241O = -1;
        private int Uo = 1;
        private int mUb = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Object f59242n;
        private CharSequence nr;
        private Drawable rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private CharSequence f59243t;
        public Dsr xMQ;

        void gh() {
            this.KN = null;
            this.xMQ = null;
            this.f59242n = null;
            this.rl = null;
            this.mUb = -1;
            this.f59243t = null;
            this.nr = null;
            this.f59241O = -1;
            this.J2 = null;
        }

        void HI() {
            Dsr dsr = this.xMQ;
            if (dsr != null) {
                dsr.r();
            }
        }

        public Drawable J2() {
            return this.rl;
        }

        public int KN() {
            return this.Uo;
        }

        public View O() {
            return this.J2;
        }

        public int Uo() {
            return this.f59241O;
        }

        void az(int i2) {
            this.f59241O = i2;
        }

        public boolean mUb() {
            TabLayout tabLayout = this.KN;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f59241O;
        }

        public void qie() {
            TabLayout tabLayout = this.KN;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.N(this);
        }

        public CN3 ty(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.nr) && !TextUtils.isEmpty(charSequence)) {
                this.xMQ.setContentDescription(charSequence);
            }
            this.f59243t = charSequence;
            HI();
            return this;
        }

        public CharSequence xMQ() {
            return this.f59243t;
        }
    }

    public final class Dsr extends LinearLayout {
        private Drawable E2;
        private View J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private ImageView f59244O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private TextView f59245S;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f59247e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ImageView f59248g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private CN3 f59249n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private View f59250o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private com.google.android.material.badge.j f59251r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private TextView f59252t;

        class j implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ View f59253n;

            j(View view) {
                this.f59253n = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11) {
                if (this.f59253n.getVisibility() == 0) {
                    Dsr.this.Ik(this.f59253n);
                }
            }
        }

        void az() {
            setTab(null);
            setSelected(false);
        }

        public Dsr(Context context) {
            super(context);
            this.f59247e = 2;
            o(context);
            ViewCompat.HV(this, TabLayout.this.f59237r, TabLayout.this.f59236o, TabLayout.this.f59227S, TabLayout.this.f59232g);
            setGravity(17);
            setOrientation(!TabLayout.this.f59233k ? 1 : 0);
            setClickable(true);
            ViewCompat.GD(this, PointerIconCompat.rl(getContext(), 1002));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void KN(Canvas canvas) {
            Drawable drawable = this.E2;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.E2.draw(canvas);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void S(TextView textView, ImageView imageView, boolean z2) {
            boolean z3;
            CN3 cn3 = this.f59249n;
            Drawable drawableMutate = (cn3 == null || cn3.J2() == null) ? null : DrawableCompat.r(this.f59249n.J2()).mutate();
            if (drawableMutate != null) {
                DrawableCompat.HI(drawableMutate, TabLayout.this.f59239v);
                PorterDuff.Mode mode = TabLayout.this.P5;
                if (mode != null) {
                    DrawableCompat.ck(drawableMutate, mode);
                }
            }
            CN3 cn32 = this.f59249n;
            CharSequence charSequenceXMQ = cn32 != null ? cn32.xMQ() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceXMQ);
            if (textView == null) {
                z3 = false;
            } else if (!zIsEmpty) {
                z3 = this.f59249n.Uo == 1;
                textView.setText(!zIsEmpty ? charSequenceXMQ : null);
                textView.setVisibility(z3 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            }
            if (z2 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iT = (z3 && imageView.getVisibility() == 0) ? (int) l3D.t(getContext(), 8) : 0;
                if (TabLayout.this.f59233k) {
                    if (iT != MarginLayoutParamsCompat.n(marginLayoutParams)) {
                        MarginLayoutParamsCompat.t(marginLayoutParams, iT);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iT != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iT;
                    MarginLayoutParamsCompat.t(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            CN3 cn33 = this.f59249n;
            CharSequence charSequence = cn33 != null ? cn33.nr : null;
            if (zIsEmpty) {
                charSequenceXMQ = charSequence;
            }
            TooltipCompat.n(this, charSequenceXMQ);
        }

        private FrameLayout Uo() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        @Nullable
        private com.google.android.material.badge.j getBadge() {
            return this.f59251r;
        }

        @NonNull
        private com.google.android.material.badge.j getOrCreateBadge() {
            if (this.f59251r == null) {
                this.f59251r = com.google.android.material.badge.j.nr(getContext());
            }
            ck();
            com.google.android.material.badge.j jVar = this.f59251r;
            if (jVar != null) {
                return jVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private void gh() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.n.f58661n) {
                FrameLayout frameLayoutUo = Uo();
                addView(frameLayoutUo, 0);
                viewGroup = frameLayoutUo;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(Rxk.fuX.f8790t, viewGroup, false);
            this.f59244O = imageView;
            viewGroup.addView(imageView, 0);
        }

        private boolean mUb() {
            return this.f59251r != null;
        }

        private void nr(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new j(view));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(Context context) {
            int i2 = TabLayout.this.f59218E;
            if (i2 != 0) {
                Drawable drawableRl = AppCompatResources.rl(context, i2);
                this.E2 = drawableRl;
                if (drawableRl != null && drawableRl.isStateful()) {
                    this.E2.setState(getDrawableState());
                }
            } else {
                this.E2 = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable rippleDrawable = gradientDrawable;
            if (TabLayout.this.Xw != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListN = ZOk.n.n(TabLayout.this.Xw);
                boolean z2 = TabLayout.this.ijL;
                GradientDrawable gradientDrawable3 = gradientDrawable;
                if (z2) {
                    gradientDrawable3 = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListN, gradientDrawable3, z2 ? null : gradientDrawable2);
            }
            ViewCompat.C(this, rippleDrawable);
            TabLayout.this.invalidate();
        }

        private void qie() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.n.f58661n) {
                FrameLayout frameLayoutUo = Uo();
                addView(frameLayoutUo);
                viewGroup = frameLayoutUo;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(Rxk.fuX.nr, viewGroup, false);
            this.f59252t = textView;
            viewGroup.addView(textView);
        }

        private FrameLayout xMQ(View view) {
            if ((view == this.f59244O || view == this.f59252t) && com.google.android.material.badge.n.f58661n) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        final void XQ() {
            ViewParent parent;
            CN3 cn3 = this.f59249n;
            View viewO = cn3 != null ? cn3.O() : null;
            if (viewO != null) {
                ViewParent parent2 = viewO.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewO);
                    }
                    View view = this.f59250o;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f59250o);
                    }
                    addView(viewO);
                }
                this.f59250o = viewO;
                TextView textView = this.f59252t;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f59244O;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f59244O.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewO.findViewById(R.id.text1);
                this.f59245S = textView2;
                if (textView2 != null) {
                    this.f59247e = TextViewCompat.nr(textView2);
                }
                this.f59248g = (ImageView) viewO.findViewById(R.id.icon);
            } else {
                View view2 = this.f59250o;
                if (view2 != null) {
                    removeView(view2);
                    this.f59250o = null;
                }
                this.f59245S = null;
                this.f59248g = null;
            }
            if (this.f59250o == null) {
                if (this.f59244O == null) {
                    gh();
                }
                if (this.f59252t == null) {
                    qie();
                    this.f59247e = TextViewCompat.nr(this.f59252t);
                }
                TextViewCompat.Ik(this.f59252t, TabLayout.this.E2);
                if (!isSelected() || TabLayout.this.f59228T == -1) {
                    TextViewCompat.Ik(this.f59252t, TabLayout.this.f59231e);
                } else {
                    TextViewCompat.Ik(this.f59252t, TabLayout.this.f59228T);
                }
                ColorStateList colorStateList = TabLayout.this.f59225N;
                if (colorStateList != null) {
                    this.f59252t.setTextColor(colorStateList);
                }
                S(this.f59252t, this.f59244O, true);
                ck();
                nr(this.f59244O);
                nr(this.f59252t);
            } else {
                TextView textView3 = this.f59245S;
                if (textView3 != null || this.f59248g != null) {
                    S(textView3, this.f59248g, false);
                }
            }
            if (cn3 == null || TextUtils.isEmpty(cn3.nr)) {
                return;
            }
            setContentDescription(cn3.nr);
        }

        final void Z() {
            setOrientation(!TabLayout.this.f59233k ? 1 : 0);
            TextView textView = this.f59245S;
            if (textView == null && this.f59248g == null) {
                S(this.f59252t, this.f59244O, true);
            } else {
                S(textView, this.f59248g, false);
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f59252t, this.f59244O, this.f59250o};
            int iMax = 0;
            int iMin = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < 3; i2++) {
                View view = viewArr[i2];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z2 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z2 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z2 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f59252t, this.f59244O, this.f59250o};
            int iMax = 0;
            int iMin = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < 3; i2++) {
                View view = viewArr[i2];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z2 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z2 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z2 = true;
                }
            }
            return iMax - iMin;
        }

        @Nullable
        public CN3 getTab() {
            return this.f59249n;
        }

        void setTab(@Nullable CN3 cn3) {
            if (cn3 != this.f59249n) {
                this.f59249n = cn3;
                r();
            }
        }

        private void HI() {
            if (mUb()) {
                J2(true);
                View view = this.J2;
                if (view != null) {
                    com.google.android.material.badge.n.rl(this.f59251r, view);
                    this.J2 = null;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ik(View view) {
            if (mUb() && view == this.J2) {
                com.google.android.material.badge.n.t(this.f59251r, view, xMQ(view));
            }
        }

        private void J2(boolean z2) {
            setClipChildren(z2);
            setClipToPadding(z2);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z2);
                viewGroup.setClipToPadding(z2);
            }
        }

        private float O(Layout layout, int i2, float f3) {
            return layout.getLineWidth(i2) * (f3 / layout.getPaint().getTextSize());
        }

        private void ck() {
            CN3 cn3;
            CN3 cn32;
            if (!mUb()) {
                return;
            }
            if (this.f59250o != null) {
                HI();
                return;
            }
            if (this.f59244O != null && (cn32 = this.f59249n) != null && cn32.J2() != null) {
                View view = this.J2;
                ImageView imageView = this.f59244O;
                if (view != imageView) {
                    HI();
                    ty(this.f59244O);
                    return;
                } else {
                    Ik(imageView);
                    return;
                }
            }
            if (this.f59252t != null && (cn3 = this.f59249n) != null && cn3.KN() == 1) {
                View view2 = this.J2;
                TextView textView = this.f59252t;
                if (view2 != textView) {
                    HI();
                    ty(this.f59252t);
                    return;
                } else {
                    Ik(textView);
                    return;
                }
            }
            HI();
        }

        private void ty(View view) {
            if (mUb() && view != null) {
                J2(false);
                com.google.android.material.badge.n.n(this.f59251r, view, xMQ(view));
                this.J2 = view;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            boolean state;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.E2;
            if (drawable != null && drawable.isStateful()) {
                state = this.E2.setState(drawableState);
            } else {
                state = false;
            }
            if (state) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatZmq = AccessibilityNodeInfoCompat.Zmq(accessibilityNodeInfo);
            com.google.android.material.badge.j jVar = this.f59251r;
            if (jVar != null && jVar.isVisible()) {
                accessibilityNodeInfoCompatZmq.fcU(this.f59251r.KN());
            }
            accessibilityNodeInfoCompatZmq.G7(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.n(0, 1, this.f59249n.Uo(), 1, false, isSelected()));
            if (isSelected()) {
                accessibilityNodeInfoCompatZmq.C(false);
                accessibilityNodeInfoCompatZmq.Y(AccessibilityNodeInfoCompat.AccessibilityActionCompat.xMQ);
            }
            accessibilityNodeInfoCompatZmq.RQ(getResources().getString(Rxk.aC.KN));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f59224M, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            if (this.f59252t != null) {
                float f3 = TabLayout.this.M7;
                int i5 = this.f59247e;
                ImageView imageView = this.f59244O;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i5 = 1;
                } else {
                    TextView textView = this.f59252t;
                    if (textView != null && textView.getLineCount() > 1) {
                        f3 = TabLayout.this.eF;
                    }
                }
                float textSize = this.f59252t.getTextSize();
                int lineCount = this.f59252t.getLineCount();
                int iNr = TextViewCompat.nr(this.f59252t);
                if (f3 != textSize || (iNr >= 0 && i5 != iNr)) {
                    if (TabLayout.this.Nxk == 1 && f3 > textSize && lineCount == 1 && ((layout = this.f59252t.getLayout()) == null || O(layout, 0, f3) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        return;
                    }
                    this.f59252t.setTextSize(0, f3);
                    this.f59252t.setMaxLines(i5);
                    super.onMeasure(i2, i3);
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f59249n != null) {
                if (!zPerformClick) {
                    playSoundEffect(0);
                }
                this.f59249n.qie();
                return true;
            }
            return zPerformClick;
        }

        final void r() {
            boolean z2;
            XQ();
            CN3 cn3 = this.f59249n;
            if (cn3 != null && cn3.mUb()) {
                z2 = true;
            } else {
                z2 = false;
            }
            setSelected(z2);
        }

        @Override // android.view.View
        public void setSelected(boolean z2) {
            isSelected();
            super.setSelected(z2);
            TextView textView = this.f59252t;
            if (textView != null) {
                textView.setSelected(z2);
            }
            ImageView imageView = this.f59244O;
            if (imageView != null) {
                imageView.setSelected(z2);
            }
            View view = this.f59250o;
            if (view != null) {
                view.setSelected(z2);
            }
        }
    }

    private class I28 extends DataSetObserver {
        I28() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.fD();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.fD();
        }
    }

    public interface Ml extends w6 {
    }

    class Wre extends LinearLayout {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ValueAnimator f59256n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f59257t;

        class j implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ View f59258n;
            final /* synthetic */ View rl;

            j(View view, View view2) {
                this.f59258n = view;
                this.rl = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Wre.this.mUb(this.f59258n, this.rl, valueAnimator.getAnimatedFraction());
            }
        }

        Wre(Context context) {
            super(context);
            this.f59257t = -1;
            setWillNotDraw(false);
        }

        private void J2(int i2) {
            if (TabLayout.this.Jk == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i2);
                com.google.android.material.tabs.w6 w6Var = TabLayout.this.f59234m;
                TabLayout tabLayout = TabLayout.this;
                w6Var.t(tabLayout, childAt, tabLayout.jB);
                TabLayout.this.f59235n = i2;
            }
        }

        private void O() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f59235n == -1) {
                tabLayout.f59235n = tabLayout.getSelectedTabPosition();
            }
            J2(TabLayout.this.f59235n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Uo() {
            J2(TabLayout.this.getSelectedTabPosition());
        }

        private void gh(boolean z2, int i2, int i3) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f59235n == i2) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i2);
            if (childAt2 == null) {
                Uo();
                return;
            }
            TabLayout.this.f59235n = i2;
            j jVar = new j(childAt, childAt2);
            if (!z2) {
                this.f59256n.removeAllUpdateListeners();
                this.f59256n.addUpdateListener(jVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f59256n = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.eTf);
            valueAnimator.setDuration(i3);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(jVar);
            valueAnimator.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mUb(View view, View view2, float f3) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.jB;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.jB.getBounds().bottom);
            } else {
                com.google.android.material.tabs.w6 w6Var = TabLayout.this.f59234m;
                TabLayout tabLayout = TabLayout.this;
                w6Var.nr(tabLayout, view, view2, f3, tabLayout.jB);
            }
            ViewCompat.GR(this);
        }

        void KN(int i2, float f3) {
            TabLayout.this.f59235n = Math.round(i2 + f3);
            ValueAnimator valueAnimator = this.f59256n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f59256n.cancel();
            }
            mUb(getChildAt(i2), getChildAt(i2 + 1), f3);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.jB.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.jB.getIntrinsicHeight();
            }
            int i2 = TabLayout.this.f59221GR;
            if (i2 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i2 != 1) {
                height = 0;
                if (i2 != 2) {
                    iHeight = i2 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.jB.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.jB.getBounds();
                TabLayout.this.jB.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.jB.draw(canvas);
            }
            super.draw(canvas);
        }

        void t(int i2, int i3) {
            ValueAnimator valueAnimator = this.f59256n;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f59235n != i2) {
                this.f59256n.cancel();
            }
            gh(true, i2, i3);
        }

        void xMQ(int i2) {
            Rect bounds = TabLayout.this.jB.getBounds();
            TabLayout.this.jB.setBounds(bounds.left, 0, bounds.right, i2);
            requestLayout();
        }

        boolean nr() {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
            super.onLayout(z2, i2, i3, i5, i7);
            ValueAnimator valueAnimator = this.f59256n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                gh(false, TabLayout.this.getSelectedTabPosition(), -1);
            } else {
                O();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z2 = true;
                if (tabLayout.f59230a == 1 || tabLayout.Nxk == 2) {
                    int childCount = getChildCount();
                    int iMax = 0;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = getChildAt(i5);
                        if (childAt.getVisibility() == 0) {
                            iMax = Math.max(iMax, childAt.getMeasuredWidth());
                        }
                    }
                    if (iMax > 0) {
                        if (iMax * childCount <= getMeasuredWidth() - (((int) l3D.t(getContext(), 16)) * 2)) {
                            boolean z3 = false;
                            for (int i7 = 0; i7 < childCount; i7++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i7).getLayoutParams();
                                if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                                    layoutParams.width = iMax;
                                    layoutParams.weight = 0.0f;
                                    z3 = true;
                                }
                            }
                            z2 = z3;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f59230a = 0;
                            tabLayout2.P5(false);
                        }
                        if (z2) {
                            super.onMeasure(i2, i3);
                        }
                    }
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
        }
    }

    public static class aC implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewPager f59260n;

        @Override // com.google.android.material.tabs.TabLayout.w6
        public void rl(CN3 cn3) {
        }

        @Override // com.google.android.material.tabs.TabLayout.w6
        public void t(CN3 cn3) {
        }

        @Override // com.google.android.material.tabs.TabLayout.w6
        public void n(CN3 cn3) {
            this.f59260n.setCurrentItem(cn3.Uo());
        }

        public aC(ViewPager viewPager) {
            this.f59260n = viewPager;
        }
    }

    public static class fuX implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WeakReference f59261n;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f59262t;

        void rl() {
            this.f59262t = 0;
            this.rl = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void n(int i2, float f3, int i3) {
            boolean z2;
            TabLayout tabLayout = (TabLayout) this.f59261n.get();
            if (tabLayout != null) {
                int i5 = this.f59262t;
                boolean z3 = true;
                if (i5 != 2 || this.rl == 1) {
                    z2 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i5 == 2 && this.rl == 0) {
                    z2 = false;
                }
                tabLayout.rV9(i2, f3, z3, z2, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void nr(int i2) {
            TabLayout tabLayout = (TabLayout) this.f59261n.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i2 || i2 >= tabLayout.getTabCount()) {
                return;
            }
            int i3 = this.f59262t;
            tabLayout.nHg(tabLayout.nY(i2), i3 == 0 || (i3 == 2 && this.rl == 0));
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void t(int i2) {
            this.rl = this.f59262t;
            this.f59262t = i2;
            TabLayout tabLayout = (TabLayout) this.f59261n.get();
            if (tabLayout != null) {
                tabLayout.M7(this.f59262t);
            }
        }

        public fuX(TabLayout tabLayout) {
            this.f59261n = new WeakReference(tabLayout);
        }
    }

    class j implements ValueAnimator.AnimatorUpdateListener {
        j() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class n implements ViewPager.OnAdapterChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f59264n;

        n() {
        }

        void n(boolean z2) {
            this.f59264n = z2;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void rl(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.Mx == viewPager) {
                tabLayout.s7N(pagerAdapter2, this.f59264n);
            }
        }
    }

    public interface w6 {
        void n(CN3 cn3);

        void rl(CN3 cn3);

        void t(CN3 cn3);
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, Rxk.n.p5);
    }

    private void az(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() == null || !ViewCompat.P5(this) || this.J2.nr()) {
            wTp(i2, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iCk = ck(i2, 0.0f);
        if (scrollX != iCk) {
            ViF();
            this.f59216C.setIntValues(scrollX, iCk);
            this.f59216C.start();
        }
        this.J2.t(i2, this.f59222I);
    }

    private static ColorStateList r(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    public void N(CN3 cn3) {
        nHg(cn3, true);
    }

    void P5(boolean z2) {
        for (int i2 = 0; i2 < this.J2.getChildCount(); i2++) {
            View childAt = this.J2.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            U((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        qie(view);
    }

    public void bzg(ViewPager viewPager, boolean z2) {
        Xw(viewPager, z2, false);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.J2.getChildCount(); i2++) {
            View childAt = this.J2.getChildAt(i2);
            if (childAt instanceof Dsr) {
                ((Dsr) childAt).KN(canvas);
            }
        }
        super.onDraw(canvas);
    }

    void rV9(int i2, float f3, boolean z2, boolean z3, boolean z4) {
        int iRound = Math.round(i2 + f3);
        if (iRound < 0 || iRound >= this.J2.getChildCount()) {
            return;
        }
        if (z3) {
            this.J2.KN(i2, f3);
        }
        ValueAnimator valueAnimator = this.f59216C;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f59216C.cancel();
        }
        int iCk = ck(i2, f3);
        int scrollX = getScrollX();
        boolean z5 = (i2 < getSelectedTabPosition() && iCk >= scrollX) || (i2 > getSelectedTabPosition() && iCk <= scrollX) || i2 == getSelectedTabPosition();
        if (ViewCompat.nY(this) == 1) {
            z5 = (i2 < getSelectedTabPosition() && iCk <= scrollX) || (i2 > getSelectedTabPosition() && iCk >= scrollX) || i2 == getSelectedTabPosition();
        }
        if (z5 || this.Jk == 1 || z4) {
            if (i2 < 0) {
                iCk = 0;
            }
            scrollTo(iCk, 0);
        }
        if (z2) {
            setSelectedTabView(iRound);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable Ml ml) {
        setOnTabSelectedListener((w6) ml);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = DrawableCompat.r(drawable).mutate();
        this.jB = drawableMutate;
        com.google.android.material.drawable.Ml.gh(drawableMutate, this.f59229U);
        int intrinsicHeight = this.f59240z;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.jB.getIntrinsicHeight();
        }
        this.J2.xMQ(intrinsicHeight);
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        s7N(pagerAdapter, false);
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        bzg(viewPager, true);
    }

    public void v(int i2, float f3, boolean z2, boolean z3) {
        rV9(i2, f3, z2, z3, true);
    }

    public void wTp(int i2, float f3, boolean z2) {
        v(i2, f3, z2, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        int i3 = qm;
        super(scw.j.t(context, attributeSet, i2, i3), attributeSet, i2);
        this.f59235n = -1;
        this.f59238t = new ArrayList();
        this.f59228T = -1;
        this.f59229U = 0;
        this.f59224M = Integer.MAX_VALUE;
        this.f59240z = -1;
        this.pJg = new ArrayList();
        this.Rl = new Pools.SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        Wre wre = new Wre(context2);
        this.J2 = wre;
        super.addView(wre, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = o.rst;
        int i5 = o.xxL;
        TypedArray typedArrayXMQ = eO.xMQ(context2, attributeSet, iArr, i2, i3, i5);
        ColorStateList colorStateListJ2 = com.google.android.material.drawable.Ml.J2(getBackground());
        if (colorStateListJ2 != null) {
            mfo.CN3 cn3 = new mfo.CN3();
            cn3.p5(colorStateListJ2);
            cn3.nHg(context2);
            cn3.M7(ViewCompat.XQ(this));
            ViewCompat.C(this, cn3);
        }
        setSelectedTabIndicator(X4.w6.nr(context2, typedArrayXMQ, o.Nj));
        setSelectedTabIndicatorColor(typedArrayXMQ.getColor(o.qd, 0));
        wre.xMQ(typedArrayXMQ.getDimensionPixelSize(o.a9, -1));
        setSelectedTabIndicatorGravity(typedArrayXMQ.getInt(o.utY, 0));
        setTabIndicatorAnimationMode(typedArrayXMQ.getInt(o.Oo, 0));
        setTabIndicatorFullWidth(typedArrayXMQ.getBoolean(o.S0, true));
        int dimensionPixelSize = typedArrayXMQ.getDimensionPixelSize(o.j3I, 0);
        this.f59232g = dimensionPixelSize;
        this.f59227S = dimensionPixelSize;
        this.f59236o = dimensionPixelSize;
        this.f59237r = dimensionPixelSize;
        this.f59237r = typedArrayXMQ.getDimensionPixelSize(o.obf, dimensionPixelSize);
        this.f59236o = typedArrayXMQ.getDimensionPixelSize(o.dSC, this.f59236o);
        this.f59227S = typedArrayXMQ.getDimensionPixelSize(o.UpJ, this.f59227S);
        this.f59232g = typedArrayXMQ.getDimensionPixelSize(o.Oe4, this.f59232g);
        if (eO.Uo(context2)) {
            this.E2 = Rxk.n.f8797M;
        } else {
            this.E2 = Rxk.n.eF;
        }
        int resourceId = typedArrayXMQ.getResourceId(i5, C.nr);
        this.f59231e = resourceId;
        int[] iArr2 = androidx.appcompat.R.styleable.C7B;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            int i7 = androidx.appcompat.R.styleable.wYi;
            this.M7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(i7, 0);
            int i8 = androidx.appcompat.R.styleable.n7u;
            this.f59225N = X4.w6.n(context2, typedArrayObtainStyledAttributes, i8);
            typedArrayObtainStyledAttributes.recycle();
            int i9 = o.GA;
            if (typedArrayXMQ.hasValue(i9)) {
                this.f59228T = typedArrayXMQ.getResourceId(i9, resourceId);
            }
            int i10 = this.f59228T;
            if (i10 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i10, iArr2);
                try {
                    this.p5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(i7, (int) this.M7);
                    ColorStateList colorStateListN = X4.w6.n(context2, typedArrayObtainStyledAttributes, i8);
                    if (colorStateListN != null) {
                        this.f59225N = r(this.f59225N.getDefaultColor(), colorStateListN.getColorForState(new int[]{R.attr.state_selected}, colorStateListN.getDefaultColor()));
                    }
                } finally {
                }
            }
            int i11 = o.KJJ;
            if (typedArrayXMQ.hasValue(i11)) {
                this.f59225N = X4.w6.n(context2, typedArrayXMQ, i11);
            }
            int i12 = o.JF7;
            if (typedArrayXMQ.hasValue(i12)) {
                this.f59225N = r(this.f59225N.getDefaultColor(), typedArrayXMQ.getColor(i12, 0));
            }
            this.f59239v = X4.w6.n(context2, typedArrayXMQ, o.mBA);
            this.P5 = l3D.KN(typedArrayXMQ.getInt(o.uCx, -1), null);
            this.Xw = X4.w6.n(context2, typedArrayXMQ, o.f8856bAP);
            this.f59222I = typedArrayXMQ.getInt(o.dDe, d.f62986a);
            this.eTf = IzQ.fuX.Uo(context2, Rxk.n.nHg, G7.j.rl);
            this.f59219FX = typedArrayXMQ.getDimensionPixelSize(o.KWB, -1);
            this.f59215B = typedArrayXMQ.getDimensionPixelSize(o.f8849Wc, -1);
            this.f59218E = typedArrayXMQ.getResourceId(o.oG8, 0);
            this.f59217D = typedArrayXMQ.getDimensionPixelSize(o.IBF, 0);
            this.Nxk = typedArrayXMQ.getInt(o.Nz, 1);
            this.f59230a = typedArrayXMQ.getInt(o.dwF, 0);
            this.f59233k = typedArrayXMQ.getBoolean(o.rmO, false);
            this.ijL = typedArrayXMQ.getBoolean(o.vZY, false);
            typedArrayXMQ.recycle();
            Resources resources = getResources();
            this.eF = resources.getDimensionPixelSize(Rxk.Ml.Uo);
            this.f59223J = resources.getDimensionPixelSize(Rxk.Ml.J2);
            HI();
        } finally {
        }
    }

    private void HI() {
        int i2 = this.Nxk;
        ViewCompat.HV(this.J2, (i2 == 0 || i2 == 2) ? Math.max(0, this.f59217D - this.f59237r) : 0, 0, 0, 0);
        int i3 = this.Nxk;
        if (i3 == 0) {
            ty(this.f59230a);
        } else if (i3 == 1 || i3 == 2) {
            if (this.f59230a == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.J2.setGravity(1);
        }
        P5(true);
    }

    private void S(CN3 cn3) {
        for (int size = this.pJg.size() - 1; size >= 0; size--) {
            ((w6) this.pJg.get(size)).t(cn3);
        }
    }

    private void T(int i2) {
        Dsr dsr = (Dsr) this.J2.getChildAt(i2);
        this.J2.removeViewAt(i2);
        if (dsr != null) {
            dsr.az();
            this.Rl.n(dsr);
        }
        requestLayout();
    }

    private void U(LinearLayout.LayoutParams layoutParams) {
        if (this.Nxk == 1 && this.f59230a == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private void ViF() {
        if (this.f59216C == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f59216C = valueAnimator;
            valueAnimator.setInterpolator(this.eTf);
            this.f59216C.setDuration(this.f59222I);
            this.f59216C.addUpdateListener(new j());
        }
    }

    private void WPU(CN3 cn3) {
        for (int size = this.pJg.size() - 1; size >= 0; size--) {
            ((w6) this.pJg.get(size)).n(cn3);
        }
    }

    private Dsr XQ(CN3 cn3) {
        Pools.Pool pool = this.Rl;
        Dsr dsr = pool != null ? (Dsr) pool.acquire() : null;
        if (dsr == null) {
            dsr = new Dsr(getContext());
        }
        dsr.setTab(cn3);
        dsr.setFocusable(true);
        dsr.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(cn3.nr)) {
            dsr.setContentDescription(cn3.f59243t);
            return dsr;
        }
        dsr.setContentDescription(cn3.nr);
        return dsr;
    }

    private void Xw(ViewPager viewPager, boolean z2, boolean z3) {
        ViewPager viewPager2 = this.Mx;
        if (viewPager2 != null) {
            fuX fux = this.eWT;
            if (fux != null) {
                viewPager2.nHg(fux);
            }
            n nVar = this.ul;
            if (nVar != null) {
                this.Mx.N(nVar);
            }
        }
        w6 w6Var = this.ofS;
        if (w6Var != null) {
            X(w6Var);
            this.ofS = null;
        }
        if (viewPager != null) {
            this.Mx = viewPager;
            if (this.eWT == null) {
                this.eWT = new fuX(this);
            }
            this.eWT.rl();
            viewPager.t(this.eWT);
            aC aCVar = new aC(viewPager);
            this.ofS = aCVar;
            Uo(aCVar);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                s7N(adapter, z2);
            }
            if (this.ul == null) {
                this.ul = new n();
            }
            this.ul.n(z2);
            viewPager.rl(this.ul);
            wTp(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.Mx = null;
            s7N(null, false);
        }
        this.n1 = z3;
    }

    private void aYN(CN3 cn3) {
        for (int size = this.pJg.size() - 1; size >= 0; size--) {
            ((w6) this.pJg.get(size)).rl(cn3);
        }
    }

    private int ck(int i2, float f3) {
        View childAt;
        int i3 = this.Nxk;
        if ((i3 != 0 && i3 != 2) || (childAt = this.J2.getChildAt(i2)) == null) {
            return 0;
        }
        int i5 = i2 + 1;
        View childAt2 = i5 < this.J2.getChildCount() ? this.J2.getChildAt(i5) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i7 = (int) ((width + width2) * 0.5f * f3);
        return ViewCompat.nY(this) == 0 ? left + i7 : left - i7;
    }

    @Dimension
    private int getDefaultHeight() {
        int size = this.f59238t.size();
        for (int i2 = 0; i2 < size; i2++) {
            CN3 cn3 = (CN3) this.f59238t.get(i2);
            if (cn3 != null && cn3.J2() != null && !TextUtils.isEmpty(cn3.xMQ())) {
                return !this.f59233k ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i2 = this.f59219FX;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.Nxk;
        if (i3 == 0 || i3 == 2) {
            return this.f59223J;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.J2.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void gh(CN3 cn3) {
        Dsr dsr = cn3.xMQ;
        dsr.setSelected(false);
        dsr.setActivated(false);
        this.J2.addView(dsr, cn3.Uo(), o());
    }

    private void jB() {
        int size = this.f59238t.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((CN3) this.f59238t.get(i2)).HI();
        }
    }

    private LinearLayout.LayoutParams o() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        U(layoutParams);
        return layoutParams;
    }

    private void qie(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.J2.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.J2.getChildAt(i3);
                if ((i3 != i2 || childAt.isSelected()) && (i3 == i2 || !childAt.isSelected())) {
                    childAt.setSelected(i3 == i2);
                    childAt.setActivated(i3 == i2);
                } else {
                    childAt.setSelected(i3 == i2);
                    childAt.setActivated(i3 == i2);
                    if (childAt instanceof Dsr) {
                        ((Dsr) childAt).XQ();
                    }
                }
                i3++;
            }
        }
    }

    private void ty(int i2) {
        if (i2 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i2 == 1) {
            this.J2.setGravity(1);
            return;
        } else if (i2 != 2) {
            return;
        }
        this.J2.setGravity(8388611);
    }

    protected boolean E2(CN3 cn3) {
        return mYa.n(cn3);
    }

    void M7(int i2) {
        this.Jk = i2;
    }

    public void Uo(w6 w6Var) {
        if (this.pJg.contains(w6Var)) {
            return;
        }
        this.pJg.add(w6Var);
    }

    public void X(w6 w6Var) {
        this.pJg.remove(w6Var);
    }

    protected CN3 Z() {
        CN3 cn3 = (CN3) mYa.acquire();
        return cn3 == null ? new CN3() : cn3;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        qie(view);
    }

    public void e() {
        for (int childCount = this.J2.getChildCount() - 1; childCount >= 0; childCount--) {
            T(childCount);
        }
        Iterator it = this.f59238t.iterator();
        while (it.hasNext()) {
            CN3 cn3 = (CN3) it.next();
            it.remove();
            cn3.gh();
            E2(cn3);
        }
        this.f59226O = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        CN3 cn3 = this.f59226O;
        if (cn3 != null) {
            return cn3.Uo();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f59238t.size();
    }

    public int getTabGravity() {
        return this.f59230a;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f59239v;
    }

    public int getTabIndicatorAnimationMode() {
        return this.piY;
    }

    public int getTabIndicatorGravity() {
        return this.f59221GR;
    }

    int getTabMaxWidth() {
        return this.f59224M;
    }

    public int getTabMode() {
        return this.Nxk;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.Xw;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.jB;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f59225N;
    }

    public void mUb(CN3 cn3, boolean z2) {
        xMQ(cn3, this.f59238t.size(), z2);
    }

    public void nHg(CN3 cn3, boolean z2) {
        CN3 cn32 = this.f59226O;
        if (cn32 == cn3) {
            if (cn32 != null) {
                S(cn3);
                az(cn3.Uo());
                return;
            }
            return;
        }
        int iUo = cn3 != null ? cn3.Uo() : -1;
        if (z2) {
            if ((cn32 == null || cn32.Uo() == -1) && iUo != -1) {
                wTp(iUo, 0.0f, true);
            } else {
                az(iUo);
            }
            if (iUo != -1) {
                setSelectedTabView(iUo);
            }
        }
        this.f59226O = cn3;
        if (cn32 != null && cn32.KN != null) {
            aYN(cn32);
        }
        if (cn3 != null) {
            WPU(cn3);
        }
    }

    public CN3 nY(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return (CN3) this.f59238t.get(i2);
    }

    void s7N(PagerAdapter pagerAdapter, boolean z2) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f59220G7;
        if (pagerAdapter2 != null && (dataSetObserver = this.fcU) != null) {
            pagerAdapter2.Z(dataSetObserver);
        }
        this.f59220G7 = pagerAdapter;
        if (z2 && pagerAdapter != null) {
            if (this.fcU == null) {
                this.fcU = new I28();
            }
            pagerAdapter.qie(this.fcU);
        }
        fD();
    }

    public void setInlineLabel(boolean z2) {
        if (this.f59233k != z2) {
            this.f59233k = z2;
            for (int i2 = 0; i2 < this.J2.getChildCount(); i2++) {
                View childAt = this.J2.getChildAt(i2);
                if (childAt instanceof Dsr) {
                    ((Dsr) childAt).Z();
                }
            }
            HI();
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable w6 w6Var) {
        w6 w6Var2 = this.xg;
        if (w6Var2 != null) {
            X(w6Var2);
        }
        this.xg = w6Var;
        if (w6Var != null) {
            Uo(w6Var);
        }
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i2) {
        this.f59229U = i2;
        com.google.android.material.drawable.Ml.gh(this.jB, i2);
        P5(false);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.f59221GR != i2) {
            this.f59221GR = i2;
            ViewCompat.GR(this.J2);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.f59240z = i2;
        this.J2.xMQ(i2);
    }

    public void setTabGravity(int i2) {
        if (this.f59230a != i2) {
            this.f59230a = i2;
            HI();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f59239v != colorStateList) {
            this.f59239v = colorStateList;
            jB();
        }
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.piY = i2;
        if (i2 == 0) {
            this.f59234m = new com.google.android.material.tabs.w6();
            return;
        }
        if (i2 == 1) {
            this.f59234m = new com.google.android.material.tabs.j();
        } else {
            if (i2 == 2) {
                this.f59234m = new com.google.android.material.tabs.n();
                return;
            }
            throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.dR0 = z2;
        this.J2.Uo();
        ViewCompat.GR(this.J2);
    }

    public void setTabMode(int i2) {
        if (i2 != this.Nxk) {
            this.Nxk = i2;
            HI();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.Xw != colorStateList) {
            this.Xw = colorStateList;
            for (int i2 = 0; i2 < this.J2.getChildCount(); i2++) {
                View childAt = this.J2.getChildAt(i2);
                if (childAt instanceof Dsr) {
                    ((Dsr) childAt).o(getContext());
                }
            }
        }
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f59225N != colorStateList) {
            this.f59225N = colorStateList;
            jB();
        }
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.ijL != z2) {
            this.ijL = z2;
            for (int i2 = 0; i2 < this.J2.getChildCount(); i2++) {
                View childAt = this.J2.getChildAt(i2);
                if (childAt instanceof Dsr) {
                    ((Dsr) childAt).o(getContext());
                }
            }
        }
    }

    public boolean te() {
        return this.dR0;
    }

    public void xMQ(CN3 cn3, int i2, boolean z2) {
        if (cn3.KN != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        Ik(cn3, i2);
        gh(cn3);
        if (z2) {
            cn3.qie();
        }
    }

    private void Ik(CN3 cn3, int i2) {
        cn3.az(i2);
        this.f59238t.add(i2, cn3);
        int size = this.f59238t.size();
        int i3 = -1;
        for (int i5 = i2 + 1; i5 < size; i5++) {
            if (((CN3) this.f59238t.get(i5)).Uo() == this.f59235n) {
                i3 = i5;
            }
            ((CN3) this.f59238t.get(i5)).az(i5);
        }
        this.f59235n = i3;
    }

    private boolean g() {
        if (getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return true;
    }

    public void KN(Ml ml) {
        Uo(ml);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        qie(view);
    }

    void fD() {
        int currentItem;
        e();
        PagerAdapter pagerAdapter = this.f59220G7;
        if (pagerAdapter != null) {
            int iO = pagerAdapter.O();
            for (int i2 = 0; i2 < iO; i2++) {
                mUb(iF().ty(this.f59220G7.Uo(i2)), false);
            }
            ViewPager viewPager = this.Mx;
            if (viewPager != null && iO > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                N(nY(currentItem));
            }
        }
    }

    public CN3 iF() {
        CN3 cn3Z = Z();
        cn3Z.KN = this;
        cn3Z.xMQ = XQ(cn3Z);
        if (cn3Z.mUb != -1) {
            cn3Z.xMQ.setId(cn3Z.mUb);
        }
        return cn3Z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mfo.fuX.O(this);
        if (this.Mx == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                Xw((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.n1) {
            setupWithViewPager(null);
            this.n1 = false;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.Zmq(accessibilityNodeInfo).Mx(AccessibilityNodeInfoCompat.CollectionInfoCompat.rl(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (g() && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i2, int i3) {
        int iRound = Math.round(l3D.t(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int iT = this.f59215B;
            if (iT <= 0) {
                iT = (int) (size - l3D.t(getContext(), 56));
            }
            this.f59224M = iT;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.Nxk;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        return;
                    }
                    if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    }
                } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !g()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f3) {
        super.setElevation(f3);
        mfo.fuX.nr(this, f3);
    }

    public void setInlineLabelResource(@BoolRes int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        ViF();
        this.f59216C.addListener(animatorListener);
    }

    public void setTabIconTintResource(@ColorRes int i2) {
        setTabIconTint(AppCompatResources.n(getContext(), i2));
    }

    public void setTabRippleColorResource(@ColorRes int i2) {
        setTabRippleColor(AppCompatResources.n(getContext(), i2));
    }

    public void setUnboundedRippleResource(@BoolRes int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        qie(view);
    }

    public void setSelectedTabIndicator(@DrawableRes int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(AppCompatResources.rl(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
