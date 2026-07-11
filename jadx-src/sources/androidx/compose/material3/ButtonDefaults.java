package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0006J:\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\rJD\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJD\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001bJD\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u0019\u0010!\u001a\u00020 2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010#R\u001a\u0010%\u001a\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0017\u0010*\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0017\u0010-\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b,\u0010)R\u001a\u0010.\u001a\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0017\u00100\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b/\u0010)R\u001a\u00102\u001a\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010#R\u0017\u00105\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b4\u0010)R\u001d\u00109\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u00108R\u001d\u0010<\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010#\u001a\u0004\b;\u00108R\u001d\u0010?\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b=\u0010#\u001a\u0004\b>\u00108R\u001d\u0010B\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010#\u001a\u0004\bA\u00108R\u0011\u0010F\u001a\u00020C8G¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010G\u001a\u00020C8G¢\u0006\u0006\u001a\u0004\b@\u0010ER\u0011\u0010I\u001a\u00020C8G¢\u0006\u0006\u001a\u0004\bH\u0010ER\u0011\u0010K\u001a\u00020C8G¢\u0006\u0006\u001a\u0004\bJ\u0010ER\u0011\u0010M\u001a\u00020C8G¢\u0006\u0006\u001a\u0004\bL\u0010ER\u0018\u0010P\u001a\u00020\u0004*\u00020N8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010OR\u0018\u0010Q\u001a\u00020\u0004*\u00020N8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010OR\u0018\u0010R\u001a\u00020\u0004*\u00020N8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u0010OR\u0018\u0010S\u001a\u00020\u0004*\u00020N8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010OR\u0018\u0010T\u001a\u00020\u0004*\u00020N8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/ButtonColors;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "rl", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;", "nr", "J2", "aYN", "ViF", "nY", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "Landroidx/compose/material3/ButtonElevation;", "t", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "O", "Uo", "", "enabled", "Landroidx/compose/foundation/BorderStroke;", "WPU", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "F", "ButtonHorizontalPadding", "ButtonVerticalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "KN", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "ButtonWithIconHorizontalStartPadding", "getButtonWithIconContentPadding", "ButtonWithIconContentPadding", "TextButtonHorizontalPadding", "XQ", "TextButtonContentPadding", "xMQ", "TextButtonWithIconHorizontalEndPadding", "mUb", "getTextButtonWithIconContentPadding", "TextButtonWithIconContentPadding", "gh", "r", "()F", "MinWidth", "qie", "Ik", "MinHeight", "az", "getIconSize-D9Ej5fM", "IconSize", "ty", "ck", "IconSpacing", "Landroidx/compose/ui/graphics/Shape;", "Z", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "elevatedShape", "HI", "filledTonalShape", "o", "outlinedShape", "S", "textShape", "Landroidx/compose/material3/ColorScheme;", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ButtonColors;", "defaultButtonColors", "defaultElevatedButtonColors", "defaultFilledTonalButtonColors", "defaultOutlinedButtonColors", "defaultTextButtonColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1108:1\n1#2:1109\n148#3:1110\n148#3:1111\n148#3:1112\n148#3:1113\n148#3:1114\n148#3:1115\n148#3:1116\n148#3:1117\n148#3:1118\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n*L\n858#1:1110\n465#1:1111\n466#1:1112\n484#1:1113\n495#1:1114\n510#1:1115\n525#1:1116\n531#1:1117\n539#1:1118\n*E\n"})
public final class ButtonDefaults {
    public static final int HI = 0;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final PaddingValues ButtonWithIconContentPadding;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final PaddingValues TextButtonContentPadding;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonWithIconHorizontalStartPadding;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final float TextButtonHorizontalPadding;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final float MinWidth;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final PaddingValues TextButtonWithIconContentPadding;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ButtonDefaults f24588n = new ButtonDefaults();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final PaddingValues ContentPadding;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final float MinHeight;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float ButtonHorizontalPadding;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonVerticalPadding;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private static final float IconSpacing;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final float TextButtonWithIconHorizontalEndPadding;

