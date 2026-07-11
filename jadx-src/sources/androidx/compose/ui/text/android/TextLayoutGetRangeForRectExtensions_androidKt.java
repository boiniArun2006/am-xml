package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.android.LayoutHelper;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import androidx.compose.ui.text.android.selection.SegmentFinder_androidKt;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\r\u001aO\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001am\u0010\u001e\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001am\u0010 \u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b \u0010\u001f\u001a'\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#\u001a'\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010#\u001a#\u0010'\u001a\u00020\n*\u00020\u00052\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "Landroid/text/Layout;", TtmlNode.TAG_LAYOUT, "Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "Landroid/graphics/RectF;", "rect", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "nr", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/text/Layout;Landroidx/compose/ui/text/android/LayoutHelper;Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "lineIndex", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "segmentFinder", "getStart", "J2", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/text/Layout;Landroidx/compose/ui/text/android/LayoutHelper;ILandroid/graphics/RectF;Landroidx/compose/ui/text/android/selection/SegmentFinder;Lkotlin/jvm/functions/Function2;Z)I", "Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "lineStart", "lineTop", "lineBottom", "", "runLeft", "runRight", "", "horizontalBounds", "O", "(Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;Landroid/graphics/RectF;IIIFF[FLandroidx/compose/ui/text/android/selection/SegmentFinder;Lkotlin/jvm/functions/Function2;)I", "t", "offset", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(II[F)F", "rl", TtmlNode.LEFT, TtmlNode.RIGHT, "Uo", "(Landroid/graphics/RectF;FF)Z", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    private static final float n(int i2, int i3, float[] fArr) {
        return fArr[(i2 - i3) * 2];
    }

    public static final int[] nr(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, RectF rectF, int i2, Function2 function2) {
        int i3;
        SegmentFinder wordSegmentFinder = i2 == 1 ? new WordSegmentFinder(textLayout.X(), textLayout.N()) : SegmentFinder_androidKt.n(textLayout.X(), textLayout.getTextPaint());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > textLayout.qie(lineForVertical) && (lineForVertical = lineForVertical + 1) >= textLayout.getLineCount()) {
            return null;
        }
        int i5 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < textLayout.WPU(0)) {
            return null;
        }
        int iJ2 = J2(textLayout, layout, layoutHelper, i5, rectF, wordSegmentFinder, function2, true);
        while (true) {
            i3 = i5;
            if (iJ2 != -1 || i3 >= lineForVertical2) {
                break;
            }
            i5 = i3 + 1;
            iJ2 = J2(textLayout, layout, layoutHelper, i5, rectF, wordSegmentFinder, function2, true);
        }
        if (iJ2 == -1) {
            return null;
        }
        int iJ22 = J2(textLayout, layout, layoutHelper, lineForVertical2, rectF, wordSegmentFinder, function2, false);
        while (iJ22 == -1 && i3 < lineForVertical2) {
            int i7 = lineForVertical2 - 1;
            iJ22 = J2(textLayout, layout, layoutHelper, i7, rectF, wordSegmentFinder, function2, false);
            lineForVertical2 = i7;
        }
        if (iJ22 == -1) {
            return null;
        }
        return new int[]{wordSegmentFinder.rl(iJ2 + 1), wordSegmentFinder.t(iJ22 - 1)};
    }

    private static final float rl(int i2, int i3, float[] fArr) {
        return fArr[((i2 - i3) * 2) + 1];
    }

    private static final int J2(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, int i2, RectF rectF, SegmentFinder segmentFinder, Function2 function2, boolean z2) {
        int lineTop = layout.getLineTop(i2);
        int lineBottom = layout.getLineBottom(i2);
        int lineStart = layout.getLineStart(i2);
        int lineEnd = layout.getLineEnd(i2);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        textLayout.rl(i2, fArr);
        LayoutHelper.BidiRun[] bidiRunArrNr = layoutHelper.nr(i2);
        IntProgression indices = z2 ? ArraysKt.getIndices(bidiRunArrNr) : RangesKt.downTo(ArraysKt.getLastIndex(bidiRunArrNr), 0);
        int first = indices.getFirst();
        int last = indices.getLast();
        int step = indices.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            int i3 = first;
            while (true) {
                LayoutHelper.BidiRun bidiRun = bidiRunArrNr[i3];
                float fN = bidiRun.getIsRtl() ? n(bidiRun.getEnd() - 1, lineStart, fArr) : n(bidiRun.getStart(), lineStart, fArr);
                float fRl = bidiRun.getIsRtl() ? rl(bidiRun.getStart(), lineStart, fArr) : rl(bidiRun.getEnd() - 1, lineStart, fArr);
                int iO = z2 ? O(bidiRun, rectF, lineStart, lineTop, lineBottom, fN, fRl, fArr, segmentFinder, function2) : t(bidiRun, rectF, lineStart, lineTop, lineBottom, fN, fRl, fArr, segmentFinder, function2);
                if (iO < 0) {
                    if (i3 == last) {
                        break;
                    }
                    i3 += step;
                } else {
                    return iO;
                }
            }
        }
        return -1;
    }

    private static final boolean Uo(RectF rectF, float f3, float f4) {
        return f4 >= rectF.left && f3 <= rectF.right;
    }

    private static final int O(LayoutHelper.BidiRun bidiRun, RectF rectF, int i2, int i3, int i5, float f3, float f4, float[] fArr, SegmentFinder segmentFinder, Function2 function2) {
        int start;
        int iRl;
        float fN;
        float fRl;
        if (!Uo(rectF, f3, f4)) {
            return -1;
        }
        if ((!bidiRun.getIsRtl() && rectF.left <= f3) || (bidiRun.getIsRtl() && rectF.right >= f4)) {
            start = bidiRun.getStart();
        } else {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i7 = (end + start) / 2;
                float fN2 = n(i7, i2, fArr);
                if ((!bidiRun.getIsRtl() && fN2 > rectF.left) || (bidiRun.getIsRtl() && fN2 < rectF.right)) {
                    end = i7;
                } else {
                    start = i7;
                }
            }
            if (bidiRun.getIsRtl()) {
                start = end;
            }
        }
        int iT = segmentFinder.t(start);
        if (iT == -1 || (iRl = segmentFinder.rl(iT)) >= bidiRun.getEnd()) {
            return -1;
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(iRl, bidiRun.getStart());
        int iCoerceAtMost = RangesKt.coerceAtMost(iT, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i3, 0.0f, i5);
        while (true) {
            if (bidiRun.getIsRtl()) {
                fN = n(iCoerceAtMost - 1, i2, fArr);
            } else {
                fN = n(iCoerceAtLeast, i2, fArr);
            }
            rectF2.left = fN;
            if (bidiRun.getIsRtl()) {
                fRl = rl(iCoerceAtLeast, i2, fArr);
            } else {
                fRl = rl(iCoerceAtMost - 1, i2, fArr);
            }
            rectF2.right = fRl;
            if (((Boolean) function2.invoke(rectF2, rectF)).booleanValue()) {
                return iCoerceAtLeast;
            }
            iCoerceAtLeast = segmentFinder.n(iCoerceAtLeast);
            if (iCoerceAtLeast == -1 || iCoerceAtLeast >= bidiRun.getEnd()) {
                break;
            }
            iCoerceAtMost = RangesKt.coerceAtMost(segmentFinder.t(iCoerceAtLeast), bidiRun.getEnd());
        }
        return -1;
    }

    private static final int t(LayoutHelper.BidiRun bidiRun, RectF rectF, int i2, int i3, int i5, float f3, float f4, float[] fArr, SegmentFinder segmentFinder, Function2 function2) {
        int start;
        int iT;
        float fN;
        float fRl;
        if (!Uo(rectF, f3, f4)) {
            return -1;
        }
        if ((!bidiRun.getIsRtl() && rectF.right >= f4) || (bidiRun.getIsRtl() && rectF.left <= f3)) {
            start = bidiRun.getEnd() - 1;
        } else {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i7 = (end + start) / 2;
                float fN2 = n(i7, i2, fArr);
                if ((!bidiRun.getIsRtl() && fN2 > rectF.right) || (bidiRun.getIsRtl() && fN2 < rectF.left)) {
                    end = i7;
                } else {
                    start = i7;
                }
            }
            if (bidiRun.getIsRtl()) {
                start = end;
            }
        }
        int iRl = segmentFinder.rl(start + 1);
        if (iRl == -1 || (iT = segmentFinder.t(iRl)) <= bidiRun.getStart()) {
            return -1;
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(iRl, bidiRun.getStart());
        int iCoerceAtMost = RangesKt.coerceAtMost(iT, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i3, 0.0f, i5);
        while (true) {
            if (bidiRun.getIsRtl()) {
                fN = n(iCoerceAtMost - 1, i2, fArr);
            } else {
                fN = n(iCoerceAtLeast, i2, fArr);
            }
            rectF2.left = fN;
            if (bidiRun.getIsRtl()) {
                fRl = rl(iCoerceAtLeast, i2, fArr);
            } else {
                fRl = rl(iCoerceAtMost - 1, i2, fArr);
            }
            rectF2.right = fRl;
            if (((Boolean) function2.invoke(rectF2, rectF)).booleanValue()) {
                return iCoerceAtMost;
            }
            iCoerceAtMost = segmentFinder.nr(iCoerceAtMost);
            if (iCoerceAtMost == -1 || iCoerceAtMost <= bidiRun.getStart()) {
                break;
            }
            iCoerceAtLeast = RangesKt.coerceAtLeast(segmentFinder.rl(iCoerceAtMost), bidiRun.getStart());
        }
        return -1;
    }
}
