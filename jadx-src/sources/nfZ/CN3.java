package nfZ;

import GJW.Qik;
import GJW.ci;
import GJW.r;
import GJW.vd;
import KW9.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bendingspoons.injet.webbridge.AndroidBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 {
    private static final long xMQ;
    private final Map J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map f71205O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final rB.Ml f71206n;
    private final Lazy nr;
    private final vd rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f71207t;
    private static final j Uo = new j(null);
    public static final int KN = 8;

    public static final class Ml extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
        }

        Ml() {
        }
    }

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f71208O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71209n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f71210r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f71211t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71208O = obj;
            this.f71210r |= Integer.MIN_VALUE;
            return CN3.this.nr(null, null, null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71212n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r f71213t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(r rVar, Continuation continuation) {
            super(2, continuation);
            this.f71213t = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w6(this.f71213t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71212n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            r rVar = this.f71213t;
            this.f71212n = 1;
            Object objAwait = rVar.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objAwait;
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        xMQ = DurationKt.toDuration(5, DurationUnit.SECONDS);
    }

    public CN3(final Context context, final sP.w6 assetManager, rB.Ml spiderSense, vd coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f71206n = spiderSense;
        this.rl = coroutineScope;
        this.f71207t = LazyKt.lazy(new Function0() { // from class: nfZ.I28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CN3.gh(context);
            }
        });
        this.nr = LazyKt.lazy(new Function0() { // from class: nfZ.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CN3.mUb(assetManager);
            }
        });
        this.f71205O = new LinkedHashMap();
        this.J2 = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(r rVar, x0X.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rVar.eF(it);
        return Unit.INSTANCE;
    }

    private final fuX Uo() {
        return (fuX) this.nr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView gh(Context context) {
        return new WebView(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fuX mUb(sP.w6 w6Var) {
        return new fuX(w6Var);
    }

    public final WebView J2() {
        return (WebView) this.f71207t.getValue();
    }

    public final void KN(String assetUrl) {
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        J2().setWebViewClient(Uo());
        J2().getSettings().setJavaScriptEnabled(true);
        J2().getSettings().setDomStorageEnabled(true);
        AndroidBridge.INSTANCE.registerAndroidBridge(J2(), this.J2, this.f71205O, this.f71206n, this.rl);
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        J2().measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        J2().layout(0, 0, i2, i3);
        J2().setBackgroundColor(0);
        J2().setWebChromeClient(new Ml());
        J2().loadUrl(assetUrl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object nr(String str, String[] strArr, String str2, Continuation continuation) {
        n nVar;
        CN3 cn3;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f71210r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f71210r = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objJ2 = nVar.f71208O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f71210r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objJ2);
            final r rVarT = ci.t(null, 1, null);
            this.J2.put(str2, new Function1() { // from class: nfZ.Ml
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CN3.O(rVarT, (x0X.n) obj);
                }
            });
            WebView webViewJ2 = J2();
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(strArr);
            spreadBuilder.add(str2);
            nfZ.w6.t(webViewJ2, str, (String[]) spreadBuilder.toArray(new String[spreadBuilder.size()]));
            long j2 = xMQ;
            w6 w6Var = new w6(rVarT, null);
            nVar.f71209n = this;
            nVar.f71211t = str;
            nVar.f71210r = 1;
            objJ2 = Qik.J2(j2, w6Var, nVar);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn3 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) nVar.f71211t;
            cn3 = (CN3) nVar.f71209n;
            ResultKt.throwOnFailure(objJ2);
        }
        x0X.n nVar2 = (x0X.n) objJ2;
        if (nVar2 != null) {
            return nVar2;
        }
        KW9.w6.n(cn3.f71206n, new n.j.C(str));
        return new n.C1266n(new Exception("injet: JS Response Timeout"));
    }

    public final void xMQ(String name, Function2 function) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(function, "function");
        Map map = this.f71205O;
        Pair pair = TuplesKt.to(name, function);
        map.put(pair.getFirst(), pair.getSecond());
    }
}
