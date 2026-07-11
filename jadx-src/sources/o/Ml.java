package o;

import Dj7.CM;
import Dj7.QaP;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ml {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Function0 function0, int i2, Composer composer, int i3) {
        t(function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void t(final Function0 onClicked, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Composer composerKN = composer.KN(1776864731);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(onClicked) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1776864731, i3, -1, "com.alightcreative.monetization.ui.components.buttons.ManageSubscriptionText (ManageSubscriptionText.kt:22)");
            }
            List listListOf = CollectionsKt.listOf(new QaP("manage_subscription", new P0j.Dsr(true, false, false, false, false, null, 0L, null, 254, null)));
            Modifier.Companion companion = Modifier.INSTANCE;
            composerKN.eF(-1665703151);
            boolean z2 = (i3 & 14) == 4;
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: o.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Ml.nr(onClicked);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            CM.xMQ("{manage_subscription}Manage Subscription{/manage_subscription}", PaddingKt.gh(SizeKt.KN(ClickableKt.J2(companion, false, null, null, (Function0) objIF, 7, null), 0.0f, 1, null), 0.0f, Dp.KN(4), 1, null), 0L, TextAlign.KN(TextAlign.INSTANCE.n()), H9N.j.f3810n.rl(composerKN, 6).Z(), listListOf, composerKN, 0, 4);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: o.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ml.O(onClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
