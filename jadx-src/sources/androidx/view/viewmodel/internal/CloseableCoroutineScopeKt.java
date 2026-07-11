package androidx.view.viewmodel.internal;

import GJW.N;
import GJW.OU;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", c.f62177j, "()Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "lifecycle-viewmodel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CloseableCoroutineScopeKt {
    public static final CloseableCoroutineScope n() {
        CoroutineContext coroutineContextP0N;
        try {
            coroutineContextP0N = OU.t().p0N();
        } catch (IllegalStateException unused) {
            coroutineContextP0N = EmptyCoroutineContext.INSTANCE;
        } catch (NotImplementedError unused2) {
            coroutineContextP0N = EmptyCoroutineContext.INSTANCE;
        }
        return new CloseableCoroutineScope(coroutineContextP0N.plus(N.rl(null, 1, null)));
    }
}
