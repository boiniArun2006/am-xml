package sp;

import OLt.InterfaceC1421z;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.alightcreative.time.Kw.znsSxz;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import jp5.n;

/* JADX INFO: renamed from: sp.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class C2364j extends Drawable implements n {
    private int E2;
    private int J2;
    private int M7;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f73303O;
    private int P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f73306U;
    private int Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private InterfaceC1421z f73308Z;
    private String eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f73310g;
    private int jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f73311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f73312o;
    private long p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f73313r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f73314t;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private HashMap f73304S = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f73309e = 80;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final Paint f73307X = new Paint(1);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Matrix f73305T = new Matrix();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Rect f73302N = new Rect();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final RectF f73315v = new RectF();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f73300E = -1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f73301M = 0;

    private void nr(Canvas canvas, String str, String str2) {
        O(canvas, str, str2, -1);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void xMQ() {
        this.f73303O = -1;
        this.J2 = -1;
        this.f73313r = -1;
        this.f73304S = new HashMap();
        this.f73310g = -1;
        this.E2 = -1;
        this.f73312o = null;
        mUb(null);
        this.p5 = -1L;
        this.eF = null;
        this.f73300E = -1;
        invalidateSelf();
    }

    private void O(Canvas canvas, String str, String str2, int i2) {
        String str3 = str + ": ";
        float fMeasureText = this.f73307X.measureText(str3);
        float fMeasureText2 = this.f73307X.measureText(str2);
        this.f73307X.setColor(1711276032);
        int i3 = this.P5;
        int i5 = this.M7;
        canvas.drawRect(i3 - 4, i5 + 8, i3 + fMeasureText + fMeasureText2 + 4.0f, i5 + this.f73306U + 8, this.f73307X);
        this.f73307X.setColor(-1);
        canvas.drawText(str3, this.P5, this.M7, this.f73307X);
        this.f73307X.setColor(i2);
        canvas.drawText(str2, this.P5 + fMeasureText, this.M7, this.f73307X);
        this.M7 += this.f73306U;
    }

    private static String Uo(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    public void az(InterfaceC1421z interfaceC1421z) {
        this.f73308Z = interfaceC1421z;
    }

    public void gh(int i2, int i3) {
        this.f73303O = i2;
        this.J2 = i3;
        invalidateSelf();
    }

    public void mUb(String str) {
        if (str == null) {
            str = "none";
        }
        this.f73311n = str;
        invalidateSelf();
    }

    @Override // jp5.n
    public void n(long j2) {
        this.p5 = j2;
        invalidateSelf();
    }

    public void qie(int i2) {
        this.f73313r = i2;
    }

    public void rl(String str, String str2) {
        this.f73304S.put(str, str2);
    }

    public C2364j() {
        xMQ();
    }

    private void KN(Rect rect, int i2, int i3) {
        int i5;
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / i3, rect.height() / i2)));
        this.f73307X.setTextSize(iMin);
        int i7 = iMin + 8;
        this.f73306U = i7;
        int i8 = this.f73309e;
        if (i8 == 80) {
            this.f73306U = i7 * (-1);
        }
        this.Xw = rect.left + 10;
        if (i8 == 80) {
            i5 = rect.bottom - 10;
        } else {
            i5 = rect.top + 20;
        }
        this.jB = i5;
    }

    private void t(Canvas canvas, String str, Object obj) {
        O(canvas, str, String.valueOf(obj), -1);
    }

    int J2(int i2, int i3, InterfaceC1421z interfaceC1421z) {
        int i5;
        int i7;
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0 && i2 > 0 && i3 > 0) {
            if (interfaceC1421z != null) {
                Rect rect = this.f73302N;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth;
                rect.bottom = iHeight;
                this.f73305T.reset();
                i5 = i2;
                i7 = i3;
                interfaceC1421z.n(this.f73305T, this.f73302N, i5, i7, 0.0f, 0.0f);
                RectF rectF = this.f73315v;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i5;
                rectF.bottom = i7;
                this.f73305T.mapRect(rectF);
                int iWidth2 = (int) this.f73315v.width();
                int iHeight2 = (int) this.f73315v.height();
                iWidth = Math.min(iWidth, iWidth2);
                iHeight = Math.min(iHeight, iHeight2);
            } else {
                i5 = i2;
                i7 = i3;
            }
            float f3 = iWidth;
            float f4 = f3 * 0.1f;
            float f5 = f3 * 0.5f;
            float f6 = iHeight;
            float f7 = 0.1f * f6;
            float f8 = f6 * 0.5f;
            int iAbs = Math.abs(i5 - iWidth);
            int iAbs2 = Math.abs(i7 - iHeight);
            float f9 = iAbs;
            if (f9 < f4 && iAbs2 < f7) {
                return -16711936;
            }
            if (f9 < f5 && iAbs2 < f8) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f73307X.setStyle(Paint.Style.STROKE);
        this.f73307X.setStrokeWidth(2.0f);
        this.f73307X.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f73307X);
        Paint paint = this.f73307X;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f73307X.setColor(this.f73301M);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f73307X);
        this.f73307X.setStyle(style);
        this.f73307X.setStrokeWidth(0.0f);
        this.f73307X.setColor(-1);
        this.P5 = this.Xw;
        this.M7 = this.jB;
        String str = this.f73314t;
        if (str != null) {
            nr(canvas, "IDs", Uo("%s, %s", this.f73311n, str));
        } else {
            nr(canvas, "ID", this.f73311n);
        }
        nr(canvas, "D", Uo("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            t(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        O(canvas, "I", Uo("%dx%d", Integer.valueOf(this.f73303O), Integer.valueOf(this.J2)), J2(this.f73303O, this.J2, this.f73308Z));
        int i2 = this.J2;
        if (i2 > 0) {
            t(canvas, znsSxz.hpJ, Float.valueOf(this.f73303O / i2));
        }
        nr(canvas, "I", Uo("%d KiB", Integer.valueOf(this.f73313r / 1024)));
        String str2 = this.f73312o;
        if (str2 != null) {
            nr(canvas, "i format", str2);
        }
        int i3 = this.f73310g;
        if (i3 > 0) {
            nr(canvas, "anim", Uo("f %d, l %d", Integer.valueOf(i3), Integer.valueOf(this.E2)));
        }
        InterfaceC1421z interfaceC1421z = this.f73308Z;
        if (interfaceC1421z != null) {
            t(canvas, "scale", interfaceC1421z);
        }
        long j2 = this.p5;
        if (j2 >= 0) {
            nr(canvas, "t", Uo("%d ms", Long.valueOf(j2)));
        }
        String str3 = this.eF;
        if (str3 != null) {
            O(canvas, "origin", str3, this.f73300E);
        }
        for (Map.Entry entry : this.f73304S.entrySet()) {
            nr(canvas, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        KN(rect, 9, 8);
    }
}
