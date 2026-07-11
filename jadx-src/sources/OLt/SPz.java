package OLt;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class SPz extends eO {
    public static final InterfaceC1421z qie = new SPz();

    @Override // OLt.eO
    public void rl(Matrix matrix, Rect rect, int i2, int i3, float f3, float f4, float f5, float f6) {
        float f7 = rect.left;
        float fHeight = rect.top + ((rect.height() - (i3 * f5)) * 0.5f);
        matrix.setScale(f5, f5);
        matrix.postTranslate((int) (f7 + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return "fit_x";
    }

    private SPz() {
    }
}
