package androidx.compose.ui.text.android.selection;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "offset", "rl", "(Landroidx/compose/ui/text/android/selection/WordIterator;I)I", c.f62177j, "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class WordBoundary_androidKt {
    public static final int n(WordIterator wordIterator, int i2) {
        int iNr;
        if (wordIterator.xMQ(wordIterator.ck(i2))) {
            iNr = wordIterator.Uo(i2);
        } else {
            iNr = wordIterator.nr(i2);
        }
        if (iNr == -1) {
            return i2;
        }
        return iNr;
    }

    public static final int rl(WordIterator wordIterator, int i2) {
        int iO;
        if (wordIterator.az(wordIterator.Ik(i2))) {
            iO = wordIterator.J2(i2);
        } else {
            iO = wordIterator.O(i2);
        }
        if (iO == -1) {
            return i2;
        }
        return iO;
    }
}
