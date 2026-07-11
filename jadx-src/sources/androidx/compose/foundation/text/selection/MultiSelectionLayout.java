package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMap;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.selection.Selection;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u00182\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0+2\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b=\u0010<R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b1\u0010@R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010<R\u0014\u0010H\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010GR\u0014\u0010K\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0014\u0010N\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010JR\u0014\u0010O\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010JR\u0014\u0010Q\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010J¨\u0006R"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiSelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "Landroidx/collection/LongIntMap;", "selectableIdToInfoListIndex", "", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "infoList", "", "startSlot", "endSlot", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "<init>", "(Landroidx/collection/LongIntMap;Ljava/util/List;IIZLandroidx/compose/foundation/text/selection/Selection;)V", InneractiveMediationNameConsts.OTHER, "Ik", "(Landroidx/compose/foundation/text/selection/MultiSelectionLayout;)Z", "Landroidx/collection/MutableLongObjectMap;", "selection", "info", "minOffset", "maxOffset", "", "ty", "(Landroidx/collection/MutableLongObjectMap;Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectableInfo;II)V", "slot", "isStartSlot", "o", "(IZ)I", "isMinimumSlot", "r", "", "id", "HI", "(J)I", "Lkotlin/Function1;", "block", "J2", "(Lkotlin/jvm/functions/Function1;)V", "xMQ", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)Z", "Landroidx/collection/LongObjectMap;", "KN", "(Landroidx/compose/foundation/text/selection/Selection;)Landroidx/collection/LongObjectMap;", "", "toString", "()Ljava/lang/String;", c.f62177j, "Landroidx/collection/LongIntMap;", "getSelectableIdToInfoListIndex", "()Landroidx/collection/LongIntMap;", "rl", "Ljava/util/List;", "getInfoList", "()Ljava/util/List;", "t", "I", "qie", "()I", "nr", "O", "Z", "()Z", "Landroidx/compose/foundation/text/selection/Selection;", "Uo", "()Landroidx/compose/foundation/text/selection/Selection;", "getSize", "size", "Landroidx/compose/foundation/text/selection/CrossStatus;", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "crossStatus", "gh", "()Landroidx/compose/foundation/text/selection/SelectableInfo;", "startInfo", "mUb", "endInfo", "currentInfo", "firstInfo", "ck", "lastInfo", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionLayout.kt\nandroidx/compose/foundation/text/selection/MultiSelectionLayout\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,762:1\n50#2,5:763\n50#2,5:768\n50#2,5:774\n1#3:773\n70#4,6:779\n*S KotlinDebug\n*F\n+ 1 SelectionLayout.kt\nandroidx/compose/foundation/text/selection/MultiSelectionLayout\n*L\n148#1:763,5\n225#1:768,5\n265#1:774,5\n282#1:779,6\n*E\n"})
final class MultiSelectionLayout implements SelectionLayout {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Selection previousSelection;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean isStartHandle;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LongIntMap selectableIdToInfoListIndex;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int endSlot;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final List infoList;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int startSlot;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CrossStatus.values().length];
            try {
                iArr[CrossStatus.f20732O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CrossStatus.f20735t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CrossStatus.f20733n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int HI(long id) {
        try {
            return this.selectableIdToInfoListIndex.rl(id);
        } catch (NoSuchElementException e2) {
            throw new IllegalStateException("Invalid selectableId: " + id, e2);
        }
    }

    private final int r(int slot, boolean isMinimumSlot) {
        return (slot - (!isMinimumSlot ? 1 : 0)) / 2;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: Uo, reason: from getter */
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return this.infoList.size();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: gh */
    public SelectableInfo getInfo() {
        return (SelectableInfo) this.infoList.get(o(getStartSlot(), true));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo mUb() {
        return (SelectableInfo) this.infoList.get(o(getEndSlot(), false));
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiSelectionLayout(isStartHandle=");
        sb.append(getIsStartHandle());
        sb.append(", startPosition=");
        boolean z2 = true;
        float f3 = 2;
        sb.append((getStartSlot() + 1) / f3);
        sb.append(", endPosition=");
        sb.append((getEndSlot() + 1) / f3);
        sb.append(", crossed=");
        sb.append(O());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[\n\t");
        List list = this.infoList;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            SelectableInfo selectableInfo = (SelectableInfo) list.get(i2);
            if (z2) {
                z2 = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i2++;
            sb3.append(i2);
            sb3.append(" -> ");
            sb3.append(selectableInfo);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }

    public MultiSelectionLayout(LongIntMap longIntMap, List list, int i2, int i3, boolean z2, Selection selection) {
        this.selectableIdToInfoListIndex = longIntMap;
        this.infoList = list;
        this.startSlot = i2;
        this.endSlot = i3;
        this.isStartHandle = z2;
        this.previousSelection = selection;
        if (!(list.size() > 1)) {
            InlineClassHelperKt.t("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
        }
    }

    private final boolean Ik(MultiSelectionLayout other) {
        if (getSize() != other.getSize()) {
            return true;
        }
        int size = this.infoList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((SelectableInfo) this.infoList.get(i2)).ty((SelectableInfo) other.infoList.get(i2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int o(int slot, boolean isStartSlot) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[O().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (isStartSlot) {
                        isStartSlot = false;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            isStartSlot = true;
        }
        return r(slot, isStartSlot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ty(MutableLongObjectMap mutableLongObjectMap, Selection selection, SelectableInfo selectableInfo, int i2, int i3) {
        Selection selectionAz;
        boolean z2;
        if (selection.getHandlesCrossed()) {
            selectionAz = selectableInfo.az(i3, i2);
        } else {
            selectionAz = selectableInfo.az(i2, i3);
        }
        if (i2 <= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.t("minOffset should be less than or equal to maxOffset: " + selectionAz);
        }
        mutableLongObjectMap.ty(selectableInfo.getSelectableId(), selectionAz);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void J2(Function1 block) {
        int iHI = HI(t().getSelectableId());
        int iHI2 = HI(ck().getSelectableId());
        int i2 = iHI + 1;
        if (i2 < iHI2) {
            while (i2 < iHI2) {
                block.invoke(this.infoList.get(i2));
                i2++;
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public LongObjectMap KN(final Selection selection) {
        Selection.AnchorInfo start;
        Selection.AnchorInfo end;
        boolean z2;
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            if ((selection.getHandlesCrossed() && selection.getStart().getOffset() >= selection.getEnd().getOffset()) || (!selection.getHandlesCrossed() && selection.getStart().getOffset() <= selection.getEnd().getOffset())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                InlineClassHelperKt.t("unexpectedly miss-crossed selection: " + selection);
            }
            return LongObjectMapKt.rl(selection.getStart().getSelectableId(), selection);
        }
        final MutableLongObjectMap mutableLongObjectMapT = LongObjectMapKt.t();
        if (selection.getHandlesCrossed()) {
            start = selection.getEnd();
        } else {
            start = selection.getStart();
        }
        ty(mutableLongObjectMapT, selection, t(), start.getOffset(), t().qie());
        J2(new Function1<SelectableInfo, Unit>() { // from class: androidx.compose.foundation.text.selection.MultiSelectionLayout$createSubSelections$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SelectableInfo selectableInfo) {
                n(selectableInfo);
                return Unit.INSTANCE;
            }

            public final void n(SelectableInfo selectableInfo) {
                this.f20753n.ty(mutableLongObjectMapT, selection, selectableInfo, 0, selectableInfo.qie());
            }
        });
        if (selection.getHandlesCrossed()) {
            end = selection.getStart();
        } else {
            end = selection.getEnd();
        }
        ty(mutableLongObjectMapT, selection, ck(), 0, end.getOffset());
        return mutableLongObjectMapT;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public CrossStatus O() {
        if (getStartSlot() < getEndSlot()) {
            return CrossStatus.f20735t;
        }
        if (getStartSlot() > getEndSlot()) {
            return CrossStatus.f20733n;
        }
        return ((SelectableInfo) this.infoList.get(getStartSlot() / 2)).nr();
    }

    public SelectableInfo ck() {
        if (O() == CrossStatus.f20733n) {
            return getInfo();
        }
        return mUb();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo rl() {
        if (getIsStartHandle()) {
            return getInfo();
        }
        return mUb();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo t() {
        if (O() == CrossStatus.f20733n) {
            return mUb();
        }
        return getInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean xMQ(SelectionLayout other) {
        if (getPreviousSelection() != null && other != null && (other instanceof MultiSelectionLayout) && getIsStartHandle() == other.getIsStartHandle() && getStartSlot() == other.getStartSlot() && getEndSlot() == other.getEndSlot() && !Ik((MultiSelectionLayout) other)) {
            return false;
        }
        return true;
    }
}
