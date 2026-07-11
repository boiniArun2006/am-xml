package LM;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Md {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f5978n;
    private final File rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Md)) {
            return false;
        }
        Md md = (Md) obj;
        return Intrinsics.areEqual(this.f5978n, md.f5978n) && Intrinsics.areEqual(this.rl, md.rl);
    }

    public Md(String id, File file) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f5978n = id;
        this.rl = file;
    }

    public int hashCode() {
        return (this.f5978n.hashCode() * 31) + this.rl.hashCode();
    }

    public final File n() {
        return this.rl;
    }

    public final String rl() {
        return this.f5978n;
    }

    public String toString() {
        return "ProjectToPackage(id=" + this.f5978n + ", file=" + this.rl + ")";
    }
}
