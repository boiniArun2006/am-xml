package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RequiresApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "<init>", "()V", "", "width", "height", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "bitmapConfig", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroid/graphics/Bitmap;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Api26Bitmap {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Api26Bitmap f31411n = new Api26Bitmap();

    private Api26Bitmap() {
    }

    public static final Bitmap n(int width, int height, int bitmapConfig, boolean hasAlpha, ColorSpace colorSpace) {
        return Bitmap.createBitmap((DisplayMetrics) null, width, height, AndroidImageBitmap_androidKt.nr(bitmapConfig), hasAlpha, AndroidColorSpace_androidKt.n(colorSpace));
    }
}
