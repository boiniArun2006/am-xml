package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f58784n;
    private final int nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f58785t;

    static final class n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private w6 f58786O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final float f58787n;
        private w6 nr;
        private final float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f58788t = new ArrayList();
        private int J2 = -1;
        private int Uo = -1;
        private float KN = 0.0f;
        private int xMQ = -1;

        private static float mUb(float f3, float f4, int i2, int i3) {
            return (f3 - (i2 * f4)) + (i3 * f4);
        }

        n J2(float f3, float f4, float f5, boolean z2, boolean z3, float f6, float f7, float f8) {
            if (f5 <= 0.0f) {
                return this;
            }
            if (z3) {
                if (z2) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i2 = this.xMQ;
                if (i2 != -1 && i2 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.xMQ = this.f58788t.size();
            }
            w6 w6Var = new w6(Float.MIN_VALUE, f3, f4, f5, z3, f6, f7, f8);
            if (z2) {
                if (this.nr == null) {
                    this.nr = w6Var;
                    this.J2 = this.f58788t.size();
                }
                if (this.Uo != -1 && this.f58788t.size() - this.Uo > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f5 != this.nr.nr) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f58786O = w6Var;
                this.Uo = this.f58788t.size();
            } else {
                if (this.nr == null && w6Var.nr < this.KN) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f58786O != null && w6Var.nr > this.KN) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.KN = w6Var.nr;
            this.f58788t.add(w6Var);
            return this;
        }

        n O(float f3, float f4, float f5, boolean z2, boolean z3, float f6) {
            return J2(f3, f4, f5, z2, z3, f6, 0.0f, 0.0f);
        }

        n Uo(float f3, float f4, float f5, int i2) {
            return KN(f3, f4, f5, i2, false);
        }

        n n(float f3, float f4, float f5) {
            return nr(f3, f4, f5, false, true);
        }

        n rl(float f3, float f4, float f5) {
            return t(f3, f4, f5, false);
        }

        n t(float f3, float f4, float f5, boolean z2) {
            return nr(f3, f4, f5, z2, false);
        }

        n KN(float f3, float f4, float f5, int i2, boolean z2) {
            if (i2 > 0 && f5 > 0.0f) {
                for (int i3 = 0; i3 < i2; i3++) {
                    t((i3 * f5) + f3, f4, f5, z2);
                }
            }
            return this;
        }

        n nr(float f3, float f4, float f5, boolean z2, boolean z3) {
            float fAbs;
            float f6 = f5 / 2.0f;
            float f7 = f3 - f6;
            float f8 = f6 + f3;
            float f9 = this.rl;
            if (f8 > f9) {
                fAbs = Math.abs(f8 - Math.max(f8 - f5, f9));
            } else {
                fAbs = 0.0f;
                if (f7 < 0.0f) {
                    fAbs = Math.abs(f7 - Math.min(f7 + f5, 0.0f));
                }
            }
            return O(f3, f4, f5, z2, z3, fAbs);
        }

        Wre xMQ() {
            if (this.nr == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f58788t.size(); i2++) {
                w6 w6Var = (w6) this.f58788t.get(i2);
                arrayList.add(new w6(mUb(this.nr.rl, this.f58787n, this.J2, i2), w6Var.rl, w6Var.f58791t, w6Var.nr, w6Var.f58789O, w6Var.J2, w6Var.Uo, w6Var.KN));
            }
            return new Wre(this.f58787n, arrayList, this.J2, this.Uo);
        }

        n(float f3, float f4) {
            this.f58787n = f3;
            this.rl = f4;
        }
    }

    static final class w6 {
        final float J2;
        final float KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final boolean f58789O;
        final float Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final float f58790n;
        final float nr;
        final float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final float f58791t;

        w6(float f3, float f4, float f5, float f6) {
            this(f3, f4, f5, f6, false, 0.0f, 0.0f, 0.0f);
        }

        w6(float f3, float f4, float f5, float f6, boolean z2, float f7, float f8, float f9) {
            this.f58790n = f3;
            this.rl = f4;
            this.f58791t = f5;
            this.nr = f6;
            this.f58789O = z2;
            this.J2 = f7;
            this.Uo = f8;
            this.KN = f9;
        }

        static w6 n(w6 w6Var, w6 w6Var2, float f3) {
            return new w6(G7.j.n(w6Var.f58790n, w6Var2.f58790n, f3), G7.j.n(w6Var.rl, w6Var2.rl, f3), G7.j.n(w6Var.f58791t, w6Var2.f58791t, f3), G7.j.n(w6Var.nr, w6Var2.nr, f3));
        }
    }

    w6 nr() {
        for (int i2 = 0; i2 < this.rl.size(); i2++) {
            w6 w6Var = (w6) this.rl.get(i2);
            if (!w6Var.f58789O) {
                return w6Var;
            }
        }
        return null;
    }

    private Wre(float f3, List list, int i2, int i3) {
        this.f58784n = f3;
        this.rl = Collections.unmodifiableList(list);
        this.f58785t = i2;
        this.nr = i3;
    }

    static Wre ty(Wre wre, float f3) {
        n nVar = new n(wre.J2(), f3);
        float f4 = (f3 - wre.mUb().rl) - (wre.mUb().nr / 2.0f);
        int size = wre.Uo().size() - 1;
        while (size >= 0) {
            w6 w6Var = (w6) wre.Uo().get(size);
            nVar.nr((w6Var.nr / 2.0f) + f4, w6Var.f58791t, w6Var.nr, size >= wre.rl() && size <= wre.xMQ(), w6Var.f58789O);
            f4 += w6Var.nr;
            size--;
        }
        return nVar.xMQ();
    }

    float J2() {
        return this.f58784n;
    }

    w6 KN() {
        return (w6) this.rl.get(this.nr);
    }

    List O() {
        return this.rl.subList(this.f58785t, this.nr + 1);
    }

    List Uo() {
        return this.rl;
    }

    w6 gh() {
        for (int size = this.rl.size() - 1; size >= 0; size--) {
            w6 w6Var = (w6) this.rl.get(size);
            if (!w6Var.f58789O) {
                return w6Var;
            }
        }
        return null;
    }

    w6 mUb() {
        return (w6) this.rl.get(r0.size() - 1);
    }

    w6 n() {
        return (w6) this.rl.get(this.f58785t);
    }

    int qie() {
        Iterator it = this.rl.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((w6) it.next()).f58789O) {
                i2++;
            }
        }
        return this.rl.size() - i2;
    }

    int rl() {
        return this.f58785t;
    }

    w6 t() {
        return (w6) this.rl.get(0);
    }

    int xMQ() {
        return this.nr;
    }

    static Wre az(Wre wre, Wre wre2, float f3) {
        if (wre.J2() == wre2.J2()) {
            List listUo = wre.Uo();
            List listUo2 = wre2.Uo();
            if (listUo.size() == listUo2.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < wre.Uo().size(); i2++) {
                    arrayList.add(w6.n((w6) listUo.get(i2), (w6) listUo2.get(i2), f3));
                }
                return new Wre(wre.J2(), arrayList, G7.j.t(wre.rl(), wre2.rl(), f3), G7.j.t(wre.xMQ(), wre2.xMQ(), f3));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }
}
