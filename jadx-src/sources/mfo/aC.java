package mfo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class aC extends Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f70929n = -1.0f;

    @Override // mfo.Ml
    public void n(qz qzVar, float f3, float f4, float f5) {
        qzVar.HI(0.0f, f5 * f4, 180.0f, 180.0f - f3);
        float f6 = f5 * 2.0f * f4;
        qzVar.n(0.0f, 0.0f, f6, f6, 180.0f, f3);
    }
}
