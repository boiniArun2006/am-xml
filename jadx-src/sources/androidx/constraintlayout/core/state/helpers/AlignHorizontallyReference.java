package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class AlignHorizontallyReference extends HelperReference {
    private float ofS;

    public AlignHorizontallyReference(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.ofS = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        Iterator it = this.xg.iterator();
        while (it.hasNext()) {
            ConstraintReference constraintReferenceNr = this.f35396m.nr(it.next());
            constraintReferenceNr.XQ();
            Object obj = this.bzg;
            if (obj != null) {
                constraintReferenceNr.dR0(obj);
            } else {
                Object obj2 = this.Xw;
                if (obj2 != null) {
                    constraintReferenceNr.k(obj2);
                } else {
                    constraintReferenceNr.dR0(State.gh);
                }
            }
            Object obj3 = this.jB;
            if (obj3 != null) {
                constraintReferenceNr.g(obj3);
            } else {
                Object obj4 = this.f35360U;
                if (obj4 != null) {
                    constraintReferenceNr.nY(obj4);
                } else {
                    constraintReferenceNr.nY(State.gh);
                }
            }
            float f3 = this.ofS;
            if (f3 != 0.5f) {
                constraintReferenceNr.e(f3);
            }
        }
    }
}
