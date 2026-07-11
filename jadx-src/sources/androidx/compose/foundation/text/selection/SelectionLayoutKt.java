package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aJ\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001b\u001a\u00020\b*\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/TextRange;", "previousSelectionRange", "", "isStartOfSelection", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "t", "(Landroidx/compose/ui/text/TextLayoutResult;IIIJZZ)Landroidx/compose/foundation/text/selection/SelectionLayout;", "Landroidx/compose/foundation/text/selection/Direction;", "x", "y", "J2", "(Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;)Landroidx/compose/foundation/text/selection/Direction;", "offset", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "rl", "(Landroidx/compose/ui/text/TextLayoutResult;I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "O", "(Landroidx/compose/ui/text/TextLayoutResult;I)Z", "Landroidx/compose/foundation/text/selection/Selection;", TtmlNode.TAG_LAYOUT, "nr", "(Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectionLayout;)Z", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectionLayoutKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.f20737n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.f20739t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.f20736O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean nr(Selection selection, SelectionLayout selectionLayout) {
        if (selection == null || selectionLayout == null) {
            return true;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return selection.getStart().getOffset() == selection.getEnd().getOffset();
        }
        if ((selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset() != 0) {
            return false;
        }
        if (selectionLayout.t().qie() != (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset()) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        selectionLayout.J2(new Function1<SelectableInfo, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionLayoutKt$isCollapsed$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SelectableInfo selectableInfo) {
                n(selectableInfo);
                return Unit.INSTANCE;
            }

            public final void n(SelectableInfo selectableInfo) {
                if (selectableInfo.t().length() > 0) {
                    booleanRef.element = false;
                }
            }
        });
        return booleanRef.element;
    }

    public static final SelectionLayout t(TextLayoutResult textLayoutResult, int i2, int i3, int i5, long j2, boolean z2, boolean z3) {
        return new SingleSelectionLayout(z3, 1, 1, z2 ? null : new Selection(new Selection.AnchorInfo(rl(textLayoutResult, TextRange.ty(j2)), TextRange.ty(j2), 1L), new Selection.AnchorInfo(rl(textLayoutResult, TextRange.xMQ(j2)), TextRange.xMQ(j2), 1L), TextRange.az(j2)), new SelectableInfo(1L, 1, i2, i3, i5, textLayoutResult));
    }

    public static final Direction J2(Direction direction, Direction direction2) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[direction2.ordinal()];
        if (i2 == 1) {
            return Direction.f20737n;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return Direction.f20736O;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i3 = iArr[direction.ordinal()];
        if (i3 == 1) {
            return Direction.f20737n;
        }
        if (i3 == 2) {
            return Direction.f20739t;
        }
        if (i3 == 3) {
            return Direction.f20736O;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean O(TextLayoutResult textLayoutResult, int i2) {
        if (textLayoutResult.getLayoutInput().getText().length() != 0) {
            int iIk = textLayoutResult.Ik(i2);
            if (i2 == 0 || iIk != textLayoutResult.Ik(i2 - 1)) {
                if (i2 != textLayoutResult.getLayoutInput().getText().length() && iIk == textLayoutResult.Ik(i2 + 1)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvedTextDirection rl(TextLayoutResult textLayoutResult, int i2) {
        if (O(textLayoutResult, i2)) {
            return textLayoutResult.ViF(i2);
        }
        return textLayoutResult.t(i2);
    }
}
