package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/ViewLayerVerificationHelper28;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "target", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/View;I)V", "rl", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ViewLayerVerificationHelper28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ViewLayerVerificationHelper28 f33099n = new ViewLayerVerificationHelper28();

    private ViewLayerVerificationHelper28() {
    }

    public final void n(View view, int target) {
        view.setOutlineAmbientShadowColor(target);
    }

    public final void rl(View view, int target) {
        view.setOutlineSpotShadowColor(target);
    }
}
