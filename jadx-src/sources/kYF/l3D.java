package kYF;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l3D f69954n = new l3D();

    private final boolean t(boolean z2, Bitmap bitmap, Z.fuX fux, Z.CN3 cn3) {
        if (z2) {
            return true;
        }
        return Be4.Dsr.t(bitmap.getWidth(), bitmap.getHeight(), Z.n.rl(fux) ? bitmap.getWidth() : C.nY(fux.nr(), cn3), Z.n.rl(fux) ? bitmap.getHeight() : C.nY(fux.t(), cn3), cn3) == 1.0d;
    }

    public final Bitmap n(Drawable drawable, Bitmap.Config config, Z.fuX fux, Z.CN3 cn3, boolean z2) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (rl(bitmap, config) && t(z2, bitmap, fux, cn3)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iHI = C.HI(drawableMutate);
        if (iHI <= 0) {
            iHI = 512;
        }
        int iXMQ = C.xMQ(drawableMutate);
        int i2 = iXMQ > 0 ? iXMQ : 512;
        double dT = Be4.Dsr.t(iHI, i2, Z.n.rl(fux) ? iHI : C.nY(fux.nr(), cn3), Z.n.rl(fux) ? i2 : C.nY(fux.t(), cn3), cn3);
        int iRoundToInt = MathKt.roundToInt(((double) iHI) * dT);
        int iRoundToInt2 = MathKt.roundToInt(dT * ((double) i2));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRoundToInt, iRoundToInt2, j.O(config));
        Rect bounds = drawableMutate.getBounds();
        int i3 = bounds.left;
        int i5 = bounds.top;
        int i7 = bounds.right;
        int i8 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iRoundToInt, iRoundToInt2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i3, i5, i7, i8);
        return bitmapCreateBitmap;
    }

    private l3D() {
    }

    private final boolean rl(Bitmap bitmap, Bitmap.Config config) {
        if (bitmap.getConfig() == j.O(config)) {
            return true;
        }
        return false;
    }
}
