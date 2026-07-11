package androidx.legacy.widget;

import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Deprecated
public class Space extends View {
    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    private static int n(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return i2;
            }
            return size;
        }
        return Math.min(i2, size);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(n(getSuggestedMinimumWidth(), i2), n(getSuggestedMinimumHeight(), i3));
    }
}
