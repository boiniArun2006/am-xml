package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a]\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aa\u0010\u0013\u001a\u00020\f*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aa\u0010\u0016\u001a\u00020\f*\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001ac\u0010\u001a\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001ag\u0010\u001c\u001a\u00020\f*\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001ag\u0010\u001e\u001a\u00020\f*\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001ao\u0010\"\u001a\u00020\f\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\"\u0010#\u001am\u0010%\u001a\u00020\f\"\u0004\b\u0000\u0010 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b%\u0010&\u001a\u0093\u0001\u0010,\u001a\u00020\f\"\u0004\b\u0000\u0010 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00000'2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b,\u0010-\u001a;\u0010/\u001a\u00020(\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010.\u001a\u00028\u0000H\u0003¢\u0006\u0004\b/\u00100\"\u001e\u00103\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020(0!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00066²\u0006$\u00104\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00000'\"\u0004\b\u0000\u0010 8\nX\u008a\u0084\u0002²\u0006\u0012\u00105\u001a\u00020\u0000\"\u0004\b\u0000\u0010 8\nX\u008a\u0084\u0002"}, d2 = {"", "visible", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", "exit", "", "label", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "mUb", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "xMQ", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "Uo", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/MutableTransitionState;", "visibleState", "nr", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "KN", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "J2", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/Transition;", "O", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "transition", "gh", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", "Landroidx/compose/animation/EnterExitState;", "shouldDisposeBlock", "Landroidx/compose/animation/OnLookaheadMeasured;", "onLookaheadMeasured", c.f62177j, "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/OnLookaheadMeasured;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "targetState", "HI", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "ty", "(Landroidx/compose/animation/core/Transition;)Z", "exitFinished", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,865:1\n1247#2,6:866\n1247#2,6:874\n1247#2,6:883\n1247#2,6:889\n1247#2,6:895\n1247#2,6:901\n1247#2,6:937\n1761#3,2:872\n1763#3,3:880\n79#4,6:907\n86#4,3:922\n89#4,2:931\n93#4:936\n347#5,9:913\n356#5,3:933\n4206#6,6:925\n85#7:943\n85#7:944\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n*L\n683#1:866,6\n727#1:874,6\n737#1:883,6\n753#1:889,6\n762#1:895,6\n773#1:901,6\n849#1:937,6\n727#1:872,2\n727#1:880,3\n754#1:907,6\n754#1:922,3\n754#1:931,2\n754#1:936\n754#1:913,9\n754#1:933,3\n754#1:925,6\n731#1:943\n734#1:944\n*E\n"})
public final class AnimatedVisibilityKt {
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final ColumnScope columnScope, final MutableTransitionState mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        EnterTransition enterTransitionT;
        int i8;
        ExitTransition exitTransition2;
        int i9;
        Function3 function32;
        final Modifier modifier3;
        final EnterTransition enterTransition2;
        final ExitTransition exitTransition3;
        final String str2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-850656618);
        if ((i3 & 1) != 0) {
            i5 = i2 | 48;
        } else if ((i2 & 48) == 0) {
            i5 = ((i2 & 64) == 0 ? composerKN.p5(mutableTransitionState) : composerKN.E2(mutableTransitionState) ? 32 : 16) | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    enterTransitionT = enterTransition;
                    i5 |= composerKN.p5(enterTransitionT) ? 2048 : 1024;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        exitTransition2 = exitTransition;
                        i5 |= composerKN.p5(exitTransition2) ? 16384 : 8192;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            i5 |= composerKN.p5(str) ? 131072 : 65536;
                        }
                        if ((i3 & 32) != 0) {
                            i5 |= 1572864;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerKN.E2(function32) ? 1048576 : 524288;
                            }
                        }
                        if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
                            Modifier modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i7 != 0) {
                                enterTransitionT = EnterExitTransitionKt.az(null, null, false, null, 15, null).t(EnterExitTransitionKt.HI(null, 0.0f, 3, null));
                            }
                            ExitTransition exitTransitionT = i8 != 0 ? EnterExitTransitionKt.ViF(null, null, false, null, 15, null).t(EnterExitTransitionKt.Ik(null, 0.0f, 3, null)) : exitTransition2;
                            String str3 = i9 != 0 ? "AnimatedVisibility" : str;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-850656618, i5, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                            }
                            int i11 = i5 >> 3;
                            EnterTransition enterTransition3 = enterTransitionT;
                            gh(androidx.compose.animation.core.TransitionKt.KN(mutableTransitionState, str3, composerKN, MutableTransitionState.nr | (i11 & 14) | ((i5 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return n(bool.booleanValue());
                                }

                                public final Boolean n(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }
                            }, modifier4, enterTransition3, exitTransitionT, function32, composerKN, (i5 & 896) | 48 | (i5 & 7168) | (i5 & 57344) | (458752 & i11));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            str2 = str3;
                            modifier3 = modifier4;
                            enterTransition2 = enterTransition3;
                            exitTransition3 = exitTransitionT;
                        } else {
                            composerKN.wTp();
                            modifier3 = modifier2;
                            enterTransition2 = enterTransitionT;
                            exitTransition3 = exitTransition2;
                            str2 = str;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
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
                                    AnimatedVisibilityKt.J2(columnScope, mutableTransitionState, modifier3, enterTransition2, exitTransition3, str2, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    if ((i3 & 32) != 0) {
                    }
                    if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i9 = i3 & 16;
                if (i9 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            enterTransitionT = enterTransition;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            exitTransition2 = exitTransition;
            i9 = i3 & 16;
            if (i9 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        enterTransitionT = enterTransition;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        exitTransition2 = exitTransition;
        i9 = i3 & 16;
        if (i9 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final RowScope rowScope, final MutableTransitionState mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        EnterTransition enterTransitionT;
        int i8;
        ExitTransition exitTransition2;
        int i9;
        Function3 function32;
        final Modifier modifier3;
        final EnterTransition enterTransition2;
        final ExitTransition exitTransition3;
        final String str2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(836509870);
        if ((i3 & 1) != 0) {
            i5 = i2 | 48;
        } else if ((i2 & 48) == 0) {
            i5 = ((i2 & 64) == 0 ? composerKN.p5(mutableTransitionState) : composerKN.E2(mutableTransitionState) ? 32 : 16) | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    enterTransitionT = enterTransition;
                    i5 |= composerKN.p5(enterTransitionT) ? 2048 : 1024;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        exitTransition2 = exitTransition;
                        i5 |= composerKN.p5(exitTransition2) ? 16384 : 8192;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            i5 |= composerKN.p5(str) ? 131072 : 65536;
                        }
                        if ((i3 & 32) != 0) {
                            i5 |= 1572864;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerKN.E2(function32) ? 1048576 : 524288;
                            }
                        }
                        if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
                            Modifier modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i7 != 0) {
                                enterTransitionT = EnterExitTransitionKt.xMQ(null, null, false, null, 15, null).t(EnterExitTransitionKt.HI(null, 0.0f, 3, null));
                            }
                            ExitTransition exitTransitionT = i8 != 0 ? EnterExitTransitionKt.XQ(null, null, false, null, 15, null).t(EnterExitTransitionKt.Ik(null, 0.0f, 3, null)) : exitTransition2;
                            String str3 = i9 != 0 ? "AnimatedVisibility" : str;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(836509870, i5, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                            }
                            int i11 = i5 >> 3;
                            EnterTransition enterTransition3 = enterTransitionT;
                            gh(androidx.compose.animation.core.TransitionKt.KN(mutableTransitionState, str3, composerKN, MutableTransitionState.nr | (i11 & 14) | ((i5 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return n(bool.booleanValue());
                                }

                                public final Boolean n(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }
                            }, modifier4, enterTransition3, exitTransitionT, function32, composerKN, (i5 & 896) | 48 | (i5 & 7168) | (i5 & 57344) | (458752 & i11));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            str2 = str3;
                            modifier3 = modifier4;
                            enterTransition2 = enterTransition3;
                            exitTransition3 = exitTransitionT;
                        } else {
                            composerKN.wTp();
                            modifier3 = modifier2;
                            enterTransition2 = enterTransitionT;
                            exitTransition3 = exitTransition2;
                            str2 = str;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
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
                                    AnimatedVisibilityKt.KN(rowScope, mutableTransitionState, modifier3, enterTransition2, exitTransition3, str2, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    if ((i3 & 32) != 0) {
                    }
                    if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i9 = i3 & 16;
                if (i9 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            enterTransitionT = enterTransition;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            exitTransition2 = exitTransition;
            i9 = i3 & 16;
            if (i9 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        enterTransitionT = enterTransition;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        exitTransition2 = exitTransition;
        i9 = i3 & 16;
        if (i9 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final Transition transition, final Function1 function1, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, final Function3 function3, Composer composer, final int i2, final int i3) {
        Transition transition2;
        int i5;
        Function1 function12;
        final Modifier modifier2;
        int i7;
        EnterTransition enterTransition2;
        int i8;
        Function3 function32;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1031950689);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i5 = i2 | 6;
            transition2 = transition;
        } else {
            transition2 = transition;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.p5(transition2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 1) != 0) {
            i5 |= 48;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function12) ? 32 : 16;
            }
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    enterTransition2 = enterTransition;
                    i5 |= composerKN.p5(enterTransition2) ? 2048 : 1024;
                }
                i8 = i3 & 8;
                if (i8 == 0) {
                    if ((i2 & 24576) == 0) {
                        i5 |= composerKN.p5(exitTransition) ? 16384 : 8192;
                    }
                    if ((i3 & 16) == 0) {
                        i5 |= 196608;
                        function32 = function3;
                    } else {
                        function32 = function3;
                        if ((i2 & 196608) == 0) {
                            i5 |= composerKN.E2(function32) ? 131072 : 65536;
                        }
                    }
                    if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                        composerKN.wTp();
                        enterTransition3 = enterTransition2;
                        exitTransition2 = exitTransition;
                    } else {
                        Modifier modifier3 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                        EnterTransition enterTransitionT = i7 != 0 ? EnterExitTransitionKt.HI(null, 0.0f, 3, null).t(EnterExitTransitionKt.gh(null, null, false, null, 15, null)) : enterTransition2;
                        ExitTransition exitTransitionT = i8 != 0 ? EnterExitTransitionKt.WPU(null, null, false, null, 15, null).t(EnterExitTransitionKt.Ik(null, 0.0f, 3, null)) : exitTransition;
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1031950689, i5, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)");
                        }
                        EnterTransition enterTransition4 = enterTransitionT;
                        gh(transition2, function12, modifier3, enterTransition4, exitTransitionT, function32, composerKN, i5 & 524286);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier2 = modifier3;
                        enterTransition3 = enterTransition4;
                        exitTransition2 = exitTransitionT;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
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
                                AnimatedVisibilityKt.O(transition, function1, modifier2, enterTransition3, exitTransition2, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                if ((i3 & 16) == 0) {
                }
                if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            enterTransition2 = enterTransition;
            i8 = i3 & 8;
            if (i8 == 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        enterTransition2 = enterTransition;
        i8 = i3 & 8;
        if (i8 == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(final ColumnScope columnScope, boolean z2, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3 function3, Composer composer, final int i2, final int i3) {
        final boolean z3;
        int i5;
        Modifier modifier2;
        int i7;
        EnterTransition enterTransitionT;
        int i8;
        ExitTransition exitTransition2;
        int i9;
        Function3 function32;
        final Modifier modifier3;
        final EnterTransition enterTransition2;
        final ExitTransition exitTransition3;
        final String str2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1766503102);
        if ((i3 & 1) != 0) {
            i5 = i2 | 48;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i2 & 48) == 0) {
                i5 = (composerKN.n(z3) ? 32 : 16) | i2;
            } else {
                i5 = i2;
            }
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    enterTransitionT = enterTransition;
                    i5 |= composerKN.p5(enterTransitionT) ? 2048 : 1024;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        exitTransition2 = exitTransition;
                        i5 |= composerKN.p5(exitTransition2) ? 16384 : 8192;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            i5 |= composerKN.p5(str) ? 131072 : 65536;
                        }
                        if ((i3 & 32) != 0) {
                            i5 |= 1572864;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerKN.E2(function32) ? 1048576 : 524288;
                            }
                        }
                        if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
                            Modifier modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i7 != 0) {
                                enterTransitionT = EnterExitTransitionKt.HI(null, 0.0f, 3, null).t(EnterExitTransitionKt.az(null, null, false, null, 15, null));
                            }
                            ExitTransition exitTransitionT = i8 != 0 ? EnterExitTransitionKt.Ik(null, 0.0f, 3, null).t(EnterExitTransitionKt.ViF(null, null, false, null, 15, null)) : exitTransition2;
                            String str3 = i9 != 0 ? "AnimatedVisibility" : str;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1766503102, i5, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                            }
                            int i11 = i5 >> 3;
                            EnterTransition enterTransition3 = enterTransitionT;
                            gh(androidx.compose.animation.core.TransitionKt.mUb(Boolean.valueOf(z3), str3, composerKN, (i11 & 14) | ((i5 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return n(bool.booleanValue());
                                }

                                public final Boolean n(boolean z4) {
                                    return Boolean.valueOf(z4);
                                }
                            }, modifier4, enterTransition3, exitTransitionT, function32, composerKN, (i5 & 896) | 48 | (i5 & 7168) | (i5 & 57344) | (458752 & i11));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            str2 = str3;
                            modifier3 = modifier4;
                            enterTransition2 = enterTransition3;
                            exitTransition3 = exitTransitionT;
                        } else {
                            composerKN.wTp();
                            modifier3 = modifier2;
                            enterTransition2 = enterTransitionT;
                            exitTransition3 = exitTransition2;
                            str2 = str;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
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
                                    AnimatedVisibilityKt.Uo(columnScope, z3, modifier3, enterTransition2, exitTransition3, str2, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    if ((i3 & 32) != 0) {
                    }
                    if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i9 = i3 & 16;
                if (i9 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            enterTransitionT = enterTransition;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            exitTransition2 = exitTransition;
            i9 = i3 & 16;
            if (i9 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        enterTransitionT = enterTransition;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        exitTransition2 = exitTransition;
        i9 = i3 & 16;
        if (i9 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final void gh(final Transition transition, final Function1 function1, final Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final Function3 function3, Composer composer, final int i2) {
        int i3;
        ExitTransition exitTransition2;
        Composer composerKN = composer.KN(429978603);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(transition) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function1) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.p5(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(enterTransition) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            exitTransition2 = exitTransition;
            i3 |= composerKN.p5(exitTransition2) ? 16384 : 8192;
        } else {
            exitTransition2 = exitTransition;
        }
        if ((i2 & 196608) == 0) {
            i3 |= composerKN.E2(function3) ? 131072 : 65536;
        }
        if (composerKN.HI((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(429978603, i3, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:677)");
            }
            int i5 = i3 & 112;
            int i7 = i3 & 14;
            boolean z2 = (i5 == 32) | (i7 == 4);
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return n(measureScope, measurable, constraints.getValue());
                    }

                    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j2) {
                        long jT2;
                        final Placeable placeableDR0 = measurable.dR0(j2);
                        if (measureScope.Org() && !((Boolean) function1.invoke(transition.Ik())).booleanValue()) {
                            jT2 = IntSize.INSTANCE.n();
                        } else {
                            jT2 = IntSize.t((((long) placeableDR0.getWidth()) << 32) | (((long) placeableDR0.getHeight()) & 4294967295L));
                        }
                        return MeasureScope.ER(measureScope, (int) (jT2 >> 32), (int) (jT2 & 4294967295L), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                n(placementScope);
                                return Unit.INSTANCE;
                            }

                            public final void n(Placeable.PlacementScope placementScope) {
                                Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                composerKN.o(objIF);
            }
            n(transition, function1, LayoutModifierKt.n(modifier, (Function3) objIF), enterTransition, exitTransition2, new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$2
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                    return Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == EnterExitState.f15174O);
                }
            }, null, function3, composerKN, i5 | i7 | 196608 | (i3 & 7168) | (57344 & i3) | ((i3 << 6) & 29360128), 64);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
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
                    AnimatedVisibilityKt.gh(transition, function1, modifier, enterTransition, exitTransition, function3, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void mUb(boolean z2, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3 function3, Composer composer, final int i2, final int i3) {
        final boolean z3;
        int i5;
        Modifier modifier2;
        int i7;
        EnterTransition enterTransition2;
        int i8;
        ExitTransition exitTransition2;
        int i9;
        Function3 function32;
        final String str2;
        final Modifier modifier3;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i10;
        Modifier modifier4;
        Composer composerKN = composer.KN(2088733774);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z3 = z2;
        } else if ((i2 & 6) == 0) {
            z3 = z2;
            i5 = (composerKN.n(z3) ? 4 : 2) | i2;
        } else {
            z3 = z2;
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
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    enterTransition2 = enterTransition;
                    i5 |= composerKN.p5(enterTransition2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        exitTransition2 = exitTransition;
                        i5 |= composerKN.p5(exitTransition2) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            i5 |= composerKN.p5(str) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i5 |= 196608;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i2 & 196608) == 0) {
                                i5 |= composerKN.E2(function32) ? 131072 : 65536;
                            }
                        }
                        if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                            if (i11 != 0) {
                                modifier4 = Modifier.INSTANCE;
                                i10 = i9;
                            } else {
                                i10 = i9;
                                modifier4 = modifier2;
                            }
                            EnterTransition enterTransitionT = i7 != 0 ? EnterExitTransitionKt.HI(null, 0.0f, 3, null).t(EnterExitTransitionKt.gh(null, null, false, null, 15, null)) : enterTransition2;
                            ExitTransition exitTransitionT = i8 != 0 ? EnterExitTransitionKt.WPU(null, null, false, null, 15, null).t(EnterExitTransitionKt.Ik(null, 0.0f, 3, null)) : exitTransition2;
                            String str3 = i10 != 0 ? "AnimatedVisibility" : str;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(2088733774, i5, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                            }
                            int i12 = i5 << 3;
                            gh(androidx.compose.animation.core.TransitionKt.mUb(Boolean.valueOf(z3), str3, composerKN, (i5 & 14) | ((i5 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return n(bool.booleanValue());
                                }

                                public final Boolean n(boolean z4) {
                                    return Boolean.valueOf(z4);
                                }
                            }, modifier4, enterTransitionT, exitTransitionT, function32, composerKN, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i5 & 458752));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            str2 = str3;
                            modifier3 = modifier4;
                            enterTransition3 = enterTransitionT;
                            exitTransition3 = exitTransitionT;
                        } else {
                            composerKN.wTp();
                            str2 = str;
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i13) {
                                    AnimatedVisibilityKt.mUb(z3, modifier3, enterTransition3, exitTransition3, str2, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    if ((i3 & 32) != 0) {
                    }
                    if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i9 = i3 & 16;
                if (i9 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            enterTransition2 = enterTransition;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            exitTransition2 = exitTransition;
            i9 = i3 & 16;
            if (i9 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        enterTransition2 = enterTransition;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        exitTransition2 = exitTransition;
        i9 = i3 & 16;
        if (i9 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final void n(final Transition transition, final Function1 function1, final Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final Function2 function2, OnLookaheadMeasured onLookaheadMeasured, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        ExitTransition exitTransition2;
        final OnLookaheadMeasured onLookaheadMeasured2;
        EnterExitState enterExitState;
        int i7;
        Modifier modifierN;
        OnLookaheadMeasured onLookaheadMeasured3 = onLookaheadMeasured;
        Composer composerKN = composer.KN(-891967166);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(transition) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function1) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(modifier) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.p5(enterTransition) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i5 |= 24576;
            exitTransition2 = exitTransition;
        } else {
            exitTransition2 = exitTransition;
            if ((i2 & 24576) == 0) {
                i5 |= composerKN.p5(exitTransition2) ? 16384 : 8192;
            }
        }
        if ((i3 & 32) != 0) {
            i5 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i5 |= composerKN.E2(function2) ? 131072 : 65536;
        }
        int i8 = i3 & 64;
        int i9 = 1572864;
        if (i8 != 0) {
            i5 |= i9;
        } else if ((i2 & 1572864) == 0) {
            i9 = (i2 & 2097152) == 0 ? composerKN.p5(onLookaheadMeasured3) : composerKN.E2(onLookaheadMeasured3) ? 1048576 : 524288;
            i5 |= i9;
        }
        if ((i3 & 128) != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i5 |= composerKN.E2(function3) ? 8388608 : 4194304;
        }
        int i10 = i5;
        int i11 = 1;
        if (composerKN.HI((4793491 & i10) != 4793490, i10 & 1)) {
            if (i8 != 0) {
                onLookaheadMeasured3 = null;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-891967166, i10, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:718)");
            }
            if (((Boolean) function1.invoke(transition.Ik())).booleanValue() || ((Boolean) function1.invoke(transition.xMQ())).booleanValue() || transition.WPU() || transition.mUb()) {
                composerKN.eF(1788522886);
                int i12 = i10 & 14;
                int i13 = i12 | 48;
                int i14 = i13 & 14;
                OnLookaheadMeasured onLookaheadMeasured4 = onLookaheadMeasured3;
                boolean z2 = ((i14 ^ 6) > 4 && composerKN.p5(transition)) || (i13 & 6) == 4;
                Object objIF = composerKN.iF();
                if (z2 || objIF == Composer.INSTANCE.n()) {
                    objIF = transition.xMQ();
                    composerKN.o(objIF);
                }
                if (transition.WPU()) {
                    objIF = transition.xMQ();
                }
                composerKN.eF(-466616829);
                if (ComposerKt.v()) {
                    ComposerKt.p5(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:727)");
                }
                int i15 = i10 & 126;
                EnterExitState enterExitStateHI = HI(transition, function1, objIF, composerKN, i15);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composerKN.Xw();
                Object objIk = transition.Ik();
                composerKN.eF(-466616829);
                if (ComposerKt.v()) {
                    enterExitState = enterExitStateHI;
                    i7 = 0;
                    ComposerKt.p5(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:727)");
                } else {
                    enterExitState = enterExitStateHI;
                    i7 = 0;
                }
                EnterExitState enterExitStateHI2 = HI(transition, function1, objIk, composerKN, i15);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composerKN.Xw();
                int i16 = i7;
                onLookaheadMeasured2 = onLookaheadMeasured4;
                Transition transitionNr = androidx.compose.animation.core.TransitionKt.nr(transition, enterExitState, enterExitStateHI2, "EnterExitTransition", composerKN, i14 | 3072);
                State stateCk = SnapshotStateKt.ck(function2, composerKN, (i10 >> 15) & 14);
                Object objInvoke = function2.invoke(transitionNr.xMQ(), transitionNr.Ik());
                boolean zP5 = composerKN.p5(transitionNr) | composerKN.p5(stateCk);
                Object objIF2 = composerKN.iF();
                if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(transitionNr, stateCk, null);
                    composerKN.o(objIF2);
                }
                State stateAz = SnapshotStateKt.az(objInvoke, (Function2) objIF2, composerKN, i16);
                if (ty(transitionNr) && t(stateAz)) {
                    composerKN.eF(1790688794);
                    composerKN.Xw();
                } else {
                    composerKN.eF(1789551931);
                    int i17 = i12 == 4 ? 1 : i16;
                    Object objIF3 = composerKN.iF();
                    if (i17 != 0 || objIF3 == Composer.INSTANCE.n()) {
                        objIF3 = new AnimatedVisibilityScopeImpl(transitionNr);
                        composerKN.o(objIF3);
                    }
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) objIF3;
                    int i18 = i10 >> 6;
                    Modifier modifierUo = EnterExitTransitionKt.Uo(transitionNr, enterTransition, exitTransition2, null, "Built-in", composerKN, (i18 & 112) | 24576 | (i18 & 896), 4);
                    if (onLookaheadMeasured2 != null) {
                        composerKN.eF(1789971299);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        if ((3670016 & i10) != 1048576 && ((i10 & 2097152) == 0 || !composerKN.E2(onLookaheadMeasured2))) {
                            i11 = i16;
                        }
                        Object objIF4 = composerKN.iF();
                        if (i11 != 0 || objIF4 == Composer.INSTANCE.n()) {
                            objIF4 = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                    return n(measureScope, measurable, constraints.getValue());
                                }

                                public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j2) {
                                    final Placeable placeableDR0 = measurable.dR0(j2);
                                    OnLookaheadMeasured onLookaheadMeasured5 = onLookaheadMeasured2;
                                    if (measureScope.Org()) {
                                        onLookaheadMeasured5.n(IntSize.t((((long) placeableDR0.getWidth()) << 32) | (((long) placeableDR0.getHeight()) & 4294967295L)));
                                    }
                                    return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            n(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Placeable.PlacementScope placementScope) {
                                            Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                            };
                            composerKN.o(objIF4);
                        }
                        modifierN = LayoutModifierKt.n(companion, (Function3) objIF4);
                        composerKN.Xw();
                    } else {
                        composerKN.eF(1581779440);
                        composerKN.Xw();
                        modifierN = Modifier.INSTANCE;
                    }
                    Modifier modifierZmq = modifier.Zmq(modifierUo.Zmq(modifierN));
                    Object objIF5 = composerKN.iF();
                    if (objIF5 == Composer.INSTANCE.n()) {
                        objIF5 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                        composerKN.o(objIF5);
                    }
                    AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = (AnimatedEnterExitMeasurePolicy) objIF5;
                    int iN = ComposablesKt.n(composerKN, i16);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierZmq);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion2.n();
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
                    Updater.O(composerN, animatedEnterExitMeasurePolicy, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    Function2 function2Rl = companion2.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    function3.invoke(animatedVisibilityScopeImpl, composerKN, Integer.valueOf((i10 >> 18) & 112));
                    composerKN.XQ();
                    composerKN.Xw();
                }
                composerKN.Xw();
            } else {
                composerKN.eF(1790694746);
                composerKN.Xw();
                onLookaheadMeasured2 = onLookaheadMeasured3;
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
            onLookaheadMeasured2 = onLookaheadMeasured3;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final OnLookaheadMeasured onLookaheadMeasured5 = onLookaheadMeasured2;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i19) {
                    AnimatedVisibilityKt.n(transition, function1, modifier, enterTransition, exitTransition, function2, onLookaheadMeasured5, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final MutableTransitionState mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        EnterTransition enterTransition2;
        int i8;
        ExitTransition exitTransition2;
        int i9;
        Function3 function32;
        final String str2;
        final Modifier modifier3;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i10;
        Modifier modifier4;
        Composer composerKN = composer.KN(-222898426);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerKN.p5(mutableTransitionState) : composerKN.E2(mutableTransitionState) ? 4 : 2) | i2;
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
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    enterTransition2 = enterTransition;
                    i5 |= composerKN.p5(enterTransition2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        exitTransition2 = exitTransition;
                        i5 |= composerKN.p5(exitTransition2) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            i5 |= composerKN.p5(str) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i5 |= 196608;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i2 & 196608) == 0) {
                                i5 |= composerKN.E2(function32) ? 131072 : 65536;
                            }
                        }
                        if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                            if (i11 != 0) {
                                modifier4 = Modifier.INSTANCE;
                                i10 = i9;
                            } else {
                                i10 = i9;
                                modifier4 = modifier2;
                            }
                            EnterTransition enterTransitionT = i7 != 0 ? EnterExitTransitionKt.HI(null, 0.0f, 3, null).t(EnterExitTransitionKt.gh(null, null, false, null, 15, null)) : enterTransition2;
                            ExitTransition exitTransitionT = i8 != 0 ? EnterExitTransitionKt.Ik(null, 0.0f, 3, null).t(EnterExitTransitionKt.WPU(null, null, false, null, 15, null)) : exitTransition2;
                            String str3 = i10 != 0 ? "AnimatedVisibility" : str;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-222898426, i5, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                            }
                            int i12 = i5 << 3;
                            gh(androidx.compose.animation.core.TransitionKt.KN(mutableTransitionState, str3, composerKN, MutableTransitionState.nr | (i5 & 14) | ((i5 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return n(bool.booleanValue());
                                }

                                public final Boolean n(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }
                            }, modifier4, enterTransitionT, exitTransitionT, function32, composerKN, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i5 & 458752));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            str2 = str3;
                            modifier3 = modifier4;
                            enterTransition3 = enterTransitionT;
                            exitTransition3 = exitTransitionT;
                        } else {
                            composerKN.wTp();
                            str2 = str;
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i13) {
                                    AnimatedVisibilityKt.nr(mutableTransitionState, modifier3, enterTransition3, exitTransition3, str2, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    if ((i3 & 32) != 0) {
                    }
                    if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i9 = i3 & 16;
                if (i9 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            enterTransition2 = enterTransition;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            exitTransition2 = exitTransition;
            i9 = i3 & 16;
            if (i9 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        enterTransition2 = enterTransition;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        exitTransition2 = exitTransition;
        i9 = i3 & 16;
        if (i9 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void xMQ(final RowScope rowScope, boolean z2, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3 function3, Composer composer, final int i2, final int i3) {
        final boolean z3;
        int i5;
        Modifier modifier2;
        int i7;
        EnterTransition enterTransitionT;
        int i8;
        ExitTransition exitTransition2;
        int i9;
        Function3 function32;
        final Modifier modifier3;
        final EnterTransition enterTransition2;
        final ExitTransition exitTransition3;
        final String str2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1741346906);
        if ((i3 & 1) != 0) {
            i5 = i2 | 48;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i2 & 48) == 0) {
                i5 = (composerKN.n(z3) ? 32 : 16) | i2;
            } else {
                i5 = i2;
            }
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    enterTransitionT = enterTransition;
                    i5 |= composerKN.p5(enterTransitionT) ? 2048 : 1024;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        exitTransition2 = exitTransition;
                        i5 |= composerKN.p5(exitTransition2) ? 16384 : 8192;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            i5 |= composerKN.p5(str) ? 131072 : 65536;
                        }
                        if ((i3 & 32) != 0) {
                            i5 |= 1572864;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerKN.E2(function32) ? 1048576 : 524288;
                            }
                        }
                        if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
                            Modifier modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i7 != 0) {
                                enterTransitionT = EnterExitTransitionKt.HI(null, 0.0f, 3, null).t(EnterExitTransitionKt.xMQ(null, null, false, null, 15, null));
                            }
                            ExitTransition exitTransitionT = i8 != 0 ? EnterExitTransitionKt.Ik(null, 0.0f, 3, null).t(EnterExitTransitionKt.XQ(null, null, false, null, 15, null)) : exitTransition2;
                            String str3 = i9 != 0 ? "AnimatedVisibility" : str;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1741346906, i5, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                            }
                            int i11 = i5 >> 3;
                            EnterTransition enterTransition3 = enterTransitionT;
                            gh(androidx.compose.animation.core.TransitionKt.mUb(Boolean.valueOf(z3), str3, composerKN, (i11 & 14) | ((i5 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return n(bool.booleanValue());
                                }

                                public final Boolean n(boolean z4) {
                                    return Boolean.valueOf(z4);
                                }
                            }, modifier4, enterTransition3, exitTransitionT, function32, composerKN, (i5 & 896) | 48 | (i5 & 7168) | (i5 & 57344) | (458752 & i11));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            str2 = str3;
                            modifier3 = modifier4;
                            enterTransition2 = enterTransition3;
                            exitTransition3 = exitTransitionT;
                        } else {
                            composerKN.wTp();
                            modifier3 = modifier2;
                            enterTransition2 = enterTransitionT;
                            exitTransition3 = exitTransition2;
                            str2 = str;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
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
                                    AnimatedVisibilityKt.xMQ(rowScope, z3, modifier3, enterTransition2, exitTransition3, str2, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    if ((i3 & 32) != 0) {
                    }
                    if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i9 = i3 & 16;
                if (i9 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            enterTransitionT = enterTransition;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            exitTransition2 = exitTransition;
            i9 = i3 & 16;
            if (i9 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        enterTransitionT = enterTransition;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        exitTransition2 = exitTransition;
        i9 = i3 & 16;
        if (i9 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (composerKN.HI((599185 & i5) != 599184, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    private static final EnterExitState HI(Transition transition, Function1 function1, Object obj, Composer composer, int i2) {
        EnterExitState enterExitState;
        if (ComposerKt.v()) {
            ComposerKt.p5(361571134, i2, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:836)");
        }
        composer.X(-902032957, transition);
        if (transition.WPU()) {
            composer.eF(2101770115);
            composer.Xw();
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enterExitState = EnterExitState.f15177t;
            } else if (((Boolean) function1.invoke(transition.xMQ())).booleanValue()) {
                enterExitState = EnterExitState.f15174O;
            } else {
                enterExitState = EnterExitState.f15175n;
            }
        } else {
            composer.eF(2102044248);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composer.o(objIF);
            }
            MutableState mutableState = (MutableState) objIF;
            if (((Boolean) function1.invoke(transition.xMQ())).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enterExitState = EnterExitState.f15177t;
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = EnterExitState.f15174O;
            } else {
                enterExitState = EnterExitState.f15175n;
            }
            composer.Xw();
        }
        composer.P5();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return enterExitState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2 rl(State state) {
        return (Function2) state.getValue();
    }

    private static final boolean t(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ty(Transition transition) {
        Object objXMQ = transition.xMQ();
        EnterExitState enterExitState = EnterExitState.f15174O;
        if (objXMQ == enterExitState && transition.Ik() == enterExitState) {
            return true;
        }
        return false;
    }
}
