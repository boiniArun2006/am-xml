package com.alightcreative.app.motion.activities.creatorprogram.rewardlist;

import GJW.C;
import GJW.vd;
import QmE.iF;
import QmE.j;
import TFv.fuX;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import cg.o;
import com.alightcreative.app.motion.activities.creatorprogram.rewardlist.Ml;
import com.alightcreative.app.motion.activities.creatorprogram.rewardlist.Wre;
import java.util.List;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/alightcreative/app/motion/activities/creatorprogram/rewardlist/I28;", "LuW/n;", "Lcom/alightcreative/app/motion/activities/creatorprogram/rewardlist/Wre;", "Lcom/alightcreative/app/motion/activities/creatorprogram/rewardlist/Ml;", "LW/n;", "getRewardListUseCase", "LW/j;", "getCreatorProgramDataUseCase", "LQmE/iF;", "eventLogger", "<init>", "(LW/n;LW/j;LQmE/iF;)V", "", "Uo", "()V", "Lcg/o$C;", "rewardType", "Ik", "(Lcg/o$C;)V", "ck", "LW/n;", "KN", "LW/j;", "xMQ", "LQmE/iF;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class I28 extends uW.n {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final W.j getCreatorProgramDataUseCase;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final W.n getRewardListUseCase;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final iF eventLogger;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f45017O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f45018n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f45019t;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return I28.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            I28 i28;
            long jUo;
            I28 i282;
            long j2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f45017O;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        j2 = this.f45019t;
                        i282 = (I28) this.f45018n;
                        ResultKt.throwOnFailure(obj);
                        i282.mUb(new Wre.j(j2, (List) obj));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i28 = (I28) this.f45018n;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                I28 i283 = I28.this;
                TFv.Wre wreT = i283.getCreatorProgramDataUseCase.t();
                this.f45018n = i283;
                this.f45017O = 1;
                Object objG = fuX.g(wreT, this);
                if (objG != coroutine_suspended) {
                    i28 = i283;
                    obj = objG;
                }
                return coroutine_suspended;
            }
            cg.Wre wre = (cg.Wre) obj;
            if (wre != null) {
                jUo = wre.Uo();
            } else {
                jUo = 0;
            }
            W.n nVar = I28.this.getRewardListUseCase;
            this.f45018n = i28;
            this.f45019t = jUo;
            this.f45017O = 2;
            obj = nVar.rl(this);
            if (obj != coroutine_suspended) {
                i282 = i28;
                j2 = jUo;
                i282.mUb(new Wre.j(j2, (List) obj));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    public I28(W.n getRewardListUseCase, W.j getCreatorProgramDataUseCase, iF eventLogger) {
        Intrinsics.checkNotNullParameter(getRewardListUseCase, "getRewardListUseCase");
        Intrinsics.checkNotNullParameter(getCreatorProgramDataUseCase, "getCreatorProgramDataUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.getRewardListUseCase = getRewardListUseCase;
        this.getCreatorProgramDataUseCase = getCreatorProgramDataUseCase;
        this.eventLogger = eventLogger;
    }

    public final void Ik(o.C rewardType) {
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        this.eventLogger.n(new j.ci(rewardType));
        xMQ(new Ml.n(rewardType));
    }

    public final void ck() {
        xMQ(Ml.j.f45020n);
    }

    @Override // uW.w6
    public void Uo() {
        C.nr(ViewModelKt.n(this), null, null, new j(null), 3, null);
    }
}
