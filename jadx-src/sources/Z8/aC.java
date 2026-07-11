package Z8;

import Z8.AbstractC1495c;
import ep.oxM.esLNYym;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class aC extends AbstractC1495c {
    private final String J2;
    private final Q KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final byte[] f12335O;
    private final long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f12336n;
    private final long nr;
    private final Integer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final eO f12337t;
    private final z xMQ;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static final class n extends AbstractC1495c.j {
        private String J2;
        private Q KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private byte[] f12338O;
        private Long Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Long f12339n;
        private Long nr;
        private Integer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private eO f12340t;
        private z xMQ;

        @Override // Z8.AbstractC1495c.j
        public AbstractC1495c.j J2(z zVar) {
            this.xMQ = zVar;
            return this;
        }

        @Override // Z8.AbstractC1495c.j
        AbstractC1495c.j KN(byte[] bArr) {
            this.f12338O = bArr;
            return this;
        }

        @Override // Z8.AbstractC1495c.j
        public AbstractC1495c.j Uo(Q q2) {
            this.KN = q2;
            return this;
        }

        @Override // Z8.AbstractC1495c.j
        public AbstractC1495c n() {
            String str = "";
            if (this.f12339n == null) {
                str = " eventTimeMs";
            }
            if (this.nr == null) {
                str = str + " eventUptimeMs";
            }
            if (this.Uo == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new aC(this.f12339n.longValue(), this.rl, this.f12340t, this.nr.longValue(), this.f12338O, this.J2, this.Uo.longValue(), this.KN, this.xMQ);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Z8.AbstractC1495c.j
        public AbstractC1495c.j rl(eO eOVar) {
            this.f12340t = eOVar;
            return this;
        }

        @Override // Z8.AbstractC1495c.j
        public AbstractC1495c.j t(Integer num) {
            this.rl = num;
            return this;
        }

        @Override // Z8.AbstractC1495c.j
        AbstractC1495c.j xMQ(String str) {
            this.J2 = str;
            return this;
        }

        n() {
        }

        @Override // Z8.AbstractC1495c.j
        public AbstractC1495c.j O(long j2) {
            this.nr = Long.valueOf(j2);
            return this;
        }

        @Override // Z8.AbstractC1495c.j
        public AbstractC1495c.j mUb(long j2) {
            this.Uo = Long.valueOf(j2);
            return this;
        }

        @Override // Z8.AbstractC1495c.j
        public AbstractC1495c.j nr(long j2) {
            this.f12339n = Long.valueOf(j2);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Integer num;
        eO eOVar;
        String str;
        Q q2;
        z zVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1495c) {
            AbstractC1495c abstractC1495c = (AbstractC1495c) obj;
            if (this.f12336n == abstractC1495c.nr() && ((num = this.rl) != null ? num.equals(abstractC1495c.t()) : abstractC1495c.t() == null) && ((eOVar = this.f12337t) != null ? eOVar.equals(abstractC1495c.rl()) : abstractC1495c.rl() == null) && this.nr == abstractC1495c.O()) {
                if (Arrays.equals(this.f12335O, abstractC1495c instanceof aC ? ((aC) abstractC1495c).f12335O : abstractC1495c.KN()) && ((str = this.J2) != null ? str.equals(abstractC1495c.xMQ()) : abstractC1495c.xMQ() == null) && this.Uo == abstractC1495c.mUb() && ((q2 = this.KN) != null ? q2.equals(abstractC1495c.Uo()) : abstractC1495c.Uo() == null) && ((zVar = this.xMQ) != null ? zVar.equals(abstractC1495c.J2()) : abstractC1495c.J2() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private aC(long j2, Integer num, eO eOVar, long j3, byte[] bArr, String str, long j4, Q q2, z zVar) {
        this.f12336n = j2;
        this.rl = num;
        this.f12337t = eOVar;
        this.nr = j3;
        this.f12335O = bArr;
        this.J2 = str;
        this.Uo = j4;
        this.KN = q2;
        this.xMQ = zVar;
    }

    @Override // Z8.AbstractC1495c
    public z J2() {
        return this.xMQ;
    }

    @Override // Z8.AbstractC1495c
    public byte[] KN() {
        return this.f12335O;
    }

    @Override // Z8.AbstractC1495c
    public long O() {
        return this.nr;
    }

    @Override // Z8.AbstractC1495c
    public Q Uo() {
        return this.KN;
    }

    public int hashCode() {
        long j2 = this.f12336n;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.rl;
        int iHashCode = (i2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        eO eOVar = this.f12337t;
        int iHashCode2 = eOVar == null ? 0 : eOVar.hashCode();
        long j3 = this.nr;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f12335O)) * 1000003;
        String str = this.J2;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j4 = this.Uo;
        int i3 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        Q q2 = this.KN;
        int iHashCode5 = (i3 ^ (q2 == null ? 0 : q2.hashCode())) * 1000003;
        z zVar = this.xMQ;
        return iHashCode5 ^ (zVar != null ? zVar.hashCode() : 0);
    }

    @Override // Z8.AbstractC1495c
    public long mUb() {
        return this.Uo;
    }

    @Override // Z8.AbstractC1495c
    public long nr() {
        return this.f12336n;
    }

    @Override // Z8.AbstractC1495c
    public eO rl() {
        return this.f12337t;
    }

    @Override // Z8.AbstractC1495c
    public Integer t() {
        return this.rl;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f12336n + ", eventCode=" + this.rl + ", complianceData=" + this.f12337t + ", eventUptimeMs=" + this.nr + ", sourceExtension=" + Arrays.toString(this.f12335O) + ", sourceExtensionJsonProto3=" + this.J2 + ", timezoneOffsetSeconds=" + this.Uo + ", networkConnectionInfo=" + this.KN + ", experimentIds=" + this.xMQ + esLNYym.nSymALzPvoPiicB;
    }

    @Override // Z8.AbstractC1495c
    public String xMQ() {
        return this.J2;
    }
}
