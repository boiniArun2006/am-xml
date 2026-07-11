package FjR;

import GJW.xuv;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lifecycle f3048n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final xuv f3049t;

    public void n() {
        xuv.j.rl(this.f3049t, null, 1, null);
    }

    @Override // FjR.qz
    public void rl() {
        this.f3048n.nr(this);
    }

    @Override // FjR.qz
    public void start() {
        this.f3048n.n(this);
    }

    public j(Lifecycle lifecycle, xuv xuvVar) {
        this.f3048n = lifecycle;
        this.f3049t = xuvVar;
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void eF(LifecycleOwner lifecycleOwner) {
        n();
    }
}
