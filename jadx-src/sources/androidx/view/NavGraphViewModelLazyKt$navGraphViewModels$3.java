package androidx.view;

import androidx.view.viewmodel.CreationExtras;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", c.f62177j, "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 8, 0})
public final class NavGraphViewModelLazyKt$navGraphViewModels$3 extends Lambda implements Function0<CreationExtras> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function0 f40119n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Lazy f40120t;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final CreationExtras invoke() {
        CreationExtras creationExtras;
        Function0 function0 = this.f40119n;
        return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? NavGraphViewModelLazyKt.J2(this.f40120t).getDefaultViewModelCreationExtras() : creationExtras;
    }
}
