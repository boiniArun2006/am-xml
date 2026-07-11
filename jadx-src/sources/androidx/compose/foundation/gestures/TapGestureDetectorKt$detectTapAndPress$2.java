package androidx.compose.foundation.gestures;

import GJW.C;
import GJW.vd;
import GJW.xuv;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ PointerInputScope f17104O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f17105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ PressGestureScopeImpl f17106o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function1 f17107r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f17108t;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {0, 0, 1}, l = {251, 257}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "resetJob", "resetJob"}, s = {"L$0", "L$1", "L$0"})
    @SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1#2:551\n*E\n"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ vd J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private /* synthetic */ Object f17109O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ PressGestureScopeImpl f17110Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f17111n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f17112o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function3 f17113r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f17114t;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
        static final class C05011 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputChange J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ PressGestureScopeImpl f17115O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17116n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function3 f17117t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C05011(Function3 function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation continuation) {
                super(2, continuation);
                this.f17117t = function3;
                this.f17115O = pressGestureScopeImpl;
                this.J2 = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C05011(this.f17117t, this.f17115O, this.J2, continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vd vdVar, Continuation continuation) {
                return ((C05011) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                return invoke2(vdVar, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f17116n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Function3 function3 = this.f17117t;
                    PressGestureScopeImpl pressGestureScopeImpl = this.f17115O;
                    Offset offsetNr = Offset.nr(this.J2.getPosition());
                    this.f17116n = 1;
                    if (function3.invoke(pressGestureScopeImpl, offsetNr, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17118n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ PressGestureScopeImpl f17119t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.f17119t = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f17119t, continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vd vdVar, Continuation continuation) {
                return ((AnonymousClass2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                return invoke2(vdVar, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f17118n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f17119t.nr();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17120n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ PressGestureScopeImpl f17121t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.f17121t = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f17121t, continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vd vdVar, Continuation continuation) {
                return ((AnonymousClass3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                return invoke2(vdVar, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f17120n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f17121t.J2();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.J2, this.f17113r, this.f17112o, this.f17110Z, continuation);
            anonymousClass1.f17109O = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(vd vdVar, Function3 function3, Function1 function1, PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
            super(2, continuation);
            this.J2 = vdVar;
            this.f17113r = function3;
            this.f17112o = function1;
            this.f17110Z = pressGestureScopeImpl;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
        
            if (r0 == r6) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            Object objJ2;
            xuv xuvVar;
            Object objS;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f17114t;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.f17109O;
                xuv xuvVarNr = C.nr(this.J2, null, TapGestureDetectorKt.ty(), new TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1(this.f17110Z, null), 1, null);
                this.f17109O = awaitPointerEventScope;
                this.f17111n = xuvVarNr;
                this.f17114t = 1;
                objJ2 = TapGestureDetectorKt.J2(awaitPointerEventScope, false, null, this, 3, null);
                if (objJ2 != coroutine_suspended) {
                    xuvVar = xuvVarNr;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xuv xuvVar2 = (xuv) this.f17109O;
                ResultKt.throwOnFailure(obj);
                xuvVar = xuvVar2;
                objS = obj;
                PointerInputChange pointerInputChange = (PointerInputChange) objS;
                if (pointerInputChange == null) {
                    TapGestureDetectorKt.r(this.J2, xuvVar, null, new AnonymousClass2(this.f17110Z, null), 2, null);
                } else {
                    pointerInputChange.n();
                    TapGestureDetectorKt.r(this.J2, xuvVar, null, new AnonymousClass3(this.f17110Z, null), 2, null);
                    Function1 function1 = this.f17112o;
                    if (function1 != null) {
                        function1.invoke(Offset.nr(pointerInputChange.getPosition()));
                    }
                }
                return Unit.INSTANCE;
            }
            xuv xuvVar3 = (xuv) this.f17111n;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.f17109O;
            ResultKt.throwOnFailure(obj);
            xuvVar = xuvVar3;
            awaitPointerEventScope = awaitPointerEventScope2;
            objJ2 = obj;
            PointerInputChange pointerInputChange2 = (PointerInputChange) objJ2;
            pointerInputChange2.n();
            if (this.f17113r != TapGestureDetectorKt.f17088n) {
                TapGestureDetectorKt.r(this.J2, xuvVar, null, new C05011(this.f17113r, this.f17110Z, pointerInputChange2, null), 2, null);
            }
            this.f17109O = xuvVar;
            this.f17111n = null;
            this.f17114t = 2;
            objS = TapGestureDetectorKt.S(awaitPointerEventScope, null, this, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$detectTapAndPress$2(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
        super(2, continuation);
        this.f17104O = pointerInputScope;
        this.J2 = function3;
        this.f17107r = function1;
        this.f17106o = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.f17104O, this.J2, this.f17107r, this.f17106o, continuation);
        tapGestureDetectorKt$detectTapAndPress$2.f17108t = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f17105n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            vd vdVar = (vd) this.f17108t;
            PointerInputScope pointerInputScope = this.f17104O;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(vdVar, this.J2, this.f17107r, this.f17106o, null);
            this.f17105n = 1;
            if (ForEachGestureKt.O(pointerInputScope, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
