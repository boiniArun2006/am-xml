package veW;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import veW.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Dsr {
    public abstract long HI();

    public abstract long J2();

    public abstract byte[] KN();

    public abstract fuX O();

    public abstract byte[] Uo();

    public abstract String az();

    public abstract Integer nr();

    public abstract Integer qie();

    protected abstract Map t();

    public abstract String ty();

    public static abstract class j {
        public abstract j HI(long j2);

        protected abstract j J2(Map map);

        public abstract j KN(fuX fux);

        protected abstract Map O();

        public abstract j Uo(Integer num);

        public abstract j az(String str);

        public abstract j gh(byte[] bArr);

        public abstract j mUb(byte[] bArr);

        public abstract Dsr nr();

        public abstract j qie(Integer num);

        public abstract j ty(String str);

        public abstract j xMQ(long j2);

        public final j n(String str, int i2) {
            O().put(str, String.valueOf(i2));
            return this;
        }

        public final j rl(String str, long j2) {
            O().put(str, String.valueOf(j2));
            return this;
        }

        public final j t(String str, String str2) {
            O().put(str, str2);
            return this;
        }
    }

    public static j n() {
        return new n.C1244n().J2(new HashMap());
    }

    public j ck() {
        return new n.C1244n().ty(ty()).Uo(nr()).qie(qie()).az(az()).mUb(Uo()).gh(KN()).KN(O()).xMQ(J2()).HI(HI()).J2(new HashMap(t()));
    }

    public final Map gh() {
        return Collections.unmodifiableMap(t());
    }

    public final long mUb(String str) {
        String str2 = (String) t().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final String rl(String str) {
        String str2 = (String) t().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int xMQ(String str) {
        String str2 = (String) t().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }
}
