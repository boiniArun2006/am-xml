package bZx;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.appevents.Xo;
import com.facebook.s4;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f43355n = new n();

    public static final class j implements View.OnClickListener {
        private View.OnClickListener J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private WeakReference f43356O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Zfb.j f43357n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f43358r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private WeakReference f43359t;

        public j(Zfb.j mapping, View rootView, View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f43357n = mapping;
            this.f43359t = new WeakReference(hostView);
            this.f43356O = new WeakReference(rootView);
            this.J2 = Zfb.Wre.Uo(hostView);
            this.f43358r = true;
        }

        public final boolean n() {
            return this.f43358r;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!VmF.j.nr(this)) {
                try {
                    Intrinsics.checkNotNullParameter(view, "view");
                    View.OnClickListener onClickListener = this.J2;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    View view2 = (View) this.f43356O.get();
                    View view3 = (View) this.f43359t.get();
                    if (view2 != null && view3 != null) {
                        Zfb.j jVar = this.f43357n;
                        Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type com.facebook.appevents.codeless.internal.EventBinding");
                        n.nr(jVar, view2, view3);
                    }
                } catch (Throwable th) {
                    VmF.j.rl(th, this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: bZx.n$n, reason: collision with other inner class name */
    public static final class C0579n implements AdapterView.OnItemClickListener {
        private AdapterView.OnItemClickListener J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private WeakReference f43360O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Zfb.j f43361n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f43362r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private WeakReference f43363t;

        public C0579n(Zfb.j mapping, View rootView, AdapterView hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f43361n = mapping;
            this.f43363t = new WeakReference(hostView);
            this.f43360O = new WeakReference(rootView);
            this.J2 = hostView.getOnItemClickListener();
            this.f43362r = true;
        }

        public final boolean n() {
            return this.f43362r;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
            Intrinsics.checkNotNullParameter(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.J2;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i2, j2);
            }
            View view2 = (View) this.f43360O.get();
            AdapterView adapterView2 = (AdapterView) this.f43363t.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            n.nr(this.f43361n, view2, adapterView2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(String eventName, Bundle parameters) {
        if (VmF.j.nr(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "$eventName");
            Intrinsics.checkNotNullParameter(parameters, "$parameters");
            Xo.rl.Uo(s4.qie()).rl(eventName, parameters);
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    public static final void nr(Zfb.j mapping, View rootView, View hostView) {
        if (VmF.j.nr(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            final String strRl = mapping.rl();
            final Bundle bundleRl = CN3.J2.rl(mapping, rootView, hostView);
            f43355n.J2(bundleRl);
            s4.Z().execute(new Runnable() { // from class: bZx.j
                @Override // java.lang.Runnable
                public final void run() {
                    n.O(strRl, bundleRl);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    public static final j rl(Zfb.j mapping, View rootView, View hostView) {
        if (VmF.j.nr(n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new j(mapping, rootView, hostView);
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
            return null;
        }
    }

    public static final C0579n t(Zfb.j mapping, View rootView, AdapterView hostView) {
        if (VmF.j.nr(n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new C0579n(mapping, rootView, hostView);
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
            return null;
        }
    }

    public final void J2(Bundle parameters) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                parameters.putDouble("_valueToSum", UiE.fuX.J2(string));
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private n() {
    }
}
