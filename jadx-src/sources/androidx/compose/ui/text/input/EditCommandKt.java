package androidx.compose.ui.text.input;

import com.safedk.android.analytics.brandsafety.l;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "high", l.aa, "", "rl", "(CC)Z", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EditCommandKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rl(char c2, char c4) {
        if (Character.isHighSurrogate(c2) && Character.isLowSurrogate(c4)) {
            return true;
        }
        return false;
    }
}
