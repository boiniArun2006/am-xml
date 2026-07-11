package i7B;

import android.graphics.Canvas;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: i7B.j$j, reason: collision with other inner class name */
    public interface InterfaceC0967j {
        void n(Canvas canvas);
    }

    public static int n(Canvas canvas, float f3, float f4, float f5, float f6, int i2) {
        return canvas.saveLayerAlpha(f3, f4, f5, f6, i2);
    }
}
