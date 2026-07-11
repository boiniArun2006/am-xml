package androidx.compose.animation;

import GJW.vd;
import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.LookaheadScopeKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000b\u001a\u00020\u00042\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0017\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016\"(\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001b\"\u001a\u0010 \u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u0012\u0004\b\u001f\u0010\u0016\"2\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0!0!8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b%\u0010&\u0012\u0004\b'\u0010\u0016¨\u0006)"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/animation/SharedTransitionScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function2;", "nr", "(Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/geometry/Rect;", c.f62177j, "Landroidx/compose/animation/core/SpringSpec;", "DefaultSpring", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "rl", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "getParentClip$annotations", "()V", "ParentClip", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "Lkotlin/jvm/functions/Function2;", "DefaultClipInOverlayDuringTransition", "Landroidx/compose/animation/BoundsTransform;", "Landroidx/compose/animation/BoundsTransform;", "getDefaultBoundsTransform$annotations", "DefaultBoundsTransform", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/layout/ContentScale;", "Landroidx/compose/ui/Alignment;", "Landroidx/compose/animation/ScaleToBoundsImpl;", "O", "Landroidx/collection/MutableScatterMap;", "getCachedScaleToBoundsImplMap$annotations", "cachedScaleToBoundsImplMap", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1221:1\n683#2:1222\n683#2:1224\n1#3:1223\n1#3:1225\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt\n*L\n1180#1:1222\n1181#1:1224\n1180#1:1223\n1181#1:1225\n*E\n"})
public final class SharedTransitionScopeKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final SpringSpec f15345n = AnimationSpecKt.qie(0.0f, 400.0f, VisibilityThresholdsKt.Uo(Rect.INSTANCE), 1, null);
    private static final SharedTransitionScope.OverlayClip rl = new SharedTransitionScope.OverlayClip() { // from class: androidx.compose.animation.SharedTransitionScopeKt$ParentClip$1
        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public Path n(SharedTransitionScope.SharedContentState sharedContentState, Rect bounds, LayoutDirection layoutDirection, Density density) {
            SharedTransitionScope.SharedContentState sharedContentStateO = sharedContentState.O();
            if (sharedContentStateO != null) {
                return sharedContentStateO.n();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Function2 f15346t = new Function2() { // from class: androidx.compose.animation.SharedTransitionScopeKt$DefaultClipInOverlayDuringTransition$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Void invoke(LayoutDirection layoutDirection, Density density) {
            return null;
        }
    };
    private static final BoundsTransform nr = new BoundsTransform() { // from class: androidx.compose.animation.w6
        @Override // androidx.compose.animation.BoundsTransform
        public final FiniteAnimationSpec n(Rect rect, Rect rect2) {
            return SharedTransitionScopeKt.rl(rect, rect2);
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final MutableScatterMap f15344O = new MutableScatterMap(0, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec rl(Rect rect, Rect rect2) {
        return f15345n;
    }

    public static final void nr(final Function4 function4, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        Composer composerKN = composer.KN(-2093217917);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(function4)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-2093217917, i3, -1, "androidx.compose.animation.SharedTransitionScope (SharedTransitionScope.kt:121)");
            }
            LookaheadScopeKt.n(ComposableLambdaKt.nr(-863967934, true, new Function3<LookaheadScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LookaheadScope lookaheadScope, Composer composer2, Integer num) {
                    n(lookaheadScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(LookaheadScope lookaheadScope, Composer composer2, int i7) {
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-863967934, i7, -1, "androidx.compose.animation.SharedTransitionScope.<anonymous> (SharedTransitionScope.kt:123)");
                    }
                    Object objIF = composer2.iF();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer2);
                        composer2.o(objIF);
                    }
                    vd vdVar = (vd) objIF;
                    Object objIF2 = composer2.iF();
                    if (objIF2 == companion.n()) {
                        objIF2 = new SharedTransitionScopeImpl(lookaheadScope, vdVar);
                        composer2.o(objIF2);
                    }
                    final SharedTransitionScopeImpl sharedTransitionScopeImpl = (SharedTransitionScopeImpl) objIF2;
                    Function4 function42 = function4;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Object objIF3 = composer2.iF();
                    if (objIF3 == companion.n()) {
                        objIF3 = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$1$1
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                return n(measureScope, measurable, constraints.getValue());
                            }

                            public final MeasureResult n(final MeasureScope measureScope, Measurable measurable, long j2) {
                                final Placeable placeableDR0 = measurable.dR0(j2);
                                int width = placeableDR0.getWidth();
                                int height = placeableDR0.getHeight();
                                final SharedTransitionScopeImpl sharedTransitionScopeImpl2 = sharedTransitionScopeImpl;
                                return MeasureScope.ER(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        n(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Placeable.PlacementScope placementScope) {
                                        LayoutCoordinates layoutCoordinatesNr = placementScope.nr();
                                        if (layoutCoordinatesNr != null) {
                                            if (!measureScope.Org()) {
                                                sharedTransitionScopeImpl2.aYN(layoutCoordinatesNr);
                                            } else {
                                                sharedTransitionScopeImpl2.WPU(layoutCoordinatesNr);
                                            }
                                        }
                                        Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.o(objIF3);
                    }
                    Modifier modifierN = LayoutModifierKt.n(companion2, (Function3) objIF3);
                    Object objIF4 = composer2.iF();
                    if (objIF4 == companion.n()) {
                        objIF4 = new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$2$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                n(contentDrawScope);
                                return Unit.INSTANCE;
                            }

                            public final void n(ContentDrawScope contentDrawScope) {
                                contentDrawScope.l2();
                                sharedTransitionScopeImpl.xMQ(contentDrawScope);
                            }
                        };
                        composer2.o(objIF4);
                    }
                    function42.invoke(sharedTransitionScopeImpl, DrawModifierKt.nr(modifierN, (Function1) objIF4), composer2, 6);
                    Unit unit = Unit.INSTANCE;
                    Object objIF5 = composer2.iF();
                    if (objIF5 == companion.n()) {
                        objIF5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$3$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                final SharedTransitionScopeImpl sharedTransitionScopeImpl2 = sharedTransitionScopeImpl;
                                return new DisposableEffectResult() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$3$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void n() {
                                        sharedTransitionScopeImpl2.ty();
                                    }
                                };
                            }
                        };
                        composer2.o(objIF5);
                    }
                    EffectsKt.rl(unit, (Function1) objIF5, composer2, 54);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$2
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
                    SharedTransitionScopeKt.nr(function4, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final void t(final Modifier modifier, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        boolean z2;
        Composer composerKN = composer.KN(2043053727);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.p5(modifier)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.E2(function3)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i5 & 1)) {
            if (i9 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(2043053727, i5, -1, "androidx.compose.animation.SharedTransitionLayout (SharedTransitionScope.kt:98)");
            }
            nr(ComposableLambdaKt.nr(-130587847, true, new Function4<SharedTransitionScope, Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                public final void n(SharedTransitionScope sharedTransitionScope, Modifier modifier2, Composer composer2, int i10) {
                    int i11;
                    if ((i10 & 6) == 0) {
                        i11 = (composer2.p5(sharedTransitionScope) ? 4 : 2) | i10;
                    } else {
                        i11 = i10;
                    }
                    if ((i10 & 48) == 0) {
                        i11 |= composer2.p5(modifier2) ? 32 : 16;
                    }
                    if (!composer2.HI((i11 & 147) != 146, 1 & i11)) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-130587847, i11, -1, "androidx.compose.animation.SharedTransitionLayout.<anonymous> (SharedTransitionScope.kt:102)");
                    }
                    Modifier modifierZmq = modifier.Zmq(modifier2);
                    Function3 function32 = function3;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                    int iN = ComposablesKt.n(composer2, 0);
                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer2, modifierZmq);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion.n();
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
                    Updater.O(composerN, measurePolicyUo, companion.t());
                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                    Function2 function2Rl = companion.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    function32.invoke(sharedTransitionScope, composer2, Integer.valueOf(i11 & 14));
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(SharedTransitionScope sharedTransitionScope, Modifier modifier2, Composer composer2, Integer num) {
                    n(sharedTransitionScope, modifier2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerKN, 54), composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i10) {
                    SharedTransitionScopeKt.t(modifier, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }
}
