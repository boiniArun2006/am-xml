package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.Ew;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import uB.C2394Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class afx {
    private static final afx rl = new afx();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CopyOnWriteArrayList f60429n = new CopyOnWriteArrayList();

    static abstract class j {
        abstract int J2();

        abstract int Uo();

        abstract boolean n();

        abstract int rl();

        abstract BloomFilter t();

        static j nr(BloomFilter bloomFilter, boolean z2, int i2, int i3, int i5) {
            return new C(bloomFilter, z2, i2, i3, i5);
        }

        j() {
        }

        static j O(BloomFilter bloomFilter, Ew.n nVar, Pe.j jVar) {
            boolean z2;
            C2394Ml c2394MlRl = jVar.rl();
            if (c2394MlRl == null) {
                return null;
            }
            if (nVar == Ew.n.SUCCESS) {
                z2 = true;
            } else {
                z2 = false;
            }
            return nr(bloomFilter, z2, c2394MlRl.gh(), c2394MlRl.xMQ().xMQ().size(), c2394MlRl.xMQ().gh());
        }
    }

    static abstract class n {
        abstract int J2();

        abstract String Uo();

        abstract j n();

        abstract int nr();

        abstract String t();

        static n rl(int i2, int i3, String str, String str2, j jVar) {
            return new o(i2, i3, str, str2, jVar);
        }

        n() {
        }

        static n O(int i2, Pe.j jVar, pUk.Wre wre, BloomFilter bloomFilter, Ew.n nVar) {
            return rl(i2, jVar.n(), wre.J2(), wre.nr(), j.O(bloomFilter, nVar, jVar));
        }
    }

    static afx n() {
        return rl;
    }

    void rl(n nVar) {
        Iterator it = this.f60429n.iterator();
        while (it.hasNext()) {
            android.support.v4.media.j.n(((AtomicReference) it.next()).get());
        }
    }

    private afx() {
    }
}
