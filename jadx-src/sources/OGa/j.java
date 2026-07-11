package OGa;

import OGa.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7300n;
    private Ml.j rl = Ml.j.DEFAULT;

    /* JADX INFO: renamed from: OGa.j$j, reason: collision with other inner class name */
    private static final class C0248j implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f7301n;
        private final Ml.j rl;

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ml)) {
                return false;
            }
            Ml ml = (Ml) obj;
            return this.f7301n == ml.tag() && this.rl.equals(ml.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return Ml.class;
        }

        @Override // OGa.Ml
        public Ml.j intEncoding() {
            return this.rl;
        }

        @Override // OGa.Ml
        public int tag() {
            return this.f7301n;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f7301n + "intEncoding=" + this.rl + ')';
        }

        C0248j(int i2, Ml.j jVar) {
            this.f7301n = i2;
            this.rl = jVar;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f7301n) + (this.rl.hashCode() ^ 2041407134);
        }
    }

    public static j rl() {
        return new j();
    }

    public Ml n() {
        return new C0248j(this.f7300n, this.rl);
    }

    public j t(int i2) {
        this.f7300n = i2;
        return this;
    }
}
