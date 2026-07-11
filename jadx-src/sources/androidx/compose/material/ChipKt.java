package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0092\u0001\u0010\u0015\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aÈ\u0001\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00182\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001e\"\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0014\u0010\"\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001e\"\u0014\u0010$\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001e\"\u0014\u0010&\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001e¨\u0006*²\u0006\f\u0010(\u001a\u00020'8\nX\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u00020'8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/material/ChipColors;", "colors", "Landroidx/compose/runtime/Composable;", "leadingIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "t", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalPadding", "rl", "LeadingIconStartSpacing", "LeadingIconEndSpacing", "nr", "TrailingIconSpacing", "O", "SelectedIconContainerSize", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,730:1\n85#2:731\n149#3:732\n149#3:733\n149#3:734\n149#3:735\n149#3:736\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n*L\n102#1:731\n709#1:732\n712#1:733\n715#1:734\n718#1:735\n729#1:736\n*E\n"})
public final class ChipKt {
    private static final float nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f21656t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f21655n = Dp.KN(12);
    private static final float rl = Dp.KN(4);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f21654O = Dp.KN(24);

    static {
        float f3 = 8;
        f21656t = Dp.KN(f3);
        nr = Dp.KN(f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fe  */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ChipColors chipColors, Function2 function2, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        int i9;
        BorderStroke borderStroke2;
        ChipColors chipColorsN;
        int i10;
        int i11;
        Composer composer2;
        final Function2 function22;
        final Modifier modifier3;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape3;
        final BorderStroke borderStroke3;
        final ChipColors chipColors2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Shape shapeRl;
        Composer composer3;
        boolean z5;
        boolean z6;
        Shape shape4;
        ChipColors chipColors3;
        Function2 function23;
        BorderStroke borderStroke4;
        boolean z7;
        MutableInteractionSource mutableInteractionSource4;
        ?? r6;
        Composer composerKN = composer.KN(-368396408);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            shape2 = shape;
                            int i13 = composerKN.p5(shape2) ? 16384 : 8192;
                            i5 |= i13;
                        } else {
                            shape2 = shape;
                        }
                        i5 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            borderStroke2 = borderStroke;
                            i5 |= composerKN.p5(borderStroke2) ? 131072 : 65536;
                        }
                        if ((1572864 & i2) == 0) {
                            if ((i3 & 64) == 0) {
                                chipColorsN = chipColors;
                                int i14 = composerKN.p5(chipColorsN) ? 1048576 : 524288;
                                i5 |= i14;
                            } else {
                                chipColorsN = chipColors;
                            }
                            i5 |= i14;
                        } else {
                            chipColorsN = chipColors;
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i5 |= 12582912;
                            i11 = i9;
                        } else {
                            i11 = i9;
                            if ((i2 & 12582912) == 0) {
                                i5 |= composerKN.E2(function2) ? 8388608 : 4194304;
                            }
                        }
                        if ((i3 & 256) == 0) {
                            if ((i2 & 100663296) == 0) {
                                i5 |= composerKN.E2(function3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                function22 = function2;
                                modifier3 = modifier2;
                                z4 = z3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape3 = shape2;
                                borderStroke3 = borderStroke2;
                                chipColors2 = chipColorsN;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) == 0 || composerKN.rV9()) {
                                    if (i12 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if (i8 != 0) {
                                        mutableInteractionSource2 = null;
                                    }
                                    if ((i3 & 16) != 0) {
                                        shapeRl = MaterialTheme.f22169n.rl(composerKN, 6).getSmall().rl(CornerSizeKt.n(50));
                                        i5 &= -57345;
                                    } else {
                                        shapeRl = shape2;
                                    }
                                    BorderStroke borderStroke5 = i11 != 0 ? null : borderStroke2;
                                    if ((i3 & 64) != 0) {
                                        z5 = true;
                                        z6 = false;
                                        composer3 = composerKN;
                                        i5 &= -3670017;
                                        chipColorsN = ChipDefaults.f21652n.n(0L, 0L, 0L, 0L, 0L, 0L, composerKN, 1572864, 63);
                                    } else {
                                        composer3 = composerKN;
                                        z5 = true;
                                        z6 = false;
                                    }
                                    ChipColors chipColors4 = chipColorsN;
                                    shape4 = shapeRl;
                                    chipColors3 = chipColors4;
                                    function23 = i10 != 0 ? null : function2;
                                    borderStroke4 = borderStroke5;
                                    z7 = z3;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    r6 = z5;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 16) != 0) {
                                        i5 &= -57345;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    r6 = 1;
                                    borderStroke4 = borderStroke2;
                                    chipColors3 = chipColorsN;
                                    z6 = false;
                                    z7 = z3;
                                    shape4 = shape2;
                                    composer3 = composerKN;
                                    function23 = function2;
                                }
                                composer3.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-368396408, i5, -1, "androidx.compose.material.Chip (Chip.kt:100)");
                                }
                                int i15 = ((i5 >> 6) & 14) | ((i5 >> 15) & 112);
                                final State stateRl = chipColors3.rl(z7, composer3, i15);
                                final ChipColors chipColors5 = chipColors3;
                                final Function2 function24 = function23;
                                final boolean z9 = z7;
                                composer2 = composer3;
                                SurfaceKt.rl(function0, SemanticsModifierKt.nr(modifier2, z6, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                                    }
                                }, r6, null), z7, shape4, ((Color) chipColors3.n(z7, composer3, i15).getValue()).getValue(), Color.az(rl(stateRl), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke4, 0.0f, mutableInteractionSource4, ComposableLambdaKt.nr(139076687, r6, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        n(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer4, int i16) {
                                        if (!composer4.HI((i16 & 3) != 2, i16 & 1)) {
                                            composer4.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(139076687, i16, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:112)");
                                        }
                                        ProvidedValue providedValueNr = ContentAlphaKt.n().nr(Float.valueOf(Color.ck(ChipKt.rl(stateRl))));
                                        final Function2 function25 = function24;
                                        final ChipColors chipColors6 = chipColors5;
                                        final boolean z10 = z9;
                                        final Function3 function32 = function3;
                                        CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(667535631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                n(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer5, int i17) {
                                                if (!composer5.HI((i17 & 3) != 2, i17 & 1)) {
                                                    composer5.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(667535631, i17, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:113)");
                                                }
                                                TextStyle body2 = MaterialTheme.f22169n.t(composer5, 6).getBody2();
                                                final Function2 function26 = function25;
                                                final ChipColors chipColors7 = chipColors6;
                                                final boolean z11 = z10;
                                                final Function3 function33 = function32;
                                                TextKt.n(body2, ComposableLambdaKt.nr(-1131213696, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                        n(composer6, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer6, int i18) {
                                                        if (!composer6.HI((i18 & 3) != 2, i18 & 1)) {
                                                            composer6.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(-1131213696, i18, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:114)");
                                                        }
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        Modifier modifierAz = PaddingKt.az(SizeKt.rl(companion, 0.0f, ChipDefaults.f21652n.t(), 1, null), function26 == null ? ChipKt.f21655n : Dp.KN(0), 0.0f, ChipKt.f21655n, 0.0f, 10, null);
                                                        Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
                                                        Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                                        Function2 function27 = function26;
                                                        ChipColors chipColors8 = chipColors7;
                                                        boolean z12 = z11;
                                                        Function3 function34 = function33;
                                                        MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, verticalXMQ, composer6, 54);
                                                        int iN = ComposablesKt.n(composer6, 0);
                                                        CompositionLocalMap compositionLocalMapIk = composer6.Ik();
                                                        Modifier modifierO = ComposedModifierKt.O(composer6, modifierAz);
                                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                        Function0 function0N = companion2.n();
                                                        if (composer6.getApplier() == null) {
                                                            ComposablesKt.t();
                                                        }
                                                        composer6.T();
                                                        if (composer6.getInserting()) {
                                                            composer6.s7N(function0N);
                                                        } else {
                                                            composer6.r();
                                                        }
                                                        Composer composerN = Updater.n(composer6);
                                                        Updater.O(composerN, measurePolicyRl, companion2.t());
                                                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                                        Function2 function2Rl = companion2.rl();
                                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                            composerN.o(Integer.valueOf(iN));
                                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                                        }
                                                        Updater.O(composerN, modifierO, companion2.nr());
                                                        RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                                        if (function27 != null) {
                                                            composer6.eF(2027612844);
                                                            SpacerKt.n(SizeKt.ViF(companion, ChipKt.rl), composer6, 6);
                                                            State stateT = chipColors8.t(z12, composer6, 0);
                                                            CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(rl(stateT))), ContentAlphaKt.n().nr(Float.valueOf(Color.ck(rl(stateT))))}, function27, composer6, ProvidedValue.xMQ);
                                                            SpacerKt.n(SizeKt.ViF(companion, ChipKt.f21656t), composer6, 6);
                                                            composer6.Xw();
                                                        } else {
                                                            composer6.eF(2028143316);
                                                            composer6.Xw();
                                                        }
                                                        function34.invoke(rowScopeInstance, composer6, 6);
                                                        composer6.XQ();
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }

                                                    private static final long rl(State state) {
                                                        return ((Color) state.getValue()).getValue();
                                                    }
                                                }, composer5, 54), composer5, 48);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer4, 54), composer4, ProvidedValue.xMQ | 48);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer3, 54), composer2, (i5 & 14) | com.google.android.exoplayer2.C.ENCODING_PCM_32BIT | (i5 & 896) | ((i5 >> 3) & 7168) | ((i5 << 3) & 3670016) | ((i5 << 15) & 234881024), 128);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                chipColors2 = chipColors3;
                                function22 = function24;
                                modifier3 = modifier2;
                                z4 = z7;
                                shape3 = shape4;
                                borderStroke3 = borderStroke4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        n(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer4, int i16) {
                                        ChipKt.n(function0, modifier3, z4, mutableInteractionSource3, shape3, borderStroke3, chipColors2, function22, function3, composer4, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 100663296;
                        if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    if ((1572864 & i2) == 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 24576) != 0) {
                }
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                borderStroke2 = borderStroke;
                if ((1572864 & i2) == 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 24576) != 0) {
            }
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            borderStroke2 = borderStroke;
            if ((1572864 & i2) == 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 24576) != 0) {
        }
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        borderStroke2 = borderStroke;
        if ((1572864 & i2) == 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final boolean z2, final Function0 function0, Modifier modifier, boolean z3, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, SelectableChipColors selectableChipColors, Function2 function2, Function2 function22, Function2 function23, final Function3 function3, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        Modifier modifier2;
        int i9;
        boolean z4;
        int i10;
        Shape shapeRl;
        int i11;
        BorderStroke borderStroke2;
        int i12;
        Function2 function24;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final SelectableChipColors selectableChipColors2;
        final Function2 function25;
        final Function2 function26;
        final Shape shape2;
        final BorderStroke borderStroke3;
        final Modifier modifier3;
        final Function2 function27;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i19;
        Modifier modifier4;
        boolean z6;
        int i20;
        int i21;
        int i22;
        SelectableChipColors selectableChipColorsRl;
        Function2 function28;
        Function2 function29;
        MutableInteractionSource mutableInteractionSource3;
        int i23;
        Function2 function210;
        Modifier modifier5;
        ?? r3;
        int i24;
        Composer composerKN = composer.KN(-1259208246);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function0) ? 32 : 16;
            }
            i8 = i5 & 4;
            if (i8 == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i7 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i9 = i5 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z4 = z3;
                        i7 |= composerKN.n(z4) ? 2048 : 1024;
                    }
                    i10 = i5 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            i7 |= composerKN.p5(mutableInteractionSource) ? 16384 : 8192;
                        }
                        if ((i2 & 196608) == 0) {
                            shapeRl = shape;
                            i7 |= ((i5 & 32) == 0 && composerKN.p5(shapeRl)) ? 131072 : 65536;
                        } else {
                            shapeRl = shape;
                        }
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i7 |= 1572864;
                            borderStroke2 = borderStroke;
                        } else {
                            borderStroke2 = borderStroke;
                            if ((i2 & 1572864) == 0) {
                                i7 |= composerKN.p5(borderStroke2) ? 1048576 : 524288;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i5 & 128) != 0) {
                                i24 = 4194304;
                                i7 |= i24;
                            } else {
                                if ((16777216 & i2) == 0 ? composerKN.p5(selectableChipColors) : composerKN.E2(selectableChipColors)) {
                                    i24 = 8388608;
                                }
                                i7 |= i24;
                            }
                        }
                        i12 = i5 & 256;
                        if (i12 != 0) {
                            i7 |= 100663296;
                            function24 = function2;
                        } else {
                            function24 = function2;
                            if ((i2 & 100663296) == 0) {
                                i7 |= composerKN.E2(function24) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                        }
                        i13 = i5 & 512;
                        if (i13 != 0) {
                            i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i14 = i13;
                                i7 |= composerKN.E2(function22) ? 536870912 : 268435456;
                            }
                            i15 = i5 & 1024;
                            if (i15 == 0) {
                                i17 = i3 | 6;
                                i16 = i15;
                            } else if ((i3 & 6) == 0) {
                                i16 = i15;
                                i17 = i3 | (composerKN.E2(function23) ? 4 : 2);
                            } else {
                                i16 = i15;
                                i17 = i3;
                            }
                            if ((i5 & 2048) != 0) {
                                if ((i3 & 48) == 0) {
                                    i17 |= composerKN.E2(function3) ? 32 : 16;
                                }
                                i18 = i17;
                                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i18 & 19) == 18) ? false : true, i7 & 1)) {
                                    composerKN.e();
                                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                                        Modifier modifier6 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                                        boolean z7 = i9 != 0 ? true : z4;
                                        MutableInteractionSource mutableInteractionSource4 = i10 != 0 ? null : mutableInteractionSource;
                                        if ((i5 & 32) != 0) {
                                            shapeRl = MaterialTheme.f22169n.rl(composerKN, 6).getSmall().rl(CornerSizeKt.n(50));
                                            i7 &= -458753;
                                        }
                                        int i25 = i7;
                                        Shape shape3 = shapeRl;
                                        BorderStroke borderStroke4 = i11 != 0 ? null : borderStroke2;
                                        if ((i5 & 128) != 0) {
                                            i21 = i14;
                                            i22 = i16;
                                            i20 = i12;
                                            i19 = i18;
                                            modifier4 = modifier6;
                                            z6 = true;
                                            selectableChipColorsRl = ChipDefaults.f21652n.rl(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 511);
                                            composerKN = composerKN;
                                            i25 &= -29360129;
                                        } else {
                                            i19 = i18;
                                            modifier4 = modifier6;
                                            z6 = true;
                                            i20 = i12;
                                            i21 = i14;
                                            i22 = i16;
                                            selectableChipColorsRl = selectableChipColors;
                                        }
                                        if (i20 != 0) {
                                            function24 = null;
                                        }
                                        Function2 function211 = i21 != 0 ? null : function22;
                                        if (i22 != 0) {
                                            function29 = function211;
                                            z4 = z7;
                                            mutableInteractionSource3 = mutableInteractionSource4;
                                            shapeRl = shape3;
                                            i23 = i25;
                                            borderStroke2 = borderStroke4;
                                            function28 = null;
                                        } else {
                                            function28 = function23;
                                            function29 = function211;
                                            z4 = z7;
                                            mutableInteractionSource3 = mutableInteractionSource4;
                                            shapeRl = shape3;
                                            i23 = i25;
                                            borderStroke2 = borderStroke4;
                                        }
                                        function210 = function24;
                                        modifier5 = modifier4;
                                        r3 = z6;
                                    } else {
                                        composerKN.wTp();
                                        if ((i5 & 32) != 0) {
                                            i7 &= -458753;
                                        }
                                        if ((i5 & 128) != 0) {
                                            i7 &= -29360129;
                                        }
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        function29 = function22;
                                        function28 = function23;
                                        i19 = i18;
                                        r3 = 1;
                                        function210 = function24;
                                        modifier5 = modifier2;
                                        i23 = i7;
                                        selectableChipColorsRl = selectableChipColors;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1259208246, i23, i19, "androidx.compose.material.FilterChip (Chip.kt:196)");
                                    }
                                    int i26 = i23 << 3;
                                    int i27 = ((i23 >> 9) & 14) | (i26 & 112) | ((i23 >> 15) & 896);
                                    final State stateNr = selectableChipColorsRl.nr(z4, z2, composerKN, i27);
                                    final Function2 function212 = function210;
                                    Shape shape4 = shapeRl;
                                    final SelectableChipColors selectableChipColors3 = selectableChipColorsRl;
                                    final Function2 function213 = function29;
                                    final Function2 function214 = function28;
                                    final boolean z9 = z4;
                                    Modifier modifier7 = modifier5;
                                    SurfaceKt.t(z2, function0, SemanticsModifierKt.nr(modifier5, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            n(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.t());
                                        }
                                    }, r3, null), z9, shape4, ((Color) selectableChipColorsRl.t(z4, z2, composerKN, i27).getValue()).getValue(), Color.az(((Color) stateNr.getValue()).getValue(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, ComposableLambdaKt.nr(722126431, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i28) {
                                            if (!composer3.HI((i28 & 3) != 2, i28 & 1)) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(722126431, i28, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:210)");
                                            }
                                            ProvidedValue providedValueNr = ContentAlphaKt.n().nr(Float.valueOf(Color.ck(((Color) stateNr.getValue()).getValue())));
                                            final Function2 function215 = function212;
                                            final boolean z10 = z2;
                                            final Function2 function216 = function213;
                                            final Function2 function217 = function214;
                                            final Function3 function32 = function3;
                                            final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                                            final boolean z11 = z9;
                                            final State state = stateNr;
                                            CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    n(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer4, int i29) {
                                                    if (!composer4.HI((i29 & 3) != 2, i29 & 1)) {
                                                        composer4.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(1582291359, i29, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:211)");
                                                    }
                                                    TextStyle body2 = MaterialTheme.f22169n.t(composer4, 6).getBody2();
                                                    final Function2 function218 = function215;
                                                    final boolean z12 = z10;
                                                    final Function2 function219 = function216;
                                                    final Function2 function220 = function217;
                                                    final Function3 function33 = function32;
                                                    final SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                                    final boolean z13 = z11;
                                                    final State state2 = state;
                                                    TextKt.n(body2, ComposableLambdaKt.nr(-1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2.1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            n(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX WARN: Type inference failed for: r7v13 */
                                                        /* JADX WARN: Type inference failed for: r7v6 */
                                                        /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
                                                        public final void n(Composer composer5, int i30) {
                                                            RowScopeInstance rowScopeInstance;
                                                            ?? r7;
                                                            Modifier modifierN;
                                                            if (!composer5.HI((i30 & 3) != 2, i30 & 1)) {
                                                                composer5.wTp();
                                                                return;
                                                            }
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.p5(-1543702066, i30, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:212)");
                                                            }
                                                            Modifier.Companion companion = Modifier.INSTANCE;
                                                            Modifier modifierAz = PaddingKt.az(SizeKt.rl(IntrinsicKt.rl(companion, IntrinsicSize.f17697t), 0.0f, ChipDefaults.f21652n.t(), 1, null), (function218 != null || (z12 && function219 != null)) ? Dp.KN(0) : ChipKt.f21655n, 0.0f, function220 == null ? ChipKt.f21655n : Dp.KN(0), 0.0f, 10, null);
                                                            Arrangement arrangement = Arrangement.f17400n;
                                                            Arrangement.Horizontal horizontalJ2 = arrangement.J2();
                                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                                            Alignment.Vertical verticalXMQ = companion2.xMQ();
                                                            Function2 function221 = function218;
                                                            boolean z14 = z12;
                                                            Function2 function222 = function219;
                                                            Function3 function34 = function33;
                                                            Function2 function223 = function220;
                                                            SelectableChipColors selectableChipColors6 = selectableChipColors5;
                                                            boolean z15 = z13;
                                                            State state3 = state2;
                                                            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, verticalXMQ, composer5, 54);
                                                            int iN = ComposablesKt.n(composer5, 0);
                                                            CompositionLocalMap compositionLocalMapIk = composer5.Ik();
                                                            Modifier modifierO = ComposedModifierKt.O(composer5, modifierAz);
                                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                            Function0 function0N = companion3.n();
                                                            if (composer5.getApplier() == null) {
                                                                ComposablesKt.t();
                                                            }
                                                            composer5.T();
                                                            if (composer5.getInserting()) {
                                                                composer5.s7N(function0N);
                                                            } else {
                                                                composer5.r();
                                                            }
                                                            Composer composerN = Updater.n(composer5);
                                                            Updater.O(composerN, measurePolicyRl, companion3.t());
                                                            Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                                            Function2 function2Rl = companion3.rl();
                                                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                                composerN.o(Integer.valueOf(iN));
                                                                composerN.az(Integer.valueOf(iN), function2Rl);
                                                            }
                                                            Updater.O(composerN, modifierO, companion3.nr());
                                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                                                            if (function221 != null || (z14 && function222 != null)) {
                                                                composer5.eF(692233385);
                                                                SpacerKt.n(SizeKt.ViF(companion, ChipKt.rl), composer5, 6);
                                                                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                                                                int iN2 = ComposablesKt.n(composer5, 0);
                                                                CompositionLocalMap compositionLocalMapIk2 = composer5.Ik();
                                                                Modifier modifierO2 = ComposedModifierKt.O(composer5, companion);
                                                                rowScopeInstance = rowScopeInstance2;
                                                                Function0 function0N2 = companion3.n();
                                                                if (composer5.getApplier() == null) {
                                                                    ComposablesKt.t();
                                                                }
                                                                composer5.T();
                                                                if (composer5.getInserting()) {
                                                                    composer5.s7N(function0N2);
                                                                } else {
                                                                    composer5.r();
                                                                }
                                                                Composer composerN2 = Updater.n(composer5);
                                                                Updater.O(composerN2, measurePolicyUo, companion3.t());
                                                                Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                                                                Function2 function2Rl2 = companion3.rl();
                                                                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                                                    composerN2.o(Integer.valueOf(iN2));
                                                                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                                                }
                                                                Updater.O(composerN2, modifierO2, companion3.nr());
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                                if (function221 != null) {
                                                                    composer5.eF(1866339666);
                                                                    State stateRl = selectableChipColors6.rl(z15, z14, composer5, 0);
                                                                    CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(stateRl.getValue()), ContentAlphaKt.n().nr(Float.valueOf(Color.ck(((Color) stateRl.getValue()).getValue())))}, function221, composer5, ProvidedValue.xMQ);
                                                                    composer5.Xw();
                                                                } else {
                                                                    composer5.eF(1866780765);
                                                                    composer5.Xw();
                                                                }
                                                                if (!z14 || function222 == null) {
                                                                    composer5.eF(1868134845);
                                                                    composer5.Xw();
                                                                } else {
                                                                    composer5.eF(1866887467);
                                                                    long value = ((Color) state3.getValue()).getValue();
                                                                    if (function221 != null) {
                                                                        composer5.eF(1867062772);
                                                                        modifierN = ClipKt.n(BackgroundKt.t(SizeKt.HI(companion, ChipKt.f21654O), ((Color) state3.getValue()).getValue(), RoundedCornerShapeKt.J2()), RoundedCornerShapeKt.J2());
                                                                        r7 = 0;
                                                                        value = ((Color) selectableChipColors6.t(z15, z14, composer5, 0).getValue()).getValue();
                                                                        composer5.Xw();
                                                                    } else {
                                                                        r7 = 0;
                                                                        composer5.eF(1867624957);
                                                                        composer5.Xw();
                                                                        modifierN = companion;
                                                                    }
                                                                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.O(), r7);
                                                                    int iN3 = ComposablesKt.n(composer5, r7);
                                                                    CompositionLocalMap compositionLocalMapIk3 = composer5.Ik();
                                                                    Modifier modifierO3 = ComposedModifierKt.O(composer5, modifierN);
                                                                    Function0 function0N3 = companion3.n();
                                                                    if (composer5.getApplier() == null) {
                                                                        ComposablesKt.t();
                                                                    }
                                                                    composer5.T();
                                                                    if (composer5.getInserting()) {
                                                                        composer5.s7N(function0N3);
                                                                    } else {
                                                                        composer5.r();
                                                                    }
                                                                    Composer composerN3 = Updater.n(composer5);
                                                                    Updater.O(composerN3, measurePolicyUo2, companion3.t());
                                                                    Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
                                                                    Function2 function2Rl3 = companion3.rl();
                                                                    if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                                                                        composerN3.o(Integer.valueOf(iN3));
                                                                        composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                                                    }
                                                                    Updater.O(composerN3, modifierO3, companion3.nr());
                                                                    CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(value)), function222, composer5, ProvidedValue.xMQ);
                                                                    composer5.XQ();
                                                                    composer5.Xw();
                                                                }
                                                                composer5.XQ();
                                                                SpacerKt.n(SizeKt.ViF(companion, ChipKt.f21656t), composer5, 6);
                                                                composer5.Xw();
                                                            } else {
                                                                composer5.eF(694250524);
                                                                composer5.Xw();
                                                                rowScopeInstance = rowScopeInstance2;
                                                            }
                                                            RowScopeInstance rowScopeInstance3 = rowScopeInstance;
                                                            Modifier modifierRl = RowScope.rl(rowScopeInstance3, companion, 1.0f, false, 2, null);
                                                            MeasurePolicy measurePolicyRl2 = RowKt.rl(arrangement.J2(), companion2.xMQ(), composer5, 54);
                                                            int iN4 = ComposablesKt.n(composer5, 0);
                                                            CompositionLocalMap compositionLocalMapIk4 = composer5.Ik();
                                                            Modifier modifierO4 = ComposedModifierKt.O(composer5, modifierRl);
                                                            Function0 function0N4 = companion3.n();
                                                            if (composer5.getApplier() == null) {
                                                                ComposablesKt.t();
                                                            }
                                                            composer5.T();
                                                            if (composer5.getInserting()) {
                                                                composer5.s7N(function0N4);
                                                            } else {
                                                                composer5.r();
                                                            }
                                                            Composer composerN4 = Updater.n(composer5);
                                                            Updater.O(composerN4, measurePolicyRl2, companion3.t());
                                                            Updater.O(composerN4, compositionLocalMapIk4, companion3.O());
                                                            Function2 function2Rl4 = companion3.rl();
                                                            if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                                                                composerN4.o(Integer.valueOf(iN4));
                                                                composerN4.az(Integer.valueOf(iN4), function2Rl4);
                                                            }
                                                            Updater.O(composerN4, modifierO4, companion3.nr());
                                                            function34.invoke(rowScopeInstance3, composer5, 6);
                                                            composer5.XQ();
                                                            if (function223 != null) {
                                                                composer5.eF(694586006);
                                                                SpacerKt.n(SizeKt.ViF(companion, ChipKt.nr), composer5, 6);
                                                                function223.invoke(composer5, 0);
                                                                SpacerKt.n(SizeKt.ViF(companion, ChipKt.nr), composer5, 6);
                                                                composer5.Xw();
                                                            } else {
                                                                composer5.eF(694776284);
                                                                composer5.Xw();
                                                            }
                                                            composer5.XQ();
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.M7();
                                                            }
                                                        }
                                                    }, composer4, 54), composer4, 48);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer3, 54), composer3, ProvidedValue.xMQ | 48);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54), composerKN, (i23 & 7294) | ((i23 >> 3) & 57344) | (i26 & 29360128) | ((i23 << 15) & 1879048192), 6, 256);
                                    composer2 = composerKN;
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    shape2 = shape4;
                                    borderStroke3 = borderStroke2;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    selectableChipColors2 = selectableChipColors3;
                                    function27 = function212;
                                    function25 = function213;
                                    function26 = function214;
                                    z5 = z9;
                                    modifier3 = modifier7;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    selectableChipColors2 = selectableChipColors;
                                    function25 = function22;
                                    function26 = function23;
                                    shape2 = shapeRl;
                                    borderStroke3 = borderStroke2;
                                    modifier3 = modifier2;
                                    function27 = function24;
                                    z5 = z4;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i28) {
                                            ChipKt.t(z2, function0, modifier3, z5, mutableInteractionSource2, shape2, borderStroke3, selectableChipColors2, function27, function25, function26, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i17 |= 48;
                            i18 = i17;
                            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i18 & 19) == 18) ? false : true, i7 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i14 = i13;
                        i15 = i5 & 1024;
                        if (i15 == 0) {
                        }
                        if ((i5 & 2048) != 0) {
                        }
                        i18 = i17;
                        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i18 & 19) == 18) ? false : true, i7 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    if ((i2 & 196608) == 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i5 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i5 & 1024;
                    if (i15 == 0) {
                    }
                    if ((i5 & 2048) != 0) {
                    }
                    i18 = i17;
                    if (composerKN.HI(((i7 & 306783379) == 306783378 && (i18 & 19) == 18) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z3;
                i10 = i5 & 16;
                if (i10 == 0) {
                }
                if ((i2 & 196608) == 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                }
                i13 = i5 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i5 & 1024;
                if (i15 == 0) {
                }
                if ((i5 & 2048) != 0) {
                }
                i18 = i17;
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i18 & 19) == 18) ? false : true, i7 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i9 = i5 & 8;
            if (i9 != 0) {
            }
            z4 = z3;
            i10 = i5 & 16;
            if (i10 == 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i5 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i5 & 1024;
            if (i15 == 0) {
            }
            if ((i5 & 2048) != 0) {
            }
            i18 = i17;
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i18 & 19) == 18) ? false : true, i7 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i8 = i5 & 4;
        if (i8 == 0) {
        }
        modifier2 = modifier;
        i9 = i5 & 8;
        if (i9 != 0) {
        }
        z4 = z3;
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i5 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        if ((i5 & 2048) != 0) {
        }
        i18 = i17;
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i18 & 19) == 18) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rl(State state) {
        return ((Color) state.getValue()).getValue();
    }
}
