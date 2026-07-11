package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class AlignVerticallyReference extends HelperReference {
    private float ofS;

    public AlignVerticallyReference(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.ofS = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        Iterator it = this.xg.iterator();
        while (it.hasNext()) {
            ConstraintReference constraintReferenceNr = this.f35396m.nr(it.next());
            constraintReferenceNr.S();
            Object obj = this.P5;
            if (obj != null) {
                constraintReferenceNr.m(obj);
            } else {
                Object obj2 = this.M7;
                if (obj2 != null) {
                    constraintReferenceNr.ijL(obj2);
                } else {
                    constraintReferenceNr.m(State.gh);
                }
            }
            Object obj3 = this.eF;
            if (obj3 != null) {
                constraintReferenceNr.Ik(obj3);
            } else {
                Object obj4 = this.f35350E;
                if (obj4 != null) {
                    constraintReferenceNr.ck(obj4);
                } else {
                    constraintReferenceNr.ck(State.gh);
                }
            }
            float f3 = this.ofS;
            if (f3 != 0.5f) {
                constraintReferenceNr.ofS(f3);
            }
        }
    }
}
