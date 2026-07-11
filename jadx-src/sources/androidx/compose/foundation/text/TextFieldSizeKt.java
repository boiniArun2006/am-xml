package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/TextStyle;", "style", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/Modifier;", "", "typeface", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldSizeKt {
    public static final Modifier n(Modifier modifier, final TextStyle textStyle) {
        return ComposedModifierKt.t(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1
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

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                int iRl;
                int iN;
                composer.eF(1582736677);
                if (ComposerKt.v()) {
                    ComposerKt.p5(1582736677, i2, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
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
                TextStyle textStyle4 = textStyle;
                Object objIF3 = composer.iF();
                Composer.Companion companion = Composer.INSTANCE;
                if (objIF3 == companion.n()) {
                    objIF3 = new TextFieldSize(layoutDirection, density, resolver, textStyle4, rl(state));
                    composer.o(objIF3);
                }
                final TextFieldSize textFieldSize = (TextFieldSize) objIF3;
                textFieldSize.t(layoutDirection, density, resolver, textStyle3, rl(state));
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean zE2 = composer.E2(textFieldSize);
                Object objIF4 = composer.iF();
                if (zE2 || objIF4 == companion.n()) {
                    objIF4 = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                            return n(measureScope, measurable, constraints.getValue());
                        }

                        public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j2) {
                            long jRl = textFieldSize.rl();
                            final Placeable placeableDR0 = measurable.dR0(Constraints.nr(j2, RangesKt.coerceIn((int) (jRl >> 32), Constraints.ty(j2), Constraints.qie(j2)), 0, RangesKt.coerceIn((int) (jRl & 4294967295L), Constraints.az(j2), Constraints.gh(j2)), 0, 10, null));
                            return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    n(placementScope);
                                    return Unit.INSTANCE;
                                }

                                public final void n(Placeable.PlacementScope placementScope) {
                                    Placeable.PlacementScope.az(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
                                }
                            }, 4, null);
                        }
                    };
                    composer.o(objIF4);
                }
                Modifier modifierN = LayoutModifierKt.n(companion2, (Function3) objIF4);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierN;
            }
        }, 1, null);
    }
}
