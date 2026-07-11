package OLt;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: OLt.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class C1420c extends eO {
    public static final InterfaceC1421z qie = new C1420c();

    public String toString() {
        return "center_inside";
    }

    private C1420c() {
    }

    @Override // OLt.eO
    public void rl(Matrix matrix, Rect rect, int i2, int i3, float f3, float f4, float f5, float f6) {
        float fMin = Math.min(Math.min(f5, f6), 1.0f);
        float fWidth = rect.left + ((rect.width() - (i2 * fMin)) * 0.5f);
        float fHeight = rect.top + ((rect.height() - (i3 * fMin)) * 0.5f);
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }
}
