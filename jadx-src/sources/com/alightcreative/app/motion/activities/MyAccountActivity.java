package com.alightcreative.app.motion.activities;

import QmE.j;
import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleKt;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.ComponentActivity;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.LifecycleOwnerKt;
import androidx.view.ViewModel;
import androidx.view.ViewModelLazy;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.ViewModelStoreOwner;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.view.viewmodel.compose.ViewModelKt;
import cd.DAz;
import com.alightcreative.app.motion.activities.MyAccountActivity;
import com.alightcreative.app.motion.activities.creatorprogram.qas.ui.QAsActivity;
import com.alightcreative.app.motion.activities.creatorprogram.rewardlist.CreatorRewardListActivity;
import com.alightcreative.app.motion.activities.main.MainActivity;
import com.alightcreative.app.motion.ranking.ui.editprofile.EditProfileActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.safedk.android.utils.Logger;
import java.util.Arrays;
import java.util.Iterator;
import k9D.Wre;
import k9D.j;
import kP.InterfaceC2210n;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001h\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0001qB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0017\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010]\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010Z\u001a\u0004\b`\u0010aR\u001c\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010d0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006r"}, d2 = {"Lcom/alightcreative/app/motion/activities/MyAccountActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LPJ9/I28;", "<init>", "()V", "", "X4T", "EF", "Zmq", "xVH", "uG", "JVN", "Lcom/google/firebase/auth/FirebaseAuth;", "auth", "K", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onStop", "onResume", "onDestroy", "LSJ0/SPz;", "r", "LSJ0/SPz;", "binding", "LkgE/fuX;", "o", "LkgE/fuX;", "RQ", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LQmE/iF;", "Z", "LQmE/iF;", "kSg", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LxAo/I28;", "S", "LxAo/I28;", "lLA", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LnYs/Ml;", "g", "LnYs/Ml;", "W", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "LrO/j;", "E2", "LrO/j;", "getAcceptCreatorProgramUseCase", "()LrO/j;", "setAcceptCreatorProgramUseCase", "(LrO/j;)V", "acceptCreatorProgramUseCase", "LkP/n;", "e", "LkP/n;", "a63", "()LkP/n;", "setInjet", "(LkP/n;)V", "injet", "LPJ9/Ml;", "X", "LPJ9/Ml;", "ViF", "()LPJ9/Ml;", "UF", "(LPJ9/Ml;)V", "signInLauncher", "Lcom/google/firebase/firestore/s4;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/firebase/firestore/s4;", "listenerRegistration", "Lk9D/n;", "N", "Lkotlin/Lazy;", "ER", "()Lk9D/n;", "bottomSheetViewModel", "Lcd/u;", "v", "F", "()Lcd/u;", "timedDiscountCardViewModel", "Landroidx/compose/runtime/MutableState;", "LAx/qz;", "Xw", "Landroidx/compose/runtime/MutableState;", "creatorRankingCardMenuState", "com/alightcreative/app/motion/activities/MyAccountActivity$w6", "jB", "Lcom/alightcreative/app/motion/activities/MyAccountActivity$w6;", "networkCallback", "LkgE/l4Z;", "U", "LkgE/l4Z;", "purchaseStateObserver", "P5", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMyAccountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyAccountActivity.kt\ncom/alightcreative/app/motion/activities/MyAccountActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 ContextUtil.kt\ncom/alightcreative/ext/ContextUtilKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,857:1\n70#2,11:858\n70#2,11:869\n1863#3,2:880\n1863#3,2:882\n1863#3,2:884\n1863#3,2:886\n1863#3,2:888\n1863#3,2:890\n327#4,4:892\n98#5:896\n93#5,7:897\n98#5:904\n93#5,7:905\n1#6:912\n*S KotlinDebug\n*F\n+ 1 MyAccountActivity.kt\ncom/alightcreative/app/motion/activities/MyAccountActivity\n*L\n157#1:858,11\n159#1:869,11\n232#1:880,2\n240#1:882,2\n596#1:884,2\n597#1:886,2\n607#1:888,2\n608#1:890,2\n172#1:892,4\n244#1:896\n244#1:897,7\n250#1:904\n250#1:905,7\n*E\n"})
public final class MyAccountActivity extends fVn implements PJ9.I28 {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public rO.j acceptCreatorProgramUseCase;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private com.google.firebase.firestore.s4 listenerRegistration;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    public PJ9.Ml signInLauncher;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public InterfaceC2210n injet;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private SJ0.SPz binding;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int M7 = 8;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final Lazy bottomSheetViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(k9D.n.class), new o(this), new C(this), new qz(null, this));

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy timedDiscountCardViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(cd.u.class), new Xo(this), new Pl(this), new eO(null, this));

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final MutableState creatorRankingCardMenuState = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final w6 networkCallback = new w6();

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final kgE.l4Z purchaseStateObserver = new kgE.l4Z() { // from class: com.alightcreative.app.motion.activities.L
        @Override // kgE.l4Z
        public final void n(com.alightcreative.account.o oVar) {
            MyAccountActivity.Qu(this.f44606n, oVar);
        }
    };

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class C extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44675n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(ComponentActivity componentActivity) {
            super(0);
            this.f44675n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return this.f44675n.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class CN3 implements Function2 {
        CN3() {
        }

        public final void J2(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(76316515, i2, -1, "com.alightcreative.app.motion.activities.MyAccountActivity.setupCreatorProgramCardView.<anonymous> (MyAccountActivity.kt:389)");
            }
            composer.eF(-2135558586);
            composer.te(1890788296);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryN = HiltViewModelKt.n(viewModelStoreOwnerT, composer, 0);
            composer.te(1729797275);
            ViewModel viewModelRl = ViewModelKt.rl(nN.Ml.class, viewModelStoreOwnerT, null, factoryN, viewModelStoreOwnerT instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerT).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t, composer, 36936, 0);
            composer.M7();
            composer.M7();
            uW.w6 w6Var = (uW.w6) viewModelRl;
            composer.eF(-589589419);
            Lifecycle lifecycle = ((LifecycleOwner) composer.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycleRegistry();
            composer.eF(23938127);
            boolean zE2 = composer.E2(w6Var) | composer.E2(lifecycle);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new uW.Wre(w6Var, lifecycle, null);
                composer.o(objIF);
            }
            composer.Xw();
            EffectsKt.nr(w6Var, lifecycle, (Function2) objIF, composer, 0);
            composer.Xw();
            composer.Xw();
            State stateN = LiveDataAdapterKt.n(((nN.Ml) w6Var).t(), composer, 0);
            composer.eF(-815651422);
            boolean zE22 = composer.E2(MyAccountActivity.this);
            final MyAccountActivity myAccountActivity = MyAccountActivity.this;
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: com.alightcreative.app.motion.activities.bfp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MyAccountActivity.CN3.Uo(myAccountActivity);
                    }
                };
                composer.o(objIF2);
            }
            Function0 function0 = (Function0) objIF2;
            composer.Xw();
            composer.eF(-815643747);
            boolean zE23 = composer.E2(MyAccountActivity.this);
            final MyAccountActivity myAccountActivity2 = MyAccountActivity.this;
            Object objIF3 = composer.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function0() { // from class: com.alightcreative.app.motion.activities.AY
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MyAccountActivity.CN3.KN(myAccountActivity2);
                    }
                };
                composer.o(objIF3);
            }
            Function0 function02 = (Function0) objIF3;
            composer.Xw();
            composer.eF(-815636960);
            boolean zE24 = composer.E2(MyAccountActivity.this);
            final MyAccountActivity myAccountActivity3 = MyAccountActivity.this;
            Object objIF4 = composer.iF();
            if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Function0() { // from class: com.alightcreative.app.motion.activities.tMG
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MyAccountActivity.CN3.xMQ(myAccountActivity3);
                    }
                };
                composer.o(objIF4);
            }
            Function0 function03 = (Function0) objIF4;
            composer.Xw();
            composer.eF(-815628016);
            boolean zE25 = composer.E2(MyAccountActivity.this);
            final MyAccountActivity myAccountActivity4 = MyAccountActivity.this;
            Object objIF5 = composer.iF();
            if (zE25 || objIF5 == Composer.INSTANCE.n()) {
                objIF5 = new Function0() { // from class: com.alightcreative.app.motion.activities.Yvs
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MyAccountActivity.CN3.mUb(myAccountActivity4);
                    }
                };
                composer.o(objIF5);
            }
            Function0 function04 = (Function0) objIF5;
            composer.Xw();
            composer.eF(-815615792);
            boolean zE26 = composer.E2(MyAccountActivity.this);
            final MyAccountActivity myAccountActivity5 = MyAccountActivity.this;
            Object objIF6 = composer.iF();
            if (zE26 || objIF6 == Composer.INSTANCE.n()) {
                objIF6 = new Function0() { // from class: com.alightcreative.app.motion.activities.EH
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MyAccountActivity.CN3.gh(myAccountActivity5);
                    }
                };
                composer.o(objIF6);
            }
            composer.Xw();
            nN.w6.rl(stateN, function0, function02, function03, function04, (Function0) objIF6, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            J2((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KN(MyAccountActivity myAccountActivity) {
            myAccountActivity.kSg().n(j.Z.f8472n);
            myAccountActivity.ER().g();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(MyAccountActivity myAccountActivity) {
            myAccountActivity.kSg().n(new j.eh(rWZ.Xo.f73070Z));
            PJ9.DAz.E2(myAccountActivity, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit gh(MyAccountActivity myAccountActivity) {
            QmE.iF iFVarKSg = myAccountActivity.kSg();
            F2p.Ml ml = F2p.Ml.f2486n;
            iFVarKSg.n(new j.nKK(ml));
            QAsActivity.INSTANCE.n(myAccountActivity, ml);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit mUb(MyAccountActivity myAccountActivity) {
            QmE.iF iFVarKSg = myAccountActivity.kSg();
            F2p.Ml ml = F2p.Ml.f2485O;
            iFVarKSg.n(new j.nKK(ml));
            QAsActivity.INSTANCE.n(myAccountActivity, ml);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(MyAccountActivity myAccountActivity) {
            myAccountActivity.kSg().n(j.g9s.f8509n);
            CreatorRewardListActivity.INSTANCE.n(myAccountActivity);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class Dsr implements Function2 {
        Dsr() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit az(MyAccountActivity myAccountActivity, Ax.qz menuState) {
            Intrinsics.checkNotNullParameter(menuState, "menuState");
            myAccountActivity.creatorRankingCardMenuState.setValue(menuState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit qie(MyAccountActivity myAccountActivity, FX.Ml it) {
            Intrinsics.checkNotNullParameter(it, "it");
            myAccountActivity.kSg().n(new j.QhI(it));
            YgZ.Ml.rl(YgZ.Ml.f12213n, myAccountActivity, it.n(), null, 4, null);
            return Unit.INSTANCE;
        }

        public final void Uo(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(841022193, i2, -1, "com.alightcreative.app.motion.activities.MyAccountActivity.setupCreatorRankingCardView.<anonymous> (MyAccountActivity.kt:432)");
            }
            composer.eF(-2135558586);
            composer.te(1890788296);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryN = HiltViewModelKt.n(viewModelStoreOwnerT, composer, 0);
            composer.te(1729797275);
            ViewModel viewModelRl = ViewModelKt.rl(Ax.Pl.class, viewModelStoreOwnerT, null, factoryN, viewModelStoreOwnerT instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerT).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t, composer, 36936, 0);
            composer.M7();
            composer.M7();
            uW.w6 w6Var = (uW.w6) viewModelRl;
            composer.eF(-589589419);
            Lifecycle lifecycle = ((LifecycleOwner) composer.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycleRegistry();
            composer.eF(23938127);
            boolean zE2 = composer.E2(w6Var) | composer.E2(lifecycle);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new uW.Wre(w6Var, lifecycle, null);
                composer.o(objIF);
            }
            composer.Xw();
            EffectsKt.nr(w6Var, lifecycle, (Function2) objIF, composer, 0);
            composer.Xw();
            composer.Xw();
            Ax.QJ qj = (Ax.QJ) LiveDataAdapterKt.n(((Ax.Pl) w6Var).t(), composer, 0).getValue();
            composer.eF(1533903348);
            boolean zE22 = composer.E2(MyAccountActivity.this);
            final MyAccountActivity myAccountActivity = MyAccountActivity.this;
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: com.alightcreative.app.motion.activities.Zd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MyAccountActivity.Dsr.KN(myAccountActivity);
                    }
                };
                composer.o(objIF2);
            }
            Function0 function0 = (Function0) objIF2;
            composer.Xw();
            composer.eF(1533911179);
            boolean zE23 = composer.E2(MyAccountActivity.this);
            final MyAccountActivity myAccountActivity2 = MyAccountActivity.this;
            Object objIF3 = composer.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function1() { // from class: com.alightcreative.app.motion.activities.IQ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MyAccountActivity.Dsr.mUb(myAccountActivity2, ((Boolean) obj).booleanValue());
                    }
                };
                composer.o(objIF3);
            }
            Function1 function1 = (Function1) objIF3;
            composer.Xw();
            composer.eF(1533923591);
            boolean zE24 = composer.E2(MyAccountActivity.this);
            final MyAccountActivity myAccountActivity3 = MyAccountActivity.this;
            Object objIF4 = composer.iF();
            if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Function0() { // from class: com.alightcreative.app.motion.activities.EjB
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MyAccountActivity.Dsr.gh(myAccountActivity3);
                    }
                };
                composer.o(objIF4);
            }
            Function0 function02 = (Function0) objIF4;
            composer.Xw();
            composer.eF(1533929870);
            boolean zE25 = composer.E2(MyAccountActivity.this);
            final MyAccountActivity myAccountActivity4 = MyAccountActivity.this;
            Object objIF5 = composer.iF();
            if (zE25 || objIF5 == Composer.INSTANCE.n()) {
                objIF5 = new Function1() { // from class: com.alightcreative.app.motion.activities.MA
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MyAccountActivity.Dsr.qie(myAccountActivity4, (FX.Ml) obj);
                    }
                };
                composer.o(objIF5);
            }
            Function1 function12 = (Function1) objIF5;
            composer.Xw();
            composer.eF(1533936076);
            boolean zE26 = composer.E2(MyAccountActivity.this);
            final MyAccountActivity myAccountActivity5 = MyAccountActivity.this;
            Object objIF6 = composer.iF();
            if (zE26 || objIF6 == Composer.INSTANCE.n()) {
                objIF6 = new Function1() { // from class: com.alightcreative.app.motion.activities.d4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MyAccountActivity.Dsr.az(myAccountActivity5, (Ax.qz) obj);
                    }
                };
                composer.o(objIF6);
            }
            Function1 function13 = (Function1) objIF6;
            composer.Xw();
            composer.eF(1533940562);
            boolean zE27 = composer.E2(MyAccountActivity.this);
            final MyAccountActivity myAccountActivity6 = MyAccountActivity.this;
            Object objIF7 = composer.iF();
            if (zE27 || objIF7 == Composer.INSTANCE.n()) {
                objIF7 = new Function0() { // from class: com.alightcreative.app.motion.activities.Gk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MyAccountActivity.Dsr.xMQ(myAccountActivity6);
                    }
                };
                composer.o(objIF7);
            }
            composer.Xw();
            Ax.w6.t(qj, function0, function1, function02, function12, function13, (Function0) objIF7, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            Uo((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KN(MyAccountActivity myAccountActivity) {
            myAccountActivity.kSg().n(new j.eh(rWZ.Xo.f73070Z));
            PJ9.DAz.E2(myAccountActivity, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit gh(MyAccountActivity myAccountActivity) {
            myAccountActivity.kSg().n(j.g62.f8507n);
            MainActivity.INSTANCE.n(myAccountActivity, M.CN3.f6254Z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit mUb(MyAccountActivity myAccountActivity, boolean z2) {
            myAccountActivity.kSg().n(new j.CM(rWZ.aC.f73080t));
            if (z2) {
                myAccountActivity.uG();
            } else {
                myAccountActivity.ER().te();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(MyAccountActivity myAccountActivity) {
            myAccountActivity.kSg().n(j.kO4.f8522n);
            QAsActivity.INSTANCE.n(myAccountActivity, F2p.Ml.f2488t);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class Ml implements Function2 {
        Ml() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-268723296, i2, -1, "com.alightcreative.app.motion.activities.MyAccountActivity.onCreate.<anonymous> (MyAccountActivity.kt:254)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierXMQ = PaddingKt.xMQ(BackgroundKt.nr(companion, Color.INSTANCE.KN(), null, 2, null), Dp.KN(16));
            final MyAccountActivity myAccountActivity = MyAccountActivity.this;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierXMQ);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N);
            } else {
                composer.r();
            }
            Composer composerN = Updater.n(composer);
            Updater.O(composerN, measurePolicyUo, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            String strT = StringResources_androidKt.t(2132020171, composer, 6);
            Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
            Dj7.CN3 cn3 = Dj7.CN3.f1600t;
            composer.eF(652989320);
            boolean zE2 = composer.E2(myAccountActivity);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: com.alightcreative.app.motion.activities.DaM
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MyAccountActivity.Ml.t(myAccountActivity);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            Dj7.eO.J2((Function0) objIF, strT, modifierKN, null, cn3, null, 0, 0, 0.0f, null, null, null, false, composer, 24960, 0, 8168);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(MyAccountActivity myAccountActivity) {
            myAccountActivity.kSg().n(new j.eh(rWZ.Xo.f73070Z));
            PJ9.DAz.E2(myAccountActivity, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class Pl extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44681n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pl(ComponentActivity componentActivity) {
            super(0);
            this.f44681n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return this.f44681n.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class Wre implements Function2 {

        /* synthetic */ class I28 extends FunctionReferenceImpl implements Function0 {
            I28(Object obj) {
                super(0, obj, k9D.n.class, "onBackPressed", "onBackPressed()V", 0);
            }

            public final void n() {
                ((k9D.n) this.receiver).r();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        static final class Ml implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MyAccountActivity f44686n;

            /* synthetic */ class j extends AdaptedFunctionReference implements Function0 {
                j(Object obj) {
                    super(0, obj, k9D.n.class, "onCreatorRankingAcceptButtonClick", "onCreatorRankingAcceptButtonClick()Lkotlinx/coroutines/Job;", 8);
                }

                public final void n() {
                    ((k9D.n) this.receiver).S();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    n();
                    return Unit.INSTANCE;
                }
            }

            /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
                n(Object obj) {
                    super(0, obj, k9D.n.class, "onCreatorRankingTermsOfServiceClick", "onCreatorRankingTermsOfServiceClick()V", 0);
                }

                public final void n() {
                    ((k9D.n) this.receiver).nY();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    n();
                    return Unit.INSTANCE;
                }
            }

            /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
                w6(Object obj) {
                    super(0, obj, k9D.n.class, "onCreatorRankingPrivacyPolicyClick", "onCreatorRankingPrivacyPolicyClick()V", 0);
                }

                public final void n() {
                    ((k9D.n) this.receiver).ViF();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    n();
                    return Unit.INSTANCE;
                }
            }

            Ml(MyAccountActivity myAccountActivity) {
                this.f44686n = myAccountActivity;
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
                    ComposerKt.p5(432383360, i2, -1, "com.alightcreative.app.motion.activities.MyAccountActivity.setupBottomSheet.<anonymous>.<anonymous> (MyAccountActivity.kt:327)");
                }
                k9D.n nVarER = this.f44686n.ER();
                composer.eF(1215670301);
                boolean zE2 = composer.E2(nVarER);
                Object objIF = composer.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new j(nVarER);
                    composer.o(objIF);
                }
                Function0 function0 = (Function0) objIF;
                composer.Xw();
                k9D.n nVarER2 = this.f44686n.ER();
                composer.eF(1215673919);
                boolean zE22 = composer.E2(nVarER2);
                Object objIF2 = composer.iF();
                if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new n(nVarER2);
                    composer.o(objIF2);
                }
                composer.Xw();
                Function0 function02 = (Function0) ((KFunction) objIF2);
                k9D.n nVarER3 = this.f44686n.ER();
                composer.eF(1215677566);
                boolean zE23 = composer.E2(nVarER3);
                Object objIF3 = composer.iF();
                if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new w6(nVarER3);
                    composer.o(objIF3);
                }
                composer.Xw();
                ka.UGc.rl(function0, function02, (Function0) ((KFunction) objIF3), composer, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.MyAccountActivity$Wre$Wre, reason: collision with other inner class name */
        static final class C0621Wre implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ k9D.Wre f44687n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ MyAccountActivity f44688t;

            /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.MyAccountActivity$Wre$Wre$j */
            /* synthetic */ class j extends AdaptedFunctionReference implements Function0 {
                j(Object obj) {
                    super(0, obj, k9D.n.class, "onCreatorRankingOptOutConfirmButtonClick", "onCreatorRankingOptOutConfirmButtonClick()Lkotlinx/coroutines/Job;", 8);
                }

                public final void n() {
                    ((k9D.n) this.receiver).WPU();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    n();
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.MyAccountActivity$Wre$Wre$n */
            /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
                n(Object obj) {
                    super(0, obj, k9D.n.class, "onCreatorRankingOptOutDismissButtonClick", "onCreatorRankingOptOutDismissButtonClick()V", 0);
                }

                public final void n() {
                    ((k9D.n) this.receiver).aYN();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    n();
                    return Unit.INSTANCE;
                }
            }

            C0621Wre(k9D.Wre wre, MyAccountActivity myAccountActivity) {
                this.f44687n = wre;
                this.f44688t = myAccountActivity;
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
                    ComposerKt.p5(-251846945, i2, -1, "com.alightcreative.app.motion.activities.MyAccountActivity.setupBottomSheet.<anonymous>.<anonymous> (MyAccountActivity.kt:339)");
                }
                boolean zN = ((Wre.w6) this.f44687n).n();
                k9D.n nVarER = this.f44688t.ER();
                composer.eF(1215695172);
                boolean zE2 = composer.E2(nVarER);
                Object objIF = composer.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new j(nVarER);
                    composer.o(objIF);
                }
                Function0 function0 = (Function0) objIF;
                composer.Xw();
                k9D.n nVarER2 = this.f44688t.ER();
                composer.eF(1215698756);
                boolean zE22 = composer.E2(nVarER2);
                Object objIF2 = composer.iF();
                if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new n(nVarER2);
                    composer.o(objIF2);
                }
                composer.Xw();
                ka.r.rl(zN, function0, (Function0) ((KFunction) objIF2), composer, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, k9D.n.class, "onBackPressed", "onBackPressed()V", 0);
            }

            public final void n() {
                ((k9D.n) this.receiver).r();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        static final class n implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MyAccountActivity f44691n;

            /* synthetic */ class j extends AdaptedFunctionReference implements Function0 {
                j(Object obj) {
                    super(0, obj, k9D.n.class, "onCreatorProgramAcceptButtonClick", "onCreatorProgramAcceptButtonClick()Lkotlinx/coroutines/Job;", 8);
                }

                public final void n() {
                    ((k9D.n) this.receiver).o();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    n();
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.MyAccountActivity$Wre$n$n, reason: collision with other inner class name */
            /* synthetic */ class C0622n extends FunctionReferenceImpl implements Function0 {
                C0622n(Object obj) {
                    super(0, obj, k9D.n.class, "onCreatorProgramTermsOfServiceClick", "onCreatorProgramTermsOfServiceClick()V", 0);
                }

                public final void n() {
                    ((k9D.n) this.receiver).XQ();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    n();
                    return Unit.INSTANCE;
                }
            }

            /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
                w6(Object obj) {
                    super(0, obj, k9D.n.class, "onCreatorProgramPrivacyPolicyClick", "onCreatorProgramPrivacyPolicyClick()V", 0);
                }

                public final void n() {
                    ((k9D.n) this.receiver).Z();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    n();
                    return Unit.INSTANCE;
                }
            }

            n(MyAccountActivity myAccountActivity) {
                this.f44691n = myAccountActivity;
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
                    ComposerKt.p5(251321303, i2, -1, "com.alightcreative.app.motion.activities.MyAccountActivity.setupBottomSheet.<anonymous>.<anonymous> (MyAccountActivity.kt:315)");
                }
                k9D.n nVarER = this.f44691n.ER();
                composer.eF(1215647421);
                boolean zE2 = composer.E2(nVarER);
                Object objIF = composer.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new j(nVarER);
                    composer.o(objIF);
                }
                Function0 function0 = (Function0) objIF;
                composer.Xw();
                k9D.n nVarER2 = this.f44691n.ER();
                composer.eF(1215651039);
                boolean zE22 = composer.E2(nVarER2);
                Object objIF2 = composer.iF();
                if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new C0622n(nVarER2);
                    composer.o(objIF2);
                }
                composer.Xw();
                Function0 function02 = (Function0) ((KFunction) objIF2);
                k9D.n nVarER3 = this.f44691n.ER();
                composer.eF(1215654686);
                boolean zE23 = composer.E2(nVarER3);
                Object objIF3 = composer.iF();
                if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new w6(nVarER3);
                    composer.o(objIF3);
                }
                composer.Xw();
                nN.aC.rl(function0, function02, (Function0) ((KFunction) objIF3), composer, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
            w6(Object obj) {
                super(0, obj, k9D.n.class, "onBackPressed", "onBackPressed()V", 0);
            }

            public final void n() {
                ((k9D.n) this.receiver).r();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        Wre() {
        }

        static final class CN3 extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ MyAccountActivity f44683O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f44684n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ModalBottomSheetState f44685t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            CN3(ModalBottomSheetState modalBottomSheetState, MyAccountActivity myAccountActivity, Continuation continuation) {
                super(2, continuation);
                this.f44685t = modalBottomSheetState;
                this.f44683O = myAccountActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new CN3(this.f44685t, this.f44683O, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f44684n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ModalBottomSheetState modalBottomSheetState = this.f44685t;
                    this.f44684n = 1;
                    if (modalBottomSheetState.xMQ(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f44683O.ER().Ik();
                return Unit.INSTANCE;
            }
        }

        static final class fuX extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f44689n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ MyAccountActivity f44690t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            fuX(MyAccountActivity myAccountActivity, Continuation continuation) {
                super(2, continuation);
                this.f44690t = myAccountActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new fuX(this.f44690t, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((fuX) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f44689n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.f44689n = 1;
                    if (GJW.yg.rl(500L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f44690t.ER().Ik();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(GJW.vd vdVar, Context context, MyAccountActivity myAccountActivity, ModalBottomSheetState modalBottomSheetState, k9D.j action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.areEqual(action, j.C1005j.f69665n)) {
                GJW.C.nr(vdVar, null, null, new CN3(modalBottomSheetState, myAccountActivity, null), 3, null);
            } else if (action instanceof j.w6) {
                YgZ.Ml.rl(YgZ.Ml.f12213n, context, ((j.w6) action).n(), null, 4, null);
            } else {
                if (!Intrinsics.areEqual(action, j.n.f69666n)) {
                    throw new NoWhenBranchMatchedException();
                }
                EditProfileActivity.INSTANCE.n(myAccountActivity);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean nr(GJW.vd vdVar, MyAccountActivity myAccountActivity, ModalBottomSheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it != ModalBottomSheetValue.f22291n) {
                return true;
            }
            GJW.C.nr(vdVar, null, null, new fuX(myAccountActivity, null), 3, null);
            return true;
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
                ComposerKt.p5(1455651394, i2, -1, "com.alightcreative.app.motion.activities.MyAccountActivity.setupBottomSheet.<anonymous> (MyAccountActivity.kt:290)");
            }
            final Context context = (Context) composer.ty(AndroidCompositionLocals_androidKt.Uo());
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer);
                composer.o(objIF);
            }
            final GJW.vd vdVar = (GJW.vd) objIF;
            Density density = (Density) composer.ty(CompositionLocalsKt.J2());
            composer.eF(-1073447922);
            final MyAccountActivity myAccountActivity = MyAccountActivity.this;
            Object objIF2 = composer.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new ModalBottomSheetState(ModalBottomSheetValue.f22291n, density, new Function1() { // from class: com.alightcreative.app.motion.activities.vF
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(MyAccountActivity.Wre.nr(vdVar, myAccountActivity, (ModalBottomSheetValue) obj));
                    }
                }, null, true, 8, null);
                composer.o(objIF2);
            }
            final ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) objIF2;
            composer.Xw();
            k9D.Wre wre = (k9D.Wre) LiveDataAdapterKt.n(MyAccountActivity.this.ER().t(), composer, 0).getValue();
            if (Intrinsics.areEqual(wre, Wre.j.f69662n)) {
                composer.eF(1083619542);
                Object objER = MyAccountActivity.this.ER();
                composer.eF(-1073419702);
                boolean zE2 = composer.E2(objER);
                Object objIF3 = composer.iF();
                if (zE2 || objIF3 == companion.n()) {
                    objIF3 = new j(objER);
                    composer.o(objIF3);
                }
                composer.Xw();
                Dj7.rv6.t(modalBottomSheetState, (Function0) ((KFunction) objIF3), ComposableLambdaKt.nr(251321303, true, new n(MyAccountActivity.this), composer, 54), composer, ModalBottomSheetState.f22280O | RendererCapabilities.DECODER_SUPPORT_MASK);
                composer.Xw();
            } else if (Intrinsics.areEqual(wre, Wre.n.f69663n)) {
                composer.eF(1084328822);
                Object objER2 = MyAccountActivity.this.ER();
                composer.eF(-1073396822);
                boolean zE22 = composer.E2(objER2);
                Object objIF4 = composer.iF();
                if (zE22 || objIF4 == companion.n()) {
                    objIF4 = new w6(objER2);
                    composer.o(objIF4);
                }
                composer.Xw();
                Dj7.rv6.t(modalBottomSheetState, (Function0) ((KFunction) objIF4), ComposableLambdaKt.nr(432383360, true, new Ml(MyAccountActivity.this), composer, 54), composer, ModalBottomSheetState.f22280O | RendererCapabilities.DECODER_SUPPORT_MASK);
                composer.Xw();
            } else if (wre instanceof Wre.w6) {
                composer.eF(1085040489);
                Object objER3 = MyAccountActivity.this.ER();
                composer.eF(-1073373814);
                boolean zE23 = composer.E2(objER3);
                Object objIF5 = composer.iF();
                if (zE23 || objIF5 == companion.n()) {
                    objIF5 = new I28(objER3);
                    composer.o(objIF5);
                }
                composer.Xw();
                Dj7.rv6.t(modalBottomSheetState, (Function0) ((KFunction) objIF5), ComposableLambdaKt.nr(-251846945, true, new C0621Wre(wre, MyAccountActivity.this), composer, 54), composer, ModalBottomSheetState.f22280O | RendererCapabilities.DECODER_SUPPORT_MASK);
                composer.Xw();
            } else if (Intrinsics.areEqual(wre, Wre.Ml.f69661n)) {
                composer.eF(-1073357109);
                composer.Xw();
            } else {
                if (wre != null) {
                    composer.eF(-1073426133);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composer.eF(-1073355669);
                composer.Xw();
            }
            k9D.n nVarER = MyAccountActivity.this.ER();
            composer.eF(-1073352358);
            boolean zE24 = composer.E2(vdVar) | composer.E2(modalBottomSheetState) | composer.E2(MyAccountActivity.this) | composer.E2(context);
            final MyAccountActivity myAccountActivity2 = MyAccountActivity.this;
            Object objIF6 = composer.iF();
            if (zE24 || objIF6 == companion.n()) {
                objIF6 = new Function1() { // from class: com.alightcreative.app.motion.activities.aTw
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MyAccountActivity.Wre.O(vdVar, context, myAccountActivity2, modalBottomSheetState, (k9D.j) obj);
                    }
                };
                composer.o(objIF6);
            }
            composer.Xw();
            uW.I28.rl(nVarER, (Function1) objIF6, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class Xo extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44692n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Xo(ComponentActivity componentActivity) {
            super(0);
            this.f44692n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f44692n.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class aC implements Function2 {

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, cd.u.class, "onGetDiscountClicked", "onGetDiscountClicked()V", 0);
            }

            public final void n() {
                ((cd.u) this.receiver).ty();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        static final class n extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ MyAccountActivity f44694O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f44695n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ cd.DAz f44696t;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new n(this.f44696t, this.f44694O, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(cd.DAz dAz, MyAccountActivity myAccountActivity, Continuation continuation) {
                super(2, continuation);
                this.f44696t = dAz;
                this.f44694O = myAccountActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f44695n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    long jNr = ((long) ((DAz.n) this.f44696t).nr()) * 1000;
                    this.f44695n = 1;
                    if (GJW.yg.rl(jNr, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                SJ0.SPz sPz = this.f44694O.binding;
                if (sPz == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sPz = null;
                }
                ComposeView timedDiscountCard = sPz.E2;
                Intrinsics.checkNotNullExpressionValue(timedDiscountCard, "timedDiscountCard");
                eVj.aC.nr(timedDiscountCard, 1000L, null, 2, null);
                return Unit.INSTANCE;
            }
        }

        aC() {
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
                ComposerKt.p5(396048521, i2, -1, "com.alightcreative.app.motion.activities.MyAccountActivity.setupTimedDiscountCardView.<anonymous> (MyAccountActivity.kt:370)");
            }
            cd.DAz dAz = (cd.DAz) LiveDataAdapterKt.n(MyAccountActivity.this.F().t(), composer, 0).getValue();
            if (dAz instanceof DAz.n) {
                DAz.n nVar = (DAz.n) dAz;
                int iNr = nVar.nr();
                int iT = nVar.t();
                Object objF = MyAccountActivity.this.F();
                composer.eF(-429541296);
                boolean zE2 = composer.E2(objF);
                Object objIF = composer.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new j(objF);
                    composer.o(objIF);
                }
                composer.Xw();
                pBD.QJ.rl(iNr, iT, (Function0) ((KFunction) objIF), composer, 0);
                Integer numValueOf = Integer.valueOf(nVar.nr());
                composer.eF(-429537032);
                boolean zP5 = composer.p5(dAz) | composer.E2(MyAccountActivity.this);
                MyAccountActivity myAccountActivity = MyAccountActivity.this;
                Object objIF2 = composer.iF();
                if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new n(dAz, myAccountActivity, null);
                    composer.o(objIF2);
                }
                composer.Xw();
                EffectsKt.O(numValueOf, (Function2) objIF2, composer, 0);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class eO extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f44697n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44698t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eO(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f44697n = function0;
            this.f44698t = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f44697n;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f44698t.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class fuX implements Function2 {
        fuX() {
        }

        public final void O(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-15285550, i2, -1, "com.alightcreative.app.motion.activities.MyAccountActivity.setupCreatorRankingCardMenuView.<anonymous> (MyAccountActivity.kt:483)");
            }
            Ax.qz qzVar = (Ax.qz) MyAccountActivity.this.creatorRankingCardMenuState.getValue();
            if (qzVar != null) {
                composer.eF(424148556);
                boolean zE2 = composer.E2(MyAccountActivity.this);
                final MyAccountActivity myAccountActivity = MyAccountActivity.this;
                Object objIF = composer.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: com.alightcreative.app.motion.activities.ynZ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MyAccountActivity.fuX.J2(myAccountActivity);
                        }
                    };
                    composer.o(objIF);
                }
                Function0 function0 = (Function0) objIF;
                composer.Xw();
                composer.eF(424157111);
                boolean zE22 = composer.E2(MyAccountActivity.this);
                final MyAccountActivity myAccountActivity2 = MyAccountActivity.this;
                Object objIF2 = composer.iF();
                if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0() { // from class: com.alightcreative.app.motion.activities.SZ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MyAccountActivity.fuX.Uo(myAccountActivity2);
                        }
                    };
                    composer.o(objIF2);
                }
                Function0 function02 = (Function0) objIF2;
                composer.Xw();
                composer.eF(424165950);
                boolean zE23 = composer.E2(MyAccountActivity.this);
                final MyAccountActivity myAccountActivity3 = MyAccountActivity.this;
                Object objIF3 = composer.iF();
                if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new Function0() { // from class: com.alightcreative.app.motion.activities.kuQ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MyAccountActivity.fuX.KN(myAccountActivity3);
                        }
                    };
                    composer.o(objIF3);
                }
                Function0 function03 = (Function0) objIF3;
                composer.Xw();
                composer.eF(424175669);
                boolean zE24 = composer.E2(MyAccountActivity.this);
                final MyAccountActivity myAccountActivity4 = MyAccountActivity.this;
                Object objIF4 = composer.iF();
                if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                    objIF4 = new Function0() { // from class: com.alightcreative.app.motion.activities.Zb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MyAccountActivity.fuX.xMQ(myAccountActivity4);
                        }
                    };
                    composer.o(objIF4);
                }
                composer.Xw();
                Ax.o.rl(qzVar, function0, function02, function03, (Function0) objIF4, composer, 0);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            O((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(MyAccountActivity myAccountActivity) {
            myAccountActivity.kSg().n(j.nr.f8537n);
            myAccountActivity.creatorRankingCardMenuState.setValue(null);
            EditProfileActivity.INSTANCE.n(myAccountActivity);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KN(MyAccountActivity myAccountActivity) {
            myAccountActivity.creatorRankingCardMenuState.setValue(null);
            QAsActivity.INSTANCE.n(myAccountActivity, F2p.Ml.f2488t);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(MyAccountActivity myAccountActivity) {
            myAccountActivity.kSg().n(j.giR.f8510n);
            myAccountActivity.creatorRankingCardMenuState.setValue(null);
            myAccountActivity.ER().iF();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(MyAccountActivity myAccountActivity) {
            myAccountActivity.creatorRankingCardMenuState.setValue(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.MyAccountActivity$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            p0.startActivity(p1);
        }

        private Companion() {
        }

        public final void n(Context context, int i2) {
            Intrinsics.checkNotNullParameter(context, pTYaLzzmJSGAPQ.zHkiiCx);
            Intent intent = new Intent(context, (Class<?>) MyAccountActivity.class);
            intent.setFlags(i2);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kgE.Zs.values().length];
            try {
                iArr[kgE.Zs.f70102n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kgE.Zs.f70105t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kgE.Zs.f70101O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kgE.Zs.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class o extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44700n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f44700n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f44700n.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class qz extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f44701n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44702t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public qz(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f44701n = function0;
            this.f44702t = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f44701n;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f44702t.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class w6 extends ConnectivityManager.NetworkCallback {
        w6() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            final MyAccountActivity myAccountActivity = MyAccountActivity.this;
            myAccountActivity.runOnUiThread(new Runnable() { // from class: com.alightcreative.app.motion.activities.wVR
                @Override // java.lang.Runnable
                public final void run() {
                    MyAccountActivity.w6.t(myAccountActivity);
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            final MyAccountActivity myAccountActivity = MyAccountActivity.this;
            myAccountActivity.runOnUiThread(new Runnable() { // from class: com.alightcreative.app.motion.activities.cDb
                @Override // java.lang.Runnable
                public final void run() {
                    MyAccountActivity.w6.nr(myAccountActivity);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void nr(MyAccountActivity myAccountActivity) {
            int itemCount;
            SJ0.SPz sPz = myAccountActivity.binding;
            SJ0.SPz sPz2 = null;
            if (sPz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz = null;
            }
            RecyclerView.Adapter adapter = sPz.f9318o.getAdapter();
            if (adapter != null) {
                itemCount = adapter.getItemCount();
            } else {
                itemCount = 0;
            }
            if (itemCount > 0) {
                SJ0.SPz sPz3 = myAccountActivity.binding;
                if (sPz3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    sPz2 = sPz3;
                }
                sPz2.WPU.setVisibility(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(MyAccountActivity myAccountActivity) {
            SJ0.SPz sPz = myAccountActivity.binding;
            if (sPz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz = null;
            }
            sPz.WPU.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(FirebaseAuth auth) {
        final FirebaseUser firebaseUserXMQ = auth.xMQ();
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.En
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MyAccountActivity.How(firebaseUserXMQ);
            }
        });
        if (firebaseUserXMQ == null) {
            SJ0.SPz sPz = this.binding;
            if (sPz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz = null;
            }
            sPz.f9315e.setText("");
            SJ0.SPz sPz2 = this.binding;
            if (sPz2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz2 = null;
            }
            sPz2.f9313X.setText("");
            SJ0.SPz sPz3 = this.binding;
            if (sPz3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz3 = null;
            }
            ImageView imageView = sPz3.f9316g;
            SJ0.SPz sPz4 = this.binding;
            if (sPz4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz4 = null;
            }
            TextView textView = sPz4.te;
            SJ0.SPz sPz5 = this.binding;
            if (sPz5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz5 = null;
            }
            TextView textView2 = sPz5.iF;
            SJ0.SPz sPz6 = this.binding;
            if (sPz6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz6 = null;
            }
            Iterator it = CollectionsKt.listOf((Object[]) new View[]{imageView, textView, textView2, sPz6.nY}).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(0);
            }
            SJ0.SPz sPz7 = this.binding;
            if (sPz7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz7 = null;
            }
            TextView textView3 = sPz7.f9315e;
            SJ0.SPz sPz8 = this.binding;
            if (sPz8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz8 = null;
            }
            TextView textView4 = sPz8.f9313X;
            SJ0.SPz sPz9 = this.binding;
            if (sPz9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz9 = null;
            }
            SimpleDraweeView simpleDraweeView = sPz9.f9312T;
            SJ0.SPz sPz10 = this.binding;
            if (sPz10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz10 = null;
            }
            Iterator it2 = CollectionsKt.listOf((Object[]) new View[]{textView3, textView4, simpleDraweeView, sPz10.f9311S}).iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(8);
            }
            SJ0.SPz sPz11 = this.binding;
            if (sPz11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz11 = null;
            }
            sPz11.f9312T.setImageURI((String) null);
            com.google.firebase.firestore.s4 s4Var = this.listenerRegistration;
            if (s4Var != null) {
                s4Var.remove();
            }
            this.listenerRegistration = null;
            return;
        }
        com.google.firebase.firestore.s4 s4Var2 = this.listenerRegistration;
        if (s4Var2 != null) {
            s4Var2.remove();
        }
        this.listenerRegistration = null;
        SJ0.SPz sPz12 = this.binding;
        if (sPz12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz12 = null;
        }
        ImageView imageView2 = sPz12.f9316g;
        SJ0.SPz sPz13 = this.binding;
        if (sPz13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz13 = null;
        }
        TextView textView5 = sPz13.te;
        SJ0.SPz sPz14 = this.binding;
        if (sPz14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz14 = null;
        }
        TextView textView6 = sPz14.iF;
        SJ0.SPz sPz15 = this.binding;
        if (sPz15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz15 = null;
        }
        Iterator it3 = CollectionsKt.listOf((Object[]) new View[]{imageView2, textView5, textView6, sPz15.nY}).iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).setVisibility(8);
        }
        SJ0.SPz sPz16 = this.binding;
        if (sPz16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz16 = null;
        }
        TextView textView7 = sPz16.f9315e;
        SJ0.SPz sPz17 = this.binding;
        if (sPz17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz17 = null;
        }
        TextView textView8 = sPz17.f9313X;
        SJ0.SPz sPz18 = this.binding;
        if (sPz18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz18 = null;
        }
        SimpleDraweeView simpleDraweeView2 = sPz18.f9312T;
        SJ0.SPz sPz19 = this.binding;
        if (sPz19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz19 = null;
        }
        Iterator it4 = CollectionsKt.listOf((Object[]) new View[]{textView7, textView8, simpleDraweeView2, sPz19.f9311S}).iterator();
        while (it4.hasNext()) {
            ((View) it4.next()).setVisibility(0);
        }
        SJ0.SPz sPz20 = this.binding;
        if (sPz20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz20 = null;
        }
        TextView textView9 = sPz20.f9315e;
        String displayName = firebaseUserXMQ.getDisplayName();
        textView9.setText((displayName == null || StringsKt.isBlank(displayName)) ? PJ9.DAz.I(firebaseUserXMQ) : firebaseUserXMQ.getDisplayName());
        SJ0.SPz sPz21 = this.binding;
        if (sPz21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz21 = null;
        }
        TextView textView10 = sPz21.f9313X;
        String email = firebaseUserXMQ.getEmail();
        if (email == null) {
            email = PJ9.DAz.I(firebaseUserXMQ);
        }
        textView10.setText(email);
        SJ0.SPz sPz22 = this.binding;
        if (sPz22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz22 = null;
        }
        sPz22.f9312T.gh(firebaseUserXMQ.getPhotoUrl(), null);
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.cj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MyAccountActivity.tUK(firebaseUserXMQ, this);
            }
        });
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @Override // com.alightcreative.app.motion.activities.fVn, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UF(new PJ9.Ml(this, kSg()));
        SJ0.SPz sPzT = SJ0.SPz.t(getLayoutInflater());
        this.binding = sPzT;
        SJ0.SPz sPz = null;
        if (sPzT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPzT = null;
        }
        setContentView(sPzT.getRoot());
        SJ0.SPz sPz2 = this.binding;
        if (sPz2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz2 = null;
        }
        ViewCompat.Org(sPz2.getRoot(), new OnApplyWindowInsetsListener() { // from class: com.alightcreative.app.motion.activities.jx
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                return MyAccountActivity.QZ6(view, windowInsetsCompat);
            }
        });
        lLA().Ik(this);
        SJ0.SPz sPz3 = this.binding;
        if (sPz3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz3 = null;
        }
        sPz3.f9320t.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.SzA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyAccountActivity.mI(this.f44771n, view);
            }
        });
        SJ0.SPz sPz4 = this.binding;
        if (sPz4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz4 = null;
        }
        sPz4.J2.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.c1j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyAccountActivity.T3L(this.f44922n, view);
            }
        });
        SJ0.SPz sPz5 = this.binding;
        if (sPz5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz5 = null;
        }
        sPz5.fD.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.n2z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyAccountActivity.Bu(this.f45549n, view);
            }
        });
        SJ0.SPz sPz6 = this.binding;
        if (sPz6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz6 = null;
        }
        sPz6.f9318o.setNestedScrollingEnabled(false);
        SJ0.SPz sPz7 = this.binding;
        if (sPz7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz7 = null;
        }
        sPz7.aYN.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.waf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyAccountActivity.f(this.f45715n, view);
            }
        });
        SJ0.SPz sPz8 = this.binding;
        if (sPz8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz8 = null;
        }
        ImageView imageView = sPz8.f9316g;
        SJ0.SPz sPz9 = this.binding;
        if (sPz9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz9 = null;
        }
        TextView textView = sPz9.te;
        SJ0.SPz sPz10 = this.binding;
        if (sPz10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz10 = null;
        }
        TextView textView2 = sPz10.iF;
        SJ0.SPz sPz11 = this.binding;
        if (sPz11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz11 = null;
        }
        Iterator it = CollectionsKt.listOf((Object[]) new View[]{imageView, textView, textView2, sPz11.nY}).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
        SJ0.SPz sPz12 = this.binding;
        if (sPz12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz12 = null;
        }
        TextView textView3 = sPz12.f9315e;
        SJ0.SPz sPz13 = this.binding;
        if (sPz13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz13 = null;
        }
        TextView textView4 = sPz13.f9313X;
        SJ0.SPz sPz14 = this.binding;
        if (sPz14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz14 = null;
        }
        SimpleDraweeView simpleDraweeView = sPz14.f9312T;
        SJ0.SPz sPz15 = this.binding;
        if (sPz15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz15 = null;
        }
        Iterator it2 = CollectionsKt.listOf((Object[]) new View[]{textView3, textView4, simpleDraweeView, sPz15.f9311S}).iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(8);
        }
        SJ0.SPz sPz16 = this.binding;
        if (sPz16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz16 = null;
        }
        sPz16.f9314Z.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.FqE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyAccountActivity.tFV(this.f44551n, view);
            }
        });
        SJ0.SPz sPz17 = this.binding;
        if (sPz17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz17 = null;
        }
        sPz17.f9311S.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.ls
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyAccountActivity.VwL(this.f45325n, view);
            }
        });
        SJ0.SPz sPz18 = this.binding;
        if (sPz18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz18 = null;
        }
        sPz18.nY.setContent(ComposableLambdaKt.rl(-268723296, true, new Ml()));
        XoT.fuX.aYN(this, this.networkCallback);
        RQ().n();
        RQ().S();
        kgE.Sis.gh(this.purchaseStateObserver);
        RQ().qie();
        if (!XoT.fuX.Ik(this)) {
            SJ0.SPz sPz19 = this.binding;
            if (sPz19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sPz = sPz19;
            }
            sPz.WPU.setVisibility(0);
        }
        Zmq();
        xVH();
        EF();
        JVN();
        X4T();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44678n;

        I28(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MyAccountActivity.this.new I28(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44678n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC2210n interfaceC2210nA63 = MyAccountActivity.this.a63();
                Eu.I28 i28 = Eu.I28.f2387o;
                this.f44678n = 1;
                if (Eu.Wre.n(interfaceC2210nA63, i28, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bu(final MyAccountActivity myAccountActivity, View view) {
        cd.nKK.O(myAccountActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.Ee7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MyAccountActivity.p0N(this.f44506n);
            }
        }, new Function0() { // from class: com.alightcreative.app.motion.activities.ea
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MyAccountActivity.Uf(this.f45065n);
            }
        }, null, 4, null);
    }

    private final void EF() {
        SJ0.SPz sPz = this.binding;
        if (sPz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz = null;
        }
        sPz.E2.setContent(ComposableLambdaKt.rl(396048521, true, new aC()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k9D.n ER() {
        return (k9D.n) this.bottomSheetViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cd.u F() {
        return (cd.u) this.timedDiscountCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String How(FirebaseUser firebaseUser) {
        return "TESTTEST :: firebaseAuthStateChanged :: " + firebaseUser;
    }

    private final void JVN() {
        SJ0.SPz sPz = this.binding;
        if (sPz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz = null;
        }
        sPz.xMQ.setContent(ComposableLambdaKt.rl(-15285550, true, new fuX()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qu(final MyAccountActivity myAccountActivity, com.alightcreative.account.o purchaseState) {
        Object objM313constructorimpl;
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        SJ0.SPz sPz = myAccountActivity.binding;
        SJ0.SPz sPz2 = null;
        if (sPz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz = null;
        }
        sPz.f9310O.setVisibility(4);
        SJ0.SPz sPz3 = myAccountActivity.binding;
        if (sPz3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz3 = null;
        }
        sPz3.qie.setVisibility(4);
        SJ0.SPz sPz4 = myAccountActivity.binding;
        if (sPz4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz4 = null;
        }
        sPz4.gh.setVisibility(4);
        SJ0.SPz sPz5 = myAccountActivity.binding;
        if (sPz5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz5 = null;
        }
        sPz5.J2.setVisibility(4);
        SJ0.SPz sPz6 = myAccountActivity.binding;
        if (sPz6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz6 = null;
        }
        sPz6.f9318o.setVisibility(4);
        SJ0.SPz sPz7 = myAccountActivity.binding;
        if (sPz7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz7 = null;
        }
        sPz7.Uo.setVisibility(4);
        SJ0.SPz sPz8 = myAccountActivity.binding;
        if (sPz8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz8 = null;
        }
        sPz8.KN.setVisibility(4);
        SJ0.SPz sPz9 = myAccountActivity.binding;
        if (sPz9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz9 = null;
        }
        sPz9.mUb.setVisibility(4);
        SJ0.SPz sPz10 = myAccountActivity.binding;
        if (sPz10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz10 = null;
        }
        sPz10.ty.setVisibility(4);
        SJ0.SPz sPz11 = myAccountActivity.binding;
        if (sPz11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz11 = null;
        }
        sPz11.az.setVisibility(4);
        int i2 = n.$EnumSwitchMapping$0[purchaseState.xMQ().ordinal()];
        if (i2 == 1) {
            SJ0.SPz sPz12 = myAccountActivity.binding;
            if (sPz12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz12 = null;
            }
            sPz12.Uo.setVisibility(0);
            SJ0.SPz sPz13 = myAccountActivity.binding;
            if (sPz13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sPz2 = sPz13;
            }
            sPz2.KN.setVisibility(0);
            return;
        }
        if (i2 == 2) {
            SJ0.SPz sPz14 = myAccountActivity.binding;
            if (sPz14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sPz2 = sPz14;
            }
            sPz2.f9310O.setVisibility(0);
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            SJ0.SPz sPz15 = myAccountActivity.binding;
            if (sPz15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz15 = null;
            }
            sPz15.f9318o.setVisibility(0);
            SJ0.SPz sPz16 = myAccountActivity.binding;
            if (sPz16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz16 = null;
            }
            sPz16.Uo.setVisibility(0);
            SJ0.SPz sPz17 = myAccountActivity.binding;
            if (sPz17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz17 = null;
            }
            sPz17.KN.setVisibility(0);
            SJ0.SPz sPz18 = myAccountActivity.binding;
            if (sPz18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz18 = null;
            }
            sPz18.f9318o.setLayoutManager(new LinearLayoutManager(myAccountActivity, 1, false));
            SJ0.SPz sPz19 = myAccountActivity.binding;
            if (sPz19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sPz2 = sPz19;
            }
            sPz2.f9318o.setAdapter(new VCI(purchaseState, myAccountActivity.kSg(), myAccountActivity.W(), myAccountActivity.RQ(), new Function0() { // from class: com.alightcreative.app.motion.activities.Fsa
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MyAccountActivity.HBN(this.f44552n);
                }
            }));
            return;
        }
        if (!XoT.fuX.Ik(myAccountActivity)) {
            SJ0.SPz sPz20 = myAccountActivity.binding;
            if (sPz20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz20 = null;
            }
            sPz20.ty.setVisibility(0);
            SJ0.SPz sPz21 = myAccountActivity.binding;
            if (sPz21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sPz21 = null;
            }
            sPz21.az.setVisibility(0);
            SJ0.SPz sPz22 = myAccountActivity.binding;
            if (sPz22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sPz2 = sPz22;
            }
            sPz2.WPU.setVisibility(4);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(myAccountActivity.getPackageManager().getApplicationInfo("com.android.vending", 128));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m319isFailureimpl(objM313constructorimpl)) {
            objM313constructorimpl = null;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) objM313constructorimpl;
        CharSequence applicationLabel = applicationInfo != null ? myAccountActivity.getPackageManager().getApplicationLabel(applicationInfo) : null;
        SJ0.SPz sPz23 = myAccountActivity.binding;
        if (sPz23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz23 = null;
        }
        TextView textView = sPz23.gh;
        Resources resources = myAccountActivity.getResources();
        if (applicationLabel == null) {
            applicationLabel = YmsTEL.wztpNJD;
        }
        textView.setText(resources.getString(2132019996, applicationLabel));
        SJ0.SPz sPz24 = myAccountActivity.binding;
        if (sPz24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz24 = null;
        }
        sPz24.mUb.setText(kgE.Sis.KN(purchaseState, myAccountActivity));
        SJ0.SPz sPz25 = myAccountActivity.binding;
        if (sPz25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz25 = null;
        }
        sPz25.qie.setVisibility(0);
        SJ0.SPz sPz26 = myAccountActivity.binding;
        if (sPz26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz26 = null;
        }
        sPz26.gh.setVisibility(0);
        SJ0.SPz sPz27 = myAccountActivity.binding;
        if (sPz27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            sPz2 = sPz27;
        }
        sPz2.mUb.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uf(MyAccountActivity myAccountActivity) {
        YgZ.Ml.rl(YgZ.Ml.f12213n, myAccountActivity, "https://play.google.com/", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Vvq(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    private final void X4T() {
        SJ0.SPz sPz = this.binding;
        if (sPz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz = null;
        }
        sPz.nr.setContent(ComposableLambdaKt.rl(1455651394, true, new Wre()));
    }

    private final void Zmq() {
        SJ0.SPz sPz = this.binding;
        if (sPz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz = null;
        }
        sPz.Uo.setContent(ComposableLambdaKt.rl(76316515, true, new CN3()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final MyAccountActivity myAccountActivity, View view) {
        com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(myAccountActivity, myAccountActivity.RQ(), false);
        long jNanoTime = (System.nanoTime() - v0i.rl) / 1000000;
        if (jNanoTime > 120000) {
            v0i.f45697n = 0;
        }
        com.alightcreative.widget.nKK.ty(nkk, 2132020032, 2131361954, 0, false, null, 28, null);
        if (jNanoTime <= 5000 || v0i.f45697n >= 5) {
            nkk.nY();
        }
        nkk.fD(new Function1() { // from class: com.alightcreative.app.motion.activities.V44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MyAccountActivity.ub(this.f44793n, ((Integer) obj).intValue());
            }
        });
        nkk.X(myAccountActivity.getResources().getDimensionPixelSize(2131166272));
        Intrinsics.checkNotNull(view);
        com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0N(MyAccountActivity myAccountActivity) {
        YgZ.Ml.rl(YgZ.Ml.f12213n, myAccountActivity, "https://play.google.com/store/account/subscriptions", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uG() {
        new R6(this).mUb(2132019855).nr(2132017603).Uo(2132017378, new Function1() { // from class: com.alightcreative.app.motion.activities.DzF
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MyAccountActivity.Vvq((DialogInterface) obj);
            }
        }).gh();
    }

    private final void xVH() {
        SJ0.SPz sPz = this.binding;
        if (sPz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz = null;
        }
        sPz.KN.setContent(ComposableLambdaKt.rl(841022193, true, new Dsr()));
    }

    public final kgE.fuX RQ() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public void UF(PJ9.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<set-?>");
        this.signInLauncher = ml;
    }

    @Override // PJ9.I28
    public PJ9.Ml ViF() {
        PJ9.Ml ml = this.signInLauncher;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("signInLauncher");
        return null;
    }

    public final nYs.Ml W() {
        nYs.Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    public final InterfaceC2210n a63() {
        InterfaceC2210n interfaceC2210n = this.injet;
        if (interfaceC2210n != null) {
            return interfaceC2210n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injet");
        return null;
    }

    public final QmE.iF kSg() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final xAo.I28 lLA() {
        xAo.I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HBN(MyAccountActivity myAccountActivity) {
        nYs.j jVarInvoke = myAccountActivity.W().invoke();
        if (jVarInvoke != null && jVarInvoke.Xw()) {
            GJW.C.nr(LifecycleOwnerKt.n(myAccountActivity), null, null, myAccountActivity.new I28(null), 3, null);
        } else {
            xAo.I28.o(myAccountActivity.lLA(), xAo.fuX.f75276n, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat QZ6(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insetsJ2 = windowInsetsCompat.J2(WindowInsetsCompat.Type.xMQ());
        Intrinsics.checkNotNull(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = insetsJ2.rl;
            marginLayoutParams.bottomMargin = insetsJ2.nr;
            view.setLayoutParams(marginLayoutParams);
            return windowInsetsCompat;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3L(MyAccountActivity myAccountActivity, View view) {
        myAccountActivity.RQ().qie();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VwL(MyAccountActivity myAccountActivity, View view) {
        if (FirebaseAuth.getInstance().xMQ() != null) {
            Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[0], 0);
            Intent intent = new Intent(myAccountActivity, (Class<?>) ManageAccountActivity.class);
            intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(myAccountActivity, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mI(MyAccountActivity myAccountActivity, View view) {
        myAccountActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tFV(MyAccountActivity myAccountActivity, View view) {
        if (FirebaseAuth.getInstance().xMQ() != null) {
            Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[0], 0);
            Intent intent = new Intent(myAccountActivity, (Class<?>) ManageAccountActivity.class);
            intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(myAccountActivity, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tUK(FirebaseUser firebaseUser, MyAccountActivity myAccountActivity) {
        Uri photoUrl = firebaseUser.getPhotoUrl();
        SJ0.SPz sPz = myAccountActivity.binding;
        if (sPz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sPz = null;
        }
        return "TESTTEST :: BB :: " + photoUrl + ", " + sPz.f9312T.getVisibility() + " out --";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ub(MyAccountActivity myAccountActivity, int i2) {
        if (i2 == 2131361954) {
            v0i.rl = System.nanoTime();
            v0i.f45697n++;
            myAccountActivity.RQ().xMQ();
        }
        return Unit.INSTANCE;
    }

    @Override // com.alightcreative.app.motion.activities.fVn, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        kgE.Sis.ty(this.purchaseStateObserver);
        XoT.fuX.iF(this, this.networkCallback);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        RQ().KN();
        F().HI();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        FirebaseAuth.getInstance().t(new ge(this));
        FirebaseAuth.getInstance().t(new Al(RQ()));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        FirebaseAuth.getInstance().ck(new ge(this));
        FirebaseAuth.getInstance().ck(new Al(RQ()));
        super.onStop();
    }
}
