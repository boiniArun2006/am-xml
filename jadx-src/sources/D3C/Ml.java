package D3C;

import D3C.Ml;
import D3C.Q;
import D3C.n;
import M.V1;
import PB.Wre;
import android.R;
import android.content.Context;
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
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.FlowLiveDataConversions;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.FlowExtKt;
import androidx.view.viewmodel.CreationExtras;
import com.alightcreative.app.motion.activities.main.MainActivity;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.templates.Template;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R!\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006;²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002"}, d2 = {"LD3C/Ml;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "LM/CN3;", "tab", "", "U", "(LM/CN3;)V", "nHg", "Lcom/alightcreative/app/motion/project/ProjectInfo;", "project", "Xw", "(Lcom/alightcreative/app/motion/project/ProjectInfo;)V", "Lcom/alightcreative/app/motion/templates/Template$Tag;", "tag", "jB", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LD3C/QJ;", "o", "Lkotlin/Lazy;", "bzg", "()LD3C/QJ;", "viewModel", "LeQ/fuX;", "Z", "LeQ/fuX;", "s7N", "()LeQ/fuX;", "setImageLoader", "(LeQ/fuX;)V", "imageLoader", "Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "S", "v", "()Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "thumbnailCache", "", "Lcom/alightcreative/app/motion/project/ProjectInfo$n;", "wTp", "()Ljava/util/List;", "localProjectList", "Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;", "rV9", "()Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;", "thumbnailMaker", "g", "j", "LD3C/Q;", "viewState", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/alightcreative/app/motion/activities/main/maintabs/home/HomeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,129:1\n106#2,15:130\n774#3:145\n865#3,2:146\n28#4,12:148\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/alightcreative/app/motion/activities/main/maintabs/home/HomeFragment\n*L\n37#1:130,15\n45#1:145\n45#1:146,2\n119#1:148,12\n*E\n"})
public final class Ml extends j {

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final Lazy thumbnailCache;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public eQ.fuX imageLoader;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;
    public static final int E2 = 8;

    public static final class CN3 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f1198n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f1199t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CN3(Fragment fragment, Lazy lazy) {
            super(0);
            this.f1198n = fragment;
            this.f1199t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f1199t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.f1198n.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class I28 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Lazy f1200n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Lazy lazy) {
            super(0);
            this.f1200n = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.O(this.f1200n).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: D3C.Ml$Ml, reason: collision with other inner class name */
    public static final class C0042Ml extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f1201n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0042Ml(Function0 function0) {
            super(0);
            this.f1201n = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f1201n.invoke();
        }
    }

