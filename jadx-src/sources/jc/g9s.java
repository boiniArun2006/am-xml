package jc;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class g9s extends w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f69492n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f69494n;
        public static final j rl = new j("TINK");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f69493t = new j("CRUNCHY");
        public static final j nr = new j("NO_PREFIX");

        public String toString() {
            return this.f69494n;
        }

        private j(String str) {
            this.f69494n = str;
        }
    }

    public static g9s n(j jVar) {
        return new g9s(jVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof g9s) && ((g9s) obj).rl() == rl();
    }

    public int hashCode() {
        return Objects.hashCode(this.f69492n);
    }

    public j rl() {
        return this.f69492n;
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f69492n + ")";
    }

    private g9s(j jVar) {
        this.f69492n = jVar;
    }
}
