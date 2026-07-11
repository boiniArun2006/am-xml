package teV;

import TFv.Ew;
import TFv.rv6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class SPz extends Ew implements rv6 {
    public final boolean D(int i2) {
        boolean zT2;
        synchronized (this) {
            zT2 = t(Integer.valueOf(((Number) rV9()).intValue() + i2));
        }
        return zT2;
    }

    @Override // TFv.rv6
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) rV9()).intValue());
        }
        return numValueOf;
    }

    public SPz(int i2) {
        super(1, Integer.MAX_VALUE, ILs.j.f4187t);
        t(Integer.valueOf(i2));
    }
}
