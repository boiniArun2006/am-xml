package androidx.compose.foundation.lazy.staggeredgrid;

import GJW.vd;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a¦\u0001\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010&\u001a\u00020\u001d*\u00020 2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'\u001aM\u00100\u001a\b\u0012\u0004\u0012\u00020*0\u0003*\u00020 2\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(2\u0006\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u00101\u001a\u001b\u00104\u001a\u000203*\u00020\"2\u0006\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0004\b4\u00105\u001a\u001e\u00108\u001a\u00020\u0004*\u00020\"2\u0006\u00107\u001a\u000206H\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a\u001d\u0010;\u001a\u00020\u0004*\u00020\"2\b\b\u0002\u0010:\u001a\u00020\u0004H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010=\u001a\u00020\u0004*\u00020\"H\u0002¢\u0006\u0004\b=\u0010>\u001a#\u0010A\u001a\u000203*\u00020 2\u0006\u0010?\u001a\u00020\"2\u0006\u0010@\u001a\u00020\u0004H\u0002¢\u0006\u0004\bA\u0010B\u001a#\u0010E\u001a\u00020\u0004*\u00020 2\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0004H\u0002¢\u0006\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "LGJW/vd;", "coroutineScope", "isInLookaheadScope", "isLookingAhead", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "approachLayoutInfo", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "gh", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILGJW/vd;ZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;Landroidx/compose/ui/graphics/GraphicsContext;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "initialScrollDelta", "", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "KN", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "", "Lkotlin/collections/ArrayDeque;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "measuredItems", "itemScrollOffsets", "mainAxisLayoutSize", "minOffset", "maxOffset", c.f62177j, "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[IIII)Ljava/util/List;", "delta", "", "qie", "([II)V", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "indexRange", "Uo", "([IJ)I", "minBound", "O", "([II)I", "nr", "([I)I", "indices", "itemCount", "rl", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)V", "item", "lane", "t", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 6 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 7 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1475:1\n63#1,9:1477\n84#1,4:1492\n1139#1:1509\n1140#1,3:1514\n84#1,4:1517\n84#1,4:1521\n84#1,4:1525\n1139#1:1536\n1140#1,3:1541\n84#1,4:1552\n84#1,4:1556\n1139#1:1577\n1140#1,3:1582\n84#1,4:1587\n84#1,4:1593\n84#1,4:1597\n1139#1:1618\n1140#1,3:1623\n84#1,4:1626\n84#1,4:1630\n1197#1,4:1636\n84#1,4:1640\n84#1,4:1644\n84#1,4:1648\n1103#1,3:1652\n1121#1:1655\n1106#1:1660\n1107#1,9:1663\n1122#1:1679\n1117#1:1680\n84#1,4:1681\n1050#1,25:1685\n1075#1,4:1719\n1079#1:1732\n1076#1,9:1733\n1089#1,7:1743\n1103#1,3:1750\n1121#1:1753\n1106#1:1758\n1107#1,9:1770\n1122#1:1794\n1117#1:1795\n84#1,4:1796\n84#1,4:1800\n62#1:1820\n73#1:1821\n1170#1,11:1825\n1139#1:1836\n1140#1,3:1841\n1121#1:1862\n1122#1:1875\n1139#1:1904\n1140#1,3:1909\n26#2:1476\n26#2:1634\n26#2:1635\n54#3:1486\n59#3:1488\n54#3:1804\n59#3:1806\n85#4:1487\n90#4:1489\n80#4:1491\n90#4:1500\n85#4:1502\n90#4:1506\n85#4:1508\n85#4:1511\n90#4:1513\n90#4:1533\n85#4:1535\n85#4:1538\n90#4:1540\n85#4:1545\n90#4:1549\n85#4:1551\n90#4:1568\n85#4:1570\n90#4:1574\n85#4:1576\n85#4:1579\n90#4:1581\n85#4:1586\n90#4:1609\n85#4:1611\n90#4:1615\n85#4:1617\n85#4:1620\n90#4:1622\n85#4:1805\n90#4:1807\n80#4:1819\n85#4:1838\n90#4:1840\n85#4:1901\n90#4:1903\n85#4:1906\n90#4:1908\n30#5:1490\n30#5:1818\n264#6:1496\n261#6:1497\n261#6:1503\n264#6:1529\n261#6:1530\n261#6:1546\n264#6:1564\n261#6:1565\n261#6:1571\n264#6:1605\n261#6:1606\n261#6:1612\n1135#7:1498\n1132#7:1499\n1129#7:1501\n1135#7:1504\n1132#7:1505\n1129#7:1507\n1129#7:1510\n1132#7:1512\n1135#7:1531\n1132#7:1532\n1129#7:1534\n1129#7:1537\n1132#7:1539\n1129#7:1544\n1135#7:1547\n1132#7:1548\n1129#7:1550\n1135#7:1566\n1132#7:1567\n1129#7:1569\n1135#7:1572\n1132#7:1573\n1129#7:1575\n1129#7:1578\n1132#7:1580\n1129#7:1585\n1135#7:1607\n1132#7:1608\n1129#7:1610\n1135#7:1613\n1132#7:1614\n1129#7:1616\n1129#7:1619\n1132#7:1621\n1129#7:1837\n1132#7:1839\n1129#7:1900\n1132#7:1902\n1129#7:1905\n1132#7:1907\n12504#8,2:1560\n12271#8,2:1562\n12504#8,2:1591\n12313#8,2:1601\n12504#8,2:1603\n12271#8,2:1661\n12313#8,2:1768\n12504#8,2:1814\n12313#8,2:1816\n12474#8,2:1823\n52#9,4:1656\n57#9:1672\n34#9,6:1673\n102#9,2:1710\n34#9,6:1712\n104#9:1718\n117#9,2:1723\n34#9,6:1725\n119#9:1731\n52#9,4:1754\n102#9,2:1759\n34#9,6:1761\n104#9:1767\n57#9:1779\n34#9,4:1780\n102#9,2:1784\n34#9,6:1786\n104#9:1792\n39#9:1793\n34#9,6:1808\n102#9,2:1844\n34#9,6:1846\n104#9:1852\n117#9,2:1853\n34#9,6:1855\n119#9:1861\n52#9,6:1863\n34#9,6:1869\n52#9,6:1876\n34#9,6:1882\n52#9,6:1888\n34#9,6:1894\n1#10:1742\n1#10:1822\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n274#1:1477,9\n366#1:1492,4\n409#1:1509\n409#1:1514,3\n421#1:1517,4\n462#1:1521,4\n496#1:1525,4\n521#1:1536\n521#1:1541,3\n545#1:1552,4\n546#1:1556,4\n579#1:1577\n579#1:1582,3\n600#1:1587,4\n621#1:1593,4\n622#1:1597,4\n689#1:1618\n689#1:1623,3\n727#1:1626,4\n728#1:1630,4\n755#1:1636,4\n759#1:1640,4\n782#1:1644,4\n813#1:1648,4\n817#1:1652,3\n817#1:1655\n817#1:1660\n817#1:1663,9\n817#1:1679\n817#1:1680\n845#1:1681,4\n861#1:1685,25\n861#1:1719,4\n861#1:1732\n861#1:1733,9\n861#1:1743,7\n875#1:1750,3\n875#1:1753\n875#1:1758\n875#1:1770,9\n875#1:1794\n875#1:1795\n906#1:1796,4\n918#1:1800,4\n274#1:1820\n274#1:1821\n1010#1:1825,11\n1032#1:1836\n1032#1:1841,3\n1105#1:1862\n1105#1:1875\n1152#1:1904\n1152#1:1909,3\n185#1:1476\n739#1:1634\n740#1:1635\n300#1:1486\n301#1:1488\n942#1:1804\n944#1:1806\n300#1:1487\n301#1:1489\n314#1:1491\n403#1:1500\n403#1:1502\n408#1:1506\n408#1:1508\n409#1:1511\n409#1:1513\n519#1:1533\n519#1:1535\n521#1:1538\n521#1:1540\n529#1:1545\n538#1:1549\n538#1:1551\n569#1:1568\n569#1:1570\n574#1:1574\n574#1:1576\n579#1:1579\n579#1:1581\n591#1:1586\n683#1:1609\n683#1:1611\n688#1:1615\n688#1:1617\n689#1:1620\n689#1:1622\n942#1:1805\n944#1:1807\n986#1:1819\n1032#1:1838\n1032#1:1840\n1139#1:1901\n1139#1:1903\n1152#1:1906\n1152#1:1908\n314#1:1490\n986#1:1818\n403#1:1496\n403#1:1497\n408#1:1503\n519#1:1529\n519#1:1530\n538#1:1546\n569#1:1564\n569#1:1565\n574#1:1571\n683#1:1605\n683#1:1606\n688#1:1612\n403#1:1498\n403#1:1499\n403#1:1501\n408#1:1504\n408#1:1505\n408#1:1507\n409#1:1510\n409#1:1512\n519#1:1531\n519#1:1532\n519#1:1534\n521#1:1537\n521#1:1539\n529#1:1544\n538#1:1547\n538#1:1548\n538#1:1550\n569#1:1566\n569#1:1567\n569#1:1569\n574#1:1572\n574#1:1573\n574#1:1575\n579#1:1578\n579#1:1580\n591#1:1585\n683#1:1607\n683#1:1608\n683#1:1610\n688#1:1613\n688#1:1614\n688#1:1616\n689#1:1619\n689#1:1621\n1032#1:1837\n1032#1:1839\n1139#1:1900\n1139#1:1902\n1152#1:1905\n1152#1:1907\n555#1:1560,2\n557#1:1562,2\n617#1:1591,2\n630#1:1601,2\n637#1:1603,2\n831#1:1661,2\n896#1:1768,2\n956#1:1814,2\n957#1:1816,2\n1008#1:1823,2\n817#1:1656,4\n817#1:1672\n817#1:1673,6\n861#1:1710,2\n861#1:1712,6\n861#1:1718\n861#1:1723,2\n861#1:1725,6\n861#1:1731\n875#1:1754,4\n889#1:1759,2\n889#1:1761,6\n889#1:1767\n875#1:1779\n875#1:1780,4\n889#1:1784,2\n889#1:1786,6\n889#1:1792\n875#1:1793\n947#1:1808,6\n1074#1:1844,2\n1074#1:1846,6\n1074#1:1852\n1078#1:1853,2\n1078#1:1855,6\n1078#1:1861\n1105#1:1863,6\n1105#1:1869,6\n1121#1:1876,6\n1121#1:1882,6\n1121#1:1888,6\n1121#1:1894,6\n861#1:1742\n*E\n"})
public final class LazyStaggeredGridMeasureKt {
    public static final int O(int[] iArr, int i2) {
        int length = iArr.length;
        int i3 = -1;
        int i5 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i2 + 1;
            int i9 = iArr[i7];
            if (i8 <= i9 && i9 < i5) {
                i3 = i7;
                i5 = i9;
            }
        }
        return i3;
    }

    public static final LazyStaggeredGridMeasureResult gh(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, boolean z2, boolean z3, long j3, int i2, int i3, int i5, int i7, vd vdVar, boolean z4, boolean z5, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        int iUo;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j2, z2, lazyLayoutMeasureScope, i2, j3, i5, i7, z3, i3, vdVar, z4, z5, lazyStaggeredGridLayoutInfo, graphicsContext, null);
        int[] iArrU = lazyStaggeredGridState.U(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
        if (iArrU.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().mUb();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i8 = 0;
            while (i8 < laneCount) {
                if (i8 >= iArrU.length || (iUo = iArrU[i8]) == -1) {
                    iUo = i8 == 0 ? 0 : Uo(iArr, SpanRange.n(0, i8)) + 1;
                }
                iArr[i8] = iUo;
                lazyStaggeredGridMeasureContext.getLaneInfo().qie(iArr[i8], i8);
                i8++;
            }
            iArrU = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i9 = 0;
            while (i9 < laneCount2) {
                iArr2[i9] = i9 < scrollOffsets.length ? scrollOffsets[i9] : i9 == 0 ? 0 : iArr2[i9 - 1];
                i9++;
            }
            scrollOffsets = iArr2;
        }
        return KN(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState.wTp(z5)), iArrU, scrollOffsets, true);
    }

    private static final boolean mUb(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i2) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (t(lazyStaggeredGridMeasureContext, iArr[i3], i3) == -1 && iArr2[i3] != iArr2[i2]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i5 = 0; i5 < length2; i5++) {
            if (t(lazyStaggeredGridMeasureContext, iArr[i5], i5) != -1 && iArr2[i5] >= iArr2[i2]) {
                return true;
            }
        }
        int iKN = lazyStaggeredGridMeasureContext.getLaneInfo().KN(0);
        return (iKN == 0 || iKN == -1 || iKN == -2) ? false : true;
    }

    private static final List n(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque[] arrayDequeArr, int[] iArr, int i2, int i3, int i5) {
        int size = 0;
        for (ArrayDeque arrayDeque : arrayDequeArr) {
            size += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (ArrayDeque arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i7 = -1;
                    int i8 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < length; i9++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDequeArr[i9].firstOrNull();
                        int index = lazyStaggeredGridMeasuredItem != null ? lazyStaggeredGridMeasuredItem.getIndex() : Integer.MAX_VALUE;
                        if (i8 > index) {
                            i7 = i9;
                            i8 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDequeArr[i7].removeFirst();
                    if (lazyStaggeredGridMeasuredItem2.getLane() == i7) {
                        long jN = SpanRange.n(lazyStaggeredGridMeasuredItem2.getLane(), lazyStaggeredGridMeasuredItem2.getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_SPAN java.lang.String());
                        int iUo = Uo(iArr, jN);
                        int i10 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i7];
                        if (lazyStaggeredGridMeasuredItem2.getMainAxisSize() + iUo >= i3 && iUo <= i5) {
                            lazyStaggeredGridMeasuredItem2.Z(iUo, i10, i2);
                            arrayList.add(lazyStaggeredGridMeasuredItem2);
                        }
                        int i11 = (int) (jN & 4294967295L);
                        for (int i12 = (int) (jN >> 32); i12 < i11; i12++) {
                            iArr[i12] = lazyStaggeredGridMeasuredItem2.getMainAxisSizeWithSpacings() + iUo;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final int nr(int[] iArr) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < length; i5++) {
            int i7 = iArr[i5];
            if (i3 < i7) {
                i2 = i5;
                i3 = i7;
            }
        }
        return i2;
    }

    private static final void qie(int[] iArr, int i2) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = iArr[i3] + i2;
        }
    }

    private static final void rl(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i2) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = length - 1;
            while (true) {
                if (iArr[length] < i2 && lazyStaggeredGridMeasureContext.getLaneInfo().n(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = t(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.Z(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().qie(iArr[length], length);
            }
            if (i3 < 0) {
                return;
            } else {
                length = i3;
            }
        }
    }

    private static final boolean xMQ(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (iArr2[i2] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i3 > 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ int J2(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = Integer.MIN_VALUE;
        }
        return O(iArr, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f4, code lost:
    
        r4 = J2(r7, 0, 1, null);
        r6 = nr(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ff, code lost:
    
        if (r4 == r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0305, code lost:
    
        if (r7[r4] != r7[r6]) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0307, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0309, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x030a, code lost:
    
        r6 = r28[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x030d, code lost:
    
        if (r6 != (-1)) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030f, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0310, code lost:
    
        r6 = t(r0, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0314, code lost:
    
        if (r6 >= 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0316, code lost:
    
        r8 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0318, code lost:
    
        if (r1 != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x031e, code lost:
    
        if (mUb(r8, r0, r7, r4) == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0321, code lost:
    
        r11 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0324, code lost:
    
        if (r49 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0326, code lost:
    
        r0.getLaneInfo().mUb();
        r1 = r8.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0331, code lost:
    
        if (r3 >= r1) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0333, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x033a, code lost:
    
        r1 = r7.length;
        r3 = new int[r1];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x033e, code lost:
    
        if (r5 >= r1) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0340, code lost:
    
        r3[r5] = r7[r4];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x034e, code lost:
    
        return KN(r0, r29, r2, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x034f, code lost:
    
        r46 = r2;
        r28 = r3;
        r25 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0357, code lost:
    
        r8 = r28;
        r11 = r29;
        r25 = r14;
        r13 = r0.r(r0.getItemProvider(), r6, r4);
        r4 = r0.getLaneInfo();
        r15 = r1;
        r46 = r2;
        r1 = (int) (r13 & 4294967295L);
        r28 = r3;
        r2 = (int) (r13 >> 32);
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0379, code lost:
    
        if (r3 == 1) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x037b, code lost:
    
        r2 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x037d, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x037f, code lost:
    
        r4.qie(r6, r2);
        r2 = r0.getMeasuredItemProvider().O(r6, r13);
        r4 = Uo(r7, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x038f, code lost:
    
        if (r3 == 1) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0391, code lost:
    
        r3 = r0.getLaneInfo().Uo(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x039a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x039b, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x039d, code lost:
    
        if (r14 >= r1) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03a1, code lost:
    
        if (r7[r14] == r4) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03a3, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a4, code lost:
    
        r48[r14].addFirst(r2);
        r8[r14] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03ab, code lost:
    
        if (r3 != null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03ad, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03af, code lost:
    
        r13 = r3[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03b1, code lost:
    
        r7[r14] = (r4 + r2.getMainAxisSizeWithSpacings()) + r13;
        r14 = r14 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0735 A[LOOP:21: B:312:0x067e->B:353:0x0735, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0750 A[EDGE_INSN: B:543:0x0750->B:357:0x0750 BREAK  A[LOOP:21: B:312:0x067e->B:353:0x0735], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x08e4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LazyStaggeredGridMeasureResult KN(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3;
        int iIndexOf;
        int i5;
        int i7;
        int[] iArr3;
        int[] iArr4;
        int i8;
        int i9;
        int[] iArr5;
        int i10;
        int i11;
        int[] iArr6;
        int[] iArr7;
        int i12;
        int[] iArr8;
        boolean z3;
        int i13;
        int i14;
        float f3;
        int i15;
        List listEmptyList;
        int i16;
        int[] iArr9;
        int[] iArr10;
        int i17;
        float f4;
        int mainAxisSizeWithSpacings;
        ArrayList arrayList;
        int size;
        int i18;
        List listEmptyList2;
        int iUo;
        int i19;
        int i20;
        int i21;
        boolean z4;
        boolean z5;
        boolean z6;
        List list;
        boolean z7;
        boolean z9;
        boolean z10;
        int i22;
        int i23;
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        int index;
        int iMin;
        ArrayList arrayList2;
        int i24;
        boolean z11;
        Object obj;
        boolean z12;
        boolean z13;
        int i25;
        int i26;
        int i27;
        int[] iArrUo;
        int i28;
        String str;
        int i29;
        final LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
        LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext2.getMeasureScope();
        int iN = lazyStaggeredGridMeasureContext2.getItemProvider().n();
        if (iN <= 0 || lazyStaggeredGridMeasureContext2.getLaneCount() == 0) {
            int iTy = Constraints.ty(lazyStaggeredGridMeasureContext2.getConstraints());
            int iAz = Constraints.az(lazyStaggeredGridMeasureContext2.getConstraints());
            lazyStaggeredGridMeasureContext2.getState().getItemAnimator().az(0, iTy, iAz, new ArrayList(), lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().J2(), lazyStaggeredGridMeasureContext2.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext2.getIsVertical(), measureScope.Org(), lazyStaggeredGridMeasureContext2.getLaneCount(), lazyStaggeredGridMeasureContext2.getIsInLookaheadScope(), 0, 0, lazyStaggeredGridMeasureContext2.getCoroutineScope(), lazyStaggeredGridMeasureContext2.getGraphicsContext());
            if (!measureScope.Org()) {
                long jXMQ = lazyStaggeredGridMeasureContext2.getState().getItemAnimator().xMQ();
                if (!IntSize.O(jXMQ, IntSize.INSTANCE.n())) {
                    iTy = ConstraintsKt.Uo(lazyStaggeredGridMeasureContext2.getConstraints(), (int) (jXMQ >> 32));
                    iAz = ConstraintsKt.J2(lazyStaggeredGridMeasureContext2.getConstraints(), (int) (jXMQ & 4294967295L));
                }
            }
            return new LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, MeasureScope.ER(measureScope, iTy, iAz, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1
                public final void n(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    n(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null), 0.0f, false, lazyStaggeredGridMeasureContext2.getIsVertical(), false, lazyStaggeredGridMeasureContext2.getResolvedSlots(), lazyStaggeredGridMeasureContext2.getItemProvider().KN(), measureScope, iN, CollectionsKt.emptyList(), IntSize.t((((long) Constraints.ty(lazyStaggeredGridMeasureContext2.getConstraints())) << 32) | (((long) Constraints.az(lazyStaggeredGridMeasureContext2.getConstraints())) & 4294967295L)), -lazyStaggeredGridMeasureContext2.getBeforeContentPadding(), lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext2.getAfterContentPadding(), lazyStaggeredGridMeasureContext2.getBeforeContentPadding(), lazyStaggeredGridMeasureContext2.getAfterContentPadding(), lazyStaggeredGridMeasureContext2.getMainAxisSpacing(), lazyStaggeredGridMeasureContext2.getCoroutineScope(), null);
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        String str2 = "copyOf(...)";
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf2, "copyOf(...)");
        rl(lazyStaggeredGridMeasureContext2, iArrCopyOf, iN);
        qie(iArrCopyOf2, -i2);
        int laneCount = lazyStaggeredGridMeasureContext2.getLaneCount();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[laneCount];
        for (int i30 = 0; i30 < laneCount; i30++) {
            arrayDequeArr[i30] = new ArrayDeque(16);
        }
        qie(iArrCopyOf2, -lazyStaggeredGridMeasureContext2.getBeforeContentPadding());
        boolean z14 = false;
        while (true) {
            if (!xMQ(iArrCopyOf, iArrCopyOf2, lazyStaggeredGridMeasureContext2)) {
                i3 = 0;
                iIndexOf = -1;
                break;
            }
            iIndexOf = nr(iArrCopyOf);
            int i31 = iArrCopyOf[iIndexOf];
            int length = iArrCopyOf2.length;
            for (int i32 = 0; i32 < length; i32++) {
                if (iArrCopyOf[i32] != iArrCopyOf[iIndexOf]) {
                    int i33 = iArrCopyOf2[i32];
                    int i34 = iArrCopyOf2[iIndexOf];
                    if (i33 < i34) {
                        iArrCopyOf2[i32] = i34;
                    }
                }
            }
            i3 = 0;
            int iT = t(lazyStaggeredGridMeasureContext2, i31, iIndexOf);
            if (iT < 0) {
                break;
            }
            long jR = lazyStaggeredGridMeasureContext2.r(lazyStaggeredGridMeasureContext2.getItemProvider(), iT, iIndexOf);
            int i35 = (int) (jR & 4294967295L);
            int i36 = (int) (jR >> 32);
            int i37 = i35 - i36;
            ArrayDeque[] arrayDequeArr2 = arrayDequeArr;
            lazyStaggeredGridMeasureContext2.getLaneInfo().qie(iT, i37 != 1 ? -2 : i36);
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemO = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().O(iT, jR);
            int iUo2 = Uo(iArrCopyOf2, jR);
            int[] iArrUo2 = i37 != 1 ? lazyStaggeredGridMeasureContext2.getLaneInfo().Uo(iT) : null;
            while (i36 < i35) {
                iArrCopyOf[i36] = iT;
                int mainAxisSizeWithSpacings2 = iUo2 + lazyStaggeredGridMeasuredItemO.getMainAxisSizeWithSpacings() + (iArrUo2 == null ? 0 : iArrUo2[i36]);
                iArrCopyOf2[i36] = mainAxisSizeWithSpacings2;
                if (lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize() + mainAxisSizeWithSpacings2 <= 0) {
                    z14 = true;
                }
                i36++;
            }
            arrayDequeArr = arrayDequeArr2;
        }
        ArrayDeque[] arrayDequeArr3 = arrayDequeArr;
        int i38 = -lazyStaggeredGridMeasureContext2.getBeforeContentPadding();
        int i39 = iArrCopyOf2[i3];
        if (i39 < i38) {
            qie(iArrCopyOf2, i38 - i39);
            i5 = i2 - (i38 - i39);
        } else {
            i5 = i2;
        }
        qie(iArrCopyOf2, lazyStaggeredGridMeasureContext2.getBeforeContentPadding());
        int i40 = -1;
        if (iIndexOf == -1) {
            iIndexOf = ArraysKt.indexOf(iArrCopyOf, i3);
        }
        if (iIndexOf != -1 && mUb(iArrCopyOf, lazyStaggeredGridMeasureContext2, iArrCopyOf2, iIndexOf) && z2) {
            lazyStaggeredGridMeasureContext2.getLaneInfo().mUb();
            int length2 = iArrCopyOf.length;
            int[] iArr11 = new int[length2];
            int i41 = 0;
            while (i41 < length2) {
                iArr11[i41] = i40;
                i41++;
                i40 = -1;
            }
            int length3 = iArrCopyOf2.length;
            int[] iArr12 = new int[length3];
            for (int i42 = 0; i42 < length3; i42++) {
                iArr12[i42] = iArrCopyOf2[iIndexOf];
            }
            return KN(lazyStaggeredGridMeasureContext2, i5, iArr11, iArr12, false);
        }
        int[] iArrCopyOf3 = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf3, "copyOf(...)");
        int length4 = iArrCopyOf2.length;
        int[] iArr13 = new int[length4];
        for (int i43 = 0; i43 < length4; i43++) {
            iArr13[i43] = -iArrCopyOf2[i43];
        }
        int mainAxisSpacing = i38 + lazyStaggeredGridMeasureContext2.getMainAxisSpacing();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext2.getAfterContentPadding(), 0);
        boolean z15 = z14;
        int iJ2 = J2(iArrCopyOf3, 0, 1, null);
        int laneCount2 = 0;
        boolean z16 = z15;
        for (int i44 = -1; iJ2 != i44 && laneCount2 < lazyStaggeredGridMeasureContext2.getLaneCount(); i44 = -1) {
            int i45 = iArrCopyOf3[iJ2];
            int iO = O(iArrCopyOf3, i45);
            laneCount2++;
            if (i45 >= 0) {
                long jR2 = lazyStaggeredGridMeasureContext2.r(lazyStaggeredGridMeasureContext2.getItemProvider(), i45, iJ2);
                LazyLayoutMeasureScope lazyLayoutMeasureScope = measureScope;
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemO2 = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().O(i45, jR2);
                LazyStaggeredGridLaneInfo laneInfo = lazyStaggeredGridMeasureContext2.getLaneInfo();
                int i46 = i5;
                int[] iArr14 = iArrCopyOf;
                int i47 = (int) (jR2 & 4294967295L);
                int[] iArr15 = iArrCopyOf2;
                int i48 = (int) (jR2 >> 32);
                int i49 = i47 - i48;
                if (i49 != 1) {
                    i28 = i45;
                    str = str2;
                    i29 = -2;
                } else {
                    i28 = i45;
                    str = str2;
                    i29 = i48;
                }
                laneInfo.qie(i28, i29);
                int iUo3 = Uo(iArr13, jR2);
                for (int i50 = i48; i50 < i47; i50++) {
                    iArr13[i50] = lazyStaggeredGridMeasuredItemO2.getMainAxisSizeWithSpacings() + iUo3;
                    iArrCopyOf3[i50] = i28;
                    arrayDequeArr3[i50].addLast(lazyStaggeredGridMeasuredItemO2);
                }
                if (iUo3 < mainAxisSpacing && iArr13[i48] <= mainAxisSpacing) {
                    lazyStaggeredGridMeasuredItemO2.XQ(false);
                    z16 = true;
                }
                laneCount2 = i49 != 1 ? lazyStaggeredGridMeasureContext2.getLaneCount() : laneCount2;
                iJ2 = iO;
                measureScope = lazyLayoutMeasureScope;
                str2 = str;
                iArrCopyOf = iArr14;
                i5 = i46;
                iArrCopyOf2 = iArr15;
            } else {
                iJ2 = iO;
            }
        }
        String str3 = str2;
        int i51 = i5;
        int[] iArr16 = iArrCopyOf;
        int[] iArr17 = iArrCopyOf2;
        final LazyLayoutMeasureScope lazyLayoutMeasureScope2 = measureScope;
        loop9: while (true) {
            int i52 = 0;
            while (true) {
                if (i52 >= length4) {
                    for (int i53 = 0; i53 < laneCount; i53++) {
                        if (!arrayDequeArr3[i53].isEmpty()) {
                            i7 = 1;
                            break loop9;
                        }
                    }
                } else {
                    int i54 = iArr13[i52];
                    if (i54 < iCoerceAtLeast || i54 <= 0) {
                        break;
                    }
                    i52++;
                }
            }
            i7 = 1;
            int iJ22 = J2(iArr13, 0, 1, null);
            int iMaxOrThrow = ArraysKt.maxOrThrow(iArrCopyOf3) + 1;
            if (iMaxOrThrow >= iN) {
                break;
            }
            ArrayDeque[] arrayDequeArr4 = arrayDequeArr3;
            LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext2;
            String str4 = str3;
            int[] iArr18 = iArr16;
            int i55 = i51;
            int i56 = iCoerceAtLeast;
            int i57 = laneCount;
            int i58 = length4;
            int[] iArr19 = iArr13;
            long jR3 = lazyStaggeredGridMeasureContext3.r(lazyStaggeredGridMeasureContext3.getItemProvider(), iMaxOrThrow, iJ22);
            int i59 = (int) (jR3 & 4294967295L);
            int i60 = (int) (jR3 >> 32);
            int i61 = i59 - i60;
            lazyStaggeredGridMeasureContext3.getLaneInfo().qie(iMaxOrThrow, i61 != 1 ? -2 : i60);
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemO3 = lazyStaggeredGridMeasureContext3.getMeasuredItemProvider().O(iMaxOrThrow, jR3);
            int iUo4 = Uo(iArr19, jR3);
            if (i61 != 1) {
                iArrUo = lazyStaggeredGridMeasureContext3.getLaneInfo().Uo(iMaxOrThrow);
                if (iArrUo == null) {
                    iArrUo = new int[lazyStaggeredGridMeasureContext3.getLaneCount()];
                }
            } else {
                iArrUo = null;
            }
            for (int i62 = i60; i62 < i59; i62++) {
                if (iArrUo != null) {
                    iArrUo[i62] = iUo4 - iArr19[i62];
                }
                iArrCopyOf3[i62] = iMaxOrThrow;
                iArr19[i62] = iUo4 + lazyStaggeredGridMeasuredItemO3.getMainAxisSizeWithSpacings();
                arrayDequeArr4[i62].addLast(lazyStaggeredGridMeasuredItemO3);
            }
            lazyStaggeredGridMeasureContext3.getLaneInfo().gh(iMaxOrThrow, iArrUo);
            if (iUo4 < mainAxisSpacing && iArr19[i60] <= mainAxisSpacing) {
                lazyStaggeredGridMeasuredItemO3.XQ(false);
            }
            arrayDequeArr3 = arrayDequeArr4;
            lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext3;
            iCoerceAtLeast = i56;
            laneCount = i57;
            i51 = i55;
            iArr16 = iArr18;
            str3 = str4;
            iArr13 = iArr19;
            length4 = i58;
        }
        int i63 = 0;
        while (i63 < laneCount) {
            ArrayDeque arrayDeque = arrayDequeArr3[i63];
            while (arrayDeque.size() > i7 && !((LazyStaggeredGridMeasuredItem) arrayDeque.first()).getIsVisible()) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                int[] iArrUo3 = lazyStaggeredGridMeasuredItem.getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_SPAN java.lang.String() != i7 ? lazyStaggeredGridMeasureContext2.getLaneInfo().Uo(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                iArr17[i63] = iArr17[i63] - (lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() + (iArrUo3 == null ? 0 : iArrUo3[i63]));
                i7 = 1;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
            iArr16[i63] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
            i63++;
            i7 = 1;
        }
        int length5 = iArrCopyOf3.length;
        int i64 = 0;
        while (true) {
            if (i64 >= length5) {
                break;
            }
            if (iArrCopyOf3[i64] == iN - 1) {
                qie(iArr13, -lazyStaggeredGridMeasureContext2.getMainAxisSpacing());
                break;
            }
            i64++;
        }
        int i65 = 0;
        while (true) {
            if (i65 >= length4) {
                int mainAxisAvailableSize = lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize() - iArr13[nr(iArr13)];
                iArr3 = iArr17;
                qie(iArr3, -mainAxisAvailableSize);
                qie(iArr13, mainAxisAvailableSize);
                boolean z17 = false;
                loop31: while (true) {
                    int length6 = iArr3.length;
                    int i66 = 0;
                    while (true) {
                        if (i66 >= length6) {
                            iArr4 = iArr16;
                            i8 = i51;
                            i9 = mainAxisAvailableSize;
                            iArr5 = iArr13;
                            i10 = iCoerceAtLeast;
                            break loop31;
                        }
                        if (iArr3[i66] < lazyStaggeredGridMeasureContext2.getBeforeContentPadding()) {
                            break;
                        }
                        i66++;
                        iArr16 = iArr16;
                    }
                    mainAxisAvailableSize = i13;
                    i51 = i12;
                    z17 = z3;
                    iArr13 = iArr8;
                    iCoerceAtLeast = i14;
                    iArr16 = iArr7;
                }
                if (z17 && z2) {
                    lazyStaggeredGridMeasureContext2.getLaneInfo().mUb();
                    return KN(lazyStaggeredGridMeasureContext2, i8, iArr4, iArr3, false);
                }
                i11 = i8 + i9;
                int i67 = iArr3[J2(iArr3, 0, 1, null)];
                if (i67 < 0) {
                    i11 += i67;
                    iArr6 = iArr5;
                    qie(iArr6, i67);
                    qie(iArr3, -i67);
                } else {
                    iArr6 = iArr5;
                }
            } else {
                if (iArr13[i65] >= lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize()) {
                    iArr6 = iArr13;
                    iArr4 = iArr16;
                    i11 = i51;
                    i8 = i11;
                    iArr3 = iArr17;
                    i10 = iCoerceAtLeast;
                    break;
                }
                i65++;
            }
        }
        float fWTp = lazyStaggeredGridMeasureContext2.getState().wTp(lazyLayoutMeasureScope2.Org());
        float f5 = (MathKt.getSign(Math.round(fWTp)) != MathKt.getSign(i11) || Math.abs(Math.round(fWTp)) < Math.abs(i11)) ? fWTp : i11;
        float f6 = fWTp - f5;
        float f7 = 0.0f;
        if (lazyLayoutMeasureScope2.Org() && i11 > i8 && f6 <= 0.0f) {
            f7 = (i11 - i8) + f6;
        }
        float f8 = f7;
        int[] iArrCopyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf4, str3);
        int length7 = iArrCopyOf4.length;
        for (int i68 = 0; i68 < length7; i68++) {
            iArrCopyOf4[i68] = -iArrCopyOf4[i68];
        }
        if (lazyStaggeredGridMeasureContext2.getBeforeContentPadding() > lazyStaggeredGridMeasureContext2.getMainAxisSpacing()) {
            int i69 = 0;
            while (i69 < laneCount) {
                ArrayDeque arrayDeque2 = arrayDequeArr3[i69];
                int size2 = arrayDeque2.size();
                int i70 = 0;
                while (true) {
                    if (i70 >= size2) {
                        i26 = i69;
                        break;
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem) arrayDeque2.get(i70);
                    i26 = i69;
                    int[] iArrUo4 = lazyStaggeredGridMeasureContext2.getLaneInfo().Uo(lazyStaggeredGridMeasuredItem3.getIndex());
                    int mainAxisSizeWithSpacings3 = lazyStaggeredGridMeasuredItem3.getMainAxisSizeWithSpacings() + (iArrUo4 == null ? 0 : iArrUo4[i26]);
                    if (i70 == CollectionsKt.getLastIndex(arrayDeque2) || (i27 = iArr3[i26]) == 0 || i27 < mainAxisSizeWithSpacings3) {
                        break;
                    }
                    iArr3[i26] = i27 - mainAxisSizeWithSpacings3;
                    i70++;
                    iArr4[i26] = ((LazyStaggeredGridMeasuredItem) arrayDeque2.get(i70)).getIndex();
                    i69 = i26;
                }
                i69 = i26 + 1;
            }
        }
        int beforeContentPadding = lazyStaggeredGridMeasureContext2.getBeforeContentPadding() + lazyStaggeredGridMeasureContext2.getAfterContentPadding();
        int iQie = lazyStaggeredGridMeasureContext2.getIsVertical() ? Constraints.qie(lazyStaggeredGridMeasureContext2.getConstraints()) : ConstraintsKt.Uo(lazyStaggeredGridMeasureContext2.getConstraints(), ArraysKt.maxOrThrow(iArr6) + beforeContentPadding);
        int iJ23 = lazyStaggeredGridMeasureContext2.getIsVertical() ? ConstraintsKt.J2(lazyStaggeredGridMeasureContext2.getConstraints(), ArraysKt.maxOrThrow(iArr6) + beforeContentPadding) : Constraints.gh(lazyStaggeredGridMeasureContext2.getConstraints());
        int iMin2 = (Math.min(lazyStaggeredGridMeasureContext2.getIsVertical() ? iJ23 : iQie, lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext2.getBeforeContentPadding()) + lazyStaggeredGridMeasureContext2.getAfterContentPadding();
        int i71 = iArrCopyOf4[0];
        List pinnedItems = lazyStaggeredGridMeasureContext2.getPinnedItems();
        int size3 = pinnedItems.size() - 1;
        if (size3 >= 0) {
            int i72 = size3;
            int mainAxisSizeWithSpacings4 = i71;
            listEmptyList = null;
            while (true) {
                int i73 = i72 - 1;
                int iIntValue = ((Number) pinnedItems.get(i72)).intValue();
                f3 = f5;
                int iKN = lazyStaggeredGridMeasureContext2.getLaneInfo().KN(iIntValue);
                List list2 = listEmptyList;
                if (iKN == -2 || iKN == -1) {
                    for (int i74 = 0; i74 < laneCount; i74++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = (LazyStaggeredGridMeasuredItem) arrayDequeArr3[i74].firstOrNull();
                        if (!((lazyStaggeredGridMeasuredItem4 != null ? lazyStaggeredGridMeasuredItem4.getIndex() : -1) > iIntValue)) {
                            z13 = false;
                            break;
                        }
                    }
                    z13 = true;
                } else {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5 = (LazyStaggeredGridMeasuredItem) arrayDequeArr3[iKN].firstOrNull();
                    if ((lazyStaggeredGridMeasuredItem5 != null ? lazyStaggeredGridMeasuredItem5.getIndex() : -1) <= iIntValue) {
                        z13 = false;
                        break;
                    }
                    z13 = true;
                }
                if (z13) {
                    i25 = laneCount;
                    i15 = beforeContentPadding;
                    long jR4 = lazyStaggeredGridMeasureContext2.r(lazyStaggeredGridMeasureContext2.getItemProvider(), iIntValue, 0);
                    List arrayList3 = list2 == null ? new ArrayList() : list2;
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemO4 = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().O(iIntValue, jR4);
                    mainAxisSizeWithSpacings4 -= lazyStaggeredGridMeasuredItemO4.getMainAxisSizeWithSpacings();
                    lazyStaggeredGridMeasuredItemO4.Z(mainAxisSizeWithSpacings4, 0, iMin2);
                    arrayList3.add(lazyStaggeredGridMeasuredItemO4);
                    listEmptyList = arrayList3;
                } else {
                    i25 = laneCount;
                    i15 = beforeContentPadding;
                    listEmptyList = list2;
                }
                if (i73 < 0) {
                    break;
                }
                f5 = f3;
                i72 = i73;
                laneCount = i25;
                beforeContentPadding = i15;
            }
        } else {
            f3 = f5;
            i15 = beforeContentPadding;
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        float f9 = f3;
        List list3 = listEmptyList;
        int i75 = i10;
        List listN = n(lazyStaggeredGridMeasureContext2, arrayDequeArr3, iArrCopyOf4, iMin2, i38, i75);
        int i76 = iArrCopyOf4[0];
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem6 = (LazyStaggeredGridMeasuredItem) CollectionsKt.lastOrNull(listN);
        int index2 = lazyStaggeredGridMeasuredItem6 != null ? lazyStaggeredGridMeasuredItem6.getIndex() : -1;
        if (lazyLayoutMeasureScope2.Org() && lazyStaggeredGridMeasureContext2.getApproachLayoutInfo() != null && !lazyStaggeredGridMeasureContext2.getApproachLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            List visibleItemsInfo = lazyStaggeredGridMeasureContext2.getApproachLayoutInfo().getVisibleItemsInfo();
            i16 = i76;
            for (int size4 = visibleItemsInfo.size() - 1; -1 < size4; size4--) {
                if (((LazyStaggeredGridItemInfo) visibleItemsInfo.get(size4)).getIndex() > index2 && (size4 == 0 || ((LazyStaggeredGridItemInfo) visibleItemsInfo.get(size4 - 1)).getIndex() <= index2)) {
                    lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) visibleItemsInfo.get(size4);
                    break;
                }
            }
            lazyStaggeredGridItemInfo = null;
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2 = (LazyStaggeredGridItemInfo) CollectionsKt.last(lazyStaggeredGridMeasureContext2.getApproachLayoutInfo().getVisibleItemsInfo());
            if (lazyStaggeredGridItemInfo != null && (index = lazyStaggeredGridItemInfo.getIndex()) <= (iMin = Math.min(lazyStaggeredGridItemInfo2.getIndex(), iN - 1))) {
                mainAxisSizeWithSpacings = i16;
                int i77 = index;
                arrayList = null;
                while (true) {
                    if (arrayList != null) {
                        iArr9 = iArr3;
                        int size5 = arrayList.size();
                        iArr10 = iArr4;
                        int i78 = 0;
                        while (true) {
                            if (i78 >= size5) {
                                arrayList2 = arrayList;
                                z12 = false;
                                break;
                            }
                            arrayList2 = arrayList;
                            if (((LazyStaggeredGridMeasuredItem) arrayList.get(i78)).getIndex() == i77) {
                                z12 = true;
                                break;
                            }
                            i78++;
                            arrayList = arrayList2;
                        }
                        if (z12) {
                            i24 = mainAxisSizeWithSpacings;
                            z11 = true;
                        }
                        if (z11) {
                            ArrayList arrayList4 = arrayList2 == null ? new ArrayList() : arrayList2;
                            List visibleItemsInfo2 = lazyStaggeredGridMeasureContext2.getApproachLayoutInfo().getVisibleItemsInfo();
                            int size6 = visibleItemsInfo2.size();
                            f4 = f8;
                            int i79 = 0;
                            while (true) {
                                if (i79 >= size6) {
                                    obj = null;
                                    break;
                                }
                                obj = visibleItemsInfo2.get(i79);
                                List list4 = visibleItemsInfo2;
                                if (((LazyStaggeredGridItemInfo) obj).getIndex() == i77) {
                                    break;
                                }
                                i79++;
                                visibleItemsInfo2 = list4;
                            }
                            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo3 = (LazyStaggeredGridItemInfo) obj;
                            int lane = lazyStaggeredGridItemInfo3 != null ? lazyStaggeredGridItemInfo3.getLane() : 0;
                            i17 = length4;
                            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemO5 = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().O(i77, lazyStaggeredGridMeasureContext2.r(lazyStaggeredGridMeasureContext2.getItemProvider(), i77, lane));
                            arrayList4.add(lazyStaggeredGridMeasuredItemO5);
                            int[] positions = lazyStaggeredGridMeasureContext2.getResolvedSlots().getPositions();
                            lazyStaggeredGridMeasuredItemO5.Z(i24, positions.length > lane ? positions[lane] : 0, iMin2);
                            mainAxisSizeWithSpacings = i24 + lazyStaggeredGridMeasuredItemO5.getMainAxisSizeWithSpacings();
                            arrayList = arrayList4;
                        } else {
                            i17 = length4;
                            f4 = f8;
                            mainAxisSizeWithSpacings = i24;
                            arrayList = arrayList2;
                        }
                        if (i77 != iMin) {
                            break;
                        }
                        i77++;
                        f8 = f4;
                        iArr3 = iArr9;
                        iArr4 = iArr10;
                        length4 = i17;
                    } else {
                        arrayList2 = arrayList;
                        iArr9 = iArr3;
                        iArr10 = iArr4;
                    }
                    i24 = mainAxisSizeWithSpacings;
                    z11 = false;
                    if (z11) {
                    }
                    if (i77 != iMin) {
                    }
                }
            }
            List pinnedItems2 = lazyStaggeredGridMeasureContext2.getPinnedItems();
            size = pinnedItems2.size();
            int mainAxisSizeWithSpacings5 = mainAxisSizeWithSpacings;
            i18 = 0;
            listEmptyList2 = null;
            while (i18 < size) {
                int iIntValue2 = ((Number) pinnedItems2.get(i18)).intValue();
                if (iIntValue2 >= iN) {
                    list = pinnedItems2;
                } else {
                    if (arrayList != null) {
                        int size7 = arrayList.size();
                        int i80 = 0;
                        while (true) {
                            if (i80 >= size7) {
                                list = pinnedItems2;
                                z10 = false;
                                break;
                            }
                            list = pinnedItems2;
                            if (((LazyStaggeredGridMeasuredItem) arrayList.get(i80)).getIndex() == iIntValue2) {
                                z10 = true;
                                break;
                            }
                            i80++;
                            pinnedItems2 = list;
                        }
                        z7 = z10;
                        if (!z7) {
                            z9 = false;
                            break;
                        }
                        int iKN2 = lazyStaggeredGridMeasureContext2.getLaneInfo().KN(iIntValue2);
                        if (iKN2 == -2 || iKN2 == -1) {
                            for (int i81 : iArrCopyOf3) {
                                if (i81 < iIntValue2) {
                                }
                            }
                            z9 = true;
                        } else {
                            if (iArrCopyOf3[iKN2] >= iIntValue2) {
                                z9 = false;
                                break;
                            }
                            z9 = true;
                        }
                        if (z9) {
                            i22 = size;
                            long jR5 = lazyStaggeredGridMeasureContext2.r(lazyStaggeredGridMeasureContext2.getItemProvider(), iIntValue2, 0);
                            if (listEmptyList2 == null) {
                                listEmptyList2 = new ArrayList();
                            }
                            i23 = i18;
                            List list5 = listEmptyList2;
                            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemO6 = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().O(iIntValue2, jR5);
                            lazyStaggeredGridMeasuredItemO6.Z(mainAxisSizeWithSpacings5, 0, iMin2);
                            mainAxisSizeWithSpacings5 += lazyStaggeredGridMeasuredItemO6.getMainAxisSizeWithSpacings();
                            list5.add(lazyStaggeredGridMeasuredItemO6);
                            listEmptyList2 = list5;
                        } else {
                            i22 = size;
                            i23 = i18;
                        }
                        i18 = i23 + 1;
                        pinnedItems2 = list;
                        size = i22;
                    } else {
                        list = pinnedItems2;
                    }
                    if (!z7) {
                        z9 = false;
                        break;
                    }
                    if (z9) {
                    }
                    i18 = i23 + 1;
                    pinnedItems2 = list;
                    size = i22;
                }
                z9 = false;
                if (z9) {
                }
                i18 = i23 + 1;
                pinnedItems2 = list;
                size = i22;
            }
            if (listEmptyList2 == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            }
            List list6 = listEmptyList2;
            final ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(list3);
            arrayList5.addAll(listN);
            if (arrayList != null) {
                arrayList5.addAll(arrayList);
            }
            arrayList5.addAll(list6);
            lazyStaggeredGridMeasureContext2.getState().getItemAnimator().az((int) f9, iQie, iJ23, arrayList5, lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().J2(), lazyStaggeredGridMeasureContext2.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext2.getIsVertical(), lazyLayoutMeasureScope2.Org(), lazyStaggeredGridMeasureContext2.getLaneCount(), lazyStaggeredGridMeasureContext2.getIsInLookaheadScope(), ArraysKt.minOrThrow(iArr9), ArraysKt.maxOrThrow(iArr6) + i15, lazyStaggeredGridMeasureContext2.getCoroutineScope(), lazyStaggeredGridMeasureContext2.getGraphicsContext());
            if (lazyLayoutMeasureScope2.Org()) {
                long jXMQ2 = lazyStaggeredGridMeasureContext2.getState().getItemAnimator().xMQ();
                if (IntSize.O(jXMQ2, IntSize.INSTANCE.n())) {
                    iUo = iQie;
                    i19 = iJ23;
                } else {
                    int i82 = lazyStaggeredGridMeasureContext2.getIsVertical() ? iJ23 : iQie;
                    iUo = ConstraintsKt.Uo(lazyStaggeredGridMeasureContext2.getConstraints(), Math.max(iQie, (int) (jXMQ2 >> 32)));
                    int iJ24 = ConstraintsKt.J2(lazyStaggeredGridMeasureContext2.getConstraints(), Math.max(iJ23, (int) (jXMQ2 & 4294967295L)));
                    int i83 = lazyStaggeredGridMeasureContext2.getIsVertical() ? iJ24 : iUo;
                    if (i83 != i82) {
                        int size8 = arrayList5.size();
                        for (int i84 = 0; i84 < size8; i84++) {
                            ((LazyStaggeredGridMeasuredItem) arrayList5.get(i84)).S(i83);
                        }
                    }
                    i19 = iJ24;
                }
            }
            i20 = i17;
            i21 = 0;
            while (true) {
                if (i21 < i20) {
                    z4 = false;
                    break;
                }
                if (iArr6[i21] > lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize()) {
                    z4 = true;
                    break;
                }
                i21++;
            }
            if (z4) {
                int length8 = iArrCopyOf3.length;
                int i85 = 0;
                while (true) {
                    if (i85 >= length8) {
                        z6 = true;
                        break;
                    }
                    if (!(iArrCopyOf3[i85] < iN + (-1))) {
                        z6 = false;
                        break;
                    }
                    i85++;
                }
                z5 = z6;
            }
            LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext4 = lazyStaggeredGridMeasureContext2;
            int i86 = iUo;
            return new LazyStaggeredGridMeasureResult(iArr10, iArr9, f9, MeasureScope.ER(lazyLayoutMeasureScope2, i86, i19, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33
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
                    final List list7 = arrayList5;
                    final LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext5 = lazyStaggeredGridMeasureContext2;
                    final LazyLayoutMeasureScope lazyLayoutMeasureScope3 = lazyLayoutMeasureScope2;
                    placementScope.te(new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33.1
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
                            List list8 = list7;
                            LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext6 = lazyStaggeredGridMeasureContext5;
                            LazyLayoutMeasureScope lazyLayoutMeasureScope4 = lazyLayoutMeasureScope3;
                            int size9 = list8.size();
                            for (int i87 = 0; i87 < size9; i87++) {
                                ((LazyStaggeredGridMeasuredItem) list8.get(i87)).o(placementScope2, lazyStaggeredGridMeasureContext6, lazyLayoutMeasureScope4.Org());
                            }
                        }
                    });
                    ObservableScopeInvalidator.n(lazyStaggeredGridMeasureContext2.getState().getPlacementScopeInvalidator());
                }
            }, 4, null), f4, z5, lazyStaggeredGridMeasureContext4.getIsVertical(), z16, lazyStaggeredGridMeasureContext4.getResolvedSlots(), lazyStaggeredGridMeasureContext4.getItemProvider().KN(), lazyLayoutMeasureScope2, iN, listN, IntSize.t((((long) i19) & 4294967295L) | (((long) i86) << 32)), i38, i75, lazyStaggeredGridMeasureContext4.getBeforeContentPadding(), lazyStaggeredGridMeasureContext4.getAfterContentPadding(), lazyStaggeredGridMeasureContext4.getMainAxisSpacing(), lazyStaggeredGridMeasureContext4.getCoroutineScope(), null);
        }
        i16 = i76;
        iArr9 = iArr3;
        iArr10 = iArr4;
        i17 = length4;
        f4 = f8;
        mainAxisSizeWithSpacings = i16;
        arrayList = null;
        List pinnedItems22 = lazyStaggeredGridMeasureContext2.getPinnedItems();
        size = pinnedItems22.size();
        int mainAxisSizeWithSpacings52 = mainAxisSizeWithSpacings;
        i18 = 0;
        listEmptyList2 = null;
        while (i18 < size) {
        }
        if (listEmptyList2 == null) {
        }
        List list62 = listEmptyList2;
        final List arrayList52 = new ArrayList();
        arrayList52.addAll(list3);
        arrayList52.addAll(listN);
        if (arrayList != null) {
        }
        arrayList52.addAll(list62);
        lazyStaggeredGridMeasureContext2.getState().getItemAnimator().az((int) f9, iQie, iJ23, arrayList52, lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().J2(), lazyStaggeredGridMeasureContext2.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext2.getIsVertical(), lazyLayoutMeasureScope2.Org(), lazyStaggeredGridMeasureContext2.getLaneCount(), lazyStaggeredGridMeasureContext2.getIsInLookaheadScope(), ArraysKt.minOrThrow(iArr9), ArraysKt.maxOrThrow(iArr6) + i15, lazyStaggeredGridMeasureContext2.getCoroutineScope(), lazyStaggeredGridMeasureContext2.getGraphicsContext());
        if (lazyLayoutMeasureScope2.Org()) {
        }
        i20 = i17;
        i21 = 0;
        while (true) {
            if (i21 < i20) {
            }
            i21++;
        }
        if (z4) {
        }
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext42 = lazyStaggeredGridMeasureContext2;
        int i862 = iUo;
        return new LazyStaggeredGridMeasureResult(iArr10, iArr9, f9, MeasureScope.ER(lazyLayoutMeasureScope2, i862, i19, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33
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
                final List list7 = arrayList52;
                final LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext5 = lazyStaggeredGridMeasureContext2;
                final LazyLayoutMeasureScope lazyLayoutMeasureScope3 = lazyLayoutMeasureScope2;
                placementScope.te(new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33.1
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
                        List list8 = list7;
                        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext6 = lazyStaggeredGridMeasureContext5;
                        LazyLayoutMeasureScope lazyLayoutMeasureScope4 = lazyLayoutMeasureScope3;
                        int size9 = list8.size();
                        for (int i87 = 0; i87 < size9; i87++) {
                            ((LazyStaggeredGridMeasuredItem) list8.get(i87)).o(placementScope2, lazyStaggeredGridMeasureContext6, lazyLayoutMeasureScope4.Org());
                        }
                    }
                });
                ObservableScopeInvalidator.n(lazyStaggeredGridMeasureContext2.getState().getPlacementScopeInvalidator());
            }
        }, 4, null), f4, z5, lazyStaggeredGridMeasureContext42.getIsVertical(), z16, lazyStaggeredGridMeasureContext42.getResolvedSlots(), lazyStaggeredGridMeasureContext42.getItemProvider().KN(), lazyLayoutMeasureScope2, iN, listN, IntSize.t((((long) i19) & 4294967295L) | (((long) i862) << 32)), i38, i75, lazyStaggeredGridMeasureContext42.getBeforeContentPadding(), lazyStaggeredGridMeasureContext42.getAfterContentPadding(), lazyStaggeredGridMeasureContext42.getMainAxisSpacing(), lazyStaggeredGridMeasureContext42.getCoroutineScope(), null);
    }

    private static final int Uo(int[] iArr, long j2) {
        int i2 = (int) (j2 & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i3 = (int) (j2 >> 32); i3 < i2; i3++) {
            iMax = Math.max(iMax, iArr[i3]);
        }
        return iMax;
    }

    private static final int t(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i2, int i3) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().J2(i2, i3);
    }
}
