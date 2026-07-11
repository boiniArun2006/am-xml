package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u00016B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\"R\u0014\u0010.\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010-R\u0014\u00101\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u0014\u00104\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u00100R\u0014\u00105\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u00100¨\u00067"}, d2 = {"Landroidx/compose/foundation/text/selection/SingleSelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "", "isStartHandle", "", "startSlot", "endSlot", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "info", "<init>", "(ZIILandroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectableInfo;)V", "Lkotlin/Function1;", "", "block", "J2", "(Lkotlin/jvm/functions/Function1;)V", InneractiveMediationNameConsts.OTHER, "xMQ", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)Z", "selection", "Landroidx/collection/LongObjectMap;", "KN", "(Landroidx/compose/foundation/text/selection/Selection;)Landroidx/collection/LongObjectMap;", "", "toString", "()Ljava/lang/String;", c.f62177j, "Z", "()Z", "rl", "I", "qie", "()I", "t", "nr", "Landroidx/compose/foundation/text/selection/Selection;", "Uo", "()Landroidx/compose/foundation/text/selection/Selection;", "O", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "getSize", "size", "Landroidx/compose/foundation/text/selection/CrossStatus;", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "crossStatus", "gh", "()Landroidx/compose/foundation/text/selection/SelectableInfo;", "startInfo", "mUb", "endInfo", "currentInfo", "firstInfo", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SingleSelectionLayout implements SelectionLayout {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final SelectableInfo info;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isStartHandle;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Selection previousSelection;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int startSlot;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int endSlot;

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void J2(Function1 block) {
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return 1;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: Uo, reason: from getter */
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: gh, reason: from getter */
    public SelectableInfo getInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo mUb() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: nr, reason: from getter */
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: qie, reason: from getter */
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo rl() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo t() {
        return this.info;
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + getIsStartHandle() + ", crossed=" + O() + ", info=\n\t" + this.info + ')';
    }

    public SingleSelectionLayout(boolean z2, int i2, int i3, Selection selection, SelectableInfo selectableInfo) {
        this.isStartHandle = z2;
        this.startSlot = i2;
        this.endSlot = i3;
        this.previousSelection = selection;
        this.info = selectableInfo;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public LongObjectMap KN(Selection selection) {
        Selection selectionRl;
        if ((!selection.getHandlesCrossed() && selection.getStart().getOffset() > selection.getEnd().getOffset()) || (selection.getHandlesCrossed() && selection.getStart().getOffset() <= selection.getEnd().getOffset())) {
            selectionRl = Selection.rl(selection, null, null, !selection.getHandlesCrossed(), 3, null);
        } else {
            selectionRl = selection;
        }
        return LongObjectMapKt.rl(this.info.getSelectableId(), selectionRl);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public CrossStatus O() {
        if (getStartSlot() < getEndSlot()) {
            return CrossStatus.f20735t;
        }
        if (getStartSlot() > getEndSlot()) {
            return CrossStatus.f20733n;
        }
        return this.info.nr();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean xMQ(SelectionLayout other) {
        if (getPreviousSelection() != null && other != null && (other instanceof SingleSelectionLayout) && getStartSlot() == other.getStartSlot() && getEndSlot() == other.getEndSlot() && getIsStartHandle() == other.getIsStartHandle() && !this.info.ty(((SingleSelectionLayout) other).info)) {
            return false;
        }
        return true;
    }
}
