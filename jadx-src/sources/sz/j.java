package sz;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f73387n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.areEqual(this.f73387n, ((j) obj).f73387n);
    }

    public j(n volumeShaper) {
        Intrinsics.checkNotNullParameter(volumeShaper, "volumeShaper");
        this.f73387n = volumeShaper;
    }

    public int hashCode() {
        return this.f73387n.hashCode();
    }

    public final n n() {
        return this.f73387n;
    }

    public String toString() {
        return "FMAudibleOptions(volumeShaper=" + this.f73387n + ')';
    }
}
