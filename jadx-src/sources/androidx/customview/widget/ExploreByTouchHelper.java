package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.customview.widget.FocusStrategy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {
    private final AccessibilityManager KN;
    private MyNodeProvider mUb;
    private final View xMQ;
    private static final Rect ty = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final FocusStrategy.BoundsAdapter HI = new FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat>() { // from class: androidx.customview.widget.ExploreByTouchHelper.1
        @Override // androidx.customview.widget.FocusStrategy.BoundsAdapter
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Rect rect) {
            accessibilityNodeInfoCompat.az(rect);
        }
    };
    private static final FocusStrategy.CollectionAdapter ck = new FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat>() { // from class: androidx.customview.widget.ExploreByTouchHelper.2
        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public int rl(SparseArrayCompat sparseArrayCompat) {
            return sparseArrayCompat.ck();
        }

        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public AccessibilityNodeInfoCompat n(SparseArrayCompat sparseArrayCompat, int i2) {
            return (AccessibilityNodeInfoCompat) sparseArrayCompat.Ik(i2);
        }
    };
    private final Rect nr = new Rect();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Rect f37349O = new Rect();
    private final Rect J2 = new Rect();
    private final int[] Uo = new int[2];
    int gh = Integer.MIN_VALUE;
    int qie = Integer.MIN_VALUE;
    private int az = Integer.MIN_VALUE;

    private class MyNodeProvider extends AccessibilityNodeProviderCompat {
        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat nr(int i2) {
            int i3 = i2 == 2 ? ExploreByTouchHelper.this.gh : ExploreByTouchHelper.this.qie;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return rl(i3);
        }

        MyNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean J2(int i2, int i3, Bundle bundle) {
            return ExploreByTouchHelper.this.Xw(i2, i3, bundle);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat rl(int i2) {
            return AccessibilityNodeInfoCompat.I(ExploreByTouchHelper.this.T(i2));
        }
    }

    private boolean E2(Rect rect) {
        if (rect == null || rect.isEmpty() || this.xMQ.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.xMQ.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private AccessibilityEvent Ik(int i2, int i3) {
        return i2 != -1 ? r(i2, i3) : o(i3);
    }

    private static int e(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 != 21) {
            return i2 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean jB(int i2, int i3, Bundle bundle) {
        return i3 != 1 ? i3 != 2 ? i3 != 64 ? i3 != 128 ? nHg(i2, i3, bundle) : ty(i2) : P5(i2) : HI(i2) : M7(i2);
    }

    AccessibilityNodeInfoCompat T(int i2) {
        return i2 == -1 ? XQ() : Z(i2);
    }

    boolean Xw(int i2, int i3, Bundle bundle) {
        return i2 != -1 ? jB(i2, i3, bundle) : U(i3, bundle);
    }

    protected void bzg(int i2, boolean z2) {
    }

    protected abstract void iF(List list);

    protected abstract boolean nHg(int i2, int i3, Bundle bundle);

    protected abstract void rV9(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    protected void s7N(AccessibilityEvent accessibilityEvent) {
    }

    protected abstract int te(float f3, float f4);

    protected void v(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    protected void wTp(int i2, AccessibilityEvent accessibilityEvent) {
    }

    private boolean P5(int i2) {
        int i3;
        if (!this.KN.isEnabled() || !this.KN.isTouchExplorationEnabled() || (i3 = this.gh) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            ty(i3);
        }
        this.gh = i2;
        this.xMQ.invalidate();
        p5(i2, 32768);
        return true;
    }

    private boolean U(int i2, Bundle bundle) {
        return ViewCompat.a(this.xMQ, i2, bundle);
    }

    private SparseArrayCompat ViF() {
        ArrayList arrayList = new ArrayList();
        iF(arrayList);
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sparseArrayCompat.az(((Integer) arrayList.get(i2)).intValue(), Z(((Integer) arrayList.get(i2)).intValue()));
        }
        return sparseArrayCompat;
    }

    private AccessibilityNodeInfoCompat XQ() {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatA = AccessibilityNodeInfoCompat.a(this.xMQ);
        ViewCompat.J(this.xMQ, accessibilityNodeInfoCompatA);
        ArrayList arrayList = new ArrayList();
        iF(arrayList);
        if (accessibilityNodeInfoCompatA.ck() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            accessibilityNodeInfoCompatA.nr(this.xMQ, ((Integer) arrayList.get(i2)).intValue());
        }
        return accessibilityNodeInfoCompatA;
    }

    private boolean ck() {
        int i2 = this.qie;
        return i2 != Integer.MIN_VALUE && nHg(i2, 16, null);
    }

    private void eF(int i2) {
        int i3 = this.az;
        if (i3 == i2) {
            return;
        }
        this.az = i2;
        p5(i2, 128);
        p5(i3, 256);
    }

    private boolean ty(int i2) {
        if (this.gh != i2) {
            return false;
        }
        this.gh = Integer.MIN_VALUE;
        this.xMQ.invalidate();
        p5(i2, 65536);
        return true;
    }

    public final boolean HI(int i2) {
        if (this.qie != i2) {
            return false;
        }
        this.qie = Integer.MIN_VALUE;
        bzg(i2, false);
        p5(i2, 8);
        return true;
    }

    public final boolean M7(int i2) {
        int i3;
        if ((!this.xMQ.isFocused() && !this.xMQ.requestFocus()) || (i3 = this.qie) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            HI(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.qie = i2;
        bzg(i2, true);
        p5(i2, 8);
        return true;
    }

    public final void N(boolean z2, int i2, Rect rect) {
        int i3 = this.qie;
        if (i3 != Integer.MIN_VALUE) {
            HI(i3);
        }
        if (z2) {
            X(i2, rect);
        }
    }

    public final boolean S(MotionEvent motionEvent) {
        if (this.KN.isEnabled() && this.KN.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.az == Integer.MIN_VALUE) {
                    return false;
                }
                eF(Integer.MIN_VALUE);
                return true;
            }
            int iTe = te(motionEvent.getX(), motionEvent.getY());
            eF(iTe);
            if (iTe != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    public final int aYN() {
        return this.gh;
    }

    public final int g() {
        return this.qie;
    }

    public final boolean p5(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.KN.isEnabled() || (parent = this.xMQ.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.xMQ, Ik(i2, i3));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat rl(View view) {
        if (this.mUb == null) {
            this.mUb = new MyNodeProvider();
        }
        return this.mUb;
    }

    public ExploreByTouchHelper(View view) {
        if (view != null) {
            this.xMQ = view;
            this.KN = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (ViewCompat.aYN(view) == 0) {
                ViewCompat.ul(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private boolean X(int i2, Rect rect) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2;
        SparseArrayCompat sparseArrayCompatViF = ViF();
        int i3 = this.qie;
        int iQie = Integer.MIN_VALUE;
        if (i3 == Integer.MIN_VALUE) {
            accessibilityNodeInfoCompat = null;
        } else {
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) sparseArrayCompatViF.O(i3);
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3 = accessibilityNodeInfoCompat;
        boolean z2 = true;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 17 && i2 != 33 && i2 != 66 && i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i5 = this.qie;
            if (i5 != Integer.MIN_VALUE) {
                nY(i5, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                fD(this.xMQ, i2, rect2);
            }
            accessibilityNodeInfoCompat2 = (AccessibilityNodeInfoCompat) FocusStrategy.t(sparseArrayCompatViF, ck, HI, accessibilityNodeInfoCompat3, rect2, i2);
        } else {
            if (ViewCompat.nY(this.xMQ) != 1) {
                z2 = false;
            }
            accessibilityNodeInfoCompat2 = (AccessibilityNodeInfoCompat) FocusStrategy.nr(sparseArrayCompatViF, ck, HI, accessibilityNodeInfoCompat3, i2, z2, false);
        }
        if (accessibilityNodeInfoCompat2 != null) {
            iQie = sparseArrayCompatViF.qie(sparseArrayCompatViF.mUb(accessibilityNodeInfoCompat2));
        }
        return M7(iQie);
    }

    private AccessibilityNodeInfoCompat Z(int i2) {
        boolean z2;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatD = AccessibilityNodeInfoCompat.D();
        accessibilityNodeInfoCompatD.Jk(true);
        accessibilityNodeInfoCompatD.qm(true);
        accessibilityNodeInfoCompatD.ofS("android.view.View");
        Rect rect = ty;
        accessibilityNodeInfoCompatD.ijL(rect);
        accessibilityNodeInfoCompatD.m(rect);
        accessibilityNodeInfoCompatD.ER(this.xMQ);
        rV9(i2, accessibilityNodeInfoCompatD);
        if (accessibilityNodeInfoCompatD.iF() == null && accessibilityNodeInfoCompatD.Z() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompatD.az(this.f37349O);
        if (!this.f37349O.equals(rect)) {
            int iGh = accessibilityNodeInfoCompatD.gh();
            if ((iGh & 64) == 0) {
                if ((iGh & 128) == 0) {
                    accessibilityNodeInfoCompatD.How(this.xMQ.getContext().getPackageName());
                    accessibilityNodeInfoCompatD.mI(this.xMQ, i2);
                    if (this.gh == i2) {
                        accessibilityNodeInfoCompatD.dR0(true);
                        accessibilityNodeInfoCompatD.n(128);
                    } else {
                        accessibilityNodeInfoCompatD.dR0(false);
                        accessibilityNodeInfoCompatD.n(64);
                    }
                    if (this.qie == i2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        accessibilityNodeInfoCompatD.n(2);
                    } else if (accessibilityNodeInfoCompatD.jB()) {
                        accessibilityNodeInfoCompatD.n(1);
                    }
                    accessibilityNodeInfoCompatD.mYa(z2);
                    this.xMQ.getLocationOnScreen(this.Uo);
                    accessibilityNodeInfoCompatD.ty(this.nr);
                    if (this.nr.equals(rect)) {
                        accessibilityNodeInfoCompatD.az(this.nr);
                        if (accessibilityNodeInfoCompatD.rl != -1) {
                            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatD2 = AccessibilityNodeInfoCompat.D();
                            for (int i3 = accessibilityNodeInfoCompatD.rl; i3 != -1; i3 = accessibilityNodeInfoCompatD2.rl) {
                                accessibilityNodeInfoCompatD2.lLA(this.xMQ, -1);
                                accessibilityNodeInfoCompatD2.ijL(ty);
                                rV9(i3, accessibilityNodeInfoCompatD2);
                                accessibilityNodeInfoCompatD2.az(this.f37349O);
                                Rect rect2 = this.nr;
                                Rect rect3 = this.f37349O;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            accessibilityNodeInfoCompatD2.Nxk();
                        }
                        this.nr.offset(this.Uo[0] - this.xMQ.getScrollX(), this.Uo[1] - this.xMQ.getScrollY());
                    }
                    if (this.xMQ.getLocalVisibleRect(this.J2)) {
                        this.J2.offset(this.Uo[0] - this.xMQ.getScrollX(), this.Uo[1] - this.xMQ.getScrollY());
                        if (this.nr.intersect(this.J2)) {
                            accessibilityNodeInfoCompatD.m(this.nr);
                            if (E2(this.nr)) {
                                accessibilityNodeInfoCompatD.UF(true);
                            }
                        }
                    }
                    return accessibilityNodeInfoCompatD;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    private static Rect fD(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 == 130) {
                        rect.set(0, -1, width, -1);
                        return rect;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect.set(-1, 0, -1, height);
                return rect;
            }
            rect.set(0, height, width, height);
            return rect;
        }
        rect.set(width, 0, width, height);
        return rect;
    }

    private void nY(int i2, Rect rect) {
        T(i2).az(rect);
    }

    private AccessibilityEvent o(int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        this.xMQ.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private AccessibilityEvent r(int i2, int i3) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatT = T(i2);
        accessibilityEventObtain.getText().add(accessibilityNodeInfoCompatT.iF());
        accessibilityEventObtain.setContentDescription(accessibilityNodeInfoCompatT.Z());
        accessibilityEventObtain.setScrollable(accessibilityNodeInfoCompatT.E());
        accessibilityEventObtain.setPassword(accessibilityNodeInfoCompatT.eF());
        accessibilityEventObtain.setEnabled(accessibilityNodeInfoCompatT.bzg());
        accessibilityEventObtain.setChecked(accessibilityNodeInfoCompatT.wTp());
        wTp(i2, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(accessibilityNodeInfoCompatT.Ik());
        AccessibilityRecordCompat.t(accessibilityEventObtain, this.xMQ, i2);
        accessibilityEventObtain.setPackageName(this.xMQ.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void J2(View view, AccessibilityEvent accessibilityEvent) {
        super.J2(view, accessibilityEvent);
        s7N(accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.Uo(view, accessibilityNodeInfoCompat);
        v(accessibilityNodeInfoCompat);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean WPU(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int iE = e(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i2 < repeatCount && X(iE, null)) {
                                    i2++;
                                    z2 = true;
                                }
                                return z2;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                ck();
                                return true;
                            }
                            break;
                    }
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return X(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return X(1, null);
                }
            }
        }
        return false;
    }
}
