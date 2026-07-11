package uh;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class qf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f74528n;
    final pUk.z rl;

    public enum j {
        ASCENDING(1),
        DESCENDING(-1);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f74531n;

        int rl() {
            return this.f74531n;
        }

        j(int i2) {
            this.f74531n = i2;
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof qf)) {
            qf qfVar = (qf) obj;
            if (this.f74528n == qfVar.f74528n && this.rl.equals(qfVar.rl)) {
                return true;
            }
        }
        return false;
    }

    public static qf nr(j jVar, pUk.z zVar) {
        return new qf(jVar, zVar);
    }

    public int hashCode() {
        return ((899 + this.f74528n.hashCode()) * 31) + this.rl.hashCode();
    }

    int n(pUk.fuX fux, pUk.fuX fux2) {
        int iRl;
        int iXMQ;
        if (this.rl.equals(pUk.z.f72033t)) {
            iRl = this.f74528n.rl();
            iXMQ = fux.getKey().compareTo(fux2.getKey());
        } else {
            uB.s4 s4VarNr = fux.nr(this.rl);
            uB.s4 s4VarNr2 = fux2.nr(this.rl);
            wqP.n.t((s4VarNr == null || s4VarNr2 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
            iRl = this.f74528n.rl();
            iXMQ = pUk.SPz.xMQ(s4VarNr, s4VarNr2);
        }
        return iRl * iXMQ;
    }

    public j rl() {
        return this.f74528n;
    }

    public pUk.z t() {
        return this.rl;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f74528n == j.ASCENDING ? "" : "-");
        sb.append(this.rl.t());
        return sb.toString();
    }

    private qf(j jVar, pUk.z zVar) {
        this.f74528n = jVar;
        this.rl = zVar;
    }
}
