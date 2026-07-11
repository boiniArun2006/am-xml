package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
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
import androidx.compose.ui.graphics.ColorProducer;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÒ\u0001\u0010!\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aÆ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aæ\u0001\u0010)\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020%2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020'0&2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aÜ\u0001\u0010+\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020%2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020'0&2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a*\u00101\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001f2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u001d0.¢\u0006\u0002\b/H\u0007¢\u0006\u0004\b1\u00102\"\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u001f038\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b5\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/unit/TextUnit;", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontFamily;", TtmlNode.ATTR_TTS_FONT_FAMILY, "letterSpacing", "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextAlign;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "lineHeight", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/TextStyle;", "style", "t", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "O", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "nr", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "rl", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "J2", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTextStyle", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nandroidx/compose/material/TextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,405:1\n75#2:406\n75#2:407\n75#2:408\n75#2:417\n75#2:418\n75#2:419\n75#2:420\n75#2:429\n75#2:430\n696#3:409\n696#3:410\n696#3:421\n696#3:422\n1247#4,6:411\n1247#4,6:423\n*S KotlinDebug\n*F\n+ 1 Text.kt\nandroidx/compose/material/TextKt\n*L\n110#1:406\n129#1:407\n130#1:408\n184#1:417\n283#1:418\n302#1:419\n303#1:420\n359#1:429\n402#1:430\n132#1:409\n134#1:410\n305#1:421\n307#1:422\n159#1:411,6\n333#1:423,6\n*E\n"})
public final class TextKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f23751n = CompositionLocalKt.nr(SnapshotStateKt.r(), new Function0<TextStyle>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final TextStyle invoke() {
            return TypographyKt.rl();
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
    /* JADX WARN: Removed duplicated region for block: B:175:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
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
        Composer composer2;
        final Modifier modifier2;
        final TextAlign textAlign2;
        final int i31;
        final int i32;
        final Function1 function12;
        final TextStyle textStyle2;
        final boolean z4;
        final long j6;
        final FontStyle fontStyle3;
        final long j7;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j9;
        final TextDecoration textDecoration2;
        final long j10;
        ScopeUpdateScope scopeUpdateScopeGh;
        TextAlign textAlign3;
        boolean z5;
        long j11;
        TextStyle textStyle3;
        Function1 function13;
        int i33;
        Modifier modifier3;
        int i34;
        long j12;
        TextDecoration textDecoration3;
        long j13;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        long j14;
        Composer composerKN = composer.KN(-366126944);
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
                                if (composerKN.HI(((i22 & 306783379) == 306783378 && (74899 & i29) == 74898) ? false : true, i22 & 1)) {
                                    composerKN.e();
                                    if ((i5 & 1) == 0 || composerKN.rV9()) {
                                        Modifier modifier4 = i35 != 0 ? Modifier.INSTANCE : modifier;
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
                                        long jN2 = i16 != 0 ? TextUnit.INSTANCE.n() : j4;
                                        TextDecoration textDecoration4 = i19 != 0 ? null : textDecoration;
                                        TextAlign textAlign4 = i21 == 0 ? textAlign : null;
                                        long jN3 = i23 != 0 ? TextUnit.INSTANCE.n() : j5;
                                        int iN = i26 != 0 ? TextOverflow.INSTANCE.n() : i2;
                                        boolean z6 = i27 == 0 ? z3 : true;
                                        int i40 = i28 != 0 ? Integer.MAX_VALUE : i3;
                                        Function1 function14 = i30 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                            public final void n(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                n(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function1;
                                        Modifier modifier5 = modifier4;
                                        if ((i8 & 32768) != 0) {
                                            i29 &= -458753;
                                            textAlign3 = textAlign4;
                                            z5 = z6;
                                            j11 = jN3;
                                            textStyle3 = (TextStyle) composerKN.ty(f23751n);
                                        } else {
                                            textAlign3 = textAlign4;
                                            z5 = z6;
                                            j11 = jN3;
                                            textStyle3 = textStyle;
                                        }
                                        function13 = function14;
                                        i33 = iN;
                                        modifier3 = modifier5;
                                        long j15 = jN2;
                                        i34 = i40;
                                        j12 = jUo;
                                        FontFamily fontFamily5 = fontFamily2;
                                        textDecoration3 = textDecoration4;
                                        j13 = jN;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily5;
                                        j14 = j15;
                                    } else {
                                        composerKN.wTp();
                                        if ((i8 & 32768) != 0) {
                                            i29 &= -458753;
                                        }
                                        modifier3 = modifier;
                                        textAlign3 = textAlign;
                                        j11 = j5;
                                        i33 = i2;
                                        i34 = i3;
                                        function13 = function1;
                                        textStyle3 = textStyle;
                                        z5 = z3;
                                        j12 = jUo;
                                        j13 = jN;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j14 = j4;
                                        textDecoration3 = textDecoration;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-366126944, i22, i29, "androidx.compose.material.Text (Text.kt:184)");
                                    }
                                    int i41 = i29 << 3;
                                    composer2 = composerKN;
                                    t(str, modifier3, j12, j13, fontStyle2, fontWeight4, fontFamily4, j14, textDecoration3, textAlign3, j11, i33, z5, i34, 1, function13, textStyle3, composer2, i22 & 2147483646, (i29 & 14) | 24576 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (458752 & i41) | (i41 & 3670016), 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier2 = modifier3;
                                    j6 = j12;
                                    j7 = j13;
                                    fontStyle3 = fontStyle2;
                                    fontWeight3 = fontWeight4;
                                    fontFamily3 = fontFamily4;
                                    j9 = j14;
                                    textDecoration2 = textDecoration3;
                                    textAlign2 = textAlign3;
                                    j10 = j11;
                                    i31 = i33;
                                    z4 = z5;
                                    i32 = i34;
                                    function12 = function13;
                                    textStyle2 = textStyle3;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    i31 = i2;
                                    i32 = i3;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    z4 = z3;
                                    j6 = jUo;
                                    fontStyle3 = fontStyle2;
                                    j7 = jN;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j9 = j4;
                                    textDecoration2 = textDecoration;
                                    j10 = j5;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
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
                                            TextKt.O(str, modifier2, j6, j7, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration2, textAlign2, j10, i31, z4, i32, function12, textStyle2, composer3, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i29 |= 24576;
                            if ((i7 & 196608) == 0) {
                            }
                            if (composerKN.HI(((i22 & 306783379) == 306783378 && (74899 & i29) == 74898) ? false : true, i22 & 1)) {
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
                        if (composerKN.HI(((i22 & 306783379) == 306783378 && (74899 & i29) == 74898) ? false : true, i22 & 1)) {
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
                    if (composerKN.HI(((i22 & 306783379) == 306783378 && (74899 & i29) == 74898) ? false : true, i22 & 1)) {
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
                if (composerKN.HI(((i22 & 306783379) == 306783378 && (74899 & i29) == 74898) ? false : true, i22 & 1)) {
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
            if (composerKN.HI(((i22 & 306783379) == 306783378 && (74899 & i29) == 74898) ? false : true, i22 & 1)) {
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
        if (composerKN.HI(((i22 & 306783379) == 306783378 && (74899 & i29) == 74898) ? false : true, i22 & 1)) {
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
    /* JADX WARN: Removed duplicated region for block: B:192:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
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
        Composer composer2;
        Modifier modifier2;
        long jUo;
        final TextDecoration textDecoration2;
        final int i31;
        final int i32;
        final int i33;
        final Map map2;
        final Function1 function12;
        final TextStyle textStyle2;
        final boolean z4;
        final FontStyle fontStyle3;
        final long j6;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j7;
        final TextAlign textAlign2;
        final long j9;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier3;
        TextAlign textAlign3;
        int iN;
        int i34;
        int i35;
        Map mapEmptyMap;
        Function1 function13;
        TextStyle textStyle3;
        TextDecoration textDecoration3;
        FontStyle fontStyle4;
        long j10;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        long j11;
        int i36;
        long j12;
        Composer composerKN = composer.KN(744129681);
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
                            if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 4793491) != 4793490, i10 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                modifier2 = modifier;
                                jUo = j2;
                                textDecoration2 = textDecoration;
                                i31 = i2;
                                i32 = i3;
                                i33 = i5;
                                map2 = map;
                                function12 = function1;
                                textStyle2 = textStyle;
                                z4 = z3;
                                fontStyle3 = fontStyle2;
                                j6 = jN;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j7 = j4;
                                textAlign2 = textAlign;
                                j9 = j5;
                            } else {
                                composerKN.e();
                                if ((i7 & 1) == 0 || composerKN.rV9()) {
                                    modifier3 = i37 != 0 ? Modifier.INSTANCE : modifier;
                                    jUo = i11 != 0 ? Color.INSTANCE.Uo() : j2;
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
                                    long jN2 = i16 != 0 ? TextUnit.INSTANCE.n() : j4;
                                    TextDecoration textDecoration4 = i17 != 0 ? null : textDecoration;
                                    textAlign3 = i19 == 0 ? textAlign : null;
                                    long jN3 = i20 != 0 ? TextUnit.INSTANCE.n() : j5;
                                    iN = i23 != 0 ? TextOverflow.INSTANCE.n() : i2;
                                    if (i24 != 0) {
                                        z3 = true;
                                    }
                                    i34 = i25 != 0 ? Integer.MAX_VALUE : i3;
                                    i35 = i27 == 0 ? i5 : 1;
                                    mapEmptyMap = i29 != 0 ? MapsKt.emptyMap() : map;
                                    function13 = i30 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$5
                                        public final void n(TextLayoutResult textLayoutResult) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            n(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }
                                    } : function1;
                                    Modifier modifier4 = modifier3;
                                    if ((i9 & 131072) != 0) {
                                        textStyle3 = (TextStyle) composerKN.ty(f23751n);
                                        textDecoration3 = textDecoration4;
                                        fontStyle4 = fontStyle2;
                                        j10 = jN;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j11 = jN2;
                                        i36 = i28 & (-29360129);
                                        j12 = jN3;
                                        modifier3 = modifier4;
                                    } else {
                                        textStyle3 = textStyle;
                                        textDecoration3 = textDecoration4;
                                        fontStyle4 = fontStyle2;
                                        j10 = jN;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j11 = jN2;
                                        i36 = i28;
                                        j12 = jN3;
                                    }
                                } else {
                                    composerKN.wTp();
                                    if ((i9 & 131072) != 0) {
                                        i28 &= -29360129;
                                    }
                                    modifier3 = modifier;
                                    jUo = j2;
                                    j11 = j4;
                                    textDecoration3 = textDecoration;
                                    textAlign3 = textAlign;
                                    j12 = j5;
                                    iN = i2;
                                    i34 = i3;
                                    i35 = i5;
                                    mapEmptyMap = map;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                    fontStyle4 = fontStyle2;
                                    j10 = jN;
                                    fontWeight4 = fontWeight2;
                                    fontFamily4 = fontFamily2;
                                    i36 = i28;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(744129681, i10, i36, "androidx.compose.material.Text (Text.kt:283)");
                                }
                                final long jKN = jUo != 16 ? jUo : textStyle3.KN() != 16 ? textStyle3.KN() : Color.az(((Color) composerKN.ty(ContentColorKt.n())).getValue(), ((Number) composerKN.ty(ContentAlphaKt.n())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                TextStyle textStyleS7N = textStyle3.s7N((16609105 & 1) != 0 ? Color.INSTANCE.Uo() : 0L, (16609105 & 2) != 0 ? TextUnit.INSTANCE.n() : j10, (16609105 & 4) != 0 ? null : fontWeight4, (16609105 & 8) != 0 ? null : fontStyle4, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily4, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.n() : j11, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.Uo() : 0L, (16609105 & 4096) != 0 ? null : textDecoration3, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.Uo() : textAlign3 != null ? textAlign3.getValue() : TextAlign.INSTANCE.Uo(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.J2() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.n() : j12, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.rl() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.t() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null);
                                boolean zNr = composerKN.nr(jKN);
                                Object objIF = composerKN.iF();
                                if (zNr || objIF == Composer.INSTANCE.n()) {
                                    objIF = new ColorProducer() { // from class: androidx.compose.material.TextKt$Text$6$1
                                        @Override // androidx.compose.ui.graphics.ColorProducer
                                        public final long n() {
                                            return jKN;
                                        }
                                    };
                                    composerKN.o(objIF);
                                }
                                int i40 = (i10 & 126) | ((i36 >> 9) & 7168);
                                int i41 = i36 << 9;
                                Modifier modifier5 = modifier3;
                                BasicTextKt.O(annotatedString, modifier5, textStyleS7N, function13, iN, z3, i34, i35, mapEmptyMap, (ColorProducer) objIF, composerKN, (i41 & 234881024) | i40 | (57344 & i41) | (458752 & i41) | (3670016 & i41) | (29360128 & i41), 0);
                                modifier2 = modifier5;
                                composer2 = composerKN;
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                textAlign2 = textAlign3;
                                map2 = mapEmptyMap;
                                i31 = iN;
                                i32 = i34;
                                function12 = function13;
                                i33 = i35;
                                textStyle2 = textStyle3;
                                fontWeight3 = fontWeight4;
                                fontStyle3 = fontStyle4;
                                fontFamily3 = fontFamily4;
                                j7 = j11;
                                textDecoration2 = textDecoration3;
                                j9 = j12;
                                z4 = z3;
                                j6 = j10;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                final long j13 = jUo;
                                final Modifier modifier6 = modifier2;
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$7
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
                                        TextKt.nr(annotatedString, modifier6, j13, j6, fontStyle3, fontWeight3, fontFamily3, j7, textDecoration2, textAlign2, j9, i31, z4, i32, i33, map2, function12, textStyle2, composer3, RecomposeScopeImplKt.n(i7 | 1), RecomposeScopeImplKt.n(i8), i9);
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
                        if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 4793491) != 4793490, i10 & 1)) {
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
                    if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 4793491) != 4793490, i10 & 1)) {
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
                if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 4793491) != 4793490, i10 & 1)) {
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
            if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 4793491) != 4793490, i10 & 1)) {
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
        if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 4793491) != 4793490, i10 & 1)) {
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
    /* JADX WARN: Removed duplicated region for block: B:186:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
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
        Composer composer2;
        final Modifier modifier2;
        final TextAlign textAlign2;
        final int i32;
        final int i33;
        final Map map2;
        final Function1 function12;
        final TextStyle textStyle2;
        final boolean z4;
        final long j6;
        final FontStyle fontStyle3;
        final long j7;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j9;
        final TextDecoration textDecoration2;
        final long j10;
        ScopeUpdateScope scopeUpdateScopeGh;
        boolean z5;
        TextStyle textStyle3;
        int i34;
        long j11;
        Map map3;
        Function1 function13;
        Modifier modifier3;
        TextAlign textAlign3;
        int i35;
        long j12;
        TextDecoration textDecoration3;
        long j13;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        long j14;
        Composer composerKN = composer.KN(-422393234);
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
                                if (composerKN.HI(((i22 & 306783379) == 306783378 && (599187 & i29) == 599186) ? false : true, i22 & 1)) {
                                    composerKN.e();
                                    if ((i5 & 1) == 0 || composerKN.rV9()) {
                                        Modifier modifier4 = i36 != 0 ? Modifier.INSTANCE : modifier;
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
                                        long jN2 = i16 != 0 ? TextUnit.INSTANCE.n() : j4;
                                        TextDecoration textDecoration4 = i19 != 0 ? null : textDecoration;
                                        TextAlign textAlign4 = i21 == 0 ? textAlign : null;
                                        long jN3 = i23 != 0 ? TextUnit.INSTANCE.n() : j5;
                                        int iN = i26 != 0 ? TextOverflow.INSTANCE.n() : i2;
                                        z5 = i27 == 0 ? z3 : true;
                                        int i40 = i28 != 0 ? Integer.MAX_VALUE : i3;
                                        Map mapEmptyMap = i30 != 0 ? MapsKt.emptyMap() : map;
                                        Function1 function14 = i31 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$8
                                            public final void n(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                n(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function1;
                                        Modifier modifier5 = modifier4;
                                        if ((i8 & 65536) != 0) {
                                            i29 &= -3670017;
                                            textStyle3 = (TextStyle) composerKN.ty(f23751n);
                                        } else {
                                            textStyle3 = textStyle;
                                        }
                                        i34 = iN;
                                        j11 = jN3;
                                        map3 = mapEmptyMap;
                                        function13 = function14;
                                        modifier3 = modifier5;
                                        textAlign3 = textAlign4;
                                        long j15 = jN2;
                                        i35 = i40;
                                        j12 = jUo;
                                        FontFamily fontFamily5 = fontFamily2;
                                        textDecoration3 = textDecoration4;
                                        j13 = jN;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily5;
                                        j14 = j15;
                                    } else {
                                        composerKN.wTp();
                                        if ((i8 & 65536) != 0) {
                                            i29 &= -3670017;
                                        }
                                        modifier3 = modifier;
                                        textAlign3 = textAlign;
                                        j11 = j5;
                                        i34 = i2;
                                        i35 = i3;
                                        map3 = map;
                                        function13 = function1;
                                        textStyle3 = textStyle;
                                        z5 = z3;
                                        j12 = jUo;
                                        j13 = jN;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j14 = j4;
                                        textDecoration3 = textDecoration;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-422393234, i22, i29, "androidx.compose.material.Text (Text.kt:359)");
                                    }
                                    int i41 = i29 << 3;
                                    composer2 = composerKN;
                                    nr(annotatedString, modifier3, j12, j13, fontStyle2, fontWeight4, fontFamily4, j14, textDecoration3, textAlign3, j11, i34, z5, i35, 1, map3, function13, textStyle3, composer2, i22 & 2147483646, (i29 & 14) | 24576 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (458752 & i41) | (3670016 & i41) | (i41 & 29360128), 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier2 = modifier3;
                                    j6 = j12;
                                    j7 = j13;
                                    fontStyle3 = fontStyle2;
                                    fontWeight3 = fontWeight4;
                                    fontFamily3 = fontFamily4;
                                    j9 = j14;
                                    textDecoration2 = textDecoration3;
                                    textAlign2 = textAlign3;
                                    j10 = j11;
                                    i32 = i34;
                                    z4 = z5;
                                    i33 = i35;
                                    map2 = map3;
                                    function12 = function13;
                                    textStyle2 = textStyle3;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    i32 = i2;
                                    i33 = i3;
                                    map2 = map;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    z4 = z3;
                                    j6 = jUo;
                                    fontStyle3 = fontStyle2;
                                    j7 = jN;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j9 = j4;
                                    textDecoration2 = textDecoration;
                                    j10 = j5;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$9
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
                                            TextKt.rl(annotatedString, modifier2, j6, j7, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration2, textAlign2, j10, i32, z4, i33, map2, function12, textStyle2, composer3, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
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
                            if (composerKN.HI(((i22 & 306783379) == 306783378 && (599187 & i29) == 599186) ? false : true, i22 & 1)) {
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
                        if (composerKN.HI(((i22 & 306783379) == 306783378 && (599187 & i29) == 599186) ? false : true, i22 & 1)) {
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
                    if (composerKN.HI(((i22 & 306783379) == 306783378 && (599187 & i29) == 599186) ? false : true, i22 & 1)) {
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
                if (composerKN.HI(((i22 & 306783379) == 306783378 && (599187 & i29) == 599186) ? false : true, i22 & 1)) {
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
            if (composerKN.HI(((i22 & 306783379) == 306783378 && (599187 & i29) == 599186) ? false : true, i22 & 1)) {
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
        if (composerKN.HI(((i22 & 306783379) == 306783378 && (599187 & i29) == 599186) ? false : true, i22 & 1)) {
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
    /* JADX WARN: Removed duplicated region for block: B:186:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
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
        Composer composer2;
        final Modifier modifier2;
        final TextAlign textAlign2;
        final int iN;
        final int i33;
        final int i34;
        final Function1 function12;
        final TextStyle textStyle2;
        final boolean z4;
        final long j6;
        final FontStyle fontStyle3;
        final long j7;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j9;
        final TextDecoration textDecoration2;
        final long j10;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier3;
        int i35;
        int i36;
        Function1 function13;
        TextStyle textStyle3;
        TextDecoration textDecoration3;
        FontStyle fontStyle4;
        long j11;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        long j12;
        long j13;
        Composer composerKN = composer.KN(1028090691);
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
                                if (composerKN.HI(((i23 & 306783379) == 306783378 && (599187 & i30) == 599186) ? false : true, i23 & 1)) {
                                    composerKN.e();
                                    if ((i7 & 1) == 0 || composerKN.rV9()) {
                                        modifier3 = i37 != 0 ? Modifier.INSTANCE : modifier;
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
                                        long jN2 = i17 != 0 ? TextUnit.INSTANCE.n() : j4;
                                        TextDecoration textDecoration4 = i20 != 0 ? null : textDecoration;
                                        textAlign2 = i22 != 0 ? null : textAlign;
                                        long jN3 = i24 != 0 ? TextUnit.INSTANCE.n() : j5;
                                        iN = i27 != 0 ? TextOverflow.INSTANCE.n() : i2;
                                        if (i28 != 0) {
                                            z3 = true;
                                        }
                                        i35 = i29 != 0 ? Integer.MAX_VALUE : i3;
                                        i36 = i31 == 0 ? i5 : 1;
                                        function13 = i32 == 0 ? function1 : null;
                                        if ((i9 & 65536) != 0) {
                                            i30 &= -3670017;
                                            textStyle3 = (TextStyle) composerKN.ty(f23751n);
                                        } else {
                                            textStyle3 = textStyle;
                                        }
                                        textDecoration3 = textDecoration4;
                                        fontStyle4 = fontStyle2;
                                        j11 = jN;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j12 = jN2;
                                        j13 = jN3;
                                    } else {
                                        composerKN.wTp();
                                        if ((i9 & 65536) != 0) {
                                            i30 &= -3670017;
                                        }
                                        modifier3 = modifier;
                                        j12 = j4;
                                        textDecoration3 = textDecoration;
                                        textAlign2 = textAlign;
                                        j13 = j5;
                                        iN = i2;
                                        i35 = i3;
                                        i36 = i5;
                                        function13 = function1;
                                        textStyle3 = textStyle;
                                        fontStyle4 = fontStyle2;
                                        j11 = jN;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1028090691, i23, i30, "androidx.compose.material.Text (Text.kt:110)");
                                    }
                                    final long jKN = jUo != 16 ? jUo : textStyle3.KN() != 16 ? textStyle3.KN() : Color.az(((Color) composerKN.ty(ContentColorKt.n())).getValue(), ((Number) composerKN.ty(ContentAlphaKt.n())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                    TextStyle textStyleS7N = textStyle3.s7N((16609105 & 1) != 0 ? Color.INSTANCE.Uo() : 0L, (16609105 & 2) != 0 ? TextUnit.INSTANCE.n() : j11, (16609105 & 4) != 0 ? null : fontWeight4, (16609105 & 8) != 0 ? null : fontStyle4, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily4, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.n() : j12, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.Uo() : 0L, (16609105 & 4096) != 0 ? null : textDecoration3, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.Uo() : textAlign2 != null ? textAlign2.getValue() : TextAlign.INSTANCE.Uo(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.J2() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.n() : j13, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.rl() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.t() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null);
                                    boolean zNr = composerKN.nr(jKN);
                                    Object objIF = composerKN.iF();
                                    if (zNr || objIF == Composer.INSTANCE.n()) {
                                        objIF = new ColorProducer() { // from class: androidx.compose.material.TextKt$Text$1$1
                                            @Override // androidx.compose.ui.graphics.ColorProducer
                                            public final long n() {
                                                return jKN;
                                            }
                                        };
                                        composerKN.o(objIF);
                                    }
                                    int i41 = (i23 & 126) | ((i30 >> 6) & 7168);
                                    int i42 = i30 << 9;
                                    BasicTextKt.KN(str, modifier3, textStyleS7N, function13, iN, z3, i35, i36, (ColorProducer) objIF, composerKN, i41 | (57344 & i42) | (458752 & i42) | (3670016 & i42) | (i42 & 29360128), 0);
                                    composer2 = composerKN;
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    j6 = jUo;
                                    i33 = i35;
                                    i34 = i36;
                                    textStyle2 = textStyle3;
                                    fontWeight3 = fontWeight4;
                                    fontStyle3 = fontStyle4;
                                    fontFamily3 = fontFamily4;
                                    j9 = j12;
                                    textDecoration2 = textDecoration3;
                                    j10 = j13;
                                    function12 = function13;
                                    z4 = z3;
                                    j7 = j11;
                                    modifier2 = modifier3;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    iN = i2;
                                    i33 = i3;
                                    i34 = i5;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    z4 = z3;
                                    j6 = jUo;
                                    fontStyle3 = fontStyle2;
                                    j7 = jN;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j9 = j4;
                                    textDecoration2 = textDecoration;
                                    j10 = j5;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
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
                                            TextKt.t(str, modifier2, j6, j7, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration2, textAlign2, j10, iN, z4, i33, i34, function12, textStyle2, composer3, RecomposeScopeImplKt.n(i7 | 1), RecomposeScopeImplKt.n(i8), i9);
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
                            if (composerKN.HI(((i23 & 306783379) == 306783378 && (599187 & i30) == 599186) ? false : true, i23 & 1)) {
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
                        if (composerKN.HI(((i23 & 306783379) == 306783378 && (599187 & i30) == 599186) ? false : true, i23 & 1)) {
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
                    if (composerKN.HI(((i23 & 306783379) == 306783378 && (599187 & i30) == 599186) ? false : true, i23 & 1)) {
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
                if (composerKN.HI(((i23 & 306783379) == 306783378 && (599187 & i30) == 599186) ? false : true, i23 & 1)) {
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
            if (composerKN.HI(((i23 & 306783379) == 306783378 && (599187 & i30) == 599186) ? false : true, i23 & 1)) {
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
        if (composerKN.HI(((i23 & 306783379) == 306783378 && (599187 & i30) == 599186) ? false : true, i23 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final ProvidableCompositionLocal J2() {
        return f23751n;
    }

    public static final void n(final TextStyle textStyle, final Function2 function2, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        int i7;
        Composer composerKN = composer.KN(1772272796);
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
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(1772272796, i3, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:400)");
            }
            ProvidableCompositionLocal providableCompositionLocal = f23751n;
            CompositionLocalKt.rl(providableCompositionLocal.nr(((TextStyle) composerKN.ty(providableCompositionLocal)).nHg(textStyle)), function2, composerKN, (i3 & 112) | ProvidedValue.xMQ);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$ProvideTextStyle$1
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
