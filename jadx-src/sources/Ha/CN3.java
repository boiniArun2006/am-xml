package Ha;

import DSG.Wre;
import android.content.Context;
import bH.CN3;
import com.applovin.sdk.AppLovinSdk;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class CN3 {

    static final class j extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3915n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f3916t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Context context, Continuation continuation) {
            super(1, continuation);
            this.f3916t = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new j(this.f3916t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3915n == 0) {
                ResultKt.throwOnFailure(obj);
                AppLovinSdk.getInstance(this.f3916t).showMediationDebugger();
                return Wre.j.EnumC0054j.f1447n;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void n(bH.CN3 cn3, Context context) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        cn3.n(CN3.I28.f43224n, new Wre.j("AppLovin MAX mediation debugger", "🦥", null, new j(context, null), 4, null));
    }
}
