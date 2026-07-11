package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B¿\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"BÁ\u0001\b\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010$J\u001b\u0010&\u001a\u00020\u00002\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b&\u0010'JÈ\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010%\u001a\u0004\u0018\u00010*H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020+2\u0006\u0010%\u001a\u00020\u0000H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020+2\u0006\u0010%\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u0010/J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u000201H\u0000¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u00106R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u00107\u001a\u0004\b8\u00109R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001f\u0010\t\u001a\u0004\u0018\u00010\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u00106R\u001d\u0010\u0010\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010;\u001a\u0004\bR\u0010=R\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bL\u0010S\u001a\u0004\bF\u0010TR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bP\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b<\u0010X\u001a\u0004\bY\u0010ZR\u001d\u0010\u0018\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bB\u0010=R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bH\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b@\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bR\u0010a\u001a\u0004\bb\u0010cR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bY\u0010d\u001a\u0004\bQ\u0010eR\u0017\u0010#\u001a\u00020\u00178Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bN\u0010=R\u0013\u0010h\u001a\u0004\u0018\u00010f8F¢\u0006\u0006\u001a\u0004\bJ\u0010gR\u0011\u0010k\u001a\u00020i8F¢\u0006\u0006\u001a\u0004\b>\u0010j\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006l"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "textForegroundStyle", "Landroidx/compose/ui/unit/TextUnit;", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontFamily;", TtmlNode.ATTR_TTS_FONT_FAMILY, "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "Landroidx/compose/ui/graphics/Color;", "background", "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/PlatformSpanStyle;", "platformStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "<init>", "(Landroidx/compose/ui/text/style/TextForegroundStyle;JLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", TtmlNode.ATTR_TTS_COLOR, "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", InneractiveMediationNameConsts.OTHER, "ViF", "(Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;", c.f62177j, "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "", "", "equals", "(Ljava/lang/Object;)Z", "S", "(Landroidx/compose/ui/text/SpanStyle;)Z", "WPU", "", "hashCode", "()I", "aYN", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "Z", "()Landroidx/compose/ui/text/style/TextForegroundStyle;", "rl", "J", "gh", "()J", "t", "Landroidx/compose/ui/text/font/FontWeight;", "ty", "()Landroidx/compose/ui/text/font/FontWeight;", "nr", "Landroidx/compose/ui/text/font/FontStyle;", "qie", "()Landroidx/compose/ui/text/font/FontStyle;", "O", "Landroidx/compose/ui/text/font/FontSynthesis;", "az", "()Landroidx/compose/ui/text/font/FontSynthesis;", "J2", "Landroidx/compose/ui/text/font/FontFamily;", "xMQ", "()Landroidx/compose/ui/text/font/FontFamily;", "Uo", "Ljava/lang/String;", "mUb", "KN", "HI", "Landroidx/compose/ui/text/style/BaselineShift;", "()Landroidx/compose/ui/text/style/BaselineShift;", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "XQ", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "Landroidx/compose/ui/text/intl/LocaleList;", "ck", "()Landroidx/compose/ui/text/intl/LocaleList;", "Landroidx/compose/ui/text/style/TextDecoration;", "o", "()Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/Shadow;", "r", "()Landroidx/compose/ui/graphics/Shadow;", "Landroidx/compose/ui/text/PlatformSpanStyle;", "Ik", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "Landroidx/compose/ui/graphics/Brush;", "()Landroidx/compose/ui/graphics/Brush;", "brush", "", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SpanStyle implements AnnotatedString.Annotation {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata and from toString */
    private final PlatformSpanStyle platformStyle;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final FontFamily fontFamily;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata and from toString */
    private final long letterSpacing;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final FontSynthesis fontSynthesis;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata and from toString */
    private final String fontFeatureSettings;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata and from toString */
    private final TextDecoration textDecoration;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata and from toString */
    private final DrawStyle drawStyle;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata and from toString */
    private final LocaleList localeList;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata and from toString */
    private final TextGeometricTransform textGeometricTransform;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TextForegroundStyle textForegroundStyle;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final FontStyle fontStyle;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata and from toString */
    private final long background;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final long fontSize;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final FontWeight fontWeight;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata and from toString */
    private final Shadow shadow;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata and from toString */
    private final BaselineShift baselineShift;

    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public static /* synthetic */ SpanStyle rl(SpanStyle spanStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, Object obj) {
        long jUo = (i2 & 1) != 0 ? spanStyle.Uo() : j2;
        return spanStyle.n(jUo, (i2 & 2) != 0 ? spanStyle.fontSize : j3, (i2 & 4) != 0 ? spanStyle.fontWeight : fontWeight, (i2 & 8) != 0 ? spanStyle.fontStyle : fontStyle, (i2 & 16) != 0 ? spanStyle.fontSynthesis : fontSynthesis, (i2 & 32) != 0 ? spanStyle.fontFamily : fontFamily, (i2 & 64) != 0 ? spanStyle.fontFeatureSettings : str, (i2 & 128) != 0 ? spanStyle.letterSpacing : j4, (i2 & 256) != 0 ? spanStyle.baselineShift : baselineShift, (i2 & 512) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform, (i2 & 1024) != 0 ? spanStyle.localeList : localeList, (i2 & 2048) != 0 ? spanStyle.background : j5, (i2 & 4096) != 0 ? spanStyle.textDecoration : textDecoration, (i2 & 8192) != 0 ? spanStyle.shadow : shadow, (i2 & 16384) != 0 ? spanStyle.platformStyle : platformSpanStyle, (i2 & 32768) != 0 ? spanStyle.drawStyle : drawStyle);
    }

    public final boolean S(SpanStyle other) {
        if (this == other) {
            return true;
        }
        return TextUnit.O(this.fontSize, other.fontSize) && Intrinsics.areEqual(this.fontWeight, other.fontWeight) && Intrinsics.areEqual(this.fontStyle, other.fontStyle) && Intrinsics.areEqual(this.fontSynthesis, other.fontSynthesis) && Intrinsics.areEqual(this.fontFamily, other.fontFamily) && Intrinsics.areEqual(this.fontFeatureSettings, other.fontFeatureSettings) && TextUnit.O(this.letterSpacing, other.letterSpacing) && Intrinsics.areEqual(this.baselineShift, other.baselineShift) && Intrinsics.areEqual(this.textGeometricTransform, other.textGeometricTransform) && Intrinsics.areEqual(this.localeList, other.localeList) && Color.HI(this.background, other.background) && Intrinsics.areEqual(this.platformStyle, other.platformStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) other;
        return S(spanStyle) && WPU(spanStyle);
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Brush J2() {
        return this.textForegroundStyle.O();
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final BaselineShift getBaselineShift() {
        return this.baselineShift;
    }

    public final long Uo() {
        return this.textForegroundStyle.t();
    }

    public final SpanStyle ViF(SpanStyle other) {
        return other == null ? this : SpanStyleKt.rl(this, other.textForegroundStyle.t(), other.textForegroundStyle.O(), other.textForegroundStyle.n(), other.fontSize, other.fontWeight, other.fontStyle, other.fontSynthesis, other.fontFamily, other.fontFeatureSettings, other.letterSpacing, other.baselineShift, other.textGeometricTransform, other.localeList, other.background, other.textDecoration, other.shadow, other.platformStyle, other.drawStyle);
    }

    public final boolean WPU(SpanStyle other) {
        return Intrinsics.areEqual(this.textForegroundStyle, other.textForegroundStyle) && Intrinsics.areEqual(this.textDecoration, other.textDecoration) && Intrinsics.areEqual(this.shadow, other.shadow) && Intrinsics.areEqual(this.drawStyle, other.drawStyle);
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final TextForegroundStyle getTextForegroundStyle() {
        return this.textForegroundStyle;
    }

    public final int aYN() {
        int iXMQ = TextUnit.xMQ(this.fontSize) * 31;
        FontWeight fontWeight = this.fontWeight;
        int weight = (iXMQ + (fontWeight != null ? fontWeight.getWeight() : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int iUo = (weight + (fontStyle != null ? FontStyle.Uo(fontStyle.getValue()) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iXMQ2 = (iUo + (fontSynthesis != null ? FontSynthesis.xMQ(fontSynthesis.getValue()) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode = (iXMQ2 + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + TextUnit.xMQ(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        int iJ2 = (iHashCode2 + (baselineShift != null ? BaselineShift.J2(baselineShift.getMultiplier()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode3 = (iJ2 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode4 = (((iHashCode3 + (localeList != null ? localeList.hashCode() : 0)) * 31) + Color.XQ(this.background)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        return iHashCode4 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0);
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final FontSynthesis getFontSynthesis() {
        return this.fontSynthesis;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public final SpanStyle n(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle, DrawStyle drawStyle) {
        return new SpanStyle(Color.HI(color, Uo()) ? this.textForegroundStyle : TextForegroundStyle.INSTANCE.rl(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final FontStyle getFontStyle() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }

    public final float t() {
        return this.textForegroundStyle.n();
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) Color.S(Uo())) + ", brush=" + J2() + ", alpha=" + t() + ", fontSize=" + ((Object) TextUnit.gh(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) TextUnit.gh(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) Color.S(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ", drawStyle=" + this.drawStyle + ')';
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.textForegroundStyle = textForegroundStyle;
        this.fontSize = j2;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j3;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j4;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    public int hashCode() {
        int iHashCode;
        int weight;
        int iUo;
        int iXMQ;
        int iHashCode2;
        int iHashCode3;
        int iJ2;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int iHashCode8;
        int iXQ = Color.XQ(Uo()) * 31;
        Brush brushJ2 = J2();
        int iHashCode9 = 0;
        if (brushJ2 != null) {
            iHashCode = brushJ2.hashCode();
        } else {
            iHashCode = 0;
        }
        int iHashCode10 = (((((iXQ + iHashCode) * 31) + Float.hashCode(t())) * 31) + TextUnit.xMQ(this.fontSize)) * 31;
        FontWeight fontWeight = this.fontWeight;
        if (fontWeight != null) {
            weight = fontWeight.getWeight();
        } else {
            weight = 0;
        }
        int i2 = (iHashCode10 + weight) * 31;
        FontStyle fontStyle = this.fontStyle;
        if (fontStyle != null) {
            iUo = FontStyle.Uo(fontStyle.getValue());
        } else {
            iUo = 0;
        }
        int i3 = (i2 + iUo) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        if (fontSynthesis != null) {
            iXMQ = FontSynthesis.xMQ(fontSynthesis.getValue());
        } else {
            iXMQ = 0;
        }
        int i5 = (i3 + iXMQ) * 31;
        FontFamily fontFamily = this.fontFamily;
        if (fontFamily != null) {
            iHashCode2 = fontFamily.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i7 = (i5 + iHashCode2) * 31;
        String str = this.fontFeatureSettings;
        if (str != null) {
            iHashCode3 = str.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int iXMQ2 = (((i7 + iHashCode3) * 31) + TextUnit.xMQ(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        if (baselineShift != null) {
            iJ2 = BaselineShift.J2(baselineShift.getMultiplier());
        } else {
            iJ2 = 0;
        }
        int i8 = (iXMQ2 + iJ2) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        if (textGeometricTransform != null) {
            iHashCode4 = textGeometricTransform.hashCode();
        } else {
            iHashCode4 = 0;
        }
        int i9 = (i8 + iHashCode4) * 31;
        LocaleList localeList = this.localeList;
        if (localeList != null) {
            iHashCode5 = localeList.hashCode();
        } else {
            iHashCode5 = 0;
        }
        int iXQ2 = (((i9 + iHashCode5) * 31) + Color.XQ(this.background)) * 31;
        TextDecoration textDecoration = this.textDecoration;
        if (textDecoration != null) {
            iHashCode6 = textDecoration.hashCode();
        } else {
            iHashCode6 = 0;
        }
        int i10 = (iXQ2 + iHashCode6) * 31;
        Shadow shadow = this.shadow;
        if (shadow != null) {
            iHashCode7 = shadow.hashCode();
        } else {
            iHashCode7 = 0;
        }
        int i11 = (i10 + iHashCode7) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        if (platformSpanStyle != null) {
            iHashCode8 = platformSpanStyle.hashCode();
        } else {
            iHashCode8 = 0;
        }
        int i12 = (i11 + iHashCode8) * 31;
        DrawStyle drawStyle = this.drawStyle;
        if (drawStyle != null) {
            iHashCode9 = drawStyle.hashCode();
        }
        return i12 + iHashCode9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long jUo = (i2 & 1) != 0 ? Color.INSTANCE.Uo() : j2;
        long jN = (i2 & 2) != 0 ? TextUnit.INSTANCE.n() : j3;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i2 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i2 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? null : fontFamily;
        String str2 = (i2 & 64) != 0 ? null : str;
        long jN2 = (i2 & 128) != 0 ? TextUnit.INSTANCE.n() : j4;
        BaselineShift baselineShift2 = (i2 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i2 & 1024) != 0 ? null : localeList;
        long jUo2 = (i2 & 2048) != 0 ? Color.INSTANCE.Uo() : j5;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? null : textDecoration;
        long j6 = jUo;
        Shadow shadow2 = (i2 & 8192) != 0 ? null : shadow;
        PlatformSpanStyle platformSpanStyle2 = (i2 & 16384) != 0 ? null : platformSpanStyle;
        long j7 = jN;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j9 = jN2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j10 = jUo2;
        this(j6, j7, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j9, baselineShift3, textGeometricTransform3, localeList3, j10, textDecoration3, shadow2, platformSpanStyle2, (i2 & 32768) != 0 ? null : drawStyle, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.INSTANCE.rl(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }
}
