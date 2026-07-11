package Fl;

import Fl.CN3;
import Fl.eO;
import Fl.s4;
import HI0.M5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.ViewModelStoreOwner;
import androidx.view.viewmodel.CreationExtras;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0005\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"LFl/Wre;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "LFl/z;", "viewModel", "", "E2", "(LFl/z;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "o", "Lkotlin/Lazy;", "v", "()LFl/z;", "", "rV9", "()Z", "isKoreanFlow", "Z", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPPTOSFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PPTOSFragment.kt\ncom/alightcreative/pptos/ui/PPTOSFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,326:1\n106#2,15:327\n1247#3,6:342\n1247#3,6:348\n1247#3,6:354\n*S KotlinDebug\n*F\n+ 1 PPTOSFragment.kt\ncom/alightcreative/pptos/ui/PPTOSFragment\n*L\n66#1:327,15\n124#1:342,6\n125#1:348,6\n128#1:354,6\n*E\n"})
public final class Wre extends j {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f3078S = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f3080g = MapsKt.mapOf(TuplesKt.to("tos_link", "https://alightcreative.com/tos/"), TuplesKt.to("privacy_link", "https://alightcreative.com/privacy/"));

    public static final class CN3 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f3082n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f3083t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CN3(Function0 function0, Lazy lazy) {
            super(0);
            this.f3082n = function0;
            this.f3083t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f3082n;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f3083t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t;
        }
    }

    public static final class I28 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f3084n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Function0 function0) {
            super(0);
            this.f3084n = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f3084n.invoke();
        }
    }

    public static final class Ml extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f3085n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Fragment fragment) {
            super(0);
            this.f3085n = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f3085n;
        }
    }

    /* JADX INFO: renamed from: Fl.Wre$Wre, reason: collision with other inner class name */
    public static final class C0108Wre extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Lazy f3086n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0108Wre(Lazy lazy) {
            super(0);
            this.f3086n = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.O(this.f3086n).getViewModelStore();
        }
    }

    public static final class fuX extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f3087n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f3088t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public fuX(Fragment fragment, Lazy lazy) {
            super(0);
            this.f3087n = fragment;
            this.f3088t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f3088t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.f3087n.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: Fl.Wre$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Wre rl(boolean z2) {
            Wre wre = new Wre();
            Bundle bundle = new Bundle();
            bundle.putBoolean("keyIsKoreanFlow", z2);
            wre.setArguments(bundle);
            return wre;
        }

        public final Map n() {
            return Wre.f3080g;
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
        n(Object obj) {
            super(0, obj, z.class, "onAcceptButtonClicked", "onAcceptButtonClicked()V", 0);
        }

        public final void n() {
            ((z) this.receiver).r();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    static final class w6 implements Function2 {
        w6() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws ParseException {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) throws ParseException {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-720145665, i2, -1, "com.alightcreative.pptos.ui.PPTOSFragment.onCreateView.<anonymous>.<anonymous> (PPTOSFragment.kt:81)");
            }
            Wre wre = Wre.this;
            wre.E2(wre.v(), composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2(final z zVar, Composer composer, final int i2) throws ParseException {
        int i3;
        String strNr;
        String strT;
        String strReplace$default;
        String strReplace$default2;
        Composer composerKN = composer.KN(87328740);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerKN.p5(zVar) : composerKN.E2(zVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(87328740, i3, -1, "com.alightcreative.pptos.ui.PPTOSFragment.PPTOSFragmentContent (PPTOSFragment.kt:87)");
            }
            boolean z2 = false;
            s4 s4Var = (s4) LiveDataAdapterKt.n(zVar.t(), composerKN, 0).getValue();
            if (!(s4Var instanceof s4.j)) {
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: Fl.n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Wre.e(this.f3107n, zVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (rV9()) {
                composerKN.eF(-1924026568);
                strNr = StringResources_androidKt.t(2132019449, composerKN, 6);
                strT = StringResources_androidKt.t(2132019943, composerKN, 6);
                composerKN.Xw();
            } else {
                composerKN.eF(-1923820759);
                s4.j jVar = (s4.j) s4Var;
                eO eOVarN = jVar.n();
                if (Intrinsics.areEqual(eOVarN, eO.j.f3095n)) {
                    composerKN.eF(-1923775003);
                    strNr = StringResources_androidKt.t(2132019941, composerKN, 6);
                    strT = StringResources_androidKt.t(2132019943, composerKN, 6);
                    composerKN.Xw();
                } else {
                    if (!(eOVarN instanceof eO.n)) {
                        composerKN.eF(-893342303);
                        composerKN.Xw();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerKN.eF(-1923497646);
                    Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-01");
                    Intrinsics.checkNotNull(date);
                    DateFormat dateInstance = DateFormat.getDateInstance(1);
                    String strN = ((eO.n) jVar.n()).n();
                    if (strN == null || (strReplace$default = StringsKt.replace$default(strN, "{tos}", "{tos_link}", false, 4, (Object) null)) == null || (strReplace$default2 = StringsKt.replace$default(strReplace$default, "{/tos}", "{/tos_link}", false, 4, (Object) null)) == null) {
                        strNr = null;
                    } else {
                        strNr = String.format(strReplace$default2, Arrays.copyOf(new Object[]{dateInstance.format(date)}, 1));
                        Intrinsics.checkNotNullExpressionValue(strNr, "format(...)");
                    }
                    composerKN.eF(-893317599);
                    if (strNr == null) {
                        strNr = StringResources_androidKt.nr(2132019942, new Object[]{dateInstance.format(date)}, composerKN, 6);
                    }
                    composerKN.Xw();
                    strT = StringResources_androidKt.t(2132019940, composerKN, 6);
                    composerKN.Xw();
                }
                composerKN.Xw();
            }
            composerKN.eF(-893303913);
            int i5 = i3 & 14;
            boolean z3 = i5 == 4 || ((i3 & 8) != 0 && composerKN.E2(zVar));
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function2() { // from class: Fl.w6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Wre.X(zVar, (Context) obj, (String) obj2);
                    }
                };
                composerKN.o(objIF);
            }
            Function2 function2 = (Function2) objIF;
            composerKN.Xw();
            composerKN.eF(-893300962);
            if (i5 == 4 || ((i3 & 8) != 0 && composerKN.E2(zVar))) {
                z2 = true;
            }
            Object objIF2 = composerKN.iF();
            if (z2 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new n(zVar);
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            Pl.qie(strNr, strT, function2, (Function0) ((KFunction) objIF2), composerKN, 0);
            composerKN.eF(-893298276);
            boolean zE2 = composerKN.E2(this);
            Object objIF3 = composerKN.iF();
            if (zE2 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function1() { // from class: Fl.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Wre.T(this.f3071n, (CN3) obj);
                    }
                };
                composerKN.o(objIF3);
            }
            composerKN.Xw();
            uW.I28.rl(zVar, (Function1) objIF3, composerKN, i5);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh2 = composerKN.gh();
        if (scopeUpdateScopeGh2 != null) {
            scopeUpdateScopeGh2.n(new Function2() { // from class: Fl.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wre.N(this.f3069n, zVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Wre wre, z zVar, int i2, Composer composer, int i3) throws ParseException {
        wre.E2(zVar, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(Wre wre, Fl.CN3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof CN3.j)) {
            throw new NoWhenBranchMatchedException();
        }
        FragmentKt.n(wre, "requestPPTOS", BundleKt.n(TuplesKt.to("resultPPTOSKey", Boolean.TRUE)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(z zVar, Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        zVar.o(context, url);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Wre wre, z zVar, int i2, Composer composer, int i3) throws ParseException {
        wre.E2(zVar, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z v() {
        return (z) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            M5.rl(window, 0, activity.getColor(2131099665), false, 4, null);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.rl);
        composeView.setContent(ComposableLambdaKt.rl(-720145665, true, new w6()));
        return composeView;
    }

    public Wre() {
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new I28(new Ml(this)));
        this.viewModel = FragmentViewModelLazyKt.t(this, Reflection.getOrCreateKotlinClass(z.class), new C0108Wre(lazy), new CN3(null, lazy), new fuX(this, lazy));
    }

    private final boolean rV9() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        return arguments.getBoolean("keyIsKoreanFlow", false);
    }
}
