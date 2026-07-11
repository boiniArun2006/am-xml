package androidx.view.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/Lifecycle;", c.f62177j, "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "lifecycle-runtime-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LifecycleResumePauseEffectScope implements LifecycleOwner {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lifecycle lifecycle;

    @Override // androidx.view.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }
}
