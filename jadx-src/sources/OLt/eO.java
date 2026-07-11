package OLt;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class eO implements InterfaceC1421z {
    public abstract void rl(Matrix matrix, Rect rect, int i2, int i3, float f3, float f4, float f5, float f6);

    @Override // OLt.InterfaceC1421z
    public Matrix n(Matrix matrix, Rect rect, int i2, int i3, float f3, float f4) {
        rl(matrix, rect, i2, i3, f3, f4, rect.width() / i2, rect.height() / i3);
        return matrix;
    }
}
