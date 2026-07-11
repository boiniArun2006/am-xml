package stX;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f73361n;
    private final List rl;

    public eO(List operations, List followedBy) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        Intrinsics.checkNotNullParameter(followedBy, "followedBy");
        this.f73361n = operations;
        this.rl = followedBy;
    }

    public final List n() {
        return this.rl;
    }

    public final List rl() {
        return this.f73361n;
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.f73361n, ", ", null, null, 0, null, null, 62, null) + '(' + CollectionsKt.joinToString$default(this.rl, ";", null, null, 0, null, null, 62, null) + ')';
    }
}
