package OS;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class s4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7465n;

    public static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f7466n;

        public s4 n() {
            if (this.f7466n != null) {
                return new s4(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public j rl(String str) {
            this.f7466n = str;
            return this;
        }

        /* synthetic */ j(h hVar) {
        }
    }

    public static j n() {
        return new j(null);
    }

    public final String rl() {
        return this.f7465n;
    }

    /* synthetic */ s4(j jVar, h hVar) {
        this.f7465n = jVar.f7466n;
    }
}
