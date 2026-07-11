package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J/\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J=\u0010+\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020&2\u0006\u0010-\u001a\u00020\u0003¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020&2\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0007¢\u0006\u0004\b2\u00103J\u001d\u00107\u001a\u00020&2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0007¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010CR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010<R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00107R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010:R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010:R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bB\u0010MR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010>\u001a\u0004\bO\u0010@R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010PR \u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\b=\u0010RR\u001a\u0010\u001a\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010:\u001a\u0004\bD\u0010<R\u001a\u0010\u001b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010:\u001a\u0004\bJ\u0010<R\u0017\u0010T\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u0010:\u001a\u0004\bS\u0010<R\u001a\u0010V\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010:\u001a\u0004\bQ\u0010<R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010:R\u0016\u0010X\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010:R\u0016\u0010Y\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010:R \u0010[\u001a\u00020Z8\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b+\u0010M\u001a\u0004\b9\u0010RR*\u0010]\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020\u00138\u0016@RX\u0096\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b.\u0010M\u001a\u0004\bF\u0010RR$\u0010)\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b^\u0010:\u001a\u0004\bK\u0010<R$\u0010*\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b_\u0010:\u001a\u0004\bN\u0010<R\"\u0010b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u00107\u001a\u0004\bI\u0010C\"\u0004\bG\u0010aR\u0018\u0010d\u001a\u00020\u0003*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010cR\u0018\u0010T\u001a\u00020\u0003*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010eR\u0014\u0010f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010<\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006g"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "index", "", "key", "", "isVertical", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/Constraints;", "constraints", "lane", TtmlNode.TAG_SPAN, "<init>", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ty", "(I)Ljava/lang/Object;", "HI", "(I)J", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "", "qie", "(IIII)V", "row", "column", "XQ", "(IIIIII)V", "mainAxisLayoutSize", "S", "(I)V", "delta", "updateAnimations", "ck", "(IZ)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "isLookingAhead", "Z", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Z)V", c.f62177j, "I", "getIndex", "()I", "rl", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "t", "mUb", "()Z", "nr", "getCrossAxisSize", "O", "J2", "Landroidx/compose/ui/unit/LayoutDirection;", "Uo", "KN", "xMQ", "Ljava/util/List;", "J", "gh", "getContentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "az", "()J", "r", "mainAxisSize", "Ik", "mainAxisSizeWithSpacings", "o", "minMainAxisOffset", "maxMainAxisOffset", "Landroidx/compose/ui/unit/IntSize;", "size", "<set-?>", "offset", "WPU", "aYN", "ViF", "(Z)V", "nonScrollableItem", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/Placeable;)I", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,259:1\n255#1:274\n255#1:277\n255#1:285\n34#2,6:260\n30#3:266\n30#3:268\n80#4:267\n80#4:269\n80#4:271\n80#4:273\n80#4:276\n80#4:279\n80#4:287\n80#4:289\n32#5:270\n32#5:272\n32#5:275\n32#5:278\n32#5:286\n32#5:288\n96#6,5:280\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n173#1:274\n178#1:277\n224#1:285\n78#1:260,6\n87#1:266\n89#1:268\n87#1:267\n89#1:269\n150#1:271\n152#1:273\n173#1:276\n178#1:279\n224#1:287\n255#1:289\n150#1:270\n152#1:272\n173#1:275\n178#1:278\n224#1:286\n255#1:288\n186#1:280,5\n*E\n"})
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final int span;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private long offset;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private boolean nonScrollableItem;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private int row;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private int maxMainAxisOffset;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private int column;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final int mainAxisSize;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final Object contentType;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int minMainAxisOffset;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final LazyLayoutItemAnimator animator;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final int lane;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final List placeables;

    public /* synthetic */ LazyGridMeasuredItem(int i2, Object obj, boolean z2, int i3, int i5, boolean z3, LayoutDirection layoutDirection, int i7, int i8, List list, long j2, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, obj, z2, i3, i5, z3, layoutDirection, i7, i8, list, j2, obj2, lazyLayoutItemAnimator, j3, i9, i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void qie(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        XQ(mainAxisOffset, crossAxisOffset, layoutWidth, layoutHeight, -1, -1);
    }

    private LazyGridMeasuredItem(int i2, Object obj, boolean z2, int i3, int i5, boolean z3, LayoutDirection layoutDirection, int i7, int i8, List list, long j2, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3, int i9, int i10) {
        this.index = i2;
        this.key = obj;
        this.isVertical = z2;
        this.crossAxisSize = i3;
        this.reverseLayout = z3;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i7;
        this.afterContentPadding = i8;
        this.placeables = list;
        this.visualOffset = j2;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j3;
        this.lane = i9;
        this.span = i10;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Placeable placeable = (Placeable) list.get(i11);
            iMax = Math.max(iMax, getIsVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(i5 + iMax, 0);
        this.size = getIsVertical() ? IntSize.t((((long) iMax) & 4294967295L) | (((long) this.crossAxisSize) << 32)) : IntSize.t((((long) this.crossAxisSize) & 4294967295L) | (((long) iMax) << 32));
        this.offset = IntOffset.INSTANCE.rl();
        this.row = -1;
        this.column = -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void J2(boolean z2) {
        this.nonScrollableItem = z2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: KN, reason: from getter */
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: O, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    public final void S(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: Uo, reason: from getter */
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    public final void Z(Placeable.PlacementScope scope, boolean isLookingAhead) {
        GraphicsLayer layer;
        Placeable.PlacementScope placementScope;
        int i2 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.n("position() should be called first");
        }
        int iT = t();
        while (i2 < iT) {
            Placeable placeable = (Placeable) this.placeables.get(i2);
            int iO = this.minMainAxisOffset - o(placeable);
            int i3 = this.maxMainAxisOffset;
            long offset = getOffset();
            LazyLayoutItemAnimation lazyLayoutItemAnimationO = this.animator.O(getKey(), i2);
            if (lazyLayoutItemAnimationO != null) {
                if (isLookingAhead) {
                    lazyLayoutItemAnimationO.e(offset);
                } else {
                    long jHI = IntOffset.HI(!IntOffset.mUb(lazyLayoutItemAnimationO.getLookaheadOffset(), LazyLayoutItemAnimation.INSTANCE.n()) ? lazyLayoutItemAnimationO.getLookaheadOffset() : offset, lazyLayoutItemAnimationO.r());
                    if ((Ik(offset) <= iO && Ik(jHI) <= iO) || (Ik(offset) >= i3 && Ik(jHI) >= i3)) {
                        lazyLayoutItemAnimationO.ty();
                    }
                    offset = jHI;
                }
                layer = lazyLayoutItemAnimationO.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                offset = IntOffset.J2((((long) (getIsVertical() ? (this.mainAxisLayoutSize - IntOffset.qie(offset)) - o(placeable) : IntOffset.qie(offset))) & 4294967295L) | (((long) (getIsVertical() ? IntOffset.gh(offset) : (this.mainAxisLayoutSize - IntOffset.gh(offset)) - o(placeable))) << 32));
            }
            long jHI2 = IntOffset.HI(offset, this.visualOffset);
            if (!isLookingAhead && lazyLayoutItemAnimationO != null) {
                lazyLayoutItemAnimationO.E2(jHI2);
            }
            if (!getIsVertical()) {
                placementScope = scope;
                GraphicsLayer graphicsLayer = layer;
                if (graphicsLayer != null) {
                    Placeable.PlacementScope.XQ(placementScope, placeable, jHI2, graphicsLayer, 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.Z(placementScope, placeable, jHI2, 0.0f, null, 6, null);
                }
            } else if (layer != null) {
                placementScope = scope;
                Placeable.PlacementScope.g(placementScope, placeable, jHI2, layer, 0.0f, 4, null);
            } else {
                placementScope = scope;
                Placeable.PlacementScope.nY(placementScope, placeable, jHI2, 0.0f, null, 6, null);
            }
            i2++;
            scope = placementScope;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: az, reason: from getter */
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: gh, reason: from getter */
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: mUb, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: n, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: nr, reason: from getter */
    public int getLane() {
        return this.lane;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: rl, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int t() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object ty(int index) {
        return ((Placeable) this.placeables.get(index)).J2();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public int getRow() {
        return this.row;
    }

    private final int Ik(long j2) {
        if (getIsVertical()) {
            return IntOffset.qie(j2);
        }
        return IntOffset.gh(j2);
    }

    private final int o(Placeable placeable) {
        if (getIsVertical()) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public long HI(int index) {
        return getOffset();
    }

    public final void XQ(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight, int row, int column) {
        int i2;
        long jJ2;
        if (getIsVertical()) {
            i2 = layoutHeight;
        } else {
            i2 = layoutWidth;
        }
        this.mainAxisLayoutSize = i2;
        if (!getIsVertical()) {
            layoutWidth = layoutHeight;
        }
        if (getIsVertical() && this.layoutDirection == LayoutDirection.f34161t) {
            crossAxisOffset = (layoutWidth - crossAxisOffset) - this.crossAxisSize;
        }
        if (getIsVertical()) {
            jJ2 = IntOffset.J2((((long) crossAxisOffset) << 32) | (4294967295L & ((long) mainAxisOffset)));
        } else {
            jJ2 = IntOffset.J2((((long) crossAxisOffset) & 4294967295L) | (((long) mainAxisOffset) << 32));
        }
        this.offset = jJ2;
        this.row = row;
        this.column = column;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void ck(int delta, boolean updateAnimations) {
        int iGh;
        int iIntValue;
        if (!getNonScrollableItem()) {
            long offset = getOffset();
            if (getIsVertical()) {
                iGh = IntOffset.gh(offset);
            } else {
                iGh = IntOffset.gh(offset) + delta;
            }
            boolean isVertical = getIsVertical();
            int iQie = IntOffset.qie(offset);
            if (isVertical) {
                iQie += delta;
            }
            this.offset = IntOffset.J2((((long) iGh) << 32) | (((long) iQie) & 4294967295L));
            if (updateAnimations) {
                int iT = t();
                for (int i2 = 0; i2 < iT; i2++) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimationO = this.animator.O(getKey(), i2);
                    if (lazyLayoutItemAnimationO != null) {
                        long rawOffset = lazyLayoutItemAnimationO.getRawOffset();
                        if (getIsVertical()) {
                            iIntValue = IntOffset.gh(rawOffset);
                        } else {
                            iIntValue = Integer.valueOf(IntOffset.gh(rawOffset) + delta).intValue();
                        }
                        boolean isVertical2 = getIsVertical();
                        int iQie2 = IntOffset.qie(rawOffset);
                        if (isVertical2) {
                            iQie2 = Integer.valueOf(iQie2 + delta).intValue();
                        }
                        lazyLayoutItemAnimationO.nHg(IntOffset.J2((((long) iQie2) & 4294967295L) | (((long) iIntValue) << 32)));
                    }
                }
            }
        }
    }
}
