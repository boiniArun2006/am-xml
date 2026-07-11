package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.BasicTooltip_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0003\u001an\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0015\u001a\u00020\n*\u00020\n2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0019\u001a\u00020\n*\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u001a\u0010!\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b \u0010\u001e\"\u001a\u0010$\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u001a\u0010'\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001e\"\u0014\u0010)\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001c\"\u0014\u0010+\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001c\"\u001a\u0010/\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\b*\u0010.\"\u001a\u00102\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010\u001e\"\u001a\u00103\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b0\u0010\u001e\"\u001a\u00104\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0014\u00105\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001c\"\u0014\u00106\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001c\"\u001a\u00107\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u001a\u00109\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010\u001c\u001a\u0004\b\"\u0010\u001e¨\u0006=²\u0006\f\u0010;\u001a\u00020:8\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020:8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Lkotlin/Function1;", "Landroidx/compose/material3/TooltipScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "tooltip", "Landroidx/compose/material3/TooltipState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "focusable", "enableUserInput", "Lkotlin/Function0;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function3;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "subheadExists", "actionExists", "az", "(Landroidx/compose/ui/Modifier;ZZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/Transition;", "transition", "rl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/Transition;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "F", "mUb", "()F", "SpacingBetweenTooltipAndAnchor", "gh", "TooltipMinHeight", "t", "qie", "TooltipMinWidth", "nr", "Uo", "PlainTooltipMaxWidth", "O", "PlainTooltipVerticalPadding", "J2", "PlainTooltipHorizontalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "()Landroidx/compose/foundation/layout/PaddingValues;", "PlainTooltipContentPadding", "KN", "xMQ", "RichTooltipMaxWidth", "RichTooltipHorizontalPadding", "HeightToSubheadFirstLine", "HeightFromSubheadToTextFirstLine", "TextBottomPadding", "ActionLabelMinHeight", "ty", "ActionLabelBottomPadding", "", "scale", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n1223#2,6:646\n1223#2,6:652\n1223#2,6:658\n135#3:664\n148#4:665\n148#4:666\n148#4:667\n148#4:668\n148#4:669\n148#4:670\n148#4:671\n148#4:672\n148#4:673\n148#4:674\n148#4:675\n148#4:676\n148#4:677\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n*L\n135#1:646,6\n136#1:652,6\n437#1:658,6\n580#1:664\n626#1:665\n627#1:666\n628#1:667\n629#1:668\n630#1:669\n631#1:670\n634#1:671\n635#1:672\n636#1:673\n637#1:674\n638#1:675\n639#1:676\n640#1:677\n*E\n"})
public final class TooltipKt {
    private static final float J2;
    private static final float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f28773O;
    private static final PaddingValues Uo;
    private static final float az;
    private static final float gh;
    private static final float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f28774n;
    private static final float qie;
    private static final float rl;
    private static final float ty;
    private static final float xMQ;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f28775t = Dp.KN(40);
    private static final float nr = Dp.KN(200);

