package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001ac\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "tooltip", "Landroidx/compose/foundation/BasicTooltipState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "focusable", "enableUserInput", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BasicTooltip_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void n(final PopupPositionProvider popupPositionProvider, final Function2 function2, final BasicTooltipState basicTooltipState, Modifier modifier, boolean z2, boolean z3, final Function2 function22, Composer composer, final int i2, final int i3) {
        PopupPositionProvider popupPositionProvider2;
        int i5;
        Function2 function23;
        BasicTooltipState basicTooltipState2;
        final Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        Function2 function24;
        Composer composer2;
        final boolean z5;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-2005652140);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            popupPositionProvider2 = popupPositionProvider;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.p5(popupPositionProvider2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function23) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            basicTooltipState2 = basicTooltipState;
        } else {
            basicTooltipState2 = basicTooltipState;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.p5(basicTooltipState2) ? 256 : 128;
            }
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
                        i5 |= composerKN.n(z3) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i5 |= 1572864;
                        function24 = function22;
                    } else {
                        function24 = function22;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.E2(function24) ? 1048576 : 524288;
                        }
                    }
                    if (composerKN.HI((599187 & i5) == 599186, i5 & 1)) {
                        composer2 = composerKN;
                        composer2.wTp();
                        z5 = z4;
                        z6 = z3;
                    } else {
                        Modifier modifier3 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                        boolean z7 = i7 != 0 ? true : z4;
                        boolean z9 = i8 != 0 ? true : z3;
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-2005652140, i5, -1, "androidx.compose.foundation.BasicTooltipBoxAndroid (BasicTooltip.android.kt:61)");
                        }
                        composer2 = composerKN;
                        BasicTooltipKt.n(popupPositionProvider2, function23, basicTooltipState2, modifier3, z7, z9, function24, composer2, i5 & 4194302, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier2 = modifier3;
                        z5 = z7;
                        z6 = z9;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.BasicTooltip_androidKt$BasicTooltipBoxAndroid$1
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
                                BasicTooltip_androidKt.n(popupPositionProvider, function2, basicTooltipState, modifier2, z5, z6, function22, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                if ((i3 & 64) == 0) {
                }
                if (composerKN.HI((599187 & i5) == 599186, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z2;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if (composerKN.HI((599187 & i5) == 599186, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
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
        if ((i3 & 64) == 0) {
        }
        if (composerKN.HI((599187 & i5) == 599186, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
