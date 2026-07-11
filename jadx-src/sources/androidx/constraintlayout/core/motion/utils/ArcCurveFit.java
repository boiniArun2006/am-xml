package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ArcCurveFit extends CurveFit {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final double[] f35256n;
    Arc[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35257t = true;

    private static class Arc {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static double[] f35258o = new double[91];
        double HI;
        boolean Ik;
        double J2;
        double KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        double f35259O;
        double Uo;
        double az;
        double ck;
        double gh;
        double mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        double[] f35260n;
        double nr;
        double qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f35261r;
        double rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        double f35262t;
        double ty;
        double xMQ;

        Arc(int i2, double d2, double d4, double d5, double d6, double d7, double d8) {
            this.f35261r = false;
            double d9 = d7 - d5;
            double d10 = d8 - d6;
            if (i2 == 1) {
                this.Ik = true;
            } else if (i2 == 4) {
                this.Ik = d10 > 0.0d;
            } else if (i2 != 5) {
                this.Ik = false;
            } else {
                this.Ik = d10 < 0.0d;
            }
            this.f35262t = d2;
            this.nr = d4;
            this.xMQ = 1.0d / (d4 - d2);
            if (3 == i2) {
                this.f35261r = true;
            }
            if (!this.f35261r && Math.abs(d9) >= 0.001d && Math.abs(d10) >= 0.001d) {
                this.f35260n = new double[101];
                boolean z2 = this.Ik;
                this.mUb = d9 * ((double) (z2 ? -1 : 1));
                this.gh = d10 * ((double) (z2 ? 1 : -1));
                this.qie = z2 ? d7 : d5;
                this.az = z2 ? d6 : d8;
                n(d5, d6, d7, d8);
                this.ty = this.rl * this.xMQ;
                return;
            }
            this.f35261r = true;
            this.f35259O = d5;
            this.J2 = d7;
            this.Uo = d6;
            this.KN = d8;
            double dHypot = Math.hypot(d10, d9);
            this.rl = dHypot;
            this.ty = dHypot * this.xMQ;
            double d11 = this.nr;
            double d12 = this.f35262t;
            this.qie = d9 / (d11 - d12);
            this.az = d10 / (d11 - d12);
        }

        private void n(double d2, double d4, double d5, double d6) {
            double d7 = d5 - d2;
            double d8 = d4 - d6;
            int i2 = 0;
            double dHypot = 0.0d;
            double d9 = 0.0d;
            double d10 = 0.0d;
            while (true) {
                if (i2 >= f35258o.length) {
                    break;
                }
                int i3 = i2;
                double radians = Math.toRadians((((double) i2) * 90.0d) / ((double) (r15.length - 1)));
                double dSin = Math.sin(radians) * d7;
                double dCos = Math.cos(radians) * d8;
                if (i3 > 0) {
                    dHypot += Math.hypot(dSin - d9, dCos - d10);
                    f35258o[i3] = dHypot;
                }
                i2 = i3 + 1;
                d9 = dSin;
                d10 = dCos;
            }
            this.rl = dHypot;
            int i5 = 0;
            while (true) {
                double[] dArr = f35258o;
                if (i5 >= dArr.length) {
                    break;
                }
                dArr[i5] = dArr[i5] / dHypot;
                i5++;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= this.f35260n.length) {
                    return;
                }
                double length = ((double) i7) / ((double) (r1.length - 1));
                int iBinarySearch = Arrays.binarySearch(f35258o, length);
                if (iBinarySearch >= 0) {
                    this.f35260n[i7] = ((double) iBinarySearch) / ((double) (f35258o.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f35260n[i7] = 0.0d;
                } else {
                    int i8 = -iBinarySearch;
                    int i9 = i8 - 2;
                    double[] dArr2 = f35258o;
                    double d11 = dArr2[i9];
                    this.f35260n[i7] = (((double) i9) + ((length - d11) / (dArr2[i8 - 1] - d11))) / ((double) (dArr2.length - 1));
                }
                i7++;
            }
        }

        public double J2(double d2) {
            double d4 = (d2 - this.f35262t) * this.xMQ;
            double d5 = this.f35259O;
            return d5 + (d4 * (this.J2 - d5));
        }

        double KN() {
            return this.qie + (this.mUb * this.HI);
        }

        public double O(double d2) {
            return this.az;
        }

        public double Uo(double d2) {
            double d4 = (d2 - this.f35262t) * this.xMQ;
            double d5 = this.Uo;
            return d5 + (d4 * (this.KN - d5));
        }

        void gh(double d2) {
            double dMUb = mUb((this.Ik ? this.nr - d2 : d2 - this.f35262t) * this.xMQ) * 1.5707963267948966d;
            this.HI = Math.sin(dMUb);
            this.ck = Math.cos(dMUb);
        }

        double mUb(double d2) {
            if (d2 <= 0.0d) {
                return 0.0d;
            }
            if (d2 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f35260n;
            double length = d2 * ((double) (dArr.length - 1));
            int i2 = (int) length;
            double d4 = length - ((double) i2);
            double d5 = dArr[i2];
            return d5 + (d4 * (dArr[i2 + 1] - d5));
        }

        public double nr(double d2) {
            return this.qie;
        }

        double rl() {
            double d2 = this.mUb * this.ck;
            double dHypot = this.ty / Math.hypot(d2, (-this.gh) * this.HI);
            return this.Ik ? (-d2) * dHypot : d2 * dHypot;
        }

        double t() {
            double d2 = this.mUb * this.ck;
            double d4 = (-this.gh) * this.HI;
            double dHypot = this.ty / Math.hypot(d2, d4);
            return this.Ik ? (-d4) * dHypot : d4 * dHypot;
        }

        double xMQ() {
            return this.az + (this.gh * this.ck);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f35256n = dArr;
        this.rl = new Arc[dArr.length - 1];
        int i2 = 1;
        int i3 = 1;
        int i5 = 0;
        while (true) {
            Arc[] arcArr = this.rl;
            if (i5 >= arcArr.length) {
                return;
            }
            int i7 = iArr[i5];
            int i8 = 3;
            if (i7 != 0) {
                if (i7 == 1) {
                    i2 = 1;
                    i8 = i2;
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            i8 = 4;
                            if (i7 != 4) {
                                i8 = 5;
                                if (i7 != 5) {
                                    i8 = i3;
                                }
                            }
                        } else {
                            if (i2 == 1) {
                            }
                            i8 = i2;
                        }
                    }
                    i2 = 2;
                    i8 = i2;
                }
            }
            double d2 = dArr[i5];
            int i9 = i5 + 1;
            double d4 = dArr[i9];
            double[] dArr3 = dArr2[i5];
            double d5 = dArr3[0];
            double d6 = dArr3[1];
            double[] dArr4 = dArr2[i9];
            arcArr[i5] = new Arc(i8, d2, d4, d5, d6, dArr4[0], dArr4[1]);
            i5 = i9;
            i3 = i8;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double J2(double d2, int i2) {
        Arc[] arcArr = this.rl;
        int i3 = 0;
        double d4 = arcArr[0].f35262t;
        if (d2 < d4) {
            d2 = d4;
        }
        if (d2 > arcArr[arcArr.length - 1].nr) {
            d2 = arcArr[arcArr.length - 1].nr;
        }
        while (true) {
            Arc[] arcArr2 = this.rl;
            if (i3 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i3];
            if (d2 <= arc.nr) {
                if (arc.f35261r) {
                    return i2 == 0 ? arc.nr(d2) : arc.O(d2);
                }
                arc.gh(d2);
                return i2 == 0 ? this.rl[i3].rl() : this.rl[i3].t();
            }
            i3++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] KN() {
        return this.f35256n;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void O(double d2, float[] fArr) {
        if (this.f35257t) {
            Arc[] arcArr = this.rl;
            Arc arc = arcArr[0];
            double d4 = arc.f35262t;
            if (d2 < d4) {
                double d5 = d2 - d4;
                if (arc.f35261r) {
                    fArr[0] = (float) (arc.J2(d4) + (this.rl[0].nr(d4) * d5));
                    fArr[1] = (float) (this.rl[0].Uo(d4) + (d5 * this.rl[0].O(d4)));
                    return;
                } else {
                    arc.gh(d4);
                    fArr[0] = (float) (this.rl[0].KN() + (this.rl[0].rl() * d5));
                    fArr[1] = (float) (this.rl[0].xMQ() + (d5 * this.rl[0].t()));
                    return;
                }
            }
            if (d2 > arcArr[arcArr.length - 1].nr) {
                double d6 = arcArr[arcArr.length - 1].nr;
                double d7 = d2 - d6;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.f35261r) {
                    fArr[0] = (float) (arc2.J2(d6) + (this.rl[length].nr(d6) * d7));
                    fArr[1] = (float) (this.rl[length].Uo(d6) + (d7 * this.rl[length].O(d6)));
                    return;
                } else {
                    arc2.gh(d2);
                    fArr[0] = (float) this.rl[length].KN();
                    fArr[1] = (float) this.rl[length].xMQ();
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.rl;
            double d8 = arcArr2[0].f35262t;
            if (d2 < d8) {
                d2 = d8;
            } else if (d2 > arcArr2[arcArr2.length - 1].nr) {
                d2 = arcArr2[arcArr2.length - 1].nr;
            }
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr3 = this.rl;
            if (i2 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i2];
            if (d2 <= arc3.nr) {
                if (arc3.f35261r) {
                    fArr[0] = (float) arc3.J2(d2);
                    fArr[1] = (float) this.rl[i2].Uo(d2);
                    return;
                } else {
                    arc3.gh(d2);
                    fArr[0] = (float) this.rl[i2].KN();
                    fArr[1] = (float) this.rl[i2].xMQ();
                    return;
                }
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void Uo(double d2, double[] dArr) {
        Arc[] arcArr = this.rl;
        double d4 = arcArr[0].f35262t;
        if (d2 < d4) {
            d2 = d4;
        } else if (d2 > arcArr[arcArr.length - 1].nr) {
            d2 = arcArr[arcArr.length - 1].nr;
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr2 = this.rl;
            if (i2 >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i2];
            if (d2 <= arc.nr) {
                if (arc.f35261r) {
                    dArr[0] = arc.nr(d2);
                    dArr[1] = this.rl[i2].O(d2);
                    return;
                } else {
                    arc.gh(d2);
                    dArr[0] = this.rl[i2].rl();
                    dArr[1] = this.rl[i2].t();
                    return;
                }
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void nr(double d2, double[] dArr) {
        if (this.f35257t) {
            Arc[] arcArr = this.rl;
            Arc arc = arcArr[0];
            double d4 = arc.f35262t;
            if (d2 < d4) {
                double d5 = d2 - d4;
                if (arc.f35261r) {
                    dArr[0] = arc.J2(d4) + (this.rl[0].nr(d4) * d5);
                    dArr[1] = this.rl[0].Uo(d4) + (d5 * this.rl[0].O(d4));
                    return;
                } else {
                    arc.gh(d4);
                    dArr[0] = this.rl[0].KN() + (this.rl[0].rl() * d5);
                    dArr[1] = this.rl[0].xMQ() + (d5 * this.rl[0].t());
                    return;
                }
            }
            if (d2 > arcArr[arcArr.length - 1].nr) {
                double d6 = arcArr[arcArr.length - 1].nr;
                double d7 = d2 - d6;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.f35261r) {
                    dArr[0] = arc2.J2(d6) + (this.rl[length].nr(d6) * d7);
                    dArr[1] = this.rl[length].Uo(d6) + (d7 * this.rl[length].O(d6));
                    return;
                } else {
                    arc2.gh(d2);
                    dArr[0] = this.rl[length].KN() + (this.rl[length].rl() * d7);
                    dArr[1] = this.rl[length].xMQ() + (d7 * this.rl[length].t());
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.rl;
            double d8 = arcArr2[0].f35262t;
            if (d2 < d8) {
                d2 = d8;
            }
            if (d2 > arcArr2[arcArr2.length - 1].nr) {
                d2 = arcArr2[arcArr2.length - 1].nr;
            }
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr3 = this.rl;
            if (i2 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i2];
            if (d2 <= arc3.nr) {
                if (arc3.f35261r) {
                    dArr[0] = arc3.J2(d2);
                    dArr[1] = this.rl[i2].Uo(d2);
                    return;
                } else {
                    arc3.gh(d2);
                    dArr[0] = this.rl[i2].KN();
                    dArr[1] = this.rl[i2].xMQ();
                    return;
                }
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double t(double d2, int i2) {
        double dUo;
        double dO;
        double dXMQ;
        double dT;
        double dUo2;
        double dO2;
        int i3 = 0;
        if (this.f35257t) {
            Arc[] arcArr = this.rl;
            Arc arc = arcArr[0];
            double d4 = arc.f35262t;
            if (d2 < d4) {
                double d5 = d2 - d4;
                if (arc.f35261r) {
                    if (i2 == 0) {
                        dUo2 = arc.J2(d4);
                        dO2 = this.rl[0].nr(d4);
                    } else {
                        dUo2 = arc.Uo(d4);
                        dO2 = this.rl[0].O(d4);
                    }
                    return dUo2 + (d5 * dO2);
                }
                arc.gh(d4);
                if (i2 == 0) {
                    dXMQ = this.rl[0].KN();
                    dT = this.rl[0].rl();
                } else {
                    dXMQ = this.rl[0].xMQ();
                    dT = this.rl[0].t();
                }
                return dXMQ + (d5 * dT);
            }
            if (d2 > arcArr[arcArr.length - 1].nr) {
                double d6 = arcArr[arcArr.length - 1].nr;
                double d7 = d2 - d6;
                int length = arcArr.length - 1;
                if (i2 == 0) {
                    dUo = arcArr[length].J2(d6);
                    dO = this.rl[length].nr(d6);
                } else {
                    dUo = arcArr[length].Uo(d6);
                    dO = this.rl[length].O(d6);
                }
                return dUo + (d7 * dO);
            }
        } else {
            Arc[] arcArr2 = this.rl;
            double d8 = arcArr2[0].f35262t;
            if (d2 < d8) {
                d2 = d8;
            } else if (d2 > arcArr2[arcArr2.length - 1].nr) {
                d2 = arcArr2[arcArr2.length - 1].nr;
            }
        }
        while (true) {
            Arc[] arcArr3 = this.rl;
            if (i3 >= arcArr3.length) {
                return Double.NaN;
            }
            Arc arc2 = arcArr3[i3];
            if (d2 <= arc2.nr) {
                if (arc2.f35261r) {
                    return i2 == 0 ? arc2.J2(d2) : arc2.Uo(d2);
                }
                arc2.gh(d2);
                return i2 == 0 ? this.rl[i3].KN() : this.rl[i3].xMQ();
            }
            i3++;
        }
    }
}
