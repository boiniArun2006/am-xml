package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJC\u0010\u0016\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0019\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J,\u0010\u001f\u001a\u00020\u001e*\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J)\u0010#\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\"J)\u0010$\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010\"J)\u0010%\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010\"R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "", "onLabelMeasured", "", "singleLine", "", "animationProgress", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "<init>", "(Lkotlin/jvm/functions/Function1;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "KN", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "width", "J2", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "mUb", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "Uo", "O", "xMQ", c.f62177j, "Lkotlin/jvm/functions/Function1;", "Z", "t", "F", "nr", "Landroidx/compose/foundation/layout/PaddingValues;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1155:1\n116#2,2:1156\n33#2,6:1158\n118#2:1164\n116#2,2:1165\n33#2,6:1167\n118#2:1173\n116#2,2:1174\n33#2,6:1176\n118#2:1182\n116#2,2:1183\n33#2,6:1185\n118#2:1191\n116#2,2:1192\n33#2,6:1194\n118#2:1200\n116#2,2:1202\n33#2,6:1204\n118#2:1210\n544#2,2:1211\n33#2,6:1213\n546#2:1219\n116#2,2:1220\n33#2,6:1222\n118#2:1228\n544#2,2:1229\n33#2,6:1231\n546#2:1237\n544#2,2:1238\n33#2,6:1240\n546#2:1246\n116#2,2:1247\n33#2,6:1249\n118#2:1255\n116#2,2:1256\n33#2,6:1258\n118#2:1264\n116#2,2:1265\n33#2,6:1267\n118#2:1273\n116#2,2:1274\n33#2,6:1276\n118#2:1282\n116#2,2:1283\n33#2,6:1285\n118#2:1291\n116#2,2:1292\n33#2,6:1294\n118#2:1300\n116#2,2:1301\n33#2,6:1303\n118#2:1309\n116#2,2:1310\n33#2,6:1312\n118#2:1318\n116#2,2:1319\n33#2,6:1321\n118#2:1327\n116#2,2:1328\n33#2,6:1330\n118#2:1336\n116#2,2:1337\n33#2,6:1339\n118#2:1345\n544#2,2:1346\n33#2,6:1348\n546#2:1354\n116#2,2:1355\n33#2,6:1357\n118#2:1363\n116#2,2:1364\n33#2,6:1366\n118#2:1372\n1#3:1201\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n*L\n608#1:1156,2\n608#1:1158,6\n608#1:1164\n615#1:1165,2\n615#1:1167,6\n615#1:1173\n623#1:1174,2\n623#1:1176,6\n623#1:1182\n631#1:1183,2\n631#1:1185,6\n631#1:1191\n652#1:1192,2\n652#1:1194,6\n652#1:1200\n659#1:1202,2\n659#1:1204,6\n659#1:1210\n674#1:1211,2\n674#1:1213,6\n674#1:1219\n680#1:1220,2\n680#1:1222,6\n680#1:1228\n733#1:1229,2\n733#1:1231,6\n733#1:1237\n806#1:1238,2\n806#1:1240,6\n806#1:1246\n809#1:1247,2\n809#1:1249,6\n809#1:1255\n813#1:1256,2\n813#1:1258,6\n813#1:1264\n817#1:1265,2\n817#1:1267,6\n817#1:1273\n821#1:1274,2\n821#1:1276,6\n821#1:1282\n825#1:1283,2\n825#1:1285,6\n825#1:1291\n829#1:1292,2\n829#1:1294,6\n829#1:1300\n854#1:1301,2\n854#1:1303,6\n854#1:1309\n864#1:1310,2\n864#1:1312,6\n864#1:1318\n875#1:1319,2\n875#1:1321,6\n875#1:1327\n880#1:1328,2\n880#1:1330,6\n880#1:1336\n891#1:1337,2\n891#1:1339,6\n891#1:1345\n902#1:1346,2\n902#1:1348,6\n902#1:1354\n906#1:1355,2\n906#1:1357,6\n906#1:1363\n911#1:1364,2\n911#1:1366,6\n911#1:1372\n*E\n"})
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
        int iHI;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i3;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj), "Leading")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
        if (intrinsicMeasurable != null) {
            iHI = OutlinedTextFieldKt.HI(i2, intrinsicMeasurable.Nxk(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i2))).intValue();
        } else {
            iHI = i2;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i7);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj2), "Trailing")) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable2 != null) {
            iHI = OutlinedTextFieldKt.HI(iHI, intrinsicMeasurable2.Nxk(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i8);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj3), "Label")) {
                break;
            }
            i8++;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj3;
        int iIntValue4 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(MathHelpersKt.t(iHI, i2, this.animationProgress)))).intValue() : 0;
        int size4 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i9);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj4), "Prefix")) {
                break;
            }
            i9++;
        }
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj4;
        if (intrinsicMeasurable4 != null) {
            iIntValue3 = ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(iHI))).intValue();
            iHI = OutlinedTextFieldKt.HI(iHI, intrinsicMeasurable4.Nxk(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i10);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj5), "Suffix")) {
                break;
            }
            i10++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj5;
        if (intrinsicMeasurable5 != null) {
            int iIntValue5 = ((Number) function2.invoke(intrinsicMeasurable5, Integer.valueOf(iHI))).intValue();
            iHI = OutlinedTextFieldKt.HI(iHI, intrinsicMeasurable5.Nxk(Integer.MAX_VALUE));
            i3 = iIntValue5;
        } else {
            i3 = 0;
        }
        int size6 = list.size();
        for (int i11 = 0; i11 < size6; i11++) {
            Object obj8 = list.get(i11);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj8), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(obj8, Integer.valueOf(iHI))).intValue();
                int size7 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i12);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj6), "Hint")) {
                        break;
                    }
                    i12++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj6;
                int iIntValue7 = intrinsicMeasurable6 != null ? ((Number) function2.invoke(intrinsicMeasurable6, Integer.valueOf(iHI))).intValue() : 0;
                int size8 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj9 = list.get(i13);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj9), "Supporting")) {
                        obj7 = obj9;
                        break;
                    }
                    i13++;
                }
                IntrinsicMeasurable intrinsicMeasurable7 = (IntrinsicMeasurable) obj7;
                return OutlinedTextFieldKt.xMQ(iIntValue, iIntValue2, iIntValue3, i3, iIntValue6, iIntValue4, iIntValue7, intrinsicMeasurable7 != null ? ((Number) function2.invoke(intrinsicMeasurable7, Integer.valueOf(i2))).intValue() : 0, this.animationProgress, TextFieldImplKt.o(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int KN(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj7 = list.get(i3);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj7), "TextField")) {
                int iIntValue = ((Number) function2.invoke(obj7, Integer.valueOf(i2))).intValue();
                int size2 = list.size();
                int i5 = 0;
                while (true) {
                    obj = null;
                    if (i5 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i5);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj2), "Label")) {
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
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj3), "Trailing")) {
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
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj4), "Leading")) {
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
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i9);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj5), "Prefix")) {
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
                int iIntValue5 = intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i2))).intValue() : 0;
                int size6 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i10);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj6), "Suffix")) {
                        break;
                    }
                    i10++;
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj6;
                int iIntValue6 = intrinsicMeasurable5 != null ? ((Number) function2.invoke(intrinsicMeasurable5, Integer.valueOf(i2))).intValue() : 0;
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i11);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i11++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj;
                return OutlinedTextFieldKt.mUb(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, intrinsicMeasurable6 != null ? ((Number) function2.invoke(intrinsicMeasurable6, Integer.valueOf(i2))).intValue() : 0, this.animationProgress, TextFieldImplKt.o(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int O(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return KN(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1
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
        return J2(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1
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
        return J2(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1
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
        Object obj4;
        Placeable placeable;
        Object obj5;
        Object obj6;
        Object obj7;
        final OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        final MeasureScope measureScope2 = measureScope;
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
        int iS = TextFieldImplKt.S(placeableDR0);
        int iMax = Math.max(0, TextFieldImplKt.Z(placeableDR0));
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
        Placeable placeableDR02 = measurable2 != null ? measurable2.dR0(ConstraintsKt.mUb(jNr, -iS, 0, 2, null)) : null;
        int iS2 = iS + TextFieldImplKt.S(placeableDR02);
        int iMax2 = Math.max(iMax, TextFieldImplKt.Z(placeableDR02));
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj3), "Prefix")) {
                break;
            }
            i5++;
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable placeableDR03 = measurable3 != null ? measurable3.dR0(ConstraintsKt.mUb(jNr, -iS2, 0, 2, null)) : null;
        int iS3 = iS2 + TextFieldImplKt.S(placeableDR03);
        int iMax3 = Math.max(iMax2, TextFieldImplKt.Z(placeableDR03));
        int size4 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i7);
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj4), "Suffix")) {
                break;
            }
            i7++;
        }
        Measurable measurable4 = (Measurable) obj4;
        Placeable placeableDR04 = measurable4 != null ? measurable4.dR0(ConstraintsKt.mUb(jNr, -iS3, 0, 2, null)) : null;
        int iS4 = iS3 + TextFieldImplKt.S(placeableDR04);
        int iMax4 = Math.max(iMax3, TextFieldImplKt.Z(placeableDR04));
        int iHow2 = measureScope2.How(outlinedTextFieldMeasurePolicy.paddingValues.rl(measureScope2.getLayoutDirection())) + measureScope2.How(outlinedTextFieldMeasurePolicy.paddingValues.t(measureScope2.getLayoutDirection()));
        int i8 = -iS4;
        int i9 = -iHow;
        long jXMQ = ConstraintsKt.xMQ(jNr, MathHelpersKt.t(i8 - iHow2, -iHow2, outlinedTextFieldMeasurePolicy.animationProgress), i9);
        int size5 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size5) {
                placeable = placeableDR0;
                obj5 = null;
                break;
            }
            obj5 = list.get(i10);
            int i11 = i10;
            placeable = placeableDR0;
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj5), "Label")) {
                break;
            }
            i10 = i11 + 1;
            placeableDR0 = placeable;
        }
        Measurable measurable5 = (Measurable) obj5;
        final Placeable placeableDR05 = measurable5 != null ? measurable5.dR0(jXMQ) : null;
        outlinedTextFieldMeasurePolicy.onLabelMeasured.invoke(Size.t(placeableDR05 != null ? SizeKt.n(placeableDR05.getWidth(), placeableDR05.getHeight()) : Size.INSTANCE.rl()));
        int size6 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list.get(i12);
            int i13 = size6;
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj6), "Supporting")) {
                break;
            }
            i12++;
            size6 = i13;
        }
        Measurable measurable6 = (Measurable) obj6;
        int iFX = measurable6 != null ? measurable6.FX(Constraints.ty(j2)) : 0;
        int iMax5 = Math.max(TextFieldImplKt.Z(placeableDR05) / 2, measureScope2.How(outlinedTextFieldMeasurePolicy.paddingValues.getTop()));
        long jNr2 = Constraints.nr(ConstraintsKt.xMQ(j2, i8, (i9 - iMax5) - iFX), 0, 0, 0, 0, 11, null);
        int size7 = list.size();
        final Placeable placeable2 = placeableDR03;
        int i14 = 0;
        while (i14 < size7) {
            int i15 = size7;
            Measurable measurable7 = (Measurable) list.get(i14);
            final Placeable placeable3 = placeableDR04;
            final Placeable placeable4 = placeableDR02;
            if (Intrinsics.areEqual(LayoutIdKt.n(measurable7), "TextField")) {
                final Placeable placeableDR06 = measurable7.dR0(jNr2);
                long jNr3 = Constraints.nr(jNr2, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i16);
                    int i17 = size8;
                    int i18 = i16;
                    if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj7), "Hint")) {
                        break;
                    }
                    i16 = i18 + 1;
                    size8 = i17;
                }
                Measurable measurable8 = (Measurable) obj7;
                final Placeable placeableDR07 = measurable8 != null ? measurable8.dR0(jNr3) : null;
                int iMax6 = Math.max(iMax4, Math.max(TextFieldImplKt.Z(placeableDR06), TextFieldImplKt.Z(placeableDR07)) + iMax5 + iHow);
                int iMUb = OutlinedTextFieldKt.mUb(TextFieldImplKt.S(placeable), TextFieldImplKt.S(placeable4), TextFieldImplKt.S(placeable2), TextFieldImplKt.S(placeable3), placeableDR06.getWidth(), TextFieldImplKt.S(placeableDR05), TextFieldImplKt.S(placeableDR07), outlinedTextFieldMeasurePolicy.animationProgress, j2, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                int i19 = iMUb;
                final Placeable placeableDR08 = measurable6 != null ? measurable6.dR0(Constraints.nr(ConstraintsKt.mUb(jNr, 0, -iMax6, 1, null), 0, iMUb, 0, 0, 9, null)) : null;
                int iZ = TextFieldImplKt.Z(placeableDR08);
                final int iXMQ = OutlinedTextFieldKt.xMQ(TextFieldImplKt.Z(placeable), TextFieldImplKt.Z(placeable4), TextFieldImplKt.Z(placeable2), TextFieldImplKt.Z(placeable3), placeableDR06.getHeight(), TextFieldImplKt.Z(placeableDR05), TextFieldImplKt.Z(placeableDR07), TextFieldImplKt.Z(placeableDR08), outlinedTextFieldMeasurePolicy.animationProgress, j2, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                int i20 = iXMQ - iZ;
                int size9 = list.size();
                int i21 = 0;
                while (i21 < size9) {
                    Measurable measurable9 = (Measurable) list.get(i21);
                    if (Intrinsics.areEqual(LayoutIdKt.n(measurable9), "Container")) {
                        final Placeable placeableDR09 = measurable9.dR0(ConstraintsKt.n(i19 != Integer.MAX_VALUE ? i19 : 0, i19, i20 != Integer.MAX_VALUE ? i20 : 0, i20));
                        final int i22 = i19;
                        final Placeable placeable5 = placeable;
                        return MeasureScope.ER(measureScope, i22, iXMQ, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$measure$1
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
                                OutlinedTextFieldKt.az(placementScope, iXMQ, i22, placeable5, placeable4, placeable2, placeable3, placeableDR06, placeableDR05, placeableDR07, placeableDR09, placeableDR08, outlinedTextFieldMeasurePolicy.animationProgress, outlinedTextFieldMeasurePolicy.singleLine, measureScope2.getDensity(), measureScope2.getLayoutDirection(), outlinedTextFieldMeasurePolicy.paddingValues);
                            }
                        }, 4, null);
                    }
                    i21++;
                    outlinedTextFieldMeasurePolicy = this;
                    measureScope2 = measureScope;
                    i19 = i19;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i14++;
            outlinedTextFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            placeableDR02 = placeable4;
            size7 = i15;
            placeableDR04 = placeable3;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int xMQ(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return KN(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1
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
