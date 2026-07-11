package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001as\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001ai\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001as\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u001a2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001ai\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a?\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%\u001a?\u0010&\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b&\u0010'\u001a]\u00102\u001a\u0002012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020!H\u0002¢\u0006\u0004\b2\u00103\u001a\\\u0010@\u001a\u00020?*\u0002042\u0006\u00106\u001a\u0002052\f\u00109\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u0010>\u001a\u00020=2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020!H\u0000ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a%\u0010D\u001a\u0004\u0018\u000108*\b\u0012\u0004\u0012\u000208072\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bD\u0010E\u001a#\u0010I\u001a\u00020\b*\u00020)2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\bH\u0000¢\u0006\u0004\bI\u0010J\u001a#\u0010L\u001a\u00020\b*\u00020)2\u0006\u0010G\u001a\u00020F2\u0006\u0010K\u001a\u00020\bH\u0000¢\u0006\u0004\bL\u0010J\u001a<\u0010P\u001a\u000201*\u0002082\u0006\u00106\u001a\u0002052\u0006\u0010>\u001a\u00020M2\u0014\u0010O\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010N\u0012\u0004\u0012\u00020\u000f0\rH\u0000ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001aT\u0010X\u001a\u00020?*\u0002042\u0006\u0010>\u001a\u00020=2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b2\u0006\u0010-\u001a\u00020+2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020?0T2\u0006\u0010V\u001a\u0002052\u0006\u0010W\u001a\u00020+H\u0000ø\u0001\u0000¢\u0006\u0004\bX\u0010Y\"\u001a\u0010^\u001a\u00020Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010[\u001a\u0004\b\\\u0010]\"\u001a\u0010`\u001a\u00020Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010[\u001a\u0004\b_\u0010]\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006a"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "itemVerticalAlignment", "", "maxItemsInEachRow", "maxLines", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "overflow", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowRowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "nr", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Alignment$Horizontal;", "itemHorizontalAlignment", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "Landroidx/compose/foundation/layout/FlowColumnScope;", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowState", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "az", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Uo", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "children", "", "mainAxisSizes", "crossAxisSizes", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "Landroidx/collection/IntIntPair;", "xMQ", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurePolicy", "", "Landroidx/compose/ui/layout/Measurable;", "measurablesIterator", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacingDp", "crossAxisSpacingDp", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "J2", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "ty", "(Ljava/util/Iterator;Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;", "", "isHorizontal", "crossAxisSize", "mUb", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I", "mainAxisSize", "KN", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/Placeable;", "storePlaceable", "gh", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J", "mainAxisTotalSize", "crossAxisTotalSize", "Landroidx/compose/runtime/collection/MutableVector;", "items", "measureHelper", "outPosition", "qie", "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCROSS_AXIS_ALIGNMENT_TOP", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "getCROSS_AXIS_ALIGNMENT_START", "CROSS_AXIS_ALIGNMENT_START", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 10 IntList.kt\nandroidx/collection/IntListKt\n+ 11 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 12 IntList.kt\nandroidx/collection/IntList\n+ 13 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1594:1\n1107#1,115:1734\n1247#2,6:1595\n1247#2,6:1601\n1247#2,6:1612\n1247#2,6:1649\n1247#2,6:1655\n1247#2,6:1666\n1247#2,6:1703\n1247#2,6:1709\n1247#2,6:1715\n1247#2,6:1721\n165#3,5:1607\n79#3,6:1618\n86#3,3:1633\n89#3,2:1642\n93#3:1647\n171#3:1648\n165#3,5:1661\n79#3,6:1672\n86#3,3:1687\n89#3,2:1696\n93#3:1701\n171#3:1702\n347#4,9:1624\n356#4,3:1644\n347#4,9:1678\n356#4,3:1698\n4206#5,6:1636\n4206#5,6:1690\n70#6,6:1727\n1#7:1733\n1101#8:1849\n1083#8,2:1850\n213#9:1852\n210#9:1853\n219#9:1854\n216#9:1867\n213#9:1868\n216#9,4:1871\n216#9,4:1885\n210#9,4:1899\n905#10:1855\n905#10:1856\n105#11:1857\n105#11:1858\n101#11,10:1875\n101#11,10:1889\n101#11,10:1903\n70#12:1859\n65#12:1860\n65#12:1861\n65#12:1862\n251#12,4:1863\n256#12:1869\n516#13:1870\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n1079#1:1734,115\n100#1:1595,6\n111#1:1601,6\n118#1:1612,6\n214#1:1649,6\n225#1:1655,6\n231#1:1666,6\n451#1:1703,6\n486#1:1709,6\n516#1:1715,6\n548#1:1721,6\n118#1:1607,5\n118#1:1618,6\n118#1:1633,3\n118#1:1642,2\n118#1:1647\n118#1:1648\n231#1:1661,5\n231#1:1672,6\n231#1:1687,3\n231#1:1696,2\n231#1:1701\n231#1:1702\n118#1:1624,9\n118#1:1644,3\n231#1:1678,9\n231#1:1698,3\n118#1:1636,6\n231#1:1690,6\n957#1:1727,6\n1239#1:1849\n1239#1:1850,2\n1240#1:1852\n1241#1:1853\n1242#1:1854\n1444#1:1867\n1445#1:1868\n1564#1:1871,4\n1572#1:1885,4\n1578#1:1899,4\n1287#1:1855\n1288#1:1856\n1350#1:1857\n1360#1:1858\n1564#1:1875,10\n1572#1:1889,10\n1578#1:1903,10\n1421#1:1859\n1423#1:1860\n1434#1:1861\n1435#1:1862\n1439#1:1863,4\n1439#1:1869\n1471#1:1870\n*E\n"})
public final class FlowLayoutKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final CrossAxisAlignment f17575n;
    private static final CrossAxisAlignment rl;

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        f17575n = companion.t(companion2.qie());
        rl = companion.rl(companion2.gh());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.layout.Placeable[]] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r8v16, types: [androidx.compose.ui.layout.Placeable[]] */
    public static final MeasureResult J2(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator it, float f3, float f4, long j2, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i5;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfoN;
        MutableIntObjectMap mutableIntObjectMap;
        int i7;
        int i8;
        MeasureScope measureScope2;
        FlowLineMeasurePolicy flowLineMeasurePolicy2;
        int[] iArr;
        int[] iArr2;
        long j3;
        int rl2;
        int f32234n;
        int i9;
        MutableIntObjectMap mutableIntObjectMap2;
        IntIntPair intIntPairN;
        MutableIntList mutableIntList;
        MutableIntList mutableIntList2;
        int i10;
        int i11;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        int i12;
        int i13;
        int i14;
        MeasureScope measureScope3 = measureScope;
        FlowLineMeasurePolicy flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        Iterator it2 = it;
        MutableVector mutableVector = new MutableVector(new MeasureResult[16], 0);
        int iQie = Constraints.qie(j2);
        int iTy = Constraints.ty(j2);
        int iGh = Constraints.gh(j2);
        MutableIntObjectMap mutableIntObjectMapT = IntObjectMapKt.t();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(measureScope3.l(f3));
        int iCeil2 = (int) Math.ceil(measureScope3.l(f4));
        long jN = OrientationIndependentConstraints.n(0, iQie, 0, iGh);
        long jKN = OrientationIndependentConstraints.KN(OrientationIndependentConstraints.O(jN, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy3.getIsHorizontal() ? LayoutOrientation.f17704n : LayoutOrientation.f17705t);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        FlowLineInfo flowLineInfo = it2 instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope3.rV9(iQie), measureScope3.rV9(iGh), null) : null;
        Measurable measurableTy = !it2.hasNext() ? null : ty(it2, flowLineInfo);
        IntIntPair intIntPairN2 = measurableTy != null ? IntIntPair.n(gh(measurableTy, flowLineMeasurePolicy3, jKN, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                n(placeable);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void n(Placeable placeable) {
                objectRef.element = placeable;
            }
        })) : null;
        Integer numValueOf = intIntPairN2 != null ? Integer.valueOf(IntIntPair.O(intIntPairN2.getPackedValue())) : null;
        Integer numValueOf2 = intIntPairN2 != null ? Integer.valueOf(IntIntPair.J2(intIntPairN2.getPackedValue())) : null;
        Integer num = numValueOf;
        Measurable measurable = measurableTy;
        MutableIntList mutableIntList3 = new MutableIntList(0, 1, null);
        MutableIntList mutableIntList4 = new MutableIntList(0, 1, null);
        FlowLineInfo flowLineInfo2 = flowLineInfo;
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i2, flowLayoutOverflowState, j2, i3, iCeil, iCeil2, null);
        int i15 = iCeil;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfoRl = flowLayoutBuildingBlocks.rl(it2.hasNext(), 0, IntIntPair.rl(iQie, iGh), intIntPairN2, 0, 0, 0, false, false);
        if (wrapInfoRl.getIsLastItemInContainer()) {
            wrapEllipsisInfoN = flowLayoutBuildingBlocks.n(wrapInfoRl, intIntPairN2 != null, -1, 0, iQie, 0);
            i5 = iQie;
        } else {
            i5 = iQie;
            wrapEllipsisInfoN = null;
        }
        Integer numValueOf3 = num;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2 = wrapEllipsisInfoN;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo = wrapInfoRl;
        int i19 = 0;
        int i20 = iTy;
        MutableIntList mutableIntList5 = mutableIntList3;
        int i21 = iGh;
        int i22 = 0;
        int i23 = 0;
        int i24 = i5;
        Measurable measurableTy2 = measurable;
        while (!wrapInfo.getIsLastItemInContainer() && measurableTy2 != null) {
            Intrinsics.checkNotNull(numValueOf3);
            int iIntValue = numValueOf3.intValue();
            Intrinsics.checkNotNull(numValueOf2);
            MutableIntList mutableIntList6 = mutableIntList4;
            int i25 = i5;
            int i26 = i17 + iIntValue;
            int iMax = Math.max(i16, numValueOf2.intValue());
            int i27 = i24 - iIntValue;
            int i28 = i22 + 1;
            int i29 = i20;
            flowLayoutOverflowState.ty(i28);
            arrayList.add(measurableTy2);
            mutableIntObjectMapT.r(i22, objectRef.element);
            int i30 = i28 - i23;
            boolean z2 = i30 < i2;
            if (flowLineInfo2 != null) {
                if (z2) {
                    i9 = i30;
                    i12 = i19;
                } else {
                    i9 = i30;
                    i12 = i19 + 1;
                }
                int i31 = z2 ? i9 : 0;
                if (z2) {
                    int i32 = i27 - i15;
                    i13 = i32 < 0 ? 0 : i32;
                } else {
                    i13 = i25;
                }
                float fRV9 = measureScope3.rV9(i13);
                if (z2) {
                    mutableIntObjectMap2 = mutableIntObjectMapT;
                    i14 = i21;
                } else {
                    int i33 = (i21 - iMax) - iCeil2;
                    mutableIntObjectMap2 = mutableIntObjectMapT;
                    i14 = i33 < 0 ? 0 : i33;
                }
                flowLineInfo2.O(i12, i31, fRV9, measureScope3.rV9(i14));
            } else {
                i9 = i30;
                mutableIntObjectMap2 = mutableIntObjectMapT;
            }
            measurableTy2 = !it2.hasNext() ? null : ty(it2, flowLineInfo2);
            objectRef.element = null;
            IntIntPair intIntPairN3 = measurableTy2 != null ? IntIntPair.n(gh(measurableTy2, flowLineMeasurePolicy3, jKN, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    n(placeable);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void n(Placeable placeable) {
                    objectRef.element = placeable;
                }
            })) : null;
            Integer numValueOf4 = intIntPairN3 != null ? Integer.valueOf(IntIntPair.O(intIntPairN3.getPackedValue()) + i15) : null;
            numValueOf2 = intIntPairN3 != null ? Integer.valueOf(IntIntPair.J2(intIntPairN3.getPackedValue())) : null;
            boolean zHasNext = it2.hasNext();
            int i34 = i19;
            long jRl = IntIntPair.rl(i27, i21);
            if (intIntPairN3 == null) {
                intIntPairN = null;
            } else {
                Intrinsics.checkNotNull(numValueOf4);
                int iIntValue2 = numValueOf4.intValue();
                Intrinsics.checkNotNull(numValueOf2);
                intIntPairN = IntIntPair.n(IntIntPair.rl(iIntValue2, numValueOf2.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoRl2 = flowLayoutBuildingBlocks.rl(zHasNext, i9, jRl, intIntPairN, i34, i18, iMax, false, false);
            if (wrapInfoRl2.getIsLastItemInLine()) {
                int iMin = Math.min(Math.max(i29, i26), i25);
                int i35 = i18 + iMax;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfoN2 = flowLayoutBuildingBlocks.n(wrapInfoRl2, intIntPairN3 != null, i34, i35, i27, i9);
                mutableIntList = mutableIntList6;
                mutableIntList.qie(iMax);
                int i36 = (iGh - i35) - iCeil2;
                MutableIntList mutableIntList7 = mutableIntList5;
                mutableIntList7.qie(i28);
                i19 = i34 + 1;
                i18 = i35 + iCeil2;
                i24 = i25;
                i25 = i24;
                numValueOf3 = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i15) : null;
                i23 = i28;
                i10 = i36;
                wrapEllipsisInfo = wrapEllipsisInfoN2;
                i20 = iMin;
                mutableIntList2 = mutableIntList7;
                i11 = 0;
                i26 = 0;
            } else {
                mutableIntList = mutableIntList6;
                mutableIntList2 = mutableIntList5;
                numValueOf3 = numValueOf4;
                i24 = i27;
                i19 = i34;
                i20 = i29;
                i10 = i21;
                i11 = iMax;
                wrapEllipsisInfo = wrapEllipsisInfo2;
            }
            wrapEllipsisInfo2 = wrapEllipsisInfo;
            mutableIntList5 = mutableIntList2;
            i16 = i11;
            i21 = i10;
            i22 = i28;
            wrapInfo = wrapInfoRl2;
            it2 = it;
            mutableIntList4 = mutableIntList;
            mutableIntObjectMapT = mutableIntObjectMap2;
            i17 = i26;
            i5 = i25;
        }
        MutableIntObjectMap mutableIntObjectMap3 = mutableIntObjectMapT;
        int i37 = i20;
        MutableIntList mutableIntList8 = mutableIntList4;
        MutableIntList mutableIntList9 = mutableIntList5;
        if (wrapEllipsisInfo2 != null) {
            arrayList.add(wrapEllipsisInfo2.getEllipsis());
            mutableIntObjectMap = mutableIntObjectMap3;
            mutableIntObjectMap.r(arrayList.size() - 1, wrapEllipsisInfo2.getPlaceable());
            int i38 = mutableIntList9._size - 1;
            if (wrapEllipsisInfo2.getPlaceEllipsisOnLastContentLine()) {
                int i39 = mutableIntList9._size - 1;
                mutableIntList8.Ik(i38, Math.max(mutableIntList8.O(i38), IntIntPair.J2(wrapEllipsisInfo2.getEllipsisSize())));
                mutableIntList9.Ik(i39, mutableIntList9.mUb() + 1);
            } else {
                mutableIntList8.qie(IntIntPair.J2(wrapEllipsisInfo2.getEllipsisSize()));
                mutableIntList9.qie(mutableIntList9.mUb() + 1);
            }
        } else {
            mutableIntObjectMap = mutableIntObjectMap3;
        }
        int size = arrayList.size();
        ?? r2 = new Placeable[size];
        for (int i40 = 0; i40 < size; i40++) {
            r2[i40] = mutableIntObjectMap.rl(i40);
        }
        int i41 = mutableIntList9._size;
        int[] iArr3 = new int[i41];
        int[] iArr4 = new int[i41];
        int[] iArr5 = mutableIntList9.content;
        int iMax2 = i37;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        ?? r22 = r2;
        while (i43 < i41) {
            int i45 = iArr5[i43];
            MutableIntList mutableIntList10 = mutableIntList8;
            int iO = mutableIntList10.O(i43);
            int[] iArr6 = iArr3;
            ?? r8 = r22;
            FlowLineMeasurePolicy flowLineMeasurePolicy4 = flowLineMeasurePolicy3;
            ArrayList arrayList2 = arrayList;
            int i46 = i15;
            MeasureResult measureResultN = RowColumnMeasurePolicyKt.n(flowLineMeasurePolicy4, iMax2, Constraints.az(jN), Constraints.qie(jN), iO, i46, measureScope3, arrayList2, r8, i42, i45, iArr6, i43);
            if (flowLineMeasurePolicy.getIsHorizontal()) {
                rl2 = measureResultN.getWidth();
                f32234n = measureResultN.getHeight();
            } else {
                rl2 = measureResultN.getHeight();
                f32234n = measureResultN.getWidth();
            }
            iArr4[i43] = f32234n;
            i44 += f32234n;
            iMax2 = Math.max(iMax2, rl2);
            mutableVector.rl(measureResultN);
            i43++;
            arrayList = arrayList2;
            r22 = r8;
            i42 = i45;
            iArr3 = iArr6;
            mutableIntList8 = mutableIntList10;
            i15 = i46;
            measureScope3 = measureScope;
            flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        }
        int[] iArr7 = iArr3;
        if (mutableVector.getSize() == 0) {
            i7 = 0;
            i8 = 0;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            j3 = j2;
            iArr = iArr7;
            iArr2 = iArr4;
        } else {
            i7 = iMax2;
            i8 = i44;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            iArr = iArr7;
            iArr2 = iArr4;
            j3 = j2;
        }
        return qie(measureScope2, j3, i7, i8, iArr2, mutableVector, flowLineMeasurePolicy2, iArr);
    }

    public static final int KN(IntrinsicMeasurable intrinsicMeasurable, boolean z2, int i2) {
        return z2 ? intrinsicMeasurable.FX(i2) : intrinsicMeasurable.GR(i2);
    }

    public static final MultiContentMeasurePolicy Uo(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i5) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-308635847, i5, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:546)");
        }
        boolean zP5 = ((((i5 & 14) ^ 6) > 4 && composer.p5(vertical)) || (i5 & 6) == 4) | ((((i5 & 112) ^ 48) > 32 && composer.p5(horizontal)) || (i5 & 48) == 32) | ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(horizontal2)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i5 & 7168) ^ 3072) > 2048 && composer.t(i2)) || (i5 & 3072) == 2048) | ((((57344 & i5) ^ 24576) > 16384 && composer.t(i3)) || (i5 & 24576) == 16384) | composer.p5(flowLayoutOverflowState);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CrossAxisAlignment.INSTANCE.rl(horizontal2), horizontal.getSpacing(), i2, i3, flowLayoutOverflowState, null);
            composer.o(flowMeasurePolicy);
            objIF = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return flowMeasurePolicy2;
    }

    public static final MultiContentMeasurePolicy az(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i5) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-2010142641, i5, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:484)");
        }
        boolean zP5 = ((((i5 & 14) ^ 6) > 4 && composer.p5(horizontal)) || (i5 & 6) == 4) | ((((i5 & 112) ^ 48) > 32 && composer.p5(vertical)) || (i5 & 48) == 32) | ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(vertical2)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i5 & 7168) ^ 3072) > 2048 && composer.t(i2)) || (i5 & 3072) == 2048) | ((((57344 & i5) ^ 24576) > 16384 && composer.t(i3)) || (i5 & 24576) == 16384) | composer.p5(flowLayoutOverflowState);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CrossAxisAlignment.INSTANCE.t(vertical2), vertical.getSpacing(), i2, i3, flowLayoutOverflowState, null);
            composer.o(flowMeasurePolicy);
            objIF = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return flowMeasurePolicy2;
    }

    public static final int mUb(IntrinsicMeasurable intrinsicMeasurable, boolean z2, int i2) {
        return z2 ? intrinsicMeasurable.GR(i2) : intrinsicMeasurable.FX(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2, int i3, FlowColumnOverflow flowColumnOverflow, final Function3 function3, Composer composer, final int i5, final int i7) {
        int i8;
        Arrangement.Vertical vertical2;
        int i9;
        int i10;
        Alignment.Horizontal horizontalGh;
        int i11;
        int i12;
        int i13;
        int i14;
        final Modifier modifier2;
        final Arrangement.Horizontal horizontal3;
        final Arrangement.Vertical vertical3;
        Composer composer2;
        final int i15;
        final int i16;
        final FlowColumnOverflow flowColumnOverflow2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i17;
        Arrangement.Horizontal horizontalJ2;
        Composer composerKN = composer.KN(-1385862766);
        int i18 = i7 & 1;
        if (i18 != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i8 = (composerKN.p5(modifier) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i19 = i7 & 2;
        if (i19 != 0) {
            i8 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                vertical2 = vertical;
                i8 |= composerKN.p5(vertical2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i8 |= composerKN.p5(horizontal) ? 256 : 128;
                }
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i5 & 3072) == 0) {
                        horizontalGh = horizontal2;
                        i8 |= composerKN.p5(horizontalGh) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 != 0) {
                        if ((i5 & 24576) == 0) {
                            i12 = i2;
                            i8 |= composerKN.t(i12) ? 16384 : 8192;
                        }
                        i13 = i7 & 32;
                        if (i13 != 0) {
                            i8 |= 196608;
                        } else if ((i5 & 196608) == 0) {
                            i8 |= composerKN.t(i3) ? 131072 : 65536;
                        }
                        i14 = i7 & 64;
                        if (i14 != 0) {
                            i8 |= 1572864;
                        } else if ((i5 & 1572864) == 0) {
                            i8 |= composerKN.p5(flowColumnOverflow) ? 1048576 : 524288;
                        }
                        if ((i7 & 128) != 0) {
                            i8 |= 12582912;
                        } else if ((i5 & 12582912) == 0) {
                            i8 |= composerKN.E2(function3) ? 8388608 : 4194304;
                        }
                        if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                            Modifier modifier3 = i18 != 0 ? Modifier.INSTANCE : modifier;
                            Arrangement.Vertical verticalUo = i19 != 0 ? Arrangement.f17400n.Uo() : vertical2;
                            if (i9 != 0) {
                                horizontalJ2 = Arrangement.f17400n.J2();
                                i17 = i10;
                            } else {
                                i17 = i10;
                                horizontalJ2 = horizontal;
                            }
                            if (i17 != 0) {
                                horizontalGh = Alignment.INSTANCE.gh();
                            }
                            int i20 = i11 != 0 ? Integer.MAX_VALUE : i12;
                            int i21 = i13 != 0 ? Integer.MAX_VALUE : i3;
                            FlowColumnOverflow flowColumnOverflowN = i14 != 0 ? FlowColumnOverflow.INSTANCE.n() : flowColumnOverflow;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1385862766, i8, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:212)");
                            }
                            int i22 = 3670016 & i8;
                            boolean z2 = i22 == 1048576;
                            Object objIF = composerKN.iF();
                            if (z2 || objIF == Composer.INSTANCE.n()) {
                                objIF = flowColumnOverflowN.rl();
                                composerKN.o(objIF);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) objIF;
                            MultiContentMeasurePolicy multiContentMeasurePolicyUo = Uo(verticalUo, horizontalJ2, horizontalGh, i20, i21, flowLayoutOverflowState, composerKN, (i8 >> 3) & 65534);
                            boolean z3 = ((29360128 & i8) == 8388608) | (i22 == 1048576) | ((i8 & 458752) == 131072);
                            Object objIF2 = composerKN.iF();
                            if (!z3) {
                                Object obj = objIF2;
                                if (objIF2 == Composer.INSTANCE.n()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(ComposableLambdaKt.rl(-763839774, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$list$1$1
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i23) {
                                            if (!composer3.HI((i23 & 3) != 2, i23 & 1)) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-763839774, i23, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:226)");
                                            }
                                            function3.invoke(FlowColumnScopeInstance.rl, composer3, 6);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }));
                                    flowColumnOverflowN.n(flowLayoutOverflowState, arrayList);
                                    composerKN.o(arrayList);
                                    obj = arrayList;
                                }
                                Function2 function2Rl = LayoutKt.rl((List) obj);
                                boolean zP5 = composerKN.p5(multiContentMeasurePolicyUo);
                                Object objIF3 = composerKN.iF();
                                if (zP5 || objIF3 == Composer.INSTANCE.n()) {
                                    objIF3 = MultiContentMeasurePolicyKt.n(multiContentMeasurePolicyUo);
                                    composerKN.o(objIF3);
                                }
                                MeasurePolicy measurePolicy = (MeasurePolicy) objIF3;
                                int iN = ComposablesKt.n(composerKN, 0);
                                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composerKN, modifier3);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Modifier modifier4 = modifier3;
                                Function0 function0N = companion.n();
                                if (composerKN.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composerKN.T();
                                if (composerKN.getInserting()) {
                                    composerKN.s7N(function0N);
                                } else {
                                    composerKN.r();
                                }
                                Composer composerN = Updater.n(composerKN);
                                FlowColumnOverflow flowColumnOverflow3 = flowColumnOverflowN;
                                Updater.O(composerN, measurePolicy, companion.t());
                                Updater.O(composerN, compositionLocalMapIk, companion.O());
                                Function2 function2Rl2 = companion.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl2);
                                }
                                Updater.O(composerN, modifierO, companion.nr());
                                function2Rl.invoke(composerKN, 0);
                                composerKN.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                vertical3 = verticalUo;
                                horizontal3 = horizontalJ2;
                                i15 = i20;
                                i16 = i21;
                                modifier2 = modifier4;
                                composer2 = composerKN;
                                flowColumnOverflow2 = flowColumnOverflow3;
                            }
                        } else {
                            composerKN.wTp();
                            modifier2 = modifier;
                            horizontal3 = horizontal;
                            vertical3 = vertical2;
                            composer2 = composerKN;
                            i15 = i12;
                            i16 = i3;
                            flowColumnOverflow2 = flowColumnOverflow;
                        }
                        final Alignment.Horizontal horizontal4 = horizontalGh;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i23) {
                                    FlowLayoutKt.n(modifier2, vertical3, horizontal3, horizontal4, i15, i16, flowColumnOverflow2, function3, composer3, RecomposeScopeImplKt.n(i5 | 1), i7);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 |= 24576;
                    i12 = i2;
                    i13 = i7 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 64;
                    if (i14 != 0) {
                    }
                    if ((i7 & 128) != 0) {
                    }
                    if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                    }
                    final Alignment.Horizontal horizontal42 = horizontalGh;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                horizontalGh = horizontal2;
                i11 = i7 & 16;
                if (i11 != 0) {
                }
                i12 = i2;
                i13 = i7 & 32;
                if (i13 != 0) {
                }
                i14 = i7 & 64;
                if (i14 != 0) {
                }
                if ((i7 & 128) != 0) {
                }
                if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                }
                final Alignment.Horizontal horizontal422 = horizontalGh;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            horizontalGh = horizontal2;
            i11 = i7 & 16;
            if (i11 != 0) {
            }
            i12 = i2;
            i13 = i7 & 32;
            if (i13 != 0) {
            }
            i14 = i7 & 64;
            if (i14 != 0) {
            }
            if ((i7 & 128) != 0) {
            }
            if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
            }
            final Alignment.Horizontal horizontal4222 = horizontalGh;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        vertical2 = vertical;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        horizontalGh = horizontal2;
        i11 = i7 & 16;
        if (i11 != 0) {
        }
        i12 = i2;
        i13 = i7 & 32;
        if (i13 != 0) {
        }
        i14 = i7 & 64;
        if (i14 != 0) {
        }
        if ((i7 & 128) != 0) {
        }
        if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
        }
        final Alignment.Horizontal horizontal42222 = horizontalGh;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i2, int i3, final Function3 function3, Composer composer, final int i5, final int i7) {
        Modifier modifier2;
        int i8;
        Arrangement.Horizontal horizontal2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        final Alignment.Vertical vertical3;
        final Modifier modifier3;
        final Arrangement.Horizontal horizontal3;
        final int i15;
        final Arrangement.Vertical vertical4;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i16;
        Arrangement.Horizontal horizontalJ2;
        int i17;
        Alignment.Vertical verticalQie;
        Composer composerKN = composer.KN(-2070229740);
        int i18 = i7 & 1;
        if (i18 != 0) {
            i8 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            i8 = (composerKN.p5(modifier2) ? 4 : 2) | i5;
        } else {
            modifier2 = modifier;
            i8 = i5;
        }
        int i19 = i7 & 2;
        if (i19 != 0) {
            i8 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                horizontal2 = horizontal;
                i8 |= composerKN.p5(horizontal2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i8 |= composerKN.p5(vertical) ? 256 : 128;
                }
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i5 & 3072) == 0) {
                        i8 |= composerKN.p5(vertical2) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i5 & 24576) == 0) {
                            i12 = i2;
                            i8 |= composerKN.t(i12) ? 16384 : 8192;
                        }
                        i13 = i7 & 32;
                        if (i13 == 0) {
                            if ((196608 & i5) == 0) {
                                i14 = i3;
                                i8 |= composerKN.t(i14) ? 131072 : 65536;
                            }
                            if ((i7 & 64) == 0) {
                                i8 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                i8 |= composerKN.E2(function3) ? 1048576 : 524288;
                            }
                            if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                vertical3 = vertical2;
                                modifier3 = modifier2;
                                horizontal3 = horizontal2;
                                i15 = i14;
                                vertical4 = vertical;
                            } else {
                                Modifier modifier4 = i18 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i19 != 0) {
                                    horizontalJ2 = Arrangement.f17400n.J2();
                                    i16 = i10;
                                } else {
                                    i16 = i10;
                                    horizontalJ2 = horizontal2;
                                }
                                Arrangement.Vertical verticalUo = i9 != 0 ? Arrangement.f17400n.Uo() : vertical;
                                if (i16 != 0) {
                                    verticalQie = Alignment.INSTANCE.qie();
                                    i17 = i11;
                                } else {
                                    i17 = i11;
                                    verticalQie = vertical2;
                                }
                                if (i17 != 0) {
                                    i12 = Integer.MAX_VALUE;
                                }
                                int i20 = i13 != 0 ? Integer.MAX_VALUE : i14;
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-2070229740, i8, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:161)");
                                }
                                composer2 = composerKN;
                                t(modifier4, horizontalJ2, verticalUo, verticalQie, i12, i20, FlowRowOverflow.INSTANCE.n(), function3, composer2, (i8 & 14) | 1572864 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | ((i8 << 3) & 29360128), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier3 = modifier4;
                                horizontal3 = horizontalJ2;
                                vertical4 = verticalUo;
                                vertical3 = verticalQie;
                                i15 = i20;
                            }
                            final int i21 = i12;
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i22) {
                                        FlowLayoutKt.nr(modifier3, horizontal3, vertical4, vertical3, i21, i15, function3, composer3, RecomposeScopeImplKt.n(i5 | 1), i7);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 |= 196608;
                        i14 = i3;
                        if ((i7 & 64) == 0) {
                        }
                        if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
                        }
                        final int i212 = i12;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i12 = i2;
                    i13 = i7 & 32;
                    if (i13 == 0) {
                    }
                    i14 = i3;
                    if ((i7 & 64) == 0) {
                    }
                    if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
                    }
                    final int i2122 = i12;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                i12 = i2;
                i13 = i7 & 32;
                if (i13 == 0) {
                }
                i14 = i3;
                if ((i7 & 64) == 0) {
                }
                if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
                }
                final int i21222 = i12;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            i12 = i2;
            i13 = i7 & 32;
            if (i13 == 0) {
            }
            i14 = i3;
            if ((i7 & 64) == 0) {
            }
            if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
            }
            final int i212222 = i12;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        horizontal2 = horizontal;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        i12 = i2;
        i13 = i7 & 32;
        if (i13 == 0) {
        }
        i14 = i3;
        if ((i7 & 64) == 0) {
        }
        if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
        }
        final int i2122222 = i12;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2, int i3, final Function3 function3, Composer composer, final int i5, final int i7) {
        Modifier modifier2;
        int i8;
        Arrangement.Vertical vertical2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        final Alignment.Horizontal horizontal3;
        final Modifier modifier3;
        final Arrangement.Vertical vertical3;
        final int i15;
        final Arrangement.Horizontal horizontal4;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i16;
        Arrangement.Vertical verticalUo;
        int i17;
        Alignment.Horizontal horizontalGh;
        Composer composerKN = composer.KN(-208106226);
        int i18 = i7 & 1;
        if (i18 != 0) {
            i8 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            i8 = (composerKN.p5(modifier2) ? 4 : 2) | i5;
        } else {
            modifier2 = modifier;
            i8 = i5;
        }
        int i19 = i7 & 2;
        if (i19 != 0) {
            i8 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                vertical2 = vertical;
                i8 |= composerKN.p5(vertical2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i8 |= composerKN.p5(horizontal) ? 256 : 128;
                }
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i5 & 3072) == 0) {
                        i8 |= composerKN.p5(horizontal2) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i5 & 24576) == 0) {
                            i12 = i2;
                            i8 |= composerKN.t(i12) ? 16384 : 8192;
                        }
                        i13 = i7 & 32;
                        if (i13 == 0) {
                            if ((196608 & i5) == 0) {
                                i14 = i3;
                                i8 |= composerKN.t(i14) ? 131072 : 65536;
                            }
                            if ((i7 & 64) == 0) {
                                i8 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                i8 |= composerKN.E2(function3) ? 1048576 : 524288;
                            }
                            if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                horizontal3 = horizontal2;
                                modifier3 = modifier2;
                                vertical3 = vertical2;
                                i15 = i14;
                                horizontal4 = horizontal;
                            } else {
                                Modifier modifier4 = i18 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i19 != 0) {
                                    verticalUo = Arrangement.f17400n.Uo();
                                    i16 = i10;
                                } else {
                                    i16 = i10;
                                    verticalUo = vertical2;
                                }
                                Arrangement.Horizontal horizontalJ2 = i9 != 0 ? Arrangement.f17400n.J2() : horizontal;
                                if (i16 != 0) {
                                    horizontalGh = Alignment.INSTANCE.gh();
                                    i17 = i11;
                                } else {
                                    i17 = i11;
                                    horizontalGh = horizontal2;
                                }
                                if (i17 != 0) {
                                    i12 = Integer.MAX_VALUE;
                                }
                                int i20 = i13 != 0 ? Integer.MAX_VALUE : i14;
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-208106226, i8, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:270)");
                                }
                                composer2 = composerKN;
                                n(modifier4, verticalUo, horizontalJ2, horizontalGh, i12, i20, FlowColumnOverflow.INSTANCE.n(), function3, composer2, (i8 & 14) | 1572864 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | ((i8 << 3) & 29360128), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier3 = modifier4;
                                vertical3 = verticalUo;
                                horizontal4 = horizontalJ2;
                                horizontal3 = horizontalGh;
                                i15 = i20;
                            }
                            final int i21 = i12;
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i22) {
                                        FlowLayoutKt.rl(modifier3, vertical3, horizontal4, horizontal3, i21, i15, function3, composer3, RecomposeScopeImplKt.n(i5 | 1), i7);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 |= 196608;
                        i14 = i3;
                        if ((i7 & 64) == 0) {
                        }
                        if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
                        }
                        final int i212 = i12;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i12 = i2;
                    i13 = i7 & 32;
                    if (i13 == 0) {
                    }
                    i14 = i3;
                    if ((i7 & 64) == 0) {
                    }
                    if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
                    }
                    final int i2122 = i12;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                i12 = i2;
                i13 = i7 & 32;
                if (i13 == 0) {
                }
                i14 = i3;
                if ((i7 & 64) == 0) {
                }
                if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
                }
                final int i21222 = i12;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            i12 = i2;
            i13 = i7 & 32;
            if (i13 == 0) {
            }
            i14 = i3;
            if ((i7 & 64) == 0) {
            }
            if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
            }
            final int i212222 = i12;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        vertical2 = vertical;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        i12 = i2;
        i13 = i7 & 32;
        if (i13 == 0) {
        }
        i14 = i3;
        if ((i7 & 64) == 0) {
        }
        if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
        }
        final int i2122222 = i12;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i2, int i3, FlowRowOverflow flowRowOverflow, final Function3 function3, Composer composer, final int i5, final int i7) {
        int i8;
        Arrangement.Horizontal horizontal2;
        int i9;
        int i10;
        Alignment.Vertical verticalQie;
        int i11;
        int i12;
        int i13;
        int i14;
        final Modifier modifier2;
        final Arrangement.Vertical vertical3;
        final Arrangement.Horizontal horizontal3;
        Composer composer2;
        final int i15;
        final int i16;
        final FlowRowOverflow flowRowOverflow2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i17;
        Arrangement.Vertical verticalUo;
        Composer composerKN = composer.KN(-218661582);
        int i18 = i7 & 1;
        if (i18 != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i8 = (composerKN.p5(modifier) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i19 = i7 & 2;
        if (i19 != 0) {
            i8 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                horizontal2 = horizontal;
                i8 |= composerKN.p5(horizontal2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i8 |= composerKN.p5(vertical) ? 256 : 128;
                }
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i5 & 3072) == 0) {
                        verticalQie = vertical2;
                        i8 |= composerKN.p5(verticalQie) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 != 0) {
                        if ((i5 & 24576) == 0) {
                            i12 = i2;
                            i8 |= composerKN.t(i12) ? 16384 : 8192;
                        }
                        i13 = i7 & 32;
                        if (i13 != 0) {
                            i8 |= 196608;
                        } else if ((i5 & 196608) == 0) {
                            i8 |= composerKN.t(i3) ? 131072 : 65536;
                        }
                        i14 = i7 & 64;
                        if (i14 != 0) {
                            i8 |= 1572864;
                        } else if ((i5 & 1572864) == 0) {
                            i8 |= composerKN.p5(flowRowOverflow) ? 1048576 : 524288;
                        }
                        if ((i7 & 128) != 0) {
                            i8 |= 12582912;
                        } else if ((i5 & 12582912) == 0) {
                            i8 |= composerKN.E2(function3) ? 8388608 : 4194304;
                        }
                        if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                            Modifier modifier3 = i18 != 0 ? Modifier.INSTANCE : modifier;
                            Arrangement.Horizontal horizontalJ2 = i19 != 0 ? Arrangement.f17400n.J2() : horizontal2;
                            if (i9 != 0) {
                                verticalUo = Arrangement.f17400n.Uo();
                                i17 = i10;
                            } else {
                                i17 = i10;
                                verticalUo = vertical;
                            }
                            if (i17 != 0) {
                                verticalQie = Alignment.INSTANCE.qie();
                            }
                            int i20 = i11 != 0 ? Integer.MAX_VALUE : i12;
                            int i21 = i13 != 0 ? Integer.MAX_VALUE : i3;
                            FlowRowOverflow flowRowOverflowN = i14 != 0 ? FlowRowOverflow.INSTANCE.n() : flowRowOverflow;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-218661582, i8, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:98)");
                            }
                            int i22 = 3670016 & i8;
                            boolean z2 = i22 == 1048576;
                            Object objIF = composerKN.iF();
                            if (z2 || objIF == Composer.INSTANCE.n()) {
                                objIF = flowRowOverflowN.rl();
                                composerKN.o(objIF);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) objIF;
                            MultiContentMeasurePolicy multiContentMeasurePolicyAz = az(horizontalJ2, verticalUo, verticalQie, i20, i21, flowLayoutOverflowState, composerKN, (i8 >> 3) & 65534);
                            boolean z3 = ((29360128 & i8) == 8388608) | (i22 == 1048576) | ((i8 & 458752) == 131072);
                            Object objIF2 = composerKN.iF();
                            if (!z3) {
                                Object obj = objIF2;
                                if (objIF2 == Composer.INSTANCE.n()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(ComposableLambdaKt.rl(702094978, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i23) {
                                            if (!composer3.HI((i23 & 3) != 2, i23 & 1)) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(702094978, i23, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:112)");
                                            }
                                            function3.invoke(FlowRowScopeInstance.rl, composer3, 6);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }));
                                    flowRowOverflowN.n(flowLayoutOverflowState, arrayList);
                                    composerKN.o(arrayList);
                                    obj = arrayList;
                                }
                                Function2 function2Rl = LayoutKt.rl((List) obj);
                                boolean zP5 = composerKN.p5(multiContentMeasurePolicyAz);
                                Object objIF3 = composerKN.iF();
                                if (zP5 || objIF3 == Composer.INSTANCE.n()) {
                                    objIF3 = MultiContentMeasurePolicyKt.n(multiContentMeasurePolicyAz);
                                    composerKN.o(objIF3);
                                }
                                MeasurePolicy measurePolicy = (MeasurePolicy) objIF3;
                                int iN = ComposablesKt.n(composerKN, 0);
                                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composerKN, modifier3);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Modifier modifier4 = modifier3;
                                Function0 function0N = companion.n();
                                if (composerKN.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composerKN.T();
                                if (composerKN.getInserting()) {
                                    composerKN.s7N(function0N);
                                } else {
                                    composerKN.r();
                                }
                                Composer composerN = Updater.n(composerKN);
                                FlowRowOverflow flowRowOverflow3 = flowRowOverflowN;
                                Updater.O(composerN, measurePolicy, companion.t());
                                Updater.O(composerN, compositionLocalMapIk, companion.O());
                                Function2 function2Rl2 = companion.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl2);
                                }
                                Updater.O(composerN, modifierO, companion.nr());
                                function2Rl.invoke(composerKN, 0);
                                composerKN.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                horizontal3 = horizontalJ2;
                                vertical3 = verticalUo;
                                i15 = i20;
                                i16 = i21;
                                modifier2 = modifier4;
                                composer2 = composerKN;
                                flowRowOverflow2 = flowRowOverflow3;
                            }
                        } else {
                            composerKN.wTp();
                            modifier2 = modifier;
                            vertical3 = vertical;
                            horizontal3 = horizontal2;
                            composer2 = composerKN;
                            i15 = i12;
                            i16 = i3;
                            flowRowOverflow2 = flowRowOverflow;
                        }
                        final Alignment.Vertical vertical4 = verticalQie;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i23) {
                                    FlowLayoutKt.t(modifier2, horizontal3, vertical3, vertical4, i15, i16, flowRowOverflow2, function3, composer3, RecomposeScopeImplKt.n(i5 | 1), i7);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 |= 24576;
                    i12 = i2;
                    i13 = i7 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 64;
                    if (i14 != 0) {
                    }
                    if ((i7 & 128) != 0) {
                    }
                    if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                    }
                    final Alignment.Vertical vertical42 = verticalQie;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                verticalQie = vertical2;
                i11 = i7 & 16;
                if (i11 != 0) {
                }
                i12 = i2;
                i13 = i7 & 32;
                if (i13 != 0) {
                }
                i14 = i7 & 64;
                if (i14 != 0) {
                }
                if ((i7 & 128) != 0) {
                }
                if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                }
                final Alignment.Vertical vertical422 = verticalQie;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            verticalQie = vertical2;
            i11 = i7 & 16;
            if (i11 != 0) {
            }
            i12 = i2;
            i13 = i7 & 32;
            if (i13 != 0) {
            }
            i14 = i7 & 64;
            if (i14 != 0) {
            }
            if ((i7 & 128) != 0) {
            }
            if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
            }
            final Alignment.Vertical vertical4222 = verticalQie;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        horizontal2 = horizontal;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        verticalQie = vertical2;
        i11 = i7 & 16;
        if (i11 != 0) {
        }
        i12 = i2;
        i13 = i7 & 32;
        if (i13 != 0) {
        }
        i14 = i7 & 64;
        if (i14 != 0) {
        }
        if ((i7 & 128) != 0) {
        }
        if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
        }
        final Alignment.Vertical vertical42222 = verticalQie;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    private static final Measurable ty(Iterator it, FlowLineInfo flowLineInfo) {
        try {
            if (!(it instanceof ContextualFlowItemIterator)) {
                return (Measurable) it.next();
            }
            Intrinsics.checkNotNull(flowLineInfo);
            return ((ContextualFlowItemIterator) it).O(flowLineInfo);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long xMQ(List list, int[] iArr, int[] iArr2, int i2, int i3, int i5, int i7, int i8, FlowLayoutOverflowState flowLayoutOverflowState) {
        if (list.isEmpty()) {
            return IntIntPair.rl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i7, flowLayoutOverflowState, OrientationIndependentConstraints.n(0, i2, 0, Integer.MAX_VALUE), i8, i3, i5, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, 0);
        int i9 = intrinsicMeasurable != null ? iArr2[0] : 0;
        int i10 = intrinsicMeasurable != null ? iArr[0] : 0;
        int i11 = 0;
        if (flowLayoutBuildingBlocks.rl(list.size() > 1, 0, IntIntPair.rl(i2, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.n(IntIntPair.rl(i10, i9)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            IntIntPair intIntPairJ2 = flowLayoutOverflowState.J2(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.rl(intIntPairJ2 != null ? IntIntPair.J2(intIntPairJ2.getPackedValue()) : 0, 0);
        }
        int size = list.size();
        int i12 = i2;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            if (i13 >= size) {
                break;
            }
            int i18 = i12 - i10;
            int i19 = i13 + 1;
            int iMax = Math.max(i17, i9);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, i19);
            int i20 = intrinsicMeasurable2 != null ? iArr2[i19] : 0;
            int i21 = intrinsicMeasurable2 != null ? iArr[i19] + i3 : 0;
            int i22 = i19 - i15;
            int i23 = i16;
            int i24 = i20;
            int i25 = i21;
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoRl = flowLayoutBuildingBlocks.rl(i13 + 2 < list.size(), i22, IntIntPair.rl(i18, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.n(IntIntPair.rl(i21, i20)), i23, i11, iMax, false, false);
            if (wrapInfoRl.getIsLastItemInLine()) {
                int iJ2 = i11 + iMax + i5;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfoN = flowLayoutBuildingBlocks.n(wrapInfoRl, intrinsicMeasurable2 != null, i23, iJ2, i18, i22);
                int i26 = i25 - i3;
                i16 = i23 + 1;
                if (wrapInfoRl.getIsLastItemInContainer()) {
                    if (wrapEllipsisInfoN != null) {
                        long ellipsisSize = wrapEllipsisInfoN.getEllipsisSize();
                        if (!wrapEllipsisInfoN.getPlaceEllipsisOnLastContentLine()) {
                            iJ2 += IntIntPair.J2(ellipsisSize) + i5;
                        }
                    }
                    i11 = iJ2;
                    i14 = i19;
                } else {
                    i17 = 0;
                    i11 = iJ2;
                    i10 = i26;
                    i15 = i19;
                    i12 = i2;
                }
            } else {
                i12 = i18;
                i16 = i23;
                i17 = iMax;
                i10 = i25;
            }
            i13 = i19;
            i14 = i13;
            i9 = i24;
        }
        return IntIntPair.rl(i11 - i5, i14);
    }

    public static final long gh(Measurable measurable, FlowLineMeasurePolicy flowLineMeasurePolicy, long j2, Function1 function1) {
        Float fValueOf;
        FlowLayoutData flowLayoutData;
        if (RowColumnImplKt.O(RowColumnImplKt.t(measurable)) == 0.0f) {
            RowColumnParentData rowColumnParentDataT = RowColumnImplKt.t(measurable);
            if (rowColumnParentDataT != null && (flowLayoutData = rowColumnParentDataT.getFlowLayoutData()) != null) {
                fValueOf = Float.valueOf(flowLayoutData.getFillCrossAxisFraction());
            } else {
                fValueOf = null;
            }
            if (fValueOf == null) {
                Placeable placeableDR0 = measurable.dR0(j2);
                function1.invoke(placeableDR0);
                return IntIntPair.rl(flowLineMeasurePolicy.KN(placeableDR0), flowLineMeasurePolicy.gh(placeableDR0));
            }
        }
        int iMUb = mUb(measurable, flowLineMeasurePolicy.getIsHorizontal(), Integer.MAX_VALUE);
        return IntIntPair.rl(iMUb, KN(measurable, flowLineMeasurePolicy.getIsHorizontal(), iMUb));
    }

    public static final MeasureResult qie(MeasureScope measureScope, long j2, int i2, int i3, int[] iArr, final MutableVector mutableVector, FlowLineMeasurePolicy flowLineMeasurePolicy, int[] iArr2) {
        int i5;
        int iGh;
        int i7;
        int i8;
        boolean zT2 = flowLineMeasurePolicy.getIsHorizontal();
        Arrangement.Vertical verticalHI = flowLineMeasurePolicy.getVerticalArrangement();
        Arrangement.Horizontal horizontalTy = flowLineMeasurePolicy.getHorizontalArrangement();
        if (zT2) {
            int iHow = i3 + (measureScope.How(verticalHI.getSpacing()) * (mutableVector.getSize() - 1));
            int iAz = Constraints.az(j2);
            iGh = Constraints.gh(j2);
            if (iHow < iAz) {
                iHow = iAz;
            }
            if (iHow <= iGh) {
                iGh = iHow;
            }
            verticalHI.rl(measureScope, iGh, iArr, iArr2);
        } else {
            int iHow2 = i3 + (measureScope.How(horizontalTy.getSpacing()) * (mutableVector.getSize() - 1));
            int iAz2 = Constraints.az(j2);
            int iGh2 = Constraints.gh(j2);
            if (iHow2 < iAz2) {
                iHow2 = iAz2;
            }
            if (iHow2 > iGh2) {
                i5 = iGh2;
            } else {
                i5 = iHow2;
            }
            horizontalTy.t(measureScope, i5, iArr, measureScope.getLayoutDirection(), iArr2);
            iGh = i5;
        }
        int iTy = Constraints.ty(j2);
        int iQie = Constraints.qie(j2);
        if (i2 < iTy) {
            i2 = iTy;
        }
        if (i2 <= iQie) {
            iQie = i2;
        }
        if (zT2) {
            i8 = iQie;
            i7 = iGh;
        } else {
            i7 = iQie;
            i8 = iGh;
        }
        return MeasureScope.ER(measureScope, i8, i7, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                MutableVector mutableVector2 = mutableVector;
                Object[] objArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i9 = 0; i9 < size; i9++) {
                    ((MeasureResult) objArr[i9]).Z();
                }
            }
        }, 4, null);
    }
}
