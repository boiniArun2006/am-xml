package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a#\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\t*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0011\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a#\u0010 \u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!¨\u0006$²\u0006\f\u0010\"\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "info", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "previousSelectionAnchor", "qie", "(Landroidx/compose/foundation/text/selection/SelectionLayout;Landroidx/compose/foundation/text/selection/SelectableInfo;Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "", "currentRawOffset", "", "isStart", "mUb", "(Landroidx/compose/foundation/text/selection/SelectableInfo;IZ)Z", "currentLine", "currentOffset", "otherOffset", "crossed", "gh", "(Landroidx/compose/foundation/text/selection/SelectableInfo;IIIZZ)Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", TtmlNode.TAG_LAYOUT, "Landroidx/compose/foundation/text/selection/BoundaryFunction;", "boundaryFunction", "Landroidx/compose/foundation/text/selection/Selection;", "O", "(Landroidx/compose/foundation/text/selection/SelectionLayout;Landroidx/compose/foundation/text/selection/BoundaryFunction;)Landroidx/compose/foundation/text/selection/Selection;", "slot", "J2", "(Landroidx/compose/foundation/text/selection/SelectableInfo;ZZILandroidx/compose/foundation/text/selection/BoundaryFunction;)Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "KN", "(Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectionLayout;)Landroidx/compose/foundation/text/selection/Selection;", "xMQ", "newOffset", "Uo", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Landroidx/compose/foundation/text/selection/SelectableInfo;I)Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "currentRawLine", "anchorSnappedToWordBoundary", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectionAdjustment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionAdjustment.kt\nandroidx/compose/foundation/text/selection/SelectionAdjustmentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
public final class SelectionAdjustmentKt {
    private static final Selection.AnchorInfo J2(SelectableInfo selectableInfo, boolean z2, boolean z3, int i2, BoundaryFunction boundaryFunction) {
        int rawStartHandleOffset = z3 ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if (i2 != selectableInfo.getSlot()) {
            return selectableInfo.n(rawStartHandleOffset);
        }
        long jN = boundaryFunction.n(selectableInfo, rawStartHandleOffset);
        return selectableInfo.n(z2 ^ z3 ? TextRange.ty(jN) : TextRange.xMQ(jN));
    }

