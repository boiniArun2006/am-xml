package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "minLines", "maxLines", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;II)Landroidx/compose/ui/Modifier;", "", "rl", "(II)V", "", "typeface", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,130:1\n110#2:131\n96#3,5:132\n96#3,5:137\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n56#1:131\n123#1:132,5\n126#1:137,5\n*E\n"})
public final class HeightInLinesModifierKt {
    public static final void rl(int i2, int i3) {
        if (!(i2 > 0 && i3 > 0)) {
            InlineClassHelperKt.n("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero");
        }
        if (i2 <= i3) {
            return;
        }
        InlineClassHelperKt.n("minLines " + i2 + " must be less than or equal to maxLines " + i3);
    }

    public static final Modifier n(Modifier modifier, final TextStyle textStyle, final int i2, final int i3) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("heightInLines");
                    inspectorInfo.getProperties().n("minLines", Integer.valueOf(i2));
                    inspectorInfo.getProperties().n("maxLines", Integer.valueOf(i3));
                    inspectorInfo.getProperties().n("textStyle", textStyle);
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            private static final Object rl(State state) {
                return state.getValue();
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i5) {
                int iRl;
                int iN;
                Integer numValueOf;
                float fT;
                float fT2;
                composer.eF(408240218);
                if (ComposerKt.v()) {
                    ComposerKt.p5(408240218, i5, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:62)");
                }
                HeightInLinesModifierKt.rl(i2, i3);
                if (i2 == 1 && i3 == Integer.MAX_VALUE) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer.Xw();
                    return companion;
                }
                Density density = (Density) composer.ty(CompositionLocalsKt.J2());
                FontFamily.Resolver resolver = (FontFamily.Resolver) composer.ty(CompositionLocalsKt.KN());
                LayoutDirection layoutDirection = (LayoutDirection) composer.ty(CompositionLocalsKt.az());
                boolean zP5 = composer.p5(textStyle) | composer.p5(layoutDirection);
                TextStyle textStyle2 = textStyle;
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = TextStyleKt.nr(textStyle2, layoutDirection);
                    composer.o(objIF);
                }
                TextStyle textStyle3 = (TextStyle) objIF;
                boolean zP52 = composer.p5(resolver) | composer.p5(textStyle3);
                Object objIF2 = composer.iF();
                if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                    FontFamily fontFamilyMUb = textStyle3.mUb();
                    FontWeight fontWeightHI = textStyle3.HI();
                    if (fontWeightHI == null) {
                        fontWeightHI = FontWeight.INSTANCE.O();
                    }
                    FontStyle fontStyleAz = textStyle3.az();
                    if (fontStyleAz != null) {
                        iRl = fontStyleAz.getValue();
                    } else {
                        iRl = FontStyle.INSTANCE.rl();
                    }
                    FontSynthesis fontSynthesisTy = textStyle3.ty();
                    if (fontSynthesisTy != null) {
                        iN = fontSynthesisTy.getValue();
                    } else {
                        iN = FontSynthesis.INSTANCE.n();
                    }
                    objIF2 = resolver.n(fontFamilyMUb, fontWeightHI, iRl, iN);
                    composer.o(objIF2);
                }
                State state = (State) objIF2;
                boolean zP53 = composer.p5(rl(state)) | composer.p5(density) | composer.p5(resolver) | composer.p5(textStyle) | composer.p5(layoutDirection);
                Object objIF3 = composer.iF();
                if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = Integer.valueOf((int) (TextFieldDelegateKt.n(textStyle3, density, resolver, TextFieldDelegateKt.t(), 1) & 4294967295L));
                    composer.o(objIF3);
                }
                int iIntValue = ((Number) objIF3).intValue();
                boolean zP54 = composer.p5(layoutDirection) | composer.p5(density) | composer.p5(resolver) | composer.p5(textStyle) | composer.p5(rl(state));
                Object objIF4 = composer.iF();
                if (zP54 || objIF4 == Composer.INSTANCE.n()) {
                    objIF4 = Integer.valueOf((int) (TextFieldDelegateKt.n(textStyle3, density, resolver, TextFieldDelegateKt.t() + '\n' + TextFieldDelegateKt.t(), 2) & 4294967295L));
                    composer.o(objIF4);
                }
                int iIntValue2 = ((Number) objIF4).intValue() - iIntValue;
                int i7 = i2;
                Integer numValueOf2 = null;
                if (i7 == 1) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(((i7 - 1) * iIntValue2) + iIntValue);
                }
                int i8 = i3;
                if (i8 != Integer.MAX_VALUE) {
                    numValueOf2 = Integer.valueOf(iIntValue + (iIntValue2 * (i8 - 1)));
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                if (numValueOf != null) {
                    fT = density.rV9(numValueOf.intValue());
                } else {
                    fT = Dp.INSTANCE.t();
                }
                if (numValueOf2 != null) {
                    fT2 = density.rV9(numValueOf2.intValue());
                } else {
                    fT2 = Dp.INSTANCE.t();
                }
                Modifier modifierMUb = SizeKt.mUb(companion2, fT, fT2);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierMUb;
            }
        });
    }
}
