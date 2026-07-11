package androidx.compose.foundation.text.input.internal.selection;

import GJW.C;
import GJW.vd;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1", f = "TextFieldSelectionState.kt", i = {}, l = {502, 510}, m = "invokeSuspend", n = {}, s = {})
final class TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ TextFieldSelectionState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ PressGestureScope f20498O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f20499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MutableInteractionSource f20500o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ long f20501r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f20502t;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1", f = "TextFieldSelectionState.kt", i = {1}, l = {494, 499}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TextFieldSelectionState f20503O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f20504n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ MutableInteractionSource f20505r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f20506t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldSelectionState textFieldSelectionState, long j2, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
            super(2, continuation);
            this.f20503O = textFieldSelectionState;
            this.J2 = j2;
            this.f20505r = mutableInteractionSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f20503O, this.J2, this.f20505r, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            TextFieldSelectionState textFieldSelectionState;
            PressInteraction.Press press;
            MutableInteractionSource mutableInteractionSource;
            PressInteraction.Press press2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f20506t;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        press2 = (PressInteraction.Press) this.f20504n;
                        ResultKt.throwOnFailure(obj);
                        this.f20503O.pressInteraction = press2;
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                textFieldSelectionState = (TextFieldSelectionState) this.f20504n;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                PressInteraction.Press press3 = this.f20503O.pressInteraction;
                if (press3 != null) {
                    MutableInteractionSource mutableInteractionSource2 = this.f20505r;
                    TextFieldSelectionState textFieldSelectionState2 = this.f20503O;
                    PressInteraction.Cancel cancel = new PressInteraction.Cancel(press3);
                    this.f20504n = textFieldSelectionState2;
                    this.f20506t = 1;
                    if (mutableInteractionSource2.n(cancel, this) != coroutine_suspended) {
                        textFieldSelectionState = textFieldSelectionState2;
                    }
                } else {
                    press = new PressInteraction.Press(this.J2, null);
                    mutableInteractionSource = this.f20505r;
                    this.f20504n = press;
                    this.f20506t = 2;
                    if (mutableInteractionSource.n(press, this) != coroutine_suspended) {
                        press2 = press;
                        this.f20503O.pressInteraction = press2;
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            }
            textFieldSelectionState.pressInteraction = null;
            press = new PressInteraction.Press(this.J2, null);
            mutableInteractionSource = this.f20505r;
            this.f20504n = press;
            this.f20506t = 2;
            if (mutableInteractionSource.n(press, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(PressGestureScope pressGestureScope, TextFieldSelectionState textFieldSelectionState, long j2, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
        super(2, continuation);
        this.f20498O = pressGestureScope;
        this.J2 = textFieldSelectionState;
        this.f20501r = j2;
        this.f20500o = mutableInteractionSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 textFieldSelectionState$detectTextFieldTapGestures$2$1$1 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(this.f20498O, this.J2, this.f20501r, this.f20500o, continuation);
        textFieldSelectionState$detectTextFieldTapGestures$2$1$1.f20502t = obj;
        return textFieldSelectionState$detectTextFieldTapGestures$2$1$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((TextFieldSelectionState$detectTextFieldTapGestures$2$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r3.n(r12, r11) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Interaction cancel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f20499n;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    this.J2.pressInteraction = null;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            C.nr((vd) this.f20502t, null, null, new AnonymousClass1(this.J2, this.f20501r, this.f20500o, null), 3, null);
            PressGestureScope pressGestureScope = this.f20498O;
            this.f20499n = 1;
            obj = pressGestureScope.kSg(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        PressInteraction.Press press = this.J2.pressInteraction;
        if (press != null) {
            MutableInteractionSource mutableInteractionSource = this.f20500o;
            if (zBooleanValue) {
                cancel = new PressInteraction.Release(press);
            } else {
                cancel = new PressInteraction.Cancel(press);
            }
            this.f20499n = 2;
        }
        this.J2.pressInteraction = null;
        return Unit.INSTANCE;
    }
}
