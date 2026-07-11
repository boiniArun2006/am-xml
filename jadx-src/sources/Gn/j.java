package Gn;

import androidx.view.DefaultLifecycleObserver;
import androidx.view.LifecycleOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function0 f3740n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function0 f3741t;

    public j(Function0 onStartAction, Function0 onDestroyAction) {
        Intrinsics.checkNotNullParameter(onStartAction, "onStartAction");
        Intrinsics.checkNotNullParameter(onDestroyAction, "onDestroyAction");
        this.f3740n = onStartAction;
        this.f3741t = onDestroyAction;
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void M(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f3740n.invoke();
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void eF(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f3741t.invoke();
    }
}
