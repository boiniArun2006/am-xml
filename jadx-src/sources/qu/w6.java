package qu;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import qu.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class w6 implements n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f72500t = UX1.j.nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Dsr.n f72501n;
    private final UX1.j rl;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72503n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72504t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72504t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return w6.this.n(this);
        }
    }

    public w6(Dsr.n config, UX1.j backendOverrideDatastore) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(backendOverrideDatastore, "backendOverrideDatastore");
        this.f72501n = config;
        this.rl = backendOverrideDatastore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // qu.n
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
        Object objViF = jVar.f72504t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            if (!this.f72501n.KN().n()) {
                return this.f72501n.t();
            }
            TFv.Wre wreRl = this.rl.rl();
            jVar.f72503n = this;
            jVar.J2 = 1;
            objViF = TFv.fuX.ViF(wreRl, jVar);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
            w6Var = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w6Var = (w6) jVar.f72503n;
            ResultKt.throwOnFailure(objViF);
        }
        String str = (String) objViF;
        return str == null ? w6Var.f72501n.t() : str;
    }
}
