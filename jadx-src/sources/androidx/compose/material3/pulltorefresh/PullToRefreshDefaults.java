package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001e\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001fR\u0017\u0010 \u001a\u00020\n8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "", "isRefreshing", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/unit/Dp;", "threshold", "", c.f62177j, "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;ZLandroidx/compose/ui/Modifier;JJFLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "rl", "Landroidx/compose/ui/graphics/Shape;", "J2", "()Landroidx/compose/ui/graphics/Shape;", "shape", "t", "F", "O", "()F", "PositionalThreshold", "nr", "Elevation", "(Landroidx/compose/runtime/Composer;I)J", "indicatorColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,678:1\n71#2:679\n69#2,5:680\n74#2:713\n78#2:717\n78#3,6:685\n85#3,4:700\n89#3,2:710\n93#3:716\n368#4,9:691\n377#4:712\n378#4,2:714\n4032#5,6:704\n148#6:718\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults\n*L\n442#1:679\n442#1:680,5\n442#1:713\n442#1:717\n442#1:685,6\n442#1:700,4\n442#1:710,2\n442#1:716\n442#1:691,9\n442#1:712\n442#1:714,2\n442#1:704,6\n427#1:718\n*E\n"})
public final class PullToRefreshDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final PullToRefreshDefaults f29315n = new PullToRefreshDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final Shape shape = RoundedCornerShapeKt.J2();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float PositionalThreshold = Dp.KN(80);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float Elevation = ElevationTokens.f29511n.t();

    public final Shape J2() {
        return shape;
    }

    public final float O() {
        return PositionalThreshold;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(final PullToRefreshState pullToRefreshState, final boolean z2, Modifier modifier, long j2, long j3, float f3, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Modifier modifier2;
        long jRl;
        float f4;
        long jNr;
        final long j4;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        final long j5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1076870256);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(pullToRefreshState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.n(z2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        jRl = j2;
                        int i8 = composerKN.nr(jRl) ? 2048 : 1024;
                        i5 |= i8;
                    } else {
                        jRl = j2;
                    }
                    i5 |= i8;
                } else {
                    jRl = j2;
                }
                if ((i2 & 24576) == 0) {
                    i5 |= ((i3 & 16) == 0 && composerKN.nr(j3)) ? 16384 : 8192;
                }
                if ((i2 & 196608) == 0) {
                    if ((i3 & 32) == 0) {
                        f4 = f3;
                        int i9 = composerKN.rl(f4) ? 131072 : 65536;
                        i5 |= i9;
                    } else {
                        f4 = f3;
                    }
                    i5 |= i9;
                } else {
                    f4 = f3;
                }
                if ((i3 & 64) != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i5 |= composerKN.p5(this) ? 1048576 : 524288;
                }
                if ((599187 & i5) == 599186 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier3 = modifier2;
                    j4 = jRl;
                    composer2 = composerKN;
                    j5 = j3;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 8) != 0) {
                            jRl = f29315n.rl(composerKN, 6);
                            i5 &= -7169;
                        }
                        if ((i3 & 16) == 0) {
                            jNr = f29315n.nr(composerKN, 6);
                            i5 &= -57345;
                        } else {
                            jNr = j3;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                            f4 = PositionalThreshold;
                        }
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
                        jNr = j3;
                    }
                    int i10 = i5;
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1076870256, i10, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:440)");
                    }
                    j4 = jRl;
                    Modifier modifier4 = modifier2;
                    final long j6 = jNr;
                    Modifier modifierIk = PullToRefreshKt.Ik(modifier4, pullToRefreshState, z2, f4, null, j4, 0.0f, 40, null);
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierIk);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.r();
                    } else {
                        composerKN.s7N(function0N);
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyUo, companion.t());
                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                    function2Rl = companion.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    composer2 = composerKN;
                    j5 = j6;
                    CrossfadeKt.rl(Boolean.valueOf(z2), null, AnimationSpecKt.ty(100, 0, null, 6, null), null, ComposableLambdaKt.nr(167807595, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer3, Integer num) {
                            n(bool.booleanValue(), composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(boolean z3, Composer composer3, int i11) {
                            if ((i11 & 6) == 0) {
                                i11 |= composer3.n(z3) ? 4 : 2;
                            }
                            if ((i11 & 19) == 18 && composer3.xMQ()) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(167807595, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous>.<anonymous> (PullToRefresh.kt:455)");
                            }
                            if (z3) {
                                composer3.eF(576835739);
                                ProgressIndicatorKt.nr(SizeKt.Z(Modifier.INSTANCE, PullToRefreshKt.az()), j6, PullToRefreshKt.f29333n, 0L, 0, composer3, 390, 24);
                                composer3.Xw();
                            } else {
                                composer3.eF(577079337);
                                boolean zP5 = composer3.p5(pullToRefreshState);
                                final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                                Object objIF = composer3.iF();
                                if (zP5 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new Function0<Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final Float invoke() {
                                            return Float.valueOf(pullToRefreshState2.n());
                                        }
                                    };
                                    composer3.o(objIF);
                                }
                                PullToRefreshKt.rl((Function0) objIF, j6, composer3, 0);
                                composer3.Xw();
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composer2, ((i10 >> 3) & 14) | 24960, 10);
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                }
                final float f5 = f4;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i11) {
                            this.f29324n.n(pullToRefreshState, z2, modifier3, j4, j5, f5, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            modifier2 = modifier;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((599187 & i5) == 599186) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i7 != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if ((i3 & 16) == 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    int i102 = i5;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    j4 = jRl;
                    Modifier modifier42 = modifier2;
                    final long j62 = jNr;
                    Modifier modifierIk2 = PullToRefreshKt.Ik(modifier42, pullToRefreshState, z2, f4, null, j4, 0.0f, 40, null);
                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierIk2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 function0N2 = companion2.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyUo2, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk2, companion2.O());
                    function2Rl = companion2.rl();
                    if (!composerN.getInserting()) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                        Updater.O(composerN, modifierO2, companion2.nr());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                        composer2 = composerKN;
                        j5 = j62;
                        CrossfadeKt.rl(Boolean.valueOf(z2), null, AnimationSpecKt.ty(100, 0, null, 6, null), null, ComposableLambdaKt.nr(167807595, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer3, Integer num) {
                                n(bool.booleanValue(), composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(boolean z3, Composer composer3, int i11) {
                                if ((i11 & 6) == 0) {
                                    i11 |= composer3.n(z3) ? 4 : 2;
                                }
                                if ((i11 & 19) == 18 && composer3.xMQ()) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(167807595, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous>.<anonymous> (PullToRefresh.kt:455)");
                                }
                                if (z3) {
                                    composer3.eF(576835739);
                                    ProgressIndicatorKt.nr(SizeKt.Z(Modifier.INSTANCE, PullToRefreshKt.az()), j62, PullToRefreshKt.f29333n, 0L, 0, composer3, 390, 24);
                                    composer3.Xw();
                                } else {
                                    composer3.eF(577079337);
                                    boolean zP5 = composer3.p5(pullToRefreshState);
                                    final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                                    Object objIF = composer3.iF();
                                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                                        objIF = new Function0<Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1$1$1$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final Float invoke() {
                                                return Float.valueOf(pullToRefreshState2.n());
                                            }
                                        };
                                        composer3.o(objIF);
                                    }
                                    PullToRefreshKt.rl((Function0) objIF, j62, composer3, 0);
                                    composer3.Xw();
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composer2, ((i102 >> 3) & 14) | 24960, 10);
                        composer2.XQ();
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier42;
                    }
                }
            }
            final float f53 = f4;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        modifier2 = modifier;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((599187 & i5) == 599186) {
        }
        final float f532 = f4;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public final float t() {
        return Elevation;
    }

    private PullToRefreshDefaults() {
    }

    public final long nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1441334156, i2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorColor> (PullToRefresh.kt:423)");
        }
        long onSurfaceVariant = MaterialTheme.f26164n.n(composer, 6).getOnSurfaceVariant();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return onSurfaceVariant;
    }

    public final long rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1066257972, i2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-containerColor> (PullToRefresh.kt:419)");
        }
        long surfaceContainerHigh = MaterialTheme.f26164n.n(composer, 6).getSurfaceContainerHigh();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return surfaceContainerHigh;
    }
}
