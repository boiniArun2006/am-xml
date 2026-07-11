package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aW\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aA\u0010\u0013\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a.\u0010\u001a\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010#\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u001a\u0010&\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0014\u0010(\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001d\"\u0014\u0010*\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001d\"\u0014\u0010+\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d\"\u0014\u0010-\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001d\"\u0014\u0010/\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001d\"\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0010008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00105\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u001d\"\u0014\u00107\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u001d\"\u0014\u00109\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?²\u0006\u000e\u0010:\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u001a\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010=\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010>\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SwitchColors;", "colors", c.f62177j, "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/Function0;", "", "thumbValue", "Landroidx/compose/foundation/interaction/InteractionSource;", "J2", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "trackColor", "trackWidth", "strokeWidth", "Ik", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "Landroidx/compose/ui/unit/Dp;", "F", "o", "()F", "TrackWidth", "rl", "r", "TrackStrokeWidth", "t", "getThumbDiameter", "ThumbDiameter", "nr", "ThumbRippleRadius", "O", "DefaultSwitchPadding", "SwitchWidth", "Uo", "SwitchHeight", "KN", "ThumbPathLength", "Landroidx/compose/animation/core/TweenSpec;", "xMQ", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "mUb", "ThumbDefaultElevation", "gh", "ThumbPressedElevation", "qie", "SwitchVelocityThreshold", "forceAnimationCheck", "currentOnCheckedChange", "currentChecked", "thumbColor", "resolvedThumbColor", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,423:1\n1247#2,6:424\n1247#2,6:432\n1247#2,6:439\n1247#2,6:445\n1247#2,6:451\n1247#2,6:494\n1247#2,6:504\n1247#2,6:510\n1247#2,6:516\n1247#2,6:525\n75#3:430\n75#3:438\n75#3:457\n75#3:522\n75#3:523\n1#4:431\n71#5:458\n68#5,6:459\n74#5:493\n78#5:503\n79#6,6:465\n86#6,4:480\n90#6,2:490\n94#6:502\n368#7,9:471\n377#7:492\n378#7,2:500\n4034#8,6:484\n51#9:524\n57#9:544\n85#10:531\n113#10,2:532\n85#10:534\n85#10:535\n85#10:536\n85#10:537\n85#10:538\n149#11:539\n149#11:540\n149#11:541\n149#11:542\n149#11:543\n149#11:545\n149#11:546\n149#11:547\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n*L\n103#1:424,6\n110#1:432,6\n113#1:439,6\n128#1:445,6\n137#1:451,6\n183#1:494,6\n222#1:504,6\n224#1:510,6\n245#1:516,6\n261#1:525,6\n105#1:430\n111#1:438\n142#1:457\n249#1:522\n250#1:523\n157#1:458\n157#1:459,6\n157#1:493\n157#1:503\n157#1:465,6\n157#1:480,4\n157#1:490,2\n157#1:502\n157#1:471,9\n157#1:492\n157#1:500,2\n157#1:484,6\n250#1:524\n292#1:544\n110#1:531\n110#1:532,2\n126#1:534\n127#1:535\n244#1:536\n248#1:537\n252#1:538\n283#1:539\n284#1:540\n285#1:541\n287#1:542\n289#1:543\n296#1:545\n297#1:546\n422#1:547\n*E\n"})
public final class SwitchKt {
    private static final float J2;
    private static final float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f23297O;
    private static final float Uo;
    private static final float gh;
    private static final float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f23298n;
    private static final float nr;
    private static final float qie;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f23299t;
    private static final TweenSpec xMQ;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ik(DrawScope drawScope, long j2, float f3, float f4) {
        float f5 = f4 / 2;
        DrawScope.mI(drawScope, j2, OffsetKt.n(f5, Offset.ty(drawScope.Co())), OffsetKt.n(f3 - f5, Offset.ty(drawScope.Co())), f4, StrokeCap.INSTANCE.rl(), null, 0.0f, null, 0, 480, null);
    }

