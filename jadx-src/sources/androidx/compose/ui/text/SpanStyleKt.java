package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u000e\u001a-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aÀ\u0001\u00104\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010,\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/2\b\u00101\u001a\u0004\u0018\u00010\u000f2\b\u00103\u001a\u0004\u0018\u000102H\u0000ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u001f\u00107\u001a\u0004\u0018\u00010\u000f*\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b7\u00108\"\u0014\u0010;\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:\"\u0014\u0010<\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010:\"\u0014\u0010=\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010:\"\u0014\u0010>\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:\"\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "", "t", "J2", "(JJF)J", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "fraction", "nr", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "Landroidx/compose/ui/text/SpanStyle;", TtmlNode.START, "stop", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;F)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/PlatformSpanStyle;", "O", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformSpanStyle;F)Landroidx/compose/ui/text/PlatformSpanStyle;", "style", "KN", "(Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontFamily;", TtmlNode.ATTR_TTS_FONT_FAMILY, "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "background", "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "platformStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "rl", "(Landroidx/compose/ui/text/SpanStyle;JLandroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", InneractiveMediationNameConsts.OTHER, "Uo", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/PlatformSpanStyle;)Landroidx/compose/ui/text/PlatformSpanStyle;", c.f62177j, "J", "DefaultFontSize", "DefaultLetterSpacing", "DefaultBackgroundColor", "DefaultColor", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "DefaultColorForegroundStyle", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,901:1\n247#2:902\n247#2:903\n247#2:904\n242#2,6:907\n242#2,6:914\n247#2:921\n247#2:922\n646#3:905\n635#3:906\n635#3:913\n635#3:920\n646#3:923\n635#3:924\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n713#1:902\n786#1:903\n793#1:904\n837#1:907,6\n843#1:914,6\n874#1:921\n880#1:922\n801#1:905\n801#1:906\n838#1:913\n854#1:920\n888#1:923\n888#1:924\n*E\n"})
public final class SpanStyleKt {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final TextForegroundStyle f33489O;
    private static final long nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f33491t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f33490n = TextUnitKt.KN(14);
    private static final long rl = TextUnitKt.KN(0);

