package androidx.view;

import androidx.view.ClassesInfoCache;
import androidx.view.Lifecycle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f38951n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ClassesInfoCache.CallbackInfo f38952t;

    @Override // androidx.view.LifecycleEventObserver
    public void Z(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f38952t.n(lifecycleOwner, event, this.f38951n);
    }

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f38951n = obj;
        this.f38952t = ClassesInfoCache.f38826t.t(obj.getClass());
    }
}
