package M;

import M.S;
import M.eZk;
import M.oXP;
import QmE.j;
import SJ0.op;
import android.app.Activity;
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
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.HasDefaultViewModelProviderFactory;
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
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import six.I28;
import xr.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0004R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u00109\u001a\b\u0012\u0004\u0012\u000204038\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010?\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u00010;0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010@R\u0011\u0010D\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\b5\u0010CR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020F0E8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020F0E8F¢\u0006\u0006\u001a\u0004\bJ\u0010H¨\u0006N²\u0006\f\u0010M\u001a\u00020L8\nX\u008a\u0084\u0002"}, d2 = {"LM/S;", "Landroidx/fragment/app/Fragment;", "LKC/g9s;", "<init>", "()V", "", "title", "message", "", "v", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Uo", "LeQ/fuX;", "o", "LeQ/fuX;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()LeQ/fuX;", "setImageLoader", "(LeQ/fuX;)V", "imageLoader", "LQmE/iF;", "Z", "LQmE/iF;", "X", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LSJ0/op;", "S", "LSJ0/op;", "_binding", "LM/OA;", "g", "Lkotlin/Lazy;", "wTp", "()LM/OA;", "viewModel", "Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "Lcom/alightcreative/app/motion/project/ProjectInfo;", "E2", "Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "s7N", "()Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "thumbnailCache", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "e", "Landroidx/activity/result/ActivityResultLauncher;", "xmlImporter", "()LSJ0/op;", "binding", "Landroid/app/Activity;", "()Landroid/app/Activity;", "activity", "", "Lcom/alightcreative/app/motion/project/ProjectInfo$n;", "N", "()Ljava/util/List;", "projectList", "nHg", "selectedProjects", "Landroidx/compose/ui/unit/Dp;", "yOffset", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainTabTemplateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainTabTemplateFragment.kt\ncom/alightcreative/app/motion/activities/main/maintabs/MainTabTemplateFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,318:1\n106#2,15:319\n*S KotlinDebug\n*F\n+ 1 MainTabTemplateFragment.kt\ncom/alightcreative/app/motion/activities/main/maintabs/MainTabTemplateFragment\n*L\n76#1:319,15\n*E\n"})
public final class S extends M.Ml implements KC.g9s {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final BitmapLruCache thumbnailCache;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private op _binding;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher xmlImporter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public eQ.fuX imageLoader;

