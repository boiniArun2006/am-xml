package OLt;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class l3D extends eO {
    public static final InterfaceC1421z qie = new l3D();

    @Override // OLt.eO
    public void rl(Matrix matrix, Rect rect, int i2, int i3, float f3, float f4, float f5, float f6) {
        float fHeight;
        float fWidth;
        if (f6 > f5) {
            fWidth = rect.left + ((rect.width() - (i2 * f6)) * 0.5f);
            fHeight = rect.top;
            f5 = f6;
        } else {
            float f7 = rect.left;
            fHeight = ((rect.height() - (i3 * f5)) * 0.5f) + rect.top;
            fWidth = f7;
        }
        matrix.setScale(f5, f5);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return "center_crop";
    }

    private l3D() {
    }
}
