package androidx.compose.material3;

import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.AlignmentLineKt;
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
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u000f\u001a\u00020\b*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0006\u0010\t\u001a\u00020\b2,\u0010\u000e\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u0012\u001a\u00020\b*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0006\u0010\u0011\u001a\u00020\b2,\u0010\u000e\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J2\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\b*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\b*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ/\u0010\u001d\u001a\u00020\b*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ/\u0010\u001e\u001a\u00020\b*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/ListItemMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "<init>", "()V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/ExtensionFunctionType;", "intrinsicMeasure", "t", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "width", c.f62177j, "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "mUb", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "O", "Uo", "xMQ", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemMeasurePolicy\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,731:1\n50#2:732\n86#2:733\n86#2:734\n50#2:735\n50#2:736\n86#2:737\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemMeasurePolicy\n*L\n213#1:732\n243#1:733\n299#1:734\n376#1:735\n395#1:736\n433#1:737\n*E\n"})
final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {
    private final int n(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2, Function2 function2) {
        int iIntValue;
        int iIntValue2;
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        List list5 = (List) list.get(3);
        List list6 = (List) list.get(4);
        int iZ = ListItemKt.Z(i2, intrinsicMeasureScope.How(Dp.KN(ListItemKt.ck() + ListItemKt.HI())));
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.firstOrNull(list5);
        if (intrinsicMeasurable != null) {
            iIntValue = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(iZ))).intValue();
            iZ = ListItemKt.Z(iZ, intrinsicMeasurable.Nxk(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(list6);
        if (intrinsicMeasurable2 != null) {
            iIntValue2 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(iZ))).intValue();
            iZ = ListItemKt.Z(iZ, intrinsicMeasurable2.Nxk(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3);
        int iIntValue3 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(iZ))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2);
        int iIntValue4 = intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(iZ))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(list4);
        int iIntValue5 = intrinsicMeasurable5 != null ? ((Number) function2.invoke(intrinsicMeasurable5, Integer.valueOf(iZ))).intValue() : 0;
        int iNr = ListItemType.INSTANCE.nr(iIntValue3 > 0, iIntValue5 > 0, ListItemKt.r(intrinsicMeasureScope, iIntValue5));
        return ListItemKt.qie(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, iNr, intrinsicMeasureScope.How(Dp.KN(ListItemKt.XQ(iNr) * 2)), ConstraintsKt.rl(0, 0, 0, 0, 15, null));
    }

    private final int t(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2, Function2 function2) {
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        List list5 = (List) list.get(3);
        List list6 = (List) list.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.firstOrNull(list5);
        int iIntValue = intrinsicMeasurable != null ? ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(list6);
        int iIntValue2 = intrinsicMeasurable2 != null ? ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2);
        int iIntValue3 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3);
        int iIntValue4 = intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(list4);
        return ListItemKt.az(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue3, iIntValue4, intrinsicMeasurable5 != null ? ((Number) function2.invoke(intrinsicMeasurable5, Integer.valueOf(i2))).intValue() : 0, intrinsicMeasureScope.How(Dp.KN(ListItemKt.ck() + ListItemKt.HI())), ConstraintsKt.rl(0, 0, 0, 0, 15, null));
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int O(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return t(intrinsicMeasureScope, list, i2, ListItemMeasurePolicy$maxIntrinsicWidth$1.f26156n);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int Uo(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return n(intrinsicMeasureScope, list, i2, ListItemMeasurePolicy$minIntrinsicHeight$1.f26157n);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int mUb(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return n(intrinsicMeasureScope, list, i2, ListItemMeasurePolicy$maxIntrinsicHeight$1.f26155n);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public MeasureResult rl(MeasureScope measureScope, List list, long j2) {
        long j3;
        Placeable placeableDR0;
        float f3;
        List list2;
        long j4;
        Placeable placeableDR02;
        int i2;
        Placeable placeableDR03;
        List list3 = (List) list.get(0);
        List list4 = (List) list.get(1);
        List list5 = (List) list.get(2);
        List list6 = (List) list.get(3);
        List list7 = (List) list.get(4);
        long jNr = Constraints.nr(j2, 0, 0, 0, 0, 10, null);
        float fCk = ListItemKt.ck();
        float fHI = ListItemKt.HI();
        int iHow = measureScope.How(Dp.KN(fCk + fHI));
        Measurable measurable = (Measurable) CollectionsKt.firstOrNull(list6);
        int iGR = measurable != null ? measurable.GR(Constraints.gh(j2)) : 0;
        Measurable measurable2 = (Measurable) CollectionsKt.firstOrNull(list7);
        int iZ = ListItemKt.Z(Constraints.qie(jNr), iGR + (measurable2 != null ? measurable2.GR(Constraints.gh(j2)) : 0) + iHow);
        Measurable measurable3 = (Measurable) CollectionsKt.firstOrNull(list5);
        boolean zR = ListItemKt.r(measureScope, measurable3 != null ? measurable3.FX(iZ) : 0);
        ListItemType.Companion companion = ListItemType.INSTANCE;
        float f4 = 2;
        long jXMQ = ConstraintsKt.xMQ(jNr, -iHow, -measureScope.How(Dp.KN(ListItemKt.XQ(companion.nr(CollectionsKt.firstOrNull(list4) != null, CollectionsKt.firstOrNull(list5) != null, zR)) * f4)));
        Measurable measurable4 = (Measurable) CollectionsKt.firstOrNull(list6);
        Placeable placeableDR04 = measurable4 != null ? measurable4.dR0(jXMQ) : null;
        int iS = TextFieldImplKt.S(placeableDR04);
        Measurable measurable5 = (Measurable) CollectionsKt.firstOrNull(list7);
        if (measurable5 != null) {
            j3 = jXMQ;
            placeableDR0 = measurable5.dR0(ConstraintsKt.mUb(j3, -iS, 0, 2, null));
        } else {
            j3 = jXMQ;
            placeableDR0 = null;
        }
        int iS2 = iS + TextFieldImplKt.S(placeableDR0);
        Measurable measurable6 = (Measurable) CollectionsKt.firstOrNull(list3);
        if (measurable6 != null) {
            list2 = list5;
            f3 = f4;
            j4 = j3;
            placeableDR02 = measurable6.dR0(ConstraintsKt.mUb(j3, -iS2, 0, 2, null));
        } else {
            f3 = f4;
            list2 = list5;
            j4 = j3;
            placeableDR02 = null;
        }
        int iZ2 = TextFieldImplKt.Z(placeableDR02);
        Measurable measurable7 = (Measurable) CollectionsKt.firstOrNull(list2);
        if (measurable7 != null) {
            i2 = iZ2;
            placeableDR03 = measurable7.dR0(ConstraintsKt.xMQ(j4, -iS2, -iZ2));
        } else {
            i2 = iZ2;
            placeableDR03 = null;
        }
        int iZ3 = i2 + TextFieldImplKt.Z(placeableDR03);
        boolean z2 = (placeableDR03 == null || placeableDR03.z(AlignmentLineKt.n()) == placeableDR03.z(AlignmentLineKt.rl())) ? false : true;
        Measurable measurable8 = (Measurable) CollectionsKt.firstOrNull(list4);
        Placeable placeableDR05 = measurable8 != null ? measurable8.dR0(ConstraintsKt.xMQ(j4, -iS2, -iZ3)) : null;
        int iNr = companion.nr(placeableDR05 != null, placeableDR03 != null, z2);
        float fXQ = ListItemKt.XQ(iNr);
        return ListItemKt.o(measureScope, ListItemKt.az(measureScope, TextFieldImplKt.S(placeableDR04), TextFieldImplKt.S(placeableDR0), TextFieldImplKt.S(placeableDR02), TextFieldImplKt.S(placeableDR05), TextFieldImplKt.S(placeableDR03), iHow, j2), ListItemKt.qie(measureScope, TextFieldImplKt.Z(placeableDR04), TextFieldImplKt.Z(placeableDR0), TextFieldImplKt.Z(placeableDR02), TextFieldImplKt.Z(placeableDR05), TextFieldImplKt.Z(placeableDR03), iNr, measureScope.How(Dp.KN(fXQ * f3)), j2), placeableDR04, placeableDR0, placeableDR02, placeableDR05, placeableDR03, ListItemType.xMQ(iNr, companion.rl()), measureScope.How(fCk), measureScope.How(fHI), measureScope.How(fXQ));
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int xMQ(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return t(intrinsicMeasureScope, list, i2, ListItemMeasurePolicy$minIntrinsicWidth$1.f26158n);
    }
}
