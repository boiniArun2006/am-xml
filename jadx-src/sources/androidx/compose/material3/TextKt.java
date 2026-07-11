package androidx.compose.material3;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÒ\u0001\u0010!\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aÆ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aæ\u0001\u0010)\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020%2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020'0&2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aÜ\u0001\u0010+\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020%2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020'0&2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a*\u00101\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001f2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u001d0.¢\u0006\u0002\b/H\u0007¢\u0006\u0004\b1\u00102\"\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u001f038\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b5\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/unit/TextUnit;", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontFamily;", TtmlNode.ATTR_TTS_FONT_FAMILY, "letterSpacing", "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextAlign;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "lineHeight", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/TextStyle;", "style", "t", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "O", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "nr", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "rl", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "J2", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTextStyle", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nandroidx/compose/material3/TextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,351:1\n77#2:352\n77#2:355\n77#2:356\n77#2:357\n77#2:360\n77#2:361\n77#2:362\n708#3:353\n696#3:354\n708#3:358\n696#3:359\n*S KotlinDebug\n*F\n+ 1 Text.kt\nandroidx/compose/material3/TextKt\n*L\n109#1:352\n112#1:355\n157#1:356\n255#1:357\n257#1:360\n305#1:361\n348#1:362\n112#1:353\n112#1:354\n257#1:358\n257#1:359\n*E\n"})
public final class TextKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f28473n = CompositionLocalKt.nr(SnapshotStateKt.r(), new Function0<TextStyle>() { // from class: androidx.compose.material3.TextKt$LocalTextStyle$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final TextStyle invoke() {
            return TypographyTokensKt.n();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void O(final String str, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, Function1 function1, TextStyle textStyle, Composer composer, final int i5, final int i7, final int i8) {
        int i9;
        int i10;
        long jUo;
        int i11;
        int i12;
        long jN;
        int i13;
        FontStyle fontStyle2;
        int i14;
        FontWeight fontWeight2;
        int i15;
        FontFamily fontFamily2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z3;
        int i28;
        int i29;
        int i30;
        boolean z4;
        long j6;
        int i31;
        long j7;
        TextStyle textStyle2;
        Function1 function12;
        Modifier modifier2;
        TextAlign textAlign2;
        TextDecoration textDecoration2;
        long j9;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j10;
        int i32;
        Composer composer2;
        final Modifier modifier3;
        final long j11;
        final long j12;
        final FontStyle fontStyle3;
        final FontWeight fontWeight4;
        final FontFamily fontFamily4;
        final long j13;
        final TextDecoration textDecoration3;
        final TextAlign textAlign3;
        final long j14;
        final int i33;
        final boolean z5;
        final int i34;
        final Function1 function13;
        final TextStyle textStyle3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1968784669);
        if ((i8 & 1) != 0) {
            i9 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i9 = (composerKN.p5(str) ? 4 : 2) | i5;
        } else {
            i9 = i5;
        }
        int i35 = i8 & 2;
        if (i35 != 0) {
            i9 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                i9 |= composerKN.p5(modifier) ? 32 : 16;
            }
            i10 = i8 & 4;
            if (i10 == 0) {
                i11 = i9 | RendererCapabilities.DECODER_SUPPORT_MASK;
                jUo = j2;
            } else {
                int i36 = i9;
                jUo = j2;
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i36 |= composerKN.nr(jUo) ? 256 : 128;
                }
                i11 = i36;
            }
            i12 = i8 & 8;
            if (i12 == 0) {
                i11 |= 3072;
                jN = j3;
            } else {
                jN = j3;
                if ((i5 & 3072) == 0) {
                    i11 |= composerKN.nr(jN) ? 2048 : 1024;
                }
            }
            i13 = i8 & 16;
            if (i13 == 0) {
                i11 |= 24576;
            } else {
                if ((i5 & 24576) == 0) {
                    fontStyle2 = fontStyle;
                    i11 |= composerKN.p5(fontStyle2) ? 16384 : 8192;
                }
                i14 = i8 & 32;
                int i37 = 65536;
                if (i14 != 0) {
                    i11 |= 196608;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i5 & 196608) == 0) {
                        i11 |= composerKN.p5(fontWeight2) ? 131072 : 65536;
                    }
                }
                i15 = i8 & 64;
                if (i15 != 0) {
                    i11 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i5 & 1572864) == 0) {
                        i11 |= composerKN.p5(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i16 = i8 & 128;
                if (i16 != 0) {
                    i11 |= 12582912;
                } else {
                    if ((i5 & 12582912) == 0) {
                        i17 = i11 | (composerKN.nr(j4) ? 8388608 : 4194304);
                    }
                    i18 = i8 & 256;
                    if (i18 == 0) {
                        i17 |= 100663296;
                    } else {
                        if ((i5 & 100663296) == 0) {
                            i19 = i18;
                            i17 |= composerKN.p5(textDecoration) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i20 = i8 & 512;
                        if (i20 != 0) {
                            i17 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            i21 = i20;
                        } else if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i21 = i20;
                            i17 |= composerKN.p5(textAlign) ? 536870912 : 268435456;
                        } else {
                            i21 = i20;
                        }
                        i22 = i17;
                        i23 = i8 & 1024;
                        if (i23 != 0) {
                            i24 = i7 | 6;
                        } else if ((i7 & 6) == 0) {
                            i24 = i7 | (composerKN.nr(j5) ? 4 : 2);
                        } else {
                            i24 = i7;
                        }
                        i25 = i8 & 2048;
                        if (i25 != 0) {
                            i24 |= 48;
                            i26 = i25;
                        } else if ((i7 & 48) == 0) {
                            i26 = i25;
                            i24 |= composerKN.t(i2) ? 32 : 16;
                        } else {
                            i26 = i25;
                        }
                        int i38 = i24;
                        i27 = i8 & 4096;
                        if (i27 != 0) {
                            i38 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else {
                            if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                z3 = z2;
                                i38 |= composerKN.n(z3) ? 256 : 128;
                            }
                            i28 = i8 & 8192;
                            if (i28 == 0) {
                                i29 = i38 | 3072;
                            } else {
                                int i39 = i38;
                                if ((i7 & 3072) == 0) {
                                    i29 = i39 | (composerKN.t(i3) ? 2048 : 1024);
                                } else {
                                    i29 = i39;
                                }
                            }
                            i30 = i8 & 16384;
                            if (i30 != 0) {
                                if ((i7 & 24576) == 0) {
                                    i29 |= composerKN.E2(function1) ? 16384 : 8192;
                                }
                                if ((i7 & 196608) == 0) {
                                    if ((i8 & 32768) == 0 && composerKN.p5(textStyle)) {
                                        i37 = 131072;
                                    }
                                    i29 |= i37;
                                }
                                if ((i22 & 306783379) == 306783378 && (74899 & i29) == 74898 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    modifier3 = modifier;
                                    textAlign3 = textAlign;
                                    i33 = i2;
                                    i34 = i3;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                    composer2 = composerKN;
                                    z5 = z3;
                                    j11 = jUo;
                                    fontStyle3 = fontStyle2;
                                    j12 = jN;
                                    fontWeight4 = fontWeight2;
                                    fontFamily4 = fontFamily2;
                                    j13 = j4;
                                    textDecoration3 = textDecoration;
                                    j14 = j5;
                                } else {
                                    composerKN.e();
                                    if ((i5 & 1) != 0 || composerKN.rV9()) {
                                        Modifier modifier4 = i35 == 0 ? Modifier.INSTANCE : modifier;
                                        if (i10 != 0) {
                                            jUo = Color.INSTANCE.Uo();
                                        }
                                        if (i12 != 0) {
                                            jN = TextUnit.INSTANCE.n();
                                        }
                                        if (i13 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i14 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i15 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long jN2 = i16 == 0 ? TextUnit.INSTANCE.n() : j4;
                                        TextDecoration textDecoration4 = i19 == 0 ? null : textDecoration;
                                        TextAlign textAlign4 = i21 == 0 ? textAlign : null;
                                        long jN3 = i23 == 0 ? TextUnit.INSTANCE.n() : j5;
                                        int iN = i26 == 0 ? TextOverflow.INSTANCE.n() : i2;
                                        if (i27 != 0) {
                                            z3 = true;
                                        }
                                        int i40 = i28 == 0 ? Integer.MAX_VALUE : i3;
                                        Function1 function14 = i30 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$2
                                            public final void n(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                n(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function1;
                                        Modifier modifier5 = modifier4;
                                        if ((i8 & 32768) == 0) {
                                            i29 &= -458753;
                                            z4 = z3;
                                            j6 = jUo;
                                            i31 = iN;
                                            j7 = jN3;
                                            textStyle2 = (TextStyle) composerKN.ty(f28473n);
                                        } else {
                                            z4 = z3;
                                            j6 = jUo;
                                            i31 = iN;
                                            j7 = jN3;
                                            textStyle2 = textStyle;
                                        }
                                        function12 = function14;
                                        modifier2 = modifier5;
                                        int i41 = i40;
                                        textAlign2 = textAlign4;
                                        FontFamily fontFamily5 = fontFamily2;
                                        textDecoration2 = textDecoration4;
                                        j9 = jN;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily5;
                                        j10 = jN2;
                                        i32 = i41;
                                    } else {
                                        composerKN.wTp();
                                        if ((i8 & 32768) != 0) {
                                            i29 &= -458753;
                                        }
                                        modifier2 = modifier;
                                        textAlign2 = textAlign;
                                        j7 = j5;
                                        i31 = i2;
                                        i32 = i3;
                                        function12 = function1;
                                        textStyle2 = textStyle;
                                        z4 = z3;
                                        j6 = jUo;
                                        j9 = jN;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily2;
                                        j10 = j4;
                                        textDecoration2 = textDecoration;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1968784669, i22, i29, "androidx.compose.material3.Text (Text.kt:157)");
                                    }
                                    int i42 = i29 << 3;
                                    composer2 = composerKN;
                                    t(str, modifier2, j6, j9, fontStyle2, fontWeight3, fontFamily3, j10, textDecoration2, textAlign2, j7, i31, z4, i32, 1, function12, textStyle2, composer2, i22 & 2147483646, (i29 & 14) | 24576 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (458752 & i42) | (i42 & 3670016), 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier3 = modifier2;
                                    j11 = j6;
                                    j12 = j9;
                                    fontStyle3 = fontStyle2;
                                    fontWeight4 = fontWeight3;
                                    fontFamily4 = fontFamily3;
                                    j13 = j10;
                                    textDecoration3 = textDecoration2;
                                    textAlign3 = textAlign2;
                                    j14 = j7;
                                    i33 = i31;
                                    z5 = z4;
                                    i34 = i32;
                                    function13 = function12;
                                    textStyle3 = textStyle2;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i43) {
                                            TextKt.O(str, modifier3, j11, j12, fontStyle3, fontWeight4, fontFamily4, j13, textDecoration3, textAlign3, j14, i33, z5, i34, function13, textStyle3, composer3, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i29 |= 24576;
                            if ((i7 & 196608) == 0) {
                            }
                            if ((i22 & 306783379) == 306783378) {
                                composerKN.e();
                                if ((i5 & 1) != 0) {
                                    if (i35 == 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if (i13 != 0) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    if (i15 != 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if (i26 == 0) {
                                    }
                                    if (i27 != 0) {
                                    }
                                    if (i28 == 0) {
                                    }
                                    if (i30 == 0) {
                                    }
                                    Modifier modifier52 = modifier4;
                                    if ((i8 & 32768) == 0) {
                                    }
                                    function12 = function14;
                                    modifier2 = modifier52;
                                    int i412 = i40;
                                    textAlign2 = textAlign4;
                                    FontFamily fontFamily52 = fontFamily2;
                                    textDecoration2 = textDecoration4;
                                    j9 = jN;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily52;
                                    j10 = jN2;
                                    i32 = i412;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                    }
                                    int i422 = i29 << 3;
                                    composer2 = composerKN;
                                    t(str, modifier2, j6, j9, fontStyle2, fontWeight3, fontFamily3, j10, textDecoration2, textAlign2, j7, i31, z4, i32, 1, function12, textStyle2, composer2, i22 & 2147483646, (i29 & 14) | 24576 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (458752 & i422) | (i422 & 3670016), 0);
                                    if (ComposerKt.v()) {
                                    }
                                    modifier3 = modifier2;
                                    j11 = j6;
                                    j12 = j9;
                                    fontStyle3 = fontStyle2;
                                    fontWeight4 = fontWeight3;
                                    fontFamily4 = fontFamily3;
                                    j13 = j10;
                                    textDecoration3 = textDecoration2;
                                    textAlign3 = textAlign2;
                                    j14 = j7;
                                    i33 = i31;
                                    z5 = z4;
                                    i34 = i32;
                                    function13 = function12;
                                    textStyle3 = textStyle2;
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        z3 = z2;
                        i28 = i8 & 8192;
                        if (i28 == 0) {
                        }
                        i30 = i8 & 16384;
                        if (i30 != 0) {
                        }
                        if ((i7 & 196608) == 0) {
                        }
                        if ((i22 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i19 = i18;
                    i20 = i8 & 512;
                    if (i20 != 0) {
                    }
                    i22 = i17;
                    i23 = i8 & 1024;
                    if (i23 != 0) {
                    }
                    i25 = i8 & 2048;
                    if (i25 != 0) {
                    }
                    int i382 = i24;
                    i27 = i8 & 4096;
                    if (i27 != 0) {
                    }
                    z3 = z2;
                    i28 = i8 & 8192;
                    if (i28 == 0) {
                    }
                    i30 = i8 & 16384;
                    if (i30 != 0) {
                    }
                    if ((i7 & 196608) == 0) {
                    }
                    if ((i22 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i17 = i11;
                i18 = i8 & 256;
                if (i18 == 0) {
                }
                i19 = i18;
                i20 = i8 & 512;
                if (i20 != 0) {
                }
                i22 = i17;
                i23 = i8 & 1024;
                if (i23 != 0) {
                }
                i25 = i8 & 2048;
                if (i25 != 0) {
                }
                int i3822 = i24;
                i27 = i8 & 4096;
                if (i27 != 0) {
                }
                z3 = z2;
                i28 = i8 & 8192;
                if (i28 == 0) {
                }
                i30 = i8 & 16384;
                if (i30 != 0) {
                }
                if ((i7 & 196608) == 0) {
                }
                if ((i22 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            fontStyle2 = fontStyle;
            i14 = i8 & 32;
            int i372 = 65536;
            if (i14 != 0) {
            }
            i15 = i8 & 64;
            if (i15 != 0) {
            }
            i16 = i8 & 128;
            if (i16 != 0) {
            }
            i17 = i11;
            i18 = i8 & 256;
            if (i18 == 0) {
            }
            i19 = i18;
            i20 = i8 & 512;
            if (i20 != 0) {
            }
            i22 = i17;
            i23 = i8 & 1024;
            if (i23 != 0) {
            }
            i25 = i8 & 2048;
            if (i25 != 0) {
            }
            int i38222 = i24;
            i27 = i8 & 4096;
            if (i27 != 0) {
            }
            z3 = z2;
            i28 = i8 & 8192;
            if (i28 == 0) {
            }
            i30 = i8 & 16384;
            if (i30 != 0) {
            }
            if ((i7 & 196608) == 0) {
            }
            if ((i22 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        i12 = i8 & 8;
        if (i12 == 0) {
        }
        i13 = i8 & 16;
        if (i13 == 0) {
        }
        fontStyle2 = fontStyle;
        i14 = i8 & 32;
        int i3722 = 65536;
        if (i14 != 0) {
        }
        i15 = i8 & 64;
        if (i15 != 0) {
        }
        i16 = i8 & 128;
        if (i16 != 0) {
        }
        i17 = i11;
        i18 = i8 & 256;
        if (i18 == 0) {
        }
        i19 = i18;
        i20 = i8 & 512;
        if (i20 != 0) {
        }
        i22 = i17;
        i23 = i8 & 1024;
        if (i23 != 0) {
        }
        i25 = i8 & 2048;
        if (i25 != 0) {
        }
        int i382222 = i24;
        i27 = i8 & 4096;
        if (i27 != 0) {
        }
        z3 = z2;
        i28 = i8 & 8192;
        if (i28 == 0) {
        }
        i30 = i8 & 16384;
        if (i30 != 0) {
        }
        if ((i7 & 196608) == 0) {
        }
        if ((i22 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final AnnotatedString annotatedString, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, int i5, Map map, Function1 function1, TextStyle textStyle, Composer composer, final int i7, final int i8, final int i9) {
        int i10;
        int i11;
        int i12;
        long jN;
        int i13;
        FontStyle fontStyle2;
        int i14;
        FontWeight fontWeight2;
        int i15;
        FontFamily fontFamily2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z3;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        Modifier modifier2;
        long jUo;
        TextAlign textAlign2;
        int iN;
        int i31;
        int i32;
        Map mapEmptyMap;
        Function1 function12;
        TextStyle textStyle2;
        TextDecoration textDecoration2;
        FontStyle fontStyle3;
        long j6;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j7;
        int i33;
        long j9;
        long j10;
        Modifier modifier3;
        Composer composer2;
        final TextAlign textAlign3;
        final Map map2;
        final int i34;
        final int i35;
        final Function1 function13;
        final TextStyle textStyle3;
        final FontWeight fontWeight4;
        final FontStyle fontStyle4;
        final FontFamily fontFamily4;
        final long j11;
        final long j12;
        final boolean z4;
        final int i36;
        final long j13;
        final TextDecoration textDecoration3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(2027001676);
        if ((i9 & 1) != 0) {
            i10 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i10 = (composerKN.p5(annotatedString) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        int i37 = i9 & 2;
        if (i37 != 0) {
            i10 |= 48;
        } else {
            if ((i7 & 48) == 0) {
                i10 |= composerKN.p5(modifier) ? 32 : 16;
            }
            i11 = i9 & 4;
            if (i11 == 0) {
                i10 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i10 |= composerKN.nr(j2) ? 256 : 128;
            }
            i12 = i9 & 8;
            if (i12 == 0) {
                i10 |= 3072;
                jN = j3;
            } else {
                jN = j3;
                if ((i7 & 3072) == 0) {
                    i10 |= composerKN.nr(jN) ? 2048 : 1024;
                }
            }
            i13 = i9 & 16;
            if (i13 == 0) {
                i10 |= 24576;
            } else {
                if ((i7 & 24576) == 0) {
                    fontStyle2 = fontStyle;
                    i10 |= composerKN.p5(fontStyle2) ? 16384 : 8192;
                }
                i14 = i9 & 32;
                if (i14 != 0) {
                    i10 |= 196608;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i7 & 196608) == 0) {
                        i10 |= composerKN.p5(fontWeight2) ? 131072 : 65536;
                    }
                }
                i15 = i9 & 64;
                if (i15 != 0) {
                    i10 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i7 & 1572864) == 0) {
                        i10 |= composerKN.p5(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i16 = i9 & 128;
                if (i16 != 0) {
                    i10 |= 12582912;
                } else if ((i7 & 12582912) == 0) {
                    i10 |= composerKN.nr(j4) ? 8388608 : 4194304;
                }
                i17 = i9 & 256;
                if (i17 != 0) {
                    i10 |= 100663296;
                } else if ((i7 & 100663296) == 0) {
                    i10 |= composerKN.p5(textDecoration) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                i18 = i9 & 512;
                if (i18 != 0) {
                    i10 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else {
                    if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i19 = i18;
                        i10 |= composerKN.p5(textAlign) ? 536870912 : 268435456;
                    }
                    i20 = i9 & 1024;
                    if (i20 == 0) {
                        i21 = i8 | 6;
                    } else if ((i8 & 6) == 0) {
                        i21 = i8 | (composerKN.nr(j5) ? 4 : 2);
                    } else {
                        i21 = i8;
                    }
                    i22 = i9 & 2048;
                    if (i22 == 0) {
                        i21 |= 48;
                        i23 = i22;
                    } else if ((i8 & 48) == 0) {
                        i23 = i22;
                        i21 |= composerKN.t(i2) ? 32 : 16;
                    } else {
                        i23 = i22;
                    }
                    int i38 = i21;
                    i24 = i9 & 4096;
                    if (i24 == 0) {
                        i38 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else {
                        if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            z3 = z2;
                            i38 |= composerKN.n(z3) ? 256 : 128;
                        }
                        i25 = i9 & 8192;
                        if (i25 != 0) {
                            i26 = i38 | 3072;
                        } else {
                            int i39 = i38;
                            if ((i8 & 3072) == 0) {
                                i26 = i39 | (composerKN.t(i3) ? 2048 : 1024);
                            } else {
                                i26 = i39;
                            }
                        }
                        i27 = i9 & 16384;
                        if (i27 == 0) {
                            i28 = i26;
                            if ((i8 & 24576) == 0) {
                                i28 |= composerKN.t(i5) ? 16384 : 8192;
                            }
                            i29 = i9 & 32768;
                            if (i29 == 0) {
                                i28 |= 196608;
                            } else if ((i8 & 196608) == 0) {
                                i28 |= composerKN.E2(map) ? 131072 : 65536;
                            }
                            i30 = i9 & 65536;
                            if (i30 == 0) {
                                i28 |= 1572864;
                            } else if ((i8 & 1572864) == 0) {
                                i28 |= composerKN.E2(function1) ? 1048576 : 524288;
                            }
                            if ((i8 & 12582912) == 0) {
                                i28 |= ((i9 & 131072) == 0 && composerKN.p5(textStyle)) ? 8388608 : 4194304;
                            }
                            if ((i10 & 306783379) != 306783378 && (i28 & 4793491) == 4793490 && composerKN.xMQ()) {
                                composerKN.wTp();
                                jUo = j2;
                                textDecoration3 = textDecoration;
                                i34 = i2;
                                i35 = i3;
                                i36 = i5;
                                map2 = map;
                                function13 = function1;
                                textStyle3 = textStyle;
                                composer2 = composerKN;
                                z4 = z3;
                                fontStyle4 = fontStyle2;
                                j13 = jN;
                                fontWeight4 = fontWeight2;
                                fontFamily4 = fontFamily2;
                                modifier3 = modifier;
                                j11 = j4;
                                textAlign3 = textAlign;
                                j12 = j5;
                            } else {
                                composerKN.e();
                                if ((i7 & 1) != 0 || composerKN.rV9()) {
                                    modifier2 = i37 == 0 ? Modifier.INSTANCE : modifier;
                                    jUo = i11 == 0 ? Color.INSTANCE.Uo() : j2;
                                    if (i12 != 0) {
                                        jN = TextUnit.INSTANCE.n();
                                    }
                                    if (i13 != 0) {
                                        fontStyle2 = null;
                                    }
                                    if (i14 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i15 != 0) {
                                        fontFamily2 = null;
                                    }
                                    long jN2 = i16 == 0 ? TextUnit.INSTANCE.n() : j4;
                                    TextDecoration textDecoration4 = i17 == 0 ? null : textDecoration;
                                    textAlign2 = i19 == 0 ? textAlign : null;
                                    long jN3 = i20 == 0 ? TextUnit.INSTANCE.n() : j5;
                                    iN = i23 == 0 ? TextOverflow.INSTANCE.n() : i2;
                                    if (i24 != 0) {
                                        z3 = true;
                                    }
                                    i31 = i25 == 0 ? Integer.MAX_VALUE : i3;
                                    i32 = i27 == 0 ? i5 : 1;
                                    mapEmptyMap = i29 == 0 ? MapsKt.emptyMap() : map;
                                    function12 = i30 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$4
                                        public final void n(TextLayoutResult textLayoutResult) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            n(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }
                                    } : function1;
                                    Modifier modifier4 = modifier2;
                                    if ((i9 & 131072) == 0) {
                                        textStyle2 = (TextStyle) composerKN.ty(f28473n);
                                        textDecoration2 = textDecoration4;
                                        fontStyle3 = fontStyle2;
                                        j6 = jN;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily2;
                                        j7 = jN2;
                                        i33 = i28 & (-29360129);
                                        j9 = jN3;
                                        modifier2 = modifier4;
                                    } else {
                                        textStyle2 = textStyle;
                                        textDecoration2 = textDecoration4;
                                        fontStyle3 = fontStyle2;
                                        j6 = jN;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily2;
                                        j7 = jN2;
                                        i33 = i28;
                                        j9 = jN3;
                                    }
                                } else {
                                    composerKN.wTp();
                                    if ((i9 & 131072) != 0) {
                                        i28 &= -29360129;
                                    }
                                    modifier2 = modifier;
                                    jUo = j2;
                                    j7 = j4;
                                    textDecoration2 = textDecoration;
                                    textAlign2 = textAlign;
                                    j9 = j5;
                                    iN = i2;
                                    i31 = i3;
                                    i32 = i5;
                                    mapEmptyMap = map;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    fontStyle3 = fontStyle2;
                                    j6 = jN;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    i33 = i28;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(2027001676, i10, i33, "androidx.compose.material3.Text (Text.kt:255)");
                                }
                                composerKN.eF(-1827697581);
                                if (jUo == 16) {
                                    j10 = jUo;
                                } else {
                                    composerKN.eF(-1827696808);
                                    long jKN = textStyle2.KN();
                                    if (jKN == 16) {
                                        jKN = ((Color) composerKN.ty(ContentColorKt.n())).getValue();
                                    }
                                    composerKN.Xw();
                                    j10 = jKN;
                                }
                                composerKN.Xw();
                                int i40 = (i10 & 126) | ((i33 >> 9) & 7168);
                                int i41 = i33 << 9;
                                Modifier modifier5 = modifier2;
                                BasicTextKt.O(annotatedString, modifier5, textStyle2.s7N((16609105 & 1) != 0 ? Color.INSTANCE.Uo() : j10, (16609105 & 2) != 0 ? TextUnit.INSTANCE.n() : j6, (16609105 & 4) != 0 ? null : fontWeight3, (16609105 & 8) != 0 ? null : fontStyle3, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily3, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.n() : j7, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.Uo() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.Uo() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.Uo(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.J2() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.n() : j9, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.rl() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.t() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null), function12, iN, z3, i31, i32, mapEmptyMap, null, composerKN, (i41 & 234881024) | i40 | (57344 & i41) | (458752 & i41) | (3670016 & i41) | (29360128 & i41), 512);
                                modifier3 = modifier5;
                                composer2 = composerKN;
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                textAlign3 = textAlign2;
                                map2 = mapEmptyMap;
                                i34 = iN;
                                i35 = i31;
                                function13 = function12;
                                textStyle3 = textStyle2;
                                fontWeight4 = fontWeight3;
                                fontStyle4 = fontStyle3;
                                fontFamily4 = fontFamily3;
                                j11 = j7;
                                j12 = j9;
                                z4 = z3;
                                i36 = i32;
                                j13 = j6;
                                textDecoration3 = textDecoration2;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                final long j14 = jUo;
                                final Modifier modifier6 = modifier3;
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i42) {
                                        TextKt.nr(annotatedString, modifier6, j14, j13, fontStyle4, fontWeight4, fontFamily4, j11, textDecoration3, textAlign3, j12, i34, z4, i35, i36, map2, function13, textStyle3, composer3, RecomposeScopeImplKt.n(i7 | 1), RecomposeScopeImplKt.n(i8), i9);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i28 = i26 | 24576;
                        i29 = i9 & 32768;
                        if (i29 == 0) {
                        }
                        i30 = i9 & 65536;
                        if (i30 == 0) {
                        }
                        if ((i8 & 12582912) == 0) {
                        }
                        if ((i10 & 306783379) != 306783378) {
                            composerKN.e();
                            if ((i7 & 1) != 0) {
                                if (i37 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 != 0) {
                                }
                                if (i13 != 0) {
                                }
                                if (i14 != 0) {
                                }
                                if (i15 != 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if (i23 == 0) {
                                }
                                if (i24 != 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                if (i29 == 0) {
                                }
                                if (i30 == 0) {
                                }
                                Modifier modifier42 = modifier2;
                                if ((i9 & 131072) == 0) {
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                composerKN.eF(-1827697581);
                                if (jUo == 16) {
                                }
                                composerKN.Xw();
                                int i402 = (i10 & 126) | ((i33 >> 9) & 7168);
                                int i412 = i33 << 9;
                                Modifier modifier52 = modifier2;
                                BasicTextKt.O(annotatedString, modifier52, textStyle2.s7N((16609105 & 1) != 0 ? Color.INSTANCE.Uo() : j10, (16609105 & 2) != 0 ? TextUnit.INSTANCE.n() : j6, (16609105 & 4) != 0 ? null : fontWeight3, (16609105 & 8) != 0 ? null : fontStyle3, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily3, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.n() : j7, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.Uo() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.Uo() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.Uo(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.J2() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.n() : j9, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.rl() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.t() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null), function12, iN, z3, i31, i32, mapEmptyMap, null, composerKN, (i412 & 234881024) | i402 | (57344 & i412) | (458752 & i412) | (3670016 & i412) | (29360128 & i412), 512);
                                modifier3 = modifier52;
                                composer2 = composerKN;
                                if (ComposerKt.v()) {
                                }
                                textAlign3 = textAlign2;
                                map2 = mapEmptyMap;
                                i34 = iN;
                                i35 = i31;
                                function13 = function12;
                                textStyle3 = textStyle2;
                                fontWeight4 = fontWeight3;
                                fontStyle4 = fontStyle3;
                                fontFamily4 = fontFamily3;
                                j11 = j7;
                                j12 = j9;
                                z4 = z3;
                                i36 = i32;
                                j13 = j6;
                                textDecoration3 = textDecoration2;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    z3 = z2;
                    i25 = i9 & 8192;
                    if (i25 != 0) {
                    }
                    i27 = i9 & 16384;
                    if (i27 == 0) {
                    }
                    i29 = i9 & 32768;
                    if (i29 == 0) {
                    }
                    i30 = i9 & 65536;
                    if (i30 == 0) {
                    }
                    if ((i8 & 12582912) == 0) {
                    }
                    if ((i10 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                i19 = i18;
                i20 = i9 & 1024;
                if (i20 == 0) {
                }
                i22 = i9 & 2048;
                if (i22 == 0) {
                }
                int i382 = i21;
                i24 = i9 & 4096;
                if (i24 == 0) {
                }
                z3 = z2;
                i25 = i9 & 8192;
                if (i25 != 0) {
                }
                i27 = i9 & 16384;
                if (i27 == 0) {
                }
                i29 = i9 & 32768;
                if (i29 == 0) {
                }
                i30 = i9 & 65536;
                if (i30 == 0) {
                }
                if ((i8 & 12582912) == 0) {
                }
                if ((i10 & 306783379) != 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            fontStyle2 = fontStyle;
            i14 = i9 & 32;
            if (i14 != 0) {
            }
            i15 = i9 & 64;
            if (i15 != 0) {
            }
            i16 = i9 & 128;
            if (i16 != 0) {
            }
            i17 = i9 & 256;
            if (i17 != 0) {
            }
            i18 = i9 & 512;
            if (i18 != 0) {
            }
            i19 = i18;
            i20 = i9 & 1024;
            if (i20 == 0) {
            }
            i22 = i9 & 2048;
            if (i22 == 0) {
            }
            int i3822 = i21;
            i24 = i9 & 4096;
            if (i24 == 0) {
            }
            z3 = z2;
            i25 = i9 & 8192;
            if (i25 != 0) {
            }
            i27 = i9 & 16384;
            if (i27 == 0) {
            }
            i29 = i9 & 32768;
            if (i29 == 0) {
            }
            i30 = i9 & 65536;
            if (i30 == 0) {
            }
            if ((i8 & 12582912) == 0) {
            }
            if ((i10 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i11 = i9 & 4;
        if (i11 == 0) {
        }
        i12 = i9 & 8;
        if (i12 == 0) {
        }
        i13 = i9 & 16;
        if (i13 == 0) {
        }
        fontStyle2 = fontStyle;
        i14 = i9 & 32;
        if (i14 != 0) {
        }
        i15 = i9 & 64;
        if (i15 != 0) {
        }
        i16 = i9 & 128;
        if (i16 != 0) {
        }
        i17 = i9 & 256;
        if (i17 != 0) {
        }
        i18 = i9 & 512;
        if (i18 != 0) {
        }
        i19 = i18;
        i20 = i9 & 1024;
        if (i20 == 0) {
        }
        i22 = i9 & 2048;
        if (i22 == 0) {
        }
        int i38222 = i21;
        i24 = i9 & 4096;
        if (i24 == 0) {
        }
        z3 = z2;
        i25 = i9 & 8192;
        if (i25 != 0) {
        }
        i27 = i9 & 16384;
        if (i27 == 0) {
        }
        i29 = i9 & 32768;
        if (i29 == 0) {
        }
        i30 = i9 & 65536;
        if (i30 == 0) {
        }
        if ((i8 & 12582912) == 0) {
        }
        if ((i10 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void rl(final AnnotatedString annotatedString, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, Map map, Function1 function1, TextStyle textStyle, Composer composer, final int i5, final int i7, final int i8) {
        int i9;
        int i10;
        long jUo;
        int i11;
        int i12;
        long jN;
        int i13;
        FontStyle fontStyle2;
        int i14;
        FontWeight fontWeight2;
        int i15;
        FontFamily fontFamily2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z3;
        int i28;
        int i29;
        int i30;
        int i31;
        TextStyle textStyle2;
        int i32;
        Function1 function12;
        long j6;
        Map map2;
        Modifier modifier2;
        TextAlign textAlign2;
        boolean z4;
        long j7;
        int i33;
        TextDecoration textDecoration2;
        long j9;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j10;
        Composer composer2;
        final Modifier modifier3;
        final long j11;
        final long j12;
        final FontStyle fontStyle3;
        final FontWeight fontWeight4;
        final FontFamily fontFamily4;
        final long j13;
        final TextDecoration textDecoration3;
        final TextAlign textAlign3;
        final long j14;
        final int i34;
        final boolean z5;
        final int i35;
        final Map map3;
        final Function1 function13;
        final TextStyle textStyle3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(224529679);
        if ((i8 & 1) != 0) {
            i9 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i9 = (composerKN.p5(annotatedString) ? 4 : 2) | i5;
        } else {
            i9 = i5;
        }
        int i36 = i8 & 2;
        if (i36 != 0) {
            i9 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                i9 |= composerKN.p5(modifier) ? 32 : 16;
            }
            i10 = i8 & 4;
            if (i10 == 0) {
                i11 = i9 | RendererCapabilities.DECODER_SUPPORT_MASK;
                jUo = j2;
            } else {
                int i37 = i9;
                jUo = j2;
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i37 |= composerKN.nr(jUo) ? 256 : 128;
                }
                i11 = i37;
            }
            i12 = i8 & 8;
            if (i12 == 0) {
                i11 |= 3072;
                jN = j3;
            } else {
                jN = j3;
                if ((i5 & 3072) == 0) {
                    i11 |= composerKN.nr(jN) ? 2048 : 1024;
                }
            }
            i13 = i8 & 16;
            if (i13 == 0) {
                i11 |= 24576;
            } else {
                if ((i5 & 24576) == 0) {
                    fontStyle2 = fontStyle;
                    i11 |= composerKN.p5(fontStyle2) ? 16384 : 8192;
                }
                i14 = i8 & 32;
                if (i14 != 0) {
                    i11 |= 196608;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i5 & 196608) == 0) {
                        i11 |= composerKN.p5(fontWeight2) ? 131072 : 65536;
                    }
                }
                i15 = i8 & 64;
                if (i15 != 0) {
                    i11 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i5 & 1572864) == 0) {
                        i11 |= composerKN.p5(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i16 = i8 & 128;
                if (i16 != 0) {
                    i11 |= 12582912;
                } else {
                    if ((i5 & 12582912) == 0) {
                        i17 = i11 | (composerKN.nr(j4) ? 8388608 : 4194304);
                    }
                    i18 = i8 & 256;
                    if (i18 == 0) {
                        i17 |= 100663296;
                    } else {
                        if ((i5 & 100663296) == 0) {
                            i19 = i18;
                            i17 |= composerKN.p5(textDecoration) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i20 = i8 & 512;
                        if (i20 != 0) {
                            i17 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            i21 = i20;
                        } else if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i21 = i20;
                            i17 |= composerKN.p5(textAlign) ? 536870912 : 268435456;
                        } else {
                            i21 = i20;
                        }
                        i22 = i17;
                        i23 = i8 & 1024;
                        if (i23 != 0) {
                            i24 = i7 | 6;
                        } else if ((i7 & 6) == 0) {
                            i24 = i7 | (composerKN.nr(j5) ? 4 : 2);
                        } else {
                            i24 = i7;
                        }
                        i25 = i8 & 2048;
                        if (i25 != 0) {
                            i24 |= 48;
                            i26 = i25;
                        } else if ((i7 & 48) == 0) {
                            i26 = i25;
                            i24 |= composerKN.t(i2) ? 32 : 16;
                        } else {
                            i26 = i25;
                        }
                        int i38 = i24;
                        i27 = i8 & 4096;
                        if (i27 != 0) {
                            i38 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else {
                            if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                z3 = z2;
                                i38 |= composerKN.n(z3) ? 256 : 128;
                            }
                            i28 = i8 & 8192;
                            if (i28 == 0) {
                                i29 = i38 | 3072;
                            } else {
                                int i39 = i38;
                                if ((i7 & 3072) == 0) {
                                    i29 = i39 | (composerKN.t(i3) ? 2048 : 1024);
                                } else {
                                    i29 = i39;
                                }
                            }
                            i30 = i8 & 16384;
                            if (i30 != 0) {
                                if ((i7 & 24576) == 0) {
                                    i29 |= composerKN.E2(map) ? 16384 : 8192;
                                }
                                i31 = i8 & 32768;
                                if (i31 != 0) {
                                    i29 |= 196608;
                                } else if ((i7 & 196608) == 0) {
                                    i29 |= composerKN.E2(function1) ? 131072 : 65536;
                                }
                                if ((i7 & 1572864) == 0) {
                                    i29 |= ((i8 & 65536) == 0 && composerKN.p5(textStyle)) ? 1048576 : 524288;
                                }
                                if ((i22 & 306783379) == 306783378 && (599187 & i29) == 599186 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    modifier3 = modifier;
                                    textAlign3 = textAlign;
                                    i34 = i2;
                                    i35 = i3;
                                    map3 = map;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                    composer2 = composerKN;
                                    z5 = z3;
                                    j11 = jUo;
                                    fontStyle3 = fontStyle2;
                                    j12 = jN;
                                    fontWeight4 = fontWeight2;
                                    fontFamily4 = fontFamily2;
                                    j13 = j4;
                                    textDecoration3 = textDecoration;
                                    j14 = j5;
                                } else {
                                    composerKN.e();
                                    if ((i5 & 1) != 0 || composerKN.rV9()) {
                                        Modifier modifier4 = i36 == 0 ? Modifier.INSTANCE : modifier;
                                        if (i10 != 0) {
                                            jUo = Color.INSTANCE.Uo();
                                        }
                                        if (i12 != 0) {
                                            jN = TextUnit.INSTANCE.n();
                                        }
                                        if (i13 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i14 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i15 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long jN2 = i16 == 0 ? TextUnit.INSTANCE.n() : j4;
                                        TextDecoration textDecoration4 = i19 == 0 ? null : textDecoration;
                                        TextAlign textAlign4 = i21 == 0 ? textAlign : null;
                                        long jN3 = i23 == 0 ? TextUnit.INSTANCE.n() : j5;
                                        int iN = i26 == 0 ? TextOverflow.INSTANCE.n() : i2;
                                        if (i27 != 0) {
                                            z3 = true;
                                        }
                                        int i40 = i28 == 0 ? Integer.MAX_VALUE : i3;
                                        Map mapEmptyMap = i30 == 0 ? MapsKt.emptyMap() : map;
                                        Function1 function14 = i31 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$6
                                            public final void n(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                n(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function1;
                                        Modifier modifier5 = modifier4;
                                        if ((i8 & 65536) == 0) {
                                            i29 &= -3670017;
                                            textStyle2 = (TextStyle) composerKN.ty(f28473n);
                                        } else {
                                            textStyle2 = textStyle;
                                        }
                                        i32 = iN;
                                        function12 = function14;
                                        j6 = jN3;
                                        map2 = mapEmptyMap;
                                        modifier2 = modifier5;
                                        int i41 = i40;
                                        textAlign2 = textAlign4;
                                        long j15 = jN2;
                                        z4 = z3;
                                        j7 = jUo;
                                        i33 = i41;
                                        FontFamily fontFamily5 = fontFamily2;
                                        textDecoration2 = textDecoration4;
                                        j9 = jN;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily5;
                                        j10 = j15;
                                    } else {
                                        composerKN.wTp();
                                        if ((i8 & 65536) != 0) {
                                            i29 &= -3670017;
                                        }
                                        modifier2 = modifier;
                                        textAlign2 = textAlign;
                                        j6 = j5;
                                        i32 = i2;
                                        i33 = i3;
                                        map2 = map;
                                        function12 = function1;
                                        textStyle2 = textStyle;
                                        z4 = z3;
                                        j7 = jUo;
                                        j9 = jN;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily2;
                                        j10 = j4;
                                        textDecoration2 = textDecoration;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(224529679, i22, i29, "androidx.compose.material3.Text (Text.kt:305)");
                                    }
                                    int i42 = i29 << 3;
                                    composer2 = composerKN;
                                    nr(annotatedString, modifier2, j7, j9, fontStyle2, fontWeight3, fontFamily3, j10, textDecoration2, textAlign2, j6, i32, z4, i33, 1, map2, function12, textStyle2, composer2, i22 & 2147483646, (i29 & 14) | 24576 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (458752 & i42) | (3670016 & i42) | (i42 & 29360128), 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier3 = modifier2;
                                    j11 = j7;
                                    j12 = j9;
                                    fontStyle3 = fontStyle2;
                                    fontWeight4 = fontWeight3;
                                    fontFamily4 = fontFamily3;
                                    j13 = j10;
                                    textDecoration3 = textDecoration2;
                                    textAlign3 = textAlign2;
                                    j14 = j6;
                                    i34 = i32;
                                    z5 = z4;
                                    i35 = i33;
                                    map3 = map2;
                                    function13 = function12;
                                    textStyle3 = textStyle2;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$7
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i43) {
                                            TextKt.rl(annotatedString, modifier3, j11, j12, fontStyle3, fontWeight4, fontFamily4, j13, textDecoration3, textAlign3, j14, i34, z5, i35, map3, function13, textStyle3, composer3, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i29 |= 24576;
                            i31 = i8 & 32768;
                            if (i31 != 0) {
                            }
                            if ((i7 & 1572864) == 0) {
                            }
                            if ((i22 & 306783379) == 306783378) {
                                composerKN.e();
                                if ((i5 & 1) != 0) {
                                    if (i36 == 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if (i13 != 0) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    if (i15 != 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if (i26 == 0) {
                                    }
                                    if (i27 != 0) {
                                    }
                                    if (i28 == 0) {
                                    }
                                    if (i30 == 0) {
                                    }
                                    if (i31 == 0) {
                                    }
                                    Modifier modifier52 = modifier4;
                                    if ((i8 & 65536) == 0) {
                                    }
                                    i32 = iN;
                                    function12 = function14;
                                    j6 = jN3;
                                    map2 = mapEmptyMap;
                                    modifier2 = modifier52;
                                    int i412 = i40;
                                    textAlign2 = textAlign4;
                                    long j152 = jN2;
                                    z4 = z3;
                                    j7 = jUo;
                                    i33 = i412;
                                    FontFamily fontFamily52 = fontFamily2;
                                    textDecoration2 = textDecoration4;
                                    j9 = jN;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily52;
                                    j10 = j152;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                    }
                                    int i422 = i29 << 3;
                                    composer2 = composerKN;
                                    nr(annotatedString, modifier2, j7, j9, fontStyle2, fontWeight3, fontFamily3, j10, textDecoration2, textAlign2, j6, i32, z4, i33, 1, map2, function12, textStyle2, composer2, i22 & 2147483646, (i29 & 14) | 24576 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (458752 & i422) | (3670016 & i422) | (i422 & 29360128), 0);
                                    if (ComposerKt.v()) {
                                    }
                                    modifier3 = modifier2;
                                    j11 = j7;
                                    j12 = j9;
                                    fontStyle3 = fontStyle2;
                                    fontWeight4 = fontWeight3;
                                    fontFamily4 = fontFamily3;
                                    j13 = j10;
                                    textDecoration3 = textDecoration2;
                                    textAlign3 = textAlign2;
                                    j14 = j6;
                                    i34 = i32;
                                    z5 = z4;
                                    i35 = i33;
                                    map3 = map2;
                                    function13 = function12;
                                    textStyle3 = textStyle2;
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        z3 = z2;
                        i28 = i8 & 8192;
                        if (i28 == 0) {
                        }
                        i30 = i8 & 16384;
                        if (i30 != 0) {
                        }
                        i31 = i8 & 32768;
                        if (i31 != 0) {
                        }
                        if ((i7 & 1572864) == 0) {
                        }
                        if ((i22 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i19 = i18;
                    i20 = i8 & 512;
                    if (i20 != 0) {
                    }
                    i22 = i17;
                    i23 = i8 & 1024;
                    if (i23 != 0) {
                    }
                    i25 = i8 & 2048;
                    if (i25 != 0) {
                    }
                    int i382 = i24;
                    i27 = i8 & 4096;
                    if (i27 != 0) {
                    }
                    z3 = z2;
                    i28 = i8 & 8192;
                    if (i28 == 0) {
                    }
                    i30 = i8 & 16384;
                    if (i30 != 0) {
                    }
                    i31 = i8 & 32768;
                    if (i31 != 0) {
                    }
                    if ((i7 & 1572864) == 0) {
                    }
                    if ((i22 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i17 = i11;
                i18 = i8 & 256;
                if (i18 == 0) {
                }
                i19 = i18;
                i20 = i8 & 512;
                if (i20 != 0) {
                }
                i22 = i17;
                i23 = i8 & 1024;
                if (i23 != 0) {
                }
                i25 = i8 & 2048;
                if (i25 != 0) {
                }
                int i3822 = i24;
                i27 = i8 & 4096;
                if (i27 != 0) {
                }
                z3 = z2;
                i28 = i8 & 8192;
                if (i28 == 0) {
                }
                i30 = i8 & 16384;
                if (i30 != 0) {
                }
                i31 = i8 & 32768;
                if (i31 != 0) {
                }
                if ((i7 & 1572864) == 0) {
                }
                if ((i22 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            fontStyle2 = fontStyle;
            i14 = i8 & 32;
            if (i14 != 0) {
            }
            i15 = i8 & 64;
            if (i15 != 0) {
            }
            i16 = i8 & 128;
            if (i16 != 0) {
            }
            i17 = i11;
            i18 = i8 & 256;
            if (i18 == 0) {
            }
            i19 = i18;
            i20 = i8 & 512;
            if (i20 != 0) {
            }
            i22 = i17;
            i23 = i8 & 1024;
            if (i23 != 0) {
            }
            i25 = i8 & 2048;
            if (i25 != 0) {
            }
            int i38222 = i24;
            i27 = i8 & 4096;
            if (i27 != 0) {
            }
            z3 = z2;
            i28 = i8 & 8192;
            if (i28 == 0) {
            }
            i30 = i8 & 16384;
            if (i30 != 0) {
            }
            i31 = i8 & 32768;
            if (i31 != 0) {
            }
            if ((i7 & 1572864) == 0) {
            }
            if ((i22 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        i12 = i8 & 8;
        if (i12 == 0) {
        }
        i13 = i8 & 16;
        if (i13 == 0) {
        }
        fontStyle2 = fontStyle;
        i14 = i8 & 32;
        if (i14 != 0) {
        }
        i15 = i8 & 64;
        if (i15 != 0) {
        }
        i16 = i8 & 128;
        if (i16 != 0) {
        }
        i17 = i11;
        i18 = i8 & 256;
        if (i18 == 0) {
        }
        i19 = i18;
        i20 = i8 & 512;
        if (i20 != 0) {
        }
        i22 = i17;
        i23 = i8 & 1024;
        if (i23 != 0) {
        }
        i25 = i8 & 2048;
        if (i25 != 0) {
        }
        int i382222 = i24;
        i27 = i8 & 4096;
        if (i27 != 0) {
        }
        z3 = z2;
        i28 = i8 & 8192;
        if (i28 == 0) {
        }
        i30 = i8 & 16384;
        if (i30 != 0) {
        }
        i31 = i8 & 32768;
        if (i31 != 0) {
        }
        if ((i7 & 1572864) == 0) {
        }
        if ((i22 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final String str, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, int i5, Function1 function1, TextStyle textStyle, Composer composer, final int i7, final int i8, final int i9) {
        int i10;
        int i11;
        long jUo;
        int i12;
        int i13;
        long jN;
        int i14;
        FontStyle fontStyle2;
        int i15;
        FontWeight fontWeight2;
        int i16;
        FontFamily fontFamily2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z3;
        int i29;
        int i30;
        int i31;
        int i32;
        Modifier modifier2;
        final TextAlign textAlign2;
        final int iN;
        int i33;
        int i34;
        Function1 function12;
        TextStyle textStyle2;
        TextDecoration textDecoration2;
        FontStyle fontStyle3;
        long j6;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j7;
        long j9;
        long j10;
        Composer composer2;
        final Function1 function13;
        final long j11;
        final int i35;
        final int i36;
        final TextStyle textStyle3;
        final FontWeight fontWeight4;
        final FontStyle fontStyle4;
        final FontFamily fontFamily4;
        final long j12;
        final TextDecoration textDecoration3;
        final long j13;
        final Modifier modifier3;
        final boolean z4;
        final long j14;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-2055108902);
        if ((i9 & 1) != 0) {
            i10 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i10 = (composerKN.p5(str) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        int i37 = i9 & 2;
        if (i37 != 0) {
            i10 |= 48;
        } else {
            if ((i7 & 48) == 0) {
                i10 |= composerKN.p5(modifier) ? 32 : 16;
            }
            i11 = i9 & 4;
            if (i11 == 0) {
                i12 = i10 | RendererCapabilities.DECODER_SUPPORT_MASK;
                jUo = j2;
            } else {
                int i38 = i10;
                jUo = j2;
                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i38 |= composerKN.nr(jUo) ? 256 : 128;
                }
                i12 = i38;
            }
            i13 = i9 & 8;
            if (i13 == 0) {
                i12 |= 3072;
                jN = j3;
            } else {
                jN = j3;
                if ((i7 & 3072) == 0) {
                    i12 |= composerKN.nr(jN) ? 2048 : 1024;
                }
            }
            i14 = i9 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else {
                if ((i7 & 24576) == 0) {
                    fontStyle2 = fontStyle;
                    i12 |= composerKN.p5(fontStyle2) ? 16384 : 8192;
                }
                i15 = i9 & 32;
                if (i15 != 0) {
                    i12 |= 196608;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i7 & 196608) == 0) {
                        i12 |= composerKN.p5(fontWeight2) ? 131072 : 65536;
                    }
                }
                i16 = i9 & 64;
                if (i16 != 0) {
                    i12 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i7 & 1572864) == 0) {
                        i12 |= composerKN.p5(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i17 = i9 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else {
                    if ((i7 & 12582912) == 0) {
                        i18 = i12 | (composerKN.nr(j4) ? 8388608 : 4194304);
                    }
                    i19 = i9 & 256;
                    if (i19 == 0) {
                        i18 |= 100663296;
                    } else {
                        if ((i7 & 100663296) == 0) {
                            i20 = i19;
                            i18 |= composerKN.p5(textDecoration) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i21 = i9 & 512;
                        if (i21 != 0) {
                            i18 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            i22 = i21;
                        } else if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i22 = i21;
                            i18 |= composerKN.p5(textAlign) ? 536870912 : 268435456;
                        } else {
                            i22 = i21;
                        }
                        i23 = i18;
                        i24 = i9 & 1024;
                        if (i24 != 0) {
                            i25 = i8 | 6;
                        } else if ((i8 & 6) == 0) {
                            i25 = i8 | (composerKN.nr(j5) ? 4 : 2);
                        } else {
                            i25 = i8;
                        }
                        i26 = i9 & 2048;
                        if (i26 != 0) {
                            i25 |= 48;
                            i27 = i26;
                        } else if ((i8 & 48) == 0) {
                            i27 = i26;
                            i25 |= composerKN.t(i2) ? 32 : 16;
                        } else {
                            i27 = i26;
                        }
                        int i39 = i25;
                        i28 = i9 & 4096;
                        if (i28 != 0) {
                            i39 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else {
                            if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                z3 = z2;
                                i39 |= composerKN.n(z3) ? 256 : 128;
                            }
                            i29 = i9 & 8192;
                            if (i29 == 0) {
                                i30 = i39 | 3072;
                            } else {
                                int i40 = i39;
                                if ((i8 & 3072) == 0) {
                                    i30 = i40 | (composerKN.t(i3) ? 2048 : 1024);
                                } else {
                                    i30 = i40;
                                }
                            }
                            i31 = i9 & 16384;
                            if (i31 != 0) {
                                if ((i8 & 24576) == 0) {
                                    i30 |= composerKN.t(i5) ? 16384 : 8192;
                                }
                                i32 = i9 & 32768;
                                if (i32 != 0) {
                                    i30 |= 196608;
                                } else if ((i8 & 196608) == 0) {
                                    i30 |= composerKN.E2(function1) ? 131072 : 65536;
                                }
                                if ((i8 & 1572864) == 0) {
                                    i30 |= ((i9 & 65536) == 0 && composerKN.p5(textStyle)) ? 1048576 : 524288;
                                }
                                if ((i23 & 306783379) == 306783378 && (599187 & i30) == 599186 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    modifier3 = modifier;
                                    textAlign2 = textAlign;
                                    iN = i2;
                                    i35 = i3;
                                    i36 = i5;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                    composer2 = composerKN;
                                    z4 = z3;
                                    j11 = jUo;
                                    fontStyle4 = fontStyle2;
                                    j14 = jN;
                                    fontWeight4 = fontWeight2;
                                    fontFamily4 = fontFamily2;
                                    j12 = j4;
                                    textDecoration3 = textDecoration;
                                    j13 = j5;
                                } else {
                                    composerKN.e();
                                    if ((i7 & 1) != 0 || composerKN.rV9()) {
                                        modifier2 = i37 == 0 ? Modifier.INSTANCE : modifier;
                                        if (i11 != 0) {
                                            jUo = Color.INSTANCE.Uo();
                                        }
                                        if (i13 != 0) {
                                            jN = TextUnit.INSTANCE.n();
                                        }
                                        if (i14 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i15 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i16 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long jN2 = i17 == 0 ? TextUnit.INSTANCE.n() : j4;
                                        TextDecoration textDecoration4 = i20 == 0 ? null : textDecoration;
                                        textAlign2 = i22 == 0 ? null : textAlign;
                                        long jN3 = i24 == 0 ? TextUnit.INSTANCE.n() : j5;
                                        iN = i27 == 0 ? TextOverflow.INSTANCE.n() : i2;
                                        if (i28 != 0) {
                                            z3 = true;
                                        }
                                        i33 = i29 == 0 ? Integer.MAX_VALUE : i3;
                                        i34 = i31 == 0 ? i5 : 1;
                                        function12 = i32 == 0 ? function1 : null;
                                        if ((i9 & 65536) == 0) {
                                            i30 &= -3670017;
                                            textStyle2 = (TextStyle) composerKN.ty(f28473n);
                                        } else {
                                            textStyle2 = textStyle;
                                        }
                                        textDecoration2 = textDecoration4;
                                        fontStyle3 = fontStyle2;
                                        j6 = jN;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily2;
                                        j7 = jN2;
                                        j9 = jN3;
                                    } else {
                                        composerKN.wTp();
                                        if ((i9 & 65536) != 0) {
                                            i30 &= -3670017;
                                        }
                                        modifier2 = modifier;
                                        j7 = j4;
                                        textDecoration2 = textDecoration;
                                        textAlign2 = textAlign;
                                        j9 = j5;
                                        iN = i2;
                                        i33 = i3;
                                        i34 = i5;
                                        function12 = function1;
                                        textStyle2 = textStyle;
                                        fontStyle3 = fontStyle2;
                                        j6 = jN;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily2;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-2055108902, i23, i30, "androidx.compose.material3.Text (Text.kt:109)");
                                    }
                                    composerKN.eF(-1827892941);
                                    if (jUo == 16) {
                                        j10 = jUo;
                                    } else {
                                        composerKN.eF(-1827892168);
                                        long jKN = textStyle2.KN();
                                        if (jKN == 16) {
                                            jKN = ((Color) composerKN.ty(ContentColorKt.n())).getValue();
                                        }
                                        composerKN.Xw();
                                        j10 = jKN;
                                    }
                                    composerKN.Xw();
                                    int i41 = (i23 & 126) | ((i30 >> 6) & 7168);
                                    int i42 = i30 << 9;
                                    BasicTextKt.KN(str, modifier2, textStyle2.s7N((16609105 & 1) != 0 ? Color.INSTANCE.Uo() : j10, (16609105 & 2) != 0 ? TextUnit.INSTANCE.n() : j6, (16609105 & 4) != 0 ? null : fontWeight3, (16609105 & 8) != 0 ? null : fontStyle3, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily3, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.n() : j7, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.Uo() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.Uo() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.Uo(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.J2() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.n() : j9, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.rl() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.t() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null), function12, iN, z3, i33, i34, null, composerKN, i41 | (57344 & i42) | (458752 & i42) | (3670016 & i42) | (i42 & 29360128), 256);
                                    composer2 = composerKN;
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    function13 = function12;
                                    j11 = jUo;
                                    i35 = i33;
                                    i36 = i34;
                                    textStyle3 = textStyle2;
                                    fontWeight4 = fontWeight3;
                                    fontStyle4 = fontStyle3;
                                    fontFamily4 = fontFamily3;
                                    j12 = j7;
                                    textDecoration3 = textDecoration2;
                                    j13 = j9;
                                    modifier3 = modifier2;
                                    z4 = z3;
                                    j14 = j6;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i43) {
                                            TextKt.t(str, modifier3, j11, j14, fontStyle4, fontWeight4, fontFamily4, j12, textDecoration3, textAlign2, j13, iN, z4, i35, i36, function13, textStyle3, composer3, RecomposeScopeImplKt.n(i7 | 1), RecomposeScopeImplKt.n(i8), i9);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i30 |= 24576;
                            i32 = i9 & 32768;
                            if (i32 != 0) {
                            }
                            if ((i8 & 1572864) == 0) {
                            }
                            if ((i23 & 306783379) == 306783378) {
                                composerKN.e();
                                if ((i7 & 1) != 0) {
                                    if (i37 == 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i13 != 0) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    if (i15 != 0) {
                                    }
                                    if (i16 != 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    if (i27 == 0) {
                                    }
                                    if (i28 != 0) {
                                    }
                                    if (i29 == 0) {
                                    }
                                    if (i31 == 0) {
                                    }
                                    if (i32 == 0) {
                                    }
                                    if ((i9 & 65536) == 0) {
                                    }
                                    textDecoration2 = textDecoration4;
                                    fontStyle3 = fontStyle2;
                                    j6 = jN;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j7 = jN2;
                                    j9 = jN3;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                    }
                                    composerKN.eF(-1827892941);
                                    if (jUo == 16) {
                                    }
                                    composerKN.Xw();
                                    int i412 = (i23 & 126) | ((i30 >> 6) & 7168);
                                    int i422 = i30 << 9;
                                    BasicTextKt.KN(str, modifier2, textStyle2.s7N((16609105 & 1) != 0 ? Color.INSTANCE.Uo() : j10, (16609105 & 2) != 0 ? TextUnit.INSTANCE.n() : j6, (16609105 & 4) != 0 ? null : fontWeight3, (16609105 & 8) != 0 ? null : fontStyle3, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily3, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.n() : j7, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.Uo() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.Uo() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.Uo(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.J2() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.n() : j9, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.rl() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.t() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null), function12, iN, z3, i33, i34, null, composerKN, i412 | (57344 & i422) | (458752 & i422) | (3670016 & i422) | (i422 & 29360128), 256);
                                    composer2 = composerKN;
                                    if (ComposerKt.v()) {
                                    }
                                    function13 = function12;
                                    j11 = jUo;
                                    i35 = i33;
                                    i36 = i34;
                                    textStyle3 = textStyle2;
                                    fontWeight4 = fontWeight3;
                                    fontStyle4 = fontStyle3;
                                    fontFamily4 = fontFamily3;
                                    j12 = j7;
                                    textDecoration3 = textDecoration2;
                                    j13 = j9;
                                    modifier3 = modifier2;
                                    z4 = z3;
                                    j14 = j6;
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        z3 = z2;
                        i29 = i9 & 8192;
                        if (i29 == 0) {
                        }
                        i31 = i9 & 16384;
                        if (i31 != 0) {
                        }
                        i32 = i9 & 32768;
                        if (i32 != 0) {
                        }
                        if ((i8 & 1572864) == 0) {
                        }
                        if ((i23 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i20 = i19;
                    i21 = i9 & 512;
                    if (i21 != 0) {
                    }
                    i23 = i18;
                    i24 = i9 & 1024;
                    if (i24 != 0) {
                    }
                    i26 = i9 & 2048;
                    if (i26 != 0) {
                    }
                    int i392 = i25;
                    i28 = i9 & 4096;
                    if (i28 != 0) {
                    }
                    z3 = z2;
                    i29 = i9 & 8192;
                    if (i29 == 0) {
                    }
                    i31 = i9 & 16384;
                    if (i31 != 0) {
                    }
                    i32 = i9 & 32768;
                    if (i32 != 0) {
                    }
                    if ((i8 & 1572864) == 0) {
                    }
                    if ((i23 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i18 = i12;
                i19 = i9 & 256;
                if (i19 == 0) {
                }
                i20 = i19;
                i21 = i9 & 512;
                if (i21 != 0) {
                }
                i23 = i18;
                i24 = i9 & 1024;
                if (i24 != 0) {
                }
                i26 = i9 & 2048;
                if (i26 != 0) {
                }
                int i3922 = i25;
                i28 = i9 & 4096;
                if (i28 != 0) {
                }
                z3 = z2;
                i29 = i9 & 8192;
                if (i29 == 0) {
                }
                i31 = i9 & 16384;
                if (i31 != 0) {
                }
                i32 = i9 & 32768;
                if (i32 != 0) {
                }
                if ((i8 & 1572864) == 0) {
                }
                if ((i23 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            fontStyle2 = fontStyle;
            i15 = i9 & 32;
            if (i15 != 0) {
            }
            i16 = i9 & 64;
            if (i16 != 0) {
            }
            i17 = i9 & 128;
            if (i17 != 0) {
            }
            i18 = i12;
            i19 = i9 & 256;
            if (i19 == 0) {
            }
            i20 = i19;
            i21 = i9 & 512;
            if (i21 != 0) {
            }
            i23 = i18;
            i24 = i9 & 1024;
            if (i24 != 0) {
            }
            i26 = i9 & 2048;
            if (i26 != 0) {
            }
            int i39222 = i25;
            i28 = i9 & 4096;
            if (i28 != 0) {
            }
            z3 = z2;
            i29 = i9 & 8192;
            if (i29 == 0) {
            }
            i31 = i9 & 16384;
            if (i31 != 0) {
            }
            i32 = i9 & 32768;
            if (i32 != 0) {
            }
            if ((i8 & 1572864) == 0) {
            }
            if ((i23 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i11 = i9 & 4;
        if (i11 == 0) {
        }
        i13 = i9 & 8;
        if (i13 == 0) {
        }
        i14 = i9 & 16;
        if (i14 == 0) {
        }
        fontStyle2 = fontStyle;
        i15 = i9 & 32;
        if (i15 != 0) {
        }
        i16 = i9 & 64;
        if (i16 != 0) {
        }
        i17 = i9 & 128;
        if (i17 != 0) {
        }
        i18 = i12;
        i19 = i9 & 256;
        if (i19 == 0) {
        }
        i20 = i19;
        i21 = i9 & 512;
        if (i21 != 0) {
        }
        i23 = i18;
        i24 = i9 & 1024;
        if (i24 != 0) {
        }
        i26 = i9 & 2048;
        if (i26 != 0) {
        }
        int i392222 = i25;
        i28 = i9 & 4096;
        if (i28 != 0) {
        }
        z3 = z2;
        i29 = i9 & 8192;
        if (i29 == 0) {
        }
        i31 = i9 & 16384;
        if (i31 != 0) {
        }
        i32 = i9 & 32768;
        if (i32 != 0) {
        }
        if ((i8 & 1572864) == 0) {
        }
        if ((i23 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final ProvidableCompositionLocal J2() {
        return f28473n;
    }

    public static final void n(final TextStyle textStyle, final Function2 function2, Composer composer, final int i2) {
        int i3;
        int i5;
        int i7;
        Composer composerKN = composer.KN(-460300127);
        if ((i2 & 6) == 0) {
            if (composerKN.p5(textStyle)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(function2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-460300127, i3, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:346)");
            }
            ProvidableCompositionLocal providableCompositionLocal = f28473n;
            CompositionLocalKt.rl(providableCompositionLocal.nr(((TextStyle) composerKN.ty(providableCompositionLocal)).nHg(textStyle)), function2, composerKN, (i3 & 112) | ProvidedValue.xMQ);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$ProvideTextStyle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    TextKt.n(textStyle, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
