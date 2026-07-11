package eo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Wre {

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

    public static final String n(mg4.w6 tier, boolean z2, Composer composer, int i2) {
        String strT;
        Intrinsics.checkNotNullParameter(tier, "tier");
        composer.eF(210015458);
        if (ComposerKt.v()) {
            ComposerKt.p5(210015458, i2, -1, "com.alightcreative.monetization.ui.components.texts.tierText (TierText.kt:13)");
        }
        if (z2) {
            composer.eF(-114471877);
            int i3 = j.$EnumSwitchMapping$0[tier.ordinal()];
            if (i3 == 1) {
                composer.eF(273404404);
                strT = StringResources_androidKt.t(2132019857, composer, 6);
                composer.Xw();
            } else {
                if (i3 != 2) {
                    composer.eF(273402327);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composer.eF(273407959);
                strT = StringResources_androidKt.t(2132019858, composer, 6);
                composer.Xw();
            }
            composer.Xw();
        } else {
            composer.eF(-114201216);
            int i5 = j.$EnumSwitchMapping$0[tier.ordinal()];
            if (i5 == 1) {
                composer.eF(273413124);
                strT = StringResources_androidKt.t(2132017554, composer, 6);
                composer.Xw();
            } else {
                if (i5 != 2) {
                    composer.eF(273411058);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composer.eF(273417217);
                strT = StringResources_androidKt.t(2132017400, composer, 6) + " ☁️";
                composer.Xw();
            }
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return strT;
    }
}
