package androidx.compose.foundation.lazy.grid;

import GJW.vd;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutStickyItemsKt;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.reporters.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u001aÜ\u0002\u00108\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'23\u0010.\u001a/\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0-0\u001d0)2\b\u00100\u001a\u0004\u0018\u00010/2/\u00106\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030)¢\u0006\u0002\b4\u0012\u0004\u0012\u00020501H\u0000ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001aM\u0010>\u001a\b\u0012\u0004\u0012\u00020;0\u001d2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00102\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u001d2\b\u0010=\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0093\u0001\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0H2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020;0\u001d2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bI\u0010J\u001a-\u0010N\u001a\u000203\"\u0004\b\u0000\u0010K*\b\u0012\u0004\u0012\u00028\u00000H2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0002¢\u0006\u0004\bN\u0010O\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "itemAnimator", "slotsPerLine", "", "pinnedItems", "isInLookaheadScope", "isLookingAhead", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "approachLayoutInfo", "LGJW/vd;", "coroutineScope", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "line", "Lkotlin/Pair;", "prefetchInfoRetriever", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "stickyItemsScrollBehavior", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", TtmlNode.TAG_LAYOUT, "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "O", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;LGJW/vd;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "lastVisibleItemIndex", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "visibleLines", "lastApproachLayoutInfo", "nr", "(IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;ZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)Ljava/util/List;", b.f62856d, "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "rl", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "arr", c.f62177j, "(Ljava/util/List;[Ljava/lang/Object;)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,635:1\n467#1,3:658\n470#1,16:665\n487#1:682\n467#1,3:683\n470#1:690\n471#1,15:701\n487#1:717\n96#2,5:636\n96#2,5:641\n96#2,5:653\n50#2,5:745\n96#2,5:760\n107#2,7:765\n107#2,7:772\n54#3:646\n59#3:648\n54#3:718\n59#3:720\n85#4:647\n90#4:649\n85#4:719\n90#4:721\n26#5:650\n26#5:651\n26#5:652\n34#6,4:661\n39#6:681\n34#6,4:686\n102#6,2:691\n34#6,4:693\n39#6:699\n104#6:700\n39#6:716\n34#6,6:722\n34#6,6:728\n102#6,2:735\n34#6,4:737\n39#6:743\n104#6:744\n133#6,3:750\n34#6,6:753\n136#6:759\n52#6,6:779\n34#6,6:785\n34#6,6:791\n12474#7,2:697\n12474#7,2:741\n1#8:734\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n290#1:658,3\n290#1:665,16\n290#1:682\n308#1:683,3\n308#1:690\n308#1:701,15\n308#1:717\n82#1:636,5\n83#1:641,5\n283#1:653,5\n562#1:745,5\n568#1:760,5\n575#1:765,7\n580#1:772,7\n107#1:646\n108#1:648\n393#1:718\n395#1:720\n107#1:647\n108#1:649\n393#1:719\n395#1:721\n137#1:650\n265#1:651\n266#1:652\n290#1:661,4\n290#1:681\n308#1:686,4\n315#1:691,2\n315#1:693,4\n315#1:699\n315#1:700\n308#1:716\n398#1:722,6\n469#1:728,6\n530#1:735,2\n530#1:737,4\n530#1:743\n530#1:744\n565#1:750,3\n565#1:753,6\n565#1:759\n608#1:779,6\n615#1:785,6\n620#1:791,6\n316#1:697,2\n530#1:741,2\n*E\n"})
public final class LazyGridMeasureKt {
    /* JADX WARN: Removed duplicated region for block: B:185:0x0437  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LazyGridMeasureResult O(int i2, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, final LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i3, int i5, int i7, int i8, int i9, int i10, float f3, long j2, boolean z2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z3, Density density, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i11, List list, boolean z4, final boolean z5, LazyGridLayoutInfo lazyGridLayoutInfo, vd vdVar, final MutableState mutableState, GraphicsContext graphicsContext, Function1 function1, StickyItemsPlacement stickyItemsPlacement, Function3 function3) {
        int i12;
        ArrayDeque arrayDeque;
        int i13;
        LazyGridMeasuredLine lazyGridMeasuredLine;
        ArrayDeque arrayDeque2;
        int i14;
        int i15;
        ArrayDeque arrayDeque3;
        List list2;
        int i16;
        int i17;
        int i18;
        LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider2;
        int i19;
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        int i20;
        int i21;
        int i22;
        boolean z6 = true;
        if (!(i5 >= 0)) {
            InlineClassHelperKt.n("negative beforeContentPadding");
        }
        if (!(i7 >= 0)) {
            InlineClassHelperKt.n("negative afterContentPadding");
        }
        if (i2 <= 0) {
            int iTy = Constraints.ty(j2);
            int iAz = Constraints.az(j2);
            lazyLayoutItemAnimator.az(0, iTy, iAz, new ArrayList(), lazyGridMeasuredItemProvider.J2(), lazyGridMeasuredItemProvider, z2, z5, i11, z4, 0, 0, vdVar, graphicsContext);
            if (!z5) {
                long jXMQ = lazyLayoutItemAnimator.xMQ();
                if (!IntSize.O(jXMQ, IntSize.INSTANCE.n())) {
                    iTy = ConstraintsKt.Uo(j2, (int) (jXMQ >> 32));
                    iAz = ConstraintsKt.J2(j2, (int) (jXMQ & 4294967295L));
                }
            }
            return new LazyGridMeasureResult(null, 0, false, 0.0f, (MeasureResult) function3.invoke(Integer.valueOf(iTy), Integer.valueOf(iAz), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
                public final void n(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    n(placementScope);
                    return Unit.INSTANCE;
                }
            }), 0.0f, false, vdVar, density, i11, function1, CollectionsKt.emptyList(), -i5, i3 + i7, 0, z3, z2 ? Orientation.f16969n : Orientation.f16970t, i7, i8);
        }
        int iRound = Math.round(f3);
        int i23 = i10 - iRound;
        if (i9 == 0 && i23 < 0) {
            iRound += i23;
            i23 = 0;
        }
        ArrayDeque arrayDeque4 = new ArrayDeque();
        int i24 = -i5;
        int i25 = (i8 < 0 ? i8 : 0) + i24;
        int mainAxisSizeWithSpacings = i23 + i25;
        int i26 = i9;
        while (mainAxisSizeWithSpacings < 0 && i26 > 0) {
            i26--;
            LazyGridMeasuredLine lazyGridMeasuredLineT = lazyGridMeasuredLineProvider.t(i26);
            arrayDeque4.add(0, lazyGridMeasuredLineT);
            mainAxisSizeWithSpacings += lazyGridMeasuredLineT.getMainAxisSizeWithSpacings();
        }
        if (mainAxisSizeWithSpacings < i25) {
            iRound -= i25 - mainAxisSizeWithSpacings;
            mainAxisSizeWithSpacings = i25;
        }
        int i27 = mainAxisSizeWithSpacings - i25;
        int i28 = i3 + i7;
        int i29 = i26;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i28, 0);
        int mainAxisSizeWithSpacings2 = -i27;
        int i30 = i29;
        int i31 = 0;
        boolean z7 = false;
        while (i31 < arrayDeque4.size()) {
            if (mainAxisSizeWithSpacings2 >= iCoerceAtLeast) {
                arrayDeque4.remove(i31);
                z7 = true;
            } else {
                i30++;
                mainAxisSizeWithSpacings2 += ((LazyGridMeasuredLine) arrayDeque4.get(i31)).getMainAxisSizeWithSpacings();
                i31++;
            }
        }
        int mainAxisSizeWithSpacings3 = i27;
        boolean z9 = z7;
        int i32 = i30;
        while (i32 < i2 && (mainAxisSizeWithSpacings2 < iCoerceAtLeast || mainAxisSizeWithSpacings2 <= 0 || arrayDeque4.isEmpty())) {
            int i33 = iCoerceAtLeast;
            LazyGridMeasuredLine lazyGridMeasuredLineT2 = lazyGridMeasuredLineProvider.t(i32);
            if (lazyGridMeasuredLineT2.O()) {
                break;
            }
            mainAxisSizeWithSpacings2 += lazyGridMeasuredLineT2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings2 <= i25) {
                i20 = i25;
                i21 = i32;
                if (((LazyGridMeasuredItem) ArraysKt.last(lazyGridMeasuredLineT2.getItems())).getIndex() != i2 - 1) {
                    i22 = i21 + 1;
                    mainAxisSizeWithSpacings3 -= lazyGridMeasuredLineT2.getMainAxisSizeWithSpacings();
                    z9 = true;
                }
                i29 = i22;
                i25 = i20;
                i32 = i21 + 1;
                iCoerceAtLeast = i33;
            } else {
                i20 = i25;
                i21 = i32;
            }
            arrayDeque4.add(lazyGridMeasuredLineT2);
            i22 = i29;
            i29 = i22;
            i25 = i20;
            i32 = i21 + 1;
            iCoerceAtLeast = i33;
        }
        if (mainAxisSizeWithSpacings2 < i3) {
            int i34 = i3 - mainAxisSizeWithSpacings2;
            mainAxisSizeWithSpacings3 -= i34;
            mainAxisSizeWithSpacings2 += i34;
            int i35 = i29;
            while (mainAxisSizeWithSpacings3 < i5 && i35 > 0) {
                i35--;
                LazyGridMeasuredLine lazyGridMeasuredLineT3 = lazyGridMeasuredLineProvider.t(i35);
                arrayDeque4.add(0, lazyGridMeasuredLineT3);
                mainAxisSizeWithSpacings3 += lazyGridMeasuredLineT3.getMainAxisSizeWithSpacings();
                i34 = i34;
            }
            i12 = iRound + i34;
            if (mainAxisSizeWithSpacings3 < 0) {
                i12 += mainAxisSizeWithSpacings3;
                mainAxisSizeWithSpacings2 += mainAxisSizeWithSpacings3;
                mainAxisSizeWithSpacings3 = 0;
            }
        } else {
            i12 = iRound;
        }
        float f4 = (MathKt.getSign(Math.round(f3)) != MathKt.getSign(i12) || Math.abs(Math.round(f3)) < Math.abs(i12)) ? f3 : i12;
        float f5 = f3 - f4;
        float f6 = 0.0f;
        if (z5 && i12 > iRound && f5 <= 0.0f) {
            f6 = (i12 - iRound) + f5;
        }
        float f7 = f6;
        if (!(mainAxisSizeWithSpacings3 >= 0)) {
            InlineClassHelperKt.n("negative initial offset");
        }
        int i36 = -mainAxisSizeWithSpacings3;
        LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque4.first();
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt.firstOrNull(lazyGridMeasuredLine2.getItems());
        int index = lazyGridMeasuredItem2 != null ? lazyGridMeasuredItem2.getIndex() : 0;
        LazyGridMeasuredLine lazyGridMeasuredLine3 = (LazyGridMeasuredLine) arrayDeque4.lastOrNull();
        int index2 = (lazyGridMeasuredLine3 == null || (items = lazyGridMeasuredLine3.getItems()) == null || (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt.lastOrNull(items)) == null) ? 0 : lazyGridMeasuredItem.getIndex();
        int size = list.size();
        List listEmptyList = null;
        float f8 = f4;
        List listEmptyList2 = null;
        int i37 = 0;
        while (i37 < size) {
            int i38 = size;
            int iIntValue = ((Number) list.get(i37)).intValue();
            if (iIntValue < 0 || iIntValue >= index) {
                i19 = index;
            } else {
                i19 = index;
                int iNr = lazyGridMeasuredLineProvider.nr(iIntValue);
                LazyGridMeasuredItem lazyGridMeasuredItemN = lazyGridMeasuredItemProvider.n(iIntValue, 0, iNr, lazyGridMeasuredLineProvider.n(0, iNr));
                if (listEmptyList2 == null) {
                    listEmptyList2 = new ArrayList();
                }
                List list3 = listEmptyList2;
                list3.add(lazyGridMeasuredItemN);
                listEmptyList2 = list3;
            }
            i37++;
            size = i38;
            index = i19;
        }
        int i39 = index;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        int i40 = index2;
        int i41 = i39;
        List listNr = nr(i40, i2, lazyGridMeasuredLineProvider, z5, arrayDeque4, lazyGridLayoutInfo);
        int i42 = i2;
        LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider3 = lazyGridMeasuredLineProvider;
        int size2 = list.size();
        int i43 = i40;
        int i44 = 0;
        while (i44 < size2) {
            int i45 = i44;
            int iIntValue2 = ((Number) list.get(i44)).intValue();
            int i46 = size2;
            if (i43 + 1 > iIntValue2 || iIntValue2 >= i42) {
                i15 = i43;
                arrayDeque3 = arrayDeque4;
                list2 = listNr;
                i16 = i41;
                i17 = i45;
                i18 = i46;
                lazyGridMeasuredLineProvider2 = lazyGridMeasuredLineProvider3;
                break;
            }
            if (z5) {
                int size3 = listNr.size();
                int i47 = 0;
                while (i47 < size3) {
                    int i48 = i47;
                    LazyGridMeasuredItem[] items2 = ((LazyGridMeasuredLine) listNr.get(i47)).getItems();
                    int i49 = size3;
                    int length = items2.length;
                    int i50 = 0;
                    while (i50 < length) {
                        int i51 = i50;
                        if (items2[i50].getIndex() == iIntValue2) {
                            i15 = i43;
                            arrayDeque3 = arrayDeque4;
                            list2 = listNr;
                            i16 = i41;
                            i17 = i45;
                            i18 = i46;
                            lazyGridMeasuredLineProvider2 = lazyGridMeasuredLineProvider3;
                            break;
                            break;
                        }
                        i50 = i51 + 1;
                    }
                    i47 = i48 + 1;
                    size3 = i49;
                }
            }
            int iNr2 = lazyGridMeasuredLineProvider3.nr(iIntValue2);
            arrayDeque3 = arrayDeque4;
            list2 = listNr;
            i15 = i43;
            i16 = i41;
            i17 = i45;
            lazyGridMeasuredLineProvider2 = lazyGridMeasuredLineProvider;
            i18 = i46;
            LazyGridMeasuredItem lazyGridMeasuredItemN2 = lazyGridMeasuredItemProvider.n(iIntValue2, 0, iNr2, lazyGridMeasuredLineProvider3.n(0, iNr2));
            if (listEmptyList == null) {
                listEmptyList = new ArrayList();
            }
            List list4 = listEmptyList;
            list4.add(lazyGridMeasuredItemN2);
            listEmptyList = list4;
            i44 = i17 + 1;
            i42 = i2;
            lazyGridMeasuredLineProvider3 = lazyGridMeasuredLineProvider2;
            arrayDeque4 = arrayDeque3;
            size2 = i18;
            listNr = list2;
            i41 = i16;
            i43 = i15;
        }
        int i52 = i43;
        ArrayDeque arrayDeque5 = arrayDeque4;
        List list5 = listNr;
        int i53 = i41;
        final LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider4 = lazyGridMeasuredLineProvider3;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list6 = listEmptyList;
        if (i5 > 0 || i8 < 0) {
            int size4 = arrayDeque5.size();
            int i54 = 0;
            ArrayDeque arrayDeque6 = arrayDeque5;
            while (true) {
                arrayDeque = arrayDeque6;
                if (i54 >= size4) {
                    break;
                }
                int mainAxisSizeWithSpacings4 = ((LazyGridMeasuredLine) arrayDeque.get(i54)).getMainAxisSizeWithSpacings();
                if (mainAxisSizeWithSpacings3 == 0 || mainAxisSizeWithSpacings4 > mainAxisSizeWithSpacings3 || i54 == CollectionsKt.getLastIndex(arrayDeque)) {
                    break;
                }
                mainAxisSizeWithSpacings3 -= mainAxisSizeWithSpacings4;
                i54++;
                lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque.get(i54);
                arrayDeque6 = arrayDeque;
            }
            i13 = mainAxisSizeWithSpacings3;
            lazyGridMeasuredLine = lazyGridMeasuredLine2;
            arrayDeque2 = arrayDeque;
        } else {
            arrayDeque2 = arrayDeque5;
            lazyGridMeasuredLine = lazyGridMeasuredLine2;
            i13 = mainAxisSizeWithSpacings3;
        }
        int iQie = z2 ? Constraints.qie(j2) : ConstraintsKt.Uo(j2, mainAxisSizeWithSpacings2);
        int iJ2 = z2 ? ConstraintsKt.J2(j2, mainAxisSizeWithSpacings2) : Constraints.gh(j2);
        List listPlus = arrayDeque2;
        if (!list5.isEmpty()) {
            listPlus = CollectionsKt.plus((Collection) arrayDeque2, (Iterable) list5);
        }
        List list7 = listPlus;
        int i55 = iJ2;
        int i56 = mainAxisSizeWithSpacings2;
        final List listRl = rl(list7, listEmptyList2, list6, iQie, i55, i56, i3, i36, z2, vertical, horizontal, z3, density);
        int i57 = i13;
        lazyLayoutItemAnimator.az((int) f8, iQie, i55, listRl, lazyGridMeasuredItemProvider.J2(), lazyGridMeasuredItemProvider, z2, z5, i11, z4, i57, i56, vdVar, graphicsContext);
        if (!z5) {
            long jXMQ2 = lazyLayoutItemAnimator.xMQ();
            if (IntSize.O(jXMQ2, IntSize.INSTANCE.n())) {
                i14 = i55;
            } else {
                int i58 = z2 ? i55 : iQie;
                iQie = ConstraintsKt.Uo(j2, Math.max(iQie, (int) (jXMQ2 >> 32)));
                int iJ22 = ConstraintsKt.J2(j2, Math.max(i55, (int) (jXMQ2 & 4294967295L)));
                int i59 = z2 ? iJ22 : iQie;
                if (i59 != i58) {
                    int size5 = listRl.size();
                    for (int i60 = 0; i60 < size5; i60++) {
                        ((LazyGridMeasuredItem) listRl.get(i60)).S(i59);
                    }
                }
                i14 = iJ22;
            }
        }
        int i61 = iQie;
        final List listRl2 = LazyLayoutStickyItemsKt.rl(stickyItemsPlacement, listRl, lazyGridMeasuredItemProvider.O(), i5, i7, i61, i14, new Function1<Integer, LazyGridMeasuredItem>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$stickingItems$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ LazyGridMeasuredItem invoke(Integer num) {
                return n(num.intValue());
            }

            public final LazyGridMeasuredItem n(int i62) {
                int iNr3 = lazyGridMeasuredLineProvider4.nr(i62);
                return lazyGridMeasuredItemProvider.n(i62, 0, iNr3, lazyGridMeasuredLineProvider4.n(0, iNr3));
            }
        });
        if (i52 == i2 - 1 && i56 <= i3) {
            z6 = false;
        }
        return new LazyGridMeasureResult(lazyGridMeasuredLine, i57, z6, f8, (MeasureResult) function3.invoke(Integer.valueOf(i61), Integer.valueOf(i14), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                final List list8 = listRl;
                final List list9 = listRl2;
                final boolean z10 = z5;
                placementScope.te(new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$6.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope2) {
                        n(placementScope2);
                        return Unit.INSTANCE;
                    }

                    public final void n(Placeable.PlacementScope placementScope2) {
                        List list10 = list8;
                        boolean z11 = z10;
                        int size6 = list10.size();
                        for (int i62 = 0; i62 < size6; i62++) {
                            ((LazyGridMeasuredItem) list10.get(i62)).Z(placementScope2, z11);
                        }
                        List list11 = list9;
                        boolean z12 = z10;
                        int size7 = list11.size();
                        for (int i63 = 0; i63 < size7; i63++) {
                            ((LazyGridMeasuredItem) list11.get(i63)).Z(placementScope2, z12);
                        }
                    }
                });
                ObservableScopeInvalidator.n(mutableState);
            }
        }), f7, z9, vdVar, density, i11, function1, LazyLayoutMeasuredItemKt.t(i53, i52, listRl, listRl2), i24, i28, i2, z3, z2 ? Orientation.f16969n : Orientation.f16970t, i7, i8);
    }

    private static final void n(List list, Object[] objArr) {
        for (Object obj : objArr) {
            list.add(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[LOOP:1: B:25:0x0070->B:39:0x00a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab A[EDGE_INSN: B:49:0x00ab->B:40:0x00ab BREAK  A[LOOP:1: B:25:0x0070->B:39:0x00a8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List nr(int i2, int i3, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, boolean z2, List list, LazyGridLayoutInfo lazyGridLayoutInfo) {
        LazyGridItemInfo lazyGridItemInfo;
        int index;
        int iMin;
        ArrayList arrayList = null;
        if (z2 && lazyGridLayoutInfo != null && !lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            List visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lazyGridItemInfo = null;
                    break;
                }
                if (((LazyGridItemInfo) visibleItemsInfo.get(size)).getIndex() > i2 && (size == 0 || ((LazyGridItemInfo) visibleItemsInfo.get(size - 1)).getIndex() <= i2)) {
                    break;
                }
            }
            lazyGridItemInfo = (LazyGridItemInfo) visibleItemsInfo.get(size);
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.last(lazyGridLayoutInfo.getVisibleItemsInfo());
            LazyGridMeasuredLine lazyGridMeasuredLine = (LazyGridMeasuredLine) CollectionsKt.lastOrNull(list);
            int index2 = lazyGridMeasuredLine != null ? lazyGridMeasuredLine.getIndex() + 1 : 0;
            if (lazyGridItemInfo != null && (index = lazyGridItemInfo.getIndex()) <= (iMin = Math.min(lazyGridItemInfo2.getIndex(), i3 - 1))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            for (LazyGridMeasuredItem lazyGridMeasuredItem : ((LazyGridMeasuredLine) arrayList.get(i5)).getItems()) {
                                if (lazyGridMeasuredItem.getIndex() == index) {
                                    break;
                                }
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyGridMeasuredLine lazyGridMeasuredLineT = lazyGridMeasuredLineProvider.t(index2);
                        index2++;
                        arrayList.add(lazyGridMeasuredLineT);
                        if (index != iMin) {
                            break;
                        }
                        index++;
                    } else {
                        if (arrayList == null) {
                        }
                        LazyGridMeasuredLine lazyGridMeasuredLineT2 = lazyGridMeasuredLineProvider.t(index2);
                        index2++;
                        arrayList.add(lazyGridMeasuredLineT2);
                        if (index != iMin) {
                        }
                    }
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List rl(List list, List list2, List list3, int i2, int i3, int i5, int i7, int i8, boolean z2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z3, Density density) {
        int i9 = z2 ? i3 : i2;
        boolean z4 = i5 < Math.min(i9, i7);
        if (z4) {
            if (!(i8 == 0)) {
                InlineClassHelperKt.t("non-zero firstLineScrollOffset");
            }
        }
        int size = list.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((LazyGridMeasuredLine) list.get(i10)).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z4) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                InlineClassHelperKt.n("no items");
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i11 = 0; i11 < size2; i11++) {
                iArr[i11] = ((LazyGridMeasuredLine) list.get(t(i11, z3, size2))).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            if (z2) {
                if (vertical == null) {
                    InlineClassHelperKt.rl("null verticalArrangement");
                    throw new KotlinNothingValueException();
                }
                vertical.rl(density, i9, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelperKt.rl("null horizontalArrangement");
                    throw new KotlinNothingValueException();
                }
                horizontal.t(density, i9, iArr, LayoutDirection.f34160n, iArr2);
            }
            IntProgression indices = ArraysKt.getIndices(iArr2);
            if (z3) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int mainAxisSize = iArr2[first];
                    LazyGridMeasuredLine lazyGridMeasuredLine = (LazyGridMeasuredLine) list.get(t(first, z3, size2));
                    if (z3) {
                        mainAxisSize = (i9 - mainAxisSize) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    n(arrayList, lazyGridMeasuredLine.J2(mainAxisSize, i2, i3));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int mainAxisSizeWithSpacings = i8;
                while (true) {
                    int i12 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) list2.get(size3);
                    mainAxisSizeWithSpacings -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.qie(mainAxisSizeWithSpacings, 0, i2, i3);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i12 < 0) {
                        break;
                    }
                    size3 = i12;
                }
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i8;
            for (int i13 = 0; i13 < size4; i13++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) list.get(i13);
                n(arrayList, lazyGridMeasuredLine2.J2(mainAxisSizeWithSpacings2, i2, i3));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i14 = 0; i14 < size5; i14++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) list3.get(i14);
                lazyGridMeasuredItem2.qie(mainAxisSizeWithSpacings2, 0, i2, i3);
                arrayList.add(lazyGridMeasuredItem2);
                mainAxisSizeWithSpacings2 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int t(int i2, boolean z2, int i3) {
        return !z2 ? i2 : (i3 - i2) - 1;
    }
}
