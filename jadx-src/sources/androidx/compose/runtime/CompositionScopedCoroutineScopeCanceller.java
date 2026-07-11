package androidx.compose.runtime;

import GJW.Lu;
import GJW.vd;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.PublishedApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;", "Landroidx/compose/runtime/RememberObserver;", "LGJW/vd;", "coroutineScope", "<init>", "(LGJW/vd;)V", "", "t", "()V", "O", "nr", c.f62177j, "LGJW/vd;", "()LGJW/vd;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PublishedApi
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final vd coroutineScope;

    @Override // androidx.compose.runtime.RememberObserver
    public void t() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void O() {
        vd vdVar = this.coroutineScope;
        if (vdVar instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) vdVar).n();
        } else {
            Lu.nr(vdVar, new LeftCompositionCancellationException());
        }
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final vd getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void nr() {
        vd vdVar = this.coroutineScope;
        if (vdVar instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) vdVar).n();
        } else {
            Lu.nr(vdVar, new LeftCompositionCancellationException());
        }
    }

    public CompositionScopedCoroutineScopeCanceller(vd vdVar) {
        this.coroutineScope = vdVar;
    }
}
