package N1;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IOException f6944n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I28) && Intrinsics.areEqual(this.f6944n, ((I28) obj).f6944n);
    }

    public I28(IOException cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f6944n = cause;
    }

    public int hashCode() {
        return this.f6944n.hashCode();
    }

    public final IOException n() {
        return this.f6944n;
    }

    public String toString() {
        return "FMIOFailure(cause=" + this.f6944n + ')';
    }
}