    public static final class I28 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f6327n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f6328t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Function0 function0, Lazy lazy) {
            super(0);
            this.f6327n = function0;
            this.f6328t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f6327n;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f6328t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t;
        }
    }

    public static final class Ml extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Lazy f6329n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Lazy lazy) {
            super(0);
            this.f6329n = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.O(this.f6329n).getViewModelStore();
        }
    }

    public static final class Wre extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f6330n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f6331t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Fragment fragment, Lazy lazy) {
            super(0);
            this.f6330n = fragment;
            this.f6331t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f6331t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.f6330n.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    static final class j implements Function2 {

        /* JADX INFO: renamed from: M.S$j$j, reason: collision with other inner class name */
        static final class C0224j implements Function3 {
            final /* synthetic */ State J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ S f6333O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ProjectInfo.n f6334n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28.n f6335t;

            /* JADX INFO: renamed from: M.S$j$j$j, reason: collision with other inner class name */
            static final class C0225j implements Function3 {
                final /* synthetic */ State J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ S f6336O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ ProjectInfo.n f6337n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ I28.n f6338t;

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit J2(I28.n nVar) {
                    nVar.Uo(null);
                    return Unit.INSTANCE;
                }

                C0225j(ProjectInfo.n nVar, I28.n nVar2, S s2, State state) {
                    this.f6337n = nVar;
                    this.f6338t = nVar2;
                    this.f6336O = s2;
                    this.J2 = state;
                }

                public final void O(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
                    int i3;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer.p5(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i3 & 19) == 18 && composer.xMQ()) {
                        composer.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1257423180, i3, -1, "com.alightcreative.app.motion.activities.main.maintabs.MainTabTemplateFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainTabTemplateFragment.kt:180)");
                    }
                    ProjectInfo.n nVar = this.f6337n;
                    if (nVar != null) {
                        float fZ = j.Z(this.J2);
                        float fNr = BoxWithConstraints.nr();
                        composer.eF(1850522087);
                        boolean zP5 = composer.p5(this.f6338t);
                        final I28.n nVar2 = this.f6338t;
                        Object objIF = composer.iF();
                        if (zP5 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function0() { // from class: M.nSC
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return S.j.C0224j.C0225j.J2(nVar2);
                                }
                            };
                            composer.o(objIF);
                        }
                        Function0 function0 = (Function0) objIF;
                        composer.Xw();
                        composer.eF(1850525121);
                        boolean zP52 = composer.p5(this.f6338t) | composer.E2(this.f6336O) | composer.p5(this.f6337n);
                        final I28.n nVar3 = this.f6338t;
                        final S s2 = this.f6336O;
                        final ProjectInfo.n nVar4 = this.f6337n;
                        Object objIF2 = composer.iF();
                        if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                            objIF2 = new Function0() { // from class: M.ozJ
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return S.j.C0224j.C0225j.Uo(nVar3, s2, nVar4);
                                }
                            };
                            composer.o(objIF2);
                        }
                        Function0 function02 = (Function0) objIF2;
                        composer.Xw();
                        composer.eF(1850534014);
                        boolean zP53 = composer.p5(this.f6338t) | composer.E2(this.f6336O) | composer.p5(this.f6337n);
                        final I28.n nVar5 = this.f6338t;
                        final S s3 = this.f6336O;
                        final ProjectInfo.n nVar6 = this.f6337n;
                        Object objIF3 = composer.iF();
                        if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                            objIF3 = new Function0() { // from class: M.dT
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return S.j.C0224j.C0225j.KN(nVar5, s3, nVar6);
                                }
                            };
                            composer.o(objIF3);
                        }
                        Function0 function03 = (Function0) objIF3;
                        composer.Xw();
                        composer.eF(1850545867);
                        boolean zP54 = composer.p5(this.f6338t) | composer.E2(this.f6336O) | composer.p5(this.f6337n);
                        final I28.n nVar7 = this.f6338t;
                        final S s4 = this.f6336O;
                        final ProjectInfo.n nVar8 = this.f6337n;
                        Object objIF4 = composer.iF();
                        if (zP54 || objIF4 == Composer.INSTANCE.n()) {
                            objIF4 = new Function0() { // from class: M.AZy
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return S.j.C0224j.C0225j.xMQ(nVar7, s4, nVar8);
                                }
                            };
                            composer.o(objIF4);
                        }
                        Function0 function04 = (Function0) objIF4;
                        composer.Xw();
                        BitmapLruCache thumbnailCache = this.f6336O.getThumbnailCache();
                        ComponentCallbacks2 componentCallbacks2E2 = this.f6336O.E2();
                        Vi.CN3 cn3 = componentCallbacks2E2 instanceof Vi.CN3 ? (Vi.CN3) componentCallbacks2E2 : null;
                        KA9.g9s.O(nVar, fZ, fNr, function0, function02, function03, null, null, null, null, function04, null, null, thumbnailCache, cn3 != null ? cn3.S() : null, null, composer, 0, 0, 39872);
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    O((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit KN(I28.n nVar, S s2, ProjectInfo.n nVar2) {
                    Vi.CN3 cn3;
                    nVar.O();
                    ComponentCallbacks2 componentCallbacks2E2 = s2.E2();
                    Vi.CN3 cn32 = null;
                    if (componentCallbacks2E2 instanceof Vi.CN3) {
                        cn3 = (Vi.CN3) componentCallbacks2E2;
                    } else {
                        cn3 = null;
                    }
                    if (cn3 != null) {
                        cn3.ty(nVar2);
                    }
                    ComponentCallbacks2 componentCallbacks2E22 = s2.E2();
                    if (componentCallbacks2E22 instanceof Vi.CN3) {
                        cn32 = (Vi.CN3) componentCallbacks2E22;
                    }
                    if (cn32 != null) {
                        cn32.N();
                    }
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit Uo(I28.n nVar, S s2, ProjectInfo.n nVar2) {
                    Vi.CN3 cn3;
                    nVar.O();
                    ComponentCallbacks2 componentCallbacks2E2 = s2.E2();
                    if (componentCallbacks2E2 instanceof Vi.CN3) {
                        cn3 = (Vi.CN3) componentCallbacks2E2;
                    } else {
                        cn3 = null;
                    }
                    if (cn3 != null) {
                        cn3.ty(nVar2);
                    }
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit xMQ(I28.n nVar, S s2, ProjectInfo.n nVar2) {
                    Vi.CN3 cn3;
                    nVar.O();
                    ComponentCallbacks2 componentCallbacks2E2 = s2.E2();
                    if (componentCallbacks2E2 instanceof Vi.CN3) {
                        cn3 = (Vi.CN3) componentCallbacks2E2;
                    } else {
                        cn3 = null;
                    }
                    if (cn3 != null) {
                        cn3.r(six.fuX.f73288O, nVar2);
                    }
                    return Unit.INSTANCE;
                }
            }

            C0224j(ProjectInfo.n nVar, I28.n nVar2, S s2, State state) {
                this.f6334n = nVar;
                this.f6335t = nVar2;
                this.f6333O = s2;
                this.J2 = state;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1723998626, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.MainTabTemplateFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (MainTabTemplateFragment.kt:177)");
                }
                BoxWithConstraintsKt.n(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.nr(-1257423180, true, new C0225j(this.f6334n, this.f6335t, this.f6333O, this.J2), composer, 54), composer, 3078, 6);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit S(I28.n nVar, OnBackPressedCallback ConditionalBackPressHandler) {
            Intrinsics.checkNotNullParameter(ConditionalBackPressHandler, "$this$ConditionalBackPressHandler");
            nVar.Uo(null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit WPU(S s2, oXP action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.areEqual(action, oXP.w6.f6450n)) {
                s2.xmlImporter.n(new Intent("android.intent.action.OPEN_DOCUMENT").setType("*/*").putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/zip", "application/xml", "text/xml"}));
            } else if (action instanceof oXP.n) {
                oXP.n nVar = (oXP.n) action;
                String strN = nVar.n();
                if (strN != null) {
                    Context contextRequireContext = s2.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(HI0.afx.o(contextRequireContext, strN), null, 1, null), false, false, false, 14, null);
                    if (strN.length() > 0) {
                        Activity activityE2 = s2.E2();
                        MainActivity mainActivity = activityE2 instanceof MainActivity ? (MainActivity) activityE2 : null;
                        if (mainActivity != 0) {
                            mainActivity.yUZ(zd.w6.O(sceneUnserializeScene$default), "xml", strN, sceneUnserializeScene$default.getType(), true, j.n.f75490n);
                        }
                    }
                } else {
                    Pair pairRl = nVar.rl();
                    if (pairRl != null) {
                        int iIntValue = ((Number) pairRl.component1()).intValue();
                        int iIntValue2 = ((Number) pairRl.component2()).intValue();
                        ComponentCallbacks2 componentCallbacks2E2 = s2.E2();
                        Vi.Dsr dsr = componentCallbacks2E2 instanceof Vi.CN3 ? (Vi.CN3) componentCallbacks2E2 : null;
                        if (dsr != null) {
                            dsr.az();
                        }
                        int i2 = iIntValue + iIntValue2;
                        if (iIntValue2 == 0) {
                            String string = s2.getResources().getString(2132017158);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            String string2 = s2.getResources().getString(2132017155, Integer.valueOf(iIntValue));
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            s2.v(string, string2);
                        } else {
                            String string3 = s2.getResources().getString(2132017160);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            s2.v(string3, CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{s2.getResources().getQuantityString(2131886080, iIntValue, Integer.valueOf(iIntValue), Integer.valueOf(i2)), s2.getResources().getQuantityString(2131886081, iIntValue2, Integer.valueOf(iIntValue2))}), "\n", null, null, 0, null, null, 62, null));
                        }
                    }
                }
            } else {
                if (!(action instanceof oXP.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                String string4 = s2.getResources().getString(2132017159);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                String string5 = ((oXP.j) action).n() ? s2.getResources().getString(2132017157) : s2.getResources().getString(2132017156);
                Intrinsics.checkNotNull(string5);
                s2.v(string4, string5);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit az(I28.n nVar, S s2, ProjectInfo.n project) {
            Intrinsics.checkNotNullParameter(project, "project");
            nVar.O();
            ComponentCallbacks2 componentCallbacks2E2 = s2.E2();
            Vi.CN3 cn3 = componentCallbacks2E2 instanceof Vi.CN3 ? (Vi.CN3) componentCallbacks2E2 : null;
            if (cn3 != null) {
                cn3.nr(project);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ck(S s2, tN.n item) {
            Intrinsics.checkNotNullParameter(item, "item");
            s2.X().n(new j.C1441i(item.n(), rWZ.o.f73105n));
            ComponentCallbacks2 componentCallbacks2E2 = s2.E2();
            Vi.Wre wre = componentCallbacks2E2 instanceof Vi.Wre ? (Vi.Wre) componentCallbacks2E2 : null;
            if (wre != null) {
                wre.KN(item.rl());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(I28.n nVar, S s2, KA9.u projectListSortOrder) {
            Intrinsics.checkNotNullParameter(projectListSortOrder, "projectListSortOrder");
            nVar.O();
            s2.wTp().nY(projectListSortOrder);
            ComponentCallbacks2 componentCallbacks2E2 = s2.E2();
            Vi.CN3 cn3 = componentCallbacks2E2 instanceof Vi.CN3 ? (Vi.CN3) componentCallbacks2E2 : null;
            if (cn3 != null) {
                cn3.az();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ty(I28.n nVar, S s2, ProjectInfo.n project) {
            Intrinsics.checkNotNullParameter(project, "project");
            nVar.O();
            ComponentCallbacks2 componentCallbacks2E2 = s2.E2();
            Vi.CN3 cn3 = componentCallbacks2E2 instanceof Vi.CN3 ? (Vi.CN3) componentCallbacks2E2 : null;
            if (cn3 != null) {
                cn3.ty(project);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            qie((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void qie(Composer composer, int i2) {
            final I28.n nVar;
            j jVar = this;
            Composer composer2 = composer;
            if ((i2 & 3) == 2 && composer2.xMQ()) {
                composer2.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(163565192, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.MainTabTemplateFragment.onViewCreated.<anonymous> (MainTabTemplateFragment.kt:110)");
            }
            S.this.wTp().o();
            I28.n nVarRl = six.Wre.rl(composer2, 0);
            eZk ezk = (eZk) LiveDataAdapterKt.n(S.this.wTp().t(), composer2, 0).getValue();
            composer2.eF(1412020796);
            if (ezk instanceof eZk.j) {
                final S s2 = S.this;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                int iN = ComposablesKt.n(composer2, 0);
                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                Modifier modifierO = ComposedModifierKt.O(composer2, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion2.n();
                if (composer2.getApplier() == null) {
                    ComposablesKt.t();
                }
                composer2.T();
                if (composer2.getInserting()) {
                    composer2.s7N(function0N);
                } else {
                    composer2.r();
                }
                Composer composerN = Updater.n(composer2);
                Updater.O(composerN, measurePolicyUo, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                Function2 function2Rl = companion2.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                List listN = s2.N();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listN) {
                    if (((ProjectInfo.n) obj).isTemplate()) {
                        arrayList.add(obj);
                    }
                }
                final Density density = (Density) composer2.ty(CompositionLocalsKt.J2());
                composer2.eF(564356592);
                Object objIF = composer2.iF();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objIF == companion3.n()) {
                    nVar = nVarRl;
                    objIF = SnapshotStateKt__SnapshotStateKt.O(Offset.nr(Offset.O((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32))), null, 2, null);
                    composer2.o(objIF);
                } else {
                    nVar = nVarRl;
                }
                final MutableState mutableState = (MutableState) objIF;
                composer2.Xw();
                composer2.eF(564359288);
                Object objIF2 = composer2.iF();
                if (objIF2 == companion3.n()) {
                    objIF2 = SnapshotStateKt.O(new Function0() { // from class: M.lS
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return S.j.o(density, mutableState);
                        }
                    });
                    composer2.o(objIF2);
                }
                State state = (State) objIF2;
                composer2.Xw();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierNr = BackgroundKt.nr(SizeKt.KN(companion4, 0.0f, 1, null), aD.w6.W(), null, 2, null);
                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer2, 0);
                int iN2 = ComposablesKt.n(composer2, 0);
                CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierNr);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion5.n();
                if (composer2.getApplier() == null) {
                    ComposablesKt.t();
                }
                composer2.T();
                if (composer2.getInserting()) {
                    composer2.s7N(function0N2);
                } else {
                    composer2.r();
                }
                Composer composerN2 = Updater.n(composer2);
                Updater.O(composerN2, measurePolicyN, companion5.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
                Function2 function2Rl2 = companion5.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion5.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                SpacerKt.n(SizeKt.xMQ(companion4, Dp.KN(24)), composer2, 6);
                eZk.j jVar2 = (eZk.j) ezk;
                List listN2 = s2.N();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listN2) {
                    if (((ProjectInfo.n) obj2).isTemplate()) {
                        arrayList2.add(obj2);
                    }
                }
                List listNHg = s2.nHg();
                boolean z2 = !s2.nHg().isEmpty();
                BitmapLruCache thumbnailCache = s2.getThumbnailCache();
                ComponentCallbacks2 componentCallbacks2E2 = s2.E2();
                Vi.CN3 cn3 = componentCallbacks2E2 instanceof Vi.CN3 ? (Vi.CN3) componentCallbacks2E2 : null;
                SceneThumbnailMaker sceneThumbnailMakerS = cn3 != null ? cn3.S() : null;
                eQ.fuX fuxT = s2.T();
                composer2.eF(-503515833);
                boolean zP5 = composer2.p5(nVar) | composer2.E2(s2);
                Object objIF3 = composer2.iF();
                if (zP5 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new Function1() { // from class: M.tI
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return S.j.r(nVar, s2, (KA9.u) obj3);
                        }
                    };
                    composer2.o(objIF3);
                }
                Function1 function1 = (Function1) objIF3;
                composer2.Xw();
                composer2.eF(-503501932);
                boolean zP52 = composer2.p5(nVar) | composer2.E2(s2);
                Object objIF4 = composer2.iF();
                if (zP52 || objIF4 == Composer.INSTANCE.n()) {
                    objIF4 = new Function1() { // from class: M.Pmq
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return S.j.az(nVar, s2, (ProjectInfo.n) obj3);
                        }
                    };
                    composer2.o(objIF4);
                }
                Function1 function12 = (Function1) objIF4;
                composer2.Xw();
                composer2.eF(-503493835);
                boolean zP53 = composer2.p5(nVar) | composer2.E2(s2);
                Object objIF5 = composer2.iF();
                if (zP53 || objIF5 == Composer.INSTANCE.n()) {
                    objIF5 = new Function1() { // from class: M.mrQ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return S.j.ty(nVar, s2, (ProjectInfo.n) obj3);
                        }
                    };
                    composer2.o(objIF5);
                }
                Function1 function13 = (Function1) objIF5;
                composer2.Xw();
                composer2.eF(-503485327);
                boolean zP54 = composer2.p5(nVar) | composer2.E2(s2);
                Object objIF6 = composer2.iF();
                if (zP54 || objIF6 == Composer.INSTANCE.n()) {
                    objIF6 = new Function0() { // from class: M.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return S.j.HI(nVar, s2);
                        }
                    };
                    composer2.o(objIF6);
                }
                Function0 function0 = (Function0) objIF6;
                composer2.Xw();
                composer2.eF(-503470760);
                boolean zE2 = composer2.E2(s2);
                Object objIF7 = composer2.iF();
                if (zE2 || objIF7 == Composer.INSTANCE.n()) {
                    objIF7 = new Function1() { // from class: M.Pp
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return S.j.ck(s2, (tN.n) obj3);
                        }
                    };
                    composer2.o(objIF7);
                }
                Function1 function14 = (Function1) objIF7;
                composer2.Xw();
                composer2.eF(-503452474);
                boolean zE22 = composer2.E2(s2);
                Object objIF8 = composer2.iF();
                if (zE22 || objIF8 == Composer.INSTANCE.n()) {
                    objIF8 = new Function0() { // from class: M.N
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return S.j.Ik(s2);
                        }
                    };
                    composer2.o(objIF8);
                }
                composer2.Xw();
                final I28.n nVar2 = nVar;
                zT.Ln.J2(jVar2, nVar2, arrayList2, z2, mutableState, false, listNHg, function1, function12, function13, function0, thumbnailCache, sceneThumbnailMakerS, fuxT, function14, (Function0) objIF8, composer2, 24576, 0, 32);
                composer2.XQ();
                Integer numT = nVar2.t();
                ProjectInfo.n nVar3 = numT != null ? (ProjectInfo.n) arrayList.get(numT.intValue()) : null;
                AnimatedVisibilityKt.mUb(nVar3 != null, null, EnterExitTransitionKt.HI(AnimationSpecKt.ty(200, 0, null, 6, null), 0.0f, 2, null), ExitTransition.INSTANCE.n(), null, ComposableLambdaKt.nr(-1723998626, true, new C0224j(nVar3, nVar2, s2, state), composer2, 54), composer, 196992, 18);
                composer2 = composer;
                composer2.XQ();
                jVar = this;
                S s3 = S.this;
                composer2.eF(1412205486);
                boolean zP55 = composer2.p5(nVar2);
                Object objIF9 = composer2.iF();
                if (zP55 || objIF9 == Composer.INSTANCE.n()) {
                    objIF9 = new Function0() { // from class: M.IG
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(S.j.XQ(nVar2));
                        }
                    };
                    composer2.o(objIF9);
                }
                Function0 function02 = (Function0) objIF9;
                composer2.Xw();
                composer2.eF(1412207574);
                boolean zP56 = composer2.p5(nVar2);
                Object objIF10 = composer2.iF();
                if (zP56 || objIF10 == Composer.INSTANCE.n()) {
                    objIF10 = new Function1() { // from class: M.FPL
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return S.j.S(nVar2, (OnBackPressedCallback) obj3);
                        }
                    };
                    composer2.o(objIF10);
                }
                composer2.Xw();
                N.I28.xMQ(s3, function02, null, (Function1) objIF10, composer2, 0, 2);
            }
            composer2.Xw();
            OA oaWTp = S.this.wTp();
            S s4 = S.this;
            composer2.eF(1412217395);
            boolean zE23 = composer2.E2(S.this);
            final S s5 = S.this;
            Object objIF11 = composer2.iF();
            if (zE23 || objIF11 == Composer.INSTANCE.n()) {
                objIF11 = new Function1() { // from class: M.Y5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return S.j.WPU(s5, (oXP) obj3);
                    }
                };
                composer2.o(objIF11);
            }
            composer2.Xw();
            uW.I28.nr(oaWTp, s4, (Function1) objIF11);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit HI(I28.n nVar, S s2) {
            nVar.O();
            s2.wTp().g();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Ik(S s2) {
            Vi.Wre wre;
            ComponentCallbacks2 componentCallbacks2E2 = s2.E2();
            if (componentCallbacks2E2 instanceof Vi.Wre) {
                wre = (Vi.Wre) componentCallbacks2E2;
            } else {
                wre = null;
            }
            if (wre != null) {
                wre.e();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean XQ(I28.n nVar) {
            if (nVar.t() != null) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float Z(State state) {
            return ((Dp) state.getValue()).getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Dp o(Density density, MutableState mutableState) {
            return Dp.nr(density.bzg(Float.intBitsToFloat((int) (((Offset) mutableState.getValue()).getPackedValue() & 4294967295L))));
        }
    }

    public static final class n extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f6339n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Fragment fragment) {
            super(0);
            this.f6339n = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f6339n;
        }
    }

    public static final class w6 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f6340n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Function0 function0) {
            super(0);
            this.f6340n = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f6340n.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bzg(S s2, ActivityResult result) {
        Intent data;
        Uri data2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() != -1 || (data = result.getData()) == null || (data2 = data.getData()) == null) {
            return;
        }
        s2.wTp().Z(data2, s2.requireContext().getContentResolver().getType(data2));
    }

    private final op e() {
        op opVar = this._binding;
        Intrinsics.checkNotNull(opVar);
        return opVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String title, String message) {
        new AlertDialog.Builder(E2()).setTitle(title).KN(message).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: M.h6y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                S.rV9(dialogInterface, i2);
            }
        }).create().show();
    }

    public final eQ.fuX T() {
        eQ.fuX fux = this.imageLoader;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final QmE.iF X() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = op.t(inflater, container, false);
        ConstraintLayout root = e().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        e().rl.setContent(ComposableLambdaKt.rl(163565192, true, new j()));
    }

    /* JADX INFO: renamed from: s7N, reason: from getter */
    public final BitmapLruCache getThumbnailCache() {
        return this.thumbnailCache;
    }

    public final OA wTp() {
        return (OA) this.viewModel.getValue();
    }

    public S() {
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new w6(new n(this)));
        this.viewModel = FragmentViewModelLazyKt.t(this, Reflection.getOrCreateKotlinClass(OA.class), new Ml(lazy), new I28(null, lazy), new Wre(this, lazy));
        this.thumbnailCache = new BitmapLruCache(0, "templateThumbnailCache", 1, null);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: M.U4
            @Override // androidx.view.result.ActivityResultCallback
            public final void n(Object obj) {
                S.bzg(this.f6379n, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.xmlImporter = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rV9(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    public final Activity E2() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return fragmentActivityRequireActivity;
    }

    public final List N() {
        Vi.CN3 cn3;
        List listG;
        ComponentCallbacks2 componentCallbacks2E2 = E2();
        if (componentCallbacks2E2 instanceof Vi.CN3) {
            cn3 = (Vi.CN3) componentCallbacks2E2;
        } else {
            cn3 = null;
        }
        if (cn3 != null && (listG = cn3.g()) != null) {
            return listG;
        }
        return CollectionsKt.emptyList();
    }

    @Override // KC.g9s
    public void Uo() {
        KC.rrk rrkVar;
        ComponentCallbacks2 componentCallbacks2E2 = E2();
        if (componentCallbacks2E2 instanceof KC.rrk) {
            rrkVar = (KC.rrk) componentCallbacks2E2;
        } else {
            rrkVar = null;
        }
        if (rrkVar != null) {
            rrkVar.XQ(0);
        }
    }

    public final List nHg() {
        Vi.CN3 cn3;
        List listIk;
        ComponentCallbacks2 componentCallbacks2E2 = E2();
        if (componentCallbacks2E2 instanceof Vi.CN3) {
            cn3 = (Vi.CN3) componentCallbacks2E2;
        } else {
            cn3 = null;
        }
        if (cn3 != null && (listIk = cn3.Ik()) != null) {
            return listIk;
        }
        return CollectionsKt.emptyList();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
