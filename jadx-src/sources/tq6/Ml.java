package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Ml extends DAz.j.AbstractC1210j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73696n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f73697t;

    static final class n extends DAz.j.AbstractC1210j.AbstractC1211j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f73698n;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f73699t;

        @Override // tq6.DAz.j.AbstractC1210j.AbstractC1211j
        public DAz.j.AbstractC1210j n() {
            String str;
            String str2;
            String str3 = this.f73698n;
            if (str3 != null && (str = this.rl) != null && (str2 = this.f73699t) != null) {
                return new Ml(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f73698n == null) {
                sb.append(" arch");
            }
            if (this.rl == null) {
                sb.append(" libraryName");
            }
            if (this.f73699t == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.j.AbstractC1210j.AbstractC1211j
        public DAz.j.AbstractC1210j.AbstractC1211j nr(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.rl = str;
            return this;
        }

        @Override // tq6.DAz.j.AbstractC1210j.AbstractC1211j
        public DAz.j.AbstractC1210j.AbstractC1211j rl(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f73698n = str;
            return this;
        }

        @Override // tq6.DAz.j.AbstractC1210j.AbstractC1211j
        public DAz.j.AbstractC1210j.AbstractC1211j t(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f73699t = str;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.j.AbstractC1210j) {
            DAz.j.AbstractC1210j abstractC1210j = (DAz.j.AbstractC1210j) obj;
            if (this.f73696n.equals(abstractC1210j.rl()) && this.rl.equals(abstractC1210j.nr()) && this.f73697t.equals(abstractC1210j.t())) {
                return true;
            }
        }
        return false;
    }

    private Ml(String str, String str2, String str3) {
        this.f73696n = str;
        this.rl = str2;
        this.f73697t = str3;
    }

    public int hashCode() {
        return ((((this.f73696n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f73697t.hashCode();
    }

    @Override // tq6.DAz.j.AbstractC1210j
    public String nr() {
        return this.rl;
    }

    @Override // tq6.DAz.j.AbstractC1210j
    public String rl() {
        return this.f73696n;
    }

    @Override // tq6.DAz.j.AbstractC1210j
    public String t() {
        return this.f73697t;
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f73696n + ", libraryName=" + this.rl + ", buildId=" + this.f73697t + "}";
    }
}
