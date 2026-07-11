package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/KeyMapping;", c.f62177j, "Landroidx/compose/foundation/text/KeyMapping;", "()Landroidx/compose/foundation/text/KeyMapping;", "platformDefaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class KeyMapping_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final KeyMapping f19730n = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        public KeyCommand n(KeyEvent event) {
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.J2(event) && KeyEvent_androidKt.nr(event)) {
                long jN = KeyEvent_androidKt.n(event);
                MappedKeys mappedKeys = MappedKeys.f19781n;
                if (Key.r(jN, mappedKeys.xMQ())) {
                    keyCommand = KeyCommand.pJg;
                } else if (Key.r(jN, mappedKeys.mUb())) {
                    keyCommand = KeyCommand.ofS;
                } else if (Key.r(jN, mappedKeys.gh())) {
                    keyCommand = KeyCommand.f19718k;
                } else if (Key.r(jN, mappedKeys.KN())) {
                    keyCommand = KeyCommand.dR0;
                }
            } else if (KeyEvent_androidKt.nr(event)) {
                long jN2 = KeyEvent_androidKt.n(event);
                MappedKeys mappedKeys2 = MappedKeys.f19781n;
                if (Key.r(jN2, mappedKeys2.xMQ())) {
                    keyCommand = KeyCommand.E2;
                } else if (Key.r(jN2, mappedKeys2.mUb())) {
                    keyCommand = KeyCommand.f19716e;
                } else if (Key.r(jN2, mappedKeys2.gh())) {
                    keyCommand = KeyCommand.Xw;
                } else if (Key.r(jN2, mappedKeys2.KN())) {
                    keyCommand = KeyCommand.jB;
                }
            }
            if (keyCommand == null) {
                return KeyMappingKt.rl().n(event);
            }
            return keyCommand;
        }
    };

    public static final KeyMapping n() {
        return f19730n;
    }
}
