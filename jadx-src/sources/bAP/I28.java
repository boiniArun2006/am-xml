package bAP;

import Hh.C;
import Hh.Xo;
import bA.C1653C;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class I28 {
    private final A72.j KN;
    private boolean Uo;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f43208t = 0;
    private int rl = 0;
    private int nr = 0;
    private int J2 = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f43206O = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f43207n = 0;

    private static boolean rl(int i2) {
        if (i2 == 1) {
            return false;
        }
        return ((i2 >= 208 && i2 <= 215) || i2 == 217 || i2 == 216) ? false : true;
    }

    private void J2(int i2) {
        int i3 = this.nr;
        if (i3 > 0) {
            this.J2 = i2;
        }
        this.nr = i3 + 1;
        this.f43206O = i3;
    }

    private boolean n(InputStream inputStream) throws Throwable {
        int i2;
        int i3 = this.f43206O;
        while (this.f43207n != 6 && (i2 = inputStream.read()) != -1) {
            try {
                int i5 = this.f43208t;
                this.f43208t = i5 + 1;
                if (this.Uo) {
                    this.f43207n = 6;
                    this.Uo = false;
                    return false;
                }
                int i7 = this.f43207n;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 4) {
                                    this.f43207n = 5;
                                } else if (i7 != 5) {
                                    C.xMQ(false);
                                } else {
                                    int i8 = ((this.rl << 8) + i2) - 2;
                                    vn.w6.n(inputStream, i8);
                                    this.f43208t += i8;
                                    this.f43207n = 2;
                                }
                            } else if (i2 == 255) {
                                this.f43207n = 3;
                            } else if (i2 == 0) {
                                this.f43207n = 2;
                            } else if (i2 == 217) {
                                this.Uo = true;
                                J2(i5 - 1);
                                this.f43207n = 2;
                            } else {
                                if (i2 == 218) {
                                    J2(i5 - 1);
                                }
                                if (rl(i2)) {
                                    this.f43207n = 4;
                                } else {
                                    this.f43207n = 2;
                                }
                            }
                        } else if (i2 == 255) {
                            this.f43207n = 3;
                        }
                    } else if (i2 == 216) {
                        this.f43207n = 2;
                    } else {
                        this.f43207n = 6;
                    }
                } else if (i2 == 255) {
                    this.f43207n = 1;
                } else {
                    this.f43207n = 6;
                }
                this.rl = i2;
            } catch (IOException e2) {
                Xo.n(e2);
            }
            return (this.f43207n == 6 || this.f43206O == i3) ? false : true;
        }
        if (this.f43207n == 6) {
            return false;
        }
    }

    public boolean O() {
        return this.Uo;
    }

    public boolean Uo(C1653C c1653c) {
        if (this.f43207n == 6 || c1653c.getSize() <= this.f43208t) {
            return false;
        }
        A72.CN3 cn3 = new A72.CN3(c1653c.M(), (byte[]) this.KN.get(16384), this.KN);
        try {
            vn.w6.n(cn3, this.f43208t);
            return n(cn3);
        } catch (IOException e2) {
            Xo.n(e2);
            return false;
        } finally {
            Hh.n.rl(cn3);
        }
    }

    public int nr() {
        return this.f43206O;
    }

    public int t() {
        return this.J2;
    }

    public I28(A72.j jVar) {
        this.KN = (A72.j) C.Uo(jVar);
    }
}
