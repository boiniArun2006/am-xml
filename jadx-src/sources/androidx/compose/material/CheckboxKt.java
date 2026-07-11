package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001aW\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u001e\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a>\u0010&\u001a\u00020\u0003*\u00020\u00172\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)\"\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)\"\u0014\u0010/\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)\"\u0014\u00101\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064²\u0006\f\u00102\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u00103\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/CheckboxColors;", "colors", c.f62177j, "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "KN", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "value", "rl", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "boxColor", "borderColor", "", "radius", "strokeWidth", "o", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "Landroidx/compose/material/CheckDrawingCache;", "drawingCache", "Z", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxRippleRadius", "CheckboxDefaultPadding", "t", "CheckboxSize", "nr", "StrokeWidth", "O", "RadiusSize", "checkDrawFraction", "checkCenterGravitationShiftFraction", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n1247#2,6:485\n1247#2,6:509\n1247#2,6:515\n1969#3:491\n1966#3:492\n1884#3,7:493\n1969#3:500\n1966#3:501\n1884#3,7:502\n85#4:521\n85#4:522\n85#4:523\n85#4:524\n85#4:525\n149#5:526\n149#5:527\n149#5:528\n149#5:529\n149#5:530\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n*L\n97#1:485,6\n294#1:509,6\n298#1:515,6\n262#1:491\n262#1:492\n262#1:493,7\n279#1:500\n279#1:501\n279#1:502,7\n262#1:521\n279#1:522\n295#1:523\n296#1:524\n297#1:525\n479#1:526\n480#1:527\n481#1:528\n482#1:529\n483#1:530\n*E\n"})
public final class CheckboxKt {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f21621O;
    private static final float nr;
    private static final float rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f21622n = Dp.KN(24);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f21623t = Dp.KN(20);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.f33331n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.f33333t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.f33330O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f3 = 2;
        rl = Dp.KN(f3);
        nr = Dp.KN(f3);
        f21621O = Dp.KN(f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final ToggleableState toggleableState, final Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, Composer composer, final int i2, final int i3) {
        ToggleableState toggleableState2;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        CheckboxColors checkboxColorsN;
        Composer composer2;
        final Modifier modifier3;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource3;
        final CheckboxColors checkboxColors2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i9;
        Modifier modifier4;
        boolean z5;
        MutableInteractionSource mutableInteractionSource4;
        MutableInteractionSource mutableInteractionSource5;
        boolean z6;
        Modifier modifierT;
        Composer composerKN = composer.KN(2031255194);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            toggleableState2 = toggleableState;
        } else if ((i2 & 6) == 0) {
            toggleableState2 = toggleableState;
            i5 = (composerKN.p5(toggleableState2) ? 4 : 2) | i2;
        } else {
            toggleableState2 = toggleableState;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function0) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 == 0) {
                    if ((i2 & 24576) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 16384 : 8192;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            checkboxColorsN = checkboxColors;
                            int i11 = composerKN.p5(checkboxColorsN) ? 131072 : 65536;
                            i5 |= i11;
                        } else {
                            checkboxColorsN = checkboxColors;
                        }
                        i5 |= i11;
                    } else {
                        checkboxColorsN = checkboxColors;
                    }
                    if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                        composer2 = composerKN;
                        composer2.wTp();
                        modifier3 = modifier2;
                        z4 = z3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        checkboxColors2 = checkboxColorsN;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) == 0 || composerKN.rV9()) {
                            Modifier modifier5 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z7 = i7 != 0 ? true : z3;
                            MutableInteractionSource mutableInteractionSource6 = i8 != 0 ? null : mutableInteractionSource2;
                            if ((i3 & 32) != 0) {
                                composer2 = composerKN;
                                i9 = i5 & (-458753);
                                modifier4 = modifier5;
                                checkboxColorsN = CheckboxDefaults.f21620n.n(0L, 0L, 0L, 0L, 0L, composer2, 196608, 31);
                            } else {
                                composer2 = composerKN;
                                i9 = i5;
                                modifier4 = modifier5;
                            }
                            z5 = z7;
                            mutableInteractionSource4 = mutableInteractionSource6;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                            }
                            composer2 = composerKN;
                            modifier4 = modifier2;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            i9 = i5;
                        }
                        composer2.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(2031255194, i9, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:140)");
                        }
                        if (function0 != null) {
                            modifierT = ToggleableKt.t(Modifier.INSTANCE, toggleableState2, mutableInteractionSource4, RippleKt.J2(false, f21622n, 0L, 4, null), z5, Role.mUb(Role.INSTANCE.t()), function0);
                            mutableInteractionSource5 = mutableInteractionSource4;
                            z6 = z5;
                        } else {
                            mutableInteractionSource5 = mutableInteractionSource4;
                            z6 = z5;
                            modifierT = Modifier.INSTANCE;
                        }
                        CheckboxColors checkboxColors3 = checkboxColorsN;
                        rl(z6, toggleableState, PaddingKt.xMQ(modifier4.Zmq(function0 != null ? InteractiveComponentSizeKt.t(Modifier.INSTANCE) : Modifier.INSTANCE).Zmq(modifierT), rl), checkboxColors3, composer2, ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 7168));
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        checkboxColors2 = checkboxColors3;
                        modifier3 = modifier4;
                        mutableInteractionSource3 = mutableInteractionSource5;
                        z4 = z6;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt$TriStateCheckbox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i12) {
                                CheckboxKt.KN(toggleableState, function0, modifier3, z4, mutableInteractionSource3, checkboxColors2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i2) != 0) {
                }
                if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i2) != 0) {
            }
            if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z3 = z2;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i2) != 0) {
        }
        if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(DrawScope drawScope, long j2, float f3, float f4, float f5, CheckDrawingCache checkDrawingCache) {
        Stroke stroke = new Stroke(f5, 0.0f, StrokeCap.INSTANCE.t(), 0, null, 26, null);
        float fGh = Size.gh(drawScope.t());
        float fRl = MathHelpersKt.rl(0.4f, 0.5f, f4);
        float fRl2 = MathHelpersKt.rl(0.7f, 0.5f, f4);
        float fRl3 = MathHelpersKt.rl(0.5f, 0.5f, f4);
        float fRl4 = MathHelpersKt.rl(0.3f, 0.5f, f4);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().Ik(0.2f * fGh, fRl3 * fGh);
        checkDrawingCache.getCheckPath().S(fRl * fGh, fRl2 * fGh);
        checkDrawingCache.getCheckPath().S(0.8f * fGh, fGh * fRl4);
        checkDrawingCache.getPathMeasure().rl(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().n(0.0f, checkDrawingCache.getPathMeasure().getLength() * f3, checkDrawingCache.getPathToDraw(), true);
        DrawScope.EWS(drawScope, checkDrawingCache.getPathToDraw(), j2, 0.0f, stroke, null, 0, 52, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final boolean z2, final Function1 function1, Modifier modifier, boolean z3, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        CheckboxColors checkboxColors2;
        final Modifier modifier3;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier4;
        boolean z6;
        Composer composerKN = composer.KN(-2118660998);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function1) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z4 = z3;
                    i5 |= composerKN.n(z4) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 == 0) {
                    if ((i2 & 24576) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 16384 : 8192;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            checkboxColors2 = checkboxColors;
                            int i10 = composerKN.p5(checkboxColors2) ? 131072 : 65536;
                            i5 |= i10;
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i5 |= i10;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        z5 = z4;
                    } else {
                        composerKN.e();
                        Function0 function0 = null;
                        if ((i2 & 1) == 0 || composerKN.rV9()) {
                            Modifier modifier5 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z7 = i7 != 0 ? true : z4;
                            MutableInteractionSource mutableInteractionSource3 = i8 != 0 ? null : mutableInteractionSource2;
                            if ((i3 & 32) != 0) {
                                CheckboxColors checkboxColorsN = CheckboxDefaults.f21620n.n(0L, 0L, 0L, 0L, 0L, composerKN, 196608, 31);
                                composerKN = composerKN;
                                i5 &= -458753;
                                modifier4 = modifier5;
                                z6 = z7;
                                checkboxColors2 = checkboxColorsN;
                            } else {
                                modifier4 = modifier5;
                                z6 = z7;
                            }
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                            }
                            z6 = z4;
                            modifier4 = modifier2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-2118660998, i5, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                        }
                        ToggleableState toggleableStateN = ToggleableStateKt.n(z2);
                        if (function1 != null) {
                            composerKN.eF(-1450332004);
                            boolean z9 = ((i5 & 112) == 32) | ((i5 & 14) == 4);
                            Object objIF = composerKN.iF();
                            if (z9 || objIF == Composer.INSTANCE.n()) {
                                objIF = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        function1.invoke(Boolean.valueOf(!z2));
                                    }
                                };
                                composerKN.o(objIF);
                            }
                            function0 = (Function0) objIF;
                            composerKN.Xw();
                        } else {
                            composerKN.eF(-1450267308);
                            composerKN.Xw();
                        }
                        KN(toggleableStateN, function0, modifier4, z6, mutableInteractionSource2, checkboxColors2, composerKN, i5 & 524160, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier4;
                        z5 = z6;
                    }
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                    final CheckboxColors checkboxColors3 = checkboxColors2;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i11) {
                                CheckboxKt.n(z2, function1, modifier3, z5, mutableInteractionSource4, checkboxColors3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i2) != 0) {
                }
                if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                }
                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                final CheckboxColors checkboxColors32 = checkboxColors2;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z3;
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i2) != 0) {
            }
            if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
            }
            final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
            final CheckboxColors checkboxColors322 = checkboxColors2;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z4 = z3;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i2) != 0) {
        }
        if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
        }
        final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
        final CheckboxColors checkboxColors3222 = checkboxColors2;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(DrawScope drawScope, long j2, long j3, float f3, float f4) {
        float f5 = f4 / 2.0f;
        Stroke stroke = new Stroke(f4, 0.0f, 0, 0, null, 30, null);
        float fGh = Size.gh(drawScope.t());
        if (Color.HI(j2, j3)) {
            DrawScope.HE(drawScope, j2, 0L, SizeKt.n(fGh, fGh), CornerRadiusKt.rl(f3, 0.0f, 2, null), Fill.f31654n, 0.0f, null, 0, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, null);
            return;
        }
        float f6 = fGh - (2 * f4);
        DrawScope.HE(drawScope, j2, OffsetKt.n(f4, f4), SizeKt.n(f6, f6), CornerRadiusKt.rl(Math.max(0.0f, f3 - f4), 0.0f, 2, null), Fill.f31654n, 0.0f, null, 0, 224, null);
        float f7 = fGh - f4;
        DrawScope.HE(drawScope, j3, OffsetKt.n(f5, f5), SizeKt.n(f7, f7), CornerRadiusKt.rl(f3 - f5, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final boolean z2, final ToggleableState toggleableState, final Modifier modifier, final CheckboxColors checkboxColors, Composer composer, final int i2) {
        int i3;
        float f3;
        int i5;
        float f4;
        final State stateJ2;
        int i7;
        int i8;
        float f5;
        int i9;
        final State stateJ22;
        Object objIF;
        Composer.Companion companion;
        final CheckDrawingCache checkDrawingCache;
        final State stateN;
        final State stateT;
        final State stateRl;
        boolean zP5;
        Object objIF2;
        Composer composerKN = composer.KN(-2118895727);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(toggleableState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.p5(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(checkboxColors) ? 2048 : 1024;
        }
        int i10 = i3;
        if (composerKN.HI((i10 & 1171) != 1170, i10 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-2118895727, i10, -1, "androidx.compose.material.CheckboxImpl (Checkbox.kt:258)");
            }
            int i11 = i10 >> 3;
            int i12 = i11 & 14;
            Transition transitionMUb = TransitionKt.mUb(toggleableState, null, composerKN, i12, 2);
            CheckboxKt$CheckboxImpl$checkDrawFraction$2 checkboxKt$CheckboxImpl$checkDrawFraction$2 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                    return n(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i13) {
                    FiniteAnimationSpec finiteAnimationSpecQie;
                    composer2.eF(-1707702900);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1707702900, i13, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:263)");
                    }
                    Object initialState = segment.getInitialState();
                    ToggleableState toggleableState2 = ToggleableState.f33333t;
                    if (initialState == toggleableState2) {
                        finiteAnimationSpecQie = AnimationSpecKt.ty(100, 0, null, 6, null);
                    } else if (segment.getTargetState() == toggleableState2) {
                        finiteAnimationSpecQie = AnimationSpecKt.xMQ(100);
                    } else {
                        finiteAnimationSpecQie = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer2.Xw();
                    return finiteAnimationSpecQie;
                }
            };
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter twoWayConverterXMQ = VectorConvertersKt.xMQ(floatCompanionObject);
            ToggleableState toggleableState2 = (ToggleableState) transitionMUb.xMQ();
            composerKN.eF(-1798345588);
            if (ComposerKt.v()) {
                ComposerKt.p5(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:270)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i13 = iArr[toggleableState2.ordinal()];
            float f6 = 0.0f;
            if (i13 == 1) {
                f3 = 1.0f;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composerKN.Xw();
                Float fValueOf = Float.valueOf(f3);
                ToggleableState toggleableState3 = (ToggleableState) transitionMUb.Ik();
                composerKN.eF(-1798345588);
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:270)");
                }
                i5 = iArr[toggleableState3.ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        f4 = 0.0f;
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composerKN.Xw();
                        stateJ2 = TransitionKt.J2(transitionMUb, fValueOf, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ, "FloatAnimation", composerKN, 0);
                        CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                                return n(segment, composer2, num.intValue());
                            }

                            public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i14) {
                                FiniteAnimationSpec finiteAnimationSpecTy;
                                composer2.eF(1075283605);
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1075283605, i14, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:280)");
                                }
                                Object initialState = segment.getInitialState();
                                ToggleableState toggleableState4 = ToggleableState.f33333t;
                                if (initialState == toggleableState4) {
                                    finiteAnimationSpecTy = AnimationSpecKt.mUb(0, 1, null);
                                } else if (segment.getTargetState() == toggleableState4) {
                                    finiteAnimationSpecTy = AnimationSpecKt.xMQ(100);
                                } else {
                                    finiteAnimationSpecTy = AnimationSpecKt.ty(100, 0, null, 6, null);
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                composer2.Xw();
                                return finiteAnimationSpecTy;
                            }
                        };
                        TwoWayConverter twoWayConverterXMQ2 = VectorConvertersKt.xMQ(floatCompanionObject);
                        ToggleableState toggleableState4 = (ToggleableState) transitionMUb.xMQ();
                        composerKN.eF(-2098942571);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-2098942571, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:287)");
                        }
                        i7 = iArr[toggleableState4.ordinal()];
                        if (i7 != 1 || i7 == 2) {
                            i8 = 3;
                            f5 = 0.0f;
                        } else {
                            i8 = 3;
                            if (i7 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f5 = 1.0f;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composerKN.Xw();
                        Float fValueOf2 = Float.valueOf(f5);
                        ToggleableState toggleableState5 = (ToggleableState) transitionMUb.Ik();
                        composerKN.eF(-2098942571);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-2098942571, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:287)");
                        }
                        i9 = iArr[toggleableState5.ordinal()];
                        if (i9 != 1 && i9 != 2) {
                            if (i9 == i8) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f6 = 1.0f;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composerKN.Xw();
                        stateJ22 = TransitionKt.J2(transitionMUb, fValueOf2, Float.valueOf(f6), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ2, "FloatAnimation", composerKN, 0);
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                            objIF = new CheckDrawingCache(null, null, null, 7, null);
                            composerKN.o(objIF);
                        }
                        checkDrawingCache = (CheckDrawingCache) objIF;
                        stateN = checkboxColors.n(toggleableState, composerKN, i12 | ((i10 >> 6) & 112));
                        int i14 = (i11 & 896) | (i10 & 126);
                        stateT = checkboxColors.t(z2, toggleableState, composerKN, i14);
                        stateRl = checkboxColors.rl(z2, toggleableState, composerKN, i14);
                        Modifier modifierHI = androidx.compose.foundation.layout.SizeKt.HI(androidx.compose.foundation.layout.SizeKt.E2(modifier, Alignment.INSTANCE.O(), false, 2, null), f21623t);
                        zP5 = composerKN.p5(stateT) | composerKN.p5(stateRl) | composerKN.p5(stateN) | composerKN.p5(stateJ2) | composerKN.p5(stateJ22);
                        objIF2 = composerKN.iF();
                        if (!zP5 || objIF2 == companion.n()) {
                            objIF2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    n(drawScope);
                                    return Unit.INSTANCE;
                                }

                                public final void n(DrawScope drawScope) {
                                    float fFloor = (float) Math.floor(drawScope.l(CheckboxKt.nr));
                                    CheckboxKt.o(drawScope, CheckboxKt.J2(stateT), CheckboxKt.Uo(stateRl), drawScope.l(CheckboxKt.f21621O), fFloor);
                                    CheckboxKt.Z(drawScope, CheckboxKt.O(stateN), CheckboxKt.t(stateJ2), CheckboxKt.nr(stateJ22), fFloor, checkDrawingCache);
                                }
                            };
                            composerKN.o(objIF2);
                        }
                        CanvasKt.rl(modifierHI, (Function1) objIF2, composerKN, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    } else if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                f4 = 1.0f;
                if (ComposerKt.v()) {
                }
                composerKN.Xw();
                stateJ2 = TransitionKt.J2(transitionMUb, fValueOf, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ, "FloatAnimation", composerKN, 0);
                CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$22 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                        return n(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i142) {
                        FiniteAnimationSpec finiteAnimationSpecTy;
                        composer2.eF(1075283605);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1075283605, i142, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:280)");
                        }
                        Object initialState = segment.getInitialState();
                        ToggleableState toggleableState42 = ToggleableState.f33333t;
                        if (initialState == toggleableState42) {
                            finiteAnimationSpecTy = AnimationSpecKt.mUb(0, 1, null);
                        } else if (segment.getTargetState() == toggleableState42) {
                            finiteAnimationSpecTy = AnimationSpecKt.xMQ(100);
                        } else {
                            finiteAnimationSpecTy = AnimationSpecKt.ty(100, 0, null, 6, null);
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer2.Xw();
                        return finiteAnimationSpecTy;
                    }
                };
                TwoWayConverter twoWayConverterXMQ22 = VectorConvertersKt.xMQ(floatCompanionObject);
                ToggleableState toggleableState42 = (ToggleableState) transitionMUb.xMQ();
                composerKN.eF(-2098942571);
                if (ComposerKt.v()) {
                }
                i7 = iArr[toggleableState42.ordinal()];
                if (i7 != 1) {
                    i8 = 3;
                    f5 = 0.0f;
                    if (ComposerKt.v()) {
                    }
                    composerKN.Xw();
                    Float fValueOf22 = Float.valueOf(f5);
                    ToggleableState toggleableState52 = (ToggleableState) transitionMUb.Ik();
                    composerKN.eF(-2098942571);
                    if (ComposerKt.v()) {
                    }
                    i9 = iArr[toggleableState52.ordinal()];
                    if (i9 != 1) {
                        if (i9 == i8) {
                        }
                    }
                    if (ComposerKt.v()) {
                    }
                    composerKN.Xw();
                    stateJ22 = TransitionKt.J2(transitionMUb, fValueOf22, Float.valueOf(f6), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$22.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ22, "FloatAnimation", composerKN, 0);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                    }
                    checkDrawingCache = (CheckDrawingCache) objIF;
                    stateN = checkboxColors.n(toggleableState, composerKN, i12 | ((i10 >> 6) & 112));
                    int i142 = (i11 & 896) | (i10 & 126);
                    stateT = checkboxColors.t(z2, toggleableState, composerKN, i142);
                    stateRl = checkboxColors.rl(z2, toggleableState, composerKN, i142);
                    Modifier modifierHI2 = androidx.compose.foundation.layout.SizeKt.HI(androidx.compose.foundation.layout.SizeKt.E2(modifier, Alignment.INSTANCE.O(), false, 2, null), f21623t);
                    zP5 = composerKN.p5(stateT) | composerKN.p5(stateRl) | composerKN.p5(stateN) | composerKN.p5(stateJ2) | composerKN.p5(stateJ22);
                    objIF2 = composerKN.iF();
                    if (!zP5) {
                        objIF2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                n(drawScope);
                                return Unit.INSTANCE;
                            }

                            public final void n(DrawScope drawScope) {
                                float fFloor = (float) Math.floor(drawScope.l(CheckboxKt.nr));
                                CheckboxKt.o(drawScope, CheckboxKt.J2(stateT), CheckboxKt.Uo(stateRl), drawScope.l(CheckboxKt.f21621O), fFloor);
                                CheckboxKt.Z(drawScope, CheckboxKt.O(stateN), CheckboxKt.t(stateJ2), CheckboxKt.nr(stateJ22), fFloor, checkDrawingCache);
                            }
                        };
                        composerKN.o(objIF2);
                        CanvasKt.rl(modifierHI2, (Function1) objIF2, composerKN, 0);
                        if (ComposerKt.v()) {
                        }
                    }
                }
            } else if (i13 != 2) {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f3 = 1.0f;
                if (ComposerKt.v()) {
                }
                composerKN.Xw();
                Float fValueOf3 = Float.valueOf(f3);
                ToggleableState toggleableState32 = (ToggleableState) transitionMUb.Ik();
                composerKN.eF(-1798345588);
                if (ComposerKt.v()) {
                }
                i5 = iArr[toggleableState32.ordinal()];
                if (i5 != 1) {
                }
                f4 = 1.0f;
                if (ComposerKt.v()) {
                }
                composerKN.Xw();
                stateJ2 = TransitionKt.J2(transitionMUb, fValueOf3, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ, "FloatAnimation", composerKN, 0);
                CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$222 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                        return n(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i1422) {
                        FiniteAnimationSpec finiteAnimationSpecTy;
                        composer2.eF(1075283605);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1075283605, i1422, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:280)");
                        }
                        Object initialState = segment.getInitialState();
                        ToggleableState toggleableState422 = ToggleableState.f33333t;
                        if (initialState == toggleableState422) {
                            finiteAnimationSpecTy = AnimationSpecKt.mUb(0, 1, null);
                        } else if (segment.getTargetState() == toggleableState422) {
                            finiteAnimationSpecTy = AnimationSpecKt.xMQ(100);
                        } else {
                            finiteAnimationSpecTy = AnimationSpecKt.ty(100, 0, null, 6, null);
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer2.Xw();
                        return finiteAnimationSpecTy;
                    }
                };
                TwoWayConverter twoWayConverterXMQ222 = VectorConvertersKt.xMQ(floatCompanionObject);
                ToggleableState toggleableState422 = (ToggleableState) transitionMUb.xMQ();
                composerKN.eF(-2098942571);
                if (ComposerKt.v()) {
                }
                i7 = iArr[toggleableState422.ordinal()];
                if (i7 != 1) {
                }
            } else {
                f3 = 0.0f;
                if (ComposerKt.v()) {
                }
                composerKN.Xw();
                Float fValueOf32 = Float.valueOf(f3);
                ToggleableState toggleableState322 = (ToggleableState) transitionMUb.Ik();
                composerKN.eF(-1798345588);
                if (ComposerKt.v()) {
                }
                i5 = iArr[toggleableState322.ordinal()];
                if (i5 != 1) {
                }
                f4 = 1.0f;
                if (ComposerKt.v()) {
                }
                composerKN.Xw();
                stateJ2 = TransitionKt.J2(transitionMUb, fValueOf32, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ, "FloatAnimation", composerKN, 0);
                CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2222 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                        return n(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i1422) {
                        FiniteAnimationSpec finiteAnimationSpecTy;
                        composer2.eF(1075283605);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1075283605, i1422, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:280)");
                        }
                        Object initialState = segment.getInitialState();
                        ToggleableState toggleableState4222 = ToggleableState.f33333t;
                        if (initialState == toggleableState4222) {
                            finiteAnimationSpecTy = AnimationSpecKt.mUb(0, 1, null);
                        } else if (segment.getTargetState() == toggleableState4222) {
                            finiteAnimationSpecTy = AnimationSpecKt.xMQ(100);
                        } else {
                            finiteAnimationSpecTy = AnimationSpecKt.ty(100, 0, null, 6, null);
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer2.Xw();
                        return finiteAnimationSpecTy;
                    }
                };
                TwoWayConverter twoWayConverterXMQ2222 = VectorConvertersKt.xMQ(floatCompanionObject);
                ToggleableState toggleableState4222 = (ToggleableState) transitionMUb.xMQ();
                composerKN.eF(-2098942571);
                if (ComposerKt.v()) {
                }
                i7 = iArr[toggleableState4222.ordinal()];
                if (i7 != 1) {
                }
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i15) {
                    CheckboxKt.rl(z2, toggleableState, modifier, checkboxColors, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long J2(State state) {
        return ((Color) state.getValue()).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long O(State state) {
        return ((Color) state.getValue()).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Uo(State state) {
        return ((Color) state.getValue()).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float nr(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
