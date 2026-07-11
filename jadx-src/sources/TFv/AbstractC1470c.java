package TFv;

import GJW.AbstractC1363t;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: renamed from: TFv.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract /* synthetic */ class AbstractC1470c {

    /* JADX INFO: renamed from: TFv.c$CN3 */
    static final class CN3 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f10379O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10380n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f10381t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10379O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return TFv.fuX.g(null, this);
        }

        CN3(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: TFv.c$Dsr */
    static final class Dsr extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f10382O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10383n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f10384t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10384t = obj;
            this.f10382O |= Integer.MIN_VALUE;
            return TFv.fuX.X(null, this);
        }

        Dsr(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: TFv.c$I28 */
    public static final class I28 implements TFv.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f10385n;

        public I28(Ref.ObjectRef objectRef) {
            this.f10385n = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // TFv.CN3
        public Object rl(Object obj, Continuation continuation) {
            this.f10385n.element = obj;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: renamed from: TFv.c$Ml */
    static final class Ml extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f10386O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10387n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f10388t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10386O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return TFv.fuX.nY(null, null, this);
        }

        Ml(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: TFv.c$Wre */
    public static final class Wre implements TFv.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2 f10389n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f10390t;

        /* JADX INFO: renamed from: TFv.c$Wre$j */
        public static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f10391O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f10392n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f10393r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f10394t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10394t = obj;
                this.f10391O |= Integer.MIN_VALUE;
                return Wre.this.rl(null, this);
            }
        }

        public Wre(Function2 function2, Ref.ObjectRef objectRef) {
            this.f10389n = function2;
            this.f10390t = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.CN3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object rl(Object obj, Continuation continuation) {
            j jVar;
            Wre wre;
            T t3;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f10391O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f10391O = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object objInvoke = jVar.f10394t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f10391O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                Function2 function2 = this.f10389n;
                jVar.f10392n = this;
                jVar.f10393r = obj;
                jVar.f10391O = 1;
                InlineMarker.mark(6);
                objInvoke = function2.invoke(obj, jVar);
                InlineMarker.mark(7);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                wre = this;
                t3 = obj;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = jVar.f10393r;
                wre = (Wre) jVar.f10392n;
                ResultKt.throwOnFailure(objInvoke);
                t3 = obj2;
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.INSTANCE;
            }
            wre.f10390t.element = t3;
            throw new AbortFlowException(wre);
        }
    }

    /* JADX INFO: renamed from: TFv.c$aC */
    static final class aC implements TFv.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f10395n;

        aC(Ref.ObjectRef objectRef) {
            this.f10395n = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // TFv.CN3
        public final Object rl(Object obj, Continuation continuation) {
            this.f10395n.element = obj;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: TFv.c$fuX */
    static final class fuX extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f10396O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10397n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f10398t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10396O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return TFv.fuX.te(null, null, this);
        }

        fuX(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: TFv.c$j */
    public static final class j implements TFv.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f10399n;

        public j(Ref.ObjectRef objectRef) {
            this.f10399n = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // TFv.CN3
        public Object rl(Object obj, Continuation continuation) {
            this.f10399n.element = obj;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: renamed from: TFv.c$n */
    public static final class n implements TFv.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2 f10400n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f10401t;

        /* JADX INFO: renamed from: TFv.c$n$j */
        public static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f10402O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f10403n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f10404r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f10405t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10405t = obj;
                this.f10402O |= Integer.MIN_VALUE;
                return n.this.rl(null, this);
            }
        }

        public n(Function2 function2, Ref.ObjectRef objectRef) {
            this.f10400n = function2;
            this.f10401t = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.CN3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object rl(Object obj, Continuation continuation) {
            j jVar;
            n nVar;
            T t3;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f10402O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f10402O = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object objInvoke = jVar.f10405t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f10402O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                Function2 function2 = this.f10400n;
                jVar.f10403n = this;
                jVar.f10404r = obj;
                jVar.f10402O = 1;
                InlineMarker.mark(6);
                objInvoke = function2.invoke(obj, jVar);
                InlineMarker.mark(7);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                nVar = this;
                t3 = obj;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = jVar.f10404r;
                nVar = (n) jVar.f10403n;
                ResultKt.throwOnFailure(objInvoke);
                t3 = obj2;
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.INSTANCE;
            }
            nVar.f10401t.element = t3;
            throw new AbortFlowException(nVar);
        }
    }

    /* JADX INFO: renamed from: TFv.c$w6 */
    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f10406O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10407n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f10408t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10406O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return TFv.fuX.ViF(null, this);
        }

        w6(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(TFv.Wre wre, Continuation continuation) {
        Dsr dsr;
        Ref.ObjectRef objectRef;
        if (continuation instanceof Dsr) {
            dsr = (Dsr) continuation;
            int i2 = dsr.f10382O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dsr.f10382O = i2 - Integer.MIN_VALUE;
            } else {
                dsr = new Dsr(continuation);
            }
        }
        Object obj = dsr.f10384t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dsr.f10382O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            TFv.CN3 aCVar = new aC(objectRef2);
            dsr.f10383n = objectRef2;
            dsr.f10382O = 1;
            if (wre.n(aCVar, dsr) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) dsr.f10383n;
            ResultKt.throwOnFailure(obj);
        }
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, dzu.nKK] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(TFv.Wre wre, Continuation continuation) {
        w6 w6Var;
        Ref.ObjectRef objectRef;
        AbortFlowException e2;
        TFv.CN3 cn3;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.J2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object obj = w6Var.f10406O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = teV.z.f73659n;
            TFv.CN3 jVar = new j(objectRef2);
            try {
                w6Var.f10407n = objectRef2;
                w6Var.f10408t = jVar;
                w6Var.J2 = 1;
                if (wre.n(jVar, w6Var) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e3) {
                objectRef = objectRef2;
                e2 = e3;
                cn3 = jVar;
                teV.qz.n(e2, cn3);
                AbstractC1363t.qie(w6Var.getContext());
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn3 = (j) w6Var.f10408t;
            objectRef = (Ref.ObjectRef) w6Var.f10407n;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                teV.qz.n(e2, cn3);
                AbstractC1363t.qie(w6Var.getContext());
            }
        }
        T t3 = objectRef.element;
        if (t3 != teV.z.f73659n) {
            return t3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nr(TFv.Wre wre, Function2 function2, Continuation continuation) {
        fuX fux;
        Ref.ObjectRef objectRef;
        AbortFlowException e2;
        TFv.CN3 cn3;
        if (continuation instanceof fuX) {
            fux = (fuX) continuation;
            int i2 = fux.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fux.J2 = i2 - Integer.MIN_VALUE;
            } else {
                fux = new fuX(continuation);
            }
        }
        Object obj = fux.f10396O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fux.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            TFv.CN3 wre2 = new Wre(function2, objectRef2);
            try {
                fux.f10397n = objectRef2;
                fux.f10398t = wre2;
                fux.J2 = 1;
                if (wre.n(wre2, fux) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e3) {
                objectRef = objectRef2;
                e2 = e3;
                cn3 = wre2;
                teV.qz.n(e2, cn3);
                AbstractC1363t.qie(fux.getContext());
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn3 = (Wre) fux.f10398t;
            objectRef = (Ref.ObjectRef) fux.f10397n;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                teV.qz.n(e2, cn3);
                AbstractC1363t.qie(fux.getContext());
            }
        }
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, dzu.nKK] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rl(TFv.Wre wre, Function2 function2, Continuation continuation) {
        Ml ml;
        Ref.ObjectRef objectRef;
        AbortFlowException e2;
        TFv.CN3 cn3;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.J2 = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object obj = ml.f10386O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = teV.z.f73659n;
            TFv.CN3 nVar = new n(function2, objectRef2);
            try {
                ml.f10387n = objectRef2;
                ml.f10388t = nVar;
                ml.J2 = 1;
                if (wre.n(nVar, ml) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e3) {
                objectRef = objectRef2;
                e2 = e3;
                cn3 = nVar;
                teV.qz.n(e2, cn3);
                AbstractC1363t.qie(ml.getContext());
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn3 = (n) ml.f10388t;
            objectRef = (Ref.ObjectRef) ml.f10387n;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                teV.qz.n(e2, cn3);
                AbstractC1363t.qie(ml.getContext());
            }
        }
        T t3 = objectRef.element;
        if (t3 != teV.z.f73659n) {
            return t3;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(TFv.Wre wre, Continuation continuation) {
        CN3 cn3;
        Ref.ObjectRef objectRef;
        AbortFlowException e2;
        TFv.CN3 cn32;
        if (continuation instanceof CN3) {
            cn3 = (CN3) continuation;
            int i2 = cn3.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn3.J2 = i2 - Integer.MIN_VALUE;
            } else {
                cn3 = new CN3(continuation);
            }
        }
        Object obj = cn3.f10379O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cn3.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            TFv.CN3 i28 = new I28(objectRef2);
            try {
                cn3.f10380n = objectRef2;
                cn3.f10381t = i28;
                cn3.J2 = 1;
                if (wre.n(i28, cn3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e3) {
                objectRef = objectRef2;
                e2 = e3;
                cn32 = i28;
                teV.qz.n(e2, cn32);
                AbstractC1363t.qie(cn3.getContext());
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn32 = (I28) cn3.f10381t;
            objectRef = (Ref.ObjectRef) cn3.f10380n;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                teV.qz.n(e2, cn32);
                AbstractC1363t.qie(cn3.getContext());
            }
        }
        return objectRef.element;
    }
}
