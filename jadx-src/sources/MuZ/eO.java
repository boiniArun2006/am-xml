package MuZ;

import MuZ.eO;
import SFf.Ew;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class eO {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class j implements Function2 {
        final /* synthetic */ TextStyle E2;
        final /* synthetic */ TextStyle J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ew f6846O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Function0 f6847S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ TextStyle f6848Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f6849e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ TextStyle f6850g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Modifier f6851n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ R7M.j f6852o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ TextStyle f6853r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f6854t;

        j(Modifier modifier, long j2, Ew ew, TextStyle textStyle, TextStyle textStyle2, R7M.j jVar, TextStyle textStyle3, Function0 function0, TextStyle textStyle4, TextStyle textStyle5, Function1 function1) {
            this.f6851n = modifier;
            this.f6854t = j2;
            this.f6846O = ew;
            this.J2 = textStyle;
            this.f6853r = textStyle2;
            this.f6852o = jVar;
            this.f6848Z = textStyle3;
            this.f6847S = function0;
            this.f6850g = textStyle4;
            this.E2 = textStyle5;
            this.f6849e = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1644961951, i2, -1, "com.bendingspoons.legal.privacy.ui.settings.internal.TrackerDescriptionDialog.<anonymous> (TrackerDescriptionDialog.kt:51)");
            }
            float f3 = 25;
            Modifier modifierQie = PaddingKt.qie(BackgroundKt.t(this.f6851n, this.f6854t, RoundedCornerShapeKt.t(Dp.KN(15))), Dp.KN(f3), Dp.KN(23), Dp.KN(f3), Dp.KN(13));
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = arrangement.ty(Dp.KN(f3));
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal horizontalUo = companion.Uo();
            Ew ew = this.f6846O;
            TextStyle textStyle = this.J2;
            TextStyle textStyle2 = this.f6853r;
            R7M.j jVar = this.f6852o;
            TextStyle textStyle3 = this.f6848Z;
            Function0 function0 = this.f6847S;
            TextStyle textStyle4 = this.f6850g;
            TextStyle textStyle5 = this.E2;
            Function1 function1 = this.f6849e;
            MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, horizontalUo, composer, 54);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierQie);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N);
            } else {
                composer.r();
            }
            Composer composerN = Updater.n(composer);
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            String strT = ew.t();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            Function1 function12 = function1;
            TextKt.t(strT, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion3.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer, 0, 0, 65534);
            TextKt.t(ew.rl(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(textStyle2, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion3.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer, 0, 0, 65534);
            Alignment.Horizontal horizontalUo2 = companion.Uo();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement.Uo(), horizontalUo2, composer, 48);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, companion4);
            Function0 function0N2 = companion2.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N2);
            } else {
                composer.r();
            }
            Composer composerN2 = Updater.n(composer);
            Updater.O(composerN2, measurePolicyN2, companion2.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
            Function2 function2Rl2 = companion2.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion2.nr());
            TextKt.t(StringResources_androidKt.t(K0.aC.f4815Z, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(textStyle4, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion3.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer, 0, 0, 65534);
            TextKt.t(ew.O().rl(composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(textStyle2, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion3.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer, 0, 0, 65534);
            Composer composer2 = composer;
            composer2.XQ();
            List<Pr.j> listNr = ew.nr();
            if (listNr.isEmpty()) {
                listNr = null;
            }
            composer2.eF(15956991);
            if (listNr != null) {
                composer2.eF(15958248);
                for (final Pr.j jVar2 : listNr) {
                    String strN = jVar2.n();
                    composer2.eF(15962366);
                    if (strN == null) {
                        strN = StringResources_androidKt.t(K0.aC.WPU, composer2, 0);
                    }
                    composer2.Xw();
                    AnnotatedString annotatedString = new AnnotatedString(strN, null, null, 6, null);
                    TextStyle textStyleT = TextStyle.t(textStyle5, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
                    composer2.eF(-395101932);
                    final Function1 function13 = function12;
                    boolean zP5 = composer2.p5(function13) | composer2.p5(jVar2);
                    Object objIF = composer2.iF();
                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function1() { // from class: MuZ.Xo
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return eO.j.t(function13, jVar2, ((Integer) obj).intValue());
                            }
                        };
                        composer2.o(objIF);
                    }
                    composer2.Xw();
                    ClickableTextKt.n(annotatedString, null, textStyleT, false, 0, 0, null, (Function1) objIF, composer, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                    composer2 = composer;
                    function12 = function13;
                }
                composer.Xw();
                Unit unit = Unit.INSTANCE;
            }
            composer.Xw();
            Yd.Wre.rl("Close", jVar, textStyle3, IntrinsicKt.n(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), IntrinsicSize.f17696n), function0, composer, 3078, 0);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function1 function1, Pr.j jVar, int i2) {
            function1.invoke(jVar.rl());
            return Unit.INSTANCE;
        }
    }

    public static final void rl(final Ew tracker, final long j2, final TextStyle titleTextStyle, final TextStyle bodyTextStyle, final TextStyle subtitleTextStyle, final TextStyle thirdPartyPPLinkTextStyle, final TextStyle textStyle, final R7M.j closeButtonStyle, Modifier modifier, final Function1 onPrivacyPolicyLinkClicked, final Function0 onCloseClicked, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(titleTextStyle, "titleTextStyle");
        Intrinsics.checkNotNullParameter(bodyTextStyle, "bodyTextStyle");
        Intrinsics.checkNotNullParameter(subtitleTextStyle, "subtitleTextStyle");
        Intrinsics.checkNotNullParameter(thirdPartyPPLinkTextStyle, "thirdPartyPPLinkTextStyle");
        Intrinsics.checkNotNullParameter(textStyle, Apsps.ugtelTIVHAUnEdN);
        Intrinsics.checkNotNullParameter(closeButtonStyle, "closeButtonStyle");
        Intrinsics.checkNotNullParameter(onPrivacyPolicyLinkClicked, "onPrivacyPolicyLinkClicked");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Composer composerKN = composer.KN(1685370890);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(tracker) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i8 = i7 | 48;
        } else {
            int i10 = i7;
            if ((i2 & 48) == 0) {
                i8 = i10 | (composerKN.nr(j2) ? 32 : 16);
            } else {
                i8 = i10;
            }
        }
        if ((i5 & 4) != 0) {
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= composerKN.p5(titleTextStyle) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i8 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i8 |= composerKN.p5(bodyTextStyle) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i8 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i8 |= composerKN.p5(subtitleTextStyle) ? 16384 : 8192;
        }
        if ((i5 & 32) != 0) {
            i8 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i8 |= composerKN.p5(thirdPartyPPLinkTextStyle) ? 131072 : 65536;
        }
        if ((i5 & 64) != 0) {
            i8 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i8 |= composerKN.p5(textStyle) ? 1048576 : 524288;
        }
        if ((i5 & 128) != 0) {
            i8 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i8 |= composerKN.p5(closeButtonStyle) ? 8388608 : 4194304;
        }
        int i11 = i5 & 256;
        if (i11 != 0) {
            i8 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i8 |= composerKN.p5(modifier) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i5 & 512) != 0) {
            i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
        } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i8 |= composerKN.E2(onPrivacyPolicyLinkClicked) ? 536870912 : 268435456;
        }
        if ((i5 & 1024) != 0) {
            i9 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i9 = i3 | (composerKN.E2(onCloseClicked) ? 4 : 2);
        } else {
            i9 = i3;
        }
        if ((i8 & 306783379) == 306783378 && (i9 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier2 = modifier;
            composer2 = composerKN;
        } else {
            Modifier modifier3 = i11 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.v()) {
                ComposerKt.p5(1685370890, i8, i9, "com.bendingspoons.legal.privacy.ui.settings.internal.TrackerDescriptionDialog (TrackerDescriptionDialog.kt:47)");
            }
            int i12 = i9;
            Modifier modifier4 = modifier3;
            composer2 = composerKN;
            AndroidDialog_androidKt.n(onCloseClicked, null, ComposableLambdaKt.nr(-1644961951, true, new j(modifier4, j2, tracker, titleTextStyle, bodyTextStyle, closeButtonStyle, textStyle, onCloseClicked, subtitleTextStyle, thirdPartyPPLinkTextStyle, onPrivacyPolicyLinkClicked), composerKN, 54), composer2, (i12 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: MuZ.Pl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return eO.t(tracker, j2, titleTextStyle, bodyTextStyle, subtitleTextStyle, thirdPartyPPLinkTextStyle, textStyle, closeButtonStyle, modifier2, onPrivacyPolicyLinkClicked, onCloseClicked, i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Ew ew, long j2, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, R7M.j jVar, Modifier modifier, Function1 function1, Function0 function0, int i2, int i3, int i5, Composer composer, int i7) {
        rl(ew, j2, textStyle, textStyle2, textStyle3, textStyle4, textStyle5, jVar, modifier, function1, function0, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }
}
