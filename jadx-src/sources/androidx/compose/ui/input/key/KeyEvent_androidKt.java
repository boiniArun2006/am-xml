package androidx.compose.ui.input.key;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"\u0015\u0010\u000f\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u0011\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0015\u0010\u0013\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e*\n\u0010\u0015\"\u00020\u00142\u00020\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "Landroidx/compose/ui/input/key/Key;", c.f62177j, "(Landroid/view/KeyEvent;)J", "key", "", "t", "(Landroid/view/KeyEvent;)I", "utf16CodePoint", "Landroidx/compose/ui/input/key/KeyEventType;", "rl", "type", "", "nr", "(Landroid/view/KeyEvent;)Z", "isAltPressed", "O", "isCtrlPressed", "J2", "isShiftPressed", "Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class KeyEvent_androidKt {
    public static final boolean J2(android.view.KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }

    public static final boolean O(android.view.KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final long n(android.view.KeyEvent keyEvent) {
        return Key_androidKt.n(keyEvent.getKeyCode());
    }

    public static final boolean nr(android.view.KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final int rl(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return KeyEventType.INSTANCE.t();
            }
            return KeyEventType.INSTANCE.rl();
        }
        return KeyEventType.INSTANCE.n();
    }

    public static final int t(android.view.KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }
}
