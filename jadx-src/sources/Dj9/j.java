package Dj9;

import androidx.fragment.app.Fragment;
import androidx.view.ComponentActivity;
import androidx.view.ViewModelProvider;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: Dj9.j$j, reason: collision with other inner class name */
    public interface InterfaceC0063j {
        w6 n();
    }

    public interface n {
        w6 n();
    }

    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Map f1909n;
        private final Xsz.I28 rl;

        private ViewModelProvider.Factory t(ViewModelProvider.Factory factory) {
            return new Dj9.w6(this.f1909n, (ViewModelProvider.Factory) j9J.Ml.n(factory), this.rl);
        }

        w6(Map map, Xsz.I28 i28) {
            this.f1909n = map;
            this.rl = i28;
        }

        ViewModelProvider.Factory n(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
            return t(factory);
        }

        ViewModelProvider.Factory rl(Fragment fragment, ViewModelProvider.Factory factory) {
            return t(factory);
        }
    }

    public static ViewModelProvider.Factory n(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
        return ((InterfaceC0063j) p7j.j.n(componentActivity, InterfaceC0063j.class)).n().n(componentActivity, factory);
    }

    public static ViewModelProvider.Factory rl(Fragment fragment, ViewModelProvider.Factory factory) {
        return ((n) p7j.j.n(fragment, n.class)).n().rl(fragment, factory);
    }
}
