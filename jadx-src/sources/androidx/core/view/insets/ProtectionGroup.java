package androidx.core.view.insets;

import android.graphics.RectF;
import androidx.core.graphics.Insets;
import androidx.core.view.insets.SystemBarStateMonitor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class ProtectionGroup implements SystemBarStateMonitor.Callback {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f36888O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f36889n = new ArrayList();
    private Insets nr;
    private final SystemBarStateMonitor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Insets f36890t;

    private void mUb() {
        Insets insetsN = Insets.f36409O;
        for (int size = this.f36889n.size() - 1; size >= 0; size--) {
            insetsN = Insets.n(insetsN, ((Protection) this.f36889n.get(size)).rl(this.f36890t, this.nr, insetsN));
        }
    }

    Protection KN(int i2) {
        return (Protection) this.f36889n.get(i2);
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void O(int i2) {
        for (int size = this.f36889n.size() - 1; size >= 0; size--) {
            ((Protection) this.f36889n.get(size)).n(i2);
        }
    }

    void Uo() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        this.rl.qie(this);
        for (int size = this.f36889n.size() - 1; size >= 0; size--) {
            ((Protection) this.f36889n.get(size)).KN(null);
        }
        this.f36889n.clear();
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void n(int i2, Insets insets, RectF rectF) {
        Insets insets2 = this.nr;
        for (int size = this.f36889n.size() - 1; size >= 0; size--) {
            Protection protection = (Protection) this.f36889n.get(size);
            int iO = protection.O();
            if ((iO & i2) != 0) {
                protection.qie(true);
                if (iO == 1) {
                    int i3 = insets2.f36410n;
                    if (i3 > 0) {
                        protection.gh(insets.f36410n / i3);
                    }
                    protection.mUb(rectF.left);
                } else if (iO == 2) {
                    int i5 = insets2.rl;
                    if (i5 > 0) {
                        protection.gh(insets.rl / i5);
                    }
                    protection.mUb(rectF.top);
                } else if (iO == 4) {
                    int i7 = insets2.f36411t;
                    if (i7 > 0) {
                        protection.gh(insets.f36411t / i7);
                    }
                    protection.mUb(rectF.right);
                } else if (iO == 8) {
                    int i8 = insets2.nr;
                    if (i8 > 0) {
                        protection.gh(insets.nr / i8);
                    }
                    protection.mUb(rectF.bottom);
                }
            }
        }
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void nr() {
        int i2 = this.f36888O;
        boolean z2 = i2 > 0;
        int i3 = i2 - 1;
        this.f36888O = i3;
        if (z2 && i3 == 0) {
            mUb();
        }
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void rl(Insets insets, Insets insets2) {
        this.f36890t = insets;
        this.nr = insets2;
        mUb();
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void t() {
        this.f36888O++;
    }

    int xMQ() {
        return this.f36889n.size();
    }

    ProtectionGroup(SystemBarStateMonitor systemBarStateMonitor, List list) {
        Insets insets = Insets.f36409O;
        this.f36890t = insets;
        this.nr = insets;
        J2(list, false);
        J2(list, true);
        systemBarStateMonitor.Uo(this);
        this.rl = systemBarStateMonitor;
    }

    private void J2(List list, boolean z2) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Protection protection = (Protection) list.get(i2);
            if (protection.Uo() == z2) {
                Object objNr = protection.nr();
                if (objNr == null) {
                    protection.KN(this);
                    this.f36889n.add(protection);
                } else {
                    throw new IllegalStateException(protection + " is already controlled by " + objNr);
                }
            }
        }
    }
}
