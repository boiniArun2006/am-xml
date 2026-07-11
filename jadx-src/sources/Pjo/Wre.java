package Pjo;

import GJW.vd;
import Pjo.QJ;
import Pjo.Wre;
import Pjo.n;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
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
import androidx.view.LifecycleOwnerKt;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.FlowExtKt;
import androidx.view.viewmodel.CreationExtras;
import com.alightcreative.app.motion.activities.main.MainActivity;
import com.alightcreative.app.motion.templates.Template;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\"²\u0006\u000e\u0010!\u001a\u0004\u0018\u00010 8\nX\u008a\u0084\u0002"}, d2 = {"LPjo/Wre;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroy", "LPjo/QJ;", "o", "Lkotlin/Lazy;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()LPjo/QJ;", "viewModel", "Landroidx/media3/exoplayer/ExoPlayer;", "Z", "e", "()Landroidx/media3/exoplayer/ExoPlayer;", "player", "Lcom/alightcreative/app/motion/templates/Template$Tag;", "X", "()Ljava/lang/String;", "tag", "S", "j", "LPjo/r;", "state", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStoriesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoriesFragment.kt\ncom/alightcreative/app/motion/activities/main/templatepreview/stories/StoriesFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n106#2,15:133\n1#3:148\n*S KotlinDebug\n*F\n+ 1 StoriesFragment.kt\ncom/alightcreative/app/motion/activities/main/templatepreview/stories/StoriesFragment\n*L\n39#1:133,15\n*E\n"})
public final class Wre extends j {

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f7793g = 8;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final Lazy player;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    public static final class CN3 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Lazy f7796n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CN3(Lazy lazy) {
            super(0);
            this.f7796n = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.O(this.f7796n).getViewModelStore();
        }
    }

    public static final class Dsr extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f7797n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f7798t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dsr(Fragment fragment, Lazy lazy) {
            super(0);
            this.f7797n = fragment;
            this.f7798t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f7798t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.f7797n.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class I28 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f7799n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Fragment fragment) {
            super(0);
            this.f7799n = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f7799n;
        }
    }

    static final class Ml implements Function2 {

        /* synthetic */ class I28 extends FunctionReferenceImpl implements Function0 {
            I28(Object obj) {
                super(0, obj, QJ.class, "onRightScreenHalfClicked", "onRightScreenHalfClicked()V", 0);
            }

            public final void n() {
                ((QJ) this.receiver).nY();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: Pjo.Wre$Ml$Ml, reason: collision with other inner class name */
        /* synthetic */ class C0275Ml extends FunctionReferenceImpl implements Function0 {
            C0275Ml(Object obj) {
                super(0, obj, QJ.class, "onSeeAllSavedClicked", "onSeeAllSavedClicked()V", 0);
            }

            public final void n() {
                ((QJ) this.receiver).iF();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: Pjo.Wre$Ml$Wre, reason: collision with other inner class name */
        /* synthetic */ class C0276Wre extends FunctionReferenceImpl implements Function0 {
            C0276Wre(Object obj) {
                super(0, obj, QJ.class, "onLeftScreenHalfClicked", "onLeftScreenHalfClicked()V", 0);
            }

            public final void n() {
                ((QJ) this.receiver).ViF();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, QJ.class, "onBackClicked", "onBackClicked()V", 0);
            }

            public final void n() {
                ((QJ) this.receiver).aYN();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
            n(Object obj) {
                super(0, obj, QJ.class, "onSaveClicked", "onSaveClicked()V", 0);
            }

            public final void n() {
                ((QJ) this.receiver).g();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
            w6(Object obj) {
                super(0, obj, QJ.class, "onUseTemplateClicked", "onUseTemplateClicked()V", 0);
            }

            public final void n() {
                ((QJ) this.receiver).fD();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        Ml() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(Wre wre, Pjo.n action) {
            FragmentManager supportFragmentManager;
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.areEqual(action, n.j.f7832n)) {
                wre.getParentFragmentManager().Zmq();
            } else {
                if (action instanceof n.C0279n) {
                    Uri downloadURI = ((n.C0279n) action).n().getDownloadURI();
                    if (downloadURI != null) {
                        FragmentActivity activity = wre.getActivity();
                        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                        if (mainActivity != null) {
                            mainActivity.KN(downloadURI);
                        }
                    }
                } else {
                    if (!Intrinsics.areEqual(action, n.w6.f7834n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FragmentActivity activity2 = wre.getActivity();
                    MainActivity mainActivity2 = activity2 instanceof MainActivity ? (MainActivity) activity2 : null;
                    if (mainActivity2 != null) {
                        mainActivity2.te(M.CN3.f6256g);
                    }
                    FragmentActivity activity3 = wre.getActivity();
                    MainActivity mainActivity3 = activity3 instanceof MainActivity ? (MainActivity) activity3 : null;
                    Fragment fragmentPJg = (mainActivity3 == null || (supportFragmentManager = mainActivity3.getSupportFragmentManager()) == null) ? null : supportFragmentManager.pJg("Templates");
                    f52.I28 i28 = fragmentPJg instanceof f52.I28 ? (f52.I28) fragmentPJg : null;
                    if (i28 != null) {
                        i28.v();
                    }
                    wre.getParentFragmentManager().Zmq();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            List listEmptyList;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1092022903, i2, -1, "com.alightcreative.app.motion.activities.main.templatepreview.stories.StoriesFragment.onCreateView.<anonymous>.<anonymous> (StoriesFragment.kt:77)");
            }
            State stateRl = FlowExtKt.rl(FlowLiveDataConversions.n(Wre.this.T().t()), null, null, null, null, composer, 48, 14);
            r rVarT = t(stateRl);
            String strNr = rVarT != null ? rVarT.nr() : null;
            String strGh = strNr != null ? com.alightcreative.app.motion.templates.Ml.gh(strNr, composer, 0) : null;
            if (strGh == null) {
                strGh = "";
            }
            r rVarT2 = t(stateRl);
            if (rVarT2 == null || (listEmptyList = rVarT2.rl()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            r rVarT3 = t(stateRl);
            int iN = rVarT3 != null ? rVarT3.n() : 0;
            r rVarT4 = t(stateRl);
            int iO = rVarT4 != null ? rVarT4.O() : 0;
            r rVarT5 = t(stateRl);
            boolean zUo = rVarT5 != null ? rVarT5.Uo() : false;
            r rVarT6 = t(stateRl);
            boolean zJ2 = rVarT6 != null ? rVarT6.J2() : false;
            QJ qjT = Wre.this.T();
            composer.eF(-963760866);
            boolean zE2 = composer.E2(qjT);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(qjT);
                composer.o(objIF);
            }
            composer.Xw();
            Function0 function0 = (Function0) ((KFunction) objIF);
            QJ qjT2 = Wre.this.T();
            composer.eF(-963758882);
            boolean zE22 = composer.E2(qjT2);
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new n(qjT2);
                composer.o(objIF2);
            }
            composer.Xw();
            Function0 function02 = (Function0) ((KFunction) objIF2);
            QJ qjT3 = Wre.this.T();
            composer.eF(-963756667);
            boolean zE23 = composer.E2(qjT3);
            Object objIF3 = composer.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new w6(qjT3);
                composer.o(objIF3);
            }
            composer.Xw();
            Function0 function03 = (Function0) ((KFunction) objIF3);
            QJ qjT4 = Wre.this.T();
            composer.eF(-963754235);
            boolean zE24 = composer.E2(qjT4);
            Object objIF4 = composer.iF();
            if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new C0275Ml(qjT4);
                composer.o(objIF4);
            }
            composer.Xw();
            Function0 function04 = (Function0) ((KFunction) objIF4);
            QJ qjT5 = Wre.this.T();
            composer.eF(-963751671);
            boolean zE25 = composer.E2(qjT5);
            Object objIF5 = composer.iF();
            if (zE25 || objIF5 == Composer.INSTANCE.n()) {
                objIF5 = new I28(qjT5);
                composer.o(objIF5);
            }
            composer.Xw();
            Function0 function05 = (Function0) ((KFunction) objIF5);
            QJ qjT6 = Wre.this.T();
            composer.eF(-963749016);
            boolean zE26 = composer.E2(qjT6);
            Object objIF6 = composer.iF();
            if (zE26 || objIF6 == Composer.INSTANCE.n()) {
                objIF6 = new C0276Wre(qjT6);
                composer.o(objIF6);
            }
            composer.Xw();
            aC.rl(strGh, listEmptyList, iN, iO, zUo, zJ2, function0, function02, function03, function04, function05, (Function0) ((KFunction) objIF6), Wre.this.e(), null, composer, 0, 0, 8192);
            QJ qjT7 = Wre.this.T();
            composer.eF(-963743899);
            boolean zE27 = composer.E2(Wre.this);
            final Wre wre = Wre.this;
            Object objIF7 = composer.iF();
            if (zE27 || objIF7 == Composer.INSTANCE.n()) {
                objIF7 = new Function1() { // from class: Pjo.CN3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Wre.Ml.nr(wre, (n) obj);
                    }
                };
                composer.o(objIF7);
            }
            composer.Xw();
            uW.I28.rl(qjT7, (Function1) objIF7, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        private static final r t(State state) {
            return (r) state.getValue();
        }
    }

    /* JADX INFO: renamed from: Pjo.Wre$Wre, reason: collision with other inner class name */
    public static final class C0277Wre extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f7801n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0277Wre(Function0 function0) {
            super(0);
            this.f7801n = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f7801n.invoke();
        }
    }

    public static final class fuX extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f7802n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f7803t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public fuX(Function0 function0, Lazy lazy) {
            super(0);
            this.f7802n = function0;
            this.f7803t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f7802n;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f7803t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t;
        }
    }

    /* JADX INFO: renamed from: Pjo.Wre$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Wre n(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Wre wre = new Wre();
            wre.setArguments(BundleKt.n(TuplesKt.to("tag", tag)));
            return wre;
        }
    }

    public static final class n implements Player.Listener {
        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i2) {
            if (i2 == 4) {
                Wre.this.T().e();
            }
        }

        n() {
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7805n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Wre f7807O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f7808n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f7809t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Wre wre, Continuation continuation) {
                super(2, continuation);
                this.f7807O = wre;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f7807O, continuation);
                jVar.f7809t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7808n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f7807O.e().setMediaItem(MediaItem.fromUri((Uri) this.f7809t));
                    this.f7807O.e().prepare();
                    this.f7807O.e().play();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Uri uri, Continuation continuation) {
                return ((j) create(uri, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public static final class n implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f7810n;

            public static final class j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.CN3 f7811n;

                /* JADX INFO: renamed from: Pjo.Wre$w6$n$j$j, reason: collision with other inner class name */
                public static final class C0278j extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f7813n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f7814t;

                    public C0278j(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f7813n = obj;
                        this.f7814t |= Integer.MIN_VALUE;
                        return j.this.rl(null, this);
                    }
                }

                public j(TFv.CN3 cn3) {
                    this.f7811n = cn3;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    C0278j c0278j;
                    if (continuation instanceof C0278j) {
                        c0278j = (C0278j) continuation;
                        int i2 = c0278j.f7814t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0278j.f7814t = i2 - Integer.MIN_VALUE;
                        } else {
                            c0278j = new C0278j(continuation);
                        }
                    }
                    Object obj2 = c0278j.f7813n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = c0278j.f7814t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        TFv.CN3 cn3 = this.f7811n;
                        Uri uriT = ((r) obj).t();
                        c0278j.f7814t = 1;
                        if (cn3.rl(uriT, c0278j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public n(TFv.Wre wre) {
                this.f7810n = wre;
            }

            @Override // TFv.Wre
            public Object n(TFv.CN3 cn3, Continuation continuation) {
                Object objN = this.f7810n.n(new j(cn3), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Wre.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7805n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreIk = TFv.fuX.Ik(new n(TFv.fuX.aYN(FlowLiveDataConversions.n(Wre.this.T().t()))));
                j jVar = new j(Wre.this, null);
                this.f7805n = 1;
                if (TFv.fuX.gh(wreIk, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExoPlayer N(Wre wre) {
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(wre.requireContext()).build();
        exoPlayerBuild.setPlayWhenReady(true);
        Intrinsics.checkNotNullExpressionValue(exoPlayerBuild, "apply(...)");
        return exoPlayerBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QJ T() {
        return (QJ) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExoPlayer e() {
        return (ExoPlayer) this.player.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModel s7N(Wre wre, QJ.w6 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.create(wre.X());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        e().addListener(new n());
        GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new w6(null), 3, null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.rl(-1092022903, true, new Ml()));
        return composeView;
    }

    public Wre() {
        Function0 function0 = new Function0() { // from class: Pjo.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Wre.nHg(this.f7840n);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C0277Wre(new I28(this)));
        this.viewModel = FragmentViewModelLazyKt.t(this, Reflection.getOrCreateKotlinClass(QJ.class), new CN3(lazy), new fuX(function0, lazy), new Dsr(this, lazy));
        this.player = LazyKt.lazy(new Function0() { // from class: Pjo.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Wre.N(this.f7770n);
            }
        });
    }

    private final String X() {
        String string = requireArguments().getString("tag");
        if (string == null) {
            string = "";
        }
        return Template.Tag.t(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreationExtras nHg(final Wre wre) {
        CreationExtras defaultViewModelCreationExtras = wre.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
        return GR.j.rl(defaultViewModelCreationExtras, new Function1() { // from class: Pjo.I28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wre.s7N(this.f7769n, (QJ.w6) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        e().release();
    }
}
