package androidx.compose.material;

import GJW.C;
import GJW.Lu;
import GJW.vd;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {1082}, m = "invokeSuspend", n = {}, s = {})
final class SliderKt$rangeSliderPressDragModifier$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State E2;
    final /* synthetic */ MutableInteractionSource J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ MutableInteractionSource f22916O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ boolean f22917S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ State f22918Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f22919g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f22920n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ State f22921o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ State f22922r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f22923t;

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1083}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ State E2;
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ PointerInputScope f22924O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ State f22925S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ State f22926Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ State f22927g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f22928n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ RangeSliderLogic f22929o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ float f22930r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f22931t;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1084, 1095, 1117}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", a.f62811a, "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
        static final class C05301 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ State E2;
            Object J2;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            final /* synthetic */ State f22932N;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            Object f22933O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ float f22934S;

            /* JADX INFO: renamed from: T, reason: collision with root package name */
            final /* synthetic */ State f22935T;

            /* JADX INFO: renamed from: X, reason: collision with root package name */
            final /* synthetic */ State f22936X;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ boolean f22937Z;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ vd f22938e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ RangeSliderLogic f22939g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f22940n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f22941o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f22942r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f22943t;

            /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1135}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                final /* synthetic */ DragInteraction J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Ref.BooleanRef f22944O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f22945n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ RangeSliderLogic f22946t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, Continuation continuation) {
                    super(2, continuation);
                    this.f22946t = rangeSliderLogic;
                    this.f22944O = booleanRef;
                    this.J2 = dragInteraction;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass2(this.f22946t, this.f22944O, this.J2, continuation);
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
                    int i2 = this.f22945n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        MutableInteractionSource mutableInteractionSourceN = this.f22946t.n(this.f22944O.element);
                        DragInteraction dragInteraction = this.J2;
                        this.f22945n = 1;
                        if (mutableInteractionSourceN.n(dragInteraction, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C05301 c05301 = new C05301(this.f22937Z, this.f22934S, this.f22939g, this.E2, this.f22938e, this.f22936X, this.f22935T, this.f22932N, continuation);
                c05301.f22941o = obj;
                return c05301;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                return ((C05301) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C05301(boolean z2, float f3, RangeSliderLogic rangeSliderLogic, State state, vd vdVar, State state2, State state3, State state4, Continuation continuation) {
                super(2, continuation);
                this.f22937Z = z2;
                this.f22934S = f3;
                this.f22939g = rangeSliderLogic;
                this.E2 = state;
                this.f22938e = vdVar;
                this.f22936X = state2;
                this.f22935T = state3;
                this.f22932N = state4;
            }

            /* JADX WARN: Code restructure failed: missing block: B:52:0x0172, code lost:
            
                if (r1 != r6) goto L54;
             */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                Object objJ2;
                Ref.FloatRef floatRef;
                Object objAYN;
                AwaitPointerEventScope awaitPointerEventScope2;
                PointerInputChange pointerInputChange;
                DragInteraction.Start start;
                final Ref.BooleanRef booleanRef;
                Pair pair;
                DragInteraction.Start start2;
                Object objZ;
                DragInteraction cancel;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f22942r;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.f22941o;
                    this.f22941o = awaitPointerEventScope;
                    this.f22942r = 1;
                    objJ2 = TapGestureDetectorKt.J2(awaitPointerEventScope, false, null, this, 2, null);
                    if (objJ2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.f22941o;
                    ResultKt.throwOnFailure(obj);
                    objJ2 = obj;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        booleanRef = (Ref.BooleanRef) this.f22940n;
                        start2 = (DragInteraction.Start) this.f22941o;
                        try {
                            ResultKt.throwOnFailure(obj);
                            start = start2;
                            objZ = obj;
                            cancel = ((Boolean) objZ).booleanValue() ? new DragInteraction.Stop(start) : new DragInteraction.Cancel(start);
                        } catch (CancellationException unused) {
                            cancel = new DragInteraction.Cancel(start2);
                        }
                        ((Function1) this.f22936X.getValue()).invoke(Boxing.boxBoolean(booleanRef.element));
                        C.nr(this.f22938e, null, null, new AnonymousClass2(this.f22939g, booleanRef, cancel, null), 3, null);
                        return Unit.INSTANCE;
                    }
                    booleanRef = (Ref.BooleanRef) this.J2;
                    floatRef = (Ref.FloatRef) this.f22933O;
                    DragInteraction.Start start3 = (DragInteraction.Start) this.f22943t;
                    PointerInputChange pointerInputChange2 = (PointerInputChange) this.f22940n;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f22941o;
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    pointerInputChange = pointerInputChange2;
                    start = start3;
                    objAYN = obj;
                    pair = (Pair) objAYN;
                    if (pair != null) {
                        State state = this.f22935T;
                        State state2 = this.E2;
                        boolean z2 = this.f22937Z;
                        float fT = DragGestureDetectorCopyKt.t(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                        if (Math.abs(((Number) state.getValue()).floatValue() - floatRef.element) < fT && Math.abs(((Number) state2.getValue()).floatValue() - floatRef.element) < fT) {
                            float fFloatValue = ((Number) pair.getSecond()).floatValue();
                            booleanRef.element = !z2 ? fFloatValue >= 0.0f : fFloatValue < 0.0f;
                            floatRef.element += Offset.az(PointerEventKt.Uo((PointerInputChange) pair.getFirst()));
                        }
                    }
                    this.f22939g.rl(booleanRef.element, floatRef.element, start, this.f22938e);
                    try {
                        long id = pointerInputChange.getId();
                        final State state3 = this.f22932N;
                        final boolean z3 = this.f22937Z;
                        Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1
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
                                Function2 function2 = (Function2) state3.getValue();
                                Boolean boolValueOf = Boolean.valueOf(booleanRef.element);
                                if (z3) {
                                    fAz = -fAz;
                                }
                                function2.invoke(boolValueOf, Float.valueOf(fAz));
                            }
                        };
                        this.f22941o = start;
                        this.f22940n = booleanRef;
                        this.f22943t = null;
                        this.f22933O = null;
                        this.J2 = null;
                        this.f22942r = 3;
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
                float fAz = this.f22937Z ? this.f22934S - Offset.az(pointerInputChange3.getPosition()) : Offset.az(pointerInputChange3.getPosition());
                floatRef.element = fAz;
                int iT = this.f22939g.t(fAz);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                booleanRef2.element = iT == 0 ? ((Number) this.E2.getValue()).floatValue() > floatRef.element : iT < 0;
                long id2 = pointerInputChange3.getId();
                int type = pointerInputChange3.getType();
                this.f22941o = awaitPointerEventScope4;
                this.f22940n = pointerInputChange3;
                this.f22943t = start4;
                this.f22933O = floatRef;
                this.J2 = booleanRef2;
                this.f22942r = 2;
                objAYN = SliderKt.aYN(awaitPointerEventScope4, id2, type, this);
                if (objAYN != coroutine_suspended) {
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    pointerInputChange = pointerInputChange3;
                    start = start4;
                    booleanRef = booleanRef2;
                    pair = (Pair) objAYN;
                    if (pair != null) {
                    }
                    this.f22939g.rl(booleanRef.element, floatRef.element, start, this.f22938e);
                    long id3 = pointerInputChange.getId();
                    final State state32 = this.f22932N;
                    final boolean z32 = this.f22937Z;
                    Function1<PointerInputChange, Unit> function12 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1
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
                            float fAz2 = Offset.az(PointerEventKt.Uo(pointerInputChange32));
                            Function2 function2 = (Function2) state32.getValue();
                            Boolean boolValueOf = Boolean.valueOf(booleanRef.element);
                            if (z32) {
                                fAz2 = -fAz2;
                            }
                            function2.invoke(boolValueOf, Float.valueOf(fAz2));
                        }
                    };
                    this.f22941o = start;
                    this.f22940n = booleanRef;
                    this.f22943t = null;
                    this.f22933O = null;
                    this.J2 = null;
                    this.f22942r = 3;
                    objZ = DragGestureDetectorKt.Z(awaitPointerEventScope2, id3, function12, this);
                }
                return coroutine_suspended;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, boolean z2, float f3, RangeSliderLogic rangeSliderLogic, State state, State state2, State state3, State state4, Continuation continuation) {
            super(2, continuation);
            this.f22924O = pointerInputScope;
            this.J2 = z2;
            this.f22930r = f3;
            this.f22929o = rangeSliderLogic;
            this.f22926Z = state;
            this.f22925S = state2;
            this.f22927g = state3;
            this.E2 = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22924O, this.J2, this.f22930r, this.f22929o, this.f22926Z, this.f22925S, this.f22927g, this.E2, continuation);
            anonymousClass1.f22931t = obj;
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
            int i2 = this.f22928n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f22931t;
                PointerInputScope pointerInputScope = this.f22924O;
                C05301 c05301 = new C05301(this.J2, this.f22930r, this.f22929o, this.f22926Z, vdVar, this.f22925S, this.f22927g, this.E2, null);
                this.f22928n = 1;
                if (ForEachGestureKt.O(pointerInputScope, c05301, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$rangeSliderPressDragModifier$1(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State state, State state2, State state3, boolean z2, float f3, State state4, Continuation continuation) {
        super(2, continuation);
        this.f22916O = mutableInteractionSource;
        this.J2 = mutableInteractionSource2;
        this.f22922r = state;
        this.f22921o = state2;
        this.f22918Z = state3;
        this.f22917S = z2;
        this.f22919g = f3;
        this.E2 = state4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.f22916O, this.J2, this.f22922r, this.f22921o, this.f22918Z, this.f22917S, this.f22919g, this.E2, continuation);
        sliderKt$rangeSliderPressDragModifier$1.f22923t = obj;
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
        int i2 = this.f22920n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.f22923t, this.f22917S, this.f22919g, new RangeSliderLogic(this.f22916O, this.J2, this.f22922r, this.f22921o, this.f22918Z), this.f22922r, this.E2, this.f22921o, this.f22918Z, null);
            this.f22920n = 1;
            if (Lu.J2(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
