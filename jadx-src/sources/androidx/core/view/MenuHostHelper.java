package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.view.Lifecycle;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleOwner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class MenuHostHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f36734n;
    private final CopyOnWriteArrayList rl = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f36735t = new HashMap();

    private static class LifecycleContainer {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Lifecycle f36736n;
        private LifecycleEventObserver rl;

        void n() {
            this.f36736n.nr(this.rl);
            this.rl = null;
        }

        LifecycleContainer(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            this.f36736n = lifecycle;
            this.rl = lifecycleEventObserver;
            lifecycle.n(lifecycleEventObserver);
        }
    }

    public void J2(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.rl.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).nr(menu, menuInflater);
        }
    }

    public boolean KN(MenuItem menuItem) {
        Iterator it = this.rl.iterator();
        while (it.hasNext()) {
            if (((MenuProvider) it.next()).t(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void Uo(Menu menu) {
        Iterator it = this.rl.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).n(menu);
        }
    }

    public void mUb(MenuProvider menuProvider) {
        this.rl.remove(menuProvider);
        LifecycleContainer lifecycleContainer = (LifecycleContainer) this.f36735t.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.n();
        }
        this.f36734n.run();
    }

    public void t(MenuProvider menuProvider) {
        this.rl.add(menuProvider);
        this.f36734n.run();
    }

    public void xMQ(Menu menu) {
        Iterator it = this.rl.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).rl(menu);
        }
    }

    public MenuHostHelper(Runnable runnable) {
        this.f36734n = runnable;
    }

    public static /* synthetic */ void n(MenuHostHelper menuHostHelper, Lifecycle.State state, MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        menuHostHelper.getClass();
        if (event == Lifecycle.Event.nr(state)) {
            menuHostHelper.t(menuProvider);
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            menuHostHelper.mUb(menuProvider);
        } else if (event == Lifecycle.Event.rl(state)) {
            menuHostHelper.rl.remove(menuProvider);
            menuHostHelper.f36734n.run();
        }
    }

    public static /* synthetic */ void rl(MenuHostHelper menuHostHelper, MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        menuHostHelper.getClass();
        if (event == Lifecycle.Event.ON_DESTROY) {
            menuHostHelper.mUb(menuProvider);
        }
    }

    public void O(final MenuProvider menuProvider, LifecycleOwner lifecycleOwner, final Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        LifecycleContainer lifecycleContainer = (LifecycleContainer) this.f36735t.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.n();
        }
        this.f36735t.put(menuProvider, new LifecycleContainer(lifecycle, new LifecycleEventObserver() { // from class: androidx.core.view.qz
            @Override // androidx.view.LifecycleEventObserver
            public final void Z(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MenuHostHelper.n(this.f36905n, state, menuProvider, lifecycleOwner2, event);
            }
        }));
    }

    public void nr(final MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        t(menuProvider);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        LifecycleContainer lifecycleContainer = (LifecycleContainer) this.f36735t.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.n();
        }
        this.f36735t.put(menuProvider, new LifecycleContainer(lifecycle, new LifecycleEventObserver() { // from class: androidx.core.view.Pl
            @Override // androidx.view.LifecycleEventObserver
            public final void Z(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MenuHostHelper.rl(this.f36748n, menuProvider, lifecycleOwner2, event);
            }
        }));
    }
}
