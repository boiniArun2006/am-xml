package FXi;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H$¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0010H$¢\u0006\u0004\b\u001a\u0010\u0003J\u0019\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0005¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8$X¤\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'RD\u00101\u001a2\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110-¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00100)8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"LFXi/fuX;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "LFXi/l3D;", "E2", "(Landroidx/compose/runtime/Composer;I)LFXi/l3D;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "N", "nHg", "s7N", "wTp", "", "url", "v", "(Ljava/lang/String;)V", "iF", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/Modifier;", "modifier", "nY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LFXi/c;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Lkotlin/Lazy;", "X", "()LFXi/c;", "viewModel", "LK0/n;", "fD", "()LK0/n;", "legal", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "actionKind", "Lpq/Ml;", "info", "e", "()Lkotlin/jvm/functions/Function2;", "trackEvent", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrivacyBannerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyBannerFragment.kt\ncom/bendingspoons/legal/privacy/ui/banner/PrivacyBannerFragment\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,99:1\n1225#2,6:100\n1225#2,6:106\n1225#2,6:112\n1225#2,6:118\n1225#2,6:124\n1225#2,6:130\n1225#2,6:136\n*S KotlinDebug\n*F\n+ 1 PrivacyBannerFragment.kt\ncom/bendingspoons/legal/privacy/ui/banner/PrivacyBannerFragment\n*L\n88#1:100,6\n89#1:106,6\n91#1:112,6\n92#1:118,6\n93#1:124,6\n94#1:130,6\n90#1:136,6\n*E\n"})
public abstract class fuX extends Fragment {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = LazyKt.lazy(new Function0() { // from class: FXi.CN3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return fuX.rV9(this.f2633n);
        }
    });

    static final class CN3 implements Function2 {
        CN3() {
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
                ComposerKt.p5(1002801459, i2, -1, "com.bendingspoons.legal.privacy.ui.banner.PrivacyBannerFragment.onCreateView.<anonymous>.<anonymous> (PrivacyBannerFragment.kt:45)");
            }
            fuX.this.nY(null, composer, 0, 1);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function0 {
        I28(Object obj) {
            super(0, obj, fuX.class, "onCloseClicked", "onCloseClicked()V", 0);
        }

        public final void n() {
            ((fuX) this.receiver).nHg();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function0 {
        Ml(Object obj) {
            super(0, obj, fuX.class, "onAcceptAllClicked", "onAcceptAllClicked()V", 0);
        }

        public final void n() {
            ((fuX) this.receiver).N();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class Wre extends FunctionReferenceImpl implements Function0 {
        Wre(Object obj) {
            super(0, obj, fuX.class, "onCustomizeClicked", "onCustomizeClicked()V", 0);
        }

        public final void n() {
            ((fuX) this.receiver).s7N();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
        j(Object obj) {
            super(0, obj, fuX.class, "navigateToPrivacySettings", "navigateToPrivacySettings()V", 0);
        }

        public final void n() {
            ((fuX) this.receiver).T();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
        n(Object obj) {
            super(0, obj, fuX.class, MRAIDPresenter.CLOSE, "close()V", 0);
        }

        public final void n() {
            ((fuX) this.receiver).iF();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
        w6(Object obj) {
            super(0, obj, fuX.class, "onPrivacyPolicyLinkClicked", "onPrivacyPolicyLinkClicked()V", 0);
        }

        public final void n() {
            ((fuX) this.receiver).wTp();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    protected void N() {
    }

    protected abstract void T();

    protected abstract Function2 e();

    protected abstract K0.n fD();

    protected abstract void iF();

    protected void nHg() {
    }

    protected void s7N() {
    }

    protected void wTp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(fuX fux, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        fux.nY(modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1350c rV9(fuX fux) {
        return new C1350c(fux.fD(), fux.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit te(fuX fux, String url, Context context) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "<unused var>");
        fux.v(url);
        return Unit.INSTANCE;
    }

    protected C1350c X() {
        return (C1350c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void nY(Modifier modifier, Composer composer, final int i2, final int i3) {
        final Modifier modifier2;
        int i5;
        Composer composerKN = composer.KN(-3291494);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(this) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            Modifier modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(-3291494, i5, -1, "com.bendingspoons.legal.privacy.ui.banner.PrivacyBannerFragment.BaseComposable (PrivacyBannerFragment.kt:83)");
            }
            int i8 = i5;
            Modifier modifier4 = modifier3;
            C1350c c1350cX = X();
            l3D l3dE2 = E2(composerKN, (i8 >> 3) & 14);
            composerKN.eF(-819428554);
            boolean zE2 = composerKN.E2(this);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(this);
                composerKN.o(objIF);
            }
            KFunction kFunction = (KFunction) objIF;
            composerKN.Xw();
            composerKN.eF(-819426782);
            boolean zE22 = composerKN.E2(this);
            Object objIF2 = composerKN.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new n(this);
                composerKN.o(objIF2);
            }
            KFunction kFunction2 = (KFunction) objIF2;
            composerKN.Xw();
            composerKN.eF(-819422985);
            boolean zE23 = composerKN.E2(this);
            Object objIF3 = composerKN.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new w6(this);
                composerKN.o(objIF3);
            }
            KFunction kFunction3 = (KFunction) objIF3;
            composerKN.Xw();
            composerKN.eF(-819420977);
            boolean zE24 = composerKN.E2(this);
            Object objIF4 = composerKN.iF();
            if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Ml(this);
                composerKN.o(objIF4);
            }
            KFunction kFunction4 = (KFunction) objIF4;
            composerKN.Xw();
            composerKN.eF(-819419349);
            boolean zE25 = composerKN.E2(this);
            Object objIF5 = composerKN.iF();
            if (zE25 || objIF5 == Composer.INSTANCE.n()) {
                objIF5 = new I28(this);
                composerKN.o(objIF5);
            }
            KFunction kFunction5 = (KFunction) objIF5;
            composerKN.Xw();
            composerKN.eF(-819417713);
            boolean zE26 = composerKN.E2(this);
            Object objIF6 = composerKN.iF();
            if (zE26 || objIF6 == Composer.INSTANCE.n()) {
                objIF6 = new Wre(this);
                composerKN.o(objIF6);
            }
            KFunction kFunction6 = (KFunction) objIF6;
            composerKN.Xw();
            Function0 function0 = (Function0) kFunction;
            Function0 function02 = (Function0) kFunction2;
            composerKN.eF(-819425474);
            boolean zE27 = composerKN.E2(this);
            Object objIF7 = composerKN.iF();
            if (zE27 || objIF7 == Composer.INSTANCE.n()) {
                objIF7 = new Function2() { // from class: FXi.I28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return fuX.te(this.f2634n, (String) obj, (Context) obj2);
                    }
                };
                composerKN.o(objIF7);
            }
            composerKN.Xw();
            QJ.mUb(c1350cX, l3dE2, modifier4, function0, function02, (Function2) objIF7, (Function0) kFunction4, (Function0) kFunction6, (Function0) kFunction5, (Function0) kFunction3, composerKN, (i8 << 6) & 896, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: FXi.Wre
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return fuX.g(this.f2639n, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.rl(1002801459, true, new CN3()));
        return composeView;
    }

    protected void v(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Yd.CN3.rl(url, contextRequireContext);
    }

    protected l3D E2(Composer composer, int i2) {
        composer.eF(947251783);
        if (ComposerKt.v()) {
            ComposerKt.p5(947251783, i2, -1, "com.bendingspoons.legal.privacy.ui.banner.PrivacyBannerFragment.getStyle (PrivacyBannerFragment.kt:37)");
        }
        l3D l3d = new l3D(null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, 0L, 0L, false, null, null, false, false, 33554431, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return l3d;
    }
}
