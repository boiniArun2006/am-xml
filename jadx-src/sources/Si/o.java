package Si;

import TFv.rv6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface o extends Cp.j, Xo {

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f9919n;
        private final int rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f9919n == jVar.f9919n && this.rl == jVar.rl;
        }

        public int hashCode() {
            return (Long.hashCode(this.f9919n) * 31) + Integer.hashCode(this.rl);
        }

        public final int n() {
            return this.rl;
        }

        public final long rl() {
            return this.f9919n;
        }

        public String toString() {
            return "PlayerPosition(timeUs=" + this.f9919n + ", frame=" + this.rl + ")";
        }

        public j(long j2, int i2) {
            this.f9919n = j2;
            this.rl = i2;
        }
    }

    rv6 X();

    rv6 getCurrentPosition();

    int getFramesPerHundredSeconds();

    void s7N(int i2, int i3);

    void seekTo(int i2);

    int t();
}
