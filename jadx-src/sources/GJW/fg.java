package GJW;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class fg implements kO4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f3482n;

    @Override // GJW.kO4
    public T rl() {
        return null;
    }

    @Override // GJW.kO4
    public boolean isActive() {
        return this.f3482n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }

    public fg(boolean z2) {
        this.f3482n = z2;
    }
}
