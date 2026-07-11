package TFv;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract /* synthetic */ class UGc {

    public static final class j implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f10359n;

        /* JADX INFO: renamed from: TFv.UGc$j$j, reason: collision with other inner class name */
        public static final class C0363j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CN3 f10360n;

            /* JADX INFO: renamed from: TFv.UGc$j$j$j, reason: collision with other inner class name */
            public static final class C0364j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f10362n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f10363t;

                public C0364j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f10362n = obj;
                    this.f10363t |= Integer.MIN_VALUE;
                    return C0363j.this.rl(null, this);
                }
            }

            public C0363j(CN3 cn3) {
                this.f10360n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0364j c0364j;
                if (continuation instanceof C0364j) {
                    c0364j = (C0364j) continuation;
                    int i2 = c0364j.f10363t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0364j.f10363t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0364j = new C0364j(continuation);
                    }
                }
                Object obj2 = c0364j.f10362n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0364j.f10363t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    CN3 cn3 = this.f10360n;
                    if (obj != null) {
                        c0364j.f10363t = 1;
                        if (cn3.rl(obj, c0364j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        public j(Wre wre) {
            this.f10359n = wre;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = this.f10359n.n(new C0363j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final class n implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f10364n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function2 f10365t;

        public static final class j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CN3 f10366n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function2 f10367t;

            /* JADX INFO: renamed from: TFv.UGc$n$j$j, reason: collision with other inner class name */
            public static final class C0365j extends ContinuationImpl {
                Object J2;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f10369n;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f10370r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f10371t;

                public C0365j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f10369n = obj;
                    this.f10371t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(CN3 cn3, Function2 function2) {
                this.f10366n = cn3;
                this.f10367t = function2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            
                if (r6.rl(r2, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0365j c0365j;
                Object obj2;
                CN3 cn3;
                if (continuation instanceof C0365j) {
                    c0365j = (C0365j) continuation;
                    int i2 = c0365j.f10371t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0365j.f10371t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0365j = new C0365j(continuation);
                    }
                }
                Object obj3 = c0365j.f10369n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0365j.f10371t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj3);
                    CN3 cn32 = this.f10366n;
                    Function2 function2 = this.f10367t;
                    c0365j.J2 = obj;
                    c0365j.f10370r = cn32;
                    c0365j.f10371t = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = function2.invoke(obj, c0365j);
                    InlineMarker.mark(7);
                    if (objInvoke != coroutine_suspended) {
                        obj2 = obj;
                        cn3 = cn32;
                    }
                    return coroutine_suspended;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj3);
                    return Unit.INSTANCE;
                }
                cn3 = (CN3) c0365j.f10370r;
                obj2 = c0365j.J2;
                ResultKt.throwOnFailure(obj3);
                c0365j.J2 = null;
                c0365j.f10370r = null;
                c0365j.f10371t = 2;
            }
        }

        public n(Wre wre, Function2 function2) {
            this.f10364n = wre;
            this.f10365t = function2;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = this.f10364n.n(new j(cn3, this.f10365t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final Wre n(Wre wre) {
        return new j(wre);
    }

    public static final Wre rl(Wre wre, Function2 function2) {
        return new n(wre, function2);
    }
}
