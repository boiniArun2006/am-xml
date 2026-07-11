package DTN;

import GJW.AbstractC1363t;
import GJW.OU;
import GJW.vd;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.security.ProviderInstaller;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Dsr {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f1465O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f1466n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f1467t;

        /* JADX INFO: renamed from: DTN.Dsr$j$j, reason: collision with other inner class name */
        public static final class C0056j implements ProviderInstaller.ProviderInstallListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Continuation f1468n;

            C0056j(Continuation continuation) {
                this.f1468n = continuation;
            }

            @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
            public void onProviderInstallFailed(int i2, Intent intent) {
                if (AbstractC1363t.ck(this.f1468n.get$context())) {
                    boolean zIsUserResolvableError = GoogleApiAvailability.getInstance().isUserResolvableError(i2);
                    Continuation continuation = this.f1468n;
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m313constructorimpl(new n.C1266n(new DTN.j(i2, zIsUserResolvableError))));
                }
            }

            @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
            public void onProviderInstalled() {
                Continuation continuation = this.f1468n;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m313constructorimpl(new n.w6(Unit.INSTANCE)));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Context context, Continuation continuation) {
            super(2, continuation);
            this.f1465O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f1465O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1467t;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Context context = this.f1465O;
            this.f1466n = context;
            this.f1467t = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            ProviderInstaller.installIfNeededAsync(context, new C0056j(safeContinuation));
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
            return orThrow;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object rl(Context context, Continuation continuation) {
        return GJW.Dsr.Uo(OU.t(), new j(context, null), continuation);
    }
}
