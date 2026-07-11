package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "<init>", "(Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "", "nr", "(I)V", c.f62177j, "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Landroidx/compose/foundation/text/KeyboardActions;", "rl", "Landroidx/compose/foundation/text/KeyboardActions;", "t", "()Landroidx/compose/foundation/text/KeyboardActions;", "J2", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "keyboardActions", "Landroidx/compose/ui/focus/FocusManager;", "Landroidx/compose/ui/focus/FocusManager;", "()Landroidx/compose/ui/focus/FocusManager;", "O", "(Landroidx/compose/ui/focus/FocusManager;)V", "focusManager", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KeyboardActionRunner implements KeyboardActionScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SoftwareKeyboardController keyboardController;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public KeyboardActions keyboardActions;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public FocusManager focusManager;

    public final void J2(KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }

    public final void O(FocusManager focusManager) {
        this.focusManager = focusManager;
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    public void n(int imeAction) {
        ImeAction.Companion companion = ImeAction.INSTANCE;
        if (ImeAction.az(imeAction, companion.nr())) {
            rl().t(FocusDirection.INSTANCE.O());
            return;
        }
        if (ImeAction.az(imeAction, companion.J2())) {
            rl().t(FocusDirection.INSTANCE.J2());
            return;
        }
        if (!ImeAction.az(imeAction, companion.rl())) {
            if (ImeAction.az(imeAction, companion.t()) ? true : ImeAction.az(imeAction, companion.Uo()) ? true : ImeAction.az(imeAction, companion.KN()) ? true : ImeAction.az(imeAction, companion.n())) {
                return;
            }
            ImeAction.az(imeAction, companion.O());
        } else {
            SoftwareKeyboardController softwareKeyboardController = this.keyboardController;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.n();
            }
        }
    }

    public final void nr(int imeAction) {
        Function1 onSend;
        ImeAction.Companion companion = ImeAction.INSTANCE;
        Unit unit = null;
        if (ImeAction.az(imeAction, companion.rl())) {
            onSend = t().getOnDone();
        } else if (ImeAction.az(imeAction, companion.t())) {
            onSend = t().getOnGo();
        } else if (ImeAction.az(imeAction, companion.nr())) {
            onSend = t().getOnNext();
        } else if (ImeAction.az(imeAction, companion.J2())) {
            onSend = t().getOnPrevious();
        } else if (ImeAction.az(imeAction, companion.Uo())) {
            onSend = t().getOnSearch();
        } else if (ImeAction.az(imeAction, companion.KN())) {
            onSend = t().getOnSend();
        } else {
            if (!(ImeAction.az(imeAction, companion.n()) ? true : ImeAction.az(imeAction, companion.O()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            onSend = null;
        }
        if (onSend != null) {
            onSend.invoke(this);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            n(imeAction);
        }
    }

    public final FocusManager rl() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    public final KeyboardActions t() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    public KeyboardActionRunner(SoftwareKeyboardController softwareKeyboardController) {
        this.keyboardController = softwareKeyboardController;
    }
}
