package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class VerticalChainReference extends ChainReference {

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.VerticalChainReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f35480n;

        static {
            int[] iArr = new int[State.Chain.values().length];
            f35480n = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35480n[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35480n[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalChainReference(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        Iterator it = this.xg.iterator();
        while (it.hasNext()) {
            this.f35396m.nr(it.next()).S();
        }
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        for (Object obj : this.xg) {
            ConstraintReference constraintReferenceNr = this.f35396m.nr(obj);
            if (constraintReference2 == null) {
                Object obj2 = this.P5;
                if (obj2 != null) {
                    constraintReferenceNr.m(obj2).nHg(this.HI).wTp(this.XQ);
                } else {
                    Object obj3 = this.M7;
                    if (obj3 != null) {
                        constraintReferenceNr.ijL(obj3).nHg(this.HI).wTp(this.XQ);
                    } else {
                        String string = constraintReferenceNr.getKey().toString();
                        constraintReferenceNr.m(State.gh).s7N(Float.valueOf(mYa(string))).v(Float.valueOf(qm(string)));
                    }
                }
                constraintReference2 = constraintReferenceNr;
            }
            if (constraintReference != null) {
                String string2 = constraintReference.getKey().toString();
                String string3 = constraintReferenceNr.getKey().toString();
                constraintReference.Ik(constraintReferenceNr.getKey()).s7N(Float.valueOf(Rl(string2))).v(Float.valueOf(Jk(string2)));
                constraintReferenceNr.ijL(constraintReference.getKey()).s7N(Float.valueOf(mYa(string3))).v(Float.valueOf(qm(string3)));
            }
            float fOrg = Org(obj.toString());
            if (fOrg != -1.0f) {
                constraintReferenceNr.I(fOrg);
            }
            constraintReference = constraintReferenceNr;
        }
        if (constraintReference != null) {
            Object obj4 = this.eF;
            if (obj4 != null) {
                constraintReference.Ik(obj4).nHg(this.ck).wTp(this.f35358S);
            } else {
                Object obj5 = this.f35350E;
                if (obj5 != null) {
                    constraintReference.ck(obj5).nHg(this.ck).wTp(this.f35358S);
                } else {
                    String string4 = constraintReference.getKey().toString();
                    constraintReference.ck(State.gh).s7N(Float.valueOf(Rl(string4))).v(Float.valueOf(Jk(string4)));
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f3 = this.ofS;
        if (f3 != 0.5f) {
            constraintReference2.ofS(f3);
        }
        int i2 = AnonymousClass1.f35480n[this.ul.ordinal()];
        if (i2 == 1) {
            constraintReference2.a(0);
        } else if (i2 == 2) {
            constraintReference2.a(1);
        } else {
            if (i2 != 3) {
                return;
            }
            constraintReference2.a(2);
        }
    }
}
