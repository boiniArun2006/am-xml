package veW;

import java.util.Arrays;
import veW.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class Ml extends eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f74709n;
    private final byte[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final bF.I28 f74710t;

    static final class n extends eO.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f74711n;
        private byte[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private bF.I28 f74712t;

        @Override // veW.eO.j
        public eO n() {
            String str = "";
            if (this.f74711n == null) {
                str = " backendName";
            }
            if (this.f74712t == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new Ml(this.f74711n, this.rl, this.f74712t);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // veW.eO.j
        public eO.j nr(bF.I28 i28) {
            if (i28 == null) {
                throw new NullPointerException("Null priority");
            }
            this.f74712t = i28;
            return this;
        }

        @Override // veW.eO.j
        public eO.j rl(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f74711n = str;
            return this;
        }

        @Override // veW.eO.j
        public eO.j t(byte[] bArr) {
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
        if (obj instanceof eO) {
            eO eOVar = (eO) obj;
            if (this.f74709n.equals(eOVar.rl())) {
                if (Arrays.equals(this.rl, eOVar instanceof Ml ? ((Ml) eOVar).rl : eOVar.t()) && this.f74710t.equals(eOVar.nr())) {
                    return true;
                }
            }
        }
        return false;
    }

    private Ml(String str, byte[] bArr, bF.I28 i28) {
        this.f74709n = str;
        this.rl = bArr;
        this.f74710t = i28;
    }

    public int hashCode() {
        return ((((this.f74709n.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.rl)) * 1000003) ^ this.f74710t.hashCode();
    }

    @Override // veW.eO
    public bF.I28 nr() {
        return this.f74710t;
    }

    @Override // veW.eO
    public String rl() {
        return this.f74709n;
    }

    @Override // veW.eO
    public byte[] t() {
        return this.rl;
    }
}
