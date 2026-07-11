package MOX;

import CZF.j;
import androidx.content.core.DataStore;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 implements dVI.n {
    private final DataStore rl;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6606n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f6607t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6607t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return w6.this.n(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(j.n nVar) {
        nVar.xMQ(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(j.n nVar) {
        nVar.xMQ(false);
        return Unit.INSTANCE;
    }

    public w6(DataStore dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.rl = dataStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // dVI.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        j jVar;
        w6 w6Var;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objRl = jVar.f6607t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            DataStore dataStore = this.rl;
            CZF.j jVarMUb = CZF.j.mUb();
            jVar.f6606n = this;
            jVar.J2 = 1;
            objRl = nKx.j.rl(dataStore, jVarMUb, jVar);
            if (objRl != coroutine_suspended) {
                w6Var = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Boolean bool = (Boolean) jVar.f6606n;
            ResultKt.throwOnFailure(objRl);
            return bool;
        }
        w6Var = (w6) jVar.f6606n;
        ResultKt.throwOnFailure(objRl);
        Boolean boolBoxBoolean = Boxing.boxBoolean(((CZF.j) objRl).gh());
        if (boolBoxBoolean.booleanValue()) {
            DataStore dataStore2 = w6Var.rl;
            Function1 function1 = new Function1() { // from class: MOX.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return w6.O((j.n) obj);
                }
            };
            jVar.f6606n = boolBoxBoolean;
            jVar.J2 = 2;
            if (nKx.j.nr(dataStore2, function1, jVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return boolBoxBoolean;
    }

    @Override // dVI.n
    public Object rl(Continuation continuation) {
        Object objNr = nKx.j.nr(this.rl, new Function1() { // from class: MOX.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w6.J2((j.n) obj);
            }
        }, continuation);
        return objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNr : Unit.INSTANCE;
    }
}
