package M;

import M.Sis;
import M.c7r;
import M.rv6;
import SJ0.ya;
import ScC.FuwU.XIvb;
import UO6.qf;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.LifecycleOwnerKt;
import androidx.view.OnBackPressedCallback;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.ViewModelStoreOwner;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import androidx.view.viewmodel.CreationExtras;
import com.alightcreative.app.motion.activities.main.MainActivity;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import l.AbstractC2254j;
import l.Xo;
import six.I28;
import xr.j;
import y.AbstractC2431fuX;
import zT.AbstractC2498z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u0004R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010B\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010>0>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020G0F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010Q\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010U\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020G0F8F¢\u0006\u0006\u001a\u0004\bV\u0010I¨\u0006Y²\u0006\u0012\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00130F8\nX\u008a\u0084\u0002"}, d2 = {"LM/Sis;", "Landroidx/fragment/app/Fragment;", "LKC/g9s;", "<init>", "()V", "", "cloudProjectId", "", "overwritePrevious", "", "dR0", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "ofS", "(Ljava/lang/String;)V", "", "allowedStorage", "canUpgrade", "m", "(JZ)V", "Lcom/alightcreative/app/motion/project/ProjectInfo$j;", "projectInfo", "GR", "(Lcom/alightcreative/app/motion/project/ProjectInfo$j;)V", "title", "message", "G7", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Uo", "LSJ0/ya;", "o", "LSJ0/ya;", "_binding", "LM/kO4;", "Z", "Lkotlin/Lazy;", "I", "()LM/kO4;", "viewModel", "Ll/CN3;", "S", "FX", "()Ll/CN3;", "cloudBackupViewModel", "Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "Lcom/alightcreative/app/motion/project/ProjectInfo;", "g", "Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "thumbnailCache", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "E2", "Landroidx/activity/result/ActivityResultLauncher;", "xmlImporter", "M", "()LSJ0/ya;", "binding", "", "Lcom/alightcreative/app/motion/project/ProjectInfo$n;", "B", "()Ljava/util/List;", "localProjectList", "Lsix/CN3;", "D", "()Lsix/CN3;", "selectedSubTab", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "uid", "Landroid/app/Activity;", "E", "()Landroid/app/Activity;", "activity", "J", "selectedProjects", "cloudProjectList", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainTabProjectListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainTabProjectListFragment.kt\ncom/alightcreative/app/motion/activities/main/maintabs/MainTabProjectListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,430:1\n106#2,15:431\n106#2,15:446\n*S KotlinDebug\n*F\n+ 1 MainTabProjectListFragment.kt\ncom/alightcreative/app/motion/activities/main/maintabs/MainTabProjectListFragment\n*L\n64#1:431,15\n66#1:446,15\n*E\n"})
public final class Sis extends AbstractC1407n implements KC.g9s {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final ActivityResultLauncher xmlImporter;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final Lazy cloudBackupViewModel;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final BitmapLruCache thumbnailCache;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private ya _binding;

