package com.facebook.datasource;

import Hh.C;
import Hh.qz;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Wre implements qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f52368n;

    private class j extends com.facebook.datasource.j {
        private int KN = 0;
        private w6 xMQ = null;
        private w6 mUb = null;

        /* JADX INFO: renamed from: com.facebook.datasource.Wre$j$j, reason: collision with other inner class name */
        private class C0745j implements I28 {
            @Override // com.facebook.datasource.I28
            public void n(w6 w6Var) {
            }

            private C0745j() {
            }

            @Override // com.facebook.datasource.I28
            public void nr(w6 w6Var) {
                j.this.r(Math.max(j.this.t(), w6Var.t()));
            }

            @Override // com.facebook.datasource.I28
            public void rl(w6 w6Var) {
                j.this.fD(w6Var);
            }

            @Override // com.facebook.datasource.I28
            public void t(w6 w6Var) {
                if (w6Var.n()) {
                    j.this.E2(w6Var);
                } else if (w6Var.rl()) {
                    j.this.fD(w6Var);
                }
            }
        }

        private synchronized boolean ViF(w6 w6Var) {
            if (!mUb() && w6Var == this.xMQ) {
                this.xMQ = null;
                return true;
            }
            return false;
        }

        private synchronized boolean e(w6 w6Var) {
            if (mUb()) {
                return false;
            }
            this.xMQ = w6Var;
            return true;
        }

        private synchronized w6 g() {
            return this.mUb;
        }

        private void iF(w6 w6Var, boolean z2) {
            w6 w6Var2;
            synchronized (this) {
                if (w6Var == this.xMQ && w6Var != (w6Var2 = this.mUb)) {
                    if (w6Var2 == null || z2) {
                        this.mUb = w6Var;
                    } else {
                        w6Var2 = null;
                    }
                    nY(w6Var2);
                }
            }
        }

        private synchronized qz te() {
            if (mUb() || this.KN >= Wre.this.f52368n.size()) {
                return null;
            }
            List list = Wre.this.f52368n;
            int i2 = this.KN;
            this.KN = i2 + 1;
            return (qz) list.get(i2);
        }

        @Override // com.facebook.datasource.j, com.facebook.datasource.w6
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    w6 w6Var = this.xMQ;
                    this.xMQ = null;
                    w6 w6Var2 = this.mUb;
                    this.mUb = null;
                    nY(w6Var2);
                    nY(w6Var);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.facebook.datasource.j, com.facebook.datasource.w6
        public synchronized Object getResult() {
            w6 w6VarG;
            w6VarG = g();
            return w6VarG != null ? w6VarG.getResult() : null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
        @Override // com.facebook.datasource.j, com.facebook.datasource.w6
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public synchronized boolean n() {
            boolean z2;
            w6 w6VarG = g();
            if (w6VarG != null) {
                z2 = w6VarG.n();
            }
            return z2;
        }

        public j() {
            if (X()) {
                return;
            }
            HI(new RuntimeException("No data source supplier or supplier returned null."));
        }

        private void nY(w6 w6Var) {
            if (w6Var != null) {
                w6Var.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E2(w6 w6Var) {
            iF(w6Var, w6Var.rl());
            if (w6Var == g()) {
                Z(null, w6Var.rl(), w6Var.getExtras());
            }
        }

        private boolean X() {
            w6 w6Var;
            qz qzVarTe = te();
            if (qzVarTe != null) {
                w6Var = (w6) qzVarTe.get();
            } else {
                w6Var = null;
            }
            if (e(w6Var) && w6Var != null) {
                w6Var.O(new C0745j(), Gs.j.n());
                return true;
            }
            nY(w6Var);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fD(w6 w6Var) {
            if (ViF(w6Var)) {
                if (w6Var != g()) {
                    nY(w6Var);
                }
                if (!X()) {
                    ck(w6Var.nr(), w6Var.getExtras());
                }
            }
        }
    }

    public static Wre rl(List list) {
        return new Wre(list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Wre) {
            return Hh.Dsr.n(this.f52368n, ((Wre) obj).f52368n);
        }
        return false;
    }

    public int hashCode() {
        return this.f52368n.hashCode();
    }

    @Override // Hh.qz
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public w6 get() {
        return new j();
    }

    private Wre(List list) {
        C.t(!list.isEmpty(), "List of suppliers is empty!");
        this.f52368n = list;
    }

    public String toString() {
        return Hh.Dsr.rl(this).rl("list", this.f52368n).toString();
    }
}
