package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0011\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0015\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001c\u001a\u00020\u001b*\u00020\u00172\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u001fJ)\u0010!\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u001fJ)\u0010\"\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/material/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "", "singleLine", "", "animationProgress", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "<init>", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "KN", "(Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "J2", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "mUb", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "Uo", "O", "xMQ", c.f62177j, "Z", "F", "t", "Landroidx/compose/foundation/layout/PaddingValues;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1123:1\n116#2,2:1124\n33#2,6:1126\n118#2:1132\n116#2,2:1133\n33#2,6:1135\n118#2:1141\n116#2,2:1142\n33#2,6:1144\n118#2:1150\n544#2,2:1151\n33#2,6:1153\n546#2:1159\n116#2,2:1160\n33#2,6:1162\n118#2:1168\n544#2,2:1169\n33#2,6:1171\n546#2:1177\n116#2,2:1178\n33#2,6:1180\n118#2:1186\n116#2,2:1188\n33#2,6:1190\n118#2:1196\n116#2,2:1197\n33#2,6:1199\n118#2:1205\n116#2,2:1206\n33#2,6:1208\n118#2:1214\n116#2,2:1215\n33#2,6:1217\n118#2:1223\n116#2,2:1224\n33#2,6:1226\n118#2:1232\n116#2,2:1233\n33#2,6:1235\n118#2:1241\n544#2,2:1242\n33#2,6:1244\n546#2:1250\n116#2,2:1251\n33#2,6:1253\n118#2:1259\n1#3:1187\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n*L\n732#1:1124,2\n732#1:1126,6\n732#1:1132\n738#1:1133,2\n738#1:1135,6\n738#1:1141\n749#1:1142,2\n749#1:1144,6\n749#1:1150\n772#1:1151,2\n772#1:1153,6\n772#1:1159\n778#1:1160,2\n778#1:1162,6\n778#1:1168\n879#1:1169,2\n879#1:1171,6\n879#1:1177\n882#1:1178,2\n882#1:1180,6\n882#1:1186\n886#1:1188,2\n886#1:1190,6\n886#1:1196\n890#1:1197,2\n890#1:1199,6\n890#1:1205\n894#1:1206,2\n894#1:1208,6\n894#1:1214\n914#1:1215,2\n914#1:1217,6\n914#1:1223\n924#1:1224,2\n924#1:1226,6\n924#1:1232\n935#1:1233,2\n935#1:1235,6\n935#1:1241\n939#1:1242,2\n939#1:1244,6\n939#1:1250\n942#1:1251,2\n942#1:1253,6\n942#1:1259\n*E\n"})
final class TextFieldMeasurePolicy implements MeasurePolicy {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float animationProgress;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final PaddingValues paddingValues;

