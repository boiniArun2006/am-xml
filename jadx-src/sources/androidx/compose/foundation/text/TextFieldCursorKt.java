package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a;\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "", "enabled", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/graphics/Brush;Z)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldCursorKt {
    public static final Modifier n(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldValue textFieldValue, final OffsetMapping offsetMapping, final Brush brush, boolean z2) {
        return z2 ? ComposedModifierKt.t(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                boolean z3;
                Modifier modifierNr;
                composer.eF(-84507373);
                if (ComposerKt.v()) {
                    ComposerKt.p5(-84507373, i2, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
                }
                boolean zBooleanValue = ((Boolean) composer.ty(CompositionLocalsKt.O())).booleanValue();
                boolean zN = composer.n(zBooleanValue);
                Object objIF = composer.iF();
                if (zN || objIF == Composer.INSTANCE.n()) {
                    objIF = new CursorAnimationState(zBooleanValue);
                    composer.o(objIF);
                }
                final CursorAnimationState cursorAnimationState = (CursorAnimationState) objIF;
                Brush brush2 = brush;
                if ((brush2 instanceof SolidColor) && ((SolidColor) brush2).getValue() == 16) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (((WindowInfo) composer.ty(CompositionLocalsKt.S())).n() && legacyTextFieldState.J2() && TextRange.KN(textFieldValue.getSelection()) && z3) {
                    composer.eF(808460990);
                    AnnotatedString text = textFieldValue.getText();
                    TextRange textRangeRl = TextRange.rl(textFieldValue.getSelection());
                    boolean zE2 = composer.E2(cursorAnimationState);
                    Object objIF2 = composer.iF();
                    if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new TextFieldCursorKt$cursor$1$1$1(cursorAnimationState, null);
                        composer.o(objIF2);
                    }
                    EffectsKt.nr(text, textRangeRl, (Function2) objIF2, composer, 0);
                    boolean zE22 = composer.E2(cursorAnimationState) | composer.E2(offsetMapping) | composer.p5(textFieldValue) | composer.E2(legacyTextFieldState) | composer.p5(brush);
                    final OffsetMapping offsetMapping2 = offsetMapping;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                    final Brush brush3 = brush;
                    Object objIF3 = composer.iF();
                    if (zE22 || objIF3 == Composer.INSTANCE.n()) {
                        Object obj = new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                n(contentDrawScope);
                                return Unit.INSTANCE;
                            }

                            public final void n(ContentDrawScope contentDrawScope) {
                                Rect rect;
                                TextLayoutResult value;
                                contentDrawScope.l2();
                                float fO = cursorAnimationState.O();
                                if (fO == 0.0f) {
                                    return;
                                }
                                int iRl = offsetMapping2.rl(TextRange.ty(textFieldValue2.getSelection()));
                                TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState2.qie();
                                if (textLayoutResultProxyQie == null || (value = textLayoutResultProxyQie.getValue()) == null || (rect = value.O(iRl)) == null) {
                                    rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                                float fCoerceAtLeast = RangesKt.coerceAtLeast((float) Math.floor(contentDrawScope.l(TextFieldCursor_androidKt.n())), 1.0f);
                                float f3 = fCoerceAtLeast / 2;
                                float fCoerceAtLeast2 = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(rect.getLeft() + f3, Float.intBitsToFloat((int) (contentDrawScope.t() >> 32)) - f3), f3);
                                float fFloor = ((int) fCoerceAtLeast) % 2 == 1 ? ((float) Math.floor(fCoerceAtLeast2)) + 0.5f : (float) Math.rint(fCoerceAtLeast2);
                                DrawScope.c32(contentDrawScope, brush3, Offset.O((((long) Float.floatToRawIntBits(fFloor)) << 32) | (((long) Float.floatToRawIntBits(rect.getTop())) & 4294967295L)), Offset.O((((long) Float.floatToRawIntBits(rect.xMQ())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloor)) << 32)), fCoerceAtLeast, 0, null, fO, null, 0, 432, null);
                            }
                        };
                        composer.o(obj);
                        objIF3 = obj;
                    }
                    modifierNr = DrawModifierKt.nr(modifier2, (Function1) objIF3);
                    composer.Xw();
                } else {
                    composer.eF(810474750);
                    composer.Xw();
                    modifierNr = Modifier.INSTANCE;
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierNr;
            }
        }, 1, null) : modifier;
    }
}
