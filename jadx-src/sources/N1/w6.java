package N1;

import java.io.FileNotFoundException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class w6 implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FileNotFoundException f6956n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6) && Intrinsics.areEqual(this.f6956n, ((w6) obj).f6956n);
    }

    public w6(FileNotFoundException cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f6956n = cause;
    }

    public int hashCode() {
        return this.f6956n.hashCode();
    }

    public final FileNotFoundException n() {
        return this.f6956n;
    }

    public String toString() {
        return "FMFileNotFoundFailure(cause=" + this.f6956n + ')';
    }
}
