package androidx.compose.ui;

import GJW.AbstractC1363t;
import GJW.vd;
import GJW.xuv;
import androidx.compose.animation.core.fuX;
import androidx.compose.ui.SessionMutex;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LGJW/vd;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", i = {0, 1}, l = {61, 63}, m = "invokeSuspend", n = {"newSession", "newSession"}, s = {"L$0", "L$0"})
final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements Function2<vd, Continuation<Object>, Object> {
    final /* synthetic */ AtomicReference J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function1 f31101O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f31102n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function2 f31103r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f31104t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionMutex$withSessionCancellingPrevious$2(Function1 function1, AtomicReference atomicReference, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f31101O = function1;
        this.J2 = atomicReference;
        this.f31103r = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.f31101O, this.J2, this.f31103r, continuation);
        sessionMutex$withSessionCancellingPrevious$2.f31104t = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<Object> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SessionMutex.Session session;
        xuv job;
        SessionMutex.Session session2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f31102n;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        session2 = (SessionMutex.Session) this.f31104t;
                        try {
                            ResultKt.throwOnFailure(obj);
                            fuX.n(this.J2, session2, null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            fuX.n(this.J2, session2, null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                session = (SessionMutex.Session) this.f31104t;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f31104t;
                session = new SessionMutex.Session(AbstractC1363t.az(vdVar.getCoroutineContext()), this.f31101O.invoke(vdVar));
                SessionMutex.Session session3 = (SessionMutex.Session) this.J2.getAndSet(session);
                if (session3 != null && (job = session3.getJob()) != null) {
                    this.f31104t = session;
                    this.f31102n = 1;
                    if (AbstractC1363t.Uo(job, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            }
            Function2 function2 = this.f31103r;
            Object value = session.getValue();
            this.f31104t = session;
            this.f31102n = 2;
            obj = function2.invoke(value, this);
            if (obj != coroutine_suspended) {
                session2 = session;
                fuX.n(this.J2, session2, null);
                return obj;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            session2 = session;
            fuX.n(this.J2, session2, null);
            throw th;
        }
    }
}
