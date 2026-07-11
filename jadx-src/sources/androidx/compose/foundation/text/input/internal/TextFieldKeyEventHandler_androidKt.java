package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0018\u0010\u000b\u001a\u00020\u0006*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "rl", "()Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "keyCode", "", "nr", "(Landroid/view/KeyEvent;I)Z", "t", "(Landroid/view/KeyEvent;)Z", "isFromSoftKeyboard", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldKeyEventHandler_androidKt {
    public static final TextFieldKeyEventHandler rl() {
        return new AndroidTextFieldKeyEventHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nr(KeyEvent keyEvent, int i2) {
        if (Key_androidKt.rl(KeyEvent_androidKt.n(keyEvent)) == i2) {
            return true;
        }
        return false;
    }

    public static final boolean t(KeyEvent keyEvent) {
        if ((keyEvent.getFlags() & 2) == 2) {
            return true;
        }
        return false;
    }
}
