package ePt;

import ePt.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class j extends I28 {
    private final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f63645O;
    private final int nr;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f63646t;

    static final class n extends I28.j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Integer f63647O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Long f63648n;
        private Long nr;
        private Integer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f63649t;

        @Override // ePt.I28.j
        I28 n() {
            String str = "";
            if (this.f63648n == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.rl == null) {
                str = str + " loadBatchSize";
            }
            if (this.f63649t == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.nr == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f63647O == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new j(this.f63648n.longValue(), this.rl.intValue(), this.f63649t.intValue(), this.nr.longValue(), this.f63647O.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        n() {
        }

        @Override // ePt.I28.j
        I28.j J2(long j2) {
            this.f63648n = Long.valueOf(j2);
            return this;
        }

        @Override // ePt.I28.j
        I28.j O(int i2) {
            this.f63647O = Integer.valueOf(i2);
            return this;
        }

        @Override // ePt.I28.j
        I28.j nr(int i2) {
            this.rl = Integer.valueOf(i2);
            return this;
        }

        @Override // ePt.I28.j
        I28.j rl(int i2) {
            this.f63649t = Integer.valueOf(i2);
            return this;
        }

        @Override // ePt.I28.j
        I28.j t(long j2) {
            this.nr = Long.valueOf(j2);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I28) {
            I28 i28 = (I28) obj;
            if (this.rl == i28.J2() && this.f63646t == i28.nr() && this.nr == i28.rl() && this.f63645O == i28.t() && this.J2 == i28.O()) {
                return true;
            }
        }
        return false;
    }

    private j(long j2, int i2, int i3, long j3, int i5) {
        this.rl = j2;
        this.f63646t = i2;
        this.nr = i3;
        this.f63645O = j3;
        this.J2 = i5;
    }

    @Override // ePt.I28
    long J2() {
        return this.rl;
    }

    @Override // ePt.I28
    int O() {
        return this.J2;
    }

    public int hashCode() {
        long j2 = this.rl;
        int i2 = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f63646t) * 1000003) ^ this.nr) * 1000003;
        long j3 = this.f63645O;
        return ((i2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.J2;
    }

    @Override // ePt.I28
    int nr() {
        return this.f63646t;
    }

    @Override // ePt.I28
    int rl() {
        return this.nr;
    }

    @Override // ePt.I28
    long t() {
        return this.f63645O;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.rl + ", loadBatchSize=" + this.f63646t + ", criticalSectionEnterTimeoutMs=" + this.nr + ", eventCleanUpAge=" + this.f63645O + ", maxBlobByteSizePerRow=" + this.J2 + "}";
    }
}
