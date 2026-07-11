package Dj7;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class YzO {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[xZD.values().length];
            try {
                iArr[xZD.f1895n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xZD.f1896t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(long j2, Modifier modifier, xZD xzd, Composer composer, final int i2, final int i3) {
        long j3;
        int i5;
        Modifier modifier2;
        int i7;
        xZD xzd2;
        int i8;
        List listListOf;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1674233671);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            j3 = j2;
        } else {
            j3 = j2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.nr(j3) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    xzd2 = xzd;
                    i5 |= composerKN.p5(xzd2) ? 256 : 128;
                }
                if ((i5 & 147) == 146 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i7 != 0) {
                        xzd2 = xZD.f1895n;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1674233671, i5, -1, "com.alightcreative.common.compose.components.ShadowOverlay (ShadowOverlay.kt:21)");
                    }
                    Modifier modifierKN = SizeKt.KN(modifier4, 0.0f, 1, null);
                    Brush.Companion companion = Brush.INSTANCE;
                    i8 = j.$EnumSwitchMapping$0[xzd2.ordinal()];
                    if (i8 != 1) {
                        listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.xMQ(j3), Color.xMQ(Color.INSTANCE.J2())});
                    } else {
                        if (i8 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.xMQ(Color.INSTANCE.J2()), Color.xMQ(j3)});
                    }
                    BoxKt.n(BackgroundKt.rl(modifierKN, Brush.Companion.xMQ(companion, listListOf, 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), composerKN, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                }
                final xZD xzd3 = xzd2;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    final long j4 = j3;
                    scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.M5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return YzO.t(j4, modifier3, xzd3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            xzd2 = xzd;
            if ((i5 & 147) == 146) {
                if (i9 == 0) {
                }
                if (i7 != 0) {
                }
                if (ComposerKt.v()) {
                }
                Modifier modifierKN2 = SizeKt.KN(modifier4, 0.0f, 1, null);
                Brush.Companion companion2 = Brush.INSTANCE;
                i8 = j.$EnumSwitchMapping$0[xzd2.ordinal()];
                if (i8 != 1) {
                }
                BoxKt.n(BackgroundKt.rl(modifierKN2, Brush.Companion.xMQ(companion2, listListOf, 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), composerKN, 0);
                if (ComposerKt.v()) {
                }
                modifier3 = modifier4;
            }
            final xZD xzd32 = xzd2;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        xzd2 = xzd;
        if ((i5 & 147) == 146) {
        }
        final xZD xzd322 = xzd2;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(long j2, Modifier modifier, xZD xzd, int i2, int i3, Composer composer, int i5) {
        rl(j2, modifier, xzd, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
