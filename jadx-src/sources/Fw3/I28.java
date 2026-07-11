package Fw3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 implements o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final kG.I28 f3226n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I28) && Intrinsics.areEqual(this.f3226n, ((I28) obj).f3226n);
    }

    public I28(kG.I28 cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f3226n = cause;
    }

    public int hashCode() {
        return this.f3226n.hashCode();
    }

    public String toString() {
        return "GIFTextureRenderFailure(cause=" + this.f3226n + ')';
    }
}
