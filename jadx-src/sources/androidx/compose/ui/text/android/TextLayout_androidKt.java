package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 \"\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "gh", "(I)Landroid/text/TextDirectionHeuristic;", "topPadding", "bottomPadding", "Landroidx/compose/ui/text/android/VerticalPaddings;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(II)J", "Landroidx/compose/ui/text/android/TextLayout;", "qie", "(Landroidx/compose/ui/text/android/TextLayout;)J", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "xMQ", "([Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;)J", "Landroid/text/TextPaint;", "textPaint", "frameworkTextDir", "lineHeightSpans", "Landroid/graphics/Paint$FontMetricsInt;", "KN", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;)Landroid/graphics/Paint$FontMetricsInt;", "mUb", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/Layout;", "lineIndex", "", "az", "(Landroid/text/Layout;I)Z", "Landroidx/compose/ui/text/android/TextAndroidCanvas;", "Landroidx/compose/ui/text/android/TextAndroidCanvas;", "SharedTextAndroidCanvas", "rl", "J", "ZeroVerticalPadding", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout_androidKt\n+ 2 InlineClassUtils.android.kt\nandroidx/compose/ui/text/android/InlineClassUtils_androidKt\n*L\n1#1,1127:1\n23#2:1128\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout_androidKt\n*L\n959#1:1128\n*E\n"})
public final class TextLayout_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final TextAndroidCanvas f33570n = new TextAndroidCanvas();
    private static final long rl = n(0, 0);

    public static final long n(int i2, int i3) {
        return VerticalPaddings.n((((long) i3) & 4294967295L) | (((long) i2) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long xMQ(LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (LineHeightStyleSpan lineHeightStyleSpan : lineHeightStyleSpanArr) {
            if (lineHeightStyleSpan.getFirstAscentDiff() < 0) {
                iMax = Math.max(iMax, Math.abs(lineHeightStyleSpan.getFirstAscentDiff()));
            }
            if (lineHeightStyleSpan.getLastDescentDiff() < 0) {
                iMax2 = Math.max(iMax, Math.abs(lineHeightStyleSpan.getLastDescentDiff()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? rl : n(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt KN(TextLayout textLayout, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        int iAz = textLayout.az() - 1;
        if (textLayout.xMQ().getLineStart(iAz) != textLayout.xMQ().getLineEnd(iAz) || lineHeightStyleSpanArr == null || lineHeightStyleSpanArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        LineHeightStyleSpan lineHeightStyleSpan = (LineHeightStyleSpan) ArraysKt.first(lineHeightStyleSpanArr);
        spannableString.setSpan(lineHeightStyleSpan.rl(0, spannableString.length(), (iAz == 0 || !lineHeightStyleSpan.getTrimLastLineBottom()) ? lineHeightStyleSpan.getTrimLastLineBottom() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutRl = StaticLayoutFactory.rl(StaticLayoutFactory.f33548n, spannableString, textPaint, Integer.MAX_VALUE, 0, spannableString.length(), textDirectionHeuristic, null, 0, null, 0, 0.0f, 0.0f, 0, textLayout.KN(), textLayout.O(), 0, 0, 0, 0, null, null, 2072512, null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutRl.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutRl.getLineDescent(0);
        fontMetricsInt.top = staticLayoutRl.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutRl.getLineBottom(0);
        return fontMetricsInt;
    }

    public static final TextDirectionHeuristic gh(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    public static final boolean az(Layout layout, int i2) {
        if (layout.getEllipsisCount(i2) > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyleSpan[] mUb(TextLayout textLayout) {
        if (!(textLayout.X() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceX = textLayout.X();
        Intrinsics.checkNotNull(charSequenceX, "null cannot be cast to non-null type android.text.Spanned");
        if (!SpannedExtensions_androidKt.n((Spanned) charSequenceX, LineHeightStyleSpan.class) && textLayout.X().length() > 0) {
            return null;
        }
        CharSequence charSequenceX2 = textLayout.X();
        Intrinsics.checkNotNull(charSequenceX2, "null cannot be cast to non-null type android.text.Spanned");
        return (LineHeightStyleSpan[]) ((Spanned) charSequenceX2).getSpans(0, textLayout.X().length(), LineHeightStyleSpan.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long qie(TextLayout textLayout) {
        int topPadding;
        int bottomPadding;
        if (!textLayout.KN() && !textLayout.nHg()) {
            TextPaint paint = textLayout.xMQ().getPaint();
            CharSequence text = textLayout.xMQ().getText();
            Rect rectT = PaintExtensions_androidKt.t(paint, text, textLayout.xMQ().getLineStart(0), textLayout.xMQ().getLineEnd(0));
            int lineAscent = textLayout.xMQ().getLineAscent(0);
            int i2 = rectT.top;
            if (i2 < lineAscent) {
                topPadding = lineAscent - i2;
            } else {
                topPadding = textLayout.xMQ().getTopPadding();
            }
            if (textLayout.az() != 1) {
                int iAz = textLayout.az() - 1;
                rectT = PaintExtensions_androidKt.t(paint, text, textLayout.xMQ().getLineStart(iAz), textLayout.xMQ().getLineEnd(iAz));
            }
            int lineDescent = textLayout.xMQ().getLineDescent(textLayout.az() - 1);
            int i3 = rectT.bottom;
            if (i3 > lineDescent) {
                bottomPadding = i3 - lineDescent;
            } else {
                bottomPadding = textLayout.xMQ().getBottomPadding();
            }
            if (topPadding == 0 && bottomPadding == 0) {
                return rl;
            }
            return n(topPadding, bottomPadding);
        }
        return rl;
    }
}
