package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class x implements s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f56707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56710d = 0;

    public static void c(int i2) throws n1 {
        if ((i2 & 3) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(Class cls, h0 h0Var) throws m1 {
        b(3);
        return c(p2.f56635c.a(cls), h0Var);
    }

    public final void b(int i2) throws m1 {
        if ((this.f56708b & 7) == i2) {
            return;
        }
        int i3 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int d() throws m1 {
        b(0);
        return this.f56707a.k();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int e() {
        return this.f56708b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long f() throws m1 {
        b(0);
        return this.f56707a.v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long g() throws m1 {
        b(1);
        return this.f56707a.i();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final double h() throws m1 {
        b(1);
        return this.f56707a.f();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean i() {
        int i2;
        if (this.f56707a.c() || (i2 = this.f56708b) == this.f56709c) {
            return false;
        }
        return this.f56707a.e(i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int j() throws m1 {
        b(0);
        return this.f56707a.p();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final float k() throws m1 {
        b(5);
        return this.f56707a.j();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long l() throws m1 {
        b(0);
        return this.f56707a.q();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int m() throws m1 {
        b(5);
        return this.f56707a.n();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String n() throws m1 {
        b(2);
        return this.f56707a.r();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long o() throws m1 {
        b(0);
        return this.f56707a.l();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String p() throws m1 {
        b(2);
        return this.f56707a.s();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int q() throws m1 {
        b(5);
        return this.f56707a.h();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean r() throws m1 {
        b(0);
        return this.f56707a.d();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long t() throws m1 {
        b(1);
        return this.f56707a.o();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void e(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof a1)) {
            int i2 = this.f56708b & 7;
            if (i2 == 2) {
                int iU = this.f56707a.u();
                c(iU);
                int iB = this.f56707a.b() + iU;
                do {
                    list.add(Integer.valueOf(this.f56707a.h()));
                } while (this.f56707a.b() < iB);
                return;
            }
            if (i2 != 5) {
                int i3 = n1.f56624a;
                throw new m1();
            }
            do {
                list.add(Integer.valueOf(this.f56707a.h()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        a1 a1Var = (a1) list;
        int i5 = this.f56708b & 7;
        if (i5 == 2) {
            int iU2 = this.f56707a.u();
            c(iU2);
            int iB2 = this.f56707a.b() + iU2;
            do {
                a1Var.c(this.f56707a.h());
            } while (this.f56707a.b() < iB2);
            return;
        }
        if (i5 != 5) {
            int i7 = n1.f56624a;
            throw new m1();
        }
        do {
            a1Var.c(this.f56707a.h());
            if (this.f56707a.c()) {
                return;
            } else {
                iT2 = this.f56707a.t();
            }
        } while (iT2 == this.f56708b);
        this.f56710d = iT2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int s() {
        int i2 = this.f56710d;
        if (i2 != 0) {
            this.f56708b = i2;
            this.f56710d = 0;
        } else {
            this.f56708b = this.f56707a.t();
        }
        int i3 = this.f56708b;
        if (i3 == 0 || i3 == this.f56709c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    public x(w wVar) {
        Charset charset = l1.f56612a;
        if (wVar != null) {
            this.f56707a = wVar;
            wVar.f56696d = this;
            return;
        }
        throw new NullPointerException("input");
    }

    public static void d(int i2) throws n1 {
        if ((i2 & 7) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public final Object c(t2 t2Var, h0 h0Var) {
        int i2 = this.f56709c;
        this.f56709c = ((this.f56708b >>> 3) << 3) | 4;
        try {
            Object objA = t2Var.a();
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            if (this.f56708b == this.f56709c) {
                return objA;
            }
            throw new n1("Failed to parse the message.");
        } finally {
            this.f56709c = i2;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void f(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i2 = this.f56708b & 7;
            if (i2 == 2) {
                int iU = this.f56707a.u();
                c(iU);
                int iB = this.f56707a.b() + iU;
                do {
                    a1Var.c(this.f56707a.n());
                } while (this.f56707a.b() < iB);
                return;
            }
            if (i2 == 5) {
                do {
                    a1Var.c(this.f56707a.n());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            int i3 = n1.f56624a;
            throw new m1();
        }
        int i5 = this.f56708b & 7;
        if (i5 == 2) {
            int iU2 = this.f56707a.u();
            c(iU2);
            int iB2 = this.f56707a.b() + iU2;
            do {
                list.add(Integer.valueOf(this.f56707a.n()));
            } while (this.f56707a.b() < iB2);
            return;
        }
        if (i5 == 5) {
            do {
                list.add(Integer.valueOf(this.f56707a.n()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        int i7 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void g(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i2 = this.f56708b & 7;
            if (i2 == 0) {
                do {
                    u1Var.a(this.f56707a.q());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            if (i2 == 2) {
                int iB = this.f56707a.b() + this.f56707a.u();
                do {
                    u1Var.a(this.f56707a.q());
                } while (this.f56707a.b() < iB);
                a(iB);
                return;
            }
            int i3 = n1.f56624a;
            throw new m1();
        }
        int i5 = this.f56708b & 7;
        if (i5 == 0) {
            do {
                list.add(Long.valueOf(this.f56707a.q()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        if (i5 == 2) {
            int iB2 = this.f56707a.b() + this.f56707a.u();
            do {
                list.add(Long.valueOf(this.f56707a.q()));
            } while (this.f56707a.b() < iB2);
            a(iB2);
            return;
        }
        int i7 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void h(List list) throws m1 {
        int iT;
        if ((this.f56708b & 7) == 2) {
            do {
                b(2);
                list.add(this.f56707a.e());
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        int i2 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void i(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i2 = this.f56708b & 7;
            if (i2 == 0) {
                do {
                    a1Var.c(this.f56707a.u());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            if (i2 == 2) {
                int iB = this.f56707a.b() + this.f56707a.u();
                do {
                    a1Var.c(this.f56707a.u());
                } while (this.f56707a.b() < iB);
                a(iB);
                return;
            }
            int i3 = n1.f56624a;
            throw new m1();
        }
        int i5 = this.f56708b & 7;
        if (i5 == 0) {
            do {
                list.add(Integer.valueOf(this.f56707a.u()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        if (i5 == 2) {
            int iB2 = this.f56707a.b() + this.f56707a.u();
            do {
                list.add(Integer.valueOf(this.f56707a.u()));
            } while (this.f56707a.b() < iB2);
            a(iB2);
            return;
        }
        int i7 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void j(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int i2 = this.f56708b & 7;
            if (i2 == 1) {
                do {
                    d0Var.a(this.f56707a.f());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            if (i2 == 2) {
                int iU = this.f56707a.u();
                d(iU);
                int iB = this.f56707a.b() + iU;
                do {
                    d0Var.a(this.f56707a.f());
                } while (this.f56707a.b() < iB);
                return;
            }
            int i3 = n1.f56624a;
            throw new m1();
        }
        int i5 = this.f56708b & 7;
        if (i5 == 1) {
            do {
                list.add(Double.valueOf(this.f56707a.f()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        if (i5 == 2) {
            int iU2 = this.f56707a.u();
            d(iU2);
            int iB2 = this.f56707a.b() + iU2;
            do {
                list.add(Double.valueOf(this.f56707a.f()));
            } while (this.f56707a.b() < iB2);
            return;
        }
        int i7 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void k(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i2 = this.f56708b & 7;
            if (i2 == 0) {
                do {
                    u1Var.a(this.f56707a.l());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            if (i2 == 2) {
                int iB = this.f56707a.b() + this.f56707a.u();
                do {
                    u1Var.a(this.f56707a.l());
                } while (this.f56707a.b() < iB);
                a(iB);
                return;
            }
            int i3 = n1.f56624a;
            throw new m1();
        }
        int i5 = this.f56708b & 7;
        if (i5 == 0) {
            do {
                list.add(Long.valueOf(this.f56707a.l()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        if (i5 == 2) {
            int iB2 = this.f56707a.b() + this.f56707a.u();
            do {
                list.add(Long.valueOf(this.f56707a.l()));
            } while (this.f56707a.b() < iB2);
            a(iB2);
            return;
        }
        int i7 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void l(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof j) {
            j jVar = (j) list;
            int i2 = this.f56708b & 7;
            if (i2 == 0) {
                do {
                    jVar.a(this.f56707a.d());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            if (i2 == 2) {
                int iB = this.f56707a.b() + this.f56707a.u();
                do {
                    jVar.a(this.f56707a.d());
                } while (this.f56707a.b() < iB);
                a(iB);
                return;
            }
            int i3 = n1.f56624a;
            throw new m1();
        }
        int i5 = this.f56708b & 7;
        if (i5 == 0) {
            do {
                list.add(Boolean.valueOf(this.f56707a.d()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        if (i5 == 2) {
            int iB2 = this.f56707a.b() + this.f56707a.u();
            do {
                list.add(Boolean.valueOf(this.f56707a.d()));
            } while (this.f56707a.b() < iB2);
            a(iB2);
            return;
        }
        int i7 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void m(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i2 = this.f56708b & 7;
            if (i2 == 1) {
                do {
                    u1Var.a(this.f56707a.o());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            if (i2 == 2) {
                int iU = this.f56707a.u();
                d(iU);
                int iB = this.f56707a.b() + iU;
                do {
                    u1Var.a(this.f56707a.o());
                } while (this.f56707a.b() < iB);
                return;
            }
            int i3 = n1.f56624a;
            throw new m1();
        }
        int i5 = this.f56708b & 7;
        if (i5 == 1) {
            do {
                list.add(Long.valueOf(this.f56707a.o()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        if (i5 == 2) {
            int iU2 = this.f56707a.u();
            d(iU2);
            int iB2 = this.f56707a.b() + iU2;
            do {
                list.add(Long.valueOf(this.f56707a.o()));
            } while (this.f56707a.b() < iB2);
            return;
        }
        int i7 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void n(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i2 = this.f56708b & 7;
            if (i2 == 1) {
                do {
                    u1Var.a(this.f56707a.i());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            if (i2 == 2) {
                int iU = this.f56707a.u();
                d(iU);
                int iB = this.f56707a.b() + iU;
                do {
                    u1Var.a(this.f56707a.i());
                } while (this.f56707a.b() < iB);
                return;
            }
            int i3 = n1.f56624a;
            throw new m1();
        }
        int i5 = this.f56708b & 7;
        if (i5 == 1) {
            do {
                list.add(Long.valueOf(this.f56707a.i()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        if (i5 == 2) {
            int iU2 = this.f56707a.u();
            d(iU2);
            int iB2 = this.f56707a.b() + iU2;
            do {
                list.add(Long.valueOf(this.f56707a.i()));
            } while (this.f56707a.b() < iB2);
            return;
        }
        int i7 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void o(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i2 = this.f56708b & 7;
            if (i2 == 0) {
                do {
                    a1Var.c(this.f56707a.k());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            if (i2 == 2) {
                int iB = this.f56707a.b() + this.f56707a.u();
                do {
                    a1Var.c(this.f56707a.k());
                } while (this.f56707a.b() < iB);
                a(iB);
                return;
            }
            int i3 = n1.f56624a;
            throw new m1();
        }
        int i5 = this.f56708b & 7;
        if (i5 == 0) {
            do {
                list.add(Integer.valueOf(this.f56707a.k()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        if (i5 == 2) {
            int iB2 = this.f56707a.b() + this.f56707a.u();
            do {
                list.add(Integer.valueOf(this.f56707a.k()));
            } while (this.f56707a.b() < iB2);
            a(iB2);
            return;
        }
        int i7 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void p(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i2 = this.f56708b & 7;
            if (i2 == 0) {
                do {
                    a1Var.c(this.f56707a.g());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            if (i2 == 2) {
                int iB = this.f56707a.b() + this.f56707a.u();
                do {
                    a1Var.c(this.f56707a.g());
                } while (this.f56707a.b() < iB);
                a(iB);
                return;
            }
            int i3 = n1.f56624a;
            throw new m1();
        }
        int i5 = this.f56708b & 7;
        if (i5 == 0) {
            do {
                list.add(Integer.valueOf(this.f56707a.g()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        if (i5 == 2) {
            int iB2 = this.f56707a.b() + this.f56707a.u();
            do {
                list.add(Integer.valueOf(this.f56707a.g()));
            } while (this.f56707a.b() < iB2);
            a(iB2);
            return;
        }
        int i7 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void q(List list) throws m1 {
        a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(t2 t2Var, h0 h0Var) throws m1 {
        b(3);
        return c(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(Class cls, h0 h0Var) throws m1 {
        b(2);
        return d(p2.f56635c.a(cls), h0Var);
    }

    public final Object d(t2 t2Var, h0 h0Var) throws n1 {
        int iU = this.f56707a.u();
        w wVar = this.f56707a;
        if (wVar.f56693a < wVar.f56694b) {
            int iD = wVar.d(iU);
            Object objA = t2Var.a();
            this.f56707a.f56693a++;
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            this.f56707a.a(0);
            r5.f56693a--;
            this.f56707a.c(iD);
            return objA;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final s a() throws m1 {
        b(2);
        return this.f56707a.e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i2 = this.f56708b & 7;
            if (i2 == 0) {
                do {
                    u1Var.a(this.f56707a.v());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            if (i2 == 2) {
                int iB = this.f56707a.b() + this.f56707a.u();
                do {
                    u1Var.a(this.f56707a.v());
                } while (this.f56707a.b() < iB);
                a(iB);
                return;
            }
            int i3 = n1.f56624a;
            throw new m1();
        }
        int i5 = this.f56708b & 7;
        if (i5 == 0) {
            do {
                list.add(Long.valueOf(this.f56707a.v()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        if (i5 == 2) {
            int iB2 = this.f56707a.b() + this.f56707a.u();
            do {
                list.add(Long.valueOf(this.f56707a.v()));
            } while (this.f56707a.b() < iB2);
            a(iB2);
            return;
        }
        int i7 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(t2 t2Var, h0 h0Var) throws m1 {
        b(2);
        return d(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int b() throws m1 {
        b(0);
        return this.f56707a.g();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list) throws m1 {
        a(list, true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list, t2 t2Var, h0 h0Var) throws m1 {
        int iT;
        int i2 = this.f56708b;
        if ((i2 & 7) == 2) {
            do {
                list.add(d(t2Var, h0Var));
                if (this.f56707a.c() || this.f56710d != 0) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == i2);
            this.f56710d = iT;
            return;
        }
        int i3 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int c() throws m1 {
        b(0);
        return this.f56707a.u();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void c(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i2 = this.f56708b & 7;
            if (i2 == 0) {
                do {
                    a1Var.c(this.f56707a.p());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            if (i2 == 2) {
                int iB = this.f56707a.b() + this.f56707a.u();
                do {
                    a1Var.c(this.f56707a.p());
                } while (this.f56707a.b() < iB);
                a(iB);
                return;
            }
            int i3 = n1.f56624a;
            throw new m1();
        }
        int i5 = this.f56708b & 7;
        if (i5 == 0) {
            do {
                list.add(Integer.valueOf(this.f56707a.p()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        if (i5 == 2) {
            int iB2 = this.f56707a.b() + this.f56707a.u();
            do {
                list.add(Integer.valueOf(this.f56707a.p()));
            } while (this.f56707a.b() < iB2);
            a(iB2);
            return;
        }
        int i7 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void d(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof q0) {
            q0 q0Var = (q0) list;
            int i2 = this.f56708b & 7;
            if (i2 == 2) {
                int iU = this.f56707a.u();
                c(iU);
                int iB = this.f56707a.b() + iU;
                do {
                    q0Var.a(this.f56707a.j());
                } while (this.f56707a.b() < iB);
                return;
            }
            if (i2 == 5) {
                do {
                    q0Var.a(this.f56707a.j());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            int i3 = n1.f56624a;
            throw new m1();
        }
        int i5 = this.f56708b & 7;
        if (i5 == 2) {
            int iU2 = this.f56707a.u();
            c(iU2);
            int iB2 = this.f56707a.b() + iU2;
            do {
                list.add(Float.valueOf(this.f56707a.j()));
            } while (this.f56707a.b() < iB2);
            return;
        }
        if (i5 == 5) {
            do {
                list.add(Float.valueOf(this.f56707a.j()));
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        int i7 = n1.f56624a;
        throw new m1();
    }

    public final void a(List list, boolean z2) throws m1 {
        String strR;
        int iT;
        int iT2;
        if ((this.f56708b & 7) == 2) {
            if ((list instanceof q1) && !z2) {
                q1 q1Var = (q1) list;
                do {
                    b(2);
                    q1Var.a(this.f56707a.e());
                    if (this.f56707a.c()) {
                        return;
                    } else {
                        iT2 = this.f56707a.t();
                    }
                } while (iT2 == this.f56708b);
                this.f56710d = iT2;
                return;
            }
            do {
                if (z2) {
                    b(2);
                    strR = this.f56707a.s();
                } else {
                    b(2);
                    strR = this.f56707a.r();
                }
                list.add(strR);
                if (this.f56707a.c()) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == this.f56708b);
            this.f56710d = iT;
            return;
        }
        int i2 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list, t2 t2Var, h0 h0Var) throws m1 {
        int iT;
        int i2 = this.f56708b;
        if ((i2 & 7) == 3) {
            do {
                list.add(c(t2Var, h0Var));
                if (this.f56707a.c() || this.f56710d != 0) {
                    return;
                } else {
                    iT = this.f56707a.t();
                }
            } while (iT == i2);
            this.f56710d = iT;
            return;
        }
        int i3 = n1.f56624a;
        throw new m1();
    }

    public final void a(int i2) throws n1 {
        if (this.f56707a.b() != i2) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
