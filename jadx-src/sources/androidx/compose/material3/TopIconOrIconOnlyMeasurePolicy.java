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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0015\u001a\u00020\u0014*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u0019*\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\t\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001d\u0010\n\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001d\u0010\u000b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "", "hasLabel", "Lkotlin/Function0;", "", "animationProgress", "Landroidx/compose/ui/unit/Dp;", "indicatorHorizontalPadding", "indicatorVerticalPadding", "indicatorToLabelVerticalPadding", "topIconItemVerticalPadding", "<init>", "(ZLkotlin/jvm/functions/Function0;FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "width", "mUb", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", c.f62177j, "Z", "getHasLabel", "()Z", "Lkotlin/jvm/functions/Function0;", "getAnimationProgress", "()Lkotlin/jvm/functions/Function0;", "t", "F", "getIndicatorHorizontalPadding-D9Ej5fM", "()F", "nr", "getIndicatorVerticalPadding-D9Ej5fM", "O", "getIndicatorToLabelVerticalPadding-D9Ej5fM", "J2", "getTopIconItemVerticalPadding-D9Ej5fM", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,731:1\n544#2,2:732\n33#2,6:734\n546#2:740\n544#2,2:745\n33#2,6:747\n546#2:753\n544#2,2:754\n33#2,6:756\n546#2:762\n544#2,2:763\n33#2,6:765\n546#2:771\n544#2,2:772\n33#2,6:774\n546#2:780\n116#2,2:781\n33#2,6:783\n118#2:789\n86#3:741\n86#3:742\n86#3:743\n86#3:744\n86#3:790\n86#3:791\n50#3:792\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy\n*L\n419#1:732,2\n419#1:734,6\n419#1:740\n432#1:745,2\n432#1:747,6\n432#1:753\n440#1:754,2\n440#1:756,6\n440#1:762\n452#1:763,2\n452#1:765,6\n452#1:771\n481#1:772,2\n481#1:774,6\n481#1:780\n484#1:781,2\n484#1:783,6\n484#1:789\n422#1:741\n423#1:742\n427#1:743\n428#1:744\n487#1:790\n488#1:791\n487#1:792\n*E\n"})
final class TopIconOrIconOnlyMeasurePolicy implements MeasurePolicy {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float topIconItemVerticalPadding;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float indicatorToLabelVerticalPadding;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean hasLabel;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float indicatorVerticalPadding;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function0 animationProgress;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float indicatorHorizontalPadding;

    public /* synthetic */ TopIconOrIconOnlyMeasurePolicy(boolean z2, Function0 function0, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, function0, f3, f4, f5, f6);
    }

    private TopIconOrIconOnlyMeasurePolicy(boolean z2, Function0 function0, float f3, float f4, float f5, float f6) {
        this.hasLabel = z2;
        this.animationProgress = function0;
        this.indicatorHorizontalPadding = f3;
        this.indicatorVerticalPadding = f4;
        this.indicatorToLabelVerticalPadding = f5;
        this.topIconItemVerticalPadding = f6;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public MeasureResult rl(MeasureScope measureScope, List list, long j2) {
        MeasureScope measureScope2 = measureScope;
        float fFloatValue = ((Number) this.animationProgress.invoke()).floatValue();
        long jNr = Constraints.nr(j2, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Measurable measurable = (Measurable) list.get(i3);
            if (Intrinsics.areEqual(LayoutIdKt.n(measurable), "icon")) {
                float f3 = 2;
                Placeable placeableDR0 = measurable.dR0(ConstraintsKt.xMQ(jNr, -measureScope2.How(Dp.KN(this.indicatorHorizontalPadding * f3)), -measureScope2.How(Dp.KN(this.indicatorVerticalPadding * f3))));
                int width = placeableDR0.getWidth() + measureScope2.How(Dp.KN(this.indicatorHorizontalPadding * f3));
                int height = placeableDR0.getHeight() + measureScope2.How(Dp.KN(this.indicatorVerticalPadding * f3));
                int iRoundToInt = MathKt.roundToInt(width * fFloatValue);
                int size2 = list.size();
                int i5 = 0;
                while (i5 < size2) {
                    Measurable measurable2 = (Measurable) list.get(i5);
                    if (Intrinsics.areEqual(LayoutIdKt.n(measurable2), "indicatorRipple")) {
                        Placeable placeableDR02 = measurable2.dR0(ConstraintsKt.O(jNr, Constraints.INSTANCE.t(width, height)));
                        int size3 = list.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            Measurable measurable3 = (Measurable) list.get(i7);
                            if (Intrinsics.areEqual(LayoutIdKt.n(measurable3), "indicator")) {
                                Placeable placeableDR03 = measurable3.dR0(ConstraintsKt.O(jNr, Constraints.INSTANCE.t(iRoundToInt, height)));
                                if (!this.hasLabel) {
                                    return NavigationItemKt.mUb(measureScope2, placeableDR0, placeableDR02, placeableDR03, j2);
                                }
                                int size4 = list.size();
                                while (i2 < size4) {
                                    Measurable measurable4 = (Measurable) list.get(i2);
                                    if (Intrinsics.areEqual(LayoutIdKt.n(measurable4), "label")) {
                                        return NavigationItemKt.qie(measureScope2, measurable4.dR0(ConstraintsKt.mUb(jNr, 0, -(placeableDR03.getHeight() + measureScope2.How(this.indicatorToLabelVerticalPadding)), 1, null)), placeableDR0, placeableDR02, placeableDR03, j2, this.indicatorToLabelVerticalPadding, this.indicatorVerticalPadding, this.topIconItemVerticalPadding);
                                    }
                                    i2++;
                                    placeableDR0 = placeableDR0;
                                    placeableDR03 = placeableDR03;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i7++;
                            placeableDR0 = placeableDR0;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    i5++;
                    measureScope2 = measureScope;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i3++;
            measureScope2 = measureScope;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int mUb(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Object obj;
        int size = list.size();
        int iG = 0;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            if (Intrinsics.areEqual(TextFieldImplKt.qie(intrinsicMeasurable), "icon")) {
                int iG2 = intrinsicMeasurable.g(i2);
                int size2 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size2) {
                        obj = list.get(i5);
                        if (Intrinsics.areEqual(TextFieldImplKt.qie((IntrinsicMeasurable) obj), "label")) {
                            break;
                        }
                        i5++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj;
                if (intrinsicMeasurable2 != null) {
                    iG = intrinsicMeasurable2.g(i2);
                }
                float f3 = 2;
                return iG2 + iG + intrinsicMeasureScope.How(Dp.KN(Dp.KN(Dp.KN(this.topIconItemVerticalPadding * f3) + Dp.KN(this.indicatorVerticalPadding * f3)) + this.indicatorToLabelVerticalPadding));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
