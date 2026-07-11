package androidx.constraintlayout.widget;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class StateSet {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f36099n;
    int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SparseArray f36100t;

    static class State {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ArrayList f36101n;
        int rl;

        public int n(float f3, float f4) {
            for (int i2 = 0; i2 < this.f36101n.size(); i2++) {
                if (((Variant) this.f36101n.get(i2)).n(f3, f4)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    static class Variant {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f36102O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f36103n;
        float nr;
        float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float f36104t;

        boolean n(float f3, float f4) {
            if (!Float.isNaN(this.f36103n) && f3 < this.f36103n) {
                return false;
            }
            if (!Float.isNaN(this.rl) && f4 < this.rl) {
                return false;
            }
            if (Float.isNaN(this.f36104t) || f3 <= this.f36104t) {
                return Float.isNaN(this.nr) || f4 <= this.nr;
            }
            return false;
        }
    }

    public int rl(int i2, int i3, int i5) {
        return t(-1, i2, i3, i5);
    }

    public int t(int i2, int i3, float f3, float f4) {
        int iN;
        if (i2 == i3) {
            State state = i3 == -1 ? (State) this.f36100t.valueAt(0) : (State) this.f36100t.get(this.f36099n);
            if (state == null) {
                return -1;
            }
            return ((this.rl == -1 || !((Variant) state.f36101n.get(i2)).n(f3, f4)) && i2 != (iN = state.n(f3, f4))) ? iN == -1 ? state.rl : ((Variant) state.f36101n.get(iN)).f36102O : i2;
        }
        State state2 = (State) this.f36100t.get(i3);
        if (state2 == null) {
            return -1;
        }
        int iN2 = state2.n(f3, f4);
        return iN2 == -1 ? state2.rl : ((Variant) state2.f36101n.get(iN2)).f36102O;
    }

    public int n(int i2, int i3, float f3, float f4) {
        State state = (State) this.f36100t.get(i3);
        if (state == null) {
            return i3;
        }
        if (f3 != -1.0f && f4 != -1.0f) {
            Variant variant = null;
            for (Variant variant2 : state.f36101n) {
                if (variant2.n(f3, f4)) {
                    if (i2 != variant2.f36102O) {
                        variant = variant2;
                    }
                }
            }
            return variant != null ? variant.f36102O : state.rl;
        }
        if (state.rl != i2) {
            Iterator it = state.f36101n.iterator();
            while (it.hasNext()) {
                if (i2 == ((Variant) it.next()).f36102O) {
                }
            }
            return state.rl;
        }
        return i2;
    }
}
