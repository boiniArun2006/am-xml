package SFf;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001fH\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0014¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u001fH\u0015¢\u0006\u0004\b)\u0010'J\u000f\u0010*\u001a\u00020\u001fH\u0014¢\u0006\u0004\b*\u0010'J\u0017\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u0006H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u0006H\u0014¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u001fH\u0015¢\u0006\u0004\b/\u0010'J\u0017\u00101\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0002H$¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\u001f2\b\b\u0002\u00104\u001a\u000203H\u0005¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010<R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00108R\u001b\u0010F\u001a\u00020A8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8$X¤\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IRD\u0010R\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110O¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u001f0K8$X¤\u0004¢\u0006\u0006\u001a\u0004\bB\u0010Q¨\u0006S"}, d2 = {"LSFf/o;", "Landroidx/fragment/app/Fragment;", "", "showAcceptAllButton", "showDeclineAllButton", "showPrivacyCopy", "", "technicalTitle", "technicalDescription", "analyticsTitle", "analyticsDescription", "profilingTitle", "profilingDescription", "isIntroConsent", "<init>", "(ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "LSFf/g9s;", "E2", "(Landroidx/compose/runtime/Composer;I)LSFf/g9s;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LPr/Ml;", "category", "allowed", "", "N", "(LPr/Ml;Z)V", "LSFf/Ew;", "tracker", "bzg", "(LSFf/Ew;Z)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()V", "s7N", "v", "wTp", "url", "rV9", "(Ljava/lang/String;)V", "Xw", "nHg", "didSaveChanges", "iF", "(Z)V", "Landroidx/compose/ui/Modifier;", "modifier", "nY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Z", "t", "O", "J2", "Ljava/lang/String;", "r", "o", "S", "g", "LSFf/afx;", "e", "Lkotlin/Lazy;", "X", "()LSFf/afx;", "viewModel", "LK0/n;", "fD", "()LK0/n;", "legal", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "actionKind", "Lpq/Ml;", "info", "()Lkotlin/jvm/functions/Function2;", "trackEvent", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrivacySettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacySettingsFragment.kt\ncom/bendingspoons/legal/privacy/ui/settings/PrivacySettingsFragment\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,160:1\n1225#2,6:161\n1225#2,6:167\n1225#2,6:173\n1225#2,6:179\n1225#2,6:185\n1225#2,6:191\n1225#2,6:197\n1225#2,6:203\n*S KotlinDebug\n*F\n+ 1 PrivacySettingsFragment.kt\ncom/bendingspoons/legal/privacy/ui/settings/PrivacySettingsFragment\n*L\n139#1:161,6\n140#1:167,6\n141#1:173,6\n142#1:179,6\n143#1:185,6\n144#1:191,6\n145#1:197,6\n146#1:203,6\n*E\n"})
public abstract class o extends Fragment {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final boolean isIntroConsent;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final String technicalTitle;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean showPrivacyCopy;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final String profilingTitle;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final String analyticsDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String profilingDescription;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean showAcceptAllButton;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String analyticsTitle;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final String technicalDescription;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean showDeclineAllButton;

