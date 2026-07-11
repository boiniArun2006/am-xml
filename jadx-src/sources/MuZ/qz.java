package MuZ;

import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class qz {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Modifier modifier, Function0 function0, TextStyle textStyle, TextStyle textStyle2, int i2, int i3, Composer composer, int i5) {
        t(modifier, function0, textStyle, textStyle2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(AnnotatedString annotatedString, Function0 function0, int i2) {
        AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull(annotatedString.xMQ("url", i2, i2));
        if (range != null && Intrinsics.areEqual(range.getItem(), "privacy-policy")) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void t(Modifier modifier, final Function0 onPrivacyPolicyLinkClicked, final TextStyle textStyle, final TextStyle linkStyle, Composer composer, final int i2, final int i3) {
        int i5;
        Intrinsics.checkNotNullParameter(onPrivacyPolicyLinkClicked, "onPrivacyPolicyLinkClicked");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(linkStyle, "linkStyle");
        Composer composerKN = composer.KN(-2061042972);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onPrivacyPolicyLinkClicked) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(textStyle) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.p5(linkStyle) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i7 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-2061042972, i5, -1, "com.bendingspoons.legal.privacy.ui.settings.internal.PrivacyCopy (PrivacyCopy.kt:24)");
            }
            final AnnotatedString annotatedStringN = Yd.CN3.n(K0.aC.Ik, linkStyle, composerKN, (i5 >> 6) & 112);
            composerKN.eF(748510856);
            boolean zP5 = composerKN.p5(annotatedStringN) | ((i5 & 112) == 32);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: MuZ.C
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qz.nr(annotatedStringN, onPrivacyPolicyLinkClicked, ((Integer) obj).intValue());
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            Modifier modifier2 = modifier;
            ClickableTextKt.n(annotatedStringN, modifier2, textStyle, false, 0, 0, null, (Function1) objIF, composerKN, ((i5 << 3) & 112) | (i5 & 896), b.f61769v);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final Modifier modifier3 = modifier;
            scopeUpdateScopeGh.n(new Function2() { // from class: MuZ.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.O(modifier3, onPrivacyPolicyLinkClicked, textStyle, linkStyle, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
