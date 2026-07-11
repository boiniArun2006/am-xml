package W;

import TFv.Wre;
import TFv.fuX;
import cg.o;
import cg.qz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import nYs.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f11430n;
    private final qz rl;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f11432n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f11433t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11433t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.rl(this);
        }
    }

    /* JADX INFO: renamed from: W.n$n, reason: collision with other inner class name */
    static final class C0413n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f11435n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f11436t;

        C0413n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11436t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.n(null, this);
        }
    }

    public n(Ml getAlightSettingsUseCase, qz rewardPricesRepository) {
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(rewardPricesRepository, "rewardPricesRepository");
        this.f11430n = getAlightSettingsUseCase;
        this.rl = rewardPricesRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(o.C c2, Continuation continuation) {
        C0413n c0413n;
        if (continuation instanceof C0413n) {
            c0413n = (C0413n) continuation;
            int i2 = c0413n.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0413n.J2 = i2 - Integer.MIN_VALUE;
            } else {
                c0413n = new C0413n(continuation);
            }
        }
        Object objRl = c0413n.f11436t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0413n.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            c0413n.f11435n = c2;
            c0413n.J2 = 1;
            objRl = rl(c0413n);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2 = (o.C) c0413n.f11435n;
            ResultKt.throwOnFailure(objRl);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objRl) {
            if (((o) obj).t() == c2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rl(Continuation continuation) {
        j jVar;
        List listEmptyList;
        List<String> list;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f11433t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            nYs.j jVarInvoke = this.f11430n.invoke();
            if (jVarInvoke == null || (listEmptyList = jVarInvoke.Uo()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            Wre wreN = this.rl.n();
            jVar.f11432n = listEmptyList;
            jVar.J2 = 1;
            Object objViF = fuX.ViF(wreN, jVar);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = listEmptyList;
            obj = objViF;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) jVar.f11432n;
            ResultKt.throwOnFailure(obj);
        }
        Map map = (Map) obj;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (String str : list) {
            o oVarRl = o.nr.rl(str, (Long) map.get(str));
            if (oVarRl != null) {
                listCreateListBuilder.add(oVarRl);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
