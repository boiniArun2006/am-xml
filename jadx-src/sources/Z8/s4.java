package Z8;

import Z8.C;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class s4 {
    public abstract r J2();

    public abstract long KN();

    public abstract String O();

    public abstract long Uo();

    public abstract Integer nr();

    public abstract Xo rl();

    public abstract List t();

    public static abstract class j {
        public abstract j J2(r rVar);

        public abstract j KN(long j2);

        abstract j O(String str);

        public abstract j Uo(long j2);

        public abstract s4 n();

        abstract j nr(Integer num);

        public abstract j rl(Xo xo);

        public abstract j t(List list);

        public j mUb(String str) {
            return O(str);
        }

        public j xMQ(int i2) {
            return nr(Integer.valueOf(i2));
        }
    }

    public static j n() {
        return new C.n();
    }
}
