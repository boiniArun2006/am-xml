package qE;

import K6D.j;
import com.bendingspoons.networking.NetworkError;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Z {
    static /* synthetic */ void rl(K6D.j jVar, NetworkError networkError, pq.Ml ml, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            ml = new pq.Ml();
        }
        n(jVar, networkError, ml);
    }

    private static final void n(K6D.j jVar, NetworkError networkError, pq.Ml ml) {
        j.C0175j.rl(jVar, com.bendingspoons.networking.j.rl(networkError), null, pq.I28.n(pq.n.O("description", com.bendingspoons.networking.j.n(networkError))).rl(ml), 2, null);
    }
}
