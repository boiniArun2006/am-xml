package O6;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final j f7276t = new j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f7277n = new HashMap();
    private final Object rl = new Object();

    /* JADX INFO: renamed from: O6.j$j, reason: collision with other inner class name */
    private static class C0247j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Activity f7278n;
        private final Runnable rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Object f7279t;

        public boolean equals(Object obj) {
            if (!(obj instanceof C0247j)) {
                return false;
            }
            C0247j c0247j = (C0247j) obj;
            return c0247j.f7279t.equals(this.f7279t) && c0247j.rl == this.rl && c0247j.f7278n == this.f7278n;
        }

        public int hashCode() {
            return this.f7279t.hashCode();
        }

        public Activity n() {
            return this.f7278n;
        }

        public Object rl() {
            return this.f7279t;
        }

        public Runnable t() {
            return this.rl;
        }

        public C0247j(Activity activity, Runnable runnable, Object obj) {
            this.f7278n = activity;
            this.rl = runnable;
            this.f7279t = obj;
        }
    }

    private static class n extends LifecycleCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f7280n;

        public static n rl(Activity activity) {
            LifecycleFragment fragment = LifecycleCallback.getFragment(new LifecycleActivity(activity));
            n nVar = (n) fragment.getCallbackOrNull("StorageOnStopCallback", n.class);
            return nVar == null ? new n(fragment) : nVar;
        }

        public void n(C0247j c0247j) {
            synchronized (this.f7280n) {
                this.f7280n.add(c0247j);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            ArrayList<C0247j> arrayList;
            synchronized (this.f7280n) {
                arrayList = new ArrayList(this.f7280n);
                this.f7280n.clear();
            }
            for (C0247j c0247j : arrayList) {
                if (c0247j != null) {
                    Log.d("StorageOnStopCallback", "removing subscription from activity.");
                    c0247j.t().run();
                    j.n().rl(c0247j.rl());
                }
            }
        }

        public void t(C0247j c0247j) {
            synchronized (this.f7280n) {
                this.f7280n.remove(c0247j);
            }
        }

        private n(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.f7280n = new ArrayList();
            this.mLifecycleFragment.addCallback("StorageOnStopCallback", this);
        }
    }

    public static j n() {
        return f7276t;
    }

    public void rl(Object obj) {
        synchronized (this.rl) {
            try {
                C0247j c0247j = (C0247j) this.f7277n.get(obj);
                if (c0247j != null) {
                    n.rl(c0247j.n()).t(c0247j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(Activity activity, Object obj, Runnable runnable) {
        synchronized (this.rl) {
            C0247j c0247j = new C0247j(activity, runnable, obj);
            n.rl(activity).n(c0247j);
            this.f7277n.put(obj, c0247j);
        }
    }

    private j() {
    }
}
