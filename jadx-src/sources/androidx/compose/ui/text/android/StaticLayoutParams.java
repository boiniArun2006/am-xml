package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b+\b\u0002\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b0\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\"\u00107R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b*\u0010<R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bB\u0010AR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\b8\u0010)R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b9\u0010C\u001a\u0004\b5\u0010DR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b.\u0010C\u001a\u0004\bC\u0010DR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010'\u001a\u0004\b&\u0010)R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b=\u0010)R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b>\u0010)R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b1\u0010)R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bC\u0010F\u001a\u0004\b:\u0010GR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b0\u0010F\u001a\u0004\bE\u0010G¨\u0006H"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutParams;", "", "", "text", "", TtmlNode.START, TtmlNode.END, "Landroid/text/TextPaint;", "paint", "width", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "alignment", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "", "lineSpacingMultiplier", "lineSpacingExtra", "justificationMode", "", "includePadding", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Ljava/lang/CharSequence;", "r", "()Ljava/lang/CharSequence;", "rl", "I", "Ik", "()I", "t", "O", "nr", "Landroid/text/TextPaint;", "HI", "()Landroid/text/TextPaint;", "XQ", "J2", "Landroid/text/TextDirectionHeuristic;", "o", "()Landroid/text/TextDirectionHeuristic;", "Uo", "Landroid/text/Layout$Alignment;", "()Landroid/text/Layout$Alignment;", "KN", "ty", "xMQ", "Landroid/text/TextUtils$TruncateAt;", "()Landroid/text/TextUtils$TruncateAt;", "mUb", "gh", "F", "az", "()F", "qie", "Z", "()Z", "ck", "[I", "()[I", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStaticLayoutFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticLayoutFactory.android.kt\nandroidx/compose/ui/text/android/StaticLayoutParams\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,358:1\n114#2,8:359\n114#2,8:367\n114#2,8:375\n114#2,8:383\n114#2,8:391\n114#2,8:399\n*S KotlinDebug\n*F\n+ 1 StaticLayoutFactory.android.kt\nandroidx/compose/ui/text/android/StaticLayoutParams\n*L\n143#1:359,8\n144#1:367,8\n145#1:375,8\n146#1:383,8\n147#1:391,8\n148#1:399,8\n*E\n"})
final class StaticLayoutParams {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final boolean useFallbackLineSpacing;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final int lineBreakStyle;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final TextDirectionHeuristic textDir;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Layout.Alignment alignment;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final int[] rightIndents;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final int[] leftIndents;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final int justificationMode;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final int breakStrategy;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final float lineSpacingMultiplier;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final int ellipsizedWidth;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CharSequence text;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final TextPaint paint;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int hyphenationFrequency;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final float lineSpacingExtra;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int lineBreakWordStyle;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int start;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final boolean includePadding;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final TextUtils.TruncateAt ellipsize;

    public StaticLayoutParams(CharSequence charSequence, int i2, int i3, TextPaint textPaint, int i5, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i7, TextUtils.TruncateAt truncateAt, int i8, float f3, float f4, int i9, boolean z2, boolean z3, int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        this.text = charSequence;
        this.start = i2;
        this.end = i3;
        this.paint = textPaint;
        this.width = i5;
        this.textDir = textDirectionHeuristic;
        this.alignment = alignment;
        this.maxLines = i7;
        this.ellipsize = truncateAt;
        this.ellipsizedWidth = i8;
        this.lineSpacingMultiplier = f3;
        this.lineSpacingExtra = f4;
        this.justificationMode = i9;
        this.includePadding = z2;
        this.useFallbackLineSpacing = z3;
        this.breakStrategy = i10;
        this.lineBreakStyle = i11;
        this.lineBreakWordStyle = i12;
        this.hyphenationFrequency = i13;
        this.leftIndents = iArr;
        this.rightIndents = iArr2;
        if (!(i2 >= 0 && i2 <= i3)) {
            InlineClassHelperKt.n("invalid start value");
        }
        if (!(i3 >= 0 && i3 <= charSequence.length())) {
            InlineClassHelperKt.n("invalid end value");
        }
        if (!(i7 >= 0)) {
            InlineClassHelperKt.n("invalid maxLines value");
        }
        if (!(i5 >= 0)) {
            InlineClassHelperKt.n("invalid width value");
        }
        if (!(i8 >= 0)) {
            InlineClassHelperKt.n("invalid ellipsizedWidth value");
        }
        if (f3 >= 0.0f) {
            return;
        }
        InlineClassHelperKt.n("invalid lineSpacingMultiplier value");
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final TextPaint getPaint() {
        return this.paint;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final int getJustificationMode() {
        return this.justificationMode;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final boolean getUseFallbackLineSpacing() {
        return this.useFallbackLineSpacing;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final float getLineSpacingMultiplier() {
        return this.lineSpacingMultiplier;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final int[] getRightIndents() {
        return this.rightIndents;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final int getLineBreakWordStyle() {
        return this.lineBreakWordStyle;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final int getLineBreakStyle() {
        return this.lineBreakStyle;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getBreakStrategy() {
        return this.breakStrategy;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final int[] getLeftIndents() {
        return this.leftIndents;
    }
}
