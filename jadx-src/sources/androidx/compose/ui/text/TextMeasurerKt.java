package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/TextOverflow;", "", "rl", "(I)Z", "isEllipsis", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextMeasurerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rl(int i2) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return TextOverflow.KN(i2, companion.rl()) || TextOverflow.KN(i2, companion.nr()) || TextOverflow.KN(i2, companion.t());
    }
}
