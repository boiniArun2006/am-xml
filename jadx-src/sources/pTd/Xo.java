package pTd;

import R5.Ml;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.alightcreative.account.PurchasePeriod;
import f.EnumC1982eO;
import java.text.NumberFormat;
import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Xo {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasePeriod.Unit.values().length];
            try {
                iArr[PurchasePeriod.Unit.Week.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasePeriod.Unit.Year.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String n(Ml.j.C0297j c0297j, R5.Wre wre, Composer composer, int i2, int i3) {
        Composer composer2;
        String strUo;
        Intrinsics.checkNotNullParameter(c0297j, "<this>");
        composer.eF(865939109);
        if ((i3 & 1) != 0) {
            wre = c0297j.rl();
        }
        R5.Wre wre2 = wre;
        if (ComposerKt.v()) {
            ComposerKt.p5(865939109, i2, -1, "com.alightcreative.monetization.ui.components.cloudcards.getCloudPaywallPrice (GetCloudPaywallPrice.kt:23)");
        }
        if (c0297j.J2() != EnumC1982eO.f64023o || wre2 == null) {
            composer.eF(1954413527);
            composer2 = composer;
            strUo = D.fuX.Uo(wre2, c0297j.t(), false, false, composer2, (i2 >> 3) & 14, 12);
            composer2.Xw();
        } else {
            composer.eF(1953444746);
            if (c0297j.mUb() && c0297j.O() != null && c0297j.O().t().compareTo(wre2.O()) < 0 && Intrinsics.areEqual(c0297j.O().rl(), wre2.ty()) && Intrinsics.areEqual(c0297j.O().O(), wre2.az())) {
                composer.eF(1953703038);
                composer.eF(1587043839);
                Object objIF = composer.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = NumberFormat.getCurrencyInstance();
                    composer.o(objIF);
                }
                NumberFormat numberFormat = (NumberFormat) objIF;
                composer.Xw();
                numberFormat.setCurrency(Currency.getInstance(wre2.az()));
                String str = numberFormat.format(Float.valueOf(((wre2.J2() - c0297j.O().nr()) * 1.0f) / 1000000));
                if (str != null) {
                    composer.eF(1954058856);
                    strUo = t(wre2, str, composer, (i2 >> 3) & 14);
                    composer.Xw();
                } else {
                    composer.eF(1954200650);
                    strUo = rl(wre2, composer, (i2 >> 3) & 14);
                    composer.Xw();
                }
                composer.Xw();
            } else {
                composer.eF(1954315350);
                strUo = rl(wre2, composer, (i2 >> 3) & 14);
                composer.Xw();
            }
            composer.Xw();
            composer2 = composer;
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer2.Xw();
        return strUo;
    }

    private static final String rl(R5.Wre wre, Composer composer, int i2) {
        composer.eF(677216884);
        if (ComposerKt.v()) {
            ComposerKt.p5(677216884, i2, -1, "com.alightcreative.monetization.ui.components.cloudcards.getPaywallUpgradePrice (GetCloudPaywallPrice.kt:66)");
        }
        int i3 = j.$EnumSwitchMapping$0[wre.ty().getUnit().ordinal()];
        int i5 = 2132020405;
        if (i3 != 1 && i3 == 2) {
            i5 = 2132020406;
        }
        String strNr = StringResources_androidKt.nr(i5, new Object[]{wre.O()}, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return strNr;
    }

    private static final String t(R5.Wre wre, String str, Composer composer, int i2) {
        composer.eF(1767823260);
        if (ComposerKt.v()) {
            ComposerKt.p5(1767823260, i2, -1, "com.alightcreative.monetization.ui.components.cloudcards.getPaywallUpgradePriceDifference (GetCloudPaywallPrice.kt:54)");
        }
        int i3 = j.$EnumSwitchMapping$0[wre.ty().getUnit().ordinal()];
        int i5 = 2132020407;
        if (i3 != 1 && i3 == 2) {
            i5 = 2132020408;
        }
        String strNr = StringResources_androidKt.nr(i5, new Object[]{str}, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return strNr;
    }
}
