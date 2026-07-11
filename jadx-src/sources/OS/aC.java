package OS;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f7457n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f7458n;

        public aC n() {
            String str = this.f7458n;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            aC aCVar = new aC(null);
            aCVar.f7457n = str;
            return aCVar;
        }

        public j rl(String str) {
            this.f7458n = str;
            return this;
        }

        /* synthetic */ j(lej lejVar) {
        }
    }

    public static j rl() {
        return new j(null);
    }

    public String n() {
        return this.f7457n;
    }

    /* synthetic */ aC(lej lejVar) {
    }
}