    public static final Selection KN(Selection selection, SelectionLayout selectionLayout) {
        if (SelectionLayoutKt.nr(selection, selectionLayout)) {
            String strT = selectionLayout.rl().t();
            if (selectionLayout.getSize() > 1 || selectionLayout.getPreviousSelection() == null || strT.length() == 0) {
                return selection;
            }
            return xMQ(selection, selectionLayout);
        }
        return selection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection O(SelectionLayout selectionLayout, BoundaryFunction boundaryFunction) {
        boolean z2;
        if (selectionLayout.O() == CrossStatus.f20733n) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new Selection(J2(selectionLayout.getInfo(), z2, true, selectionLayout.getStartSlot(), boundaryFunction), J2(selectionLayout.mUb(), z2, false, selectionLayout.getEndSlot(), boundaryFunction), z2);
    }

    private static final Selection.AnchorInfo Uo(Selection.AnchorInfo anchorInfo, SelectableInfo selectableInfo, int i2) {
        return Selection.AnchorInfo.rl(anchorInfo, selectableInfo.getTextLayoutResult().t(i2), i2, 0L, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int az(Lazy lazy) {
        return ((Number) lazy.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo gh(SelectableInfo selectableInfo, int i2, int i3, int i5, boolean z2, boolean z3) {
        int iXQ;
        int iCk;
        long jIF = selectableInfo.getTextLayoutResult().iF(i3);
        if (selectableInfo.getTextLayoutResult().Ik(TextRange.ty(jIF)) == i2) {
            iXQ = TextRange.ty(jIF);
        } else if (i2 >= selectableInfo.getTextLayoutResult().ty()) {
            iXQ = selectableInfo.getTextLayoutResult().XQ(selectableInfo.getTextLayoutResult().ty() - 1);
        } else {
            iXQ = selectableInfo.getTextLayoutResult().XQ(i2);
        }
        if (selectableInfo.getTextLayoutResult().Ik(TextRange.xMQ(jIF)) == i2) {
            iCk = TextRange.xMQ(jIF);
        } else if (i2 >= selectableInfo.getTextLayoutResult().ty()) {
            iCk = TextLayoutResult.ck(selectableInfo.getTextLayoutResult(), selectableInfo.getTextLayoutResult().ty() - 1, false, 2, null);
        } else {
            iCk = TextLayoutResult.ck(selectableInfo.getTextLayoutResult(), i2, false, 2, null);
        }
        if (iXQ == i5) {
            return selectableInfo.n(iCk);
        }
        if (iCk == i5) {
            return selectableInfo.n(iXQ);
        }
        if (!(z2 ^ z3) ? i3 >= iXQ : i3 > iCk) {
            iXQ = iCk;
        }
        return selectableInfo.n(iXQ);
    }

    private static final boolean mUb(SelectableInfo selectableInfo, int i2, boolean z2) {
        boolean z3;
        if (selectableInfo.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i2 == selectableInfo.getRawPreviousHandleOffset()) {
            return false;
        }
        if (selectableInfo.nr() == CrossStatus.f20733n) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 ^ z3) {
            if (i2 < selectableInfo.getRawPreviousHandleOffset()) {
                return true;
            }
            return false;
        }
        if (i2 > selectableInfo.getRawPreviousHandleOffset()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo qie(final SelectionLayout selectionLayout, final SelectableInfo selectableInfo, Selection.AnchorInfo anchorInfo) {
        int rawEndHandleOffset;
        int iNr;
        int rawStartHandleOffset;
        if (selectionLayout.getIsStartHandle()) {
            rawEndHandleOffset = selectableInfo.getRawStartHandleOffset();
        } else {
            rawEndHandleOffset = selectableInfo.getRawEndHandleOffset();
        }
        final int i2 = rawEndHandleOffset;
        if (selectionLayout.getIsStartHandle()) {
            iNr = selectionLayout.getStartSlot();
        } else {
            iNr = selectionLayout.getEndSlot();
        }
        if (iNr != selectableInfo.getSlot()) {
            return selectableInfo.n(i2);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return Integer.valueOf(selectableInfo.getTextLayoutResult().Ik(i2));
            }
        });
        if (selectionLayout.getIsStartHandle()) {
            rawStartHandleOffset = selectableInfo.getRawEndHandleOffset();
        } else {
            rawStartHandleOffset = selectableInfo.getRawStartHandleOffset();
        }
        final int i3 = rawStartHandleOffset;
        Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Selection.AnchorInfo>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Selection.AnchorInfo invoke() {
                return SelectionAdjustmentKt.gh(selectableInfo, SelectionAdjustmentKt.az(lazy), i2, i3, selectionLayout.getIsStartHandle(), selectionLayout.O() == CrossStatus.f20733n);
            }
        });
        if (selectableInfo.getSelectableId() != anchorInfo.getSelectableId()) {
            return ty(lazy2);
        }
        int rawPreviousHandleOffset = selectableInfo.getRawPreviousHandleOffset();
        if (i2 == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (az(lazy) != selectableInfo.getTextLayoutResult().Ik(rawPreviousHandleOffset)) {
            return ty(lazy2);
        }
        int offset = anchorInfo.getOffset();
        long jIF = selectableInfo.getTextLayoutResult().iF(offset);
        if (!mUb(selectableInfo, i2, selectionLayout.getIsStartHandle())) {
            return selectableInfo.n(i2);
        }
        if (offset != TextRange.ty(jIF) && offset != TextRange.xMQ(jIF)) {
            return selectableInfo.n(i2);
        }
        return ty(lazy2);
    }

    private static final Selection.AnchorInfo ty(Lazy lazy) {
        return (Selection.AnchorInfo) lazy.getValue();
    }

    private static final Selection xMQ(Selection selection, SelectionLayout selectionLayout) {
        boolean z2;
        int iN;
        SelectableInfo selectableInfoRl = selectionLayout.rl();
        String strT = selectableInfoRl.t();
        int rawStartHandleOffset = selectableInfoRl.getRawStartHandleOffset();
        int length = strT.length();
        if (rawStartHandleOffset == 0) {
            int iN2 = StringHelpers_androidKt.n(strT, 0);
            if (selectionLayout.getIsStartHandle()) {
                return Selection.rl(selection, Uo(selection.getStart(), selectableInfoRl, iN2), null, true, 2, null);
            }
            return Selection.rl(selection, null, Uo(selection.getEnd(), selectableInfoRl, iN2), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int iRl = StringHelpers_androidKt.rl(strT, length);
            if (selectionLayout.getIsStartHandle()) {
                return Selection.rl(selection, Uo(selection.getStart(), selectableInfoRl, iRl), null, false, 2, null);
            }
            return Selection.rl(selection, null, Uo(selection.getEnd(), selectableInfoRl, iRl), true, 1, null);
        }
        Selection selectionUo = selectionLayout.getPreviousSelection();
        if (selectionUo != null && selectionUo.getHandlesCrossed()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (selectionLayout.getIsStartHandle() ^ z2) {
            iN = StringHelpers_androidKt.rl(strT, rawStartHandleOffset);
        } else {
            iN = StringHelpers_androidKt.n(strT, rawStartHandleOffset);
        }
        if (selectionLayout.getIsStartHandle()) {
            return Selection.rl(selection, Uo(selection.getStart(), selectableInfoRl, iN), null, z2, 2, null);
        }
        return Selection.rl(selection, null, Uo(selection.getEnd(), selectableInfoRl, iN), z2, 1, null);
    }
}
