package GW;

import GW.fuX;
import GW.n;
import GW.r;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.FlowLiveDataConversions;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.FlowExtKt;
import androidx.view.viewmodel.CreationExtras;
import com.alightcreative.app.motion.activities.main.MainActivity;
import com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem;
import com.alightcreative.app.motion.templates.Template;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 22\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00067²\u0006\u000e\u00105\u001a\u0004\u0018\u0001048\nX\u008a\u0084\u0002²\u0006\u000e\u00106\u001a\u0004\u0018\u00010$8\nX\u008a\u0084\u0002"}, d2 = {"LGW/fuX;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroidx/media3/exoplayer/ExoPlayer;", "N", "()Landroidx/media3/exoplayer/ExoPlayer;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/alightcreative/app/motion/templates/Template;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62175h, "Landroidx/media3/common/Player;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Lcom/alightcreative/app/motion/templates/Template;)Landroidx/media3/common/Player;", "player", "", "bzg", "(Landroidx/media3/common/Player;)V", "", "o", "Lkotlin/Lazy;", "wTp", "()Ljava/lang/String;", "selectedTemplateId", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;", "Z", "s7N", "()Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;", "selectedFilter", "", "S", "nHg", "()I", "pagesLoaded", "LGW/r;", "g", "v", "()LGW/r;", "viewModel", "", "E2", "Ljava/util/List;", "playerPool", "e", "j", "LGW/nKK;", "state", "startIndex", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReelsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReelsFragment.kt\ncom/alightcreative/app/motion/activities/main/templatepreview/reels/ReelsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,163:1\n106#2,15:164\n*S KotlinDebug\n*F\n+ 1 ReelsFragment.kt\ncom/alightcreative/app/motion/activities/main/templatepreview/reels/ReelsFragment\n*L\n50#1:164,15\n*E\n"})
public final class fuX extends j {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final List playerPool;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f3603X = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy selectedTemplateId = LazyKt.lazy(new Function0() { // from class: GW.w6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return fuX.jB(this.f3689n);
        }
    });

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final Lazy selectedFilter = LazyKt.lazy(new Function0() { // from class: GW.Ml
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return fuX.Xw(this.f3559n);
        }
    });

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final Lazy pagesLoaded = LazyKt.lazy(new Function0() { // from class: GW.I28
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(fuX.rV9(this.f3558n));
        }
    });

    public static final class CN3 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f3609n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f3610t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CN3(Fragment fragment, Lazy lazy) {
            super(0);
            this.f3609n = fragment;
            this.f3610t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f3610t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.f3609n.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class I28 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Lazy f3611n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Lazy lazy) {
            super(0);
            this.f3611n = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.O(this.f3611n).getViewModelStore();
        }
    }

    public static final class Ml extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f3612n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Function0 function0) {
            super(0);
            this.f3612n = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f3612n.invoke();
        }
    }

    public static final class Wre extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f3613n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f3614t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Function0 function0, Lazy lazy) {
            super(0);
            this.f3613n = function0;
            this.f3614t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f3613n;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f3614t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t;
        }
    }

    /* JADX INFO: renamed from: GW.fuX$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final fuX n(String selectedTemplateId, TemplateFiltersItem.Content selectedFilter, int i2) {
            Intrinsics.checkNotNullParameter(selectedTemplateId, "selectedTemplateId");
            Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
            fuX fux = new fuX();
            fux.setArguments(BundleKt.n(TuplesKt.to("selected_template_id", selectedTemplateId), TuplesKt.to("selected_filter", selectedFilter), TuplesKt.to("pages_loaded", Integer.valueOf(i2))));
            return fux;
        }
    }

    static final class n implements Function2 {

        /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function1 {
            CN3(Object obj) {
                super(1, obj, fuX.class, "releasePlayer", "releasePlayer(Landroidx/media3/common/Player;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((Player) obj);
                return Unit.INSTANCE;
            }

            public final void n(Player p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((fuX) this.receiver).bzg(p0);
            }
        }

        /* synthetic */ class I28 extends FunctionReferenceImpl implements Function2 {
            I28(Object obj) {
                super(2, obj, r.class, "onCurrentTemplateChanged", "onCurrentTemplateChanged(Ljava/lang/String;Lcom/alightcreative/app/motion/activities/main/templatepreview/reels/ReelsViewModel$SwipeDirection;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n((String) obj, (r.Wre) obj2);
                return Unit.INSTANCE;
            }

            public final void n(String p0, r.Wre wre) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((r) this.receiver).o(p0, wre);
            }
        }

        /* synthetic */ class Ml extends FunctionReferenceImpl implements Function0 {
            Ml(Object obj) {
                super(0, obj, r.class, "onSeeAllSavedClicked", "onSeeAllSavedClicked()V", 0);
            }

            public final void n() {
                ((r) this.receiver).S();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class Wre extends FunctionReferenceImpl implements Function1 {
            Wre(Object obj) {
                super(1, obj, fuX.class, "acquirePlayer", "acquirePlayer(Lcom/alightcreative/app/motion/templates/Template;)Landroidx/media3/common/Player;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Player invoke(Template p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((fuX) this.receiver).T(p0);
            }
        }

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, r.class, "onBackClicked", "onBackClicked()V", 0);
            }

            public final void n() {
                ((r) this.receiver).r();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: GW.fuX$n$n, reason: collision with other inner class name */
        /* synthetic */ class C0127n extends FunctionReferenceImpl implements Function1 {
            C0127n(Object obj) {
                super(1, obj, r.class, "onSaveClicked", "onSaveClicked(Lcom/alightcreative/app/motion/templates/Template;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((Template) obj);
                return Unit.INSTANCE;
            }

            public final void n(Template p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((r) this.receiver).XQ(p0);
            }
        }

        /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {
            w6(Object obj) {
                super(1, obj, r.class, "onUseTemplateClicked", "onUseTemplateClicked(Lcom/alightcreative/app/motion/templates/Template;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((Template) obj);
                return Unit.INSTANCE;
            }

            public final void n(Template p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((r) this.receiver).WPU(p0);
            }
        }

        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(fuX fux, GW.n action) {
            FragmentManager supportFragmentManager;
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.areEqual(action, n.j.f3649n)) {
                fux.getParentFragmentManager().Zmq();
            } else {
                if (action instanceof n.C0128n) {
                    Uri downloadURI = ((n.C0128n) action).n().getDownloadURI();
                    if (downloadURI != null) {
                        FragmentActivity activity = fux.getActivity();
                        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                        if (mainActivity != null) {
                            mainActivity.KN(downloadURI);
                        }
                    }
                } else {
                    if (!Intrinsics.areEqual(action, n.w6.f3651n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FragmentActivity activity2 = fux.getActivity();
                    MainActivity mainActivity2 = activity2 instanceof MainActivity ? (MainActivity) activity2 : null;
                    if (mainActivity2 != null) {
                        mainActivity2.te(M.CN3.f6256g);
                    }
                    FragmentActivity activity3 = fux.getActivity();
                    MainActivity mainActivity3 = activity3 instanceof MainActivity ? (MainActivity) activity3 : null;
                    Fragment fragmentPJg = (mainActivity3 == null || (supportFragmentManager = mainActivity3.getSupportFragmentManager()) == null) ? null : supportFragmentManager.pJg("Templates");
                    f52.I28 i28 = fragmentPJg instanceof f52.I28 ? (f52.I28) fragmentPJg : null;
                    if (i28 != null) {
                        i28.v();
                    }
                    fux.getParentFragmentManager().Zmq();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void t(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-52790513, i2, -1, "com.alightcreative.app.motion.activities.main.templatepreview.reels.ReelsFragment.onCreateView.<anonymous>.<anonymous> (ReelsFragment.kt:68)");
            }
            final State stateRl = FlowExtKt.rl(FlowLiveDataConversions.n(fuX.this.v().t()), null, null, null, null, composer, 48, 14);
            composer.eF(-655478818);
            final fuX fux = fuX.this;
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt.O(new Function0() { // from class: GW.Dsr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return fuX.n.J2(stateRl, fux);
                    }
                });
                composer.o(objIF);
            }
            State state = (State) objIF;
            composer.Xw();
            nKK nkkNr = nr(stateRl);
            List listRl = nkkNr != null ? nkkNr.rl() : null;
            Integer numUo = Uo(state);
            nKK nkkNr2 = nr(stateRl);
            boolean zNr = nkkNr2 != null ? nkkNr2.nr() : false;
            nKK nkkNr3 = nr(stateRl);
            boolean zT2 = nkkNr3 != null ? nkkNr3.t() : false;
            nKK nkkNr4 = nr(stateRl);
            boolean zN = nkkNr4 != null ? nkkNr4.n() : false;
            r rVarV = fuX.this.v();
            composer.eF(-655454990);
            boolean zE2 = composer.E2(rVarV);
            Object objIF2 = composer.iF();
            if (zE2 || objIF2 == companion.n()) {
                objIF2 = new j(rVarV);
                composer.o(objIF2);
            }
            composer.Xw();
            Function0 function0 = (Function0) ((KFunction) objIF2);
            r rVarV2 = fuX.this.v();
            composer.eF(-655453006);
            boolean zE22 = composer.E2(rVarV2);
            Object objIF3 = composer.iF();
            if (zE22 || objIF3 == companion.n()) {
                objIF3 = new C0127n(rVarV2);
                composer.o(objIF3);
            }
            composer.Xw();
            Function1 function1 = (Function1) ((KFunction) objIF3);
            r rVarV3 = fuX.this.v();
            composer.eF(-655450791);
            boolean zE23 = composer.E2(rVarV3);
            Object objIF4 = composer.iF();
            if (zE23 || objIF4 == companion.n()) {
                objIF4 = new w6(rVarV3);
                composer.o(objIF4);
            }
            composer.Xw();
            Function1 function12 = (Function1) ((KFunction) objIF4);
            r rVarV4 = fuX.this.v();
            composer.eF(-655448359);
            boolean zE24 = composer.E2(rVarV4);
            Object objIF5 = composer.iF();
            if (zE24 || objIF5 == companion.n()) {
                objIF5 = new Ml(rVarV4);
                composer.o(objIF5);
            }
            composer.Xw();
            Function0 function02 = (Function0) ((KFunction) objIF5);
            r rVarV5 = fuX.this.v();
            composer.eF(-655445795);
            boolean zE25 = composer.E2(rVarV5);
            Object objIF6 = composer.iF();
            if (zE25 || objIF6 == companion.n()) {
                objIF6 = new I28(rVarV5);
                composer.o(objIF6);
            }
            composer.Xw();
            Function2 function2 = (Function2) ((KFunction) objIF6);
            fuX fux2 = fuX.this;
            composer.eF(-655443479);
            boolean zE26 = composer.E2(fux2);
            Object objIF7 = composer.iF();
            if (zE26 || objIF7 == companion.n()) {
                objIF7 = new Wre(fux2);
                composer.o(objIF7);
            }
            composer.Xw();
            Function1 function13 = (Function1) ((KFunction) objIF7);
            fuX fux3 = fuX.this;
            composer.eF(-655441783);
            boolean zE27 = composer.E2(fux3);
            Object objIF8 = composer.iF();
            if (zE27 || objIF8 == companion.n()) {
                objIF8 = new CN3(fux3);
                composer.o(objIF8);
            }
            composer.Xw();
            l3D.HI(listRl, numUo, zNr, zT2, zN, function0, function1, function12, function02, function2, function13, (Function1) ((KFunction) objIF8), null, composer, 0, 0, 4096);
            r rVarV6 = fuX.this.v();
            composer.eF(-655438413);
            boolean zE28 = composer.E2(fuX.this);
            final fuX fux4 = fuX.this;
            Object objIF9 = composer.iF();
            if (zE28 || objIF9 == companion.n()) {
                objIF9 = new Function1() { // from class: GW.aC
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return fuX.n.O(fux4, (n) obj);
                    }
                };
                composer.o(objIF9);
            }
            composer.Xw();
            uW.I28.rl(rVarV6, (Function1) objIF9, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Integer J2(State state, fuX fux) {
            List listRl;
            nKK nkkNr = nr(state);
            Integer num = null;
            if (nkkNr == null || (listRl = nkkNr.rl()) == null) {
                return null;
            }
            Iterator it = listRl.iterator();
            int iIntValue = 0;
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual(((Template) it.next()).getTemplateId(), fux.wTp())) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
            if (num != null) {
                iIntValue = num.intValue();
            }
            return Integer.valueOf(iIntValue);
        }

        private static final Integer Uo(State state) {
            return (Integer) state.getValue();
        }

        private static final nKK nr(State state) {
            return (nKK) state.getValue();
        }
    }

    public static final class w6 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f3616n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Fragment fragment) {
            super(0);
            this.f3616n = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f3616n;
        }
    }

    private final ExoPlayer N() {
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(requireContext()).build();
        Intrinsics.checkNotNullExpressionValue(exoPlayerBuild, "build(...)");
        exoPlayerBuild.setRepeatMode(2);
        exoPlayerBuild.setPlayWhenReady(true);
        return exoPlayerBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModel P5(fuX fux, r.I28 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.n(fux.s7N(), fux.nHg());
    }

    private final int nHg() {
        return ((Number) this.pagesLoaded.getValue()).intValue();
    }

    private final TemplateFiltersItem.Content s7N() {
        return (TemplateFiltersItem.Content) this.selectedFilter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r v() {
        return (r) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String wTp() {
        return (String) this.selectedTemplateId.getValue();
    }

    public final Player T(Template template) {
        Intrinsics.checkNotNullParameter(template, "template");
        if (template.getVideoUrl().length() == 0) {
            return null;
        }
        Player playerN = (Player) XoT.qz.n(this.playerPool);
        if (playerN == null) {
            playerN = N();
        }
        playerN.setMediaItem(MediaItem.fromUri(template.getVideoUrl()));
        playerN.prepare();
        return playerN;
    }

    public final void bzg(Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.stop();
        player.clearMediaItems();
        this.playerPool.add(player);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.rl(-52790513, true, new n()));
        return composeView;
    }

    public fuX() {
        Function0 function0 = new Function0() { // from class: GW.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.U(this.f3586n);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Ml(new w6(this)));
        this.viewModel = FragmentViewModelLazyKt.t(this, Reflection.getOrCreateKotlinClass(r.class), new I28(lazy), new Wre(function0, lazy), new CN3(this, lazy));
        this.playerPool = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreationExtras U(final fuX fux) {
        CreationExtras defaultViewModelCreationExtras = fux.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
        return GR.j.rl(defaultViewModelCreationExtras, new Function1() { // from class: GW.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.P5(this.f3554n, (r.I28) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TemplateFiltersItem.Content Xw(fuX fux) {
        TemplateFiltersItem.Content content = (TemplateFiltersItem.Content) fux.requireArguments().getParcelable("selected_filter");
        if (content == null) {
            return TemplateFiltersItem.Content.AllTemplates.f45446O;
        }
        return content;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String jB(fuX fux) {
        String string = fux.requireArguments().getString("selected_template_id");
        if (string == null) {
            return "";
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rV9(fuX fux) {
        return fux.requireArguments().getInt("pages_loaded");
    }
}
