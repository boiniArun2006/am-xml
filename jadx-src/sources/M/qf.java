package M;

import Dk.InterfaceC1335n;
import FZ.n;
import KC.QhI;
import M.qf;
import QmE.j;
import SJ0.nH;
import Vi.C1479w6;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.Lifecycle;
import androidx.view.LifecycleKt;
import androidx.view.LifecycleOwnerKt;
import cS.Zv.SzFNXybiSxdx;
import com.alightcreative.app.motion.activities.MyAccountActivity;
import com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity;
import com.alightcreative.app.motion.feed.Feed;
import com.alightcreative.app.motion.feed.FeedAction;
import com.alightcreative.app.motion.feed.FeedActionType;
import com.alightcreative.app.motion.feed.FeedCard;
import com.alightcreative.app.motion.feed.FeedContentRequest;
import com.alightcreative.app.motion.feed.FeedContentResponse;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.tasks.Task;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.utils.Logger;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import ga6.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kP.InterfaceC2210n;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import w.AbstractC2412j;
import w.InterfaceC2413n;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0004J!\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010\u0004R\u0018\u0010.\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020h0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010o\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010v\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u00100R\u0016\u0010x\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u00100R\u001c\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00110y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u007f"}, d2 = {"LM/qf;", "Landroidx/fragment/app/Fragment;", "LKC/g9s;", "<init>", "()V", "", "Po6", "UhV", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LSJ0/nH;", "binding", "Landroid/content/Context;", "context", "", MRAIDPresenter.ERROR, "Mx", "(LSJ0/nH;Landroid/content/Context;Ljava/lang/Throwable;)V", "Lcom/alightcreative/app/motion/feed/FeedCard;", "card", "Lcom/alightcreative/app/motion/feed/FeedAction;", FileUploadManager.f61572j, "ijL", "(Lcom/alightcreative/app/motion/feed/FeedCard;Lcom/alightcreative/app/motion/feed/FeedAction;)V", "", "destination", "G7", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onPause", "onResume", "onDestroy", "onDestroyView", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Uo", "o", "LSJ0/nH;", "_binding", "LQmE/iF;", "Z", "LQmE/iF;", "Y", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "S", "LkgE/fuX;", "z", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LxAo/I28;", "g", "LxAo/I28;", "Nxk", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LDk/n;", "E2", "LDk/n;", "GR", "()LDk/n;", "setConcierge", "(LDk/n;)V", "concierge", "Lw/n;", "e", "Lw/n;", "dR0", "()Lw/n;", "setGetMonorepoLibUseCase", "(Lw/n;)V", "getMonorepoLibUseCase", "LnYs/Ml;", "X", "LnYs/Ml;", "k", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "LkP/n;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LkP/n;", "piY", "()LkP/n;", "setInjet", "(LkP/n;)V", "injet", "Let/n;", "Lcom/alightcreative/app/motion/feed/Feed;", "N", "Let/n;", "feedSerializer", "Lcom/alightcreative/account/o;", "v", "Lcom/alightcreative/account/o;", "purchaseState", "LkgE/l4Z;", "Xw", "LkgE/l4Z;", "purchaseStateObserver", "", "jB", "isRefreshing", "U", "validFeedReceived", "", "P5", "Ljava/util/List;", "currentFeedCards", "I", "()LSJ0/nH;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainTabHomeFeedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainTabHomeFeedFragment.kt\ncom/alightcreative/app/motion/activities/main/maintabs/MainTabHomeFeedFragment\n+ 2 JsonSerializer.kt\ncom/bendingspoons/serialization/json/JsonSerializerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Functions.kt\ncom/alightcreative/firebase/FunctionsKt\n+ 6 Either.kt\ncom/bendingspoons/core/functional/EitherKt\n+ 7 ContextUtil.kt\ncom/alightcreative/ext/ContextUtilKt\n*L\n1#1,585:1\n30#2,3:586\n1#3:589\n1#3:611\n1663#4,8:590\n1062#4:598\n1611#4,9:601\n1863#4:610\n1864#4:612\n1620#4:613\n1557#4:614\n1628#4,3:615\n39#5,2:599\n223#6,3:618\n106#7:621\n93#7,3:622\n107#7:625\n106#7:626\n93#7,3:627\n107#7:630\n*S KotlinDebug\n*F\n+ 1 MainTabHomeFeedFragment.kt\ncom/alightcreative/app/motion/activities/main/maintabs/MainTabHomeFeedFragment\n*L\n112#1:586,3\n269#1:611\n240#1:590,8\n240#1:598\n269#1:601,9\n269#1:610\n269#1:612\n269#1:613\n282#1:614\n282#1:615,3\n259#1:599,2\n323#1:618,3\n498#1:621\n498#1:622,3\n498#1:625\n509#1:626\n509#1:627,3\n509#1:630\n*E\n"})
public final class qf extends M.j implements KC.g9s {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public InterfaceC1335n concierge;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    public InterfaceC2210n injet;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean validFeedReceived;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public InterfaceC2413n getMonorepoLibUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean isRefreshing;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private nH _binding;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final et.n feedSerializer = new et.I28(LazyKt.lazy(new qz(et.w6.rl())));

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private com.alightcreative.account.o purchaseState = new com.alightcreative.account.o(null, null, null, null, false, null, null, null, null, false, 1023, null);

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final kgE.l4Z purchaseStateObserver = new kgE.l4Z() { // from class: M.u
        @Override // kgE.l4Z
        public final void n(com.alightcreative.account.o oVar) {
            qf.Org(this.f6529n, oVar);
        }
    };

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private List currentFeedCards = CollectionsKt.emptyList();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class C extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6472n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((C) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        C(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return qf.this.new C(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6472n == 0) {
                ResultKt.throwOnFailure(obj);
                return qf.this.feedSerializer.n(com.alightcreative.app.motion.persist.j.INSTANCE.getLastSerializedFeed());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class CN3 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Long.valueOf(((FeedCard) obj2).getPublishDate()), Long.valueOf(((FeedCard) obj).getPublishDate()));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Dsr implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ mCM.QJ f6474n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f6475t;

        public static final class Ml implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f6476n;

            public Ml(String str) {
                this.f6476n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "WrappedHttpsCallable: " + this.f6476n + " OUT";
            }
        }

        public static final class j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f6477n;

            public j(String str) {
                this.f6477n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "WrappedHttpsCallable: " + this.f6477n + " IN";
            }
        }

