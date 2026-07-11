package z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class OU extends fg {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76268n;
    private final int rl;

    public OU(int i2, int i3) {
        super(null);
        this.f76268n = i2;
        this.rl = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OU)) {
            return false;
        }
        OU ou2 = (OU) obj;
        return this.f76268n == ou2.f76268n && this.rl == ou2.rl;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f76268n) * 31) + Integer.hashCode(this.rl);
    }

    public final int n() {
        return this.rl;
    }

    public final int rl() {
        return this.f76268n;
    }

    public String toString() {
        return "PBufferRenderTarget(width=" + this.f76268n + ", height=" + this.rl + ")";
    }
}
