package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a2\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000e\u001a\u00020\u000b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "originalRange", "", "replaceStart", "replaceEnd", "insertedTextLength", c.f62177j, "(JIII)J", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", TtmlNode.START, TtmlNode.END, "", "rl", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;II)V", "t", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldBufferKt {
    public static /* synthetic */ void nr(TextFieldBuffer textFieldBuffer, int i2, int i3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = i2;
        }
        t(textFieldBuffer, i2, i3);
    }

    public static final void rl(TextFieldBuffer textFieldBuffer, int i2, int i3) {
        textFieldBuffer.ck(i2, i3, "");
    }

    public static final long n(long j2, int i2, int i3, int i5) {
        int i7;
        int iQie = TextRange.qie(j2);
        int iGh = TextRange.gh(j2);
        if (iGh < i2) {
            return j2;
        }
        if (iQie <= i2 && i3 <= iGh) {
            i7 = i5 - (i3 - i2);
            if (iQie == iGh) {
                iQie += i7;
            }
            i2 = iGh + i7;
        } else if (iQie > i2 && iGh < i3) {
            i2 += i5;
            iQie = i2;
        } else if (iQie >= i3) {
            i7 = i5 - (i3 - i2);
            iQie += i7;
            i2 = iGh + i7;
        } else if (i2 < iQie) {
            iQie = i2 + i5;
            i7 = i5 - (i3 - i2);
            i2 = iGh + i7;
        }
        return TextRangeKt.rl(iQie, i2);
    }

    public static final void t(TextFieldBuffer textFieldBuffer, int i2, int i3) {
        textFieldBuffer.aYN(TextRangeKt.rl(RangesKt.coerceIn(i2, 0, textFieldBuffer.mUb()), RangesKt.coerceIn(i3, 0, textFieldBuffer.mUb())));
    }
}
