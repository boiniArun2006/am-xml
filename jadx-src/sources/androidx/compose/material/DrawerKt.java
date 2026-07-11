package androidx.compose.material;

import GJW.vd;
import ScC.FuwU.XIvb;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0093\u0001\u0010\"\u001a\u00020\u00102\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0002¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00100 ¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0093\u0001\u0010$\u001a\u00020\u00102\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0002¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00100 ¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a'\u0010)\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010*\u001a0\u0010.\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u001c2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100 2\u0006\u0010-\u001a\u00020\u0003H\u0003ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a>\u00103\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00032\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100 2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\n0 2\u0006\u0010+\u001a\u00020\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a\u001b\u00108\u001a\u0002072\n\u00106\u001a\u0006\u0012\u0002\b\u000305H\u0002¢\u0006\u0004\b8\u00109\"\u0014\u0010;\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010:\"\u0014\u0010<\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010:\"\u0014\u0010>\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010:\"\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\n0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C²\u0006\f\u0010B\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/DrawerState;", "r", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "Landroidx/compose/material/BottomDrawerValue;", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Landroidx/compose/material/BottomDrawerState;", "Ik", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "scrimColor", "Lkotlin/Function0;", AppLovinEventTypes.USER_VIEWED_CONTENT, "O", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", c.f62177j, "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "pos", "ck", "(FFF)F", TtmlNode.ATTR_TTS_COLOR, "onDismiss", "visible", "rl", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "open", "onClose", "fraction", "J2", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material/AnchoredDraggableState;", "state", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nr", "(Landroidx/compose/material/AnchoredDraggableState;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "F", "EndDrawerPadding", "DrawerPositionalThreshold", "t", "DrawerVelocityThreshold", "Landroidx/compose/animation/core/TweenSpec;", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "alpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,842:1\n1247#2,6:843\n1247#2,6:850\n1247#2,3:863\n1250#2,3:867\n1247#2,3:877\n1250#2,3:881\n1247#2,6:901\n1247#2,6:907\n1247#2,6:913\n1247#2,6:919\n1247#2,6:925\n1247#2,6:931\n75#3:849\n557#4:856\n554#4,6:857\n557#4:870\n554#4,6:871\n555#5:866\n555#5:880\n71#6,16:884\n696#7:900\n85#8:937\n149#9:938\n149#9:939\n149#9:940\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n*L\n396#1:843,6\n419#1:850,6\n467#1:863,3\n467#1:867,3\n594#1:877,3\n594#1:881,3\n737#1:901,6\n738#1:907,6\n749#1:913,6\n760#1:919,6\n761#1:925,6\n772#1:931,6\n415#1:849\n467#1:856\n467#1:857,6\n594#1:870\n594#1:871,6\n467#1:866\n594#1:880\n727#1:884,16\n731#1:900\n733#1:937\n775#1:938\n776#1:939\n777#1:940\n*E\n"})
public final class DrawerKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f21851n;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f21852t = Dp.KN(Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE);
    private static final TweenSpec nr = new TweenSpec(256, 0, null, 6, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ck(float f3, float f4, float f5) {
        float f6 = (f5 - f3) / (f4 - f3);
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            return 1.0f;
        }
        return f6;
    }

    static {
        float f3 = 56;
        f21851n = Dp.KN(f3);
        rl = Dp.KN(f3);
    }

    public static final BottomDrawerState Ik(final BottomDrawerValue bottomDrawerValue, final Function1 function1, final AnimationSpec animationSpec, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            function1 = new Function1<BottomDrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt$rememberBottomDrawerState$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(BottomDrawerValue bottomDrawerValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i3 & 4) != 0) {
            animationSpec = DrawerDefaults.f21849n.n();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1477366969, i2, -1, "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:413)");
        }
        final Density density = (Density) composer.ty(CompositionLocalsKt.J2());
        Object[] objArr = {density};
        Saver saverN = BottomDrawerState.f21416t.n(density, function1, animationSpec);
        boolean zP5 = ((((i2 & 14) ^ 6) > 4 && composer.p5(bottomDrawerValue)) || (i2 & 6) == 4) | composer.p5(density) | ((((i2 & 112) ^ 48) > 32 && composer.p5(function1)) || (i2 & 48) == 32) | composer.E2(animationSpec);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new Function0<BottomDrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberBottomDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final BottomDrawerState invoke() {
                    return new BottomDrawerState(bottomDrawerValue, density, function1, animationSpec);
                }
            };
            composer.o(objIF);
        }
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF, composer, 0, 4);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return bottomDrawerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(final boolean z2, final Function0 function0, final Function0 function02, final long j2, Composer composer, final int i2) {
        int i3;
        Modifier modifierT;
        Composer composerKN = composer.KN(1983403750);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function0) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function02) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.nr(j2) ? 2048 : 1024;
        }
        if (composerKN.HI((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(1983403750, i3, -1, "androidx.compose.material.Scrim (Drawer.kt:755)");
            }
            final String strN = Strings_androidKt.n(Strings.INSTANCE.n(), composerKN, 6);
            if (z2) {
                composerKN.eF(487534424);
                Modifier.Companion companion = Modifier.INSTANCE;
                int i5 = i3 & 112;
                boolean z3 = i5 == 32;
                Object objIF = composerKN.iF();
                if (z3 || objIF == Composer.INSTANCE.n()) {
                    objIF = new DrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    composerKN.o(objIF);
                }
                Modifier modifierZmq = companion.Zmq(new SuspendPointerInputElement(function0, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objIF), 6, null));
                boolean zP5 = (i5 == 32) | composerKN.p5(strN);
                Object objIF2 = composerKN.iF();
                if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.I(semanticsPropertyReceiver, strN);
                            final Function0 function03 = function0;
                            SemanticsPropertiesKt.te(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke() {
                                    function03.invoke();
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    };
                    composerKN.o(objIF2);
                }
                modifierT = SemanticsModifierKt.t(modifierZmq, true, (Function1) objIF2);
                composerKN.Xw();
            } else {
                composerKN.eF(487858498);
                composerKN.Xw();
                modifierT = Modifier.INSTANCE;
            }
            Modifier modifierZmq2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null).Zmq(modifierT);
            boolean z4 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objIF3 = composerKN.iF();
            if (z4 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$1$1
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
                        DrawScope.h(drawScope, j2, 0L, 0L, ((Number) function02.invoke()).floatValue(), null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
                    }
                };
                composerKN.o(objIF3);
            }
            CanvasKt.rl(modifierZmq2, (Function1) objIF3, composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$2
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
                    DrawerKt.J2(z2, function0, function02, j2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final Function3 function3, Modifier modifier, DrawerState drawerState, boolean z2, Shape shape, float f3, long j2, long j3, long j4, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        DrawerState drawerState2;
        int i7;
        boolean z3;
        Shape shape2;
        int i8;
        float f4;
        int i9;
        final Modifier modifier3;
        final DrawerState drawerState3;
        final boolean z4;
        final Shape shape3;
        final float f5;
        final long j5;
        final long j6;
        final long j7;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier4;
        DrawerState drawerStateR;
        Shape shapeO;
        long jRl;
        long jRl2;
        final long jNr;
        final DrawerState drawerState4;
        final Shape shape4;
        final float f6;
        final long j9;
        final long j10;
        final boolean z5;
        int i10;
        Composer composerKN = composer.KN(1305806945);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function3) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    drawerState2 = drawerState;
                    int i12 = composerKN.p5(drawerState2) ? 256 : 128;
                    i5 |= i12;
                } else {
                    drawerState2 = drawerState;
                }
                i5 |= i12;
            } else {
                drawerState2 = drawerState;
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
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        f4 = f3;
                        i5 |= composerKN.rl(f4) ? 131072 : 65536;
                    }
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            i10 = i5;
                            int i14 = composerKN.nr(j2) ? 1048576 : 524288;
                            i9 = i10 | i14;
                        } else {
                            i10 = i5;
                        }
                        i9 = i10 | i14;
                    } else {
                        i9 = i5;
                    }
                    if ((i2 & 12582912) == 0) {
                        i9 |= ((i3 & 128) == 0 && composerKN.nr(j3)) ? 8388608 : 4194304;
                    }
                    if ((100663296 & i2) == 0) {
                        i9 |= ((i3 & 256) == 0 && composerKN.nr(j4)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i3 & 512) != 0) {
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i9 |= composerKN.E2(function2) ? 536870912 : 268435456;
                        }
                        if (composerKN.HI((306783379 & i9) != 306783378, i9 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                modifier4 = i11 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i3 & 4) != 0) {
                                    drawerStateR = r(DrawerValue.f21979n, null, composerKN, 6, 2);
                                    i9 &= -897;
                                } else {
                                    drawerStateR = drawerState2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 16) != 0) {
                                    shapeO = DrawerDefaults.f21849n.O(composerKN, 6);
                                    i9 &= -57345;
                                } else {
                                    shapeO = shape2;
                                }
                                float fT = i8 != 0 ? DrawerDefaults.f21849n.t() : f4;
                                if ((i3 & 64) != 0) {
                                    jRl = DrawerDefaults.f21849n.rl(composerKN, 6);
                                    i9 &= -3670017;
                                } else {
                                    jRl = j2;
                                }
                                if ((i3 & 128) != 0) {
                                    jRl2 = ColorsKt.rl(jRl, composerKN, (i9 >> 18) & 14);
                                    i9 &= -29360129;
                                } else {
                                    jRl2 = j3;
                                }
                                if ((i3 & 256) != 0) {
                                    jNr = DrawerDefaults.f21849n.nr(composerKN, 6);
                                    i9 &= -234881025;
                                } else {
                                    jNr = j4;
                                }
                                drawerState4 = drawerStateR;
                                shape4 = shapeO;
                                f6 = fT;
                                j9 = jRl;
                                j10 = jRl2;
                                z5 = z3;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 4) != 0) {
                                    i9 &= -897;
                                }
                                if ((i3 & 16) != 0) {
                                    i9 &= -57345;
                                }
                                if ((i3 & 64) != 0) {
                                    i9 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i9 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i9 &= -234881025;
                                }
                                j9 = j2;
                                j10 = j3;
                                jNr = j4;
                                modifier4 = modifier2;
                                drawerState4 = drawerState2;
                                z5 = z3;
                                shape4 = shape2;
                                f6 = f4;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1305806945, i9, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:465)");
                            }
                            Object objIF = composerKN.iF();
                            if (objIF == Composer.INSTANCE.n()) {
                                objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                                composerKN.o(objIF);
                            }
                            final vd vdVar = (vd) objIF;
                            BoxWithConstraintsKt.n(SizeKt.J2(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.nr(816674999, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                    n(boxWithConstraintsScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, int i15) {
                                    BoxWithConstraintsScope boxWithConstraintsScope2;
                                    int i16;
                                    if ((i15 & 6) == 0) {
                                        boxWithConstraintsScope2 = boxWithConstraintsScope;
                                        i16 = i15 | (composer2.p5(boxWithConstraintsScope2) ? 4 : 2);
                                    } else {
                                        boxWithConstraintsScope2 = boxWithConstraintsScope;
                                        i16 = i15;
                                    }
                                    if (!composer2.HI((i16 & 19) != 18, i16 & 1)) {
                                        composer2.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(816674999, i16, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:468)");
                                    }
                                    long constraints = boxWithConstraintsScope2.getConstraints();
                                    if (!Constraints.KN(constraints)) {
                                        throw new IllegalStateException("Drawer shouldn't have infinite width");
                                    }
                                    final float f7 = -Constraints.qie(constraints);
                                    final Density density = (Density) composer2.ty(CompositionLocalsKt.J2());
                                    boolean zP5 = composer2.p5(drawerState4) | composer2.p5(density) | composer2.rl(f7);
                                    final DrawerState drawerState5 = drawerState4;
                                    Object objIF2 = composer2.iF();
                                    final float f8 = 0.0f;
                                    if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                                        objIF2 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1
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
                                                drawerState5.KN(density);
                                                final float f9 = f7;
                                                final float f10 = f8;
                                                AnchoredDraggableState.nHg(drawerState5.getAnchoredDraggableState(), AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1$anchors$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                                        n(draggableAnchorsConfig);
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                                        draggableAnchorsConfig.n(DrawerValue.f21979n, f9);
                                                        draggableAnchorsConfig.n(DrawerValue.f21980t, f10);
                                                    }
                                                }), null, 2, null);
                                            }
                                        };
                                        composer2.o(objIF2);
                                    }
                                    EffectsKt.KN((Function0) objIF2, composer2, 0);
                                    boolean z6 = composer2.ty(CompositionLocalsKt.az()) == LayoutDirection.f34161t;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierO = AnchoredDraggableKt.O(companion, drawerState4.getAnchoredDraggableState(), Orientation.f16970t, z5, z6, null, false, 48, null);
                                    final DrawerState drawerState6 = drawerState4;
                                    final boolean z7 = z5;
                                    final vd vdVar2 = vdVar;
                                    long j11 = jNr;
                                    Shape shape5 = shape4;
                                    long j12 = j9;
                                    long j13 = j10;
                                    float f9 = f6;
                                    Function2 function22 = function2;
                                    final Function3 function32 = function3;
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                                    int iN = ComposablesKt.n(composer2, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                    Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierO);
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
                                    Updater.O(composerN, modifierO2, companion3.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.HI(), false);
                                    int iN2 = ComposablesKt.n(composer2, 0);
                                    CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                                    Modifier modifierO3 = ComposedModifierKt.O(composer2, companion);
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
                                    Updater.O(composerN2, modifierO3, companion3.nr());
                                    function22.invoke(composer2, 0);
                                    composer2.XQ();
                                    boolean zO = drawerState6.O();
                                    boolean zN = composer2.n(z7) | composer2.p5(drawerState6) | composer2.E2(vdVar2);
                                    Object objIF3 = composer2.iF();
                                    if (zN || objIF3 == Composer.INSTANCE.n()) {
                                        objIF3 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", i = {}, l = {506}, m = "invokeSuspend", n = {}, s = {})
                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                int f21927n;

                                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                final /* synthetic */ DrawerState f21928t;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(DrawerState drawerState, Continuation continuation) {
                                                    super(2, continuation);
                                                    this.f21928t = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation create(Object obj, Continuation continuation) {
                                                    return new AnonymousClass1(this.f21928t, continuation);
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final Object invoke2(vd vdVar, Continuation continuation) {
                                                    return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                                    return invoke2(vdVar, (Continuation) continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i2 = this.f21927n;
                                                    if (i2 != 0) {
                                                        if (i2 == 1) {
                                                            ResultKt.throwOnFailure(obj);
                                                        } else {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                    } else {
                                                        ResultKt.throwOnFailure(obj);
                                                        DrawerState drawerState = this.f21928t;
                                                        this.f21927n = 1;
                                                        if (drawerState.rl(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                if (z7 && ((Boolean) drawerState6.getAnchoredDraggableState().getConfirmValueChange().invoke(DrawerValue.f21979n)).booleanValue()) {
                                                    GJW.C.nr(vdVar2, null, null, new AnonymousClass1(drawerState6, null), 3, null);
                                                }
                                            }
                                        };
                                        composer2.o(objIF3);
                                    }
                                    Function0 function0 = (Function0) objIF3;
                                    boolean zRl = composer2.rl(f7) | composer2.p5(drawerState6);
                                    Object objIF4 = composer2.iF();
                                    if (zRl || objIF4 == Composer.INSTANCE.n()) {
                                        final float f10 = 0.0f;
                                        objIF4 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final Float invoke() {
                                                return Float.valueOf(DrawerKt.ck(f7, f10, drawerState6.Uo()));
                                            }
                                        };
                                        composer2.o(objIF4);
                                    }
                                    DrawerKt.J2(zO, function0, (Function0) objIF4, j11, composer2, 0);
                                    final String strN = Strings_androidKt.n(Strings.INSTANCE.O(), composer2, 6);
                                    Density density2 = (Density) composer2.ty(CompositionLocalsKt.J2());
                                    Modifier modifierWPU = SizeKt.WPU(companion, density2.rV9(Constraints.ty(constraints)), density2.rV9(Constraints.az(constraints)), density2.rV9(Constraints.qie(constraints)), density2.rV9(Constraints.gh(constraints)));
                                    boolean zP52 = composer2.p5(drawerState6);
                                    Object objIF5 = composer2.iF();
                                    if (zP52 || objIF5 == Composer.INSTANCE.n()) {
                                        objIF5 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                                return IntOffset.t(n(density3));
                                            }

                                            public final long n(Density density3) {
                                                return IntOffsetKt.n(MathKt.roundToInt(drawerState6.Uo()), 0);
                                            }
                                        };
                                        composer2.o(objIF5);
                                    }
                                    Modifier modifierAz = PaddingKt.az(OffsetKt.n(modifierWPU, (Function1) objIF5), 0.0f, 0.0f, DrawerKt.f21851n, 0.0f, 11, null);
                                    boolean zP53 = composer2.p5(strN) | composer2.p5(drawerState6) | composer2.E2(vdVar2);
                                    Object objIF6 = composer2.iF();
                                    if (zP53 || objIF6 == Composer.INSTANCE.n()) {
                                        objIF6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                n(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                SemanticsPropertiesKt.eTf(semanticsPropertyReceiver, strN);
                                                if (drawerState6.O()) {
                                                    final DrawerState drawerState7 = drawerState6;
                                                    final vd vdVar3 = vdVar2;
                                                    SemanticsPropertiesKt.ty(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", i = {}, l = {534}, m = "invokeSuspend", n = {}, s = {})
                                                        static final class C05261 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                            int f21938n;

                                                            /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                            final /* synthetic */ DrawerState f21939t;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            C05261(DrawerState drawerState, Continuation continuation) {
                                                                super(2, continuation);
                                                                this.f21939t = drawerState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation create(Object obj, Continuation continuation) {
                                                                return new C05261(this.f21939t, continuation);
                                                            }

                                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final Object invoke2(vd vdVar, Continuation continuation) {
                                                                return ((C05261) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                                                return invoke2(vdVar, (Continuation) continuation);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) {
                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i2 = this.f21938n;
                                                                if (i2 != 0) {
                                                                    if (i2 == 1) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                    } else {
                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                    }
                                                                } else {
                                                                    ResultKt.throwOnFailure(obj);
                                                                    DrawerState drawerState = this.f21939t;
                                                                    this.f21938n = 1;
                                                                    if (drawerState.rl(this) == coroutine_suspended) {
                                                                        return coroutine_suspended;
                                                                    }
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                        public final Boolean invoke() {
                                                            if (((Boolean) drawerState7.getAnchoredDraggableState().getConfirmValueChange().invoke(DrawerValue.f21979n)).booleanValue()) {
                                                                GJW.C.nr(vdVar3, null, null, new C05261(drawerState7, null), 3, null);
                                                            }
                                                            return Boolean.TRUE;
                                                        }
                                                    }, 1, null);
                                                }
                                            }
                                        };
                                        composer2.o(objIF6);
                                    }
                                    SurfaceKt.n(SemanticsModifierKt.nr(modifierAz, false, (Function1) objIF6, 1, null), shape5, j12, j13, null, f9, ComposableLambdaKt.nr(-1941234439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i17) {
                                            if (!composer3.HI((i17 & 3) != 2, i17 & 1)) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1941234439, i17, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:544)");
                                            }
                                            Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
                                            Function3 function33 = function32;
                                            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer3, 0);
                                            int iN3 = ComposablesKt.n(composer3, 0);
                                            CompositionLocalMap compositionLocalMapIk3 = composer3.Ik();
                                            Modifier modifierO4 = ComposedModifierKt.O(composer3, modifierJ2);
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                            Function0 function0N3 = companion4.n();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.t();
                                            }
                                            composer3.T();
                                            if (composer3.getInserting()) {
                                                composer3.s7N(function0N3);
                                            } else {
                                                composer3.r();
                                            }
                                            Composer composerN3 = Updater.n(composer3);
                                            Updater.O(composerN3, measurePolicyN, companion4.t());
                                            Updater.O(composerN3, compositionLocalMapIk3, companion4.O());
                                            Function2 function2Rl3 = companion4.rl();
                                            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                                                composerN3.o(Integer.valueOf(iN3));
                                                composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                            }
                                            Updater.O(composerN3, modifierO4, companion4.nr());
                                            function33.invoke(ColumnScopeInstance.f17468n, composer3, 6);
                                            composer3.XQ();
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composer2, 54), composer2, 1572864, 16);
                                    composer2.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, 3072, 6);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier3 = modifier4;
                            drawerState3 = drawerState4;
                            z4 = z5;
                            j7 = jNr;
                            shape3 = shape4;
                            j5 = j9;
                            j6 = j10;
                            f5 = f6;
                        } else {
                            composerKN.wTp();
                            modifier3 = modifier2;
                            drawerState3 = drawerState2;
                            z4 = z3;
                            shape3 = shape2;
                            f5 = f4;
                            j5 = j2;
                            j6 = j3;
                            j7 = j4;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
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
                                    DrawerKt.O(function3, modifier3, drawerState3, z4, shape3, f5, j5, j6, j7, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    if (composerKN.HI((306783379 & i9) != 306783378, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                f4 = f3;
                if ((1572864 & i2) != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((100663296 & i2) == 0) {
                }
                if ((i3 & 512) != 0) {
                }
                if (composerKN.HI((306783379 & i9) != 306783378, i9 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            f4 = f3;
            if ((1572864 & i2) != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((100663296 & i2) == 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if (composerKN.HI((306783379 & i9) != 306783378, i9 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        f4 = f3;
        if ((1572864 & i2) != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if (composerKN.HI((306783379 & i9) != 306783378, i9 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function3 function3, Modifier modifier, BottomDrawerState bottomDrawerState, boolean z2, Shape shape, float f3, long j2, long j3, long j4, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function3 function32;
        int i5;
        BottomDrawerState bottomDrawerState2;
        int i7;
        boolean z3;
        Shape shape2;
        int i8;
        float f4;
        int i9;
        int i10;
        int i11;
        final Modifier modifier2;
        final long j5;
        Composer composer2;
        final BottomDrawerState bottomDrawerState3;
        final boolean z4;
        final Shape shape3;
        final float f5;
        final long j6;
        final long j7;
        ScopeUpdateScope scopeUpdateScopeGh;
        boolean z5;
        BottomDrawerState bottomDrawerStateIk;
        int i12;
        Shape shapeO;
        long jRl;
        long jRl2;
        final long jNr;
        final BottomDrawerState bottomDrawerState4;
        final Shape shape4;
        final float f6;
        final boolean z6;
        final long j9;
        final long j10;
        ?? r02;
        Composer composerKN = composer.KN(625649286);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function32 = function3;
        } else {
            function32 = function3;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function32) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.p5(modifier) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    bottomDrawerState2 = bottomDrawerState;
                    int i14 = composerKN.E2(bottomDrawerState2) ? 256 : 128;
                    i5 |= i14;
                } else {
                    bottomDrawerState2 = bottomDrawerState;
                }
                i5 |= i14;
            } else {
                bottomDrawerState2 = bottomDrawerState;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i2 & 3072) == 0) {
                    i5 |= composerKN.n(z3) ? 2048 : 1024;
                }
            }
            if ((i2 & 24576) != 0) {
                shape2 = shape;
                i5 |= ((i3 & 16) == 0 && composerKN.p5(shape2)) ? 16384 : 8192;
            } else {
                shape2 = shape;
            }
            i8 = i3 & 32;
            if (i8 == 0) {
                i5 |= 196608;
                f4 = f3;
            } else {
                f4 = f3;
                if ((196608 & i2) == 0) {
                    i5 |= composerKN.rl(f4) ? 131072 : 65536;
                }
            }
            if ((1572864 & i2) != 0) {
                i9 = i5 | (((i3 & 64) == 0 && composerKN.nr(j2)) ? 1048576 : 524288);
            } else {
                i9 = i5;
            }
            if ((i2 & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    i10 = i13;
                    int i15 = composerKN.nr(j3) ? 8388608 : 4194304;
                    i9 |= i15;
                } else {
                    i10 = i13;
                }
                i9 |= i15;
            } else {
                i10 = i13;
            }
            if ((i2 & 100663296) == 0) {
                i9 |= ((i3 & 256) == 0 && composerKN.nr(j4)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
            }
            if ((i3 & 512) != 0) {
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i9 |= composerKN.E2(function2) ? 536870912 : 268435456;
                }
                i11 = i9;
                if (composerKN.HI((306783379 & i11) != 306783378, i11 & 1)) {
                    composerKN.e();
                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                        Modifier modifier3 = i10 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i3 & 4) != 0) {
                            modifier = modifier3;
                            z5 = true;
                            bottomDrawerStateIk = Ik(BottomDrawerValue.f21426n, null, null, composerKN, 6, 6);
                            i12 = i11 & (-897);
                        } else {
                            modifier = modifier3;
                            z5 = true;
                            bottomDrawerStateIk = bottomDrawerState2;
                            i12 = i11;
                        }
                        if (i7 != 0) {
                            z3 = z5 ? 1 : 0;
                        }
                        if ((i3 & 16) != 0) {
                            shapeO = DrawerDefaults.f21849n.O(composerKN, 6);
                            i12 &= -57345;
                        } else {
                            shapeO = shape2;
                        }
                        float fT = i8 != 0 ? DrawerDefaults.f21849n.t() : f4;
                        if ((i3 & 64) != 0) {
                            jRl = DrawerDefaults.f21849n.rl(composerKN, 6);
                            i12 &= -3670017;
                        } else {
                            jRl = j2;
                        }
                        if ((i3 & 128) != 0) {
                            jRl2 = ColorsKt.rl(jRl, composerKN, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jRl2 = j3;
                        }
                        if ((i3 & 256) != 0) {
                            i12 &= -234881025;
                            shape4 = shapeO;
                            f6 = fT;
                            j9 = jRl;
                            j10 = jRl2;
                            jNr = DrawerDefaults.f21849n.nr(composerKN, 6);
                            bottomDrawerState4 = bottomDrawerStateIk;
                            z6 = z3;
                            r02 = z5;
                        } else {
                            jNr = j4;
                            bottomDrawerState4 = bottomDrawerStateIk;
                            shape4 = shapeO;
                            f6 = fT;
                            z6 = z3;
                            j9 = jRl;
                            j10 = jRl2;
                            r02 = z5;
                        }
                    } else {
                        composerKN.wTp();
                        if ((i3 & 4) != 0) {
                            i11 &= -897;
                        }
                        if ((i3 & 16) != 0) {
                            i11 &= -57345;
                        }
                        if ((i3 & 64) != 0) {
                            i11 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            i11 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i11 &= -234881025;
                        }
                        j9 = j2;
                        j10 = j3;
                        jNr = j4;
                        r02 = 1;
                        bottomDrawerState4 = bottomDrawerState2;
                        z6 = z3 ? 1 : 0;
                        shape4 = shape2;
                        f6 = f4;
                        i12 = i11;
                    }
                    Modifier modifier4 = modifier;
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(625649286, i12, -1, XIvb.Pnzv);
                    }
                    Object objIF = composerKN.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                        objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                        composerKN.o(objIF);
                    }
                    final vd vdVar = (vd) objIF;
                    final Function3 function33 = function32;
                    BoxWithConstraintsKt.n(SizeKt.J2(modifier4, 0.0f, r02, null), null, false, ComposableLambdaKt.nr(1220102512, r02, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                            n(boxWithConstraintsScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, int i16) {
                            BoxWithConstraintsScope boxWithConstraintsScope2;
                            int i17;
                            if ((i16 & 6) == 0) {
                                boxWithConstraintsScope2 = boxWithConstraintsScope;
                                i17 = i16 | (composer3.p5(boxWithConstraintsScope2) ? 4 : 2);
                            } else {
                                boxWithConstraintsScope2 = boxWithConstraintsScope;
                                i17 = i16;
                            }
                            if (!composer3.HI((i17 & 19) != 18, i17 & 1)) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1220102512, i17, -1, "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:595)");
                            }
                            final float fGh = Constraints.gh(boxWithConstraintsScope2.getConstraints());
                            final boolean z7 = Constraints.qie(boxWithConstraintsScope2.getConstraints()) > Constraints.gh(boxWithConstraintsScope2.getConstraints());
                            Density density = (Density) composer3.ty(CompositionLocalsKt.J2());
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierAYN = SizeKt.aYN(companion, 0.0f, 0.0f, density.rV9(Constraints.qie(boxWithConstraintsScope2.getConstraints())), density.rV9(Constraints.gh(boxWithConstraintsScope2.getConstraints())), 3, null);
                            Modifier modifierO = AnchoredDraggableKt.O(companion.Zmq(z6 ? NestedScrollModifierKt.rl(companion, bottomDrawerState4.O(), null, 2, null) : companion), bottomDrawerState4.t(), Orientation.f16969n, z6, composer3.ty(CompositionLocalsKt.az()) == LayoutDirection.f34161t, null, false, 48, null);
                            Function2 function22 = function2;
                            long j11 = jNr;
                            final boolean z9 = z6;
                            final BottomDrawerState bottomDrawerState5 = bottomDrawerState4;
                            final vd vdVar2 = vdVar;
                            Shape shape5 = shape4;
                            long j12 = j9;
                            long j13 = j10;
                            float f7 = f6;
                            final Function3 function34 = function33;
                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                            int iN = ComposablesKt.n(composer3, 0);
                            CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                            Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierO);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0 function0N = companion2.n();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composer3.T();
                            if (composer3.getInserting()) {
                                composer3.s7N(function0N);
                            } else {
                                composer3.r();
                            }
                            Composer composerN = Updater.n(composer3);
                            Updater.O(composerN, measurePolicyUo, companion2.t());
                            Updater.O(composerN, compositionLocalMapIk, companion2.O());
                            Function2 function2Rl = companion2.rl();
                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO2, companion2.nr());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                            function22.invoke(composer3, 0);
                            boolean zN = composer3.n(z9) | composer3.E2(bottomDrawerState5) | composer3.E2(vdVar2);
                            Object objIF2 = composer3.iF();
                            if (zN || objIF2 == Composer.INSTANCE.n()) {
                                objIF2 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1

                                    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1$1, reason: invalid class name */
                                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                    @DebugMetadata(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1$1", f = "Drawer.kt", i = {}, l = {628}, m = "invokeSuspend", n = {}, s = {})
                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                                        int f21864n;

                                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                                        final /* synthetic */ BottomDrawerState f21865t;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(BottomDrawerState bottomDrawerState, Continuation continuation) {
                                            super(2, continuation);
                                            this.f21865t = bottomDrawerState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation create(Object obj, Continuation continuation) {
                                            return new AnonymousClass1(this.f21865t, continuation);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final Object invoke2(vd vdVar, Continuation continuation) {
                                            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                            return invoke2(vdVar, (Continuation) continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i2 = this.f21864n;
                                            if (i2 != 0) {
                                                if (i2 == 1) {
                                                    ResultKt.throwOnFailure(obj);
                                                } else {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                            } else {
                                                ResultKt.throwOnFailure(obj);
                                                BottomDrawerState bottomDrawerState = this.f21865t;
                                                this.f21864n = 1;
                                                if (bottomDrawerState.n(this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z9 && bottomDrawerState5.rl(BottomDrawerValue.f21426n)) {
                                            GJW.C.nr(vdVar2, null, null, new AnonymousClass1(bottomDrawerState5, null), 3, null);
                                        }
                                    }
                                };
                                composer3.o(objIF2);
                            }
                            DrawerKt.rl(j11, (Function0) objIF2, bottomDrawerState5.J2() != BottomDrawerValue.f21426n, composer3, 0);
                            final String strN = Strings_androidKt.n(Strings.INSTANCE.O(), composer3, 6);
                            boolean zRl = composer3.rl(fGh) | composer3.n(z7) | composer3.E2(bottomDrawerState5);
                            Object objIF3 = composer3.iF();
                            if (zRl || objIF3 == Composer.INSTANCE.n()) {
                                objIF3 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1

                                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                                    public /* synthetic */ class WhenMappings {
                                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                        static {
                                            int[] iArr = new int[BottomDrawerValue.values().length];
                                            try {
                                                iArr[BottomDrawerValue.f21426n.ordinal()] = 1;
                                            } catch (NoSuchFieldError unused) {
                                            }
                                            try {
                                                iArr[BottomDrawerValue.f21428t.ordinal()] = 2;
                                            } catch (NoSuchFieldError unused2) {
                                            }
                                            try {
                                                iArr[BottomDrawerValue.f21425O.ordinal()] = 3;
                                            } catch (NoSuchFieldError unused3) {
                                            }
                                            $EnumSwitchMapping$0 = iArr;
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                        n(intSize.getPackedValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(long j14) {
                                        BottomDrawerValue bottomDrawerValueNr;
                                        final float fJ2 = IntSize.J2(j14);
                                        final float f8 = fGh;
                                        final boolean z10 = z7;
                                        DraggableAnchors draggableAnchorsN = AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<BottomDrawerValue>, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1$newAnchors$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<BottomDrawerValue> draggableAnchorsConfig) {
                                                n(draggableAnchorsConfig);
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                                draggableAnchorsConfig.n(BottomDrawerValue.f21426n, f8);
                                                float f9 = f8 * 0.5f;
                                                if (fJ2 > f9 || z10) {
                                                    draggableAnchorsConfig.n(BottomDrawerValue.f21428t, f9);
                                                }
                                                float f10 = fJ2;
                                                if (f10 > 0.0f) {
                                                    draggableAnchorsConfig.n(BottomDrawerValue.f21425O, Math.max(0.0f, f8 - f10));
                                                }
                                            }
                                        });
                                        if (bottomDrawerState5.t().HI().getSize() <= 0 && draggableAnchorsN.nr(bottomDrawerState5.nr())) {
                                            bottomDrawerValueNr = bottomDrawerState5.nr();
                                        } else {
                                            int i18 = WhenMappings.$EnumSwitchMapping$0[bottomDrawerState5.J2().ordinal()];
                                            if (i18 != 1) {
                                                if (i18 != 2 && i18 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                bottomDrawerValueNr = BottomDrawerValue.f21428t;
                                                if (!draggableAnchorsN.nr(bottomDrawerValueNr)) {
                                                    bottomDrawerValueNr = BottomDrawerValue.f21425O;
                                                    if (!draggableAnchorsN.nr(bottomDrawerValueNr)) {
                                                        bottomDrawerValueNr = BottomDrawerValue.f21426n;
                                                    }
                                                }
                                            } else {
                                                bottomDrawerValueNr = BottomDrawerValue.f21426n;
                                            }
                                        }
                                        bottomDrawerState5.t().N(draggableAnchorsN, bottomDrawerValueNr);
                                    }
                                };
                                composer3.o(objIF3);
                            }
                            Modifier modifierN = OnRemeasuredModifierKt.n(modifierAYN, (Function1) objIF3);
                            boolean zE2 = composer3.E2(bottomDrawerState5);
                            Object objIF4 = composer3.iF();
                            if (zE2 || objIF4 == Composer.INSTANCE.n()) {
                                objIF4 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$3$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                        return IntOffset.t(n(density2));
                                    }

                                    public final long n(Density density2) {
                                        return IntOffsetKt.n(0, MathKt.roundToInt(bottomDrawerState5.KN()));
                                    }
                                };
                                composer3.o(objIF4);
                            }
                            Modifier modifierN2 = OffsetKt.n(modifierN, (Function1) objIF4);
                            boolean zP5 = composer3.p5(strN) | composer3.E2(bottomDrawerState5) | composer3.E2(vdVar2);
                            Object objIF5 = composer3.iF();
                            if (zP5 || objIF5 == Composer.INSTANCE.n()) {
                                objIF5 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.eTf(semanticsPropertyReceiver, strN);
                                        if (bottomDrawerState5.Uo()) {
                                            final BottomDrawerState bottomDrawerState6 = bottomDrawerState5;
                                            final vd vdVar3 = vdVar2;
                                            SemanticsPropertiesKt.ty(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1.1

                                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1$1, reason: invalid class name and collision with other inner class name */
                                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                                @DebugMetadata(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1$1", f = "Drawer.kt", i = {}, l = {681}, m = "invokeSuspend", n = {}, s = {})
                                                static final class C05251 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                    int f21878n;

                                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                    final /* synthetic */ BottomDrawerState f21879t;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C05251(BottomDrawerState bottomDrawerState, Continuation continuation) {
                                                        super(2, continuation);
                                                        this.f21879t = bottomDrawerState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation create(Object obj, Continuation continuation) {
                                                        return new C05251(this.f21879t, continuation);
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final Object invoke2(vd vdVar, Continuation continuation) {
                                                        return ((C05251) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                                        return invoke2(vdVar, (Continuation) continuation);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i2 = this.f21878n;
                                                        if (i2 != 0) {
                                                            if (i2 == 1) {
                                                                ResultKt.throwOnFailure(obj);
                                                            } else {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                        } else {
                                                            ResultKt.throwOnFailure(obj);
                                                            BottomDrawerState bottomDrawerState = this.f21879t;
                                                            this.f21878n = 1;
                                                            if (bottomDrawerState.n(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke() {
                                                    if (bottomDrawerState6.rl(BottomDrawerValue.f21426n)) {
                                                        GJW.C.nr(vdVar3, null, null, new C05251(bottomDrawerState6, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                };
                                composer3.o(objIF5);
                            }
                            SurfaceKt.n(SemanticsModifierKt.nr(modifierN2, false, (Function1) objIF5, 1, null), shape5, j12, j13, null, f7, ComposableLambdaKt.nr(457750254, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$5
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    n(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer4, int i18) {
                                    if (!composer4.HI((i18 & 3) != 2, i18 & 1)) {
                                        composer4.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(457750254, i18, -1, "androidx.compose.material.BottomDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:691)");
                                    }
                                    Function3 function35 = function34;
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer4, 0);
                                    int iN2 = ComposablesKt.n(composer4, 0);
                                    CompositionLocalMap compositionLocalMapIk2 = composer4.Ik();
                                    Modifier modifierO3 = ComposedModifierKt.O(composer4, companion3);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0 function0N2 = companion4.n();
                                    if (composer4.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer4.T();
                                    if (composer4.getInserting()) {
                                        composer4.s7N(function0N2);
                                    } else {
                                        composer4.r();
                                    }
                                    Composer composerN2 = Updater.n(composer4);
                                    Updater.O(composerN2, measurePolicyN, companion4.t());
                                    Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                                    Function2 function2Rl2 = companion4.rl();
                                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                        composerN2.o(Integer.valueOf(iN2));
                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                    }
                                    Updater.O(composerN2, modifierO3, companion4.nr());
                                    function35.invoke(ColumnScopeInstance.f17468n, composer4, 6);
                                    composer4.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer3, 54), composer3, 1572864, 16);
                            composer3.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composerKN, 3072, 6);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier2 = modifier4;
                    composer2 = composerKN;
                    z4 = z6;
                    bottomDrawerState3 = bottomDrawerState4;
                    j7 = jNr;
                    shape3 = shape4;
                    j5 = j9;
                    j6 = j10;
                    f5 = f6;
                } else {
                    composerKN.wTp();
                    modifier2 = modifier;
                    j5 = j2;
                    composer2 = composerKN;
                    bottomDrawerState3 = bottomDrawerState2;
                    z4 = z3 ? 1 : 0;
                    shape3 = shape2;
                    f5 = f4;
                    j6 = j3;
                    j7 = j4;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i16) {
                            DrawerKt.n(function3, modifier2, bottomDrawerState3, z4, shape3, f5, j5, j6, j7, function2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
            i11 = i9;
            if (composerKN.HI((306783379 & i11) != 306783378, i11 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        if ((1572864 & i2) != 0) {
        }
        if ((i2 & 12582912) != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i11 = i9;
        if (composerKN.HI((306783379 & i11) != 306783378, i11 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection nr(AnchoredDraggableState anchoredDraggableState) {
        return new DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState);
    }

    public static final DrawerState r(final DrawerValue drawerValue, final Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            function1 = new Function1<DrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(DrawerValue drawerValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1435874229, i2, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:394)");
        }
        Object[] objArr = new Object[0];
        Saver saverN = DrawerState.INSTANCE.n(function1);
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.p5(drawerValue)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.p5(function1)) || (i2 & 48) == 32);
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            objIF = new Function0<DrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final DrawerState invoke() {
                    return new DrawerState(drawerValue, function1);
                }
            };
            composer.o(objIF);
        }
        DrawerState drawerState = (DrawerState) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF, composer, 0, 4);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return drawerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final long j2, final Function0 function0, final boolean z2, Composer composer, final int i2) {
        int i3;
        Modifier modifierT;
        Composer composerKN = composer.KN(-513067266);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.nr(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function0) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z2) ? 256 : 128;
        }
        if (composerKN.HI((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-513067266, i3, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:729)");
            }
            if (j2 != 16) {
                composerKN.eF(1552573422);
                int i5 = i3;
                final State stateNr = AnimateAsStateKt.nr(z2 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerKN, 48, 28);
                final String strN = Strings_androidKt.n(Strings.INSTANCE.n(), composerKN, 6);
                if (z2) {
                    composerKN.eF(1552793770);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    int i7 = i5 & 112;
                    boolean z3 = i7 == 32;
                    Object objIF = composerKN.iF();
                    if (z3 || objIF == Composer.INSTANCE.n()) {
                        objIF = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(function0, null);
                        composerKN.o(objIF);
                    }
                    Modifier modifierZmq = companion.Zmq(new SuspendPointerInputElement(function0, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objIF), 6, null));
                    boolean zP5 = (i7 == 32) | composerKN.p5(strN);
                    Object objIF2 = composerKN.iF();
                    if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.I(semanticsPropertyReceiver, strN);
                                final Function0 function02 = function0;
                                SemanticsPropertiesKt.te(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1.1
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke() {
                                        function02.invoke();
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    modifierT = SemanticsModifierKt.t(modifierZmq, true, (Function1) objIF2);
                    composerKN.Xw();
                } else {
                    composerKN.eF(1553158454);
                    composerKN.Xw();
                    modifierT = Modifier.INSTANCE;
                }
                Modifier modifierZmq2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null).Zmq(modifierT);
                boolean zP52 = composerKN.p5(stateNr) | ((i5 & 14) == 4);
                Object objIF3 = composerKN.iF();
                if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$1$1
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
                            DrawScope.h(drawScope, j2, 0L, 0L, DrawerKt.t(stateNr), null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
                        }
                    };
                    composerKN.o(objIF3);
                }
                CanvasKt.rl(modifierZmq2, (Function1) objIF3, composerKN, 0);
                composerKN.Xw();
            } else {
                composerKN.eF(1553326846);
                composerKN.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    DrawerKt.rl(j2, function0, z2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