    public final BorderStroke WPU(boolean z2, Composer composer, int i2, int i3) {
        long jAz;
        if ((i3 & 1) != 0) {
            z2 = true;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-626854767, i2, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:889)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.f29756n;
        float fO = outlinedButtonTokens.O();
        if (z2) {
            composer.eF(-855870548);
            jAz = ColorSchemeKt.xMQ(outlinedButtonTokens.nr(), composer, 6);
            composer.Xw();
        } else {
            composer.eF(-855783004);
            jAz = Color.az(ColorSchemeKt.xMQ(outlinedButtonTokens.nr(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.Xw();
        }
        BorderStroke borderStrokeN = BorderStrokeKt.n(fO, jAz);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return borderStrokeN;
    }

    static {
        float fKN = Dp.KN(24);
        ButtonHorizontalPadding = fKN;
        float f3 = 8;
        float fKN2 = Dp.KN(f3);
        ButtonVerticalPadding = fKN2;
        PaddingValues paddingValuesNr = PaddingKt.nr(fKN, fKN2, fKN, fKN2);
        ContentPadding = paddingValuesNr;
        float f4 = 16;
        float fKN3 = Dp.KN(f4);
        ButtonWithIconHorizontalStartPadding = fKN3;
        ButtonWithIconContentPadding = PaddingKt.nr(fKN3, fKN2, fKN, fKN2);
        float fKN4 = Dp.KN(12);
        TextButtonHorizontalPadding = fKN4;
        TextButtonContentPadding = PaddingKt.nr(fKN4, paddingValuesNr.getTop(), fKN4, paddingValuesNr.getBottom());
        float fKN5 = Dp.KN(f4);
        TextButtonWithIconHorizontalEndPadding = fKN5;
        TextButtonWithIconContentPadding = PaddingKt.nr(fKN4, paddingValuesNr.getTop(), fKN5, paddingValuesNr.getBottom());
        MinWidth = Dp.KN(58);
        MinHeight = Dp.KN(40);
        IconSize = FilledButtonTokens.f29566n.xMQ();
        IconSpacing = Dp.KN(f3);
    }

    public final float Ik() {
        return MinHeight;
    }

    public final PaddingValues KN() {
        return ContentPadding;
    }

    public final ButtonElevation O(float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = ElevatedButtonTokens.f29503n.rl();
        }
        if ((i3 & 2) != 0) {
            f4 = ElevatedButtonTokens.f29503n.qie();
        }
        if ((i3 & 4) != 0) {
            f5 = ElevatedButtonTokens.f29503n.xMQ();
        }
        if ((i3 & 8) != 0) {
            f6 = ElevatedButtonTokens.f29503n.mUb();
        }
        float f8 = f6;
        if ((i3 & 16) != 0) {
            f7 = ElevatedButtonTokens.f29503n.O();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1065482445, i2, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:829)");
        }
        float f9 = f7;
        float f10 = f5;
        ButtonElevation buttonElevation = new ButtonElevation(f3, f4, f10, f8, f9, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return buttonElevation;
    }

    public final ButtonElevation Uo(float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = FilledTonalButtonTokens.f29610n.rl();
        }
        if ((i3 & 2) != 0) {
            f4 = FilledTonalButtonTokens.f29610n.xMQ();
        }
        if ((i3 & 4) != 0) {
            f5 = FilledTonalButtonTokens.f29610n.J2();
        }
        if ((i3 & 8) != 0) {
            f6 = FilledTonalButtonTokens.f29610n.Uo();
        }
        float f8 = f6;
        if ((i3 & 16) != 0) {
            f7 = Dp.KN(0);
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(5982871, i2, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:859)");
        }
        float f9 = f7;
        ButtonElevation buttonElevation = new ButtonElevation(f3, f4, f5, f8, f9, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return buttonElevation;
    }

    public final PaddingValues XQ() {
        return TextButtonContentPadding;
    }

    public final ButtonColors az(ColorScheme colorScheme) {
        ButtonColors defaultTextButtonColorsCached = colorScheme.getDefaultTextButtonColorsCached();
        if (defaultTextButtonColorsCached != null) {
            return defaultTextButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jJ2 = companion.J2();
        TextButtonTokens textButtonTokens = TextButtonTokens.f29939n;
        ButtonColors buttonColors = new ButtonColors(jJ2, ColorSchemeKt.Uo(colorScheme, textButtonTokens.t()), companion.J2(), Color.az(ColorSchemeKt.Uo(colorScheme, textButtonTokens.rl()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.JVN(buttonColors);
        return buttonColors;
    }

    public final float ck() {
        return IconSpacing;
    }

    public final ButtonColors gh(ColorScheme colorScheme) {
        ButtonColors defaultFilledTonalButtonColorsCached = colorScheme.getDefaultFilledTonalButtonColorsCached();
        if (defaultFilledTonalButtonColorsCached != null) {
            return defaultFilledTonalButtonColorsCached;
        }
        FilledTonalButtonTokens filledTonalButtonTokens = FilledTonalButtonTokens.f29610n;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.Uo(colorScheme, filledTonalButtonTokens.n()), ColorSchemeKt.Uo(colorScheme, filledTonalButtonTokens.KN()), Color.az(ColorSchemeKt.Uo(colorScheme, filledTonalButtonTokens.nr()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, filledTonalButtonTokens.O()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.tUK(buttonColors);
        return buttonColors;
    }

    public final ButtonColors mUb(ColorScheme colorScheme) {
        ButtonColors defaultElevatedButtonColorsCached = colorScheme.getDefaultElevatedButtonColorsCached();
        if (defaultElevatedButtonColorsCached != null) {
            return defaultElevatedButtonColorsCached;
        }
        ElevatedButtonTokens elevatedButtonTokens = ElevatedButtonTokens.f29503n;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.Uo(colorScheme, elevatedButtonTokens.n()), ColorSchemeKt.Uo(colorScheme, elevatedButtonTokens.gh()), Color.az(ColorSchemeKt.Uo(colorScheme, elevatedButtonTokens.nr()), elevatedButtonTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, elevatedButtonTokens.Uo()), elevatedButtonTokens.KN(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.Po6(buttonColors);
        return buttonColors;
    }

    public final ButtonColors nY(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.INSTANCE.Uo();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.INSTANCE.Uo();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.INSTANCE.Uo();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.INSTANCE.Uo();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1402274782, i2, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:762)");
        }
        long j6 = j2;
        ButtonColors buttonColorsT = az(MaterialTheme.f26164n.n(composer, 6)).t(j6, j3, j4, j5);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return buttonColorsT;
    }

    public final ButtonColors qie(ColorScheme colorScheme) {
        ButtonColors defaultOutlinedButtonColorsCached = colorScheme.getDefaultOutlinedButtonColorsCached();
        if (defaultOutlinedButtonColorsCached != null) {
            return defaultOutlinedButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jJ2 = companion.J2();
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.f29756n;
        ButtonColors buttonColors = new ButtonColors(jJ2, ColorSchemeKt.Uo(colorScheme, outlinedButtonTokens.t()), companion.J2(), Color.az(ColorSchemeKt.Uo(colorScheme, outlinedButtonTokens.rl()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.T3L(buttonColors);
        return buttonColors;
    }

    public final float r() {
        return MinWidth;
    }

    public final ButtonColors rl(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.INSTANCE.Uo();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.INSTANCE.Uo();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.INSTANCE.Uo();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.INSTANCE.Uo();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-339300779, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:582)");
        }
        long j6 = j2;
        ButtonColors buttonColorsT = xMQ(MaterialTheme.f26164n.n(composer, 6)).t(j6, j3, j4, j5);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return buttonColorsT;
    }

    public final ButtonElevation t(float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = FilledButtonTokens.f29566n.rl();
        }
        if ((i3 & 2) != 0) {
            f4 = FilledButtonTokens.f29566n.gh();
        }
        if ((i3 & 4) != 0) {
            f5 = FilledButtonTokens.f29566n.Uo();
        }
        if ((i3 & 8) != 0) {
            f6 = FilledButtonTokens.f29566n.KN();
        }
        float f8 = f6;
        if ((i3 & 16) != 0) {
            f7 = FilledButtonTokens.f29566n.O();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1827791191, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:802)");
        }
        float f9 = f7;
        float f10 = f5;
        ButtonElevation buttonElevation = new ButtonElevation(f3, f4, f10, f8, f9, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return buttonElevation;
    }

    public final ButtonColors xMQ(ColorScheme colorScheme) {
        ButtonColors defaultButtonColorsCached = colorScheme.getDefaultButtonColorsCached();
        if (defaultButtonColorsCached != null) {
            return defaultButtonColorsCached;
        }
        FilledButtonTokens filledButtonTokens = FilledButtonTokens.f29566n;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.Uo(colorScheme, filledButtonTokens.n()), ColorSchemeKt.Uo(colorScheme, filledButtonTokens.mUb()), Color.az(ColorSchemeKt.Uo(colorScheme, filledButtonTokens.nr()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, filledButtonTokens.J2()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.Rl(buttonColors);
        return buttonColors;
    }

    private ButtonDefaults() {
    }

    public final Shape HI(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-886584987, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:550)");
        }
        Shape shapeO = ShapesKt.O(FilledTonalButtonTokens.f29610n.t(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final ButtonColors J2(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(824987837, i2, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:655)");
        }
        ButtonColors buttonColorsGh = gh(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return buttonColorsGh;
    }

    public final Shape S(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-349121587, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:558)");
        }
        Shape shapeO = ShapesKt.O(TextButtonTokens.f29939n.n(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final ButtonColors ViF(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1880341584, i2, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:744)");
        }
        ButtonColors buttonColorsAz = az(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return buttonColorsAz;
    }

    public final Shape Z(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1234923021, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:542)");
        }
        Shape shapeO = ShapesKt.O(FilledButtonTokens.f29566n.t(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final ButtonColors aYN(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1344886725, i2, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:701)");
        }
        ButtonColors buttonColorsQie = qie(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return buttonColorsQie;
    }

    public final ButtonColors n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1449248637, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:564)");
        }
        ButtonColors buttonColorsXMQ = xMQ(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return buttonColorsXMQ;
    }

    public final ButtonColors nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(2025043443, i2, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:609)");
        }
        ButtonColors buttonColorsMUb = mUb(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return buttonColorsMUb;
    }

    public final Shape o(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-2045213065, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:554)");
        }
        Shape shapeO = ShapesKt.O(OutlinedButtonTokens.f29756n.n(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final Shape ty(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(2143958791, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:546)");
        }
        Shape shapeO = ShapesKt.O(ElevatedButtonTokens.f29503n.t(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }
}
