package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0011\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0015\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001c\u001a\u00020\u001b*\u00020\u00172\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u001fJ)\u0010!\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u001fJ)\u0010\"\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/material3/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "", "singleLine", "", "animationProgress", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "<init>", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "KN", "(Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "J2", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "mUb", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "Uo", "O", "xMQ", c.f62177j, "Z", "F", "t", "Landroidx/compose/foundation/layout/PaddingValues;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1140:1\n116#2,2:1141\n33#2,6:1143\n118#2:1149\n116#2,2:1150\n33#2,6:1152\n118#2:1158\n116#2,2:1159\n33#2,6:1161\n118#2:1167\n116#2,2:1168\n33#2,6:1170\n118#2:1176\n116#2,2:1177\n33#2,6:1179\n118#2:1185\n116#2,2:1186\n33#2,6:1188\n118#2:1194\n544#2,2:1195\n33#2,6:1197\n546#2:1203\n116#2,2:1204\n33#2,6:1206\n118#2:1212\n544#2,2:1213\n33#2,6:1215\n546#2:1221\n544#2,2:1222\n33#2,6:1224\n546#2:1230\n116#2,2:1231\n33#2,6:1233\n118#2:1239\n116#2,2:1241\n33#2,6:1243\n118#2:1249\n116#2,2:1250\n33#2,6:1252\n118#2:1258\n116#2,2:1259\n33#2,6:1261\n118#2:1267\n116#2,2:1268\n33#2,6:1270\n118#2:1276\n116#2,2:1277\n33#2,6:1279\n118#2:1285\n116#2,2:1286\n33#2,6:1288\n118#2:1294\n116#2,2:1295\n33#2,6:1297\n118#2:1303\n116#2,2:1304\n33#2,6:1306\n118#2:1312\n116#2,2:1313\n33#2,6:1315\n118#2:1321\n116#2,2:1322\n33#2,6:1324\n118#2:1330\n544#2,2:1331\n33#2,6:1333\n546#2:1339\n116#2,2:1340\n33#2,6:1342\n118#2:1348\n116#2,2:1349\n33#2,6:1351\n118#2:1357\n1#3:1240\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n*L\n593#1:1141,2\n593#1:1143,6\n593#1:1149\n600#1:1150,2\n600#1:1152,6\n600#1:1158\n608#1:1159,2\n608#1:1161,6\n608#1:1167\n616#1:1168,2\n616#1:1170,6\n616#1:1176\n628#1:1177,2\n628#1:1179,6\n628#1:1185\n632#1:1186,2\n632#1:1188,6\n632#1:1194\n646#1:1195,2\n646#1:1197,6\n646#1:1203\n652#1:1204,2\n652#1:1206,6\n652#1:1212\n701#1:1213,2\n701#1:1215,6\n701#1:1221\n793#1:1222,2\n793#1:1224,6\n793#1:1230\n796#1:1231,2\n796#1:1233,6\n796#1:1239\n800#1:1241,2\n800#1:1243,6\n800#1:1249\n804#1:1250,2\n804#1:1252,6\n804#1:1258\n808#1:1259,2\n808#1:1261,6\n808#1:1267\n812#1:1268,2\n812#1:1270,6\n812#1:1276\n816#1:1277,2\n816#1:1279,6\n816#1:1285\n838#1:1286,2\n838#1:1288,6\n838#1:1294\n848#1:1295,2\n848#1:1297,6\n848#1:1303\n858#1:1304,2\n858#1:1306,6\n858#1:1312\n863#1:1313,2\n863#1:1315,6\n863#1:1321\n874#1:1322,2\n874#1:1324,6\n874#1:1330\n885#1:1331,2\n885#1:1333,6\n885#1:1339\n888#1:1340,2\n888#1:1342,6\n888#1:1348\n893#1:1349,2\n893#1:1351,6\n893#1:1357\n*E\n"})
final class TextFieldMeasurePolicy implements MeasurePolicy {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float animationProgress;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final PaddingValues paddingValues;

