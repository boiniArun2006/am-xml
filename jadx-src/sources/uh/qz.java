package uh;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f74532n;
    private final pUk.fuX rl;

    public enum j {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    public static qz n(j jVar, pUk.fuX fux) {
        return new qz(jVar, fux);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qz)) {
            return false;
        }
        qz qzVar = (qz) obj;
        return this.f74532n.equals(qzVar.f74532n) && this.rl.equals(qzVar.rl);
    }

    public int hashCode() {
        return ((((1891 + this.f74532n.hashCode()) * 31) + this.rl.getKey().hashCode()) * 31) + this.rl.getData().hashCode();
    }

    public pUk.fuX rl() {
        return this.rl;
    }

    public j t() {
        return this.f74532n;
    }

    public String toString() {
        return "DocumentViewChange(" + this.rl + "," + this.f74532n + ")";
    }

    private qz(j jVar, pUk.fuX fux) {
        this.f74532n = jVar;
        this.rl = fux;
    }
}
