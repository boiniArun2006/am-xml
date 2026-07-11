package l3;

import TFv.Wre;
import TFv.fuX;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import x0X.n;
import x0X.w6;

/* JADX INFO: renamed from: l3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractC2255j {

    /* JADX INFO: renamed from: l3.j$j, reason: collision with other inner class name */
    static final class C1046j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f70386n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f70387t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70386n = obj;
            this.f70387t |= Integer.MIN_VALUE;
            return AbstractC2255j.n(null, this);
        }

        C1046j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(U5u.j jVar, Continuation continuation) {
        C1046j c1046j;
        if (continuation instanceof C1046j) {
            c1046j = (C1046j) continuation;
            int i2 = c1046j.f70387t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1046j.f70387t = i2 - Integer.MIN_VALUE;
            } else {
                c1046j = new C1046j(continuation);
            }
        }
        Object objViF = c1046j.f70386n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c1046j.f70387t;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            Wre wreN = jVar.n();
            c1046j.f70387t = 1;
            objViF = fuX.ViF(wreN, c1046j);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objViF);
        }
        return w6.nr((n) objViF);
    }
}
