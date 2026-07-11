package OLt;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class QJ extends eO {
    public static final InterfaceC1421z qie = new QJ();

    @Override // OLt.eO
    public void rl(Matrix matrix, Rect rect, int i2, int i3, float f3, float f4, float f5, float f6) {
        matrix.setTranslate((int) (rect.left + ((rect.width() - i2) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i3) * 0.5f) + 0.5f));
    }

    public String toString() {
        return TtmlNode.CENTER;
    }

    private QJ() {
    }
}
