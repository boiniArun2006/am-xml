package QmE;

import QmE.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class l3D implements j.QUT {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f8607n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3D) && this.f8607n == ((l3D) obj).f8607n;
    }

    public int hashCode() {
        return Integer.hashCode(this.f8607n);
    }

    public final int n() {
        return this.f8607n;
    }

    public String toString() {
        return "LoadMoreTapped(page=" + this.f8607n + ")";
    }

    public l3D(int i2) {
        this.f8607n = i2;
    }
}
