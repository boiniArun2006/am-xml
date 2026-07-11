package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.RadioButtonTokens;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aQ\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/material3/RadioButtonColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", c.f62177j, "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "rl", "RadioButtonDotSize", "t", "RadioStrokeWidth", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,273:1\n71#2:274\n71#2:276\n148#3:275\n148#3:283\n148#3:284\n148#3:285\n1223#4,6:277\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n*L\n86#1:274\n101#1:276\n86#1:275\n270#1:283\n271#1:284\n272#1:285\n120#1:277,6\n*E\n"})
public final class RadioButtonKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f27144n;
    private static final float rl = Dp.KN(12);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f27145t;

    static {
        float f3 = 2;
        f27144n = Dp.KN(f3);
        f27145t = Dp.KN(f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final boolean z2, final Function0 function0, Modifier modifier, boolean z3, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z4;
        RadioButtonColors radioButtonColorsN;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource3;
        int i9;
        boolean z5;
        RadioButtonColors radioButtonColors2;
        ?? r10;
        final State state;
        State state2;
        Modifier modifier4;
        final boolean z6;
        Modifier modifierN;
        final State state3;
        boolean zP5;
        Object objIF;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(408580840);
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
                    z4 = z3;
                    i5 |= composerKN.n(z4) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        radioButtonColorsN = radioButtonColors;
                        int i11 = composerKN.p5(radioButtonColorsN) ? 16384 : 8192;
                        i5 |= i11;
                    } else {
                        radioButtonColorsN = radioButtonColors;
                    }
                    i5 |= i11;
                } else {
                    radioButtonColorsN = radioButtonColors;
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
                            modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                                radioButtonColorsN = RadioButtonDefaults.f27143n.n(composerKN, 6);
                            }
                            if (i8 == 0) {
                                i9 = i5;
                                z5 = z4;
                                radioButtonColors2 = radioButtonColorsN;
                                mutableInteractionSource3 = null;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(408580840, i9, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                                }
                                State stateT = AnimateAsStateKt.t(!z2 ? Dp.KN(rl / 2) : Dp.KN(0), AnimationSpecKt.ty(100, 0, null, 6, null), null, null, composerKN, 48, 12);
                                State stateN = radioButtonColors2.n(z5, z2, composerKN, ((i9 >> 6) & 896) | ((i9 >> 9) & 14) | ((i9 << 3) & 112));
                                composerKN.eF(1327106656);
                                if (function0 == null) {
                                    state2 = stateT;
                                    Modifier modifier6 = modifier3;
                                    z6 = z5;
                                    modifier4 = modifier6;
                                    radioButtonColorsN = radioButtonColors2;
                                    state = stateN;
                                    r10 = 0;
                                    modifierN = SelectableKt.n(Modifier.INSTANCE, z2, mutableInteractionSource3, RippleKt.nr(false, Dp.KN(RadioButtonTokens.f29846n.O() / 2), 0L, composerKN, 54, 4), z6, Role.mUb(Role.INSTANCE.J2()), function0);
                                } else {
                                    r10 = 0;
                                    radioButtonColorsN = radioButtonColors2;
                                    state = stateN;
                                    state2 = stateT;
                                    modifier4 = modifier3;
                                    z6 = z5;
                                    modifierN = Modifier.INSTANCE;
                                }
                                composerKN.Xw();
                                Modifier modifierHI = SizeKt.HI(PaddingKt.xMQ(SizeKt.E2(modifier4.Zmq(function0 == null ? InteractiveComponentSizeKt.rl(Modifier.INSTANCE) : Modifier.INSTANCE).Zmq(modifierN), Alignment.INSTANCE.O(), r10, 2, null), f27144n), RadioButtonTokens.f29846n.t());
                                state3 = state2;
                                zP5 = composerKN.p5(state) | composerKN.p5(state3);
                                objIF = composerKN.iF();
                                if (!zP5 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$1$1
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
                                            float fL = drawScope.l(RadioButtonKt.f27145t);
                                            float f3 = 2;
                                            float f4 = fL / f3;
                                            DrawScope.Lu(drawScope, ((Color) state.getValue()).getValue(), drawScope.l(Dp.KN(RadioButtonTokens.f29846n.t() / f3)) - f4, 0L, 0.0f, new Stroke(fL, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                            if (Dp.Uo(((Dp) state3.getValue()).getValue(), Dp.KN(0)) > 0) {
                                                DrawScope.Lu(drawScope, ((Color) state.getValue()).getValue(), drawScope.l(((Dp) state3.getValue()).getValue()) - f4, 0L, 0.0f, Fill.f31654n, null, 0, 108, null);
                                            }
                                        }
                                    };
                                    composerKN.o(objIF);
                                }
                                CanvasKt.rl(modifierHI, (Function1) objIF, composerKN, r10);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier5 = modifier4;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                i9 = i5;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                            }
                            mutableInteractionSource3 = mutableInteractionSource;
                            i9 = i5;
                            modifier3 = modifier2;
                        }
                        z5 = z4;
                        radioButtonColors2 = radioButtonColorsN;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        State stateT2 = AnimateAsStateKt.t(!z2 ? Dp.KN(rl / 2) : Dp.KN(0), AnimationSpecKt.ty(100, 0, null, 6, null), null, null, composerKN, 48, 12);
                        State stateN2 = radioButtonColors2.n(z5, z2, composerKN, ((i9 >> 6) & 896) | ((i9 >> 9) & 14) | ((i9 << 3) & 112));
                        composerKN.eF(1327106656);
                        if (function0 == null) {
                        }
                        composerKN.Xw();
                        Modifier modifierHI2 = SizeKt.HI(PaddingKt.xMQ(SizeKt.E2(modifier4.Zmq(function0 == null ? InteractiveComponentSizeKt.rl(Modifier.INSTANCE) : Modifier.INSTANCE).Zmq(modifierN), Alignment.INSTANCE.O(), r10, 2, null), f27144n), RadioButtonTokens.f29846n.t());
                        state3 = state2;
                        zP5 = composerKN.p5(state) | composerKN.p5(state3);
                        objIF = composerKN.iF();
                        if (!zP5) {
                            objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$1$1
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
                                    float fL = drawScope.l(RadioButtonKt.f27145t);
                                    float f3 = 2;
                                    float f4 = fL / f3;
                                    DrawScope.Lu(drawScope, ((Color) state.getValue()).getValue(), drawScope.l(Dp.KN(RadioButtonTokens.f29846n.t() / f3)) - f4, 0L, 0.0f, new Stroke(fL, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (Dp.Uo(((Dp) state3.getValue()).getValue(), Dp.KN(0)) > 0) {
                                        DrawScope.Lu(drawScope, ((Color) state.getValue()).getValue(), drawScope.l(((Dp) state3.getValue()).getValue()) - f4, 0L, 0.0f, Fill.f31654n, null, 0, 108, null);
                                    }
                                }
                            };
                            composerKN.o(objIF);
                            CanvasKt.rl(modifierHI2, (Function1) objIF, composerKN, r10);
                            if (ComposerKt.v()) {
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier5 = modifier4;
                        }
                    } else {
                        composerKN.wTp();
                        modifier5 = modifier2;
                        z6 = z4;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    final RadioButtonColors radioButtonColors3 = radioButtonColorsN;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i12) {
                                RadioButtonKt.n(z2, function0, modifier5, z6, radioButtonColors3, mutableInteractionSource4, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
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
                        if (i10 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i8 == 0) {
                        }
                    }
                }
                final RadioButtonColors radioButtonColors32 = radioButtonColorsN;
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
            final RadioButtonColors radioButtonColors322 = radioButtonColorsN;
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
        final RadioButtonColors radioButtonColors3222 = radioButtonColorsN;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
