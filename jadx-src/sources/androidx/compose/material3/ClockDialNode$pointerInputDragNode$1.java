package androidx.compose.material3;

import GJW.C;
import GJW.vd;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1", f = "TimePicker.kt", i = {}, l = {1456}, m = "invokeSuspend", n = {}, s = {})
final class ClockDialNode$pointerInputDragNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ ClockDialNode f24988O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f24989n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f24990t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode, Continuation continuation) {
        super(2, continuation);
        this.f24988O = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ClockDialNode$pointerInputDragNode$1 clockDialNode$pointerInputDragNode$1 = new ClockDialNode$pointerInputDragNode$1(this.f24988O, continuation);
        clockDialNode$pointerInputDragNode$1.f24990t = obj;
        return clockDialNode$pointerInputDragNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        return ((ClockDialNode$pointerInputDragNode$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f24989n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f24990t;
            final ClockDialNode clockDialNode = this.f24988O;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.1

                /* JADX INFO: renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", f = "TimePicker.kt", i = {}, l = {1462}, m = "invokeSuspend", n = {}, s = {})
                static final class C05361 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f24992n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ ClockDialNode f24993t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C05361(ClockDialNode clockDialNode, Continuation continuation) {
                        super(2, continuation);
                        this.f24993t = clockDialNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C05361(this.f24993t, continuation);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(vd vdVar, Continuation continuation) {
                        return ((C05361) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                        return invoke2(vdVar, (Continuation) continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f24992n;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            if (this.f24993t.autoSwitchToMinute) {
                                this.f24993t.state.O(TimePickerSelectionMode.INSTANCE.rl());
                            }
                            AnalogTimePickerState analogTimePickerState = this.f24993t.state;
                            this.f24992n = 1;
                            if (analogTimePickerState.g(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    C.nr(clockDialNode.Xli(), null, null, new C05361(clockDialNode, null), 3, null);
                }
            };
            final ClockDialNode clockDialNode2 = this.f24988O;
            Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.2

                /* JADX INFO: renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", i = {}, l = {1469}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ long f24995O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f24996n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ ClockDialNode f24997t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(ClockDialNode clockDialNode, long j2, Continuation continuation) {
                        super(2, continuation);
                        this.f24997t = clockDialNode;
                        this.f24995O = j2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass1(this.f24997t, this.f24995O, continuation);
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
                        int i2 = this.f24996n;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            this.f24997t.offsetX += Offset.az(this.f24995O);
                            this.f24997t.offsetY += Offset.ty(this.f24995O);
                            AnalogTimePickerState analogTimePickerState = this.f24997t.state;
                            float fK = TimePickerKt.k(this.f24997t.offsetY - IntOffset.qie(this.f24997t.androidx.media3.extractor.text.ttml.TtmlNode.CENTER java.lang.String), this.f24997t.offsetX - IntOffset.gh(this.f24997t.androidx.media3.extractor.text.ttml.TtmlNode.CENTER java.lang.String));
                            this.f24996n = 1;
                            if (AnalogTimePickerState.iF(analogTimePickerState, fK, false, this, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                    n(pointerInputChange, offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                public final void n(PointerInputChange pointerInputChange, long j2) {
                    C.nr(clockDialNode2.Xli(), null, null, new AnonymousClass1(clockDialNode2, j2, null), 3, null);
                    TimePickerKt.m(clockDialNode2.state, clockDialNode2.offsetX, clockDialNode2.offsetY, clockDialNode2.kC(), clockDialNode2.androidx.media3.extractor.text.ttml.TtmlNode.CENTER java.lang.String);
                }
            };
            this.f24989n = 1;
            if (DragGestureDetectorKt.HI(pointerInputScope, null, function0, null, function2, this, 5, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
