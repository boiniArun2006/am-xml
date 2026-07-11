package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.DropdownMenuPositionProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a¢\u0001\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001an\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001ad\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0092\u0001\u0010,\u001a\u00020\u00032\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00182\b\b\u0002\u0010%\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0004\b,\u0010-\"\u001a\u00101\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/DpOffset;", "offset", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/window/PopupProperties;", "properties", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Landroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", c.f62177j, "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rl", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Landroidx/compose/material3/MenuItemColors;", "colors", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "nr", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/window/PopupProperties;", "getDefaultMenuProperties", "()Landroidx/compose/ui/window/PopupProperties;", "DefaultMenuProperties", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material3/AndroidMenu_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,195:1\n148#2:196\n148#2:216\n148#2:217\n1223#3,6:197\n1223#3,6:203\n1223#3,6:210\n77#4:209\n*S KotlinDebug\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material3/AndroidMenu_androidKt\n*L\n181#1:196\n119#1:216\n155#1:217\n56#1:197,6\n60#1:203,6\n63#1:210,6\n61#1:209\n*E\n"})
public final class AndroidMenu_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PopupProperties f24178n = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void n(final boolean z2, final Function0 function0, Modifier modifier, long j2, ScrollState scrollState, PopupProperties popupProperties, final Function3 function3, Composer composer, final int i2, final int i3) {
        boolean z3;
        int i5;
        Function0 function02;
        Modifier modifier2;
        int i7;
        long jN;
        ScrollState scrollStateT;
        int i8;
        PopupProperties popupProperties2;
        Modifier modifier3;
        long j3;
        ScrollState scrollState2;
        PopupProperties popupProperties3;
        int i9;
        Composer composer2;
        final Modifier modifier4;
        final long j4;
        final ScrollState scrollState3;
        final PopupProperties popupProperties4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1137929566);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z3) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
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
                    jN = j2;
                    i5 |= composerKN.nr(jN) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        scrollStateT = scrollState;
                        int i11 = composerKN.p5(scrollStateT) ? 16384 : 8192;
                        i5 |= i11;
                    } else {
                        scrollStateT = scrollState;
                    }
                    i5 |= i11;
                } else {
                    scrollStateT = scrollState;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        popupProperties2 = popupProperties;
                        i5 |= composerKN.p5(popupProperties2) ? 131072 : 65536;
                    }
                    if ((i3 & 64) != 0) {
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.E2(function3) ? 1048576 : 524288;
                        }
                        if ((599187 & i5) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier4 = modifier2;
                            j4 = jN;
                            scrollState3 = scrollStateT;
                            popupProperties4 = popupProperties2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i7 != 0) {
                                    float f3 = 0;
                                    jN = DpKt.n(Dp.KN(f3), Dp.KN(f3));
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                    scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
                                }
                                if (i8 == 0) {
                                    modifier3 = modifier5;
                                    j3 = jN;
                                    scrollState2 = scrollStateT;
                                    popupProperties3 = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                    i9 = -1137929566;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(i9, i5, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:123)");
                                    }
                                    MenuDefaults menuDefaults = MenuDefaults.f26185n;
                                    composer2 = composerKN;
                                    t(z3, function02, modifier3, j3, scrollState2, popupProperties3, menuDefaults.O(composerKN, 6), menuDefaults.n(composerKN, 6), menuDefaults.J2(), menuDefaults.nr(), null, function3, composer2, (i5 & 14) | 905969664 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5), ((i5 >> 15) & 112) | 6, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier4 = modifier3;
                                    j4 = j3;
                                    scrollState3 = scrollState2;
                                    popupProperties4 = popupProperties3;
                                } else {
                                    modifier3 = modifier5;
                                }
                            } else {
                                composerKN.wTp();
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                modifier3 = modifier2;
                            }
                            scrollState2 = scrollStateT;
                            popupProperties3 = popupProperties2;
                            i9 = -1137929566;
                            j3 = jN;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            MenuDefaults menuDefaults2 = MenuDefaults.f26185n;
                            composer2 = composerKN;
                            t(z3, function02, modifier3, j3, scrollState2, popupProperties3, menuDefaults2.O(composerKN, 6), menuDefaults2.n(composerKN, 6), menuDefaults2.J2(), menuDefaults2.nr(), null, function3, composer2, (i5 & 14) | 905969664 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5), ((i5 >> 15) & 112) | 6, 0);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            j4 = j3;
                            scrollState3 = scrollState2;
                            popupProperties4 = popupProperties3;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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
                                    AndroidMenu_androidKt.n(z2, function0, modifier4, j4, scrollState3, popupProperties4, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 1572864;
                    if ((599187 & i5) == 599186) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i10 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if (i8 == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                popupProperties2 = popupProperties;
                if ((i3 & 64) != 0) {
                }
                if ((599187 & i5) == 599186) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            jN = j2;
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            popupProperties2 = popupProperties;
            if ((i3 & 64) != 0) {
            }
            if ((599187 & i5) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        jN = j2;
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        popupProperties2 = popupProperties;
        if ((i3 & 64) != 0) {
        }
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final Function2 function2, final Function0 function0, Modifier modifier, Function2 function22, Function2 function23, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        Function2 function24;
        int i5;
        Function0 function02;
        Modifier modifier2;
        int i7;
        Function2 function25;
        int i8;
        Function2 function26;
        int i9;
        boolean z3;
        MenuItemColors menuItemColorsUo;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues paddingValues2;
        Composer composer2;
        final Modifier modifier3;
        final Function2 function27;
        final Function2 function28;
        final boolean z4;
        final MenuItemColors menuItemColors2;
        final PaddingValues paddingValues3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1826340448);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function24) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
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
                    function25 = function22;
                    i5 |= composerKN.E2(function25) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function26 = function23;
                        i5 |= composerKN.E2(function26) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            z3 = z2;
                            i5 |= composerKN.n(z3) ? 131072 : 65536;
                        }
                        if ((1572864 & i2) == 0) {
                            if ((i3 & 64) == 0) {
                                menuItemColorsUo = menuItemColors;
                                int i16 = composerKN.p5(menuItemColorsUo) ? 1048576 : 524288;
                                i5 |= i16;
                            } else {
                                menuItemColorsUo = menuItemColors;
                            }
                            i5 |= i16;
                        } else {
                            menuItemColorsUo = menuItemColors;
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i5 |= 12582912;
                        } else {
                            if ((i2 & 12582912) == 0) {
                                i11 = i10;
                                i5 |= composerKN.p5(paddingValues) ? 8388608 : 4194304;
                            }
                            i12 = i3 & 256;
                            if (i12 != 0) {
                                if ((i2 & 100663296) == 0) {
                                    i13 = i12;
                                    i5 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                }
                                int i17 = i5;
                                if ((i5 & 38347923) == 38347922 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    composer2 = composerKN;
                                    modifier3 = modifier2;
                                    function27 = function25;
                                    function28 = function26;
                                    z4 = z3;
                                    menuItemColors2 = menuItemColorsUo;
                                    paddingValues3 = paddingValues;
                                } else {
                                    composerKN.e();
                                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                                        if (i15 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i7 != 0) {
                                            function25 = null;
                                        }
                                        if (i8 != 0) {
                                            function26 = null;
                                        }
                                        if (i9 != 0) {
                                            z3 = true;
                                        }
                                        if ((i3 & 64) == 0) {
                                            i14 = i17 & (-3670017);
                                            menuItemColorsUo = MenuDefaults.f26185n.Uo(composerKN, 6);
                                        } else {
                                            i14 = i17;
                                        }
                                        PaddingValues paddingValuesT = i11 == 0 ? MenuDefaults.f26185n.t() : paddingValues;
                                        mutableInteractionSource2 = i13 == 0 ? null : mutableInteractionSource;
                                        paddingValues2 = paddingValuesT;
                                    } else {
                                        composerKN.wTp();
                                        if ((i3 & 64) != 0) {
                                            i14 = i17 & (-3670017);
                                            paddingValues2 = paddingValues;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        } else {
                                            paddingValues2 = paddingValues;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            i14 = i17;
                                        }
                                    }
                                    Function2 function29 = function26;
                                    boolean z5 = z3;
                                    MenuItemColors menuItemColors3 = menuItemColorsUo;
                                    Modifier modifier4 = modifier2;
                                    Function2 function210 = function25;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1826340448, i14, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                                    }
                                    composer2 = composerKN;
                                    MenuKt.nr(function24, function02, modifier4, function210, function29, z5, menuItemColors3, paddingValues2, mutableInteractionSource2, composer2, i14 & 268435454);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier3 = modifier4;
                                    function27 = function210;
                                    function28 = function29;
                                    z4 = z5;
                                    menuItemColors2 = menuItemColors3;
                                    paddingValues3 = paddingValues2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
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
                                            AndroidMenu_androidKt.nr(function2, function0, modifier3, function27, function28, z4, menuItemColors2, paddingValues3, mutableInteractionSource3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= 100663296;
                            i13 = i12;
                            int i172 = i5;
                            if ((i5 & 38347923) == 38347922) {
                                composerKN.e();
                                if ((i2 & 1) != 0) {
                                    if (i15 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if ((i3 & 64) == 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    paddingValues2 = paddingValuesT;
                                    Function2 function292 = function26;
                                    boolean z52 = z3;
                                    MenuItemColors menuItemColors32 = menuItemColorsUo;
                                    Modifier modifier42 = modifier2;
                                    Function2 function2102 = function25;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                    }
                                    composer2 = composerKN;
                                    MenuKt.nr(function24, function02, modifier42, function2102, function292, z52, menuItemColors32, paddingValues2, mutableInteractionSource2, composer2, i14 & 268435454);
                                    if (ComposerKt.v()) {
                                    }
                                    modifier3 = modifier42;
                                    function27 = function2102;
                                    function28 = function292;
                                    z4 = z52;
                                    menuItemColors2 = menuItemColors32;
                                    paddingValues3 = paddingValues2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i11 = i10;
                        i12 = i3 & 256;
                        if (i12 != 0) {
                        }
                        i13 = i12;
                        int i1722 = i5;
                        if ((i5 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    z3 = z2;
                    if ((1572864 & i2) == 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    i12 = i3 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    int i17222 = i5;
                    if ((i5 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function26 = function23;
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                z3 = z2;
                if ((1572864 & i2) == 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                int i172222 = i5;
                if ((i5 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function25 = function22;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            function26 = function23;
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            z3 = z2;
            if ((1572864 & i2) == 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            int i1722222 = i5;
            if ((i5 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        function25 = function22;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        function26 = function23;
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        z3 = z2;
        if ((1572864 & i2) == 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        int i17222222 = i5;
        if ((i5 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void rl(final boolean z2, final Function0 function0, Modifier modifier, long j2, PopupProperties popupProperties, final Function3 function3, Composer composer, final int i2, final int i3) {
        boolean z3;
        int i5;
        Function0 function02;
        Modifier modifier2;
        int i7;
        long jN;
        int i8;
        PopupProperties popupProperties2;
        Function3 function32;
        Composer composer2;
        final Modifier modifier3;
        final long j3;
        final PopupProperties popupProperties3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(354826666);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z3) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
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
                    jN = j2;
                    i5 |= composerKN.nr(jN) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        popupProperties2 = popupProperties;
                        i5 |= composerKN.p5(popupProperties2) ? 16384 : 8192;
                    }
                    if ((i3 & 32) != 0) {
                        if ((i2 & 196608) == 0) {
                            function32 = function3;
                            i5 |= composerKN.E2(function32) ? 131072 : 65536;
                        }
                        if ((74899 & i5) == 74898 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier3 = modifier2;
                            j3 = jN;
                            popupProperties3 = popupProperties2;
                        } else {
                            Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i7 != 0) {
                                float f3 = 0;
                                jN = DpKt.n(Dp.KN(f3), Dp.KN(f3));
                            }
                            PopupProperties popupProperties4 = i8 == 0 ? new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null) : popupProperties2;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(354826666, i5, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:158)");
                            }
                            composer2 = composerKN;
                            Modifier modifier5 = modifier4;
                            long j4 = jN;
                            t(z3, function02, modifier5, j4, ScrollKt.t(0, composerKN, 0, 1), popupProperties4, null, 0L, 0.0f, 0.0f, null, function32, composer2, (i5 & 8190) | ((i5 << 3) & 458752), (i5 >> 12) & 112, 1984);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier3 = modifier5;
                            j3 = j4;
                            popupProperties3 = popupProperties4;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$4
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
                                    AndroidMenu_androidKt.rl(z2, function0, modifier3, j3, popupProperties3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    function32 = function3;
                    if ((74899 & i5) == 74898) {
                        if (i9 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.v()) {
                        }
                        composer2 = composerKN;
                        Modifier modifier52 = modifier4;
                        long j42 = jN;
                        t(z3, function02, modifier52, j42, ScrollKt.t(0, composerKN, 0, 1), popupProperties4, null, 0L, 0.0f, 0.0f, null, function32, composer2, (i5 & 8190) | ((i5 << 3) & 458752), (i5 >> 12) & 112, 1984);
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier52;
                        j3 = j42;
                        popupProperties3 = popupProperties4;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                popupProperties2 = popupProperties;
                if ((i3 & 32) != 0) {
                }
                function32 = function3;
                if ((74899 & i5) == 74898) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            jN = j2;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            popupProperties2 = popupProperties;
            if ((i3 & 32) != 0) {
            }
            function32 = function3;
            if ((74899 & i5) == 74898) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        jN = j2;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        popupProperties2 = popupProperties;
        if ((i3 & 32) != 0) {
        }
        function32 = function3;
        if ((74899 & i5) == 74898) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final boolean z2, final Function0 function0, Modifier modifier, long j2, ScrollState scrollState, PopupProperties popupProperties, Shape shape, long j3, float f3, float f4, BorderStroke borderStroke, final Function3 function3, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Function0 function02;
        int i8;
        Modifier modifier2;
        int i9;
        long jN;
        int i10;
        PopupProperties popupProperties2;
        Shape shape2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ScrollState scrollStateT;
        Shape shapeO;
        long jN2;
        final BorderStroke borderStroke2;
        final Modifier modifier3;
        final float f5;
        final float f6;
        final ScrollState scrollState2;
        final Shape shape3;
        final long j4;
        Object objIF;
        Composer.Companion companion;
        final MutableTransitionState mutableTransitionState;
        Object objIF2;
        final MutableState mutableState;
        Density density;
        boolean zP5;
        Object objIF3;
        Composer composer2;
        final long j5;
        final Modifier modifier4;
        final ScrollState scrollState3;
        final Shape shape4;
        final long j6;
        final float f7;
        final float f8;
        final BorderStroke borderStroke3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1431928300);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function02 = function0;
                i7 |= composerKN.E2(function02) ? 32 : 16;
            }
            i8 = i5 & 4;
            if (i8 == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i7 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i9 = i5 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                    jN = j2;
                } else {
                    jN = j2;
                    if ((i2 & 3072) == 0) {
                        i7 |= composerKN.nr(jN) ? 2048 : 1024;
                    }
                }
                if ((i2 & 24576) == 0) {
                    i7 |= ((i5 & 16) == 0 && composerKN.p5(scrollState)) ? 16384 : 8192;
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                    i7 |= 196608;
                    popupProperties2 = popupProperties;
                } else {
                    popupProperties2 = popupProperties;
                    if ((i2 & 196608) == 0) {
                        i7 |= composerKN.p5(popupProperties2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 1572864) == 0) {
                    shape2 = shape;
                    i7 |= ((i5 & 64) == 0 && composerKN.p5(shape2)) ? 1048576 : 524288;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 12582912) == 0) {
                    i7 |= ((i5 & 128) == 0 && composerKN.nr(j3)) ? 8388608 : 4194304;
                }
                i11 = i5 & 256;
                if (i11 != 0) {
                    i7 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i7 |= composerKN.rl(f3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                i12 = i5 & 512;
                if (i12 == 0) {
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i13 = i12;
                        i7 |= composerKN.rl(f4) ? 536870912 : 268435456;
                    }
                    i14 = i5 & 1024;
                    if (i14 == 0) {
                        i16 = i3 | 6;
                        i15 = i14;
                    } else if ((i3 & 6) == 0) {
                        i15 = i14;
                        i16 = i3 | (composerKN.p5(borderStroke) ? 4 : 2);
                    } else {
                        i15 = i14;
                        i16 = i3;
                    }
                    if ((i5 & 2048) == 0) {
                        i16 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i16 |= composerKN.E2(function3) ? 32 : 16;
                    }
                    int i17 = i16;
                    if ((i7 & 306783379) != 306783378 && (i17 & 19) == 18 && composerKN.xMQ()) {
                        composerKN.wTp();
                        scrollState3 = scrollState;
                        f8 = f4;
                        composer2 = composerKN;
                        j5 = jN;
                        modifier4 = modifier2;
                        shape4 = shape2;
                        j6 = j3;
                        f7 = f3;
                        borderStroke3 = borderStroke;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i9 != 0) {
                                float f9 = 0;
                                jN = DpKt.n(Dp.KN(f9), Dp.KN(f9));
                            }
                            if ((i5 & 16) == 0) {
                                scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
                                i7 &= -57345;
                            } else {
                                scrollStateT = scrollState;
                            }
                            if (i10 != 0) {
                                popupProperties2 = f24178n;
                            }
                            if ((i5 & 64) == 0) {
                                shapeO = MenuDefaults.f26185n.O(composerKN, 6);
                                i7 &= -3670017;
                            } else {
                                shapeO = shape2;
                            }
                            if ((i5 & 128) == 0) {
                                jN2 = MenuDefaults.f26185n.n(composerKN, 6);
                                i7 &= -29360129;
                            } else {
                                jN2 = j3;
                            }
                            float fJ2 = i11 == 0 ? MenuDefaults.f26185n.J2() : f3;
                            float fNr = i13 == 0 ? MenuDefaults.f26185n.nr() : f4;
                            if (i15 == 0) {
                                modifier3 = modifier5;
                                f5 = fJ2;
                                f6 = fNr;
                                scrollState2 = scrollStateT;
                                shape3 = shapeO;
                                j4 = jN2;
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                                modifier3 = modifier5;
                                f5 = fJ2;
                                f6 = fNr;
                                scrollState2 = scrollStateT;
                                shape3 = shapeO;
                                j4 = jN2;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i5 & 16) != 0) {
                                i7 &= -57345;
                            }
                            if ((i5 & 64) != 0) {
                                i7 &= -3670017;
                            }
                            if ((i5 & 128) != 0) {
                                i7 &= -29360129;
                            }
                            scrollState2 = scrollState;
                            j4 = j3;
                            f5 = f3;
                            f6 = f4;
                            borderStroke2 = borderStroke;
                            modifier3 = modifier2;
                            shape3 = shape2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1431928300, i7, i17, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
                        }
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                            objIF = new MutableTransitionState(Boolean.FALSE);
                            composerKN.o(objIF);
                        }
                        mutableTransitionState = (MutableTransitionState) objIF;
                        mutableTransitionState.KN(Boolean.valueOf(z2));
                        if (!((Boolean) mutableTransitionState.n()).booleanValue() || ((Boolean) mutableTransitionState.rl()).booleanValue()) {
                            objIF2 = composerKN.iF();
                            if (objIF2 == companion.n()) {
                                objIF2 = SnapshotStateKt__SnapshotStateKt.O(TransformOrigin.rl(TransformOrigin.INSTANCE.n()), null, 2, null);
                                composerKN.o(objIF2);
                            }
                            mutableState = (MutableState) objIF2;
                            density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                            zP5 = ((i7 & 7168) != 2048) | composerKN.p5(density);
                            objIF3 = composerKN.iF();
                            if (!zP5 || objIF3 == companion.n()) {
                                objIF3 = new DropdownMenuPositionProvider(jN, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                        n(intRect, intRect2);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(IntRect intRect, IntRect intRect2) {
                                        mutableState.setValue(TransformOrigin.rl(MenuKt.KN(intRect, intRect2)));
                                    }
                                }, 4, null);
                                composerKN.o(objIF3);
                            }
                            AndroidPopup_androidKt.n((DropdownMenuPositionProvider) objIF3, function02, popupProperties2, ComposableLambdaKt.nr(2126968933, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    if ((i18 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(2126968933, i18, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)");
                                    }
                                    MenuKt.n(modifier3, mutableTransitionState, mutableState, scrollState2, shape3, j4, f5, f6, borderStroke2, function3, composer3, (MutableTransitionState.nr << 3) | RendererCapabilities.DECODER_SUPPORT_MASK);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, (i7 & 112) | 3072 | ((i7 >> 9) & 896), 0);
                            composer2 = composerKN;
                        } else {
                            composer2 = composerKN;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        j5 = jN;
                        modifier4 = modifier3;
                        scrollState3 = scrollState2;
                        shape4 = shape3;
                        j6 = j4;
                        f7 = f5;
                        f8 = f6;
                        borderStroke3 = borderStroke2;
                    }
                    final PopupProperties popupProperties3 = popupProperties2;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
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
                                AndroidMenu_androidKt.t(z2, function0, modifier4, j5, scrollState3, popupProperties3, shape4, j6, f7, f8, borderStroke3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                i13 = i12;
                i14 = i5 & 1024;
                if (i14 == 0) {
                }
                if ((i5 & 2048) == 0) {
                }
                int i172 = i16;
                if ((i7 & 306783379) != 306783378) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if (i9 != 0) {
                        }
                        if ((i5 & 16) == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if ((i5 & 64) == 0) {
                        }
                        if ((i5 & 128) == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                        }
                        mutableTransitionState = (MutableTransitionState) objIF;
                        mutableTransitionState.KN(Boolean.valueOf(z2));
                        if (((Boolean) mutableTransitionState.n()).booleanValue()) {
                            objIF2 = composerKN.iF();
                            if (objIF2 == companion.n()) {
                            }
                            mutableState = (MutableState) objIF2;
                            density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                            zP5 = ((i7 & 7168) != 2048) | composerKN.p5(density);
                            objIF3 = composerKN.iF();
                            if (!zP5) {
                                objIF3 = new DropdownMenuPositionProvider(jN, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                        n(intRect, intRect2);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(IntRect intRect, IntRect intRect2) {
                                        mutableState.setValue(TransformOrigin.rl(MenuKt.KN(intRect, intRect2)));
                                    }
                                }, 4, null);
                                composerKN.o(objIF3);
                                AndroidPopup_androidKt.n((DropdownMenuPositionProvider) objIF3, function02, popupProperties2, ComposableLambdaKt.nr(2126968933, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                        if ((i18 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(2126968933, i18, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)");
                                        }
                                        MenuKt.n(modifier3, mutableTransitionState, mutableState, scrollState2, shape3, j4, f5, f6, borderStroke2, function3, composer3, (MutableTransitionState.nr << 3) | RendererCapabilities.DECODER_SUPPORT_MASK);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, (i7 & 112) | 3072 | ((i7 >> 9) & 896), 0);
                                composer2 = composerKN;
                                if (ComposerKt.v()) {
                                }
                                j5 = jN;
                                modifier4 = modifier3;
                                scrollState3 = scrollState2;
                                shape4 = shape3;
                                j6 = j4;
                                f7 = f5;
                                f8 = f6;
                                borderStroke3 = borderStroke2;
                            }
                        }
                    }
                }
                final PopupProperties popupProperties32 = popupProperties2;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            i9 = i5 & 8;
            if (i9 != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i11 = i5 & 256;
            if (i11 != 0) {
            }
            i12 = i5 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i5 & 1024;
            if (i14 == 0) {
            }
            if ((i5 & 2048) == 0) {
            }
            int i1722 = i16;
            if ((i7 & 306783379) != 306783378) {
            }
            final PopupProperties popupProperties322 = popupProperties2;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        function02 = function0;
        i8 = i5 & 4;
        if (i8 == 0) {
        }
        modifier2 = modifier;
        i9 = i5 & 8;
        if (i9 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i11 = i5 & 256;
        if (i11 != 0) {
        }
        i12 = i5 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i5 & 1024;
        if (i14 == 0) {
        }
        if ((i5 & 2048) == 0) {
        }
        int i17222 = i16;
        if ((i7 & 306783379) != 306783378) {
        }
        final PopupProperties popupProperties3222 = popupProperties2;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
