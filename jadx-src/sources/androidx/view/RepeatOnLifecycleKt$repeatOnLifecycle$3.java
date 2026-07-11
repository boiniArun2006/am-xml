package androidx.view;

import GJW.C;
import GJW.DC;
import GJW.Dsr;
import GJW.Lu;
import GJW.OU;
import GJW.Pl;
import GJW.eO;
import GJW.vd;
import GJW.xuv;
import androidx.view.Lifecycle;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import yB.CN3;
import yB.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle.State J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Lifecycle f38953O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f38954n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function2 f38955r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f38956t;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {161}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n318#2,11:161\n1#3:172\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n96#1:161,11\n*E\n"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ vd E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f38957O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Lifecycle f38958S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f38959Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2 f38960e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Lifecycle.State f38961g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f38962n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f38963o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f38964r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f38965t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f38958S, this.f38961g, this.E2, this.f38960e, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, vd vdVar, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f38958S = lifecycle;
            this.f38961g = state;
            this.E2 = vdVar;
            this.f38960e = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef objectRef;
            Throwable th;
            Ref.ObjectRef objectRef2;
            xuv xuvVar;
            LifecycleEventObserver lifecycleEventObserver;
            xuv xuvVar2;
            LifecycleEventObserver lifecycleEventObserver2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f38959Z;
            if (i2 != 0) {
                if (i2 == 1) {
                    objectRef = (Ref.ObjectRef) this.f38965t;
                    objectRef2 = (Ref.ObjectRef) this.f38962n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        xuvVar2 = (xuv) objectRef2.element;
                        if (xuvVar2 != null) {
                            xuv.j.rl(xuvVar2, null, 1, null);
                        }
                        lifecycleEventObserver2 = (LifecycleEventObserver) objectRef.element;
                        if (lifecycleEventObserver2 != null) {
                            this.f38958S.nr(lifecycleEventObserver2);
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        xuvVar = (xuv) objectRef2.element;
                        if (xuvVar != null) {
                        }
                        lifecycleEventObserver = (LifecycleEventObserver) objectRef.element;
                        if (lifecycleEventObserver == null) {
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.f38958S.getState() == Lifecycle.State.f38882n) {
                    return Unit.INSTANCE;
                }
                final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef = new Ref.ObjectRef();
                try {
                    Lifecycle.State state = this.f38961g;
                    Lifecycle lifecycle = this.f38958S;
                    final vd vdVar = this.E2;
                    final Function2 function2 = this.f38960e;
                    this.f38962n = objectRef3;
                    this.f38965t = objectRef;
                    this.f38957O = state;
                    this.J2 = lifecycle;
                    this.f38964r = vdVar;
                    this.f38963o = function2;
                    this.f38959Z = 1;
                    final eO eOVar = new eO(IntrinsicsKt.intercepted(this), 1);
                    eOVar.e();
                    Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                    final Lifecycle.Event eventT = companion.t(state);
                    final Lifecycle.Event eventN = companion.n(state);
                    final j jVarRl = CN3.rl(false, 1, null);
                    ?? r42 = new LifecycleEventObserver() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
                        @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {165, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
                        @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,160:1\n116#2,10:161\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n*L\n110#1:161,10\n*E\n"})
                        static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                            final /* synthetic */ j J2;

                            /* JADX INFO: renamed from: O, reason: collision with root package name */
                            int f38972O;

                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                            Object f38973n;

                            /* JADX INFO: renamed from: r, reason: collision with root package name */
                            final /* synthetic */ Function2 f38974r;

                            /* JADX INFO: renamed from: t, reason: collision with root package name */
                            Object f38975t;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object obj, Continuation continuation) {
                                return new AnonymousClass1(this.J2, this.f38974r, continuation);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final Object invoke2(vd vdVar, Continuation continuation) {
                                return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(j jVar, Function2 function2, Continuation continuation) {
                                super(2, continuation);
                                this.J2 = jVar;
                                this.f38974r = function2;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                return invoke2(vdVar, (Continuation) continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) throws Throwable {
                                j jVar;
                                Function2 function2;
                                j jVar2;
                                Throwable th;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = this.f38972O;
                                try {
                                    if (i2 != 0) {
                                        if (i2 != 1) {
                                            if (i2 == 2) {
                                                jVar2 = (j) this.f38973n;
                                                try {
                                                    ResultKt.throwOnFailure(obj);
                                                    Unit unit = Unit.INSTANCE;
                                                    jVar2.T(null);
                                                    return Unit.INSTANCE;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    jVar2.T(null);
                                                    throw th;
                                                }
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        function2 = (Function2) this.f38975t;
                                        j jVar3 = (j) this.f38973n;
                                        ResultKt.throwOnFailure(obj);
                                        jVar = jVar3;
                                    } else {
                                        ResultKt.throwOnFailure(obj);
                                        jVar = this.J2;
                                        function2 = this.f38974r;
                                        this.f38973n = jVar;
                                        this.f38975t = function2;
                                        this.f38972O = 1;
                                        if (jVar.Z(null, this) != coroutine_suspended) {
                                        }
                                        return coroutine_suspended;
                                    }
                                    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(function2, null);
                                    this.f38973n = jVar;
                                    this.f38975t = null;
                                    this.f38972O = 2;
                                    if (Lu.J2(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != coroutine_suspended) {
                                        jVar2 = jVar;
                                        Unit unit2 = Unit.INSTANCE;
                                        jVar2.T(null);
                                        return Unit.INSTANCE;
                                    }
                                    return coroutine_suspended;
                                } catch (Throwable th3) {
                                    jVar2 = jVar;
                                    th = th3;
                                    jVar2.T(null);
                                    throw th;
                                }
                            }
                        }

                        /* JADX WARN: Type inference failed for: r9v5, types: [GJW.xuv, T] */
                        @Override // androidx.view.LifecycleEventObserver
                        public final void Z(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
                            Intrinsics.checkNotNullParameter(event, "event");
                            if (event == eventT) {
                                objectRef3.element = C.nr(vdVar, null, null, new AnonymousClass1(jVarRl, function2, null), 3, null);
                                return;
                            }
                            if (event == eventN) {
                                xuv xuvVar3 = (xuv) objectRef3.element;
                                if (xuvVar3 != null) {
                                    xuv.j.rl(xuvVar3, null, 1, null);
                                }
                                objectRef3.element = null;
                            }
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                Pl pl = eOVar;
                                Result.Companion companion2 = Result.INSTANCE;
                                pl.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
                            }
                        }
                    };
                    objectRef.element = r42;
                    Intrinsics.checkNotNull(r42, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    lifecycle.n((LifecycleEventObserver) r42);
                    Object objWPU = eOVar.WPU();
                    if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (objWPU == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef3;
                    xuvVar2 = (xuv) objectRef2.element;
                    if (xuvVar2 != null) {
                    }
                    lifecycleEventObserver2 = (LifecycleEventObserver) objectRef.element;
                    if (lifecycleEventObserver2 != null) {
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    objectRef2 = objectRef3;
                    xuvVar = (xuv) objectRef2.element;
                    if (xuvVar != null) {
                        xuv.j.rl(xuvVar, null, 1, null);
                    }
                    lifecycleEventObserver = (LifecycleEventObserver) objectRef.element;
                    if (lifecycleEventObserver == null) {
                        this.f38958S.nr(lifecycleEventObserver);
                        throw th;
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f38953O = lifecycle;
        this.J2 = state;
        this.f38955r = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f38953O, this.J2, this.f38955r, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f38956t = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f38954n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            vd vdVar = (vd) this.f38956t;
            DC dcP0N = OU.t().p0N();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38953O, this.J2, vdVar, this.f38955r, null);
            this.f38954n = 1;
            if (Dsr.Uo(dcP0N, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
