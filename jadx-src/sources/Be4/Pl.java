package Be4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import okio.BufferedSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pl f533n = new Pl();
    private static final Paint rl = new Paint(3);

    private Pl() {
    }

    public final C n(String str, BufferedSource bufferedSource, qz qzVar) {
        if (Xo.t(qzVar, str)) {
            ExifInterface exifInterface = new ExifInterface(new o(bufferedSource.peek().inputStream()));
            return new C(exifInterface.WPU(), exifInterface.ck());
        }
        return C.nr;
    }

    public final Bitmap rl(Bitmap bitmap, C c2) {
        Bitmap bitmapCreateBitmap;
        if (!c2.rl() && !Xo.n(c2)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (c2.rl()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (Xo.n(c2)) {
            matrix.postRotate(c2.n(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f3 = rectF.left;
        if (f3 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f3, -rectF.top);
        }
        if (Xo.rl(c2)) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), kYF.j.t(bitmap));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), kYF.j.t(bitmap));
        }
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, rl);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}
