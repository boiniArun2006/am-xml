package androidx.view.viewmodel.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "Landroidx/compose/runtime/ProvidedValue;", "nr", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "rl", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalViewModelStoreOwner", "t", "(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;", "current", "lifecycle-viewmodel-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocalViewModelStoreOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,49:1\n77#2:50\n*S KotlinDebug\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n*L\n35#1:50\n*E\n"})
public final class LocalViewModelStoreOwner {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final LocalViewModelStoreOwner f39076n = new LocalViewModelStoreOwner();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final ProvidableCompositionLocal LocalViewModelStoreOwner = CompositionLocalKt.O(null, new Function0() { // from class: androidx.lifecycle.viewmodel.compose.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalViewModelStoreOwner.rl();
        }
    }, 1, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f39077t = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelStoreOwner rl() {
        return null;
    }

    public final ProvidedValue nr(ViewModelStoreOwner viewModelStoreOwner) {
        return LocalViewModelStoreOwner.nr(viewModelStoreOwner);
    }

    private LocalViewModelStoreOwner() {
    }

    public final ViewModelStoreOwner t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-584162872, i2, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:34)");
        }
        ViewModelStoreOwner viewModelStoreOwnerN = (ViewModelStoreOwner) composer.ty(LocalViewModelStoreOwner);
        if (viewModelStoreOwnerN == null) {
            composer.eF(1260197609);
            viewModelStoreOwnerN = LocalViewModelStoreOwner_androidKt.n(composer, 0);
        } else {
            composer.eF(1260196493);
        }
        composer.Xw();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return viewModelStoreOwnerN;
    }
}
