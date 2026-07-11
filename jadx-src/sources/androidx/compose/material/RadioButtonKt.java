package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001aQ\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f\"\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f\"\u0014\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000f\"\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001b"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/RadioButtonColors;", "colors", c.f62177j, "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonRippleRadius", "rl", "RadioButtonPadding", "t", "RadioButtonSize", "nr", "RadioRadius", "O", "RadioButtonDotSize", "J2", "RadioStrokeWidth", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,224:1\n72#2:225\n72#2:236\n149#3:226\n149#3:233\n149#3:234\n149#3:235\n149#3:237\n149#3:238\n1247#4,6:227\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n*L\n85#1:225\n221#1:236\n85#1:226\n218#1:233\n219#1:234\n220#1:235\n222#1:237\n223#1:238\n115#1:227,6\n*E\n"})
public final class RadioButtonKt {
    private static final float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f22578O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f22579n = Dp.KN(24);
    private static final float nr;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f22580t;

    static {
        float f3 = 2;
        rl = Dp.KN(f3);
        float fKN = Dp.KN(20);
        f22580t = fKN;
        nr = Dp.KN(fKN / f3);
        f22578O = Dp.KN(12);
        J2 = Dp.KN(f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final boolean z2, final Function0 function0, Modifier modifier, boolean z3, MutableInteractionSource mutableInteractionSource, RadioButtonColors radioButtonColors, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        RadioButtonColors radioButtonColors2;
        final Modifier modifier3;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier4;
        boolean z6;
        Composer composer2;
        int i9;
        RadioButtonColors radioButtonColorsN;
        MutableInteractionSource mutableInteractionSource4;
        int i10;
        float fKN;
        ?? r10;
        Modifier modifier5;
        int i11;
        Modifier modifierN;
        Composer composerKN = composer.KN(1314435585);
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
            i5 |= composerKN.E2(function0) ? 32 : 16;
        }
        int i12 = i3 & 4;
        if (i12 != 0) {
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
                            radioButtonColors2 = radioButtonColors;
                            int i13 = composerKN.p5(radioButtonColors2) ? 131072 : 65536;
                            i5 |= i13;
                        } else {
                            radioButtonColors2 = radioButtonColors;
                        }
                        i5 |= i13;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        z5 = z4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) == 0 || composerKN.rV9()) {
                            modifier4 = i12 != 0 ? Modifier.INSTANCE : modifier2;
                            z6 = i7 != 0 ? true : z4;
                            MutableInteractionSource mutableInteractionSource5 = i8 != 0 ? null : mutableInteractionSource2;
                            if ((i3 & 32) != 0) {
                                composer2 = composerKN;
                                i9 = i5 & (-458753);
                                radioButtonColorsN = RadioButtonDefaults.f22577n.n(0L, 0L, 0L, composer2, 3072, 7);
                            } else {
                                composer2 = composerKN;
                                i9 = i5;
                                radioButtonColorsN = radioButtonColors2;
                            }
                            mutableInteractionSource4 = mutableInteractionSource5;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                            }
                            i9 = i5;
                            modifier4 = modifier2;
                            z6 = z4;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            composer2 = composerKN;
                            radioButtonColorsN = radioButtonColors2;
                        }
                        composer2.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1314435585, i9, -1, "androidx.compose.material.RadioButton (RadioButton.kt:81)");
                        }
                        if (z2) {
                            i10 = 2;
                            fKN = Dp.KN(f22578O / 2);
                        } else {
                            i10 = 2;
                            fKN = Dp.KN(0);
                        }
                        int i14 = i10;
                        int i15 = i9;
                        composerKN = composer2;
                        final State stateT = AnimateAsStateKt.t(fKN, AnimationSpecKt.ty(100, 0, null, 6, null), null, null, composerKN, 48, 12);
                        int i16 = i15 >> 9;
                        final State stateN = radioButtonColorsN.n(z6, z2, composerKN, ((i15 << 3) & 112) | (i16 & 14) | (i16 & 896));
                        if (function0 != null) {
                            Modifier.Companion companion = Modifier.INSTANCE;
                            int iJ2 = Role.INSTANCE.J2();
                            IndicationNodeFactory indicationNodeFactoryJ2 = RippleKt.J2(false, f22579n, 0L, 4, null);
                            Role roleMUb = Role.mUb(iJ2);
                            radioButtonColors2 = radioButtonColorsN;
                            modifier5 = modifier4;
                            i11 = i14;
                            r10 = 0;
                            z5 = z6;
                            modifierN = SelectableKt.n(companion, z2, mutableInteractionSource4, indicationNodeFactoryJ2, z5, roleMUb, function0);
                        } else {
                            radioButtonColors2 = radioButtonColorsN;
                            r10 = 0;
                            modifier5 = modifier4;
                            z5 = z6;
                            i11 = i14;
                            modifierN = Modifier.INSTANCE;
                        }
                        Modifier modifierHI = SizeKt.HI(PaddingKt.xMQ(SizeKt.E2(modifier5.Zmq(function0 != null ? InteractiveComponentSizeKt.t(Modifier.INSTANCE) : Modifier.INSTANCE).Zmq(modifierN), Alignment.INSTANCE.O(), r10, i11, null), rl), f22580t);
                        boolean zP5 = composerKN.p5(stateN) | composerKN.p5(stateT);
                        Object objIF = composerKN.iF();
                        if (zP5 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$1$1
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
                                    float fL = drawScope.l(RadioButtonKt.J2);
                                    float f3 = fL / 2;
                                    DrawScope.Lu(drawScope, ((Color) stateN.getValue()).getValue(), drawScope.l(RadioButtonKt.nr) - f3, 0L, 0.0f, new Stroke(fL, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (Dp.Uo(((Dp) stateT.getValue()).getValue(), Dp.KN(0)) > 0) {
                                        DrawScope.Lu(drawScope, ((Color) stateN.getValue()).getValue(), drawScope.l(((Dp) stateT.getValue()).getValue()) - f3, 0L, 0.0f, Fill.f31654n, null, 0, 108, null);
                                    }
                                }
                            };
                            composerKN.o(objIF);
                        }
                        CanvasKt.rl(modifierHI, (Function1) objIF, composerKN, r10);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        mutableInteractionSource3 = mutableInteractionSource4;
                        modifier3 = modifier5;
                    }
                    final RadioButtonColors radioButtonColors3 = radioButtonColors2;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i17) {
                                RadioButtonKt.n(z2, function0, modifier3, z5, mutableInteractionSource3, radioButtonColors3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
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
                final RadioButtonColors radioButtonColors32 = radioButtonColors2;
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
            final RadioButtonColors radioButtonColors322 = radioButtonColors2;
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
        final RadioButtonColors radioButtonColors3222 = radioButtonColors2;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
