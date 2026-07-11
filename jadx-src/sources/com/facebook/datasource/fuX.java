package com.facebook.datasource;

import Hh.C;
import Hh.qz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class fuX implements qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f52370n;
    private final boolean rl;

    private class j extends com.facebook.datasource.j {
        private ArrayList KN;
        private Map az;
        private AtomicInteger gh;
        private int mUb;
        private Throwable qie;
        private int xMQ;

        /* JADX INFO: renamed from: com.facebook.datasource.fuX$j$j, reason: collision with other inner class name */
        private class C0746j implements I28 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f52371n;

            @Override // com.facebook.datasource.I28
            public void n(w6 w6Var) {
            }

            public C0746j(int i2) {
                this.f52371n = i2;
            }

            @Override // com.facebook.datasource.I28
            public void nr(w6 w6Var) {
                if (this.f52371n == 0) {
                    j.this.r(w6Var.t());
                }
            }

            @Override // com.facebook.datasource.I28
            public void rl(w6 w6Var) {
                j.this.e(this.f52371n, w6Var);
            }

            @Override // com.facebook.datasource.I28
            public void t(w6 w6Var) {
                if (w6Var.n()) {
                    j.this.X(this.f52371n, w6Var);
                } else if (w6Var.rl()) {
                    j.this.e(this.f52371n, w6Var);
                }
            }
        }

        private void E2(int i2, w6 w6Var, boolean z2) {
            synchronized (this) {
                try {
                    int i3 = this.xMQ;
                    if (w6Var == te(i2) && i2 != this.xMQ) {
                        if (iF() == null || (z2 && i2 < this.xMQ)) {
                            this.xMQ = i2;
                        } else {
                            i2 = i3;
                        }
                        while (i3 > i2) {
                            ViF(g(i3));
                            i3--;
                        }
                    }
                } finally {
                }
            }
        }

        private synchronized w6 T(int i2, w6 w6Var) {
            if (w6Var == iF()) {
                return null;
            }
            if (w6Var != te(i2)) {
                return w6Var;
            }
            return g(i2);
        }

        private synchronized w6 g(int i2) {
            w6 w6Var;
            ArrayList arrayList = this.KN;
            w6Var = null;
            if (arrayList != null && i2 < arrayList.size()) {
                w6Var = (w6) this.KN.set(i2, null);
            }
            return w6Var;
        }

        private synchronized w6 iF() {
            return te(this.xMQ);
        }

        private synchronized w6 te(int i2) {
            ArrayList arrayList;
            arrayList = this.KN;
            return (arrayList == null || i2 >= arrayList.size()) ? null : (w6) this.KN.get(i2);
        }

        @Override // com.facebook.datasource.j, com.facebook.datasource.w6
        public synchronized Object getResult() {
            w6 w6VarIF;
            try {
                if (fuX.this.rl) {
                    nY();
                }
                w6VarIF = iF();
            } catch (Throwable th) {
                throw th;
            }
            return w6VarIF != null ? w6VarIF.getResult() : null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
        @Override // com.facebook.datasource.j, com.facebook.datasource.w6
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public synchronized boolean n() {
            boolean z2;
            try {
                if (fuX.this.rl) {
                    nY();
                }
                w6 w6VarIF = iF();
                if (w6VarIF != null) {
                    z2 = w6VarIF.n();
                }
            } catch (Throwable th) {
                throw th;
            }
            return z2;
        }

        public j() {
            if (fuX.this.rl) {
                return;
            }
            nY();
        }

        private void ViF(w6 w6Var) {
            if (w6Var != null) {
                w6Var.close();
            }
        }

        private void fD() {
            Throwable th;
            if (this.gh.incrementAndGet() != this.mUb || (th = this.qie) == null) {
                return;
            }
            ck(th, this.az);
        }

        private void nY() {
            if (this.gh != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.gh == null) {
                        this.gh = new AtomicInteger(0);
                        int size = fuX.this.f52370n.size();
                        this.mUb = size;
                        this.xMQ = size;
                        this.KN = new ArrayList(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            w6 w6Var = (w6) ((qz) fuX.this.f52370n.get(i2)).get();
                            this.KN.add(w6Var);
                            w6Var.O(new C0746j(i2), Gs.j.n());
                            if (!w6Var.n()) {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        @Override // com.facebook.datasource.j, com.facebook.datasource.w6
        public boolean close() {
            if (fuX.this.rl) {
                nY();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList arrayList = this.KN;
                    this.KN = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ViF((w6) arrayList.get(i2));
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void X(int i2, w6 w6Var) {
            boolean z2;
            E2(i2, w6Var, w6Var.rl());
            if (w6Var == iF()) {
                if (i2 == 0 && w6Var.rl()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Z(null, z2, w6Var.getExtras());
            }
            fD();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(int i2, w6 w6Var) {
            ViF(T(i2, w6Var));
            if (i2 == 0) {
                this.qie = w6Var.nr();
                this.az = w6Var.getExtras();
            }
            fD();
        }
    }

    public static fuX t(List list, boolean z2) {
        return new fuX(list, z2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fuX) {
            return Hh.Dsr.n(this.f52370n, ((fuX) obj).f52370n);
        }
        return false;
    }

    public int hashCode() {
        return this.f52370n.hashCode();
    }

    @Override // Hh.qz
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public w6 get() {
        return new j();
    }

    private fuX(List list, boolean z2) {
        C.t(!list.isEmpty(), "List of suppliers is empty!");
        this.f52370n = list;
        this.rl = z2;
    }

    public String toString() {
        return Hh.Dsr.rl(this).rl("list", this.f52370n).toString();
    }
}
