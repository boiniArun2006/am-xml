package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", c.f62177j, "(Landroid/view/KeyEvent;)Z", "", "rl", "()V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class KeyEventHelpers_androidKt {
    public static final void rl() {
    }

    public static final boolean n(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && KeyEventType.J2(KeyEvent_androidKt.rl(keyEvent), KeyEventType.INSTANCE.rl())) {
            return true;
        }
        return false;
    }
}
