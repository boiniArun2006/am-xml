package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0004\u001a\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004\u001a\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0016\u0010\u001f\u001a\u00020\u0002*\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/style/TextAlign;", "align", "", "az", "(I)I", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "HI", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "breakStrategy", "ty", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "lineBreakStrictness", "ck", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "lineBreakWordStyle", "Ik", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "gh", "(Landroidx/compose/ui/text/android/TextLayout;I)I", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "ellipsis", "qie", "(Landroidx/compose/ui/text/TextStyle;Z)Z", "", "mUb", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Landroidx/compose/ui/text/TextGranularity;", "r", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean qie(TextStyle textStyle, boolean z2) {
        if (z2 && !TextUnit.O(textStyle.Ik(), TextUnitKt.KN(0)) && !TextUnit.O(textStyle.Ik(), TextUnit.INSTANCE.n())) {
            int iNY = textStyle.nY();
            TextAlign.Companion companion = TextAlign.INSTANCE;
            if (!TextAlign.gh(iNY, companion.Uo()) && !TextAlign.gh(textStyle.nY(), companion.J2()) && !TextAlign.gh(textStyle.nY(), companion.t())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int HI(int i2) {
        Hyphens.Companion companion = Hyphens.INSTANCE;
        if (Hyphens.Uo(i2, companion.n())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.Uo(i2, companion.rl());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Ik(int i2) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.INSTANCE;
        return (!LineBreak.WordBreak.O(i2, companion.n()) && LineBreak.WordBreak.O(i2, companion.rl())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int az(int i2) {
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (TextAlign.gh(i2, companion.nr())) {
            return 3;
        }
        if (TextAlign.gh(i2, companion.O())) {
            return 4;
        }
        if (TextAlign.gh(i2, companion.n())) {
            return 2;
        }
        return (!TextAlign.gh(i2, companion.J2()) && TextAlign.gh(i2, companion.rl())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ck(int i2) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.INSTANCE;
        if (LineBreak.Strictness.Uo(i2, companion.n())) {
            return 0;
        }
        if (LineBreak.Strictness.Uo(i2, companion.rl())) {
            return 1;
        }
        if (LineBreak.Strictness.Uo(i2, companion.t())) {
            return 2;
        }
        return LineBreak.Strictness.Uo(i2, companion.nr()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(int i2) {
        TextGranularity.Companion companion = TextGranularity.INSTANCE;
        return (!TextGranularity.O(i2, companion.n()) && TextGranularity.O(i2, companion.rl())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ty(int i2) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.INSTANCE;
        if (LineBreak.Strategy.J2(i2, companion.t())) {
            return 0;
        }
        if (LineBreak.Strategy.J2(i2, companion.rl())) {
            return 1;
        }
        return LineBreak.Strategy.J2(i2, companion.n()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int gh(TextLayout textLayout, int i2) {
        int lineCount = textLayout.getLineCount();
        for (int i3 = 0; i3 < lineCount; i3++) {
            if (textLayout.qie(i3) > i2) {
                return i3;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence mUb(CharSequence charSequence) {
        Spannable spannableString;
        if (charSequence.length() == 0) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = null;
        }
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!SpannedExtensions_androidKt.n(spannableString, IndentationFixSpan.class)) {
            SpannableExtensions_androidKt.WPU(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }
}
