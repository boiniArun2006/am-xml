package Q;

import Dj7.AbstractC1329m;
import GJW.vd;
import NBO.j;
import NBO.n;
import Q.w6;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import androidx.view.OnBackPressedCallback;
import java.util.List;
import kP.InterfaceC2210n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2210n f7887n;
    private final Xo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final WK.n f7888t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f7886O = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n implements Function2 {
        final /* synthetic */ w6 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f7889O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Eu.I28 f7890S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function0 f7891Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ JK.w6 f7892g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f7893n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f7894o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Eu.I28 f7895r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f7896t;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ Function0 E2;
            int J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            Object f7897O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ Eu.I28 f7898S;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ Eu.I28 f7899Z;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ JK.w6 f7900e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0 f7901g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f7902n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ w6 f7903o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ String f7904r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f7905t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(String str, w6 w6Var, Eu.I28 i28, Eu.I28 i282, Function0 function0, Function0 function02, JK.w6 w6Var2, Continuation continuation) {
                super(2, continuation);
                this.f7904r = str;
                this.f7903o = w6Var;
                this.f7899Z = i28;
                this.f7898S = i282;
                this.f7901g = function0;
                this.E2 = function02;
                this.f7900e = w6Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f7904r, this.f7903o, this.f7899Z, this.f7898S, this.f7901g, this.E2, this.f7900e, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
            
                if (r9 == r0) goto L43;
             */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                x0X.n nVar;
                Function0 function0;
                Function0 function02;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.J2;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                function02 = (Function0) this.f7897O;
                                function0 = (Function0) this.f7905t;
                                ResultKt.throwOnFailure(obj);
                                function0.invoke();
                                function02.invoke();
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            nVar = (x0X.n) obj;
                            w6 w6Var = this.f7903o;
                            JK.w6 w6Var2 = this.f7900e;
                            Function0 function03 = this.E2;
                            Function0 function04 = this.f7901g;
                            if (!(nVar instanceof n.C1266n)) {
                                if (nVar instanceof n.w6) {
                                    if (((Boolean) ((n.w6) nVar).n()).booleanValue()) {
                                        Xo xo = w6Var.rl;
                                        this.f7902n = nVar;
                                        this.f7905t = function03;
                                        this.f7897O = function04;
                                        this.J2 = 3;
                                        if (xo.O(w6Var2, 604800000L, this) != coroutine_suspended) {
                                            function0 = function03;
                                            function02 = function04;
                                            function0.invoke();
                                            function02.invoke();
                                        }
                                        return coroutine_suspended;
                                    }
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        x0X.n nVar2 = (x0X.n) obj;
                        Function0 function05 = this.E2;
                        Function0 function06 = this.f7901g;
                        if (!(nVar2 instanceof n.C1266n)) {
                            if (nVar2 instanceof n.w6) {
                                if (((Boolean) ((n.w6) nVar2).n()).booleanValue()) {
                                    function05.invoke();
                                    function06.invoke();
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    String str = this.f7904r;
                    int iHashCode = str.hashCode();
                    if (iHashCode != -2113165152) {
                        if (iHashCode != 268049718) {
                            if (iHashCode == 545146259 && str.equals("watch_ad")) {
                                InterfaceC2210n interfaceC2210n = this.f7903o.f7887n;
                                Eu.I28 i28 = this.f7898S;
                                this.J2 = 2;
                                obj = Eu.Wre.n(interfaceC2210n, i28, this);
                                if (obj != coroutine_suspended) {
                                    nVar = (x0X.n) obj;
                                    w6 w6Var3 = this.f7903o;
                                    JK.w6 w6Var22 = this.f7900e;
                                    Function0 function032 = this.E2;
                                    Function0 function042 = this.f7901g;
                                    if (!(nVar instanceof n.C1266n)) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                        } else if (str.equals("get_all_pro_features")) {
                            InterfaceC2210n interfaceC2210n2 = this.f7903o.f7887n;
                            Eu.I28 i282 = this.f7899Z;
                            this.J2 = 1;
                            obj = Eu.Wre.n(interfaceC2210n2, i282, this);
                        }
                    } else if (str.equals("try_it_first")) {
                        this.f7901g.invoke();
                        this.E2.invoke();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        n(List list, List list2, ComponentActivity componentActivity, w6 w6Var, Eu.I28 i28, Function0 function0, Function0 function02, Eu.I28 i282, JK.w6 w6Var2) {
            this.f7893n = list;
            this.f7896t = list2;
            this.f7889O = componentActivity;
            this.J2 = w6Var;
            this.f7895r = i28;
            this.f7894o = function0;
            this.f7891Z = function02;
            this.f7890S = i282;
            this.f7892g = w6Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(ComponentActivity componentActivity, w6 w6Var, Eu.I28 i28, Eu.I28 i282, Function0 function0, Function0 function02, JK.w6 w6Var2, String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new j(id, w6Var, i28, i282, function0, function02, w6Var2, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(Function0 function0, OnBackPressedCallback BackPressHandler) {
            Intrinsics.checkNotNullParameter(BackPressHandler, "$this$BackPressHandler");
            function0.invoke();
            return Unit.INSTANCE;
        }

        public final void O(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1875563370, i2, -1, "com.alightcreative.ads.ProFeaturePopup.show.<anonymous> (ProFeaturePopup.kt:49)");
            }
            List list = this.f7893n;
            List list2 = this.f7896t;
            composer.eF(2097962256);
            boolean zE2 = composer.E2(this.f7889O) | composer.E2(this.J2) | composer.p5(this.f7895r) | composer.p5(this.f7894o) | composer.p5(this.f7891Z) | composer.p5(this.f7890S) | composer.p5(this.f7892g);
            final ComponentActivity componentActivity = this.f7889O;
            final w6 w6Var = this.J2;
            final Eu.I28 i28 = this.f7895r;
            final Eu.I28 i282 = this.f7890S;
            final Function0 function0 = this.f7891Z;
            final Function0 function02 = this.f7894o;
            final JK.w6 w6Var2 = this.f7892g;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                Function1 function1 = new Function1() { // from class: Q.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w6.n.J2(componentActivity, w6Var, i28, i282, function0, function02, w6Var2, (String) obj);
                    }
                };
                composer.o(function1);
                objIF = function1;
            }
            Function1 function12 = (Function1) objIF;
            composer.Xw();
            composer.eF(2098006383);
            boolean zP5 = composer.p5(this.f7891Z);
            final Function0 function03 = this.f7891Z;
            Object objIF2 = composer.iF();
            if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: Q.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w6.n.Uo(function03);
                    }
                };
                composer.o(objIF2);
            }
            Function0 function04 = (Function0) objIF2;
            composer.Xw();
            composer.eF(2098008072);
            boolean zE22 = composer.E2(this.J2);
            final w6 w6Var3 = this.J2;
            Object objIF3 = composer.iF();
            if (zE22 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function1() { // from class: Q.Wre
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w6.n.KN(w6Var3, ((Integer) obj).intValue());
                    }
                };
                composer.o(objIF3);
            }
            composer.Xw();
            AbstractC1329m.xMQ(true, list, list2, function12, function04, (Function1) objIF3, composer, 6);
            composer.eF(2098010735);
            boolean zP52 = composer.p5(this.f7891Z);
            final Function0 function05 = this.f7891Z;
            Object objIF4 = composer.iF();
            if (zP52 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Function1() { // from class: Q.CN3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w6.n.xMQ(function05, (OnBackPressedCallback) obj);
                    }
                };
                composer.o(objIF4);
            }
            composer.Xw();
            N.I28.O(null, (Function1) objIF4, composer, 0, 1);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            O((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x0X.n KN(w6 w6Var, int i2) {
            return w6Var.f7888t.rl(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public w6(InterfaceC2210n injet, Xo rewardedAdUnlockUseCase, WK.n getUriFromResource) {
        Intrinsics.checkNotNullParameter(injet, "injet");
        Intrinsics.checkNotNullParameter(rewardedAdUnlockUseCase, "rewardedAdUnlockUseCase");
        Intrinsics.checkNotNullParameter(getUriFromResource, "getUriFromResource");
        this.f7887n = injet;
        this.rl = rewardedAdUnlockUseCase;
        this.f7888t = getUriFromResource;
    }

    private final List J2(Context context) {
        n.C0236n c0236n = new n.C0236n(2131231332);
        String string = context.getString(2132019631);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        n.w6 w6Var = new n.w6(string);
        String string2 = context.getString(2132019630);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return CollectionsKt.listOf((Object[]) new NBO.n[]{c0236n, w6Var, new n.j(string2)});
    }

    private final List O(Context context) {
        String string = context.getString(2132019628);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        j.C0235j c0235j = new j.C0235j("get_all_pro_features", string, Dj7.CN3.f1597n);
        String string2 = context.getString(2132017217);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        j.C0235j c0235j2 = new j.C0235j("watch_ad", string2, Dj7.CN3.f1600t);
        String string3 = context.getString(2132020358);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return CollectionsKt.listOf((Object[]) new j.C0235j[]{c0235j, c0235j2, new j.C0235j("try_it_first", string3, Dj7.CN3.f1593O)});
    }

    public final void Uo(ComponentActivity activity, JK.w6 proFeature, Eu.I28 unlockAllButtonTrigger, Eu.I28 watchAdButtonTrigger, Function0 onUnlock) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(proFeature, "proFeature");
        Intrinsics.checkNotNullParameter(unlockAllButtonTrigger, "unlockAllButtonTrigger");
        Intrinsics.checkNotNullParameter(watchAdButtonTrigger, "watchAdButtonTrigger");
        Intrinsics.checkNotNullParameter(onUnlock, "onUnlock");
        List listJ2 = J2(activity);
        List listO = O(activity);
        final ComposeView composeView = new ComposeView(activity, null, 0, 6, null);
        activity.addContentView(composeView, new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(ComposableLambdaKt.rl(1875563370, true, new n(listJ2, listO, activity, this, unlockAllButtonTrigger, onUnlock, new Function0() { // from class: Q.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.KN(composeView);
            }
        }, watchAdButtonTrigger, proFeature)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(ComposeView composeView) {
        ViewParent parent = composeView.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(composeView);
        return Unit.INSTANCE;
    }
}
