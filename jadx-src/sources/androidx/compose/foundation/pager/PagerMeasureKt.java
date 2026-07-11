package androidx.compose.foundation.pager;

import GJW.vd;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u001añ\u0001\u0010)\u001a\u00020(*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2/\u0010'\u001a+\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%\u0012\u0004\u0012\u00020&0!H\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aO\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u00192\u0006\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020-0\"H\u0002¢\u0006\u0004\b/\u00100\u001aG\u00102\u001a\b\u0012\u0004\u0012\u00020-0\u00192\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020-0\"H\u0002¢\u0006\u0004\b2\u00103\u001aO\u00107\u001a\u0004\u0018\u00010-2\u0006\u00104\u001a\u00020\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00020-0\u00192\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b7\u00108\u001aj\u0010=\u001a\u00020-*\u00020\u00002\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a\u0093\u0001\u0010J\u001a\b\u0012\u0004\u0012\u00020-0I*\u00020\u00002\f\u0010?\u001a\b\u0012\u0004\u0012\u00020-0\u00192\f\u0010@\u001a\b\u0012\u0004\u0012\u00020-0\u00192\f\u0010A\u001a\b\u0012\u0004\u0012\u00020-0\u00192\u0006\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u00012\u0006\u0010D\u001a\u00020\u00012\u0006\u0010E\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010H\u001a\u00020G2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\bJ\u0010K\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "", "pageCount", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pagerItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenPages", "currentPage", "currentPageOffset", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "visualPageOffset", "pageAvailableSize", "beyondViewportPageCount", "", "pinnedPages", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "LGJW/vd;", "coroutineScope", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", TtmlNode.TAG_LAYOUT, "Landroidx/compose/foundation/pager/PagerMeasureResult;", "KN", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;LGJW/vd;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "currentLastPage", "pagesCount", "Landroidx/compose/foundation/pager/MeasuredPage;", "getAndMeasure", "O", "(IIILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "currentFirstPage", "J2", "(IILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "viewportSize", "visiblePagesInfo", "itemSize", "rl", "(ILjava/util/List;IIILandroidx/compose/foundation/gestures/snapping/SnapPosition;I)Landroidx/compose/foundation/pager/MeasuredPage;", "index", "childConstraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Uo", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "Landroidx/compose/ui/unit/Density;", "density", "", "t", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/Density;II)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n698#1,4:713\n698#1,4:717\n698#1,4:721\n698#1,4:725\n698#1,4:729\n698#1,4:733\n698#1,4:784\n96#2,5:703\n96#2,5:708\n96#2,5:737\n50#2,5:813\n96#2,5:818\n34#3,6:742\n34#3,6:748\n230#3,3:754\n34#3,6:757\n233#3:763\n230#3,3:764\n34#3,6:767\n233#3:773\n230#3,3:774\n34#3,6:777\n233#3:783\n34#3,6:788\n34#3,6:794\n168#3,13:800\n34#3,6:824\n34#3,6:830\n34#3,6:836\n1#4:823\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n71#1:713,4\n139#1:717,4\n160#1:721,4\n181#1:725,4\n220#1:729,4\n244#1:733,4\n456#1:784,4\n67#1:703,5\n68#1:708,5\n301#1:737,5\n626#1:813,5\n634#1:818,5\n348#1:742,6\n373#1:748,6\n410#1:754,3\n410#1:757,6\n410#1:763\n417#1:764,3\n417#1:767,6\n417#1:773\n421#1:774,3\n421#1:777,6\n421#1:783\n516#1:788,6\n541#1:794,6\n560#1:800,13\n672#1:824,6\n679#1:830,6\n685#1:836,6\n*E\n"})
public final class PagerMeasureKt {
    public static final PagerMeasureResult KN(final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, final PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i3, int i5, int i7, int i8, int i9, int i10, long j2, final Orientation orientation, final Alignment.Vertical vertical, final Alignment.Horizontal horizontal, final boolean z2, final long j3, final int i11, int i12, List list, SnapPosition snapPosition, final MutableState mutableState, vd vdVar, Function3 function3) {
        int i13;
        boolean z3;
        int iMax;
        int i14;
        int i15;
        int i16;
        List arrayList;
        List arrayList2;
        List arrayList3;
        int i17;
        if (!(i5 >= 0)) {
            InlineClassHelperKt.n("negative beforeContentPadding");
        }
        if (!(i7 >= 0)) {
            InlineClassHelperKt.n("negative afterContentPadding");
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i11 + i8, 0);
        if (i2 <= 0) {
            return new PagerMeasureResult(CollectionsKt.emptyList(), i11, i8, i7, orientation, -i5, i3 + i7, false, i12, null, null, 0.0f, 0, false, snapPosition, (MeasureResult) function3.invoke(Integer.valueOf(Constraints.ty(j2)), Integer.valueOf(Constraints.az(j2)), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4
                public final void n(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    n(placementScope);
                    return Unit.INSTANCE;
                }
            }), false, null, null, vdVar, 393216, null);
        }
        Orientation orientation2 = orientation;
        Orientation orientation3 = Orientation.f16969n;
        final long jRl = ConstraintsKt.rl(0, orientation2 == orientation3 ? Constraints.qie(j2) : i11, 0, orientation2 != orientation3 ? Constraints.gh(j2) : i11, 5, null);
        int i18 = i9;
        int i19 = i10;
        while (i18 > 0 && i19 > 0) {
            i18--;
            i19 -= iCoerceAtLeast;
        }
        int i20 = i19 * (-1);
        if (i18 >= i2) {
            i18 = i2 - 1;
            i20 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i21 = -i5;
        int i22 = (i8 < 0 ? i8 : 0) + i21;
        int i23 = i20 + i22;
        int iMax2 = 0;
        while (i23 < 0 && i18 > 0) {
            int i24 = i18 - 1;
            MeasuredPage measuredPageUo = Uo(lazyLayoutMeasureScope, i24, jRl, pagerLazyLayoutItemProvider, j3, orientation2, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z2, i11);
            arrayDeque.add(0, measuredPageUo);
            iMax2 = Math.max(iMax2, measuredPageUo.getCrossAxisSize());
            i23 += iCoerceAtLeast;
            i22 = i22;
            i18 = i24;
            orientation2 = orientation;
        }
        int i25 = i22;
        int i26 = iMax2;
        if (i23 < i25) {
            i23 = i25;
        }
        int i27 = i23 - i25;
        int i28 = i3 + i7;
        int i29 = i18;
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(i28, 0);
        int i30 = -i27;
        int i31 = i29;
        int i32 = 0;
        boolean z4 = false;
        while (i32 < arrayDeque.size()) {
            if (i30 >= iCoerceAtLeast2) {
                arrayDeque.remove(i32);
                z4 = true;
            } else {
                i31++;
                i30 += iCoerceAtLeast;
                i32++;
            }
        }
        int iMax3 = i26;
        int i33 = i31;
        boolean z5 = z4;
        int i34 = i27;
        while (i33 < i2 && (i30 < iCoerceAtLeast2 || i30 <= 0 || arrayDeque.isEmpty())) {
            int i35 = iCoerceAtLeast2;
            int i36 = i33;
            MeasuredPage measuredPageUo2 = Uo(lazyLayoutMeasureScope, i36, jRl, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z2, i11);
            int i37 = i34;
            int i38 = i2 - 1;
            i30 += i36 == i38 ? i11 : iCoerceAtLeast;
            if (i30 > i25 || i36 == i38) {
                iMax3 = Math.max(iMax3, measuredPageUo2.getCrossAxisSize());
                arrayDeque.add(measuredPageUo2);
                i17 = i29;
                i34 = i37;
            } else {
                i17 = i36 + 1;
                i34 = i37 - iCoerceAtLeast;
                z5 = true;
            }
            i33 = i36 + 1;
            i29 = i17;
            iCoerceAtLeast2 = i35;
        }
        int i39 = i34;
        if (i30 < i3) {
            int i40 = i3 - i30;
            i14 = i39 - i40;
            i30 += i40;
            iMax = iMax3;
            i15 = i29;
            while (i14 < i5 && i15 > 0) {
                int i41 = i15 - 1;
                MeasuredPage measuredPageUo3 = Uo(lazyLayoutMeasureScope, i41, jRl, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z2, i11);
                arrayDeque.add(0, measuredPageUo3);
                iMax = Math.max(iMax, measuredPageUo3.getCrossAxisSize());
                i14 += iCoerceAtLeast;
                i33 = i33;
                i15 = i41;
            }
            i13 = i33;
            z3 = false;
            if (i14 < 0) {
                i30 += i14;
                i14 = 0;
            }
        } else {
            i13 = i33;
            z3 = false;
            iMax = iMax3;
            i14 = i39;
            i15 = i29;
        }
        if (!(i14 >= 0 ? true : z3)) {
            InlineClassHelperKt.n("invalid currentFirstPageScrollOffset");
        }
        int i42 = iMax;
        int i43 = -i14;
        MeasuredPage measuredPage = (MeasuredPage) arrayDeque.first();
        if (i5 > 0 || i8 < 0) {
            int size = arrayDeque.size();
            i16 = i43;
            int i44 = 0;
            while (i44 < size && i14 != 0 && iCoerceAtLeast <= i14 && i44 != CollectionsKt.getLastIndex(arrayDeque)) {
                i14 -= iCoerceAtLeast;
                i44++;
                measuredPage = (MeasuredPage) arrayDeque.get(i44);
            }
        } else {
            i16 = i43;
        }
        int i45 = i14;
        MeasuredPage measuredPage2 = measuredPage;
        List listJ2 = J2(i15, i12, list, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return n(num.intValue());
            }

            public final MeasuredPage n(int i46) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.Uo(lazyLayoutMeasureScope2, i46, jRl, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z2, i11);
            }
        });
        int size2 = listJ2.size();
        int iMax4 = i42;
        int i46 = 0;
        while (i46 < size2) {
            iMax4 = Math.max(iMax4, ((MeasuredPage) listJ2.get(i46)).getCrossAxisSize());
            i46++;
            listJ2 = listJ2;
        }
        List list2 = listJ2;
        List listO = O(((MeasuredPage) arrayDeque.last()).getIndex(), i2, i12, list, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return n(num.intValue());
            }

            public final MeasuredPage n(int i47) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.Uo(lazyLayoutMeasureScope2, i47, jRl, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z2, i11);
            }
        });
        int size3 = listO.size();
        for (int i47 = 0; i47 < size3; i47++) {
            iMax4 = Math.max(iMax4, ((MeasuredPage) listO.get(i47)).getCrossAxisSize());
        }
        boolean z6 = Intrinsics.areEqual(measuredPage2, arrayDeque.first()) && list2.isEmpty() && listO.isEmpty();
        Orientation orientation4 = Orientation.f16969n;
        int iUo = ConstraintsKt.Uo(j2, orientation == orientation4 ? iMax4 : i30);
        if (orientation == orientation4) {
            iMax4 = i30;
        }
        int iJ2 = ConstraintsKt.J2(j2, iMax4);
        int i48 = i13;
        int i49 = i30;
        final List listT = t(lazyLayoutMeasureScope, arrayDeque, list2, listO, iUo, iJ2, i49, i3, i16, orientation, z2, lazyLayoutMeasureScope, i8, i11);
        if (z6) {
            arrayList = listT;
        } else {
            arrayList = new ArrayList(listT.size());
            int size4 = listT.size();
            int i50 = 0;
            while (i50 < size4) {
                Object obj = listT.get(i50);
                MeasuredPage measuredPage3 = (MeasuredPage) obj;
                MeasuredPage measuredPage4 = measuredPage2;
                int i51 = i48;
                if (measuredPage3.getIndex() >= ((MeasuredPage) arrayDeque.first()).getIndex() && measuredPage3.getIndex() <= ((MeasuredPage) arrayDeque.last()).getIndex()) {
                    arrayList.add(obj);
                }
                i50++;
                i48 = i51;
                measuredPage2 = measuredPage4;
            }
        }
        MeasuredPage measuredPage5 = measuredPage2;
        int i52 = i48;
        if (list2.isEmpty()) {
            arrayList2 = CollectionsKt.emptyList();
        } else {
            arrayList2 = new ArrayList(listT.size());
            int size5 = listT.size();
            for (int i53 = 0; i53 < size5; i53++) {
                Object obj2 = listT.get(i53);
                if (((MeasuredPage) obj2).getIndex() < ((MeasuredPage) arrayDeque.first()).getIndex()) {
                    arrayList2.add(obj2);
                }
            }
        }
        List list3 = arrayList2;
        if (listO.isEmpty()) {
            arrayList3 = CollectionsKt.emptyList();
        } else {
            arrayList3 = new ArrayList(listT.size());
            int size6 = listT.size();
            for (int i54 = 0; i54 < size6; i54++) {
                Object obj3 = listT.get(i54);
                if (((MeasuredPage) obj3).getIndex() > ((MeasuredPage) arrayDeque.last()).getIndex()) {
                    arrayList3.add(obj3);
                }
            }
        }
        List list4 = arrayList3;
        MeasuredPage measuredPageRl = rl(i3 + i5 + i7, arrayList, i5, i7, iCoerceAtLeast, snapPosition, i2);
        return new PagerMeasureResult(arrayList, i11, i8, i7, orientation, i21, i28, z2, i12, measuredPage5, measuredPageRl, iCoerceAtLeast == 0 ? 0.0f : RangesKt.coerceIn((snapPosition.n(r0, i11, i5, i7, measuredPageRl != null ? measuredPageRl.getIndex() : 0, i2) - (measuredPageRl != null ? measuredPageRl.getOffset() : 0)) / iCoerceAtLeast, -0.5f, 0.5f), i45, i52 < i2 || i49 > i3, snapPosition, (MeasureResult) function3.invoke(Integer.valueOf(iUo), Integer.valueOf(iJ2), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14
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
                final List list5 = listT;
                placementScope.te(new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14.1
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
                        List list6 = list5;
                        int size7 = list6.size();
                        for (int i55 = 0; i55 < size7; i55++) {
                            ((MeasuredPage) list6.get(i55)).KN(placementScope2);
                        }
                    }
                });
                ObservableScopeInvalidator.n(mutableState);
            }
        }), z5, list3, list4, vdVar);
    }

    private static final List O(int i2, int i3, int i5, List list, Function1 function1) {
        int iMin = Math.min(i5 + i2, i3 - 1);
        int i7 = i2 + 1;
        ArrayList arrayList = null;
        if (i7 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i7)));
                if (i7 == iMin) {
                    break;
                }
                i7++;
            }
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            int iIntValue = ((Number) list.get(i8)).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i3) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final int nr(int i2, boolean z2, int i3) {
        return !z2 ? i2 : (i3 - i2) - 1;
    }

    private static final List J2(int i2, int i3, List list, Function1 function1) {
        int iMax = Math.max(0, i2 - i3);
        int i5 = i2 - 1;
        ArrayList arrayList = null;
        if (iMax <= i5) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i5)));
                if (i5 == iMax) {
                    break;
                }
                i5--;
            }
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            int iIntValue = ((Number) list.get(i7)).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List t(LazyLayoutMeasureScope lazyLayoutMeasureScope, List list, List list2, List list3, int i2, int i3, int i5, int i7, int i8, Orientation orientation, boolean z2, Density density, int i9, int i10) {
        int i11 = i8;
        int i12 = i10 + i9;
        int i13 = orientation == Orientation.f16969n ? i3 : i2;
        int i14 = 0;
        boolean z3 = i5 < Math.min(i13, i7);
        if (z3) {
            if (!(i11 == 0)) {
                InlineClassHelperKt.t("non-zero pagesScrollOffset=" + i11);
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                InlineClassHelperKt.n("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i14 < size) {
                iArr[i14] = i10;
                i14++;
            }
            int[] iArr2 = new int[size];
            Arrangement.HorizontalOrVertical horizontalOrVerticalT = Arrangement.Absolute.f17403n.t(lazyLayoutMeasureScope.rV9(i9));
            if (orientation == Orientation.f16969n) {
                horizontalOrVerticalT.rl(density, i13, iArr, iArr2);
            } else {
                horizontalOrVerticalT.t(density, i13, iArr, LayoutDirection.f34160n, iArr2);
            }
            IntProgression indices = ArraysKt.getIndices(iArr2);
            if (z2) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size2 = iArr2[first];
                    MeasuredPage measuredPage = (MeasuredPage) list.get(nr(first, z2, size));
                    if (z2) {
                        size2 = (i13 - size2) - measuredPage.getSize();
                    }
                    measuredPage.xMQ(size2, i2, i3);
                    arrayList.add(measuredPage);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int i15 = i11;
            for (int i16 = 0; i16 < size3; i16++) {
                MeasuredPage measuredPage2 = (MeasuredPage) list2.get(i16);
                i15 -= i12;
                measuredPage2.xMQ(i15, i2, i3);
                arrayList.add(measuredPage2);
            }
            int size4 = list.size();
            for (int i17 = 0; i17 < size4; i17++) {
                MeasuredPage measuredPage3 = (MeasuredPage) list.get(i17);
                measuredPage3.xMQ(i11, i2, i3);
                arrayList.add(measuredPage3);
                i11 += i12;
            }
            int size5 = list3.size();
            while (i14 < size5) {
                MeasuredPage measuredPage4 = (MeasuredPage) list3.get(i14);
                measuredPage4.xMQ(i11, i2, i3);
                arrayList.add(measuredPage4);
                i11 += i12;
                i14++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasuredPage Uo(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j2, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j3, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i3) {
        return new MeasuredPage(i2, i3, lazyLayoutMeasureScope.Jk(i2, j2), j3, pagerLazyLayoutItemProvider.nr(i2), orientation, horizontal, vertical, layoutDirection, z2, null);
    }

    private static final MeasuredPage rl(int i2, List list, int i3, int i5, int i7, SnapPosition snapPosition, int i8) {
        Object obj;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            MeasuredPage measuredPage = (MeasuredPage) obj2;
            float f3 = -Math.abs(SnapPositionKt.n(i2, i3, i5, i7, measuredPage.getOffset(), measuredPage.getIndex(), snapPosition, i8));
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex) {
                int i9 = 1;
                while (true) {
                    Object obj3 = list.get(i9);
                    MeasuredPage measuredPage2 = (MeasuredPage) obj3;
                    float f4 = -Math.abs(SnapPositionKt.n(i2, i3, i5, i7, measuredPage2.getOffset(), measuredPage2.getIndex(), snapPosition, i8));
                    if (Float.compare(f3, f4) < 0) {
                        f3 = f4;
                        obj2 = obj3;
                    }
                    if (i9 == lastIndex) {
                        break;
                    }
                    i9++;
                }
            }
            obj = obj2;
        }
        return (MeasuredPage) obj;
    }
}
