package androidx.compose.ui.tooling;

import androidx.view.LifecycleRegistry;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/compose/ui/tooling/ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/activity/OnBackPressedDispatcher;", c.f62177j, "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycle", "()Landroidx/lifecycle/LifecycleRegistry;", "lifecycle", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1 implements OnBackPressedDispatcherOwner {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final OnBackPressedDispatcher onBackPressedDispatcher;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ComposeViewAdapter f33960t;

    @Override // androidx.view.LifecycleOwner
    /* JADX INFO: renamed from: getLifecycle */
    public LifecycleRegistry getLifecycleRegistry() {
        return this.f33960t.FakeSavedStateRegistryOwner.n();
    }

    @Override // androidx.view.OnBackPressedDispatcherOwner
    public OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }
}
