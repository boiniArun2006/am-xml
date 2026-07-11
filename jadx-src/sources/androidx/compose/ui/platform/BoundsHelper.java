package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bb\u0018\u0000 \u00052\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/BoundsHelper;", "", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/app/Activity;)Landroid/graphics/Rect;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
interface BoundsHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f32867n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/BoundsHelper$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/platform/BoundsHelper;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Landroidx/compose/ui/platform/BoundsHelper;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f32867n = new Companion();

        public final BoundsHelper n() {
            int i2 = Build.VERSION.SDK_INT;
            return i2 >= 30 ? BoundsHelperApi30Impl.rl : i2 >= 29 ? BoundsHelperApi29Impl.rl : i2 >= 28 ? BoundsHelperApi28Impl.rl : BoundsHelperApi24Impl.rl;
        }

        private Companion() {
        }
    }

    Rect n(Activity activity);
}
