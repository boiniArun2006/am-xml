package androidx.transition;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Scene {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ViewGroup f42201n;
    private Runnable rl;

    public static Scene rl(ViewGroup viewGroup) {
        return (Scene) viewGroup.getTag(R.id.J2);
    }

    static void t(ViewGroup viewGroup, Scene scene) {
        viewGroup.setTag(R.id.J2, scene);
    }

    public void n() {
        Runnable runnable;
        if (rl(this.f42201n) != this || (runnable = this.rl) == null) {
            return;
        }
        runnable.run();
    }
}
