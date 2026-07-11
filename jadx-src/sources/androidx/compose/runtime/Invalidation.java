package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R$\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/Invalidation;", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "", "location", "instances", "<init>", "(Landroidx/compose/runtime/RecomposeScopeImpl;ILjava/lang/Object;)V", "", "nr", "()Z", c.f62177j, "Landroidx/compose/runtime/RecomposeScopeImpl;", "t", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "rl", "I", "()I", "Ljava/lang/Object;", "()Ljava/lang/Object;", "O", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class Invalidation {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final RecomposeScopeImpl scope;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int location;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Object instances;

    public final void O(Object obj) {
        this.instances = obj;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Object getInstances() {
        return this.instances;
    }

    public final boolean nr() {
        return this.scope.aYN(this.instances);
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final RecomposeScopeImpl getScope() {
        return this.scope;
    }

    public Invalidation(RecomposeScopeImpl recomposeScopeImpl, int i2, Object obj) {
        this.scope = recomposeScopeImpl;
        this.location = i2;
        this.instances = obj;
    }
}
