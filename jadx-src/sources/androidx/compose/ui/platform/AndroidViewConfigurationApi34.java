package androidx.compose.ui.platform;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidViewConfigurationApi34;", "", "<init>", "()V", "Landroid/view/ViewConfiguration;", "viewConfiguration", "", "rl", "(Landroid/view/ViewConfiguration;)F", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AndroidViewConfigurationApi34 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AndroidViewConfigurationApi34 f32861n = new AndroidViewConfigurationApi34();

    private AndroidViewConfigurationApi34() {
    }

    public final float n(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public final float rl(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }
}
