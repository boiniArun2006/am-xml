package TFv;

import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract /* synthetic */ class eO {

    public static final class I28 implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2 f10411n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Wre f10412t;

        public static final class j extends ContinuationImpl {
            Object J2;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f10414n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f10415o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f10416r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f10417t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10414n = obj;
                this.f10417t |= Integer.MIN_VALUE;
                return I28.this.n(null, this);
            }
        }

        public I28(Function2 function2, Wre wre) {
            this.f10411n = function2;
            this.f10412t = wre;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r7.n(r2, r0) != r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.Wre
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(CN3 cn3, Continuation continuation) throws Throwable {
            j jVar;
            Throwable th;
            teV.l3D l3d;
            I28 i28;
            CN3 cn32;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f10417t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f10417t = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj = jVar.f10414n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f10417t;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                teV.l3D l3d2 = new teV.l3D(cn3, jVar.getContext());
                try {
                    Function2 function2 = this.f10411n;
                    jVar.J2 = this;
                    jVar.f10416r = cn3;
                    jVar.f10415o = l3d2;
                    jVar.f10417t = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = function2.invoke(l3d2, jVar);
                    InlineMarker.mark(7);
                    if (objInvoke != coroutine_suspended) {
                        i28 = this;
                        cn32 = cn3;
                        l3d = l3d2;
                        l3d.releaseIntercepted();
                        Wre wre = i28.f10412t;
                        jVar.J2 = null;
                        jVar.f10416r = null;
                        jVar.f10415o = null;
                        jVar.f10417t = 2;
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    l3d = l3d2;
                    l3d.releaseIntercepted();
                    throw th;
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            l3d = (teV.l3D) jVar.f10415o;
            cn32 = (CN3) jVar.f10416r;
            i28 = (I28) jVar.J2;
            try {
                ResultKt.throwOnFailure(obj);
                l3d.releaseIntercepted();
                Wre wre2 = i28.f10412t;
                jVar.J2 = null;
                jVar.f10416r = null;
                jVar.f10415o = null;
                jVar.f10417t = 2;
            } catch (Throwable th3) {
                th = th3;
                l3d.releaseIntercepted();
                throw th;
            }
        }
    }

    static final class Ml implements CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f10418n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ CN3 f10419t;

        static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f10420O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f10421n;

            j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10421n = obj;
                this.f10420O |= Integer.MIN_VALUE;
                return Ml.this.rl(null, this);
            }
        }

        Ml(Ref.BooleanRef booleanRef, CN3 cn3) {
            this.f10418n = booleanRef;
            this.f10419t = cn3;
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
                int i2 = jVar.f10420O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f10420O = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj2 = jVar.f10421n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f10420O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                this.f10418n.element = false;
                CN3 cn3 = this.f10419t;
                jVar.f10420O = 1;
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

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f10423O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10424n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f10425t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10425t = obj;
            this.f10423O |= Integer.MIN_VALUE;
            return eO.t(null, null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    public static final class n implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f10426n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function3 f10427t;

        public static final class j extends ContinuationImpl {
            Object J2;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f10429n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f10430r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f10431t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10429n = obj;
                this.f10431t |= Integer.MIN_VALUE;
                return n.this.n(null, this);
            }
        }

        public n(Wre wre, Function3 function3) {
            this.f10426n = wre;
            this.f10427t = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.Wre
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(CN3 cn3, Continuation continuation) throws Throwable {
            j jVar;
            n nVar;
            Md md;
            Function3 function3;
            teV.l3D l3d;
            Throwable th;
            teV.l3D l3d2;
            Object objInvoke;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f10431t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f10431t = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj = jVar.f10429n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f10431t;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    Wre wre = this.f10426n;
                    jVar.J2 = this;
                    jVar.f10430r = cn3;
                    jVar.f10431t = 1;
                    if (wre.n(cn3, jVar) != coroutine_suspended) {
                        nVar = this;
                        l3d = new teV.l3D(cn3, jVar.getContext());
                        Function3 function32 = nVar.f10427t;
                        jVar.J2 = l3d;
                        jVar.f10430r = null;
                        jVar.f10431t = 3;
                        InlineMarker.mark(6);
                        objInvoke = function32.invoke(l3d, null, jVar);
                        InlineMarker.mark(7);
                        if (objInvoke != coroutine_suspended) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    nVar = this;
                    md = new Md(th);
                    function3 = nVar.f10427t;
                    jVar.J2 = th;
                    jVar.f10430r = null;
                    jVar.f10431t = 2;
                    if (eO.t(md, function3, th, jVar) == coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    Throwable th3 = (Throwable) jVar.J2;
                    ResultKt.throwOnFailure(obj);
                    throw th3;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l3d2 = (teV.l3D) jVar.J2;
                try {
                    ResultKt.throwOnFailure(obj);
                    l3d2.releaseIntercepted();
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th = th4;
                    l3d2.releaseIntercepted();
                    throw th;
                }
            }
            cn3 = (CN3) jVar.f10430r;
            nVar = (n) jVar.J2;
            try {
                ResultKt.throwOnFailure(obj);
                l3d = new teV.l3D(cn3, jVar.getContext());
            } catch (Throwable th5) {
                th = th5;
                md = new Md(th);
                function3 = nVar.f10427t;
                jVar.J2 = th;
                jVar.f10430r = null;
                jVar.f10431t = 2;
                if (eO.t(md, function3, th, jVar) == coroutine_suspended) {
                    throw th;
                }
            }
            try {
                Function3 function322 = nVar.f10427t;
                jVar.J2 = l3d;
                jVar.f10430r = null;
                jVar.f10431t = 3;
                InlineMarker.mark(6);
                objInvoke = function322.invoke(l3d, null, jVar);
                InlineMarker.mark(7);
                if (objInvoke != coroutine_suspended) {
                    l3d2 = l3d;
                    l3d2.releaseIntercepted();
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable th6) {
                th = th6;
                l3d2 = l3d;
                l3d2.releaseIntercepted();
                throw th;
            }
        }
    }

    public static final class w6 implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f10432n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function2 f10433t;

        public static final class j extends ContinuationImpl {
            Object J2;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f10435n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f10436o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f10437r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f10438t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10435n = obj;
                this.f10438t |= Integer.MIN_VALUE;
                return w6.this.n(null, this);
            }
        }

        public w6(Wre wre, Function2 function2) {
            this.f10432n = wre;
            this.f10433t = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
        
            if (r8 == r1) goto L29;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [TFv.CN3] */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r7v0, types: [TFv.CN3, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v1, types: [teV.l3D] */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v7, types: [teV.l3D] */
        @Override // TFv.Wre
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(CN3 cn3, Continuation continuation) {
            j jVar;
            w6 w6Var;
            ?? r2;
            Ref.BooleanRef booleanRef;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f10438t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f10438t = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj = jVar.f10435n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f10438t;
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    booleanRef2.element = true;
                    Wre wre = this.f10432n;
                    Ml ml = new Ml(booleanRef2, cn3);
                    jVar.J2 = this;
                    jVar.f10437r = cn3;
                    jVar.f10436o = booleanRef2;
                    jVar.f10438t = 1;
                    if (wre.n(ml, jVar) != coroutine_suspended) {
                        w6Var = this;
                        r2 = cn3;
                        booleanRef = booleanRef2;
                    }
                    return coroutine_suspended;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    teV.l3D l3d = (teV.l3D) jVar.J2;
                    ResultKt.throwOnFailure(obj);
                    cn3 = l3d;
                    return Unit.INSTANCE;
                }
                booleanRef = (Ref.BooleanRef) jVar.f10436o;
                CN3 cn32 = (CN3) jVar.f10437r;
                w6Var = (w6) jVar.J2;
                ResultKt.throwOnFailure(obj);
                r2 = cn32;
                if (booleanRef.element) {
                    teV.l3D l3d2 = new teV.l3D(r2, jVar.getContext());
                    Function2 function2 = w6Var.f10433t;
                    jVar.J2 = l3d2;
                    jVar.f10437r = null;
                    jVar.f10436o = null;
                    jVar.f10438t = 2;
                    InlineMarker.mark(6);
                    Object objInvoke = function2.invoke(l3d2, jVar);
                    InlineMarker.mark(7);
                    cn3 = l3d2;
                }
                return Unit.INSTANCE;
            } finally {
                cn3.releaseIntercepted();
            }
        }
    }

    public static final Wre J2(Wre wre, Function2 function2) {
        return new I28(function2, wre);
    }

    public static final Wre O(Wre wre, Function2 function2) {
        return new w6(wre, function2);
    }

    public static final Wre nr(Wre wre, Function3 function3) {
        return new n(wre, function3);
    }

    public static final void rl(CN3 cn3) {
        if (cn3 instanceof Md) {
            throw ((Md) cn3).f10299n;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(CN3 cn3, Function3 function3, Throwable th, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f10423O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f10423O = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f10425t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f10423O;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar.f10424n = th;
                jVar.f10423O = 1;
                if (function3.invoke(cn3, th, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) jVar.f10424n;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                ExceptionsKt.addSuppressed(th2, th);
            }
            throw th2;
        }
    }
}
