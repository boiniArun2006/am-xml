package gwe;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final aC f67923n;
    private final Date rl;

    public qz(aC frameLoader, Date insertedTime) {
        Intrinsics.checkNotNullParameter(frameLoader, "frameLoader");
        Intrinsics.checkNotNullParameter(insertedTime, "insertedTime");
        this.f67923n = frameLoader;
        this.rl = insertedTime;
    }

    public final aC n() {
        return this.f67923n;
    }

    public final Date rl() {
        return this.rl;
    }
}
