package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
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
import androidx.compose.ui.util.MathHelpersKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJC\u0010\u0016\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0019\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J,\u0010\u001f\u001a\u00020\u001e*\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J)\u0010#\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\"J)\u0010$\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010\"J)\u0010%\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010\"R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "", "onLabelMeasured", "", "singleLine", "", "animationProgress", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "<init>", "(Lkotlin/jvm/functions/Function1;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "KN", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "width", "J2", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "mUb", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "Uo", "O", "xMQ", c.f62177j, "Lkotlin/jvm/functions/Function1;", "Z", "t", "F", "nr", "Landroidx/compose/foundation/layout/PaddingValues;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1213:1\n116#2,2:1214\n33#2,6:1216\n118#2:1222\n116#2,2:1223\n33#2,6:1225\n118#2:1231\n116#2,2:1232\n33#2,6:1234\n118#2:1240\n544#2,2:1242\n33#2,6:1244\n546#2:1250\n116#2,2:1251\n33#2,6:1253\n118#2:1259\n544#2,2:1260\n33#2,6:1262\n546#2:1268\n544#2,2:1269\n33#2,6:1271\n546#2:1277\n116#2,2:1278\n33#2,6:1280\n118#2:1286\n116#2,2:1287\n33#2,6:1289\n118#2:1295\n116#2,2:1296\n33#2,6:1298\n118#2:1304\n116#2,2:1305\n33#2,6:1307\n118#2:1313\n116#2,2:1314\n33#2,6:1316\n118#2:1322\n116#2,2:1323\n33#2,6:1325\n118#2:1331\n116#2,2:1332\n33#2,6:1334\n118#2:1340\n544#2,2:1341\n33#2,6:1343\n546#2:1349\n116#2,2:1350\n33#2,6:1352\n118#2:1358\n1#3:1241\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n*L\n779#1:1214,2\n779#1:1216,6\n779#1:1222\n785#1:1223,2\n785#1:1225,6\n785#1:1231\n804#1:1232,2\n804#1:1234,6\n804#1:1240\n822#1:1242,2\n822#1:1244,6\n822#1:1250\n828#1:1251,2\n828#1:1253,6\n828#1:1259\n858#1:1260,2\n858#1:1262,6\n858#1:1268\n928#1:1269,2\n928#1:1271,6\n928#1:1277\n931#1:1278,2\n931#1:1280,6\n931#1:1286\n935#1:1287,2\n935#1:1289,6\n935#1:1295\n939#1:1296,2\n939#1:1298,6\n939#1:1304\n943#1:1305,2\n943#1:1307,6\n943#1:1313\n966#1:1314,2\n966#1:1316,6\n966#1:1322\n976#1:1323,2\n976#1:1325,6\n976#1:1331\n987#1:1332,2\n987#1:1334,6\n987#1:1340\n991#1:1341,2\n991#1:1343,6\n991#1:1349\n994#1:1350,2\n994#1:1352,6\n994#1:1358\n*E\n"})
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function1 onLabelMeasured;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final PaddingValues paddingValues;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float animationProgress;

    private final int J2(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2, Function2 function2) {
        Object obj;
        Object obj2;
        int iIk;
        int iIntValue;
        Object obj3;
        int iIntValue2;
        Object obj4;
        int size = list.size();
        int i3 = 0;
        while (true) {
            obj = null;
            if (i3 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj2), "Leading")) {
                break;
            }
            i3++;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable != null) {
            iIk = OutlinedTextFieldKt.Ik(i2, intrinsicMeasurable.Nxk(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i2))).intValue();
        } else {
            iIk = i2;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj3), "Trailing")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
        if (intrinsicMeasurable2 != null) {
            iIk = OutlinedTextFieldKt.Ik(iIk, intrinsicMeasurable2.Nxk(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i7);
            if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj4), "Label")) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
        int iIntValue3 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(MathHelpersKt.t(iIk, i2, this.animationProgress)))).intValue() : 0;
        int size4 = list.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Object obj5 = list.get(i8);
            if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj5), "TextField")) {
                int iIntValue4 = ((Number) function2.invoke(obj5, Integer.valueOf(iIk))).intValue();
                int size5 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i9);
                    if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                return OutlinedTextFieldKt.qie(iIntValue, iIntValue2, iIntValue4, iIntValue3, intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(iIk))).intValue() : 0, this.animationProgress, ConstraintsKt.rl(0, 0, 0, 0, 15, null), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int KN(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj5 = list.get(i3);
            if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj5), "TextField")) {
                int iIntValue = ((Number) function2.invoke(obj5, Integer.valueOf(i2))).intValue();
                int size2 = list.size();
                int i5 = 0;
                while (true) {
                    obj = null;
                    if (i5 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i5);
                    if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj2), "Label")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                int iIntValue2 = intrinsicMeasurable != null ? ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i2))).intValue() : 0;
                int size3 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size3) {
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
                int iIntValue3 = intrinsicMeasurable2 != null ? ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i2))).intValue() : 0;
                int size4 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i8);
                    if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj4), "Leading")) {
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                int iIntValue4 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i2))).intValue() : 0;
                int size5 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i9);
                    if (Intrinsics.areEqual(TextFieldImplKt.O((IntrinsicMeasurable) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                return OutlinedTextFieldKt.az(iIntValue4, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i2))).intValue() : 0, this.animationProgress, ConstraintsKt.rl(0, 0, 0, 0, 15, null), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int O(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return KN(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1
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
        return J2(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1
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
        return J2(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1
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
    public MeasureResult rl(final MeasureScope measureScope, List list, long j2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        final OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        MeasureScope measureScope2 = measureScope;
        int iHow = measureScope2.How(outlinedTextFieldMeasurePolicy.paddingValues.getBottom());
        long jNr = Constraints.nr(j2, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj), "Leading")) {
                break;
            }
            i2++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable placeableDR0 = measurable != null ? measurable.dR0(jNr) : null;
        int iKN = TextFieldImplKt.KN(placeableDR0);
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable placeableDR02 = measurable2 != null ? measurable2.dR0(ConstraintsKt.mUb(jNr, -iKN, 0, 2, null)) : null;
        int iKN2 = iKN + TextFieldImplKt.KN(placeableDR02);
        int iHow2 = measureScope2.How(outlinedTextFieldMeasurePolicy.paddingValues.rl(measureScope2.getLayoutDirection())) + measureScope2.How(outlinedTextFieldMeasurePolicy.paddingValues.t(measureScope2.getLayoutDirection()));
        int i5 = -iKN2;
        int i7 = -iHow;
        long jXMQ = ConstraintsKt.xMQ(jNr, MathHelpersKt.t(i5 - iHow2, -iHow2, outlinedTextFieldMeasurePolicy.animationProgress), i7);
        int size3 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i8);
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj3), "Label")) {
                break;
            }
            i8++;
        }
        Measurable measurable3 = (Measurable) obj3;
        final Placeable placeableDR03 = measurable3 != null ? measurable3.dR0(jXMQ) : null;
        outlinedTextFieldMeasurePolicy.onLabelMeasured.invoke(Size.t(placeableDR03 != null ? SizeKt.n(placeableDR03.getWidth(), placeableDR03.getHeight()) : Size.INSTANCE.rl()));
        long j3 = j2;
        long jNr2 = Constraints.nr(ConstraintsKt.xMQ(j3, i5, i7 - Math.max(TextFieldImplKt.Uo(placeableDR03) / 2, measureScope2.How(outlinedTextFieldMeasurePolicy.paddingValues.getTop()))), 0, 0, 0, 0, 11, null);
        int size4 = list.size();
        int i9 = 0;
        while (i9 < size4) {
            Measurable measurable4 = (Measurable) list.get(i9);
            if (Intrinsics.areEqual(LayoutIdKt.n(measurable4), "TextField")) {
                Placeable placeableDR04 = measurable4.dR0(jNr2);
                long jNr3 = Constraints.nr(jNr2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i10);
                    if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj4), "Hint")) {
                        break;
                    }
                    i10++;
                }
                Measurable measurable5 = (Measurable) obj4;
                final Placeable placeableDR05 = measurable5 != null ? measurable5.dR0(jNr3) : null;
                int iAz = OutlinedTextFieldKt.az(TextFieldImplKt.KN(placeableDR0), TextFieldImplKt.KN(placeableDR02), placeableDR04.getWidth(), TextFieldImplKt.KN(placeableDR03), TextFieldImplKt.KN(placeableDR05), outlinedTextFieldMeasurePolicy.animationProgress, j3, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                int iQie = OutlinedTextFieldKt.qie(TextFieldImplKt.Uo(placeableDR0), TextFieldImplKt.Uo(placeableDR02), placeableDR04.getHeight(), TextFieldImplKt.Uo(placeableDR03), TextFieldImplKt.Uo(placeableDR05), outlinedTextFieldMeasurePolicy.animationProgress, j2, measureScope.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                int size6 = list.size();
                int i11 = 0;
                while (i11 < size6) {
                    Measurable measurable6 = (Measurable) list.get(i11);
                    if (Intrinsics.areEqual(LayoutIdKt.n(measurable6), "border")) {
                        final Placeable placeableDR06 = measurable6.dR0(ConstraintsKt.n(iAz != Integer.MAX_VALUE ? iAz : 0, iAz, iQie != Integer.MAX_VALUE ? iQie : 0, iQie));
                        final Placeable placeable = placeableDR04;
                        final int i12 = iAz;
                        final Placeable placeable2 = placeableDR02;
                        final int i13 = iQie;
                        final Placeable placeable3 = placeableDR0;
                        return MeasureScope.ER(measureScope, i12, i13, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$measure$1
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
                                OutlinedTextFieldKt.ck(placementScope, i13, i12, placeable3, placeable2, placeable, placeableDR03, placeableDR05, placeableDR06, outlinedTextFieldMeasurePolicy.animationProgress, outlinedTextFieldMeasurePolicy.singleLine, measureScope.getDensity(), measureScope.getLayoutDirection(), outlinedTextFieldMeasurePolicy.paddingValues);
                            }
                        }, 4, null);
                    }
                    i11++;
                    placeableDR04 = placeableDR04;
                    iAz = iAz;
                    placeableDR0 = placeableDR0;
                    iQie = iQie;
                    outlinedTextFieldMeasurePolicy = this;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i9++;
            outlinedTextFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            j3 = j2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int xMQ(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return KN(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return n(intrinsicMeasurable, num.intValue());
            }

            public final Integer n(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                return Integer.valueOf(intrinsicMeasurable.GR(i3));
            }
        });
    }

    public OutlinedTextFieldMeasurePolicy(Function1 function1, boolean z2, float f3, PaddingValues paddingValues) {
        this.onLabelMeasured = function1;
        this.singleLine = z2;
        this.animationProgress = f3;
        this.paddingValues = paddingValues;
    }
}
