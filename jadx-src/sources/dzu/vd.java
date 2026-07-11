package dzu;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class vd implements CoroutineContext.Key {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ThreadLocal f63581n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd) && Intrinsics.areEqual(this.f63581n, ((vd) obj).f63581n);
    }

    public int hashCode() {
        return this.f63581n.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f63581n + ')';
    }

    public vd(ThreadLocal threadLocal) {
        this.f63581n = threadLocal;
    }
}
