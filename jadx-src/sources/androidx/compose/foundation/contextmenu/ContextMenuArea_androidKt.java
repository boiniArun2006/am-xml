package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001au\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aH\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState;", "state", "Lkotlin/Function0;", "", "onDismiss", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "Lkotlin/ExtensionFunctionType;", "contextMenuBuilderBlock", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "onOpenGesture", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Landroidx/compose/foundation/contextmenu/ContextMenuState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", c.f62177j, "(Landroidx/compose/foundation/contextmenu/ContextMenuState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContextMenuArea.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuArea.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuArea_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,88:1\n1247#2,6:89\n1247#2,6:136\n70#3:95\n67#3,9:96\n77#3:135\n79#4,6:105\n86#4,3:120\n89#4,2:129\n93#4:134\n347#5,9:111\n356#5,3:131\n4206#6,6:123\n*S KotlinDebug\n*F\n+ 1 ContextMenuArea.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuArea_androidKt\n*L\n50#1:89,6\n79#1:136,6\n57#1:95\n57#1:96,9\n57#1:135\n57#1:105,6\n57#1:120,3\n57#1:129,2\n57#1:134\n57#1:111,9\n57#1:131,3\n57#1:123,6\n*E\n"})
public final class ContextMenuArea_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final ContextMenuState contextMenuState, final Function0 function0, final Function1 function1, Modifier modifier, boolean z2, Function0 function02, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        Function0 function03;
        Function1 function12;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z3;
        int i9;
        boolean z4;
        final Function0 function04;
        Composer composer2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifierT;
        Composer composerKN = composer.KN(1969259374);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(contextMenuState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function03 = function0;
                i5 |= composerKN.E2(function03) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    function12 = function1;
                    i5 |= composerKN.E2(function12) ? 256 : 128;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        modifier2 = modifier;
                        i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
                    }
                    i8 = i3 & 16;
                    if (i8 != 0) {
                        if ((i2 & 24576) == 0) {
                            z3 = z2;
                            i5 |= composerKN.n(z3) ? 16384 : 8192;
                        }
                        i9 = i3 & 32;
                        if (i9 != 0) {
                            i5 |= 196608;
                            z4 = true;
                            function04 = function02;
                        } else {
                            z4 = true;
                            function04 = function02;
                            if ((i2 & 196608) == 0) {
                                i5 |= composerKN.E2(function04) ? 131072 : 65536;
                            }
                        }
                        if ((i3 & 64) != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.E2(function2) ? 1048576 : 524288;
                        }
                        if (composerKN.HI((i5 & 599187) != 599186 ? z4 : false, i5 & 1)) {
                            modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i8 != 0) {
                                z3 = z4;
                            }
                            final Function0 function05 = i9 != 0 ? new Function0<Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }
                            } : function04;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1969259374, i5, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                            }
                            if (z3) {
                                composerKN.eF(1021907653);
                                boolean z5 = ((458752 & i5) == 131072 ? z4 : false) | ((i5 & 14) == 4 ? z4 : false);
                                Object objIF = composerKN.iF();
                                if (z5 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                            n(offset.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(long j2) {
                                            function05.invoke();
                                            contextMenuState.rl(new ContextMenuState.Status.Open(j2, null));
                                        }
                                    };
                                    composerKN.o(objIF);
                                }
                                modifierT = ContextMenuGestures_androidKt.t(modifier3, (Function1) objIF);
                                composerKN.Xw();
                            } else {
                                composerKN.eF(1022064513);
                                composerKN.Xw();
                                modifierT = modifier3;
                            }
                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), z4);
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
                            function2.invoke(composerKN, Integer.valueOf((i5 >> 18) & 14));
                            composer2 = composerKN;
                            n(contextMenuState, function03, null, function12, composer2, (i5 & 126) | ((i5 << 3) & 7168), 4);
                            composer2.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function04 = function05;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            modifier3 = modifier2;
                        }
                        final boolean z6 = z3;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            final Modifier modifier4 = modifier3;
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i10) {
                                    ContextMenuArea_androidKt.rl(contextMenuState, function0, function1, modifier4, z6, function04, function2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    z3 = z2;
                    i9 = i3 & 32;
                    if (i9 != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (composerKN.HI((i5 & 599187) != 599186 ? z4 : false, i5 & 1)) {
                    }
                    final boolean z62 = z3;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                modifier2 = modifier;
                i8 = i3 & 16;
                if (i8 != 0) {
                }
                z3 = z2;
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (composerKN.HI((i5 & 599187) != 599186 ? z4 : false, i5 & 1)) {
                }
                final boolean z622 = z3;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function12 = function1;
            i7 = i3 & 8;
            if (i7 != 0) {
            }
            modifier2 = modifier;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            z3 = z2;
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (composerKN.HI((i5 & 599187) != 599186 ? z4 : false, i5 & 1)) {
            }
            final boolean z6222 = z3;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function03 = function0;
        if ((i3 & 4) == 0) {
        }
        function12 = function1;
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        z3 = z2;
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (composerKN.HI((i5 & 599187) != 599186 ? z4 : false, i5 & 1)) {
        }
        final boolean z62222 = z3;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final void n(final ContextMenuState contextMenuState, final Function0 function0, Modifier modifier, final Function1 function1, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        Composer composer2;
        final Modifier modifier2;
        Composer composerKN = composer.KN(645832757);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.p5(contextMenuState)) {
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
            if (composerKN.E2(function0)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.p5(modifier)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (composerKN.E2(function1)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i5 |= i10;
        }
        if ((i5 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i5 & 1)) {
            if (i11 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (ComposerKt.v()) {
                ComposerKt.p5(645832757, i5, -1, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.android.kt:73)");
            }
            ContextMenuState.Status statusN = contextMenuState.n();
            if (!(statusN instanceof ContextMenuState.Status.Open)) {
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i12) {
                            ContextMenuArea_androidKt.n(contextMenuState, function0, modifier2, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            boolean zP5 = composerKN.p5(statusN);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new ContextMenuPopupPositionProvider(IntOffsetKt.nr(((ContextMenuState.Status.Open) statusN).getOffset()), null);
                composerKN.o(objIF);
            }
            composer2 = composerKN;
            ContextMenuUi_androidKt.nr((ContextMenuPopupPositionProvider) objIF, function0, modifier2, function1, composer2, i5 & 8176, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composer2 = composerKN;
            composer2.wTp();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeGh2 = composer2.gh();
        if (scopeUpdateScopeGh2 != null) {
            scopeUpdateScopeGh2.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i12) {
                    ContextMenuArea_androidKt.n(contextMenuState, function0, modifier2, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }
}
