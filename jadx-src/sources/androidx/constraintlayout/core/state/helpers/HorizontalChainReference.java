package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class HorizontalChainReference extends ChainReference {

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.HorizontalChainReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f35479n;

        static {
            int[] iArr = new int[State.Chain.values().length];
            f35479n = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35479n[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35479n[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HorizontalChainReference(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        Iterator it = this.xg.iterator();
        while (it.hasNext()) {
            this.f35396m.nr(it.next()).XQ();
        }
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        for (Object obj : this.xg) {
            ConstraintReference constraintReferenceNr = this.f35396m.nr(obj);
            if (constraintReference2 == null) {
                Object obj2 = this.bzg;
                if (obj2 != null) {
                    constraintReferenceNr.dR0(obj2).nHg(this.az).wTp(this.f35369o);
                } else {
                    Object obj3 = this.Xw;
                    if (obj3 != null) {
                        constraintReferenceNr.k(obj3).nHg(this.az).wTp(this.f35369o);
                    } else {
                        Object obj4 = this.s7N;
                        if (obj4 != null) {
                            constraintReferenceNr.dR0(obj4).nHg(this.gh).wTp(this.Ik);
                        } else {
                            Object obj5 = this.wTp;
                            if (obj5 != null) {
                                constraintReferenceNr.k(obj5).nHg(this.gh).wTp(this.Ik);
                            } else {
                                String string = constraintReferenceNr.getKey().toString();
                                constraintReferenceNr.dR0(State.gh).s7N(Float.valueOf(mYa(string))).v(Float.valueOf(qm(string)));
                            }
                        }
                    }
                }
                constraintReference2 = constraintReferenceNr;
            }
            if (constraintReference != null) {
                String string2 = constraintReference.getKey().toString();
                String string3 = constraintReferenceNr.getKey().toString();
                constraintReference.g(constraintReferenceNr.getKey()).s7N(Float.valueOf(Rl(string2))).v(Float.valueOf(Jk(string2)));
                constraintReferenceNr.k(constraintReference.getKey()).s7N(Float.valueOf(mYa(string3))).v(Float.valueOf(qm(string3)));
            }
            float fOrg = Org(obj.toString());
            if (fOrg != -1.0f) {
                constraintReferenceNr.J(fOrg);
            }
            constraintReference = constraintReferenceNr;
        }
        if (constraintReference != null) {
            Object obj6 = this.jB;
            if (obj6 != null) {
                constraintReference.g(obj6).nHg(this.ty).wTp(this.f35363Z);
            } else {
                Object obj7 = this.f35360U;
                if (obj7 != null) {
                    constraintReference.nY(obj7).nHg(this.ty).wTp(this.f35363Z);
                } else {
                    Object obj8 = this.f35372v;
                    if (obj8 != null) {
                        constraintReference.g(obj8).nHg(this.qie).wTp(this.f35370r);
                    } else {
                        Object obj9 = this.rV9;
                        if (obj9 != null) {
                            constraintReference.nY(obj9).nHg(this.qie).wTp(this.f35370r);
                        } else {
                            String string4 = constraintReference.getKey().toString();
                            constraintReference.nY(State.gh).s7N(Float.valueOf(Rl(string4))).v(Float.valueOf(Jk(string4)));
                        }
                    }
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f3 = this.ofS;
        if (f3 != 0.5f) {
            constraintReference2.e(f3);
        }
        int i2 = AnonymousClass1.f35479n[this.ul.ordinal()];
        if (i2 == 1) {
            constraintReference2.B(0);
        } else if (i2 == 2) {
            constraintReference2.B(1);
        } else {
            if (i2 != 3) {
                return;
            }
            constraintReference2.B(2);
        }
    }
}
