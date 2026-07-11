package androidx.compose.ui.input.pointer;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006*\f\b\u0000\u0010\r\"\u00020\f2\u00020\f*\f\b\u0000\u0010\u000e\"\u00020\f2\u00020\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", c.f62177j, "()I", "Landroidx/compose/ui/input/pointer/PointerButtons;", "", "t", "(I)Z", "isPrimaryPressed", "nr", "isSecondaryPressed", "rl", "isCtrlPressed", "", "NativePointerButtons", "NativePointerKeyboardModifiers", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PointerEvent_androidKt {
    public static final int n() {
        return PointerKeyboardModifiers.rl(0);
    }

    public static final boolean nr(int i2) {
        return (i2 & 66) != 0;
    }

    public static final boolean rl(int i2) {
        return (i2 & 4096) != 0;
    }

    public static final boolean t(int i2) {
        return (i2 & 33) != 0;
    }
}
