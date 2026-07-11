package z3E;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Wre {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static final Wre f76352O = new Wre(CN3.rl, 0, 0, 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76353n;
    private final int nr;
    private final CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f76354t;

    boolean J2(Wre wre) {
        int i2;
        int i3 = this.nr + (Ml.f76349t[this.f76353n][wre.f76353n] >> 16);
        int i5 = wre.f76354t;
        if (i5 > 0 && ((i2 = this.f76354t) == 0 || i2 > i5)) {
            i3 += 10;
        }
        return i3 <= wre.nr;
    }

    Wre KN(int i2, int i3) {
        CN3 cn3 = this.rl;
        int i5 = this.f76353n;
        int i7 = i5 == 2 ? 4 : 5;
        return new Wre(cn3.n(Ml.f76348O[i5][i2], i7).n(i3, 5), this.f76353n, 0, this.nr + i7 + 5);
    }

    int O() {
        return this.f76353n;
    }

    Wre Uo(int i2, int i3) {
        int i5 = this.nr;
        CN3 cn3N = this.rl;
        int i7 = this.f76353n;
        if (i2 != i7) {
            int i8 = Ml.f76349t[i7][i2];
            int i9 = 65535 & i8;
            int i10 = i8 >> 16;
            cn3N = cn3N.n(i9, i10);
            i5 += i10;
        }
        int i11 = i2 == 2 ? 4 : 5;
        return new Wre(cn3N.n(i3, i11), i2, 0, i5 + i11);
    }

    Wre n(int i2) {
        CN3 cn3N = this.rl;
        int i3 = this.f76353n;
        int i5 = this.nr;
        if (i3 == 4 || i3 == 2) {
            int i7 = Ml.f76349t[i3][0];
            int i8 = 65535 & i7;
            int i9 = i7 >> 16;
            cn3N = cn3N.n(i8, i9);
            i5 += i9;
            i3 = 0;
        }
        int i10 = this.f76354t;
        Wre wre = new Wre(cn3N, i3, i10 + 1, i5 + ((i10 == 0 || i10 == 31) ? 18 : i10 == 62 ? 9 : 8));
        return wre.f76354t == 2078 ? wre.rl(i2 + 1) : wre;
    }

    int nr() {
        return this.nr;
    }

    Wre rl(int i2) {
        int i3 = this.f76354t;
        return i3 == 0 ? this : new Wre(this.rl.rl(i2 - i3, i3), this.f76353n, 0, this.nr);
    }

    int t() {
        return this.f76354t;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", Ml.rl[this.f76353n], Integer.valueOf(this.nr), Integer.valueOf(this.f76354t));
    }

    x4x.j xMQ(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (CN3 cn3Nr = rl(bArr.length).rl; cn3Nr != null; cn3Nr = cn3Nr.nr()) {
            linkedList.addFirst(cn3Nr);
        }
        x4x.j jVar = new x4x.j();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((CN3) it.next()).t(jVar, bArr);
        }
        return jVar;
    }

    private Wre(CN3 cn3, int i2, int i3, int i5) {
        this.rl = cn3;
        this.f76353n = i2;
        this.f76354t = i3;
        this.nr = i5;
    }
}
