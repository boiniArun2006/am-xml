package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class g9s extends DAz.I28.Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73753n;

    static final class n extends DAz.I28.Wre.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f73754n;

        @Override // tq6.DAz.I28.Wre.j
        public DAz.I28.Wre n() {
            String str = this.f73754n;
            if (str != null) {
                return new g9s(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // tq6.DAz.I28.Wre.j
        public DAz.I28.Wre.j rl(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f73754n = str;
            return this;
        }

        n() {
        }
    }

    private g9s(String str) {
        this.f73753n = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.Wre) {
            return this.f73753n.equals(((DAz.I28.Wre) obj).rl());
        }
        return false;
    }

    public int hashCode() {
        return this.f73753n.hashCode() ^ 1000003;
    }

    @Override // tq6.DAz.I28.Wre
    public String rl() {
        return this.f73753n;
    }

    public String toString() {
        return "User{identifier=" + this.f73753n + "}";
    }
}
