package rH;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.view.Lifecycle;
import androidx.view.LifecycleObserver;
import androidx.view.LifecycleOwner;
import androidx.view.OnLifecycleEvent;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import rH.UGc;
import rH.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml implements LifecycleObserver {
    private final PopupWindow J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final PopupWindow f72891O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Context f72892S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Lazy f72893Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f72894g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Zo2.j f72895n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f72896o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f72897r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Zo2.n f72898t;

    static final class C implements View.OnClickListener {
        C(eO eOVar) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (Ml.this.f72894g.f72927Y) {
                Ml.this.iF();
            }
        }
    }

    static final class CN3 implements View.OnClickListener {
        CN3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Ml.this.iF();
        }
    }

    static final class Dsr implements PopupWindow.OnDismissListener {
        Dsr(rH.qz qzVar) {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            Ml.this.G7();
            Ml.this.iF();
        }
    }

    static final class I28 implements Runnable {
        I28() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Ml.this.iF();
        }
    }

    /* JADX INFO: renamed from: rH.Ml$Ml, reason: collision with other inner class name */
    static final class C1155Ml extends Lambda implements Function0 {
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1949invoke();
            return Unit.INSTANCE;
        }

        C1155Ml() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1949invoke() {
            Ml.this.f72897r = false;
            Ml.this.J2.dismiss();
            Ml.this.f72891O.dismiss();
        }
    }

    static final class Pl implements Runnable {

        static final class j implements Runnable {
            j() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                Animation animationX = Ml.this.X();
                if (animationX != null) {
                    Ml.this.f72895n.rl.startAnimation(animationX);
                }
            }
        }

        Pl() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            new Handler(Looper.getMainLooper()).postDelayed(new j(), Ml.this.f72894g.f72912C);
        }
    }

    static final class Wre implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ View f72906O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AppCompatImageView f72907n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ml f72908t;

        Wre(AppCompatImageView appCompatImageView, Ml ml, View view) {
            this.f72907n = appCompatImageView;
            this.f72908t = ml;
            this.f72906O = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f72908t.bzg();
            this.f72908t.aYN(this.f72906O);
            int i2 = rH.I28.$EnumSwitchMapping$0[this.f72908t.f72894g.f72936r.ordinal()];
            if (i2 == 1) {
                this.f72907n.setRotation(180.0f);
                this.f72907n.setX(this.f72908t.E2(this.f72906O));
                AppCompatImageView appCompatImageView = this.f72907n;
                RadiusLayout radiusLayout = this.f72908t.f72895n.nr;
                Intrinsics.checkNotNullExpressionValue(radiusLayout, "binding.balloonCard");
                float y2 = radiusLayout.getY();
                Intrinsics.checkNotNullExpressionValue(this.f72908t.f72895n.nr, "binding.balloonCard");
                appCompatImageView.setY((y2 + r4.getHeight()) - 1);
                ViewCompat.fcU(this.f72907n, this.f72908t.f72894g.nY);
                return;
            }
            if (i2 == 2) {
                this.f72907n.setRotation(0.0f);
                this.f72907n.setX(this.f72908t.E2(this.f72906O));
                AppCompatImageView appCompatImageView2 = this.f72907n;
                RadiusLayout radiusLayout2 = this.f72908t.f72895n.nr;
                Intrinsics.checkNotNullExpressionValue(radiusLayout2, "binding.balloonCard");
                appCompatImageView2.setY((radiusLayout2.getY() - this.f72908t.f72894g.ty) + 1);
                return;
            }
            if (i2 == 3) {
                this.f72907n.setRotation(-90.0f);
                AppCompatImageView appCompatImageView3 = this.f72907n;
                RadiusLayout radiusLayout3 = this.f72908t.f72895n.nr;
                Intrinsics.checkNotNullExpressionValue(radiusLayout3, "binding.balloonCard");
                appCompatImageView3.setX((radiusLayout3.getX() - this.f72908t.f72894g.ty) + 1);
                this.f72907n.setY(this.f72908t.e(this.f72906O));
                return;
            }
            if (i2 != 4) {
                return;
            }
            this.f72907n.setRotation(90.0f);
            AppCompatImageView appCompatImageView4 = this.f72907n;
            RadiusLayout radiusLayout4 = this.f72908t.f72895n.nr;
            Intrinsics.checkNotNullExpressionValue(radiusLayout4, "binding.balloonCard");
            float x2 = radiusLayout4.getX();
            Intrinsics.checkNotNullExpressionValue(this.f72908t.f72895n.nr, "binding.balloonCard");
            appCompatImageView4.setX((x2 + r4.getWidth()) - 1);
            this.f72907n.setY(this.f72908t.e(this.f72906O));
        }
    }

    public static final class aC implements View.OnTouchListener {
        aC(Xo xo) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() != 4) {
                return false;
            }
            if (!Ml.this.f72894g.f72918I) {
                return true;
            }
            Ml.this.iF();
            return true;
        }
    }

    static final class fuX implements View.OnClickListener {
        fuX(rH.o oVar) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (Ml.this.f72894g.Nxk) {
                Ml.this.iF();
            }
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public float f72911B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public long f72912C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public hoF.w6 f72913D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f72914E;
        public int E2;

        /* JADX INFO: renamed from: FX, reason: collision with root package name */
        public int f72915FX;

        /* JADX INFO: renamed from: G7, reason: collision with root package name */
        public int f72916G7;

        /* JADX INFO: renamed from: GR, reason: collision with root package name */
        public boolean f72917GR;
        public float HI;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public boolean f72918I;
        public rH.n Ik;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public Point f72919J;
        public int J2;
        public boolean Jk;
        public int KN;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public boolean f72920M;
        public float M7;
        public String Mx;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f72921N;
        public boolean Nxk;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f72922O;
        public rH.aC P5;
        private final Context Rl;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f72923S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public float f72924T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f72925U;
        public int Uo;
        public float ViF;
        public int WPU;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public MovementMethod f72926X;
        public int XQ;
        public int Xw;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f72927Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public int f72928Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View.OnTouchListener f72929a;
        public int aYN;
        public int az;
        public int bzg;
        public rH.w6 ck;
        public long dR0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f72930e;
        public View eF;
        public hoF.j eTf;
        public boolean eWT;
        public CharSequence fD;
        public Function0 fcU;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f72931g;
        public int gh;
        public float iF;
        public int ijL;
        public int jB;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f72932k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public rH.Wre f72933m;
        public int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f72934n;
        public boolean n1;
        public Typeface nHg;
        public float nY;
        public int nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Drawable f72935o;
        public int ofS;
        public float p5;
        public rH.CN3 pJg;
        public int piY;
        public boolean qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public rH.j f72936r;
        public rH.C rV9;
        public float rl;
        public int s7N;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f72937t;
        public Drawable te;
        public int ty;
        public int ul;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Drawable f72938v;
        public UGc wTp;
        public int xMQ;
        public long xg;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public LifecycleOwner f72939z;

        public j(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.Rl = context;
            this.f72934n = Integer.MIN_VALUE;
            this.f72937t = Integer.MIN_VALUE;
            this.qie = true;
            this.az = Integer.MIN_VALUE;
            this.ty = YQ.j.nr(context, 12);
            this.HI = 0.5f;
            this.ck = rH.w6.ALIGN_BALLOON;
            this.Ik = rH.n.ALIGN_ANCHOR;
            this.f72936r = rH.j.BOTTOM;
            this.ViF = 2.5f;
            this.nY = YQ.j.t(context, 2.0f);
            this.f72931g = -16777216;
            this.iF = YQ.j.nr(context, 5);
            this.fD = "";
            this.E2 = -1;
            this.f72924T = 12.0f;
            this.s7N = 17;
            this.rV9 = rH.C.LEFT;
            this.bzg = YQ.j.nr(context, 28);
            this.Xw = YQ.j.nr(context, 28);
            this.jB = YQ.j.nr(context, 8);
            this.f72925U = Integer.MIN_VALUE;
            this.M7 = 1.0f;
            this.p5 = YQ.j.t(context, 2.0f);
            this.f72914E = Integer.MIN_VALUE;
            this.f72913D = hoF.n.f67983n;
            this.f72918I = true;
            this.f72927Y = true;
            this.dR0 = -1L;
            this.piY = Integer.MIN_VALUE;
            this.ijL = Integer.MIN_VALUE;
            this.f72933m = rH.Wre.FADE;
            this.eTf = hoF.j.FADE;
            this.xg = 500L;
            this.pJg = rH.CN3.NONE;
            this.ofS = Integer.MIN_VALUE;
            this.f72916G7 = 1;
            this.ul = rH.Dsr.rl(1, this.eWT);
            this.n1 = true;
            this.Jk = true;
        }

        public final j HI(int i2) {
            this.J2 = YQ.j.nr(this.Rl, i2);
            return this;
        }

        public final j Ik(CharSequence value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.fD = value;
            return this;
        }

        public final j J2(rH.Wre value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f72933m = value;
            if (value == rH.Wre.CIRCULAR) {
                KN(false);
            }
            return this;
        }

        public final j KN(boolean z2) {
            this.n1 = z2;
            return this;
        }

        public final j O(int i2) {
            this.f72931g = YQ.j.n(this.Rl, i2);
            return this;
        }

        public final j Uo(float f3) {
            this.iF = YQ.j.t(this.Rl, f3);
            return this;
        }

        public final j Z(int i2) {
            if (!(i2 > 0 || i2 == Integer.MIN_VALUE)) {
                throw new IllegalArgumentException("The width of the balloon must bigger than zero.");
            }
            this.f72934n = YQ.j.nr(this.Rl, i2);
            return this;
        }

        public final j az(int i2) {
            this.Uo = YQ.j.nr(this.Rl, i2);
            return this;
        }

        public final j ck(int i2) {
            this.f72922O = YQ.j.nr(this.Rl, i2);
            return this;
        }

        public final j gh(LifecycleOwner lifecycleOwner) {
            this.f72939z = lifecycleOwner;
            return this;
        }

        public final j mUb(int i2) {
            this.f72914E = i2;
            return this;
        }

        public final Ml n() {
            return new Ml(this.Rl, this);
        }

        public final j nr(int i2) {
            this.ty = i2 != Integer.MIN_VALUE ? YQ.j.nr(this.Rl, i2) : Integer.MIN_VALUE;
            return this;
        }

        public final j o(boolean z2) {
            this.f72930e = z2;
            return this;
        }

        public final j r(int i2) {
            this.E2 = YQ.j.n(this.Rl, i2);
            return this;
        }

        public final j rl(rH.j value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f72936r = value;
            return this;
        }

        public final j t(float f3) {
            this.HI = f3;
            return this;
        }

        public final j ty(int i2) {
            this.nr = YQ.j.nr(this.Rl, i2);
            return this;
        }

        public final j xMQ(int i2) {
            if (!(i2 > 0 || i2 == Integer.MIN_VALUE)) {
                throw new IllegalArgumentException("The height of the balloon must bigger than zero.");
            }
            this.f72937t = YQ.j.nr(this.Rl, i2);
            return this;
        }

        public final j qie(int i2) {
            ty(i2);
            ck(i2);
            HI(i2);
            az(i2);
            return this;
        }
    }

    static final class n extends Lambda implements Function0 {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final rH.fuX invoke() {
            return rH.fuX.f72979t.n(Ml.this.f72892S);
        }
    }

    public static final class o implements Runnable {
        final /* synthetic */ View J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ml f72941O;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f72943o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f72944r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f72945t;

        public o(View view, Ml ml, View view2, int i2, int i3) {
            this.f72945t = view;
            this.f72941O = ml;
            this.J2 = view2;
            this.f72944r = i2;
            this.f72943o = i3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (Ml.this.Y() || Ml.this.f72896o || YQ.j.O(Ml.this.f72892S)) {
                if (Ml.this.f72894g.f72917GR) {
                    Ml.this.iF();
                    return;
                }
                return;
            }
            Ml.this.f72897r = true;
            String str = Ml.this.f72894g.Mx;
            if (str != null) {
                if (!Ml.this.N().Uo(str, Ml.this.f72894g.f72916G7)) {
                    Function0 function0 = Ml.this.f72894g.fcU;
                    if (function0 != null) {
                        return;
                    }
                    return;
                }
                Ml.this.N().J2(str);
            }
            long j2 = Ml.this.f72894g.dR0;
            if (j2 != -1) {
                Ml.this.fD(j2);
            }
            Ml.this.Nxk();
            Ml.this.f72895n.getRoot().measure(0, 0);
            Ml.this.f72891O.setWidth(Ml.this.v());
            Ml.this.f72891O.setHeight(Ml.this.s7N());
            VectorTextView vectorTextView = Ml.this.f72895n.J2;
            Intrinsics.checkNotNullExpressionValue(vectorTextView, "this.binding.balloonText");
            vectorTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Ml.this.Xw(this.f72945t);
            Ml.this.E();
            Ml.this.g();
            Ml.this.C(this.f72945t);
            Ml.this.nY();
            Ml.this.Mx();
            this.f72941O.f72891O.showAsDropDown(this.J2, this.f72941O.f72894g.ul * (((this.J2.getMeasuredWidth() / 2) - (this.f72941O.v() / 2)) + this.f72944r), this.f72943o);
        }
    }

    public static final class qz implements Runnable {
        final /* synthetic */ View J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ml f72946O;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f72948o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f72949r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f72950t;

        public qz(View view, Ml ml, View view2, int i2, int i3) {
            this.f72950t = view;
            this.f72946O = ml;
            this.J2 = view2;
            this.f72949r = i2;
            this.f72948o = i3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (Ml.this.Y() || Ml.this.f72896o || YQ.j.O(Ml.this.f72892S)) {
                if (Ml.this.f72894g.f72917GR) {
                    Ml.this.iF();
                    return;
                }
                return;
            }
            Ml.this.f72897r = true;
            String str = Ml.this.f72894g.Mx;
            if (str != null) {
                if (!Ml.this.N().Uo(str, Ml.this.f72894g.f72916G7)) {
                    Function0 function0 = Ml.this.f72894g.fcU;
                    if (function0 != null) {
                        return;
                    }
                    return;
                }
                Ml.this.N().J2(str);
            }
            long j2 = Ml.this.f72894g.dR0;
            if (j2 != -1) {
                Ml.this.fD(j2);
            }
            Ml.this.Nxk();
            Ml.this.f72895n.getRoot().measure(0, 0);
            Ml.this.f72891O.setWidth(Ml.this.v());
            Ml.this.f72891O.setHeight(Ml.this.s7N());
            VectorTextView vectorTextView = Ml.this.f72895n.J2;
            Intrinsics.checkNotNullExpressionValue(vectorTextView, "this.binding.balloonText");
            vectorTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Ml.this.Xw(this.f72950t);
            Ml.this.E();
            Ml.this.g();
            Ml.this.C(this.f72950t);
            Ml.this.nY();
            Ml.this.Mx();
            this.f72946O.f72891O.showAsDropDown(this.J2, this.f72946O.f72894g.ul * (((this.J2.getMeasuredWidth() / 2) - (this.f72946O.v() / 2)) + this.f72949r), ((-this.f72946O.s7N()) - this.J2.getMeasuredHeight()) + this.f72948o);
        }
    }

    public static final class w6 implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f72951O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f72952n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f72953t;

        public static final class j extends AnimatorListenerAdapter {
            public j() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                w6.this.f72951O.invoke();
            }
        }

        public w6(View view, long j2, Function0 function0) {
            this.f72952n = view;
            this.f72953t = j2;
            this.f72951O = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f72952n.isAttachedToWindow()) {
                View view = this.f72952n;
                Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getLeft() + this.f72952n.getRight()) / 2, (this.f72952n.getTop() + this.f72952n.getBottom()) / 2, Math.max(this.f72952n.getWidth(), this.f72952n.getHeight()), 0.0f);
                animatorCreateCircularReveal.setDuration(this.f72953t);
                animatorCreateCircularReveal.start();
                animatorCreateCircularReveal.addListener(new j());
            }
        }
    }

    private final void ViF(ViewGroup viewGroup) {
        viewGroup.setFitsSystemWindows(false);
        IntRange intRangeUntil = RangesKt.until(0, viewGroup.getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(viewGroup.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View child : arrayList) {
            Intrinsics.checkNotNullExpressionValue(child, "child");
            child.setFitsSystemWindows(false);
            if (child instanceof ViewGroup) {
                ViF((ViewGroup) child);
            }
        }
    }

    private final void k(AppCompatTextView appCompatTextView) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        appCompatTextView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(YQ.j.rl(context).y, 0));
        appCompatTextView.getLayoutParams().width = wTp(appCompatTextView.getMeasuredWidth());
    }

    public final rH.Pl bzg() {
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.f72896o = true;
        this.J2.dismiss();
        this.f72891O.dismiss();
    }

    public Ml(Context context, j builder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f72892S = context;
        this.f72894g = builder;
        Zo2.j jVarT = Zo2.j.t(LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(jVarT, "LayoutBalloonLibrarySkyd…om(context), null, false)");
        this.f72895n = jVarT;
        Zo2.n nVarT = Zo2.n.t(LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(nVarT, "LayoutBalloonOverlayLibr…om(context), null, false)");
        this.f72898t = nVarT;
        builder.getClass();
        this.f72893Z = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new n());
        this.f72891O = new PopupWindow(jVarT.getRoot(), -2, -2);
        this.J2 = new PopupWindow(nVarT.getRoot(), -1, -1);
        te();
    }

    private final void B() {
        if (this.f72894g.f72920M) {
            this.J2.setClippingEnabled(false);
            this.f72898t.getRoot().setOnClickListener(new CN3());
            BalloonAnchorOverlayView balloonAnchorOverlayView = this.f72898t.rl;
            balloonAnchorOverlayView.setOverlayColor(this.f72894g.f72915FX);
            balloonAnchorOverlayView.setOverlayPadding(this.f72894g.f72911B);
            balloonAnchorOverlayView.setOverlayPosition(this.f72894g.f72919J);
            balloonAnchorOverlayView.setBalloonOverlayShape(this.f72894g.f72913D);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(View view) {
        if (this.f72894g.f72920M) {
            this.f72898t.rl.setAnchorView(view);
            this.J2.showAtLocation(view, 17, 0, 0);
        }
    }

    private final void D() {
        PopupWindow popupWindow = this.f72891O;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(this.f72894g.n1);
        popupWindow.setElevation(this.f72894g.p5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        j jVar = this.f72894g;
        int i2 = jVar.ty - 1;
        int i3 = (int) jVar.p5;
        FrameLayout frameLayout = this.f72895n.f12599O;
        int i5 = rH.I28.$EnumSwitchMapping$3[jVar.f72936r.ordinal()];
        if (i5 == 1 || i5 == 2) {
            frameLayout.setPadding(i2, i3, i2, i3);
        } else if (i5 == 3 || i5 == 4) {
            frameLayout.setPadding(i3, i2, i3, RangesKt.coerceAtLeast(i2, i3));
        }
        VectorTextView vectorTextView = this.f72895n.J2;
        j jVar2 = this.f72894g;
        vectorTextView.setPadding(jVar2.nr, jVar2.f72922O, jVar2.J2, jVar2.Uo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float E2(View view) {
        FrameLayout frameLayout = this.f72895n.f12599O;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.balloonContent");
        int i2 = YQ.I28.t(frameLayout).x;
        int i3 = YQ.I28.t(view).x;
        float fRV9 = rV9();
        float fV = ((v() - fRV9) - r4.KN) - r4.xMQ;
        float f3 = r4.ty / 2.0f;
        int i5 = rH.I28.$EnumSwitchMapping$1[this.f72894g.ck.ordinal()];
        if (i5 == 1) {
            Intrinsics.checkNotNullExpressionValue(this.f72895n.Uo, "binding.balloonWrapper");
            return (r8.getWidth() * this.f72894g.HI) - f3;
        }
        if (i5 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (view.getWidth() + i3 >= i2) {
            if (v() + i2 >= i3) {
                float width = (((view.getWidth() * this.f72894g.HI) + i3) - i2) - f3;
                if (width > nHg()) {
                    if (width <= v() - nHg()) {
                        return width;
                    }
                }
            }
            return fV;
        }
        return fRV9;
    }

    private final void FX() {
        this.f72894g.getClass();
        dR0(null);
        this.f72894g.getClass();
        z(null);
        this.f72894g.getClass();
        piY(null);
        m(this.f72894g.f72929a);
        this.f72894g.getClass();
        ijL(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G7() {
        FrameLayout frameLayout = this.f72895n.rl;
        Animation animation = frameLayout.getAnimation();
        if (animation != null) {
            animation.cancel();
            animation.reset();
        }
        frameLayout.clearAnimation();
    }

    private final void GR() {
        VectorTextView vectorTextView = this.f72895n.J2;
        rH.aC aCVar = this.f72894g.P5;
        if (aCVar != null) {
            YQ.Ml.rl(vectorTextView, aCVar);
            return;
        }
        Context context = vectorTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        aC.j jVar = new aC.j(context);
        jVar.rl(this.f72894g.f72938v);
        jVar.Uo(this.f72894g.bzg);
        jVar.O(this.f72894g.Xw);
        jVar.nr(this.f72894g.f72925U);
        jVar.J2(this.f72894g.jB);
        jVar.t(this.f72894g.rV9);
        Unit unit = Unit.INSTANCE;
        YQ.Ml.rl(vectorTextView, jVar.n());
    }

    private final void I() {
        this.f72895n.nr.removeAllViews();
        this.f72895n.nr.addView(this.f72894g.eF);
        RadiusLayout radiusLayout = this.f72895n.nr;
        Intrinsics.checkNotNullExpressionValue(radiusLayout, "binding.balloonCard");
        fcU(radiusLayout);
    }

    private final void J() {
        ViewGroup.LayoutParams layoutParams = this.f72895n.Uo.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        j jVar = this.f72894g;
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(jVar.xMQ, jVar.mUb, jVar.KN, jVar.gh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mx() {
        this.f72895n.rl.post(new Pl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rH.fuX N() {
        return (rH.fuX) this.f72893Z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Nxk() {
        VectorTextView vectorTextView = this.f72895n.J2;
        UGc uGc = this.f72894g.wTp;
        if (uGc != null) {
            YQ.Ml.t(vectorTextView, uGc);
        } else {
            Context context = vectorTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            UGc.j jVar = new UGc.j(context);
            jVar.rl(this.f72894g.fD);
            jVar.J2(this.f72894g.f72924T);
            jVar.t(this.f72894g.E2);
            jVar.O(this.f72894g.f72930e);
            jVar.nr(this.f72894g.s7N);
            jVar.Uo(this.f72894g.f72921N);
            jVar.KN(this.f72894g.nHg);
            vectorTextView.setMovementMethod(this.f72894g.f72926X);
            Unit unit = Unit.INSTANCE;
            YQ.Ml.t(vectorTextView, jVar.n());
        }
        Intrinsics.checkNotNullExpressionValue(vectorTextView, "this");
        k(vectorTextView);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void P5() {
        RadiusLayout radiusLayout = this.f72895n.nr;
        radiusLayout.setAlpha(this.f72894g.M7);
        ViewCompat.fcU(radiusLayout, this.f72894g.p5);
        Drawable drawable = this.f72894g.te;
        if (drawable != null) {
            radiusLayout.setBackground(drawable);
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f72894g.f72931g);
        gradientDrawable.setCornerRadius(this.f72894g.iF);
        Unit unit = Unit.INSTANCE;
        radiusLayout.setBackground(gradientDrawable);
        radiusLayout.setRadius(this.f72894g.iF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Animation X() {
        j jVar = this.f72894g;
        int i2 = jVar.ofS;
        if (i2 == Integer.MIN_VALUE) {
            if (rH.I28.$EnumSwitchMapping$7[jVar.pJg.ordinal()] != 1) {
                return null;
            }
            j jVar2 = this.f72894g;
            if (jVar2.qie) {
                int i3 = rH.I28.$EnumSwitchMapping$6[jVar2.f72936r.ordinal()];
                if (i3 == 1) {
                    i2 = z.f73010n;
                } else if (i3 == 2) {
                    i2 = z.f73009O;
                } else if (i3 == 3) {
                    i2 = z.nr;
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = z.f73011t;
                }
            } else {
                i2 = z.rl;
            }
        }
        return AnimationUtils.loadAnimation(this.f72892S, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Xw(View view) {
        AppCompatImageView appCompatImageView = this.f72895n.f12601t;
        YQ.I28.nr(appCompatImageView, this.f72894g.qie);
        int i2 = this.f72894g.ty;
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        appCompatImageView.setAlpha(this.f72894g.M7);
        Drawable drawable = this.f72894g.f72935o;
        if (drawable != null) {
            appCompatImageView.setImageDrawable(drawable);
        }
        j jVar = this.f72894g;
        appCompatImageView.setPadding(jVar.f72928Z, jVar.f72923S, jVar.XQ, jVar.WPU);
        j jVar2 = this.f72894g;
        int i3 = jVar2.az;
        if (i3 != Integer.MIN_VALUE) {
            ImageViewCompat.t(appCompatImageView, ColorStateList.valueOf(i3));
        } else {
            ImageViewCompat.t(appCompatImageView, ColorStateList.valueOf(jVar2.f72931g));
        }
        appCompatImageView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        this.f72895n.nr.post(new Wre(appCompatImageView, this, view));
    }

    private final void a() {
        this.f72895n.nr.removeAllViews();
        LayoutInflater.from(this.f72892S).inflate(this.f72894g.f72914E, (ViewGroup) this.f72895n.nr, true);
        RadiusLayout radiusLayout = this.f72895n.nr;
        Intrinsics.checkNotNullExpressionValue(radiusLayout, "binding.balloonCard");
        fcU(radiusLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aYN(View view) {
        if (this.f72894g.Ik == rH.n.ALIGN_FIXED) {
            return;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int[] iArr = {0, 0};
        this.f72891O.getContentView().getLocationOnScreen(iArr);
        j jVar = this.f72894g;
        rH.j jVar2 = jVar.f72936r;
        rH.j jVar3 = rH.j.TOP;
        if (jVar2 == jVar3 && iArr[1] < rect.bottom) {
            jVar.rl(rH.j.BOTTOM);
        } else if (jVar2 == rH.j.BOTTOM && iArr[1] > rect.top) {
            jVar.rl(jVar3);
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float e(View view) {
        int iRl = YQ.I28.rl(view, this.f72894g.Jk);
        FrameLayout frameLayout = this.f72895n.f12599O;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.balloonContent");
        int i2 = YQ.I28.t(frameLayout).y - iRl;
        int i3 = YQ.I28.t(view).y - iRl;
        float fRV9 = rV9();
        j jVar = this.f72894g;
        float fS7N = ((s7N() - fRV9) - jVar.mUb) - jVar.gh;
        int i5 = jVar.ty / 2;
        int i7 = rH.I28.$EnumSwitchMapping$2[jVar.ck.ordinal()];
        if (i7 == 1) {
            Intrinsics.checkNotNullExpressionValue(this.f72895n.Uo, "binding.balloonWrapper");
            return (r9.getHeight() * this.f72894g.HI) - i5;
        }
        if (i7 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (view.getHeight() + i3 >= i2) {
            if (s7N() + i2 >= i3) {
                float height = (((view.getHeight() * this.f72894g.HI) + i3) - i2) - i5;
                if (height > nHg()) {
                    if (height <= s7N() - nHg()) {
                        return height;
                    }
                }
            }
            return fS7N;
        }
        return fRV9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        j jVar = this.f72894g;
        if (jVar.ijL != Integer.MIN_VALUE) {
            this.J2.setAnimationStyle(jVar.piY);
            return;
        }
        if (rH.I28.$EnumSwitchMapping$5[jVar.eTf.ordinal()] != 1) {
            this.J2.setAnimationStyle(AbstractC2356c.nr);
        } else {
            this.J2.setAnimationStyle(AbstractC2356c.rl);
        }
    }

    private final int nHg() {
        return this.f72894g.ty * 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nY() {
        j jVar = this.f72894g;
        int i2 = jVar.piY;
        if (i2 != Integer.MIN_VALUE) {
            this.f72891O.setAnimationStyle(i2);
            return;
        }
        int i3 = rH.I28.$EnumSwitchMapping$4[jVar.f72933m.ordinal()];
        if (i3 == 1) {
            this.f72891O.setAnimationStyle(AbstractC2356c.f72976n);
            return;
        }
        if (i3 == 2) {
            View contentView = this.f72891O.getContentView();
            Intrinsics.checkNotNullExpressionValue(contentView, "bodyWindow.contentView");
            YQ.I28.n(contentView, this.f72894g.xg);
            this.f72891O.setAnimationStyle(AbstractC2356c.f72977t);
            return;
        }
        if (i3 == 3) {
            this.f72891O.setAnimationStyle(AbstractC2356c.rl);
        } else if (i3 != 4) {
            this.f72891O.setAnimationStyle(AbstractC2356c.nr);
        } else {
            this.f72891O.setAnimationStyle(AbstractC2356c.f72975O);
        }
    }

    public static /* synthetic */ void ofS(Ml ml, View view, int i2, int i3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        ml.pJg(view, i2, i3);
    }

    private final float rV9() {
        return (r0.ty * this.f72894g.ViF) + r0.aYN;
    }

    private final int wTp(int i2) {
        int i3 = YQ.j.rl(this.f72892S).x;
        j jVar = this.f72894g;
        int iNr = jVar.nr + jVar.J2 + YQ.j.nr(this.f72892S, 24);
        j jVar2 = this.f72894g;
        int i5 = iNr + (jVar2.f72938v != null ? jVar2.bzg + jVar2.jB : 0);
        float f3 = jVar2.rl;
        if (f3 != 0.0f) {
            return ((int) (i3 * f3)) - i5;
        }
        int i7 = jVar2.f72934n;
        if (i7 != Integer.MIN_VALUE && i7 <= i3) {
            return i7 - i5;
        }
        int i8 = i3 - i5;
        return i2 < i8 ? i2 : i8;
    }

    public static /* synthetic */ void xg(Ml ml, View view, int i2, int i3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        ml.eTf(view, i2, i3);
    }

    public final boolean Y() {
        return this.f72897r;
    }

    public final void dR0(rH.o oVar) {
        this.f72895n.Uo.setOnClickListener(new fuX(oVar));
    }

    public final void eTf(View anchor, int i2, int i3) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        anchor.post(new o(anchor, this, anchor, i2, i3));
    }

    public final void fD(long j2) {
        new Handler(Looper.getMainLooper()).postDelayed(new I28(), j2);
    }

    public final void iF() {
        if (this.f72897r) {
            C1155Ml c1155Ml = new C1155Ml();
            if (this.f72894g.f72933m != rH.Wre.CIRCULAR) {
                c1155Ml.invoke();
                return;
            }
            View contentView = this.f72891O.getContentView();
            Intrinsics.checkNotNullExpressionValue(contentView, "this.bodyWindow.contentView");
            contentView.post(new w6(contentView, this.f72894g.xg, c1155Ml));
        }
    }

    public final void ijL(eO eOVar) {
        this.f72898t.getRoot().setOnClickListener(new C(eOVar));
    }

    public final void m(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.f72891O.setTouchInterceptor(onTouchListener);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.f72894g.f72932k) {
            onDestroy();
        }
    }

    public final void pJg(View anchor, int i2, int i3) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        anchor.post(new qz(anchor, this, anchor, i2, i3));
    }

    public final void piY(Xo xo) {
        this.f72891O.setTouchInterceptor(new aC(xo));
    }

    public final int s7N() {
        int i2 = this.f72894g.f72937t;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        FrameLayout frameLayoutRl = this.f72895n.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutRl, "this.binding.root");
        return frameLayoutRl.getMeasuredHeight();
    }

    public final int v() {
        int i2 = YQ.j.rl(this.f72892S).x;
        j jVar = this.f72894g;
        float f3 = jVar.rl;
        if (f3 != 0.0f) {
            return (int) (i2 * f3);
        }
        int i3 = jVar.f72934n;
        if (i3 != Integer.MIN_VALUE && i3 < i2) {
            return i3;
        }
        FrameLayout frameLayoutRl = this.f72895n.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutRl, "binding.root");
        if (frameLayoutRl.getMeasuredWidth() > i2) {
            return i2;
        }
        FrameLayout frameLayoutRl2 = this.f72895n.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutRl2, "this.binding.root");
        return frameLayoutRl2.getMeasuredWidth();
    }

    public final void z(rH.qz qzVar) {
        this.f72891O.setOnDismissListener(new Dsr(qzVar));
    }

    private final void fcU(ViewGroup viewGroup) {
        IntRange intRangeUntil = RangesKt.until(0, viewGroup.getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(viewGroup.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            if (view instanceof AppCompatTextView) {
                k((AppCompatTextView) view);
            } else if (view instanceof ViewGroup) {
                fcU((ViewGroup) view);
            }
        }
    }

    private final void te() {
        Lifecycle lifecycle;
        P5();
        J();
        D();
        E();
        B();
        FX();
        j jVar = this.f72894g;
        if (jVar.f72914E != Integer.MIN_VALUE) {
            a();
        } else if (jVar.eF != null) {
            I();
        } else {
            GR();
            Nxk();
        }
        FrameLayout frameLayoutRl = this.f72895n.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutRl, "binding.root");
        ViF(frameLayoutRl);
        j jVar2 = this.f72894g;
        LifecycleOwner lifecycleOwner = jVar2.f72939z;
        if (lifecycleOwner == null) {
            Object obj = this.f72892S;
            if (obj instanceof LifecycleOwner) {
                jVar2.gh((LifecycleOwner) obj);
                ((LifecycleOwner) this.f72892S).getLifecycleRegistry().n(this);
                return;
            }
        }
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycleRegistry()) != null) {
            lifecycle.n(this);
        }
    }
}