    private final int J2(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2, Function2 function2) {
        Object obj;
        int i3;
        int iCk;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i5;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i7);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj), "Leading")) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
        if (intrinsicMeasurable != null) {
            i3 = i2;
            iCk = TextFieldKt.ck(i3, intrinsicMeasurable.Nxk(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i3))).intValue();
        } else {
            i3 = i2;
            iCk = i3;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i8);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj2), "Trailing")) {
                break;
            }
            i8++;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable2 != null) {
            iCk = TextFieldKt.ck(iCk, intrinsicMeasurable2.Nxk(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i3))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i9);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj3), "Label")) {
                break;
            }
            i9++;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj3;
        int iIntValue4 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(iCk))).intValue() : 0;
        int size4 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i10);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj4), "Prefix")) {
                break;
            }
            i10++;
        }
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj4;
        if (intrinsicMeasurable4 != null) {
            iIntValue3 = ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(iCk))).intValue();
            iCk = TextFieldKt.ck(iCk, intrinsicMeasurable4.Nxk(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i11);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj5), "Suffix")) {
                break;
            }
            i11++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj5;
        if (intrinsicMeasurable5 != null) {
            int iIntValue5 = ((Number) function2.invoke(intrinsicMeasurable5, Integer.valueOf(iCk))).intValue();
            iCk = TextFieldKt.ck(iCk, intrinsicMeasurable5.Nxk(Integer.MAX_VALUE));
            i5 = iIntValue5;
        } else {
            i5 = 0;
        }
        int size6 = list.size();
        for (int i12 = 0; i12 < size6; i12++) {
            Object obj8 = list.get(i12);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj8), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(obj8, Integer.valueOf(iCk))).intValue();
                int size7 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i13);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj6), "Hint")) {
                        break;
                    }
                    i13++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj6;
                int iIntValue7 = intrinsicMeasurable6 != null ? ((Number) function2.invoke(intrinsicMeasurable6, Integer.valueOf(iCk))).intValue() : 0;
                int size8 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i14);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj7), "Supporting")) {
                        break;
                    }
                    i14++;
                }
                IntrinsicMeasurable intrinsicMeasurable7 = (IntrinsicMeasurable) obj7;
                return TextFieldKt.xMQ(iIntValue6, iIntValue4, iIntValue, iIntValue2, iIntValue3, i5, iIntValue7, intrinsicMeasurable7 != null ? ((Number) function2.invoke(intrinsicMeasurable7, Integer.valueOf(i3))).intValue() : 0, this.animationProgress, TextFieldImplKt.o(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int KN(List measurables, int height, Function2 intrinsicMeasurer) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = measurables.get(i2);
            if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj7), "TextField")) {
                int iIntValue = ((Number) intrinsicMeasurer.invoke(obj7, Integer.valueOf(height))).intValue();
                int size2 = measurables.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = measurables.get(i3);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj2), "Label")) {
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
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj3), "Trailing")) {
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
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj4), "Prefix")) {
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
                        obj5 = null;
                        break;
                    }
                    obj5 = measurables.get(i8);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj5), "Suffix")) {
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
                int iIntValue5 = intrinsicMeasurable4 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable4, Integer.valueOf(height))).intValue() : 0;
                int size6 = measurables.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = measurables.get(i9);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj6), "Leading")) {
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj6;
                int iIntValue6 = intrinsicMeasurable5 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable5, Integer.valueOf(height))).intValue() : 0;
                int size7 = measurables.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size7) {
                        break;
                    }
                    Object obj8 = measurables.get(i10);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i10++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj;
                return TextFieldKt.mUb(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, intrinsicMeasurable6 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable6, Integer.valueOf(height))).intValue() : 0, TextFieldImplKt.o());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int O(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return KN(list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$maxIntrinsicWidth$1
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
        return J2(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$minIntrinsicHeight$1
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
        return J2(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$maxIntrinsicHeight$1
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
        long j3;
        Placeable placeableDR0;
        Object obj3;
        Object obj4;
        int i2;
        final Placeable placeable;
        Placeable placeable2;
        long j4;
        Placeable placeableDR02;
        Placeable placeable3;
        Object obj5;
        Placeable placeable4;
        Object obj6;
        Placeable placeable5;
        Object obj7;
        final TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        final MeasureScope measureScope2 = measureScope;
        List list2 = list;
        final int iHow = measureScope2.How(textFieldMeasurePolicy.paddingValues.getTop());
        int iHow2 = measureScope2.How(textFieldMeasurePolicy.paddingValues.getBottom());
        long jNr = Constraints.nr(j2, 0, 0, 0, 0, 10, null);
        int size = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i3);
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj), "Leading")) {
                break;
            }
            i3++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable placeableDR03 = measurable != null ? measurable.dR0(jNr) : null;
        int iS = TextFieldImplKt.S(placeableDR03);
        int iMax = Math.max(0, TextFieldImplKt.Z(placeableDR03));
        int size2 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i5);
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj2), "Trailing")) {
                break;
            }
            i5++;
        }
        Measurable measurable2 = (Measurable) obj2;
        if (measurable2 != null) {
            j3 = jNr;
            placeableDR0 = measurable2.dR0(ConstraintsKt.mUb(j3, -iS, 0, 2, null));
        } else {
            j3 = jNr;
            placeableDR0 = null;
        }
        int iS2 = iS + TextFieldImplKt.S(placeableDR0);
        int iMax2 = Math.max(iMax, TextFieldImplKt.Z(placeableDR0));
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i7);
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj3), "Prefix")) {
                break;
            }
            i7++;
        }
        Measurable measurable3 = (Measurable) obj3;
        final Placeable placeableDR04 = measurable3 != null ? measurable3.dR0(ConstraintsKt.mUb(j3, -iS2, 0, 2, null)) : null;
        int iS3 = iS2 + TextFieldImplKt.S(placeableDR04);
        int iMax3 = Math.max(iMax2, TextFieldImplKt.Z(placeableDR04));
        int size4 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i8);
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj4), "Suffix")) {
                break;
            }
            i8++;
        }
        Measurable measurable4 = (Measurable) obj4;
        if (measurable4 != null) {
            placeable = placeableDR0;
            i2 = iS3;
            placeable2 = placeableDR03;
            j4 = j3;
            placeableDR02 = measurable4.dR0(ConstraintsKt.mUb(j3, -iS3, 0, 2, null));
        } else {
            i2 = iS3;
            placeable = placeableDR0;
            placeable2 = placeableDR03;
            j4 = j3;
            placeableDR02 = null;
        }
        int iS4 = TextFieldImplKt.S(placeableDR02) + i2;
        int iMax4 = Math.max(iMax3, TextFieldImplKt.Z(placeableDR02));
        int i9 = -iS4;
        long jXMQ = ConstraintsKt.xMQ(j4, i9, -iHow2);
        int size5 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size5) {
                placeable3 = placeableDR02;
                obj5 = null;
                break;
            }
            obj5 = list2.get(i10);
            int i11 = i10;
            placeable3 = placeableDR02;
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj5), "Label")) {
                break;
            }
            i10 = i11 + 1;
            placeableDR02 = placeable3;
        }
        Measurable measurable5 = (Measurable) obj5;
        Placeable placeableDR05 = measurable5 != null ? measurable5.dR0(jXMQ) : null;
        int size6 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size6) {
                placeable4 = placeableDR05;
                obj6 = null;
                break;
            }
            obj6 = list2.get(i12);
            placeable4 = placeableDR05;
            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj6), "Supporting")) {
                break;
            }
            i12++;
            placeableDR05 = placeable4;
        }
        Measurable measurable6 = (Measurable) obj6;
        int iFX = measurable6 != null ? measurable6.FX(Constraints.ty(j2)) : 0;
        int iZ = TextFieldImplKt.Z(placeable4) + iHow;
        long j5 = j4;
        long jXMQ2 = ConstraintsKt.xMQ(Constraints.nr(j2, 0, 0, 0, 0, 11, null), i9, ((-iZ) - iHow2) - iFX);
        int size7 = list2.size();
        int i13 = 0;
        while (i13 < size7) {
            Measurable measurable7 = (Measurable) list2.get(i13);
            int i14 = size7;
            int i15 = iZ;
            if (Intrinsics.areEqual(LayoutIdKt.n(measurable7), "TextField")) {
                Placeable placeableDR06 = measurable7.dR0(jXMQ2);
                long jNr2 = Constraints.nr(jXMQ2, 0, 0, 0, 0, 14, null);
                int size8 = list2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size8) {
                        placeable5 = placeableDR06;
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i16);
                    placeable5 = placeableDR06;
                    int i17 = size8;
                    if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj7), "Hint")) {
                        break;
                    }
                    i16++;
                    size8 = i17;
                    placeableDR06 = placeable5;
                }
                Measurable measurable8 = (Measurable) obj7;
                final Placeable placeableDR07 = measurable8 != null ? measurable8.dR0(jNr2) : null;
                int iMax5 = Math.max(iMax4, Math.max(TextFieldImplKt.Z(placeable5), TextFieldImplKt.Z(placeableDR07)) + i15 + iHow2);
                int iMUb = TextFieldKt.mUb(TextFieldImplKt.S(placeable2), TextFieldImplKt.S(placeable), TextFieldImplKt.S(placeableDR04), TextFieldImplKt.S(placeable3), placeable5.getWidth(), TextFieldImplKt.S(placeable4), TextFieldImplKt.S(placeableDR07), j2);
                int i18 = iMUb;
                final Placeable placeableDR08 = measurable6 != null ? measurable6.dR0(Constraints.nr(ConstraintsKt.mUb(j5, 0, -iMax5, 1, null), 0, iMUb, 0, 0, 9, null)) : null;
                int iZ2 = TextFieldImplKt.Z(placeableDR08);
                int iXMQ = TextFieldKt.xMQ(placeable5.getHeight(), TextFieldImplKt.Z(placeable4), TextFieldImplKt.Z(placeable2), TextFieldImplKt.Z(placeable), TextFieldImplKt.Z(placeableDR04), TextFieldImplKt.Z(placeable3), TextFieldImplKt.Z(placeableDR07), TextFieldImplKt.Z(placeableDR08), textFieldMeasurePolicy.animationProgress, j2, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                int i19 = iXMQ - iZ2;
                int size9 = list2.size();
                int i20 = 0;
                while (i20 < size9) {
                    Measurable measurable9 = (Measurable) list2.get(i20);
                    final int i21 = iXMQ;
                    if (Intrinsics.areEqual(LayoutIdKt.n(measurable9), "Container")) {
                        final Placeable placeableDR09 = measurable9.dR0(ConstraintsKt.n(i18 != Integer.MAX_VALUE ? i18 : 0, i18, i19 != Integer.MAX_VALUE ? i19 : 0, i19));
                        final int i22 = i18;
                        final Placeable placeable6 = placeable2;
                        final Placeable placeable7 = placeable3;
                        final Placeable placeable8 = placeable4;
                        final Placeable placeable9 = placeable5;
                        return MeasureScope.ER(measureScope, i22, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$measure$1
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
                                Placeable placeable10 = placeable8;
                                if (placeable10 == null) {
                                    TextFieldKt.ty(placementScope, i22, i21, placeable9, placeableDR07, placeable6, placeable, placeableDR04, placeable7, placeableDR09, placeableDR08, textFieldMeasurePolicy.singleLine, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                                    return;
                                }
                                int i23 = i22;
                                int i24 = i21;
                                Placeable placeable11 = placeable9;
                                Placeable placeable12 = placeableDR07;
                                Placeable placeable13 = placeable6;
                                Placeable placeable14 = placeable;
                                Placeable placeable15 = placeableDR04;
                                Placeable placeable16 = placeable7;
                                Placeable placeable17 = placeableDR09;
                                Placeable placeable18 = placeableDR08;
                                boolean z2 = textFieldMeasurePolicy.singleLine;
                                int i25 = iHow;
                                TextFieldKt.az(placementScope, i23, i24, placeable11, placeable10, placeable12, placeable13, placeable14, placeable15, placeable16, placeable17, placeable18, z2, i25, i25 + placeable8.getHeight(), textFieldMeasurePolicy.animationProgress, measureScope2.getDensity());
                            }
                        }, 4, null);
                    }
                    i20++;
                    i18 = i18;
                    iXMQ = i21;
                    textFieldMeasurePolicy = this;
                    measureScope2 = measureScope;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i13++;
            textFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            iZ = i15;
            jXMQ2 = jXMQ2;
            size7 = i14;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int xMQ(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return KN(list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$minIntrinsicWidth$1
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
