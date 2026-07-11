package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001:\u0002)*B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017JZ\u0010 \u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;", "", "", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflow", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "constraints", "maxLines", "mainAxisSpacing", "crossAxisSpacing", "<init>", "(ILandroidx/compose/foundation/layout/FlowLayoutOverflowState;JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "wrapInfo", "", "hasNext", "lastContentLineIndex", "totalCrossAxisSize", "leftOverMainAxis", "nextIndexInLine", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", c.f62177j, "(Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;ZIIII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "nextItemHasNext", "Landroidx/collection/IntIntPair;", "leftOver", "nextSize", "lineIndex", "currentLineCrossAxisSize", "isWrappingRound", "isEllipsisWrap", "rl", "(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "I", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "t", "J", "nr", "O", "J2", "WrapEllipsisInfo", "WrapInfo", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlowLayoutBuildingBlocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,183:1\n213#2:184\n213#2:185\n*S KotlinDebug\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n*L\n114#1:184\n161#1:185\n*E\n"})
public final class FlowLayoutBuildingBlocks {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int crossAxisSpacing;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSpacing;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int maxItemsInMainAxis;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final FlowLayoutOverflowState overflow;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "", "Landroidx/compose/ui/layout/Measurable;", "ellipsis", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/collection/IntIntPair;", "ellipsisSize", "", "placeEllipsisOnLastContentLine", "<init>", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Placeable;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", c.f62177j, "Landroidx/compose/ui/layout/Measurable;", "()Landroidx/compose/ui/layout/Measurable;", "rl", "Landroidx/compose/ui/layout/Placeable;", "nr", "()Landroidx/compose/ui/layout/Placeable;", "t", "J", "()J", "Z", "()Z", "O", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WrapEllipsisInfo {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Measurable ellipsis;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private boolean placeEllipsisOnLastContentLine;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final Placeable placeable;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final long ellipsisSize;

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(measurable, placeable, j2, z2);
        }

        private WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j2, boolean z2) {
            this.ellipsis = measurable;
            this.placeable = placeable;
            this.ellipsisSize = j2;
            this.placeEllipsisOnLastContentLine = z2;
        }

        public final void O(boolean z2) {
            this.placeEllipsisOnLastContentLine = z2;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Measurable getEllipsis() {
            return this.ellipsis;
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final Placeable getPlaceable() {
            return this.placeable;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final long getEllipsisSize() {
            return this.ellipsisSize;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.placeEllipsisOnLastContentLine;
        }

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(measurable, placeable, j2, (i2 & 8) != 0 ? true : z2, null);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "", "", "isLastItemInLine", "isLastItemInContainer", "<init>", "(ZZ)V", c.f62177j, "Z", "rl", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WrapInfo {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final boolean isLastItemInLine;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final boolean isLastItemInContainer;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getIsLastItemInContainer() {
            return this.isLastItemInContainer;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final boolean getIsLastItemInLine() {
            return this.isLastItemInLine;
        }

        public WrapInfo(boolean z2, boolean z3) {
            this.isLastItemInLine = z2;
            this.isLastItemInContainer = z3;
        }
    }

    public /* synthetic */ FlowLayoutBuildingBlocks(int i2, FlowLayoutOverflowState flowLayoutOverflowState, long j2, int i3, int i5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, flowLayoutOverflowState, j2, i3, i5, i7);
    }

    private FlowLayoutBuildingBlocks(int i2, FlowLayoutOverflowState flowLayoutOverflowState, long j2, int i3, int i5, int i7) {
        this.maxItemsInMainAxis = i2;
        this.overflow = flowLayoutOverflowState;
        this.constraints = j2;
        this.maxLines = i3;
        this.mainAxisSpacing = i5;
        this.crossAxisSpacing = i7;
    }

    public final WrapInfo rl(boolean nextItemHasNext, int nextIndexInLine, long leftOver, IntIntPair nextSize, int lineIndex, int totalCrossAxisSize, int currentLineCrossAxisSize, boolean isWrappingRound, boolean isEllipsisWrap) {
        int i2 = totalCrossAxisSize + currentLineCrossAxisSize;
        if (nextSize == null) {
            return new WrapInfo(true, true);
        }
        if (this.overflow.getType() != FlowLayoutOverflow.OverflowType.f17619n && (lineIndex >= this.maxLines || IntIntPair.J2(leftOver) - IntIntPair.J2(nextSize.getPackedValue()) < 0)) {
            return new WrapInfo(true, true);
        }
        if (nextIndexInLine != 0 && (nextIndexInLine >= this.maxItemsInMainAxis || IntIntPair.O(leftOver) - IntIntPair.O(nextSize.getPackedValue()) < 0)) {
            return isWrappingRound ? new WrapInfo(true, true) : new WrapInfo(true, rl(nextItemHasNext, 0, IntIntPair.rl(Constraints.qie(this.constraints), (IntIntPair.J2(leftOver) - this.crossAxisSpacing) - currentLineCrossAxisSize), IntIntPair.n(IntIntPair.rl(IntIntPair.O(nextSize.getPackedValue()) - this.mainAxisSpacing, IntIntPair.J2(nextSize.getPackedValue()))), lineIndex + 1, i2, 0, true, false).getIsLastItemInContainer());
        }
        int iMax = totalCrossAxisSize + Math.max(currentLineCrossAxisSize, IntIntPair.J2(nextSize.getPackedValue()));
        IntIntPair intIntPairJ2 = isEllipsisWrap ? null : this.overflow.J2(nextItemHasNext, lineIndex, iMax);
        if (intIntPairJ2 != null) {
            intIntPairJ2.getPackedValue();
            if (nextIndexInLine + 1 >= this.maxItemsInMainAxis || ((IntIntPair.O(leftOver) - IntIntPair.O(nextSize.getPackedValue())) - this.mainAxisSpacing) - IntIntPair.O(intIntPairJ2.getPackedValue()) < 0) {
                if (isEllipsisWrap) {
                    return new WrapInfo(true, true);
                }
                WrapInfo wrapInfoRl = rl(false, 0, IntIntPair.rl(Constraints.qie(this.constraints), (IntIntPair.J2(leftOver) - this.crossAxisSpacing) - Math.max(currentLineCrossAxisSize, IntIntPair.J2(nextSize.getPackedValue()))), intIntPairJ2, lineIndex + 1, iMax, 0, true, true);
                return new WrapInfo(wrapInfoRl.getIsLastItemInContainer(), wrapInfoRl.getIsLastItemInContainer());
            }
        }
        return new WrapInfo(false, false);
    }

    public final WrapEllipsisInfo n(WrapInfo wrapInfo, boolean hasNext, int lastContentLineIndex, int totalCrossAxisSize, int leftOverMainAxis, int nextIndexInLine) {
        WrapEllipsisInfo wrapEllipsisInfoO;
        boolean z2;
        if (!wrapInfo.getIsLastItemInContainer() || (wrapEllipsisInfoO = this.overflow.O(hasNext, lastContentLineIndex, totalCrossAxisSize)) == null) {
            return null;
        }
        if (lastContentLineIndex >= 0 && (nextIndexInLine == 0 || (leftOverMainAxis - IntIntPair.O(wrapEllipsisInfoO.getEllipsisSize()) >= 0 && nextIndexInLine < this.maxItemsInMainAxis))) {
            z2 = true;
        } else {
            z2 = false;
        }
        wrapEllipsisInfoO.O(z2);
        return wrapEllipsisInfoO;
    }
}
