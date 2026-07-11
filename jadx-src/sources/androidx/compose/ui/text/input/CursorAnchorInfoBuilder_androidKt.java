package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\u001ak\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001f\u001a\u00020\f*\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "rl", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroid/graphics/Matrix;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "selectionStart", "nr", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "endOffset", c.f62177j, "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "x", "y", "t", "(Landroidx/compose/ui/geometry/Rect;FF)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCursorAnchorInfoBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/ui/text/input/CursorAnchorInfoBuilder_androidKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,237:1\n54#2:238\n85#3:239\n*S KotlinDebug\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/ui/text/input/CursorAnchorInfoBuilder_androidKt\n*L\n119#1:238\n119#1:239\n*E\n"})
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final CursorAnchorInfo.Builder n(CursorAnchorInfo.Builder builder, int i2, int i3, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        ?? r52;
        int iRl = offsetMapping.rl(i2);
        int iRl2 = offsetMapping.rl(i3);
        float[] fArr = new float[(iRl2 - iRl) * 4];
        textLayoutResult.getMultiParagraph().n(TextRangeKt.rl(iRl, iRl2), fArr, 0);
        for (int i5 = i2; i5 < i3; i5++) {
            int iRl3 = offsetMapping.rl(i5);
            int i7 = (iRl3 - iRl) * 4;
            Rect rect2 = new Rect(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3]);
            boolean zNY = rect.nY(rect2);
            if (t(rect, rect2.getLeft(), rect2.getTop())) {
                r52 = zNY;
                if (!t(rect, rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), rect2.xMQ())) {
                    r52 = (zNY ? 1 : 0) | 2;
                }
            }
            if (textLayoutResult.t(iRl3) == ResolvedTextDirection.f33909t) {
                r52 = (r52 == true ? 1 : 0) | 4;
            }
            builder.addCharacterBounds(i5, rect2.getLeft(), rect2.getTop(), rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), rect2.xMQ(), r52 == true ? 1 : 0);
        }
        return builder;
    }

    private static final CursorAnchorInfo.Builder nr(CursorAnchorInfo.Builder builder, int i2, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        if (i2 < 0) {
            return builder;
        }
        int iRl = offsetMapping.rl(i2);
        Rect rectO = textLayoutResult.O(iRl);
        float fCoerceIn = RangesKt.coerceIn(rectO.getLeft(), 0.0f, (int) (textLayoutResult.getSize() >> 32));
        boolean zT2 = t(rect, fCoerceIn, rectO.getTop());
        boolean zT3 = t(rect, fCoerceIn, rectO.xMQ());
        boolean z2 = textLayoutResult.t(iRl) == ResolvedTextDirection.f33909t;
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

    public static final CursorAnchorInfo rl(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z2, boolean z3, boolean z4, boolean z5) {
        int iQie;
        builder.reset();
        builder.setMatrix(matrix);
        int iQie2 = TextRange.qie(textFieldValue.getSelection());
        builder.setSelectionRange(iQie2, TextRange.gh(textFieldValue.getSelection()));
        if (z2) {
            nr(builder, iQie2, offsetMapping, textLayoutResult, rect);
        }
        if (z3) {
            TextRange composition = textFieldValue.getComposition();
            int iGh = -1;
            if (composition != null) {
                iQie = TextRange.qie(composition.getPackedValue());
            } else {
                iQie = -1;
            }
            TextRange composition2 = textFieldValue.getComposition();
            if (composition2 != null) {
                iGh = TextRange.gh(composition2.getPackedValue());
            }
            int i2 = iGh;
            if (iQie >= 0 && iQie < i2) {
                builder.setComposingText(iQie, textFieldValue.xMQ().subSequence(iQie, i2));
                n(builder, iQie, i2, offsetMapping, textLayoutResult, rect);
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33 && z4) {
            CursorAnchorInfoApi33Helper.n(builder, rect2);
        }
        if (i3 >= 34 && z5) {
            CursorAnchorInfoApi34Helper.n(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    private static final boolean t(Rect rect, float f3, float f4) {
        float left = rect.getLeft();
        if (f3 <= rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() && left <= f3) {
            float top = rect.getTop();
            if (f4 <= rect.xMQ() && top <= f4) {
                return true;
            }
            return false;
        }
        return false;
    }
}
