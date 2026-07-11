package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"", "Landroidx/compose/ui/text/TextRange;", "range", "", "O", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "", TtmlNode.START, TtmlNode.END, "rl", "(II)J", "index", c.f62177j, "(I)J", "minimumValue", "maximumValue", "t", "(JII)J", "", "nr", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,123:1\n101#2,10:124\n101#2,10:134\n114#3,8:144\n80#4:152\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n109#1:124,10\n110#1:134,10\n118#1:144,8\n121#1:152\n*E\n"})
public final class TextRangeKt {
    private static final long nr(int i2, int i3) {
        if (!(i2 >= 0 && i3 >= 0)) {
            InlineClassHelperKt.n("start and end cannot be negative. [start: " + i2 + ", end: " + i3 + ']');
        }
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static final String O(CharSequence charSequence, long j2) {
        return charSequence.subSequence(TextRange.qie(j2), TextRange.gh(j2)).toString();
    }

    public static final long n(int i2) {
        return rl(i2, i2);
    }

    public static final long rl(int i2, int i3) {
        return TextRange.t(nr(i2, i3));
    }

    public static final long t(long j2, int i2, int i3) {
        int iTy = TextRange.ty(j2);
        if (iTy < i2) {
            iTy = i2;
        }
        if (iTy > i3) {
            iTy = i3;
        }
        int iXMQ = TextRange.xMQ(j2);
        if (iXMQ >= i2) {
            i2 = iXMQ;
        }
        if (i2 <= i3) {
            i3 = i2;
        }
        if (iTy == TextRange.ty(j2) && i3 == TextRange.xMQ(j2)) {
            return j2;
        }
        return rl(iTy, i3);
    }
}
