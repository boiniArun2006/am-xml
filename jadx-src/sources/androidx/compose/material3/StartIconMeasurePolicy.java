package androidx.compose.material3;

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
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ,\u0010\u0012\u001a\u00020\u0011*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001b\u001a\u00020\u0016*\u00020\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001d\u0010\b\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/material3/StartIconMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function0;", "", "animationProgress", "Landroidx/compose/ui/unit/Dp;", "indicatorHorizontalPadding", "indicatorVerticalPadding", "startIconToLabelHorizontalPadding", "<init>", "(Lkotlin/jvm/functions/Function0;FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "O", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "width", "mUb", c.f62177j, "Lkotlin/jvm/functions/Function0;", "getAnimationProgress", "()Lkotlin/jvm/functions/Function0;", "F", "getIndicatorHorizontalPadding-D9Ej5fM", "()F", "t", "getIndicatorVerticalPadding-D9Ej5fM", "nr", "getStartIconToLabelHorizontalPadding-D9Ej5fM", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/StartIconMeasurePolicy\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,731:1\n86#2:732\n86#2:733\n86#2:752\n50#2:753\n86#2:754\n86#2:791\n50#2:792\n86#2:811\n544#3,2:734\n33#3,6:736\n546#3:742\n544#3,2:743\n33#3,6:745\n546#3:751\n544#3,2:755\n33#3,6:757\n546#3:763\n544#3,2:764\n33#3,6:766\n546#3:772\n544#3,2:773\n33#3,6:775\n546#3:781\n544#3,2:782\n33#3,6:784\n546#3:790\n544#3,2:793\n33#3,6:795\n546#3:801\n544#3,2:802\n33#3,6:804\n546#3:810\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/StartIconMeasurePolicy\n*L\n511#1:732\n512#1:733\n531#1:752\n531#1:753\n534#1:754\n573#1:791\n573#1:792\n586#1:811\n515#1:734,2\n515#1:736,6\n515#1:742\n520#1:743,2\n520#1:745,6\n520#1:751\n539#1:755,2\n539#1:757,6\n539#1:763\n547#1:764,2\n547#1:766,6\n547#1:772\n569#1:773,2\n569#1:775,6\n569#1:781\n571#1:782,2\n571#1:784,6\n571#1:790\n583#1:793,2\n583#1:795,6\n583#1:801\n585#1:802,2\n585#1:804,6\n585#1:810\n*E\n"})
final class StartIconMeasurePolicy implements MeasurePolicy {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function0 animationProgress;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float startIconToLabelHorizontalPadding;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float indicatorHorizontalPadding;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float indicatorVerticalPadding;

    public /* synthetic */ StartIconMeasurePolicy(Function0 function0, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, f3, f4, f5);
    }

    private StartIconMeasurePolicy(Function0 function0, float f3, float f4, float f5) {
        this.animationProgress = function0;
        this.indicatorHorizontalPadding = f3;
        this.indicatorVerticalPadding = f4;
        this.startIconToLabelHorizontalPadding = f5;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public MeasureResult rl(MeasureScope measureScope, List list, long j2) {
        MeasureScope measureScope2 = measureScope;
        float fFloatValue = ((Number) this.animationProgress.invoke()).floatValue();
        long jNr = Constraints.nr(j2, 0, 0, 0, 0, 10, null);
        float f3 = 2;
        long jXMQ = ConstraintsKt.xMQ(jNr, -measureScope2.How(Dp.KN(this.indicatorHorizontalPadding * f3)), -measureScope2.How(Dp.KN(this.indicatorVerticalPadding * f3)));
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Measurable measurable = (Measurable) list.get(i2);
            if (Intrinsics.areEqual(LayoutIdKt.n(measurable), "icon")) {
                Placeable placeableDR0 = measurable.dR0(jXMQ);
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = (Measurable) list.get(i3);
                    if (Intrinsics.areEqual(LayoutIdKt.n(measurable2), "label")) {
                        Placeable placeableDR02 = measurable2.dR0(ConstraintsKt.mUb(jXMQ, -(placeableDR0.getWidth() + measureScope2.How(this.startIconToLabelHorizontalPadding)), 0, 2, null));
                        int width = placeableDR0.getWidth() + placeableDR02.getWidth() + measureScope2.How(Dp.KN(this.startIconToLabelHorizontalPadding + Dp.KN(this.indicatorHorizontalPadding * f3)));
                        int iMax = Math.max(placeableDR0.getHeight(), placeableDR02.getHeight()) + measureScope2.How(Dp.KN(this.indicatorVerticalPadding * f3));
                        int iRoundToInt = MathKt.roundToInt(width * fFloatValue);
                        int size3 = list.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Measurable measurable3 = (Measurable) list.get(i5);
                            if (Intrinsics.areEqual(LayoutIdKt.n(measurable3), "indicatorRipple")) {
                                Placeable placeableDR03 = measurable3.dR0(ConstraintsKt.O(jNr, Constraints.INSTANCE.t(width, iMax)));
                                int size4 = list.size();
                                int i7 = 0;
                                while (i7 < size4) {
                                    Measurable measurable4 = (Measurable) list.get(i7);
                                    if (Intrinsics.areEqual(LayoutIdKt.n(measurable4), "indicator")) {
                                        return NavigationItemKt.gh(measureScope2, placeableDR02, placeableDR0, placeableDR03, measurable4.dR0(ConstraintsKt.O(jNr, Constraints.INSTANCE.t(iRoundToInt, iMax))), j2, this.startIconToLabelHorizontalPadding);
                                    }
                                    i7++;
                                    placeableDR0 = placeableDR0;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i5++;
                            placeableDR0 = placeableDR0;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    i3++;
                    measureScope2 = measureScope;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i2++;
            measureScope2 = measureScope;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int O(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            if (Intrinsics.areEqual(TextFieldImplKt.qie(intrinsicMeasurable), "icon")) {
                int iNxk = intrinsicMeasurable.Nxk(i2);
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i5);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie(intrinsicMeasurable2), "label")) {
                        return iNxk + intrinsicMeasurable2.Nxk(i2) + intrinsicMeasureScope.How(Dp.KN(Dp.KN(this.indicatorHorizontalPadding * 2) + this.startIconToLabelHorizontalPadding));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int mUb(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            if (Intrinsics.areEqual(TextFieldImplKt.qie(intrinsicMeasurable), "icon")) {
                int iG = intrinsicMeasurable.g(i2);
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i5);
                    if (Intrinsics.areEqual(TextFieldImplKt.qie(intrinsicMeasurable2), "label")) {
                        return Math.max(iG, intrinsicMeasurable2.g(i2)) + intrinsicMeasureScope.How(Dp.KN(this.indicatorVerticalPadding * 2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
