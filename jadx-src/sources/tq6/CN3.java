package tq6;

import java.util.Arrays;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class CN3 extends DAz.Ml.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73682n;
    private final byte[] rl;

    static final class n extends DAz.Ml.n.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f73683n;
        private byte[] rl;

        @Override // tq6.DAz.Ml.n.j
        public DAz.Ml.n n() {
            byte[] bArr;
            String str = this.f73683n;
            if (str != null && (bArr = this.rl) != null) {
                return new CN3(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f73683n == null) {
                sb.append(" filename");
            }
            if (this.rl == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.Ml.n.j
        public DAz.Ml.n.j rl(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.rl = bArr;
            return this;
        }

        @Override // tq6.DAz.Ml.n.j
        public DAz.Ml.n.j t(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f73683n = str;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.Ml.n) {
            DAz.Ml.n nVar = (DAz.Ml.n) obj;
            if (this.f73682n.equals(nVar.t())) {
                if (Arrays.equals(this.rl, nVar instanceof CN3 ? ((CN3) nVar).rl : nVar.rl())) {
                    return true;
                }
            }
        }
        return false;
    }

    private CN3(String str, byte[] bArr) {
        this.f73682n = str;
        this.rl = bArr;
    }

    public int hashCode() {
        return ((this.f73682n.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.rl);
    }

    @Override // tq6.DAz.Ml.n
    public byte[] rl() {
        return this.rl;
    }

    @Override // tq6.DAz.Ml.n
    public String t() {
        return this.f73682n;
    }

    public String toString() {
        return "File{filename=" + this.f73682n + ", contents=" + Arrays.toString(this.rl) + "}";
    }
}
