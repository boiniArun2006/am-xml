package I8;

import K0.aC;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Dsr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(AnnotatedString annotatedString, Function0 function0, int i2) {
        AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull(annotatedString.xMQ("url", i2, i2));
        if (range != null && Intrinsics.areEqual(range.getItem(), "privacy-policy")) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final TextStyle style, Modifier modifier, final String title, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerKN = composer.KN(-729461476);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(style) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.p5(title) ? 256 : 128;
            }
            if ((i5 & 147) == 146 || !composerKN.xMQ()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-729461476, i5, -1, "com.bendingspoons.legal.privacy.ui.banner.internal.OverlineText (Text.kt:37)");
                }
                composer2 = composerKN;
                Modifier modifier5 = modifier4;
                TextKt.t(title, SizeKt.KN(modifier4, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style, composer2, (i5 >> 6) & 14, (i5 << 18) & 3670016, 65532);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier5;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: I8.I28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Dsr.xMQ(style, modifier3, title, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i3 & 4) == 0) {
        }
        if ((i5 & 147) == 146) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            composer2 = composerKN;
            Modifier modifier52 = modifier4;
            TextKt.t(title, SizeKt.KN(modifier4, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style, composer2, (i5 >> 6) & 14, (i5 << 18) & 3670016, 65532);
            if (ComposerKt.v()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final Function0 onPrivacyPolicyLinkClicked, final TextStyle bodyStyle, final TextStyle linkStyle, final boolean z2, final boolean z3, Modifier modifier, boolean z4, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z5;
        final AnnotatedString annotatedStringN;
        boolean zP5;
        Object objIF;
        final boolean z6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onPrivacyPolicyLinkClicked, "onPrivacyPolicyLinkClicked");
        Intrinsics.checkNotNullParameter(bodyStyle, "bodyStyle");
        Intrinsics.checkNotNullParameter(linkStyle, "linkStyle");
        Composer composerKN = composer.KN(-224960693);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(onPrivacyPolicyLinkClicked) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(bodyStyle) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(linkStyle) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.n(z2) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= composerKN.n(z3) ? 16384 : 8192;
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i5 |= 196608;
        } else {
            if ((196608 & i2) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 131072 : 65536;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    z5 = z4;
                    i5 |= composerKN.n(z5) ? 1048576 : 524288;
                }
                if ((599187 & i5) == 599186 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier3 = modifier2;
                    z6 = z5;
                } else {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z7 = i7 == 0 ? false : z5;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-224960693, i5, -1, "com.bendingspoons.legal.privacy.ui.banner.internal.BodyText (Text.kt:55)");
                    }
                    annotatedStringN = Yd.CN3.n((z7 || !z2) ? (z2 || !z3) ? (z2 || z3) ? (z2 && z3) ? aC.KN : aC.Uo : aC.xMQ : aC.mUb : aC.J2, linkStyle, composerKN, (i5 >> 3) & 112);
                    Modifier modifierKN = SizeKt.KN(modifier4, 0.0f, 1, null);
                    composerKN.eF(1481851597);
                    zP5 = composerKN.p5(annotatedStringN) | ((i5 & 14) == 4);
                    objIF = composerKN.iF();
                    if (!zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function1() { // from class: I8.CN3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Dsr.J2(annotatedStringN, onPrivacyPolicyLinkClicked, ((Integer) obj).intValue());
                            }
                        };
                        composerKN.o(objIF);
                    }
                    composerKN.Xw();
                    Modifier modifier5 = modifier4;
                    ClickableTextKt.n(annotatedStringN, modifierKN, bodyStyle, false, 0, 0, null, (Function1) objIF, composerKN, (i5 << 3) & 896, b.f61769v);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    z6 = z7;
                    modifier3 = modifier5;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: I8.fuX
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Dsr.Uo(onPrivacyPolicyLinkClicked, bodyStyle, linkStyle, z2, z3, modifier3, z6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 1572864;
            z5 = z4;
            if ((599187 & i5) == 599186) {
                if (i8 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                if (z7) {
                    if (z2) {
                        if (z2) {
                            if (z2) {
                                annotatedStringN = Yd.CN3.n((z7 || !z2) ? (z2 || !z3) ? (z2 || z3) ? (z2 && z3) ? aC.KN : aC.Uo : aC.xMQ : aC.mUb : aC.J2, linkStyle, composerKN, (i5 >> 3) & 112);
                                Modifier modifierKN2 = SizeKt.KN(modifier4, 0.0f, 1, null);
                                composerKN.eF(1481851597);
                                zP5 = composerKN.p5(annotatedStringN) | ((i5 & 14) == 4);
                                objIF = composerKN.iF();
                                if (!zP5) {
                                    objIF = new Function1() { // from class: I8.CN3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return Dsr.J2(annotatedStringN, onPrivacyPolicyLinkClicked, ((Integer) obj).intValue());
                                        }
                                    };
                                    composerKN.o(objIF);
                                    composerKN.Xw();
                                    Modifier modifier52 = modifier4;
                                    ClickableTextKt.n(annotatedStringN, modifierKN2, bodyStyle, false, 0, 0, null, (Function1) objIF, composerKN, (i5 << 3) & 896, b.f61769v);
                                    if (ComposerKt.v()) {
                                    }
                                    z6 = z7;
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        z5 = z4;
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Function0 function0, TextStyle textStyle, TextStyle textStyle2, boolean z2, boolean z3, Modifier modifier, boolean z4, int i2, int i3, Composer composer, int i5) {
        O(function0, textStyle, textStyle2, z2, z3, modifier, z4, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(TextStyle textStyle, Modifier modifier, String str, int i2, int i3, Composer composer, int i5) {
        mUb(textStyle, modifier, str, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void mUb(final TextStyle style, Modifier modifier, String str, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        String str2;
        int i7;
        Modifier modifier3;
        String strT;
        Composer composer2;
        final String str3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(style, "style");
        Composer composerKN = composer.KN(1935476136);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(style) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    str2 = str;
                    int i9 = composerKN.p5(str2) ? 256 : 128;
                    i5 |= i9;
                } else {
                    str2 = str;
                }
                i5 |= i9;
            } else {
                str2 = str;
            }
            if ((i5 & 147) == 146 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 4) == 0) {
                        Modifier modifier6 = modifier5;
                        i7 = i5 & (-897);
                        modifier3 = modifier6;
                        strT = StringResources_androidKt.t(aC.qie, composerKN, 0);
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1935476136, i7, -1, "com.bendingspoons.legal.privacy.ui.banner.internal.TitleText (Text.kt:23)");
                        }
                        composer2 = composerKN;
                        Modifier modifier7 = modifier3;
                        TextKt.t(strT, SizeKt.KN(modifier3, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style, composer2, (i7 >> 6) & 14, (i7 << 18) & 3670016, 65532);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        str3 = strT;
                        modifier4 = modifier7;
                    } else {
                        Modifier modifier8 = modifier5;
                        i7 = i5;
                        modifier3 = modifier8;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    i7 = i5;
                    modifier3 = modifier2;
                }
                strT = str2;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                composer2 = composerKN;
                Modifier modifier72 = modifier3;
                TextKt.t(strT, SizeKt.KN(modifier3, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style, composer2, (i7 >> 6) & 14, (i7 << 18) & 3670016, 65532);
                if (ComposerKt.v()) {
                }
                str3 = strT;
                modifier4 = modifier72;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
                modifier4 = modifier2;
                str3 = str2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: I8.Wre
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Dsr.gh(style, modifier4, str3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i5 & 147) == 146) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i3 & 4) == 0) {
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(TextStyle textStyle, Modifier modifier, String str, int i2, int i3, Composer composer, int i5) {
        KN(textStyle, modifier, str, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
