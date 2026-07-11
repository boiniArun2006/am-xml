package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a6\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u0012\u001a\u00020\u0010*\u00020\u000b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0006`\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\"\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u001a#\u0010\u001c\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"\u001a\"\u0010#\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "previousHandlePosition", "", "selectableId", "", c.f62177j, "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;Landroidx/compose/ui/text/TextLayoutResult;JJJ)V", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "currentSelectableId", "", "currentTextLength", "O", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Ljava/util/Comparator;JI)I", "position", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/foundation/text/selection/Direction;", "J2", "(JLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/foundation/text/selection/Direction;", "Uo", "anchorSelectableId", "t", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;JJ)Landroidx/compose/foundation/text/selection/Direction;", "currentDirection", "otherDirection", "", "KN", "(Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;)Z", "nr", "(JLandroidx/compose/ui/text/TextLayoutResult;)I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n54#2:367\n59#2:369\n85#3:368\n90#3:370\n60#3:373\n60#3:376\n70#3:379\n70#3:382\n70#3:385\n70#3:388\n278#4:371\n65#5:372\n65#5:375\n69#5:378\n69#5:381\n69#5:384\n69#5:387\n22#6:374\n22#6:377\n22#6:380\n22#6:383\n22#6:386\n22#6:389\n1#7:390\n*S KotlinDebug\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n*L\n230#1:367\n231#1:369\n230#1:368\n231#1:370\n325#1:373\n326#1:376\n332#1:379\n333#1:382\n361#1:385\n362#1:388\n290#1:371\n325#1:372\n326#1:375\n332#1:378\n333#1:381\n361#1:384\n362#1:387\n325#1:374\n326#1:377\n332#1:380\n333#1:383\n361#1:386\n362#1:389\n*E\n"})
public final class MultiWidgetSelectionDelegateKt {
    private static final Direction J2(long j2, Rect rect) {
        int i2 = (int) (j2 >> 32);
        return Float.intBitsToFloat(i2) < rect.getLeft() ? Direction.f20737n : Float.intBitsToFloat(i2) > rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() ? Direction.f20736O : Direction.f20739t;
    }

    private static final boolean KN(Direction direction, Direction direction2) {
        return direction == Direction.f20739t || direction != direction2;
    }

    public static final void n(SelectionLayoutBuilder selectionLayoutBuilder, TextLayoutResult textLayoutResult, long j2, long j3, long j4) {
        Direction direction;
        Direction direction2;
        long j5;
        Direction directionRl;
        Direction direction3;
        Direction directionRl2;
        Direction direction4;
        Direction direction5;
        int iNr;
        int iO;
        Selection.AnchorInfo start;
        Selection.AnchorInfo end;
        Rect rect = new Rect(0.0f, 0.0f, (int) (textLayoutResult.getSize() >> 32), (int) (textLayoutResult.getSize() & 4294967295L));
        Direction directionJ2 = J2(j2, rect);
        Direction directionUo = Uo(j2, rect);
        if (selectionLayoutBuilder.getIsStartHandle()) {
            Selection previousSelection = selectionLayoutBuilder.getPreviousSelection();
            direction = directionUo;
            direction2 = directionJ2;
            j5 = j4;
            direction4 = direction2;
            directionRl2 = rl(direction2, direction, selectionLayoutBuilder, j4, previousSelection != null ? previousSelection.getEnd() : null);
            direction3 = directionRl2;
            direction5 = direction3;
            directionRl = direction;
        } else {
            direction = directionUo;
            direction2 = directionJ2;
            Selection previousSelection2 = selectionLayoutBuilder.getPreviousSelection();
            j5 = j4;
            directionRl = rl(direction2, direction, selectionLayoutBuilder, j5, previousSelection2 != null ? previousSelection2.getStart() : null);
            direction3 = direction2;
            directionRl2 = direction;
            direction4 = directionRl;
            direction5 = direction4;
        }
        if (KN(SelectionLayoutKt.J2(direction2, direction), direction5)) {
            int length = textLayoutResult.getLayoutInput().getText().length();
            if (selectionLayoutBuilder.getIsStartHandle()) {
                iO = nr(j2, textLayoutResult);
                Selection previousSelection3 = selectionLayoutBuilder.getPreviousSelection();
                iNr = (previousSelection3 == null || (end = previousSelection3.getEnd()) == null) ? iO : O(end, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j5, length);
            } else {
                iNr = nr(j2, textLayoutResult);
                Selection previousSelection4 = selectionLayoutBuilder.getPreviousSelection();
                iO = (previousSelection4 == null || (start = previousSelection4.getStart()) == null) ? iNr : O(start, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j5, length);
            }
            selectionLayoutBuilder.n(j5, iO, direction4, directionRl, iNr, direction3, directionRl2, (9223372034707292159L & j3) == 9205357640488583168L ? -1 : nr(j3, textLayoutResult), textLayoutResult);
        }
    }

    private static final Direction rl(Direction direction, Direction direction2, SelectionLayoutBuilder selectionLayoutBuilder, long j2, Selection.AnchorInfo anchorInfo) {
        Direction directionT;
        return (anchorInfo == null || (directionT = t(selectionLayoutBuilder, anchorInfo.getSelectableId(), j2)) == null) ? SelectionLayoutKt.J2(direction, direction2) : directionT;
    }

    private static final int O(Selection.AnchorInfo anchorInfo, Comparator comparator, long j2, int i2) {
        int iCompare = comparator.compare(Long.valueOf(anchorInfo.getSelectableId()), Long.valueOf(j2));
        if (iCompare < 0) {
            return 0;
        }
        if (iCompare > 0) {
            return i2;
        }
        return anchorInfo.getOffset();
    }

    private static final Direction t(SelectionLayoutBuilder selectionLayoutBuilder, long j2, long j3) {
        int iCompare = selectionLayoutBuilder.getSelectableIdOrderingComparator().compare(Long.valueOf(j2), Long.valueOf(j3));
        if (iCompare < 0) {
            return Direction.f20737n;
        }
        if (iCompare > 0) {
            return Direction.f20736O;
        }
        return Direction.f20739t;
    }

    private static final Direction Uo(long j2, Rect rect) {
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) < rect.getTop()) {
            return Direction.f20737n;
        }
        if (Float.intBitsToFloat(i2) > rect.xMQ()) {
            return Direction.f20736O;
        }
        return Direction.f20739t;
    }

    private static final int nr(long j2, TextLayoutResult textLayoutResult) {
        int i2 = (int) (4294967295L & j2);
        if (Float.intBitsToFloat(i2) <= 0.0f) {
            return 0;
        }
        if (Float.intBitsToFloat(i2) >= textLayoutResult.getMultiParagraph().getHeight()) {
            return textLayoutResult.getLayoutInput().getText().length();
        }
        return textLayoutResult.aYN(j2);
    }
}
