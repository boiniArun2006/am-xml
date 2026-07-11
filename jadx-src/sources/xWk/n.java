package xWk;

import com.bendingspoons.experiments.network.OracleExperiment;
import com.bendingspoons.oracle.models.OracleResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import qu.Dsr;
import qu.I28;
import qu.Wre;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n implements xWk.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f75362n;
    private final Dsr rl;

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f75363O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75364n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f75365r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f75366t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75363O = obj;
            this.f75365r |= Integer.MIN_VALUE;
            return n.this.n(false, this);
        }
    }

    public n(I28 oracleResponseStore, Dsr oracleService) {
        Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
        Intrinsics.checkNotNullParameter(oracleService, "oracleService");
        this.f75362n = oracleResponseStore;
        this.rl = oracleService;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xWk.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(boolean z2, Continuation continuation) {
        j jVar;
        n nVar;
        Map<String, Integer> map;
        x0X.n nVar2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f75365r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f75365r = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objRl = jVar.f75363O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f75365r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            I28 i28 = this.f75362n;
            jVar.f75364n = this;
            jVar.f75366t = z2;
            jVar.f75365r = 1;
            objRl = Wre.rl(i28, jVar);
            if (objRl != coroutine_suspended) {
                nVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            z2 = jVar.f75366t;
            nVar = (n) jVar.f75364n;
            ResultKt.throwOnFailure(objRl);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) jVar.f75364n;
                ResultKt.throwOnFailure(objRl);
                nVar2 = (x0X.n) objRl;
                if (!(nVar2 instanceof n.C1266n)) {
                    return nVar2;
                }
                if (!(nVar2 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterable iterable = (Iterable) ((n.w6) nVar2).n();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(w6.rl((OracleExperiment) it.next(), map));
                }
                return new n.w6(arrayList);
            }
            map = (Map) jVar.f75364n;
            ResultKt.throwOnFailure(objRl);
            nVar2 = (x0X.n) objRl;
            if (!(nVar2 instanceof n.C1266n)) {
            }
        }
        Map<String, Integer> experiments = ((OracleResponse) objRl).getSettings().getExperiments();
        if (z2) {
            Dsr dsr = nVar.rl;
            jVar.f75364n = experiments;
            jVar.f75365r = 2;
            Object objN = wV.w6.n(dsr, jVar);
            if (objN != coroutine_suspended) {
                objRl = objN;
                map = experiments;
                nVar2 = (x0X.n) objRl;
                if (!(nVar2 instanceof n.C1266n)) {
                }
            }
        } else {
            Dsr dsr2 = nVar.rl;
            jVar.f75364n = experiments;
            jVar.f75365r = 3;
            Object objRl2 = wV.w6.rl(dsr2, jVar);
            if (objRl2 != coroutine_suspended) {
                objRl = objRl2;
                map = experiments;
                nVar2 = (x0X.n) objRl;
                if (!(nVar2 instanceof n.C1266n)) {
                }
            }
        }
        return coroutine_suspended;
    }

    @Override // xWk.j
    public Object rl(Continuation continuation) {
        return wV.j.n(this.rl, continuation);
    }

    @Override // xWk.j
    public Object t(Map map, Continuation continuation) {
        return wV.n.n(this.rl, map, continuation);
    }
}
