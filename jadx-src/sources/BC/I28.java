package BC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final pUk.z f394n;
    private final eO rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I28.class != obj.getClass()) {
            return false;
        }
        I28 i28 = (I28) obj;
        if (this.f394n.equals(i28.f394n)) {
            return this.rl.equals(i28.rl);
        }
        return false;
    }

    public int hashCode() {
        return (this.f394n.hashCode() * 31) + this.rl.hashCode();
    }

    public pUk.z n() {
        return this.f394n;
    }

    public eO rl() {
        return this.rl;
    }

    public I28(pUk.z zVar, eO eOVar) {
        this.f394n = zVar;
        this.rl = eOVar;
    }
}
