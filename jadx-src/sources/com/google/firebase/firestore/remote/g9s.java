package com.google.firebase.firestore.remote;

import java.util.HashMap;
import java.util.Map;
import uh.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class g9s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f60440n = 0;
    private final Map rl = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f60441t = true;
    private com.google.protobuf.C nr = com.google.protobuf.C.EMPTY;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f60439O = false;

    void J2() {
        this.f60441t = true;
        this.f60439O = true;
    }

    void n(pUk.C c2, qz.j jVar) {
        this.f60441t = true;
        this.rl.put(c2, jVar);
    }

    void rl() {
        this.f60441t = false;
        this.rl.clear();
    }

    void xMQ(pUk.C c2) {
        this.f60441t = true;
        this.rl.remove(c2);
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f60442n;

        static {
            int[] iArr = new int[qz.j.values().length];
            f60442n = iArr;
            try {
                iArr[qz.j.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60442n[qz.j.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60442n[qz.j.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    void KN() {
        this.f60440n--;
    }

    boolean O() {
        return this.f60440n != 0;
    }

    void Uo() {
        this.f60440n++;
    }

    boolean nr() {
        return this.f60439O;
    }

    boolean t() {
        return this.f60441t;
    }

    g9s() {
    }

    void gh(com.google.protobuf.C c2) {
        if (!c2.isEmpty()) {
            this.f60441t = true;
            this.nr = c2;
        }
    }

    Pe.z mUb() {
        eZ.I28 i28Nr = pUk.C.nr();
        eZ.I28 i28Nr2 = pUk.C.nr();
        eZ.I28 i28Nr3 = pUk.C.nr();
        eZ.I28 i28Nr4 = i28Nr;
        eZ.I28 i28Nr5 = i28Nr2;
        eZ.I28 i28Nr6 = i28Nr3;
        for (Map.Entry entry : this.rl.entrySet()) {
            pUk.C c2 = (pUk.C) entry.getKey();
            qz.j jVar = (qz.j) entry.getValue();
            int i2 = j.f60442n[jVar.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i28Nr6 = i28Nr6.nr(c2);
                    } else {
                        throw wqP.n.n("Encountered invalid change type: %s", jVar);
                    }
                } else {
                    i28Nr5 = i28Nr5.nr(c2);
                }
            } else {
                i28Nr4 = i28Nr4.nr(c2);
            }
        }
        return new Pe.z(this.nr, this.f60439O, i28Nr4, i28Nr5, i28Nr6);
    }
}
