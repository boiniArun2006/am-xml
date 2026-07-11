package Z8;

import Z8.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class Dsr extends l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final QJ f12295n;

    static final class n extends l3D.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private QJ f12296n;

        @Override // Z8.l3D.j
        public l3D n() {
            return new Dsr(this.f12296n);
        }

        @Override // Z8.l3D.j
        public l3D.j rl(QJ qj) {
            this.f12296n = qj;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l3D)) {
            return false;
        }
        QJ qj = this.f12295n;
        QJ qjRl = ((l3D) obj).rl();
        return qj == null ? qjRl == null : qj.equals(qjRl);
    }

    private Dsr(QJ qj) {
        this.f12295n = qj;
    }

    public int hashCode() {
        QJ qj = this.f12295n;
        return (qj == null ? 0 : qj.hashCode()) ^ 1000003;
    }

    @Override // Z8.l3D
    public QJ rl() {
        return this.f12295n;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f12295n + "}";
    }
}
