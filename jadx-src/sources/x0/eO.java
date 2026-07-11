package x0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import ef.s4;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Matrix f75176n = new Matrix();
    private static final ThreadLocal rl = new j();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ThreadLocal f75177t = new n();
    private static final ThreadLocal nr = new w6();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ThreadLocal f75175O = new Ml();
    private static final float J2 = (float) (Math.sqrt(2.0d) / 2.0d);

    class j extends ThreadLocal {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }

        j() {
        }
    }

    class n extends ThreadLocal {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }

        n() {
        }
    }

    class w6 extends ThreadLocal {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }

        w6() {
        }
    }

    public static boolean mUb(int i2, int i3, int i5, int i7, int i8, int i9) {
        if (i2 < i7) {
            return false;
        }
        if (i2 > i7) {
            return true;
        }
        if (i3 < i8) {
            return false;
        }
        return i3 > i8 || i5 >= i9;
    }

    public static int qie(int i2, int i3) {
        return (int) ((((i2 / 255.0f) * i3) / 255.0f) * 255.0f);
    }

    public static int xMQ(float f3, float f4, float f5, float f6) {
        int i2 = f3 != 0.0f ? (int) (527 * f3) : 17;
        if (f4 != 0.0f) {
            i2 = (int) (i2 * 31 * f4);
        }
        if (f5 != 0.0f) {
            i2 = (int) (i2 * 31 * f5);
        }
        return f6 != 0.0f ? (int) (i2 * 31 * f6) : i2;
    }

    class Ml extends ThreadLocal {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }

        Ml() {
        }
    }

    public static boolean KN(Matrix matrix) {
        float[] fArr = (float[]) f75175O.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static float Uo(Matrix matrix) {
        float[] fArr = (float[]) f75175O.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f3 = J2;
        fArr[2] = f3;
        fArr[3] = f3;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean gh(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static Path nr(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
            return path;
        }
        float f3 = pointF.x + pointF3.x;
        float f4 = pointF.y + pointF3.y;
        float f5 = pointF2.x;
        float f6 = f5 + pointF4.x;
        float f7 = pointF2.y;
        path.cubicTo(f3, f4, f6, f7 + pointF4.y, f5, f7);
        return path;
    }

    public static void rl(Path path, s4 s4Var) {
        if (s4Var == null || s4Var.qie()) {
            return;
        }
        n(path, ((B.Ml) s4Var.mUb()).r() / 100.0f, ((B.Ml) s4Var.J2()).r() / 100.0f, ((B.Ml) s4Var.xMQ()).r() / 360.0f);
    }

    public static void t(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void ty(Canvas canvas, RectF rectF, Paint paint) {
        HI(canvas, rectF, paint, 31);
    }

    public static void HI(Canvas canvas, RectF rectF, Paint paint, int i2) {
        if (FQq.I28.KN()) {
            FQq.I28.rl("Utils#saveLayer");
        }
        canvas.saveLayer(rectF, paint);
        if (FQq.I28.KN()) {
            FQq.I28.t("Utils#saveLayer");
        }
    }

    public static float J2(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float O() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap az(Bitmap bitmap, int i2, int i3) {
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void n(Path path, float f3, float f4, float f5) {
        if (FQq.I28.KN()) {
            FQq.I28.rl("applyTrimPathIfNeeded");
        }
        PathMeasure pathMeasure = (PathMeasure) rl.get();
        Path path2 = (Path) f75177t.get();
        Path path3 = (Path) nr.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f3 == 1.0f && f4 == 0.0f) {
            if (FQq.I28.KN()) {
                FQq.I28.t("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (length >= 1.0f && Math.abs((f4 - f3) - 1.0f) >= 0.01d) {
            float f6 = f3 * length;
            float f7 = f4 * length;
            float f8 = f5 * length;
            float fMin = Math.min(f6, f7) + f8;
            float fMax = Math.max(f6, f7) + f8;
            if (fMin >= length && fMax >= length) {
                fMin = o.J2(fMin, length);
                fMax = o.J2(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = o.J2(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = o.J2(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                if (FQq.I28.KN()) {
                    FQq.I28.t("applyTrimPathIfNeeded");
                    return;
                }
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            if (FQq.I28.KN()) {
                FQq.I28.t("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (FQq.I28.KN()) {
            FQq.I28.t("applyTrimPathIfNeeded");
        }
    }
}
