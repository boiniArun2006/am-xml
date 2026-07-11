package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001aq\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0088\u0001\u0010\u0014\u001a\u00020\u00012\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017\"\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Landroidx/compose/material/FloatingActionButtonElevation;", "elevation", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "text", "icon", c.f62177j, "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "F", "FabSize", "ExtendedFabSize", "t", "ExtendedFabIconPadding", "nr", "ExtendedFabTextPadding", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,398:1\n1247#2,6:399\n149#3:405\n149#3:406\n149#3:407\n149#3:408\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n*L\n93#1:399,6\n394#1:405\n395#1:406\n396#1:407\n397#1:408\n*E\n"})
public final class FloatingActionButtonKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f22065n = Dp.KN(56);
    private static final float rl = Dp.KN(48);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f22066t = Dp.KN(12);
    private static final float nr = Dp.KN(20);

    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function2 function2, final Function0 function0, Modifier modifier, Function2 function22, MutableInteractionSource mutableInteractionSource, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, Composer composer, final int i2, final int i3) {
        int i5;
        Function0 function02;
        Modifier modifier2;
        int i7;
        final Function2 function23;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Shape shapeRl;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        final Modifier modifier3;
        Composer composer2;
        final Function2 function24;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape2;
        final long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i9;
        long jQie;
        long jRl;
        Composer composer3;
        MutableInteractionSource mutableInteractionSource4;
        FloatingActionButtonElevation floatingActionButtonElevationN;
        long j6;
        long j7;
        Composer composerKN = composer.KN(-1555720195);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
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
                    function23 = function22;
                    i5 |= composerKN.E2(function23) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 == 0) {
                    if ((i2 & 24576) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 16384 : 8192;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            shapeRl = shape;
                            int i11 = composerKN.p5(shapeRl) ? 131072 : 65536;
                            i5 |= i11;
                        } else {
                            shapeRl = shape;
                        }
                        i5 |= i11;
                    } else {
                        shapeRl = shape;
                    }
                    if ((1572864 & i2) == 0) {
                        i5 |= ((i3 & 64) == 0 && composerKN.nr(j2)) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        i5 |= ((i3 & 128) == 0 && composerKN.nr(j3)) ? 8388608 : 4194304;
                    }
                    if ((100663296 & i2) != 0) {
                        if ((i3 & 256) == 0) {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                            int i12 = composerKN.p5(floatingActionButtonElevation2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            i5 |= i12;
                        } else {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                        }
                        i5 |= i12;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        composer2 = composerKN;
                        function24 = function23;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeRl;
                        j4 = j2;
                        j5 = j3;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) == 0 || composerKN.rV9()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                function23 = null;
                            }
                            if (i8 != 0) {
                                mutableInteractionSource2 = null;
                            }
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                                shapeRl = MaterialTheme.f22169n.rl(composerKN, 6).getSmall().rl(CornerSizeKt.n(50));
                            }
                            if ((i3 & 64) != 0) {
                                i9 = i5 & (-3670017);
                                jQie = MaterialTheme.f22169n.n(composerKN, 6).qie();
                            } else {
                                i9 = i5;
                                jQie = j2;
                            }
                            if ((i3 & 128) != 0) {
                                jRl = ColorsKt.rl(jQie, composerKN, (i9 >> 18) & 14);
                                i9 &= -29360129;
                            } else {
                                jRl = j3;
                            }
                            if ((i3 & 256) != 0) {
                                composer3 = composerKN;
                                i9 &= -234881025;
                                floatingActionButtonElevationN = FloatingActionButtonDefaults.f22054n.n(0.0f, 0.0f, 0.0f, 0.0f, composerKN, 24576, 15);
                                mutableInteractionSource4 = mutableInteractionSource2;
                            } else {
                                composer3 = composerKN;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                floatingActionButtonElevationN = floatingActionButtonElevation2;
                            }
                            j6 = jRl;
                            j7 = jQie;
                            i5 = i9;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i5 &= -234881025;
                            }
                            j7 = j2;
                            j6 = j3;
                            composer3 = composerKN;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            floatingActionButtonElevationN = floatingActionButtonElevation2;
                        }
                        Shape shape3 = shapeRl;
                        composer3.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1555720195, i5, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:159)");
                        }
                        float f3 = rl;
                        int i13 = i5 >> 6;
                        rl(function02, SizeKt.aYN(modifier2, f3, f3, 0.0f, 0.0f, 12, null), mutableInteractionSource4, shape3, j7, j6, floatingActionButtonElevationN, ComposableLambdaKt.nr(1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void n(Composer composer4, int i14) {
                                if (!composer4.HI((i14 & 3) != 2, 1 & i14)) {
                                    composer4.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1418981691, i14, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:169)");
                                }
                                float f4 = function23 == null ? FloatingActionButtonKt.nr : FloatingActionButtonKt.f22066t;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierAz = PaddingKt.az(companion, f4, 0.0f, FloatingActionButtonKt.nr, 0.0f, 10, null);
                                Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                Function2 function25 = function23;
                                Function2 function26 = function2;
                                MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), verticalXMQ, composer4, 48);
                                int iN = ComposablesKt.n(composer4, 0);
                                CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer4, modifierAz);
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
                                Updater.O(composerN, measurePolicyRl, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                Function2 function2Rl = companion2.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                if (function25 != null) {
                                    composer4.eF(-565217870);
                                    function25.invoke(composer4, 0);
                                    SpacerKt.n(SizeKt.ViF(companion, FloatingActionButtonKt.f22066t), composer4, 6);
                                    composer4.Xw();
                                } else {
                                    composer4.eF(-565120809);
                                    composer4.Xw();
                                }
                                function26.invoke(composer4, 0);
                                composer4.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                n(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, 12582912 | ((i5 >> 3) & 14) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (i13 & 3670016), 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier2;
                        composer2 = composer3;
                        function24 = function23;
                        mutableInteractionSource3 = mutableInteractionSource4;
                        shape2 = shape3;
                        j4 = j7;
                        j5 = j6;
                        floatingActionButtonElevation2 = floatingActionButtonElevationN;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                                FloatingActionButtonKt.n(function2, function0, modifier3, function24, mutableInteractionSource3, shape2, j4, j5, floatingActionButtonElevation2, composer4, RecomposeScopeImplKt.n(i2 | 1), i3);
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
                if ((1572864 & i2) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((100663296 & i2) != 0) {
                }
                if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function23 = function22;
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i2) != 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((100663296 & i2) != 0) {
            }
            if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        function23 = function22;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i2) != 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((100663296 & i2) != 0) {
        }
        if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function0 function0, Modifier modifier, MutableInteractionSource mutableInteractionSource, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        long j4;
        final long jRl;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape3;
        final long j5;
        final long j6;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier2;
        Shape shapeRl;
        long jQie;
        Composer composer3;
        FloatingActionButtonElevation floatingActionButtonElevationN;
        Shape shape4;
        long j7;
        int i8;
        boolean z2;
        MutableInteractionSource mutableInteractionSource4;
        Composer composerKN = composer.KN(1028985328);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.p5(modifier) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i5 |= composerKN.p5(mutableInteractionSource2) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shape2 = shape;
                        int i10 = composerKN.p5(shape2) ? 2048 : 1024;
                        i5 |= i10;
                    } else {
                        shape2 = shape;
                    }
                    i5 |= i10;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        j4 = j2;
                        int i11 = composerKN.nr(j4) ? 16384 : 8192;
                        i5 |= i11;
                    } else {
                        j4 = j2;
                    }
                    i5 |= i11;
                } else {
                    j4 = j2;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        jRl = j3;
                        int i12 = composerKN.nr(jRl) ? 131072 : 65536;
                        i5 |= i12;
                    } else {
                        jRl = j3;
                    }
                    i5 |= i12;
                } else {
                    jRl = j3;
                }
                if ((i2 & 1572864) == 0) {
                    i5 |= ((i3 & 64) == 0 && composerKN.p5(floatingActionButtonElevation)) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= composerKN.E2(function2) ? 8388608 : 4194304;
                }
                if (composerKN.HI((4793491 & i5) != 4793490, i5 & 1)) {
                    composerKN.e();
                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                        modifier2 = i9 != 0 ? Modifier.INSTANCE : modifier;
                        if (i7 != 0) {
                            mutableInteractionSource2 = null;
                        }
                        if ((i3 & 8) != 0) {
                            shapeRl = MaterialTheme.f22169n.rl(composerKN, 6).getSmall().rl(CornerSizeKt.n(50));
                            i5 &= -7169;
                        } else {
                            shapeRl = shape2;
                        }
                        if ((i3 & 16) != 0) {
                            jQie = MaterialTheme.f22169n.n(composerKN, 6).qie();
                            i5 &= -57345;
                        } else {
                            jQie = j4;
                        }
                        if ((i3 & 32) != 0) {
                            jRl = ColorsKt.rl(jQie, composerKN, (i5 >> 12) & 14);
                            i5 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            floatingActionButtonElevationN = FloatingActionButtonDefaults.f22054n.n(0.0f, 0.0f, 0.0f, 0.0f, composerKN, 24576, 15);
                            composer3 = composerKN;
                            i5 &= -3670017;
                        } else {
                            composer3 = composerKN;
                            floatingActionButtonElevationN = floatingActionButtonElevation;
                        }
                        shape4 = shapeRl;
                        j7 = jQie;
                        i8 = 1028985328;
                        z2 = false;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        modifier2 = modifier;
                        composer3 = composerKN;
                        shape4 = shape2;
                        j7 = j4;
                        i8 = 1028985328;
                        z2 = false;
                        floatingActionButtonElevationN = floatingActionButtonElevation;
                    }
                    composer3.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(i8, i5, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:90)");
                    }
                    if (mutableInteractionSource2 == null) {
                        composer3.eF(-1991740377);
                        Object objIF = composer3.iF();
                        if (objIF == Composer.INSTANCE.n()) {
                            objIF = InteractionSourceKt.n();
                            composer3.o(objIF);
                        }
                        mutableInteractionSource4 = (MutableInteractionSource) objIF;
                        composer3.Xw();
                    } else {
                        composer3.eF(628486320);
                        composer3.Xw();
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    modifier = modifier2;
                    long j9 = jRl;
                    SurfaceKt.rl(function02, SemanticsModifierKt.nr(modifier2, z2, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                        }
                    }, 1, null), false, shape4, j7, j9, null, ((Dp) floatingActionButtonElevationN.n(mutableInteractionSource4, composer3, (i5 >> 15) & 112).getValue()).getValue(), mutableInteractionSource4, ComposableLambdaKt.nr(1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            n(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer4, int i13) {
                            if (!composer4.HI((i13 & 3) != 2, i13 & 1)) {
                                composer4.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1972871863, i13, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:102)");
                            }
                            ProvidedValue providedValueNr = ContentAlphaKt.n().nr(Float.valueOf(Color.ck(jRl)));
                            final Function2 function22 = function2;
                            CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    n(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer5, int i14) {
                                    if (!composer5.HI((i14 & 3) != 2, i14 & 1)) {
                                        composer5.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1867794295, i14, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:103)");
                                    }
                                    TextStyle button = MaterialTheme.f22169n.t(composer5, 6).getButton();
                                    final Function2 function23 = function22;
                                    TextKt.n(button, ComposableLambdaKt.nr(-1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                        {
                                            super(2);
                                        }

                                        public final void n(Composer composer6, int i15) {
                                            if (!composer6.HI((i15 & 3) != 2, 1 & i15)) {
                                                composer6.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1567914264, i15, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:104)");
                                            }
                                            Modifier modifierN = SizeKt.n(Modifier.INSTANCE, FloatingActionButtonKt.f22065n, FloatingActionButtonKt.f22065n);
                                            Alignment alignmentO = Alignment.INSTANCE.O();
                                            Function2 function24 = function23;
                                            MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                            int iN = ComposablesKt.n(composer6, 0);
                                            CompositionLocalMap compositionLocalMapIk = composer6.Ik();
                                            Modifier modifierO = ComposedModifierKt.O(composer6, modifierN);
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0 function0N = companion.n();
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
                                            Updater.O(composerN, measurePolicyUo, companion.t());
                                            Updater.O(composerN, compositionLocalMapIk, companion.O());
                                            Function2 function2Rl = companion.rl();
                                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                composerN.o(Integer.valueOf(iN));
                                                composerN.az(Integer.valueOf(iN), function2Rl);
                                            }
                                            Updater.O(composerN, modifierO, companion.nr());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                            function24.invoke(composer6, 0);
                                            composer6.XQ();
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                            n(composer6, num.intValue());
                                            return Unit.INSTANCE;
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
                    }, composer3, 54), composer3, (i5 & 14) | com.google.android.exoplayer2.C.ENCODING_PCM_32BIT | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 68);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    floatingActionButtonElevation2 = floatingActionButtonElevationN;
                    composer2 = composer3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape3 = shape4;
                    j5 = j7;
                    j6 = j9;
                } else {
                    composerKN.wTp();
                    composer2 = composerKN;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape3 = shape2;
                    j5 = j4;
                    j6 = jRl;
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                final Modifier modifier3 = modifier;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            n(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer4, int i13) {
                            FloatingActionButtonKt.rl(function0, modifier3, mutableInteractionSource3, shape3, j5, j6, floatingActionButtonElevation2, function2, composer4, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if (composerKN.HI((4793491 & i5) != 4793490, i5 & 1)) {
            }
            final Modifier modifier32 = modifier;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if (composerKN.HI((4793491 & i5) != 4793490, i5 & 1)) {
        }
        final Modifier modifier322 = modifier;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
