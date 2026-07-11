package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class UGc extends DAz.I28.Ml.AbstractC1196Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73717n;

    static final class n extends DAz.I28.Ml.AbstractC1196Ml.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f73718n;

        @Override // tq6.DAz.I28.Ml.AbstractC1196Ml.j
        public DAz.I28.Ml.AbstractC1196Ml n() {
            String str = this.f73718n;
            if (str != null) {
                return new UGc(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // tq6.DAz.I28.Ml.AbstractC1196Ml.j
        public DAz.I28.Ml.AbstractC1196Ml.j rl(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f73718n = str;
            return this;
        }

        n() {
        }
    }

    private UGc(String str) {
        this.f73717n = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.Ml.AbstractC1196Ml) {
            return this.f73717n.equals(((DAz.I28.Ml.AbstractC1196Ml) obj).rl());
        }
        return false;
    }

    public int hashCode() {
        return this.f73717n.hashCode() ^ 1000003;
    }

    @Override // tq6.DAz.I28.Ml.AbstractC1196Ml
    public String rl() {
        return this.f73717n;
    }

    public String toString() {
        return "Log{content=" + this.f73717n + "}";
    }
}
