package f52;

import Bj.j;
import PB.Wre;
import android.R;
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
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.FlowLiveDataConversions;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.FlowExtKt;
import androidx.view.viewmodel.CreationExtras;
import com.alightcreative.app.motion.activities.main.MainActivity;
import com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem;
import com.alightcreative.app.motion.templates.Template;
import com.google.android.gms.ads.RequestConfiguration;
import f52.I28;
import f52.r;
import f52.w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u0003R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020!078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006=²\u0006\f\u0010<\u001a\u00020;8\nX\u008a\u0084\u0002"}, d2 = {"Lf52/I28;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroidx/media3/exoplayer/ExoPlayer;", "e", "()Landroidx/media3/exoplayer/ExoPlayer;", "Lcom/alightcreative/app/motion/templates/Template$Tag;", "tag", "", "nHg", "(Ljava/lang/String;)V", "", "selectedTemplateId", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;", "selectedFilter", "", "pagesLoaded", "N", "(Ljava/lang/String;Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;I)V", "s7N", "()Lkotlin/Unit;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LBj/j$j;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62175h, "Landroidx/media3/common/Player;", "E2", "(LBj/j$j;)Landroidx/media3/common/Player;", "player", "wTp", "(Landroidx/media3/common/Player;)V", "v", "onDestroyView", "Lf52/l3D;", "o", "Lkotlin/Lazy;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()Lf52/l3D;", "viewModel", "LeQ/fuX;", "Z", "LeQ/fuX;", "X", "()LeQ/fuX;", "setImageLoader", "(LeQ/fuX;)V", "imageLoader", "", "S", "Ljava/util/List;", "playerPool", "Lf52/r;", "viewState", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTemplatesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemplatesFragment.kt\ncom/alightcreative/app/motion/activities/main/maintabs/templates/TemplatesFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n106#2,15:197\n28#3,12:212\n28#3,12:224\n1863#4,2:236\n*S KotlinDebug\n*F\n+ 1 TemplatesFragment.kt\ncom/alightcreative/app/motion/activities/main/maintabs/templates/TemplatesFragment\n*L\n38#1:197,15\n156#1:212,12\n171#1:224,12\n192#1:236,2\n*E\n"})
public final class I28 extends f52.n {

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final List playerPool;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public eQ.fuX imageLoader;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: f52.I28$I28, reason: collision with other inner class name */
    public static final class C0912I28 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f66481n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f66482t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0912I28(Function0 function0, Lazy lazy) {
            super(0);
            this.f66481n = function0;
            this.f66482t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f66481n;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f66482t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t;
        }
    }

    public static final class Ml extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Lazy f66483n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Lazy lazy) {
            super(0);
            this.f66483n = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.O(this.f66483n).getViewModelStore();
        }
    }

    public static final class Wre extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f66484n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f66485t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Fragment fragment, Lazy lazy) {
            super(0);
            this.f66484n = fragment;
            this.f66485t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f66485t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.f66484n.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    static final class j implements Function2 {

        /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function1 {
            CN3(Object obj) {
                super(1, obj, I28.class, "releasePlayer", "releasePlayer(Landroidx/media3/common/Player;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((Player) obj);
                return Unit.INSTANCE;
            }

            public final void n(Player p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((I28) this.receiver).wTp(p0);
            }
        }

        /* synthetic */ class Dsr extends FunctionReferenceImpl implements Function0 {
            Dsr(Object obj) {
                super(0, obj, l3D.class, "onLoadMoreClicked", "onLoadMoreClicked()V", 0);
            }

            public final void n() {
                ((l3D) this.receiver).XQ();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: f52.I28$j$I28, reason: collision with other inner class name */
        /* synthetic */ class C0913I28 extends FunctionReferenceImpl implements Function1 {
            C0913I28(Object obj) {
                super(1, obj, l3D.class, "onTemplateSaveButtonClicked", "onTemplateSaveButtonClicked(Ljava/lang/String;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((String) obj);
                return Unit.INSTANCE;
            }

            public final void n(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((l3D) this.receiver).g(p0);
            }
        }

        /* synthetic */ class Ml extends FunctionReferenceImpl implements Function1 {
            Ml(Object obj) {
                super(1, obj, l3D.class, "onTemplatePreviewClicked", "onTemplatePreviewClicked(Ljava/lang/String;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((String) obj);
                return Unit.INSTANCE;
            }

            public final void n(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((l3D) this.receiver).ViF(p0);
            }
        }

        /* synthetic */ class Wre extends FunctionReferenceImpl implements Function1 {
            Wre(Object obj) {
                super(1, obj, I28.class, "acquirePlayer", "acquirePlayer(Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplatesShowcaseItem$Content;)Landroidx/media3/common/Player;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Player invoke(j.C0016j p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((I28) this.receiver).E2(p0);
            }
        }

        /* synthetic */ class fuX extends FunctionReferenceImpl implements Function0 {
            fuX(Object obj) {
                super(0, obj, l3D.class, "refresh", "refresh()V", 0);
            }

            public final void n() {
                ((l3D) this.receiver).iF();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: f52.I28$j$j, reason: collision with other inner class name */
        /* synthetic */ class C0914j extends FunctionReferenceImpl implements Function0 {
            C0914j(Object obj) {
                super(0, obj, l3D.class, "onYourTemplatesClicked", "onYourTemplatesClicked()V", 0);
            }

            public final void n() {
                ((l3D) this.receiver).te();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {
            n(Object obj) {
                super(1, obj, l3D.class, "onTagCircleClicked", "onTagCircleClicked-ZBI-vXo(Ljava/lang/String;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Template.Tag) obj).getValue());
                return Unit.INSTANCE;
            }

            public final void n(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((l3D) this.receiver).WPU(p0);
            }
        }

        /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {
            w6(Object obj) {
                super(1, obj, l3D.class, "onFilterClicked", "onFilterClicked(Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((TemplateFiltersItem.Content) obj);
                return Unit.INSTANCE;
            }

            public final void n(TemplateFiltersItem.Content p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((l3D) this.receiver).o(p0);
            }
        }

        j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(I28 i28, f52.w6 action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof w6.j) {
                w6.j jVar = (w6.j) action;
                i28.N(jVar.t(), jVar.rl(), jVar.n());
            } else if (action instanceof w6.n) {
                i28.nHg(((w6.n) action).n());
            } else {
                if (!Intrinsics.areEqual(action, w6.C0916w6.f66568n)) {
                    throw new NoWhenBranchMatchedException();
                }
                i28.s7N();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x02dc  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x02f3  */
        /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v21, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r20v0 */
        /* JADX WARN: Type inference failed for: r20v1 */
        /* JADX WARN: Type inference failed for: r20v2 */
        /* JADX WARN: Type inference failed for: r20v4 */
        /* JADX WARN: Type inference failed for: r20v5 */
        /* JADX WARN: Type inference failed for: r20v6 */
        /* JADX WARN: Type inference failed for: r20v7 */
        /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v15, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void rl(Composer composer, int i2) {
            ?? arrayList;
            ?? arrayList2;
            List listNr;
            boolean z2;
            ?? r20;
            ?? r202;
            boolean zE2;
            final I28 i28;
            Object objIF;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(542687756, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.TemplatesFragment.onCreateView.<anonymous>.<anonymous> (TemplatesFragment.kt:59)");
            }
            State stateRl = FlowExtKt.rl(TFv.fuX.aYN(FlowLiveDataConversions.n(I28.this.T().t())), new r.w6(false), null, null, null, composer, 0, 14);
            r rVarT = t(stateRl);
            if (rVarT instanceof r.j) {
                arrayList = ((r.j) rVarT).O();
            } else if (rVarT instanceof r.n) {
                arrayList = 0;
            } else {
                if (!(rVarT instanceof r.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList = new ArrayList(5);
                for (int i3 = 0; i3 < 5; i3++) {
                    arrayList.add(Wre.n.f7626n);
                }
            }
            r rVarT2 = t(stateRl);
            if (rVarT2 instanceof r.j) {
                arrayList2 = ((r.j) rVarT2).rl();
            } else if (rVarT2 instanceof r.n) {
                arrayList2 = 0;
            } else {
                if (!(rVarT2 instanceof r.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList2 = new ArrayList(5);
                for (int i5 = 0; i5 < 5; i5++) {
                    arrayList2.add(TemplateFiltersItem.LoadingPlaceholder.f45452n);
                }
            }
            r rVarT3 = t(stateRl);
            if (rVarT3 instanceof r.j) {
                listNr = ((r.j) rVarT3).nr();
            } else if (rVarT3 instanceof r.n) {
                listNr = null;
            } else {
                if (!(rVarT3 instanceof r.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList3 = new ArrayList(5);
                for (int i7 = 0; i7 < 5; i7++) {
                    arrayList3.add(j.n.f589n);
                }
                listNr = arrayList3;
            }
            l3D l3dT = I28.this.T();
            composer.eF(-1783750514);
            boolean zE22 = composer.E2(l3dT);
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new C0914j(l3dT);
                composer.o(objIF2);
            }
            KFunction kFunction = (KFunction) objIF2;
            composer.Xw();
            l3D l3dT2 = I28.this.T();
            composer.eF(-1783748086);
            boolean zE23 = composer.E2(l3dT2);
            Object objIF3 = composer.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new n(l3dT2);
                composer.o(objIF3);
            }
            KFunction kFunction2 = (KFunction) objIF3;
            composer.Xw();
            l3D l3dT3 = I28.this.T();
            composer.eF(-1783745881);
            boolean zE24 = composer.E2(l3dT3);
            Object objIF4 = composer.iF();
            if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new w6(l3dT3);
                composer.o(objIF4);
            }
            KFunction kFunction3 = (KFunction) objIF4;
            composer.Xw();
            l3D l3dT4 = I28.this.T();
            composer.eF(-1783743696);
            boolean zE25 = composer.E2(l3dT4);
            Object objIF5 = composer.iF();
            if (zE25 || objIF5 == Composer.INSTANCE.n()) {
                objIF5 = new Ml(l3dT4);
                composer.o(objIF5);
            }
            KFunction kFunction4 = (KFunction) objIF5;
            composer.Xw();
            l3D l3dT5 = I28.this.T();
            composer.eF(-1783741101);
            boolean zE26 = composer.E2(l3dT5);
            Object objIF6 = composer.iF();
            if (zE26 || objIF6 == Composer.INSTANCE.n()) {
                objIF6 = new C0913I28(l3dT5);
                composer.o(objIF6);
            }
            KFunction kFunction5 = (KFunction) objIF6;
            composer.Xw();
            r rVarT4 = t(stateRl);
            r.j jVar = rVarT4 instanceof r.j ? (r.j) rVarT4 : null;
            TemplateFiltersItem.Content contentT = jVar != null ? jVar.t() : null;
            eQ.fuX fuxX = I28.this.X();
            I28 i282 = I28.this;
            composer.eF(-1783734052);
            boolean zE27 = composer.E2(i282);
            Object objIF7 = composer.iF();
            if (zE27 || objIF7 == Composer.INSTANCE.n()) {
                objIF7 = new Wre(i282);
                composer.o(objIF7);
            }
            KFunction kFunction6 = (KFunction) objIF7;
            composer.Xw();
            I28 i283 = I28.this;
            composer.eF(-1783732292);
            boolean zE28 = composer.E2(i283);
            Object objIF8 = composer.iF();
            if (zE28 || objIF8 == Composer.INSTANCE.n()) {
                objIF8 = new CN3(i283);
                composer.o(objIF8);
            }
            KFunction kFunction7 = (KFunction) objIF8;
            composer.Xw();
            boolean zN = t(stateRl).n();
            l3D l3dT6 = I28.this.T();
            composer.eF(-1783728833);
            boolean zE29 = composer.E2(l3dT6);
            Object objIF9 = composer.iF();
            if (zE29 || objIF9 == Composer.INSTANCE.n()) {
                objIF9 = new fuX(l3dT6);
                composer.o(objIF9);
            }
            KFunction kFunction8 = (KFunction) objIF9;
            composer.Xw();
            r rVarT5 = t(stateRl);
            r.j jVar2 = rVarT5 instanceof r.j ? (r.j) rVarT5 : null;
            if (jVar2 != null) {
                z2 = jVar2.J2();
            }
            l3D l3dT7 = I28.this.T();
            composer.eF(-1783722231);
            boolean zE210 = composer.E2(l3dT7);
            Object objIF10 = composer.iF();
            if (!zE210) {
                ?? r203 = arrayList;
                r202 = r203;
                r20 = r203;
                if (objIF10 == Composer.INSTANCE.n()) {
                }
                composer.Xw();
                C.nr(r202, arrayList2, listNr, (Function0) kFunction, (Function1) kFunction2, (Function1) kFunction3, (Function1) kFunction4, (Function1) kFunction5, zN, (Function0) kFunction8, z2, (Function0) ((KFunction) objIF10), (Function1) kFunction6, (Function1) kFunction7, null, contentT, fuxX, composer, 0, 0, 16384);
                l3D l3dT8 = I28.this.T();
                composer.eF(-1783718717);
                zE2 = composer.E2(I28.this);
                i28 = I28.this;
                objIF = composer.iF();
                if (!zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1() { // from class: f52.Ml
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return I28.j.nr(i28, (w6) obj);
                        }
                    };
                    composer.o(objIF);
                }
                composer.Xw();
                uW.I28.rl(l3dT8, (Function1) objIF, composer, 0);
                if (ComposerKt.v()) {
                    return;
                }
                ComposerKt.M7();
                return;
            }
            r20 = arrayList;
            objIF10 = new Dsr(l3dT7);
            composer.o(objIF10);
            r202 = r20;
            composer.Xw();
            C.nr(r202, arrayList2, listNr, (Function0) kFunction, (Function1) kFunction2, (Function1) kFunction3, (Function1) kFunction4, (Function1) kFunction5, zN, (Function0) kFunction8, z2, (Function0) ((KFunction) objIF10), (Function1) kFunction6, (Function1) kFunction7, null, contentT, fuxX, composer, 0, 0, 16384);
            l3D l3dT82 = I28.this.T();
            composer.eF(-1783718717);
            zE2 = composer.E2(I28.this);
            i28 = I28.this;
            objIF = composer.iF();
            if (!zE2) {
                objIF = new Function1() { // from class: f52.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return I28.j.nr(i28, (w6) obj);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            uW.I28.rl(l3dT82, (Function1) objIF, composer, 0);
            if (ComposerKt.v()) {
            }
        }

        private static final r t(State state) {
            return (r) state.getValue();
        }
    }

    public static final class n extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f66487n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Fragment fragment) {
            super(0);
            this.f66487n = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f66487n;
        }
    }

    public static final class w6 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f66488n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Function0 function0) {
            super(0);
            this.f66488n = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f66488n.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l3D T() {
        return (l3D) this.viewModel.getValue();
    }

    private final ExoPlayer e() {
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(requireContext()).build();
        Intrinsics.checkNotNullExpressionValue(exoPlayerBuild, "build(...)");
        exoPlayerBuild.setRepeatMode(2);
        exoPlayerBuild.setPlayWhenReady(true);
        return exoPlayerBuild;
    }

    public final Player E2(j.C0016j template) {
        Intrinsics.checkNotNullParameter(template, "template");
        if (Intrinsics.areEqual(template.t(), Uri.EMPTY)) {
            return null;
        }
        Player playerE = (Player) XoT.qz.n(this.playerPool);
        if (playerE == null) {
            playerE = e();
        }
        playerE.setMediaItem(MediaItem.fromUri(template.t()));
        playerE.prepare();
        return playerE;
    }

    public final eQ.fuX X() {
        eQ.fuX fux = this.imageLoader;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.rl);
        composeView.setContent(ComposableLambdaKt.rl(542687756, true, new j()));
        return composeView;
    }

    public final void wTp(Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.stop();
        player.clearMediaItems();
        this.playerPool.add(player);
    }

    public I28() {
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new w6(new n(this)));
        this.viewModel = FragmentViewModelLazyKt.t(this, Reflection.getOrCreateKotlinClass(l3D.class), new Ml(lazy), new C0912I28(null, lazy), new Wre(this, lazy));
        this.playerPool = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(String selectedTemplateId, TemplateFiltersItem.Content selectedFilter, int pagesLoaded) {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        FragmentTransaction fragmentTransactionO = parentFragmentManager.o();
        fragmentTransactionO.t(R.id.content, GW.fuX.INSTANCE.n(selectedTemplateId, selectedFilter, pagesLoaded), "ReelsFragment");
        fragmentTransactionO.KN("ReelsFragment");
        fragmentTransactionO.mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nHg(String tag) {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        FragmentTransaction fragmentTransactionO = parentFragmentManager.o();
        fragmentTransactionO.t(R.id.content, Pjo.Wre.INSTANCE.n(tag), "StoriesFragment");
        fragmentTransactionO.KN("StoriesFragment");
        fragmentTransactionO.mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit s7N() {
        MainActivity mainActivity;
        FragmentActivity activity = getActivity();
        if (activity instanceof MainActivity) {
            mainActivity = (MainActivity) activity;
        } else {
            mainActivity = null;
        }
        if (mainActivity == null) {
            return null;
        }
        mainActivity.te(M.CN3.f6253S);
        mainActivity.s7N(six.CN3.f73279O);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Iterator it = this.playerPool.iterator();
        while (it.hasNext()) {
            ((Player) it.next()).release();
        }
        this.playerPool.clear();
    }

    public final void v() {
        T().o(TemplateFiltersItem.Content.Saved.f45448O);
    }
}
