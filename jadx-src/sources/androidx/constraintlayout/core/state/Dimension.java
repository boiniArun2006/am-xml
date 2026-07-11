package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Dimension {
    String J2;
    boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f35389O;
    Object Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f35390n;
    float nr;
    int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f35391t;
    public static final Object xMQ = new String("FIXED_DIMENSION");
    public static final Object mUb = new String("WRAP_DIMENSION");
    public static final Object gh = new String("SPREAD_DIMENSION");
    public static final Object qie = new String("PARENT_DIMENSION");
    public static final Object az = new String("PERCENT_DIMENSION");
    public static final Object ty = new String("RATIO_DIMENSION");

    public enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    private Dimension() {
        this.f35390n = -2;
        this.rl = 0;
        this.f35391t = Integer.MAX_VALUE;
        this.nr = 1.0f;
        this.f35389O = 0;
        this.J2 = null;
        this.Uo = mUb;
        this.KN = false;
    }

    public Dimension mUb(int i2) {
        this.Uo = null;
        this.f35389O = i2;
        return this;
    }

    public Dimension o(int i2) {
        this.KN = true;
        if (i2 >= 0) {
            this.f35391t = i2;
        }
        return this;
    }

    public static Dimension J2(String str) {
        Dimension dimension = new Dimension(ty);
        dimension.r(str);
        return dimension;
    }

    public static Dimension KN() {
        return new Dimension(mUb);
    }

    public static Dimension O(Object obj, float f3) {
        Dimension dimension = new Dimension(az);
        dimension.Ik(obj, f3);
        return dimension;
    }

    public static Dimension Uo(Object obj) {
        Dimension dimension = new Dimension();
        dimension.Z(obj);
        return dimension;
    }

    public static Dimension nr() {
        return new Dimension(qie);
    }

    public static Dimension rl(int i2) {
        Dimension dimension = new Dimension(xMQ);
        dimension.mUb(i2);
        return dimension;
    }

    public static Dimension t(Object obj) {
        Dimension dimension = new Dimension(xMQ);
        dimension.gh(obj);
        return dimension;
    }

    public Dimension HI(int i2) {
        if (i2 >= 0) {
            this.rl = i2;
        }
        return this;
    }

    public Dimension Ik(Object obj, float f3) {
        this.nr = f3;
        return this;
    }

    public Dimension Z(Object obj) {
        this.Uo = obj;
        this.KN = true;
        return this;
    }

    public Dimension az(int i2) {
        if (this.f35391t >= 0) {
            this.f35391t = i2;
        }
        return this;
    }

    public Dimension ck(Object obj) {
        if (obj == mUb) {
            this.rl = -2;
        }
        return this;
    }

    public Dimension gh(Object obj) {
        this.Uo = obj;
        if (obj instanceof Integer) {
            this.f35389O = ((Integer) obj).intValue();
            this.Uo = null;
        }
        return this;
    }

    public void n(State state, ConstraintWidget constraintWidget, int i2) {
        String str = this.J2;
        if (str != null) {
            constraintWidget.K(str);
        }
        int i3 = 2;
        if (i2 == 0) {
            if (this.KN) {
                constraintWidget.VwL(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.Uo;
                if (obj == mUb) {
                    i3 = 1;
                } else if (obj != az) {
                    i3 = 0;
                }
                constraintWidget.mI(i3, this.rl, this.f35391t, this.nr);
                return;
            }
            int i5 = this.rl;
            if (i5 > 0) {
                constraintWidget.X4T(i5);
            }
            int i7 = this.f35391t;
            if (i7 < Integer.MAX_VALUE) {
                constraintWidget.Qu(i7);
            }
            Object obj2 = this.Uo;
            if (obj2 == mUb) {
                constraintWidget.VwL(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (obj2 == qie) {
                constraintWidget.VwL(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    constraintWidget.VwL(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.vl(this.f35389O);
                    return;
                }
                return;
            }
        }
        if (this.KN) {
            constraintWidget.Vvq(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.Uo;
            if (obj3 == mUb) {
                i3 = 1;
            } else if (obj3 != az) {
                i3 = 0;
            }
            constraintWidget.y(i3, this.rl, this.f35391t, this.nr);
            return;
        }
        int i8 = this.rl;
        if (i8 > 0) {
            constraintWidget.UF(i8);
        }
        int i9 = this.f35391t;
        if (i9 < Integer.MAX_VALUE) {
            constraintWidget.ub(i9);
        }
        Object obj4 = this.Uo;
        if (obj4 == mUb) {
            constraintWidget.Vvq(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (obj4 == qie) {
            constraintWidget.Vvq(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (obj4 == null) {
            constraintWidget.Vvq(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.a63(this.f35389O);
        }
    }

    int qie() {
        return this.f35389O;
    }

    public Dimension r(String str) {
        this.J2 = str;
        return this;
    }

    public Dimension ty(Object obj) {
        Object obj2 = mUb;
        if (obj == obj2 && this.KN) {
            this.Uo = obj2;
            this.f35391t = Integer.MAX_VALUE;
        }
        return this;
    }

    public boolean xMQ(int i2) {
        return this.Uo == null && this.f35389O == i2;
    }

    private Dimension(Object obj) {
        this.f35390n = -2;
        this.rl = 0;
        this.f35391t = Integer.MAX_VALUE;
        this.nr = 1.0f;
        this.f35389O = 0;
        this.J2 = null;
        this.KN = false;
        this.Uo = obj;
    }
}
