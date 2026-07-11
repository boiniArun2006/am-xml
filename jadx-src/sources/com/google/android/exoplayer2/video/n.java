package com.google.android.exoplayer2.video;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class n {
    private int J2;
    private boolean nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f58536t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f58535n = new j();
    private j rl = new j();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f58534O = -9223372036854775807L;

    private static final class j {
        private long J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f58537O;
        private final boolean[] Uo = new boolean[15];

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f58538n;
        private long nr;
        private long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f58539t;

        private static int t(long j2) {
            return (int) (j2 % 15);
        }

        public void J2(long j2) {
            long j3 = this.nr;
            if (j3 == 0) {
                this.f58538n = j2;
            } else if (j3 == 1) {
                long j4 = j2 - this.f58538n;
                this.rl = j4;
                this.J2 = j4;
                this.f58537O = 1L;
            } else {
                long j5 = j2 - this.f58539t;
                int iT = t(j3);
                if (Math.abs(j5 - this.rl) <= 1000000) {
                    this.f58537O++;
                    this.J2 += j5;
                    boolean[] zArr = this.Uo;
                    if (zArr[iT]) {
                        zArr[iT] = false;
                        this.KN--;
                    }
                } else {
                    boolean[] zArr2 = this.Uo;
                    if (!zArr2[iT]) {
                        zArr2[iT] = true;
                        this.KN++;
                    }
                }
            }
            this.nr++;
            this.f58539t = j2;
        }

        public boolean O() {
            return this.nr > 15 && this.KN == 0;
        }

        public void Uo() {
            this.nr = 0L;
            this.f58537O = 0L;
            this.J2 = 0L;
            this.KN = 0;
            Arrays.fill(this.Uo, false);
        }

        public long n() {
            long j2 = this.f58537O;
            if (j2 == 0) {
                return 0L;
            }
            return this.J2 / j2;
        }

        public boolean nr() {
            long j2 = this.nr;
            if (j2 == 0) {
                return false;
            }
            return this.Uo[t(j2 - 1)];
        }

        public long rl() {
            return this.J2;
        }
    }

    public void J2(long j2) {
        this.f58535n.J2(j2);
        if (this.f58535n.O() && !this.nr) {
            this.f58536t = false;
        } else if (this.f58534O != -9223372036854775807L) {
            if (!this.f58536t || this.rl.nr()) {
                this.rl.Uo();
                this.rl.J2(this.f58534O);
            }
            this.f58536t = true;
            this.rl.J2(j2);
        }
        if (this.f58536t && this.rl.O()) {
            j jVar = this.f58535n;
            this.f58535n = this.rl;
            this.rl = jVar;
            this.f58536t = false;
            this.nr = false;
        }
        this.f58534O = j2;
        this.J2 = this.f58535n.O() ? 0 : this.J2 + 1;
    }

    public boolean O() {
        return this.f58535n.O();
    }

    public void Uo() {
        this.f58535n.Uo();
        this.rl.Uo();
        this.f58536t = false;
        this.f58534O = -9223372036854775807L;
        this.J2 = 0;
    }

    public int t() {
        return this.J2;
    }

    public long n() {
        if (O()) {
            return this.f58535n.n();
        }
        return -9223372036854775807L;
    }

    public long nr() {
        if (O()) {
            return this.f58535n.rl();
        }
        return -9223372036854775807L;
    }

    public float rl() {
        if (O()) {
            return (float) (1.0E9d / this.f58535n.n());
        }
        return -1.0f;
    }
}
