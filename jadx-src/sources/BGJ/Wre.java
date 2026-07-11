package BGJ;

import BGJ.fuX;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Wre implements j9J.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Fragment f413O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Object f414n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f415t = new Object();

    public interface j {
        Xsz.w6 T();
    }

    protected void O(Fragment fragment) {
    }

    private Object n() {
        j9J.Ml.rl(this.f413O.getHost(), "Hilt Fragments must be attached before creating the component.");
        j9J.Ml.t(this.f413O.getHost() instanceof j9J.n, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f413O.getHost().getClass());
        O(this.f413O);
        return ((j) p7j.j.n(this.f413O.getHost(), j.class)).T().n(this.f413O).build();
    }

    public static final Context nr(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static ContextWrapper rl(Context context, Fragment fragment) {
        return new fuX.j(context, fragment);
    }

    public static ContextWrapper t(LayoutInflater layoutInflater, Fragment fragment) {
        return new fuX.j(layoutInflater, fragment);
    }

    @Override // j9J.n
    public Object Z() {
        if (this.f414n == null) {
            synchronized (this.f415t) {
                try {
                    if (this.f414n == null) {
                        this.f414n = n();
                    }
                } finally {
                }
            }
        }
        return this.f414n;
    }

    public Wre(Fragment fragment) {
        this.f413O = fragment;
    }
}
