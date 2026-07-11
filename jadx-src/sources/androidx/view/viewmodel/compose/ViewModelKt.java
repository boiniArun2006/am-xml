package androidx.view.viewmodel.compose;

import androidx.compose.runtime.Composer;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"androidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt", "androidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModel_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
public final class ViewModelKt {
    public static final ViewModel n(ViewModelStoreOwner viewModelStoreOwner, KClass kClass, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        return ViewModelKt__ViewModelKt.n(viewModelStoreOwner, kClass, str, factory, creationExtras);
    }

    public static final ViewModel rl(Class cls, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i2, int i3) {
        return ViewModelKt__ViewModel_androidKt.n(cls, viewModelStoreOwner, str, factory, creationExtras, composer, i2, i3);
    }

    public static final ViewModel t(KClass kClass, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i2, int i3) {
        return ViewModelKt__ViewModelKt.rl(kClass, viewModelStoreOwner, str, factory, creationExtras, composer, i2, i3);
    }
}
