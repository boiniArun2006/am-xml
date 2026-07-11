package OLt;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class g9s extends eO {
    public static final InterfaceC1421z qie = new g9s();

    @Override // OLt.eO
    public void rl(Matrix matrix, Rect rect, int i2, int i3, float f3, float f4, float f5, float f6) {
        float fWidth = rect.left + ((rect.width() - (i2 * f6)) * 0.5f);
        float f7 = rect.top;
        matrix.setScale(f6, f6);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (f7 + 0.5f));
    }

    public String toString() {
        return "fit_y";
    }

    private g9s() {
    }
}
