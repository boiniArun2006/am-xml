package gq;

import java.util.ArrayList;
import uh.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class afx {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f67758n;
    private final eZ.I28 nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final eZ.I28 f67759t;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67760n;

        static {
            int[] iArr = new int[qz.j.values().length];
            f67760n = iArr;
            try {
                iArr[qz.j.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67760n[qz.j.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static afx n(int i2, uh.Md md) {
        eZ.I28 i28 = new eZ.I28(new ArrayList(), pUk.C.n());
        eZ.I28 i282 = new eZ.I28(new ArrayList(), pUk.C.n());
        for (uh.qz qzVar : md.nr()) {
            int i3 = j.f67760n[qzVar.t().ordinal()];
            if (i3 == 1) {
                i28 = i28.nr(qzVar.rl().getKey());
            } else if (i3 == 2) {
                i282 = i282.nr(qzVar.rl().getKey());
            }
        }
        return new afx(i2, md.gh(), i28, i282);
    }

    public boolean O() {
        return this.rl;
    }

    public int nr() {
        return this.f67758n;
    }

    public eZ.I28 rl() {
        return this.f67759t;
    }

    public eZ.I28 t() {
        return this.nr;
    }

    public afx(int i2, boolean z2, eZ.I28 i28, eZ.I28 i282) {
        this.f67758n = i2;
        this.rl = z2;
        this.f67759t = i28;
        this.nr = i282;
    }
}
