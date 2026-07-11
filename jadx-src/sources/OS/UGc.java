package OS;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7451n;

    public static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f7452n;

        public UGc n() {
            if (this.f7452n != null) {
                return new UGc(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public j rl(String str) {
            this.f7452n = str;
            return this;
        }

        /* synthetic */ j(K k2) {
        }
    }

    public static j n() {
        return new j(null);
    }

    public final String rl() {
        return this.f7451n;
    }

    /* synthetic */ UGc(j jVar, K k2) {
        this.f7451n = jVar.f7452n;
    }
}
