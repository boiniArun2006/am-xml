package mfo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class I28 extends Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f70925n = -1.0f;

    @Override // mfo.Ml
    public void n(qz qzVar, float f3, float f4, float f5) {
        qzVar.HI(0.0f, f5 * f4, 180.0f, 180.0f - f3);
        double d2 = f5;
        double d4 = f4;
        qzVar.az((float) (Math.sin(Math.toRadians(f3)) * d2 * d4), (float) (Math.sin(Math.toRadians(90.0f - f3)) * d2 * d4));
    }
}