    private final int J2(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2, Function2 function2) {
        Object obj;
        Object obj2;
        int i3;
        int iIntValue;
        int iZ;
        Object obj3;
        int iIntValue2;
        Object obj4;
        int size = list.size();
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i5);
            if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj2), "Leading")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable != null) {
            i3 = i2;
            iZ = TextFieldKt.Z(i3, intrinsicMeasurable.Nxk(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i3))).intValue();
        } else {
            i3 = i2;
            iIntValue = 0;
            iZ = i3;
        }
        int size2 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj3), "Trailing")) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
        if (intrinsicMeasurable2 != null) {
            iZ = TextFieldKt.Z(iZ, intrinsicMeasurable2.Nxk(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i3))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj4), "Label")) {
                break;
            }
            i8++;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
        int iIntValue3 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(iZ))).intValue() : 0;
        int size4 = list.size();
        for (int i9 = 0; i9 < size4; i9++) {
            Object obj5 = list.get(i9);
            if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj5), "TextField")) {
                int iIntValue4 = ((Number) function2.invoke(obj5, Integer.valueOf(iZ))).intValue();
                int size5 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i10);
                    if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i10++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                return TextFieldKt.qie(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(iZ))).intValue() : 0, ConstraintsKt.rl(0, 0, 0, 0, 15, null), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int KN(List measurables, int height, Function2 intrinsicMeasurer) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj5 = measurables.get(i2);
            if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj5), "TextField")) {
                int iIntValue = ((Number) intrinsicMeasurer.invoke(obj5, Integer.valueOf(height))).intValue();
                int size2 = measurables.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = measurables.get(i3);
                    if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                int iIntValue2 = intrinsicMeasurable != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable, Integer.valueOf(height))).intValue() : 0;
                int size3 = measurables.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = measurables.get(i5);
                    if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj3), "Trailing")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                int iIntValue3 = intrinsicMeasurable2 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable2, Integer.valueOf(height))).intValue() : 0;
                int size4 = measurables.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = measurables.get(i7);
                    if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj4), "Leading")) {
                        break;
                    }
                    i7++;
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                int iIntValue4 = intrinsicMeasurable3 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable3, Integer.valueOf(height))).intValue() : 0;
                int size5 = measurables.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size5) {
                        break;
                    }
                    Object obj6 = measurables.get(i8);
                    if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                return TextFieldKt.az(iIntValue4, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable4 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable4, Integer.valueOf(height))).intValue() : 0, ConstraintsKt.rl(0, 0, 0, 0, 15, null));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int O(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return KN(list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicWidth$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return n(intrinsicMeasurable, num.intValue());
            }

            public final Integer n(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                return Integer.valueOf(intrinsicMeasurable.Nxk(i3));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int Uo(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return J2(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicHeight$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return n(intrinsicMeasurable, num.intValue());
            }

            public final Integer n(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                return Integer.valueOf(intrinsicMeasurable.FX(i3));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int mUb(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return J2(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicHeight$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return n(intrinsicMeasurable, num.intValue());
            }

            public final Integer n(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                return Integer.valueOf(intrinsicMeasurable.g(i3));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public MeasureResult rl(MeasureScope measureScope, List list, long j2) {
        Object obj;
        Object obj2;
        Object obj3;
        int iZ;
        Object obj4;
        final TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        final MeasureScope measureScope2 = measureScope;
        List list2 = list;
        final int iHow = measureScope2.How(textFieldMeasurePolicy.paddingValues.getTop());
        int iHow2 = measureScope2.How(textFieldMeasurePolicy.paddingValues.getBottom());
        final int iHow3 = measureScope2.How(TextFieldKt.Ik());
        long jNr = Constraints.nr(j2, 0, 0, 0, 0, 10, null);
        int size = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i2);
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj), "Leading")) {
                break;
            }
            i2++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable placeableDR0 = measurable != null ? measurable.dR0(jNr) : null;
        int iKN = TextFieldImplKt.KN(placeableDR0);
        int size2 = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i3);
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable placeableDR02 = measurable2 != null ? measurable2.dR0(ConstraintsKt.mUb(jNr, -iKN, 0, 2, null)) : null;
        int i5 = -iHow2;
        int i7 = -(iKN + TextFieldImplKt.KN(placeableDR02));
        long jXMQ = ConstraintsKt.xMQ(jNr, i7, i5);
        int size3 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i8);
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj3), "Label")) {
                break;
            }
            i8++;
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable placeableDR03 = measurable3 != null ? measurable3.dR0(jXMQ) : null;
        if (placeableDR03 != null) {
            iZ = placeableDR03.z(AlignmentLineKt.rl());
            if (iZ == Integer.MIN_VALUE) {
                iZ = placeableDR03.getHeight();
            }
        } else {
            iZ = 0;
        }
        final int iMax = Math.max(iZ, iHow);
        long jXMQ2 = ConstraintsKt.xMQ(Constraints.nr(j2, 0, 0, 0, 0, 11, null), i7, placeableDR03 != null ? (i5 - iHow3) - iMax : (-iHow) - iHow2);
        int size4 = list2.size();
        int i9 = 0;
        while (i9 < size4) {
            Measurable measurable4 = (Measurable) list2.get(i9);
            if (Intrinsics.areEqual(LayoutIdKt.n(measurable4), "TextField")) {
                final Placeable placeableDR04 = measurable4.dR0(jXMQ2);
                long jNr2 = Constraints.nr(jXMQ2, 0, 0, 0, 0, 14, null);
                int size5 = list2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list2.get(i10);
                    if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj4), "Hint")) {
                        break;
                    }
                    i10++;
                    list2 = list;
                }
                Measurable measurable5 = (Measurable) obj4;
                final Placeable placeableDR05 = measurable5 != null ? measurable5.dR0(jNr2) : null;
                final int iAz = TextFieldKt.az(TextFieldImplKt.KN(placeableDR0), TextFieldImplKt.KN(placeableDR02), placeableDR04.getWidth(), TextFieldImplKt.KN(placeableDR03), TextFieldImplKt.KN(placeableDR05), j2);
                final int iQie = TextFieldKt.qie(placeableDR04.getHeight(), placeableDR03 != null, iMax, TextFieldImplKt.Uo(placeableDR0), TextFieldImplKt.Uo(placeableDR02), TextFieldImplKt.Uo(placeableDR05), j2, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                final Placeable placeable = placeableDR02;
                final int i11 = iZ;
                final Placeable placeable2 = placeableDR03;
                final Placeable placeable3 = placeableDR0;
                return MeasureScope.ER(measureScope, iAz, iQie, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$measure$1
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
                        if (placeable2 == null) {
                            TextFieldKt.o(placementScope, iAz, iQie, placeableDR04, placeableDR05, placeable3, placeable, textFieldMeasurePolicy.singleLine, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                        } else {
                            TextFieldKt.r(placementScope, iAz, iQie, placeableDR04, placeable2, placeableDR05, placeable3, placeable, textFieldMeasurePolicy.singleLine, RangesKt.coerceAtLeast(iHow - i11, 0), iMax + iHow3, textFieldMeasurePolicy.animationProgress, measureScope2.getDensity());
                        }
                    }
                }, 4, null);
            }
            i9++;
            textFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int xMQ(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return KN(list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return n(intrinsicMeasurable, num.intValue());
            }

            public final Integer n(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                return Integer.valueOf(intrinsicMeasurable.GR(i3));
            }
        });
    }

    public TextFieldMeasurePolicy(boolean z2, float f3, PaddingValues paddingValues) {
        this.singleLine = z2;
        this.animationProgress = f3;
        this.paddingValues = paddingValues;
    }
}
