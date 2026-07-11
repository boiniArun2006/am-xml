package JK;

import GJW.Dsr;
import GJW.OU;
import GJW.vd;
import java.util.ArrayList;
import java.util.Iterator;
import kgE.fuX;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements JK.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f2.j f4448n;
    private final fuX rl;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4450n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f4451t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4451t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.rl(this);
        }
    }

    /* JADX INFO: renamed from: JK.n$n, reason: collision with other inner class name */
    static final class C0152n extends SuspendLambda implements Function2 {
        final /* synthetic */ long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ w6 f4452O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4453n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C0152n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0152n(w6 w6Var, long j2, Continuation continuation) {
            super(2, continuation);
            this.f4452O = w6Var;
            this.J2 = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new C0152n(this.f4452O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4453n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                f2.j jVar = n.this.f4448n;
                Ml mlN = I28.n(this.f4452O, this.J2);
                this.f4453n = 1;
                if (jVar.t(mlN, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public n(f2.j unlockFeatureDao, fuX iapManager) {
        Intrinsics.checkNotNullParameter(unlockFeatureDao, "unlockFeatureDao");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f4448n = unlockFeatureDao;
        this.rl = iapManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // JK.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Continuation continuation) {
        j jVar;
        n nVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objRl = jVar.f4451t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            f2.j jVar2 = this.f4448n;
            long jAz = this.rl.az();
            jVar.f4450n = this;
            jVar.J2 = 1;
            if (jVar2.n(jAz, jVar) != coroutine_suspended) {
                nVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRl);
            Iterable iterable = (Iterable) objRl;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(I28.rl((Ml) it.next()));
            }
            return CollectionsKt.toSet(arrayList);
        }
        nVar = (n) jVar.f4450n;
        ResultKt.throwOnFailure(objRl);
        f2.j jVar3 = nVar.f4448n;
        jVar.f4450n = null;
        jVar.J2 = 2;
        objRl = jVar3.rl(jVar);
    }

    @Override // JK.j
    public Object n(w6 w6Var, long j2, Continuation continuation) {
        if (w6Var.t()) {
            return Unit.INSTANCE;
        }
        Object objUo = Dsr.Uo(OU.rl(), new C0152n(w6Var, j2, null), continuation);
        if (objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objUo;
        }
        return Unit.INSTANCE;
    }
}
