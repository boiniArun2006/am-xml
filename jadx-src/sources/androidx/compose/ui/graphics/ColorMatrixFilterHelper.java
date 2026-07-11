package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrixFilterHelper;", "", "<init>", "()V", "Landroid/graphics/ColorMatrixColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/ColorMatrix;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/graphics/ColorMatrixColorFilter;)[F", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ColorMatrixFilterHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ColorMatrixFilterHelper f31442n = new ColorMatrixFilterHelper();

    public final float[] n(android.graphics.ColorMatrixColorFilter colorFilter) {
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorFilter.getColorMatrix(colorMatrix);
        return ColorMatrix.n(colorMatrix.getArray());
    }

    private ColorMatrixFilterHelper() {
    }
}
