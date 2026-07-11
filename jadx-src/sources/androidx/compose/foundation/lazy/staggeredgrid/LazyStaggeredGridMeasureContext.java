package androidx.compose.foundation.lazy.staggeredgrid;

import GJW.vd;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsContext;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\r*\u00020\u00072\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J'\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001d\u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b5\u0010;R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b<\u0010#\u001a\u0004\b=\u0010>R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b3\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bF\u0010:\u001a\u0004\b9\u0010;R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\b1\u0010ER\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bD\u0010C\u001a\u0004\b)\u0010ER\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bH\u0010#\u001a\u0004\bI\u0010>R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\bH\u0010ER\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b<\u0010LR\u0017\u0010\u001a\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\bM\u0010>R\u0017\u0010\u001b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u0010#\u001a\u0004\b\u001b\u0010>R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bI\u0010N\u001a\u0004\b-\u0010OR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b'\u0010P\u001a\u0004\b?\u0010QR\u0017\u0010U\u001a\u00020R8\u0006¢\u0006\f\n\u0004\b+\u0010S\u001a\u0004\bJ\u0010TR\u0017\u0010Y\u001a\u00020V8\u0006¢\u0006\f\n\u0004\b#\u0010W\u001a\u0004\bG\u0010XR\u0017\u0010Z\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bF\u0010E\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006["}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "mainAxisAvailableSize", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "beforeContentPadding", "afterContentPadding", "reverseLayout", "mainAxisSpacing", "LGJW/vd;", "coroutineScope", "isInLookaheadScope", "isLookingAhead", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "approachLayoutInfo", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZLandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJIIZILGJW/vd;ZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "itemIndex", "Z", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;I)Z", "lane", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "r", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J", c.f62177j, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "o", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "rl", "Ljava/util/List;", "HI", "()Ljava/util/List;", "t", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "KN", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "nr", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "ck", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "O", "J", "()J", "J2", "S", "()Z", "Uo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "az", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "I", "gh", "()I", "xMQ", "mUb", "qie", "Ik", "ty", "LGJW/vd;", "()LGJW/vd;", "XQ", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "Landroidx/compose/ui/graphics/GraphicsContext;", "()Landroidx/compose/ui/graphics/GraphicsContext;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "laneCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1475:1\n261#1:1481\n1135#2:1476\n1132#2:1477\n1129#2:1479\n1135#2:1482\n1132#2:1483\n1129#2:1485\n90#3:1478\n85#3:1480\n90#3:1484\n85#3:1486\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n*L\n264#1:1481\n261#1:1476\n261#1:1477\n261#1:1479\n264#1:1482\n264#1:1483\n264#1:1485\n261#1:1478\n261#1:1480\n264#1:1484\n264#1:1486\n*E\n"})
public final class LazyStaggeredGridMeasureContext {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final boolean isInLookaheadScope;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final LazyStaggeredGridLayoutInfo approachLayoutInfo;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final int mainAxisAvailableSize;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final LazyLayoutMeasureScope measureScope;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final int laneCount;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final LazyStaggeredGridLaneInfo laneInfo;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final int mainAxisSpacing;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final boolean isLookingAhead;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyStaggeredGridState state;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final LazyStaggeredGridSlots resolvedSlots;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final LazyStaggeredGridMeasureProvider measuredItemProvider;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final GraphicsContext graphicsContext;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final List pinnedItems;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final LazyStaggeredGridItemProvider itemProvider;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final vd coroutineScope;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final long contentOffset;

    public /* synthetic */ LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, boolean z2, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j3, int i3, int i5, boolean z3, int i7, vd vdVar, boolean z4, boolean z5, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j2, z2, lazyLayoutMeasureScope, i2, j3, i3, i5, z3, i7, vdVar, z4, z5, lazyStaggeredGridLayoutInfo, graphicsContext);
    }

    private LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, final LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, final LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, final boolean z2, final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j3, int i3, int i5, boolean z3, int i7, vd vdVar, boolean z4, boolean z5, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        this.state = lazyStaggeredGridState;
        this.pinnedItems = list;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.resolvedSlots = lazyStaggeredGridSlots;
        this.constraints = j2;
        this.isVertical = z2;
        this.measureScope = lazyLayoutMeasureScope;
        this.mainAxisAvailableSize = i2;
        this.contentOffset = j3;
        this.beforeContentPadding = i3;
        this.afterContentPadding = i5;
        this.reverseLayout = z3;
        this.mainAxisSpacing = i7;
        this.coroutineScope = vdVar;
        this.isInLookaheadScope = z4;
        this.isLookingAhead = z5;
        this.approachLayoutInfo = lazyStaggeredGridLayoutInfo;
        this.graphicsContext = graphicsContext;
        this.measuredItemProvider = new LazyStaggeredGridMeasureProvider(z2, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, lazyStaggeredGridSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            public LazyStaggeredGridMeasuredItem t(int index, int lane, int span, Object key, Object contentType, List placeables, long constraints) {
                return new LazyStaggeredGridMeasuredItem(index, key, placeables, this.f18729O.getIsVertical(), this.f18729O.getMainAxisSpacing(), lane, span, this.f18729O.getBeforeContentPadding(), this.f18729O.getAfterContentPadding(), contentType, this.f18729O.getState().getItemAnimator(), constraints, null);
            }
        };
        this.laneInfo = lazyStaggeredGridState.getLaneInfo();
        this.laneCount = lazyStaggeredGridSlots.getSizes().length;
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final List getPinnedItems() {
        return this.pinnedItems;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final vd getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.itemProvider;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final boolean getIsInLookaheadScope() {
        return this.isInLookaheadScope;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.measureScope;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final LazyStaggeredGridSlots getResolvedSlots() {
        return this.resolvedSlots;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final LazyStaggeredGridLayoutInfo getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final int getLaneCount() {
        return this.laneCount;
    }

    public final boolean Z(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i2) {
        return lazyStaggeredGridItemProvider.KN().n(i2);
    }

    public final long r(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i2, int i3) {
        int i5;
        boolean zN = lazyStaggeredGridItemProvider.KN().n(i2);
        if (zN) {
            i5 = this.laneCount;
        } else {
            i5 = 1;
        }
        if (zN) {
            i3 = 0;
        }
        return SpanRange.n(i3, i5);
    }
}
