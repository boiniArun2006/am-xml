package androidx.compose.material.pullrefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a>\u0010\u001c\u001a\u00020\n*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f\"\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"\"\u0014\u0010%\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001f\"\u0014\u0010&\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f\"\u0014\u0010(\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001f\"\u0014\u0010*\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001f\"\u0014\u0010,\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001f\"\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063²\u0006\f\u00101\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"", "refreshing", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "scale", "", "nr", "(ZLandroidx/compose/material/pullrefresh/PullRefreshState;Landroidx/compose/ui/Modifier;JJZLandroidx/compose/runtime/Composer;II)V", TtmlNode.ATTR_TTS_COLOR, "rl", "(Landroidx/compose/material/pullrefresh/PullRefreshState;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "progress", "Landroidx/compose/material/pullrefresh/ArrowValues;", c.f62177j, "(F)Landroidx/compose/material/pullrefresh/ArrowValues;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Path;", "arrow", "Landroidx/compose/ui/geometry/Rect;", "bounds", "alpha", IV8ValueMap.FUNCTION_VALUES, "gh", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material/pullrefresh/ArrowValues;)V", "Landroidx/compose/ui/unit/Dp;", "F", "IndicatorSize", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "SpinnerShape", "t", "ArcRadius", "StrokeWidth", "O", "ArrowWidth", "J2", "ArrowHeight", "Uo", "Elevation", "Landroidx/compose/animation/core/TweenSpec;", "KN", "Landroidx/compose/animation/core/TweenSpec;", "AlphaTween", "showElevation", "targetAlpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 11 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,232:1\n1247#2,6:233\n1247#2,3:281\n1250#2,3:285\n1247#2,6:288\n1247#2,6:294\n75#3:239\n149#4:240\n149#4:337\n159#4:338\n159#4:339\n149#4:340\n149#4:341\n149#4:342\n71#5:241\n68#5,6:242\n74#5:276\n78#5:280\n79#6,6:248\n86#6,4:263\n90#6,2:273\n94#6:279\n368#7,9:254\n377#7:275\n378#7,2:277\n4034#8,6:267\n1#9:284\n71#10,16:300\n147#11,5:316\n272#11,14:321\n85#12:335\n85#12:336\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n*L\n84#1:233,6\n130#1:281,3\n130#1:285,3\n133#1:288,6\n138#1:294,6\n89#1:239\n98#1:240\n220#1:337\n222#1:338\n223#1:339\n224#1:340\n225#1:341\n226#1:342\n93#1:241\n93#1:242,6\n93#1:276\n93#1:280\n93#1:248,6\n93#1:263,4\n93#1:273,2\n93#1:279\n93#1:254,9\n93#1:275\n93#1:277,2\n93#1:267,6\n180#1:300,16\n214#1:316,5\n214#1:321,14\n84#1:335\n133#1:336\n*E\n"})
public final class PullRefreshIndicatorKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f23930n = Dp.KN(40);
    private static final RoundedCornerShape rl = RoundedCornerShapeKt.J2();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f23931t = Dp.KN((float) 7.5d);
    private static final float nr = Dp.KN((float) 2.5d);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f23929O = Dp.KN(10);
    private static final float J2 = Dp.KN(5);
    private static final float Uo = Dp.KN(6);
    private static final TweenSpec KN = AnimationSpecKt.ty(d.f62986a, 0, EasingKt.O(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrowValues n(float f3) {
        float fMax = (Math.max(Math.min(1.0f, f3) - 0.4f, 0.0f) * 5) / 3;
        float fAbs = Math.abs(f3) - 1.0f;
        float f4 = fAbs >= 0.0f ? fAbs : 0.0f;
        if (f4 > 2.0f) {
            f4 = 2.0f;
        }
        float fPow = (((0.4f * fMax) - 0.25f) + (f4 - (((float) Math.pow(f4, 2)) / 4))) * 0.5f;
        float f5 = 360;
        return new ArrowValues(fPow, fPow * f5, ((0.8f * fMax) + fPow) * f5, Math.min(1.0f, fMax));
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final boolean z2, final PullRefreshState pullRefreshState, Modifier modifier, long j2, long j3, boolean z3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        long jTy;
        boolean z4;
        int i7;
        long j4;
        int i8;
        boolean z5;
        final long jRl;
        final Modifier modifier3;
        final boolean z6;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        long j6;
        Color colorXMQ;
        int i9;
        Composer composerKN = composer.KN(308716636);
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
            i5 |= composerKN.E2(pullRefreshState) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    jTy = j2;
                    int i11 = composerKN.nr(jTy) ? 2048 : 1024;
                    i5 |= i11;
                } else {
                    jTy = j2;
                }
                i5 |= i11;
            } else {
                jTy = j2;
            }
            if ((i2 & 24576) != 0) {
                z4 = true;
                if ((i3 & 16) == 0) {
                    i9 = i5;
                    j4 = j3;
                    int i12 = composerKN.nr(j4) ? 16384 : 8192;
                    i7 = i9 | i12;
                } else {
                    i9 = i5;
                    j4 = j3;
                }
                i7 = i9 | i12;
            } else {
                z4 = true;
                i7 = i5;
                j4 = j3;
            }
            i8 = i3 & 32;
            if (i8 != 0) {
                if ((i2 & 196608) == 0) {
                    z5 = z3;
                    i7 |= composerKN.n(z5) ? 131072 : 65536;
                }
                if (composerKN.HI((i7 & 74899) != 74898 ? z4 : false, i7 & 1)) {
                    composerKN.e();
                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 8) != 0) {
                            jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                            i7 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            jRl = ColorsKt.rl(jTy, composerKN, (i7 >> 9) & 14);
                            i7 &= -57345;
                        } else {
                            jRl = j4;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                    } else {
                        composerKN.wTp();
                        if ((i3 & 8) != 0) {
                            i7 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i7 &= -57345;
                        }
                        jRl = j4;
                    }
                    Modifier modifier4 = modifier2;
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(308716636, i7, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)");
                    }
                    int i13 = i7 & 14;
                    boolean zP5 = (i13 == 4 ? z4 : false) | composerKN.p5(pullRefreshState);
                    Object objIF = composerKN.iF();
                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = SnapshotStateKt.O(new Function0<Boolean>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke() {
                                return Boolean.valueOf(z2 || pullRefreshState.xMQ() > 0.5f);
                            }
                        });
                        composerKN.o(objIF);
                    }
                    State state = (State) objIF;
                    ElevationOverlay elevationOverlay = (ElevationOverlay) composerKN.ty(ElevationOverlayKt.nr());
                    if (elevationOverlay == null) {
                        composerKN.eF(-1347611339);
                        composerKN.Xw();
                        j6 = jTy;
                        colorXMQ = null;
                    } else {
                        composerKN.eF(1619096652);
                        long j7 = jTy;
                        long jN = elevationOverlay.n(j7, Uo, composerKN, ((i7 >> 9) & 14) | 48);
                        j6 = j7;
                        composerKN.Xw();
                        colorXMQ = Color.xMQ(jN);
                    }
                    long value = colorXMQ != null ? colorXMQ.getValue() : j6;
                    Modifier modifierN = PullRefreshIndicatorTransformKt.n(SizeKt.Z(modifier4, f23930n), pullRefreshState, z5);
                    float fKN = O(state) ? Uo : Dp.KN(0);
                    RoundedCornerShape roundedCornerShape = rl;
                    Modifier modifierT = BackgroundKt.t(ShadowKt.rl(modifierN, fKN, roundedCornerShape, true, 0L, 0L, 24, null), value, roundedCornerShape);
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                    int iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.s7N(function0N);
                    } else {
                        composerKN.r();
                    }
                    Composer composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyUo, companion.t());
                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                    Function2 function2Rl = companion.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    CrossfadeKt.rl(Boolean.valueOf(z2), null, AnimationSpecKt.ty(100, 0, null, 6, null), null, ComposableLambdaKt.nr(1853731063, z4, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        public final void n(boolean z7, Composer composer2, int i14) {
                            int i15;
                            if ((i14 & 6) == 0) {
                                i15 = i14 | (composer2.n(z7) ? 4 : 2);
                            } else {
                                i15 = i14;
                            }
                            if (!composer2.HI((i15 & 19) != 18, i15 & 1)) {
                                composer2.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1853731063, i15, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:104)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierJ2 = SizeKt.J2(companion2, 0.0f, 1, null);
                            Alignment alignmentO = Alignment.INSTANCE.O();
                            long j9 = jRl;
                            PullRefreshState pullRefreshState2 = pullRefreshState;
                            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(alignmentO, false);
                            int iN2 = ComposablesKt.n(composer2, 0);
                            CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                            Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierJ2);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0 function0N2 = companion3.n();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composer2.T();
                            if (composer2.getInserting()) {
                                composer2.s7N(function0N2);
                            } else {
                                composer2.r();
                            }
                            Composer composerN2 = Updater.n(composer2);
                            Updater.O(composerN2, measurePolicyUo2, companion3.t());
                            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                            Function2 function2Rl2 = companion3.rl();
                            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                composerN2.o(Integer.valueOf(iN2));
                                composerN2.az(Integer.valueOf(iN2), function2Rl2);
                            }
                            Updater.O(composerN2, modifierO2, companion3.nr());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                            float fKN2 = Dp.KN(Dp.KN(PullRefreshIndicatorKt.f23931t + PullRefreshIndicatorKt.nr) * 2);
                            if (z7) {
                                composer2.eF(-1566007818);
                                ProgressIndicatorKt.rl(SizeKt.Z(companion2, fKN2), j9, PullRefreshIndicatorKt.nr, 0L, 0, composer2, 390, 24);
                                composer2.Xw();
                            } else {
                                composer2.eF(-1565760097);
                                PullRefreshIndicatorKt.rl(pullRefreshState2, j9, SizeKt.Z(companion2, fKN2), composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                                composer2.Xw();
                            }
                            composer2.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                            n(bool.booleanValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerKN, 54), composerKN, i13 | 24960, 10);
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                    z6 = z5;
                    j5 = j6;
                } else {
                    composerKN.wTp();
                    jRl = j4;
                    modifier3 = modifier2;
                    z6 = z5;
                    j5 = jTy;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i14) {
                            PullRefreshIndicatorKt.nr(z2, pullRefreshState, modifier3, j5, jRl, z6, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 196608;
            z5 = z3;
            if (composerKN.HI((i7 & 74899) != 74898 ? z4 : false, i7 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        z5 = z3;
        if (composerKN.HI((i7 & 74899) != 74898 ? z4 : false, i7 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final PullRefreshState pullRefreshState, final long j2, final Modifier modifier, Composer composer, final int i2) {
        int i3;
        int i5;
        Composer composerKN = composer.KN(-486016981);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(pullRefreshState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.nr(j2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.p5(modifier) ? 256 : 128;
        }
        if (composerKN.HI((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-486016981, i3, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:128)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            Object obj = objIF;
            if (objIF == companion.n()) {
                Path pathN = AndroidPath_androidKt.n();
                pathN.KN(PathFillType.INSTANCE.n());
                composerKN.o(pathN);
                obj = pathN;
            }
            final Path path = (Path) obj;
            boolean zP5 = composerKN.p5(pullRefreshState);
            Object objIF2 = composerKN.iF();
            if (zP5 || objIF2 == companion.n()) {
                objIF2 = SnapshotStateKt.O(new Function0<Float>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Float invoke() {
                        return Float.valueOf(pullRefreshState.mUb() < 1.0f ? 0.3f : 1.0f);
                    }
                });
                composerKN.o(objIF2);
            }
            boolean z2 = true;
            final State stateNr = AnimateAsStateKt.nr(t((State) objIF2), KN, 0.0f, null, null, composerKN, 48, 28);
            Modifier modifierNr = SemanticsModifierKt.nr(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$1
                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    n(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }, 1, null);
            boolean zE2 = composerKN.E2(pullRefreshState) | composerKN.p5(stateNr);
            if ((i3 & 112) != 32) {
                z2 = false;
            }
            boolean zE22 = zE2 | z2 | composerKN.E2(path);
            Object objIF3 = composerKN.iF();
            if (zE22 || objIF3 == companion.n()) {
                i5 = 0;
                Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) throws Throwable {
                        n(drawScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(DrawScope drawScope) throws Throwable {
                        DrawContext drawContext;
                        long j3;
                        ArrowValues arrowValuesN = PullRefreshIndicatorKt.n(pullRefreshState.mUb());
                        float fFloatValue = ((Number) stateNr.getValue()).floatValue();
                        float rotation = arrowValuesN.getRotation();
                        long j4 = j2;
                        Path path2 = path;
                        long jCo = drawScope.Co();
                        DrawContext drawContext2 = drawScope.getDrawContext();
                        long jT2 = drawContext2.t();
                        drawContext2.KN().O();
                        try {
                            drawContext2.getTransform().KN(rotation, jCo);
                            float fL = drawScope.l(PullRefreshIndicatorKt.f23931t) + (drawScope.l(PullRefreshIndicatorKt.nr) / 2.0f);
                            Rect rect = new Rect(Offset.az(androidx.compose.ui.geometry.SizeKt.rl(drawScope.t())) - fL, Offset.ty(androidx.compose.ui.geometry.SizeKt.rl(drawScope.t())) - fL, Offset.az(androidx.compose.ui.geometry.SizeKt.rl(drawScope.t())) + fL, Offset.ty(androidx.compose.ui.geometry.SizeKt.rl(drawScope.t())) + fL);
                            try {
                                try {
                                    DrawScope.RQ(drawScope, j4, arrowValuesN.getStartAngle(), arrowValuesN.getEndAngle() - arrowValuesN.getStartAngle(), false, rect.Z(), rect.Ik(), fFloatValue, new Stroke(drawScope.l(PullRefreshIndicatorKt.nr), 0.0f, StrokeCap.INSTANCE.t(), 0, null, 26, null), null, 0, 768, null);
                                    PullRefreshIndicatorKt.gh(drawScope, path2, rect, j4, fFloatValue, arrowValuesN);
                                    drawContext2.KN().n();
                                    drawContext2.xMQ(jT2);
                                } catch (Throwable th) {
                                    th = th;
                                    drawContext = drawContext2;
                                    j3 = jT2;
                                    drawContext.KN().n();
                                    drawContext.xMQ(j3);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j3 = jT2;
                                drawContext = drawContext2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            drawContext = drawContext2;
                            j3 = jT2;
                        }
                    }
                };
                composerKN.o(function1);
                objIF3 = function1;
            } else {
                i5 = 0;
            }
            CanvasKt.rl(modifierNr, (Function1) objIF3, composerKN, i5);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i7) {
                    PullRefreshIndicatorKt.rl(pullRefreshState, j2, modifier, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    private static final boolean O(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(DrawScope drawScope, Path path, Rect rect, long j2, float f3, ArrowValues arrowValues) {
        path.reset();
        path.Ik(0.0f, 0.0f);
        float f4 = f23929O;
        path.S(drawScope.l(f4) * arrowValues.getScale(), 0.0f);
        path.S((drawScope.l(f4) * arrowValues.getScale()) / 2, drawScope.l(J2) * arrowValues.getScale());
        path.qie(OffsetKt.n(((Math.min(rect.S(), rect.ty()) / 2.0f) + Offset.az(rect.az())) - ((drawScope.l(f4) * arrowValues.getScale()) / 2.0f), Offset.ty(rect.az()) + (drawScope.l(nr) / 2.0f)));
        path.close();
        float endAngle = arrowValues.getEndAngle();
        long jCo = drawScope.Co();
        DrawContext drawContext = drawScope.getDrawContext();
        long jT2 = drawContext.t();
        drawContext.KN().O();
        try {
            drawContext.getTransform().KN(endAngle, jCo);
            DrawScope.EWS(drawScope, path, j2, f3, null, null, 0, 56, null);
        } finally {
            drawContext.KN().n();
            drawContext.xMQ(jT2);
        }
    }

    private static final float t(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
