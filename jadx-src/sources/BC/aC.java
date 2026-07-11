package BC;

import com.google.firebase.Timestamp;
import pUk.SPz;
import uB.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class aC implements eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private s4 f399n;

    @Override // BC.eO
    public s4 n(s4 s4Var, s4 s4Var2) {
        return s4Var2;
    }

    private long J2() {
        if (SPz.S(this.f399n)) {
            return (long) this.f399n.aYN();
        }
        if (SPz.WPU(this.f399n)) {
            return this.f399n.nY();
        }
        throw wqP.n.n("Expected 'operand' to be of Number type, but was " + this.f399n.getClass().getCanonicalName(), new Object[0]);
    }

    private double O() {
        if (SPz.S(this.f399n)) {
            return this.f399n.aYN();
        }
        if (SPz.WPU(this.f399n)) {
            return this.f399n.nY();
        }
        throw wqP.n.n("Expected 'operand' to be of Number type, but was " + this.f399n.getClass().getCanonicalName(), new Object[0]);
    }

    private long Uo(long j2, long j3) {
        long j4 = j2 + j3;
        return ((j2 ^ j4) & (j3 ^ j4)) >= 0 ? j4 : j4 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    public s4 nr() {
        return this.f399n;
    }

    public aC(s4 s4Var) {
        wqP.n.t(SPz.te(s4Var), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.f399n = s4Var;
    }

    @Override // BC.eO
    public s4 rl(s4 s4Var, Timestamp timestamp) {
        s4 s4VarT = t(s4Var);
        if (SPz.WPU(s4VarT) && SPz.WPU(this.f399n)) {
            return (s4) s4.X().HI(Uo(s4VarT.nY(), J2())).build();
        }
        if (SPz.WPU(s4VarT)) {
            return (s4) s4.X().az(s4VarT.nY() + O()).build();
        }
        wqP.n.t(SPz.S(s4VarT), "Expected NumberValue to be of type DoubleValue, but was ", s4Var.getClass().getCanonicalName());
        return (s4) s4.X().az(s4VarT.aYN() + O()).build();
    }

    public s4 t(s4 s4Var) {
        if (SPz.te(s4Var)) {
            return s4Var;
        }
        return (s4) s4.X().HI(0L).build();
    }
}
