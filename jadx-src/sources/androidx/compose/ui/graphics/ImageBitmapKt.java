package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"", "width", "height", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "config", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/ImageBitmap;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ImageBitmapKt {
    public static /* synthetic */ ImageBitmap rl(int i2, int i3, int i5, boolean z2, ColorSpace colorSpace, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i5 = ImageBitmapConfig.INSTANCE.rl();
        }
        if ((i7 & 8) != 0) {
            z2 = true;
        }
        if ((i7 & 16) != 0) {
            colorSpace = ColorSpaces.f31604n.X();
        }
        return n(i2, i3, i5, z2, colorSpace);
    }

    public static final ImageBitmap n(int i2, int i3, int i5, boolean z2, ColorSpace colorSpace) {
        return AndroidImageBitmap_androidKt.n(i2, i3, i5, z2, colorSpace);
    }
}
