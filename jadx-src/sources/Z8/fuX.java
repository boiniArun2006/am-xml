package Z8;

import Z8.QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class fuX extends QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f12345n;

    static final class n extends QJ.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f12346n;

        @Override // Z8.QJ.j
        public QJ n() {
            return new fuX(this.f12346n);
        }

        @Override // Z8.QJ.j
        public QJ.j rl(Integer num) {
            this.f12346n = num;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QJ)) {
            return false;
        }
        Integer num = this.f12345n;
        Integer numRl = ((QJ) obj).rl();
        return num == null ? numRl == null : num.equals(numRl);
    }

    private fuX(Integer num) {
        this.f12345n = num;
    }

    public int hashCode() {
        Integer num = this.f12345n;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    @Override // Z8.QJ
    public Integer rl() {
        return this.f12345n;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f12345n + "}";
    }
}
