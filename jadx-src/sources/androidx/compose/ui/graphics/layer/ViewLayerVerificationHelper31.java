package androidx.compose.ui.graphics.layer;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayerVerificationHelper31;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/compose/ui/graphics/RenderEffect;", "target", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/View;Landroidx/compose/ui/graphics/RenderEffect;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ViewLayerVerificationHelper31 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ViewLayerVerificationHelper31 f31745n = new ViewLayerVerificationHelper31();

    public final void n(View view, RenderEffect target) {
        view.setRenderEffect(target != null ? target.n() : null);
    }

    private ViewLayerVerificationHelper31() {
    }
}
