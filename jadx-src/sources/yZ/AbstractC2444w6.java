package yZ;

import com.bendingspoons.spidersense.domain.network.entities.sampling.SpiderSenseServerSettings;
import ifA.I28;
import ifA.w6;

/* JADX INFO: renamed from: yZ.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class AbstractC2444w6 {
    private static final long J2(float f3) {
        return (long) (f3 * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ifA.w6 KN(Throwable th) {
        return new ifA.w6("SpiderSenseSetupperImpl", w6.n.f68149n, w6.j.f68145n, "The data store raised an exception when trying to read settings.", th, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I28.n Uo(SpiderSenseServerSettings spiderSenseServerSettings, String str) {
        return new I28.n(str, ifA.n.n(spiderSenseServerSettings.getRules()), false, Long.valueOf(J2(spiderSenseServerSettings.getSendNextBatchInterval())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ifA.w6 xMQ(Throwable th) {
        return new ifA.w6("SpiderSenseSetupperImpl", w6.n.f68149n, w6.j.f68145n, "The data store raised an exception when trying to write settings.", th, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ifA.w6 O(ifA.w6 w6Var, boolean z2) {
        return ifA.w6.rl(w6Var, null, null, null, null, null, w6Var.t().rl(pq.I28.n(pq.n.n("has_cached_settings", z2))), 31, null);
    }
}
