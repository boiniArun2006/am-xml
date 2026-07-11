package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b$\u0010!J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b'\u0010!J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b(\u0010!J\u0015\u0010)\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b+\u0010*J\u0015\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b,\u0010*J\u0015\u0010-\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b/\u0010*J\u0015\u00100\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b0\u0010*J\u0015\u00102\u001a\u00020\b2\u0006\u00101\u001a\u00020\b¢\u0006\u0004\b2\u0010*J\u001d\u00104\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\u00042\u0006\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u00042\u0006\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\u000f¢\u0006\u0004\b:\u00109J\u0015\u0010;\u001a\u00020\b2\u0006\u00106\u001a\u00020\b¢\u0006\u0004\b;\u0010*J\u0015\u0010<\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\b¢\u0006\u0004\b<\u0010.J\u0015\u0010=\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b=\u0010*J%\u0010C\u001a\u00020B2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\b2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bC\u0010DJ9\u0010J\u001a\u0004\u0018\u00010\u00182\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\b2\u0018\u0010I\u001a\u0014\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u000f0H¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020B2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010M\u001a\u00020LH\u0000¢\u0006\u0004\bN\u0010OJ-\u0010S\u001a\u00020B2\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010M\u001a\u00020L2\u0006\u0010R\u001a\u00020\b¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u00020E2\u0006\u00106\u001a\u00020\b¢\u0006\u0004\bU\u0010VJ\u0015\u0010Y\u001a\u00020B2\u0006\u0010X\u001a\u00020W¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u000fH\u0000¢\u0006\u0004\b[\u0010\\R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bS\u0010]\u001a\u0004\b^\u0010_R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010`R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bU\u0010#\u001a\u0004\ba\u0010\\R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bb\u0010#\u001a\u0004\bc\u0010\\R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010h\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bg\u0010#\u001a\u0004\bb\u0010\\R\u0018\u0010k\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010jR \u0010r\u001a\u00020l8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\ba\u0010m\u0012\u0004\bp\u0010q\u001a\u0004\bn\u0010oR\u0017\u0010v\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bn\u0010s\u001a\u0004\bt\u0010uR \u0010z\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bw\u0010s\u0012\u0004\by\u0010q\u001a\u0004\bx\u0010uR \u0010}\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b'\u0010s\u0012\u0004\b|\u0010q\u001a\u0004\b{\u0010uR\u0014\u0010\u007f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010~R\u0015\u0010\u0080\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010~R\u0015\u0010\u0081\u0001\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010#R\u0019\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010\u0083\u0001R\u0015\u0010\u0085\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010sR \u0010\u0089\u0001\u001a\f\u0012\u0005\u0012\u00030\u0087\u0001\u0018\u00010\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010\u0088\u0001R\u0016\u0010F\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010\u008b\u0001R\u001b\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b(\u0010\u008d\u0001R\u0017\u0010\u0090\u0001\u001a\u00030\u008c\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bw\u0010\u008f\u0001R\u0014\u0010\u0093\u0001\u001a\u00020i8F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0014\u0010\u0096\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0012\u0010\u0097\u0001\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bg\u0010u¨\u0006\u0098\u0001"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "line", "Uo", "(I)F", "lineIndex", "Z", "XQ", "WPU", "qie", "gh", "o", "S", "(I)I", "ck", "aYN", "s7N", "(I)Z", "HI", "ty", "vertical", "r", "horizontal", "ViF", "(IF)I", "offset", "upstream", "g", "(IZ)F", "fD", "Ik", "wTp", "nY", TtmlNode.START, TtmlNode.END, "Landroid/graphics/Path;", "dest", "", "e", "(IILandroid/graphics/Path;)V", "Landroid/graphics/RectF;", "rect", "granularity", "Lkotlin/Function2;", "inclusionStrategy", "iF", "(Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "", "array", "rl", "(I[F)V", "startOffset", "endOffset", "arrayStart", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(II[FI)V", "t", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "canvas", "v", "(Landroid/graphics/Canvas;)V", "nHg", "()Z", "Landroid/text/TextPaint;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()Landroid/text/TextPaint;", "Landroid/text/TextUtils$TruncateAt;", "KN", "nr", "O", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "J2", "didExceedMaxLines", "Landroidx/compose/ui/text/android/selection/WordIterator;", "Landroidx/compose/ui/text/android/selection/WordIterator;", "backingWordIterator", "Landroid/text/Layout;", "Landroid/text/Layout;", "xMQ", "()Landroid/text/Layout;", "getLayout$annotations", "()V", TtmlNode.TAG_LAYOUT, "I", "az", "()I", "lineCount", "mUb", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "topPadding", "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "bottomPadding", "F", "leftPadding", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "lastLineExtra", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "lineHeightSpans", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "Landroidx/compose/ui/text/android/LayoutHelper;", "Landroidx/compose/ui/text/android/LayoutHelper;", "backingLayoutHelper", "()Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "N", "()Landroidx/compose/ui/text/android/selection/WordIterator;", "wordIterator", "X", "()Ljava/lang/CharSequence;", "text", "height", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1127:1\n1#2:1128\n114#3,8:1129\n114#3,8:1137\n114#3,8:1145\n114#3,8:1153\n114#3,8:1161\n114#3,8:1169\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout\n*L\n607#1:1129,8\n674#1:1137,8\n675#1:1145,8\n678#1:1153,8\n681#1:1161,8\n688#1:1169,8\n*E\n"})
public final class TextLayout {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final Paint.FontMetricsInt lastLineFontMetrics;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final LineHeightStyleSpan[] lineHeightSpans;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final Layout layout;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final LayoutIntrinsics layoutIntrinsics;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private WordIterator backingWordIterator;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final float rightPadding;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final int lastLineExtra;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final int bottomPadding;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final int topPadding;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TextPaint textPaint;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final boolean fallbackLineSpacing;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private LayoutHelper backingLayoutHelper;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final float leftPadding;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Rect rect;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final TextUtils.TruncateAt ellipsize;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean includePadding;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final boolean isBoringLayout;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final int lineCount;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public TextLayout(CharSequence charSequence, float f3, TextPaint textPaint, int i2, TextUtils.TruncateAt truncateAt, int i3, float f4, float f5, boolean z2, boolean z3, int i5, int i7, int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics) {
        boolean z4;
        int i12;
        boolean z5;
        TextDirectionHeuristic textDirectionHeuristic;
        TextPaint textPaint2;
        Layout layoutN;
        this.textPaint = textPaint;
        this.ellipsize = truncateAt;
        this.includePadding = z2;
        this.fallbackLineSpacing = z3;
        this.layoutIntrinsics = layoutIntrinsics;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicGh = TextLayout_androidKt.gh(i3);
        Layout.Alignment alignmentN = TextAlignmentAdapter.f33562n.n(i2);
        boolean z6 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsO = layoutIntrinsics.O();
            double d2 = f3;
            int iCeil = (int) Math.ceil(d2);
            if (metricsO == null || layoutIntrinsics.xMQ() > f3 || z6) {
                z4 = true;
                this.isBoringLayout = false;
                i12 = i5;
                z5 = false;
                textDirectionHeuristic = textDirectionHeuristicGh;
                textPaint2 = textPaint;
                layoutN = StaticLayoutFactory.f33548n.n(charSequence, textPaint2, iCeil, 0, charSequence.length(), textDirectionHeuristic, alignmentN, i12, truncateAt, (int) Math.ceil(d2), f4, f5, i11, z2, z3, i7, i8, i9, i10, iArr, iArr2);
            } else {
                z4 = true;
                this.isBoringLayout = true;
                layoutN = BoringLayoutFactory.f33522n.n(charSequence, textPaint, iCeil, metricsO, alignmentN, z2, z3, truncateAt, iCeil);
                textPaint2 = textPaint;
                i12 = i5;
                textDirectionHeuristic = textDirectionHeuristicGh;
                z5 = false;
            }
            this.layout = layoutN;
            Trace.endSection();
            int iMin = Math.min(layoutN.getLineCount(), i12);
            this.lineCount = iMin;
            int i13 = iMin - 1;
            this.didExceedMaxLines = (iMin >= i12 && (layoutN.getEllipsisCount(i13) > 0 || layoutN.getLineEnd(i13) != charSequence.length())) ? z4 : z5;
            long jQie = TextLayout_androidKt.qie(this);
            LineHeightStyleSpan[] lineHeightStyleSpanArrMUb = TextLayout_androidKt.mUb(this);
            this.lineHeightSpans = lineHeightStyleSpanArrMUb;
            long jXMQ = lineHeightStyleSpanArrMUb != null ? TextLayout_androidKt.xMQ(lineHeightStyleSpanArrMUb) : TextLayout_androidKt.rl;
            this.topPadding = Math.max(VerticalPaddings.nr(jQie), VerticalPaddings.nr(jXMQ));
            this.bottomPadding = Math.max(VerticalPaddings.t(jQie), VerticalPaddings.t(jXMQ));
            Paint.FontMetricsInt fontMetricsIntKN = TextLayout_androidKt.KN(this, textPaint2, textDirectionHeuristic, lineHeightStyleSpanArrMUb);
            this.lastLineExtra = fontMetricsIntKN != null ? fontMetricsIntKN.bottom - ((int) o(i13)) : z5;
            this.lastLineFontMetrics = fontMetricsIntKN;
            this.leftPadding = IndentationFixSpan_androidKt.rl(layoutN, i13, null, 2, null);
            this.rightPadding = IndentationFixSpan_androidKt.nr(layoutN, i13, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static /* synthetic */ float E2(TextLayout textLayout, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return textLayout.fD(i2, z2);
    }

    private final float Uo(int line) {
        if (line == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    private final LayoutHelper mUb() {
        LayoutHelper layoutHelper = this.backingLayoutHelper;
        if (layoutHelper != null) {
            Intrinsics.checkNotNull(layoutHelper);
            return layoutHelper;
        }
        LayoutHelper layoutHelper2 = new LayoutHelper(this.layout);
        this.backingLayoutHelper = layoutHelper2;
        return layoutHelper2;
    }

    public static /* synthetic */ float te(TextLayout textLayout, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return textLayout.g(i2, z2);
    }

    public final int HI(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int Ik(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final int J2() {
        return (this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final WordIterator N() {
        WordIterator wordIterator = this.backingWordIterator;
        if (wordIterator != null) {
            return wordIterator;
        }
        WordIterator wordIterator2 = new WordIterator(this.layout.getText(), 0, this.layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = wordIterator2;
        return wordIterator2;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int S(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final int ViF(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, horizontal + ((-1) * Uo(line)));
    }

    public final float WPU(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final CharSequence X() {
        return this.layout.getText();
    }

    public final float XQ(int lineIndex) {
        return this.layout.getLineRight(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final float Z(int lineIndex) {
        return this.layout.getLineLeft(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final int aYN(int lineIndex) {
        return (TextLayout_androidKt.az(this.layout, lineIndex) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getLineStart(lineIndex) + this.layout.getEllipsisStart(lineIndex) : mUb().O(lineIndex);
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final int ck(int lineIndex) {
        return (TextLayout_androidKt.az(this.layout, lineIndex) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getText().length() : this.layout.getLineEnd(lineIndex);
    }

    public final void e(int start, int end, Path dest) {
        this.layout.getSelectionPath(start, end, dest);
        if (this.topPadding == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(0.0f, this.topPadding);
    }

    public final float gh(int line) {
        return this.topPadding + ((line != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(line) : WPU(line) - this.lastLineFontMetrics.ascent);
    }

    public final int[] iF(RectF rect, int granularity, Function2 inclusionStrategy) {
        return Build.VERSION.SDK_INT >= 34 ? AndroidLayoutApi34.f33521n.t(this, rect, granularity, inclusionStrategy) : TextLayoutGetRangeForRectExtensions_androidKt.nr(this, this.layout, mUb(), rect, granularity, inclusionStrategy);
    }

    public final void n(int startOffset, int endOffset, float[] array, int arrayStart) {
        float fNr;
        float fO;
        int length = X().length();
        if (!(startOffset >= 0)) {
            InlineClassHelperKt.n("startOffset must be > 0");
        }
        if (!(startOffset < length)) {
            InlineClassHelperKt.n("startOffset must be less than text length");
        }
        if (!(endOffset > startOffset)) {
            InlineClassHelperKt.n("endOffset must be greater than startOffset");
        }
        if (!(endOffset <= length)) {
            InlineClassHelperKt.n("endOffset must be smaller or equal to text length");
        }
        if (!(array.length - arrayStart >= (endOffset - startOffset) * 4)) {
            InlineClassHelperKt.n("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iIk = Ik(startOffset);
        int iIk2 = Ik(endOffset - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (iIk > iIk2) {
            return;
        }
        int i2 = iIk;
        int i3 = arrayStart;
        while (true) {
            int iS = S(i2);
            int iCk = ck(i2);
            int iMin = Math.min(endOffset, iCk);
            float fWPU = WPU(i2);
            float fQie = qie(i2);
            boolean z2 = nY(i2) == 1;
            for (int iMax = Math.max(startOffset, iS); iMax < iMin; iMax++) {
                boolean zWTp = wTp(iMax);
                if (z2 && !zWTp) {
                    fNr = horizontalPositionCache.rl(iMax);
                    fO = horizontalPositionCache.t(iMax + 1);
                } else if (z2 && zWTp) {
                    fO = horizontalPositionCache.nr(iMax);
                    fNr = horizontalPositionCache.O(iMax + 1);
                } else if (z2 || !zWTp) {
                    fNr = horizontalPositionCache.nr(iMax);
                    fO = horizontalPositionCache.O(iMax + 1);
                } else {
                    fO = horizontalPositionCache.rl(iMax);
                    fNr = horizontalPositionCache.t(iMax + 1);
                }
                array[i3] = fNr;
                array[i3 + 1] = fWPU;
                array[i3 + 2] = fO;
                array[i3 + 3] = fQie;
                i3 += 4;
            }
            if (i2 == iIk2) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final boolean nHg() {
        if (this.isBoringLayout) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.f33522n;
            Layout layout = this.layout;
            Intrinsics.checkNotNull(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.rl((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.f33548n;
        Layout layout2 = this.layout;
        Intrinsics.checkNotNull(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.t((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final int nY(int line) {
        return this.layout.getParagraphDirection(line);
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float qie(int line) {
        if (line != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(line - 1) + this.lastLineFontMetrics.bottom;
    }

    public final int r(int vertical) {
        return this.layout.getLineForVertical(vertical - this.topPadding);
    }

    public final boolean s7N(int lineIndex) {
        return TextLayout_androidKt.az(this.layout, lineIndex);
    }

    public final int ty(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final void v(Canvas canvas) {
        if (canvas.getClipBounds(this.rect)) {
            int i2 = this.topPadding;
            if (i2 != 0) {
                canvas.translate(0.0f, i2);
            }
            TextAndroidCanvas textAndroidCanvas = TextLayout_androidKt.f33570n;
            textAndroidCanvas.n(canvas);
            this.layout.draw(textAndroidCanvas);
            int i3 = this.topPadding;
            if (i3 != 0) {
                canvas.translate(0.0f, (-1) * i3);
            }
        }
    }

    public final boolean wTp(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    public final float fD(int offset, boolean upstream) {
        return mUb().t(offset, false, upstream) + Uo(Ik(offset));
    }

    public final float g(int offset, boolean upstream) {
        return mUb().t(offset, true, upstream) + Uo(Ik(offset));
    }

    public final float o(int lineIndex) {
        return qie(lineIndex) - WPU(lineIndex);
    }

    public final void rl(int lineIndex, float[] array) {
        boolean z2;
        float fNr;
        float fO;
        int iS = S(lineIndex);
        int iCk = ck(lineIndex);
        int i2 = 0;
        boolean z3 = true;
        if (array.length >= (iCk - iS) * 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.n("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (nY(lineIndex) != 1) {
            z3 = false;
        }
        while (iS < iCk) {
            boolean zWTp = wTp(iS);
            if (z3 && !zWTp) {
                fNr = horizontalPositionCache.rl(iS);
                fO = horizontalPositionCache.t(iS + 1);
            } else if (z3 && zWTp) {
                fO = horizontalPositionCache.nr(iS);
                fNr = horizontalPositionCache.O(iS + 1);
            } else if (zWTp) {
                fO = horizontalPositionCache.rl(iS);
                fNr = horizontalPositionCache.t(iS + 1);
            } else {
                fNr = horizontalPositionCache.nr(iS);
                fO = horizontalPositionCache.O(iS + 1);
            }
            array[i2] = fNr;
            array[i2 + 1] = fO;
            i2 += 2;
            iS++;
        }
    }

    public final RectF t(int offset) {
        boolean z2;
        float fFD;
        float fFD2;
        float fG;
        float fG2;
        int iIk = Ik(offset);
        float fWPU = WPU(iIk);
        float fQie = qie(iIk);
        if (nY(iIk) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(offset);
        if (z2 && !zIsRtlCharAt) {
            fFD = g(offset, false);
            fFD2 = g(offset + 1, true);
        } else {
            if (z2 && zIsRtlCharAt) {
                fG = fD(offset, false);
                fG2 = fD(offset + 1, true);
            } else if (zIsRtlCharAt) {
                fG = g(offset, false);
                fG2 = g(offset + 1, true);
            } else {
                fFD = fD(offset, false);
                fFD2 = fD(offset + 1, true);
            }
            float f3 = fG;
            fFD = fG2;
            fFD2 = f3;
        }
        return new RectF(fFD, fWPU, fFD2, fQie);
    }

    public /* synthetic */ TextLayout(CharSequence charSequence, float f3, TextPaint textPaint, int i2, TextUtils.TruncateAt truncateAt, int i3, float f4, float f5, boolean z2, boolean z3, int i5, int i7, int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        LayoutIntrinsics layoutIntrinsics2;
        int i13 = (i12 & 8) != 0 ? 0 : i2;
        TextUtils.TruncateAt truncateAt2 = (i12 & 16) != 0 ? null : truncateAt;
        int i14 = (i12 & 32) != 0 ? 2 : i3;
        float f6 = (i12 & 64) != 0 ? 1.0f : f4;
        float f7 = (i12 & 128) != 0 ? 0.0f : f5;
        boolean z4 = (i12 & 256) != 0 ? false : z2;
        boolean z5 = (i12 & 512) != 0 ? true : z3;
        int i15 = (i12 & 1024) != 0 ? Integer.MAX_VALUE : i5;
        int i16 = (i12 & 2048) != 0 ? 0 : i7;
        int i17 = (i12 & 4096) != 0 ? 0 : i8;
        int i18 = (i12 & 8192) != 0 ? 0 : i9;
        int i19 = (i12 & 16384) != 0 ? 0 : i10;
        int i20 = (32768 & i12) != 0 ? 0 : i11;
        int[] iArr3 = (65536 & i12) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i12) != 0 ? null : iArr2;
        if ((i12 & 262144) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            layoutIntrinsics2 = new LayoutIntrinsics(charSequence2, textPaint2, i14);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            layoutIntrinsics2 = layoutIntrinsics;
        }
        this(charSequence2, f3, textPaint2, i13, truncateAt2, i14, f6, f7, z4, z5, i15, i16, i17, i18, i19, i20, iArr3, iArr4, layoutIntrinsics2);
    }
}
