package androidx.compose.foundation.text;

import ILs.C;
import ILs.CN3;
import ILs.aC;
import TFv.fuX;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text/SecureTextFieldController;", "", "Landroidx/compose/runtime/State;", "", "obfuscationMaskState", "<init>", "(Landroidx/compose/runtime/State;)V", "", "KN", "()V", "Uo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text/PasswordInputTransformation;", "rl", "Landroidx/compose/foundation/text/PasswordInputTransformation;", "J2", "()Landroidx/compose/foundation/text/PasswordInputTransformation;", "passwordInputTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "t", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "nr", "()Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "codepointTransformation", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Modifier;", "O", "()Landroidx/compose/ui/Modifier;", "focusChangeModifier", "LILs/CN3;", "LILs/CN3;", "resetTimerSignal", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SecureTextFieldController {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final State obfuscationMaskState;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final PasswordInputTransformation passwordInputTransformation = new PasswordInputTransformation(new SecureTextFieldController$passwordInputTransformation$1(this));

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final CodepointTransformation codepointTransformation = new CodepointTransformation() { // from class: androidx.compose.foundation.text.n
        @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
        public final int n(int i2, int i3) {
            return SecureTextFieldController.t(this.f20692n, i2, i3);
        }
    };

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Modifier focusChangeModifier = FocusChangedModifierKt.n(Modifier.INSTANCE, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.SecureTextFieldController$focusChangeModifier$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
            n(focusState);
            return Unit.INSTANCE;
        }

        public final void n(FocusState focusState) {
            if (!focusState.n()) {
                this.f19799n.getPasswordInputTransformation().rl();
            }
        }
    });

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final CN3 resetTimerSignal = aC.rl(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: Access modifiers changed from: private */
    public final void KN() {
        if (C.mUb(this.resetTimerSignal.nr(Unit.INSTANCE))) {
            this.passwordInputTransformation.rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(SecureTextFieldController secureTextFieldController, int i2, int i3) {
        return i2 == secureTextFieldController.passwordInputTransformation.n() ? i3 : ((Character) secureTextFieldController.obfuscationMaskState.getValue()).charValue();
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final PasswordInputTransformation getPasswordInputTransformation() {
        return this.passwordInputTransformation;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Modifier getFocusChangeModifier() {
        return this.focusChangeModifier;
    }

    public final Object Uo(Continuation continuation) {
        Object objGh = fuX.gh(fuX.ck(this.resetTimerSignal), new SecureTextFieldController$observeHideEvents$2(this, null), continuation);
        return objGh == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objGh : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final CodepointTransformation getCodepointTransformation() {
        return this.codepointTransformation;
    }

    public SecureTextFieldController(State state) {
        this.obfuscationMaskState = state;
    }
}
