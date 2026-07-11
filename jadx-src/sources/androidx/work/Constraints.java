package androidx.work;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Constraints {
    public static final Constraints xMQ = new Builder().n();
    private long J2;
    private ContentUriTriggers KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f42707O;
    private long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private NetworkType f42708n;
    private boolean nr;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f42709t;

    public static final class Builder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f42711n = false;
        boolean rl = false;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        NetworkType f42712t = NetworkType.NOT_REQUIRED;
        boolean nr = false;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f42710O = false;
        long J2 = -1;
        long Uo = -1;
        ContentUriTriggers KN = new ContentUriTriggers();

        public Constraints n() {
            return new Constraints(this);
        }

        public Builder rl(NetworkType networkType) {
            this.f42712t = networkType;
            return this;
        }
    }

    public Constraints() {
        this.f42708n = NetworkType.NOT_REQUIRED;
        this.J2 = -1L;
        this.Uo = -1L;
        this.KN = new ContentUriTriggers();
    }

    public void HI(boolean z2) {
        this.f42707O = z2;
    }

    public void Ik(long j2) {
        this.Uo = j2;
    }

    public boolean J2() {
        return this.nr;
    }

    public boolean KN() {
        return this.f42709t;
    }

    public boolean O() {
        return this.KN.t() > 0;
    }

    public boolean Uo() {
        return this.rl;
    }

    public void az(boolean z2) {
        this.rl = z2;
    }

    public void ck(long j2) {
        this.J2 = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Constraints.class != obj.getClass()) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.rl == constraints.rl && this.f42709t == constraints.f42709t && this.nr == constraints.nr && this.f42707O == constraints.f42707O && this.J2 == constraints.J2 && this.Uo == constraints.Uo && this.f42708n == constraints.f42708n) {
            return this.KN.equals(constraints.KN);
        }
        return false;
    }

    public void gh(NetworkType networkType) {
        this.f42708n = networkType;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f42708n.hashCode() * 31) + (this.rl ? 1 : 0)) * 31) + (this.f42709t ? 1 : 0)) * 31) + (this.nr ? 1 : 0)) * 31) + (this.f42707O ? 1 : 0)) * 31;
        long j2 = this.J2;
        int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.Uo;
        return ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.KN.hashCode();
    }

    public void mUb(ContentUriTriggers contentUriTriggers) {
        this.KN = contentUriTriggers;
    }

    public ContentUriTriggers n() {
        return this.KN;
    }

    public long nr() {
        return this.Uo;
    }

    public void qie(boolean z2) {
        this.nr = z2;
    }

    public NetworkType rl() {
        return this.f42708n;
    }

    public long t() {
        return this.J2;
    }

    public void ty(boolean z2) {
        this.f42709t = z2;
    }

    public boolean xMQ() {
        return this.f42707O;
    }

    Constraints(Builder builder) {
        this.f42708n = NetworkType.NOT_REQUIRED;
        this.J2 = -1L;
        this.Uo = -1L;
        this.KN = new ContentUriTriggers();
        this.rl = builder.f42711n;
        this.f42709t = builder.rl;
        this.f42708n = builder.f42712t;
        this.nr = builder.nr;
        this.f42707O = builder.f42710O;
        this.KN = builder.KN;
        this.J2 = builder.J2;
        this.Uo = builder.Uo;
    }

    public Constraints(Constraints constraints) {
        this.f42708n = NetworkType.NOT_REQUIRED;
        this.J2 = -1L;
        this.Uo = -1L;
        this.KN = new ContentUriTriggers();
        this.rl = constraints.rl;
        this.f42709t = constraints.f42709t;
        this.f42708n = constraints.f42708n;
        this.nr = constraints.nr;
        this.f42707O = constraints.f42707O;
        this.KN = constraints.KN;
    }
}
