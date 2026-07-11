package androidx.compose.foundation.lazy;

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
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0013\u001a\u009f\u0002\u00101\u001a\u0002002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'2/\u0010/\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0002\b-\u0012\u0004\u0012\u00020.0)H\u0000ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001ac\u00107\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u0018032\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u00105\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b7\u00108\u001a;\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u00109\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001bH\u0002¢\u0006\u0004\b:\u0010;\u001a\u0093\u0001\u0010D\u001a\b\u0012\u0004\u0012\u00020\u0018032\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bD\u0010E\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "itemAnimator", "beyondBoundsItemCount", "", "pinnedItems", "hasLookaheadOccurred", "isLookingAhead", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "approachLayoutInfo", "LGJW/vd;", "coroutineScope", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "stickyItemsPlacement", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", TtmlNode.TAG_LAYOUT, "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "O", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;LGJW/vd;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "", "visibleItems", "consumedScroll", "lastApproachLayoutInfo", "t", "(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IILjava/util/List;FZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)Ljava/util/List;", "currentFirstItemIndex", "nr", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ILjava/util/List;)Ljava/util/List;", "items", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", c.f62177j, "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,678:1\n96#2,5:679\n96#2,5:684\n96#2,5:696\n50#2,5:762\n96#2,5:767\n107#2,7:772\n107#2,7:779\n54#3:689\n59#3:691\n54#3:713\n59#3:715\n85#4:690\n90#4:692\n85#4:714\n90#4:716\n26#5:693\n26#5:694\n26#5:695\n34#6,6:701\n34#6,6:707\n34#6,6:717\n117#6,2:723\n34#6,6:725\n119#6:731\n117#6,2:732\n34#6,6:734\n119#6:740\n117#6,2:741\n34#6,6:743\n119#6:749\n34#6,6:750\n52#6,6:756\n34#6,6:786\n34#6,6:792\n34#6,6:798\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n79#1:679,5\n80#1:684,5\n287#1:696,5\n604#1:762,5\n611#1:767,5\n622#1:772,7\n630#1:779,7\n105#1:689\n106#1:691\n388#1:713\n390#1:715\n105#1:690\n106#1:692\n388#1:714\n390#1:716\n140#1:693\n269#1:694\n270#1:695\n321#1:701,6\n337#1:707,6\n393#1:717,6\n506#1:723,2\n506#1:725,6\n506#1:731\n526#1:732,2\n526#1:734,6\n526#1:740\n527#1:741,2\n527#1:743,6\n527#1:749\n548#1:750,6\n575#1:756,6\n657#1:786,6\n664#1:792,6\n670#1:798,6\n*E\n"})
public final class LazyListMeasureKt {
    /* JADX WARN: Removed duplicated region for block: B:146:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LazyListMeasureResult O(int i2, final LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i3, int i5, int i7, int i8, int i9, int i10, float f3, long j2, boolean z2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z3, Density density, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i11, List list, boolean z4, final boolean z5, LazyListLayoutInfo lazyListLayoutInfo, vd vdVar, final MutableState mutableState, GraphicsContext graphicsContext, StickyItemsPlacement stickyItemsPlacement, Function3 function3) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        int i17;
        int i18;
        int i19;
        int i20;
        Integer numValueOf;
        boolean z6 = true;
        if (!(i5 >= 0)) {
            InlineClassHelperKt.n("invalid beforeContentPadding");
        }
        if (!(i7 >= 0)) {
            InlineClassHelperKt.n("invalid afterContentPadding");
        }
        if (i2 <= 0) {
            int iTy = Constraints.ty(j2);
            int iAz = Constraints.az(j2);
            lazyLayoutItemAnimator.az(0, iTy, iAz, new ArrayList(), lazyListMeasuredItemProvider.KN(), lazyListMeasuredItemProvider, z2, z5, 1, z4, 0, 0, vdVar, graphicsContext);
            if (!z5) {
                long jXMQ = lazyLayoutItemAnimator.xMQ();
                if (!IntSize.O(jXMQ, IntSize.INSTANCE.n())) {
                    iTy = ConstraintsKt.Uo(j2, (int) (jXMQ >> 32));
                    iAz = ConstraintsKt.J2(j2, (int) (jXMQ & 4294967295L));
                }
            }
            return new LazyListMeasureResult(null, 0, false, 0.0f, (MeasureResult) function3.invoke(Integer.valueOf(iTy), Integer.valueOf(iAz), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                public final void n(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    n(placementScope);
                    return Unit.INSTANCE;
                }
            }), 0.0f, false, vdVar, density, lazyListMeasuredItemProvider.getChildConstraints(), CollectionsKt.emptyList(), -i5, i3 + i7, 0, z3, z2 ? Orientation.f16969n : Orientation.f16970t, i7, i8, null);
        }
        int i21 = i2;
        int i22 = i9;
        if (i22 >= i21) {
            i22 = i21 - 1;
            i12 = 0;
        } else {
            i12 = i10;
        }
        int iRound = Math.round(f3);
        int i23 = i12 - iRound;
        if (i22 == 0 && i23 < 0) {
            iRound += i23;
            i23 = 0;
        }
        int i24 = iRound;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i25 = -i5;
        int i26 = (i8 < 0 ? i8 : 0) + i25;
        int mainAxisSizeWithSpacings = i23 + i26;
        int iMax = 0;
        while (mainAxisSizeWithSpacings < 0 && i22 > 0) {
            int i27 = i22 - 1;
            int i28 = i26;
            LazyListMeasuredItem lazyListMeasuredItemO = LazyListMeasuredItemProvider.O(lazyListMeasuredItemProvider, i27, 0L, 2, null);
            arrayDeque.add(0, lazyListMeasuredItemO);
            iMax = Math.max(iMax, lazyListMeasuredItemO.getCrossAxisSize());
            mainAxisSizeWithSpacings = lazyListMeasuredItemO.getMainAxisSizeWithSpacings() + mainAxisSizeWithSpacings;
            i22 = i27;
            i26 = i28;
            i25 = i25;
            i24 = i24;
        }
        int i29 = mainAxisSizeWithSpacings;
        int i30 = i24;
        int i31 = i25;
        int i32 = i26;
        int i33 = iMax;
        if (i29 < i32) {
            i14 = i30 - (i32 - i29);
            i13 = i32;
        } else {
            i13 = i29;
            i14 = i30;
        }
        int i34 = i13 - i32;
        int i35 = i3 + i7;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i35, 0);
        int mainAxisSizeWithSpacings2 = -i34;
        int i36 = i22;
        int i37 = 0;
        boolean z7 = false;
        while (i37 < arrayDeque.size()) {
            if (mainAxisSizeWithSpacings2 >= iCoerceAtLeast) {
                arrayDeque.remove(i37);
                z7 = true;
            } else {
                i36++;
                mainAxisSizeWithSpacings2 += ((LazyListMeasuredItem) arrayDeque.get(i37)).getMainAxisSizeWithSpacings();
                i37++;
            }
        }
        int i38 = i22;
        int i39 = i33;
        int mainAxisSizeWithSpacings3 = i34;
        int i40 = mainAxisSizeWithSpacings2;
        int i41 = i35;
        int i42 = i36;
        while (i42 < i21 && (i40 < iCoerceAtLeast || i40 <= 0 || arrayDeque.isEmpty())) {
            int i43 = i41;
            int i44 = i40;
            int i45 = iCoerceAtLeast;
            int i46 = i39;
            int i47 = i38;
            LazyListMeasuredItem lazyListMeasuredItemO2 = LazyListMeasuredItemProvider.O(lazyListMeasuredItemProvider, i42, 0L, 2, null);
            int i48 = i42;
            int mainAxisSizeWithSpacings4 = lazyListMeasuredItemO2.getMainAxisSizeWithSpacings() + i44;
            if (mainAxisSizeWithSpacings4 > i32 || i48 == i2 - 1) {
                int iMax2 = Math.max(i46, lazyListMeasuredItemO2.getCrossAxisSize());
                arrayDeque.add(lazyListMeasuredItemO2);
                i38 = i47;
                i46 = iMax2;
            } else {
                mainAxisSizeWithSpacings3 -= lazyListMeasuredItemO2.getMainAxisSizeWithSpacings();
                i38 = i48 + 1;
                z7 = true;
            }
            i40 = mainAxisSizeWithSpacings4;
            i41 = i43;
            iCoerceAtLeast = i45;
            i42 = i48 + 1;
            i39 = i46;
            i21 = i2;
        }
        int iMax3 = i39;
        int i49 = i42;
        int i50 = i41;
        int i51 = i38;
        int i52 = i40;
        if (i52 < i3) {
            int i53 = i3 - i52;
            mainAxisSizeWithSpacings3 -= i53;
            i52 += i53;
            i17 = i51;
            while (mainAxisSizeWithSpacings3 < i5 && i17 > 0) {
                i17--;
                LazyListMeasuredItem lazyListMeasuredItemO3 = LazyListMeasuredItemProvider.O(lazyListMeasuredItemProvider, i17, 0L, 2, null);
                arrayDeque.add(0, lazyListMeasuredItemO3);
                iMax3 = Math.max(iMax3, lazyListMeasuredItemO3.getCrossAxisSize());
                mainAxisSizeWithSpacings3 += lazyListMeasuredItemO3.getMainAxisSizeWithSpacings();
                i49 = i49;
            }
            i15 = i49;
            i16 = 0;
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
            i18 = i53 + i14;
            if (mainAxisSizeWithSpacings3 < 0) {
                i18 += mainAxisSizeWithSpacings3;
                i52 += mainAxisSizeWithSpacings3;
                mainAxisSizeWithSpacings3 = 0;
            }
        } else {
            i15 = i49;
            i16 = 0;
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
            i17 = i51;
            i18 = i14;
        }
        float f4 = (MathKt.getSign(Math.round(f3)) != MathKt.getSign(i18) || Math.abs(Math.round(f3)) < Math.abs(i18)) ? f3 : i18;
        float f5 = f3 - f4;
        float f6 = 0.0f;
        if (z5 && i18 > i14 && f5 <= 0.0f) {
            f6 = (i18 - i14) + f5;
        }
        float f7 = f6;
        if ((mainAxisSizeWithSpacings3 >= 0 ? 1 : i16) == 0) {
            InlineClassHelperKt.n("negative currentFirstItemScrollOffset");
        }
        int i54 = -mainAxisSizeWithSpacings3;
        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) arrayDeque.first();
        if (i5 > 0 || i8 < 0) {
            int size = arrayDeque.size();
            while (i16 < size) {
                i19 = i54;
                int mainAxisSizeWithSpacings5 = ((LazyListMeasuredItem) arrayDeque.get(i16)).getMainAxisSizeWithSpacings();
                if (mainAxisSizeWithSpacings3 == 0 || mainAxisSizeWithSpacings5 > mainAxisSizeWithSpacings3 || i16 == CollectionsKt.getLastIndex(arrayDeque)) {
                    break;
                }
                mainAxisSizeWithSpacings3 -= mainAxisSizeWithSpacings5;
                i16++;
                lazyListMeasuredItem = (LazyListMeasuredItem) arrayDeque.get(i16);
                i54 = i19;
            }
            i19 = i54;
        } else {
            i19 = i54;
        }
        int i55 = mainAxisSizeWithSpacings3;
        LazyListMeasuredItem lazyListMeasuredItem2 = lazyListMeasuredItem;
        List listNr = nr(i17, lazyListMeasuredItemProvider2, i11, list);
        int size2 = listNr.size();
        int i56 = 0;
        while (i56 < size2) {
            iMax3 = Math.max(iMax3, ((LazyListMeasuredItem) listNr.get(i56)).getCrossAxisSize());
            i56++;
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
        }
        List listT = t(arrayDeque, lazyListMeasuredItemProvider2, i2, i11, list, f4, z5, lazyListLayoutInfo);
        int size3 = listT.size();
        int iMax4 = iMax3;
        for (int i57 = 0; i57 < size3; i57++) {
            iMax4 = Math.max(iMax4, ((LazyListMeasuredItem) listT.get(i57)).getCrossAxisSize());
        }
        boolean z9 = Intrinsics.areEqual(lazyListMeasuredItem2, arrayDeque.first()) && listNr.isEmpty() && listT.isEmpty();
        int iUo = ConstraintsKt.Uo(j2, z2 ? iMax4 : i52);
        if (z2) {
            iMax4 = i52;
        }
        int iJ2 = ConstraintsKt.J2(j2, iMax4);
        float f8 = f4;
        int i58 = i52;
        final List listN = n(arrayDeque, listNr, listT, iUo, iJ2, i58, i3, i19, z2, vertical, horizontal, z3, density);
        int iUo2 = iUo;
        lazyLayoutItemAnimator.az((int) f8, iUo2, iJ2, listN, lazyListMeasuredItemProvider.KN(), lazyListMeasuredItemProvider, z2, z5, 1, z4, i55, i58, vdVar, graphicsContext);
        if (!z5) {
            long jXMQ2 = lazyLayoutItemAnimator.xMQ();
            if (IntSize.O(jXMQ2, IntSize.INSTANCE.n())) {
                i20 = iJ2;
            } else {
                int i59 = z2 ? iJ2 : iUo2;
                iUo2 = ConstraintsKt.Uo(j2, Math.max(iUo2, (int) (jXMQ2 >> 32)));
                int iJ22 = ConstraintsKt.J2(j2, Math.max(iJ2, (int) (jXMQ2 & 4294967295L)));
                int i60 = z2 ? iJ22 : iUo2;
                if (i60 != i59) {
                    int size4 = listN.size();
                    for (int i61 = 0; i61 < size4; i61++) {
                        ((LazyListMeasuredItem) listN.get(i61)).o(i60);
                    }
                }
                i20 = iJ22;
            }
        }
        int i62 = iUo2;
        final List listRl = LazyLayoutStickyItemsKt.rl(stickyItemsPlacement, listN, lazyListMeasuredItemProvider.Uo(), i5, i7, i62, i20, new Function1<Integer, LazyListMeasuredItem>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ LazyListMeasuredItem invoke(Integer num) {
                return n(num.intValue());
            }

            public final LazyListMeasuredItem n(int i63) {
                return LazyListMeasuredItemProvider.O(lazyListMeasuredItemProvider, i63, 0L, 2, null);
            }
        });
        Integer numValueOf2 = null;
        if (z9) {
            LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) CollectionsKt.firstOrNull(listN);
            numValueOf = lazyListMeasuredItem3 != null ? Integer.valueOf(lazyListMeasuredItem3.getIndex()) : null;
        } else {
            LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) arrayDeque.firstOrNull();
            if (lazyListMeasuredItem4 != null) {
                numValueOf = Integer.valueOf(lazyListMeasuredItem4.getIndex());
            }
        }
        if (z9) {
            LazyListMeasuredItem lazyListMeasuredItem5 = (LazyListMeasuredItem) CollectionsKt.lastOrNull(listN);
            if (lazyListMeasuredItem5 != null) {
                numValueOf2 = Integer.valueOf(lazyListMeasuredItem5.getIndex());
            }
        } else {
            LazyListMeasuredItem lazyListMeasuredItem6 = (LazyListMeasuredItem) arrayDeque.lastOrNull();
            if (lazyListMeasuredItem6 != null) {
                numValueOf2 = Integer.valueOf(lazyListMeasuredItem6.getIndex());
            }
        }
        if (i15 >= i2 && i58 <= i3) {
            z6 = false;
        }
        return new LazyListMeasureResult(lazyListMeasuredItem2, i55, z6, f8, (MeasureResult) function3.invoke(Integer.valueOf(i62), Integer.valueOf(i20), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
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
                final List list2 = listN;
                final List list3 = listRl;
                final boolean z10 = z5;
                placementScope.te(new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
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
                        List list4 = list2;
                        boolean z11 = z10;
                        int size5 = list4.size();
                        for (int i63 = 0; i63 < size5; i63++) {
                            ((LazyListMeasuredItem) list4.get(i63)).Ik(placementScope2, z11);
                        }
                        List list5 = list3;
                        boolean z12 = z10;
                        int size6 = list5.size();
                        for (int i64 = 0; i64 < size6; i64++) {
                            ((LazyListMeasuredItem) list5.get(i64)).Ik(placementScope2, z12);
                        }
                    }
                });
                ObservableScopeInvalidator.n(mutableState);
            }
        }), f7, z7, vdVar, density, lazyListMeasuredItemProvider.getChildConstraints(), LazyLayoutMeasuredItemKt.t(numValueOf != null ? numValueOf.intValue() : 0, numValueOf2 != null ? numValueOf2.intValue() : 0, listN, listRl), i31, i50, i2, z3, z2 ? Orientation.f16969n : Orientation.f16970t, i7, i8, null);
    }

    private static final List n(List list, List list2, List list3, int i2, int i3, int i5, int i7, int i8, boolean z2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z3, Density density) {
        int i9 = z2 ? i3 : i2;
        int i10 = 0;
        boolean z4 = i5 < Math.min(i9, i7);
        if (z4) {
            if (!(i8 == 0)) {
                InlineClassHelperKt.t("non-zero itemsScrollOffset");
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z4) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                InlineClassHelperKt.n("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i10 < size) {
                iArr[i10] = ((LazyListMeasuredItem) list.get(rl(i10, z3, size))).getSize();
                i10++;
            }
            int[] iArr2 = new int[size];
            if (z2) {
                if (vertical == null) {
                    InlineClassHelperKt.rl("null verticalArrangement when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                vertical.rl(density, i9, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelperKt.rl("null horizontalArrangement when isVertical == false");
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
                    int size2 = iArr2[first];
                    LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) list.get(rl(first, z3, size));
                    if (z3) {
                        size2 = (i9 - size2) - lazyListMeasuredItem.getSize();
                    }
                    lazyListMeasuredItem.r(size2, i2, i3);
                    arrayList.add(lazyListMeasuredItem);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int mainAxisSizeWithSpacings = i8;
            for (int i11 = 0; i11 < size3; i11++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) list2.get(i11);
                mainAxisSizeWithSpacings -= lazyListMeasuredItem2.getMainAxisSizeWithSpacings();
                lazyListMeasuredItem2.r(mainAxisSizeWithSpacings, i2, i3);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i8;
            for (int i12 = 0; i12 < size4; i12++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) list.get(i12);
                lazyListMeasuredItem3.r(mainAxisSizeWithSpacings2, i2, i3);
                arrayList.add(lazyListMeasuredItem3);
                mainAxisSizeWithSpacings2 += lazyListMeasuredItem3.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            while (i10 < size5) {
                LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) list3.get(i10);
                lazyListMeasuredItem4.r(mainAxisSizeWithSpacings2, i2, i3);
                arrayList.add(lazyListMeasuredItem4);
                mainAxisSizeWithSpacings2 += lazyListMeasuredItem4.getMainAxisSizeWithSpacings();
                i10++;
            }
        }
        return arrayList;
    }

    private static final List nr(int i2, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i3, List list) {
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        int iMax = Math.max(0, i2 - i3);
        int i5 = i2 - 1;
        ArrayList arrayList = null;
        if (iMax <= i5) {
            int i7 = i5;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
                arrayList.add(LazyListMeasuredItemProvider.O(lazyListMeasuredItemProvider2, i7, 0L, 2, null));
                if (i7 == iMax) {
                    break;
                }
                i7--;
                lazyListMeasuredItemProvider = lazyListMeasuredItemProvider2;
            }
        } else {
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i8 = size - 1;
                int iIntValue = ((Number) list.get(size)).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(LazyListMeasuredItemProvider.O(lazyListMeasuredItemProvider2, iIntValue, 0L, 2, null));
                }
                if (i8 < 0) {
                    break;
                }
                size = i8;
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final int rl(int i2, boolean z2, int i3) {
        return !z2 ? i2 : (i3 - i2) - 1;
    }

    private static final List t(List list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, int i3, List list2, float f3, boolean z2, LazyListLayoutInfo lazyListLayoutInfo) {
        ArrayList arrayList;
        LazyListItemInfo lazyListItemInfo;
        LazyListMeasuredItem lazyListMeasuredItem;
        Object obj;
        int mainAxisSizeWithSpacings;
        Object obj2;
        int index;
        int iMin;
        LazyListMeasuredItem lazyListMeasuredItem2;
        Object obj3;
        int i5 = i2 - 1;
        int iMin2 = Math.min(((LazyListMeasuredItem) CollectionsKt.last(list)).getIndex() + i3, i5);
        int index2 = ((LazyListMeasuredItem) CollectionsKt.last(list)).getIndex() + 1;
        if (index2 <= iMin2) {
            int i7 = index2;
            arrayList = null;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.O(lazyListMeasuredItemProvider, i7, 0L, 2, null));
                if (i7 == iMin2) {
                    break;
                }
                i7++;
            }
        } else {
            arrayList = null;
        }
        if (z2 && lazyListLayoutInfo != null && !lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            List visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lazyListItemInfo = null;
                    break;
                }
                if (((LazyListItemInfo) visibleItemsInfo.get(size)).getIndex() > iMin2 && (size == 0 || ((LazyListItemInfo) visibleItemsInfo.get(size - 1)).getIndex() <= iMin2)) {
                    break;
                }
            }
            lazyListItemInfo = (LazyListItemInfo) visibleItemsInfo.get(size);
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt.last(lazyListLayoutInfo.getVisibleItemsInfo());
            if (lazyListItemInfo != null && (index = lazyListItemInfo.getIndex()) <= (iMin = Math.min(lazyListItemInfo2.getIndex(), i5))) {
                int i8 = index;
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size2) {
                                obj3 = null;
                                break;
                            }
                            obj3 = arrayList.get(i9);
                            if (((LazyListMeasuredItem) obj3).getIndex() == i8) {
                                break;
                            }
                            i9++;
                        }
                        lazyListMeasuredItem2 = (LazyListMeasuredItem) obj3;
                    } else {
                        lazyListMeasuredItem2 = null;
                    }
                    if (lazyListMeasuredItem2 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.O(lazyListMeasuredItemProvider, i8, 0L, 2, null));
                    }
                    if (i8 == iMin) {
                        break;
                    }
                    i8++;
                }
            }
            float viewportEndOffset = ((lazyListLayoutInfo.getViewportEndOffset() - lazyListItemInfo2.getOffset()) - lazyListItemInfo2.getSize()) - f3;
            if (viewportEndOffset > 0.0f) {
                int index3 = lazyListItemInfo2.getIndex() + 1;
                int i10 = 0;
                while (index3 < i2 && i10 < viewportEndOffset) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size3) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i11);
                            if (((LazyListMeasuredItem) obj2).getIndex() == index3) {
                                break;
                            }
                            i11++;
                        }
                        lazyListMeasuredItem = (LazyListMeasuredItem) obj2;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size4) {
                                obj = null;
                                break;
                            }
                            obj = arrayList.get(i12);
                            if (((LazyListMeasuredItem) obj).getIndex() == index3) {
                                break;
                            }
                            i12++;
                        }
                        lazyListMeasuredItem = (LazyListMeasuredItem) obj;
                    } else {
                        lazyListMeasuredItem = null;
                    }
                    if (lazyListMeasuredItem != null) {
                        index3++;
                        mainAxisSizeWithSpacings = lazyListMeasuredItem.getMainAxisSizeWithSpacings();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.O(lazyListMeasuredItemProvider, index3, 0L, 2, null));
                        index3++;
                        mainAxisSizeWithSpacings = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getMainAxisSizeWithSpacings();
                    }
                    i10 += mainAxisSizeWithSpacings;
                }
            }
        }
        if (arrayList != null && ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex() > iMin2) {
            iMin2 = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i13 = 0; i13 < size5; i13++) {
            int iIntValue = ((Number) list2.get(i13)).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.O(lazyListMeasuredItemProvider, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }
}
