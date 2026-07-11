package com.bendingspoons.injet.ui;

import GJW.C;
import GJW.ci;
import GJW.r;
import GJW.vd;
import KW9.j;
import KW9.n;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import androidx.view.OnBackPressedCallback;
import com.bendingspoons.injet.ui.InjetPresenterActivity;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.utils.Logger;
import java.util.UUID;
import kP.AbstractC2204CN3;
import kP.AbstractC2207Wre;
import kP.AbstractC2208fuX;
import kP.EnumC2205I28;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nfZ.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0011\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bendingspoons/injet/ui/InjetPresenterActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStop", "onDestroy", "LGJW/r;", c.f62177j, "LGJW/r;", "dismissalCallback", "t", "j", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInjetPresenterActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InjetPresenterActivity.kt\ncom/bendingspoons/injet/ui/InjetPresenterActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,225:1\n167#2,2:226\n*S KotlinDebug\n*F\n+ 1 InjetPresenterActivity.kt\ncom/bendingspoons/injet/ui/InjetPresenterActivity\n*L\n87#1:226,2\n*E\n"})
public class InjetPresenterActivity extends ComponentActivity {
    private static CN3 J2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static boolean f51366S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static boolean f51367Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static rB.Ml f51369o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static InjetPresenterActivity f51370r;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private r dismissalCallback;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f51365O = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static EnumC2205I28 f51368g = EnumC2205I28.f69847n;
    private static Function0 E2 = n.f51375n;

    public static final class I28 extends OnBackPressedCallback {

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f51373n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f51374t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(String str, Continuation continuation) {
                super(2, continuation);
                this.f51374t = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f51374t, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f51373n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CN3 cn3O = InjetPresenterActivity.INSTANCE.O();
                    if (cn3O != null) {
                        String str = this.f51374t;
                        this.f51373n = 1;
                        obj = cn3O.nr("executeWebFunction", new String[]{"handleForceFinishTriggerEvaluation", "backPressed"}, str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }

        I28() {
            super(true);
        }

        @Override // androidx.view.OnBackPressedCallback
        public void Uo() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            C.nr(LifecycleOwnerKt.n(InjetPresenterActivity.this), null, null, new j(string, null), 3, null);
        }
    }

    public static final class Ml extends OnBackPressedCallback {
        Ml() {
            super(true);
        }

