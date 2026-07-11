package Dy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Ml f2068t = new j().n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2069n;
    private final List rl;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f2070n = "";
        private List rl = new ArrayList();

        public Ml n() {
            return new Ml(this.f2070n, Collections.unmodifiableList(this.rl));
        }

        public j rl(List list) {
            this.rl = list;
            return this;
        }

        public j t(String str) {
            this.f2070n = str;
            return this;
        }

        j() {
        }
    }

    public static j t() {
        return new j();
    }

    public List n() {
        return this.rl;
    }

    public String rl() {
        return this.f2069n;
    }

    Ml(String str, List list) {
        this.f2069n = str;
        this.rl = list;
    }
}
