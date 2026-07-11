package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.CheckboxTokens;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aW\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u001e\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a>\u0010&\u001a\u00020\u0003*\u00020\u00172\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)\"\u0014\u0010,\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010)\"\u0014\u0010.\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/material3/CheckboxColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", c.f62177j, "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "t", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "value", "rl", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "boxColor", "borderColor", "", "radius", "strokeWidth", "xMQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "Landroidx/compose/material3/CheckDrawingCache;", "drawingCache", "mUb", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material3/CheckDrawingCache;)V", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxDefaultPadding", "CheckboxSize", "StrokeWidth", "nr", "RadiusSize", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,607:1\n1223#2,6:608\n1223#2,6:633\n1223#2,6:639\n71#3:614\n1967#4:615\n1964#4:616\n1882#4,7:617\n1967#4:624\n1964#4:625\n1882#4,7:626\n148#5:645\n148#5:646\n148#5:647\n148#5:648\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n*L\n104#1:608,6\n307#1:633,6\n311#1:639,6\n164#1:614\n275#1:615\n275#1:616\n275#1:617,7\n292#1:624\n292#1:625\n292#1:626,7\n603#1:645\n604#1:646\n605#1:647\n606#1:648\n*E\n"})
public final class CheckboxKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f24734n;
    private static final float nr;
    private static final float rl = Dp.KN(20);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f24735t;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
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
        f24734n = Dp.KN(f3);
        f24735t = Dp.KN(f3);
        nr = Dp.KN(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(DrawScope drawScope, long j2, float f3, float f4, float f5, CheckDrawingCache checkDrawingCache) {
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

    /* JADX WARN: Removed duplicated region for block: B:114:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final boolean z2, final Function1 function1, Modifier modifier, boolean z3, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z4;
        CheckboxColors checkboxColorsN;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        CheckboxColors checkboxColors2;
        final Modifier modifier3;
        final boolean z5;
        final CheckboxColors checkboxColors3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1406741137);
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
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        checkboxColorsN = checkboxColors;
                        int i10 = composerKN.p5(checkboxColorsN) ? 16384 : 8192;
                        i5 |= i10;
                    } else {
                        checkboxColorsN = checkboxColors;
                    }
                    i5 |= i10;
                } else {
                    checkboxColorsN = checkboxColors;
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                    if ((196608 & i2) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 131072 : 65536;
                    }
                    if ((74899 & i5) == 74898 || !composerKN.xMQ()) {
                        composerKN.e();
                        Function0 function0 = null;
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                                checkboxColorsN = CheckboxDefaults.f24733n.n(composerKN, 6);
                            }
                            if (i8 == 0) {
                                checkboxColors2 = checkboxColorsN;
                                mutableInteractionSource2 = null;
                            }
                            boolean z6 = z4;
                            Modifier modifier4 = modifier2;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1406741137, i5, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                            }
                            ToggleableState toggleableStateN = ToggleableStateKt.n(z2);
                            composerKN.eF(1046936362);
                            if (function1 != null) {
                                boolean z7 = ((i5 & 112) == 32) | ((i5 & 14) == 4);
                                Object objIF = composerKN.iF();
                                if (z7 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new Function0<Unit>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$1$1
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
                            }
                            composerKN.Xw();
                            t(toggleableStateN, function0, modifier4, z6, checkboxColors2, mutableInteractionSource2, composerKN, i5 & 524160, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier3 = modifier4;
                            z5 = z6;
                            checkboxColors3 = checkboxColors2;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                            }
                        }
                        checkboxColors2 = checkboxColorsN;
                        boolean z62 = z4;
                        Modifier modifier42 = modifier2;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        ToggleableState toggleableStateN2 = ToggleableStateKt.n(z2);
                        composerKN.eF(1046936362);
                        if (function1 != null) {
                        }
                        composerKN.Xw();
                        t(toggleableStateN2, function0, modifier42, z62, checkboxColors2, mutableInteractionSource2, composerKN, i5 & 524160, 0);
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier42;
                        z5 = z62;
                        checkboxColors3 = checkboxColors2;
                    } else {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        z5 = z4;
                        checkboxColors3 = checkboxColorsN;
                    }
                    final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2
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
                                CheckboxKt.n(z2, function1, modifier3, z5, checkboxColors3, mutableInteractionSource3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((74899 & i5) == 74898) {
                    composerKN.e();
                    Function0 function02 = null;
                    if ((i2 & 1) != 0) {
                        if (i9 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i8 == 0) {
                            checkboxColors2 = checkboxColorsN;
                        }
                        boolean z622 = z4;
                        Modifier modifier422 = modifier2;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        ToggleableState toggleableStateN22 = ToggleableStateKt.n(z2);
                        composerKN.eF(1046936362);
                        if (function1 != null) {
                        }
                        composerKN.Xw();
                        t(toggleableStateN22, function02, modifier422, z622, checkboxColors2, mutableInteractionSource2, composerKN, i5 & 524160, 0);
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier422;
                        z5 = z622;
                        checkboxColors3 = checkboxColors2;
                    }
                }
                final MutableInteractionSource mutableInteractionSource32 = mutableInteractionSource2;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z3;
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((74899 & i5) == 74898) {
            }
            final MutableInteractionSource mutableInteractionSource322 = mutableInteractionSource2;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z4 = z3;
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((74899 & i5) == 74898) {
        }
        final MutableInteractionSource mutableInteractionSource3222 = mutableInteractionSource2;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final boolean z2, final ToggleableState toggleableState, final Modifier modifier, final CheckboxColors checkboxColors, Composer composer, final int i2) {
        int i3;
        float f3;
        int i5;
        char c2;
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
        final State stateT;
        final State stateRl;
        final State stateN;
        boolean zP5;
        Object objIF2;
        Composer composerKN = composer.KN(2007131616);
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
        if ((i10 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2007131616, i10, -1, "androidx.compose.material3.CheckboxImpl (Checkbox.kt:271)");
            }
            int i11 = i10 >> 3;
            int i12 = i11 & 14;
            Transition transitionMUb = TransitionKt.mUb(toggleableState, null, composerKN, i12, 2);
            CheckboxKt$CheckboxImpl$checkDrawFraction$1 checkboxKt$CheckboxImpl$checkDrawFraction$1 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkDrawFraction$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                    return n(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i13) {
                    FiniteAnimationSpec finiteAnimationSpecQie;
                    composer2.eF(1373301606);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1373301606, i13, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:276)");
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
            composerKN.eF(1800065638);
            if (ComposerKt.v()) {
                ComposerKt.p5(1800065638, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:283)");
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
                composerKN.eF(1800065638);
                if (ComposerKt.v()) {
                    ComposerKt.p5(1800065638, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:283)");
                }
                i5 = iArr[toggleableState3.ordinal()];
                if (i5 == 1) {
                    c2 = 3;
                } else if (i5 != 2) {
                    c2 = 3;
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    c2 = 3;
                    f4 = 0.0f;
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composerKN.Xw();
                    stateJ2 = TransitionKt.J2(transitionMUb, fValueOf, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkDrawFraction$1.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ, "FloatAnimation", composerKN, 0);
                    CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                            return n(segment, composer2, num.intValue());
                        }

                        public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i14) {
                            FiniteAnimationSpec finiteAnimationSpecTy;
                            composer2.eF(-1324481169);
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1324481169, i14, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:293)");
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
                    composerKN.eF(-1426969489);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1426969489, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:300)");
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
                    composerKN.eF(-1426969489);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1426969489, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:300)");
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
                    stateJ22 = TransitionKt.J2(transitionMUb, fValueOf2, Float.valueOf(f6), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ2, "FloatAnimation", composerKN, 0);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = new CheckDrawingCache(null, null, null, 7, null);
                        composerKN.o(objIF);
                    }
                    checkDrawingCache = (CheckDrawingCache) objIF;
                    stateT = checkboxColors.t(toggleableState, composerKN, i12 | ((i10 >> 6) & 112));
                    int i14 = (i11 & 896) | (i10 & 126);
                    stateRl = checkboxColors.rl(z2, toggleableState, composerKN, i14);
                    stateN = checkboxColors.n(z2, toggleableState, composerKN, i14);
                    Modifier modifierHI = SizeKt.HI(SizeKt.E2(modifier, Alignment.INSTANCE.O(), false, 2, null), rl);
                    zP5 = composerKN.p5(stateRl) | composerKN.p5(stateN) | composerKN.p5(stateT) | composerKN.p5(stateJ2) | composerKN.p5(stateJ22);
                    objIF2 = composerKN.iF();
                    if (!zP5 || objIF2 == companion.n()) {
                        objIF2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1
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
                                float fFloor = (float) Math.floor(drawScope.l(CheckboxKt.f24735t));
                                CheckboxKt.xMQ(drawScope, ((Color) stateRl.getValue()).getValue(), ((Color) stateN.getValue()).getValue(), drawScope.l(CheckboxKt.nr), fFloor);
                                CheckboxKt.mUb(drawScope, ((Color) stateT.getValue()).getValue(), ((Number) stateJ2.getValue()).floatValue(), ((Number) stateJ22.getValue()).floatValue(), fFloor, checkDrawingCache);
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    CanvasKt.rl(modifierHI, (Function1) objIF2, composerKN, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
                f4 = 1.0f;
                if (ComposerKt.v()) {
                }
                composerKN.Xw();
                stateJ2 = TransitionKt.J2(transitionMUb, fValueOf, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkDrawFraction$1.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ, "FloatAnimation", composerKN, 0);
                CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$12 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                        return n(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i142) {
                        FiniteAnimationSpec finiteAnimationSpecTy;
                        composer2.eF(-1324481169);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1324481169, i142, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:293)");
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
                composerKN.eF(-1426969489);
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
                    composerKN.eF(-1426969489);
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
                    stateJ22 = TransitionKt.J2(transitionMUb, fValueOf22, Float.valueOf(f6), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$12.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ22, "FloatAnimation", composerKN, 0);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                    }
                    checkDrawingCache = (CheckDrawingCache) objIF;
                    stateT = checkboxColors.t(toggleableState, composerKN, i12 | ((i10 >> 6) & 112));
                    int i142 = (i11 & 896) | (i10 & 126);
                    stateRl = checkboxColors.rl(z2, toggleableState, composerKN, i142);
                    stateN = checkboxColors.n(z2, toggleableState, composerKN, i142);
                    Modifier modifierHI2 = SizeKt.HI(SizeKt.E2(modifier, Alignment.INSTANCE.O(), false, 2, null), rl);
                    zP5 = composerKN.p5(stateRl) | composerKN.p5(stateN) | composerKN.p5(stateT) | composerKN.p5(stateJ2) | composerKN.p5(stateJ22);
                    objIF2 = composerKN.iF();
                    if (!zP5) {
                        objIF2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1
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
                                float fFloor = (float) Math.floor(drawScope.l(CheckboxKt.f24735t));
                                CheckboxKt.xMQ(drawScope, ((Color) stateRl.getValue()).getValue(), ((Color) stateN.getValue()).getValue(), drawScope.l(CheckboxKt.nr), fFloor);
                                CheckboxKt.mUb(drawScope, ((Color) stateT.getValue()).getValue(), ((Number) stateJ2.getValue()).floatValue(), ((Number) stateJ22.getValue()).floatValue(), fFloor, checkDrawingCache);
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
                composerKN.eF(1800065638);
                if (ComposerKt.v()) {
                }
                i5 = iArr[toggleableState32.ordinal()];
                if (i5 == 1) {
                }
                f4 = 1.0f;
                if (ComposerKt.v()) {
                }
                composerKN.Xw();
                stateJ2 = TransitionKt.J2(transitionMUb, fValueOf3, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkDrawFraction$1.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ, "FloatAnimation", composerKN, 0);
                CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$122 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                        return n(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i1422) {
                        FiniteAnimationSpec finiteAnimationSpecTy;
                        composer2.eF(-1324481169);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1324481169, i1422, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:293)");
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
                composerKN.eF(-1426969489);
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
                composerKN.eF(1800065638);
                if (ComposerKt.v()) {
                }
                i5 = iArr[toggleableState322.ordinal()];
                if (i5 == 1) {
                }
                f4 = 1.0f;
                if (ComposerKt.v()) {
                }
                composerKN.Xw();
                stateJ2 = TransitionKt.J2(transitionMUb, fValueOf32, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkDrawFraction$1.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ, "FloatAnimation", composerKN, 0);
                CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1222 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                        return n(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i1422) {
                        FiniteAnimationSpec finiteAnimationSpecTy;
                        composer2.eF(-1324481169);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1324481169, i1422, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:293)");
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
                composerKN.eF(-1426969489);
                if (ComposerKt.v()) {
                }
                i7 = iArr[toggleableState4222.ordinal()];
                if (i7 != 1) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$2
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final ToggleableState toggleableState, final Function0 function0, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        ToggleableState toggleableState2;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        CheckboxColors checkboxColorsN;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        CheckboxColors checkboxColors2;
        MutableInteractionSource mutableInteractionSource3;
        int i9;
        boolean z4;
        boolean z5;
        int i10;
        Modifier modifierT;
        final CheckboxColors checkboxColors3;
        final Modifier modifier4;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1608358065);
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
        int i11 = i3 & 4;
        if (i11 != 0) {
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
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        checkboxColorsN = checkboxColors;
                        int i12 = composerKN.p5(checkboxColorsN) ? 16384 : 8192;
                        i5 |= i12;
                    } else {
                        checkboxColorsN = checkboxColors;
                    }
                    i5 |= i12;
                } else {
                    checkboxColorsN = checkboxColors;
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                    if ((196608 & i2) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 131072 : 65536;
                    }
                    if ((74899 & i5) == 74898 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier5 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                                checkboxColorsN = CheckboxDefaults.f24733n.n(composerKN, 6);
                            }
                            if (i8 == 0) {
                                modifier3 = modifier5;
                                mutableInteractionSource3 = null;
                                checkboxColors2 = checkboxColorsN;
                            } else {
                                modifier3 = modifier5;
                                checkboxColors2 = checkboxColorsN;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            i9 = i5;
                            z4 = z3;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                            }
                            i9 = i5;
                            modifier3 = modifier2;
                            z4 = z3;
                            checkboxColors2 = checkboxColorsN;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1608358065, i9, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                        }
                        composerKN.eF(-97239746);
                        if (function0 == null) {
                            i10 = i9;
                            modifierT = ToggleableKt.t(Modifier.INSTANCE, toggleableState2, mutableInteractionSource3, RippleKt.nr(false, Dp.KN(CheckboxTokens.f29414n.nr() / 2), 0L, composerKN, 54, 4), z4, Role.mUb(Role.INSTANCE.t()), function0);
                            mutableInteractionSource2 = mutableInteractionSource3;
                            z5 = z4;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource3;
                            z5 = z4;
                            i10 = i9;
                            modifierT = Modifier.INSTANCE;
                        }
                        composerKN.Xw();
                        CheckboxColors checkboxColors4 = checkboxColors2;
                        rl(z5, toggleableState, PaddingKt.xMQ(modifier3.Zmq(function0 == null ? InteractiveComponentSizeKt.rl(Modifier.INSTANCE) : Modifier.INSTANCE).Zmq(modifierT), f24734n), checkboxColors4, composerKN, ((i10 >> 9) & 14) | ((i10 << 3) & 112) | ((i10 >> 3) & 7168));
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        checkboxColors3 = checkboxColors4;
                        modifier4 = modifier3;
                        z6 = z5;
                    } else {
                        composerKN.wTp();
                        modifier4 = modifier2;
                        z6 = z3;
                        checkboxColors3 = checkboxColorsN;
                    }
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CheckboxKt$TriStateCheckbox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i13) {
                                CheckboxKt.t(toggleableState, function0, modifier4, z6, checkboxColors3, mutableInteractionSource4, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((74899 & i5) == 74898) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i11 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        i9 = i5;
                        z4 = z3;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        composerKN.eF(-97239746);
                        if (function0 == null) {
                        }
                        composerKN.Xw();
                        CheckboxColors checkboxColors42 = checkboxColors2;
                        rl(z5, toggleableState, PaddingKt.xMQ(modifier3.Zmq(function0 == null ? InteractiveComponentSizeKt.rl(Modifier.INSTANCE) : Modifier.INSTANCE).Zmq(modifierT), f24734n), checkboxColors42, composerKN, ((i10 >> 9) & 14) | ((i10 << 3) & 112) | ((i10 >> 3) & 7168));
                        if (ComposerKt.v()) {
                        }
                        checkboxColors3 = checkboxColors42;
                        modifier4 = modifier3;
                        z6 = z5;
                    }
                }
                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((74899 & i5) == 74898) {
            }
            final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((74899 & i5) == 74898) {
        }
        final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(DrawScope drawScope, long j2, long j3, float f3, float f4) {
        float f5 = f4 / 2.0f;
        Stroke stroke = new Stroke(f4, 0.0f, 0, 0, null, 30, null);
        float fGh = Size.gh(drawScope.t());
        if (Color.HI(j2, j3)) {
            DrawScope.HE(drawScope, j2, 0L, androidx.compose.ui.geometry.SizeKt.n(fGh, fGh), CornerRadiusKt.rl(f3, 0.0f, 2, null), Fill.f31654n, 0.0f, null, 0, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, null);
            return;
        }
        float f6 = fGh - (2 * f4);
        DrawScope.HE(drawScope, j2, OffsetKt.n(f4, f4), androidx.compose.ui.geometry.SizeKt.n(f6, f6), CornerRadiusKt.rl(Math.max(0.0f, f3 - f4), 0.0f, 2, null), Fill.f31654n, 0.0f, null, 0, 224, null);
        float f7 = fGh - f4;
        DrawScope.HE(drawScope, j3, OffsetKt.n(f5, f5), androidx.compose.ui.geometry.SizeKt.n(f7, f7), CornerRadiusKt.rl(f3 - f5, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }
}
