package eZ;

import eZ.fuX;
import eZ.w6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class C extends w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private fuX f63748n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Comparator f63749t;

    private static class n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private aC f63750O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f63751n;
        private aC nr;
        private final Map rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final w6.j.InterfaceC0853j f63752t;

        static class j implements Iterable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private long f63753n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final int f63754t;

            /* JADX INFO: renamed from: eZ.C$n$j$j, reason: collision with other inner class name */
            class C0850j implements Iterator {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private int f63755n;

                @Override // java.util.Iterator
                public void remove() {
                }

                C0850j() {
                    this.f63755n = j.this.f63754t - 1;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f63755n >= 0;
                }

                @Override // java.util.Iterator
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public C0851n next() {
                    long j2 = j.this.f63753n & ((long) (1 << this.f63755n));
                    C0851n c0851n = new C0851n();
                    c0851n.f63757n = j2 == 0;
                    c0851n.rl = (int) Math.pow(2.0d, this.f63755n);
                    this.f63755n--;
                    return c0851n;
                }
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return new C0850j();
            }

            public j(int i2) {
                int i3 = i2 + 1;
                int iFloor = (int) Math.floor(Math.log(i3) / Math.log(2.0d));
                this.f63754t = iFloor;
                this.f63753n = (((long) Math.pow(2.0d, iFloor)) - 1) & ((long) i3);
            }
        }

        /* JADX INFO: renamed from: eZ.C$n$n, reason: collision with other inner class name */
        static class C0851n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public boolean f63757n;
            public int rl;

            C0851n() {
            }
        }

        private fuX n(int i2, int i3) {
            if (i3 == 0) {
                return CN3.xMQ();
            }
            if (i3 == 1) {
                Object obj = this.f63751n.get(i2);
                return new Wre(obj, nr(obj), null, null);
            }
            int i5 = i3 / 2;
            int i7 = i2 + i5;
            fuX fuxN = n(i2, i5);
            fuX fuxN2 = n(i7 + 1, i5);
            Object obj2 = this.f63751n.get(i7);
            return new Wre(obj2, nr(obj2), fuxN, fuxN2);
        }

        private Object nr(Object obj) {
            return this.rl.get(this.f63752t.n(obj));
        }

        public static C rl(List list, Map map, w6.j.InterfaceC0853j interfaceC0853j, Comparator comparator) {
            n nVar = new n(list, map, interfaceC0853j);
            Collections.sort(list, comparator);
            int size = list.size();
            for (C0851n c0851n : new j(list.size())) {
                int i2 = c0851n.rl;
                size -= i2;
                if (c0851n.f63757n) {
                    nVar.t(fuX.j.BLACK, i2, size);
                } else {
                    nVar.t(fuX.j.BLACK, i2, size);
                    int i3 = c0851n.rl;
                    size -= i3;
                    nVar.t(fuX.j.RED, i3, size);
                }
            }
            fuX fuxXMQ = nVar.nr;
            if (fuxXMQ == null) {
                fuxXMQ = CN3.xMQ();
            }
            return new C(fuxXMQ, comparator);
        }

        private void t(fuX.j jVar, int i2, int i3) {
            fuX fuxN = n(i3 + 1, i2 - 1);
            Object obj = this.f63751n.get(i3);
            aC dsr = jVar == fuX.j.RED ? new Dsr(obj, nr(obj), null, fuxN) : new Wre(obj, nr(obj), null, fuxN);
            if (this.nr == null) {
                this.nr = dsr;
                this.f63750O = dsr;
            } else {
                this.f63750O.Z(dsr);
                this.f63750O = dsr;
            }
        }

        private n(List list, Map map, w6.j.InterfaceC0853j interfaceC0853j) {
            this.f63751n = list;
            this.rl = map;
            this.f63752t = interfaceC0853j;
        }
    }

    private C(fuX fux, Comparator comparator) {
        this.f63748n = fux;
        this.f63749t = comparator;
    }

    public static C gh(Map map, Comparator comparator) {
        return n.rl(new ArrayList(map.keySet()), map, w6.j.nr(), comparator);
    }

    private fuX qie(Object obj) {
        fuX fuxT = this.f63748n;
        while (!fuxT.isEmpty()) {
            int iCompare = this.f63749t.compare(obj, fuxT.getKey());
            if (iCompare < 0) {
                fuxT = fuxT.t();
            } else {
                if (iCompare == 0) {
                    return fuxT;
                }
                fuxT = fuxT.nr();
            }
        }
        return null;
    }

    @Override // eZ.w6
    public Object J2() {
        return this.f63748n.Uo().getKey();
    }

    @Override // eZ.w6
    public Iterator KN(Object obj) {
        return new Ml(this.f63748n, obj, this.f63749t, false);
    }

    @Override // eZ.w6
    public Object O() {
        return this.f63748n.KN().getKey();
    }

    @Override // eZ.w6
    public w6 Uo(Object obj, Object obj2) {
        return new C(this.f63748n.O(obj, obj2, this.f63749t).rl(null, null, fuX.j.BLACK, null, null), this.f63749t);
    }

    @Override // eZ.w6
    public boolean isEmpty() {
        return this.f63748n.isEmpty();
    }

    @Override // eZ.w6, java.lang.Iterable
    public Iterator iterator() {
        return new Ml(this.f63748n, null, this.f63749t, false);
    }

    @Override // eZ.w6
    public Comparator nr() {
        return this.f63749t;
    }

    @Override // eZ.w6
    public int size() {
        return this.f63748n.size();
    }

    public static C mUb(List list, Map map, w6.j.InterfaceC0853j interfaceC0853j, Comparator comparator) {
        return n.rl(list, map, interfaceC0853j, comparator);
    }

    @Override // eZ.w6
    public boolean rl(Object obj) {
        if (qie(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // eZ.w6
    public Object t(Object obj) {
        fuX fuxQie = qie(obj);
        if (fuxQie != null) {
            return fuxQie.getValue();
        }
        return null;
    }

    @Override // eZ.w6
    public w6 xMQ(Object obj) {
        if (!rl(obj)) {
            return this;
        }
        return new C(this.f63748n.J2(obj, this.f63749t).rl(null, null, fuX.j.BLACK, null, null), this.f63749t);
    }
}
