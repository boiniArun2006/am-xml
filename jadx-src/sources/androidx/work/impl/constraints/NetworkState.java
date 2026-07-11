package androidx.work.impl.constraints;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class NetworkState {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42887n;
    private boolean nr;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f42888t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.f42887n == networkState.f42887n && this.rl == networkState.rl && this.f42888t == networkState.f42888t && this.nr == networkState.nr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f42887n;
        int i2 = r02;
        if (this.rl) {
            i2 = r02 + 16;
        }
        int i3 = i2;
        if (this.f42888t) {
            i3 = i2 + 256;
        }
        return this.nr ? i3 + 4096 : i3;
    }

    public boolean n() {
        return this.f42887n;
    }

    public boolean nr() {
        return this.rl;
    }

    public boolean rl() {
        return this.f42888t;
    }

    public boolean t() {
        return this.nr;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f42887n), Boolean.valueOf(this.rl), Boolean.valueOf(this.f42888t), Boolean.valueOf(this.nr));
    }

    public NetworkState(boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f42887n = z2;
        this.rl = z3;
        this.f42888t = z4;
        this.nr = z5;
    }
}
