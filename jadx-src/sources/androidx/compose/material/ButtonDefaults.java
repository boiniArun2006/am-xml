package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u001d\u0010\"\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010!R\u001d\u0010$\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b\u001c\u0010!R\u001d\u0010&\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b%\u0010!R\u001d\u0010)\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010!R\u001d\u0010,\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010!R\u001a\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u0017\u00100\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b#\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "Landroidx/compose/material/ButtonElevation;", "rl", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "disabledBackgroundColor", "disabledContentColor", "Landroidx/compose/material/ButtonColors;", c.f62177j, "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "Uo", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "F", "ButtonHorizontalPadding", "t", "ButtonVerticalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "nr", "Landroidx/compose/foundation/layout/PaddingValues;", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "O", "()F", "MinWidth", "J2", "MinHeight", "getIconSize-D9Ej5fM", "IconSize", "KN", "getIconSpacing-D9Ej5fM", "IconSpacing", "xMQ", "getOutlinedBorderSize-D9Ej5fM", "OutlinedBorderSize", "mUb", "TextButtonHorizontalPadding", "gh", "TextButtonContentPadding", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,616:1\n149#2:617\n149#2:618\n149#2:619\n149#2:620\n149#2:621\n149#2:622\n149#2:623\n149#2:624\n149#2:625\n149#2:626\n149#2:633\n149#2:634\n149#2:635\n149#2:636\n149#2:637\n149#2:638\n149#2:639\n149#2:640\n1247#3,6:627\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n*L\n347#1:617\n348#1:618\n349#1:619\n355#1:620\n356#1:621\n373#1:622\n374#1:623\n375#1:624\n376#1:625\n377#1:626\n297#1:633\n298#1:634\n313#1:635\n319#1:636\n326#1:637\n333#1:638\n471#1:639\n482#1:640\n379#1:627,6\n*E\n"})
public final class ButtonDefaults {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final float MinHeight;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final float IconSpacing;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final PaddingValues TextButtonContentPadding;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final float TextButtonHorizontalPadding;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ButtonDefaults f21598n = new ButtonDefaults();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final PaddingValues ContentPadding;
    public static final int qie = 0;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float ButtonHorizontalPadding;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonVerticalPadding;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final float OutlinedBorderSize;

    static {
        float fKN = Dp.KN(16);
        ButtonHorizontalPadding = fKN;
        float f3 = 8;
        float fKN2 = Dp.KN(f3);
        ButtonVerticalPadding = fKN2;
        PaddingValues paddingValuesNr = PaddingKt.nr(fKN, fKN2, fKN, fKN2);
        ContentPadding = paddingValuesNr;
        MinWidth = Dp.KN(64);
        MinHeight = Dp.KN(36);
        IconSize = Dp.KN(18);
        IconSpacing = Dp.KN(f3);
        OutlinedBorderSize = Dp.KN(1);
        float fKN3 = Dp.KN(f3);
        TextButtonHorizontalPadding = fKN3;
        TextButtonContentPadding = PaddingKt.nr(fKN3, paddingValuesNr.getTop(), fKN3, paddingValuesNr.getBottom());
    }

    public final PaddingValues J2() {
        return TextButtonContentPadding;
    }

    public final float O() {
        return MinWidth;
    }

    public final ButtonColors Uo(long j2, long j3, long j4, Composer composer, int i2, int i3) {
        long jJ2 = (i3 & 1) != 0 ? Color.INSTANCE.J2() : j2;
        long jMUb = (i3 & 2) != 0 ? MaterialTheme.f22169n.n(composer, 6).mUb() : j3;
        long jAz = (i3 & 4) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.v()) {
            ComposerKt.p5(182742216, i2, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:459)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jJ2, jMUb, jJ2, jAz, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultButtonColors;
    }

    public final ButtonColors n(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jUo;
        long jMUb = (i3 & 1) != 0 ? MaterialTheme.f22169n.n(composer, 6).mUb() : j2;
        long jRl = (i3 & 2) != 0 ? ColorsKt.rl(jMUb, composer, i2 & 14) : j3;
        if ((i3 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.f22169n;
            jUo = ColorKt.Uo(Color.az(materialTheme.n(composer, 6).xMQ(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.n(composer, 6).ty());
        } else {
            jUo = j4;
        }
        long jAz = (i3 & 8) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.v()) {
            ComposerKt.p5(1870371134, i2, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:415)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jMUb, jRl, jUo, jAz, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultButtonColors;
    }

    public final float nr() {
        return MinHeight;
    }

    public final ButtonElevation rl(float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = Dp.KN(2);
        }
        float f8 = f3;
        if ((i3 & 2) != 0) {
            f4 = Dp.KN(8);
        }
        float f9 = f4;
        if ((i3 & 4) != 0) {
            f5 = Dp.KN(0);
        }
        float f10 = f5;
        if ((i3 & 8) != 0) {
            f6 = Dp.KN(4);
        }
        float f11 = f6;
        if ((i3 & 16) != 0) {
            f7 = Dp.KN(4);
        }
        float f12 = f7;
        if (ComposerKt.v()) {
            ComposerKt.p5(-737170518, i2, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:377)");
        }
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.rl(f8)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.rl(f9)) || (i2 & 48) == 32) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.rl(f10)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.rl(f11)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) > 16384 && composer.rl(f12)) || (i2 & 24576) == 16384);
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            DefaultButtonElevation defaultButtonElevation = new DefaultButtonElevation(f8, f9, f10, f11, f12, null);
            composer.o(defaultButtonElevation);
            objIF = defaultButtonElevation;
        }
        DefaultButtonElevation defaultButtonElevation2 = (DefaultButtonElevation) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultButtonElevation2;
    }

    public final PaddingValues t() {
        return ContentPadding;
    }

    private ButtonDefaults() {
    }
}
