package LM;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f6032n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f6033t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f6032n, jVar.f6032n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f6033t, jVar.f6033t);
    }

    public j(String filename, String hash, String proxyHash) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(proxyHash, "proxyHash");
        this.f6032n = filename;
        this.rl = hash;
        this.f6033t = proxyHash;
    }

    public int hashCode() {
        return (((this.f6032n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f6033t.hashCode();
    }

    public final String n() {
        return this.f6032n;
    }

    public final String rl() {
        return this.rl;
    }

    public final String t() {
        return this.f6033t;
    }

    public String toString() {
        return "ManifestEntry(filename=" + this.f6032n + ", hash=" + this.rl + ", proxyHash=" + this.f6033t + ")";
    }
}
