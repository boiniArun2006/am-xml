package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020%2\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020%2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b1\u00102J\u001d\u00106\u001a\u00020%2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b6\u00107R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010?R\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u00109R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u00109R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00109R\u001a\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010QR \u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b-\u0010K\u001a\u0004\b<\u0010RR$\u0010U\u001a\u00020\u00032\u0006\u0010S\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bT\u00109\u001a\u0004\b8\u0010;R\u001a\u0010W\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\bV\u0010;R\u001a\u0010X\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b(\u00109\u001a\u0004\bB\u0010;R\u001a\u0010Y\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\bH\u0010;R\u001a\u0010Z\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\bO\u0010;R\u0017\u0010\\\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b[\u00109\u001a\u0004\bI\u0010;R\"\u0010_\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\bG\u0010A\"\u0004\bE\u0010^R\u0016\u0010*\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u00109R\u0016\u0010b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u00109R\u0016\u0010d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u00109R\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010j\u001a\u00020\u0003*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010iR\u0018\u0010l\u001a\u00020\u0003*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010kR\u0014\u0010m\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010;\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006n"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "index", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "", "isVertical", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "", "key", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ty", "(I)Ljava/lang/Object;", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "", "qie", "(IIII)V", "r", "(III)V", "mainAxisLayoutSize", "o", "(I)V", "HI", "(I)J", "delta", "updateAnimations", "O", "(IZ)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "isLookingAhead", "Ik", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Z)V", c.f62177j, "I", "getIndex", "()I", "rl", "Ljava/util/List;", "t", "Z", "mUb", "()Z", "nr", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "J2", "Landroidx/compose/ui/unit/LayoutDirection;", "Uo", "KN", "xMQ", "gh", "J", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "az", "getContentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "()J", "<set-?>", "ck", "offset", "getSize", "size", "lane", TtmlNode.TAG_SPAN, "mainAxisSizeWithSpacings", "XQ", "crossAxisSize", "S", "(Z)V", "nonScrollableItem", "WPU", "aYN", "minMainAxisOffset", "ViF", "maxMainAxisOffset", "", "nY", "[I", "placeableOffsets", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,264:1\n260#1:292\n260#1:300\n34#2,6:265\n70#2,4:271\n75#2:289\n107#3,7:275\n107#3,7:282\n96#3,5:295\n32#4:290\n32#4:293\n32#4:301\n32#4:303\n80#5:291\n80#5:294\n80#5:302\n80#5:304\n*S KotlinDebug\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n*L\n183#1:292\n229#1:300\n97#1:265,6\n129#1:271,4\n129#1:289\n133#1:275,7\n142#1:282,7\n191#1:295,5\n163#1:290\n183#1:293\n229#1:301\n260#1:303\n163#1:291\n183#1:294\n229#1:302\n260#1:304\n*E\n"})
public final class LazyListMeasuredItem implements LazyListItemInfo, LazyLayoutMeasuredItem {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Alignment.Vertical verticalAlignment;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean nonScrollableItem;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private int maxMainAxisOffset;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private int mainAxisLayoutSize;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private int minMainAxisOffset;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final Object contentType;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private int offset;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final int spacing;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private final int[] placeableOffsets;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Alignment.Horizontal horizontalAlignment;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int span;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int lane;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final List placeables;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final LazyLayoutItemAnimator animator;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final int afterContentPadding;

    public /* synthetic */ LazyListMeasuredItem(int i2, List list, boolean z2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z3, int i3, int i5, int i7, long j2, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, list, z2, horizontal, vertical, layoutDirection, z3, i3, i5, i7, j2, obj, obj2, lazyLayoutItemAnimator, j3);
    }

    private LazyListMeasuredItem(int i2, List list, boolean z2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z3, int i3, int i5, int i7, long j2, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3) {
        this.index = i2;
        this.placeables = list;
        this.isVertical = z2;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z3;
        this.beforeContentPadding = i3;
        this.afterContentPadding = i5;
        this.spacing = i7;
        this.visualOffset = j2;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j3;
        this.span = 1;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int height = 0;
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Placeable placeable = (Placeable) list.get(i8);
            height += getIsVertical() ? placeable.getHeight() : placeable.getWidth();
            iMax = Math.max(iMax, !getIsVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = height;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(getSize() + this.spacing, 0);
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public long HI(int index) {
        int[] iArr = this.placeableOffsets;
        int i2 = index * 2;
        return IntOffset.J2((((long) iArr[i2]) << 32) | (((long) iArr[i2 + 1]) & 4294967295L));
    }

    public final void Ik(Placeable.PlacementScope scope, boolean isLookingAhead) {
        GraphicsLayer layer;
        Placeable.PlacementScope placementScope;
        long jGh;
        int i2 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.n("position() should be called first");
        }
        int iT = t();
        while (i2 < iT) {
            Placeable placeable = (Placeable) this.placeables.get(i2);
            int iCk = this.minMainAxisOffset - ck(placeable);
            int i3 = this.maxMainAxisOffset;
            long jHI = HI(i2);
            LazyLayoutItemAnimation lazyLayoutItemAnimationO = this.animator.O(getKey(), i2);
            if (lazyLayoutItemAnimationO != null) {
                if (isLookingAhead) {
                    lazyLayoutItemAnimationO.e(jHI);
                } else {
                    if (!IntOffset.mUb(lazyLayoutItemAnimationO.getLookaheadOffset(), LazyLayoutItemAnimation.INSTANCE.n())) {
                        jHI = lazyLayoutItemAnimationO.getLookaheadOffset();
                    }
                    long jHI2 = IntOffset.HI(jHI, lazyLayoutItemAnimationO.r());
                    if ((gh(jHI) <= iCk && gh(jHI2) <= iCk) || (gh(jHI) >= i3 && gh(jHI2) >= i3)) {
                        lazyLayoutItemAnimationO.ty();
                    }
                    jHI = jHI2;
                }
                layer = lazyLayoutItemAnimationO.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                if (getIsVertical()) {
                    jGh = (((long) ((this.mainAxisLayoutSize - IntOffset.qie(jHI)) - ck(placeable))) & 4294967295L) | (((long) IntOffset.gh(jHI)) << 32);
                } else {
                    jGh = (((long) ((this.mainAxisLayoutSize - IntOffset.gh(jHI)) - ck(placeable))) << 32) | (4294967295L & ((long) IntOffset.qie(jHI)));
                }
                jHI = IntOffset.J2(jGh);
            }
            long jHI3 = IntOffset.HI(jHI, this.visualOffset);
            if (!isLookingAhead && lazyLayoutItemAnimationO != null) {
                lazyLayoutItemAnimationO.E2(jHI3);
            }
            if (!getIsVertical()) {
                placementScope = scope;
                GraphicsLayer graphicsLayer = layer;
                if (graphicsLayer != null) {
                    Placeable.PlacementScope.XQ(placementScope, placeable, jHI3, graphicsLayer, 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.Z(placementScope, placeable, jHI3, 0.0f, null, 6, null);
                }
            } else if (layer != null) {
                placementScope = scope;
                Placeable.PlacementScope.g(placementScope, placeable, jHI3, layer, 0.0f, 4, null);
            } else {
                placementScope = scope;
                Placeable.PlacementScope.nY(placementScope, placeable, jHI3, 0.0f, null, 6, null);
            }
            i2++;
            scope = placementScope;
        }
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

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: Uo, reason: from getter */
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: az, reason: from getter */
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: mUb, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: nr, reason: from getter */
    public int getLane() {
        return this.lane;
    }

    public final void o(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void r(int mainAxisOffset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = mainAxisOffset;
        this.mainAxisLayoutSize = getIsVertical() ? layoutHeight : layoutWidth;
        List list = this.placeables;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable = (Placeable) list.get(i2);
            int i3 = i2 * 2;
            if (getIsVertical()) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    InlineClassHelperKt.rl("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                iArr[i3] = horizontal.n(placeable.getWidth(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i3 + 1] = mainAxisOffset;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i3] = mainAxisOffset;
                int i5 = i3 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    InlineClassHelperKt.rl("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                iArr2[i5] = vertical.n(placeable.getHeight(), layoutHeight);
                width = placeable.getWidth();
            }
            mainAxisOffset += width;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
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

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    private final int ck(Placeable placeable) {
        if (getIsVertical()) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    private final int gh(long j2) {
        if (getIsVertical()) {
            return IntOffset.qie(j2);
        }
        return IntOffset.gh(j2);
    }

    public final void O(int delta, boolean updateAnimations) {
        int iIntValue;
        int iQie;
        if (!getNonScrollableItem()) {
            this.offset = getOffset() + delta;
            int length = this.placeableOffsets.length;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 & 1;
                if ((getIsVertical() && i3 != 0) || (!getIsVertical() && i3 == 0)) {
                    int[] iArr = this.placeableOffsets;
                    iArr[i2] = iArr[i2] + delta;
                }
            }
            if (updateAnimations) {
                int iT = t();
                for (int i5 = 0; i5 < iT; i5++) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimationO = this.animator.O(getKey(), i5);
                    if (lazyLayoutItemAnimationO != null) {
                        long rawOffset = lazyLayoutItemAnimationO.getRawOffset();
                        if (getIsVertical()) {
                            iIntValue = IntOffset.gh(rawOffset);
                            iQie = Integer.valueOf(IntOffset.qie(rawOffset) + delta).intValue();
                        } else {
                            iIntValue = Integer.valueOf(IntOffset.gh(rawOffset) + delta).intValue();
                            iQie = IntOffset.qie(rawOffset);
                        }
                        lazyLayoutItemAnimationO.nHg(IntOffset.J2((((long) iIntValue) << 32) | (4294967295L & ((long) iQie))));
                    }
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void qie(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        r(mainAxisOffset, layoutWidth, layoutHeight);
    }
}