        @Override // androidx.view.OnBackPressedCallback
        public void Uo() {
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.injet.ui.InjetPresenterActivity$j, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.bendingspoons.injet.ui.InjetPresenterActivity$j$j, reason: collision with other inner class name */
        public /* synthetic */ class C0721j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC2205I28.values().length];
                try {
                    iArr[EnumC2205I28.f69847n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC2205I28.f69850t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC2205I28.f69849r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC2205I28.J2.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC2205I28.f69845O.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            p0.startActivity(p1);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String Uo() {
            return "[Error] Duplicate presentation";
        }

        public final void J2(CN3 webView, Context context, rB.Ml spiderSense, boolean z2, boolean z3, EnumC2205I28 navigationStyle, Function0 getCustomBackgroundColor) {
            Class cls;
            Intrinsics.checkNotNullParameter(webView, "webView");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(navigationStyle, "navigationStyle");
            Intrinsics.checkNotNullParameter(getCustomBackgroundColor, "getCustomBackgroundColor");
            if (O() != null) {
                j.f5464n.n("InjetPresenterActivity", new Function0() { // from class: h4T.Ml
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InjetPresenterActivity.Companion.Uo();
                    }
                });
                KW9.w6.n(spiderSense, n.j.C0182j.f5477O);
            }
            gh(z2);
            mUb(z3);
            xMQ(navigationStyle);
            KN(getCustomBackgroundColor);
            az(webView);
            qie(spiderSense);
            int i2 = C0721j.$EnumSwitchMapping$0[navigationStyle.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                cls = InjetPresenterActivity.class;
            } else {
                if (i2 != 4 && i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                cls = InjetClearBackgroundPresenterActivity.class;
            }
            Intent intent = new Intent(context, (Class<?>) cls);
            intent.setFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }

        public final void KN(Function0 function0) {
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            InjetPresenterActivity.E2 = function0;
        }

        public final void xMQ(EnumC2205I28 enumC2205I28) {
            Intrinsics.checkNotNullParameter(enumC2205I28, "<set-?>");
            InjetPresenterActivity.f51368g = enumC2205I28;
        }

        public final CN3 O() {
            return InjetPresenterActivity.J2;
        }

        public final void az(CN3 cn3) {
            InjetPresenterActivity.J2 = cn3;
        }

        public final void gh(boolean z2) {
            InjetPresenterActivity.f51367Z = z2;
        }

        public final void mUb(boolean z2) {
            InjetPresenterActivity.f51366S = z2;
        }

        public final EnumC2205I28 nr() {
            return InjetPresenterActivity.f51368g;
        }

        public final void qie(rB.Ml ml) {
            InjetPresenterActivity.f51369o = ml;
        }

        public final Object rl(Continuation continuation) {
            if (t() == null) {
                return Unit.INSTANCE;
            }
            r rVarT = ci.t(null, 1, null);
            InjetPresenterActivity injetPresenterActivityT = t();
            if (injetPresenterActivityT != null) {
                injetPresenterActivityT.dismissalCallback = rVarT;
            }
            InjetPresenterActivity injetPresenterActivityT2 = t();
            if (injetPresenterActivityT2 != null) {
                injetPresenterActivityT2.finish();
            }
            Object objAwait = rVarT.await(continuation);
            if (objAwait == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objAwait;
            }
            return Unit.INSTANCE;
        }

        public final InjetPresenterActivity t() {
            return InjetPresenterActivity.f51370r;
        }
    }

    static final class n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f51375n = new n();

        n() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC2205I28.values().length];
            try {
                iArr[EnumC2205I28.f69847n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2205I28.f69850t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2205I28.f69849r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2205I28.f69845O.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC2205I28.J2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String C() {
        return "[Error] WebView is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat Mx(View v2, WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(v2, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Insets insetsJ2 = windowInsets.J2(WindowInsetsCompat.Type.xMQ());
        Intrinsics.checkNotNullExpressionValue(insetsJ2, "getInsets(...)");
        v2.setPadding(insetsJ2.f36410n, insetsJ2.rl, insetsJ2.f36411t, insetsJ2.nr);
        return WindowInsetsCompat.rl;
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        WebView webViewJ2;
        WebView webViewJ22;
        WebView webViewJ23;
        f51370r = this;
        int i2 = w6.$EnumSwitchMapping$0[f51368g.ordinal()];
        if (i2 == 1) {
            setTheme(AbstractC2208fuX.rl);
        } else if (i2 == 2) {
            setTheme(AbstractC2208fuX.f69852n);
        } else if (i2 != 3 && i2 != 4 && i2 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        super.onCreate(savedInstanceState);
        if (J2 == null) {
            j.f5464n.n("InjetPresenterActivity", new Function0() { // from class: h4T.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InjetPresenterActivity.C();
                }
            });
            rB.Ml ml = f51369o;
            if (ml != null) {
                KW9.w6.n(ml, n.j.I28.f5472O);
            }
            finish();
            return;
        }
        setContentView(AbstractC2204CN3.f69844n);
        int i3 = AbstractC2207Wre.f69851n;
        FrameLayout frameLayout = (FrameLayout) findViewById(i3);
        Integer num = (Integer) E2.invoke();
        if (num != null) {
            int iIntValue = num.intValue();
            frameLayout.setBackgroundColor(iIntValue);
            if (Build.VERSION.SDK_INT <= 34) {
                getWindow().getDecorView().setBackgroundColor(iIntValue);
            }
        }
        if (f51367Z) {
            WindowCompat.rl(getWindow(), false);
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
            windowInsetsControllerCompat.n(WindowInsetsCompat.Type.KN() | WindowInsetsCompat.Type.Uo());
            windowInsetsControllerCompat.nr(2);
            if (Build.VERSION.SDK_INT >= 28) {
                getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
            }
        } else {
            ViewCompat.Org(frameLayout, new OnApplyWindowInsetsListener() { // from class: h4T.n
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                    return InjetPresenterActivity.Mx(view, windowInsetsCompat);
                }
            });
        }
        if (f51366S) {
            getOnBackPressedDispatcher().xMQ(this, new Ml());
        } else {
            getOnBackPressedDispatcher().xMQ(this, new I28());
        }
        try {
            CN3 cn3 = J2;
            if (cn3 != null && (webViewJ23 = cn3.J2()) != null) {
                ViewParent parent = webViewJ23.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(webViewJ23);
                }
            }
            FrameLayout frameLayout2 = (FrameLayout) findViewById(i3);
            CN3 cn32 = J2;
            frameLayout2.addView(cn32 != null ? cn32.J2() : null);
        } catch (IllegalStateException e2) {
            j.f5464n.n("InjetPresenterActivity", new Function0() { // from class: h4T.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InjetPresenterActivity.G7(e2);
                }
            });
            rB.Ml ml2 = f51369o;
            if (ml2 != null) {
                KW9.w6.n(ml2, new n.j.Ml(e2));
            }
            finish();
        }
        CN3 cn33 = J2;
        if (cn33 != null && (webViewJ22 = cn33.J2()) != null) {
            webViewJ22.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        CN3 cn34 = J2;
        if (cn34 == null || (webViewJ2 = cn34.J2()) == null) {
            return;
        }
        webViewJ2.setAlpha(0.0f);
        webViewJ2.animate().alpha(1.0f).setDuration(200L).setStartDelay(100L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String G7(IllegalStateException illegalStateException) {
        return "[Error] " + illegalStateException.getMessage();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        J2 = null;
        f51370r = null;
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        r rVar = this.dismissalCallback;
        if (rVar != null) {
            rVar.eF(Unit.INSTANCE);
        }
        this.dismissalCallback = null;
    }
}
