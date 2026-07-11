package androidx.compose.material3.carousel;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "direction", "", c.f62177j, "(Landroidx/compose/ui/graphics/Path;JLandroidx/compose/ui/unit/LayoutDirection;)V"}, k = 3, mv = {1, 8, 0})
final class CarouselItemScopeImpl$rememberMaskShape$1$1 extends Lambda implements Function3<Path, Size, LayoutDirection, Unit> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Density f28877O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ CarouselItemScopeImpl f28878n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Shape f28879t;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Path path, Size size, LayoutDirection layoutDirection) {
        n(path, size.getPackedValue(), layoutDirection);
        return Unit.INSTANCE;
    }

    public final void n(Path path, long j2, LayoutDirection layoutDirection) {
        Rect rectAYN = this.f28878n.getItemInfo().n().aYN(SizeKt.t(j2));
        OutlineKt.n(path, this.f28879t.n(rectAYN.Ik(), layoutDirection, this.f28877O));
        path.qie(OffsetKt.n(rectAYN.getLeft(), rectAYN.getTop()));
    }
}
