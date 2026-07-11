package Sr2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f9962n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ml) && Intrinsics.areEqual(this.f9962n, ((Ml) obj).f9962n);
    }

    public Ml(Map media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f9962n = media;
    }

    public int hashCode() {
        return this.f9962n.hashCode();
    }

    public final Map n() {
        return this.f9962n;
    }

    public String toString() {
        return "FMExternalRenderRequest(media=" + this.f9962n + ')';
    }
}