    public static final Object nr(Object obj, Object obj2, float f3) {
        return ((double) f3) < 0.5d ? obj : obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[PHI: r11
      0x003a: PHI (r11v7 long) = 
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v8 long)
     binds: [B:41:0x00ab, B:53:0x00dd, B:50:0x00d1, B:47:0x00c5, B:44:0x00b9, B:39:0x009d, B:34:0x008e, B:28:0x0076, B:25:0x006e, B:22:0x0062, B:19:0x0056, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SpanStyle rl(SpanStyle spanStyle, long j2, Brush brush, float f3, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        long fontSize;
        TextGeometricTransform textGeometricTransform2;
        long background;
        DrawStyle drawStyle2;
        String fontFeatureSettings = str;
        BaselineShift baselineShift2 = baselineShift;
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow2 = shadow;
        if (!(TextUnit.J2(j3) == 0)) {
            fontSize = j3;
            if (!TextUnit.O(fontSize, spanStyle.getFontSize())) {
                textGeometricTransform2 = textGeometricTransform;
                background = j5;
                drawStyle2 = drawStyle;
            }
            TextForegroundStyle textForegroundStyleNr = spanStyle.getTextForegroundStyle().nr(brush == null ? TextForegroundStyle.INSTANCE.n(brush, f3) : TextForegroundStyle.INSTANCE.rl(j2));
            FontFamily fontFamily2 = fontFamily != null ? spanStyle.getFontFamily() : fontFamily;
            if (TextUnit.J2(fontSize) == 0) {
                fontSize = spanStyle.getFontSize();
            }
            FontWeight fontWeight2 = fontWeight != null ? spanStyle.getFontWeight() : fontWeight;
            FontStyle fontStyle2 = fontStyle != null ? spanStyle.getFontStyle() : fontStyle;
            FontSynthesis fontSynthesis2 = fontSynthesis != null ? spanStyle.getFontSynthesis() : fontSynthesis;
            if (fontFeatureSettings == null) {
                fontFeatureSettings = spanStyle.getFontFeatureSettings();
            }
            long letterSpacing = TextUnit.J2(j4) != 0 ? spanStyle.getLetterSpacing() : j4;
            if (baselineShift2 == null) {
                baselineShift2 = spanStyle.getBaselineShift();
            }
            if (textGeometricTransform2 == null) {
                textGeometricTransform2 = spanStyle.getTextGeometricTransform();
            }
            LocaleList localeList2 = localeList != null ? spanStyle.getLocaleList() : localeList;
            if (background == 16) {
                background = spanStyle.getBackground();
            }
            if (textDecoration2 == null) {
                textDecoration2 = spanStyle.getTextDecoration();
            }
            if (shadow2 == null) {
                shadow2 = spanStyle.getShadow();
            }
            return new SpanStyle(textForegroundStyleNr, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration2, shadow2, Uo(spanStyle, platformSpanStyle), drawStyle2 != null ? spanStyle.getDrawStyle() : drawStyle2, (DefaultConstructorMarker) null);
        }
        fontSize = j3;
        if ((brush != null || j2 == 16 || Color.HI(j2, spanStyle.getTextForegroundStyle().getValue())) && ((fontStyle == null || Intrinsics.areEqual(fontStyle, spanStyle.getFontStyle())) && ((fontWeight == null || Intrinsics.areEqual(fontWeight, spanStyle.getFontWeight())) && (fontFamily == null || fontFamily == spanStyle.getFontFamily())))) {
            if ((TextUnit.J2(j4) == 0) || TextUnit.O(j4, spanStyle.getLetterSpacing())) {
                if ((textDecoration2 == null || Intrinsics.areEqual(textDecoration2, spanStyle.getTextDecoration())) && Intrinsics.areEqual(brush, spanStyle.getTextForegroundStyle().O()) && ((brush == null || f3 == spanStyle.getTextForegroundStyle().n()) && ((fontSynthesis == null || Intrinsics.areEqual(fontSynthesis, spanStyle.getFontSynthesis())) && ((fontFeatureSettings == null || Intrinsics.areEqual(fontFeatureSettings, spanStyle.getFontFeatureSettings())) && (baselineShift2 == null || Intrinsics.areEqual(baselineShift2, spanStyle.getBaselineShift())))))) {
                    if (textGeometricTransform != null) {
                        textGeometricTransform2 = textGeometricTransform;
                        if (Intrinsics.areEqual(textGeometricTransform2, spanStyle.getTextGeometricTransform())) {
                        }
                    } else {
                        textGeometricTransform2 = textGeometricTransform;
                    }
                    if (localeList == null || Intrinsics.areEqual(localeList, spanStyle.getLocaleList())) {
                        if (j5 != 16) {
                            background = j5;
                            if (Color.HI(background, spanStyle.getBackground())) {
                            }
                        } else {
                            background = j5;
                        }
                        if ((shadow2 == null || Intrinsics.areEqual(shadow2, spanStyle.getShadow())) && (platformSpanStyle == null || Intrinsics.areEqual(platformSpanStyle, spanStyle.getPlatformStyle()))) {
                            drawStyle2 = drawStyle;
                            if (drawStyle2 == null || Intrinsics.areEqual(drawStyle2, spanStyle.getDrawStyle())) {
                                return spanStyle;
                            }
                        }
                    }
                    drawStyle2 = drawStyle;
                }
                background = j5;
                drawStyle2 = drawStyle;
            }
        }
        TextForegroundStyle textForegroundStyleNr2 = spanStyle.getTextForegroundStyle().nr(brush == null ? TextForegroundStyle.INSTANCE.n(brush, f3) : TextForegroundStyle.INSTANCE.rl(j2));
        if (fontFamily != null) {
        }
        if (TextUnit.J2(fontSize) == 0) {
        }
        if (fontWeight != null) {
        }
        if (fontStyle != null) {
        }
        if (fontSynthesis != null) {
        }
        if (fontFeatureSettings == null) {
        }
        if (TextUnit.J2(j4) != 0) {
        }
        if (baselineShift2 == null) {
        }
        if (textGeometricTransform2 == null) {
        }
        if (localeList != null) {
        }
        if (background == 16) {
        }
        if (textDecoration2 == null) {
        }
        if (shadow2 == null) {
        }
        return new SpanStyle(textForegroundStyleNr2, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration2, shadow2, Uo(spanStyle, platformSpanStyle), drawStyle2 != null ? spanStyle.getDrawStyle() : drawStyle2, (DefaultConstructorMarker) null);
    }

    static {
        Color.Companion companion = Color.INSTANCE;
        f33491t = companion.J2();
        long jN = companion.n();
        nr = jN;
        f33489O = TextForegroundStyle.INSTANCE.rl(jN);
    }

    private static final PlatformSpanStyle O(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f3) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.INSTANCE.n();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.INSTANCE.n();
        }
        return AndroidTextStyle_androidKt.t(platformSpanStyle, platformSpanStyle2, f3);
    }

