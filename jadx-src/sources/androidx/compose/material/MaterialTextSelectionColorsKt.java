package androidx.compose.material;

import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/Colors;", "colors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "O", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "Landroidx/compose/ui/graphics/Color;", "selectionColor", "textColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "nr", "(JJJ)J", "", c.f62177j, "(JJJ)F", "selectionColorAlpha", "t", "(JFJJ)F", "foreground", "background", "rl", "(JJ)F", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMaterialTextSelectionColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,244:1\n708#2:245\n696#2:246\n75#3:247\n1247#4,6:248\n*S KotlinDebug\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n*L\n45#1:245\n45#1:246\n45#1:247\n47#1:248,6\n*E\n"})
public final class MaterialTextSelectionColorsKt {
    private static final float n(long j2, long j3, long j4) {
        int i2 = 0;
        float f3 = 0.2f;
        float f4 = 0.4f;
        float f5 = 0.4f;
        while (i2 < 7) {
            long j5 = j2;
            long j6 = j3;
            long j7 = j4;
            float fT = (t(j5, f4, j6, j7) / 4.5f) - 1.0f;
            if (0.0f <= fT && fT <= 0.01f) {
                return f4;
            }
            if (fT < 0.0f) {
                f5 = f4;
            } else {
                f3 = f4;
            }
            f4 = (f5 + f3) / 2.0f;
            i2++;
            j2 = j5;
            j3 = j6;
            j4 = j7;
        }
        return f4;
    }

    public static final SelectionColors O(Colors colors, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-721696685, i2, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long jMUb = colors.mUb();
        long jT2 = colors.t();
        composer.eF(1102762852);
        long jN = ColorsKt.n(colors, jT2);
        if (jN == 16) {
            jN = ((Color) composer.ty(ContentColorKt.n())).getValue();
        }
        long j2 = jN;
        composer.Xw();
        long jAz = Color.az(j2, ContentAlpha.f21745n.nr(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        boolean zNr = composer.nr(jMUb) | composer.nr(jT2) | composer.nr(jAz);
        Object objIF = composer.iF();
        if (zNr || objIF == Composer.INSTANCE.n()) {
            SelectionColors selectionColors = new SelectionColors(colors.mUb(), nr(jMUb, jAz, jT2), null);
            composer.o(selectionColors);
            objIF = selectionColors;
        }
        SelectionColors selectionColors2 = (SelectionColors) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return selectionColors2;
    }

    private static final float t(long j2, float f3, long j3, long j4) {
        long jUo = ColorKt.Uo(Color.az(j2, f3, 0.0f, 0.0f, 0.0f, 14, null), j4);
        return rl(ColorKt.Uo(j3, jUo), jUo);
    }

    public static final long nr(long j2, long j3, long j4) {
        float fN;
        float fT = t(j2, 0.4f, j3, j4);
        float fT2 = t(j2, 0.2f, j3, j4);
        if (fT >= 4.5f) {
            fN = 0.4f;
        } else if (fT2 < 4.5f) {
            fN = 0.2f;
        } else {
            fN = n(j2, j3, j4);
        }
        return Color.az(j2, fN, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final float rl(long j2, long j3) {
        float fXMQ = ColorKt.xMQ(j2) + 0.05f;
        float fXMQ2 = ColorKt.xMQ(j3) + 0.05f;
        return Math.max(fXMQ, fXMQ2) / Math.min(fXMQ, fXMQ2);
    }
}
