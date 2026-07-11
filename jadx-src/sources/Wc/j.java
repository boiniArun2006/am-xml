package Wc;

import DSG.Wre;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bH.CN3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import pFG.afx;
import qu.Dsr;
import wV.Ml;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: Wc.j$j, reason: collision with other inner class name */
    static final class C0418j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ xWk.j f11542n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ S3.w6 f11543t;

        C0418j(xWk.j jVar, S3.w6 w6Var) {
            this.f11542n = jVar;
            this.f11543t = w6Var;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((Function1) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Function1 it, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1122984648, i2, -1, "com.bendingspoons.experiments.secretmenu.registerExperimentsItems.<anonymous> (ExperimentsSecretMenuItemsProvider.kt:31)");
            }
            afx.ck(this.f11542n, this.f11543t, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f11544O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11545n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Dsr f11546t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Dsr dsr, Context context, Continuation continuation) {
            super(1, continuation);
            this.f11546t = dsr;
            this.f11544O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new n(this.f11546t, this.f11544O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f11545n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Dsr dsr = this.f11546t;
                this.f11545n = 1;
                obj = wV.j.n(dsr, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            if (nVar instanceof n.w6) {
                Toast.makeText(this.f11544O, "User excluded from segmentation! Restart your app please.", 0).show();
                return Wre.j.EnumC0054j.f1446O;
            }
            Context context = this.f11544O;
            Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type com.bendingspoons.core.functional.Either.Error<com.bendingspoons.networking.NetworkError<com.bendingspoons.oracle.models.ErrorResponse>>");
            Toast.makeText(context, "Error: " + Reflection.getOrCreateKotlinClass(((n.C1266n) nVar).n().getClass()).getSimpleName(), 0).show();
            return Wre.j.EnumC0054j.f1447n;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f11547O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11548n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Dsr f11549t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(Dsr dsr, Context context, Continuation continuation) {
            super(1, continuation);
            this.f11549t = dsr;
            this.f11547O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new w6(this.f11549t, this.f11547O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f11548n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Dsr dsr = this.f11549t;
                this.f11548n = 1;
                obj = Ml.n(dsr, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            if (nVar instanceof n.w6) {
                Toast.makeText(this.f11547O, "User can now be segmented! Restart your app please.", 0).show();
                return Wre.j.EnumC0054j.f1446O;
            }
            Context context = this.f11547O;
            Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type com.bendingspoons.core.functional.Either.Error<com.bendingspoons.networking.NetworkError<com.bendingspoons.oracle.models.ErrorResponse>>");
            Toast.makeText(context, "Error: " + Reflection.getOrCreateKotlinClass(((n.C1266n) nVar).n().getClass()).getSimpleName(), 0).show();
            return Wre.j.EnumC0054j.f1447n;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void n(CN3 cn3, Context context, Dsr oracleService, xWk.j experimentsUseCase, S3.w6 favouriteExperimentRepository) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(oracleService, "oracleService");
        Intrinsics.checkNotNullParameter(experimentsUseCase, "experimentsUseCase");
        Intrinsics.checkNotNullParameter(favouriteExperimentRepository, "favouriteExperimentRepository");
        if (oracleService.getConfig().KN().t()) {
            cn3.n(CN3.I28.f43224n, new Wre.Ml("Oracle: experiments", "🧪", null, CollectionsKt.listOf((Object[]) new Wre[]{new Wre.w6("Set experiments", "🔬", null, ComposableLambdaKt.rl(1122984648, true, new C0418j(experimentsUseCase, favouriteExperimentRepository)), 4, null), new Wre.j("Exclude from experiments segmentation", "🧪", null, new n(oracleService, context, null), 4, null), new Wre.j("Reset experiments segmentation", "🧪", null, new w6(oracleService, context, null), 4, null)}), 4, null));
        }
    }
}
