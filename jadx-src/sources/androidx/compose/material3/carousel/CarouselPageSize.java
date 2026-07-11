package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PageSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001BO\u00126\u0010\t\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012RD\u0010\t\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R+\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b\"\u0004\b\u0019\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/carousel/CarouselPageSize;", "Landroidx/compose/foundation/pager/PageSize;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "availableSpace", "itemSpacing", "Landroidx/compose/material3/carousel/KeylineList;", "keylineList", "beforeContentPadding", "afterContentPadding", "<init>", "(Lkotlin/jvm/functions/Function2;FF)V", "Landroidx/compose/ui/unit/Density;", "", "pageSpacing", c.f62177j, "(Landroidx/compose/ui/unit/Density;II)I", "Lkotlin/jvm/functions/Function2;", "rl", "F", "t", "Landroidx/compose/material3/carousel/Strategy;", "<set-?>", "nr", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/material3/carousel/Strategy;", "(Landroidx/compose/material3/carousel/Strategy;)V", "strategyState", "strategy", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselPageSize\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,693:1\n81#2:694\n107#2,2:695\n*S KotlinDebug\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselPageSize\n*L\n379#1:694\n379#1:695,2\n*E\n"})
public final class CarouselPageSize implements PageSize {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function2 keylineList;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState strategyState = SnapshotStateKt__SnapshotStateKt.O(Strategy.INSTANCE.n(), null, 2, null);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float beforeContentPadding;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float afterContentPadding;

    private final void nr(Strategy strategy) {
        this.strategyState.setValue(strategy);
    }

    private final Strategy t() {
        return (Strategy) this.strategyState.getValue();
    }

    @Override // androidx.compose.foundation.pager.PageSize
    public int n(Density density, int i2, int i3) {
        float f3 = i2;
        float f4 = i3;
        nr(new Strategy((KeylineList) this.keylineList.invoke(Float.valueOf(f3), Float.valueOf(f4)), f3, f4, this.beforeContentPadding, this.afterContentPadding));
        return rl().getIsValid() ? MathKt.roundToInt(rl().O()) : i2;
    }

    public CarouselPageSize(Function2 function2, float f3, float f4) {
        this.keylineList = function2;
        this.beforeContentPadding = f3;
        this.afterContentPadding = f4;
    }

    public final Strategy rl() {
        return t();
    }
}
