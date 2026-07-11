package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a:\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0007*\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroid/graphics/Bitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "t", "(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/ImageBitmap;", "", "width", "height", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "config", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "rl", "(Landroidx/compose/ui/graphics/ImageBitmap;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "nr", "(I)Landroid/graphics/Bitmap$Config;", "O", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidImageBitmap_androidKt {
    public static final int O(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.INSTANCE.n();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.INSTANCE.O();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.INSTANCE.rl();
        }
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || config != Bitmap.Config.RGBA_F16) ? (i2 < 26 || config != Bitmap.Config.HARDWARE) ? ImageBitmapConfig.INSTANCE.rl() : ImageBitmapConfig.INSTANCE.nr() : ImageBitmapConfig.INSTANCE.t();
    }

    public static final Bitmap.Config nr(int i2) {
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.INSTANCE;
        if (ImageBitmapConfig.xMQ(i2, companion.rl())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.xMQ(i2, companion.n())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.xMQ(i2, companion.O())) {
            return Bitmap.Config.RGB_565;
        }
        int i3 = Build.VERSION.SDK_INT;
        return (i3 < 26 || !ImageBitmapConfig.xMQ(i2, companion.t())) ? (i3 < 26 || !ImageBitmapConfig.xMQ(i2, companion.nr())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final Bitmap rl(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final ImageBitmap t(Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    public static final ImageBitmap n(int i2, int i3, int i5, boolean z2, ColorSpace colorSpace) {
        Bitmap bitmapCreateBitmap;
        Bitmap.Config configNr = nr(i5);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Api26Bitmap.n(i2, i3, i5, z2, colorSpace);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configNr);
            bitmapCreateBitmap.setHasAlpha(z2);
        }
        return new AndroidImageBitmap(bitmapCreateBitmap);
    }
}
