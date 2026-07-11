package Z8;

import Z8.aC;

/* JADX INFO: renamed from: Z8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class AbstractC1495c {

    /* JADX INFO: renamed from: Z8.c$j */
    public static abstract class j {
        public abstract j J2(z zVar);

        abstract j KN(byte[] bArr);

        public abstract j O(long j2);

        public abstract j Uo(Q q2);

        public abstract j mUb(long j2);

        public abstract AbstractC1495c n();

        public abstract j nr(long j2);

        public abstract j rl(eO eOVar);

        public abstract j t(Integer num);

        abstract j xMQ(String str);
    }

    public abstract z J2();

    public abstract byte[] KN();

    public abstract long O();

    public abstract Q Uo();

    public abstract long mUb();

    public abstract long nr();

    public abstract eO rl();

    public abstract Integer t();

    public abstract String xMQ();

    private static j n() {
        return new aC.n();
    }

    public static j gh(String str) {
        return n().xMQ(str);
    }

    public static j qie(byte[] bArr) {
        return n().KN(bArr);
    }
}