    static {
        float fKN = Dp.KN(34);
        f23298n = fKN;
        rl = Dp.KN(14);
        float fKN2 = Dp.KN(20);
        f23299t = fKN2;
        nr = Dp.KN(24);
        f23297O = Dp.KN(2);
        J2 = fKN;
        Uo = fKN2;
        KN = Dp.KN(fKN - fKN2);
        xMQ = new TweenSpec(100, 0, null, 6, null);
        mUb = Dp.KN(1);
        gh = Dp.KN(6);
        qie = Dp.KN(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(final BoxScope boxScope, final boolean z2, final boolean z3, final SwitchColors switchColors, final Function0 function0, final InteractionSource interactionSource, Composer composer, final int i2) {
        int i3;
        Modifier.Companion companion;
        int i5;
        int i7;
        long jKN;
        Composer composerKN = composer.KN(70908914);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(boxScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(switchColors) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.p5(interactionSource) ? 131072 : 65536;
        }
        int i8 = i3;
        if (composerKN.HI((74899 & i8) != 74898, i8 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(70908914, i8, -1, "androidx.compose.material.SwitchImpl (Switch.kt:220)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objIF == companion2.n()) {
                objIF = SnapshotStateKt.J2();
                composerKN.o(objIF);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objIF;
            boolean z4 = (458752 & i8) == 131072;
            Object objIF2 = composerKN.iF();
            if (z4 || objIF2 == companion2.n()) {
                objIF2 = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                composerKN.o(objIF2);
            }
            EffectsKt.O(interactionSource, (Function2) objIF2, composerKN, (i8 >> 15) & 14);
            float f3 = !snapshotStateList.isEmpty() ? gh : mUb;
            int i9 = ((i8 >> 6) & 14) | (i8 & 112) | ((i8 >> 3) & 896);
            final State stateN = switchColors.n(z3, z2, composerKN, i9);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(boxScope.n(companion3, companion4.O()), 0.0f, 1, null);
            boolean zP5 = composerKN.p5(stateN);
            Object objIF3 = composerKN.iF();
            if (zP5 || objIF3 == companion2.n()) {
                objIF3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$2$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        n(drawScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(DrawScope drawScope) {
                        SwitchKt.Ik(drawScope, SwitchKt.Uo(stateN), drawScope.l(SwitchKt.o()), drawScope.l(SwitchKt.r()));
                    }
                };
                composerKN.o(objIF3);
            }
            CanvasKt.rl(modifierJ2, (Function1) objIF3, composerKN, 0);
            State stateRl = switchColors.rl(z3, z2, composerKN, i9);
            ElevationOverlay elevationOverlay = (ElevationOverlay) composerKN.ty(ElevationOverlayKt.nr());
            float fKN = Dp.KN(((Dp) composerKN.ty(ElevationOverlayKt.t())).getValue() + f3);
            if (!Color.HI(KN(stateRl), MaterialTheme.f22169n.n(composerKN, 6).ty()) || elevationOverlay == null) {
                companion = companion3;
                i5 = 0;
                i7 = 1;
                composerKN.eF(1478584670);
                composerKN.Xw();
                jKN = KN(stateRl);
            } else {
                composerKN.eF(1478495731);
                long jKN2 = KN(stateRl);
                companion = companion3;
                i5 = 0;
                i7 = 1;
                jKN = elevationOverlay.n(jKN2, fKN, composerKN, 0);
                composerKN.Xw();
            }
            State stateN2 = SingleValueAnimationKt.n(jKN, null, null, null, composerKN, 0, 14);
            composerKN = composerKN;
            Modifier modifierN = boxScope.n(companion, companion4.KN());
            int i10 = (i8 & 57344) == 16384 ? i7 : i5;
            Object objIF4 = composerKN.iF();
            if (i10 != 0 || objIF4 == companion2.n()) {
                objIF4 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$3$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                        return IntOffset.t(n(density));
                    }

                    public final long n(Density density) {
                        return IntOffsetKt.n(MathKt.roundToInt(((Number) function0.invoke()).floatValue()), 0);
                    }
                };
                composerKN.o(objIF4);
            }
            SpacerKt.n(BackgroundKt.t(ShadowKt.rl(SizeKt.HI(IndicationKt.rl(androidx.compose.foundation.layout.OffsetKt.n(modifierN, (Function1) objIF4), interactionSource, RippleKt.J2(false, nr, 0L, 4, null)), f23299t), f3, RoundedCornerShapeKt.J2(), false, 0L, 0L, 24, null), xMQ(stateN2), RoundedCornerShapeKt.J2()), composerKN, i5);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$4
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
                    SwitchKt.J2(boxScope, z2, z3, switchColors, function0, interactionSource, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014e  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final boolean z2, final Function1 function1, Modifier modifier, boolean z3, MutableInteractionSource mutableInteractionSource, SwitchColors switchColors, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        SwitchColors switchColors2;
        int i9;
        Composer composer2;
        final Modifier modifier3;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource3;
        final SwitchColors switchColors3;
        ScopeUpdateScope scopeUpdateScopeGh;
        MutableInteractionSource mutableInteractionSource4;
        SnapshotMutationPolicy snapshotMutationPolicy;
        SwitchColors switchColors4;
        int i10;
        MutableInteractionSource mutableInteractionSource5;
        final float fL;
        Object objIF;
        Composer.Companion companion;
        MutableState mutableState;
        final float fL2;
        boolean zRl;
        Object objIF2;
        AnchoredDraggableState anchoredDraggableState;
        State stateCk;
        State stateCk2;
        boolean zP5;
        Object objIF3;
        AnchoredDraggableState anchoredDraggableState2;
        boolean zP52;
        Object objIF4;
        Object obj;
        AnchoredDraggableState anchoredDraggableState3;
        MutableInteractionSource mutableInteractionSource6;
        Object obj2;
        ?? r10;
        int i11;
        int i12;
        Modifier modifierN;
        final AnchoredDraggableState anchoredDraggableState4;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        boolean zP53;
        Object objIF5;
        Composer composerKN = composer.KN(25866825);
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
        int i13 = i3 & 4;
        if (i13 != 0) {
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
                            switchColors2 = switchColors;
                            int i14 = composerKN.p5(switchColors2) ? 131072 : 65536;
                            i5 |= i14;
                        } else {
                            switchColors2 = switchColors;
                        }
                        i5 |= i14;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i9 = i5;
                    if (composerKN.HI((74899 & i5) == 74898, i9 & 1)) {
                        composer2 = composerKN;
                        composer2.wTp();
                        modifier3 = modifier2;
                        z5 = z4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        switchColors3 = switchColors2;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) == 0 || composerKN.rV9()) {
                            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i7 != 0 ? true : z4;
                            mutableInteractionSource4 = i8 != 0 ? null : mutableInteractionSource2;
                            if ((i3 & 32) != 0) {
                                snapshotMutationPolicy = null;
                                SwitchColors switchColorsN = SwitchDefaults.f23296n.n(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerKN, 0, 6, 1023);
                                composerKN = composerKN;
                                i10 = i9 & (-458753);
                                z4 = z6;
                                switchColors4 = switchColorsN;
                                modifier2 = modifier4;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(25866825, i10, -1, "androidx.compose.material.Switch (Switch.kt:100)");
                                }
                                if (mutableInteractionSource4 != null) {
                                    composerKN.eF(-1604939679);
                                    Object objIF6 = composerKN.iF();
                                    if (objIF6 == Composer.INSTANCE.n()) {
                                        objIF6 = InteractionSourceKt.n();
                                        composerKN.o(objIF6);
                                    }
                                    composerKN.Xw();
                                    mutableInteractionSource5 = (MutableInteractionSource) objIF6;
                                } else {
                                    composerKN.eF(779511094);
                                    composerKN.Xw();
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                }
                                fL = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(KN);
                                objIF = composerKN.iF();
                                companion = Composer.INSTANCE;
                                if (objIF == companion.n()) {
                                    objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                                    composerKN.o(objIF);
                                }
                                mutableState = (MutableState) objIF;
                                fL2 = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(qie);
                                zRl = composerKN.rl(fL) | composerKN.rl(fL2);
                                objIF2 = composerKN.iF();
                                if (!zRl || objIF2 == companion.n()) {
                                    final float f3 = 0.0f;
                                    objIF2 = new AnchoredDraggableState(Boolean.valueOf(z2), AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<Boolean>, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<Boolean> draggableAnchorsConfig) {
                                            n(draggableAnchorsConfig);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                            draggableAnchorsConfig.n(Boolean.FALSE, f3);
                                            draggableAnchorsConfig.n(Boolean.TRUE, fL);
                                        }
                                    }), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                                            return n(f4.floatValue());
                                        }

                                        public final Float n(float f4) {
                                            return Float.valueOf(f4 * 0.7f);
                                        }
                                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final Float invoke() {
                                            return Float.valueOf(fL2);
                                        }
                                    }, xMQ, null, 32, null);
                                    composerKN.o(objIF2);
                                }
                                anchoredDraggableState = (AnchoredDraggableState) objIF2;
                                int i15 = i10 >> 3;
                                stateCk = SnapshotStateKt.ck(function1, composerKN, i15 & 14);
                                int i16 = i10 & 14;
                                stateCk2 = SnapshotStateKt.ck(Boolean.valueOf(z2), composerKN, i16);
                                zP5 = composerKN.p5(anchoredDraggableState) | composerKN.p5(stateCk2) | composerKN.p5(stateCk);
                                objIF3 = composerKN.iF();
                                if (!zP5 || objIF3 == companion.n()) {
                                    SwitchKt$Switch$1$1 switchKt$Switch$1$1 = new SwitchKt$Switch$1$1(anchoredDraggableState, stateCk2, stateCk, mutableState, null);
                                    anchoredDraggableState2 = anchoredDraggableState;
                                    composerKN.o(switchKt$Switch$1$1);
                                    objIF3 = switchKt$Switch$1$1;
                                } else {
                                    anchoredDraggableState2 = anchoredDraggableState;
                                }
                                EffectsKt.O(anchoredDraggableState2, (Function2) objIF3, composerKN, 0);
                                Boolean boolValueOf = Boolean.valueOf(z2);
                                Boolean boolValueOf2 = Boolean.valueOf(rl(mutableState));
                                zP52 = (i16 != 4) | composerKN.p5(anchoredDraggableState2);
                                objIF4 = composerKN.iF();
                                if (!zP52 || objIF4 == companion.n()) {
                                    obj = null;
                                    objIF4 = new SwitchKt$Switch$2$1(z2, anchoredDraggableState2, null);
                                    composerKN.o(objIF4);
                                } else {
                                    obj = null;
                                }
                                EffectsKt.nr(boolValueOf, boolValueOf2, (Function2) objIF4, composerKN, i16);
                                boolean z7 = composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t;
                                if (function1 == null) {
                                    anchoredDraggableState3 = anchoredDraggableState2;
                                    z5 = z4;
                                    mutableInteractionSource6 = mutableInteractionSource5;
                                    obj2 = obj;
                                    r10 = 0;
                                    i11 = 2;
                                    i12 = i15;
                                    modifierN = ToggleableKt.n(Modifier.INSTANCE, z2, mutableInteractionSource6, null, z5, Role.mUb(Role.INSTANCE.Uo()), function1);
                                } else {
                                    anchoredDraggableState3 = anchoredDraggableState2;
                                    z5 = z4;
                                    mutableInteractionSource6 = mutableInteractionSource5;
                                    obj2 = obj;
                                    r10 = 0;
                                    i11 = 2;
                                    i12 = i15;
                                    modifierN = Modifier.INSTANCE;
                                }
                                int i17 = i12;
                                Modifier modifierNr = AnchoredDraggableKt.nr(modifier2.Zmq(function1 == null ? InteractiveComponentSizeKt.t(Modifier.INSTANCE) : Modifier.INSTANCE).Zmq(modifierN), anchoredDraggableState3, Orientation.f16970t, (z5 || function1 == null) ? r10 : 1, z7, mutableInteractionSource6, false);
                                anchoredDraggableState4 = anchoredDraggableState3;
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Modifier modifierCk = SizeKt.ck(PaddingKt.xMQ(SizeKt.E2(modifierNr, companion2.O(), r10, i11, obj2), f23297O), J2, Uo);
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), r10);
                                iN = ComposablesKt.n(composerKN, r10);
                                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierCk);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion3.n();
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
                                MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                Updater.O(composerN, measurePolicyUo, companion3.t());
                                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                function2Rl = companion3.rl();
                                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion3.nr());
                                Modifier modifier5 = modifier2;
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                boolean zBooleanValue = ((Boolean) anchoredDraggableState4.aYN()).booleanValue();
                                zP53 = composerKN.p5(anchoredDraggableState4);
                                objIF5 = composerKN.iF();
                                if (!zP53 || objIF5 == companion.n()) {
                                    objIF5 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final Float invoke() {
                                            return Float.valueOf(anchoredDraggableState4.g());
                                        }
                                    };
                                    composerKN.o(objIF5);
                                }
                                J2(boxScopeInstance, zBooleanValue, z5, switchColors4, (Function0) objIF5, mutableInteractionSource7, composerKN, (i17 & 896) | 6 | ((i10 >> 6) & 7168));
                                composer2 = composerKN;
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier3 = modifier5;
                                switchColors3 = switchColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            } else {
                                snapshotMutationPolicy = null;
                                modifier2 = modifier4;
                                z4 = z6;
                                switchColors4 = switchColors2;
                                i10 = i9;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                if (mutableInteractionSource4 != null) {
                                }
                                fL = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(KN);
                                objIF = composerKN.iF();
                                companion = Composer.INSTANCE;
                                if (objIF == companion.n()) {
                                }
                                mutableState = (MutableState) objIF;
                                fL2 = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(qie);
                                zRl = composerKN.rl(fL) | composerKN.rl(fL2);
                                objIF2 = composerKN.iF();
                                if (!zRl) {
                                    final float f32 = 0.0f;
                                    objIF2 = new AnchoredDraggableState(Boolean.valueOf(z2), AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<Boolean>, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<Boolean> draggableAnchorsConfig) {
                                            n(draggableAnchorsConfig);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                            draggableAnchorsConfig.n(Boolean.FALSE, f32);
                                            draggableAnchorsConfig.n(Boolean.TRUE, fL);
                                        }
                                    }), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                                            return n(f4.floatValue());
                                        }

                                        public final Float n(float f4) {
                                            return Float.valueOf(f4 * 0.7f);
                                        }
                                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final Float invoke() {
                                            return Float.valueOf(fL2);
                                        }
                                    }, xMQ, null, 32, null);
                                    composerKN.o(objIF2);
                                    anchoredDraggableState = (AnchoredDraggableState) objIF2;
                                    int i152 = i10 >> 3;
                                    stateCk = SnapshotStateKt.ck(function1, composerKN, i152 & 14);
                                    int i162 = i10 & 14;
                                    stateCk2 = SnapshotStateKt.ck(Boolean.valueOf(z2), composerKN, i162);
                                    zP5 = composerKN.p5(anchoredDraggableState) | composerKN.p5(stateCk2) | composerKN.p5(stateCk);
                                    objIF3 = composerKN.iF();
                                    if (zP5) {
                                        SwitchKt$Switch$1$1 switchKt$Switch$1$12 = new SwitchKt$Switch$1$1(anchoredDraggableState, stateCk2, stateCk, mutableState, null);
                                        anchoredDraggableState2 = anchoredDraggableState;
                                        composerKN.o(switchKt$Switch$1$12);
                                        objIF3 = switchKt$Switch$1$12;
                                        EffectsKt.O(anchoredDraggableState2, (Function2) objIF3, composerKN, 0);
                                        Boolean boolValueOf3 = Boolean.valueOf(z2);
                                        Boolean boolValueOf22 = Boolean.valueOf(rl(mutableState));
                                        zP52 = (i162 != 4) | composerKN.p5(anchoredDraggableState2);
                                        objIF4 = composerKN.iF();
                                        if (zP52) {
                                            obj = null;
                                            objIF4 = new SwitchKt$Switch$2$1(z2, anchoredDraggableState2, null);
                                            composerKN.o(objIF4);
                                            EffectsKt.nr(boolValueOf3, boolValueOf22, (Function2) objIF4, composerKN, i162);
                                            if (composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t) {
                                            }
                                            if (function1 == null) {
                                            }
                                            if (z5) {
                                                int i172 = i12;
                                                Modifier modifierNr2 = AnchoredDraggableKt.nr(modifier2.Zmq(function1 == null ? InteractiveComponentSizeKt.t(Modifier.INSTANCE) : Modifier.INSTANCE).Zmq(modifierN), anchoredDraggableState3, Orientation.f16970t, (z5 || function1 == null) ? r10 : 1, z7, mutableInteractionSource6, false);
                                                anchoredDraggableState4 = anchoredDraggableState3;
                                                Alignment.Companion companion22 = Alignment.INSTANCE;
                                                Modifier modifierCk2 = SizeKt.ck(PaddingKt.xMQ(SizeKt.E2(modifierNr2, companion22.O(), r10, i11, obj2), f23297O), J2, Uo);
                                                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion22.HI(), r10);
                                                iN = ComposablesKt.n(composerKN, r10);
                                                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                                                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierCk2);
                                                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                                Function0 function0N2 = companion32.n();
                                                if (composerKN.getApplier() == null) {
                                                }
                                                composerKN.T();
                                                if (composerKN.getInserting()) {
                                                }
                                                composerN = Updater.n(composerKN);
                                                MutableInteractionSource mutableInteractionSource72 = mutableInteractionSource6;
                                                Updater.O(composerN, measurePolicyUo2, companion32.t());
                                                Updater.O(composerN, compositionLocalMapIk2, companion32.O());
                                                function2Rl = companion32.rl();
                                                if (!composerN.getInserting()) {
                                                    composerN.o(Integer.valueOf(iN));
                                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                                    Updater.O(composerN, modifierO2, companion32.nr());
                                                    Modifier modifier52 = modifier2;
                                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                                                    boolean zBooleanValue2 = ((Boolean) anchoredDraggableState4.aYN()).booleanValue();
                                                    zP53 = composerKN.p5(anchoredDraggableState4);
                                                    objIF5 = composerKN.iF();
                                                    if (!zP53) {
                                                        objIF5 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function0
                                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                            public final Float invoke() {
                                                                return Float.valueOf(anchoredDraggableState4.g());
                                                            }
                                                        };
                                                        composerKN.o(objIF5);
                                                        J2(boxScopeInstance2, zBooleanValue2, z5, switchColors4, (Function0) objIF5, mutableInteractionSource72, composerKN, (i172 & 896) | 6 | ((i10 >> 6) & 7168));
                                                        composer2 = composerKN;
                                                        composer2.XQ();
                                                        if (ComposerKt.v()) {
                                                        }
                                                        modifier3 = modifier52;
                                                        switchColors3 = switchColors4;
                                                        mutableInteractionSource3 = mutableInteractionSource4;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 32) != 0) {
                                i10 = i9 & (-458753);
                                mutableInteractionSource4 = mutableInteractionSource2;
                                switchColors4 = switchColors2;
                                snapshotMutationPolicy = null;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                if (mutableInteractionSource4 != null) {
                                }
                                fL = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(KN);
                                objIF = composerKN.iF();
                                companion = Composer.INSTANCE;
                                if (objIF == companion.n()) {
                                }
                                mutableState = (MutableState) objIF;
                                fL2 = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(qie);
                                zRl = composerKN.rl(fL) | composerKN.rl(fL2);
                                objIF2 = composerKN.iF();
                                if (!zRl) {
                                }
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource2;
                                switchColors4 = switchColors2;
                                snapshotMutationPolicy = null;
                                i10 = i9;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                if (mutableInteractionSource4 != null) {
                                }
                                fL = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(KN);
                                objIF = composerKN.iF();
                                companion = Composer.INSTANCE;
                                if (objIF == companion.n()) {
                                }
                                mutableState = (MutableState) objIF;
                                fL2 = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(qie);
                                zRl = composerKN.rl(fL) | composerKN.rl(fL2);
                                objIF2 = composerKN.iF();
                                if (!zRl) {
                                }
                            }
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i18) {
                                SwitchKt.n(z2, function1, modifier3, z5, mutableInteractionSource3, switchColors3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
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
                i9 = i5;
                if (composerKN.HI((74899 & i5) == 74898, i9 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
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
            i9 = i5;
            if (composerKN.HI((74899 & i5) == 74898, i9 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
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
        i9 = i5;
        if (composerKN.HI((74899 & i5) == 74898, i9 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final float o() {
        return f23298n;
    }

    public static final float r() {
        return rl;
    }

    private static final long KN(State state) {
        return ((Color) state.getValue()).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Uo(State state) {
        return ((Color) state.getValue()).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 nr(State state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rl(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    private static final long xMQ(State state) {
        return ((Color) state.getValue()).getValue();
    }
}
