package veW;

import YgZ.uQga.IYJfqUyym;
import java.util.Arrays;
import java.util.Map;
import veW.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class n extends Dsr {
    private final Map J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f74736O;
    private final Integer Uo;
    private final byte[] mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f74737n;
    private final long nr;
    private final Integer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final fuX f74738t;
    private final byte[] xMQ;

    /* JADX INFO: renamed from: veW.n$n, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    static final class C1244n extends Dsr.j {
        private Map J2;
        private String KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Long f74739O;
        private Integer Uo;
        private byte[] mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f74740n;
        private Long nr;
        private Integer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private fuX f74741t;
        private byte[] xMQ;

        @Override // veW.Dsr.j
        protected Dsr.j J2(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.J2 = map;
            return this;
        }

        @Override // veW.Dsr.j
        public Dsr.j KN(fuX fux) {
            if (fux == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f74741t = fux;
            return this;
        }

        @Override // veW.Dsr.j
        protected Map O() {
            Map map = this.J2;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // veW.Dsr.j
        public Dsr.j Uo(Integer num) {
            this.rl = num;
            return this;
        }

        @Override // veW.Dsr.j
        public Dsr.j az(String str) {
            this.KN = str;
            return this;
        }

        @Override // veW.Dsr.j
        public Dsr.j gh(byte[] bArr) {
            this.mUb = bArr;
            return this;
        }

        @Override // veW.Dsr.j
        public Dsr.j mUb(byte[] bArr) {
            this.xMQ = bArr;
            return this;
        }

        @Override // veW.Dsr.j
        public Dsr nr() {
            String str = "";
            if (this.f74740n == null) {
                str = " transportName";
            }
            if (this.f74741t == null) {
                str = str + " encodedPayload";
            }
            if (this.nr == null) {
                str = str + " eventMillis";
            }
            if (this.f74739O == null) {
                str = str + " uptimeMillis";
            }
            if (this.J2 == null) {
                str = str + IYJfqUyym.VdtneNkp;
            }
            if (str.isEmpty()) {
                return new n(this.f74740n, this.rl, this.f74741t, this.nr.longValue(), this.f74739O.longValue(), this.J2, this.Uo, this.KN, this.xMQ, this.mUb);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // veW.Dsr.j
        public Dsr.j qie(Integer num) {
            this.Uo = num;
            return this;
        }

        @Override // veW.Dsr.j
        public Dsr.j ty(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f74740n = str;
            return this;
        }

        C1244n() {
        }

        @Override // veW.Dsr.j
        public Dsr.j HI(long j2) {
            this.f74739O = Long.valueOf(j2);
            return this;
        }

        @Override // veW.Dsr.j
        public Dsr.j xMQ(long j2) {
            this.nr = Long.valueOf(j2);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Dsr) {
            Dsr dsr = (Dsr) obj;
            if (this.f74737n.equals(dsr.ty()) && ((num = this.rl) != null ? num.equals(dsr.nr()) : dsr.nr() == null) && this.f74738t.equals(dsr.O()) && this.nr == dsr.J2() && this.f74736O == dsr.HI() && this.J2.equals(dsr.t()) && ((num2 = this.Uo) != null ? num2.equals(dsr.qie()) : dsr.qie() == null) && ((str = this.KN) != null ? str.equals(dsr.az()) : dsr.az() == null)) {
                boolean z2 = dsr instanceof n;
                if (Arrays.equals(this.xMQ, z2 ? ((n) dsr).xMQ : dsr.Uo())) {
                    if (Arrays.equals(this.mUb, z2 ? ((n) dsr).mUb : dsr.KN())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private n(String str, Integer num, fuX fux, long j2, long j3, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f74737n = str;
        this.rl = num;
        this.f74738t = fux;
        this.nr = j2;
        this.f74736O = j3;
        this.J2 = map;
        this.Uo = num2;
        this.KN = str2;
        this.xMQ = bArr;
        this.mUb = bArr2;
    }

    @Override // veW.Dsr
    public long HI() {
        return this.f74736O;
    }

    @Override // veW.Dsr
    public long J2() {
        return this.nr;
    }

    @Override // veW.Dsr
    public byte[] KN() {
        return this.mUb;
    }

    @Override // veW.Dsr
    public fuX O() {
        return this.f74738t;
    }

    @Override // veW.Dsr
    public byte[] Uo() {
        return this.xMQ;
    }

    @Override // veW.Dsr
    public String az() {
        return this.KN;
    }

    public int hashCode() {
        int iHashCode = (this.f74737n.hashCode() ^ 1000003) * 1000003;
        Integer num = this.rl;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f74738t.hashCode()) * 1000003;
        long j2 = this.nr;
        int i2 = (iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f74736O;
        int iHashCode3 = (((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.J2.hashCode()) * 1000003;
        Integer num2 = this.Uo;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.KN;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.xMQ)) * 1000003) ^ Arrays.hashCode(this.mUb);
    }

    @Override // veW.Dsr
    public Integer nr() {
        return this.rl;
    }

    @Override // veW.Dsr
    public Integer qie() {
        return this.Uo;
    }

    @Override // veW.Dsr
    protected Map t() {
        return this.J2;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f74737n + ", code=" + this.rl + ", encodedPayload=" + this.f74738t + ", eventMillis=" + this.nr + ", uptimeMillis=" + this.f74736O + ", autoMetadata=" + this.J2 + ", productId=" + this.Uo + ", pseudonymousId=" + this.KN + ", experimentIdsClear=" + Arrays.toString(this.xMQ) + ", experimentIdsEncrypted=" + Arrays.toString(this.mUb) + "}";
    }

    @Override // veW.Dsr
    public String ty() {
        return this.f74737n;
    }
}
