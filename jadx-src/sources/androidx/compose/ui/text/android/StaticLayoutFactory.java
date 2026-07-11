package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jß\u0001\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0003\u0010\u0013\u001a\u00020\b2\b\b\u0003\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory;", "", "<init>", "()V", "", "text", "Landroid/text/TextPaint;", "paint", "", "width", TtmlNode.START, TtmlNode.END, "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "alignment", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "", "lineSpacingMultiplier", "lineSpacingExtra", "justificationMode", "", "includePadding", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "leftIndents", "rightIndents", "Landroid/text/StaticLayout;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Ljava/lang/CharSequence;Landroid/text/TextPaint;IIILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)Landroid/text/StaticLayout;", TtmlNode.TAG_LAYOUT, "t", "(Landroid/text/StaticLayout;Z)Z", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "rl", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "delegate", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StaticLayoutFactory {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final StaticLayoutFactory f33548n = new StaticLayoutFactory();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final StaticLayoutFactoryImpl delegate = new StaticLayoutFactory23();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f33549t = 8;

    public static /* synthetic */ StaticLayout rl(StaticLayoutFactory staticLayoutFactory, CharSequence charSequence, TextPaint textPaint, int i2, int i3, int i5, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i7, TextUtils.TruncateAt truncateAt, int i8, float f3, float f4, int i9, boolean z2, boolean z3, int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2, int i14, Object obj) {
        int[] iArr3;
        StaticLayoutFactory staticLayoutFactory2;
        CharSequence charSequence2;
        TextPaint textPaint2;
        int i15;
        int i16 = (i14 & 8) != 0 ? 0 : i3;
        int length = (i14 & 16) != 0 ? charSequence.length() : i5;
        TextDirectionHeuristic textDirectionHeuristicRl = (i14 & 32) != 0 ? LayoutCompat.f33536n.rl() : textDirectionHeuristic;
        Layout.Alignment alignmentN = (i14 & 64) != 0 ? LayoutCompat.f33536n.n() : alignment;
        int i17 = (i14 & 128) != 0 ? Integer.MAX_VALUE : i7;
        TextUtils.TruncateAt truncateAt2 = (i14 & 256) != 0 ? null : truncateAt;
        int i18 = (i14 & 512) != 0 ? i2 : i8;
        float f5 = (i14 & 1024) != 0 ? 1.0f : f3;
        float f6 = (i14 & 2048) != 0 ? 0.0f : f4;
        int i19 = (i14 & 4096) != 0 ? 0 : i9;
        boolean z4 = (i14 & 8192) != 0 ? false : z2;
        boolean z5 = (i14 & 16384) != 0 ? true : z3;
        int i20 = (32768 & i14) != 0 ? 0 : i10;
        int i21 = (65536 & i14) != 0 ? 0 : i11;
        int i22 = (131072 & i14) != 0 ? 0 : i12;
        int i23 = (262144 & i14) != 0 ? 0 : i13;
        int[] iArr4 = (524288 & i14) != 0 ? null : iArr;
        if ((i14 & 1048576) != 0) {
            iArr3 = null;
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i15 = i2;
            staticLayoutFactory2 = staticLayoutFactory;
        } else {
            iArr3 = iArr2;
            staticLayoutFactory2 = staticLayoutFactory;
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i15 = i2;
        }
        return staticLayoutFactory2.n(charSequence2, textPaint2, i15, i16, length, textDirectionHeuristicRl, alignmentN, i17, truncateAt2, i18, f5, f6, i19, z4, z5, i20, i21, i22, i23, iArr4, iArr3);
    }

    public final StaticLayout n(CharSequence text, TextPaint paint, int width, int start, int end, TextDirectionHeuristic textDir, Layout.Alignment alignment, int maxLines, TextUtils.TruncateAt ellipsize, int ellipsizedWidth, float lineSpacingMultiplier, float lineSpacingExtra, int justificationMode, boolean includePadding, boolean useFallbackLineSpacing, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle, int hyphenationFrequency, int[] leftIndents, int[] rightIndents) {
        return delegate.n(new StaticLayoutParams(text, start, end, paint, width, textDir, alignment, maxLines, ellipsize, ellipsizedWidth, lineSpacingMultiplier, lineSpacingExtra, justificationMode, includePadding, useFallbackLineSpacing, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphenationFrequency, leftIndents, rightIndents));
    }

    public final boolean t(StaticLayout layout, boolean useFallbackLineSpacing) {
        return delegate.rl(layout, useFallbackLineSpacing);
    }

    private StaticLayoutFactory() {
    }
}
