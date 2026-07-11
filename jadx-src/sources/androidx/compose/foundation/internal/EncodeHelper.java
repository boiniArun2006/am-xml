package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.l;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001bJ\u0018\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u0010\u001bJ\u0015\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u0010\"J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u000209ø\u0001\u0000¢\u0006\u0004\b;\u0010\u0010J\u0015\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0006¢\u0006\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/foundation/internal/EncodeHelper;", "", "<init>", "()V", "", "Ik", "", "ck", "()Ljava/lang/String;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "O", "(Landroidx/compose/ui/text/SpanStyle;)V", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "az", "(J)V", "Landroidx/compose/ui/unit/TextUnit;", "textUnit", "mUb", "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "J2", "(Landroidx/compose/ui/text/font/FontWeight;)V", "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "HI", "(I)V", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "qie", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "gh", "(F)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "KN", "(Landroidx/compose/ui/text/style/TextGeometricTransform;)V", "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Uo", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "nr", "(Landroidx/compose/ui/graphics/Shadow;)V", "", "byte", c.f62177j, "(B)V", "", l.f62668w, "t", "", "float", "rl", "Lkotlin/ULong;", "uLong", "ty", "string", "xMQ", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClipboardUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/EncodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,556:1\n65#2:557\n69#2:560\n60#3:558\n70#3:561\n22#4:559\n22#4:562\n*S KotlinDebug\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/EncodeHelper\n*L\n269#1:557\n270#1:560\n269#1:558\n270#1:561\n269#1:559\n270#1:562\n*E\n"})
public final class EncodeHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Parcel parcel = Parcel.obtain();

    public final void HI(int fontStyle) {
        FontStyle.Companion companion = FontStyle.INSTANCE;
        byte b2 = 0;
        if (!FontStyle.J2(fontStyle, companion.rl()) && FontStyle.J2(fontStyle, companion.n())) {
            b2 = 1;
        }
        n(b2);
    }

    public final void Ik() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final String ck() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void n(byte b2) {
        this.parcel.writeByte(b2);
    }

    public final void qie(int fontSynthesis) {
        FontSynthesis.Companion companion = FontSynthesis.INSTANCE;
        byte b2 = 0;
        if (!FontSynthesis.KN(fontSynthesis, companion.rl())) {
            if (FontSynthesis.KN(fontSynthesis, companion.n())) {
                b2 = 1;
            } else if (FontSynthesis.KN(fontSynthesis, companion.nr())) {
                b2 = 2;
            } else if (FontSynthesis.KN(fontSynthesis, companion.t())) {
                b2 = 3;
            }
        }
        n(b2);
    }

    public final void rl(float f3) {
        this.parcel.writeFloat(f3);
    }

    public final void t(int i2) {
        this.parcel.writeInt(i2);
    }

    public final void ty(long uLong) {
        this.parcel.writeLong(uLong);
    }

    public final void xMQ(String string) {
        this.parcel.writeString(string);
    }

    public final void J2(FontWeight fontWeight) {
        t(fontWeight.qie());
    }

    public final void KN(TextGeometricTransform textGeometricTransform) {
        rl(textGeometricTransform.getScaleX());
        rl(textGeometricTransform.getSkewX());
    }

    public final void O(SpanStyle spanStyle) {
        long jUo = spanStyle.Uo();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.HI(jUo, companion.Uo())) {
            n((byte) 1);
            az(spanStyle.Uo());
        }
        long fontSize = spanStyle.getFontSize();
        TextUnit.Companion companion2 = TextUnit.INSTANCE;
        if (!TextUnit.O(fontSize, companion2.n())) {
            n((byte) 2);
            mUb(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            n((byte) 3);
            J2(fontWeight);
        }
        FontStyle fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int value = fontStyle.getValue();
            n((byte) 4);
            HI(value);
        }
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value2 = fontSynthesis.getValue();
            n((byte) 5);
            qie(value2);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            n((byte) 6);
            xMQ(fontFeatureSettings);
        }
        if (!TextUnit.O(spanStyle.getLetterSpacing(), companion2.n())) {
            n((byte) 7);
            mUb(spanStyle.getLetterSpacing());
        }
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float multiplier = baselineShift.getMultiplier();
            n((byte) 8);
            gh(multiplier);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            n((byte) 9);
            KN(textGeometricTransform);
        }
        if (!Color.HI(spanStyle.getBackground(), companion.Uo())) {
            n((byte) 10);
            az(spanStyle.getBackground());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            n((byte) 11);
            Uo(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            n((byte) 12);
            nr(shadow);
        }
    }

    public final void Uo(TextDecoration textDecoration) {
        t(textDecoration.getMask());
    }

    public final void az(long color) {
        ty(color);
    }

    public final void gh(float baselineShift) {
        rl(baselineShift);
    }

    public final void mUb(long textUnit) {
        long jUo = TextUnit.Uo(textUnit);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        byte b2 = 0;
        if (!TextUnitType.Uo(jUo, companion.t())) {
            if (TextUnitType.Uo(jUo, companion.rl())) {
                b2 = 1;
            } else if (TextUnitType.Uo(jUo, companion.n())) {
                b2 = 2;
            }
        }
        n(b2);
        if (!TextUnitType.Uo(TextUnit.Uo(textUnit), companion.t())) {
            rl(TextUnit.KN(textUnit));
        }
    }

    public final void nr(Shadow shadow) {
        az(shadow.getColor());
        rl(Float.intBitsToFloat((int) (shadow.getOffset() >> 32)));
        rl(Float.intBitsToFloat((int) (shadow.getOffset() & 4294967295L)));
        rl(shadow.getBlurRadius());
    }
}
