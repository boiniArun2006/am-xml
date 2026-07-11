package Fw3;

import GJW.Lu;
import GJW.N;
import GJW.OU;
import GJW.P;
import GJW.V1;
import GJW.iwV;
import GJW.vd;
import LQ.j;
import Wzh.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.Surface;
import com.bendingspoons.fellini.utils.either.UnhandledFailureException;
import gB.I28;
import gB.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import mF.w6;
import v.AbstractC2406j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j implements gB.j {
    private final n J2;
    private final kG.fuX KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final VD.j f3258O;
    private final Qp.j Uo;
    private final Wzh.j az;
    private final yB.j gh;
    private final iwV mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f3259n;
    private final Fw3.Dsr nr;
    private final Wzh.j qie;
    private final w6.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final gB.CN3 f3260t;
    private final vd xMQ;
    public static final C0122j ty = new C0122j(null);
    private static final Fw3.Dsr HI = new Fw3.Dsr(256000000, 3);

    static final class C extends SuspendLambda implements Function2 {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f3261O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3262n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f3263t;

        /* JADX INFO: renamed from: Fw3.j$C$j, reason: collision with other inner class name */
        static final class C0113j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f3264n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ P f3265t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0113j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0113j(P p2, Continuation continuation) {
                super(2, continuation);
                this.f3265t = p2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0113j(this.f3265t, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
            
                if (((Fw3.C) r5).rl(r4) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f3264n;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    P p2 = this.f3265t;
                    this.f3264n = 1;
                    obj = p2.await(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                this.f3264n = 2;
            }
        }

        static final class n extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f3266n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ P f3267t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(P p2, Continuation continuation) {
                super(2, continuation);
                this.f3267t = p2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new n(this.f3267t, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
            
                if (((mF.w6) r5).rl(r4) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f3266n;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    P p2 = this.f3267t;
                    this.f3266n = 1;
                    obj = p2.await(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                this.f3266n = 2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(List list, List list2, Continuation continuation) {
            super(2, continuation);
            this.f3261O = list;
            this.J2 = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C c2 = new C(this.f3261O, this.J2, continuation);
            c2.f3263t = obj;
            return c2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3262n == 0) {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f3263t;
                Iterator it = this.f3261O.iterator();
                while (it.hasNext()) {
                    GJW.C.nr(vdVar, null, null, new C0113j((P) it.next(), null), 3, null);
                }
                Iterator it2 = this.J2.iterator();
                while (it2.hasNext()) {
                    GJW.C.nr(vdVar, null, null, new n((P) it2.next(), null), 3, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class CN3 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f3268O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f3269n;

        CN3(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3269n = obj;
            this.f3268O |= Integer.MIN_VALUE;
            return j.this.HI(null, null, null, this);
        }
    }

    static final class Dsr extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f3271O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3272n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f3273r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3274t;

        Dsr(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3271O = obj;
            this.f3273r |= Integer.MIN_VALUE;
            return j.this.o(null, this);
        }
    }

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function2, SuspendFunction {
        I28(Object obj) {
            super(2, obj, j.class, "newTextureFor", "newTextureFor(Lcom/bendingspoons/fellini/fmfoundation/graphicpipeline/internal/GraphicResourceDescriptor$Image;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I28.n nVar, Continuation continuation) {
            return ((j) this.receiver).Ik(nVar, continuation);
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f3275O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3276n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3277t;

        /* JADX INFO: renamed from: Fw3.j$Ml$j, reason: collision with other inner class name */
        static final class C0114j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ j f3278O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f3279n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f3280t;

            /* JADX INFO: renamed from: Fw3.j$Ml$j$j, reason: collision with other inner class name */
            static final class C0115j extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f3281n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ j f3282t;

                /* JADX INFO: renamed from: Fw3.j$Ml$j$j$j, reason: collision with other inner class name */
                public static final class C0116j extends SuspendLambda implements Function2 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f3283n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Wzh.j f3284t;

                    /* JADX INFO: renamed from: Fw3.j$Ml$j$j$j$j, reason: collision with other inner class name */
                    public static final class C0117j extends SuspendLambda implements Function2 {

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Wzh.j f3285O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f3286n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        private /* synthetic */ Object f3287t;

                        /* JADX INFO: renamed from: Fw3.j$Ml$j$j$j$j$j, reason: collision with other inner class name */
                        public static final class C0118j extends SuspendLambda implements Function2 {

                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                            int f3288n;

                            /* JADX INFO: renamed from: t, reason: collision with root package name */
                            final /* synthetic */ P f3289t;

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(vd vdVar, Continuation continuation) {
                                return ((C0118j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C0118j(P p2, Continuation continuation) {
                                super(2, continuation);
                                this.f3289t = p2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object obj, Continuation continuation) {
                                return new C0118j(this.f3289t, continuation);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
                            
                                if (((mF.w6) r5).rl(r4) == r0) goto L15;
                             */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = this.f3288n;
                                if (i2 != 0) {
                                    if (i2 != 1) {
                                        if (i2 == 2) {
                                            ResultKt.throwOnFailure(obj);
                                            return Unit.INSTANCE;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    ResultKt.throwOnFailure(obj);
                                    P p2 = this.f3289t;
                                    this.f3288n = 1;
                                    obj = p2.await(this);
                                    if (obj != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                }
                                this.f3288n = 2;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(vd vdVar, Continuation continuation) {
                            return ((C0117j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0117j(Wzh.j jVar, Continuation continuation) {
                            super(2, continuation);
                            this.f3285O = jVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            C0117j c0117j = new C0117j(this.f3285O, continuation);
                            c0117j.f3287t = obj;
                            return c0117j;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.f3286n == 0) {
                                ResultKt.throwOnFailure(obj);
                                vd vdVar = (vd) this.f3287t;
                                Iterator it = this.f3285O.t().iterator();
                                while (it.hasNext()) {
                                    GJW.C.nr(vdVar, null, null, new C0118j((P) it.next(), null), 3, null);
                                }
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(vd vdVar, Continuation continuation) {
                        return ((C0116j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0116j(Wzh.j jVar, Continuation continuation) {
                        super(2, continuation);
                        this.f3284t = jVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C0116j(this.f3284t, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f3283n;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            C0117j c0117j = new C0117j(this.f3284t, null);
                            this.f3283n = 1;
                            if (N.t(c0117j, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vd vdVar, Continuation continuation) {
                    return ((C0115j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0115j(j jVar, Continuation continuation) {
                    super(2, continuation);
                    this.f3282t = jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0115j(this.f3282t, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f3281n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Wzh.j jVar = this.f3282t.az;
                        V1 v1 = V1.f3456n;
                        C0116j c0116j = new C0116j(jVar, null);
                        this.f3281n = 1;
                        if (GJW.Dsr.Uo(v1, c0116j, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: Fw3.j$Ml$j$n */
            static final class n extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f3290n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ j f3291t;

                /* JADX INFO: renamed from: Fw3.j$Ml$j$n$j, reason: collision with other inner class name */
                public static final class C0119j extends SuspendLambda implements Function2 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f3292n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Wzh.j f3293t;

                    /* JADX INFO: renamed from: Fw3.j$Ml$j$n$j$j, reason: collision with other inner class name */
                    public static final class C0120j extends SuspendLambda implements Function2 {

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Wzh.j f3294O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f3295n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        private /* synthetic */ Object f3296t;

                        /* JADX INFO: renamed from: Fw3.j$Ml$j$n$j$j$j, reason: collision with other inner class name */
                        public static final class C0121j extends SuspendLambda implements Function2 {

                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                            int f3297n;

                            /* JADX INFO: renamed from: t, reason: collision with root package name */
                            final /* synthetic */ P f3298t;

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(vd vdVar, Continuation continuation) {
                                return ((C0121j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C0121j(P p2, Continuation continuation) {
                                super(2, continuation);
                                this.f3298t = p2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object obj, Continuation continuation) {
                                return new C0121j(this.f3298t, continuation);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
                            
                                if (((Fw3.C) r5).rl(r4) == r0) goto L15;
                             */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = this.f3297n;
                                if (i2 != 0) {
                                    if (i2 != 1) {
                                        if (i2 == 2) {
                                            ResultKt.throwOnFailure(obj);
                                            return Unit.INSTANCE;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    ResultKt.throwOnFailure(obj);
                                    P p2 = this.f3298t;
                                    this.f3297n = 1;
                                    obj = p2.await(this);
                                    if (obj != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                }
                                this.f3297n = 2;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(vd vdVar, Continuation continuation) {
                            return ((C0120j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0120j(Wzh.j jVar, Continuation continuation) {
                            super(2, continuation);
                            this.f3294O = jVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            C0120j c0120j = new C0120j(this.f3294O, continuation);
                            c0120j.f3296t = obj;
                            return c0120j;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.f3295n == 0) {
                                ResultKt.throwOnFailure(obj);
                                vd vdVar = (vd) this.f3296t;
                                Iterator it = this.f3294O.t().iterator();
                                while (it.hasNext()) {
                                    GJW.C.nr(vdVar, null, null, new C0121j((P) it.next(), null), 3, null);
                                }
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(vd vdVar, Continuation continuation) {
                        return ((C0119j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0119j(Wzh.j jVar, Continuation continuation) {
                        super(2, continuation);
                        this.f3293t = jVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C0119j(this.f3293t, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f3292n;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            C0120j c0120j = new C0120j(this.f3293t, null);
                            this.f3292n = 1;
                            if (N.t(c0120j, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vd vdVar, Continuation continuation) {
                    return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                n(j jVar, Continuation continuation) {
                    super(2, continuation);
                    this.f3291t = jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new n(this.f3291t, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f3290n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Wzh.j jVar = this.f3291t.qie;
                        V1 v1 = V1.f3456n;
                        C0119j c0119j = new C0119j(jVar, null);
                        this.f3290n = 1;
                        if (GJW.Dsr.Uo(v1, c0119j, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0114j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0114j(j jVar, Continuation continuation) {
                super(2, continuation);
                this.f3278O = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0114j c0114j = new C0114j(this.f3278O, continuation);
                c0114j.f3280t = obj;
                return c0114j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f3279n == 0) {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f3280t;
                    GJW.C.nr(vdVar, null, null, new C0115j(this.f3278O, null), 3, null);
                    GJW.C.nr(vdVar, null, null, new n(this.f3278O, null), 3, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            yB.j jVar;
            j jVar2;
            yB.j jVar3;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3275O;
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            jVar3 = (yB.j) this.f3276n;
                            try {
                                ResultKt.throwOnFailure(obj);
                                Unit unit = Unit.INSTANCE;
                                jVar3.T(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                jVar3.T(null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar2 = (j) this.f3277t;
                    yB.j jVar4 = (yB.j) this.f3276n;
                    ResultKt.throwOnFailure(obj);
                    jVar = jVar4;
                } else {
                    ResultKt.throwOnFailure(obj);
                    jVar = j.this.gh;
                    jVar2 = j.this;
                    this.f3276n = jVar;
                    this.f3277t = jVar2;
                    this.f3275O = 1;
                    if (jVar.Z(null, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                C0114j c0114j = new C0114j(jVar2, null);
                this.f3276n = jVar;
                this.f3277t = null;
                this.f3275O = 2;
                if (N.t(c0114j, this) != coroutine_suspended) {
                    jVar3 = jVar;
                    Unit unit2 = Unit.INSTANCE;
                    jVar3.T(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                jVar3 = jVar;
                th = th3;
                jVar3.T(null);
                throw th;
            }
        }
    }

    static final class Pl extends SuspendLambda implements Function2 {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f3299O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ I28.j f3300Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3301n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ j f3302o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f3303r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3304t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Pl(long j2, j jVar, I28.j jVar2, Continuation continuation) {
            super(2, continuation);
            this.f3303r = j2;
            this.f3302o = jVar;
            this.f3300Z = jVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Pl pl = new Pl(this.f3303r, this.f3302o, this.f3300Z, continuation);
            pl.J2 = obj;
            return pl;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        
            if (r8 != r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws UnhandledFailureException {
            Fw3.C c2;
            j jVar;
            Fw3.o oVar;
            I28.j jVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3299O;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ResultKt.throwOnFailure(obj);
                            return (Fw3.C) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = (Fw3.o) this.f3304t;
                    jVar2 = (I28.j) this.f3301n;
                    jVar = (j) this.J2;
                    ResultKt.throwOnFailure(obj);
                    MoG.j jVarN = jVar2.n();
                    this.J2 = null;
                    this.f3301n = null;
                    this.f3304t = null;
                    this.f3299O = 3;
                    obj = jVar.HI("VideoRenderingFailure", jVarN, oVar, this);
                } else {
                    c2 = (Fw3.C) this.J2;
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                c2 = (Fw3.C) this.J2;
                long jNr = Fw3.n.nr(this.f3303r);
                this.J2 = c2;
                this.f3299O = 1;
                obj = c2.KN(jNr, false, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            LQ.j jVar3 = (LQ.j) obj;
            jVar = this.f3302o;
            I28.j jVar4 = this.f3300Z;
            if (jVar3 instanceof j.n) {
                Fw3.o oVar2 = (Fw3.o) ((j.n) jVar3).n();
                this.J2 = jVar;
                this.f3301n = jVar4;
                this.f3304t = oVar2;
                this.f3299O = 2;
                if (c2.rl(this) != coroutine_suspended) {
                    oVar = oVar2;
                    jVar2 = jVar4;
                    MoG.j jVarN2 = jVar2.n();
                    this.J2 = null;
                    this.f3301n = null;
                    this.f3304t = null;
                    this.f3299O = 3;
                    obj = jVar.HI("VideoRenderingFailure", jVarN2, oVar, this);
                }
                return coroutine_suspended;
            }
            if (jVar3 instanceof j.w6) {
                return c2;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Fw3.C c2, Continuation continuation) {
            return ((Pl) create(c2, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class QJ extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Set f3305n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        QJ(Set set) {
            super(1);
            this.f3305n = set;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(gB.I28 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(this.f3305n.contains(it));
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ gB.I28 f3306O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3307n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(gB.I28 i28, Continuation continuation) {
            super(2, continuation);
            this.f3306O = i28;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new Wre(this.f3306O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3307n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j jVar = j.this;
            MoG.j jVarN = ((I28.j) this.f3306O).n();
            this.f3307n = 1;
            Object objR = jVar.r(jVarN, this);
            if (objR == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objR;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I28.j jVar, Continuation continuation) {
            return ((Wre) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* synthetic */ class Xo extends FunctionReferenceImpl implements Function2, SuspendFunction {
        Xo(Object obj) {
            super(2, obj, j.class, "newTextureFor", "newTextureFor(Lcom/bendingspoons/fellini/fmfoundation/graphicpipeline/internal/GraphicResourceDescriptor$Image;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I28.n nVar, Continuation continuation) {
            return ((j) this.receiver).Ik(nVar, continuation);
        }
    }

    static final class aC extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f3309O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3310n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f3311o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3313t;

        aC(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f3311o |= Integer.MIN_VALUE;
            return j.this.Z(null, this);
        }
    }

    /* JADX INFO: renamed from: Fw3.j$c, reason: case insensitive filesystem */
    static final class C1357c extends RestrictedSuspendLambda implements Function2 {
        private /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f3314O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ j f3315Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3316n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Sequence f3317o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Fw3.Dsr f3318r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3319t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1357c(Fw3.Dsr dsr, Sequence sequence, j jVar, Continuation continuation) {
            super(2, continuation);
            this.f3318r = dsr;
            this.f3317o = sequence;
            this.f3315Z = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C1357c c1357c = new C1357c(this.f3318r, this.f3317o, this.f3315Z, continuation);
            c1357c.J2 = obj;
            return c1357c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
            return ((C1357c) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            Fw3.Dsr dsrRl;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3314O;
            if (i2 != 0) {
                if (i2 == 1) {
                    it = (Iterator) this.f3319t;
                    Fw3.Dsr dsr = (Fw3.Dsr) this.f3316n;
                    sequenceScope = (SequenceScope) this.J2;
                    ResultKt.throwOnFailure(obj);
                    dsrRl = dsr;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.J2;
                sequenceScope = sequenceScope2;
                dsrRl = this.f3318r;
                it = this.f3317o.iterator();
            }
            while (it.hasNext()) {
                gB.I28 i28 = (gB.I28) it.next();
                Fw3.Dsr dsrAYN = this.f3315Z.aYN(i28);
                if (Fw3.aC.n(dsrRl, dsrAYN)) {
                    dsrRl = Fw3.aC.rl(dsrRl, dsrAYN);
                    this.J2 = sequenceScope;
                    this.f3316n = dsrRl;
                    this.f3319t = it;
                    this.f3314O = 1;
                    if (sequenceScope.yield(i28, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class eO extends SuspendLambda implements Function2 {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f3320O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ I28.j f3321Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3322n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ j f3323o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f3324r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3325t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eO(long j2, j jVar, I28.j jVar2, Continuation continuation) {
            super(2, continuation);
            this.f3324r = j2;
            this.f3323o = jVar;
            this.f3321Z = jVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            eO eOVar = new eO(this.f3324r, this.f3323o, this.f3321Z, continuation);
            eOVar.J2 = obj;
            return eOVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
        
            if (r8 != r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws UnhandledFailureException {
            Fw3.C c2;
            j jVar;
            Fw3.o oVar;
            I28.j jVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3320O;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ResultKt.throwOnFailure(obj);
                            return (Fw3.C) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = (Fw3.o) this.f3325t;
                    jVar2 = (I28.j) this.f3322n;
                    jVar = (j) this.J2;
                    ResultKt.throwOnFailure(obj);
                    MoG.j jVarN = jVar2.n();
                    this.J2 = null;
                    this.f3322n = null;
                    this.f3325t = null;
                    this.f3320O = 3;
                    obj = jVar.HI("VideoRenderingFailure", jVarN, oVar, this);
                } else {
                    c2 = (Fw3.C) this.J2;
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                c2 = (Fw3.C) this.J2;
                long jNr = Fw3.n.nr(this.f3324r);
                this.J2 = c2;
                this.f3320O = 1;
                obj = c2.KN(jNr, true, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            LQ.j jVar3 = (LQ.j) obj;
            jVar = this.f3323o;
            I28.j jVar4 = this.f3321Z;
            if (jVar3 instanceof j.n) {
                Fw3.o oVar2 = (Fw3.o) ((j.n) jVar3).n();
                this.J2 = jVar;
                this.f3322n = jVar4;
                this.f3325t = oVar2;
                this.f3320O = 2;
                if (c2.rl(this) != coroutine_suspended) {
                    oVar = oVar2;
                    jVar2 = jVar4;
                    MoG.j jVarN2 = jVar2.n();
                    this.J2 = null;
                    this.f3322n = null;
                    this.f3325t = null;
                    this.f3320O = 3;
                    obj = jVar.HI("VideoRenderingFailure", jVarN2, oVar, this);
                }
                return coroutine_suspended;
            }
            if (jVar3 instanceof j.w6) {
                return c2;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Fw3.C c2, Continuation continuation) {
            return ((eO) create(c2, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class fuX extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3327n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f3328t;

        fuX(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3328t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.Ik(null, this);
        }
    }

    /* JADX INFO: renamed from: Fw3.j$j, reason: collision with other inner class name */
    public static final class C0122j {
        public /* synthetic */ C0122j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0122j() {
        }
    }

    public static final class l3D extends AbstractCoroutineContextElement implements iwV {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ j f3329n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l3D(iwV.j jVar, j jVar2) {
            super(jVar);
            this.f3329n = jVar2;
        }

        @Override // GJW.iwV
        public void a(CoroutineContext coroutineContext, Throwable th) {
            this.f3329n.f3258O.n("ResourceReleaseException", "An exception occurred while releasing a resource", th);
        }
    }

    public enum n {
        THROW,
        PLACEHOLDER_TEXTURE
    }

    static final class o extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f3333O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f3334S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3336n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f3337o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3338r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3339t;

        o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3337o = obj;
            this.f3334S |= Integer.MIN_VALUE;
            return j.this.rl(null, this);
        }
    }

    static final class qz extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ I28.j f3340O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3341n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        qz(I28.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f3340O = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new qz(this.f3340O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3341n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j jVar = j.this;
            MoG.j jVarN = this.f3340O.n();
            this.f3341n = 1;
            Object objR = jVar.r(jVarN, this);
            if (objR == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objR;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I28.j jVar, Continuation continuation) {
            return ((qz) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class z extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Set f3343n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(Set set) {
            super(1);
            this.f3343n = set;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(gB.I28 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(this.f3343n.contains(it));
        }
    }

    public j(Context androidContext, w6.n resourceProvider, gB.CN3 resourceLoader, Fw3.Dsr resourceLimit, VD.j logger, n failurePolicy, Qp.j rendererFactory, kG.fuX gifFrameRetrieverFactory, vd backgroundScope) {
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
        Intrinsics.checkNotNullParameter(resourceLimit, "resourceLimit");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(failurePolicy, "failurePolicy");
        Intrinsics.checkNotNullParameter(rendererFactory, "rendererFactory");
        Intrinsics.checkNotNullParameter(gifFrameRetrieverFactory, "gifFrameRetrieverFactory");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        this.f3259n = androidContext;
        this.rl = resourceProvider;
        this.f3260t = resourceLoader;
        this.nr = resourceLimit;
        this.f3258O = logger;
        this.J2 = failurePolicy;
        this.Uo = rendererFactory;
        this.KN = gifFrameRetrieverFactory;
        this.xMQ = backgroundScope;
        this.mUb = new l3D(iwV.rl, this);
        this.gh = yB.CN3.rl(false, 1, null);
        j.EnumC0421j enumC0421j = j.EnumC0421j.ACCESS;
        this.qie = new Wzh.j(backgroundScope, enumC0421j);
        this.az = new Wzh.j(backgroundScope, enumC0421j);
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.THROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.PLACEHOLDER_TEXTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object HI(String str, MoG.j jVar, Object obj, Continuation continuation) throws UnhandledFailureException {
        CN3 cn3;
        if (continuation instanceof CN3) {
            cn3 = (CN3) continuation;
            int i2 = cn3.f3268O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn3.f3268O = i2 - Integer.MIN_VALUE;
            } else {
                cn3 = new CN3(continuation);
            }
        }
        Object objXQ = cn3.f3269n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cn3.f3268O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objXQ);
            int i5 = w6.$EnumSwitchMapping$0[this.J2.ordinal()];
            if (i5 == 1) {
                throw new UnhandledFailureException(obj);
            }
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            P2H.j.n(this.f3258O, str, "VideoDecodingFailure[Resource=" + jVar + ", failure=" + obj + ']');
            cn3.f3268O = 1;
            objXQ = XQ(cn3);
            if (objXQ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objXQ);
        }
        return new Fw3.w6((mF.w6) objXQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ik(I28.n nVar, Continuation continuation) throws UnhandledFailureException {
        fuX fux;
        j jVar;
        Bitmap bitmap;
        if (continuation instanceof fuX) {
            fux = (fuX) continuation;
            int i2 = fux.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fux.J2 = i2 - Integer.MIN_VALUE;
            } else {
                fux = new fuX(continuation);
            }
        }
        Object objRl = fux.f3328t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fux.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            gB.CN3 cn3 = this.f3260t;
            fux.f3327n = this;
            fux.J2 = 1;
            objRl = cn3.rl(nVar, fux);
            if (objRl != coroutine_suspended) {
                jVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ResultKt.throwOnFailure(objRl);
                return objRl;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap = (Bitmap) fux.f3327n;
            ResultKt.throwOnFailure(objRl);
            w6.Ml ml = (w6.Ml) objRl;
            bitmap.recycle();
            return ml;
        }
        jVar = (j) fux.f3327n;
        ResultKt.throwOnFailure(objRl);
        LQ.j jVar2 = (LQ.j) objRl;
        if (jVar2 instanceof j.n) {
            gB.Ml ml2 = (gB.Ml) ((j.n) jVar2).n();
            fux.f3327n = null;
            fux.J2 = 2;
            Object objTy = jVar.ty(ml2, fux);
            if (objTy != coroutine_suspended) {
                return objTy;
            }
        } else {
            if (!(jVar2 instanceof j.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Bitmap bitmap2 = (Bitmap) ((j.w6) jVar2).n();
            w6.n nVar2 = jVar.rl;
            w6.j.C1053j c1053j = new w6.j.C1053j(bitmap2);
            fux.f3327n = bitmap2;
            fux.J2 = 3;
            Object objRl2 = nVar2.rl(c1053j, fux);
            if (objRl2 != coroutine_suspended) {
                objRl = objRl2;
                bitmap = bitmap2;
                w6.Ml ml3 = (w6.Ml) objRl;
                bitmap.recycle();
                return ml3;
            }
        }
        return coroutine_suspended;
    }

    private final Object S(Set set, Continuation continuation) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (obj instanceof I28.j) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            P pAz = this.qie.remove((I28.j) it.next());
            if (pAz != null) {
                arrayList2.add(pAz);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            android.support.v4.media.j.n(it3.next());
            P pAz2 = this.az.remove(null);
            if (pAz2 != null) {
                arrayList4.add(pAz2);
            }
        }
        Object objUo = GJW.Dsr.Uo(V1.f3456n, new C(arrayList2, arrayList4, null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    private final Fw3.Dsr ViF(Iterable iterable) {
        Fw3.Dsr dsrN = Fw3.Dsr.f3224t.n();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            dsrN = Fw3.aC.t(dsrN, aYN((gB.I28) it.next()));
        }
        return dsrN;
    }

    private final Object XQ(Continuation continuation) {
        return this.rl.rl(new w6.j.n(new Oe.w6(1, 1)), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        if (r14 != r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z(MoG.QJ qj, Continuation continuation) throws UnhandledFailureException {
        aC aCVar;
        j jVar;
        MoG.QJ qj2;
        w6.InterfaceC1054w6 interfaceC1054w6;
        j jVar2;
        LQ.j jVar3;
        uPp.w6 w6Var;
        if (continuation instanceof aC) {
            aCVar = (aC) continuation;
            int i2 = aCVar.f3311o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aCVar.f3311o = i2 - Integer.MIN_VALUE;
            } else {
                aCVar = new aC(continuation);
            }
        }
        aC aCVar2 = aCVar;
        Object objN = aCVar2.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aCVar2.f3311o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            w6.n nVar = this.rl;
            aCVar2.f3310n = this;
            aCVar2.f3313t = qj;
            aCVar2.f3311o = 1;
            objN = nVar.n(aCVar2);
            if (objN != coroutine_suspended) {
                jVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            qj = (MoG.QJ) aCVar2.f3313t;
            j jVar4 = (j) aCVar2.f3310n;
            ResultKt.throwOnFailure(objN);
            jVar = jVar4;
        } else {
            if (i3 == 2) {
                interfaceC1054w6 = (w6.InterfaceC1054w6) aCVar2.f3309O;
                qj2 = (MoG.QJ) aCVar2.f3313t;
                jVar2 = (j) aCVar2.f3310n;
                ResultKt.throwOnFailure(objN);
                jVar3 = (LQ.j) objN;
                if (jVar3 instanceof j.n) {
                    if (jVar3 instanceof j.w6) {
                        return new Fw3.qz(interfaceC1054w6, (RK.n) ((j.w6) jVar3).n());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                uPp.w6 w6Var2 = (uPp.w6) ((j.n) jVar3).n();
                aCVar2.f3310n = jVar2;
                aCVar2.f3313t = qj2;
                aCVar2.f3309O = w6Var2;
                aCVar2.f3311o = 3;
                if (interfaceC1054w6.rl(aCVar2) != coroutine_suspended) {
                    w6Var = w6Var2;
                    aCVar2.f3310n = null;
                    aCVar2.f3313t = null;
                    aCVar2.f3309O = null;
                    aCVar2.f3311o = 4;
                    objN = jVar2.HI("DecoderCreationFailure", qj2, w6Var, aCVar2);
                }
                return coroutine_suspended;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objN);
                return (Fw3.C) objN;
            }
            w6Var = (uPp.w6) aCVar2.f3309O;
            qj2 = (MoG.QJ) aCVar2.f3313t;
            jVar2 = (j) aCVar2.f3310n;
            ResultKt.throwOnFailure(objN);
            aCVar2.f3310n = null;
            aCVar2.f3313t = null;
            aCVar2.f3309O = null;
            aCVar2.f3311o = 4;
            objN = jVar2.HI("DecoderCreationFailure", qj2, w6Var, aCVar2);
        }
        w6.InterfaceC1054w6 interfaceC1054w62 = (w6.InterfaceC1054w6) objN;
        Qp.j jVar5 = jVar.Uo;
        Context context = jVar.f3259n;
        Uri uriRl = qj.rl();
        int iRl = qj.n().rl();
        Surface surfaceTy = interfaceC1054w62.ty();
        vd vdVar = jVar.xMQ;
        aCVar2.f3310n = jVar;
        aCVar2.f3313t = qj;
        aCVar2.f3309O = interfaceC1054w62;
        aCVar2.f3311o = 2;
        Object objN2 = jVar5.n(context, uriRl, iRl, surfaceTy, vdVar, aCVar2);
        if (objN2 != coroutine_suspended) {
            qj2 = qj;
            interfaceC1054w6 = interfaceC1054w62;
            objN = objN2;
            jVar2 = jVar;
            jVar3 = (LQ.j) objN;
            if (jVar3 instanceof j.n) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Fw3.Dsr aYN(gB.I28 i28) {
        return new Fw3.Dsr(ck(i28), Fw3.n.t(i28) ? 1 : 0);
    }

    private final void az(gB.I28 i28) {
        if (i28 instanceof I28.n) {
            this.az.mUb(i28, new I28(this));
        } else if (i28 instanceof I28.j) {
            this.qie.mUb(i28, new Wre(i28, null));
        }
    }

    private final long ck(gB.I28 i28) {
        if (i28 instanceof I28.n) {
            mF.w6 w6Var = (mF.w6) this.az.xMQ(i28);
            return w6Var != null ? w6Var.XQ() : Oe.Ml.O(this.f3260t.t(i28), 0, 1, null) * ((long) 3);
        }
        if (i28 instanceof I28.j) {
            return Oe.Ml.O(this.f3260t.t(i28), 0, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Sequence nY(Sequence sequence, Fw3.Dsr dsr) {
        return SequencesKt.sequence(new C1357c(dsr, sequence, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(MoG.o oVar, Continuation continuation) throws UnhandledFailureException {
        Dsr dsr;
        j jVar;
        kG.Wre wre;
        if (continuation instanceof Dsr) {
            dsr = (Dsr) continuation;
            int i2 = dsr.f3273r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dsr.f3273r = i2 - Integer.MIN_VALUE;
            } else {
                dsr = new Dsr(continuation);
            }
        }
        Object objN = dsr.f3271O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dsr.f3273r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            kG.fuX fux = this.KN;
            Context context = this.f3259n;
            Uri uriT = oVar.t();
            dsr.f3272n = this;
            dsr.f3274t = oVar;
            dsr.f3273r = 1;
            objN = fux.n(context, uriT, dsr);
            if (objN != coroutine_suspended) {
                jVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ResultKt.throwOnFailure(objN);
                return (Fw3.C) objN;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre = (kG.Wre) dsr.f3272n;
            ResultKt.throwOnFailure(objN);
            return new Fw3.Ml((w6.Ml) objN, wre);
        }
        oVar = (MoG.o) dsr.f3274t;
        jVar = (j) dsr.f3272n;
        ResultKt.throwOnFailure(objN);
        LQ.j jVar2 = (LQ.j) objN;
        if (jVar2 instanceof j.n) {
            kG.CN3 cn3 = (kG.CN3) ((j.n) jVar2).n();
            dsr.f3272n = null;
            dsr.f3274t = null;
            dsr.f3273r = 2;
            objN = jVar.HI("DecoderCreationFailure", oVar, cn3, dsr);
        } else {
            if (!(jVar2 instanceof j.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            kG.Wre wre2 = (kG.Wre) ((j.w6) jVar2).n();
            w6.n nVar = jVar.rl;
            w6.j.n nVar2 = new w6.j.n(Oe.n.rl(oVar.n()));
            dsr.f3272n = wre2;
            dsr.f3274t = null;
            dsr.f3273r = 3;
            Object objRl = nVar.rl(nVar2, dsr);
            if (objRl != coroutine_suspended) {
                objN = objRl;
                wre = wre2;
                return new Fw3.Ml((w6.Ml) objN, wre);
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(MoG.j jVar, Continuation continuation) {
        if (jVar instanceof MoG.QJ) {
            return Z((MoG.QJ) jVar, continuation);
        }
        if (jVar instanceof MoG.o) {
            return o((MoG.o) jVar, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object ty(gB.Ml ml, Continuation continuation) throws UnhandledFailureException {
        int i2 = w6.$EnumSwitchMapping$0[this.J2.ordinal()];
        if (i2 == 1) {
            throw new UnhandledFailureException(ml);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        P2H.j.n(this.f3258O, "FigureGenerationFailure", ml);
        return XQ(continuation);
    }

    @Override // gB.j
    public Object n(Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(this.mUb, new Ml(null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[PHI: r0 r4 r5 r8 r9 r14
      0x0076: PHI (r0v23 java.lang.Object) = (r0v22 java.lang.Object), (r0v1 java.lang.Object) binds: [B:62:0x01ca, B:24:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r4v11 java.lang.Iterable) = (r4v8 java.util.Set), (r4v26 java.lang.Iterable) binds: [B:62:0x01ca, B:24:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r5v4 java.util.List) = (r5v1 java.util.List), (r5v7 java.util.List) binds: [B:62:0x01ca, B:24:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r8v3 ??) = (r8v10 ??), (r8v11 ??) binds: [B:62:0x01ca, B:24:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r9v6 gB.j$j) = (r9v5 gB.j$j), (r9v15 gB.j$j) binds: [B:62:0x01ca, B:24:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r14v1 Fw3.j) = (r14v0 Fw3.j), (r14v2 Fw3.j) binds: [B:62:0x01ca, B:24:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff A[Catch: all -> 0x007a, LOOP:2: B:41:0x00f9->B:43:0x00ff, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007a, blocks: (B:23:0x0071, B:29:0x008d, B:43:0x00ff, B:48:0x0127), top: B:91:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127 A[Catch: all -> 0x007a, LOOP:3: B:46:0x0121->B:48:0x0127, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007a, blocks: (B:23:0x0071, B:29:0x008d, B:43:0x00ff, B:48:0x0127), top: B:91:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159 A[Catch: all -> 0x0196, LOOP:4: B:51:0x0153->B:53:0x0159, LOOP_END, TryCatch #2 {all -> 0x0196, blocks: (B:40:0x00e6, B:41:0x00f9, B:45:0x0115, B:46:0x0121, B:50:0x013e, B:51:0x0153, B:53:0x0159, B:57:0x019b, B:58:0x01a3, B:60:0x01a9, B:61:0x01b3), top: B:89:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a9 A[Catch: all -> 0x0196, LOOP:5: B:58:0x01a3->B:60:0x01a9, LOOP_END, TryCatch #2 {all -> 0x0196, blocks: (B:40:0x00e6, B:41:0x00f9, B:45:0x0115, B:46:0x0121, B:50:0x013e, B:51:0x0153, B:53:0x0159, B:57:0x019b, B:58:0x01a3, B:60:0x01a9, B:61:0x01b3), top: B:89:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020d A[Catch: all -> 0x021b, LOOP:0: B:69:0x0207->B:71:0x020d, LOOP_END, TryCatch #4 {all -> 0x021b, blocks: (B:68:0x01f6, B:69:0x0207, B:71:0x020d, B:74:0x021f, B:75:0x022f, B:77:0x0235, B:78:0x0258, B:36:0x00c0), top: B:92:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0235 A[Catch: all -> 0x021b, LOOP:1: B:75:0x022f->B:77:0x0235, LOOP_END, TryCatch #4 {all -> 0x021b, blocks: (B:68:0x01f6, B:69:0x0207, B:71:0x020d, B:74:0x021f, B:75:0x022f, B:77:0x0235, B:78:0x0258, B:36:0x00c0), top: B:92:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v15, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [yB.j] */
    @Override // gB.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(j.C0937j c0937j, Continuation continuation) throws Throwable {
        o oVar;
        ?? r6;
        Object obj;
        ?? r62;
        j.C0937j c0937j2;
        ?? r9;
        j jVar;
        ?? r8;
        j.C0937j c0937j3;
        Set set;
        j jVar2;
        ?? r63;
        Iterator it;
        Iterator it2;
        List list;
        Iterator it3;
        Set setN;
        ?? r82;
        j.C0937j c0937j4;
        List listZip;
        Object objN;
        Iterable iterable;
        j jVar3;
        ?? r64;
        Iterator it4;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.f3334S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.f3334S = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        }
        Object objN2 = oVar.f3337o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oVar.f3334S;
        try {
        } catch (Throwable th) {
            th = th;
            r6 = 2;
        }
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objN2);
                yB.j jVar4 = this.gh;
                oVar.f3336n = this;
                c0937j2 = c0937j;
                oVar.f3339t = c0937j2;
                oVar.f3333O = jVar4;
                oVar.f3334S = 1;
                if (jVar4.Z(null, oVar) != coroutine_suspended) {
                    r9 = jVar4;
                    jVar = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    set = (Set) oVar.J2;
                    yB.j jVar5 = (yB.j) oVar.f3333O;
                    c0937j3 = (j.C0937j) oVar.f3339t;
                    jVar = (j) oVar.f3336n;
                    ResultKt.throwOnFailure(objN2);
                    r8 = jVar5;
                    jVar2 = jVar;
                    try {
                        Set setN2 = c0937j3.n();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setN2, 10));
                        it = setN2.iterator();
                        while (it.hasNext()) {
                            android.support.v4.media.j.n(it.next());
                            arrayList.add(jVar2.az.mUb(null, new Xo(jVar2)));
                        }
                        it2 = c0937j3.nr().entrySet().iterator();
                        while (it2.hasNext()) {
                            I28.j jVar6 = (I28.j) ((Map.Entry) it2.next()).getKey();
                            jVar2.qie.mUb(jVar6, jVar2.new qz(jVar6, null));
                        }
                        Map mapNr = c0937j3.nr();
                        ArrayList arrayList2 = new ArrayList(mapNr.size());
                        for (Map.Entry entry : mapNr.entrySet()) {
                            I28.j jVar7 = (I28.j) entry.getKey();
                            ArrayList arrayList3 = arrayList2;
                            arrayList3.add(Wzh.w6.t(jVar2.qie, jVar7, new eO(((d2n.Ml) entry.getValue()).Ik(), jVar2, jVar7, null)));
                            arrayList2 = arrayList3;
                            arrayList = arrayList;
                        }
                        ArrayList arrayList4 = arrayList;
                        list = arrayList2;
                        it3 = set.iterator();
                        while (it3.hasNext()) {
                            jVar2.az((gB.I28) it3.next());
                        }
                        setN = c0937j3.n();
                        oVar.f3336n = jVar2;
                        oVar.f3339t = c0937j3;
                        oVar.f3333O = r8;
                        oVar.J2 = list;
                        oVar.f3338r = setN;
                        oVar.f3334S = 3;
                        objN2 = GJW.Wre.n(arrayList4, oVar);
                        r82 = r8;
                        if (objN2 != coroutine_suspended) {
                            r63 = r82;
                            c0937j4 = c0937j3;
                            listZip = CollectionsKt.zip(setN, (Iterable) objN2);
                            Set setKeySet = c0937j4.nr().keySet();
                            oVar.f3336n = jVar2;
                            oVar.f3339t = c0937j4;
                            oVar.f3333O = r63;
                            oVar.J2 = listZip;
                            oVar.f3338r = setKeySet;
                            oVar.f3334S = 4;
                            objN = GJW.Wre.n(list, oVar);
                            if (objN != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        r63 = r8;
                        obj = null;
                        r62 = r63;
                        r62.T(obj);
                        throw th;
                    }
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iterable = (Iterable) oVar.f3338r;
                    listZip = (List) oVar.J2;
                    r6 = (yB.j) oVar.f3333O;
                    c0937j4 = (j.C0937j) oVar.f3339t;
                    j jVar8 = (j) oVar.f3336n;
                    try {
                        ResultKt.throwOnFailure(objN2);
                        jVar3 = jVar8;
                        r64 = r6;
                        List list2 = listZip;
                        r9 = r64;
                        Iterable iterable2 = (Iterable) objN2;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                        it4 = iterable2.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(((Fw3.C) it4.next()).S());
                        }
                        List listZip2 = CollectionsKt.zip(iterable, arrayList5);
                        for (Map.Entry entry2 : c0937j4.rl().entrySet()) {
                            I28.j jVar9 = (I28.j) entry2.getKey();
                            jVar3.qie.ty(jVar9, new Pl(((d2n.Ml) entry2.getValue()).Ik(), jVar3, jVar9, null));
                        }
                        Map map = MapsKt.toMap(CollectionsKt.plus((Collection) list2, (Iterable) listZip2));
                        r9.T(null);
                        return map;
                    } catch (Throwable th3) {
                        th = th3;
                        obj = null;
                        r62 = r6;
                        r62.T(obj);
                        throw th;
                    }
                }
                setN = (Iterable) oVar.f3338r;
                List list3 = (List) oVar.J2;
                yB.j jVar10 = (yB.j) oVar.f3333O;
                c0937j3 = (j.C0937j) oVar.f3339t;
                j jVar11 = (j) oVar.f3336n;
                ResultKt.throwOnFailure(objN2);
                list = list3;
                jVar2 = jVar11;
                r82 = jVar10;
                r63 = r82;
                c0937j4 = c0937j3;
                try {
                    listZip = CollectionsKt.zip(setN, (Iterable) objN2);
                    Set setKeySet2 = c0937j4.nr().keySet();
                    oVar.f3336n = jVar2;
                    oVar.f3339t = c0937j4;
                    oVar.f3333O = r63;
                    oVar.J2 = listZip;
                    oVar.f3338r = setKeySet2;
                    oVar.f3334S = 4;
                    objN = GJW.Wre.n(list, oVar);
                    if (objN != coroutine_suspended) {
                        iterable = setKeySet2;
                        objN2 = objN;
                        jVar3 = jVar2;
                        r64 = r63;
                        List list22 = listZip;
                        r9 = r64;
                        Iterable iterable22 = (Iterable) objN2;
                        ArrayList arrayList52 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable22, 10));
                        it4 = iterable22.iterator();
                        while (it4.hasNext()) {
                        }
                        List listZip22 = CollectionsKt.zip(iterable, arrayList52);
                        while (r10.hasNext()) {
                        }
                        Map map2 = MapsKt.toMap(CollectionsKt.plus((Collection) list22, (Iterable) listZip22));
                        r9.T(null);
                        return map2;
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th = th4;
                    obj = null;
                    r62 = r63;
                    r62.T(obj);
                    throw th;
                }
            }
            yB.j jVar12 = (yB.j) oVar.f3333O;
            j.C0937j c0937j5 = (j.C0937j) oVar.f3339t;
            jVar = (j) oVar.f3336n;
            ResultKt.throwOnFailure(objN2);
            r9 = jVar12;
            c0937j2 = c0937j5;
            Pair pairWPU = jVar.WPU(c0937j2);
            Set set2 = (Set) pairWPU.component1();
            Set set3 = (Set) pairWPU.component2();
            oVar.f3336n = jVar;
            oVar.f3339t = c0937j2;
            oVar.f3333O = r9;
            oVar.J2 = set2;
            oVar.f3334S = 2;
            if (jVar.S(set3, oVar) != coroutine_suspended) {
                r8 = r9;
                c0937j3 = c0937j2;
                set = set2;
                jVar2 = jVar;
                Set setN22 = c0937j3.n();
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setN22, 10));
                it = setN22.iterator();
                while (it.hasNext()) {
                }
                it2 = c0937j3.nr().entrySet().iterator();
                while (it2.hasNext()) {
                }
                Map mapNr2 = c0937j3.nr();
                ArrayList arrayList22 = new ArrayList(mapNr2.size());
                while (r0.hasNext()) {
                }
                ArrayList arrayList42 = arrayList6;
                list = arrayList22;
                it3 = set.iterator();
                while (it3.hasNext()) {
                }
                setN = c0937j3.n();
                oVar.f3336n = jVar2;
                oVar.f3339t = c0937j3;
                oVar.f3333O = r8;
                oVar.J2 = list;
                oVar.f3338r = setN;
                oVar.f3334S = 3;
                objN2 = GJW.Wre.n(arrayList42, oVar);
                r82 = r8;
                if (objN2 != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th5) {
            th = th5;
            r63 = r9;
            obj = null;
            r62 = r63;
            r62.T(obj);
            throw th;
        }
    }

    private final Pair WPU(j.C0937j c0937j) {
        Set setPlus = SetsKt.plus(c0937j.n(), (Iterable) c0937j.nr().keySet());
        Fw3.Dsr dsrRl = Fw3.aC.rl(this.nr, ViF(setPlus));
        Set set = SequencesKt.toSet(nY(SequencesKt.filterNot(CollectionsKt.asSequence(c0937j.t()), new QJ(setPlus)), dsrRl));
        Set set2 = set;
        Fw3.Dsr dsrRl2 = Fw3.aC.rl(dsrRl, ViF(set2));
        Set setPlus2 = SetsKt.plus(setPlus, (Iterable) set2);
        Set setPlus3 = SetsKt.plus(this.az.keySet(), (Iterable) this.qie.keySet());
        return TuplesKt.to(set, SetsKt.minus(SetsKt.minus(setPlus3, (Iterable) SequencesKt.toSet(nY(SequencesKt.filterNot(CollectionsKt.asSequence(CollectionsKt.reversed(setPlus3)), new z(setPlus2)), dsrRl2))), (Iterable) setPlus2));
    }

    public /* synthetic */ j(Context context, w6.n nVar, gB.CN3 cn3, Fw3.Dsr dsr, VD.j jVar, n nVar2, Qp.j jVar2, kG.fuX fux, vd vdVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, nVar, cn3, (i2 & 8) != 0 ? HI : dsr, jVar, (i2 & 32) != 0 ? n.PLACEHOLDER_TEXTURE : nVar2, (i2 & 64) != 0 ? AbstractC2406j.n() : jVar2, (i2 & 128) != 0 ? JI5.j.n() : fux, (i2 & 256) != 0 ? Lu.n(OU.n()) : vdVar);
    }
}
