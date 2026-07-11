package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class MockView extends View {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Paint f35836O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Rect f35837S;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35838g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f35839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected String f35840o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35841r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Paint f35842t;

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.J2) {
            width--;
            height--;
            float f3 = width;
            float f4 = height;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, f3, f4, this.f35839n);
            canvas2.drawLine(0.0f, f4, f3, 0.0f, this.f35839n);
            canvas2.drawLine(0.0f, 0.0f, f3, 0.0f, this.f35839n);
            canvas2.drawLine(f3, 0.0f, f3, f4, this.f35839n);
            canvas2.drawLine(f3, f4, 0.0f, f4, this.f35839n);
            canvas2.drawLine(0.0f, f4, 0.0f, 0.0f, this.f35839n);
        } else {
            canvas2 = canvas;
        }
        String str = this.f35840o;
        if (str != null && this.f35841r) {
            this.f35842t.getTextBounds(str, 0, str.length(), this.f35837S);
            float fWidth = (width - this.f35837S.width()) / 2.0f;
            float fHeight = ((height - this.f35837S.height()) / 2.0f) + this.f35837S.height();
            this.f35837S.offset((int) fWidth, (int) fHeight);
            Rect rect = this.f35837S;
            int i2 = rect.left;
            int i3 = this.f35838g;
            rect.set(i2 - i3, rect.top - i3, rect.right + i3, rect.bottom + i3);
            canvas2.drawRect(this.f35837S, this.f35836O);
            canvas2.drawText(this.f35840o, fWidth, fHeight, this.f35842t);
        }
    }
}
