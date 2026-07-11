package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "target", "deleted", c.f62177j, "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EditingBufferKt {
    public static final long n(long j2, long j3) {
        int iMUb;
        int iQie = TextRange.qie(j2);
        int iGh = TextRange.gh(j2);
        if (TextRange.ck(j3, j2)) {
            if (TextRange.nr(j3, j2)) {
                iQie = TextRange.qie(j3);
                iGh = iQie;
            } else {
                if (TextRange.nr(j2, j3)) {
                    iMUb = TextRange.mUb(j3);
                } else if (TextRange.O(j3, iQie)) {
                    iQie = TextRange.qie(j3);
                    iMUb = TextRange.mUb(j3);
                } else {
                    iGh = TextRange.qie(j3);
                }
                iGh -= iMUb;
            }
        } else if (iGh > TextRange.qie(j3)) {
            iQie -= TextRange.mUb(j3);
            iMUb = TextRange.mUb(j3);
            iGh -= iMUb;
        }
        return TextRangeKt.rl(iQie, iGh);
    }
}
