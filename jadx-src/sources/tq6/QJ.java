package tq6;

import java.util.List;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class QJ extends DAz.I28.Ml.j.n.AbstractC1198I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73711n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f73712t;

    static final class n extends DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1199j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f73713n;
        private byte nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f73714t;

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1199j
        public DAz.I28.Ml.j.n.AbstractC1198I28 n() {
            String str;
            List list;
            if (this.nr == 1 && (str = this.f73713n) != null && (list = this.f73714t) != null) {
                return new QJ(str, this.rl, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f73713n == null) {
                sb.append(" name");
            }
            if ((1 & this.nr) == 0) {
                sb.append(" importance");
            }
            if (this.f73714t == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1199j
        public DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1199j nr(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f73713n = str;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1199j
        public DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1199j rl(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f73714t = list;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1199j
        public DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1199j t(int i2) {
            this.rl = i2;
            this.nr = (byte) (this.nr | 1);
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.Ml.j.n.AbstractC1198I28) {
            DAz.I28.Ml.j.n.AbstractC1198I28 abstractC1198I28 = (DAz.I28.Ml.j.n.AbstractC1198I28) obj;
            if (this.f73711n.equals(abstractC1198I28.nr()) && this.rl == abstractC1198I28.t() && this.f73712t.equals(abstractC1198I28.rl())) {
                return true;
            }
        }
        return false;
    }

    private QJ(String str, int i2, List list) {
        this.f73711n = str;
        this.rl = i2;
        this.f73712t = list;
    }

    public int hashCode() {
        return ((((this.f73711n.hashCode() ^ 1000003) * 1000003) ^ this.rl) * 1000003) ^ this.f73712t.hashCode();
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28
    public String nr() {
        return this.f73711n;
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28
    public List rl() {
        return this.f73712t;
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28
    public int t() {
        return this.rl;
    }

    public String toString() {
        return "Thread{name=" + this.f73711n + ", importance=" + this.rl + ", frames=" + this.f73712t + "}";
    }
}
