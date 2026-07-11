package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class ChainHead {
    boolean HI;
    private boolean Ik;
    protected ConstraintWidget J2;
    protected ArrayList KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected ConstraintWidget f35483O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f35484S;
    protected ConstraintWidget Uo;
    protected boolean XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    protected boolean f35485Z;
    int az;
    private int ck;
    protected float gh = 0.0f;
    protected int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected ConstraintWidget f35486n;
    protected ConstraintWidget nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f35487o;
    int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f35488r;
    protected ConstraintWidget rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected ConstraintWidget f35489t;
    int ty;
    protected int xMQ;

    private void rl() {
        int i2 = this.ck * 2;
        ConstraintWidget constraintWidget = this.f35486n;
        this.HI = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z2 = false;
        while (!z2) {
            this.xMQ++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.kSg;
            int i3 = this.ck;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i3] = null;
            constraintWidget.lLA[i3] = null;
            if (constraintWidget.B() != 8) {
                this.qie++;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourWPU = constraintWidget.WPU(this.ck);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourWPU != dimensionBehaviour) {
                    this.az += constraintWidget.T(this.ck);
                }
                int iJ2 = this.az + constraintWidget.f35506FX[i2].J2();
                this.az = iJ2;
                int i5 = i2 + 1;
                this.az = iJ2 + constraintWidget.f35506FX[i5].J2();
                int iJ22 = this.ty + constraintWidget.f35506FX[i2].J2();
                this.ty = iJ22;
                this.ty = iJ22 + constraintWidget.f35506FX[i5].J2();
                if (this.rl == null) {
                    this.rl = constraintWidget;
                }
                this.nr = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f35503D;
                int i7 = this.ck;
                if (dimensionBehaviourArr[i7] == dimensionBehaviour) {
                    int i8 = constraintWidget.ViF[i7];
                    if (i8 == 0 || i8 == 3 || i8 == 2) {
                        this.mUb++;
                        float f3 = constraintWidget.ER[i7];
                        if (f3 > 0.0f) {
                            this.gh += f3;
                        }
                        if (t(constraintWidget, i7)) {
                            if (f3 < 0.0f) {
                                this.f35488r = true;
                            } else {
                                this.f35487o = true;
                            }
                            if (this.KN == null) {
                                this.KN = new ArrayList();
                            }
                            this.KN.add(constraintWidget);
                        }
                        if (this.J2 == null) {
                            this.J2 = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.Uo;
                        if (constraintWidget4 != null) {
                            constraintWidget4.lLA[this.ck] = constraintWidget;
                        }
                        this.Uo = constraintWidget;
                    }
                    if (this.ck == 0) {
                        if (constraintWidget.WPU != 0 || constraintWidget.nY != 0 || constraintWidget.f35524g != 0) {
                            this.HI = false;
                        }
                    } else if (constraintWidget.aYN != 0 || constraintWidget.iF != 0 || constraintWidget.fD != 0) {
                        this.HI = false;
                    }
                    if (constraintWidget.Nxk != 0.0f) {
                        this.HI = false;
                        this.XQ = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.kSg[this.ck] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.f35506FX[i2 + 1].J2;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.nr;
                ConstraintAnchor constraintAnchor2 = constraintWidget5.f35506FX[i2].J2;
                if (constraintAnchor2 != null && constraintAnchor2.nr == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z2 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.rl;
        if (constraintWidget6 != null) {
            this.az -= constraintWidget6.f35506FX[i2].J2();
        }
        ConstraintWidget constraintWidget7 = this.nr;
        if (constraintWidget7 != null) {
            this.az -= constraintWidget7.f35506FX[i2 + 1].J2();
        }
        this.f35489t = constraintWidget;
        if (this.ck == 0 && this.Ik) {
            this.f35483O = constraintWidget;
        } else {
            this.f35483O = this.f35486n;
        }
        this.f35485Z = this.f35487o && this.f35488r;
    }

    public void n() {
        if (!this.f35484S) {
            rl();
        }
        this.f35484S = true;
    }

    public ChainHead(ConstraintWidget constraintWidget, int i2, boolean z2) {
        this.f35486n = constraintWidget;
        this.ck = i2;
        this.Ik = z2;
    }

    private static boolean t(ConstraintWidget constraintWidget, int i2) {
        if (constraintWidget.B() != 8 && constraintWidget.f35503D[i2] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i3 = constraintWidget.ViF[i2];
            if (i3 == 0 || i3 == 3) {
                return true;
            }
            return false;
        }
        return false;
    }
}
