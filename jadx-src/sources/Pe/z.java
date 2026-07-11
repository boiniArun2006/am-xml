package Pe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final eZ.I28 f7740O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.protobuf.C f7741n;
    private final eZ.I28 nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final eZ.I28 f7742t;

    public static z n(boolean z2, com.google.protobuf.C c2) {
        return new z(c2, z2, pUk.C.nr(), pUk.C.nr(), pUk.C.nr());
    }

    public boolean J2() {
        return this.rl;
    }

    public com.google.protobuf.C O() {
        return this.f7741n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (this.rl == zVar.rl && this.f7741n.equals(zVar.f7741n) && this.f7742t.equals(zVar.f7742t) && this.nr.equals(zVar.nr)) {
            return this.f7740O.equals(zVar.f7740O);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f7741n.hashCode() * 31) + (this.rl ? 1 : 0)) * 31) + this.f7742t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f7740O.hashCode();
    }

    public eZ.I28 nr() {
        return this.f7740O;
    }

    public eZ.I28 rl() {
        return this.f7742t;
    }

    public eZ.I28 t() {
        return this.nr;
    }

    public z(com.google.protobuf.C c2, boolean z2, eZ.I28 i28, eZ.I28 i282, eZ.I28 i283) {
        this.f7741n = c2;
        this.rl = z2;
        this.f7742t = i28;
        this.nr = i282;
        this.f7740O = i283;
    }
}
