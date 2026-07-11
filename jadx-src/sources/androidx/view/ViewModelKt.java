package androidx.view;

import GJW.vd;
import androidx.view.viewmodel.internal.CloseableCoroutineScope;
import androidx.view.viewmodel.internal.CloseableCoroutineScopeKt;
import androidx.view.viewmodel.internal.SynchronizedObject;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", c.f62177j, "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "VIEW_MODEL_SCOPE_LOCK", "Landroidx/lifecycle/ViewModel;", "LGJW/vd;", "(Landroidx/lifecycle/ViewModel;)LGJW/vd;", "viewModelScope", "lifecycle-viewmodel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/ViewModelKt\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,233:1\n38#2:234\n23#3:235\n*S KotlinDebug\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/ViewModelKt\n*L\n225#1:234\n225#1:235\n*E\n"})
public final class ViewModelKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final SynchronizedObject f39005n = new SynchronizedObject();

    public static final vd n(ViewModel viewModel) {
        CloseableCoroutineScope closeableCoroutineScopeN;
        Intrinsics.checkNotNullParameter(viewModel, "<this>");
        synchronized (f39005n) {
            closeableCoroutineScopeN = (CloseableCoroutineScope) viewModel.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (closeableCoroutineScopeN == null) {
                closeableCoroutineScopeN = CloseableCoroutineScopeKt.n();
                viewModel.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", closeableCoroutineScopeN);
            }
        }
        return closeableCoroutineScopeN;
    }
}