    public static final SpanStyle t(SpanStyle spanStyle, SpanStyle spanStyle2, float f3) {
        TextForegroundStyle textForegroundStyleRl = TextDrawStyleKt.rl(spanStyle.getTextForegroundStyle(), spanStyle2.getTextForegroundStyle(), f3);
        FontFamily fontFamily = (FontFamily) nr(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f3);
        long jJ2 = J2(spanStyle.getFontSize(), spanStyle2.getFontSize(), f3);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.O();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.INSTANCE.O();
        }
        FontWeight fontWeightN = FontWeightKt.n(fontWeight, fontWeight2, f3);
        FontStyle fontStyle = (FontStyle) nr(spanStyle.getFontStyle(), spanStyle2.getFontStyle(), f3);
        FontSynthesis fontSynthesis = (FontSynthesis) nr(spanStyle.getFontSynthesis(), spanStyle2.getFontSynthesis(), f3);
        String str = (String) nr(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f3);
        long jJ22 = J2(spanStyle.getLetterSpacing(), spanStyle2.getLetterSpacing(), f3);
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        float multiplier = baselineShift != null ? baselineShift.getMultiplier() : BaselineShift.t(0.0f);
        BaselineShift baselineShift2 = spanStyle2.getBaselineShift();
        float fN = BaselineShiftKt.n(multiplier, baselineShift2 != null ? baselineShift2.getMultiplier() : BaselineShift.t(0.0f), f3);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.n();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.INSTANCE.n();
        }
        TextGeometricTransform textGeometricTransformN = TextGeometricTransformKt.n(textGeometricTransform, textGeometricTransform2, f3);
        LocaleList localeList = (LocaleList) nr(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f3);
        long jKN = ColorKt.KN(spanStyle.getBackground(), spanStyle2.getBackground(), f3);
        TextDecoration textDecoration = (TextDecoration) nr(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f3);
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = spanStyle2.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(textForegroundStyleRl, jJ2, fontWeightN, fontStyle, fontSynthesis, fontFamily, str, jJ22, BaselineShift.rl(fN), textGeometricTransformN, localeList, jKN, textDecoration, ShadowKt.n(shadow, shadow2, f3), O(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f3), (DrawStyle) nr(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f3), (DefaultConstructorMarker) null);
    }

    public static final long J2(long j2, long j3, float f3) {
        if (TextUnit.J2(j2) == 0 || TextUnit.J2(j3) == 0) {
            return ((TextUnit) nr(TextUnit.rl(j2), TextUnit.rl(j3), f3)).getPackedValue();
        }
        return TextUnitKt.xMQ(j2, j3, f3);
    }

    public static final SpanStyle KN(SpanStyle spanStyle) {
        long fontSize;
        int iRl;
        int iN;
        long letterSpacing;
        float fN;
        TextForegroundStyle textForegroundStyleRl = spanStyle.getTextForegroundStyle().rl(new Function0<TextForegroundStyle>() { // from class: androidx.compose.ui.text.SpanStyleKt$resolveSpanStyleDefaults$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final TextForegroundStyle invoke() {
                return SpanStyleKt.f33489O;
            }
        });
        if (TextUnit.J2(spanStyle.getFontSize()) == 0) {
            fontSize = f33490n;
        } else {
            fontSize = spanStyle.getFontSize();
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.O();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            iRl = fontStyle.getValue();
        } else {
            iRl = FontStyle.INSTANCE.rl();
        }
        FontStyle fontStyleT = FontStyle.t(iRl);
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            iN = fontSynthesis.getValue();
        } else {
            iN = FontSynthesis.INSTANCE.n();
        }
        FontSynthesis fontSynthesisO = FontSynthesis.O(iN);
        FontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.INSTANCE.rl();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        if (TextUnit.J2(spanStyle.getLetterSpacing()) == 0) {
            letterSpacing = rl;
        } else {
            letterSpacing = spanStyle.getLetterSpacing();
        }
        long j2 = letterSpacing;
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            fN = baselineShift.getMultiplier();
        } else {
            fN = BaselineShift.INSTANCE.n();
        }
        BaselineShift baselineShiftRl = BaselineShift.rl(fN);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.n();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.INSTANCE.n();
        }
        LocaleList localeList2 = localeList;
        long background = spanStyle.getBackground();
        if (background == 16) {
            background = f33491t;
        }
        long j3 = background;
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.t();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.n();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.f31654n;
        }
        return new SpanStyle(textForegroundStyleRl, fontSize, fontWeight2, fontStyleT, fontSynthesisO, fontFamily2, str, j2, baselineShiftRl, textGeometricTransform2, localeList2, j3, textDecoration2, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    private static final PlatformSpanStyle Uo(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        if (spanStyle.getPlatformStyle() == null) {
            return platformSpanStyle;
        }
        if (platformSpanStyle == null) {
            return spanStyle.getPlatformStyle();
        }
        return spanStyle.getPlatformStyle().rl(platformSpanStyle);
    }
}
