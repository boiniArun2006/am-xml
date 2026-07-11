package pxd;

import CZF.fuX;
import androidx.content.core.DataStore;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ml implements hOy.n {
    private final DataStore rl;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72096n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72097t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72097t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Ml.this.rl(this);
        }
    }

    public Ml(DataStore dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.rl = dataStore;
    }

    private final GUx.n mUb(fuX fux) {
        String sessionId = fux.getSessionId();
        Intrinsics.checkNotNullExpressionValue(sessionId, "getSessionId(...)");
        return new GUx.n(sessionId, fux.az(), fux.ty());
    }

    @Override // hOy.n
    public Object n(final String str, Continuation continuation) {
        Object objNr = nKx.j.nr(this.rl, new Function1() { // from class: pxd.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.xMQ(str, (fuX.n) obj);
            }
        }, continuation);
        return objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNr : Unit.INSTANCE;
    }

    @Override // hOy.n
    public Object nr(Continuation continuation) {
        Object objNr = nKx.j.nr(this.rl, new Function1() { // from class: pxd.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.KN((fuX.n) obj);
            }
        }, continuation);
        return objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNr : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // hOy.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Continuation continuation) {
        j jVar;
        Ml ml;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objRl = jVar.f72097t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            DataStore dataStore = this.rl;
            fuX fuxQie = fuX.qie();
            jVar.f72096n = this;
            jVar.J2 = 1;
            objRl = nKx.j.rl(dataStore, fuxQie, jVar);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
            ml = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ml = (Ml) jVar.f72096n;
            ResultKt.throwOnFailure(objRl);
        }
        fuX fux = (fuX) objRl;
        if (fux.HI()) {
            return ml.mUb(fux);
        }
        return null;
    }

    @Override // hOy.n
    public Object t(final double d2, Continuation continuation) {
        Object objNr = nKx.j.nr(this.rl, new Function1() { // from class: pxd.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.gh(d2, (fuX.n) obj);
            }
        }, continuation);
        return objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNr : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(fuX.n nVar) {
        if (nVar.gh()) {
            if (!nVar.mUb()) {
                nVar.az(true);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("The session has already been logged.");
        }
        throw new IllegalStateException("Session does not have an ID.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(double d2, fuX.n nVar) {
        if (nVar.gh()) {
            if (!nVar.mUb()) {
                if (d2 > nVar.xMQ()) {
                    nVar.qie(d2);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException(("The specified duration (" + d2 + ") is less or equal to the stored duration (" + nVar.xMQ() + ".").toString());
            }
            throw new IllegalStateException("The session has already been logged.");
        }
        throw new IllegalStateException("Session does not have an ID.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(String str, fuX.n nVar) {
        nVar.ty(str);
        nVar.qie(0.0d);
        nVar.az(false);
        return Unit.INSTANCE;
    }
}
