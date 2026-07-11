package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "rl", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "", "isPrioritizing", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "Landroidx/compose/ui/unit/Constraints;", c.f62177j, "(ZIIII)J", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultRowMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultRowMeasurePolicy$annotations", "()V", "DefaultRowMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,408:1\n79#2,6:409\n86#2,3:424\n89#2,2:433\n93#2:438\n347#3,9:415\n356#3,3:435\n4206#4,6:427\n1247#5,6:439\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n101#1:409,6\n101#1:424,3\n101#1:433,2\n101#1:438\n101#1:415,9\n101#1:435,3\n101#1:427,6\n125#1:439,6\n*E\n"})
public final class RowKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final MeasurePolicy f17774n = new RowMeasurePolicy(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie());

    public static final long n(boolean z2, int i2, int i3, int i5, int i7) {
        return !z2 ? ConstraintsKt.n(i2, i5, i3, i7) : Constraints.INSTANCE.rl(i2, i5, i3, i7);
    }

    public static final MeasurePolicy rl(Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Composer composer, int i2) {
        boolean z2;
        MeasurePolicy measurePolicy;
        if (ComposerKt.v()) {
            ComposerKt.p5(-837807694, i2, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:121)");
        }
        if (Intrinsics.areEqual(horizontal, Arrangement.f17400n.J2()) && Intrinsics.areEqual(vertical, Alignment.INSTANCE.qie())) {
            composer.eF(-848964613);
            composer.Xw();
            measurePolicy = f17774n;
        } else {
            composer.eF(-848913742);
            boolean z3 = false;
            if ((((i2 & 14) ^ 6) > 4 && composer.p5(horizontal)) || (i2 & 6) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((((i2 & 112) ^ 48) > 32 && composer.p5(vertical)) || (i2 & 48) == 32) {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            Object objIF = composer.iF();
            if (z4 || objIF == Composer.INSTANCE.n()) {
                objIF = new RowMeasurePolicy(horizontal, vertical);
                composer.o(objIF);
            }
            measurePolicy = (RowMeasurePolicy) objIF;
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return measurePolicy;
    }
}
