package Ip;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class j extends o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f4312n;
    private final List rl;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f4312n.equals(oVar.t()) && this.rl.equals(oVar.rl())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4312n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode();
    }

    @Override // Ip.o
    public List rl() {
        return this.rl;
    }

    @Override // Ip.o
    public String t() {
        return this.f4312n;
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f4312n + ", usedDates=" + this.rl + "}";
    }

    j(String str, List list) {
        if (str != null) {
            this.f4312n = str;
            if (list != null) {
                this.rl = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }
}
