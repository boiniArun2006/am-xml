package teV;

import GJW.Lu;
import GJW.h;
import GJW.psW;
import GJW.vd;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ml implements Pl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ILs.j f73607O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CoroutineContext f73608n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f73609t;

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ Ml J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TFv.CN3 f73610O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73611n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f73612t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(TFv.CN3 cn3, Ml ml, Continuation continuation) {
            super(2, continuation);
            this.f73610O = cn3;
            this.J2 = ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f73610O, this.J2, continuation);
            jVar.f73612t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73611n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f73612t;
                TFv.CN3 cn3 = this.f73610O;
                ILs.Q qHI = this.J2.HI(vdVar);
                this.f73611n = 1;
                if (TFv.fuX.XQ(cn3, qHI, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73614n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73615t;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = Ml.this.new n(continuation);
            nVar.f73615t = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73614n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ILs.s4 s4Var = (ILs.s4) this.f73615t;
                Ml ml = Ml.this;
                this.f73614n = 1;
                if (ml.mUb(s4Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ILs.s4 s4Var, Continuation continuation) {
            return ((n) create(s4Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    protected String J2() {
        return null;
    }

    protected abstract Ml gh(CoroutineContext coroutineContext, int i2, ILs.j jVar);

    protected abstract Object mUb(ILs.s4 s4Var, Continuation continuation);

    public TFv.Wre qie() {
        return null;
    }

    static /* synthetic */ Object xMQ(Ml ml, TFv.CN3 cn3, Continuation continuation) {
        Object objJ2 = Lu.J2(new j(cn3, ml, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    public ILs.Q HI(vd vdVar) {
        return ILs.l3D.J2(vdVar, this.f73608n, ty(), this.f73607O, h.f3485O, null, az(), 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // teV.Pl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TFv.Wre O(CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        CoroutineContext coroutineContextPlus = coroutineContext.plus(this.f73608n);
        if (jVar == ILs.j.f4185n) {
            int i3 = this.f73609t;
            if (i3 != -3) {
                if (i2 != -3) {
                    if (i3 != -2) {
                        if (i2 == -2) {
                            i2 = i3;
                        } else {
                            i2 += i3;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
            }
            jVar = this.f73607O;
        }
        return (Intrinsics.areEqual(coroutineContextPlus, this.f73608n) && i2 == this.f73609t && jVar == this.f73607O) ? this : gh(coroutineContextPlus, i2, jVar);
    }

    public final Function2 az() {
        return new n(null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strJ2 = J2();
        if (strJ2 != null) {
            arrayList.add(strJ2);
        }
        if (this.f73608n != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.f73608n);
        }
        if (this.f73609t != -3) {
            arrayList.add("capacity=" + this.f73609t);
        }
        if (this.f73607O != ILs.j.f4185n) {
            arrayList.add("onBufferOverflow=" + this.f73607O);
        }
        return psW.n(this) + '[' + CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    public final int ty() {
        int i2 = this.f73609t;
        if (i2 == -3) {
            return -2;
        }
        return i2;
    }

    public Ml(CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        this.f73608n = coroutineContext;
        this.f73609t = i2;
        this.f73607O = jVar;
    }

    @Override // TFv.Wre
    public Object n(TFv.CN3 cn3, Continuation continuation) {
        return xMQ(this, cn3, continuation);
    }
}
