package Gg;

import Gg.w6;
import android.app.job.JobInfo;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Wre {

    public static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private MR.j f3710n;
        private Map rl = new HashMap();

        public j n(bF.I28 i28, n nVar) {
            this.rl.put(i28, nVar);
            return this;
        }

        public Wre rl() {
            if (this.f3710n == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.rl.keySet().size() < bF.I28.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.rl;
            this.rl = new HashMap();
            return Wre.nr(this.f3710n, map);
        }

        public j t(MR.j jVar) {
            this.f3710n = jVar;
            return this;
        }
    }

    public static abstract class n {

        public static abstract class j {
            public abstract n n();

            public abstract j nr(long j2);

            public abstract j rl(long j2);

            public abstract j t(Set set);
        }

        abstract long nr();

        abstract long rl();

        abstract Set t();

        public static j n() {
            return new w6.n().t(Collections.EMPTY_SET);
        }
    }

    public enum w6 {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    abstract Map KN();

    abstract MR.j O();

    private void mUb(JobInfo.Builder builder, Set set) {
        if (set.contains(w6.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(w6.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(w6.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    private long n(int i2, long j2) {
        return (long) (Math.pow(3.0d, i2 - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) r7))));
    }

    static Wre nr(MR.j jVar, Map map) {
        return new Gg.n(jVar, map);
    }

    public static j rl() {
        return new j();
    }

    private static Set xMQ(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public static Wre J2(MR.j jVar) {
        return rl().n(bF.I28.DEFAULT, n.n().rl(30000L).nr(SignalManager.TWENTY_FOUR_HOURS_MILLIS).n()).n(bF.I28.HIGHEST, n.n().rl(1000L).nr(SignalManager.TWENTY_FOUR_HOURS_MILLIS).n()).n(bF.I28.VERY_LOW, n.n().rl(SignalManager.TWENTY_FOUR_HOURS_MILLIS).nr(SignalManager.TWENTY_FOUR_HOURS_MILLIS).t(xMQ(w6.DEVICE_IDLE)).n()).t(jVar).rl();
    }

    public long Uo(bF.I28 i28, long j2, int i2) {
        long time = j2 - O().getTime();
        n nVar = (n) KN().get(i28);
        return Math.min(Math.max(n(i2, nVar.rl()), time), nVar.nr());
    }

    public JobInfo.Builder t(JobInfo.Builder builder, bF.I28 i28, long j2, int i2) {
        builder.setMinimumLatency(Uo(i28, j2, i2));
        mUb(builder, ((n) KN().get(i28)).t());
        return builder;
    }
}
