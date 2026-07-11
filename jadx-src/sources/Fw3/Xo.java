package Fw3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Xo implements o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final uPp.o f3256n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Xo) && Intrinsics.areEqual(this.f3256n, ((Xo) obj).f3256n);
    }

    public Xo(uPp.o cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f3256n = cause;
    }

    public int hashCode() {
        return this.f3256n.hashCode();
    }

    public String toString() {
        return "VideoTextureRenderFailure(cause=" + this.f3256n + ')';
    }
}
