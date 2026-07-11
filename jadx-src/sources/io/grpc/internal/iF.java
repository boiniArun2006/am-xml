package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class iF {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f68613n = Collections.newSetFromMap(new IdentityHashMap());

    public final boolean n(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f68613n.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    protected abstract void rl();

    protected abstract void t();

    public final void O(Object obj, boolean z2) {
        int size = this.f68613n.size();
        if (z2) {
            this.f68613n.add(obj);
            if (size == 0) {
                rl();
                return;
            }
            return;
        }
        if (this.f68613n.remove(obj) && size == 1) {
            t();
        }
    }

    public final boolean nr() {
        return !this.f68613n.isEmpty();
    }
}
