package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.LifecycleOwner;
import androidx.view.SavedStateRegistryOwner;
import androidx.view.compose.LocalLifecycleOwnerKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a{\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a^\u0010 \u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a#\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$\"(\u0010)\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b%8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Landroidx/compose/ui/Modifier;", "modifier", "", "update", c.f62177j, "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onReset", "onRelease", "rl", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "nr", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "Landroidx/compose/runtime/Updater;", "", "compositeKeyHash", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalMap", "Uo", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;ILandroidx/compose/ui/unit/Density;Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/runtime/CompositionLocalMap;)V", "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "J2", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "O", "()Lkotlin/jvm/functions/Function1;", "NoOpUpdate", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,392:1\n75#2:393\n75#2:394\n75#2:395\n75#2:396\n75#2:419\n75#2:420\n75#2:421\n272#3,11:397\n238#3,11:408\n1247#4,6:422\n4206#5,6:428\n89#6,7:434\n*S KotlinDebug\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n*L\n203#1:393\n204#1:394\n211#1:395\n212#1:396\n255#1:419\n257#1:420\n258#1:421\n215#1:397,11\n233#1:408,11\n260#1:422,6\n294#1:428,6\n300#1:434,7\n*E\n"})
public final class AndroidView_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function1 f34227n = new Function1<View, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        public final void n(View view) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            n(view);
            return Unit.INSTANCE;
        }
    };

    public static final Function1 O() {
        return f34227n;
    }

    private static final void Uo(Composer composer, Modifier modifier, int i2, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Updater.O(composer, compositionLocalMap, companion.O());
        Updater.O(composer, modifier, new Function2<LayoutNode, Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Modifier modifier2) {
                n(layoutNode, modifier2);
                return Unit.INSTANCE;
            }

            public final void n(LayoutNode layoutNode, Modifier modifier2) {
                AndroidView_androidKt.J2(layoutNode).setModifier(modifier2);
            }
        });
        Updater.O(composer, density, new Function2<LayoutNode, Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Density density2) {
                n(layoutNode, density2);
                return Unit.INSTANCE;
            }

            public final void n(LayoutNode layoutNode, Density density2) {
                AndroidView_androidKt.J2(layoutNode).setDensity(density2);
            }
        });
        Updater.O(composer, lifecycleOwner, new Function2<LayoutNode, LifecycleOwner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LifecycleOwner lifecycleOwner2) {
                n(layoutNode, lifecycleOwner2);
                return Unit.INSTANCE;
            }

            public final void n(LayoutNode layoutNode, LifecycleOwner lifecycleOwner2) {
                AndroidView_androidKt.J2(layoutNode).setLifecycleOwner(lifecycleOwner2);
            }
        });
        Updater.O(composer, savedStateRegistryOwner, new Function2<LayoutNode, SavedStateRegistryOwner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner2) {
                n(layoutNode, savedStateRegistryOwner2);
                return Unit.INSTANCE;
            }

            public final void n(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner2) {
                AndroidView_androidKt.J2(layoutNode).setSavedStateRegistryOwner(savedStateRegistryOwner2);
            }
        });
        Updater.O(composer, layoutDirection, new Function2<LayoutNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.f34160n.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LayoutDirection.f34161t.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection2) {
                n(layoutNode, layoutDirection2);
                return Unit.INSTANCE;
            }

            public final void n(LayoutNode layoutNode, LayoutDirection layoutDirection2) {
                ViewFactoryHolder viewFactoryHolderJ2 = AndroidView_androidKt.J2(layoutNode);
                int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection2.ordinal()];
                int i5 = 1;
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i5 = 0;
                }
                viewFactoryHolderJ2.setLayoutDirection(i5);
            }
        });
        Function2 function2Rl = companion.rl();
        if (composer.getInserting() || !Intrinsics.areEqual(composer.iF(), Integer.valueOf(i2))) {
            composer.o(Integer.valueOf(i2));
            composer.az(Integer.valueOf(i2), function2Rl);
        }
    }

    public static final void n(final Function1 function1, Modifier modifier, Function1 function12, Composer composer, final int i2, final int i3) {
        int i5;
        final Modifier modifier2;
        final Function1 function13;
        Composer composerKN = composer.KN(-1783766393);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function1) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(modifier) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(function12) ? 256 : 128;
        }
        if (composerKN.HI((i5 & 147) != 146, i5 & 1)) {
            if (i7 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            Function1 function14 = i8 != 0 ? f34227n : function12;
            if (ComposerKt.v()) {
                ComposerKt.p5(-1783766393, i5, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:104)");
            }
            rl(function1, modifier3, null, f34227n, function14, composerKN, (i5 & 14) | 3072 | (i5 & 112) | (57344 & (i5 << 6)), 4);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier3;
            function13 = function14;
        } else {
            composerKN.wTp();
            modifier2 = modifier;
            function13 = function12;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    AndroidView_androidKt.n(function1, modifier2, function13, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function1 function1, Modifier modifier, Function1 function12, Function1 function13, Function1 function14, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        Function1 function15;
        int i8;
        Function1 function16;
        int i9;
        Function1 function17;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-180024211);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function1) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    function15 = function12;
                    i5 |= composerKN.E2(function15) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function16 = function13;
                        i5 |= composerKN.E2(function16) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            function17 = function14;
                            i5 |= composerKN.E2(function17) ? 16384 : 8192;
                        }
                        if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
                            modifier3 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i7 != 0) {
                                function15 = null;
                            }
                            if (i8 != 0) {
                                function16 = f34227n;
                            }
                            if (i9 != 0) {
                                function17 = f34227n;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-180024211, i5, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                            }
                            int iN = ComposablesKt.n(composerKN, 0);
                            Modifier modifierO = ComposedModifierKt.O(composerKN, FocusGroupNode_androidKt.O(modifier3));
                            Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                            LayoutDirection layoutDirection = (LayoutDirection) composerKN.ty(CompositionLocalsKt.az());
                            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerKN.ty(LocalLifecycleOwnerKt.t());
                            SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) composerKN.ty(AndroidCompositionLocals_androidKt.mUb());
                            if (function15 != null) {
                                composerKN.eF(607780130);
                                Function0 function0Nr = nr(function1, composerKN, i5 & 14);
                                if (!(composerKN.getApplier() instanceof UiApplier)) {
                                    ComposablesKt.t();
                                }
                                composerKN.T();
                                if (composerKN.getInserting()) {
                                    composerKN.s7N(function0Nr);
                                } else {
                                    composerKN.r();
                                }
                                Composer composerN = Updater.n(composerKN);
                                Uo(composerN, modifierO, iN, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, compositionLocalMapIk);
                                Updater.O(composerN, function15, new Function2<LayoutNode, Function1<View, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Function1<View, ? extends Unit> function18) {
                                        n(layoutNode, function18);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(LayoutNode layoutNode, Function1 function18) {
                                        AndroidView_androidKt.J2(layoutNode).setResetBlock(function18);
                                    }
                                });
                                Updater.O(composerN, function17, new Function2<LayoutNode, Function1<View, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Function1<View, ? extends Unit> function18) {
                                        n(layoutNode, function18);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(LayoutNode layoutNode, Function1 function18) {
                                        AndroidView_androidKt.J2(layoutNode).setUpdateBlock(function18);
                                    }
                                });
                                Updater.O(composerN, function16, new Function2<LayoutNode, Function1<View, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Function1<View, ? extends Unit> function18) {
                                        n(layoutNode, function18);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(LayoutNode layoutNode, Function1 function18) {
                                        AndroidView_androidKt.J2(layoutNode).setReleaseBlock(function18);
                                    }
                                });
                                composerKN.XQ();
                                composerKN.Xw();
                            } else {
                                composerKN.eF(608635513);
                                Function0 function0Nr2 = nr(function1, composerKN, i5 & 14);
                                if (!(composerKN.getApplier() instanceof UiApplier)) {
                                    ComposablesKt.t();
                                }
                                composerKN.qie();
                                if (composerKN.getInserting()) {
                                    composerKN.s7N(function0Nr2);
                                } else {
                                    composerKN.r();
                                }
                                Composer composerN2 = Updater.n(composerKN);
                                Uo(composerN2, modifierO, iN, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, compositionLocalMapIk);
                                Updater.O(composerN2, function17, new Function2<LayoutNode, Function1<View, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Function1<View, ? extends Unit> function18) {
                                        n(layoutNode, function18);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(LayoutNode layoutNode, Function1 function18) {
                                        AndroidView_androidKt.J2(layoutNode).setUpdateBlock(function18);
                                    }
                                });
                                Updater.O(composerN2, function16, new Function2<LayoutNode, Function1<View, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Function1<View, ? extends Unit> function18) {
                                        n(layoutNode, function18);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(LayoutNode layoutNode, Function1 function18) {
                                        AndroidView_androidKt.J2(layoutNode).setReleaseBlock(function18);
                                    }
                                });
                                composerKN.XQ();
                                composerKN.Xw();
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        } else {
                            composerKN.wTp();
                            modifier3 = modifier2;
                        }
                        final Function1 function18 = function15;
                        final Function1 function19 = function17;
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            final Modifier modifier4 = modifier3;
                            final Function1 function110 = function16;
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
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
                                    AndroidView_androidKt.rl(function1, modifier4, function18, function110, function19, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    function17 = function14;
                    if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
                    }
                    final Function1 function182 = function15;
                    final Function1 function192 = function17;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function16 = function13;
                i9 = i3 & 16;
                if (i9 != 0) {
                }
                function17 = function14;
                if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
                }
                final Function1 function1822 = function15;
                final Function1 function1922 = function17;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function15 = function12;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function16 = function13;
            i9 = i3 & 16;
            if (i9 != 0) {
            }
            function17 = function14;
            if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
            }
            final Function1 function18222 = function15;
            final Function1 function19222 = function17;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function15 = function12;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function16 = function13;
        i9 = i3 & 16;
        if (i9 != 0) {
        }
        function17 = function14;
        if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
        }
        final Function1 function182222 = function15;
        final Function1 function192222 = function17;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewFactoryHolder J2(LayoutNode layoutNode) {
        AndroidViewHolder interopViewFactoryHolder = layoutNode.getInteropViewFactoryHolder();
        if (interopViewFactoryHolder != null) {
            return (ViewFactoryHolder) interopViewFactoryHolder;
        }
        InlineClassHelperKt.nr("Required value was null.");
        throw new KotlinNothingValueException();
    }

    private static final Function0 nr(final Function1 function1, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(2030558801, i2, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)");
        }
        boolean z2 = false;
        final int iN = ComposablesKt.n(composer, 0);
        final Context context = (Context) composer.ty(AndroidCompositionLocals_androidKt.Uo());
        final CompositionContext compositionContextNr = ComposablesKt.nr(composer, 0);
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.ty(SaveableStateRegistryKt.O());
        final View view = (View) composer.ty(AndroidCompositionLocals_androidKt.gh());
        boolean zE2 = composer.E2(context);
        if ((((i2 & 14) ^ 6) > 4 && composer.p5(function1)) || (i2 & 6) == 4) {
            z2 = true;
        }
        boolean zE22 = zE2 | z2 | composer.E2(compositionContextNr) | composer.E2(saveableStateRegistry) | composer.t(iN) | composer.E2(view);
        Object objIF = composer.iF();
        if (zE22 || objIF == Composer.INSTANCE.n()) {
            Object obj = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final LayoutNode invoke() {
                    Context context2 = context;
                    Function1 function12 = function1;
                    CompositionContext compositionContext = compositionContextNr;
                    SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                    int i3 = iN;
                    KeyEvent.Callback callback = view;
                    Intrinsics.checkNotNull(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
                    return new ViewFactoryHolder(context2, function12, compositionContext, saveableStateRegistry2, i3, (Owner) callback).getLayoutNode();
                }
            };
            composer.o(obj);
            objIF = obj;
        }
        Function0 function0 = (Function0) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return function0;
    }
}
