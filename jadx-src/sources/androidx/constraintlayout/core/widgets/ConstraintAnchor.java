package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ConstraintAnchor {
    public ConstraintAnchor J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Type f35490O;
    public final ConstraintWidget nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35492t;
    SolverVariable xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HashSet f35491n = null;
    public int Uo = 0;
    int KN = Integer.MIN_VALUE;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public boolean ck(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type typeGh = constraintAnchor.gh();
        Type type = this.f35490O;
        if (typeGh == type) {
            return type != Type.BASELINE || (constraintAnchor.KN().I() && KN().I());
        }
        switch (type) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z2 = typeGh == Type.LEFT || typeGh == Type.RIGHT;
                return constraintAnchor.KN() instanceof Guideline ? z2 || typeGh == Type.CENTER_X : z2;
            case TOP:
            case BOTTOM:
                boolean z3 = typeGh == Type.TOP || typeGh == Type.BOTTOM;
                return constraintAnchor.KN() instanceof Guideline ? z3 || typeGh == Type.CENTER_Y : z3;
            case BASELINE:
                return (typeGh == Type.LEFT || typeGh == Type.RIGHT) ? false : true;
            case CENTER:
                return (typeGh == Type.BASELINE || typeGh == Type.CENTER_X || typeGh == Type.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f35490O.name());
        }
    }

    public void r() {
        this.f35492t = false;
        this.rl = 0;
    }

    public boolean rl(ConstraintAnchor constraintAnchor, int i2, int i3, boolean z2) {
        if (constraintAnchor == null) {
            Ik();
            return true;
        }
        if (!z2 && !ck(constraintAnchor)) {
            return false;
        }
        this.J2 = constraintAnchor;
        if (constraintAnchor.f35491n == null) {
            constraintAnchor.f35491n = new HashSet();
        }
        HashSet hashSet = this.J2.f35491n;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.Uo = i2;
        this.KN = i3;
        return true;
    }

    public boolean HI() {
        return this.J2 != null;
    }

    public void Ik() {
        HashSet hashSet;
        ConstraintAnchor constraintAnchor = this.J2;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f35491n) != null) {
            hashSet.remove(this);
            if (this.J2.f35491n.size() == 0) {
                this.J2.f35491n = null;
            }
        }
        this.f35491n = null;
        this.J2 = null;
        this.Uo = 0;
        this.KN = Integer.MIN_VALUE;
        this.f35492t = false;
        this.rl = 0;
    }

    public int J2() {
        ConstraintAnchor constraintAnchor;
        if (this.nr.B() == 8) {
            return 0;
        }
        return (this.KN == Integer.MIN_VALUE || (constraintAnchor = this.J2) == null || constraintAnchor.nr.B() != 8) ? this.Uo : this.KN;
    }

    public ConstraintWidget KN() {
        return this.nr;
    }

    public int O() {
        if (this.f35492t) {
            return this.rl;
        }
        return 0;
    }

    public final ConstraintAnchor Uo() {
        switch (this.f35490O) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.nr.P5;
            case TOP:
                return this.nr.M7;
            case RIGHT:
                return this.nr.jB;
            case BOTTOM:
                return this.nr.f35517U;
            default:
                throw new AssertionError(this.f35490O.name());
        }
    }

    public void Z(int i2) {
        this.rl = i2;
        this.f35492t = true;
    }

    public boolean az() {
        HashSet hashSet = this.f35491n;
        return hashSet != null && hashSet.size() > 0;
    }

    public Type gh() {
        return this.f35490O;
    }

    public ConstraintAnchor mUb() {
        return this.J2;
    }

    public boolean n(ConstraintAnchor constraintAnchor, int i2) {
        return rl(constraintAnchor, i2, Integer.MIN_VALUE, false);
    }

    public HashSet nr() {
        return this.f35491n;
    }

    public void o(Cache cache) {
        SolverVariable solverVariable = this.xMQ;
        if (solverVariable == null) {
            this.xMQ = new SolverVariable(SolverVariable.Type.UNRESTRICTED, null);
        } else {
            solverVariable.J2();
        }
    }

    public boolean qie() {
        HashSet hashSet = this.f35491n;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ConstraintAnchor) it.next()).Uo().HI()) {
                return true;
            }
        }
        return false;
    }

    public void t(int i2, ArrayList arrayList, WidgetGroup widgetGroup) {
        HashSet hashSet = this.f35491n;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Grouping.n(((ConstraintAnchor) it.next()).nr, i2, arrayList, widgetGroup);
            }
        }
    }

    public String toString() {
        return this.nr.S() + ":" + this.f35490O.toString();
    }

    public boolean ty() {
        return this.f35492t;
    }

    public SolverVariable xMQ() {
        return this.xMQ;
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.nr = constraintWidget;
        this.f35490O = type;
    }

    public void XQ(int i2) {
        if (HI()) {
            this.KN = i2;
        }
    }
}
