package androidx.compose.ui.input.pointer;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\t\u0010\u0007\"\u001a\u0010\f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\r\u0010\u0007¨\u0006\u000f"}, d2 = {"", "pointerIconType", "Landroidx/compose/ui/input/pointer/PointerIcon;", c.f62177j, "(I)Landroidx/compose/ui/input/pointer/PointerIcon;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "t", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "pointerIconDefault", "rl", "pointerIconCrosshair", "O", "pointerIconText", "nr", "pointerIconHand", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PointerIcon_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PointerIcon f32090n = new AndroidPointerIcon(1000);
    private static final PointerIcon rl = new AndroidPointerIcon(1007);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final PointerIcon f32091t = new AndroidPointerIcon(1008);
    private static final PointerIcon nr = new AndroidPointerIcon(1002);

    public static final PointerIcon O() {
        return f32091t;
    }

    public static final PointerIcon n(int i2) {
        return new AndroidPointerIcon(i2);
    }

    public static final PointerIcon nr() {
        return nr;
    }

    public static final PointerIcon rl() {
        return rl;
    }

    public static final PointerIcon t() {
        return f32090n;
    }
}
