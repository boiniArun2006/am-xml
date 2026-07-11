package veW;

import veW.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class w6 extends Xo {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final bF.n f74746O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final eO f74747n;
    private final bF.CN3 nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final bF.w6 f74748t;

    static final class n extends Xo.j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private bF.n f74749O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private eO f74750n;
        private bF.CN3 nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private bF.w6 f74751t;

        @Override // veW.Xo.j
        public Xo.j J2(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.rl = str;
            return this;
        }

        @Override // veW.Xo.j
        public Xo.j O(eO eOVar) {
            if (eOVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f74750n = eOVar;
            return this;
        }

        @Override // veW.Xo.j
        public Xo n() {
            String str = "";
            if (this.f74750n == null) {
                str = " transportContext";
            }
            if (this.rl == null) {
                str = str + " transportName";
            }
            if (this.f74751t == null) {
                str = str + " event";
            }
            if (this.nr == null) {
                str = str + " transformer";
            }
            if (this.f74749O == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new w6(this.f74750n, this.rl, this.f74751t, this.nr, this.f74749O);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // veW.Xo.j
        Xo.j nr(bF.CN3 cn3) {
            if (cn3 == null) {
                throw new NullPointerException("Null transformer");
            }
            this.nr = cn3;
            return this;
        }

        @Override // veW.Xo.j
        Xo.j rl(bF.n nVar) {
            if (nVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f74749O = nVar;
            return this;
        }

        @Override // veW.Xo.j
        Xo.j t(bF.w6 w6Var) {
            if (w6Var == null) {
                throw new NullPointerException("Null event");
            }
            this.f74751t = w6Var;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Xo) {
            Xo xo = (Xo) obj;
            if (this.f74747n.equals(xo.J2()) && this.rl.equals(xo.Uo()) && this.f74748t.equals(xo.t()) && this.nr.equals(xo.O()) && this.f74746O.equals(xo.rl())) {
                return true;
            }
        }
        return false;
    }

    private w6(eO eOVar, String str, bF.w6 w6Var, bF.CN3 cn3, bF.n nVar) {
        this.f74747n = eOVar;
        this.rl = str;
        this.f74748t = w6Var;
        this.nr = cn3;
        this.f74746O = nVar;
    }

    @Override // veW.Xo
    public eO J2() {
        return this.f74747n;
    }

    @Override // veW.Xo
    bF.CN3 O() {
        return this.nr;
    }

    @Override // veW.Xo
    public String Uo() {
        return this.rl;
    }

    public int hashCode() {
        return ((((((((this.f74747n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f74748t.hashCode()) * 1000003) ^ this.nr.hashCode()) * 1000003) ^ this.f74746O.hashCode();
    }

    @Override // veW.Xo
    public bF.n rl() {
        return this.f74746O;
    }

    @Override // veW.Xo
    bF.w6 t() {
        return this.f74748t;
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f74747n + ", transportName=" + this.rl + ", event=" + this.f74748t + ", transformer=" + this.nr + ", encoding=" + this.f74746O + "}";
    }
}
