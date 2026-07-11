package t2;

import java.io.FileNotFoundException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml implements w6, I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FileNotFoundException f73435n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ml) && Intrinsics.areEqual(this.f73435n, ((Ml) obj).f73435n);
    }

    public Ml(FileNotFoundException cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f73435n = cause;
    }

    public int hashCode() {
        return this.f73435n.hashCode();
    }

    public final FileNotFoundException n() {
        return this.f73435n;
    }

    public String toString() {
        return "FileNotFound(cause=" + this.f73435n + ')';
    }
}
