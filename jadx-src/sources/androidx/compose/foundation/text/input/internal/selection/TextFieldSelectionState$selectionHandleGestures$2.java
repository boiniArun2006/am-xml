package androidx.compose.foundation.text.input.internal.selection;

import GJW.C;
import GJW.h;
import GJW.vd;
import GJW.xuv;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "LGJW/xuv;", "<anonymous>", "(LGJW/vd;)LGJW/xuv;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class TextFieldSelectionState$selectionHandleGestures$2 extends SuspendLambda implements Function2<vd, Continuation<? super xuv>, Object> {
    final /* synthetic */ PointerInputScope J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionState f20526O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f20527n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ boolean f20528r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f20529t;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {392}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ PointerInputScope f20530O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f20531n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TextFieldSelectionState f20532t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Continuation continuation) {
            super(2, continuation);
            this.f20532t = textFieldSelectionState;
            this.f20530O = pointerInputScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f20532t, this.f20530O, continuation);
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
            int i2 = this.f20531n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TextFieldSelectionState textFieldSelectionState = this.f20532t;
                PointerInputScope pointerInputScope = this.f20530O;
                this.f20531n = 1;
                if (textFieldSelectionState.U(pointerInputScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {394}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TextFieldSelectionState f20533O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f20534n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ PointerInputScope f20535t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, boolean z2, Continuation continuation) {
            super(2, continuation);
            this.f20535t = pointerInputScope;
            this.f20533O = textFieldSelectionState;
            this.J2 = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.f20535t, this.f20533O, this.J2, continuation);
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
            int i2 = this.f20534n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = this.f20535t;
                final TextFieldSelectionState textFieldSelectionState = this.f20533O;
                final boolean z2 = this.J2;
                TapOnPosition tapOnPosition = new TapOnPosition() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.1
                    @Override // androidx.compose.foundation.text.input.internal.selection.TapOnPosition
                    public final void n(long j2) {
                        textFieldSelectionState.eTf();
                        TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                        boolean z3 = z2;
                        textFieldSelectionState2.UhV(z3 ? Handle.f19679t : Handle.f19676O, SelectionHandlesKt.n(textFieldSelectionState2.D(z3)));
                    }
                };
                final TextFieldSelectionState textFieldSelectionState2 = this.f20533O;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.2
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
                        textFieldSelectionState2.X();
                    }
                };
                this.f20534n = 1;
                if (PressDownGestureKt.n(pointerInputScope, tapOnPosition, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ PointerInputScope f20538O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f20539n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TextFieldSelectionState f20540t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z2, Continuation continuation) {
            super(2, continuation);
            this.f20540t = textFieldSelectionState;
            this.f20538O = pointerInputScope;
            this.J2 = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.f20540t, this.f20538O, this.J2, continuation);
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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f20539n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TextFieldSelectionState textFieldSelectionState = this.f20540t;
                PointerInputScope pointerInputScope = this.f20538O;
                boolean z2 = this.J2;
                this.f20539n = 1;
                if (textFieldSelectionState.bzg(pointerInputScope, z2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState$selectionHandleGestures$2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f20526O = textFieldSelectionState;
        this.J2 = pointerInputScope;
        this.f20528r = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TextFieldSelectionState$selectionHandleGestures$2 textFieldSelectionState$selectionHandleGestures$2 = new TextFieldSelectionState$selectionHandleGestures$2(this.f20526O, this.J2, this.f20528r, continuation);
        textFieldSelectionState$selectionHandleGestures$2.f20529t = obj;
        return textFieldSelectionState$selectionHandleGestures$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((TextFieldSelectionState$selectionHandleGestures$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super xuv> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f20527n == 0) {
            ResultKt.throwOnFailure(obj);
            vd vdVar = (vd) this.f20529t;
            h hVar = h.J2;
            C.nr(vdVar, null, hVar, new AnonymousClass1(this.f20526O, this.J2, null), 1, null);
            C.nr(vdVar, null, hVar, new AnonymousClass2(this.J2, this.f20526O, this.f20528r, null), 1, null);
            return C.nr(vdVar, null, hVar, new AnonymousClass3(this.f20526O, this.J2, this.f20528r, null), 1, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
