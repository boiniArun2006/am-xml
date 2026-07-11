package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0018J/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u0013J\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b \u0010\u0013J\u001d\u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b!\u0010\u0013J\u001d\u0010\"\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u0013J%\u0010$\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0018J\u001d\u0010%\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0013J\u001d\u0010&\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0013J\u001d\u0010'\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b'\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+¨\u0006."}, d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "cb", "", "recursive", "", "HI", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", "ck", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;)V", "Landroidx/fragment/app/Fragment;", InneractiveMediationDefs.GENDER_FEMALE, "onlyRecursive", "Uo", "(Landroidx/fragment/app/Fragment;Z)V", "rl", "Landroid/os/Bundle;", "savedInstanceState", "KN", "(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V", "t", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/view/View;", "v", "az", "(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V", "gh", "xMQ", "J2", "qie", "outState", "mUb", "ty", "nr", "O", "Landroidx/fragment/app/FragmentManager;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "lifecycleCallbacks", "FragmentLifecycleCallbacksHolder", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentLifecycleCallbacksDispatcher {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final FragmentManager fragmentManager;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final CopyOnWriteArrayList lifecycleCallbacks;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;", "", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "callback", "", "recursive", "<init>", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "()Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "rl", "Z", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class FragmentLifecycleCallbacksHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final FragmentManager.FragmentLifecycleCallbacks callback;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final boolean recursive;

        public FragmentLifecycleCallbacksHolder(FragmentManager.FragmentLifecycleCallbacks callback, boolean z2) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callback = callback;
            this.recursive = z2;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final FragmentManager.FragmentLifecycleCallbacks getCallback() {
            return this.callback;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final boolean getRecursive() {
            return this.recursive;
        }
    }

    public FragmentLifecycleCallbacksDispatcher(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.lifecycleCallbacks = new CopyOnWriteArrayList();
    }

    public final void HI(FragmentManager.FragmentLifecycleCallbacks cb2, boolean recursive) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        this.lifecycleCallbacks.add(new FragmentLifecycleCallbacksHolder(cb2, recursive));
    }

    public final void J2(Fragment f3, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().J2(f3, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().J2(this.fragmentManager, f3);
            }
        }
    }

    public final void KN(Fragment f3, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().KN(f3, savedInstanceState, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().KN(this.fragmentManager, f3, savedInstanceState);
            }
        }
    }

    public final void O(Fragment f3, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().O(f3, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().O(this.fragmentManager, f3);
            }
        }
    }

    public final void Uo(Fragment f3, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Context context = this.fragmentManager.EWS().getContext();
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().Uo(f3, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().Uo(this.fragmentManager, f3, context);
            }
        }
    }

    public final void az(Fragment f3, View v2, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Intrinsics.checkNotNullParameter(v2, "v");
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().az(f3, v2, savedInstanceState, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().az(this.fragmentManager, f3, v2, savedInstanceState);
            }
        }
    }

    public final void ck(FragmentManager.FragmentLifecycleCallbacks cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        synchronized (this.lifecycleCallbacks) {
            try {
                int size = this.lifecycleCallbacks.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (((FragmentLifecycleCallbacksHolder) this.lifecycleCallbacks.get(i2)).getCallback() == cb2) {
                        this.lifecycleCallbacks.remove(i2);
                        break;
                    }
                    i2++;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void gh(Fragment f3, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().gh(f3, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().gh(this.fragmentManager, f3);
            }
        }
    }

    public final void mUb(Fragment f3, Bundle outState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().mUb(f3, outState, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().mUb(this.fragmentManager, f3, outState);
            }
        }
    }

    public final void n(Fragment f3, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().n(f3, savedInstanceState, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().n(this.fragmentManager, f3, savedInstanceState);
            }
        }
    }

    public final void nr(Fragment f3, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().nr(f3, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().nr(this.fragmentManager, f3);
            }
        }
    }

    public final void qie(Fragment f3, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().qie(f3, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().qie(this.fragmentManager, f3);
            }
        }
    }

    public final void rl(Fragment f3, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Context context = this.fragmentManager.EWS().getContext();
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().rl(f3, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().rl(this.fragmentManager, f3, context);
            }
        }
    }

    public final void t(Fragment f3, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().t(f3, savedInstanceState, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().t(this.fragmentManager, f3, savedInstanceState);
            }
        }
    }

    public final void ty(Fragment f3, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().ty(f3, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().ty(this.fragmentManager, f3);
            }
        }
    }

    public final void xMQ(Fragment f3, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f3, "f");
        Fragment fragmentI = this.fragmentManager.i();
        if (fragmentI != null) {
            FragmentManager parentFragmentManager = fragmentI.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.UhV().xMQ(f3, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().xMQ(this.fragmentManager, f3);
            }
        }
    }
}
