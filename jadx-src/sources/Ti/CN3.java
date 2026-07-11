package Ti;

import Xo.C1489j;
import com.facebook.internal.Pl;
import com.facebook.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f10528n = new CN3();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(boolean z2) {
        if (z2) {
            jkl.I28.nr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(boolean z2) {
        if (z2) {
            ui.w6.rl.t();
            if (Pl.Uo(Pl.n.CrashShield)) {
                n.rl();
                VmF.j.n();
            }
            if (Pl.Uo(Pl.n.ThreadCheck)) {
                C1489j.n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(boolean z2) {
        if (z2) {
            Mn.I28.t();
        }
    }

    private CN3() {
    }

    public static final void nr() {
        if (!s4.ck()) {
            return;
        }
        Pl.n(Pl.n.CrashReport, new Pl.j() { // from class: Ti.Ml
            @Override // com.facebook.internal.Pl.j
            public final void n(boolean z2) {
                CN3.O(z2);
            }
        });
        Pl.n(Pl.n.ErrorReport, new Pl.j() { // from class: Ti.I28
            @Override // com.facebook.internal.Pl.j
            public final void n(boolean z2) {
                CN3.J2(z2);
            }
        });
        Pl.n(Pl.n.AnrReport, new Pl.j() { // from class: Ti.Wre
            @Override // com.facebook.internal.Pl.j
            public final void n(boolean z2) {
                CN3.Uo(z2);
            }
        });
    }
}
