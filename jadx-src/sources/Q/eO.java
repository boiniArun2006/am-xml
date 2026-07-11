package Q;

import JK.w6;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class eO implements Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JK.j f7873n;
    private final kgE.fuX rl;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7875n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7876t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7876t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return eO.this.n(this);
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7878n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7879t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7879t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return eO.this.O(null, 0L, this);
        }
    }

    public eO(JK.j rewardedUnlockRepository, kgE.fuX iapManager) {
        Intrinsics.checkNotNullParameter(rewardedUnlockRepository, "rewardedUnlockRepository");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f7873n = rewardedUnlockRepository;
        this.rl = iapManager;
    }

    @Override // Q.Xo
    public boolean J2(String projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        return com.alightcreative.app.motion.persist.j.INSTANCE.getUnlockedFeatures().contains(new w6.n(projectId).nr());
    }

    @Override // Q.Xo
    public boolean KN(String projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        return com.alightcreative.app.motion.persist.j.INSTANCE.getUnlockedFeatures().contains(new w6.j(projectId).nr());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Q.Xo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(JK.w6 w6Var, long j2, Continuation continuation) {
        n nVar;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f7879t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!w6Var.t()) {
                JK.j jVar = this.f7873n;
                long jAz = this.rl.az() + j2;
                nVar.f7878n = w6Var;
                nVar.J2 = 1;
                if (jVar.n(w6Var, jAz, nVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        w6Var = (JK.w6) nVar.f7878n;
        ResultKt.throwOnFailure(obj);
        com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
        jVar2.setUnlockedFeatures(SetsKt.plus(jVar2.getUnlockedFeatures(), w6Var.nr()));
        return Unit.INSTANCE;
    }

    @Override // Q.Xo
    public boolean Uo(String projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        return com.alightcreative.app.motion.persist.j.INSTANCE.getUnlockedFeatures().contains(new w6.I28(projectId).nr());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Q.Xo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        j jVar;
        com.alightcreative.app.motion.persist.j jVar2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f7876t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            com.alightcreative.app.motion.persist.j jVar3 = com.alightcreative.app.motion.persist.j.INSTANCE;
            JK.j jVar4 = this.f7873n;
            jVar.f7875n = jVar3;
            jVar.J2 = 1;
            Object objRl = jVar4.rl(jVar);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar2 = jVar3;
            obj = objRl;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar2 = (com.alightcreative.app.motion.persist.j) jVar.f7875n;
            ResultKt.throwOnFailure(obj);
        }
        jVar2.setUnlockedFeatures((Set) obj);
        return Unit.INSTANCE;
    }

    @Override // Q.Xo
    public boolean nr(String projectId, String effectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(effectId, "effectId");
        return com.alightcreative.app.motion.persist.j.INSTANCE.getUnlockedFeatures().contains(new w6.Ml(projectId, effectId).nr());
    }

    @Override // Q.Xo
    public boolean rl(JK.w6 unlockFeature) {
        Intrinsics.checkNotNullParameter(unlockFeature, "unlockFeature");
        if (unlockFeature.t()) {
            return false;
        }
        return com.alightcreative.app.motion.persist.j.INSTANCE.getUnlockedFeatures().contains(unlockFeature.nr());
    }

    @Override // Q.Xo
    public boolean t(String projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        return com.alightcreative.app.motion.persist.j.INSTANCE.getUnlockedFeatures().contains(new w6.C0153w6(projectId).nr());
    }
}
