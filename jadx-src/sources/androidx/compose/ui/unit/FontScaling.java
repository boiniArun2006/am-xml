package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u0002*\u00020\u0003H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/FontScaling;", "", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "ck", "(F)J", "Z", "(J)F", "", "yAc", "()F", "getFontScale$annotations", "()V", "fontScale", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFontScaling.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.android.kt\nandroidx/compose/ui/unit/FontScaling\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,64:1\n52#2,5:65\n*S KotlinDebug\n*F\n+ 1 FontScaling.android.kt\nandroidx/compose/ui/unit/FontScaling\n*L\n55#1:65,5\n*E\n"})
public interface FontScaling {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: yAc */
    float getFontScale();

    default long ck(float f3) {
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.f34171n;
        if (!fontScaleConverterFactory.J2(getFontScale())) {
            return TextUnitKt.Uo(f3 / getFontScale());
        }
        FontScaleConverter fontScaleConverterRl = fontScaleConverterFactory.rl(getFontScale());
        return TextUnitKt.Uo(fontScaleConverterRl != null ? fontScaleConverterRl.n(f3) : f3 / getFontScale());
    }

    default float Z(long j2) {
        if (!TextUnitType.Uo(TextUnit.Uo(j2), TextUnitType.INSTANCE.rl())) {
            InlineClassHelperKt.rl("Only Sp can convert to Px");
        }
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.f34171n;
        if (!fontScaleConverterFactory.J2(getFontScale())) {
            return Dp.KN(TextUnit.KN(j2) * getFontScale());
        }
        FontScaleConverter fontScaleConverterRl = fontScaleConverterFactory.rl(getFontScale());
        float fKN = TextUnit.KN(j2);
        if (fontScaleConverterRl == null) {
            return Dp.KN(fKN * getFontScale());
        }
        return Dp.KN(fontScaleConverterRl.rl(fKN));
    }
}
