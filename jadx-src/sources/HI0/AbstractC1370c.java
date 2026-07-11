package HI0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import d.AbstractC1951j;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: HI0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractC1370c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Paint f3852n = new Paint(2);

    public static final Bitmap J2(final Bitmap bitmap, final int i2, final int i3) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3 && !bitmap.isMutable()) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Pair pairT = AbstractC1951j.t(bitmap.getWidth(), bitmap.getHeight(), i2, i3);
        final int iIntValue = ((Number) pairT.component1()).intValue();
        final int iIntValue2 = ((Number) pairT.component2()).intValue();
        final float f3 = i2 / 2.0f;
        final float f4 = i3 / 2.0f;
        float f5 = iIntValue / 2.0f;
        float f6 = iIntValue2 / 2.0f;
        final RectF rectF = new RectF(f3 - f5, f4 - f6, f5 + f3, f6 + f4);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, f3852n);
        XoT.C.Uo(bitmap, new Function0() { // from class: HI0.QJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC1370c.Uo(i2, i3, f3, f4, iIntValue, iIntValue2, bitmap, rectF);
            }
        });
        return bitmapCreateBitmap;
    }

    public static final Bitmap nr(final Bitmap bitmap, final int i2, final int i3) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3 && !bitmap.isMutable()) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Pair pairUo = AbstractC1951j.Uo(bitmap.getWidth(), bitmap.getHeight(), i2, i3);
        final int iIntValue = ((Number) pairUo.component1()).intValue();
        final int iIntValue2 = ((Number) pairUo.component2()).intValue();
        final float f3 = i2 / 2.0f;
        final float f4 = i3 / 2.0f;
        float f5 = iIntValue / 2.0f;
        float f6 = iIntValue2 / 2.0f;
        final RectF rectF = new RectF(f3 - f5, f4 - f6, f5 + f3, f6 + f4);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, f3852n);
        XoT.C.Uo(bitmap, new Function0() { // from class: HI0.l3D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC1370c.O(i2, i3, f3, f4, iIntValue, iIntValue2, bitmap, rectF);
            }
        });
        return bitmapCreateBitmap;
    }

    public static final Bitmap t(Bitmap bitmap, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3 && !bitmap.isMutable()) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, new Rect(0, 0, i2, i3), f3852n);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(int i2, int i3, float f3, float f4, int i5, int i7, Bitmap bitmap, RectF rectF) {
        return "BitmapUtil resizeIn(" + i2 + "," + i3 + ") -> cx=" + f3 + " cy=" + f4 + " w=" + i5 + " h=" + i7 + " width=" + bitmap.getWidth() + " height=" + bitmap.getHeight() + " drawRect=" + rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Uo(int i2, int i3, float f3, float f4, int i5, int i7, Bitmap bitmap, RectF rectF) {
        return "BitmapUtil resizeIn(" + i2 + "," + i3 + ") -> cx=" + f3 + " cy=" + f4 + " w=" + i5 + " h=" + i7 + " width=" + bitmap.getWidth() + " height=" + bitmap.getHeight() + " drawRect=" + rectF;
    }
}
