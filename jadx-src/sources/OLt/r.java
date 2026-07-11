package OLt;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class r extends eO {
    public static final InterfaceC1421z qie = new r();

    public String toString() {
        return "fit_start";
    }

    private r() {
    }

    @Override // OLt.eO
    public void rl(Matrix matrix, Rect rect, int i2, int i3, float f3, float f4, float f5, float f6) {
        float fMin = Math.min(f5, f6);
        float f7 = rect.left;
        float f8 = rect.top;
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (f7 + 0.5f), (int) (f8 + 0.5f));
    }
}
