package androidx.compose.material;

import GJW.C;
import GJW.vd;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", i = {}, l = {1006}, m = "invokeSuspend", n = {}, s = {})
final class SliderKt$sliderTapModifier$2$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ boolean f22979O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ DraggableState f22980S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ vd f22981Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ State f22982g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f22983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ State f22984o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ MutableState f22985r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f22986t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SliderKt$sliderTapModifier$2$1$1 sliderKt$sliderTapModifier$2$1$1 = new SliderKt$sliderTapModifier$2$1$1(this.f22979O, this.J2, this.f22985r, this.f22984o, this.f22981Z, this.f22980S, this.f22982g, continuation);
        sliderKt$sliderTapModifier$2$1$1.f22986t = obj;
        return sliderKt$sliderTapModifier$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        return ((SliderKt$sliderTapModifier$2$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "pos", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1", f = "Slider.kt", i = {}, l = {1011}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ long f22987O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ State f22988Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f22989n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ MutableState f22990o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ float f22991r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f22992t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z2, float f3, MutableState mutableState, State state, Continuation continuation) {
            super(3, continuation);
            this.J2 = z2;
            this.f22991r = f3;
            this.f22990o = mutableState;
            this.f22988Z = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            return n(pressGestureScope, offset.getPackedValue(), continuation);
        }

        public final Object n(PressGestureScope pressGestureScope, long j2, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.J2, this.f22991r, this.f22990o, this.f22988Z, continuation);
            anonymousClass1.f22992t = pressGestureScope;
            anonymousClass1.f22987O = j2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float fAz;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f22989n;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    PressGestureScope pressGestureScope = (PressGestureScope) this.f22992t;
                    long j2 = this.f22987O;
                    if (this.J2) {
                        fAz = this.f22991r - Offset.az(j2);
                    } else {
                        fAz = Offset.az(j2);
                    }
                    this.f22990o.setValue(Boxing.boxFloat(fAz - ((Number) this.f22988Z.getValue()).floatValue()));
                    this.f22989n = 1;
                    if (pressGestureScope.g6(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } catch (GestureCancellationException unused) {
                this.f22990o.setValue(Boxing.boxFloat(0.0f));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$sliderTapModifier$2$1$1(boolean z2, float f3, MutableState mutableState, State state, vd vdVar, DraggableState draggableState, State state2, Continuation continuation) {
        super(2, continuation);
        this.f22979O = z2;
        this.J2 = f3;
        this.f22985r = mutableState;
        this.f22984o = state;
        this.f22981Z = vdVar;
        this.f22980S = draggableState;
        this.f22982g = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f22983n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f22986t;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22979O, this.J2, this.f22985r, this.f22984o, null);
            final vd vdVar = this.f22981Z;
            final DraggableState draggableState = this.f22980S;
            final State state = this.f22982g;
            Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1.2

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1", f = "Slider.kt", i = {}, l = {1018}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ State f22996O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f22997n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ DraggableState f22998t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(DraggableState draggableState, State state, Continuation continuation) {
                        super(2, continuation);
                        this.f22998t = draggableState;
                        this.f22996O = state;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass1(this.f22998t, this.f22996O, continuation);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(vd vdVar, Continuation continuation) {
                        return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    static final class C05311 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f22999n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        private /* synthetic */ Object f23000t;

                        C05311(Continuation continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            C05311 c05311 = new C05311(continuation);
                            c05311.f23000t = obj;
                            return c05311;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(DragScope dragScope, Continuation continuation) {
                            return ((C05311) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.f22999n == 0) {
                                ResultKt.throwOnFailure(obj);
                                ((DragScope) this.f23000t).n(0.0f);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                        return invoke2(vdVar, (Continuation) continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f22997n;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            DraggableState draggableState = this.f22998t;
                            MutatePriority mutatePriority = MutatePriority.f16229t;
                            C05311 c05311 = new C05311(null);
                            this.f22997n = 1;
                            if (draggableState.n(mutatePriority, c05311, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        ((Function1) this.f22996O.getValue()).invoke(Boxing.boxFloat(0.0f));
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    n(offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                public final void n(long j2) {
                    C.nr(vdVar, null, null, new AnonymousClass1(draggableState, state, null), 3, null);
                }
            };
            this.f22983n = 1;
            if (TapGestureDetectorKt.az(pointerInputScope, null, null, anonymousClass1, function1, this, 3, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
