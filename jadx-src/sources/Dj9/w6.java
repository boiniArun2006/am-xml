package Dj9;

import android.app.Activity;
import androidx.view.SavedStateHandleSupport;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.viewmodel.CreationExtras;
import java.io.Closeable;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w6 implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final CreationExtras.Key f1910O = new j();
    private final ViewModelProvider.Factory nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ViewModelProvider.Factory f1911t;

    public interface Ml {
        Map n();

        Map rl();
    }

    class n implements ViewModelProvider.Factory {
        final /* synthetic */ Xsz.I28 rl;

        n(Xsz.I28 i28) {
            this.rl = i28;
        }

        private ViewModel nr(lFS.I28 i28, Class cls, CreationExtras creationExtras) {
            InterfaceC2342j interfaceC2342j = (InterfaceC2342j) ((Ml) p7j.j.n(i28, Ml.class)).n().get(cls);
            Function1 function1 = (Function1) creationExtras.n(w6.f1910O);
            Object obj = ((Ml) p7j.j.n(i28, Ml.class)).rl().get(cls);
            if (obj == null) {
                if (function1 != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (interfaceC2342j != null) {
                    return (ViewModel) interfaceC2342j.get();
                }
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            if (interfaceC2342j != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (function1 != null) {
                return (ViewModel) function1.invoke(obj);
            }
            throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel n(Class cls, CreationExtras creationExtras) {
            final Wre wre = new Wre();
            ViewModel viewModelNr = nr(this.rl.rl(SavedStateHandleSupport.n(creationExtras)).n(wre).build(), cls, creationExtras);
            viewModelNr.addCloseable(new Closeable() { // from class: Dj9.Ml
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    wre.n();
                }
            });
            return viewModelNr;
        }
    }

    /* JADX INFO: renamed from: Dj9.w6$w6, reason: collision with other inner class name */
    interface InterfaceC0064w6 {
        Map O();

        Xsz.I28 X();
    }

    class j implements CreationExtras.Key {
        j() {
        }
    }

    public static ViewModelProvider.Factory nr(Activity activity, ViewModelProvider.Factory factory) {
        InterfaceC0064w6 interfaceC0064w6 = (InterfaceC0064w6) p7j.j.n(activity, InterfaceC0064w6.class);
        return new w6(interfaceC0064w6.O(), factory, interfaceC0064w6.X());
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel n(Class cls, CreationExtras creationExtras) {
        return this.rl.containsKey(cls) ? this.nr.n(cls, creationExtras) : this.f1911t.n(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel t(Class cls) {
        return this.rl.containsKey(cls) ? this.nr.t(cls) : this.f1911t.t(cls);
    }

    public w6(Map map, ViewModelProvider.Factory factory, Xsz.I28 i28) {
        this.rl = map;
        this.f1911t = factory;
        this.nr = new n(i28);
    }
}