    public static final class C extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f6345n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(Function0 function0) {
            super(0);
            this.f6345n = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f6345n.invoke();
        }
    }

    public static final class CN3 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Lazy f6346n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CN3(Lazy lazy) {
            super(0);
            this.f6346n = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.O(this.f6346n).getViewModelStore();
        }
    }

    public static final class Dsr extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f6347n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f6348t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dsr(Fragment fragment, Lazy lazy) {
            super(0);
            this.f6347n = fragment;
            this.f6348t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f6348t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.f6347n.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class I28 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f6349n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Fragment fragment) {
            super(0);
            this.f6349n = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f6349n;
        }
    }

    public static final class Ml extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f6350n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f6351t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Fragment fragment, Lazy lazy) {
            super(0);
            this.f6350n = fragment;
            this.f6351t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f6351t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.f6350n.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class Wre extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f6352n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Function0 function0) {
            super(0);
            this.f6352n = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f6352n.invoke();
        }
    }

    public static final class aC extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f6353n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public aC(Fragment fragment) {
            super(0);
            this.f6353n = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f6353n;
        }
    }

    public static final class fuX extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f6354n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f6355t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public fuX(Function0 function0, Lazy lazy) {
            super(0);
            this.f6354n = function0;
            this.f6355t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f6354n;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f6355t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t;
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ProjectInfo.j f6356O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6357n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ProjectInfo.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f6356O = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Sis.this.new j(this.f6356O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6357n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                l.CN3 cn3FX = Sis.this.FX();
                String strA = Sis.this.a();
                if (strA == null) {
                    return Unit.INSTANCE;
                }
                String id = this.f6356O.getId();
                this.f6357n = 1;
                if (cn3FX.g(strA, id, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class n implements Function2 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f6360t;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public static final class CN3 implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String title = ((ProjectInfo.j) obj).getTitle();
                Locale locale = Locale.ROOT;
                String lowerCase = title.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((ProjectInfo.j) obj2).getTitle().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                return ComparisonsKt.compareValues(lowerCase, lowerCase2);
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        /* synthetic */ class I28 extends FunctionReferenceImpl implements Function0 {
            I28(Object obj) {
                super(0, obj, kO4.class, "onUploadXmlClicked", "onUploadXmlClicked()V", 0);
            }

            public final void n() {
                ((kO4) this.receiver).T();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        /* synthetic */ class Ml extends FunctionReferenceImpl implements Function0 {
            Ml(Object obj) {
                super(0, obj, l.CN3.class, "onGetMoreSpaceClicked", "onGetMoreSpaceClicked()V", 0);
            }

            public final void n() {
                ((l.CN3) this.receiver).e();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public static final class fuX implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Long.valueOf(((ProjectInfo.j) obj2).getLastModified()), Long.valueOf(((ProjectInfo.j) obj).getLastModified()));
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f6361n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Sis f6362t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Sis sis, Continuation continuation) {
                super(2, continuation);
                this.f6362t = sis;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f6362t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f6361n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f6362t.I().fD();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: M.Sis$n$n, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        static final class C0226n extends SuspendLambda implements Function2 {
            final /* synthetic */ PagerState J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Sis f6363O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f6364n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f6365t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((C0226n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0226n(List list, Sis sis, PagerState pagerState, Continuation continuation) {
                super(2, continuation);
                this.f6365t = list;
                this.f6363O = sis;
                this.J2 = pagerState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0226n(this.f6365t, this.f6363O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f6364n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    int iIndexOf = this.f6365t.indexOf(this.f6363O.D());
                    if (this.J2.P5() != iIndexOf) {
                        PagerState pagerState = this.J2;
                        this.f6364n = 1;
                        if (PagerState.GR(pagerState, iIndexOf, 0.0f, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        static final class w6 extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ String f6366O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f6367n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Sis f6368t;

            static final class j extends SuspendLambda implements Function2 {
                final /* synthetic */ String J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Scene f6369O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f6370n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Sis f6371t;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                    return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(Sis sis, Scene scene, String str, Continuation continuation) {
                    super(2, continuation);
                    this.f6371t = sis;
                    this.f6369O = scene;
                    this.J2 = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new j(this.f6371t, this.f6369O, this.J2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    MainActivity mainActivity;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f6370n == 0) {
                        ResultKt.throwOnFailure(obj);
                        Activity activityE = this.f6371t.E();
                        if (activityE instanceof MainActivity) {
                            mainActivity = (MainActivity) activityE;
                        } else {
                            mainActivity = null;
                        }
                        MainActivity mainActivity2 = mainActivity;
                        if (mainActivity2 != null) {
                            mainActivity2.yUZ(zd.w6.O(this.f6369O), "xml", this.J2, this.f6369O.getType(), true, j.n.f75490n);
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            w6(Sis sis, String str, Continuation continuation) {
                super(2, continuation);
                this.f6368t = sis;
                this.f6366O = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new w6(this.f6368t, this.f6366O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f6367n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Context contextRequireContext = this.f6368t.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(HI0.afx.o(contextRequireContext, this.f6366O), null, 1, null), false, false, false, 14, null);
                    if (this.f6366O.length() > 0) {
                        GJW.DC dcT = GJW.OU.t();
                        j jVar = new j(this.f6368t, sceneUnserializeScene$default, this.f6366O, null);
                        this.f6367n = 1;
                        if (GJW.Dsr.Uo(dcT, jVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public /* synthetic */ class Wre {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[KA9.u.values().length];
                try {
                    iArr[KA9.u.f5008t.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[KA9.u.f5007n.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        n(TFv.Wre wre) {
            this.f6360t = wre;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit E2(I28.j jVar, Sis sis, ProjectInfo.j project) {
            Intrinsics.checkNotNullParameter(project, "project");
            jVar.O();
            sis.GR(project);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit N(Sis sis, rv6 action) {
            Pair pairRl;
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.areEqual(action, rv6.w6.f6520n)) {
                sis.xmlImporter.n(new Intent("android.intent.action.OPEN_DOCUMENT").setType("*/*").putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/zip", "application/xml", "text/xml"}));
                Unit unit = Unit.INSTANCE;
            } else if (action instanceof rv6.n) {
                rv6.n nVar = (rv6.n) action;
                String strN = nVar.n();
                if ((strN == null || GJW.C.nr(LifecycleOwnerKt.n(sis), GJW.OU.rl(), null, new w6(sis, strN, null), 2, null) == null) && (pairRl = nVar.rl()) != null) {
                    int iIntValue = ((Number) pairRl.component1()).intValue();
                    int iIntValue2 = ((Number) pairRl.component2()).intValue();
                    ComponentCallbacks2 componentCallbacks2E = sis.E();
                    Vi.CN3 cn3 = componentCallbacks2E instanceof Vi.CN3 ? (Vi.CN3) componentCallbacks2E : null;
                    if (cn3 != null) {
                        cn3.az();
                    }
                    int i2 = iIntValue + iIntValue2;
                    if (iIntValue2 == 0) {
                        String string = sis.getResources().getString(2132017158);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        String string2 = sis.getResources().getString(2132017155, Integer.valueOf(iIntValue));
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        sis.G7(string, string2);
                    } else {
                        String string3 = sis.getResources().getString(2132017160);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        sis.G7(string3, CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{sis.getResources().getQuantityString(2131886080, iIntValue, Integer.valueOf(iIntValue), Integer.valueOf(i2)), sis.getResources().getQuantityString(2131886081, iIntValue2, Integer.valueOf(iIntValue2))}), "\n", null, null, 0, null, null, 62, null));
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            } else {
                if (!(action instanceof rv6.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                String string4 = sis.getResources().getString(2132017159);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                String string5 = ((rv6.j) action).n() ? sis.getResources().getString(2132017157) : sis.getResources().getString(2132017156);
                Intrinsics.checkNotNull(string5);
                sis.G7(string4, string5);
                Unit unit3 = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit S(I28.j jVar, Sis sis, six.CN3 filterType) {
            Intrinsics.checkNotNullParameter(filterType, "filterType");
            jVar.O();
            sis.I().E2(filterType);
            ComponentCallbacks2 componentCallbacks2E = sis.E();
            Intrinsics.checkNotNull(componentCallbacks2E, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.main.maintabs.SubTabHolder");
            ((Um) componentCallbacks2E).s7N(filterType);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit T(I28.j jVar, OnBackPressedCallback ConditionalBackPressHandler) {
            Intrinsics.checkNotNullParameter(ConditionalBackPressHandler, "$this$ConditionalBackPressHandler");
            jVar.Uo(null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ViF(I28.j jVar, Sis sis, ProjectInfo.n project) {
            Intrinsics.checkNotNullParameter(project, "project");
            jVar.O();
            ComponentCallbacks2 componentCallbacks2E = sis.E();
            Intrinsics.checkNotNull(componentCallbacks2E, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.projectlist.ProjectListHost");
            ((Vi.CN3) componentCallbacks2E).ty(project);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit WPU(I28.j jVar, Sis sis, KA9.u option) {
            Intrinsics.checkNotNullParameter(option, "option");
            jVar.O();
            sis.I().e(option);
            ComponentCallbacks2 componentCallbacks2E = sis.E();
            Intrinsics.checkNotNull(componentCallbacks2E, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.projectlist.ProjectListHost");
            ((Vi.CN3) componentCallbacks2E).az();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit XQ(I28.j jVar, Sis sis, ProjectInfo.n project) {
            Intrinsics.checkNotNullParameter(project, "project");
            jVar.O();
            ComponentCallbacks2 componentCallbacks2E = sis.E();
            Intrinsics.checkNotNull(componentCallbacks2E, XIvb.SNEH);
            ((Vi.CN3) componentCallbacks2E).ty(project);
            ComponentCallbacks2 componentCallbacks2E2 = sis.E();
            Intrinsics.checkNotNull(componentCallbacks2E2, "null cannot be cast to non-null type com.alightcreative.export.exportlist.ExportListFragment.Exporter");
            qf.n.j.t((qf.n) componentCallbacks2E2, 2131361994, null, false, null, null, 30, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit aYN(I28.j jVar, Sis sis, ProjectInfo project) {
            Intrinsics.checkNotNullParameter(project, "project");
            jVar.O();
            ComponentCallbacks2 componentCallbacks2E = sis.E();
            Intrinsics.checkNotNull(componentCallbacks2E, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.projectlist.ProjectListHost");
            ((Vi.CN3) componentCallbacks2E).nr(project);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit fD(I28.j jVar, Sis sis, ProjectInfo.j project) {
            Intrinsics.checkNotNullParameter(project, "project");
            jVar.O();
            l.CN3 cn3FX = sis.FX();
            ComponentCallbacks2 componentCallbacks2E = sis.E();
            Intrinsics.checkNotNull(componentCallbacks2E, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.projectlist.ProjectListHost");
            cn3FX.te((Vi.CN3) componentCallbacks2E, project.getId(), sis.B());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(I28.j jVar, Sis sis, ProjectInfo.n project) {
            Intrinsics.checkNotNullParameter(project, "project");
            jVar.O();
            ComponentCallbacks2 componentCallbacks2E = sis.E();
            Intrinsics.checkNotNull(componentCallbacks2E, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.projectlist.ProjectListHost");
            ((Vi.CN3) componentCallbacks2E).rl(sis.D().nr(), project);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit iF(I28.j jVar, Sis sis, ProjectInfo.j project) {
            Intrinsics.checkNotNullParameter(project, "project");
            jVar.O();
            Sis.z(sis, project.getId(), null, 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nY(I28.j jVar, Sis sis, ProjectInfo.n project) {
            Intrinsics.checkNotNullParameter(project, "project");
            jVar.O();
            ComponentCallbacks2 componentCallbacks2E = sis.E();
            Intrinsics.checkNotNull(componentCallbacks2E, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.projectlist.ProjectListHost");
            ((Vi.CN3) componentCallbacks2E).ty(project);
            ComponentCallbacks2 componentCallbacks2E2 = sis.E();
            Intrinsics.checkNotNull(componentCallbacks2E2, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.projectlist.ProjectListHost");
            ((Vi.CN3) componentCallbacks2E2).N();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s7N(Sis sis, AbstractC2254j action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof AbstractC2254j.n) {
                sis.ofS(((AbstractC2254j.n) action).n());
            } else if (action instanceof AbstractC2254j.C1045j) {
                AbstractC2254j.C1045j c1045j = (AbstractC2254j.C1045j) action;
                sis.m(c1045j.n(), c1045j.rl());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit te(I28.j jVar, Sis sis, ProjectInfo.n project) {
            Intrinsics.checkNotNullParameter(project, "project");
            jVar.O();
            ComponentCallbacks2 componentCallbacks2E = sis.E();
            Vi.CN3 cn3 = componentCallbacks2E instanceof Vi.CN3 ? (Vi.CN3) componentCallbacks2E : null;
            if (cn3 != null) {
                cn3.r(sis.D().t(), project);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            o((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void o(Composer composer, int i2) {
            int i3;
            List listSortedWith;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-832684930, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.MainTabProjectListFragment.onViewCreated.<anonymous> (MainTabProjectListFragment.kt:111)");
            }
            Sis.this.I().XQ();
            Composer composer2 = composer;
            State stateN = SnapshotStateKt.n(this.f6360t, CollectionsKt.emptyList(), null, composer2, 48, 2);
            List listB = Sis.this.B();
            composer2.eF(-168218986);
            boolean zE2 = composer2.E2(Sis.this);
            Sis sis = Sis.this;
            Object objIF = composer2.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(sis, null);
                composer2.o(objIF);
            }
            composer2.Xw();
            EffectsKt.O(listB, (Function2) objIF, composer2, 0);
            c7r c7rVar = (c7r) LiveDataAdapterKt.n(Sis.this.I().t(), composer2, 0).getValue();
            composer2.eF(-168210142);
            if (c7rVar instanceof c7r.j) {
                final I28.j jVarN = six.Wre.n(composer2, 0);
                six.CN3 cn3 = six.CN3.f73284t;
                six.CN3 cn32 = six.CN3.f73279O;
                c7r.j jVar = (c7r.j) c7rVar;
                if (!jVar.KN()) {
                    cn32 = null;
                }
                six.CN3 cn33 = six.CN3.J2;
                six.CN3 cn34 = six.CN3.f73283r;
                if (!jVar.Uo()) {
                    cn34 = null;
                }
                final List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new six.CN3[]{cn3, cn32, cn33, cn34});
                composer2.eF(-168196560);
                boolean zP5 = composer2.p5(listListOfNotNull);
                Object objIF2 = composer2.iF();
                if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0() { // from class: M.l4Z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(Sis.n.wTp(listListOfNotNull));
                        }
                    };
                    composer2.o(objIF2);
                }
                composer2.Xw();
                PagerState pagerStateQie = PagerStateKt.qie(0, 0.0f, (Function0) objIF2, composer2, 0, 3);
                int i5 = Wre.$EnumSwitchMapping$0[jVar.O().ordinal()];
                if (i5 == 1) {
                    listSortedWith = CollectionsKt.sortedWith(Z(stateN), new fuX());
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listSortedWith = CollectionsKt.sortedWith(Z(stateN), new CN3());
                }
                List listB2 = Sis.this.B();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB2) {
                    if (((ProjectInfo.n) obj).getType() != SceneType.PRESET) {
                        arrayList.add(obj);
                    }
                }
                List listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) listSortedWith);
                List listJ = Sis.this.J();
                six.CN3 cn3D = Sis.this.D();
                boolean z2 = !Sis.this.J().isEmpty();
                l.CN3 cn3FX = Sis.this.FX();
                composer2.eF(-168144768);
                boolean zE22 = composer2.E2(cn3FX);
                Object objIF3 = composer2.iF();
                if (zE22 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new Ml(cn3FX);
                    composer2.o(objIF3);
                }
                KFunction kFunction = (KFunction) objIF3;
                composer2.Xw();
                composer2.eF(-168093527);
                boolean zE23 = composer2.E2(jVarN) | composer2.E2(Sis.this);
                final Sis sis2 = Sis.this;
                Object objIF4 = composer2.iF();
                if (zE23 || objIF4 == Composer.INSTANCE.n()) {
                    objIF4 = new Function1() { // from class: M.R6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Sis.n.XQ(jVarN, sis2, (ProjectInfo.n) obj2);
                        }
                    };
                    composer2.o(objIF4);
                }
                Function1 function1 = (Function1) objIF4;
                composer2.Xw();
                Function1 function12 = jVar.t() ? function1 : null;
                kO4 ko4I = Sis.this.I();
                composer2.eF(-168049422);
                boolean zE24 = composer2.E2(ko4I);
                Object objIF5 = composer2.iF();
                if (zE24 || objIF5 == Composer.INSTANCE.n()) {
                    objIF5 = new I28(ko4I);
                    composer2.o(objIF5);
                }
                KFunction kFunction2 = (KFunction) objIF5;
                composer2.Xw();
                BitmapLruCache bitmapLruCache = Sis.this.thumbnailCache;
                ComponentCallbacks2 componentCallbacks2E = Sis.this.E();
                Intrinsics.checkNotNull(componentCallbacks2E, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.projectlist.ProjectListHost");
                SceneThumbnailMaker sceneThumbnailMakerS = ((Vi.CN3) componentCallbacks2E).S();
                composer2.eF(-168163989);
                boolean zE25 = composer2.E2(jVarN) | composer2.E2(Sis.this);
                final Sis sis3 = Sis.this;
                Object objIF6 = composer2.iF();
                if (zE25 || objIF6 == Composer.INSTANCE.n()) {
                    objIF6 = new Function1() { // from class: M.mz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Sis.n.S(jVarN, sis3, (six.CN3) obj2);
                        }
                    };
                    composer2.o(objIF6);
                }
                Function1 function13 = (Function1) objIF6;
                composer2.Xw();
                composer2.eF(-168153758);
                boolean zE26 = composer2.E2(jVarN) | composer2.E2(Sis.this);
                final Sis sis4 = Sis.this;
                Object objIF7 = composer2.iF();
                if (zE26 || objIF7 == Composer.INSTANCE.n()) {
                    objIF7 = new Function1() { // from class: M.OU
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Sis.n.WPU(jVarN, sis4, (KA9.u) obj2);
                        }
                    };
                    composer2.o(objIF7);
                }
                Function1 function14 = (Function1) objIF7;
                composer2.Xw();
                Function0 function0 = (Function0) kFunction;
                composer2.eF(-168141813);
                boolean zE27 = composer2.E2(jVarN) | composer2.E2(Sis.this);
                final Sis sis5 = Sis.this;
                Object objIF8 = composer2.iF();
                if (zE27 || objIF8 == Composer.INSTANCE.n()) {
                    objIF8 = new Function1() { // from class: M.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Sis.n.aYN(jVarN, sis5, (ProjectInfo) obj2);
                        }
                    };
                    composer2.o(objIF8);
                }
                Function1 function15 = (Function1) objIF8;
                composer2.Xw();
                composer2.eF(-168134804);
                boolean zE28 = composer2.E2(jVarN) | composer2.E2(Sis.this);
                final Sis sis6 = Sis.this;
                Object objIF9 = composer2.iF();
                if (zE28 || objIF9 == Composer.INSTANCE.n()) {
                    objIF9 = new Function1() { // from class: M.O
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Sis.n.ViF(jVarN, sis6, (ProjectInfo.n) obj2);
                        }
                    };
                    composer2.o(objIF9);
                }
                Function1 function16 = (Function1) objIF9;
                composer2.Xw();
                composer2.eF(-168127689);
                boolean zE29 = composer2.E2(jVarN) | composer2.E2(Sis.this);
                final Sis sis7 = Sis.this;
                Object objIF10 = composer2.iF();
                if (zE29 || objIF10 == Composer.INSTANCE.n()) {
                    objIF10 = new Function1() { // from class: M.LEl
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Sis.n.nY(jVarN, sis7, (ProjectInfo.n) obj2);
                        }
                    };
                    composer2.o(objIF10);
                }
                Function1 function17 = (Function1) objIF10;
                composer2.Xw();
                composer2.eF(-168118065);
                boolean zE210 = composer2.E2(jVarN) | composer2.E2(Sis.this);
                final Sis sis8 = Sis.this;
                Object objIF11 = composer2.iF();
                if (zE210 || objIF11 == Composer.INSTANCE.n()) {
                    objIF11 = new Function1() { // from class: M.gnv
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Sis.n.g(jVarN, sis8, (ProjectInfo.n) obj2);
                        }
                    };
                    composer2.o(objIF11);
                }
                Function1 function18 = (Function1) objIF11;
                composer2.Xw();
                composer2.eF(-168105814);
                boolean zE211 = composer2.E2(jVarN) | composer2.E2(Sis.this);
                final Sis sis9 = Sis.this;
                Object objIF12 = composer2.iF();
                if (zE211 || objIF12 == Composer.INSTANCE.n()) {
                    objIF12 = new Function1() { // from class: M.fg
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Sis.n.te(jVarN, sis9, (ProjectInfo.n) obj2);
                        }
                    };
                    composer2.o(objIF12);
                }
                Function1 function19 = (Function1) objIF12;
                composer2.Xw();
                composer2.eF(-168080858);
                boolean zE212 = composer2.E2(jVarN) | composer2.E2(Sis.this);
                final Sis sis10 = Sis.this;
                Object objIF13 = composer2.iF();
                if (zE212 || objIF13 == Composer.INSTANCE.n()) {
                    objIF13 = new Function1() { // from class: M.KH
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Sis.n.iF(jVarN, sis10, (ProjectInfo.j) obj2);
                        }
                    };
                    composer2.o(objIF13);
                }
                Function1 function110 = (Function1) objIF13;
                composer2.Xw();
                composer2.eF(-168073515);
                boolean zE213 = composer2.E2(jVarN) | composer2.E2(Sis.this);
                final Sis sis11 = Sis.this;
                Object objIF14 = composer2.iF();
                if (zE213 || objIF14 == Composer.INSTANCE.n()) {
                    objIF14 = new Function1() { // from class: M.Mf
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Sis.n.fD(jVarN, sis11, (ProjectInfo.j) obj2);
                        }
                    };
                    composer2.o(objIF14);
                }
                Function1 function111 = (Function1) objIF14;
                composer2.Xw();
                composer2.eF(-168060978);
                boolean zE214 = composer2.E2(jVarN) | composer2.E2(Sis.this);
                final Sis sis12 = Sis.this;
                Object objIF15 = composer2.iF();
                if (zE214 || objIF15 == Composer.INSTANCE.n()) {
                    objIF15 = new Function1() { // from class: M.o7q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Sis.n.E2(jVarN, sis12, (ProjectInfo.j) obj2);
                        }
                    };
                    composer2.o(objIF15);
                }
                Function1 function112 = (Function1) objIF15;
                composer2.Xw();
                composer2.eF(-168054396);
                boolean zE215 = composer2.E2(Sis.this);
                final Sis sis13 = Sis.this;
                Object objIF16 = composer2.iF();
                if (zE215 || objIF16 == Composer.INSTANCE.n()) {
                    objIF16 = new Function0() { // from class: M.xZD
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Sis.n.e(sis13);
                        }
                    };
                    composer2.o(objIF16);
                }
                composer2.Xw();
                AbstractC2498z.o(jVar, jVarN, listListOfNotNull, pagerStateQie, listPlus, cn3D, z2, listJ, function13, function14, function0, function15, function16, function17, function18, function19, function12, function110, function111, function112, (Function0) objIF16, (Function0) kFunction2, bitmapLruCache, sceneThumbnailMakerS, composer, 0, 0, 0, 0);
                six.CN3 cn3D2 = Sis.this.D();
                composer.eF(-168032717);
                boolean zP52 = composer.p5(listListOfNotNull) | composer.E2(Sis.this) | composer.p5(pagerStateQie);
                Sis sis14 = Sis.this;
                Object objIF17 = composer.iF();
                if (zP52 || objIF17 == Composer.INSTANCE.n()) {
                    objIF17 = new C0226n(listListOfNotNull, sis14, pagerStateQie, null);
                    composer.o(objIF17);
                }
                composer.Xw();
                i3 = 0;
                EffectsKt.O(cn3D2, (Function2) objIF17, composer, 0);
                Sis sis15 = Sis.this;
                composer.eF(-168018787);
                boolean zE216 = composer.E2(jVarN);
                Object objIF18 = composer.iF();
                if (zE216 || objIF18 == Composer.INSTANCE.n()) {
                    objIF18 = new Function0() { // from class: M.M5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(Sis.n.X(jVarN));
                        }
                    };
                    composer.o(objIF18);
                }
                Function0 function02 = (Function0) objIF18;
                composer.Xw();
                composer.eF(-168016699);
                boolean zE217 = composer.E2(jVarN);
                Object objIF19 = composer.iF();
                if (zE217 || objIF19 == Composer.INSTANCE.n()) {
                    objIF19 = new Function1() { // from class: M.YzO
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Sis.n.T(jVarN, (OnBackPressedCallback) obj2);
                        }
                    };
                    composer.o(objIF19);
                }
                composer.Xw();
                N.I28.xMQ(sis15, function02, null, (Function1) objIF19, composer, 0, 2);
                composer2 = composer;
            } else {
                i3 = 0;
            }
            composer2.Xw();
            kO4 ko4I2 = Sis.this.I();
            composer2.eF(-168006761);
            boolean zE218 = composer2.E2(Sis.this);
            final Sis sis16 = Sis.this;
            Object objIF20 = composer2.iF();
            if (zE218 || objIF20 == Composer.INSTANCE.n()) {
                objIF20 = new Function1() { // from class: M.QaP
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Sis.n.N(sis16, (rv6) obj2);
                    }
                };
                composer2.o(objIF20);
            }
            composer2.Xw();
            uW.I28.rl(ko4I2, (Function1) objIF20, composer2, i3);
            l.Xo xo = (l.Xo) LiveDataAdapterKt.n(Sis.this.FX().t(), composer2, i3).getValue();
            composer2.eF(-167871760);
            if (xo instanceof Xo.n) {
                Xo.n nVar = (Xo.n) xo;
                okd.j jVarN2 = nVar.n();
                float fRl = nVar.rl();
                composer2.eF(-167860372);
                boolean zE219 = composer2.E2(Sis.this);
                final Sis sis17 = Sis.this;
                Object objIF21 = composer2.iF();
                if (zE219 || objIF21 == Composer.INSTANCE.n()) {
                    objIF21 = new Function0() { // from class: M.FKk
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Sis.n.nHg(sis17);
                        }
                    };
                    composer2.o(objIF21);
                }
                composer2.Xw();
                AbstractC2431fuX.nr(jVarN2, fRl, (Function0) objIF21, composer2, i3);
            }
            composer2.Xw();
            l.CN3 cn3FX2 = Sis.this.FX();
            composer2.eF(-167851996);
            boolean zE220 = composer2.E2(Sis.this);
            final Sis sis18 = Sis.this;
            Object objIF22 = composer2.iF();
            if (zE220 || objIF22 == Composer.INSTANCE.n()) {
                objIF22 = new Function1() { // from class: M.Fl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Sis.n.s7N(sis18, (AbstractC2254j) obj2);
                    }
                };
                composer2.o(objIF22);
            }
            composer2.Xw();
            uW.I28.rl(cn3FX2, (Function1) objIF22, composer2, i3);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean X(I28.j jVar) {
            if (jVar.t() != null) {
                return true;
            }
            return false;
        }

        private static final List Z(State state) {
            return (List) state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Sis sis) {
            Activity activityE = sis.E();
            Intrinsics.checkNotNull(activityE, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.main.MainActivity");
            ((MainActivity) activityE).te(M.CN3.f6256g);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nHg(Sis sis) {
            String strA = sis.a();
            if (strA != null) {
                sis.FX().nY(strA);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int wTp(List list) {
            return list.size();
        }
    }

    public static final class o extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Lazy f6372n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Lazy lazy) {
            super(0);
            this.f6372n = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.O(this.f6372n).getViewModelStore();
        }
    }

    public static final class qz extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f6373n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f6374t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public qz(Function0 function0, Lazy lazy) {
            super(0);
            this.f6373n = function0;
            this.f6374t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f6373n;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f6374t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6375n;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Sis.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6375n == 0) {
                ResultKt.throwOnFailure(obj);
                Sis.this.I().fD();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, Continuation continuation) {
            return ((w6) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(DialogInterface dialogInterface, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Sis sis, String str, DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        sis.dR0(str, Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l.CN3 FX() {
        return (l.CN3) this.cloudBackupViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G7(String title, String message) {
        new AlertDialog.Builder(E()).setTitle(title).KN(message).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: M.Zs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Sis.fcU(dialogInterface, i2);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void GR(final ProjectInfo.j projectInfo) {
        new AlertDialog.Builder(getContext()).setTitle(2132017666).setMessage(projectInfo.getTitle()).setPositiveButton(2132017650, new DialogInterface.OnClickListener() { // from class: M.iF
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Sis.Nxk(this.f6411n, projectInfo, dialogInterface, i2);
            }
        }).setNegativeButton(2132017396, new DialogInterface.OnClickListener() { // from class: M.yg
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Sis.k(dialogInterface, i2);
            }
        }).create().show();
    }

    private final ya M() {
        ya yaVar = this._binding;
        Intrinsics.checkNotNull(yaVar);
        return yaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Mx(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eTf(Sis sis, DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        sis.FX().e();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eWT(Sis sis, ActivityResult result) {
        Intent data;
        Uri data2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() != -1 || (data = result.getData()) == null || (data2 = data.getData()) == null) {
            return;
        }
        sis.I().aYN(data2, sis.requireContext().getContentResolver().getType(data2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ofS(final String cloudProjectId) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        new com.alightcreative.app.motion.activities.R6(context).mUb(2132017699).nr(2132017697).xMQ(2132017698, new Function1() { // from class: M.P
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Sis.C(this.f6313n, cloudProjectId, (DialogInterface) obj);
            }
        }).J2(2132017396, new Function1() { // from class: M.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Sis.Mx((DialogInterface) obj);
            }
        }).gh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pJg(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xg(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    static /* synthetic */ void z(Sis sis, String str, Boolean bool, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bool = null;
        }
        sis.dR0(str, bool);
    }

    public final kO4 I() {
        return (kO4) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = ya.t(inflater, container, false);
        ConstraintLayout root = M().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        TFv.Wre wreS7N = TFv.fuX.s7N(FX().aYN(), new w6(null));
        M().rl.setKeepScreenOn(true);
        M().rl.setContent(ComposableLambdaKt.rl(-832684930, true, new n(wreS7N)));
    }

    public Sis() {
        I28 i28 = new I28(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Wre(i28));
        this.viewModel = FragmentViewModelLazyKt.t(this, Reflection.getOrCreateKotlinClass(kO4.class), new CN3(lazy), new fuX(null, lazy), new Dsr(this, lazy));
        Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C(new aC(this)));
        this.cloudBackupViewModel = FragmentViewModelLazyKt.t(this, Reflection.getOrCreateKotlinClass(l.CN3.class), new o(lazy2), new qz(null, lazy2), new Ml(this, lazy2));
        this.thumbnailCache = new BitmapLruCache(0, "projectThumbnailCache", 1, null);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: M.vd
            @Override // androidx.view.result.ActivityResultCallback
            public final void n(Object obj) {
                Sis.eWT(this.f6530n, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.xmlImporter = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List B() {
        Vi.CN3 cn3;
        List listG;
        ComponentCallbacks2 componentCallbacks2E = E();
        if (componentCallbacks2E instanceof Vi.CN3) {
            cn3 = (Vi.CN3) componentCallbacks2E;
        } else {
            cn3 = null;
        }
        if (cn3 != null && (listG = cn3.g()) != null) {
            return listG;
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final six.CN3 D() {
        Um um;
        six.CN3 cn3N;
        ComponentCallbacks2 componentCallbacks2E = E();
        if (componentCallbacks2E instanceof Um) {
            um = (Um) componentCallbacks2E;
        } else {
            um = null;
        }
        if (um != null && (cn3N = um.n()) != null) {
            return cn3N;
        }
        return six.CN3.f73284t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nxk(final Sis sis, final ProjectInfo.j jVar, DialogInterface dialogInterface, int i2) {
        PJ9.DAz.G7(sis.E(), new Function0() { // from class: M.Lu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Sis.Y(this.f6286n, jVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(Sis sis, ProjectInfo.j jVar) {
        GJW.C.nr(LifecycleOwnerKt.n(sis), null, null, sis.new j(jVar, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a() {
        FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
        if (firebaseUserXMQ != null) {
            return firebaseUserXMQ.f();
        }
        return null;
    }

    private final void dR0(final String cloudProjectId, final Boolean overwritePrevious) {
        PJ9.DAz.G7(E(), new Function0() { // from class: M.pO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Sis.piY(this.f6457n, cloudProjectId, overwritePrevious);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fcU(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ijL(Sis sis) {
        ComponentCallbacks2 componentCallbacks2E = sis.E();
        Intrinsics.checkNotNull(componentCallbacks2E, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.projectlist.ProjectListHost");
        ((Vi.CN3) componentCallbacks2E).az();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(long allowedStorage, boolean canUpgrade) {
        com.alightcreative.app.motion.activities.R6 r6XMQ;
        Context context = getContext();
        if (context == null) {
            return;
        }
        com.alightcreative.app.motion.activities.R6 r6MUb = new com.alightcreative.app.motion.activities.R6(context).mUb(2132019587);
        String string = context.getString(2132018963, HI0.gnv.J2(XFr.j.J2(allowedStorage)));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        com.alightcreative.app.motion.activities.R6 r6O = r6MUb.O(string);
        if (canUpgrade) {
            r6XMQ = r6O.xMQ(2132018967, new Function1() { // from class: M.K
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Sis.eTf(this.f6278n, (DialogInterface) obj);
                }
            }).J2(2132017396, new Function1() { // from class: M.psW
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Sis.xg((DialogInterface) obj);
                }
            });
        } else {
            r6XMQ = r6O.xMQ(2132017378, new Function1() { // from class: M.Md
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Sis.pJg((DialogInterface) obj);
                }
            });
        }
        r6XMQ.gh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit piY(final Sis sis, String str, Boolean bool) {
        l.CN3 cn3FX = sis.FX();
        Context contextRequireContext = sis.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String strA = sis.a();
        if (strA == null) {
            return Unit.INSTANCE;
        }
        cn3FX.iF(contextRequireContext, strA, str, bool, new Function0() { // from class: M.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Sis.ijL(this.f6408n);
            }
        });
        return Unit.INSTANCE;
    }

    public final Activity E() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return fragmentActivityRequireActivity;
    }

    public final List J() {
        Vi.CN3 cn3;
        List listIk;
        ComponentCallbacks2 componentCallbacks2E = E();
        if (componentCallbacks2E instanceof Vi.CN3) {
            cn3 = (Vi.CN3) componentCallbacks2E;
        } else {
            cn3 = null;
        }
        if (cn3 != null && (listIk = cn3.Ik()) != null) {
            return listIk;
        }
        return CollectionsKt.emptyList();
    }

    @Override // KC.g9s
    public void Uo() {
        KC.rrk rrkVar;
        ComponentCallbacks2 componentCallbacks2E = E();
        if (componentCallbacks2E instanceof KC.rrk) {
            rrkVar = (KC.rrk) componentCallbacks2E;
        } else {
            rrkVar = null;
        }
        if (rrkVar != null) {
            rrkVar.XQ(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
