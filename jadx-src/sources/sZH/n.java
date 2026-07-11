package sZH;

import DSG.Wre;
import GJW.C;
import GJW.vd;
import android.app.ActivityManager;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.material3.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.view.compose.FlowExtKt;
import bH.CN3;
import com.bendingspoons.secretmenu.ui.items.exit.ExitActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sZH.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class n {

    static final class I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73265n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f73266t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(Context context, Continuation continuation) {
            super(1, continuation);
            this.f73266t = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new I28(this.f73266t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f73265n == 0) {
                ResultKt.throwOnFailure(obj);
                YgZ.w6 w6Var = YgZ.w6.f12217n;
                String str = w6Var.t(this.f73266t) + " (" + w6Var.rl(this.f73266t) + ")";
                YgZ.w6.O(w6Var, this.f73266t, null, str, 2, null);
                Toast.makeText(this.f73266t, str, 1).show();
                return Wre.j.EnumC0054j.f1447n;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73267n;

        Ml(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f73267n == 0) {
                ResultKt.throwOnFailure(obj);
                return Wre.j.EnumC0054j.f1446O;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Wre extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73268n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f73269t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(Context context, Continuation continuation) {
            super(1, continuation);
            this.f73269t = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Wre(this.f73269t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f73268n == 0) {
                ResultKt.throwOnFailure(obj);
                YgZ.w6 w6Var = YgZ.w6.f12217n;
                String str = w6Var.J2() + " " + w6Var.Uo() + " Android API " + w6Var.xMQ();
                YgZ.w6.O(w6Var, this.f73269t, null, str, 2, null);
                Toast.makeText(this.f73269t, str, 1).show();
                return Wre.j.EnumC0054j.f1447n;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Wre) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ DSG.Ml f73270n;

        /* JADX INFO: renamed from: sZH.n$j$j, reason: collision with other inner class name */
        static final class C1171j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ boolean f73271O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f73272n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ DSG.Ml f73273t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1171j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1171j(DSG.Ml ml, boolean z2, Continuation continuation) {
                super(2, continuation);
                this.f73273t = ml;
                this.f73271O = z2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1171j(this.f73273t, this.f73271O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f73272n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    DSG.Ml ml = this.f73273t;
                    boolean z2 = this.f73271O;
                    this.f73272n = 1;
                    if (ml.rl(z2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        j(DSG.Ml ml) {
            this.f73270n = ml;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(vd vdVar, DSG.Ml ml, boolean z2) {
            C.nr(vdVar, null, null, new C1171j(ml, z2, null), 3, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1208819607, i2, -1, "com.bendingspoons.secretmenu.ui.items.registerBasicItems.<anonymous> (BasicSecretMenuItemsProvider.kt:29)");
            }
            State stateRl = FlowExtKt.rl(this.f73270n.n(), Boolean.FALSE, null, null, null, composer, 48, 14);
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer));
                composer.o(compositionScopedCoroutineScopeCanceller);
                objIF = compositionScopedCoroutineScopeCanceller;
            }
            final vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
            boolean zT2 = t(stateRl);
            composer.eF(716630498);
            boolean zE2 = composer.E2(coroutineScope) | composer.E2(this.f73270n);
            final DSG.Ml ml = this.f73270n;
            Object objIF2 = composer.iF();
            if (zE2 || objIF2 == companion.n()) {
                objIF2 = new Function1() { // from class: sZH.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n.j.nr(coroutineScope, ml, ((Boolean) obj).booleanValue());
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            SwitchKt.n(zT2, (Function1) objIF2, null, null, false, null, null, composer, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        private static final boolean t(State state) {
            return ((Boolean) state.getValue()).booleanValue();
        }
    }

    /* JADX INFO: renamed from: sZH.n$n, reason: collision with other inner class name */
    static final class C1172n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73274n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f73275t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1172n(Context context, Continuation continuation) {
            super(1, continuation);
            this.f73275t = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new C1172n(this.f73275t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f73274n == 0) {
                ResultKt.throwOnFailure(obj);
                Object systemService = this.f73275t.getSystemService("activity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                ((ActivityManager) systemService).clearApplicationUserData();
                return Wre.j.EnumC0054j.f1447n;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C1172n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73276n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f73277t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(Context context, Continuation continuation) {
            super(1, continuation);
            this.f73277t = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new w6(this.f73277t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f73276n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ExitActivity.INSTANCE.n(this.f73277t);
            Intrinsics.checkNotNull(null);
            Intrinsics.checkNotNullExpressionValue(Locale.getDefault(), "getDefault(...)");
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void n(CN3 cn3, Context context, DSG.Ml secretMenuFloatingButtonRepository) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(secretMenuFloatingButtonRepository, "secretMenuFloatingButtonRepository");
        cn3.t(CN3.I28.f43224n, CollectionsKt.listOf((Object[]) new DSG.Wre[]{new Wre.n("Pin Secret Menu", "📌", null, ComposableLambdaKt.rl(-1208819607, true, new j(secretMenuFloatingButtonRepository)), 4, null), new Wre.j("Clear app", "💥", null, new C1172n(context, null), 4, null), new Wre.j("Crash app", "🎆", null, new w6(context, null), 4, null), new Wre.j("Quit app", "❌", null, new Ml(null), 4, null)}));
        CN3.I28 i28 = CN3.I28.f43225t;
        String string = context.getString(bH.I28.f43235n);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Wre.j jVar = new Wre.j(string, "📱", null, new I28(context, null), 4, null);
        String string2 = context.getString(bH.I28.rl);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        cn3.t(i28, CollectionsKt.listOf((Object[]) new Wre.j[]{jVar, new Wre.j(string2, "📱", null, new Wre(context, null), 4, null)}));
    }
}
