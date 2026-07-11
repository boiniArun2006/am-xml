package Fl;

import Fl.CN3;
import Fl.s4;
import GJW.vd;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import w.InterfaceC2413n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"LFl/z;", "LuW/n;", "LFl/s4;", "LFl/CN3;", "Lvjm/j;", "getPPTOSTypeUseCase", "Lvjm/n;", "recordAgreedPPTOSVersionUseCase", "Lw/n;", "getMonorepoLibUseCase", "<init>", "(Lvjm/j;Lvjm/n;Lw/n;)V", "", "Ik", "()V", "Uo", "r", "Landroid/content/Context;", "context", "", "url", "o", "(Landroid/content/Context;Ljava/lang/String;)V", "Lvjm/j;", "KN", "Lvjm/n;", "xMQ", "Lw/n;", "mUb", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z extends uW.n {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final vjm.n recordAgreedPPTOSVersionUseCase;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final vjm.j getPPTOSTypeUseCase;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final InterfaceC2413n getMonorepoLibUseCase;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3118n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return z.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3118n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vjm.j jVar = z.this.getPPTOSTypeUseCase;
                this.f3118n = 1;
                obj = jVar.n(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            z.this.mUb(new s4.j((eO) obj));
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3120n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return z.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3120n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                K0.n nVarN = z.this.getMonorepoLibUseCase.n();
                if (nVarN != null) {
                    this.f3120n = 1;
                    obj = nVarN.t(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                z.this.Ik();
                return Unit.INSTANCE;
            }
            z.this.Ik();
            return Unit.INSTANCE;
        }
    }

    @Override // uW.w6
    public void Uo() {
    }

    public z(vjm.j getPPTOSTypeUseCase, vjm.n recordAgreedPPTOSVersionUseCase, InterfaceC2413n getMonorepoLibUseCase) {
        Intrinsics.checkNotNullParameter(getPPTOSTypeUseCase, "getPPTOSTypeUseCase");
        Intrinsics.checkNotNullParameter(recordAgreedPPTOSVersionUseCase, "recordAgreedPPTOSVersionUseCase");
        Intrinsics.checkNotNullParameter(getMonorepoLibUseCase, "getMonorepoLibUseCase");
        this.getPPTOSTypeUseCase = getPPTOSTypeUseCase;
        this.recordAgreedPPTOSVersionUseCase = recordAgreedPPTOSVersionUseCase;
        this.getMonorepoLibUseCase = getMonorepoLibUseCase;
        GJW.C.nr(ViewModelKt.n(this), null, null, new j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ik() {
        this.recordAgreedPPTOSVersionUseCase.n(4);
        xMQ(CN3.j.f3067n);
    }

    public final void o(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        YgZ.Ml.rl(YgZ.Ml.f12213n, context, url, null, 4, null);
    }

    public final void r() {
        GJW.C.nr(ViewModelKt.n(this), null, null, new w6(null), 3, null);
    }
}
