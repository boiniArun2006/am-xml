package androidx.view;

import androidx.view.ViewModelProvider;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", c.f62177j, "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 8, 0})
public final class ActivityViewModelLazyKt$viewModels$factoryPromise$2 extends Lambda implements Function0<ViewModelProvider.Factory> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f13179n;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ViewModelProvider.Factory invoke() {
        return this.f13179n.getDefaultViewModelProviderFactory();
    }
}
