package xFr;

import TFv.Z;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ml {

    public static final class j implements TFv.Wre {
        final /* synthetic */ Function2 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f75327O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f75328n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f75329t;

        /* JADX INFO: renamed from: xFr.Ml$j$j, reason: collision with other inner class name */
        public static final class C1270j implements TFv.CN3 {
            final /* synthetic */ Function2 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f75330O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f75331n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f75332t;

            /* JADX INFO: renamed from: xFr.Ml$j$j$j, reason: collision with other inner class name */
            public static final class C1271j extends ContinuationImpl {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                Object f75333O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f75334n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                Object f75335o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f75336r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f75337t;

                public C1271j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f75334n = obj;
                    this.f75337t |= Integer.MIN_VALUE;
                    return C1270j.this.rl(null, this);
                }
            }

            public C1270j(TFv.CN3 cn3, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Function2 function2) {
                this.f75331n = cn3;
                this.f75332t = objectRef;
                this.f75330O = objectRef2;
                this.J2 = function2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
            
                if (r2.rl(r8, r0) != r1) goto L29;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1271j c1271j;
                C1270j c1270j;
                Object obj2;
                TFv.CN3 cn3;
                T t3;
                T t4;
                TFv.CN3 cn32;
                if (continuation instanceof C1271j) {
                    c1271j = (C1271j) continuation;
                    int i2 = c1271j.f75337t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1271j.f75337t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1271j = new C1271j(continuation);
                    }
                }
                Object obj3 = c1271j.f75334n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1271j.f75337t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj3);
                    TFv.CN3 cn33 = this.f75331n;
                    if (Intrinsics.areEqual(obj, this.f75332t.element)) {
                        Object obj4 = this.f75330O.element;
                        cn3 = cn33;
                        obj2 = obj4;
                        if (obj4 != null) {
                            c1271j.f75333O = null;
                            c1271j.f75336r = null;
                            c1271j.f75335o = null;
                            c1271j.f75337t = 2;
                        }
                        return coroutine_suspended;
                    }
                    Function2 function2 = this.J2;
                    c1271j.f75333O = this;
                    c1271j.f75336r = cn33;
                    c1271j.f75335o = obj;
                    c1271j.f75337t = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = function2.invoke(obj, c1271j);
                    InlineMarker.mark(7);
                    if (objInvoke != coroutine_suspended) {
                        c1270j = this;
                        cn32 = cn33;
                        t4 = obj;
                        t3 = objInvoke;
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
                Object obj5 = c1271j.f75335o;
                TFv.CN3 cn34 = (TFv.CN3) c1271j.f75336r;
                c1270j = (C1270j) c1271j.f75333O;
                ResultKt.throwOnFailure(obj3);
                cn32 = cn34;
                t4 = obj5;
                t3 = obj3;
                c1270j.f75332t.element = t4;
                c1270j.f75330O.element = t3;
                cn3 = cn32;
                obj2 = t3;
                c1271j.f75333O = null;
                c1271j.f75336r = null;
                c1271j.f75335o = null;
                c1271j.f75337t = 2;
            }
        }

        public j(TFv.Wre wre, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Function2 function2) {
            this.f75328n = wre;
            this.f75329t = objectRef;
            this.f75327O = objectRef2;
            this.J2 = function2;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f75328n.n(new C1270j(cn3, this.f75329t, this.f75327O, this.J2), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ Function2 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f75338O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75339n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f75340t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Ref.BooleanRef booleanRef, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f75338O = booleanRef;
            this.J2 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f75338O, this.J2, continuation);
            nVar.f75340t = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75339n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f75340t;
                Ref.BooleanRef booleanRef = this.f75338O;
                if (booleanRef.element) {
                    booleanRef.element = false;
                    Function2 function2 = this.J2;
                    this.f75339n = 1;
                    if (function2.invoke(cn3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((n) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final TFv.Wre n(TFv.Wre wre, Function2 transform) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new j(wre, new Ref.ObjectRef(), new Ref.ObjectRef(), transform);
    }

    public static final Z rl(Z z2, Function2 action) {
        Intrinsics.checkNotNullParameter(z2, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        return TFv.fuX.rV9(z2, new n(booleanRef, action, null));
    }
}
