package jc;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ln extends w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f69464n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f69466n;
        public static final j rl = new j("TINK");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f69465t = new j("CRUNCHY");
        public static final j nr = new j("NO_PREFIX");

        public String toString() {
            return this.f69466n;
        }

        private j(String str) {
            this.f69466n = str;
        }
    }

    public static Ln n(j jVar) {
        return new Ln(jVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Ln) && ((Ln) obj).rl() == rl();
    }

    public int hashCode() {
        return Objects.hashCode(this.f69464n);
    }

    public j rl() {
        return this.f69464n;
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f69464n + ")";
    }

    private Ln(j jVar) {
        this.f69464n = jVar;
    }
}
