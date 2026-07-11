package t2;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Wre implements I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IOException f73436n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Wre) && Intrinsics.areEqual(this.f73436n, ((Wre) obj).f73436n);
    }

    public Wre(IOException cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f73436n = cause;
    }

    public int hashCode() {
        return this.f73436n.hashCode();
    }

    public final IOException n() {
        return this.f73436n;
    }

    public String toString() {
        return "GenericIO(cause=" + this.f73436n + ')';
    }
}
