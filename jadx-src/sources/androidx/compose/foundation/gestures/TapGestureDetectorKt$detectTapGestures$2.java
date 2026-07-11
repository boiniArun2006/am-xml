package androidx.compose.foundation.gestures;

import GJW.C;
import GJW.vd;
import GJW.xuv;
import androidx.compose.foundation.gestures.LongPressResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ PointerInputScope f17124O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Function1 f17125Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f17126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function1 f17127o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function1 f17128r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f17129t;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7}, l = {105, 116, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 149, 167, 169, 180}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "resetJob", "$this$awaitEachGesture", "down", "resetJob", "resetJob", "$this$awaitEachGesture", "upOrCancel", "cancelOrReleaseJob", "resetJob", "upOrCancel", "$this$awaitEachGesture", "resetJob", "upOrCancel", "secondDown", "resetJob"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1 E2;
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f17130O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Function1 f17131S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function3 f17132Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ PressGestureScopeImpl f17133e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f17134g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f17135n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ vd f17136o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f17137r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f17138t;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
        static final class C05021 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputChange J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ PressGestureScopeImpl f17139O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17140n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function3 f17141t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C05021(Function3 function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation continuation) {
                super(2, continuation);
                this.f17141t = function3;
                this.f17139O = pressGestureScopeImpl;
                this.J2 = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C05021(this.f17141t, this.f17139O, this.J2, continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vd vdVar, Continuation continuation) {
                return ((C05021) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                return invoke2(vdVar, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f17140n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Function3 function3 = this.f17141t;
                    PressGestureScopeImpl pressGestureScopeImpl = this.f17139O;
                    Offset offsetNr = Offset.nr(this.J2.getPosition());
                    this.f17140n = 1;
                    if (function3.invoke(pressGestureScopeImpl, offsetNr, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17142n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ PressGestureScopeImpl f17143t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.f17143t = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f17143t, continuation);
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
                if (this.f17142n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f17143t.J2();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17144n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ PressGestureScopeImpl f17145t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.f17145t = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f17145t, continuation);
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
                if (this.f17144n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f17145t.nr();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17146n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ PressGestureScopeImpl f17147t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.f17147t = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass4(this.f17147t, continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vd vdVar, Continuation continuation) {
                return ((AnonymousClass4) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                return invoke2(vdVar, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f17146n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f17147t.J2();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", i = {}, l = {157, 158}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ PressGestureScopeImpl f17148O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17149n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ xuv f17150t;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass5(this.f17150t, this.f17148O, continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vd vdVar, Continuation continuation) {
                return ((AnonymousClass5) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(xuv xuvVar, PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.f17150t = xuvVar;
                this.f17148O = pressGestureScopeImpl;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                return invoke2(vdVar, (Continuation) continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
            
                if (r5.HI(r4) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f17149n;
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
                    xuv xuvVar = this.f17150t;
                    this.f17149n = 1;
                    if (xuvVar.join(this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                PressGestureScopeImpl pressGestureScopeImpl = this.f17148O;
                this.f17149n = 2;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass6 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputChange J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ PressGestureScopeImpl f17151O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17152n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function3 f17153t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(Function3 function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation continuation) {
                super(2, continuation);
                this.f17153t = function3;
                this.f17151O = pressGestureScopeImpl;
                this.J2 = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass6(this.f17153t, this.f17151O, this.J2, continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vd vdVar, Continuation continuation) {
                return ((AnonymousClass6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                return invoke2(vdVar, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f17152n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Function3 function3 = this.f17153t;
                    PressGestureScopeImpl pressGestureScopeImpl = this.f17151O;
                    Offset offsetNr = Offset.nr(this.J2.getPosition());
                    this.f17152n = 1;
                    if (function3.invoke(pressGestureScopeImpl, offsetNr, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass7 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17154n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ PressGestureScopeImpl f17155t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.f17155t = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass7(this.f17155t, continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vd vdVar, Continuation continuation) {
                return ((AnonymousClass7) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                return invoke2(vdVar, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f17154n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f17155t.J2();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass8 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17156n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ PressGestureScopeImpl f17157t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.f17157t = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass8(this.f17157t, continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vd vdVar, Continuation continuation) {
                return ((AnonymousClass8) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                return invoke2(vdVar, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f17156n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f17157t.nr();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f17136o, this.f17132Z, this.f17131S, this.f17134g, this.E2, this.f17133e, continuation);
            anonymousClass1.f17137r = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(vd vdVar, Function3 function3, Function1 function1, Function1 function12, Function1 function13, PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
            super(2, continuation);
            this.f17136o = vdVar;
            this.f17132Z = function3;
            this.f17131S = function1;
            this.f17134g = function12;
            this.E2 = function13;
            this.f17133e = pressGestureScopeImpl;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ee, code lost:
        
            if (r1 == r6) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x012b, code lost:
        
            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.mUb(r2, r22) == r6) goto L80;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0273  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0293  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            Object objJ2;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerInputChange pointerInputChange;
            xuv xuvVar;
            Object objZ;
            Object objS;
            PointerInputChange finalUpChange;
            xuv xuvVarR;
            Object objXMQ;
            LongPressResult longPressResult;
            PointerInputChange pointerInputChange2;
            Object objZ2;
            xuv xuvVar2;
            PointerInputChange pointerInputChange3;
            AwaitPointerEventScope awaitPointerEventScope3;
            Object objS2;
            xuv xuvVar3;
            PointerInputChange pointerInputChange4;
            PointerInputChange finalUpChange2;
            xuv xuvVar4;
            LongPressResult longPressResult2;
            xuv xuvVar5;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.J2) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.f17137r;
                    this.f17137r = awaitPointerEventScope;
                    this.J2 = 1;
                    objJ2 = TapGestureDetectorKt.J2(awaitPointerEventScope, false, null, this, 3, null);
                    if (objJ2 != coroutine_suspended) {
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerInputChange = (PointerInputChange) objJ2;
                        pointerInputChange.n();
                        xuv xuvVarNr = C.nr(this.f17136o, null, TapGestureDetectorKt.ty(), new TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1(this.f17133e, null), 1, null);
                        if (this.f17132Z != TapGestureDetectorKt.f17088n) {
                            TapGestureDetectorKt.r(this.f17136o, xuvVarNr, null, new C05021(this.f17132Z, this.f17133e, pointerInputChange, null), 2, null);
                        }
                        xuvVar = xuvVarNr;
                        if (this.f17131S != null) {
                            this.f17137r = awaitPointerEventScope2;
                            this.f17135n = xuvVar;
                            this.J2 = 2;
                            objS = TapGestureDetectorKt.S(awaitPointerEventScope2, null, this, 1, null);
                        } else {
                            this.f17137r = awaitPointerEventScope2;
                            this.f17135n = pointerInputChange;
                            this.f17138t = xuvVar;
                            this.J2 = 3;
                            objZ = TapGestureDetectorKt.Z(awaitPointerEventScope2, null, this, 1, null);
                            if (objZ != coroutine_suspended) {
                                longPressResult = (LongPressResult) objZ;
                                if (Intrinsics.areEqual(longPressResult, LongPressResult.Success.f16910n)) {
                                    if (longPressResult instanceof LongPressResult.Released) {
                                        finalUpChange = ((LongPressResult.Released) longPressResult).getFinalUpChange();
                                    } else {
                                        if (!(longPressResult instanceof LongPressResult.Canceled)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        finalUpChange = null;
                                    }
                                    xuv xuvVar6 = xuvVar;
                                    if (finalUpChange != null) {
                                        xuvVarR = TapGestureDetectorKt.r(this.f17136o, xuvVar6, null, new AnonymousClass3(this.f17133e, null), 2, null);
                                    } else {
                                        finalUpChange.n();
                                        xuvVarR = TapGestureDetectorKt.r(this.f17136o, xuvVar6, null, new AnonymousClass4(this.f17133e, null), 2, null);
                                    }
                                    if (finalUpChange != null) {
                                        if (this.f17134g == null) {
                                            Function1 function1 = this.E2;
                                            if (function1 != null) {
                                                function1.invoke(Offset.nr(finalUpChange.getPosition()));
                                            }
                                        } else {
                                            this.f17137r = awaitPointerEventScope2;
                                            this.f17135n = finalUpChange;
                                            this.f17138t = xuvVarR;
                                            this.J2 = 5;
                                            objXMQ = TapGestureDetectorKt.xMQ(awaitPointerEventScope2, finalUpChange, this);
                                            if (objXMQ != coroutine_suspended) {
                                                pointerInputChange2 = (PointerInputChange) objXMQ;
                                                if (pointerInputChange2 != null) {
                                                    Function1 function12 = this.E2;
                                                    if (function12 != null) {
                                                        function12.invoke(Offset.nr(finalUpChange.getPosition()));
                                                    }
                                                } else {
                                                    xuv xuvVarNr2 = C.nr(this.f17136o, null, TapGestureDetectorKt.ty(), new AnonymousClass5(xuvVarR, this.f17133e, null), 1, null);
                                                    if (this.f17132Z != TapGestureDetectorKt.f17088n) {
                                                        TapGestureDetectorKt.r(this.f17136o, xuvVarNr2, null, new AnonymousClass6(this.f17132Z, this.f17133e, pointerInputChange2, null), 2, null);
                                                    }
                                                    if (this.f17131S == null) {
                                                        this.f17137r = xuvVarNr2;
                                                        this.f17135n = finalUpChange;
                                                        this.f17138t = null;
                                                        this.J2 = 6;
                                                        objS2 = TapGestureDetectorKt.S(awaitPointerEventScope2, null, this, 1, null);
                                                        if (objS2 != coroutine_suspended) {
                                                            PointerInputChange pointerInputChange5 = finalUpChange;
                                                            xuvVar3 = xuvVarNr2;
                                                            pointerInputChange4 = pointerInputChange5;
                                                            finalUpChange2 = (PointerInputChange) objS2;
                                                            xuvVar4 = xuvVar3;
                                                            if (finalUpChange2 != null) {
                                                                finalUpChange2.n();
                                                                TapGestureDetectorKt.r(this.f17136o, xuvVar4, null, new AnonymousClass7(this.f17133e, null), 2, null);
                                                                this.f17134g.invoke(Offset.nr(finalUpChange2.getPosition()));
                                                            } else {
                                                                TapGestureDetectorKt.r(this.f17136o, xuvVar4, null, new AnonymousClass8(this.f17133e, null), 2, null);
                                                                Function1 function13 = this.E2;
                                                                if (function13 != null) {
                                                                    function13.invoke(Offset.nr(pointerInputChange4.getPosition()));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        this.f17137r = awaitPointerEventScope2;
                                                        this.f17135n = xuvVarNr2;
                                                        this.f17138t = finalUpChange;
                                                        this.f17130O = pointerInputChange2;
                                                        this.J2 = 7;
                                                        objZ2 = TapGestureDetectorKt.Z(awaitPointerEventScope2, null, this, 1, null);
                                                        if (objZ2 != coroutine_suspended) {
                                                            AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope2;
                                                            xuvVar2 = xuvVarNr2;
                                                            pointerInputChange3 = pointerInputChange2;
                                                            awaitPointerEventScope3 = awaitPointerEventScope4;
                                                            longPressResult2 = (LongPressResult) objZ2;
                                                            if (Intrinsics.areEqual(longPressResult2, LongPressResult.Success.f16910n)) {
                                                                if (longPressResult2 instanceof LongPressResult.Released) {
                                                                    xuvVar4 = xuvVar2;
                                                                    finalUpChange2 = ((LongPressResult.Released) longPressResult2).getFinalUpChange();
                                                                    pointerInputChange4 = finalUpChange;
                                                                } else {
                                                                    if (!(longPressResult2 instanceof LongPressResult.Canceled)) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    pointerInputChange4 = finalUpChange;
                                                                    xuvVar4 = xuvVar2;
                                                                    finalUpChange2 = null;
                                                                }
                                                                if (finalUpChange2 != null) {
                                                                }
                                                            } else {
                                                                this.f17131S.invoke(Offset.nr(pointerInputChange3.getPosition()));
                                                                this.f17137r = xuvVar2;
                                                                this.f17135n = null;
                                                                this.f17138t = null;
                                                                this.f17130O = null;
                                                                this.J2 = 8;
                                                                if (TapGestureDetectorKt.mUb(awaitPointerEventScope3, this) != coroutine_suspended) {
                                                                    xuvVar5 = xuvVar2;
                                                                    TapGestureDetectorKt.r(this.f17136o, xuvVar5, null, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.f17133e, null), 2, null);
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                                this.f17131S.invoke(Offset.nr(pointerInputChange.getPosition()));
                                this.f17137r = xuvVar;
                                this.f17135n = null;
                                this.f17138t = null;
                                this.J2 = 4;
                            }
                        }
                        break;
                    }
                    return coroutine_suspended;
                case 1:
                    awaitPointerEventScope = (AwaitPointerEventScope) this.f17137r;
                    ResultKt.throwOnFailure(obj);
                    objJ2 = obj;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerInputChange = (PointerInputChange) objJ2;
                    pointerInputChange.n();
                    xuv xuvVarNr3 = C.nr(this.f17136o, null, TapGestureDetectorKt.ty(), new TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1(this.f17133e, null), 1, null);
                    if (this.f17132Z != TapGestureDetectorKt.f17088n) {
                    }
                    xuvVar = xuvVarNr3;
                    if (this.f17131S != null) {
                    }
                    return coroutine_suspended;
                case 2:
                    xuvVar = (xuv) this.f17135n;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.f17137r;
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    objS = obj;
                    finalUpChange = (PointerInputChange) objS;
                    xuv xuvVar62 = xuvVar;
                    if (finalUpChange != null) {
                    }
                    if (finalUpChange != null) {
                    }
                    return Unit.INSTANCE;
                case 3:
                    xuvVar = (xuv) this.f17138t;
                    pointerInputChange = (PointerInputChange) this.f17135n;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.f17137r;
                    ResultKt.throwOnFailure(obj);
                    objZ = obj;
                    longPressResult = (LongPressResult) objZ;
                    if (Intrinsics.areEqual(longPressResult, LongPressResult.Success.f16910n)) {
                    }
                    break;
                case 4:
                    xuvVar = (xuv) this.f17137r;
                    ResultKt.throwOnFailure(obj);
                    TapGestureDetectorKt.r(this.f17136o, xuvVar, null, new AnonymousClass2(this.f17133e, null), 2, null);
                    return Unit.INSTANCE;
                case 5:
                    xuvVarR = (xuv) this.f17138t;
                    finalUpChange = (PointerInputChange) this.f17135n;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.f17137r;
                    ResultKt.throwOnFailure(obj);
                    objXMQ = obj;
                    pointerInputChange2 = (PointerInputChange) objXMQ;
                    if (pointerInputChange2 != null) {
                    }
                    break;
                case 6:
                    pointerInputChange4 = (PointerInputChange) this.f17135n;
                    xuvVar3 = (xuv) this.f17137r;
                    ResultKt.throwOnFailure(obj);
                    objS2 = obj;
                    finalUpChange2 = (PointerInputChange) objS2;
                    xuvVar4 = xuvVar3;
                    if (finalUpChange2 != null) {
                    }
                    return Unit.INSTANCE;
                case 7:
                    pointerInputChange3 = (PointerInputChange) this.f17130O;
                    finalUpChange = (PointerInputChange) this.f17138t;
                    xuvVar2 = (xuv) this.f17135n;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) this.f17137r;
                    ResultKt.throwOnFailure(obj);
                    objZ2 = obj;
                    longPressResult2 = (LongPressResult) objZ2;
                    if (Intrinsics.areEqual(longPressResult2, LongPressResult.Success.f16910n)) {
                    }
                    break;
                case 8:
                    xuv xuvVar7 = (xuv) this.f17137r;
                    ResultKt.throwOnFailure(obj);
                    xuvVar5 = xuvVar7;
                    TapGestureDetectorKt.r(this.f17136o, xuvVar5, null, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.f17133e, null), 2, null);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$detectTapGestures$2(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Function1 function12, Function1 function13, Continuation continuation) {
        super(2, continuation);
        this.f17124O = pointerInputScope;
        this.J2 = function3;
        this.f17128r = function1;
        this.f17127o = function12;
        this.f17125Z = function13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.f17124O, this.J2, this.f17128r, this.f17127o, this.f17125Z, continuation);
        tapGestureDetectorKt$detectTapGestures$2.f17129t = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f17126n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            vd vdVar = (vd) this.f17129t;
            PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.f17124O);
            PointerInputScope pointerInputScope = this.f17124O;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(vdVar, this.J2, this.f17128r, this.f17127o, this.f17125Z, pressGestureScopeImpl, null);
            this.f17126n = 1;
            if (ForEachGestureKt.O(pointerInputScope, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
