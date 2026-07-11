package jEU;

import FXi.l3D;
import HI0.M5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0003R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fRD\u0010*\u001a2\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110&¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00130!8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"LjEU/n;", "LFXi/fuX;", "<init>", "()V", "Landroidx/compose/ui/text/TextStyle;", "E", "(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;", "LFXi/l3D;", "E2", "(Landroidx/compose/runtime/Composer;I)LFXi/l3D;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "iF", "", "Z", "shouldOpenSettings", "LCZF/I28;", "eF", "()LCZF/I28;", "pico", "LK0/n;", "fD", "()LK0/n;", "legal", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "actionKind", "Lpq/Ml;", "info", "e", "()Lkotlin/jvm/functions/Function2;", "trackEvent", "S", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlightPrivacyBannerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlightPrivacyBannerFragment.kt\ncom/alightcreative/privacy/ui/AlightPrivacyBannerFragment\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,116:1\n113#2:117\n*S KotlinDebug\n*F\n+ 1 AlightPrivacyBannerFragment.kt\ncom/alightcreative/privacy/ui/AlightPrivacyBannerFragment\n*L\n62#1:117\n*E\n"})
public final class n extends qz {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f69357g = 8;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean shouldOpenSettings;

    /* JADX INFO: renamed from: jEU.n$n, reason: collision with other inner class name */
    static final class C0985n implements Function2 {

        /* JADX INFO: renamed from: jEU.n$n$j */
        static final class j implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ n f69360n;

            j(n nVar) {
                this.f69360n = nVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1624533955, i2, -1, "com.alightcreative.privacy.ui.AlightPrivacyBannerFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (AlightPrivacyBannerFragment.kt:87)");
                }
                this.f69360n.nY(null, composer, 0, 1);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        C0985n() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1643674351, i2, -1, "com.alightcreative.privacy.ui.AlightPrivacyBannerFragment.onCreateView.<anonymous>.<anonymous> (AlightPrivacyBannerFragment.kt:86)");
            }
            rPd.n.rl(ComposableLambdaKt.nr(1624533955, true, new j(n.this), composer, 54), composer, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    @Override // FXi.fuX
    protected void T() {
        this.shouldOpenSettings = true;
        iF();
    }

    private final TextStyle E(TextStyle textStyle) {
        return TextStyle.t(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.nr(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16773119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M7(n nVar, String actionKind, pq.Ml info) {
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(info, "info");
        jgV.Wre.n(nVar.eF(), actionKind, info);
        return Unit.INSTANCE;
    }

    @Override // FXi.fuX
    protected l3D E2(Composer composer, int i2) {
        composer.eF(1588124675);
        if (ComposerKt.v()) {
            ComposerKt.p5(1588124675, i2, -1, "com.alightcreative.privacy.ui.AlightPrivacyBannerFragment.getStyle (AlightPrivacyBannerFragment.kt:58)");
        }
        Fo.j jVarT = Fo.n.t();
        float f3 = 20;
        PaddingValues paddingValuesO = PaddingKt.O(Dp.KN(f3), Dp.KN(10), Dp.KN(f3), 0.0f, 8, null);
        TextStyle textStyleT = TextStyle.t(jVarT.fD(), aD.w6.K(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        TextStyle textStyleT2 = TextStyle.t(jVarT.v(), aD.w6.K(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        TextStyle textStyleE = E(TextStyle.t(jVarT.N(), aD.w6.K(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
        Dj7.CN3 cn3 = Dj7.CN3.f1597n;
        TextStyle textStyleO = Dj7.fuX.O(cn3, composer, 6);
        long jK = aD.w6.K();
        TextAlign.Companion companion = TextAlign.INSTANCE;
        l3D l3d = new l3D(2131232196, 0, null, textStyleT, null, null, null, textStyleT2, textStyleE, TextStyle.t(textStyleO, jK, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion.n(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), null, E(TextStyle.t(H9N.j.f3810n.rl(composer, 6).X(), aD.w6.K(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion.n(), 0, 0L, null, null, null, 0, 0, null, 16744446, null)), Dj7.fuX.J2(cn3, null, null, null, null, null, composer, 6, 31), null, Dj7.fuX.J2(Dj7.CN3.f1593O, null, null, null, null, null, composer, 6, 31), null, Color.INSTANCE.KN(), Color.az(aD.w6.K(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, false, paddingValuesO, null, false, false, 31237238, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return l3d;
    }

    @Override // FXi.fuX
    protected Function2 e() {
        return new Function2() { // from class: jEU.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return n.M7(this.f69355n, (String) obj, (pq.Ml) obj2);
            }
        };
    }

    @Override // FXi.fuX
    protected void iF() {
        FragmentKt.n(this, "requestPrivacyBanner", BundleKt.n(TuplesKt.to("resultPrivacyBannerKeyOpenSettings", Boolean.valueOf(this.shouldOpenSettings))));
    }

    @Override // FXi.fuX, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            M5.n(window, 0, activity.getColor(2131099665), true);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.rl(1643674351, true, new C0985n()));
        return composeView;
    }

    private final CZF.I28 eF() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ((rkP.j) OM5.n.n(contextRequireContext, rkP.j.class)).nr();
    }

    @Override // FXi.fuX
    protected K0.n fD() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ((rkP.j) OM5.n.n(contextRequireContext, rkP.j.class)).n();
    }
}
