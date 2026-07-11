package T;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f10124n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f10125t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f10124n == jVar.f10124n && this.rl == jVar.rl && this.f10125t == jVar.f10125t;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f10124n) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f10125t);
    }

    public final int n() {
        return this.f10125t;
    }

    public final int rl() {
        return this.rl;
    }

    public final int t() {
        return this.f10124n;
    }

    public String toString() {
        return "OnboardingCard(video=" + this.f10124n + ", title=" + this.rl + ", text=" + this.f10125t + ")";
    }

    public j(int i2, int i3, int i5) {
        this.f10124n = i2;
        this.rl = i3;
        this.f10125t = i5;
    }
}
