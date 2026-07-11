package androidx.compose.foundation.text;

import GJW.vd;
import TFv.CN3;
import TFv.Wre;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextInputService;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", i = {}, l = {347}, m = "invokeSuspend", n = {}, s = {})
final class CoreTextFieldKt$CoreTextField$2$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ TextInputService J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ State f19546O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f19547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ ImeOptions f19548o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f19549r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ LegacyTextFieldState f19550t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$2$1(LegacyTextFieldState legacyTextFieldState, State state, TextInputService textInputService, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, Continuation continuation) {
        super(2, continuation);
        this.f19550t = legacyTextFieldState;
        this.f19546O = state;
        this.J2 = textInputService;
        this.f19549r = textFieldSelectionManager;
        this.f19548o = imeOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoreTextFieldKt$CoreTextField$2$1(this.f19550t, this.f19546O, this.J2, this.f19549r, this.f19548o, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((CoreTextFieldKt$CoreTextField$2$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f19547n;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                final State state = this.f19546O;
                Wre wreIk = SnapshotStateKt.Ik(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        return Boolean.valueOf(CoreTextFieldKt.rl(state));
                    }
                });
                final LegacyTextFieldState legacyTextFieldState = this.f19550t;
                final TextInputService textInputService = this.J2;
                final TextFieldSelectionManager textFieldSelectionManager = this.f19549r;
                final ImeOptions imeOptions = this.f19548o;
                CN3 cn3 = new CN3() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1.2
                    public final Object n(boolean z2, Continuation continuation) {
                        if (z2 && legacyTextFieldState.J2()) {
                            CoreTextFieldKt.ck(textInputService, legacyTextFieldState, textFieldSelectionManager.p5(), imeOptions, textFieldSelectionManager.getOffsetMapping());
                        } else {
                            CoreTextFieldKt.az(legacyTextFieldState);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // TFv.CN3
                    public /* bridge */ /* synthetic */ Object rl(Object obj2, Continuation continuation) {
                        return n(((Boolean) obj2).booleanValue(), continuation);
                    }
                };
                this.f19547n = 1;
                if (wreIk.n(cn3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            CoreTextFieldKt.az(this.f19550t);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            CoreTextFieldKt.az(this.f19550t);
            throw th;
        }
    }
}
