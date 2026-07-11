package KfI;

import GJW.Lu;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f5732t = new n(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.firebase.Wre f5733n;
    private final pu.Dsr rl;

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ u J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f5734O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5735n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(CoroutineContext coroutineContext, u uVar, Continuation continuation) {
            super(2, continuation);
            this.f5734O = coroutineContext;
            this.J2 = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new j(this.f5734O, this.J2, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r6.J2(r5) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5735n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        if (!o.this.rl.t()) {
                            Log.d(FirebaseSessionsRegistrar.TAG, "Sessions SDK disabled. Not listening to lifecycle events.");
                        } else {
                            nKK nkk = new nKK(this.f5734O);
                            nkk.xMQ(this.J2);
                            lej.f5717n.n(nkk);
                            o.this.f5733n.KN(new com.google.firebase.CN3() { // from class: KfI.C
                            });
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                XE.j jVar = XE.j.f11798n;
                this.f5735n = 1;
                obj = jVar.t(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Collection collectionValues = ((Map) obj).values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((XE.n) it.next()).n()) {
                        pu.Dsr dsr = o.this.rl;
                        this.f5735n = 2;
                    }
                }
            }
            Log.d(FirebaseSessionsRegistrar.TAG, "No Sessions subscribers. Not listening to lifecycle events.");
            return Unit.INSTANCE;
        }
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    public o(com.google.firebase.Wre firebaseApp, pu.Dsr settings, CoroutineContext backgroundDispatcher, u lifecycleServiceBinder) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.f5733n = firebaseApp;
        this.rl = settings;
        Log.d(FirebaseSessionsRegistrar.TAG, "Initializing Firebase Sessions SDK.");
        Context applicationContext = firebaseApp.qie().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(lej.f5717n);
            GJW.C.nr(Lu.n(backgroundDispatcher), null, null, new j(backgroundDispatcher, lifecycleServiceBinder, null), 3, null);
            return;
        }
        Log.e(FirebaseSessionsRegistrar.TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
