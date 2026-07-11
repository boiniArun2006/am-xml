package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u001c\u001a\u00020\u001b*\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010$\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\"J/\u0010%\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\"J/\u0010&\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\"JK\u0010)\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J+\u0010,\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e¢\u0006\u0004\b,\u0010-JK\u0010/\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b/\u0010*J\u0019\u00101\u001a\u00020\u000e*\u00020\u001f2\u0006\u00100\u001a\u00020\u000e¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\u000e*\u00020\u001f2\u0006\u00100\u001a\u00020\u000e¢\u0006\u0004\b3\u00102J\u0019\u00104\u001a\u00020\u000e*\u00020\u001f2\u0006\u00100\u001a\u00020\u000e¢\u0006\u0004\b4\u00102J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u00103\u001a\u0004\b?\u0010@R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bL\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010MR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010MR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "", "isHorizontal", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "crossAxisArrangementSpacing", "", "maxItemsInMainAxis", "maxLines", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflow", "<init>", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "xMQ", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "width", "Uo", "mUb", "O", "crossAxisAvailable", "crossAxisSpacing", "XQ", "(Ljava/util/List;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)I", "arrangementSpacing", "r", "(Ljava/util/List;II)I", "mainAxisAvailable", "Ik", "size", "o", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "Z", "S", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", c.f62177j, "t", "()Z", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "ty", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "HI", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "nr", "F", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "qie", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "J2", "I", "KN", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n+ 2 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1594:1\n989#2,33:1595\n1022#2,40:1629\n954#2,4:1669\n958#2,11:1677\n969#2:1689\n1107#2,115:1690\n1#3:1628\n70#4,4:1673\n75#4:1688\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n*L\n890#1:1595,33\n890#1:1629,40\n907#1:1669,4\n907#1:1677,11\n907#1:1689\n924#1:1690,115\n890#1:1628\n907#1:1673,4\n907#1:1688\n*E\n"})
final /* data */ class FlowMeasurePolicy implements MultiContentMeasurePolicy, FlowLineMeasurePolicy {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final float crossAxisArrangementSpacing;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata and from toString */
    private final int maxLines;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final CrossAxisAlignment crossAxisAlignment;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata and from toString */
    private final int maxItemsInMainAxis;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isHorizontal;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final float mainAxisSpacing;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final Arrangement.Horizontal horizontalArrangement;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final Arrangement.Vertical verticalArrangement;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata and from toString */
    private final FlowLayoutOverflowState overflow;

    public /* synthetic */ FlowMeasurePolicy(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f3, CrossAxisAlignment crossAxisAlignment, float f4, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, horizontal, vertical, f3, crossAxisAlignment, f4, i2, i3, flowLayoutOverflowState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) other;
        return this.isHorizontal == flowMeasurePolicy.isHorizontal && Intrinsics.areEqual(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && Intrinsics.areEqual(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && Dp.mUb(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && Intrinsics.areEqual(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && Dp.mUb(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && this.maxLines == flowMeasurePolicy.maxLines && Intrinsics.areEqual(this.overflow, flowMeasurePolicy.overflow);
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + Dp.gh(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + Dp.gh(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.overflow.hashCode();
    }

    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) Dp.qie(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) Dp.qie(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", maxLines=" + this.maxLines + ", overflow=" + this.overflow + ')';
    }

    private FlowMeasurePolicy(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f3, CrossAxisAlignment crossAxisAlignment, float f4, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.isHorizontal = z2;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f3;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f4;
        this.maxItemsInMainAxis = i2;
        this.maxLines = i3;
        this.overflow = flowLayoutOverflowState;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* JADX INFO: renamed from: HI, reason: from getter */
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public final int Ik(List measurables, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        long jRl;
        int i2 = 0;
        if (measurables.isEmpty()) {
            jRl = IntIntPair.rl(0, 0);
        } else {
            FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(maxItemsInMainAxis, overflow, OrientationIndependentConstraints.n(0, mainAxisAvailable, 0, Integer.MAX_VALUE), maxLines, mainAxisSpacing, crossAxisSpacing, null);
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.getOrNull(measurables, 0);
            int iZ = intrinsicMeasurable != null ? Z(intrinsicMeasurable, mainAxisAvailable) : 0;
            int iS = intrinsicMeasurable != null ? S(intrinsicMeasurable, iZ) : 0;
            int i3 = 0;
            if (flowLayoutBuildingBlocks.rl(measurables.size() > 1, 0, IntIntPair.rl(mainAxisAvailable, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.n(IntIntPair.rl(iS, iZ)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
                IntIntPair intIntPairJ2 = overflow.J2(intrinsicMeasurable != null, 0, 0);
                jRl = IntIntPair.rl(intIntPairJ2 != null ? IntIntPair.J2(intIntPairJ2.getPackedValue()) : 0, 0);
            } else {
                int size = measurables.size();
                int i5 = mainAxisAvailable;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    int i12 = i5 - iS;
                    int i13 = i7 + 1;
                    int iMax = Math.max(i11, iZ);
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(measurables, i13);
                    int iZ2 = intrinsicMeasurable2 != null ? Z(intrinsicMeasurable2, mainAxisAvailable) : i2;
                    int iS2 = intrinsicMeasurable2 != null ? S(intrinsicMeasurable2, iZ2) + mainAxisSpacing : i2;
                    boolean z2 = i7 + 2 < measurables.size();
                    int i14 = i13 - i9;
                    int i15 = i10;
                    int i16 = iS2;
                    int i17 = iZ2;
                    FlowLayoutBuildingBlocks.WrapInfo wrapInfoRl = flowLayoutBuildingBlocks.rl(z2, i14, IntIntPair.rl(i12, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.n(IntIntPair.rl(iS2, iZ2)), i15, i3, iMax, false, false);
                    if (wrapInfoRl.getIsLastItemInLine()) {
                        int iJ2 = i3 + iMax + crossAxisSpacing;
                        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfoN = flowLayoutBuildingBlocks.n(wrapInfoRl, intrinsicMeasurable2 != null, i15, iJ2, i12, i14);
                        int i18 = i16 - mainAxisSpacing;
                        i10 = i15 + 1;
                        if (wrapInfoRl.getIsLastItemInContainer()) {
                            if (wrapEllipsisInfoN != null) {
                                long ellipsisSize = wrapEllipsisInfoN.getEllipsisSize();
                                if (!wrapEllipsisInfoN.getPlaceEllipsisOnLastContentLine()) {
                                    iJ2 += IntIntPair.J2(ellipsisSize) + crossAxisSpacing;
                                }
                            }
                            i3 = iJ2;
                            i8 = i13;
                        } else {
                            i3 = iJ2;
                            iS = i18;
                            i9 = i13;
                            i11 = 0;
                            i5 = mainAxisAvailable;
                        }
                    } else {
                        i5 = i12;
                        i10 = i15;
                        i11 = iMax;
                        iS = i16;
                    }
                    iZ = i17;
                    i7 = i13;
                    i8 = i7;
                    i2 = 0;
                }
                jRl = IntIntPair.rl(i3 - crossAxisSpacing, i8);
            }
        }
        return IntIntPair.O(jRl);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int O(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.ck(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, getIsHorizontal(), ConstraintsKt.rl(0, 0, 0, i2, 7, null));
        if (getIsHorizontal()) {
            List listEmptyList = (List) CollectionsKt.firstOrNull(list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return r(listEmptyList, i2, intrinsicMeasureScope.How(this.mainAxisSpacing));
        }
        List listEmptyList2 = (List) CollectionsKt.firstOrNull(list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return Ik(listEmptyList2, i2, intrinsicMeasureScope.How(this.mainAxisSpacing), intrinsicMeasureScope.How(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int Uo(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.ck(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, getIsHorizontal(), ConstraintsKt.rl(0, i2, 0, 0, 13, null));
        if (getIsHorizontal()) {
            List listEmptyList = (List) CollectionsKt.firstOrNull(list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return Ik(listEmptyList, i2, intrinsicMeasureScope.How(this.mainAxisSpacing), intrinsicMeasureScope.How(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List listEmptyList2 = (List) CollectionsKt.firstOrNull(list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return XQ(listEmptyList2, i2, intrinsicMeasureScope.How(this.mainAxisSpacing), intrinsicMeasureScope.How(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public final int XQ(List measurables, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        int i2 = maxItemsInMainAxis;
        int i3 = maxLines;
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int[] iArr = new int[size];
        int size2 = measurables.size();
        int[] iArr2 = new int[size2];
        int size3 = measurables.size();
        for (int i5 = 0; i5 < size3; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) measurables.get(i5);
            int iS = S(intrinsicMeasurable, crossAxisAvailable);
            iArr[i5] = iS;
            iArr2[i5] = Z(intrinsicMeasurable, iS);
        }
        List list = measurables;
        int i7 = Integer.MAX_VALUE;
        if (i3 != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            i7 = i2 * i3;
        }
        int iMin = Math.min(i7 - (((i7 >= list.size() || !(overflow.getType() == FlowLayoutOverflow.OverflowType.f17618O || overflow.getType() == FlowLayoutOverflow.OverflowType.J2)) && (i7 < list.size() || i3 < overflow.getMinLinesToShowCollapse() || overflow.getType() != FlowLayoutOverflow.OverflowType.J2)) ? 0 : 1), list.size());
        int iSum = ArraysKt.sum(iArr) + ((list.size() - 1) * mainAxisSpacing);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i8 = iArr2[0];
        ?? it = new IntRange(1, ArraysKt.getLastIndex(iArr2)).iterator();
        while (it.hasNext()) {
            int i9 = iArr2[it.nextInt()];
            if (i8 < i9) {
                i8 = i9;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        ?? it2 = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
        while (it2.hasNext()) {
            int i11 = iArr[it2.nextInt()];
            if (i10 < i11) {
                i10 = i11;
            }
        }
        int i12 = i10;
        int i13 = iSum;
        while (i12 <= i13 && i8 != crossAxisAvailable) {
            int i14 = (i12 + i13) / 2;
            long jXMQ = FlowLayoutKt.xMQ(list, iArr, iArr2, i14, mainAxisSpacing, crossAxisSpacing, i2, i3, overflow);
            int iO = IntIntPair.O(jXMQ);
            int iJ2 = IntIntPair.J2(jXMQ);
            if (iO > crossAxisAvailable || iJ2 < iMin) {
                i12 = i14 + 1;
                if (i12 > i13) {
                    return i12;
                }
            } else {
                if (iO >= crossAxisAvailable) {
                    return i14;
                }
                i13 = i14 - 1;
            }
            list = measurables;
            i2 = maxItemsInMainAxis;
            i3 = maxLines;
            iSum = i14;
            i8 = iO;
        }
        return iSum;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int mUb(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.ck(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, getIsHorizontal(), ConstraintsKt.rl(0, i2, 0, 0, 13, null));
        if (getIsHorizontal()) {
            List listEmptyList = (List) CollectionsKt.firstOrNull(list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return Ik(listEmptyList, i2, intrinsicMeasureScope.How(this.mainAxisSpacing), intrinsicMeasureScope.How(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List listEmptyList2 = (List) CollectionsKt.firstOrNull(list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return r(listEmptyList2, i2, intrinsicMeasureScope.How(this.mainAxisSpacing));
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* JADX INFO: renamed from: qie, reason: from getter */
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final int r(List measurables, int height, int arrangementSpacing) {
        int i2 = this.maxItemsInMainAxis;
        int size = measurables.size();
        int i3 = 0;
        int iMax = 0;
        int i5 = 0;
        int i7 = 0;
        while (i3 < size) {
            int iO = o((IntrinsicMeasurable) measurables.get(i3), height) + arrangementSpacing;
            int i8 = i3 + 1;
            if (i8 - i5 == i2 || i8 == measurables.size()) {
                iMax = Math.max(iMax, (i7 + iO) - arrangementSpacing);
                i7 = 0;
                i5 = i3;
            } else {
                i7 += iO;
            }
            i3 = i8;
        }
        return iMax;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public MeasureResult rl(MeasureScope measureScope, List list, long j2) {
        if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || list.isEmpty() || (Constraints.gh(j2) == 0 && this.overflow.getType() != FlowLayoutOverflow.OverflowType.f17619n)) {
            return MeasureScope.ER(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$1
                public final void n(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    n(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        List list2 = (List) CollectionsKt.first(list);
        if (list2.isEmpty()) {
            return MeasureScope.ER(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$2
                public final void n(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    n(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        List list3 = (List) CollectionsKt.getOrNull(list, 1);
        Measurable measurable = list3 != null ? (Measurable) CollectionsKt.firstOrNull(list3) : null;
        List list4 = (List) CollectionsKt.getOrNull(list, 2);
        Measurable measurable2 = list4 != null ? (Measurable) CollectionsKt.firstOrNull(list4) : null;
        this.overflow.az(list2.size());
        this.overflow.HI(this, measurable, measurable2, j2);
        return FlowLayoutKt.J2(measureScope, this, list2.iterator(), this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.t(j2, getIsHorizontal() ? LayoutOrientation.f17704n : LayoutOrientation.f17705t), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* JADX INFO: renamed from: t, reason: from getter */
    public boolean getIsHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* JADX INFO: renamed from: ty, reason: from getter */
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int xMQ(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.ck(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, getIsHorizontal(), ConstraintsKt.rl(0, 0, 0, i2, 7, null));
        if (getIsHorizontal()) {
            List listEmptyList = (List) CollectionsKt.firstOrNull(list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return XQ(listEmptyList, i2, intrinsicMeasureScope.How(this.mainAxisSpacing), intrinsicMeasureScope.How(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List listEmptyList2 = (List) CollectionsKt.firstOrNull(list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return Ik(listEmptyList2, i2, intrinsicMeasureScope.How(this.mainAxisSpacing), intrinsicMeasureScope.How(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int S(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (getIsHorizontal()) {
            return intrinsicMeasurable.GR(i2);
        }
        return intrinsicMeasurable.FX(i2);
    }

    public final int Z(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (getIsHorizontal()) {
            return intrinsicMeasurable.FX(i2);
        }
        return intrinsicMeasurable.GR(i2);
    }

    public final int o(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (getIsHorizontal()) {
            return intrinsicMeasurable.Nxk(i2);
        }
        return intrinsicMeasurable.g(i2);
    }
}