    /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function2 {
        CN3(Object obj) {
            super(2, obj, o.class, "onTrackerToggled", "onTrackerToggled(Lcom/bendingspoons/legal/privacy/ui/settings/TrackerListItem;Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Ew) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void n(Ew p0, boolean z2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((o) this.receiver).bzg(p0, z2);
        }
    }

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function0 {
        I28(Object obj) {
            super(0, obj, o.class, "onDeclineAllClicked", "onDeclineAllClicked()V", 0);
        }

        public final void n() {
            ((o) this.receiver).s7N();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function2 {
        Ml(Object obj) {
            super(2, obj, o.class, "onCategoryToggled", "onCategoryToggled(Lcom/bendingspoons/legal/privacy/TrackingCategory;Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Pr.Ml) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void n(Pr.Ml p0, boolean z2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((o) this.receiver).N(p0, z2);
        }
    }

    /* synthetic */ class Wre extends FunctionReferenceImpl implements Function1 {
        Wre(Object obj) {
            super(1, obj, o.class, "onThirdPartyPPLinkClicked", "onThirdPartyPPLinkClicked(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((String) obj);
            return Unit.INSTANCE;
        }

        public final void n(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((o) this.receiver).rV9(p0);
        }
    }

    static final class fuX implements Function2 {
        fuX() {
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
                ComposerKt.p5(482449546, i2, -1, "com.bendingspoons.legal.privacy.ui.settings.PrivacySettingsFragment.onCreateView.<anonymous>.<anonymous> (PrivacySettingsFragment.kt:63)");
            }
            o.this.nY(null, composer, 0, 1);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
        j(Object obj) {
            super(1, obj, o.class, MRAIDPresenter.CLOSE, "close(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void n(boolean z2) {
            ((o) this.receiver).iF(z2);
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
        n(Object obj) {
            super(0, obj, o.class, "onAcceptAllClicked", "onAcceptAllClicked()V", 0);
        }

        public final void n() {
            ((o) this.receiver).T();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
        w6(Object obj) {
            super(0, obj, o.class, "onPrivacyPolicyLinkClicked", "onPrivacyPolicyLinkClicked()V", 0);
        }

        public final void n() {
            ((o) this.receiver).wTp();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    public o() {
        this(false, false, false, null, null, null, null, null, null, false, 1023, null);
    }

    public static void safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(Fragment p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    protected void N(Pr.Ml category, boolean allowed) {
        Intrinsics.checkNotNullParameter(category, "category");
    }

    protected void T() {
    }

    protected void bzg(Ew tracker, boolean allowed) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    protected abstract Function2 e();

    protected abstract K0.n fD();

    protected abstract void iF(boolean didSaveChanges);

    protected void rV9(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    protected void s7N() {
    }

    protected void wTp() {
    }

    public /* synthetic */ o(boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, String str6, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? true : z3, (i2 & 4) != 0 ? true : z4, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? false : z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(o oVar, String url, Context context) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "<unused var>");
        oVar.Xw(url);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afx jB(o oVar) {
        return new afx(oVar.fD(), oVar.e(), oVar.isIntroConsent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit te(o oVar, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        oVar.nY(modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    protected afx X() {
        return (afx) this.viewModel.getValue();
    }

    protected void Xw(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(this, new Intent("android.intent.action.VIEW", Uri.parse(url)));
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void nY(Modifier modifier, Composer composer, final int i2, final int i3) {
        final Modifier modifier2;
        int i5;
        g9s g9sVar;
        Composer composer2;
        Composer composerKN = composer.KN(-544609103);
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
            composer2 = composerKN;
        } else {
            if (i7 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-544609103, i5, -1, "com.bendingspoons.legal.privacy.ui.settings.PrivacySettingsFragment.BaseComposable (PrivacySettingsFragment.kt:134)");
            }
            afx afxVarX = X();
            g9s g9sVarE2 = E2(composerKN, (i5 >> 3) & 14);
            composerKN.eF(2124401588);
            boolean zE2 = composerKN.E2(this);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(this);
                composerKN.o(objIF);
            }
            KFunction kFunction = (KFunction) objIF;
            composerKN.Xw();
            composerKN.eF(2124402945);
            boolean zE22 = composerKN.E2(this);
            Object objIF2 = composerKN.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new n(this);
                composerKN.o(objIF2);
            }
            KFunction kFunction2 = (KFunction) objIF2;
            composerKN.Xw();
            composerKN.eF(2124404969);
            boolean zE23 = composerKN.E2(this);
            Object objIF3 = composerKN.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new w6(this);
                composerKN.o(objIF3);
            }
            KFunction kFunction3 = (KFunction) objIF3;
            composerKN.Xw();
            composerKN.eF(2124406944);
            boolean zE24 = composerKN.E2(this);
            Object objIF4 = composerKN.iF();
            if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Ml(this);
                composerKN.o(objIF4);
            }
            KFunction kFunction4 = (KFunction) objIF4;
            composerKN.Xw();
            composerKN.eF(2124408706);
            boolean zE25 = composerKN.E2(this);
            Object objIF5 = composerKN.iF();
            if (zE25 || objIF5 == Composer.INSTANCE.n()) {
                objIF5 = new I28(this);
                composerKN.o(objIF5);
            }
            KFunction kFunction5 = (KFunction) objIF5;
            composerKN.Xw();
            composerKN.eF(2124410728);
            boolean zE26 = composerKN.E2(this);
            Object objIF6 = composerKN.iF();
            if (zE26 || objIF6 == Composer.INSTANCE.n()) {
                objIF6 = new Wre(this);
                composerKN.o(objIF6);
            }
            KFunction kFunction6 = (KFunction) objIF6;
            composerKN.Xw();
            composerKN.eF(2124412639);
            boolean zE27 = composerKN.E2(this);
            Object objIF7 = composerKN.iF();
            if (zE27 || objIF7 == Composer.INSTANCE.n()) {
                objIF7 = new CN3(this);
                composerKN.o(objIF7);
            }
            KFunction kFunction7 = (KFunction) objIF7;
            composerKN.Xw();
            int i8 = i5;
            boolean z2 = this.showAcceptAllButton;
            boolean z3 = this.showDeclineAllButton;
            boolean z4 = this.showPrivacyCopy;
            String str = this.technicalTitle;
            String str2 = this.technicalDescription;
            String str3 = this.analyticsTitle;
            String str4 = this.analyticsDescription;
            String str5 = this.profilingTitle;
            String str6 = this.profilingDescription;
            Function1 function1 = (Function1) kFunction;
            composerKN.eF(2124414288);
            boolean zE28 = composerKN.E2(this);
            Object objIF8 = composerKN.iF();
            if (zE28) {
                g9sVar = g9sVarE2;
            } else {
                g9sVar = g9sVarE2;
                if (objIF8 == Composer.INSTANCE.n()) {
                }
                composerKN.Xw();
                composer2 = composerKN;
                ci.ty(afxVarX, g9sVar, modifier2, z2, z3, z4, str, str2, str3, str4, str5, str6, function1, (Function2) objIF8, (Function2) kFunction4, (Function2) kFunction7, (Function0) kFunction2, (Function0) kFunction5, (Function0) kFunction3, (Function1) kFunction6, composer2, (i8 << 6) & 896, 0, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
            objIF8 = new Function2() { // from class: SFf.aC
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.g(this.f8985n, (String) obj, (Context) obj2);
                }
            };
            composerKN.o(objIF8);
            composerKN.Xw();
            composer2 = composerKN;
            ci.ty(afxVarX, g9sVar, modifier2, z2, z3, z4, str, str2, str3, str4, str5, str6, function1, (Function2) objIF8, (Function2) kFunction4, (Function2) kFunction7, (Function0) kFunction2, (Function0) kFunction5, (Function0) kFunction3, (Function1) kFunction6, composer2, (i8 << 6) & 896, 0, 0);
            if (ComposerKt.v()) {
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: SFf.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.te(this.f8945n, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
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
        composeView.setContent(ComposableLambdaKt.rl(482449546, true, new fuX()));
        return composeView;
    }

    public o(boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, String str6, boolean z5) {
        this.showAcceptAllButton = z2;
        this.showDeclineAllButton = z3;
        this.showPrivacyCopy = z4;
        this.technicalTitle = str;
        this.technicalDescription = str2;
        this.analyticsTitle = str3;
        this.analyticsDescription = str4;
        this.profilingTitle = str5;
        this.profilingDescription = str6;
        this.isIntroConsent = z5;
        this.viewModel = LazyKt.lazy(new Function0() { // from class: SFf.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.jB(this.f8967n);
            }
        });
    }

    protected g9s E2(Composer composer, int i2) {
        composer.eF(-2041634873);
        if (ComposerKt.v()) {
            ComposerKt.p5(-2041634873, i2, -1, "com.bendingspoons.legal.privacy.ui.settings.PrivacySettingsFragment.getStyle (PrivacySettingsFragment.kt:55)");
        }
        g9s g9sVar = new g9s(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0.0f, 0.0f, null, null, 0.0f, null, Integer.MAX_VALUE, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return g9sVar;
    }

    protected void nHg() {
        X().WPU();
    }

    protected void v() {
        X().g();
    }
}
