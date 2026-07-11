package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aW\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroidx/compose/ui/text/SpanStyle;", "style", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "Landroidx/compose/ui/unit/Density;", "density", "", "requiresLetterSpacing", c.f62177j, "(Landroidx/compose/ui/text/platform/AndroidTextPaint;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function4;Landroidx/compose/ui/unit/Density;Z)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/unit/TextUnit;", "letterSpacing", "Landroidx/compose/ui/graphics/Color;", "background", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "t", "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "", "O", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;Landroidx/compose/ui/text/style/TextMotion;)V", "nr", "(Landroidx/compose/ui/text/SpanStyle;)Z", "", "blurRadius", "rl", "(F)F", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextPaintExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPaintExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/TextPaintExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
public final class TextPaintExtensions_androidKt {
    public static final float rl(float f3) {
        if (f3 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f3;
    }

    public static final void O(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        if (textMotion == null) {
            textMotion = TextMotion.INSTANCE.n();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning() ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        int linearity = textMotion.getLinearity();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.INSTANCE;
        if (TextMotion.Linearity.Uo(linearity, companion.rl())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.Uo(linearity, companion.n())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.Uo(linearity, companion.t())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }

    private static final SpanStyle t(long j2, boolean z2, long j3, BaselineShift baselineShift) {
        long jUo = j3;
        boolean z3 = false;
        boolean z4 = z2 && TextUnitType.Uo(TextUnit.Uo(j2), TextUnitType.INSTANCE.rl()) && TextUnit.KN(j2) != 0.0f;
        Color.Companion companion = Color.INSTANCE;
        boolean z5 = (Color.HI(jUo, companion.Uo()) || Color.HI(jUo, companion.J2())) ? false : true;
        if (baselineShift != null) {
            if (!BaselineShift.O(baselineShift.getMultiplier(), BaselineShift.INSTANCE.n())) {
                z3 = true;
            }
        }
        if (!z4 && !z5 && !z3) {
            return null;
        }
        long jN = z4 ? j2 : TextUnit.INSTANCE.n();
        if (!z5) {
            jUo = companion.Uo();
        }
        return new SpanStyle(0L, 0L, null, null, null, null, null, jN, z3 ? baselineShift : null, null, null, jUo, null, null, null, null, 63103, null);
    }

    public static final SpanStyle n(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4 function4, Density density, boolean z2) {
        int iRl;
        int iN;
        long jUo = TextUnit.Uo(spanStyle.getFontSize());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.Uo(jUo, companion.rl())) {
            androidTextPaint.setTextSize(density.tFV(spanStyle.getFontSize()));
        } else if (TextUnitType.Uo(jUo, companion.n())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.KN(spanStyle.getFontSize()));
        }
        if (nr(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.O();
            }
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
            androidTextPaint.setTypeface((Typeface) function4.invoke(fontFamily, fontWeight, fontStyleT, FontSynthesis.O(iN)));
        }
        if (spanStyle.getLocaleList() != null && !Intrinsics.areEqual(spanStyle.getLocaleList(), LocaleList.INSTANCE.n())) {
            LocaleListHelperMethods.f33860n.rl(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !Intrinsics.areEqual(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !Intrinsics.areEqual(spanStyle.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.n())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.J2(spanStyle.Uo());
        androidTextPaint.O(spanStyle.J2(), Size.INSTANCE.n(), spanStyle.t());
        androidTextPaint.KN(spanStyle.getShadow());
        androidTextPaint.xMQ(spanStyle.getTextDecoration());
        androidTextPaint.Uo(spanStyle.getDrawStyle());
        if (TextUnitType.Uo(TextUnit.Uo(spanStyle.getLetterSpacing()), companion.rl()) && TextUnit.KN(spanStyle.getLetterSpacing()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float fTFV = density.tFV(spanStyle.getLetterSpacing());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(fTFV / textSize);
            }
        } else if (TextUnitType.Uo(TextUnit.Uo(spanStyle.getLetterSpacing()), companion.n())) {
            androidTextPaint.setLetterSpacing(TextUnit.KN(spanStyle.getLetterSpacing()));
        }
        return t(spanStyle.getLetterSpacing(), z2, spanStyle.getBackground(), spanStyle.getBaselineShift());
    }

    public static final boolean nr(SpanStyle spanStyle) {
        if (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) {
            return false;
        }
        return true;
    }
}
