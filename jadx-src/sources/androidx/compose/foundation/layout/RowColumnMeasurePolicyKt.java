package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "startIndex", "endIndex", "", "crossAxisOffset", "currentLineIndex", "Landroidx/compose/ui/layout/MeasureResult;", c.f62177j, "(Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;IIIIILandroidx/compose/ui/layout/MeasureScope;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;II[II)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRowColumnMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurePolicy.kt\nandroidx/compose/foundation/layout/RowColumnMeasurePolicyKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,280:1\n26#2:281\n26#2:285\n26#2:286\n26#2:292\n105#3:282\n105#3:283\n123#3:284\n101#3,10:293\n105#3:303\n46#4,5:287\n*S KotlinDebug\n*F\n+ 1 RowColumnMeasurePolicy.kt\nandroidx/compose/foundation/layout/RowColumnMeasurePolicyKt\n*L\n121#1:281\n173#1:285\n185#1:286\n194#1:292\n135#1:282\n144#1:283\n165#1:284\n220#1:293,10\n252#1:303\n187#1:287,5\n*E\n"})
public final class RowColumnMeasurePolicyKt {
    /* JADX WARN: Removed duplicated region for block: B:78:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MeasureResult n(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i2, int i3, int i5, int i7, int i8, MeasureScope measureScope, List list, Placeable[] placeableArr, int i9, int i10, int[] iArr, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        FlowLayoutData flowLayoutData;
        int i16;
        int i17;
        int iIntValue;
        int i18;
        int i19;
        FlowLayoutData flowLayoutData2;
        int[] iArr2;
        int i20;
        long j2;
        RowColumnMeasurePolicy rowColumnMeasurePolicy2;
        int i21;
        long j3 = i8;
        int i22 = i10 - i9;
        int[] iArr3 = new int[i22];
        int i23 = i9;
        float f3 = 0.0f;
        int i24 = 0;
        int i25 = 0;
        boolean z2 = false;
        int i26 = 0;
        int i27 = 0;
        while (true) {
            boolean z3 = true;
            if (i23 >= i10) {
                break;
            }
            Measurable measurable = (Measurable) list.get(i23);
            RowColumnParentData rowColumnParentDataT = RowColumnImplKt.t(measurable);
            float fO = RowColumnImplKt.O(rowColumnParentDataT);
            if (!z2 && !RowColumnImplKt.J2(rowColumnParentDataT)) {
                z3 = false;
            }
            if (fO > 0.0f) {
                f3 += fO;
                i26++;
                iArr2 = iArr3;
                i20 = i23;
                j2 = j3;
            } else {
                Integer numValueOf = (i7 == Integer.MAX_VALUE || rowColumnParentDataT == null || (flowLayoutData2 = rowColumnParentDataT.getFlowLayoutData()) == null) ? null : Integer.valueOf(Math.round(flowLayoutData2.getFillCrossAxisFraction() * i7));
                int i28 = i5 - i27;
                Placeable placeableDR0 = placeableArr[i23];
                if (placeableDR0 == null) {
                    i20 = i23;
                    j2 = j3;
                    i21 = i25;
                    iArr2 = iArr3;
                    rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
                    placeableDR0 = measurable.dR0(RowColumnMeasurePolicy.az(rowColumnMeasurePolicy2, 0, numValueOf != null ? numValueOf.intValue() : 0, i5 != Integer.MAX_VALUE ? i28 < 0 ? 0 : i28 : Integer.MAX_VALUE, numValueOf != null ? numValueOf.intValue() : i7, false, 16, null));
                } else {
                    iArr2 = iArr3;
                    i20 = i23;
                    j2 = j3;
                    rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
                    i21 = i25;
                }
                int iKN = rowColumnMeasurePolicy2.KN(placeableDR0);
                int iGh = rowColumnMeasurePolicy2.gh(placeableDR0);
                iArr2[i20 - i9] = iKN;
                int i29 = i28 - iKN;
                if (i29 < 0) {
                    i29 = 0;
                }
                int iMin = Math.min(i8, i29);
                i27 += iKN + iMin;
                int iMax = Math.max(i21, iGh);
                placeableArr[i20] = placeableDR0;
                i24 = iMin;
                i25 = iMax;
            }
            i23 = i20 + 1;
            z2 = z3;
            iArr3 = iArr2;
            j3 = j2;
        }
        int[] iArr4 = iArr3;
        long j4 = j3;
        RowColumnMeasurePolicy rowColumnMeasurePolicy3 = rowColumnMeasurePolicy;
        int i30 = i25;
        if (i26 == 0) {
            i27 -= i24;
            i14 = 0;
            i13 = 0;
        } else {
            long j5 = j4 * ((long) (i26 - 1));
            long jRound = ((long) ((i5 != Integer.MAX_VALUE ? i5 : i2) - i27)) - j5;
            if (jRound < 0) {
                jRound = 0;
            }
            float f4 = jRound / f3;
            for (int i31 = i9; i31 < i10; i31++) {
                jRound -= (long) Math.round(RowColumnImplKt.O(RowColumnImplKt.t((Measurable) list.get(i31))) * f4);
            }
            int i32 = i9;
            int i33 = 0;
            while (i32 < i10) {
                if (placeableArr[i32] == null) {
                    Measurable measurable2 = (Measurable) list.get(i32);
                    RowColumnParentData rowColumnParentDataT2 = RowColumnImplKt.t(measurable2);
                    float fO2 = RowColumnImplKt.O(rowColumnParentDataT2);
                    Integer numValueOf2 = (i7 == i12 || rowColumnParentDataT2 == null || (flowLayoutData = rowColumnParentDataT2.getFlowLayoutData()) == null) ? null : Integer.valueOf(Math.round(flowLayoutData.getFillCrossAxisFraction() * i7));
                    if (!(fO2 > 0.0f)) {
                        InlineClassHelperKt.rl("All weights <= 0 should have placeables");
                    }
                    int sign = MathKt.getSign(jRound);
                    long j6 = jRound - ((long) sign);
                    int i34 = 0;
                    int iMax2 = Math.max(0, Math.round(fO2 * f4) + sign);
                    if (RowColumnImplKt.rl(rowColumnParentDataT2)) {
                        i16 = Integer.MAX_VALUE;
                        if (iMax2 != Integer.MAX_VALUE) {
                            i17 = 0;
                            i34 = iMax2;
                        }
                        if (numValueOf2 == null) {
                            i15 = i16;
                            iIntValue = numValueOf2.intValue();
                        } else {
                            i15 = i16;
                            iIntValue = i17;
                        }
                        rowColumnMeasurePolicy3 = rowColumnMeasurePolicy;
                        Placeable placeableDR02 = measurable2.dR0(rowColumnMeasurePolicy3.n(i34, iIntValue, iMax2, numValueOf2 == null ? numValueOf2.intValue() : i7, true));
                        int iKN2 = rowColumnMeasurePolicy3.KN(placeableDR02);
                        int iGh2 = rowColumnMeasurePolicy3.gh(placeableDR02);
                        iArr4[i32 - i9] = iKN2;
                        i33 += iKN2;
                        int iMax3 = Math.max(i30, iGh2);
                        placeableArr[i32] = placeableDR02;
                        i30 = iMax3;
                        jRound = j6;
                    } else {
                        i16 = Integer.MAX_VALUE;
                    }
                    i17 = 0;
                    if (numValueOf2 == null) {
                    }
                    rowColumnMeasurePolicy3 = rowColumnMeasurePolicy;
                    Placeable placeableDR022 = measurable2.dR0(rowColumnMeasurePolicy3.n(i34, iIntValue, iMax2, numValueOf2 == null ? numValueOf2.intValue() : i7, true));
                    int iKN22 = rowColumnMeasurePolicy3.KN(placeableDR022);
                    int iGh22 = rowColumnMeasurePolicy3.gh(placeableDR022);
                    iArr4[i32 - i9] = iKN22;
                    i33 += iKN22;
                    int iMax32 = Math.max(i30, iGh22);
                    placeableArr[i32] = placeableDR022;
                    i30 = iMax32;
                    jRound = j6;
                } else {
                    i15 = i12;
                }
                i32++;
                i12 = i15;
            }
            i13 = 0;
            i14 = (int) (((long) i33) + j5);
            int i35 = i5 - i27;
            if (i14 < 0) {
                i14 = 0;
            }
            if (i14 > i35) {
                i14 = i35;
            }
        }
        int i36 = i30;
        if (z2) {
            int iMax4 = i13;
            int iMax5 = iMax4;
            for (int i37 = i9; i37 < i10; i37++) {
                Placeable placeable = placeableArr[i37];
                Intrinsics.checkNotNull(placeable);
                CrossAxisAlignment crossAxisAlignmentN = RowColumnImplKt.n(RowColumnImplKt.nr(placeable));
                Integer numRl = crossAxisAlignmentN != null ? crossAxisAlignmentN.rl(placeable) : null;
                if (numRl != null) {
                    int iIntValue2 = numRl.intValue();
                    int iGh3 = rowColumnMeasurePolicy3.gh(placeable);
                    iMax4 = Math.max(iMax4, iIntValue2 != Integer.MIN_VALUE ? numRl.intValue() : i13);
                    if (iIntValue2 == Integer.MIN_VALUE) {
                        iIntValue2 = iGh3;
                    }
                    iMax5 = Math.max(iMax5, iGh3 - iIntValue2);
                }
            }
            int i38 = iMax5;
            i19 = iMax4;
            i18 = i38;
        } else {
            i18 = i13;
            i19 = i18;
        }
        int i39 = i27 + i14;
        if (i39 < 0) {
            i39 = i13;
        }
        int iMax6 = Math.max(i39, i2);
        int iMax7 = Math.max(i36, Math.max(i3, i18 + i19));
        int[] iArr5 = new int[i22];
        rowColumnMeasurePolicy3.nr(iMax6, iArr4, iArr5, measureScope);
        return rowColumnMeasurePolicy3.J2(placeableArr, measureScope, i19, iArr5, iMax6, iMax7, iArr, i11, i9, i10);
    }
}
