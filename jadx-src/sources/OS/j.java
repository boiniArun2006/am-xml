package OS;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f7460n;

    /* JADX INFO: renamed from: OS.j$j, reason: collision with other inner class name */
    public static final class C0251j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f7461n;

        public j n() {
            String str = this.f7461n;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            j jVar = new j(null);
            jVar.f7460n = str;
            return jVar;
        }

        public C0251j rl(String str) {
            this.f7461n = str;
            return this;
        }

        /* synthetic */ C0251j(r rVar) {
        }
    }

    public static C0251j rl() {
        return new C0251j(null);
    }

    public String n() {
        return this.f7460n;
    }

    /* synthetic */ j(r rVar) {
    }
}
