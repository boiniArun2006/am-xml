package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "", c.f62177j, "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
final class WindowInsetsSizeKt$windowInsetsStartWidth$2 extends Lambda implements Function3<WindowInsets, LayoutDirection, Density, Integer> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final WindowInsetsSizeKt$windowInsetsStartWidth$2 f17924n = new WindowInsetsSizeKt$windowInsetsStartWidth$2();

    WindowInsetsSizeKt$windowInsetsStartWidth$2() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Integer invoke(WindowInsets windowInsets, LayoutDirection layoutDirection, Density density) {
        return Integer.valueOf(layoutDirection == LayoutDirection.f34160n ? windowInsets.nr(density, layoutDirection) : windowInsets.rl(density, layoutDirection));
    }
}
