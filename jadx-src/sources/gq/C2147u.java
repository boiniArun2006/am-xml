package gq;

import android.util.SparseArray;
import gq.C2147u;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import wqP.I28;

/* JADX INFO: renamed from: gq.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class C2147u {
    private static final long nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f67853t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Z f67854n;
    private final n rl;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: gq.u$Ml */
    static class Ml {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final Comparator f67855t = new Comparator() { // from class: gq.qf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Long) obj2).compareTo((Long) obj);
            }
        };

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final PriorityQueue f67856n;
        private final int rl;

        /* JADX INFO: Access modifiers changed from: package-private */
        public void rl(Long l2) {
            if (this.f67856n.size() < this.rl) {
                this.f67856n.add(l2);
                return;
            }
            if (l2.longValue() < ((Long) this.f67856n.peek()).longValue()) {
                this.f67856n.poll();
                this.f67856n.add(l2);
            }
        }

        long t() {
            return ((Long) this.f67856n.peek()).longValue();
        }

        Ml(int i2) {
            this.rl = i2;
            this.f67856n = new PriorityQueue(i2, f67855t);
        }
    }

    /* JADX INFO: renamed from: gq.u$j */
    public class j implements tmw {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final wqP.I28 f67858n;
        private I28.n nr;
        private final g9s rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f67859t = false;

        public j(wqP.I28 i28, g9s g9sVar) {
            this.f67858n = i28;
            this.rl = g9sVar;
        }

        public static /* synthetic */ void n(j jVar) {
            jVar.rl.HI(C2147u.this);
            jVar.f67859t = true;
            jVar.rl();
        }

        private void rl() {
            this.nr = this.f67858n.KN(I28.Ml.GARBAGE_COLLECTION, this.f67859t ? C2147u.nr : C2147u.f67853t, new Runnable() { // from class: gq.DAz
                @Override // java.lang.Runnable
                public final void run() {
                    C2147u.j.n(this.f67676n);
                }
            });
        }

        @Override // gq.tmw
        public void start() {
            if (C2147u.this.rl.f67860n != -1) {
                rl();
            }
        }
    }

    /* JADX INFO: renamed from: gq.u$n */
    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f67860n;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final int f67861t;

        public static n n(long j2) {
            return new n(j2, 10, 1000);
        }

        n(long j2, int i2, int i3) {
            this.f67860n = j2;
            this.rl = i2;
            this.f67861t = i3;
        }
    }

    /* JADX INFO: renamed from: gq.u$w6 */
    public static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f67862n;
        private final int nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f67863t;

        static w6 n() {
            return new w6(false, 0, 0, 0);
        }

        w6(boolean z2, int i2, int i3, int i5) {
            this.f67862n = z2;
            this.rl = i2;
            this.f67863t = i3;
            this.nr = i5;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f67853t = timeUnit.toMillis(1L);
        nr = timeUnit.toMillis(5L);
    }

    private w6 qie(SparseArray sparseArray) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iO = O(this.rl.rl);
        if (iO > this.rl.f67861t) {
            wqP.QJ.n("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.rl.f67861t + " from " + iO, new Object[0]);
            iO = this.rl.f67861t;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long jKN = KN(iO);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        int iGh = gh(jKN, sparseArray);
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        int iMUb = mUb(jKN);
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        if (wqP.QJ.t()) {
            String str = "LRU Garbage Collection:\n\tCounted targets in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms\n";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", Integer.valueOf(iO), Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2)));
            wqP.QJ.n("LruGarbageCollector", ((sb.toString() + String.format(locale, "\tRemoved %d targets in %dms\n", Integer.valueOf(iGh), Long.valueOf(jCurrentTimeMillis4 - jCurrentTimeMillis3))) + String.format(locale, "\tRemoved %d documents in %dms\n", Integer.valueOf(iMUb), Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis4))) + String.format(locale, "Total Duration: %dms", Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis)), new Object[0]);
        }
        return new w6(true, iO, iGh, iMUb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w6 J2(SparseArray sparseArray) {
        if (this.rl.f67860n == -1) {
            wqP.QJ.n("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
            return w6.n();
        }
        long jUo = Uo();
        if (jUo >= this.rl.f67860n) {
            return qie(sparseArray);
        }
        wqP.QJ.n("LruGarbageCollector", "Garbage collection skipped; Cache size " + jUo + " is lower than threshold " + this.rl.f67860n, new Object[0]);
        return w6.n();
    }

    long KN(int i2) {
        if (i2 == 0) {
            return -1L;
        }
        final Ml ml = new Ml(i2);
        this.f67854n.t(new wqP.C() { // from class: gq.Ew
            @Override // wqP.C
            public final void accept(Object obj) {
                ml.rl(Long.valueOf(((oJ) obj).O()));
            }
        });
        this.f67854n.mUb(new wqP.C() { // from class: gq.nKK
            @Override // wqP.C
            public final void accept(Object obj) {
                ml.rl((Long) obj);
            }
        });
        return ml.t();
    }

    int O(int i2) {
        return (int) ((i2 / 100.0f) * this.f67854n.HI());
    }

    long Uo() {
        return this.f67854n.ck();
    }

    int gh(long j2, SparseArray sparseArray) {
        return this.f67854n.gh(j2, sparseArray);
    }

    int mUb(long j2) {
        return this.f67854n.Uo(j2);
    }

    public j xMQ(wqP.I28 i28, g9s g9sVar) {
        return new j(i28, g9sVar);
    }

    C2147u(Z z2, n nVar) {
        this.f67854n = z2;
        this.rl = nVar;
    }
}
