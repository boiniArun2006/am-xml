package X7;

import X7.j;
import X7.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Ml f11750n = n().n();

    public static abstract class j {
        public abstract j J2(String str);

        public abstract j KN(long j2);

        public abstract j O(String str);

        public abstract j Uo(w6.j jVar);

        public abstract Ml n();

        public abstract j nr(String str);

        public abstract j rl(String str);

        public abstract j t(long j2);
    }

    public abstract String J2();

    public abstract long KN();

    public abstract String O();

    public abstract w6.j Uo();

    public abstract String nr();

    public abstract String rl();

    public abstract long t();

    public abstract j ty();

    public static j n() {
        return new j.n().KN(0L).Uo(w6.j.ATTEMPT_MIGRATION).t(0L);
    }

    public Ml HI(String str, long j2, long j3) {
        return ty().rl(str).t(j2).KN(j3).n();
    }

    public Ml Ik(String str) {
        return ty().O(str).Uo(w6.j.REGISTER_ERROR).n();
    }

    public Ml Z(String str) {
        return ty().nr(str).Uo(w6.j.UNREGISTERED).n();
    }

    public boolean az() {
        if (Uo() == w6.j.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    public Ml ck() {
        return ty().rl(null).n();
    }

    public boolean gh() {
        if (Uo() == w6.j.REGISTERED) {
            return true;
        }
        return false;
    }

    public boolean mUb() {
        if (Uo() != w6.j.NOT_GENERATED && Uo() != w6.j.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    public Ml o(String str, String str2, long j2, String str3, long j3) {
        return ty().nr(str).Uo(w6.j.REGISTERED).rl(str3).J2(str2).t(j3).KN(j2).n();
    }

    public boolean qie() {
        if (Uo() == w6.j.UNREGISTERED) {
            return true;
        }
        return false;
    }

    public Ml r() {
        return ty().Uo(w6.j.NOT_GENERATED).n();
    }

    public boolean xMQ() {
        if (Uo() == w6.j.REGISTER_ERROR) {
            return true;
        }
        return false;
    }
}