        public static final class n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f6478n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f6479t;

            public n(String str, String str2) {
                this.f6478n = str;
                this.f6479t = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "typedCall:" + this.f6478n + ": IN / " + this.f6479t;
            }
        }

        public static final class w6 implements com.google.android.gms.tasks.Continuation {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ mCM.QJ f6480n;
            final /* synthetic */ String nr;
            final /* synthetic */ JsonAdapter rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function1 f6481t;

            public static final class CN3 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f6482n;

                public CN3(String str) {
                    this.f6482n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f6482n + ": FAIL";
                }
            }

            public static final class I28 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f6483n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Throwable f6484t;

                public I28(String str, Throwable th) {
                    this.f6483n = str;
                    this.f6484t = th;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f6483n + ": Parse error! " + this.f6484t;
                }
            }

            public static final class Ml implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ String f6485O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f6486n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f6487t;

                public Ml(String str, int i2, String str2) {
                    this.f6486n = str;
                    this.f6487t = i2;
                    this.f6485O = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f6486n + ": RESPONSE: " + StringsKt.padStart$default(String.valueOf(this.f6487t), 4, (char) 0, 2, (Object) null) + ": " + this.f6485O;
                }
            }

            public static final class Wre implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f6488n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f6489t;

                public Wre(String str, Object obj) {
                    this.f6488n = str;
                    this.f6489t = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f6488n + ": RESULT: " + this.f6489t;
                }
            }

            public static final class j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f6490n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Task f6491t;

                public j(String str, Task task) {
                    this.f6490n = str;
                    this.f6491t = task;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String message;
                    String str = this.f6490n;
                    Task task = this.f6491t;
                    boolean zIsSuccessful = task.isSuccessful();
                    boolean zIsCanceled = this.f6491t.isCanceled();
                    boolean zIsComplete = this.f6491t.isComplete();
                    Exception exception = this.f6491t.getException();
                    if (exception == null || (message = exception.getMessage()) == null) {
                        message = "NONE";
                    }
                    return "typedCall:" + str + ": CONTINUE (" + task + ") isSuccessful=" + zIsSuccessful + " isCanceled=" + zIsCanceled + " isComplete=" + zIsComplete + " exception=" + message;
                }
            }

            public static final class n implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f6492n;

                public n(String str) {
                    this.f6492n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f6492n + ": SUCCESS";
                }
            }

            /* JADX INFO: renamed from: M.qf$Dsr$w6$w6, reason: collision with other inner class name */
            public static final class C0227w6 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f6493n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f6494t;

                public C0227w6(String str, String str2) {
                    this.f6493n = str;
                    this.f6494t = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f6493n + ": RESPONSE: len=" + this.f6494t.length();
                }
            }

            public w6(mCM.QJ qj, JsonAdapter jsonAdapter, Function1 function1, String str) {
                this.f6480n = qj;
                this.rl = jsonAdapter;
                this.f6481t = function1;
                this.nr = str;
            }

            public final void n(Task task) {
                Intrinsics.checkNotNullParameter(task, "task");
                XoT.C.Uo(this.f6480n, new j(this.nr, task));
                if (task.isSuccessful()) {
                    mCM.l3D l3d = (mCM.l3D) task.getResult();
                    if (l3d == null) {
                        Function1 function1 = this.f6481t;
                        Result.Companion companion = Result.INSTANCE;
                        function1.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")))));
                        return;
                    }
                    XoT.C.Uo(this.f6480n, new n(this.nr));
                    Moshi moshiN = HI0.Lu.n();
                    Object obj = l3d.f70669n;
                    JsonAdapter jsonAdapterAdapter = moshiN.adapter(Object.class);
                    Intrinsics.checkNotNull(jsonAdapterAdapter);
                    JsonAdapter jsonAdapterIndent = jsonAdapterAdapter.indent("    ");
                    Intrinsics.checkNotNull(jsonAdapterIndent);
                    String json = jsonAdapterIndent.toJson(obj);
                    Intrinsics.checkNotNull(json);
                    XoT.C.Uo(this.f6480n, new C0227w6(this.nr, json));
                    Sequence<String> sequenceLineSequence = StringsKt.lineSequence(json);
                    mCM.QJ qj = this.f6480n;
                    String str = this.nr;
                    int i2 = 0;
                    for (String str2 : sequenceLineSequence) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        XoT.C.Uo(qj, new Ml(str, i2, str2));
                        i2 = i3;
                    }
                    try {
                        Object objFromJson = this.rl.fromJson(json);
                        XoT.C.Uo(this.f6480n, new Wre(this.nr, objFromJson));
                        if (objFromJson != null) {
                            this.f6481t.invoke(Result.m312boximpl(Result.m313constructorimpl(objFromJson)));
                            return;
                        }
                    } catch (Throwable th) {
                        XoT.C.Uo(this.f6480n, new I28(this.nr, th));
                        Function1 function12 = this.f6481t;
                        Result.Companion companion2 = Result.INSTANCE;
                        function12.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(th))));
                        return;
                    }
                }
                XoT.C.Uo(this.f6480n, new CN3(this.nr));
                Exception exception = task.getException();
                if (exception != null) {
                    Function1 function13 = this.f6481t;
                    Result.Companion companion3 = Result.INSTANCE;
                    function13.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(exception))));
                } else {
                    Function1 function14 = this.f6481t;
                    Result.Companion companion4 = Result.INSTANCE;
                    function14.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")))));
                }
            }

            @Override // com.google.android.gms.tasks.Continuation
            public /* bridge */ /* synthetic */ Object then(Task task) {
                n(task);
                return Unit.INSTANCE;
            }
        }

        public Dsr(mCM.QJ qj, String str) {
            this.f6474n = qj;
            this.f6475t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n(obj, (Function1) obj2);
            return Unit.INSTANCE;
        }

        public final void n(Object obj, Function1 cb2) {
            Intrinsics.checkNotNullParameter(cb2, "cb");
            XoT.C.KN("WrappedHttpsCallable", new j(this.f6475t));
            mCM.QJ qj = this.f6474n;
            String str = this.f6475t;
            JsonAdapter jsonAdapterAdapter = HI0.Lu.n().adapter(FeedContentRequest.class);
            Intrinsics.checkNotNull(jsonAdapterAdapter);
            String json = jsonAdapterAdapter.toJson(obj);
            Intrinsics.checkNotNull(json);
            XoT.C.Uo(qj, new n(str, json));
            qj.rl(new JSONObject(json)).continueWith(new w6(qj, HI0.Lu.n().adapter(FeedContentResponse.class), cb2, str));
            XoT.C.KN("WrappedHttpsCallable", new Ml(this.f6475t));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6495n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        I28(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return qf.this.new I28(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6495n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                qf qfVar = qf.this;
                this.f6495n = 1;
                if (qfVar.UhV(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Ml extends RecyclerView.OnScrollListener {
        Ml() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String nr() {
            return "HomeTab:onScrollStateChanged";
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void n(RecyclerView recyclerView, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            XoT.C.Uo(this, new Function0() { // from class: M.lej
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qf.Ml.nr();
                }
            });
            super.n(recyclerView, i2);
            SwipeRefreshLayout swipeRefreshLayout = qf.this.I().J2;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            swipeRefreshLayout.setEnabled((linearLayoutManager != null ? linearLayoutManager.Lu() : 0) == 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void rl(RecyclerView recyclerView, int i2, int i3) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.rl(recyclerView, i2, i3);
            KeyEventDispatcher.Component activity = qf.this.getActivity();
            KC.rrk rrkVar = activity instanceof KC.rrk ? (KC.rrk) activity : null;
            if (rrkVar != null) {
                rrkVar.XQ(recyclerView.computeVerticalScrollOffset());
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6498n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Wre(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return qf.this.new Wre(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6498n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                qf qfVar = qf.this;
                this.f6498n = 1;
                if (qfVar.UhV(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class aC extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f6500O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f6501Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6502n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6504r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f6505t;

        aC(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6504r = obj;
            this.f6501Z |= Integer.MIN_VALUE;
            return qf.this.UhV(this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    /* synthetic */ class fuX extends FunctionReferenceImpl implements Function2 {
        fuX(Object obj) {
            super(2, obj, qf.class, "handleCtaClick", "handleCtaClick(Lcom/alightcreative/app/motion/feed/FeedCard;Lcom/alightcreative/app/motion/feed/FeedAction;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((FeedCard) obj, (FeedAction) obj2);
            return Unit.INSTANCE;
        }

        public final void n(FeedCard p0, FeedAction p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((qf) this.receiver).ijL(p0, p1);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f6506O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6507n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f6506O = str;
            this.J2 = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return qf.this.new n(this.f6506O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6507n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                FZ.n nVarRl = qf.this.dR0().rl();
                if (nVarRl != null) {
                    Context contextRequireContext = qf.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    List listSplit$default = StringsKt.split$default((CharSequence) this.f6506O, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (!StringsKt.isBlank((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    List list = CollectionsKt.toList(arrayList2);
                    String str = "\n\n--------------------------------\n--------------------------------\n" + qf.this.getString(2132017641);
                    String string = StringsKt.trim((CharSequence) this.J2).toString();
                    this.f6507n = 1;
                    if (n.w6.rl(nVarRl, contextRequireContext, list, null, str, string, null, this, 36, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class o extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ FeedContentResponse f6509O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6510n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((o) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(FeedContentResponse feedContentResponse, String str, Continuation continuation) {
            super(2, continuation);
            this.f6509O = feedContentResponse;
            this.J2 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return qf.this.new o(this.f6509O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6510n == 0) {
                ResultKt.throwOnFailure(obj);
                x0X.n nVarT = qf.this.feedSerializer.t(this.f6509O.getFeed());
                String str = this.J2;
                if (!(nVarT instanceof n.C1266n)) {
                    if (nVarT instanceof n.w6) {
                        String str2 = (String) ((n.w6) nVarT).n();
                        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                        jVar.setLastSerializedFeed(str2);
                        if (str == null) {
                            str = "";
                        }
                        jVar.setLastFeedHash(str);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class qz implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f6512n;

        public qz(Moshi moshi) {
            this.f6512n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f6512n, Reflection.typeOf(Feed.class));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ FeedAction f6513O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6514n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(FeedAction feedAction, Continuation continuation) {
            super(2, continuation);
            this.f6513O = feedAction;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String O(Map map, FeedAction feedAction) {
            String string;
            String str = (String) map.get("android_id");
            return (str == null || (string = Uri.parse(feedAction.getTarget()).buildUpon().appendQueryParameter("uid", str).build().toString()) == null) ? feedAction.getTarget() : string;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return qf.this.new w6(this.f6513O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6514n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC1335n interfaceC1335nGR = qf.this.GR();
                this.f6514n = 1;
                obj = AbstractC2412j.n(interfaceC1335nGR, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            final Map map = (Map) obj;
            final FeedAction feedAction = this.f6513O;
            String str = (String) x0X.w6.nr(x0X.w6.n(new Function0() { // from class: M.Ln
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qf.w6.O(map, feedAction);
                }
            }));
            if (str != null) {
                qf qfVar = qf.this;
                qfVar.Y().n(new j.c7r(str));
                Context contextRequireContext = qfVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                XoT.fuX.S(contextRequireContext, str);
            }
            return Unit.INSTANCE;
        }
    }

    public static void safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(Fragment p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[M.Wre.values().length];
            try {
                iArr[M.Wre.f6382O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FeedActionType.values().length];
            try {
                iArr2[FeedActionType.View.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[FeedActionType.Email.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FeedActionType.YouTube.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FeedActionType.Instagram.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FeedActionType.Twitter.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FeedActionType.SaveElement.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FeedActionType.youtubePlaylist.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[FeedActionType.youtubeChannelById.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[FeedActionType.youtubeChannelByName.ordinal()] = 9;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[FeedActionType.survey.ordinal()] = 10;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[FeedActionType.newFeaturePopup.ordinal()] = 11;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[FeedActionType.InAppNavigation.ordinal()] = 12;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[FeedActionType.none.ordinal()] = 13;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(qf qfVar, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RecyclerView.ViewHolder childViewHolder = qfVar.I().f9553t.getChildViewHolder(it);
        C1479w6.n nVar = childViewHolder instanceof C1479w6.n ? (C1479w6.n) childViewHolder : null;
        if (nVar != null) {
            nVar.ty();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ER() {
        return "getFeedContent: Loading feed from cache";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EWS() {
        return "HomeTab:refilterFeed";
    }

    private final void G7(String destination) {
        M3.j.n(M3.n.nr(new IllegalArgumentException("In app destination " + destination + " not implemented"), j.w6.J2, j.EnumC0949j.E2, null, null, 12, null), Y());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        new com.alightcreative.app.motion.activities.R6(contextRequireContext).mUb(2132019855).nr(2132019854).Uo(2132017378, new Function1() { // from class: M.SPz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qf.fcU((DialogInterface) obj);
            }
        }).gh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GD() {
        return "HomeTab:onPurchaseStateChanged";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HV(com.alightcreative.account.o oVar) {
        return "onPurchaseStateChanged: " + oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String How(x0X.n nVar) {
        return "FEED RESPONSE: " + nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nH I() {
        nH nHVar = this._binding;
        Intrinsics.checkNotNull(nHVar);
        return nHVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Jk(qf qfVar, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RecyclerView.ViewHolder childViewHolder = qfVar.I().f9553t.getChildViewHolder(it);
        C1479w6.n nVar = childViewHolder instanceof C1479w6.n ? (C1479w6.n) childViewHolder : null;
        if (nVar != null) {
            nVar.az();
        }
        return Unit.INSTANCE;
    }

    private final void Mx(nH binding, Context context, Throwable error) {
        String message;
        binding.nr.setVisibility(0);
        binding.f9553t.setVisibility(4);
        if (!XoT.fuX.Ik(context)) {
            binding.nr.setText(getString(2132019080));
            binding.f9551O.setVisibility(0);
        } else if (z().rl()) {
            TextView textView = binding.nr;
            if (error == null || (message = error.getMessage()) == null) {
                message = "Error parsing feed content";
            }
            textView.setText(message);
        } else {
            binding.nr.setText(getString(2132020116));
        }
        this.validFeedReceived = false;
        binding.J2.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Org(qf qfVar, final com.alightcreative.account.o purchaseState) {
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        XoT.C.Uo(qfVar, new Function0() { // from class: M.QJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qf.GD();
            }
        });
        com.alightcreative.account.o oVar = qfVar.purchaseState;
        qfVar.purchaseState = purchaseState;
        XoT.C.Uo(qfVar, new Function0() { // from class: M.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qf.HV(purchaseState);
            }
        });
        if (oVar.t() == purchaseState.t() && oVar.rl() == purchaseState.rl()) {
            return;
        }
        qfVar.Po6();
    }

    private final void Po6() {
        XoT.C.Uo(this, new Function0() { // from class: M.s4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qf.EWS();
            }
        });
        if (this.validFeedReceived && getView() != null) {
            long jAz = z().az();
            Long lN2 = this.purchaseState.n();
            final Long lValueOf = lN2 == null ? null : Long.valueOf(jAz - lN2.longValue());
            if (lValueOf != null) {
                XoT.C.Uo(this, new Function0() { // from class: M.UGc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qf.hRu(lValueOf);
                    }
                });
            }
            List list = this.currentFeedCards;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (hashSet.add(((FeedCard) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            I().f9553t.setAdapter(new C1479w6(z(), CollectionsKt.sortedWith(arrayList, new CN3()), new fuX(this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Rl() {
        return "HomeTab:onViewCreated";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object UhV(Continuation continuation) throws PackageManager.NameNotFoundException {
        aC aCVar;
        com.google.firebase.functions.n nVarT;
        Context context;
        qf qfVar;
        AppCompatImageView appCompatImageView;
        TextView textView;
        SwipeRefreshLayout swipeRefreshLayout;
        ProgressBar progressBar;
        nH nHVar;
        List<FeedCard> cards;
        qf qfVar2;
        nH nHVar2;
        x0X.n nVar;
        if (continuation instanceof aC) {
            aCVar = (aC) continuation;
            int i2 = aCVar.f6501Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aCVar.f6501Z = i2 - Integer.MIN_VALUE;
            } else {
                aCVar = new aC(continuation);
            }
        }
        Object objUo = aCVar.f6504r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aCVar.f6501Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            Context context2 = getContext();
            if (context2 == null) {
                return Unit.INSTANCE;
            }
            XoT.C.Uo(this, new Function0() { // from class: M.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qf.i();
                }
            });
            if (this.isRefreshing) {
                return Unit.INSTANCE;
            }
            this.isRefreshing = true;
            if (!(com.alightcreative.app.motion.persist.j.INSTANCE.getStagingFeed() && z().rl()) || IvA.n.rl().getUsingFirebaseEmulator()) {
                nVarT = com.google.firebase.functions.n.mUb.t();
            } else {
                com.google.firebase.Wre wreTy = com.google.firebase.Wre.ty("alt");
                Intrinsics.checkNotNullExpressionValue(wreTy, "getInstance(...)");
                nVarT = com.google.firebase.functions.n.mUb.nr(wreTy);
            }
            if (nVarT == null) {
                nVarT = com.google.firebase.functions.n.mUb.t();
            }
            wQ.QJ qj = new wQ.QJ("getFeedContent", new Dsr(nVarT.ck("getFeedContent"), "getFeedContent"));
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(IvA.n.rl().getPackageName(), 64);
            com.google.firebase.remoteconfig.j.az().Uo();
            String strIk = com.google.firebase.remoteconfig.j.az().Ik("feed_ab_tags");
            Intrinsics.checkNotNullExpressionValue(strIk, "getString(...)");
            List listSplit$default = StringsKt.split$default((CharSequence) strIk, new char[]{',', ' '}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                String string = StringsKt.trim((CharSequence) it.next()).toString();
                if (StringsKt.isBlank(string)) {
                    string = null;
                }
                if (string != null) {
                    arrayList.add(string);
                }
            }
            Set set = CollectionsKt.toSet(arrayList);
            String packageName = IvA.n.rl().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            String str = packageInfo.versionName;
            if (str == null) {
                str = "unknown";
            }
            String str2 = str;
            int i5 = packageInfo.versionCode;
            String PRODUCT = Build.PRODUCT;
            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            String str3 = Build.MANUFACTURER + " " + Build.MODEL;
            String strUo = HI0.afx.Uo(context2);
            String languageTag = context2.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
            Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
            String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
            int appDay = com.alightcreative.app.motion.persist.j.INSTANCE.getAppDay();
            Set setUo = z().Uo();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setUo, 10));
            Iterator it2 = setUo.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((kgE.K) it2.next()).J2());
            }
            Signature[] signatureArr = packageInfo.signatures;
            String strJoinToString$default = signatureArr != null ? ArraysKt.joinToString$default(signatureArr, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: M.qz
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qf.K((Signature) obj);
                }
            }, 30, (Object) null) : null;
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            FeedContentRequest feedContentRequest = new FeedContentRequest(AppLovinBridge.f61290h, packageName, str2, i5, PRODUCT, str3, strUo, languageTag, strValueOf, appDay, arrayList2, strJoinToString$default, (jVar.getFeedIgnorePubDate() && z().rl()) ? "ignorePublishDate" : "normal", jVar.getLastSeenProjectCount(), jVar.getLastSeenElementCount(), jVar.getProjectsExported(), IvA.n.rl().getApplicationContext().getPackageManager().getPackageInfo(IvA.n.rl().getApplicationContext().getPackageName(), 0).firstInstallTime, CollectionsKt.toList(set), jVar.getLastFeedHash());
            nH nHVar3 = this._binding;
            if (nHVar3 != null && (progressBar = nHVar3.rl) != null) {
                progressBar.setVisibility(4);
            }
            nH nHVar4 = this._binding;
            if (nHVar4 != null && (swipeRefreshLayout = nHVar4.J2) != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
            nH nHVar5 = this._binding;
            if (nHVar5 != null && (textView = nHVar5.nr) != null) {
                textView.setVisibility(4);
            }
            nH nHVar6 = this._binding;
            if (nHVar6 != null && (appCompatImageView = nHVar6.f9551O) != null) {
                appCompatImageView.setVisibility(4);
            }
            aCVar.f6502n = this;
            aCVar.f6505t = context2;
            aCVar.f6501Z = 1;
            Object objN = qj.n(feedContentRequest, aCVar);
            if (objN != coroutine_suspended) {
                context = context2;
                objUo = objN;
                qfVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qfVar = (qf) aCVar.J2;
            nHVar2 = (nH) aCVar.f6500O;
            context = (Context) aCVar.f6505t;
            qfVar2 = (qf) aCVar.f6502n;
            ResultKt.throwOnFailure(objUo);
            nVar = (x0X.n) objUo;
            if (!(nVar instanceof n.C1266n)) {
                qfVar2.Mx(nHVar2, context, (Throwable) ((n.C1266n) nVar).n());
                return Unit.INSTANCE;
            }
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            cards = ((Feed) ((n.w6) nVar).n()).getCards();
            nHVar = nHVar2;
            qfVar.currentFeedCards = cards;
            nHVar.f9553t.setVisibility(0);
            qfVar2.validFeedReceived = true;
            qfVar2.Po6();
            return Unit.INSTANCE;
        }
        context = (Context) aCVar.f6505t;
        qf qfVar3 = (qf) aCVar.f6502n;
        ResultKt.throwOnFailure(objUo);
        qfVar = qfVar3;
        final x0X.n nVar2 = (x0X.n) objUo;
        XoT.C.Uo(qfVar, new Function0() { // from class: M.Pl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qf.How(nVar2);
            }
        });
        XoT.C.Uo(qfVar, new Function0() { // from class: M.Xo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qf.tUK();
            }
        });
        qfVar.isRefreshing = false;
        nHVar = qfVar._binding;
        if (nHVar != null) {
            nHVar.J2.setRefreshing(false);
            nHVar.rl.setVisibility(4);
            FeedContentResponse feedContentResponse = (FeedContentResponse) x0X.w6.nr(nVar2);
            Throwable th = (Throwable) x0X.w6.rl(nVar2);
            if (feedContentResponse == null) {
                qfVar.Mx(nHVar, context, th);
            } else {
                String feedHash = feedContentResponse.getFeedHash();
                if (Intrinsics.areEqual(com.alightcreative.app.motion.persist.j.INSTANCE.getLastFeedHash(), feedHash)) {
                    XoT.C.Uo(qfVar, new Function0() { // from class: M.eO
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return qf.ER();
                        }
                    });
                    GJW.lej lejVarRl = GJW.OU.rl();
                    C c2 = qfVar.new C(null);
                    aCVar.f6502n = qfVar;
                    aCVar.f6505t = context;
                    aCVar.f6500O = nHVar;
                    aCVar.J2 = qfVar;
                    aCVar.f6501Z = 2;
                    objUo = GJW.Dsr.Uo(lejVarRl, c2, aCVar);
                    if (objUo != coroutine_suspended) {
                        qfVar2 = qfVar;
                        nHVar2 = nHVar;
                        nVar = (x0X.n) objUo;
                        if (!(nVar instanceof n.C1266n)) {
                        }
                    }
                    return coroutine_suspended;
                }
                XoT.C.Uo(qfVar, new Function0() { // from class: M.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qf.lLA();
                    }
                });
                GJW.C.nr(LifecycleOwnerKt.n(qfVar), GJW.OU.rl(), null, qfVar.new o(feedContentResponse, feedHash, null), 2, null);
                cards = feedContentResponse.getFeed().getCards();
                qfVar2 = qfVar;
                qfVar.currentFeedCards = cards;
                nHVar.f9553t.setVisibility(0);
                qfVar2.validFeedReceived = true;
                qfVar2.Po6();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eTf(qf qfVar, String projectPackageId, LM.aC projectImportResult) {
        Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
        Intrinsics.checkNotNullParameter(projectImportResult, "projectImportResult");
        KeyEventDispatcher.Component activity = qfVar.getActivity();
        Vi.CN3 cn3 = activity instanceof Vi.CN3 ? (Vi.CN3) activity : null;
        if (cn3 != null) {
            cn3.WPU(projectPackageId, projectImportResult);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String eWT() {
        return "HomeTab:onPause";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fcU(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i() {
        return "HomeTab:refreshFeed";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ijL(FeedCard card, FeedAction action) {
        String strName;
        String path;
        FragmentActivity activity;
        XoT.C.Uo(this, new Function0() { // from class: M.Q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qf.m();
            }
        });
        QmE.iF iFVarY = Y();
        Bundle bundle = new Bundle();
        bundle.putString("card", card.getId());
        bundle.putString("cta", action.getId());
        FeedActionType type = action.getType();
        if (type == null || (strName = type.name()) == null) {
            strName = "";
        }
        bundle.putString(FileUploadManager.f61572j, strName);
        bundle.putString("target", action.getTarget());
        Unit unit = Unit.INSTANCE;
        iFVarY.n(new j.fuX("feed_cta_click", bundle));
        FeedActionType type2 = action.getType();
        List listN = null;
        switch (type2 == null ? -1 : j.$EnumSwitchMapping$1[type2.ordinal()]) {
            case -1:
            case 13:
                Y().n(new j.c7r(action.getTarget()));
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                Y().n(new j.c7r(action.getTarget()));
                safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(this, new Intent("android.intent.action.VIEW", Uri.parse(action.getTarget())));
                return;
            case 2:
                Y().n(new j.c7r(action.getTarget()));
                List listSplit$default = StringsKt.split$default((CharSequence) (action.getTarget() + ";"), new String[]{";"}, false, 0, 6, (Object) null);
                GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new n((String) listSplit$default.get(0), (String) listSplit$default.get(1), null), 3, null);
                return;
            case 3:
                String str = "https://www.youtube.com/watch?v=" + action.getTarget();
                Y().n(new j.c7r(str));
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                XoT.fuX.S(contextRequireContext, str);
                return;
            case 4:
                Y().n(new j.c7r(action.getTarget()));
                FragmentActivity activity2 = getActivity();
                Intent intentN = activity2 != null ? QhI.n(activity2, action.getTarget()) : null;
                if (intentN != null) {
                    safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(this, intentN);
                    return;
                }
                return;
            case 5:
                String str2 = "https://twitter.com/" + action.getTarget();
                Y().n(new j.c7r(str2));
                safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(this, new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                return;
            case 6:
                Y().n(new j.c7r(action.getTarget()));
                Uri uri = Uri.parse(action.getTarget());
                String host = uri.getHost();
                if (((host == null || !StringsKt.endsWith$default(host, ".link", false, 2, (Object) null)) && ((path = uri.getPath()) == null || !StringsKt.startsWith$default(path, "/am/share/u/", false, 2, (Object) null))) || (activity = getActivity()) == null) {
                    return;
                }
                Intrinsics.checkNotNull(uri);
                nYs.j jVarInvoke = k().invoke();
                boolean z2 = jVarInvoke != null && jVarInvoke.X();
                nYs.j jVarInvoke2 = k().invoke();
                Fg.afx.E(activity, uri, z2, jVarInvoke2 != null && jVarInvoke2.te(), Y(), z(), Nxk(), null, piY(), k(), new Function2() { // from class: M.r
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qf.eTf(this.f6516n, (String) obj, (LM.aC) obj2);
                    }
                }, 64, null);
                return;
            case 7:
                String str3 = "https://www.youtube.com/playlist?list=" + action.getTarget();
                Y().n(new j.c7r(str3));
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                XoT.fuX.S(contextRequireContext2, str3);
                return;
            case 8:
                String str4 = "https://www.youtube.com/channel/" + action.getTarget();
                Y().n(new j.c7r(str4));
                Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                XoT.fuX.S(contextRequireContext3, str4);
                return;
            case 9:
                String str5 = "https://www.youtube.com/c/" + action.getTarget();
                Y().n(new j.c7r(str5));
                Context contextRequireContext4 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                XoT.fuX.S(contextRequireContext4, str5);
                return;
            case 10:
                Lifecycle lifecycleRegistry = getLifecycleRegistry();
                Intrinsics.checkNotNullExpressionValue(lifecycleRegistry, SzFNXybiSxdx.HAXzDm);
                GJW.C.nr(LifecycleKt.n(lifecycleRegistry), null, null, new w6(action, null), 3, null);
                return;
            case 11:
                Y().n(new j.c7r(""));
                TX.w6 w6VarN = TX.w6.f10513n.n(action.getTarget());
                if (w6VarN != null) {
                    Context contextRequireContext5 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
                    listN = TX.Ml.n(w6VarN, contextRequireContext5, k());
                }
                if (listN != null) {
                    Pair[] pairArr = {TuplesKt.to("NEW_FEATURE_INFO_LIST_KEY", listN)};
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, 1);
                    Intent intent = new Intent(fragmentActivityRequireActivity, (Class<?>) NewFeaturePagerActivity.class);
                    intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
                    safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(this, intent);
                    return;
                }
                return;
            case 12:
                Y().n(new j.c7r(action.getTarget()));
                M.Wre wreN = M.Wre.f6384t.n(action.getTarget());
                int i2 = wreN == null ? -1 : j.$EnumSwitchMapping$0[wreN.ordinal()];
                if (i2 == -1) {
                    G7(action.getTarget());
                    return;
                }
                if (i2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                Pair[] pairArr3 = (Pair[]) Arrays.copyOf(new Pair[0], 0);
                Intent intent2 = new Intent(fragmentActivityRequireActivity2, (Class<?>) MyAccountActivity.class);
                intent2.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr3, pairArr3.length)));
                safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(this, intent2);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lLA() {
        return "getFeedContent: Absent or outdated feed cache";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m() {
        return "HomeTab:handleCtaClick";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mYa() {
        return "HomeTab:OnRefreshListener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n1() {
        return "HomeTab:onResume";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ofS() {
        return "HomeTab:onDestroyView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pJg(qf qfVar, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RecyclerView.ViewHolder childViewHolder = qfVar.I().f9553t.getChildViewHolder(it);
        C1479w6.n nVar = childViewHolder instanceof C1479w6.n ? (C1479w6.n) childViewHolder : null;
        if (nVar != null) {
            nVar.gh();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qm(qf qfVar) {
        XoT.C.Uo(qfVar, new Function0() { // from class: M.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qf.mYa();
            }
        });
        GJW.C.nr(LifecycleOwnerKt.n(qfVar), null, null, qfVar.new Wre(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tUK() {
        return "HomeTab:requestListener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ul(qf qfVar, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RecyclerView.ViewHolder childViewHolder = qfVar.I().f9553t.getChildViewHolder(it);
        C1479w6.n nVar = childViewHolder instanceof C1479w6.n ? (C1479w6.n) childViewHolder : null;
        if (nVar != null) {
            nVar.qie();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xg() {
        return "HomeTab:onDestroy";
    }

    public final InterfaceC1335n GR() {
        InterfaceC1335n interfaceC1335n = this.concierge;
        if (interfaceC1335n != null) {
            return interfaceC1335n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("concierge");
        return null;
    }

    public final xAo.I28 Nxk() {
        xAo.I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    @Override // KC.g9s
    public void Uo() {
        RecyclerView recyclerView;
        nH nHVar = this._binding;
        if (nHVar == null || (recyclerView = nHVar.f9553t) == null) {
            return;
        }
        KeyEventDispatcher.Component activity = getActivity();
        KC.rrk rrkVar = activity instanceof KC.rrk ? (KC.rrk) activity : null;
        if (rrkVar != null) {
            rrkVar.XQ(recyclerView.computeVerticalScrollOffset());
        }
    }

    public final QmE.iF Y() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final InterfaceC2413n dR0() {
        InterfaceC2413n interfaceC2413n = this.getMonorepoLibUseCase;
        if (interfaceC2413n != null) {
            return interfaceC2413n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getMonorepoLibUseCase");
        return null;
    }

    public final nYs.Ml k() {
        nYs.Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = nH.t(inflater, container, false);
        ConstraintLayout constraintLayoutRl = I().getRoot();
        constraintLayoutRl.setTag("amHomeTab");
        Intrinsics.checkNotNullExpressionValue(constraintLayoutRl, "also(...)");
        return constraintLayoutRl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        XoT.C.Uo(this, new Function0() { // from class: M.nKK
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qf.Rl();
            }
        });
        I().f9553t.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        if (Build.VERSION.SDK_INT >= 26) {
            I().f9553t.setFocusable(0);
        }
        I().f9553t.addOnScrollListener(new Ml());
        GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new I28(null), 3, null);
        I().J2.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: M.DAz
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void n() {
                qf.qm(this.f6263n);
            }
        });
    }

    public final InterfaceC2210n piY() {
        InterfaceC2210n interfaceC2210n = this.injet;
        if (interfaceC2210n != null) {
            return interfaceC2210n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injet");
        return null;
    }

    public final kgE.fuX z() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence K(Signature signature) {
        byte[] byteArray = signature.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        byte[] bArrTy = HI0.gnv.ty(byteArray);
        Intrinsics.checkNotNullExpressionValue(bArrTy, "sha1(...)");
        return StringsKt.substring(HI0.gnv.o(bArrTy), new IntRange(0, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hRu(Long l2) {
        return "AccountAge: " + (l2.longValue() / ((long) BrandSafetyUtils.f61441g)) + " days";
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        XoT.C.Uo(this, new Function0() { // from class: M.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qf.xg();
            }
        });
        if (this._binding == null) {
            return;
        }
        RecyclerView feedCardList = I().f9553t;
        Intrinsics.checkNotNullExpressionValue(feedCardList, "feedCardList");
        HI0.o7q.t(feedCardList, new Function1() { // from class: M.aC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qf.pJg(this.f6388n, (View) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        XoT.C.Uo(this, new Function0() { // from class: M.l3D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qf.ofS();
            }
        });
        if (this._binding == null) {
            return;
        }
        RecyclerView feedCardList = I().f9553t;
        Intrinsics.checkNotNullExpressionValue(feedCardList, "feedCardList");
        HI0.o7q.t(feedCardList, new Function1() { // from class: M.ci
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qf.C(this.f6395n, (View) obj);
            }
        });
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        XoT.C.Uo(this, new Function0() { // from class: M.g9s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qf.eWT();
            }
        });
        if (this._binding == null) {
            return;
        }
        kgE.Sis.ty(this.purchaseStateObserver);
        RecyclerView feedCardList = I().f9553t;
        Intrinsics.checkNotNullExpressionValue(feedCardList, "feedCardList");
        HI0.o7q.t(feedCardList, new Function1() { // from class: M.afx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qf.ul(this.f6389n, (View) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        XoT.C.Uo(this, new Function0() { // from class: M.Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qf.n1();
            }
        });
        if (this._binding == null) {
            return;
        }
        kgE.Sis.gh(this.purchaseStateObserver);
        RecyclerView feedCardList = I().f9553t;
        Intrinsics.checkNotNullExpressionValue(feedCardList, "feedCardList");
        HI0.o7q.t(feedCardList, new Function1() { // from class: M.Ew
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qf.Jk(this.f6265n, (View) obj);
            }
        });
    }
}