    public static final class Wre extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f1202n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f1203t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Function0 function0, Lazy lazy) {
            super(0);
            this.f1202n = function0;
            this.f1203t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f1202n;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f1203t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t;
        }
    }

    static final class n implements Function2 {

        /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function0 {
            CN3(Object obj) {
                super(0, obj, QJ.class, "onGetStartedProjectsCardClicked", "onGetStartedProjectsCardClicked()V", 0);
            }

            public final void n() {
                ((QJ) this.receiver).ck();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class Dsr extends FunctionReferenceImpl implements Function0 {
            Dsr(Object obj) {
                super(0, obj, QJ.class, "refresh", "refresh()V", 0);
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

        /* synthetic */ class I28 extends FunctionReferenceImpl implements Function1 {
            I28(Object obj) {
                super(1, obj, QJ.class, "onProjectClicked", "onProjectClicked(Lcom/alightcreative/app/motion/project/ProjectInfo;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ProjectInfo) obj);
                return Unit.INSTANCE;
            }

            public final void n(ProjectInfo p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((QJ) this.receiver).o(p0);
            }
        }

        /* JADX INFO: renamed from: D3C.Ml$n$Ml, reason: collision with other inner class name */
        /* synthetic */ class C0043Ml extends FunctionReferenceImpl implements Function0 {
            C0043Ml(Object obj) {
                super(0, obj, QJ.class, "onCreateProjectClicked", "onCreateProjectClicked()V", 0);
            }

            public final void n() {
                ((QJ) this.receiver).HI();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class Wre extends FunctionReferenceImpl implements Function0 {
            Wre(Object obj) {
                super(0, obj, QJ.class, "onGetStartedTutorialsCardClicked", "onGetStartedTutorialsCardClicked()V", 0);
            }

            public final void n() {
                ((QJ) this.receiver).r();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class fuX extends FunctionReferenceImpl implements Function0 {
            fuX(Object obj) {
                super(0, obj, QJ.class, "onGetStartedTemplatesCardClicked", "onGetStartedTemplatesCardClicked()V", 0);
            }

            public final void n() {
                ((QJ) this.receiver).Ik();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, QJ.class, "onViewAllTemplatesClicked", "onViewAllTemplatesClicked()V", 0);
            }

            public final void n() {
                ((QJ) this.receiver).WPU();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: D3C.Ml$n$n, reason: collision with other inner class name */
        /* synthetic */ class C0044n extends FunctionReferenceImpl implements Function1 {
            C0044n(Object obj) {
                super(1, obj, QJ.class, "onTagClicked", "onTagClicked-ZBI-vXo(Ljava/lang/String;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Template.Tag) obj).getValue());
                return Unit.INSTANCE;
            }

            public final void n(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((QJ) this.receiver).Z(p0);
            }
        }

        /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
            w6(Object obj) {
                super(0, obj, QJ.class, "onViewAllProjectsClicked", "onViewAllProjectsClicked()V", 0);
            }

            public final void n() {
                ((QJ) this.receiver).S();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(Ml ml, D3C.n action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.areEqual(action, n.j.f1282n)) {
                ml.nHg();
            } else if (Intrinsics.areEqual(action, n.w6.f1284n)) {
                ml.U(M.CN3.f6253S);
            } else if (Intrinsics.areEqual(action, n.I28.f1279n)) {
                ml.U(M.CN3.f6256g);
            } else if (Intrinsics.areEqual(action, n.Wre.f1281n)) {
                YgZ.Ml ml2 = YgZ.Ml.f12213n;
                Context contextRequireContext = ml.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                YgZ.Ml.rl(ml2, contextRequireContext, "https://www.youtube.com/watch?v=yLTEp_GEJqI", null, 4, null);
            } else if (action instanceof n.C0046n) {
                ml.Xw(((n.C0046n) action).n());
            } else {
                if (!(action instanceof n.Ml)) {
                    throw new NoWhenBranchMatchedException();
                }
                ml.jB(((n.Ml) action).n());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0274  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x028b  */
        /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r19v0 */
        /* JADX WARN: Type inference failed for: r19v1 */
        /* JADX WARN: Type inference failed for: r19v2 */
        /* JADX WARN: Type inference failed for: r19v4 */
        /* JADX WARN: Type inference failed for: r19v5 */
        /* JADX WARN: Type inference failed for: r19v6 */
        /* JADX WARN: Type inference failed for: r19v7 */
        /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void rl(Composer composer, int i2) {
            ?? arrayList;
            ?? r19;
            ?? r192;
            boolean zE2;
            final Ml ml;
            Object objIF;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(402963202, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.HomeFragment.onCreateView.<anonymous>.<anonymous> (HomeFragment.kt:68)");
            }
            State stateRl = FlowExtKt.rl(TFv.fuX.aYN(FlowLiveDataConversions.n(Ml.this.bzg().t())), new Q.w6(false), null, null, null, composer, 0, 14);
            Q qT = t(stateRl);
            if (qT instanceof Q.j) {
                arrayList = ((Q.j) qT).rl();
            } else if (qT instanceof Q.n) {
                arrayList = 0;
            } else {
                if (!(qT instanceof Q.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList = new ArrayList(5);
                for (int i3 = 0; i3 < 5; i3++) {
                    arrayList.add(Wre.n.f7626n);
                }
            }
            List listWTp = Ml.this.wTp();
            QJ qjBzg = Ml.this.bzg();
            composer.eF(-1801984921);
            boolean zE22 = composer.E2(qjBzg);
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new j(qjBzg);
                composer.o(objIF2);
            }
            KFunction kFunction = (KFunction) objIF2;
            composer.Xw();
            QJ qjBzg2 = Ml.this.bzg();
            composer.eF(-1801982598);
            boolean zE23 = composer.E2(qjBzg2);
            Object objIF3 = composer.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new C0044n(qjBzg2);
                composer.o(objIF3);
            }
            KFunction kFunction2 = (KFunction) objIF3;
            composer.Xw();
            QJ qjBzg3 = Ml.this.bzg();
            composer.eF(-1801980282);
            boolean zE24 = composer.E2(qjBzg3);
            Object objIF4 = composer.iF();
            if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new w6(qjBzg3);
                composer.o(objIF4);
            }
            KFunction kFunction3 = (KFunction) objIF4;
            composer.Xw();
            QJ qjBzg4 = Ml.this.bzg();
            composer.eF(-1801977660);
            boolean zE25 = composer.E2(qjBzg4);
            Object objIF5 = composer.iF();
            if (zE25 || objIF5 == Composer.INSTANCE.n()) {
                objIF5 = new C0043Ml(qjBzg4);
                composer.o(objIF5);
            }
            KFunction kFunction4 = (KFunction) objIF5;
            composer.Xw();
            QJ qjBzg5 = Ml.this.bzg();
            composer.eF(-1801975298);
            boolean zE26 = composer.E2(qjBzg5);
            Object objIF6 = composer.iF();
            if (zE26 || objIF6 == Composer.INSTANCE.n()) {
                objIF6 = new I28(qjBzg5);
                composer.o(objIF6);
            }
            KFunction kFunction5 = (KFunction) objIF6;
            composer.Xw();
            QJ qjBzg6 = Ml.this.bzg();
            composer.eF(-1801972594);
            boolean zE27 = composer.E2(qjBzg6);
            Object objIF7 = composer.iF();
            if (zE27 || objIF7 == Composer.INSTANCE.n()) {
                objIF7 = new Wre(qjBzg6);
                composer.o(objIF7);
            }
            KFunction kFunction6 = (KFunction) objIF7;
            composer.Xw();
            QJ qjBzg7 = Ml.this.bzg();
            composer.eF(-1801969427);
            boolean zE28 = composer.E2(qjBzg7);
            Object objIF8 = composer.iF();
            if (zE28 || objIF8 == Composer.INSTANCE.n()) {
                objIF8 = new CN3(qjBzg7);
                composer.o(objIF8);
            }
            KFunction kFunction7 = (KFunction) objIF8;
            composer.Xw();
            QJ qjBzg8 = Ml.this.bzg();
            composer.eF(-1801966258);
            boolean zE29 = composer.E2(qjBzg8);
            Object objIF9 = composer.iF();
            if (zE29 || objIF9 == Composer.INSTANCE.n()) {
                objIF9 = new fuX(qjBzg8);
                composer.o(objIF9);
            }
            KFunction kFunction8 = (KFunction) objIF9;
            composer.Xw();
            BitmapLruCache bitmapLruCacheV = Ml.this.v();
            SceneThumbnailMaker sceneThumbnailMakerRV9 = Ml.this.rV9();
            eQ.fuX fuxS7N = Ml.this.s7N();
            boolean zN = t(stateRl).n();
            QJ qjBzg9 = Ml.this.bzg();
            composer.eF(-1801957035);
            boolean zE210 = composer.E2(qjBzg9);
            Object objIF10 = composer.iF();
            if (!zE210) {
                ?? r193 = arrayList;
                r192 = r193;
                r19 = r193;
                if (objIF10 == Composer.INSTANCE.n()) {
                }
                composer.Xw();
                Pl.KN(r192, listWTp, (Function0) kFunction, (Function1) kFunction2, (Function0) kFunction3, (Function0) kFunction4, (Function1) kFunction5, (Function0) kFunction6, (Function0) kFunction7, (Function0) kFunction8, zN, (Function0) ((KFunction) objIF10), null, bitmapLruCacheV, sceneThumbnailMakerRV9, fuxS7N, composer, 0, 0, 4096);
                QJ qjBzg10 = Ml.this.bzg();
                composer.eF(-1801953859);
                zE2 = composer.E2(Ml.this);
                ml = Ml.this;
                objIF = composer.iF();
                if (!zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1() { // from class: D3C.I28
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Ml.n.nr(ml, (n) obj);
                        }
                    };
                    composer.o(objIF);
                }
                composer.Xw();
                uW.I28.rl(qjBzg10, (Function1) objIF, composer, 0);
                if (ComposerKt.v()) {
                    return;
                }
                ComposerKt.M7();
                return;
            }
            r19 = arrayList;
            objIF10 = new Dsr(qjBzg9);
            composer.o(objIF10);
            r192 = r19;
            composer.Xw();
            Pl.KN(r192, listWTp, (Function0) kFunction, (Function1) kFunction2, (Function0) kFunction3, (Function0) kFunction4, (Function1) kFunction5, (Function0) kFunction6, (Function0) kFunction7, (Function0) kFunction8, zN, (Function0) ((KFunction) objIF10), null, bitmapLruCacheV, sceneThumbnailMakerRV9, fuxS7N, composer, 0, 0, 4096);
            QJ qjBzg102 = Ml.this.bzg();
            composer.eF(-1801953859);
            zE2 = composer.E2(Ml.this);
            ml = Ml.this;
            objIF = composer.iF();
            if (!zE2) {
                objIF = new Function1() { // from class: D3C.I28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Ml.n.nr(ml, (n) obj);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            uW.I28.rl(qjBzg102, (Function1) objIF, composer, 0);
            if (ComposerKt.v()) {
            }
        }

        private static final Q t(State state) {
            return (Q) state.getValue();
        }
    }

    public static final class w6 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f1205n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Fragment fragment) {
            super(0);
            this.f1205n = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f1205n;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BitmapLruCache P5() {
        return new BitmapLruCache(0, "projectThumbnailCache", 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QJ bzg() {
        return (QJ) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BitmapLruCache v() {
        return (BitmapLruCache) this.thumbnailCache.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.rl);
        composeView.setContent(ComposableLambdaKt.rl(402963202, true, new n()));
        return composeView;
    }

    public final eQ.fuX s7N() {
        eQ.fuX fux = this.imageLoader;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public Ml() {
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C0042Ml(new w6(this)));
        this.viewModel = FragmentViewModelLazyKt.t(this, Reflection.getOrCreateKotlinClass(QJ.class), new I28(lazy), new Wre(null, lazy), new CN3(this, lazy));
        this.thumbnailCache = LazyKt.lazy(new Function0() { // from class: D3C.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ml.P5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(M.CN3 tab) {
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.main.maintabs.MainTabSelector");
        ((V1) activity).te(tab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Xw(ProjectInfo project) {
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.projectlist.ProjectListHost");
        ((Vi.CN3) activity).nr(project);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jB(String tag) {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        FragmentTransaction fragmentTransactionO = parentFragmentManager.o();
        fragmentTransactionO.t(R.id.content, Pjo.Wre.INSTANCE.n(tag), "StoriesFragment");
        fragmentTransactionO.KN("StoriesFragment");
        fragmentTransactionO.mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nHg() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.main.MainActivity");
        ((MainActivity) activity).pE();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SceneThumbnailMaker rV9() {
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.projectlist.ProjectListHost");
        return ((Vi.CN3) activity).S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List wTp() {
        Vi.CN3 cn3;
        List listG;
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof Vi.CN3) {
            cn3 = (Vi.CN3) activity;
        } else {
            cn3 = null;
        }
        if (cn3 != null && (listG = cn3.g()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                ProjectInfo.n nVar = (ProjectInfo.n) obj;
                if (!nVar.isTemplate() && nVar.getType() != SceneType.PRESET && six.CN3.f73281n.n(nVar) == six.CN3.f73284t) {
                    arrayList.add(obj);
                }
            }
            List listTake = CollectionsKt.take(arrayList, 5);
            if (listTake != null) {
                return listTake;
            }
        }
        return CollectionsKt.emptyList();
    }
}
