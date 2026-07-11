package BGJ;

import android.content.Context;
import androidx.view.ComponentActivity;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.viewmodel.CreationExtras;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n implements j9J.n {
    private final Object J2 = new Object();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile lFS.n f425O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ViewModelStoreOwner f426n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f427t;

    static abstract class I28 {
        static OM5.j n() {
            return new Dj9.Wre();
        }
    }

    public interface Ml {
        OM5.j rl();
    }

    class j implements ViewModelProvider.Factory {
        final /* synthetic */ Context rl;

        j(Context context) {
            this.rl = context;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel n(Class cls, CreationExtras creationExtras) {
            CN3 cn3 = new CN3(creationExtras);
            return new w6(((InterfaceC0013n) OM5.n.n(this.rl, InterfaceC0013n.class)).O().n(cn3).build(), cn3);
        }
    }

    /* JADX INFO: renamed from: BGJ.n$n, reason: collision with other inner class name */
    public interface InterfaceC0013n {
        Xsz.n O();
    }

    static final class w6 extends ViewModel {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final lFS.n f429n;
        private final CN3 rl;

        lFS.n rl() {
            return this.f429n;
        }

        CN3 t() {
            return this.rl;
        }

        w6(lFS.n nVar, CN3 cn3) {
            this.f429n = nVar;
            this.rl = cn3;
        }

        @Override // androidx.view.ViewModel
        protected void onCleared() {
            super.onCleared();
            ((Dj9.Wre) ((Ml) p7j.j.n(this.f429n, Ml.class)).rl()).n();
        }
    }

    private lFS.n n() {
        return ((w6) nr(this.f426n, this.f427t).n(w6.class)).rl();
    }

    private ViewModelProvider nr(ViewModelStoreOwner viewModelStoreOwner, Context context) {
        return new ViewModelProvider(viewModelStoreOwner, new j(context));
    }

    @Override // j9J.n
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public lFS.n Z() {
        if (this.f425O == null) {
            synchronized (this.J2) {
                try {
                    if (this.f425O == null) {
                        this.f425O = n();
                    }
                } finally {
                }
            }
        }
        return this.f425O;
    }

    public CN3 t() {
        return ((w6) nr(this.f426n, this.f427t).n(w6.class)).t();
    }

    n(ComponentActivity componentActivity) {
        this.f426n = componentActivity;
        this.f427t = componentActivity;
    }
}
