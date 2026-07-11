package K6D;

import ajd.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface j {

    /* JADX INFO: renamed from: K6D.j$j, reason: collision with other inner class name */
    public static final class C0175j {
        public static /* synthetic */ void n(j jVar, pq.Ml ml, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackCompleted");
            }
            if ((i2 & 1) != 0) {
                ml = new pq.Ml();
            }
            jVar.n(ml);
        }

        public static /* synthetic */ void rl(j jVar, String str, j.EnumC0481j enumC0481j, pq.Ml ml, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackFailed");
            }
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                enumC0481j = j.EnumC0481j.J2;
            }
            if ((i2 & 4) != 0) {
                ml = new pq.Ml();
            }
            jVar.rl(str, enumC0481j, ml);
        }
    }

    void n(pq.Ml ml);

    void rl(String str, j.EnumC0481j enumC0481j, pq.Ml ml);
}
