package rgg;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class j {
    private int J2;
    private final Paint KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f73129O;
    private final Path Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f73130n;
    private int nr;
    private final Paint rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Paint f73131t;
    private static final int[] xMQ = new int[3];
    private static final float[] mUb = {0.0f, 0.5f, 1.0f};
    private static final int[] gh = new int[4];
    private static final float[] qie = {0.0f, 0.0f, 0.5f, 1.0f};

    public j() {
        this(-16777216);
    }

    public j(int i2) {
        this.Uo = new Path();
        Paint paint = new Paint();
        this.KN = paint;
        this.f73130n = new Paint();
        nr(i2);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.rl = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f73131t = new Paint(paint2);
    }

    public void n(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f3, float f4) {
        float f5;
        boolean z2 = f4 < 0.0f;
        Path path = this.Uo;
        if (z2) {
            int[] iArr = gh;
            iArr[0] = 0;
            iArr[1] = this.J2;
            iArr[2] = this.f73129O;
            iArr[3] = this.nr;
            f5 = f3;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f5 = f3;
            path.arcTo(rectF, f5, f4);
            path.close();
            float f6 = -i2;
            rectF.inset(f6, f6);
            int[] iArr2 = gh;
            iArr2[0] = 0;
            iArr2[1] = this.nr;
            iArr2[2] = this.f73129O;
            iArr2[3] = this.J2;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f7 = 1.0f - (i2 / fWidth);
        float[] fArr = qie;
        fArr[1] = f7;
        fArr[2] = ((1.0f - f7) / 2.0f) + f7;
        this.rl.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, gh, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.KN);
        }
        canvas.drawArc(rectF, f5, f4, true, this.rl);
        canvas.restore();
    }

    public void nr(int i2) {
        this.nr = ColorUtils.ck(i2, 68);
        this.f73129O = ColorUtils.ck(i2, 20);
        this.J2 = ColorUtils.ck(i2, 0);
        this.f73130n.setColor(this.nr);
    }

    public void rl(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = xMQ;
        iArr[0] = this.J2;
        iArr[1] = this.f73129O;
        iArr[2] = this.nr;
        Paint paint = this.f73131t;
        float f3 = rectF.left;
        paint.setShader(new LinearGradient(f3, rectF.top, f3, rectF.bottom, iArr, mUb, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f73131t);
        canvas.restore();
    }

    public Paint t() {
        return this.f73130n;
    }
}
