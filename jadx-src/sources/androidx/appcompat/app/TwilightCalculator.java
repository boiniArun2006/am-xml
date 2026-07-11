package androidx.appcompat.app;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class TwilightCalculator {
    private static TwilightCalculator nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f13687n;
    public long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13688t;

    static TwilightCalculator rl() {
        if (nr == null) {
            nr = new TwilightCalculator();
        }
        return nr;
    }

    TwilightCalculator() {
    }

    public void n(long j2, double d2, double d4) {
        double d5 = (0.01720197f * ((j2 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d5) * 0.03341960161924362d) + d5 + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d4) / 360.0d) + (Math.sin(d5) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d2;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(dAsin))) / (Math.cos(d6) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f13688t = 1;
            this.f13687n = -1L;
            this.rl = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f13688t = 0;
                this.f13687n = -1L;
                this.rl = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f13687n = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.rl = jRound;
            if (jRound < j2 && this.f13687n > j2) {
                this.f13688t = 0;
            } else {
                this.f13688t = 1;
            }
        }
    }
}
