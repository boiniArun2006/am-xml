package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0018\u0010\u0013\u001a\u00020\u0003*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Rect;", "cursorRect", "", "rtl", "", "textLayoutSize", "nr", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/geometry/Rect;ZI)Landroidx/compose/ui/geometry/Rect;", "", "J2", "(F)F", "Landroidx/compose/ui/unit/Dp;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "F", "DefaultCursorThickness", "Landroidx/compose/ui/graphics/Brush;", "O", "(Landroidx/compose/ui/graphics/Brush;)Z", "isSpecified", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,623:1\n640#2:624\n113#3:625\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierKt\n*L\n580#1:624\n576#1:625\n*E\n"})
public final class TextFieldCoreModifierKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f20202n = Dp.KN(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(Brush brush) {
        return ((brush instanceof SolidColor) && ((SolidColor) brush).getValue() == 16) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect nr(Density density, Rect rect, boolean z2, int i2) {
        return Rect.KN(rect, z2 ? i2 - rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() : rect.getLeft(), 0.0f, (z2 ? i2 - rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() : rect.getLeft()) + density.How(f20202n), 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float J2(float f3) {
        double dFloor;
        if (!Float.isNaN(f3) && !Float.isInfinite(f3)) {
            if (f3 > 0.0f) {
                dFloor = Math.ceil(f3);
            } else {
                dFloor = Math.floor(f3);
            }
            return (float) dFloor;
        }
        return f3;
    }
}
