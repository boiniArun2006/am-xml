package g8;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.monorepo.settings.StackedIntroOffersEntity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: g8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class AbstractC2112c {

    /* JADX INFO: renamed from: g8.c$j */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StackedIntroOffersEntity.Treatment.values().length];
            try {
                iArr[StackedIntroOffersEntity.Treatment.SIMPLE_STACKED_INTRO_OFFERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StackedIntroOffersEntity.Treatment.TIMELINE_INTRO_OFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StackedIntroOffersEntity.Treatment.TIMELINE_NO_INTRO_OFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[s4.values().length];
            try {
                iArr2[s4.f67124n.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[s4.f67125t.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void rl(final ColumnScope columnScope, final s4 periodicity, final boolean z2, final String str, final String price, StackedIntroOffersEntity.Treatment treatment, Composer composer, final int i2) {
        int i3;
        float fKN;
        StackedIntroOffersEntity.Treatment treatment2;
        int iAz;
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(periodicity, "periodicity");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(treatment, "treatment");
        Composer composerKN = composer.KN(-1042818062);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(columnScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(periodicity) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(str) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.p5(price) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.p5(treatment) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
            treatment2 = treatment;
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1042818062, i3, -1, "com.alightcreative.monetization.stackedintro.components.PaywallTitle (PaywallTitle.kt:34)");
            }
            int i5 = j.$EnumSwitchMapping$0[treatment.ordinal()];
            if (i5 == 1) {
                fKN = Dp.KN(129);
            } else {
                if (i5 != 2 && i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                fKN = Dp.KN(80);
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierXMQ = SizeKt.xMQ(PaddingKt.az(companion, 0.0f, Dp.KN(32), 0.0f, 0.0f, 13, null), fKN);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            int i7 = i3;
            ImageKt.n(PainterResources_androidKt.t(2131231975, composerKN, 6), null, columnScope.t(modifierXMQ, companion2.Uo()), companion2.O(), ContentScale.INSTANCE.t(), 0.0f, null, composerKN, 27696, 96);
            Modifier modifierT = columnScope.t(PaddingKt.mUb(companion, Dp.KN(60), Dp.KN(16)), companion2.Uo());
            MaterialTheme materialTheme = MaterialTheme.f26164n;
            int i8 = MaterialTheme.rl;
            TextStyle headlineMedium = materialTheme.t(composerKN, i8).getHeadlineMedium();
            String strNr = nr(treatment, composerKN, (i7 >> 15) & 14);
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            int iN = companion3.n();
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            TextKt.t(strNr, modifierT, 0L, 0L, null, companion4.J2(), null, 0L, null, TextAlign.KN(iN), 0L, 0, false, 0, 0, null, headlineMedium, composerKN, 196608, 0, 64988);
            String strO = O(periodicity, z2, str, price, treatment, composerKN, 65534 & (i7 >> 3));
            treatment2 = treatment;
            String strT = StringResources_androidKt.t(2132020209, composerKN, 6);
            Modifier modifierT2 = columnScope.t(PaddingKt.mUb(companion, Dp.KN(24), Dp.KN(4)), companion2.Uo());
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            StackedIntroOffersEntity.Treatment treatment3 = StackedIntroOffersEntity.Treatment.SIMPLE_STACKED_INTRO_OFFERS;
            if (treatment2 == treatment3) {
                iAz = builder.az(new SpanStyle(0L, 0L, companion4.t(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null));
                try {
                    builder.KN(strT);
                    builder.KN(" ");
                    Unit unit = Unit.INSTANCE;
                    builder.qie(iAz);
                } finally {
                }
            }
            iAz = builder.az(new SpanStyle(0L, 0L, companion4.J2(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null));
            try {
                builder.KN(strO);
                Unit unit2 = Unit.INSTANCE;
                if (treatment2 != treatment3) {
                    iAz = builder.az(new SpanStyle(0L, 0L, companion4.t(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null));
                    try {
                        builder.KN(" ");
                        builder.KN(strT);
                    } finally {
                    }
                }
                composer2 = composerKN;
                TextKt.nr(builder.ty(), modifierT2, 0L, 0L, null, companion4.J2(), null, 0L, null, TextAlign.KN(companion3.n()), 0L, 0, false, 0, 0, null, null, materialTheme.t(composerKN, i8).getTitleMedium(), composer2, 196608, 0, 130524);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } finally {
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final StackedIntroOffersEntity.Treatment treatment4 = treatment2;
            scopeUpdateScopeGh.n(new Function2() { // from class: g8.l3D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2112c.t(columnScope, periodicity, z2, str, price, treatment4, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(ColumnScope columnScope, s4 s4Var, boolean z2, String str, String str2, StackedIntroOffersEntity.Treatment treatment, int i2, Composer composer, int i3) {
        rl(columnScope, s4Var, z2, str, str2, treatment, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final String O(s4 s4Var, boolean z2, String str, String str2, StackedIntroOffersEntity.Treatment treatment, Composer composer, int i2) {
        String strNr;
        composer.eF(1512290633);
        if (ComposerKt.v()) {
            ComposerKt.p5(1512290633, i2, -1, "com.alightcreative.monetization.stackedintro.components.getPriceDescriptionText (PaywallTitle.kt:110)");
        }
        if (str == null) {
            str = "";
        }
        int i3 = j.$EnumSwitchMapping$0[treatment.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    composer.eF(-63189446);
                    int i5 = j.$EnumSwitchMapping$1[s4Var.ordinal()];
                    if (i5 != 1) {
                        if (i5 == 2) {
                            composer.eF(-62727949);
                            if (!z2) {
                                composer.eF(-62682224);
                                strNr = StringResources_androidKt.nr(2132020205, new Object[]{str2}, composer, 6);
                                composer.Xw();
                            } else {
                                composer.eF(-62530541);
                                strNr = StringResources_androidKt.nr(2132020208, new Object[]{str2}, composer, 6);
                                composer.Xw();
                            }
                            composer.Xw();
                        } else {
                            composer.eF(1383435376);
                            composer.Xw();
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        composer.eF(-63132685);
                        if (!z2) {
                            composer.eF(-63086960);
                            strNr = StringResources_androidKt.nr(2132020199, new Object[]{str2}, composer, 6);
                            composer.Xw();
                        } else {
                            composer.eF(-62935277);
                            strNr = StringResources_androidKt.nr(2132020202, new Object[]{str2}, composer, 6);
                            composer.Xw();
                        }
                        composer.Xw();
                    }
                    composer.Xw();
                } else {
                    composer.eF(1383372927);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                composer.eF(-64148214);
                int i7 = j.$EnumSwitchMapping$1[s4Var.ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        composer.eF(-63663653);
                        if (!z2) {
                            composer.eF(-63618300);
                            strNr = StringResources_androidKt.nr(2132020204, new Object[]{str, str2}, composer, 6);
                            composer.Xw();
                        } else {
                            composer.eF(-63454713);
                            strNr = StringResources_androidKt.nr(2132020207, new Object[]{str, str2}, composer, 6);
                            composer.Xw();
                        }
                        composer.Xw();
                    } else {
                        composer.eF(1383404448);
                        composer.Xw();
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    composer.eF(-64092197);
                    if (!z2) {
                        composer.eF(-64046844);
                        strNr = StringResources_androidKt.nr(2132020198, new Object[]{str, str2}, composer, 6);
                        composer.Xw();
                    } else {
                        composer.eF(-63883257);
                        strNr = StringResources_androidKt.nr(2132020201, new Object[]{str, str2}, composer, 6);
                        composer.Xw();
                    }
                    composer.Xw();
                }
                composer.Xw();
            }
        } else {
            composer.eF(-65105494);
            int i8 = j.$EnumSwitchMapping$1[s4Var.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    composer.eF(-64620933);
                    if (!z2) {
                        composer.eF(-64575580);
                        strNr = StringResources_androidKt.nr(2132020203, new Object[]{str, str2}, composer, 6);
                        composer.Xw();
                    } else {
                        composer.eF(-64411993);
                        strNr = StringResources_androidKt.nr(2132020206, new Object[]{str, str2}, composer, 6);
                        composer.Xw();
                    }
                    composer.Xw();
                } else {
                    composer.eF(1383373568);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                composer.eF(-65049477);
                if (!z2) {
                    composer.eF(-65004124);
                    strNr = StringResources_androidKt.nr(2132020197, new Object[]{str, str2}, composer, 6);
                    composer.Xw();
                } else {
                    composer.eF(-64840537);
                    strNr = StringResources_androidKt.nr(2132020200, new Object[]{str, str2}, composer, 6);
                    composer.Xw();
                }
                composer.Xw();
            }
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return strNr;
    }

    private static final String nr(StackedIntroOffersEntity.Treatment treatment, Composer composer, int i2) {
        String strT;
        composer.eF(-1832933639);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1832933639, i2, -1, "com.alightcreative.monetization.stackedintro.components.getPaywallTitleText (PaywallTitle.kt:95)");
        }
        int i3 = j.$EnumSwitchMapping$0[treatment.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    composer.eF(1631701778);
                    strT = StringResources_androidKt.t(2132020222, composer, 6);
                    composer.Xw();
                } else {
                    composer.eF(1631692949);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                composer.eF(1631698258);
                strT = StringResources_androidKt.t(2132020221, composer, 6);
                composer.Xw();
            }
        } else {
            composer.eF(1631694834);
            strT = StringResources_androidKt.t(2132020220, composer, 6);
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return strT;
    }
}
