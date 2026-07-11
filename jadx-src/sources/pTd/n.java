package pTd;

import HI0.gnv;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import eo.AbstractC1969w6;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[mg4.w6.values().length];
            try {
                iArr[mg4.w6.f70997n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mg4.w6.f70998t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void rl(final boolean z2, final mg4.w6 subscriptionTier, final Map storageMap, final String str, Composer composer, final int i2) {
        int i3;
        int i5;
        Composer composer2;
        int i7;
        int i8;
        Composer composer3;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(subscriptionTier, "subscriptionTier");
        Intrinsics.checkNotNullParameter(storageMap, "storageMap");
        Composer composerKN = composer.KN(732501412);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(subscriptionTier) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(storageMap) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(str) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            composer3 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(732501412, i3, -1, "com.alightcreative.monetization.ui.components.cloudcards.CardTextContent (CardTextContent.kt:35)");
            }
            if (z2) {
                composerKN.eF(1528496193);
                int[] iArr = j.$EnumSwitchMapping$0;
                int i11 = iArr[subscriptionTier.ordinal()];
                if (i11 == 1) {
                    i9 = 2132019857;
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i9 = 2132019858;
                }
                String strT = StringResources_androidKt.t(i9, composerKN, 0);
                Color.Companion companion = Color.INSTANCE;
                long jKN = companion.KN();
                H9N.j jVar = H9N.j.f3810n;
                TextKt.t(strT, null, jKN, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).S(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                SpacerKt.n(SizeKt.xMQ(Modifier.INSTANCE, Dp.KN(8)), composerKN, 6);
                int i12 = iArr[subscriptionTier.ordinal()];
                if (i12 == 1) {
                    i10 = 2132017402;
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i10 = 2132017403;
                }
                TextKt.t(StringResources_androidKt.t(i10, composerKN, 0), null, companion.KN(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).Ik(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                composer2 = composerKN;
                composer2.Xw();
                i7 = 6;
                i8 = 4;
            } else {
                composerKN.eF(1529356629);
                int i13 = j.$EnumSwitchMapping$0[subscriptionTier.ordinal()];
                if (i13 == 1) {
                    i5 = 2132017554;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = 2132017400;
                }
                TextKt.t(StringResources_androidKt.t(i5, composerKN, 0), null, Color.INSTANCE.KN(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).gh(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                composer2 = composerKN;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                i7 = 6;
                SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(8)), composer2, 6);
                eo.I28.rl(StringResources_androidKt.t(2132017401, composer2, 6), composer2, 0);
                i8 = 4;
                SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(4)), composer2, 6);
                XFr.j jVar2 = (XFr.j) storageMap.get(subscriptionTier);
                String strJ2 = jVar2 != null ? gnv.J2(jVar2.HI()) : null;
                if (strJ2 == null) {
                    strJ2 = "";
                }
                eo.I28.rl(StringResources_androidKt.nr(2132017404, new Object[]{strJ2}, composer2, 6), composer2, 0);
                composer2.Xw();
            }
            if (str != null) {
                SpacerKt.n(SizeKt.xMQ(Modifier.INSTANCE, Dp.KN(i8)), composer2, i7);
                AbstractC1969w6.t(str, null, 0, TextAlign.INSTANCE.J2(), composer2, 0, 6);
            }
            composer3 = composer2;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pTd.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n.t(z2, subscriptionTier, storageMap, str, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(boolean z2, mg4.w6 w6Var, Map map, String str, int i2, Composer composer, int i3) {
        rl(z2, w6Var, map, str, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
