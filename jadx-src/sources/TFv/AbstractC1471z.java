package TFv;

import GJW.xuv;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: TFv.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract /* synthetic */ class AbstractC1471z {

    /* JADX INFO: renamed from: TFv.z$j */
    public static final class j implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f10494n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function3 f10495t;

        /* JADX INFO: renamed from: TFv.z$j$j, reason: collision with other inner class name */
        public static final class C0371j extends ContinuationImpl {
            Object J2;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f10497n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f10498r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f10499t;

            public C0371j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10497n = obj;
                this.f10499t |= Integer.MIN_VALUE;
                return j.this.n(null, this);
            }
        }

        public j(Wre wre, Function3 function3) {
            this.f10494n = wre;
            this.f10495t = function3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        
            if (r6 == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.Wre
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(CN3 cn3, Continuation continuation) {
            C0371j c0371j;
            j jVar;
            if (continuation instanceof C0371j) {
                c0371j = (C0371j) continuation;
                int i2 = c0371j.f10499t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0371j.f10499t = i2 - Integer.MIN_VALUE;
                } else {
                    c0371j = new C0371j(continuation);
                }
            }
            Object objKN = c0371j.f10497n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = c0371j.f10499t;
            if (i3 == 0) {
                ResultKt.throwOnFailure(objKN);
                Wre wre = this.f10494n;
                c0371j.J2 = this;
                c0371j.f10498r = cn3;
                c0371j.f10499t = 1;
                objKN = fuX.KN(wre, cn3, c0371j);
                if (objKN != coroutine_suspended) {
                    jVar = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objKN);
                return Unit.INSTANCE;
            }
            cn3 = (CN3) c0371j.f10498r;
            jVar = (j) c0371j.J2;
            ResultKt.throwOnFailure(objKN);
            Throwable th = (Throwable) objKN;
            if (th != null) {
                Function3 function3 = jVar.f10495t;
                c0371j.J2 = null;
                c0371j.f10498r = null;
                c0371j.f10499t = 2;
                InlineMarker.mark(6);
                Object objInvoke = function3.invoke(cn3, th, c0371j);
                InlineMarker.mark(7);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: TFv.z$n */
    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f10500O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10501n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f10502t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10502t = obj;
            this.f10500O |= Integer.MIN_VALUE;
            return fuX.KN(null, null, this);
        }

        n(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: TFv.z$w6 */
    static final class w6 implements CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ CN3 f10503n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f10504t;

        /* JADX INFO: renamed from: TFv.z$w6$j */
        static final class j extends ContinuationImpl {
            int J2;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f10506n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f10507t;

            j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10507t = obj;
                this.J2 |= Integer.MIN_VALUE;
                return w6.this.rl(null, this);
            }
        }

        w6(CN3 cn3, Ref.ObjectRef objectRef) {
            this.f10503n = cn3;
            this.f10504t = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Throwable] */
        @Override // TFv.CN3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object rl(Object obj, Continuation continuation) {
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
            Object obj2 = jVar.f10507t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.J2;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w6Var = (w6) jVar.f10506n;
                try {
                    ResultKt.throwOnFailure(obj2);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    w6Var.f10504t.element = th;
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj2);
            try {
                CN3 cn3 = this.f10503n;
                jVar.f10506n = this;
                jVar.J2 = 1;
                if (cn3.rl(obj, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                w6Var = this;
                w6Var.f10504t.element = th;
                throw th;
            }
        }
    }

    public static final Wre n(Wre wre, Function3 function3) {
        return new j(wre, function3);
    }

    private static final boolean nr(Throwable th, Throwable th2) {
        return th2 != null && Intrinsics.areEqual(th2, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rl(Wre wre, CN3 cn3, Continuation continuation) throws Throwable {
        n nVar;
        Ref.ObjectRef objectRef;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f10500O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f10500O = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f10502t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f10500O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                CN3 w6Var = new w6(cn3, objectRef2);
                nVar.f10501n = objectRef2;
                nVar.f10500O = 1;
                if (wre.n(w6Var, nVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                objectRef = objectRef2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) nVar.f10501n;
            try {
                ResultKt.throwOnFailure(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) objectRef.element;
        if (nr(th, th3) || t(th, nVar.getContext())) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            ExceptionsKt.addSuppressed(th3, th);
            throw th3;
        }
        ExceptionsKt.addSuppressed(th, th3);
        throw th;
    }

    private static final boolean t(Throwable th, CoroutineContext coroutineContext) {
        xuv xuvVar = (xuv) coroutineContext.get(xuv.nr);
        if (xuvVar == null || !xuvVar.isCancelled()) {
            return false;
        }
        return nr(th, xuvVar.getCancellationException());
    }
}
