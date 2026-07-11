package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Immutable
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b(\b\u0007\u0018\u0000 `2\u00020\u0001:\u0002\u0086\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nB\u0097\u0002\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010+\u001a\u00020\r\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b\b\u00106J\u000f\u00107\u001a\u00020\u0002H\u0007¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0004H\u0007¢\u0006\u0004\b9\u0010:J\u001b\u0010<\u001a\u00020\u00002\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b<\u0010=J \u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00105\u001a\u0004\u0018\u000104H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0004H\u0007¢\u0006\u0004\b@\u0010AJ\u009e\u0002\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00105\u001a\u0004\u0018\u000104ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020D2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020D2\u0006\u0010;\u001a\u00020\u0000¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u00020D2\u0006\u0010;\u001a\u00020\u0000¢\u0006\u0004\bI\u0010HJ\u000f\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020JH\u0000¢\u0006\u0004\bM\u0010LJ\u000f\u0010N\u001a\u00020\u0017H\u0016¢\u0006\u0004\bN\u0010OR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010S\u001a\u0004\bT\u0010:R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0013\u0010\\\u001a\u0004\u0018\u00010Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0017\u0010\f\u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0011\u0010b\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0017\u0010\u000e\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bc\u0010^R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bl\u0010OR\u0017\u0010\u0019\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bm\u0010^R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0017\u0010 \u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bt\u0010^R\u0013\u0010\"\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0013\u0010$\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0013\u0010&\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0017\u0010(\u001a\u00020'8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b{\u0010LR\u0017\u0010*\u001a\u00020)8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b|\u0010LR\u0017\u0010+\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b}\u0010^R\u0013\u0010-\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0015\u0010/\u001a\u0004\u0018\u00010.8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u00103\u001a\u0002028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010LR\u0018\u00101\u001a\u0002008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010LR\u0015\u00105\u001a\u0004\u0018\u0001048F¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "platformStyle", "<init>", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/PlatformTextStyle;)V", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)V", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/unit/TextUnit;", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontFamily;", TtmlNode.ATTR_TTS_FONT_FAMILY, "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "background", "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/text/style/TextAlign;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineBreak;", "lineBreak", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "rV9", "()Landroidx/compose/ui/text/SpanStyle;", "v", "()Landroidx/compose/ui/text/ParagraphStyle;", InneractiveMediationNameConsts.OTHER, "nHg", "(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;", "s7N", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "N", "(Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/TextStyle;", "rl", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "", "equals", "(Ljava/lang/Object;)Z", "X", "(Landroidx/compose/ui/text/TextStyle;)Z", "e", "", "hashCode", "()I", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "toString", "()Ljava/lang/String;", c.f62177j, "Landroidx/compose/ui/text/SpanStyle;", "ViF", "Landroidx/compose/ui/text/ParagraphStyle;", "S", "t", "Landroidx/compose/ui/text/PlatformTextStyle;", "WPU", "()Landroidx/compose/ui/text/PlatformTextStyle;", "Landroidx/compose/ui/graphics/Brush;", "Uo", "()Landroidx/compose/ui/graphics/Brush;", "brush", "KN", "()J", "", "nr", "()F", "alpha", "qie", "HI", "()Landroidx/compose/ui/text/font/FontWeight;", "az", "()Landroidx/compose/ui/text/font/FontStyle;", "ty", "()Landroidx/compose/ui/text/font/FontSynthesis;", "mUb", "()Landroidx/compose/ui/text/font/FontFamily;", "gh", "Ik", "J2", "()Landroidx/compose/ui/text/style/BaselineShift;", "iF", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "XQ", "()Landroidx/compose/ui/text/intl/LocaleList;", "O", "g", "()Landroidx/compose/ui/text/style/TextDecoration;", "aYN", "()Landroidx/compose/ui/graphics/Shadow;", "xMQ", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "nY", "te", "o", "fD", "()Landroidx/compose/ui/text/style/TextIndent;", "Z", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "ck", "r", "E2", "()Landroidx/compose/ui/text/style/TextMotion;", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextStyle {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle spanStyle;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final ParagraphStyle paragraphStyle;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlatformTextStyle platformStyle;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final TextStyle f33516O = new TextStyle(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777215, null);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/TextStyle$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/TextStyle;", "Default", "Landroidx/compose/ui/text/TextStyle;", c.f62177j, "()Landroidx/compose/ui/text/TextStyle;", "getDefault$annotations", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TextStyle n() {
            return TextStyle.f33516O;
        }
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i5, int i7, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, drawStyle, i2, i3, j6, textIndent, platformTextStyle, lineHeightStyle, i5, i7, textMotion);
    }

    public static /* synthetic */ TextStyle t(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i5, int i7, TextMotion textMotion, int i8, Object obj) {
        TextMotion textMotion2;
        int i9;
        long jUo = (i8 & 1) != 0 ? textStyle.spanStyle.Uo() : j2;
        long fontSize = (i8 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j3;
        FontWeight fontWeight2 = (i8 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle2 = (i8 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis2 = (i8 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily2 = (i8 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i8 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i8 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j4;
        BaselineShift baselineShift2 = (i8 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i8 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i8 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j7 = jUo;
        long background = (i8 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j5;
        TextDecoration textDecoration2 = (i8 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i8 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i8 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int textAlign = (i8 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : i2;
        int textDirection = (i8 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : i3;
        long lineHeight = (i8 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : j6;
        TextIndent textIndent2 = (i8 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i8 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i8 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int lineBreak = (i8 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : i5;
        int hyphens = (i8 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : i7;
        if ((i8 & 8388608) != 0) {
            i9 = hyphens;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            i9 = hyphens;
        }
        return textStyle.rl(j7, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration3, shadow2, drawStyle2, textAlign, textDirection, lineHeight, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak, i9, textMotion2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return Intrinsics.areEqual(this.spanStyle, textStyle.spanStyle) && Intrinsics.areEqual(this.paragraphStyle, textStyle.paragraphStyle) && Intrinsics.areEqual(this.platformStyle, textStyle.platformStyle);
    }

    public final TextStyle rl(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.HI(color, this.spanStyle.Uo()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.rl(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, null), platformStyle);
    }

    public final TextStyle s7N(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, PlatformTextStyle platformStyle, TextMotion textMotion) {
        SpanStyle spanStyleRl = SpanStyleKt.rl(this.spanStyle, color, null, Float.NaN, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleN = ParagraphStyleKt.n(this.paragraphStyle, textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion);
        return (this.spanStyle == spanStyleRl && this.paragraphStyle == paragraphStyleN) ? this : new TextStyle(spanStyleRl, paragraphStyleN);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    public final TextMotion E2() {
        return this.paragraphStyle.getTextMotion();
    }

    public final FontWeight HI() {
        return this.spanStyle.getFontWeight();
    }

    public final long Ik() {
        return this.spanStyle.getLetterSpacing();
    }

    public final BaselineShift J2() {
        return this.spanStyle.getBaselineShift();
    }

    public final long KN() {
        return this.spanStyle.Uo();
    }

    public final TextStyle N(ParagraphStyle other) {
        return new TextStyle(rV9(), v().qie(other));
    }

    public final long O() {
        return this.spanStyle.getBackground();
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final ParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    public final int T() {
        int iAYN = ((this.spanStyle.aYN() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iAYN + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final Brush Uo() {
        return this.spanStyle.J2();
    }

    /* JADX INFO: renamed from: ViF, reason: from getter */
    public final SpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final boolean X(TextStyle other) {
        if (this != other) {
            return Intrinsics.areEqual(this.paragraphStyle, other.paragraphStyle) && this.spanStyle.S(other.spanStyle);
        }
        return true;
    }

    public final LocaleList XQ() {
        return this.spanStyle.getLocaleList();
    }

    public final LineHeightStyle Z() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public final Shadow aYN() {
        return this.spanStyle.getShadow();
    }

    public final FontStyle az() {
        return this.spanStyle.getFontStyle();
    }

    public final int ck() {
        return this.paragraphStyle.getHyphens();
    }

    public final boolean e(TextStyle other) {
        return this == other || this.spanStyle.WPU(other.spanStyle);
    }

    public final TextIndent fD() {
        return this.paragraphStyle.getTextIndent();
    }

    public final TextDecoration g() {
        return this.spanStyle.getTextDecoration();
    }

    public final String gh() {
        return this.spanStyle.getFontFeatureSettings();
    }

    public int hashCode() {
        int iHashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final TextGeometricTransform iF() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final FontFamily mUb() {
        return this.spanStyle.getFontFamily();
    }

    public final TextStyle nHg(TextStyle other) {
        return (other == null || Intrinsics.areEqual(other, f33516O)) ? this : new TextStyle(rV9().ViF(other.rV9()), v().qie(other.v()));
    }

    public final int nY() {
        return this.paragraphStyle.getTextAlign();
    }

    public final float nr() {
        return this.spanStyle.t();
    }

    public final long o() {
        return this.paragraphStyle.getLineHeight();
    }

    public final long qie() {
        return this.spanStyle.getFontSize();
    }

    public final int r() {
        return this.paragraphStyle.getLineBreak();
    }

    public final SpanStyle rV9() {
        return this.spanStyle;
    }

    public final int te() {
        return this.paragraphStyle.getTextDirection();
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) Color.S(KN())) + ", brush=" + Uo() + ", alpha=" + nr() + ", fontSize=" + ((Object) TextUnit.gh(qie())) + GDEJgAYrPQHfw.fqdVpYSMbqhUXeR + HI() + ", fontStyle=" + az() + ", fontSynthesis=" + ty() + ", fontFamily=" + mUb() + ", fontFeatureSettings=" + gh() + ", letterSpacing=" + ((Object) TextUnit.gh(Ik())) + ", baselineShift=" + J2() + ", textGeometricTransform=" + iF() + ", localeList=" + XQ() + ", background=" + ((Object) Color.S(O())) + ", textDecoration=" + g() + ", shadow=" + aYN() + ", drawStyle=" + xMQ() + ", textAlign=" + ((Object) TextAlign.az(nY())) + ", textDirection=" + ((Object) TextDirection.qie(te())) + ", lineHeight=" + ((Object) TextUnit.gh(o())) + ", textIndent=" + fD() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + Z() + ", lineBreak=" + ((Object) LineBreak.gh(r())) + ", hyphens=" + ((Object) Hyphens.xMQ(ck())) + ", textMotion=" + E2() + ')';
    }

    public final FontSynthesis ty() {
        return this.spanStyle.getFontSynthesis();
    }

    public final ParagraphStyle v() {
        return this.paragraphStyle;
    }

    public final DrawStyle xMQ() {
        return this.spanStyle.getDrawStyle();
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, TextStyleKt.rl(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i5, int i7, TextMotion textMotion, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        long jUo = (i8 & 1) != 0 ? Color.INSTANCE.Uo() : j2;
        long jN = (i8 & 2) != 0 ? TextUnit.INSTANCE.n() : j3;
        FontWeight fontWeight2 = (i8 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i8 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i8 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i8 & 32) != 0 ? null : fontFamily;
        String str2 = (i8 & 64) != 0 ? null : str;
        long jN2 = (i8 & 128) != 0 ? TextUnit.INSTANCE.n() : j4;
        BaselineShift baselineShift2 = (i8 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i8 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i8 & 1024) != 0 ? null : localeList;
        long jUo2 = (i8 & 2048) != 0 ? Color.INSTANCE.Uo() : j5;
        TextDecoration textDecoration2 = (i8 & 4096) != 0 ? null : textDecoration;
        long j7 = jUo;
        Shadow shadow2 = (i8 & 8192) != 0 ? null : shadow;
        DrawStyle drawStyle2 = (i8 & 16384) != 0 ? null : drawStyle;
        int iUo = (i8 & 32768) != 0 ? TextAlign.INSTANCE.Uo() : i2;
        int iJ2 = (i8 & 65536) != 0 ? TextDirection.INSTANCE.J2() : i3;
        long jN3 = (i8 & 131072) != 0 ? TextUnit.INSTANCE.n() : j6;
        TextIndent textIndent2 = (i8 & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i8 & 524288) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i8 & 1048576) != 0 ? null : lineHeightStyle;
        int iRl = (i8 & 2097152) != 0 ? LineBreak.INSTANCE.rl() : i5;
        int iT = (i8 & 4194304) != 0 ? Hyphens.INSTANCE.t() : i7;
        long j9 = jN;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j10 = jN2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j11 = jUo2;
        this(j7, j9, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j10, baselineShift3, textGeometricTransform3, localeList3, j11, textDecoration3, shadow2, drawStyle2, iUo, iJ2, jN3, textIndent2, platformTextStyle2, lineHeightStyle2, iRl, iT, (i8 & 8388608) != 0 ? null : textMotion, null);
    }

    private TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i5, int i7, TextMotion textMotion) {
        this(new SpanStyle(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(i2, i3, j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, i5, i7, textMotion, null), platformTextStyle);
    }
}
