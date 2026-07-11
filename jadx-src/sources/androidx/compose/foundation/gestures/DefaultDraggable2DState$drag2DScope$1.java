package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/gestures/DefaultDraggable2DState$drag2DScope$1", "Landroidx/compose/foundation/gestures/Drag2DScope;", "Landroidx/compose/ui/geometry/Offset;", "pixels", "", c.f62177j, "(J)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultDraggable2DState$drag2DScope$1 implements Drag2DScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ DefaultDraggable2DState f16612n;

    @Override // androidx.compose.foundation.gestures.Drag2DScope
    public void n(long pixels) {
        this.f16612n.getOnDelta().invoke(Offset.nr(pixels));
    }
}
