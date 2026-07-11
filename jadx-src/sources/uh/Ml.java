package uh;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Ml {

    /* JADX INFO: Access modifiers changed from: private */
    static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f74462n;

        private n() {
            this.f74462n = new ArrayList();
        }

        synchronized void n(Runnable runnable) {
            this.f74462n.add(runnable);
        }

        void rl() {
            for (Runnable runnable : this.f74462n) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    /* JADX INFO: renamed from: uh.Ml$Ml, reason: collision with other inner class name */
    public static class C1228Ml extends Fragment {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        n f74461n = new n();

        @Override // androidx.fragment.app.Fragment
        public void onStop() {
            n nVar;
            super.onStop();
            synchronized (this.f74461n) {
                nVar = this.f74461n;
                this.f74461n = new n();
            }
            nVar.rl();
        }
    }

    public static class w6 extends android.app.Fragment {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        n f74463n = new n();

        @Override // android.app.Fragment
        public void onStop() {
            n nVar;
            super.onStop();
            synchronized (this.f74463n) {
                nVar = this.f74463n;
                this.f74463n = new n();
            }
            nVar.rl();
        }
    }

    private static void J2(final FragmentActivity fragmentActivity, final Runnable runnable) {
        fragmentActivity.runOnUiThread(new Runnable() { // from class: uh.n
            @Override // java.lang.Runnable
            public final void run() {
                Ml.n(fragmentActivity, runnable);
            }
        });
    }

    private static void O(final Activity activity, final Runnable runnable) {
        wqP.n.t(!(activity instanceof FragmentActivity), "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", new Object[0]);
        activity.runOnUiThread(new Runnable() { // from class: uh.w6
            @Override // java.lang.Runnable
            public final void run() {
                Ml.rl(activity, runnable);
            }
        });
    }

    private static Object nr(Class cls, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Fragment with tag '" + str + "' is a " + obj.getClass().getName() + " but should be a " + cls.getName());
        }
    }

    public static com.google.firebase.firestore.s4 t(Activity activity, final com.google.firebase.firestore.s4 s4Var) {
        if (activity != null) {
            if (activity instanceof FragmentActivity) {
                Objects.requireNonNull(s4Var);
                J2((FragmentActivity) activity, new Runnable() { // from class: uh.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        s4Var.remove();
                    }
                });
                return s4Var;
            }
            Objects.requireNonNull(s4Var);
            O(activity, new Runnable() { // from class: uh.j
                @Override // java.lang.Runnable
                public final void run() {
                    s4Var.remove();
                }
            });
        }
        return s4Var;
    }

    public static /* synthetic */ void n(FragmentActivity fragmentActivity, Runnable runnable) {
        C1228Ml c1228Ml = (C1228Ml) nr(C1228Ml.class, fragmentActivity.getSupportFragmentManager().pJg("FirestoreOnStopObserverSupportFragment"), "FirestoreOnStopObserverSupportFragment");
        if (c1228Ml == null || c1228Ml.isRemoving()) {
            c1228Ml = new C1228Ml();
            fragmentActivity.getSupportFragmentManager().o().O(c1228Ml, "FirestoreOnStopObserverSupportFragment").gh();
            fragmentActivity.getSupportFragmentManager().ijL();
        }
        c1228Ml.f74461n.n(runnable);
    }

    public static /* synthetic */ void rl(Activity activity, Runnable runnable) {
        w6 w6Var = (w6) nr(w6.class, activity.getFragmentManager().findFragmentByTag("FirestoreOnStopObserverFragment"), "FirestoreOnStopObserverFragment");
        if (w6Var == null || w6Var.isRemoving()) {
            w6Var = new w6();
            activity.getFragmentManager().beginTransaction().add(w6Var, "FirestoreOnStopObserverFragment").commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        w6Var.f74463n.n(runnable);
    }
}
