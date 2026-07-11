package veW;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final bF.n f74718n;
    private final byte[] rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return false;
        }
        fuX fux = (fuX) obj;
        if (this.f74718n.equals(fux.f74718n)) {
            return Arrays.equals(this.rl, fux.rl);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f74718n.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.rl);
    }

    public byte[] n() {
        return this.rl;
    }

    public bF.n rl() {
        return this.f74718n;
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f74718n + ", bytes=[...]}";
    }

    public fuX(bF.n nVar, byte[] bArr) {
        if (nVar != null) {
            if (bArr != null) {
                this.f74718n = nVar;
                this.rl = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }
}
