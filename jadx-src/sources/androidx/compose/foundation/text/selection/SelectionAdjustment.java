package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "Landroidx/compose/foundation/text/selection/SelectionLayout;", TtmlNode.TAG_LAYOUT, "Landroidx/compose/foundation/text/selection/Selection;", c.f62177j, "(Landroidx/compose/foundation/text/selection/SelectionLayout;)Landroidx/compose/foundation/text/selection/Selection;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SelectionAdjustment {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f20767n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "rl", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "az", "()Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "None", "t", "gh", "Character", "nr", "HI", "Word", "O", "ty", "Paragraph", "J2", "qie", "CharacterWithWordAccelerate", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f20767n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final SelectionAdjustment None = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.j
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection n(SelectionLayout selectionLayout) {
                return SelectionAdjustment.Companion.KN(selectionLayout);
            }
        };

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final SelectionAdjustment Character = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.n
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection n(SelectionLayout selectionLayout) {
                return SelectionAdjustment.Companion.J2(selectionLayout);
            }
        };

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private static final SelectionAdjustment Word = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.w6
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection n(SelectionLayout selectionLayout) {
                return SelectionAdjustment.Companion.mUb(selectionLayout);
            }
        };

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private static final SelectionAdjustment Paragraph = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.Ml
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection n(SelectionLayout selectionLayout) {
                return SelectionAdjustment.Companion.xMQ(selectionLayout);
            }
        };

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private static final SelectionAdjustment CharacterWithWordAccelerate = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.I28
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection n(SelectionLayout selectionLayout) {
                return SelectionAdjustment.Companion.Uo(selectionLayout);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection J2(SelectionLayout selectionLayout) {
            return SelectionAdjustmentKt.KN(None.n(selectionLayout), selectionLayout);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection KN(SelectionLayout selectionLayout) {
            return new Selection(selectionLayout.gh().n(selectionLayout.gh().getRawStartHandleOffset()), selectionLayout.mUb().n(selectionLayout.mUb().getRawEndHandleOffset()), selectionLayout.O() == CrossStatus.f20733n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection mUb(SelectionLayout selectionLayout) {
            return SelectionAdjustmentKt.O(selectionLayout, new BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1$1
                @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                public final long n(SelectableInfo selectableInfo, int i2) {
                    return selectableInfo.getTextLayoutResult().iF(i2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection xMQ(SelectionLayout selectionLayout) {
            return SelectionAdjustmentKt.O(selectionLayout, new BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1$1
                @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                public final long n(SelectableInfo selectableInfo, int i2) {
                    return StringHelpersKt.t(selectableInfo.t(), i2);
                }
            });
        }

        public final SelectionAdjustment HI() {
            return Word;
        }

        public final SelectionAdjustment az() {
            return None;
        }

        public final SelectionAdjustment gh() {
            return Character;
        }

        public final SelectionAdjustment qie() {
            return CharacterWithWordAccelerate;
        }

        public final SelectionAdjustment ty() {
            return Paragraph;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection Uo(SelectionLayout selectionLayout) {
            Selection.AnchorInfo end;
            Selection.AnchorInfo anchorInfoQie;
            Selection.AnchorInfo start;
            Selection.AnchorInfo end2;
            boolean z2;
            Selection selectionUo = selectionLayout.Uo();
            if (selectionUo == null) {
                return Word.n(selectionLayout);
            }
            if (selectionLayout.n()) {
                end = selectionUo.getStart();
                anchorInfoQie = SelectionAdjustmentKt.qie(selectionLayout, selectionLayout.gh(), end);
                end2 = selectionUo.getEnd();
                start = anchorInfoQie;
            } else {
                end = selectionUo.getEnd();
                anchorInfoQie = SelectionAdjustmentKt.qie(selectionLayout, selectionLayout.mUb(), end);
                start = selectionUo.getStart();
                end2 = anchorInfoQie;
            }
            if (Intrinsics.areEqual(anchorInfoQie, end)) {
                return selectionUo;
            }
            if (selectionLayout.O() != CrossStatus.f20733n && (selectionLayout.O() != CrossStatus.f20732O || start.getOffset() <= end2.getOffset())) {
                z2 = false;
            } else {
                z2 = true;
            }
            return SelectionAdjustmentKt.KN(new Selection(start, end2, z2), selectionLayout);
        }
    }

    Selection n(SelectionLayout layout);
}
