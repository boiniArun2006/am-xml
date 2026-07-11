package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.HelperWidget;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class BarrierReference extends HelperReference {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f35466C;
    private Barrier Mx;
    private State.Direction ofS;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.BarrierReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f35467n;

        static {
            int[] iArr = new int[State.Direction.values().length];
            f35467n = iArr;
            try {
                iArr[State.Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35467n[State.Direction.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35467n[State.Direction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35467n[State.Direction.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35467n[State.Direction.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35467n[State.Direction.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public BarrierReference(State state) {
        super(state, State.Helper.BARRIER);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget fcU() {
        if (this.Mx == null) {
            this.Mx = new Barrier();
        }
        return this.Mx;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference nHg(int i2) {
        this.f35466C = i2;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference s7N(Object obj) {
        nHg(this.f35396m.O(obj));
        return this;
    }

    public void ul(State.Direction direction) {
        this.ofS = direction;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        fcU();
        int i2 = AnonymousClass1.f35467n[this.ofS.ordinal()];
        int i3 = 3;
        if (i2 != 3 && i2 != 4) {
            if (i2 != 5) {
                if (i2 != 6) {
                    i3 = 0;
                }
            } else {
                i3 = 2;
            }
        } else {
            i3 = 1;
        }
        this.Mx.I9f(i3);
        this.Mx.D76(this.f35466C);
    }
}
