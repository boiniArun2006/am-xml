package androidx.view.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import androidx.view.result.ActivityResultLauncher;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/activity/compose/ManagedActivityResultLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "", "t", "()V", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "rl", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "Landroidx/activity/compose/ActivityResultLauncherHolder;", c.f62177j, "Landroidx/activity/compose/ActivityResultLauncherHolder;", "launcher", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ManagedActivityResultLauncher<I, O> extends ActivityResultLauncher<I> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncherHolder launcher;

    @Override // androidx.view.result.ActivityResultLauncher
    public void rl(Object input, ActivityOptionsCompat options) {
        this.launcher.n(input, options);
    }

    @Override // androidx.view.result.ActivityResultLauncher
    public void t() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
