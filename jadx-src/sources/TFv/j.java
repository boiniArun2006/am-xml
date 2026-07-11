package TFv;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j implements Wre {

    /* JADX INFO: renamed from: TFv.j$j, reason: collision with other inner class name */
    static final class C0368j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10451n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f10452t;

        C0368j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10452t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.n(null, this);
        }
    }

    public abstract Object J2(CN3 cn3, Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // TFv.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(CN3 cn3, Continuation continuation) throws Throwable {
        C0368j c0368j;
        Throwable th;
        teV.l3D l3d;
        if (continuation instanceof C0368j) {
            c0368j = (C0368j) continuation;
            int i2 = c0368j.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0368j.J2 = i2 - Integer.MIN_VALUE;
            } else {
                c0368j = new C0368j(continuation);
            }
        }
        Object obj = c0368j.f10452t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0368j.J2;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l3d = (teV.l3D) c0368j.f10451n;
            try {
                ResultKt.throwOnFailure(obj);
                l3d.releaseIntercepted();
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                l3d.releaseIntercepted();
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        teV.l3D l3d2 = new teV.l3D(cn3, c0368j.getContext());
        try {
            c0368j.f10451n = l3d2;
            c0368j.J2 = 1;
            if (J2(l3d2, c0368j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            l3d = l3d2;
            l3d.releaseIntercepted();
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            l3d = l3d2;
            l3d.releaseIntercepted();
            throw th;
        }
    }
}
