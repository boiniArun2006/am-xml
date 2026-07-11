package androidx.compose.material3;

import GJW.C;
import GJW.Lu;
import GJW.vd;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.internal.DragGestureDetectorCopyKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.safedk.android.analytics.events.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {1651}, m = "invokeSuspend", n = {}, s = {})
final class SliderKt$rangeSliderPressDragModifier$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableInteractionSource J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ RangeSliderState f27775O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f27776n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ MutableInteractionSource f27777r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f27778t;

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1652}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ RangeSliderState J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ PointerInputScope f27779O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f27780n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ RangeSliderLogic f27781r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27782t;

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1653, 1665, 1687}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", a.f62811a, "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
        static final class C05471 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            Object J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            Object f27783O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ RangeSliderLogic f27784S;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ RangeSliderState f27785Z;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ vd f27786g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f27787n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f27788o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f27789r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f27790t;

            /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1705}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                final /* synthetic */ DragInteraction J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Ref.BooleanRef f27791O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f27792n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ RangeSliderLogic f27793t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, Continuation continuation) {
                    super(2, continuation);
                    this.f27793t = rangeSliderLogic;
                    this.f27791O = booleanRef;
                    this.J2 = dragInteraction;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass2(this.f27793t, this.f27791O, this.J2, continuation);
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
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f27792n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        MutableInteractionSource mutableInteractionSourceN = this.f27793t.n(this.f27791O.element);
                        DragInteraction dragInteraction = this.J2;
                        this.f27792n = 1;
                        if (mutableInteractionSourceN.n(dragInteraction, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C05471 c05471 = new C05471(this.f27785Z, this.f27784S, this.f27786g, continuation);
                c05471.f27788o = obj;
                return c05471;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                return ((C05471) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C05471(RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, vd vdVar, Continuation continuation) {
                super(2, continuation);
                this.f27785Z = rangeSliderState;
                this.f27784S = rangeSliderLogic;
                this.f27786g = vdVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:51:0x0166, code lost:
            
                if (r1 != r6) goto L53;
             */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                Object objJ2;
                Ref.FloatRef floatRef;
                Object objXQ;
                AwaitPointerEventScope awaitPointerEventScope2;
                PointerInputChange pointerInputChange;
                DragInteraction.Start start;
                final Ref.BooleanRef booleanRef;
                Pair pair;
                DragInteraction.Start start2;
                Object objZ;
                DragInteraction cancel;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f27789r;
                boolean z2 = false;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.f27788o;
                    this.f27788o = awaitPointerEventScope;
                    this.f27789r = 1;
                    objJ2 = TapGestureDetectorKt.J2(awaitPointerEventScope, false, null, this, 2, null);
                    if (objJ2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.f27788o;
                    ResultKt.throwOnFailure(obj);
                    objJ2 = obj;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        booleanRef = (Ref.BooleanRef) this.f27787n;
                        start2 = (DragInteraction.Start) this.f27788o;
                        try {
                            ResultKt.throwOnFailure(obj);
                            start = start2;
                            objZ = obj;
                            cancel = ((Boolean) objZ).booleanValue() ? new DragInteraction.Stop(start) : new DragInteraction.Cancel(start);
                        } catch (CancellationException unused) {
                            cancel = new DragInteraction.Cancel(start2);
                        }
                        this.f27785Z.getGestureEndAction().invoke(Boxing.boxBoolean(booleanRef.element));
                        C.nr(this.f27786g, null, null, new AnonymousClass2(this.f27784S, booleanRef, cancel, null), 3, null);
                        return Unit.INSTANCE;
                    }
                    booleanRef = (Ref.BooleanRef) this.J2;
                    floatRef = (Ref.FloatRef) this.f27783O;
                    DragInteraction.Start start3 = (DragInteraction.Start) this.f27790t;
                    PointerInputChange pointerInputChange2 = (PointerInputChange) this.f27787n;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f27788o;
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    pointerInputChange = pointerInputChange2;
                    start = start3;
                    objXQ = obj;
                    pair = (Pair) objXQ;
                    if (pair != null) {
                        RangeSliderState rangeSliderState = this.f27785Z;
                        float fT = DragGestureDetectorCopyKt.t(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                        if (Math.abs(rangeSliderState.ty() - floatRef.element) < fT && Math.abs(rangeSliderState.HI() - floatRef.element) < fT) {
                            float fFloatValue = ((Number) pair.getSecond()).floatValue();
                            if (!rangeSliderState.WPU() ? fFloatValue < 0.0f : fFloatValue >= 0.0f) {
                                z2 = true;
                            }
                            booleanRef.element = z2;
                            floatRef.element += Offset.az(PointerEventKt.Uo((PointerInputChange) pair.getFirst()));
                        }
                    }
                    this.f27784S.rl(booleanRef.element, floatRef.element, start, this.f27786g);
                    try {
                        long id = pointerInputChange.getId();
                        final RangeSliderState rangeSliderState2 = this.f27785Z;
                        Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3) {
                                n(pointerInputChange3);
                                return Unit.INSTANCE;
                            }

                            public final void n(PointerInputChange pointerInputChange3) {
                                float fAz = Offset.az(PointerEventKt.Uo(pointerInputChange3));
                                RangeSliderState rangeSliderState3 = rangeSliderState2;
                                boolean z3 = booleanRef.element;
                                if (rangeSliderState3.WPU()) {
                                    fAz = -fAz;
                                }
                                rangeSliderState3.aYN(z3, fAz);
                            }
                        };
                        this.f27788o = start;
                        this.f27787n = booleanRef;
                        this.f27790t = null;
                        this.f27783O = null;
                        this.J2 = null;
                        this.f27789r = 3;
                        objZ = DragGestureDetectorKt.Z(awaitPointerEventScope2, id, function1, this);
                    } catch (CancellationException unused2) {
                        start2 = start;
                        cancel = new DragInteraction.Cancel(start2);
                    }
                }
                AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope;
                PointerInputChange pointerInputChange3 = (PointerInputChange) objJ2;
                DragInteraction.Start start4 = new DragInteraction.Start();
                floatRef = new Ref.FloatRef();
                float fZ = this.f27785Z.WPU() ? this.f27785Z.Z() - Offset.az(pointerInputChange3.getPosition()) : Offset.az(pointerInputChange3.getPosition());
                floatRef.element = fZ;
                int iT = this.f27784S.t(fZ);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                booleanRef2.element = iT == 0 ? this.f27785Z.HI() > floatRef.element : iT < 0;
                long id2 = pointerInputChange3.getId();
                int type = pointerInputChange3.getType();
                this.f27788o = awaitPointerEventScope4;
                this.f27787n = pointerInputChange3;
                this.f27790t = start4;
                this.f27783O = floatRef;
                this.J2 = booleanRef2;
                this.f27789r = 2;
                objXQ = SliderKt.XQ(awaitPointerEventScope4, id2, type, this);
                if (objXQ != coroutine_suspended) {
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    pointerInputChange = pointerInputChange3;
                    start = start4;
                    booleanRef = booleanRef2;
                    pair = (Pair) objXQ;
                    if (pair != null) {
                    }
                    this.f27784S.rl(booleanRef.element, floatRef.element, start, this.f27786g);
                    long id3 = pointerInputChange.getId();
                    final RangeSliderState rangeSliderState22 = this.f27785Z;
                    Function1<PointerInputChange, Unit> function12 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange32) {
                            n(pointerInputChange32);
                            return Unit.INSTANCE;
                        }

                        public final void n(PointerInputChange pointerInputChange32) {
                            float fAz = Offset.az(PointerEventKt.Uo(pointerInputChange32));
                            RangeSliderState rangeSliderState3 = rangeSliderState22;
                            boolean z3 = booleanRef.element;
                            if (rangeSliderState3.WPU()) {
                                fAz = -fAz;
                            }
                            rangeSliderState3.aYN(z3, fAz);
                        }
                    };
                    this.f27788o = start;
                    this.f27787n = booleanRef;
                    this.f27790t = null;
                    this.f27783O = null;
                    this.J2 = null;
                    this.f27789r = 3;
                    objZ = DragGestureDetectorKt.Z(awaitPointerEventScope2, id3, function12, this);
                }
                return coroutine_suspended;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, Continuation continuation) {
            super(2, continuation);
            this.f27779O = pointerInputScope;
            this.J2 = rangeSliderState;
            this.f27781r = rangeSliderLogic;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27779O, this.J2, this.f27781r, continuation);
            anonymousClass1.f27782t = obj;
            return anonymousClass1;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f27780n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f27782t;
                PointerInputScope pointerInputScope = this.f27779O;
                C05471 c05471 = new C05471(this.J2, this.f27781r, vdVar, null);
                this.f27780n = 1;
                if (ForEachGestureKt.O(pointerInputScope, c05471, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$rangeSliderPressDragModifier$1(RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Continuation continuation) {
        super(2, continuation);
        this.f27775O = rangeSliderState;
        this.J2 = mutableInteractionSource;
        this.f27777r = mutableInteractionSource2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.f27775O, this.J2, this.f27777r, continuation);
        sliderKt$rangeSliderPressDragModifier$1.f27778t = obj;
        return sliderKt$rangeSliderPressDragModifier$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        return ((SliderKt$rangeSliderPressDragModifier$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f27776n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.f27778t, this.f27775O, new RangeSliderLogic(this.f27775O, this.J2, this.f27777r), null);
            this.f27776n = 1;
            if (Lu.J2(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
