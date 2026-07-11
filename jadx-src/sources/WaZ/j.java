package WaZ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements fVJ.j {
    @Override // fVJ.j
    public Integer get() {
        Integer numValueOf = Integer.valueOf(com.alightcreative.app.motion.persist.j.INSTANCE.getCountdownDiscountPercent());
        if (numValueOf.intValue() != 0) {
            return numValueOf;
        }
        return null;
    }

    @Override // fVJ.j
    public void n(int i2) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setCountdownDiscountPercent(i2);
    }
}
