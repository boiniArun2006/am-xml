package TFv;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class psW implements Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Z f10462n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function2 f10463t;

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f10464O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f10465n;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10465n = obj;
            this.f10464O |= Integer.MIN_VALUE;
            return psW.this.n(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // TFv.Z, TFv.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(CN3 cn3, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f10464O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f10464O = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f10465n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f10464O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Z z2 = this.f10462n;
            K k2 = new K(cn3, this.f10463t);
            jVar.f10464O = 1;
            if (z2.n(k2, jVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    public psW(Z z2, Function2 function2) {
        this.f10462n = z2;
        this.f10463t = function2;
    }
}
