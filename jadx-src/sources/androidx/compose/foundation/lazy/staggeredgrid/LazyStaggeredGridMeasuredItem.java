package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J/\u0010'\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J%\u0010.\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u00020 2\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\n¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010!\u001a\u0004\bD\u0010ER\u001a\u0010\r\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010:\u001a\u0004\bC\u0010<R\u001a\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u0010<R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010:R\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010:R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010>\u001a\u0004\bJ\u0010@R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010KR \u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b=\u0010NR\"\u0010R\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\bO\u0010E\"\u0004\bP\u0010QR\u0017\u0010U\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bT\u0010<R\u001a\u0010V\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\bS\u0010<R\u0017\u0010X\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010:\u001a\u0004\bW\u0010<R\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010:R\u0016\u0010Z\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010:R\u0016\u0010[\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010:R\"\u0010\\\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010!\u001a\u0004\bI\u0010E\"\u0004\bG\u0010QR \u0010^\u001a\u00020]8\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010M\u001a\u0004\b9\u0010NR*\u0010`\u001a\u00020\u001a2\u0006\u0010_\u001a\u00020\u001a8\u0016@RX\u0096\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bP\u0010M\u001a\u0004\bF\u0010NR\u0018\u0010\u001d\u001a\u00020\u0003*\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010aR\u0014\u0010b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010<R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bY\u0010<\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006c"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "index", "", "key", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "", "isVertical", "spacing", "lane", TtmlNode.TAG_SPAN, "beforeContentPadding", "afterContentPadding", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ty", "(I)Ljava/lang/Object;", "Landroidx/compose/ui/unit/IntOffset;", "HI", "(I)J", "mainAxis", "crossAxis", "mainAxisLayoutSize", "", "Z", "(III)V", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "qie", "(IIII)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "context", "isLookingAhead", "o", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;Z)V", "S", "(I)V", "delta", "updateAnimations", "xMQ", "(IZ)V", "", "toString", "()Ljava/lang/String;", c.f62177j, "I", "getIndex", "()I", "rl", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "t", "Ljava/util/List;", "nr", "mUb", "()Z", "O", "J2", "KN", "Uo", "getContentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "gh", "J", "()J", "r", "XQ", "(Z)V", "isVisible", "az", "Ik", "mainAxisSize", "mainAxisSizeWithSpacings", "getCrossAxisSize", "crossAxisSize", "ck", "minMainAxisOffset", "maxMainAxisOffset", "nonScrollableItem", "Landroidx/compose/ui/unit/IntSize;", "size", "<set-?>", "offset", "(J)I", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,1475:1\n1461#1:1509\n1464#1:1510\n1461#1:1511\n1464#1:1515\n1464#1:1518\n344#2,8:1476\n344#2,8:1484\n70#2,4:1505\n75#2:1514\n30#3:1492\n30#3:1494\n80#4:1493\n80#4:1495\n80#4:1497\n80#4:1499\n80#4:1513\n80#4:1517\n80#4:1520\n80#4:1522\n32#5:1496\n32#5:1498\n32#5:1512\n32#5:1516\n32#5:1519\n32#5:1521\n96#6,5:1500\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1379#1:1509\n1416#1:1510\n1417#1:1511\n1446#1:1515\n1451#1:1518\n1312#1:1476,8\n1319#1:1484,8\n1378#1:1505,4\n1378#1:1514\n1333#1:1492\n1335#1:1494\n1333#1:1493\n1335#1:1495\n1352#1:1497\n1354#1:1499\n1416#1:1513\n1446#1:1517\n1451#1:1520\n1464#1:1522\n1352#1:1496\n1354#1:1498\n1416#1:1512\n1446#1:1516\n1451#1:1519\n1464#1:1521\n1376#1:1500,5\n*E\n"})
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo, LazyLayoutMeasuredItem {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private int minMainAxisOffset;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int span;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int lane;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private long offset;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final int mainAxisSize;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private int mainAxisLayoutSize;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final LazyLayoutItemAnimator animator;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean nonScrollableItem;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private boolean isVisible;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int maxMainAxisOffset;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List placeables;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final Object contentType;

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int i2, Object obj, List list, boolean z2, int i3, int i5, int i7, int i8, int i9, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, obj, list, z2, i3, i5, i7, i8, i9, obj2, lazyLayoutItemAnimator, j2);
    }

    private LazyStaggeredGridMeasuredItem(int i2, Object obj, List list, boolean z2, int i3, int i5, int i7, int i8, int i9, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2) {
        int height;
        this.index = i2;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z2;
        this.lane = i5;
        this.span = i7;
        this.beforeContentPadding = i8;
        this.afterContentPadding = i9;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j2;
        int i10 = 1;
        this.isVisible = true;
        int i11 = 0;
        if (list.isEmpty()) {
            height = 0;
        } else {
            Placeable placeable = (Placeable) list.get(0);
            height = getIsVertical() ? placeable.getHeight() : placeable.getWidth();
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex) {
                int i12 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i12);
                    int height2 = getIsVertical() ? placeable2.getHeight() : placeable2.getWidth();
                    height = height2 > height ? height2 : height;
                    if (i12 == lastIndex) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        this.mainAxisSize = height;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(height + i3, 0);
        List list2 = this.placeables;
        if (!list2.isEmpty()) {
            Placeable placeable3 = (Placeable) list2.get(0);
            int width = getIsVertical() ? placeable3.getWidth() : placeable3.getHeight();
            int lastIndex2 = CollectionsKt.getLastIndex(list2);
            if (1 <= lastIndex2) {
                while (true) {
                    Placeable placeable4 = (Placeable) list2.get(i10);
                    int width2 = getIsVertical() ? placeable4.getWidth() : placeable4.getHeight();
                    width = width2 > width ? width2 : width;
                    if (i10 == lastIndex2) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            i11 = width;
        }
        this.crossAxisSize = i11;
        this.mainAxisLayoutSize = -1;
        this.size = getIsVertical() ? IntSize.t((((long) this.mainAxisSize) & 4294967295L) | (((long) i11) << 32)) : IntSize.t((((long) i11) & 4294967295L) | (((long) this.mainAxisSize) << 32));
        this.offset = IntOffset.INSTANCE.rl();
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
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

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
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

    public final void XQ(boolean z2) {
        this.isVisible = z2;
    }

    public final void Z(int mainAxis, int crossAxis, int mainAxisLayoutSize) {
        long jJ2;
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
        if (getIsVertical()) {
            jJ2 = IntOffset.J2((((long) crossAxis) << 32) | (4294967295L & ((long) mainAxis)));
        } else {
            jJ2 = IntOffset.J2((((long) crossAxis) & 4294967295L) | (((long) mainAxis) << 32));
        }
        this.offset = jJ2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: az, reason: from getter */
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: mUb, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: n, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: nr, reason: from getter */
    public int getLane() {
        return this.lane;
    }

    public final void o(Placeable.PlacementScope scope, LazyStaggeredGridMeasureContext context, boolean isLookingAhead) {
        GraphicsLayer layer;
        if (!(this.mainAxisLayoutSize != -1)) {
            InlineClassHelperKt.n("position() should be called first");
        }
        List list = this.placeables;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable = (Placeable) list.get(i2);
            int height = this.minMainAxisOffset - (getIsVertical() ? placeable.getHeight() : placeable.getWidth());
            int i3 = this.maxMainAxisOffset;
            long offset = getOffset();
            LazyLayoutItemAnimation lazyLayoutItemAnimationO = this.animator.O(getKey(), i2);
            if (lazyLayoutItemAnimationO != null) {
                if (isLookingAhead) {
                    lazyLayoutItemAnimationO.e(offset);
                } else {
                    long jHI = IntOffset.HI(!IntOffset.mUb(lazyLayoutItemAnimationO.getLookaheadOffset(), LazyLayoutItemAnimation.INSTANCE.n()) ? lazyLayoutItemAnimationO.getLookaheadOffset() : offset, lazyLayoutItemAnimationO.r());
                    if ((gh(offset) <= height && gh(jHI) <= height) || (gh(offset) >= i3 && gh(jHI) >= i3)) {
                        lazyLayoutItemAnimationO.ty();
                    }
                    offset = jHI;
                }
                layer = lazyLayoutItemAnimationO.getLayer();
            } else {
                layer = null;
            }
            if (context.getReverseLayout()) {
                int iGh = getIsVertical() ? IntOffset.gh(offset) : (this.mainAxisLayoutSize - IntOffset.gh(offset)) - (getIsVertical() ? placeable.getHeight() : placeable.getWidth());
                offset = IntOffset.J2((((long) (getIsVertical() ? (this.mainAxisLayoutSize - IntOffset.qie(offset)) - (getIsVertical() ? placeable.getHeight() : placeable.getWidth()) : IntOffset.qie(offset))) & 4294967295L) | (((long) iGh) << 32));
            }
            long jHI2 = IntOffset.HI(offset, context.getContentOffset());
            if (!isLookingAhead && lazyLayoutItemAnimationO != null) {
                lazyLayoutItemAnimationO.E2(jHI2);
            }
            if (layer != null) {
                Placeable.PlacementScope.XQ(scope, placeable, jHI2, layer, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.Z(scope, placeable, jHI2, 0.0f, null, 6, null);
            }
        }
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
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

    private final int gh(long j2) {
        if (getIsVertical()) {
            return IntOffset.qie(j2);
        }
        return IntOffset.gh(j2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public long HI(int index) {
        return getOffset();
    }

    public final int ck() {
        if (!getIsVertical()) {
            return IntOffset.gh(getOffset());
        }
        return IntOffset.qie(getOffset());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void qie(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        if (getIsVertical()) {
            layoutWidth = layoutHeight;
        }
        Z(mainAxisOffset, crossAxisOffset, layoutWidth);
    }

    public String toString() {
        return super.toString();
    }

    public final void xMQ(int delta, boolean updateAnimations) {
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
