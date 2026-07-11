package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001ax\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "composition", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "rl", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Landroidx/compose/ui/text/TextLayoutResult;Landroid/graphics/Matrix;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "selectionStart", "t", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "endOffset", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCursorAnchorInfoBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoBuilder_androidKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,155:1\n54#2:156\n85#3:157\n*S KotlinDebug\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoBuilder_androidKt\n*L\n100#1:156\n100#1:157\n*E\n"})
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final CursorAnchorInfo.Builder n(CursorAnchorInfo.Builder builder, int i2, int i3, TextLayoutResult textLayoutResult, Rect rect) {
        ?? r3;
        float[] fArr = new float[(i3 - i2) * 4];
        textLayoutResult.getMultiParagraph().n(TextRangeKt.rl(i2, i3), fArr, 0);
        for (int i5 = i2; i5 < i3; i5++) {
            int i7 = (i5 - i2) * 4;
            Rect rect2 = new Rect(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3]);
            boolean zNY = rect.nY(rect2);
            if (LegacyCursorAnchorInfoBuilder_androidKt.t(rect, rect2.getLeft(), rect2.getTop())) {
                r3 = zNY;
                if (!LegacyCursorAnchorInfoBuilder_androidKt.t(rect, rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), rect2.xMQ())) {
                    r3 = (zNY ? 1 : 0) | 2;
                }
            }
            if (textLayoutResult.t(i5) == ResolvedTextDirection.f33909t) {
                r3 = (r3 == true ? 1 : 0) | 4;
            }
            builder.addCharacterBounds(i5, rect2.getLeft(), rect2.getTop(), rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), rect2.xMQ(), r3 == true ? 1 : 0);
        }
        return builder;
    }

    private static final CursorAnchorInfo.Builder t(CursorAnchorInfo.Builder builder, int i2, TextLayoutResult textLayoutResult, Rect rect) {
        if (i2 < 0) {
            return builder;
        }
        Rect rectO = textLayoutResult.O(i2);
        float fCoerceIn = RangesKt.coerceIn(rectO.getLeft(), 0.0f, (int) (textLayoutResult.getSize() >> 32));
        boolean zT2 = LegacyCursorAnchorInfoBuilder_androidKt.t(rect, fCoerceIn, rectO.getTop());
        boolean zT3 = LegacyCursorAnchorInfoBuilder_androidKt.t(rect, fCoerceIn, rectO.xMQ());
        boolean z2 = textLayoutResult.t(i2) == ResolvedTextDirection.f33909t;
        int i3 = (zT2 || zT3) ? 1 : 0;
        if (!zT2 || !zT3) {
            i3 |= 2;
        }
        if (z2) {
            i3 |= 4;
        }
        builder.setInsertionMarkerLocation(fCoerceIn, rectO.getTop(), rectO.xMQ(), rectO.xMQ(), i3);
        return builder;
    }

    public static final CursorAnchorInfo rl(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j2, TextRange textRange, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z2, boolean z3, boolean z4, boolean z5) {
        int iQie;
        builder.reset();
        builder.setMatrix(matrix);
        int iQie2 = TextRange.qie(j2);
        builder.setSelectionRange(iQie2, TextRange.gh(j2));
        if (z2) {
            t(builder, iQie2, textLayoutResult, rect);
        }
        if (z3) {
            int iGh = -1;
            if (textRange != null) {
                iQie = TextRange.qie(textRange.getPackedValue());
            } else {
                iQie = -1;
            }
            if (textRange != null) {
                iGh = TextRange.gh(textRange.getPackedValue());
            }
            if (iQie >= 0 && iQie < iGh) {
                builder.setComposingText(iQie, charSequence.subSequence(iQie, iGh));
                n(builder, iQie, iGh, textLayoutResult, rect);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 && z4) {
            CursorAnchorInfoApi33Helper.n(builder, rect2);
        }
        if (i2 >= 34 && z5) {
            CursorAnchorInfoApi34Helper.n(builder, textLayoutResult, rect);
        }
        return builder.build();
    }
}
