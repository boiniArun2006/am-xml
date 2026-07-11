package KC;

import KC.s6u;
import androidx.view.DefaultLifecycleObserver;
import androidx.view.LifecycleOwner;
import androidx.view.MediatorLiveData;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.ActivityResultRegistry;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class xTb implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final MediatorLiveData f5242O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ActivityResultRegistry f5243n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ActivityResultLauncher f5244t;

    public xTb(ActivityResultRegistry registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f5243n = registry;
        this.f5242O = new MediatorLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(xTb xtb, boolean z2) {
        xtb.f5242O.ck(Boolean.valueOf(z2));
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void Uo(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f5244t = this.f5243n.az("onboarding", owner, new jL(), new ActivityResultCallback() { // from class: KC.l
            @Override // androidx.view.result.ActivityResultCallback
            public final void n(Object obj) {
                xTb.O(this.f5197n, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void nr(LifecycleOwner owner, Function1 onResult) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        this.f5242O.mUb(owner, new s6u.j(onResult));
    }

    public final void t() {
        ActivityResultLauncher activityResultLauncher = this.f5244t;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingLauncher");
            activityResultLauncher = null;
        }
        activityResultLauncher.n(Unit.INSTANCE);
    }
}
