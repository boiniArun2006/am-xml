package hay;

import hay.Wre;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class j extends Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Iterable f67971n;
    private final byte[] rl;

    static final class n extends Wre.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Iterable f67972n;
        private byte[] rl;

        @Override // hay.Wre.j
        public Wre n() {
            String str = "";
            if (this.f67972n == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new j(this.f67972n, this.rl);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // hay.Wre.j
        public Wre.j rl(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f67972n = iterable;
            return this;
        }

        @Override // hay.Wre.j
        public Wre.j t(byte[] bArr) {
            this.rl = bArr;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Wre) {
            Wre wre = (Wre) obj;
            if (this.f67971n.equals(wre.rl())) {
                if (Arrays.equals(this.rl, wre instanceof j ? ((j) wre).rl : wre.t())) {
                    return true;
                }
            }
        }
        return false;
    }

    private j(Iterable iterable, byte[] bArr) {
        this.f67971n = iterable;
        this.rl = bArr;
    }

    public int hashCode() {
        return ((this.f67971n.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.rl);
    }

    @Override // hay.Wre
    public Iterable rl() {
        return this.f67971n;
    }

    @Override // hay.Wre
    public byte[] t() {
        return this.rl;
    }

    public String toString() {
        return "BackendRequest{events=" + this.f67971n + ", extras=" + Arrays.toString(this.rl) + "}";
    }
}
