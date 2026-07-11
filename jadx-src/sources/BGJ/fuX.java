package BGJ;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.Lifecycle;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleOwner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class fuX implements j9J.n {
    private final View J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f416O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Object f417n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f418t = new Object();

    public static final class j extends ContextWrapper {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Fragment f419n;
        private final LifecycleEventObserver nr;
        private LayoutInflater rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private LayoutInflater f420t;

        /* JADX INFO: renamed from: BGJ.fuX$j$j, reason: collision with other inner class name */
        class C0011j implements LifecycleEventObserver {
            C0011j() {
            }

            @Override // androidx.view.LifecycleEventObserver
            public void Z(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    j.this.f419n = null;
                    j.this.rl = null;
                    j.this.f420t = null;
                }
            }
        }

        j(Context context, Fragment fragment) {
            super((Context) j9J.Ml.n(context));
            C0011j c0011j = new C0011j();
            this.nr = c0011j;
            this.rl = null;
            Fragment fragment2 = (Fragment) j9J.Ml.n(fragment);
            this.f419n = fragment2;
            fragment2.getLifecycleRegistry().n(c0011j);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.f420t == null) {
                if (this.rl == null) {
                    this.rl = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.f420t = this.rl.cloneInContext(this);
            }
            return this.f420t;
        }

        Fragment nr() {
            j9J.Ml.rl(this.f419n, "The fragment has already been destroyed.");
            return this.f419n;
        }

        j(LayoutInflater layoutInflater, Fragment fragment) {
            super((Context) j9J.Ml.n(((LayoutInflater) j9J.Ml.n(layoutInflater)).getContext()));
            C0011j c0011j = new C0011j();
            this.nr = c0011j;
            this.rl = layoutInflater;
            Fragment fragment2 = (Fragment) j9J.Ml.n(fragment);
            this.f419n = fragment2;
            fragment2.getLifecycleRegistry().n(c0011j);
        }
    }

    public interface n {
        Xsz.Ml HI();
    }

    public interface w6 {
        Xsz.Wre ty();
    }

    private Object n() {
        j9J.n nVarRl = rl(false);
        return this.f416O ? ((w6) p7j.j.n(nVarRl, w6.class)).ty().n(this.J2).build() : ((n) p7j.j.n(nVarRl, n.class)).HI().n(this.J2).build();
    }

    private static Context nr(Context context, Class cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    private j9J.n rl(boolean z2) {
        if (this.f416O) {
            Context contextT = t(j.class, z2);
            if (contextT instanceof j) {
                return (j9J.n) ((j) contextT).nr();
            }
            if (z2) {
                return null;
            }
            j9J.Ml.t(!(r5 instanceof j9J.n), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.J2.getClass(), t(j9J.n.class, z2).getClass().getName());
        } else {
            Object objT = t(j9J.n.class, z2);
            if (objT instanceof j9J.n) {
                return (j9J.n) objT;
            }
            if (z2) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.J2.getClass()));
    }

    private Context t(Class cls, boolean z2) {
        Context contextNr = nr(this.J2.getContext(), cls);
        if (contextNr != SNR.j.n(contextNr.getApplicationContext())) {
            return contextNr;
        }
        j9J.Ml.t(z2, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.J2.getClass());
        return null;
    }

    @Override // j9J.n
    public Object Z() {
        if (this.f417n == null) {
            synchronized (this.f418t) {
                try {
                    if (this.f417n == null) {
                        this.f417n = n();
                    }
                } finally {
                }
            }
        }
        return this.f417n;
    }

    public fuX(View view, boolean z2) {
        this.J2 = view;
        this.f416O = z2;
    }
}
