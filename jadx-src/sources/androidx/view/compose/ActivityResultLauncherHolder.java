package androidx.view.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import androidx.view.result.ActivityResultLauncher;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/activity/compose/ActivityResultLauncherHolder;", "I", "", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "", c.f62177j, "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "t", "()V", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/ActivityResultLauncher;", "getLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "rl", "(Landroidx/activity/result/ActivityResultLauncher;)V", "launcher", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ActivityResultLauncherHolder<I> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private ActivityResultLauncher launcher;

    public final void n(Object input, ActivityOptionsCompat options) {
        Unit unit;
        ActivityResultLauncher activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.rl(input, options);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void rl(ActivityResultLauncher activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void t() {
        Unit unit;
        ActivityResultLauncher activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.t();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
