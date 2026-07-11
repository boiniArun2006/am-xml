package Dy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import veW.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final j f2074O = new C0072j().rl();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Wre f2075n;
    private final String nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n f2076t;

    /* JADX INFO: renamed from: Dy.j$j, reason: collision with other inner class name */
    public static final class C0072j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Wre f2077n = null;
        private List rl = new ArrayList();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private n f2078t = null;
        private String nr = "";

        public C0072j O(Wre wre) {
            this.f2077n = wre;
            return this;
        }

        public C0072j n(Ml ml) {
            this.rl.add(ml);
            return this;
        }

        public C0072j nr(n nVar) {
            this.f2078t = nVar;
            return this;
        }

        public j rl() {
            return new j(this.f2077n, Collections.unmodifiableList(this.rl), this.f2078t, this.nr);
        }

        public C0072j t(String str) {
            this.nr = str;
            return this;
        }

        C0072j() {
        }
    }

    public static C0072j O() {
        return new C0072j();
    }

    public String n() {
        return this.nr;
    }

    public Wre nr() {
        return this.f2075n;
    }

    public n rl() {
        return this.f2076t;
    }

    public List t() {
        return this.rl;
    }

    j(Wre wre, List list, n nVar, String str) {
        this.f2075n = wre;
        this.rl = list;
        this.f2076t = nVar;
        this.nr = str;
    }

    public byte[] J2() {
        return qz.n(this);
    }
}
