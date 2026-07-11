package teV;

import GJW.Lu;
import GJW.h;
import GJW.vd;
import GJW.xuv;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class fuX extends Wre {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Function3 f73633r;

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ TFv.CN3 J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73635n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f73636t;

        /* JADX INFO: renamed from: teV.fuX$j$j, reason: collision with other inner class name */
        static final class C1191j implements TFv.CN3 {
            final /* synthetic */ TFv.CN3 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ fuX f73637O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f73638n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ vd f73639t;

            /* JADX INFO: renamed from: teV.fuX$j$j$j, reason: collision with other inner class name */
            static final class C1192j extends SuspendLambda implements Function2 {
                final /* synthetic */ Object J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ TFv.CN3 f73640O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f73641n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ fuX f73642t;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vd vdVar, Continuation continuation) {
                    return ((C1192j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1192j(fuX fux, TFv.CN3 cn3, Object obj, Continuation continuation) {
                    super(2, continuation);
                    this.f73642t = fux;
                    this.f73640O = cn3;
                    this.J2 = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C1192j(this.f73642t, this.f73640O, this.J2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f73641n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Function3 function3 = this.f73642t.f73633r;
                        TFv.CN3 cn3 = this.f73640O;
                        Object obj2 = this.J2;
                        this.f73641n = 1;
                        if (function3.invoke(cn3, obj2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: teV.fuX$j$j$n */
            static final class n extends ContinuationImpl {
                /* synthetic */ Object J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                Object f73643O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f73644n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f73645o;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                Object f73647t;

                n(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.J2 = obj;
                    this.f73645o |= Integer.MIN_VALUE;
                    return C1191j.this.rl(null, this);
                }
            }

            C1191j(Ref.ObjectRef objectRef, vd vdVar, fuX fux, TFv.CN3 cn3) {
                this.f73638n = objectRef;
                this.f73639t = vdVar;
                this.f73637O = fux;
                this.J2 = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r8v2, types: [GJW.xuv, T] */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                n nVar;
                C1191j c1191j;
                if (continuation instanceof n) {
                    nVar = (n) continuation;
                    int i2 = nVar.f73645o;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        nVar.f73645o = i2 - Integer.MIN_VALUE;
                    } else {
                        nVar = new n(continuation);
                    }
                }
                Object obj2 = nVar.J2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = nVar.f73645o;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    xuv xuvVar = (xuv) this.f73638n.element;
                    if (xuvVar != null) {
                        xuvVar.cancel((CancellationException) new ChildCancelledException());
                        nVar.f73644n = this;
                        nVar.f73647t = obj;
                        nVar.f73643O = xuvVar;
                        nVar.f73645o = 1;
                        if (xuvVar.join(nVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    c1191j = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = nVar.f73647t;
                    c1191j = (C1191j) nVar.f73644n;
                    ResultKt.throwOnFailure(obj2);
                }
                c1191j.f73638n.element = GJW.C.nr(c1191j.f73639t, null, h.J2, new C1192j(c1191j.f73637O, c1191j.J2, obj, null), 1, null);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(TFv.CN3 cn3, Continuation continuation) {
            super(2, continuation);
            this.J2 = cn3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = fuX.this.new j(this.J2, continuation);
            jVar.f73636t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73635n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f73636t;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                fuX fux = fuX.this;
                TFv.Wre wre = fux.J2;
                C1191j c1191j = new C1191j(objectRef, vdVar, fux, this.J2);
                this.f73635n = 1;
                if (wre.n(c1191j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ fuX(Function3 function3, TFv.Wre wre, CoroutineContext coroutineContext, int i2, ILs.j jVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, wre, (i3 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? ILs.j.f4185n : jVar);
    }

    @Override // teV.Ml
    protected Ml gh(CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        return new fuX(this.f73633r, this.J2, coroutineContext, i2, jVar);
    }

    @Override // teV.Wre
    protected Object o(TFv.CN3 cn3, Continuation continuation) {
        Object objJ2 = Lu.J2(new j(cn3, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    public fuX(Function3 function3, TFv.Wre wre, CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        super(wre, coroutineContext, i2, jVar);
        this.f73633r = function3;
    }
}
