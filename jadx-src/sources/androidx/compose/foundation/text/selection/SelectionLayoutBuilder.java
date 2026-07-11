package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJU\u0010&\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b3\u00104R'\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020%0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010<R\u0016\u0010?\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010>R\u0016\u0010A\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010C\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "", "Landroidx/compose/ui/geometry/Offset;", "currentPosition", "previousHandlePosition", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerCoordinates", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "<init>", "(JJLandroidx/compose/ui/layout/LayoutCoordinates;ZLandroidx/compose/foundation/text/selection/Selection;Ljava/util/Comparator;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "slot", "Landroidx/compose/foundation/text/selection/Direction;", "xPositionDirection", "yPositionDirection", "xMQ", "(ILandroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;)I", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "rl", "()Landroidx/compose/foundation/text/selection/SelectionLayout;", "selectableId", "rawStartHandleOffset", "startXHandleDirection", "startYHandleDirection", "rawEndHandleOffset", "endXHandleDirection", "endYHandleDirection", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/foundation/text/selection/SelectableInfo;", c.f62177j, "(JILandroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;ILandroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;ILandroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/selection/SelectableInfo;", "J", "nr", "()J", "O", "t", "Landroidx/compose/ui/layout/LayoutCoordinates;", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Z", "KN", "()Z", "Landroidx/compose/foundation/text/selection/Selection;", "J2", "()Landroidx/compose/foundation/text/selection/Selection;", "Ljava/util/Comparator;", "Uo", "()Ljava/util/Comparator;", "Landroidx/collection/MutableLongIntMap;", "Landroidx/collection/MutableLongIntMap;", "selectableIdToInfoListIndex", "", "Ljava/util/List;", "infoList", "I", "startSlot", "mUb", "endSlot", "gh", "currentSlot", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelectionLayoutBuilder {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Comparator selectableIdOrderingComparator;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final List infoList;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Selection previousSelection;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableLongIntMap selectableIdToInfoListIndex;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private int currentSlot;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private int endSlot;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long currentPosition;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final boolean isStartHandle;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long previousHandlePosition;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final LayoutCoordinates containerCoordinates;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private int startSlot;

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

    public /* synthetic */ SelectionLayoutBuilder(long j2, long j3, LayoutCoordinates layoutCoordinates, boolean z2, Selection selection, Comparator comparator, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, layoutCoordinates, z2, selection, comparator);
    }

    private final int xMQ(int slot, Direction xPositionDirection, Direction yPositionDirection) {
        if (slot == -1) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[SelectionLayoutKt.J2(xPositionDirection, yPositionDirection).ordinal()];
            if (i2 == 1) {
                return this.currentSlot - 1;
            }
            if (i2 == 2) {
                return this.currentSlot;
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return slot;
    }

    private SelectionLayoutBuilder(long j2, long j3, LayoutCoordinates layoutCoordinates, boolean z2, Selection selection, Comparator comparator) {
        this.currentPosition = j2;
        this.previousHandlePosition = j3;
        this.containerCoordinates = layoutCoordinates;
        this.isStartHandle = z2;
        this.previousSelection = selection;
        this.selectableIdOrderingComparator = comparator;
        this.selectableIdToInfoListIndex = LongIntMapKt.n();
        this.infoList = new ArrayList();
        this.startSlot = -1;
        this.endSlot = -1;
        this.currentSlot = -1;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final Selection getPreviousSelection() {
        return this.previousSelection;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final long getPreviousHandlePosition() {
        return this.previousHandlePosition;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final Comparator getSelectableIdOrderingComparator() {
        return this.selectableIdOrderingComparator;
    }

    public final SelectableInfo n(long selectableId, int rawStartHandleOffset, Direction startXHandleDirection, Direction startYHandleDirection, int rawEndHandleOffset, Direction endXHandleDirection, Direction endYHandleDirection, int rawPreviousHandleOffset, TextLayoutResult textLayoutResult) {
        this.currentSlot += 2;
        SelectableInfo selectableInfo = new SelectableInfo(selectableId, this.currentSlot, rawStartHandleOffset, rawEndHandleOffset, rawPreviousHandleOffset, textLayoutResult);
        this.startSlot = xMQ(this.startSlot, startXHandleDirection, startYHandleDirection);
        this.endSlot = xMQ(this.endSlot, endXHandleDirection, endYHandleDirection);
        this.selectableIdToInfoListIndex.ty(selectableId, this.infoList.size());
        this.infoList.add(selectableInfo);
        return selectableInfo;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final long getCurrentPosition() {
        return this.currentPosition;
    }

    public final SelectionLayout rl() {
        int i2 = this.currentSlot + 1;
        int size = this.infoList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            SelectableInfo selectableInfo = (SelectableInfo) CollectionsKt.single(this.infoList);
            int i3 = this.startSlot;
            int i5 = i3 == -1 ? i2 : i3;
            int i7 = this.endSlot;
            return new SingleSelectionLayout(this.isStartHandle, i5, i7 == -1 ? i2 : i7, this.previousSelection, selectableInfo);
        }
        MutableLongIntMap mutableLongIntMap = this.selectableIdToInfoListIndex;
        List list = this.infoList;
        int i8 = this.startSlot;
        int i9 = i8 == -1 ? i2 : i8;
        int i10 = this.endSlot;
        return new MultiSelectionLayout(mutableLongIntMap, list, i9, i10 == -1 ? i2 : i10, this.isStartHandle, this.previousSelection);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final LayoutCoordinates getContainerCoordinates() {
        return this.containerCoordinates;
    }
}
