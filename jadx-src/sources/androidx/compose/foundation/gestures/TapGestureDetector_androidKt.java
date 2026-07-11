package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0018\u0010\u0006\u001a\u00020\u0000*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"", c.f62177j, "()Z", "Landroidx/compose/ui/input/pointer/PointerEvent;", "rl", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "isDeepPress", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TapGestureDetector_androidKt {
    public static final boolean n() {
        return false;
    }

    public static final boolean rl(PointerEvent pointerEvent) {
        if (pointerEvent.nr() == 2) {
            return true;
        }
        return false;
    }
}
