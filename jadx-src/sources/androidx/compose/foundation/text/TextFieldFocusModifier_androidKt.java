package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "rl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/focus/FocusManager;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "keyCode", "", "t", "(Landroid/view/KeyEvent;I)Z", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldFocusModifier_androidKt {
    public static final Modifier rl(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final FocusManager focusManager) {
        return KeyInputModifierKt.rl(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return n(keyEvent.getNativeKeyEvent());
            }

            public final Boolean n(android.view.KeyEvent keyEvent) {
                InputDevice device = keyEvent.getDevice();
                boolean zT2 = false;
                if (device != null && device.supportsSource(513) && !device.isVirtual() && KeyEventType.J2(KeyEvent_androidKt.rl(keyEvent), KeyEventType.INSTANCE.n()) && keyEvent.getSource() != 257) {
                    if (TextFieldFocusModifier_androidKt.t(keyEvent, 19)) {
                        zT2 = focusManager.t(FocusDirection.INSTANCE.KN());
                    } else if (TextFieldFocusModifier_androidKt.t(keyEvent, 20)) {
                        zT2 = focusManager.t(FocusDirection.INSTANCE.n());
                    } else if (TextFieldFocusModifier_androidKt.t(keyEvent, 21)) {
                        zT2 = focusManager.t(FocusDirection.INSTANCE.nr());
                    } else if (TextFieldFocusModifier_androidKt.t(keyEvent, 22)) {
                        zT2 = focusManager.t(FocusDirection.INSTANCE.Uo());
                    } else if (TextFieldFocusModifier_androidKt.t(keyEvent, 23)) {
                        SoftwareKeyboardController keyboardController = legacyTextFieldState.getKeyboardController();
                        if (keyboardController != null) {
                            keyboardController.show();
                        }
                        zT2 = true;
                    }
                }
                return Boolean.valueOf(zT2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(android.view.KeyEvent keyEvent, int i2) {
        if (Key_androidKt.rl(KeyEvent_androidKt.n(keyEvent)) == i2) {
            return true;
        }
        return false;
    }
}
