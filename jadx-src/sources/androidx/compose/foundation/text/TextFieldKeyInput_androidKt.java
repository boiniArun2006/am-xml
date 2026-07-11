package androidx.compose.foundation.text;

import android.view.KeyEvent;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", c.f62177j, "(Landroid/view/KeyEvent;)Z", "isTypedEvent", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldKeyInput_androidKt {
    public static final boolean n(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
            return true;
        }
        return false;
    }
}
