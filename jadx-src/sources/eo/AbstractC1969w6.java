package eo;

import Dj7.CM;
import Dj7.QaP;
import P0j.Dsr;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: eo.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractC1969w6 {

    /* JADX INFO: renamed from: eo.w6$j */
    static final class j implements Function4 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f63859n;

        j(int i2) {
            this.f63859n = i2;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((AnimatedContentScope) obj, (String) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedContentScope AnimatedContent, String str, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.v()) {
                ComposerKt.p5(1275450741, i2, -1, "com.alightcreative.monetization.ui.components.texts.PriceText.<anonymous> (PriceText.kt:42)");
            }
            if (str != null) {
                int i3 = this.f63859n;
                Modifier modifierKN = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
                TextStyle textStyleGh = H9N.j.f3810n.rl(composer, 6).gh();
                Dsr.j jVar = P0j.Dsr.xMQ;
                CM.xMQ(str, modifierKN, Color.INSTANCE.KN(), TextAlign.KN(i3), textStyleGh, CollectionsKt.listOf((Object[]) new QaP[]{new QaP("line_through", jVar.rl()), new QaP("dashed", new P0j.Dsr(false, true, false, true, false, Color.xMQ(aD.w6.p5()), 0L, null, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, null)), new QaP(TtmlNode.BOLD, jVar.n()), new QaP("small", new P0j.Dsr(false, false, false, false, false, null, TextUnitKt.KN(13), null, 191, null))}), composer, ((i2 >> 3) & 14) | 432, 0);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(String str, Modifier modifier, int i2, int i3, int i5, int i7, Composer composer, int i8) {
        t(str, modifier, i2, i3, composer, RecomposeScopeImplKt.n(i5 | 1), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform nr(int i2, AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.J2(EnterExitTransitionKt.HI(AnimationSpecKt.ty(i2, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.Ik(AnimationSpecKt.ty(i2, 0, null, 6, null), 0.0f, 2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final String str, Modifier modifier, int i2, int i3, Composer composer, final int i5, final int i7) {
        Object obj;
        int i8;
        Modifier modifier2;
        int i9;
        int i10;
        int i11;
        Modifier modifier3;
        final int i12;
        int i13;
        int iN;
        boolean z2;
        Object objIF;
        final int i14;
        final int i15;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1446155615);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
            obj = str;
        } else if ((i5 & 6) == 0) {
            obj = str;
            i8 = (composerKN.p5(obj) ? 4 : 2) | i5;
        } else {
            obj = str;
            i8 = i5;
        }
        int i16 = i7 & 2;
        if (i16 != 0) {
            i8 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 != 0) {
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i10 = i2;
                    i8 |= composerKN.t(i10) ? 256 : 128;
                }
                if ((i5 & 3072) == 0) {
                    if ((i7 & 8) == 0) {
                        i11 = i3;
                        int i17 = composerKN.t(i11) ? 2048 : 1024;
                        i8 |= i17;
                    } else {
                        i11 = i3;
                    }
                    i8 |= i17;
                } else {
                    i11 = i3;
                }
                if ((i8 & 1171) == 1170 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier4 = modifier2;
                    i14 = i10;
                    i15 = i11;
                } else {
                    composerKN.e();
                    if ((i5 & 1) != 0 || composerKN.rV9()) {
                        modifier3 = i16 == 0 ? Modifier.INSTANCE : modifier2;
                        i12 = i9 == 0 ? d.f62986a : i10;
                        if ((i7 & 8) == 0) {
                            i13 = i8 & (-7169);
                            iN = TextAlign.INSTANCE.n();
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1446155615, i13, -1, "com.alightcreative.monetization.ui.components.texts.PriceText (PriceText.kt:32)");
                            }
                            composerKN.eF(1068665887);
                            z2 = (i13 & 896) != 256;
                            objIF = composerKN.iF();
                            if (!z2 || objIF == Composer.INSTANCE.n()) {
                                objIF = new Function1() { // from class: eo.j
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return AbstractC1969w6.nr(i12, (AnimatedContentTransitionScope) obj2);
                                    }
                                };
                                composerKN.o(objIF);
                            }
                            composerKN.Xw();
                            Modifier modifier5 = modifier3;
                            AnimatedContentKt.rl(obj, modifier5, (Function1) objIF, null, "PriceText", null, ComposableLambdaKt.nr(1275450741, true, new j(iN), composerKN, 54), composerKN, (i13 & 14) | 1597440 | (i13 & 112), 40);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            i14 = i12;
                            i15 = iN;
                            modifier4 = modifier5;
                        } else {
                            i13 = i8;
                        }
                    } else {
                        composerKN.wTp();
                        if ((i7 & 8) != 0) {
                            i8 &= -7169;
                        }
                        i13 = i8;
                        modifier3 = modifier2;
                        i12 = i10;
                    }
                    iN = i11;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    composerKN.eF(1068665887);
                    if ((i13 & 896) != 256) {
                    }
                    objIF = composerKN.iF();
                    if (!z2) {
                        objIF = new Function1() { // from class: eo.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return AbstractC1969w6.nr(i12, (AnimatedContentTransitionScope) obj2);
                            }
                        };
                        composerKN.o(objIF);
                        composerKN.Xw();
                        Modifier modifier52 = modifier3;
                        AnimatedContentKt.rl(obj, modifier52, (Function1) objIF, null, "PriceText", null, ComposableLambdaKt.nr(1275450741, true, new j(iN), composerKN, 54), composerKN, (i13 & 14) | 1597440 | (i13 & 112), 40);
                        if (ComposerKt.v()) {
                        }
                        i14 = i12;
                        i15 = iN;
                        modifier4 = modifier52;
                    }
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: eo.n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return AbstractC1969w6.O(str, modifier4, i14, i15, i5, i7, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            i10 = i2;
            if ((i5 & 3072) == 0) {
            }
            if ((i8 & 1171) == 1170) {
                composerKN.e();
                if ((i5 & 1) != 0) {
                    if (i16 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if ((i7 & 8) == 0) {
                    }
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 4;
        if (i9 != 0) {
        }
        i10 = i2;
        if ((i5 & 3072) == 0) {
        }
        if ((i8 & 1171) == 1170) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
