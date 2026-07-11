package gIX;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Lu {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f67222n;
    private final byte[] nr;
    private final byte[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final byte[] f67223t;

    public Lu(byte[] large, byte[] medium, byte[] small, byte[] tiny) {
        Intrinsics.checkNotNullParameter(large, "large");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(small, "small");
        Intrinsics.checkNotNullParameter(tiny, "tiny");
        this.f67222n = large;
        this.rl = medium;
        this.f67223t = small;
        this.nr = tiny;
    }

    public final byte[] n() {
        return this.f67222n;
    }

    public final byte[] nr() {
        return this.nr;
    }

    public final byte[] rl() {
        return this.rl;
    }

    public final byte[] t() {
        return this.f67223t;
    }
}
