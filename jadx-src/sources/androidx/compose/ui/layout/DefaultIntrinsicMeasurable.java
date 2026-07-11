package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import com.caoccao.javet.utils.Float16;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMinMax;", "minMax", "Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "widthHeight", "<init>", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "dR0", "(J)Landroidx/compose/ui/layout/Placeable;", "", "height", "GR", "(I)I", "Nxk", "width", "FX", "g", c.f62177j, "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getMeasurable", "()Landroidx/compose/ui/layout/IntrinsicMeasurable;", "t", "Landroidx/compose/ui/layout/IntrinsicMinMax;", "O", "Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "", "J2", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultIntrinsicMeasurable implements Measurable {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final IntrinsicWidthHeight widthHeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final IntrinsicMeasurable measurable;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final IntrinsicMinMax minMax;

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int FX(int width) {
        return this.measurable.FX(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int GR(int height) {
        return this.measurable.GR(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public Object J2() {
        return this.measurable.J2();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int Nxk(int height) {
        return this.measurable.Nxk(height);
    }

    @Override // androidx.compose.ui.layout.Measurable
    public Placeable dR0(long constraints) {
        IntrinsicWidthHeight intrinsicWidthHeight = this.widthHeight;
        IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.f32230n;
        int iQie = Float16.EXPONENT_SIGNIFICAND_MASK;
        if (intrinsicWidthHeight == intrinsicWidthHeight2) {
            int iNxk = this.minMax == IntrinsicMinMax.f32228t ? this.measurable.Nxk(Constraints.gh(constraints)) : this.measurable.GR(Constraints.gh(constraints));
            if (Constraints.Uo(constraints)) {
                iQie = Constraints.gh(constraints);
            }
            return new FixedSizeIntrinsicsPlaceable(iNxk, iQie);
        }
        int iG = this.minMax == IntrinsicMinMax.f32228t ? this.measurable.g(Constraints.qie(constraints)) : this.measurable.FX(Constraints.qie(constraints));
        if (Constraints.KN(constraints)) {
            iQie = Constraints.qie(constraints);
        }
        return new FixedSizeIntrinsicsPlaceable(iQie, iG);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int g(int width) {
        return this.measurable.g(width);
    }

    public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.measurable = intrinsicMeasurable;
        this.minMax = intrinsicMinMax;
        this.widthHeight = intrinsicWidthHeight;
    }
}
