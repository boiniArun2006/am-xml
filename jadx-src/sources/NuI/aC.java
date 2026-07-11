package NuI;

import k.InterfaceC2202n;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class aC implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final NuI.j f7212n;
    private boolean rl;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7214n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7215t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7215t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return aC.this.n(this);
        }
    }

    public aC(NuI.j getAdOrableUseCase) {
        Intrinsics.checkNotNullParameter(getAdOrableUseCase, "getAdOrableUseCase");
        this.f7212n = getAdOrableUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // NuI.Dsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        j jVar;
        aC aCVar;
        aC aCVar2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objN = jVar.f7215t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            if (this.rl) {
                return Unit.INSTANCE;
            }
            NuI.j jVar2 = this.f7212n;
            jVar.f7214n = this;
            jVar.J2 = 1;
            objN = jVar2.n(jVar);
            if (objN != coroutine_suspended) {
                aCVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aCVar2 = (aC) jVar.f7214n;
            ResultKt.throwOnFailure(objN);
            aCVar2.rl = true;
            return Unit.INSTANCE;
        }
        aCVar = (aC) jVar.f7214n;
        ResultKt.throwOnFailure(objN);
        jVar.f7214n = aCVar;
        jVar.J2 = 2;
        if (((InterfaceC2202n) objN).t(true, false, jVar) != coroutine_suspended) {
            aCVar2 = aCVar;
            aCVar2.rl = true;
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
