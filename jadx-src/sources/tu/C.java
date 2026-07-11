package tu;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C extends SPz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73862n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Throwable f73863t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(String message, int i2, Throwable th) {
        super(null);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f73862n = message;
        this.rl = i2;
        this.f73863t = th;
    }

    public final int n() {
        return this.rl;
    }
}
