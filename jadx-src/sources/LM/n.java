package LM;

import com.alightcreative.app.motion.scene.MediaUriInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediaUriInfo f6041n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f6041n, nVar.f6041n) && Intrinsics.areEqual(this.rl, nVar.rl);
    }

    public n(MediaUriInfo info, String filename) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(filename, "filename");
        this.f6041n = info;
        this.rl = filename;
    }

    public int hashCode() {
        return (this.f6041n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.rl;
    }

    public final MediaUriInfo rl() {
        return this.f6041n;
    }

    public String toString() {
        return "ProjectDependency(info=" + this.f6041n + ", filename=" + this.rl + ")";
    }
}
