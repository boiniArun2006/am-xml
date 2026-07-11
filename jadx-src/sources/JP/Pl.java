package JP;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final qz f4512n;
    private final io.grpc.SPz rl;

    public static Pl n(qz qzVar) {
        t1.Xo.O(qzVar != qz.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new Pl(qzVar, io.grpc.SPz.f68184O);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pl)) {
            return false;
        }
        Pl pl = (Pl) obj;
        return this.f4512n.equals(pl.f4512n) && this.rl.equals(pl.rl);
    }

    public int hashCode() {
        return this.f4512n.hashCode() ^ this.rl.hashCode();
    }

    public io.grpc.SPz nr() {
        return this.rl;
    }

    public qz t() {
        return this.f4512n;
    }

    public String toString() {
        if (this.rl.HI()) {
            return this.f4512n.toString();
        }
        return this.f4512n + "(" + this.rl + ")";
    }

    private Pl(qz qzVar, io.grpc.SPz sPz) {
        this.f4512n = (qz) t1.Xo.ck(qzVar, "state is null");
        this.rl = (io.grpc.SPz) t1.Xo.ck(sPz, "status is null");
    }

    public static Pl rl(io.grpc.SPz sPz) {
        t1.Xo.O(!sPz.HI(), "The error status must not be OK");
        return new Pl(qz.TRANSIENT_FAILURE, sPz);
    }
}
