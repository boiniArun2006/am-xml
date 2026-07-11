package k9D;

import GJW.C;
import GJW.vd;
import GJW.xuv;
import Jfs.CN3;
import QmE.iF;
import QmE.j;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import k9D.Wre;
import k9D.j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000eJ\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0015J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u000eJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lk9D/n;", "LuW/n;", "Lk9D/Wre;", "Lk9D/j;", "LrO/j;", "acceptCreatorProgramUseCase", "LJfs/CN3;", "setCreatorRankingDataUseCase", "LQmE/iF;", "eventLogger", "<init>", "(LrO/j;LJfs/CN3;LQmE/iF;)V", "", "Uo", "()V", "Ik", "g", "te", "iF", "LGJW/xuv;", "o", "()LGJW/xuv;", "XQ", "Z", "S", "WPU", "aYN", "nY", "ViF", "r", "LrO/j;", "KN", "LJfs/CN3;", "xMQ", "LQmE/iF;", "mUb", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends uW.n {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final CN3 setCreatorRankingDataUseCase;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final rO.j acceptCreatorProgramUseCase;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final iF eventLogger;

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69668n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69668n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                n.this.eventLogger.n(j.FP.f8392n);
                n.this.mUb(new Wre.w6(true));
                CN3 cn3 = n.this.setCreatorRankingDataUseCase;
                this.f69668n = 1;
                if (cn3.xMQ(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            n.this.mUb(new Wre.w6(false));
            n.this.xMQ(j.C1005j.f69665n);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: k9D.n$n, reason: collision with other inner class name */
    static final class C1006n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69670n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C1006n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        C1006n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new C1006n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69670n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                rO.j jVar = n.this.acceptCreatorProgramUseCase;
                this.f69670n = 1;
                if (jVar.rl(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            n.this.eventLogger.n(j.Ew.f8390n);
            n.this.xMQ(j.C1005j.f69665n);
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69672n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f69672n == 0) {
                ResultKt.throwOnFailure(obj);
                n.this.eventLogger.n(j.g.f8506n);
                n.this.xMQ(j.C1005j.f69665n);
                n.this.xMQ(j.n.f69666n);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public n(rO.j acceptCreatorProgramUseCase, CN3 setCreatorRankingDataUseCase, iF eventLogger) {
        Intrinsics.checkNotNullParameter(acceptCreatorProgramUseCase, "acceptCreatorProgramUseCase");
        Intrinsics.checkNotNullParameter(setCreatorRankingDataUseCase, "setCreatorRankingDataUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.acceptCreatorProgramUseCase = acceptCreatorProgramUseCase;
        this.setCreatorRankingDataUseCase = setCreatorRankingDataUseCase;
        this.eventLogger = eventLogger;
    }

    public final void Ik() {
        mUb(Wre.Ml.f69661n);
    }

    @Override // uW.w6
    public void Uo() {
        mUb(Wre.Ml.f69661n);
    }

    public final void ViF() {
        xMQ(new j.w6("https://www.alightcreative.com/ranking_program_pp.pdf"));
    }

    public final void XQ() {
        xMQ(new j.w6("https://www.alightcreative.com/creator_program_tos.pdf"));
    }

    public final void Z() {
        xMQ(new j.w6("https://www.alightcreative.com/creator_program_pp.pdf"));
    }

    public final void aYN() {
        xMQ(j.C1005j.f69665n);
    }

    public final void g() {
        mUb(Wre.j.f69662n);
    }

    public final void iF() {
        mUb(new Wre.w6(false, 1, null));
    }

    public final void nY() {
        xMQ(new j.w6("https://www.alightcreative.com/ranking_program_tos.pdf"));
    }

    public final void r() {
        xMQ(j.C1005j.f69665n);
    }

    public final void te() {
        mUb(Wre.n.f69663n);
    }

    public final xuv S() {
        return C.nr(ViewModelKt.n(this), null, null, new w6(null), 3, null);
    }

    public final xuv WPU() {
        return C.nr(ViewModelKt.n(this), null, null, new Ml(null), 3, null);
    }

    public final xuv o() {
        return C.nr(ViewModelKt.n(this), null, null, new C1006n(null), 3, null);
    }
}
