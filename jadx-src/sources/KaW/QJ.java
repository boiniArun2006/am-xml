package KaW;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import okio.Buffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f5522n;
    private final ISg.w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5523t = 65535;
    private final w6 nr = new w6(0, 65535, null);

    private static final class I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5524n;

        private I28() {
        }

        boolean n() {
            return this.f5524n > 0;
        }

        void rl() {
            this.f5524n++;
        }
    }

    public interface Ml {
        w6[] n();
    }

    public interface n {
        void rl(int i2);
    }

    public final class w6 {
        private final n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f5525O;
        private int nr;
        private Runnable rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f5527t;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Buffer f5526n = new Buffer();
        private boolean Uo = false;

        void t() {
            this.f5525O = 0;
        }

        w6(int i2, int i3, n nVar) {
            this.f5527t = i2;
            this.nr = i3;
            this.J2 = nVar;
        }

        int J2(int i2) {
            if (i2 <= 0 || Integer.MAX_VALUE - i2 >= this.nr) {
                int i3 = this.nr + i2;
                this.nr = i3;
                return i3;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f5527t);
        }

        boolean O() {
            return this.f5526n.size() > 0;
        }

        int Uo() {
            return Math.max(0, Math.min(this.nr, (int) this.f5526n.size()));
        }

        void gh(Buffer buffer, int i2, boolean z2) {
            do {
                int iMin = Math.min(i2, QJ.this.rl.maxDataLength());
                int i3 = -iMin;
                QJ.this.nr.J2(i3);
                J2(i3);
                try {
                    QJ.this.rl.data(buffer.size() == ((long) iMin) && z2, this.f5527t, buffer, iMin);
                    this.J2.rl(iMin);
                    i2 -= iMin;
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } while (i2 > 0);
        }

        int mUb() {
            return Math.min(this.nr, QJ.this.nr.xMQ());
        }

        void n(int i2) {
            this.f5525O += i2;
        }

        void nr(Buffer buffer, int i2, boolean z2) {
            this.f5526n.write(buffer, i2);
            this.Uo |= z2;
        }

        int rl() {
            return this.f5525O;
        }

        int xMQ() {
            return this.nr;
        }

        int KN() {
            return Uo() - this.f5525O;
        }

        int qie(int i2, I28 i28) {
            Runnable runnable;
            int iMin = Math.min(i2, mUb());
            int size = 0;
            while (O() && iMin > 0) {
                if (iMin >= this.f5526n.size()) {
                    size += (int) this.f5526n.size();
                    Buffer buffer = this.f5526n;
                    gh(buffer, (int) buffer.size(), this.Uo);
                } else {
                    size += iMin;
                    gh(this.f5526n, iMin, false);
                }
                i28.rl();
                iMin = Math.min(i2 - size, mUb());
            }
            if (!O() && (runnable = this.rl) != null) {
                runnable.run();
                this.rl = null;
            }
            return size;
        }
    }

    public boolean J2(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + i2);
        }
        int i3 = i2 - this.f5523t;
        this.f5523t = i2;
        for (w6 w6Var : this.f5522n.n()) {
            w6Var.J2(i3);
        }
        return i3 > 0;
    }

    public void KN() {
        int i2;
        w6[] w6VarArrN = this.f5522n.n();
        Collections.shuffle(Arrays.asList(w6VarArrN));
        int iXMQ = this.nr.xMQ();
        int length = w6VarArrN.length;
        while (true) {
            i2 = 0;
            if (length <= 0 || iXMQ <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(iXMQ / length);
            for (int i3 = 0; i3 < length && iXMQ > 0; i3++) {
                w6 w6Var = w6VarArrN[i3];
                int iMin = Math.min(iXMQ, Math.min(w6Var.KN(), iCeil));
                if (iMin > 0) {
                    w6Var.n(iMin);
                    iXMQ -= iMin;
                }
                if (w6Var.KN() > 0) {
                    w6VarArrN[i2] = w6Var;
                    i2++;
                }
            }
            length = i2;
        }
        I28 i28 = new I28();
        w6[] w6VarArrN2 = this.f5522n.n();
        int length2 = w6VarArrN2.length;
        while (i2 < length2) {
            w6 w6Var2 = w6VarArrN2[i2];
            w6Var2.qie(w6Var2.rl(), i28);
            w6Var2.t();
            i2++;
        }
        if (i28.n()) {
            O();
        }
    }

    public void O() {
        try {
            this.rl.flush();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public int Uo(w6 w6Var, int i2) {
        if (w6Var == null) {
            int iJ2 = this.nr.J2(i2);
            KN();
            return iJ2;
        }
        int iJ22 = w6Var.J2(i2);
        I28 i28 = new I28();
        w6Var.qie(w6Var.mUb(), i28);
        if (i28.n()) {
            O();
        }
        return iJ22;
    }

    public void nr(boolean z2, w6 w6Var, Buffer buffer, boolean z3) {
        t1.Xo.ck(buffer, "source");
        int iMUb = w6Var.mUb();
        boolean zO = w6Var.O();
        int size = (int) buffer.size();
        if (zO || iMUb < size) {
            if (!zO && iMUb > 0) {
                w6Var.gh(buffer, iMUb, false);
            }
            w6Var.nr(buffer, (int) buffer.size(), z2);
        } else {
            w6Var.gh(buffer, size, z2);
        }
        if (z3) {
            O();
        }
    }

    public w6 t(n nVar, int i2) {
        return new w6(i2, this.f5523t, (n) t1.Xo.ck(nVar, "stream"));
    }

    public QJ(Ml ml, ISg.w6 w6Var) {
        this.f5522n = (Ml) t1.Xo.ck(ml, "transport");
        this.rl = (ISg.w6) t1.Xo.ck(w6Var, "frameWriter");
    }
}
