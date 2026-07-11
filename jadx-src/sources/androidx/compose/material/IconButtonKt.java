package androidx.compose.material;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\u000b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a^\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "rl", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "F", "RippleRadius", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,127:1\n71#2:128\n69#2,5:129\n74#2:162\n78#2:167\n71#2:168\n69#2,5:169\n74#2:202\n78#2:207\n79#3,6:134\n86#3,4:149\n90#3,2:159\n94#3:166\n79#3,6:174\n86#3,4:189\n90#3,2:199\n94#3:206\n368#4,9:140\n377#4:161\n378#4,2:164\n368#4,9:180\n377#4:201\n378#4,2:204\n4034#5,6:153\n4034#5,6:193\n75#6:163\n75#6:203\n149#7:208\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n*L\n62#1:128\n62#1:129,5\n62#1:162\n62#1:167\n106#1:168\n106#1:169,5\n106#1:202\n106#1:207\n62#1:134,6\n62#1:149,4\n62#1:159,2\n62#1:166\n106#1:174,6\n106#1:189,4\n106#1:199,2\n106#1:206\n62#1:140,9\n62#1:161\n62#1:164,2\n106#1:180,9\n106#1:201\n106#1:204,2\n62#1:153,6\n106#1:193,6\n75#1:163\n120#1:203\n126#1:208\n*E\n"})
public final class IconButtonKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f22093n = Dp.KN(24);

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        int i9;
        final Modifier modifier3;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i10;
        boolean z5;
        float fRl;
        Composer composerKN = composer.KN(-111063634);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else if ((i2 & 6) == 0) {
            function02 = function0;
            i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
        } else {
            function02 = function0;
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
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 == 0) {
                    if ((i2 & 3072) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i5 |= composerKN.E2(function2) ? 16384 : 8192;
                    }
                    i9 = i5;
                    if (composerKN.HI((i9 & 9363) == 9362, i9 & 1)) {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        z4 = z3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        Modifier modifier4 = i11 != 0 ? Modifier.INSTANCE : modifier2;
                        if (i7 != 0) {
                            i10 = i8;
                            z5 = true;
                        } else {
                            i10 = i8;
                            z5 = z3;
                        }
                        MutableInteractionSource mutableInteractionSource4 = i10 != 0 ? null : mutableInteractionSource2;
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-111063634, i9, -1, "androidx.compose.material.IconButton (IconButton.kt:60)");
                        }
                        Modifier modifierNr = ClickableKt.nr(InteractiveComponentSizeKt.t(modifier4), mutableInteractionSource4, RippleKt.J2(false, f22093n, 0L, 4, null), z5, null, Role.mUb(Role.INSTANCE.n()), function02, 8, null);
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                        int iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
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
                        if (z5) {
                            composerKN.eF(1885393015);
                            fRl = ((Number) composerKN.ty(ContentAlphaKt.n())).floatValue();
                        } else {
                            composerKN.eF(1885393848);
                            fRl = ContentAlpha.f21745n.rl(composerKN, 6);
                        }
                        composerKN.Xw();
                        CompositionLocalKt.rl(ContentAlphaKt.n().nr(Float.valueOf(fRl)), function2, composerKN, ((i9 >> 9) & 112) | ProvidedValue.xMQ);
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                        z4 = z5;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.IconButtonKt$IconButton$2
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
                                IconButtonKt.n(function0, modifier3, z4, mutableInteractionSource3, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 3072;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 16) == 0) {
                }
                i9 = i5;
                if (composerKN.HI((i9 & 9363) == 9362, i9 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            i8 = i3 & 8;
            if (i8 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 16) == 0) {
            }
            i9 = i5;
            if (composerKN.HI((i9 & 9363) == 9362, i9 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        i8 = i3 & 8;
        if (i8 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 16) == 0) {
        }
        i9 = i5;
        if (composerKN.HI((i9 & 9363) == 9362, i9 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final boolean z2, final Function1 function1, Modifier modifier, boolean z3, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        boolean z4;
        int i5;
        Function1 function12;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeGh;
        float fRl;
        Composer composerKN = composer.KN(-54657793);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z4) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function12 = function1;
                i5 |= composerKN.E2(function12) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z5 = z3;
                        i5 |= composerKN.n(z5) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            i5 |= composerKN.p5(mutableInteractionSource) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i5 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i5 |= composerKN.E2(function2) ? 131072 : 65536;
                        }
                        if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z7 = i8 != 0 ? true : z5;
                            MutableInteractionSource mutableInteractionSource3 = i9 != 0 ? null : mutableInteractionSource;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-54657793, i5, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:104)");
                            }
                            Modifier modifierN = ToggleableKt.n(InteractiveComponentSizeKt.t(modifier4), z4, mutableInteractionSource3, RippleKt.J2(false, f22093n, 0L, 4, null), z7, Role.mUb(Role.INSTANCE.t()), function12);
                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                            int iN = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
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
                            if (z7) {
                                composerKN.eF(-2034922869);
                                fRl = ((Number) composerKN.ty(ContentAlphaKt.n())).floatValue();
                            } else {
                                composerKN.eF(-2034922036);
                                fRl = ContentAlpha.f21745n.rl(composerKN, 6);
                            }
                            composerKN.Xw();
                            CompositionLocalKt.rl(ContentAlphaKt.n().nr(Float.valueOf(fRl)), function2, composerKN, ProvidedValue.xMQ | ((i5 >> 12) & 112));
                            composerKN.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier3 = modifier4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            z6 = z7;
                        } else {
                            composerKN.wTp();
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            z6 = z5;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.IconButtonKt$IconToggleButton$2
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
                                    IconButtonKt.rl(z2, function1, modifier3, z6, mutableInteractionSource2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
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
                z5 = z3;
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
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            z5 = z3;
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
        function12 = function1;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        z5 = z3;
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
}
