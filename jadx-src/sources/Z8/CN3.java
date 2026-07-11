package Z8;

import Z8.z;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class CN3 extends z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f12293n;
    private final byte[] rl;

    static final class n extends z.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private byte[] f12294n;
        private byte[] rl;

        @Override // Z8.z.j
        public z n() {
            return new CN3(this.f12294n, this.rl);
        }

        @Override // Z8.z.j
        public z.j rl(byte[] bArr) {
            this.f12294n = bArr;
            return this;
        }

        @Override // Z8.z.j
        public z.j t(byte[] bArr) {
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
        if (obj instanceof z) {
            z zVar = (z) obj;
            boolean z2 = zVar instanceof CN3;
            if (Arrays.equals(this.f12293n, z2 ? ((CN3) zVar).f12293n : zVar.rl())) {
                if (Arrays.equals(this.rl, z2 ? ((CN3) zVar).rl : zVar.t())) {
                    return true;
                }
            }
        }
        return false;
    }

    private CN3(byte[] bArr, byte[] bArr2) {
        this.f12293n = bArr;
        this.rl = bArr2;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f12293n) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.rl);
    }

    @Override // Z8.z
    public byte[] rl() {
        return this.f12293n;
    }

    @Override // Z8.z
    public byte[] t() {
        return this.rl;
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f12293n) + ", encryptedBlob=" + Arrays.toString(this.rl) + "}";
    }
}
