package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class NestedScrollingChildHelper {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int[] f36741O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ViewParent f36742n;
    private boolean nr;
    private ViewParent rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final View f36743t;

    public boolean J2(int i2, int i3, int i5, int i7, int[] iArr) {
        return KN(i2, i3, i5, i7, iArr, 0, null);
    }

    public boolean Uo(int i2, int i3, int i5, int i7, int[] iArr, int i8) {
        return KN(i2, i3, i5, i7, iArr, i8, null);
    }

    public boolean ck(int i2) {
        return Ik(i2, 0);
    }

    public boolean gh() {
        return qie(0);
    }

    public void r() {
        o(0);
    }

    public boolean t(int i2, int i3, int[] iArr, int[] iArr2) {
        return nr(i2, i3, iArr, iArr2, 0);
    }

    private void HI(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.f36742n = viewParent;
        } else {
            if (i2 != 1) {
                return;
            }
            this.rl = viewParent;
        }
    }

    private boolean KN(int i2, int i3, int i5, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent viewParentXMQ;
        int i9;
        int i10;
        int[] iArr3;
        if (!az() || (viewParentXMQ = xMQ(i8)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i5 == 0 && i7 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f36743t.getLocationInWindow(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            int[] iArrMUb = mUb();
            iArrMUb[0] = 0;
            iArrMUb[1] = 0;
            iArr3 = iArrMUb;
        } else {
            iArr3 = iArr2;
        }
        ViewParentCompat.nr(viewParentXMQ, this.f36743t, i2, i3, i5, i7, i8, iArr3);
        if (iArr != null) {
            this.f36743t.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i9;
            iArr[1] = iArr[1] - i10;
        }
        return true;
    }

    private int[] mUb() {
        if (this.f36741O == null) {
            this.f36741O = new int[2];
        }
        return this.f36741O;
    }

    private ViewParent xMQ(int i2) {
        if (i2 == 0) {
            return this.f36742n;
        }
        if (i2 != 1) {
            return null;
        }
        return this.rl;
    }

    public boolean az() {
        return this.nr;
    }

    public void ty(boolean z2) {
        if (this.nr) {
            ViewCompat.ER(this.f36743t);
        }
        this.nr = z2;
    }

    public NestedScrollingChildHelper(View view) {
        this.f36743t = view;
    }

    public boolean Ik(int i2, int i3) {
        if (qie(i3)) {
            return true;
        }
        if (az()) {
            View view = this.f36743t;
            for (ViewParent parent = this.f36743t.getParent(); parent != null; parent = parent.getParent()) {
                if (ViewParentCompat.J2(parent, view, this.f36743t, i2, i3)) {
                    HI(i3, parent);
                    ViewParentCompat.O(parent, view, this.f36743t, i2, i3);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public void O(int i2, int i3, int i5, int i7, int[] iArr, int i8, int[] iArr2) {
        KN(i2, i3, i5, i7, iArr, i8, iArr2);
    }

    public boolean n(float f3, float f4, boolean z2) {
        ViewParent viewParentXMQ;
        if (!az() || (viewParentXMQ = xMQ(0)) == null) {
            return false;
        }
        return ViewParentCompat.n(viewParentXMQ, this.f36743t, f3, f4, z2);
    }

    public boolean nr(int i2, int i3, int[] iArr, int[] iArr2, int i5) {
        ViewParent viewParentXMQ;
        int i7;
        int i8;
        if (!az() || (viewParentXMQ = xMQ(i5)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f36743t.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            iArr = mUb();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        ViewParentCompat.t(viewParentXMQ, this.f36743t, i2, i3, iArr3, i5);
        if (iArr2 != null) {
            this.f36743t.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public void o(int i2) {
        ViewParent viewParentXMQ = xMQ(i2);
        if (viewParentXMQ != null) {
            ViewParentCompat.Uo(viewParentXMQ, this.f36743t, i2);
            HI(i2, null);
        }
    }

    public boolean qie(int i2) {
        if (xMQ(i2) != null) {
            return true;
        }
        return false;
    }

    public boolean rl(float f3, float f4) {
        ViewParent viewParentXMQ;
        if (!az() || (viewParentXMQ = xMQ(0)) == null) {
            return false;
        }
        return ViewParentCompat.rl(viewParentXMQ, this.f36743t, f3, f4);
    }
}
