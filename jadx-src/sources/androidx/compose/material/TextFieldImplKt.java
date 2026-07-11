package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aÛ\u0001\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001aT\u0010&\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2 \u0010%\u001a\u001c\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\u0003\u0010\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a#\u0010*\u001a\u00020(*\u00020(2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0002H\u0000¢\u0006\u0004\b*\u0010+\u001a\u0019\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0004\b/\u00100\u001a\u0019\u00101\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0004\b1\u00100\"\u001a\u00106\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u00103\u001a\u0004\b4\u00105\"\u001a\u00108\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u00103\u001a\u0004\b7\u00105\"\u001a\u0010=\u001a\u0004\u0018\u00010:*\u0002098@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Landroidx/compose/material/TextFieldType;", "type", "", "value", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "innerTextField", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material/TextFieldColors;", "colors", "border", c.f62177j, "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "typography", "", "contentAlpha", "Landroidx/compose/runtime/ComposableOpenTarget;", "index", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "t", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "KN", "(Landroidx/compose/ui/layout/Placeable;)I", "Uo", "Landroidx/compose/ui/unit/Dp;", "F", "J2", "()F", "TextFieldPadding", "nr", "HorizontalIconPadding", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "O", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,381:1\n1247#2,6:382\n708#3:388\n696#3:389\n708#3:390\n696#3:391\n149#4:392\n149#4:393\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n*L\n81#1:382,6\n118#1:388\n118#1:389\n123#1:390\n123#1:391\n379#1:392\n380#1:393\n*E\n"})
public final class TextFieldImplKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f23553n = Dp.KN(16);
    private static final float rl = Dp.KN(12);

    public static final void n(final TextFieldType textFieldType, final String str, final Function2 function2, final VisualTransformation visualTransformation, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final boolean z2, final boolean z3, final boolean z4, final InteractionSource interactionSource, final PaddingValues paddingValues, final Shape shape, final TextFieldColors textFieldColors, final Function2 function26, Composer composer, final int i2, final int i3) {
        int i5;
        String str2;
        Function2 function27;
        int i7;
        int i8;
        Composer composer2;
        long j2;
        Composer composerKN = composer.KN(341783750);
        if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(textFieldType) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i5 |= composerKN.p5(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function27 = function2;
            i5 |= composerKN.E2(function27) ? 256 : 128;
        } else {
            function27 = function2;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerKN.p5(visualTransformation) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerKN.E2(function22) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i7 = 196608;
            i5 |= composerKN.E2(function23) ? 131072 : 65536;
        } else {
            i7 = 196608;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= composerKN.E2(function24) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= composerKN.E2(function25) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= composerKN.n(z2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i5 |= composerKN.n(z3) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i8 = i3 | (composerKN.n(z4) ? 4 : 2);
        } else {
            i8 = i3;
        }
        if ((i3 & 48) == 0) {
            i8 |= composerKN.p5(interactionSource) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= composerKN.p5(paddingValues) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i8 |= composerKN.p5(shape) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i8 |= composerKN.p5(textFieldColors) ? 16384 : 8192;
        }
        if ((i3 & i7) == 0) {
            i8 |= composerKN.E2(function26) ? 131072 : 65536;
        }
        int i9 = i8;
        if (composerKN.HI(((i5 & 306783379) == 306783378 && (74899 & i9) == 74898) ? false : true, i5 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(341783750, i5, i9, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)");
            }
            boolean z5 = ((i5 & 112) == 32) | ((i5 & 7168) == 2048);
            Object objIF = composerKN.iF();
            if (z5 || objIF == Composer.INSTANCE.n()) {
                objIF = visualTransformation.n(new AnnotatedString(str2, null, null, 6, null));
                composerKN.o(objIF);
            }
            final String text = ((TransformedText) objIF).getText().getText();
            InputPhase inputPhase = ((Boolean) FocusInteractionKt.n(interactionSource, composerKN, (i9 >> 3) & 14).getValue()).booleanValue() ? InputPhase.f22115n : text.length() == 0 ? InputPhase.f22117t : InputPhase.f22114O;
            Function3<InputPhase, Composer, Integer, Color> function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase2, Composer composer3, Integer num) {
                    return Color.xMQ(n(inputPhase2, composer3, num.intValue()));
                }

                public final long n(InputPhase inputPhase2, Composer composer3, int i10) {
                    boolean z6;
                    composer3.eF(-1272940975);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1272940975, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:95)");
                    }
                    TextFieldColors textFieldColors2 = textFieldColors;
                    boolean z7 = z3;
                    if (inputPhase2 == InputPhase.f22117t) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    long value = ((Color) textFieldColors2.KN(z7, z6, interactionSource, composer3, 0).getValue()).getValue();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer3.Xw();
                    return value;
                }
            };
            MaterialTheme materialTheme = MaterialTheme.f22169n;
            Typography typographyT = materialTheme.t(composerKN, 6);
            TextStyle subtitle1 = typographyT.getSubtitle1();
            TextStyle caption = typographyT.getCaption();
            long jKN = subtitle1.KN();
            Color.Companion companion = Color.INSTANCE;
            final boolean z6 = (Color.HI(jKN, companion.Uo()) && !Color.HI(caption.KN(), companion.Uo())) || (!Color.HI(subtitle1.KN(), companion.Uo()) && Color.HI(caption.KN(), companion.Uo()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.f23736n;
            composerKN.eF(1578866909);
            long jKN2 = materialTheme.t(composerKN, 6).getCaption().KN();
            if (z6) {
                j2 = 16;
                composerKN.eF(-1572812364);
                if (jKN2 == 16) {
                    jKN2 = function3.invoke(inputPhase, composerKN, 0).getValue();
                }
                composerKN.Xw();
            } else {
                j2 = 16;
                composerKN.eF(780549965);
                composerKN.Xw();
            }
            long j3 = jKN2;
            composerKN.Xw();
            composerKN.eF(1578874175);
            long jKN3 = materialTheme.t(composerKN, 6).getSubtitle1().KN();
            if (z6) {
                composerKN.eF(-1572585196);
                if (jKN3 == j2) {
                    jKN3 = function3.invoke(inputPhase, composerKN, 0).getValue();
                }
                composerKN.Xw();
            } else {
                composerKN.eF(780557293);
                composerKN.Xw();
            }
            long j4 = jKN3;
            composerKN.Xw();
            final Function2 function28 = function27;
            composer2 = composerKN;
            textFieldTransitionScope.n(inputPhase, j3, j4, function3, function22 != null, ComposableLambdaKt.nr(225557475, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[TextFieldType.values().length];
                        try {
                            iArr[TextFieldType.f23749n.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[TextFieldType.f23750t.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(6);
                }

                @Override // kotlin.jvm.functions.Function6
                public /* bridge */ /* synthetic */ Unit invoke(Float f3, Color color, Color color2, Float f4, Composer composer3, Integer num) {
                    n(f3.floatValue(), color.getValue(), color2.getValue(), f4.floatValue(), composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(float f3, long j5, final long j6, final float f4, Composer composer3, int i10) {
                    int i11;
                    long j7;
                    int i12;
                    ComposableLambda composableLambda;
                    ComposableLambda composableLambda2;
                    ComposableLambda composableLambda3;
                    final float f5 = f3;
                    if ((i10 & 6) == 0) {
                        i11 = (composer3.rl(f5) ? 4 : 2) | i10;
                    } else {
                        i11 = i10;
                    }
                    if ((i10 & 48) == 0) {
                        j7 = j5;
                        i11 |= composer3.nr(j7) ? 32 : 16;
                    } else {
                        j7 = j5;
                    }
                    if ((i10 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i11 |= composer3.nr(j6) ? 256 : 128;
                    }
                    if ((i10 & 3072) == 0) {
                        i11 |= composer3.rl(f4) ? 2048 : 1024;
                    }
                    int i13 = i11;
                    if (!composer3.HI((i13 & 9363) != 9362, i13 & 1)) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(225557475, i13, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:128)");
                    }
                    final Function2 function29 = function22;
                    ComposableLambda composableLambdaNr = null;
                    if (function29 == null) {
                        composer3.eF(-1572254148);
                        composer3.Xw();
                        i12 = 54;
                    } else {
                        composer3.eF(-1572254147);
                        final boolean z7 = z6;
                        i12 = 54;
                        final long j9 = j7;
                        Function2<Composer, Integer, Unit> function210 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                n(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer4, int i14) {
                                if (!composer4.HI((i14 & 3) != 2, i14 & 1)) {
                                    composer4.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1865025495, i14, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:131)");
                                }
                                MaterialTheme materialTheme2 = MaterialTheme.f22169n;
                                TextStyle textStyleT = TextStyleKt.t(materialTheme2.t(composer4, 6).getSubtitle1(), materialTheme2.t(composer4, 6).getCaption(), f5);
                                boolean z9 = z7;
                                long j10 = j9;
                                if (z9) {
                                    textStyleT = TextStyle.t(textStyleT, j10, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                }
                                TextFieldImplKt.rl(j6, textStyleT, null, function29, composer4, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        };
                        f5 = f5;
                        composableLambdaNr = ComposableLambdaKt.nr(-1865025495, true, function210, composer3, 54);
                        composer3.Xw();
                    }
                    ComposableLambda composableLambda4 = composableLambdaNr;
                    if (function23 == null || text.length() != 0 || f4 <= 0.0f) {
                        composer3.eF(-1570844268);
                        composer3.Xw();
                        composableLambda = null;
                    } else {
                        composer3.eF(-1571270300);
                        final TextFieldColors textFieldColors2 = textFieldColors;
                        final boolean z9 = z3;
                        final Function2 function211 = function23;
                        ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(-413527723, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            public final void n(Modifier modifier, Composer composer4, int i14) {
                                int i15;
                                if ((i14 & 6) == 0) {
                                    i15 = i14 | (composer4.p5(modifier) ? 4 : 2);
                                } else {
                                    i15 = i14;
                                }
                                if (!composer4.HI((i15 & 19) != 18, 1 & i15)) {
                                    composer4.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-413527723, i15, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:151)");
                                }
                                Modifier modifierN = AlphaKt.n(modifier, f4);
                                TextFieldColors textFieldColors3 = textFieldColors2;
                                boolean z10 = z9;
                                Function2 function212 = function211;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN = ComposablesKt.n(composer4, 0);
                                CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer4, modifierN);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion2.n();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer4.T();
                                if (composer4.getInserting()) {
                                    composer4.s7N(function0N);
                                } else {
                                    composer4.r();
                                }
                                Composer composerN = Updater.n(composer4);
                                Updater.O(composerN, measurePolicyUo, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                Function2 function2Rl = companion2.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                TextFieldImplKt.rl(((Color) textFieldColors3.Uo(z10, composer4, 0).getValue()).getValue(), MaterialTheme.f22169n.t(composer4, 6).getSubtitle1(), null, function212, composer4, 0, 4);
                                composer4.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer4, Integer num) {
                                n(modifier, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer3, i12);
                        composer3.Xw();
                        composableLambda = composableLambdaNr2;
                    }
                    final long value = ((Color) textFieldColors.nr(z3, z4, interactionSource, composer3, 0).getValue()).getValue();
                    final Function2 function212 = function24;
                    if (function212 == null) {
                        composer3.eF(-1570655509);
                        composer3.Xw();
                        composableLambda2 = null;
                    } else {
                        composer3.eF(-1570655508);
                        ComposableLambda composableLambdaNr3 = ComposableLambdaKt.nr(-1165144581, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                n(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer4, int i14) {
                                if (!composer4.HI((i14 & 3) != 2, i14 & 1)) {
                                    composer4.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1165144581, i14, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:164)");
                                }
                                TextFieldImplKt.rl(value, null, null, function212, composer4, 0, 6);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer3, i12);
                        composer3.Xw();
                        composableLambda2 = composableLambdaNr3;
                    }
                    final long value2 = ((Color) textFieldColors.mUb(z3, z4, interactionSource, composer3, 0).getValue()).getValue();
                    final Function2 function213 = function25;
                    if (function213 == null) {
                        composer3.eF(-1570361846);
                        composer3.Xw();
                        composableLambda3 = null;
                    } else {
                        composer3.eF(-1570361845);
                        ComposableLambda composableLambdaNr4 = ComposableLambdaKt.nr(1694126319, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                n(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer4, int i14) {
                                if (!composer4.HI((i14 & 3) != 2, i14 & 1)) {
                                    composer4.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1694126319, i14, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
                                }
                                TextFieldImplKt.rl(value2, null, null, function213, composer4, 0, 6);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer3, i12);
                        composer3.Xw();
                        composableLambda3 = composableLambdaNr4;
                    }
                    Modifier modifierT = BackgroundKt.t(Modifier.INSTANCE, ((Color) textFieldColors.n(z3, composer3, 0).getValue()).getValue(), shape);
                    int i14 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                    if (i14 == 1) {
                        composer3.eF(-1570081481);
                        TextFieldKt.J2(modifierT, function28, composableLambda4, composableLambda, composableLambda2, composableLambda3, z2, f3, paddingValues, composer3, (i13 << 21) & 29360128);
                        composer3.Xw();
                    } else if (i14 != 2) {
                        composer3.eF(-1568043975);
                        composer3.Xw();
                    } else {
                        composer3.eF(-1569502122);
                        Object objIF2 = composer3.iF();
                        Composer.Companion companion2 = Composer.INSTANCE;
                        if (objIF2 == companion2.n()) {
                            objIF2 = SnapshotStateKt__SnapshotStateKt.O(Size.t(Size.INSTANCE.rl()), null, 2, null);
                            composer3.o(objIF2);
                        }
                        final MutableState mutableState = (MutableState) objIF2;
                        final PaddingValues paddingValues2 = paddingValues;
                        final Function2 function214 = function26;
                        ComposableLambda composableLambdaNr5 = ComposableLambdaKt.nr(-1212965554, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                n(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer4, int i15) {
                                if (!composer4.HI((i15 & 3) != 2, i15 & 1)) {
                                    composer4.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1212965554, i15, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:193)");
                                }
                                Modifier modifierHI = OutlinedTextFieldKt.HI(LayoutIdKt.rl(Modifier.INSTANCE, "border"), ((Size) mutableState.getValue()).getPackedValue(), paddingValues2);
                                Function2 function215 = function214;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
                                int iN = ComposablesKt.n(composer4, 0);
                                CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer4, modifierHI);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion3.n();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer4.T();
                                if (composer4.getInserting()) {
                                    composer4.s7N(function0N);
                                } else {
                                    composer4.r();
                                }
                                Composer composerN = Updater.n(composer4);
                                Updater.O(composerN, measurePolicyUo, companion3.t());
                                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                Function2 function2Rl = companion3.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion3.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                if (function215 == null) {
                                    composer4.eF(720285106);
                                } else {
                                    composer4.eF(-392406993);
                                    function215.invoke(composer4, 0);
                                }
                                composer4.Xw();
                                composer4.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer3, i12);
                        Function2 function215 = function28;
                        boolean z10 = z2;
                        boolean z11 = (i13 & 14) == 4;
                        Object objIF3 = composer3.iF();
                        if (z11 || objIF3 == companion2.n()) {
                            objIF3 = new Function1<Size, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                    n(size.getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(long j10) {
                                    float fGh = Size.gh(j10) * f5;
                                    float fXMQ = Size.xMQ(j10) * f5;
                                    if (Size.gh(((Size) mutableState.getValue()).getPackedValue()) == fGh && Size.xMQ(((Size) mutableState.getValue()).getPackedValue()) == fXMQ) {
                                        return;
                                    }
                                    mutableState.setValue(Size.t(SizeKt.n(fGh, fXMQ)));
                                }
                            };
                            composer3.o(objIF3);
                        }
                        OutlinedTextFieldKt.J2(modifierT, function215, composableLambda, composableLambda4, composableLambda2, composableLambda3, z10, f5, (Function1) objIF3, composableLambdaNr5, paddingValues, composer3, 805306368 | ((i13 << 21) & 29360128), 0);
                        composer3.Xw();
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composer2, 1769472);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composer2 = composerKN;
            composer2.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i10) {
                    TextFieldImplKt.n(textFieldType, str, function2, visualTransformation, function22, function23, function24, function25, z2, z3, z4, interactionSource, paddingValues, shape, textFieldColors, function26, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
                }
            });
        }
    }

    public static final float J2() {
        return f23553n;
    }

    public static final int KN(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int Uo(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final float nr() {
        return rl;
    }

    public static final void rl(final long j2, TextStyle textStyle, Float f3, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        final TextStyle textStyle2;
        final Float f4;
        Composer composerKN = composer.KN(-399493340);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.nr(j2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(textStyle) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(f3) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(function2) ? 2048 : 1024;
        }
        if (composerKN.HI((i5 & 1171) != 1170, i5 & 1)) {
            TextStyle textStyle3 = i7 != 0 ? null : textStyle;
            final Float f5 = i8 != 0 ? null : f3;
            if (ComposerKt.v()) {
                ComposerKt.p5(-399493340, i5, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:236)");
            }
            ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    if (!composer2.HI((i9 & 3) != 2, i9 & 1)) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(494684590, i9, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
                    }
                    ProvidedValue providedValueNr = ContentColorKt.n().nr(Color.xMQ(j2));
                    final Float f6 = f5;
                    final Function2 function22 = function2;
                    final long j3 = j2;
                    CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(-1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i10) {
                            if (!composer3.HI((i10 & 3) != 2, i10 & 1)) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1132188434, i10, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                            }
                            if (f6 != null) {
                                composer3.eF(-1177895124);
                                CompositionLocalKt.rl(ContentAlphaKt.n().nr(f6), function22, composer3, ProvidedValue.xMQ);
                                composer3.Xw();
                            } else {
                                composer3.eF(-1177696538);
                                CompositionLocalKt.rl(ContentAlphaKt.n().nr(Float.valueOf(Color.ck(j3))), function22, composer3, ProvidedValue.xMQ);
                                composer3.Xw();
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composer2, 54), composer2, ProvidedValue.xMQ | 48);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54);
            if (textStyle3 != null) {
                composerKN.eF(2115981348);
                TextKt.n(textStyle3, composableLambdaNr, composerKN, ((i5 >> 3) & 14) | 48);
            } else {
                composerKN.eF(2115982984);
                composableLambdaNr.invoke(composerKN, 6);
            }
            composerKN.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            textStyle2 = textStyle3;
            f4 = f5;
        } else {
            composerKN.wTp();
            textStyle2 = textStyle;
            f4 = f3;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    TextFieldImplKt.rl(j2, textStyle2, f4, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    public static final Modifier t(Modifier modifier, boolean z2, final String str) {
        return z2 ? SemanticsModifierKt.nr(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                n(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.HI(semanticsPropertyReceiver, str);
            }
        }, 1, null) : modifier;
    }

    public static final Object O(IntrinsicMeasurable intrinsicMeasurable) {
        LayoutIdParentData layoutIdParentData;
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof LayoutIdParentData) {
            layoutIdParentData = (LayoutIdParentData) parentData;
        } else {
            layoutIdParentData = null;
        }
        if (layoutIdParentData == null) {
            return null;
        }
        return layoutIdParentData.getLayoutId();
    }
}
