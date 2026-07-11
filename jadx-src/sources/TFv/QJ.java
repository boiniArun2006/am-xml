package TFv;

import GJW.AbstractC1363t;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract /* synthetic */ class QJ {

    static final class CN3 implements TFv.CN3 {
        final /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TFv.CN3 f10317O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f10318n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f10319t;

        static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f10320O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f10321n;

            j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10321n = obj;
                this.f10320O |= Integer.MIN_VALUE;
                return CN3.this.rl(null, this);
            }
        }

        CN3(Ref.IntRef intRef, int i2, TFv.CN3 cn3, Object obj) {
            this.f10318n = intRef;
            this.f10319t = i2;
            this.f10317O = cn3;
            this.J2 = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            if (r7.rl(r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        
            if (TFv.QJ.nr(r7, r6, r2, r0) == r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.CN3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object rl(Object obj, Continuation continuation) {
            j jVar;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f10320O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f10320O = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj2 = jVar.f10321n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f10320O;
            if (i3 != 0) {
                if (i3 == 1) {
                    ResultKt.throwOnFailure(obj2);
                    return Unit.INSTANCE;
                }
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj2);
            Ref.IntRef intRef = this.f10318n;
            int i5 = intRef.element + 1;
            intRef.element = i5;
            if (i5 < this.f10319t) {
                TFv.CN3 cn3 = this.f10317O;
                jVar.f10320O = 1;
            } else {
                TFv.CN3 cn32 = this.f10317O;
                Object obj3 = this.J2;
                jVar.f10320O = 2;
            }
            return coroutine_suspended;
        }
    }

    public static final class Dsr implements TFv.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2 f10323n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TFv.CN3 f10324t;

        public static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f10325O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f10326n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f10327r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f10328t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10328t = obj;
                this.f10325O |= Integer.MIN_VALUE;
                return Dsr.this.rl(null, this);
            }
        }

        public Dsr(Function2 function2, TFv.CN3 cn3) {
            this.f10323n = function2;
            this.f10324t = cn3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.rl(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.CN3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object rl(Object obj, Continuation continuation) {
            j jVar;
            Object obj2;
            Object obj3;
            Dsr dsr;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f10325O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f10325O = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj4 = jVar.f10328t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f10325O;
            boolean z2 = true;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj4);
                Function2 function2 = this.f10323n;
                jVar.f10326n = this;
                jVar.f10327r = obj;
                jVar.f10325O = 1;
                InlineMarker.mark(6);
                Object objInvoke = function2.invoke(obj, jVar);
                InlineMarker.mark(7);
                if (objInvoke != coroutine_suspended) {
                    obj2 = objInvoke;
                    obj3 = obj;
                    dsr = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsr = (Dsr) jVar.f10326n;
                ResultKt.throwOnFailure(obj4);
                if (z2) {
                    throw new AbortFlowException(dsr);
                }
                return Unit.INSTANCE;
            }
            Object obj5 = jVar.f10327r;
            Dsr dsr2 = (Dsr) jVar.f10326n;
            ResultKt.throwOnFailure(obj4);
            obj3 = obj5;
            dsr = dsr2;
            obj2 = obj4;
            if (((Boolean) obj2).booleanValue()) {
                TFv.CN3 cn3 = dsr.f10324t;
                jVar.f10326n = dsr;
                jVar.f10327r = null;
                jVar.f10325O = 2;
            } else {
                z2 = false;
            }
            if (z2) {
            }
        }
    }

    static final class I28 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f10329O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10330n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f10331t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10331t = obj;
            this.f10329O |= Integer.MIN_VALUE;
            return QJ.nr(null, null, null, this);
        }

        I28(Continuation continuation) {
            super(continuation);
        }
    }

    static final class Ml implements TFv.CN3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f10332O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f10333n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TFv.CN3 f10334t;

        static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            /* synthetic */ Object f10335O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f10336n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f10337r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f10338t;

            j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10335O = obj;
                this.f10337r |= Integer.MIN_VALUE;
                return Ml.this.rl(null, this);
            }
        }

        Ml(Ref.BooleanRef booleanRef, TFv.CN3 cn3, Function2 function2) {
            this.f10333n = booleanRef;
            this.f10334t = cn3;
            this.f10332O = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.rl(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r8.rl(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.CN3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object rl(Object obj, Continuation continuation) {
            j jVar;
            Ml ml;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f10337r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f10337r = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object objInvoke = jVar.f10335O;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f10337r;
            if (i3 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                if (this.f10333n.element) {
                    TFv.CN3 cn3 = this.f10334t;
                    jVar.f10337r = 1;
                } else {
                    Function2 function2 = this.f10332O;
                    jVar.f10336n = this;
                    jVar.f10338t = obj;
                    jVar.f10337r = 2;
                    objInvoke = function2.invoke(obj, jVar);
                    if (objInvoke != coroutine_suspended) {
                        ml = this;
                        if (!((Boolean) objInvoke).booleanValue()) {
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i3 == 1) {
                ResultKt.throwOnFailure(objInvoke);
                return Unit.INSTANCE;
            }
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
                return Unit.INSTANCE;
            }
            obj = jVar.f10338t;
            ml = (Ml) jVar.f10336n;
            ResultKt.throwOnFailure(objInvoke);
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.INSTANCE;
            }
            ml.f10333n.element = true;
            TFv.CN3 cn32 = ml.f10334t;
            jVar.f10336n = null;
            jVar.f10338t = null;
            jVar.f10337r = 3;
        }
    }

    public static final class Wre implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f10339n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f10340t;

        public static final class j extends ContinuationImpl {
            Object J2;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f10342n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f10343t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10342n = obj;
                this.f10343t |= Integer.MIN_VALUE;
                return Wre.this.n(null, this);
            }
        }

        public Wre(TFv.Wre wre, int i2) {
            this.f10339n = wre;
            this.f10340t = i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.Wre
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            j jVar;
            AbortFlowException e2;
            Object obj;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f10343t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f10343t = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj2 = jVar.f10342n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f10343t;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                Object obj3 = new Object();
                Ref.IntRef intRef = new Ref.IntRef();
                try {
                    TFv.Wre wre = this.f10339n;
                    CN3 cn32 = new CN3(intRef, this.f10340t, cn3, obj3);
                    jVar.J2 = obj3;
                    jVar.f10343t = 1;
                    if (wre.n(cn32, jVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (AbortFlowException e3) {
                    e2 = e3;
                    obj = obj3;
                    teV.qz.n(e2, obj);
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = jVar.J2;
                try {
                    ResultKt.throwOnFailure(obj2);
                } catch (AbortFlowException e4) {
                    e2 = e4;
                    teV.qz.n(e2, obj);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class fuX implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f10344n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function2 f10345t;

        public static final class j extends ContinuationImpl {
            Object J2;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f10347n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f10348t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10347n = obj;
                this.f10348t |= Integer.MIN_VALUE;
                return fuX.this.n(null, this);
            }
        }

        public fuX(TFv.Wre wre, Function2 function2) {
            this.f10344n = wre;
            this.f10345t = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.Wre
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            j jVar;
            Dsr dsr;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f10348t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f10348t = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj = jVar.f10347n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f10348t;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wre = this.f10344n;
                Dsr dsr2 = new Dsr(this.f10345t, cn3);
                try {
                    jVar.J2 = dsr2;
                    jVar.f10348t = 1;
                    if (wre.n(dsr2, jVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (AbortFlowException e2) {
                    e = e2;
                    dsr = dsr2;
                    teV.qz.n(e, dsr);
                    AbstractC1363t.qie(jVar.get$context());
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsr = (Dsr) jVar.J2;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (AbortFlowException e3) {
                    e = e3;
                    teV.qz.n(e, dsr);
                    AbstractC1363t.qie(jVar.get$context());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class j implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f10349n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f10350t;

        public j(TFv.Wre wre, int i2) {
            this.f10349n = wre;
            this.f10350t = i2;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f10349n.n(new n(new Ref.IntRef(), this.f10350t, cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class n implements TFv.CN3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TFv.CN3 f10351O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f10352n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f10353t;

        static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f10354O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f10355n;

            j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10355n = obj;
                this.f10354O |= Integer.MIN_VALUE;
                return n.this.rl(null, this);
            }
        }

        n(Ref.IntRef intRef, int i2, TFv.CN3 cn3) {
            this.f10352n = intRef;
            this.f10353t = i2;
            this.f10351O = cn3;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.CN3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object rl(Object obj, Continuation continuation) {
            j jVar;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f10354O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f10354O = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj2 = jVar.f10355n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f10354O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                Ref.IntRef intRef = this.f10352n;
                int i5 = intRef.element;
                if (i5 < this.f10353t) {
                    intRef.element = i5 + 1;
                    return Unit.INSTANCE;
                }
                TFv.CN3 cn3 = this.f10351O;
                jVar.f10354O = 1;
                if (cn3.rl(obj, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class w6 implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f10357n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function2 f10358t;

        public w6(TFv.Wre wre, Function2 function2) {
            this.f10357n = wre;
            this.f10358t = function2;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f10357n.n(new Ml(new Ref.BooleanRef(), cn3, this.f10358t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final TFv.Wre J2(TFv.Wre wre, Function2 function2) {
        return new fuX(wre, function2);
    }

    public static final TFv.Wre O(TFv.Wre wre, int i2) {
        if (i2 > 0) {
            return new Wre(wre, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " should be positive").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nr(TFv.CN3 cn3, Object obj, Object obj2, Continuation continuation) {
        I28 i28;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f10329O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f10329O = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object obj3 = i28.f10331t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.f10329O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj3);
            i28.f10330n = obj2;
            i28.f10329O = 1;
            if (cn3.rl(obj, i28) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = i28.f10330n;
            ResultKt.throwOnFailure(obj3);
        }
        throw new AbortFlowException(obj2);
    }

    public static final TFv.Wre rl(TFv.Wre wre, int i2) {
        if (i2 >= 0) {
            return new j(wre, i2);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i2).toString());
    }

    public static final TFv.Wre t(TFv.Wre wre, Function2 function2) {
        return new w6(wre, function2);
    }
}