    static {
        float f3 = 4;
        f28774n = Dp.KN(f3);
        float f4 = 24;
        rl = Dp.KN(f4);
        float fKN = Dp.KN(f3);
        f28773O = fKN;
        float f5 = 8;
        float fKN2 = Dp.KN(f5);
        J2 = fKN2;
        Uo = PaddingKt.rl(fKN2, fKN);
        KN = Dp.KN(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
        float f6 = 16;
        xMQ = Dp.KN(f6);
        mUb = Dp.KN(28);
        gh = Dp.KN(f4);
        qie = Dp.KN(f6);
        az = Dp.KN(36);
        ty = Dp.KN(f5);
    }

    public static final Modifier az(Modifier modifier, boolean z2, boolean z3) {
        return (z2 || z3) ? PaddingKt.az(AlignmentLineKt.KN(modifier, gh, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, qie, 7, null) : PaddingKt.gh(modifier, 0.0f, f28773O, 1, null);
    }

    public static final PaddingValues J2() {
        return Uo;
    }

    public static final float KN() {
        return xMQ;
    }

    public static final float O() {
        return mUb;
    }

    public static final float Uo() {
        return nr;
    }

    public static final float gh() {
        return rl;
    }

    public static final float mUb() {
        return f28774n;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final PopupPositionProvider popupPositionProvider, final Function3 function3, final TooltipState tooltipState, Modifier modifier, boolean z2, boolean z3, final Function2 function2, Composer composer, final int i2, final int i3) {
        PopupPositionProvider popupPositionProvider2;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        Object objIF;
        Composer.Companion companion;
        Object objIF2;
        final Modifier modifier3;
        final boolean z6;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1836749106);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            popupPositionProvider2 = popupPositionProvider;
        } else if ((i2 & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i5 = (composerKN.p5(popupPositionProvider2) ? 4 : 2) | i2;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function3) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= (i2 & 512) == 0 ? composerKN.p5(tooltipState) : composerKN.E2(tooltipState) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    z4 = z2;
                    i5 |= composerKN.n(z4) ? 16384 : 8192;
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                    if ((196608 & i2) == 0) {
                        z5 = z3;
                        i5 |= composerKN.n(z5) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.E2(function2) ? 1048576 : 524288;
                    }
                    if ((599187 & i5) == 599186 || !composerKN.xMQ()) {
                        Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1836749106, i5, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:131)");
                        }
                        final Transition transitionXMQ = TransitionKt.xMQ(tooltipState.getTransition(), "tooltip transition", composerKN, MutableTransitionState.nr | 48, 0);
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                            objIF = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                            composerKN.o(objIF);
                        }
                        final MutableState mutableState = (MutableState) objIF;
                        objIF2 = composerKN.iF();
                        if (objIF2 == companion.n()) {
                            objIF2 = new TooltipScopeImpl(new Function0<LayoutCoordinates>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final LayoutCoordinates invoke() {
                                    return (LayoutCoordinates) mutableState.getValue();
                                }
                            });
                            composerKN.o(objIF2);
                        }
                        final TooltipScopeImpl tooltipScopeImpl = (TooltipScopeImpl) objIF2;
                        int i10 = (i5 & 14) | 1572912 | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752);
                        boolean z9 = z4;
                        boolean z10 = z5;
                        BasicTooltip_androidKt.n(popupPositionProvider2, ComposableLambdaKt.nr(-149611544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$1
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
                                if ((i11 & 3) == 2 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-149611544, i11, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:143)");
                                }
                                Modifier modifierRl = TooltipKt.rl(Modifier.INSTANCE, transitionXMQ);
                                Function3 function32 = function3;
                                TooltipScopeImpl tooltipScopeImpl2 = tooltipScopeImpl;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN = ComposablesKt.n(composer2, 0);
                                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer2, modifierRl);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion2.n();
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer2.T();
                                if (composer2.getInserting()) {
                                    composer2.s7N(function0N);
                                } else {
                                    composer2.r();
                                }
                                Composer composerN = Updater.n(composer2);
                                Updater.O(composerN, measurePolicyUo, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                Function2 function2Rl = companion2.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function32.invoke(tooltipScopeImpl2, composer2, 6);
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), tooltipState, modifier4, z9, z10, ComposableLambdaKt.nr(-1130808188, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$wrappedContent$1
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
                                if ((i11 & 3) == 2 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1130808188, i11, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:138)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                final MutableState mutableState2 = mutableState;
                                Object objIF3 = composer2.iF();
                                if (objIF3 == Composer.INSTANCE.n()) {
                                    objIF3 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$wrappedContent$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                            n(layoutCoordinates);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(LayoutCoordinates layoutCoordinates) {
                                            mutableState2.setValue(layoutCoordinates);
                                        }
                                    };
                                    composer2.o(objIF3);
                                }
                                Modifier modifierN = OnGloballyPositionedModifierKt.n(companion2, (Function1) objIF3);
                                Function2 function22 = function2;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN = ComposablesKt.n(composer2, 0);
                                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer2, modifierN);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion3.n();
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer2.T();
                                if (composer2.getInserting()) {
                                    composer2.s7N(function0N);
                                } else {
                                    composer2.r();
                                }
                                Composer composerN = Updater.n(composer2);
                                Updater.O(composerN, measurePolicyUo, companion3.t());
                                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                Function2 function2Rl = companion3.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion3.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function22.invoke(composer2, 0);
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, i10, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier4;
                        z6 = z9;
                        z7 = z10;
                    } else {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        z6 = z4;
                        z7 = z5;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$2
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
                                TooltipKt.n(popupPositionProvider, function3, tooltipState, modifier3, z6, z7, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                z5 = z3;
                if ((i3 & 64) == 0) {
                }
                if ((599187 & i5) == 599186) {
                    if (i9 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    final Transition transitionXMQ2 = TransitionKt.xMQ(tooltipState.getTransition(), "tooltip transition", composerKN, MutableTransitionState.nr | 48, 0);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                    }
                    final MutableState mutableState2 = (MutableState) objIF;
                    objIF2 = composerKN.iF();
                    if (objIF2 == companion.n()) {
                    }
                    final TooltipScopeImpl tooltipScopeImpl2 = (TooltipScopeImpl) objIF2;
                    int i102 = (i5 & 14) | 1572912 | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752);
                    boolean z92 = z4;
                    boolean z102 = z5;
                    BasicTooltip_androidKt.n(popupPositionProvider2, ComposableLambdaKt.nr(-149611544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$1
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
                            if ((i11 & 3) == 2 && composer2.xMQ()) {
                                composer2.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-149611544, i11, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:143)");
                            }
                            Modifier modifierRl = TooltipKt.rl(Modifier.INSTANCE, transitionXMQ2);
                            Function3 function32 = function3;
                            TooltipScopeImpl tooltipScopeImpl22 = tooltipScopeImpl2;
                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                            int iN = ComposablesKt.n(composer2, 0);
                            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composer2, modifierRl);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0 function0N = companion2.n();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composer2.T();
                            if (composer2.getInserting()) {
                                composer2.s7N(function0N);
                            } else {
                                composer2.r();
                            }
                            Composer composerN = Updater.n(composer2);
                            Updater.O(composerN, measurePolicyUo, companion2.t());
                            Updater.O(composerN, compositionLocalMapIk, companion2.O());
                            Function2 function2Rl = companion2.rl();
                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO, companion2.nr());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                            function32.invoke(tooltipScopeImpl22, composer2, 6);
                            composer2.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), tooltipState, modifier4, z92, z102, ComposableLambdaKt.nr(-1130808188, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$wrappedContent$1
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
                            if ((i11 & 3) == 2 && composer2.xMQ()) {
                                composer2.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1130808188, i11, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:138)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            final MutableState mutableState22 = mutableState2;
                            Object objIF3 = composer2.iF();
                            if (objIF3 == Composer.INSTANCE.n()) {
                                objIF3 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$wrappedContent$1$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                        n(layoutCoordinates);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(LayoutCoordinates layoutCoordinates) {
                                        mutableState22.setValue(layoutCoordinates);
                                    }
                                };
                                composer2.o(objIF3);
                            }
                            Modifier modifierN = OnGloballyPositionedModifierKt.n(companion2, (Function1) objIF3);
                            Function2 function22 = function2;
                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                            int iN = ComposablesKt.n(composer2, 0);
                            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composer2, modifierN);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0 function0N = companion3.n();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composer2.T();
                            if (composer2.getInserting()) {
                                composer2.s7N(function0N);
                            } else {
                                composer2.r();
                            }
                            Composer composerN = Updater.n(composer2);
                            Updater.O(composerN, measurePolicyUo, companion3.t());
                            Updater.O(composerN, compositionLocalMapIk, companion3.O());
                            Function2 function2Rl = companion3.rl();
                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO, companion3.nr());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                            function22.invoke(composer2, 0);
                            composer2.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composerKN, i102, 0);
                    if (ComposerKt.v()) {
                    }
                    modifier3 = modifier4;
                    z6 = z92;
                    z7 = z102;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z2;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            z5 = z3;
            if ((i3 & 64) == 0) {
            }
            if ((599187 & i5) == 599186) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        z4 = z2;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        z5 = z3;
        if ((i3 & 64) == 0) {
        }
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final float nr() {
        return az;
    }

    public static final float qie() {
        return f28775t;
    }

    public static final float t() {
        return ty;
    }

    public static final float xMQ() {
        return KN;
    }

    public static final Modifier rl(Modifier modifier, final Transition transition) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("animateTooltip");
                    inspectorInfo.getProperties().n("transition", transition);
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(-1498516085);
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1498516085, i2, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:584)");
                }
                Transition transition2 = transition;
                TooltipKt$animateTooltip$2$scale$2 tooltipKt$animateTooltip$2$scale$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$2$scale$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                        return n(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i3) {
                        TweenSpec tweenSpecTy;
                        composer2.eF(386845748);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(386845748, i3, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:587)");
                        }
                        if (segment.t(Boolean.FALSE, Boolean.TRUE)) {
                            tweenSpecTy = AnimationSpecKt.ty(150, 0, EasingKt.J2(), 2, null);
                        } else {
                            tweenSpecTy = AnimationSpecKt.ty(75, 0, EasingKt.J2(), 2, null);
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer2.Xw();
                        return tweenSpecTy;
                    }
                };
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                TwoWayConverter twoWayConverterXMQ = VectorConvertersKt.xMQ(floatCompanionObject);
                boolean zBooleanValue = ((Boolean) transition2.xMQ()).booleanValue();
                composer.eF(-1553362193);
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:603)");
                }
                float f3 = zBooleanValue ? 1.0f : 0.8f;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                Float fValueOf = Float.valueOf(f3);
                boolean zBooleanValue2 = ((Boolean) transition2.Ik()).booleanValue();
                composer.eF(-1553362193);
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:603)");
                }
                float f4 = zBooleanValue2 ? 1.0f : 0.8f;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                State stateJ2 = TransitionKt.J2(transition2, fValueOf, Float.valueOf(f4), tooltipKt$animateTooltip$2$scale$2.invoke(transition2.HI(), composer, 0), twoWayConverterXMQ, "tooltip transition: scaling", composer, 196608);
                Transition transition3 = transition;
                TooltipKt$animateTooltip$2$alpha$2 tooltipKt$animateTooltip$2$alpha$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$2$alpha$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                        return n(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i3) {
                        TweenSpec tweenSpecTy;
                        composer2.eF(-281714272);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-281714272, i3, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:609)");
                        }
                        if (segment.t(Boolean.FALSE, Boolean.TRUE)) {
                            tweenSpecTy = AnimationSpecKt.ty(150, 0, EasingKt.O(), 2, null);
                        } else {
                            tweenSpecTy = AnimationSpecKt.ty(75, 0, EasingKt.O(), 2, null);
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer2.Xw();
                        return tweenSpecTy;
                    }
                };
                TwoWayConverter twoWayConverterXMQ2 = VectorConvertersKt.xMQ(floatCompanionObject);
                boolean zBooleanValue3 = ((Boolean) transition3.xMQ()).booleanValue();
                composer.eF(2073045083);
                if (ComposerKt.v()) {
                    ComposerKt.p5(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:619)");
                }
                float f5 = zBooleanValue3 ? 1.0f : 0.0f;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                Float fValueOf2 = Float.valueOf(f5);
                boolean zBooleanValue4 = ((Boolean) transition3.Ik()).booleanValue();
                composer.eF(2073045083);
                if (ComposerKt.v()) {
                    ComposerKt.p5(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:619)");
                }
                float f6 = zBooleanValue4 ? 1.0f : 0.0f;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                Modifier modifierT = GraphicsLayerModifierKt.t(modifier2, rl(stateJ2), rl(stateJ2), t(TransitionKt.J2(transition3, fValueOf2, Float.valueOf(f6), tooltipKt$animateTooltip$2$alpha$2.invoke(transition3.HI(), composer, 0), twoWayConverterXMQ2, "tooltip transition: alpha", composer, 196608)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierT;
            }

            private static final float rl(State state) {
                return ((Number) state.getValue()).floatValue();
            }

            private static final float t(State state) {
                return ((Number) state.getValue()).floatValue();
            }
        });
    }
}
