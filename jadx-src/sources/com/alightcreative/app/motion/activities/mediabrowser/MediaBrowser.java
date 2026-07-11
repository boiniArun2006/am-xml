package com.alightcreative.app.motion.activities.mediabrowser;

import CHm.j;
import D5a.M5;
import D5a.O;
import D5a.fg;
import HI0.Q;
import HI0.Zs;
import HI0.afx;
import HI0.l4Z;
import HI0.o7q;
import QmE.iF;
import QmE.j;
import SJ0.r;
import aO.z;
import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import android.widget.AdapterView;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.SeekParameters;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.I7a;
import com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser;
import com.alightcreative.app.motion.activities.mediabrowser.n;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.widget.ThumbnailView;
import com.caoccao.javet.exceptions.JavetError;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import tu.Ew;
import tu.SPz;
import tu.Z;
import tu.ci;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\b\b*\u0002\u0081\u0001\b\u0007\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u0002:\u0004\u0086\u0001\u0087\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J!\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0003¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010\u0013J6\u0010+\u001a\u00020\u000e*\u00020%2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u000e0&H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010-H\u0015¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0017¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\u000eH\u0014¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\u000eH\u0014¢\u0006\u0004\b3\u0010\u0004J/\u0010:\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u00052\u000e\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u000206052\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J/\u0010A\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0011H\u0016¢\u0006\u0004\bA\u0010BJ)\u0010F\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\b\u0010E\u001a\u0004\u0018\u00010DH\u0015¢\u0006\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010R\u001a\u00020L8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0016\u0010b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010aR\u0018\u0010f\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010\\R\u0016\u0010h\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010aR\u0016\u0010j\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010aR\u0016\u0010l\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010aR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00160m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010r\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010TR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR3\u0010\u0080\u0001\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160}\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160m0|0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001a\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/alightcreative/app/motion/activities/mediabrowser/MediaBrowser;", "Landroidx/appcompat/app/AppCompatActivity;", "LD5a/M5;", "<init>", "()V", "", "step", "iV", "(I)I", "fps", "Zmq", "X4T", "Lcom/alightcreative/app/motion/activities/mediabrowser/MediaBrowser$j;", "mode", "", "HBN", "(Lcom/alightcreative/app/motion/activities/mediabrowser/MediaBrowser$j;)V", "", "uG", "()Z", "uQ", "UF", "Ltu/Z;", "info", "isMultiMode", "I4p", "(Ltu/Z;Z)V", JavetError.PARAMETER_COUNT, "bZm", "(Ljava/lang/Integer;)V", "media", "rxp", "(Ltu/Z;)V", "mx", "eo", "wKY", "EF", "Landroid/animation/Animator;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "cancelled", FileUploadManager.f61572j, "vl", "(Landroid/animation/Animator;Lkotlin/jvm/functions/Function1;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "onPause", "onResume", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "diff", "endDrag", "scrollDown", "fling", "o", "(FZZZ)V", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "LSJ0/r;", "r", "LSJ0/r;", "binding", "LQmE/iF;", "LQmE/iF;", "JVN", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "Z", "LkgE/fuX;", "xVH", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "S", "Ljava/lang/String;", "bucketId", "g", "bucketName", "E2", "I", "mediaRecyclerHeight", "e", "projectFPS", "X", "projectId", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "fpsDurationPoint", "N", "linkImageFrame", "v", "unlinkImageFrame", "", "Xw", "Ljava/util/List;", "albumList", "jB", "isMediaFillMode", "Landroid/os/Handler;", "U", "Landroid/os/Handler;", "handler", "Landroidx/media3/exoplayer/ExoPlayer;", "P5", "Landroidx/media3/exoplayer/ExoPlayer;", "player", "LHI0/l4Z;", "Lkotlin/Pair;", "", "M7", "LHI0/l4Z;", "mediaListLoader", "com/alightcreative/app/motion/activities/mediabrowser/MediaBrowser$Xo", "p5", "Lcom/alightcreative/app/motion/activities/mediabrowser/MediaBrowser$Xo;", "updateVideoSeek", "eF", "j", c.f62177j, "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaBrowser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaBrowser.kt\ncom/alightcreative/app/motion/activities/mediabrowser/MediaBrowser\n+ 2 ViewUtils.kt\ncom/alightcreative/ext/ViewUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,902:1\n109#2,11:903\n109#2,11:914\n1#3:925\n161#4,8:926\n1544#5:934\n774#5:942\n865#5,2:943\n1755#5,3:945\n53#6:935\n80#6,6:936\n*S KotlinDebug\n*F\n+ 1 MediaBrowser.kt\ncom/alightcreative/app/motion/activities/mediabrowser/MediaBrowser\n*L\n193#1:903,11\n278#1:914,11\n121#1:926,8\n416#1:934\n430#1:942\n430#1:943,2\n485#1:945,3\n417#1:935\n417#1:936,6\n*E\n"})
public final class MediaBrowser extends com.alightcreative.app.motion.activities.mediabrowser.j implements M5 {

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private static WeakReference f45492FX;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private int mediaRecyclerHeight;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final l4Z mediaListLoader;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private int linkImageFrame;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private ExoPlayer player;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private String bucketId;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private int fpsDurationPoint;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private String projectId;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private List albumList;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int projectFPS;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String bucketName;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean isMediaFillMode;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public iF eventLogger;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private Xo updateVideoSeek;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private r binding;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int unlinkImageFrame;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f45491E = 8;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final ExecutorService f45493M = Executors.newSingleThreadExecutor();

    public static final class C implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f45505n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MediaBrowser f45506t;

        public C(View view, MediaBrowser mediaBrowser) {
            this.f45505n = view;
            this.f45506t = mediaBrowser;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f45505n.getMeasuredWidth() <= 0 || this.f45505n.getMeasuredHeight() <= 0) {
                return;
            }
            this.f45505n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ThumbnailView thumbnailView = (ThumbnailView) this.f45505n;
            r rVar = this.f45506t.binding;
            if (rVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar = null;
            }
            rVar.rV9.az(thumbnailView.getWidth(), thumbnailView.getHeight());
        }
    }

    /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function2 {
        CN3(Object obj) {
            super(2, obj, MediaBrowser.class, "updateMultiMode", "updateMultiMode(Lcom/alightcreative/mediacore/mediainfo/MediaSummaryInfo;Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Z) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void n(Z z2, boolean z3) {
            ((MediaBrowser) this.receiver).I4p(z2, z3);
        }
    }

    public static final class Dsr implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f45507n;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        Dsr(Function1 function1) {
            this.f45507n = function1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f45507n.invoke(Boolean.TRUE);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f45507n.invoke(Boolean.FALSE);
        }
    }

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function2 {
        I28(Object obj) {
            super(2, obj, MediaBrowser.class, "updateMultiMode", "updateMultiMode(Lcom/alightcreative/mediacore/mediainfo/MediaSummaryInfo;Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Z) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void n(Z z2, boolean z3) {
            ((MediaBrowser) this.receiver).I4p(z2, z3);
        }
    }

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function1 {
        Ml(Object obj) {
            super(1, obj, MediaBrowser.class, "onMediaSelected", "onMediaSelected(Lcom/alightcreative/mediacore/mediainfo/MediaSummaryInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Z) obj);
            return Unit.INSTANCE;
        }

        public final void n(Z p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MediaBrowser) this.receiver).rxp(p0);
        }
    }

    public static final class Pl implements Player.Listener {
        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i2) {
            if (i2 == 3) {
                r rVar = MediaBrowser.this.binding;
                if (rVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar = null;
                }
                rVar.E2.setVisibility(0);
            }
        }

        Pl() {
        }
    }

    /* synthetic */ class Wre extends FunctionReferenceImpl implements Function1 {
        Wre(Object obj) {
            super(1, obj, MediaBrowser.class, "onMediaSelected", "onMediaSelected(Lcom/alightcreative/mediacore/mediainfo/MediaSummaryInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Z) obj);
            return Unit.INSTANCE;
        }

        public final void n(Z p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MediaBrowser) this.receiver).rxp(p0);
        }
    }

    public static final class Xo implements Runnable {
        Xo() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExoPlayer exoPlayer = MediaBrowser.this.player;
            if (exoPlayer != null) {
                long currentPosition = exoPlayer.getCurrentPosition();
                r rVar = MediaBrowser.this.binding;
                r rVar2 = null;
                if (rVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar = null;
                }
                rVar.rV9.qie(currentPosition);
                r rVar3 = MediaBrowser.this.binding;
                if (rVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar2 = rVar3;
                }
                rVar2.rV9.invalidate();
                MediaBrowser.this.handler.postDelayed(this, 100L);
            }
        }
    }

    public static final class aC implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f45510n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MediaBrowser f45511t;

        public aC(View view, MediaBrowser mediaBrowser) {
            this.f45510n = view;
            this.f45511t = mediaBrowser;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f45510n.getMeasuredWidth() <= 0 || this.f45510n.getMeasuredHeight() <= 0) {
                return;
            }
            this.f45510n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            RecyclerView recyclerView = (RecyclerView) this.f45510n;
            this.f45511t.mediaRecyclerHeight = recyclerView.getHeight();
        }
    }

    public static final class fuX implements Grouping {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Iterable f45512n;

        public fuX(Iterable iterable) {
            this.f45512n = iterable;
        }

        @Override // kotlin.collections.Grouping
        public Object keyOf(Object obj) {
            return ((Z) obj).KN();
        }

        @Override // kotlin.collections.Grouping
        public Iterator sourceIterator() {
            return this.f45512n.iterator();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ j[] f45513O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f45514n = new j("ByStart", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f45515t = new j("ByOrder", 1);

        private static final /* synthetic */ j[] n() {
            return new j[]{f45514n, f45515t};
        }

        static {
            j[] jVarArrN = n();
            f45513O = jVarArrN;
            J2 = EnumEntriesKt.enumEntries(jVarArrN);
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f45513O.clone();
        }

        private j(String str, int i2) {
        }
    }

    /* synthetic */ class o extends FunctionReferenceImpl implements Function1 {
        o(Object obj) {
            super(1, obj, MediaBrowser.class, "onMediaSelected", "onMediaSelected(Lcom/alightcreative/mediacore/mediainfo/MediaSummaryInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Z) obj);
            return Unit.INSTANCE;
        }

        public final void n(Z p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MediaBrowser) this.receiver).rxp(p0);
        }
    }

    /* synthetic */ class qz extends FunctionReferenceImpl implements Function0 {
        qz(Object obj) {
            super(0, obj, ListPopupWindow.class, "dismiss", "dismiss()V", 0);
        }

        public final void n() {
            ((ListPopupWindow) this.receiver).dismiss();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Ew.values().length];
            try {
                iArr[Ew.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ew.f73884r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ew.f73880Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I9f(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LPV(MediaBrowser mediaBrowser, View view) {
        r rVar = null;
        mediaBrowser.I4p(null, false);
        r rVar2 = mediaBrowser.binding;
        if (rVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar2 = null;
        }
        RecyclerView.Adapter adapter = rVar2.ViF.getAdapter();
        n nVar = adapter instanceof n ? (n) adapter : null;
        if (nVar == null) {
            return;
        }
        r rVar3 = mediaBrowser.binding;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar = rVar3;
        }
        rVar.ViF.smoothScrollToPosition(nVar.HI());
    }

    private final int X4T(int fps) {
        return (int) ((fps / this.projectFPS) * 1000.0f);
    }

    private final void bZm(Integer count) {
        r rVar = null;
        if (count == null && uG()) {
            I4p(null, false);
        }
        if (uG()) {
            r rVar2 = this.binding;
            if (rVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rVar = rVar2;
            }
            rVar.te.setText(getResources().getQuantityString(2131886120, count != null ? count.intValue() : 0, Integer.valueOf(count != null ? count.intValue() : 0)));
            return;
        }
        r rVar3 = this.binding;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar = rVar3;
        }
        AppCompatTextView appCompatTextView = rVar.J2;
        String str = this.bucketName;
        appCompatTextView.setText((str == null || StringsKt.isBlank(str)) ? getResources().getString(2132017237) : this.bucketName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waP(MediaBrowser mediaBrowser, View view) {
        mediaBrowser.I4p(null, true);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String stringExtra;
        if (requestCode != 2) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode == -1) {
            Ew ew = null;
            Uri uri = data != null ? (Uri) data.getParcelableExtra("selectedUri") : null;
            if (data != null && (stringExtra = data.getStringExtra("mediaType")) != null) {
                ew = (Ew) HI0.Ew.n(Ew.values(), stringExtra);
            }
            if (uri == null || ew == null) {
                return;
            }
            setResult(-1, new Intent().putExtra("selectedUri", uri).putExtra("mediaType", ew.name()));
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Aum(MediaBrowser mediaBrowser, ListPopupWindow listPopupWindow, AdapterView adapterView, View view, int i2, long j2) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        if (!mediaBrowser.albumList.isEmpty()) {
            mediaBrowser.rxp((Z) mediaBrowser.albumList.get(i2));
        }
        listPopupWindow.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D76(final MediaBrowser mediaBrowser, View view) {
        HI0.Ml.ty(mediaBrowser, j.Ml.KN, 0, null, new Function0() { // from class: D5a.M
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBrowser.NP(this.f1316n);
            }
        }, 6, null);
    }

    private final boolean EF() {
        r rVar = this.binding;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        return rVar.ViF.getHeight() != this.mediaRecyclerHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EN(MediaBrowser mediaBrowser, n nVar, Z z2, long j2, long j3) {
        mediaBrowser.handler.removeCallbacks(mediaBrowser.updateVideoSeek);
        if (j2 == 0 && j3 == 0) {
            nVar.S().remove(z2.nY());
        } else {
            nVar.S().put(z2.nY(), new Pair(Long.valueOf(j2), Long.valueOf(j3)));
        }
        nVar.notifyItemChanged(nVar.HI());
        return Unit.INSTANCE;
    }

    private static final void Fp(MediaBrowser mediaBrowser, n nVar, Z z2, Ref.LongRef longRef) {
        ExoPlayer exoPlayer = mediaBrowser.player;
        r rVar = null;
        Long lValueOf = exoPlayer != null ? Long.valueOf(exoPlayer.getCurrentPosition()) : null;
        Pair pair = (Pair) nVar.S().get(z2.nY());
        if (pair == null) {
            if (lValueOf == null || lValueOf.longValue() < z2.ck()) {
                return;
            }
            long jCk = z2.ck();
            longRef.element = jCk;
            ExoPlayer exoPlayer2 = mediaBrowser.player;
            if (exoPlayer2 != null) {
                exoPlayer2.seekTo(jCk);
            }
            r rVar2 = mediaBrowser.binding;
            if (rVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar2 = null;
            }
            rVar2.rV9.qie(longRef.element);
            r rVar3 = mediaBrowser.binding;
            if (rVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rVar = rVar3;
            }
            rVar.rV9.invalidate();
            return;
        }
        long jLongValue = ((Number) pair.component1()).longValue();
        long jLongValue2 = ((Number) pair.component2()).longValue();
        if (lValueOf == null || lValueOf.longValue() < z2.ck() - jLongValue2) {
            return;
        }
        longRef.element = jLongValue;
        ExoPlayer exoPlayer3 = mediaBrowser.player;
        if (exoPlayer3 != null) {
            exoPlayer3.seekTo(jLongValue);
        }
        r rVar4 = mediaBrowser.binding;
        if (rVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar4 = null;
        }
        rVar4.rV9.qie(longRef.element);
        r rVar5 = mediaBrowser.binding;
        if (rVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar = rVar5;
        }
        rVar.rV9.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(MediaBrowser mediaBrowser, View view) {
        mediaBrowser.HBN(j.f45515t);
    }

    private final void HBN(j mode) {
        r rVar = this.binding;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        RecyclerView.Adapter adapter = rVar.ViF.getAdapter();
        n nVar = adapter instanceof n ? (n) adapter : null;
        if (nVar != null && nVar.XQ().size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = nVar.XQ().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                Z z2 = (Z) next;
                int i5 = w6.$EnumSwitchMapping$0[z2.ViF().ordinal()];
                if (i5 == 1) {
                    Integer num = (Integer) nVar.WPU().get(z2.nY());
                    arrayList.add(new AddVisualMediaInfo(z2.nY(), z2.ViF().name(), X4T(num != null ? num.intValue() : this.linkImageFrame), 0L, 0L, 24, null));
                    i2++;
                } else if (i5 == 2) {
                    Pair pair = (Pair) nVar.S().get(z2.nY());
                    arrayList.add(new AddVisualMediaInfo(z2.nY(), z2.ViF().name(), (int) (pair != null ? (z2.ck() - ((Number) pair.getFirst()).longValue()) - ((Number) pair.getSecond()).longValue() : z2.ck()), pair != null ? ((Number) pair.getFirst()).longValue() : 0L, pair != null ? ((Number) pair.getSecond()).longValue() : 0L));
                    i3++;
                }
            }
            iF iFVarJVN = JVN();
            Bundle bundle = new Bundle();
            bundle.putString("type", mode == j.f45514n ? "concurrent" : "sequence");
            bundle.putInt("image_count", i2);
            bundle.putInt("video_count", i3);
            Unit unit = Unit.INSTANCE;
            iFVarJVN.n(new j.fuX("add_media", bundle));
            Intent intent = new Intent();
            intent.putExtra("AddMediaList", arrayList);
            intent.putExtra("MultiMode", mode.name());
            setResult(-1, intent);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I4p(Z info, boolean isMultiMode) {
        r rVar = this.binding;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        rVar.iF.setVisibility(isMultiMode ? 0 : 8);
        r rVar2 = this.binding;
        if (rVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar2 = null;
        }
        rVar2.ck.setVisibility(isMultiMode ? 0 : 4);
        r rVar3 = this.binding;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar3 = null;
        }
        RecyclerView.Adapter adapter = rVar3.ViF.getAdapter();
        n nVar = adapter instanceof n ? (n) adapter : null;
        if (nVar == null) {
            return;
        }
        r rVar4 = this.binding;
        if (rVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar4 = null;
        }
        RecyclerView.LayoutManager layoutManager = rVar4.ViF.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int iLu = ((GridLayoutManager) layoutManager).Lu();
        r rVar5 = this.binding;
        if (rVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar5 = null;
        }
        RecyclerView.LayoutManager layoutManager2 = rVar5.ViF.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int iFW = ((GridLayoutManager) layoutManager2).fW();
        nVar.fD(isMultiMode);
        if (iLu >= 4) {
            iLu -= 4;
        }
        if (iFW < nVar.r().size() - 4) {
            iFW += 4;
        }
        if (iLu <= iFW) {
            while (true) {
                Z zCk = nVar.ck(iLu);
                r rVar6 = this.binding;
                if (rVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar6 = null;
                }
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = rVar6.ViF.findViewHolderForAdapterPosition(iLu);
                if (viewHolderFindViewHolderForAdapterPosition == null) {
                    nVar.notifyItemChanged(iLu);
                } else {
                    nVar.e(((n.j) viewHolderFindViewHolderForAdapterPosition).HI(), iLu, zCk);
                }
                if (iLu == iFW) {
                    break;
                } else {
                    iLu++;
                }
            }
        }
        bZm(Integer.valueOf(nVar.XQ().size()));
        if (info != null) {
            rxp(info);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Mh() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QgZ(MediaBrowser mediaBrowser, View view) {
        r rVar = mediaBrowser.binding;
        AddVisualMediaInfo addVisualMediaInfo = null;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        RecyclerView.Adapter adapter = rVar.ViF.getAdapter();
        n nVar = adapter instanceof n ? (n) adapter : null;
        if (nVar != null && nVar.XQ().size() > 0) {
            if (!mediaBrowser.uG()) {
                if (nVar.XQ().size() == 1) {
                    Z z2 = (Z) CollectionsKt.first((List) nVar.XQ());
                    Pair pair = (Pair) nVar.S().get(z2.nY());
                    int i2 = w6.$EnumSwitchMapping$0[z2.ViF().ordinal()];
                    if (i2 == 1) {
                        addVisualMediaInfo = new AddVisualMediaInfo(z2.nY(), z2.ViF().name(), mediaBrowser.X4T(mediaBrowser.linkImageFrame), 0L, 0L, 24, null);
                    } else if (i2 == 2) {
                        addVisualMediaInfo = new AddVisualMediaInfo(z2.nY(), z2.ViF().name(), (int) z2.ck(), pair != null ? ((Number) pair.getFirst()).longValue() : 0L, pair != null ? ((Number) pair.getSecond()).longValue() : 0L);
                    }
                    if (addVisualMediaInfo != null) {
                        mediaBrowser.setResult(-1, new Intent().putExtra("selectedUri", z2.nY()).putExtra("mediaType", z2.ViF().name()).putExtra("AddSingleMedia", addVisualMediaInfo));
                    }
                    iF iFVarJVN = mediaBrowser.JVN();
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "single");
                    bundle.putInt("image_count", z2.ViF() == Ew.J2 ? 1 : 0);
                    bundle.putInt("video_count", z2.ViF() != Ew.f73884r ? 0 : 1);
                    Unit unit = Unit.INSTANCE;
                    iFVarJVN.n(new j.fuX("add_media", bundle));
                }
            }
            mediaBrowser.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ro(MediaBrowser mediaBrowser) {
        mediaBrowser.handler.removeCallbacks(mediaBrowser.updateVideoSeek);
        mediaBrowser.eo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Th(final MediaBrowser mediaBrowser, View view) {
        HI0.Ml.ty(mediaBrowser, j.Ml.KN, 0, null, new Function0() { // from class: D5a.vd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBrowser.xzo(this.f1393n);
            }
        }, 6, null);
    }

    private final boolean UF() {
        String str;
        return Intrinsics.areEqual("All", this.bucketId) || (str = this.bucketId) == null || StringsKt.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair Vvq(MediaBrowser mediaBrowser) {
        List list;
        List arrayList;
        List listEmptyList;
        Z zRl;
        if (!XoT.fuX.ck(mediaBrowser)) {
            return new Pair(CollectionsKt.emptyList(), new ArrayList());
        }
        List listRl = O.rl(ci.xMQ(mediaBrowser, Ew.f73882n.rl(), null, 4, null), mediaBrowser.xVH());
        Z z2 = (Z) CollectionsKt.firstOrNull(listRl);
        if (z2 != null) {
            fuX fux = new fuX(listRl);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator itSourceIterator = fux.sourceIterator();
            while (true) {
                boolean z3 = false;
                if (!itSourceIterator.hasNext()) {
                    break;
                }
                Object next = itSourceIterator.next();
                Object objKeyOf = fux.keyOf(next);
                Object obj = linkedHashMap.get(objKeyOf);
                if (obj == null && !linkedHashMap.containsKey(objKeyOf)) {
                    z3 = true;
                }
                Z z4 = (Z) next;
                Z z5 = (Z) obj;
                if (z3) {
                    zRl = Z.rl(z4, null, Ew.f73880Z, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217533, null);
                } else {
                    Intrinsics.checkNotNull(z5);
                    zRl = Z.rl(z5, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, z5.xMQ() + 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217535, null);
                }
                linkedHashMap.put(objKeyOf, zRl);
            }
            List mutableList = CollectionsKt.toMutableList(linkedHashMap.values());
            list = listRl;
            mutableList.add(0, Z.rl(z2, null, Ew.f73880Z, 0L, null, null, null, null, null, 0L, null, null, null, mediaBrowser.getResources().getString(2132017237), "All", 0, 0, 0, 0L, 0L, listRl.size() + 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073205245, null));
            arrayList = mutableList;
        } else {
            list = listRl;
            arrayList = new ArrayList();
        }
        String str = mediaBrowser.bucketId;
        if (str == null || StringsKt.isBlank(str)) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            for (Object obj2 : list) {
                if (Intrinsics.areEqual(((Z) obj2).KN(), mediaBrowser.bucketId)) {
                    listEmptyList.add(obj2);
                }
            }
        }
        String str2 = mediaBrowser.bucketId;
        if (str2 != null && !StringsKt.isBlank(str2) && listEmptyList.isEmpty()) {
            mediaBrowser.bucketId = "All";
            mediaBrowser.bucketName = mediaBrowser.getResources().getString(2132017237);
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar.setMediaBucketID("All");
            jVar.setMediaBucketName(mediaBrowser.getResources().getString(2132017237));
        }
        return mediaBrowser.UF() ? new Pair(list, arrayList) : new Pair(listEmptyList, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XNZ(MediaBrowser mediaBrowser, View view) {
        r rVar = mediaBrowser.binding;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        RecyclerView.Adapter adapter = rVar.ViF.getAdapter();
        n nVar = adapter instanceof n ? (n) adapter : null;
        if (nVar == null) {
            return;
        }
        nVar.HI();
        SPz sPzTe = tu.r.te(new Q(mediaBrowser), nVar.ck(nVar.HI()).nY(), false, 4, null);
        tu.aC aCVar = sPzTe instanceof tu.aC ? (tu.aC) sPzTe : null;
        if (aCVar == null) {
            return;
        }
        LayoutInflater layoutInflater = mediaBrowser.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        afx.nY(mediaBrowser, aCVar, layoutInflater);
    }

    private final int Zmq(int fps) {
        int i2 = this.fpsDurationPoint;
        return fps <= i2 ? fps : i2 + ((fps - i2) / this.projectFPS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zn(MediaBrowser mediaBrowser, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        r rVar = mediaBrowser.binding;
        r rVar2 = null;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        ViewGroup.LayoutParams layoutParams = rVar.ViF.getLayoutParams();
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        r rVar3 = mediaBrowser.binding;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar2 = rVar3;
        }
        rVar2.ViF.requestLayout();
    }

    private final void eo() {
        r rVar = this.binding;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        rVar.nHg.onPause();
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
        r rVar2 = this.binding;
        if (rVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar2 = null;
        }
        rVar2.E2.setImageDrawable(getResources().getDrawable(2131231880, getTheme()));
        r rVar3 = this.binding;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar3 = null;
        }
        rVar3.E2.setVisibility(0);
        r rVar4 = this.binding;
        if (rVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar4 = null;
        }
        rVar4.WPU.setVisibility(0);
        f45492FX = null;
        this.handler.removeCallbacks(this.updateVideoSeek);
    }

    private final int iV(int step) {
        int i2 = this.fpsDurationPoint;
        return step <= i2 ? step : i2 + ((step - i2) * this.projectFPS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(MediaBrowser mediaBrowser, View view) {
        mediaBrowser.HBN(j.f45514n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jO(MediaBrowser mediaBrowser) {
        r rVar = mediaBrowser.binding;
        r rVar2 = null;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        if (rVar.ck.isActivated()) {
            r rVar3 = mediaBrowser.binding;
            if (rVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar3 = null;
            }
            RecyclerView.Adapter adapter = rVar3.ViF.getAdapter();
            n nVar = adapter instanceof n ? (n) adapter : null;
            if (nVar != null) {
                r rVar4 = mediaBrowser.binding;
                if (rVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar2 = rVar4;
                }
                nVar.E2(rVar2.ck.isActivated(), mediaBrowser.unlinkImageFrame);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lNy(MediaBrowser mediaBrowser, View view) {
        r rVar = mediaBrowser.binding;
        r rVar2 = null;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        LinearLayoutCompat linearLayoutCompat = rVar.WPU;
        r rVar3 = mediaBrowser.binding;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar2 = rVar3;
        }
        linearLayoutCompat.setVisibility(rVar2.WPU.getVisibility() == 0 ? 4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lS(MediaBrowser mediaBrowser) {
        r rVar = mediaBrowser.binding;
        r rVar2 = null;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        rVar.WPU.setVisibility(4);
        r rVar3 = mediaBrowser.binding;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar2 = rVar3;
        }
        rVar2.E2.setVisibility(8);
    }

    private final void mx() {
        this.handler.removeCallbacks(this.updateVideoSeek);
        this.handler.postDelayed(this.updateVideoSeek, 100L);
        r rVar = this.binding;
        r rVar2 = null;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        rVar.E2.setImageDrawable(getResources().getDrawable(2131231865, getTheme()));
        r rVar3 = this.binding;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar3 = null;
        }
        rVar3.E2.postDelayed(new Runnable() { // from class: D5a.K
            @Override // java.lang.Runnable
            public final void run() {
                MediaBrowser.lS(this.f1314n);
            }
        }, 500L);
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
        r rVar4 = this.binding;
        if (rVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar2 = rVar4;
        }
        f45492FX = new WeakReference(rVar2.nHg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nO(boolean z2, MediaBrowser mediaBrowser, int i2, int i3, boolean z3) {
        r rVar = null;
        if (z2) {
            r rVar2 = mediaBrowser.binding;
            if (rVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar2 = null;
            }
            RecyclerView.Adapter adapter = rVar2.ViF.getAdapter();
            n nVar = adapter instanceof n ? (n) adapter : null;
            if (nVar != null) {
                r rVar3 = mediaBrowser.binding;
                if (rVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar3 = null;
                }
                rVar3.ViF.smoothScrollToPosition(nVar.HI());
            }
        }
        r rVar4 = mediaBrowser.binding;
        if (rVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar = rVar4;
        }
        rVar.gh.setVisibility(i2 == i3 ? 8 : 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rxp(final Z media) {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.pause();
            Unit unit = Unit.INSTANCE;
        }
        r rVar = this.binding;
        r rVar2 = null;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        rVar.nHg.onPause();
        if (EF()) {
            o(-1.0f, true, true, true);
        }
        r rVar3 = this.binding;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar3 = null;
        }
        RecyclerView.Adapter adapter = rVar3.ViF.getAdapter();
        final n nVar = adapter instanceof n ? (n) adapter : null;
        if (nVar == null) {
            return;
        }
        bZm(Integer.valueOf(nVar.XQ().size()));
        if (uG()) {
            r rVar4 = this.binding;
            if (rVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar4 = null;
            }
            rVar4.rl.setEnabled(nVar.XQ().size() > 0);
            r rVar5 = this.binding;
            if (rVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar5 = null;
            }
            rVar5.f9619t.setEnabled(nVar.XQ().size() > 0);
            Iterator it = nVar.XQ().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                Z z2 = (Z) next;
                int iIk = nVar.Ik(z2);
                r rVar6 = this.binding;
                if (rVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar6 = null;
                }
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = rVar6.ViF.findViewHolderForAdapterPosition(iIk);
                if (viewHolderFindViewHolderForAdapterPosition != null) {
                    nVar.e(((n.j) viewHolderFindViewHolderForAdapterPosition).HI(), iIk, z2);
                }
            }
        }
        int i2 = w6.$EnumSwitchMapping$0[media.ViF().ordinal()];
        if (i2 == 1) {
            Integer num = (Integer) nVar.WPU().get(nVar.ck(nVar.HI()).nY());
            r rVar7 = this.binding;
            if (rVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar7 = null;
            }
            rVar7.ck.setActivated(num != null);
            if (num != null) {
                r rVar8 = this.binding;
                if (rVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar8 = null;
                }
                rVar8.Ik.setValue(Zmq(num.intValue()));
                r rVar9 = this.binding;
                if (rVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar9 = null;
                }
                rVar9.f9618r.setText(TimeKt.formatFrameNumber(num.intValue(), this.projectFPS * 100, "mm:ss:ff"));
            } else {
                r rVar10 = this.binding;
                if (rVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar10 = null;
                }
                rVar10.Ik.setValue(Zmq(this.linkImageFrame));
                r rVar11 = this.binding;
                if (rVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar11 = null;
                }
                rVar11.f9618r.setText(TimeKt.formatFrameNumber(this.linkImageFrame, this.projectFPS * 100, "mm:ss:ff"));
            }
            r rVar12 = this.binding;
            if (rVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar12 = null;
            }
            rVar12.wTp.setVisibility(4);
            r rVar13 = this.binding;
            if (rVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar13 = null;
            }
            rVar13.HI.setVisibility(0);
            r rVar14 = this.binding;
            if (rVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar14 = null;
            }
            rVar14.E2.setVisibility(8);
            r rVar15 = this.binding;
            if (rVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar15 = null;
            }
            rVar15.ck.setVisibility(uG() ? 0 : 4);
            String scheme = media.nY().getScheme();
            kPg.fuX fux = kPg.fuX.f69922n;
            if (Intrinsics.areEqual(scheme, fux.rl())) {
                r rVar16 = this.binding;
                if (rVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar16 = null;
                }
                rVar16.KN.setVisibility(0);
                r rVar17 = this.binding;
                if (rVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar17 = null;
                }
                rVar17.f9617o.setVisibility(8);
                r rVar18 = this.binding;
                if (rVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar18 = null;
                }
                rVar18.KN.setImageBitmap(fux.Uo(media.nY()));
            } else {
                r rVar19 = this.binding;
                if (rVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar19 = null;
                }
                rVar19.KN.setVisibility(8);
                r rVar20 = this.binding;
                if (rVar20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar20 = null;
                }
                rVar20.f9617o.setVisibility(0);
                ImageRequestBuilder imageRequestBuilderAYN = ImageRequestBuilder.aYN(media.nY());
                imageRequestBuilderAYN.X(true);
                com.facebook.imagepipeline.request.j jVarN = imageRequestBuilderAYN.n();
                r rVar21 = this.binding;
                if (rVar21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar21 = null;
                }
                rVar21.f9617o.setImageRequest(jVarN);
            }
            r rVar22 = this.binding;
            if (rVar22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar22 = null;
            }
            rVar22.WPU.setVisibility(0);
            r rVar23 = this.binding;
            if (rVar23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rVar2 = rVar23;
            }
            rVar2.aYN.setText(String.valueOf(media.HI()));
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                Unit unit3 = Unit.INSTANCE;
                return;
            }
            String strKN = media.KN();
            if (strKN == null) {
                return;
            }
            String strUo = media.Uo();
            if (strUo == null) {
                strUo = "?";
            }
            String string = getResources().getString(2132017237);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            if (Intrinsics.areEqual(strKN, "All")) {
                this.bucketId = "All";
                this.bucketName = string;
                com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                jVar.setMediaBucketID("All");
                jVar.setMediaBucketName(string);
            } else {
                this.bucketId = strKN;
                this.bucketName = strUo;
                com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
                jVar2.setMediaBucketID(strKN);
                jVar2.setMediaBucketName(strUo);
            }
            uQ();
            Unit unit4 = Unit.INSTANCE;
            return;
        }
        Pair pair = (Pair) nVar.S().get(media.nY());
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = pair != null ? ((Number) pair.getFirst()).longValue() : 0L;
        MediaItem mediaItemFromUri = MediaItem.fromUri(media.nY());
        Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "fromUri(...)");
        r rVar24 = this.binding;
        if (rVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar24 = null;
        }
        rVar24.wTp.setVisibility(0);
        r rVar25 = this.binding;
        if (rVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar25 = null;
        }
        rVar25.HI.setVisibility(8);
        r rVar26 = this.binding;
        if (rVar26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar26 = null;
        }
        rVar26.E2.setVisibility(4);
        r rVar27 = this.binding;
        if (rVar27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar27 = null;
        }
        rVar27.E2.setImageDrawable(getResources().getDrawable(2131231880, getTheme()));
        r rVar28 = this.binding;
        if (rVar28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar28 = null;
        }
        rVar28.KN.setVisibility(8);
        r rVar29 = this.binding;
        if (rVar29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar29 = null;
        }
        rVar29.f9617o.setVisibility(8);
        r rVar30 = this.binding;
        if (rVar30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar30 = null;
        }
        rVar30.nHg.setVisibility(0);
        r rVar31 = this.binding;
        if (rVar31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar31 = null;
        }
        rVar31.f9620v.setInTime(0L);
        r rVar32 = this.binding;
        if (rVar32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar32 = null;
        }
        rVar32.f9620v.setOutTime(media.ck());
        r rVar33 = this.binding;
        if (rVar33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar33 = null;
        }
        rVar33.f9620v.setImageUri(null);
        r rVar34 = this.binding;
        if (rVar34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar34 = null;
        }
        rVar34.f9620v.setVideoUri(media.nY());
        r rVar35 = this.binding;
        if (rVar35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar35 = null;
        }
        ThumbnailView thumbnailView = rVar35.f9620v;
        int iCk = (int) media.ck();
        r rVar36 = this.binding;
        if (rVar36 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar36 = null;
        }
        thumbnailView.rl(0, 0, iCk, 0, Math.max((int) (rVar36.f9620v.getWidth() / (media.ck() / 1000.0f)), 1));
        r rVar37 = this.binding;
        if (rVar37 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar37 = null;
        }
        rVar37.rV9.mUb(media.ck(), pair != null ? ((Number) pair.getFirst()).longValue() : 0L, pair != null ? ((Number) pair.getSecond()).longValue() : 0L);
        r rVar38 = this.binding;
        if (rVar38 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar38 = null;
        }
        rVar38.rV9.invalidate();
        r rVar39 = this.binding;
        if (rVar39 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar39 = null;
        }
        rVar39.rV9.setOnBeginTouch(new Function0() { // from class: D5a.nKK
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBrowser.Ro(this.f1376n);
            }
        });
        r rVar40 = this.binding;
        if (rVar40 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar40 = null;
        }
        rVar40.rV9.setOnTrimming(new Function1() { // from class: D5a.DAz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaBrowser.SR(nVar, longRef, this, ((Long) obj).longValue());
            }
        });
        r rVar41 = this.binding;
        if (rVar41 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar41 = null;
        }
        rVar41.rV9.setOnStopTouch(new Function2() { // from class: D5a.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MediaBrowser.EN(this.f1391n, nVar, media, ((Long) obj).longValue(), ((Long) obj2).longValue());
            }
        });
        r rVar42 = this.binding;
        if (rVar42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar42 = null;
        }
        rVar42.rV9.setOnDonePlay(new Function0() { // from class: D5a.qf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBrowser.pS(this.f1383n);
            }
        });
        if (this.player != null) {
            wKY();
        }
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(this).build();
        this.player = exoPlayerBuild;
        if (exoPlayerBuild != null) {
            exoPlayerBuild.addListener(new Pl());
            Unit unit5 = Unit.INSTANCE;
        }
        ExoPlayer exoPlayer2 = this.player;
        if (exoPlayer2 != null) {
            exoPlayer2.setSeekParameters(SeekParameters.EXACT);
            Unit unit6 = Unit.INSTANCE;
        }
        r rVar43 = this.binding;
        if (rVar43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar43 = null;
        }
        rVar43.nHg.setPlayer(this.player);
        ExoPlayer exoPlayer3 = this.player;
        if (exoPlayer3 != null) {
            exoPlayer3.clearMediaItems();
            Unit unit7 = Unit.INSTANCE;
        }
        ExoPlayer exoPlayer4 = this.player;
        if (exoPlayer4 != null) {
            exoPlayer4.setMediaItem(mediaItemFromUri);
            Unit unit8 = Unit.INSTANCE;
        }
        ExoPlayer exoPlayer5 = this.player;
        if (exoPlayer5 != null) {
            exoPlayer5.prepare();
            Unit unit9 = Unit.INSTANCE;
        }
        ExoPlayer exoPlayer6 = this.player;
        if (exoPlayer6 != null) {
            exoPlayer6.seekTo(longRef.element);
            Unit unit10 = Unit.INSTANCE;
        }
        r rVar44 = this.binding;
        if (rVar44 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar44 = null;
        }
        rVar44.nHg.setOnTouchListener(new View.OnTouchListener() { // from class: D5a.Ln
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MediaBrowser.tEO(view, motionEvent);
            }
        });
        r rVar45 = this.binding;
        if (rVar45 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar45 = null;
        }
        rVar45.nHg.setOnClickListener(new View.OnClickListener() { // from class: D5a.lej
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.yAc(this.f1368n, longRef, nVar, media, view);
            }
        });
        r rVar46 = this.binding;
        if (rVar46 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar46 = null;
        }
        rVar46.E2.setOnClickListener(new View.OnClickListener() { // from class: D5a.iwV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.h(this.f1356n, nVar, media, longRef, view);
            }
        });
        r rVar47 = this.binding;
        if (rVar47 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar47 = null;
        }
        rVar47.WPU.setVisibility(0);
        r rVar48 = this.binding;
        if (rVar48 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar2 = rVar48;
        }
        rVar2.aYN.setText(String.valueOf(media.HI()));
        Unit unit11 = Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(MediaBrowser mediaBrowser) {
        r rVar = mediaBrowser.binding;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        rVar.Uo.performClick();
    }

    private final boolean uG() {
        r rVar = this.binding;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        return rVar.iF.getVisibility() == 0;
    }

    private final void uQ() {
        this.mediaListLoader.nr();
    }

    private final void vl(Animator animator, Function1 function1) {
        animator.addListener(new Dsr(function1));
    }

    private final void wKY() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            if (exoPlayer != null) {
                exoPlayer.release();
            }
            this.player = null;
            r rVar = this.binding;
            if (rVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar = null;
            }
            rVar.nHg.onPause();
            f45492FX = null;
            this.handler.removeCallbacks(this.updateVideoSeek);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(MediaBrowser mediaBrowser, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        r rVar = null;
        if (XoT.fuX.ck(mediaBrowser)) {
            r rVar2 = mediaBrowser.binding;
            if (rVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar2 = null;
            }
            rVar2.f9608N.setVisibility(4);
            r rVar3 = mediaBrowser.binding;
            if (rVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar3 = null;
            }
            rVar3.s7N.setVisibility(0);
            r rVar4 = mediaBrowser.binding;
            if (rVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar4 = null;
            }
            rVar4.qie.setVisibility(0);
            if (list2.isEmpty()) {
                r rVar5 = mediaBrowser.binding;
                if (rVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar5 = null;
                }
                rVar5.fD.setVisibility(0);
                r rVar6 = mediaBrowser.binding;
                if (rVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar6 = null;
                }
                rVar6.nY.setEnabled(false);
                r rVar7 = mediaBrowser.binding;
                if (rVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar7 = null;
                }
                rVar7.nr.setEnabled(false);
                mediaBrowser.albumList = list2;
                r rVar8 = mediaBrowser.binding;
                if (rVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar8 = null;
                }
                rVar8.ViF.setAdapter(null);
                r rVar9 = mediaBrowser.binding;
                if (rVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar9 = null;
                }
                rVar9.nHg.setVisibility(8);
                r rVar10 = mediaBrowser.binding;
                if (rVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar10 = null;
                }
                rVar10.E2.setVisibility(8);
                r rVar11 = mediaBrowser.binding;
                if (rVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar11 = null;
                }
                rVar11.f9617o.setVisibility(8);
                r rVar12 = mediaBrowser.binding;
                if (rVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar12 = null;
                }
                rVar12.wTp.setVisibility(4);
                r rVar13 = mediaBrowser.binding;
                if (rVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar13 = null;
                }
                rVar13.HI.setVisibility(4);
                mediaBrowser.bZm(null);
            } else {
                r rVar14 = mediaBrowser.binding;
                if (rVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar14 = null;
                }
                rVar14.fD.setVisibility(4);
                r rVar15 = mediaBrowser.binding;
                if (rVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar15 = null;
                }
                rVar15.nY.setEnabled(!mediaBrowser.isMediaFillMode);
                r rVar16 = mediaBrowser.binding;
                if (rVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar16 = null;
                }
                rVar16.nr.setEnabled(true);
                mediaBrowser.albumList = list2;
                if (!list.isEmpty()) {
                    r rVar17 = mediaBrowser.binding;
                    if (rVar17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rVar17 = null;
                    }
                    rVar17.ViF.setBackgroundColor(mediaBrowser.getResources().getColor(R.color.transparent, mediaBrowser.getTheme()));
                    r rVar18 = mediaBrowser.binding;
                    if (rVar18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rVar18 = null;
                    }
                    if (rVar18.ViF.getAdapter() != null) {
                        r rVar19 = mediaBrowser.binding;
                        if (rVar19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            rVar19 = null;
                        }
                        RecyclerView.Adapter adapter = rVar19.ViF.getAdapter();
                        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.mediabrowser.VisualMediaListRecyclerAdapter");
                        n nVar = (n) adapter;
                        if (!Intrinsics.areEqual(nVar.ty(), mediaBrowser.bucketId)) {
                            r rVar20 = mediaBrowser.binding;
                            if (rVar20 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                rVar20 = null;
                            }
                            rVar20.ViF.setAdapter(new n(mediaBrowser.bucketId, list, new Ml(mediaBrowser), new I28(mediaBrowser), mediaBrowser.isMediaFillMode));
                            r rVar21 = mediaBrowser.binding;
                            if (rVar21 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                rVar21 = null;
                            }
                            RecyclerView.Adapter adapter2 = rVar21.ViF.getAdapter();
                            Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.mediabrowser.VisualMediaListRecyclerAdapter");
                            ((n) adapter2).XQ().add(CollectionsKt.first(list));
                            mediaBrowser.rxp((Z) CollectionsKt.first(list));
                            mediaBrowser.bZm(null);
                        } else if (list.size() != nVar.r().size() || list.containsAll(nVar.r())) {
                            nVar.iF(list);
                            nVar.az();
                            if (nVar.HI() != -1) {
                                mediaBrowser.rxp(nVar.ck(nVar.HI()));
                            }
                            nVar.notifyDataSetChanged();
                            mediaBrowser.bZm(Integer.valueOf(nVar.XQ().size()));
                        }
                    } else {
                        n nVar2 = new n(mediaBrowser.bucketId, list, new Wre(mediaBrowser), new CN3(mediaBrowser), mediaBrowser.isMediaFillMode);
                        r rVar22 = mediaBrowser.binding;
                        if (rVar22 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            rVar22 = null;
                        }
                        rVar22.ViF.setAdapter(nVar2);
                        nVar2.XQ().add(CollectionsKt.first(list));
                        mediaBrowser.rxp((Z) CollectionsKt.first(list));
                        mediaBrowser.bZm(Integer.valueOf(nVar2.XQ().size()));
                    }
                    Set<String> installedAppVersions = com.alightcreative.app.motion.persist.j.INSTANCE.getInstalledAppVersions();
                    if (!(installedAppVersions instanceof Collection) || !installedAppVersions.isEmpty()) {
                        Iterator<T> it = installedAppVersions.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (StringsKt.startsWith$default((String) it.next(), "3.", false, 2, (Object) null)) {
                                if (StringsKt.startsWith$default("5.0.273.1028425", "4.", false, 2, (Object) null)) {
                                    com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                                    if (!jVar.getShowMBTooltip()) {
                                        r rVar23 = mediaBrowser.binding;
                                        if (rVar23 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        } else {
                                            rVar = rVar23;
                                        }
                                        AppCompatTextView albumTitle = rVar.J2;
                                        Intrinsics.checkNotNullExpressionValue(albumTitle, "albumTitle");
                                        String string = mediaBrowser.getString(2132020340);
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        o7q.ty(albumTitle, mediaBrowser, string);
                                        jVar.setShowMBTooltip(true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            r rVar24 = mediaBrowser.binding;
            if (rVar24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar24 = null;
            }
            rVar24.f9608N.setVisibility(0);
            r rVar25 = mediaBrowser.binding;
            if (rVar25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar25 = null;
            }
            rVar25.s7N.setVisibility(4);
            r rVar26 = mediaBrowser.binding;
            if (rVar26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rVar = rVar26;
            }
            rVar.qie.setVisibility(4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yAc(MediaBrowser mediaBrowser, Ref.LongRef longRef, n nVar, Z z2, View view) {
        ExoPlayer exoPlayer = mediaBrowser.player;
        if (!(exoPlayer != null ? exoPlayer.isPlaying() : false)) {
            Fp(mediaBrowser, nVar, z2, longRef);
            mediaBrowser.mx();
        } else {
            ExoPlayer exoPlayer2 = mediaBrowser.player;
            longRef.element = exoPlayer2 != null ? exoPlayer2.getCurrentPosition() : 0L;
            mediaBrowser.eo();
        }
    }

    public final iF JVN() {
        iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    @Override // D5a.M5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(float diff, boolean endDrag, final boolean scrollDown, boolean fling) {
        final int i2 = this.mediaRecyclerHeight;
        r rVar = this.binding;
        r rVar2 = null;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        final int height = rVar.f9617o.getHeight() + this.mediaRecyclerHeight;
        if (scrollDown) {
            r rVar3 = this.binding;
            if (rVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar3 = null;
            }
            if (rVar3.ViF.getHeight() == i2) {
                return;
            }
        }
        int i3 = this.mediaRecyclerHeight;
        r rVar4 = this.binding;
        if (rVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar4 = null;
        }
        int height2 = i3 + (rVar4.f9617o.getHeight() / 3);
        if (!endDrag) {
            r rVar5 = this.binding;
            if (rVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar5 = null;
            }
            ViewGroup.LayoutParams layoutParams = rVar5.ViF.getLayoutParams();
            r rVar6 = this.binding;
            if (rVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar6 = null;
            }
            layoutParams.height = rVar6.ViF.getHeight() - ((int) diff);
            r rVar7 = this.binding;
            if (rVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar7 = null;
            }
            rVar7.ViF.setLayoutParams(layoutParams);
            r rVar8 = this.binding;
            if (rVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rVar2 = rVar8;
            }
            rVar2.ViF.requestLayout();
            return;
        }
        if (!fling || !scrollDown) {
            if (!fling) {
                r rVar9 = this.binding;
                if (rVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar9 = null;
                }
                if (rVar9.ViF.getHeight() - height2 < 0) {
                    height = i2;
                }
            }
        }
        r rVar10 = this.binding;
        if (rVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar10 = null;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(rVar10.ViF.getHeight(), height);
        valueAnimatorOfInt.setInterpolator(new OvershootInterpolator());
        r rVar11 = this.binding;
        if (rVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar2 = rVar11;
        }
        valueAnimatorOfInt.setDuration(((long) Math.abs(rVar2.ViF.getHeight() - height)) / ((long) 2));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: D5a.Lu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MediaBrowser.Zn(this.f1315n, valueAnimator);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        vl(valueAnimatorOfInt, new Function1() { // from class: D5a.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaBrowser.nO(scrollDown, this, height, i2, ((Boolean) obj).booleanValue());
            }
        });
        valueAnimatorOfInt.start();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (requestCode != 1) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            return;
        }
        iF iFVarJVN = JVN();
        boolean z2 = !(grantResults.length == 0) && grantResults[0] == 0;
        rWZ.fuX fux = rWZ.fuX.f73086O;
        String str = this.projectId;
        Zs.t(iFVarJVN, z2, fux, str != null ? new String[]{str} : null, null, null, new Function0() { // from class: D5a.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBrowser.l(this.f1397n);
            }
        }, 48, null);
    }

    public final kgE.fuX xVH() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public MediaBrowser() {
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        this.bucketId = jVar.getMediaBucketID();
        this.bucketName = jVar.getMediaBucketName();
        this.albumList = new ArrayList();
        this.handler = new Handler(Looper.getMainLooper());
        this.mediaListLoader = new l4Z(f45493M, new Function0() { // from class: D5a.Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBrowser.Vvq(this.f1339n);
            }
        }).KN(new Function1() { // from class: D5a.Ew
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaBrowser.y(this.f1306n, (Pair) obj);
            }
        });
        this.updateVideoSeek = new Xo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lp6(MediaBrowser mediaBrowser, View view) {
        if (mediaBrowser.EF()) {
            mediaBrowser.o(-1.0f, true, true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NP(MediaBrowser mediaBrowser) {
        mediaBrowser.uQ();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SR(n nVar, Ref.LongRef longRef, MediaBrowser mediaBrowser, long j2) {
        if (nVar.ck(nVar.HI()).ViF() == Ew.f73884r) {
            longRef.element = j2;
            ExoPlayer exoPlayer = mediaBrowser.player;
            if (exoPlayer != null) {
                exoPlayer.seekTo(j2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Toy(MediaBrowser mediaBrowser, int i2) {
        int iIV = mediaBrowser.iV(i2);
        r rVar = mediaBrowser.binding;
        r rVar2 = null;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        rVar.f9618r.setText(TimeKt.formatFrameNumber(iIV, mediaBrowser.projectFPS * 100, "mm:ss:ff"));
        r rVar3 = mediaBrowser.binding;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar2 = rVar3;
        }
        if (rVar2.ck.isActivated()) {
            mediaBrowser.unlinkImageFrame = iIV;
        } else {
            mediaBrowser.linkImageFrame = iIV;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g6(MediaBrowser mediaBrowser, View view) {
        view.setActivated(!view.isActivated());
        if (view.isActivated()) {
            mediaBrowser.unlinkImageFrame = mediaBrowser.linkImageFrame;
        }
        n nVar = null;
        if (!view.isActivated()) {
            r rVar = mediaBrowser.binding;
            if (rVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar = null;
            }
            rVar.f9618r.setText(TimeKt.formatFrameNumber(mediaBrowser.linkImageFrame, mediaBrowser.projectFPS * 100, "mm:ss:ff"));
        }
        r rVar2 = mediaBrowser.binding;
        if (rVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar2 = null;
        }
        RecyclerView.Adapter adapter = rVar2.ViF.getAdapter();
        if (adapter instanceof n) {
            nVar = (n) adapter;
        }
        if (nVar != null) {
            nVar.E2(view.isActivated(), mediaBrowser.unlinkImageFrame);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(MediaBrowser mediaBrowser, n nVar, Z z2, Ref.LongRef longRef, View view) {
        Fp(mediaBrowser, nVar, z2, longRef);
        mediaBrowser.mx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(MediaBrowser mediaBrowser) {
        mediaBrowser.uQ();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n7b(final MediaBrowser mediaBrowser, View view) {
        Object parent;
        View view2;
        ViewParent parent2;
        if (!mediaBrowser.uG()) {
            r rVar = mediaBrowser.binding;
            ViewGroup viewGroup = null;
            r rVar2 = null;
            if (rVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar = null;
            }
            if (rVar.f9609O.getRotation() == 180.0f) {
                r rVar3 = mediaBrowser.binding;
                if (rVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar3 = null;
                }
                rVar3.mUb.setVisibility(0);
                r rVar4 = mediaBrowser.binding;
                if (rVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar4 = null;
                }
                rVar4.nr.setVisibility(0);
                r rVar5 = mediaBrowser.binding;
                if (rVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar5 = null;
                }
                rVar5.nY.setVisibility(0);
                r rVar6 = mediaBrowser.binding;
                if (rVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar6 = null;
                }
                rVar6.f9609O.setRotation(0.0f);
                r rVar7 = mediaBrowser.binding;
                if (rVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar2 = rVar7;
                }
                rVar2.f9609O.setActivated(false);
                return;
            }
            r rVar8 = mediaBrowser.binding;
            if (rVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar8 = null;
            }
            rVar8.mUb.setVisibility(4);
            r rVar9 = mediaBrowser.binding;
            if (rVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar9 = null;
            }
            rVar9.nr.setVisibility(4);
            r rVar10 = mediaBrowser.binding;
            if (rVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar10 = null;
            }
            rVar10.nY.setVisibility(4);
            r rVar11 = mediaBrowser.binding;
            if (rVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar11 = null;
            }
            rVar11.f9609O.setRotation(180.0f);
            r rVar12 = mediaBrowser.binding;
            if (rVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar12 = null;
            }
            rVar12.f9609O.setActivated(true);
            final ListPopupWindow listPopupWindow = new ListPopupWindow(mediaBrowser);
            listPopupWindow.setBackgroundDrawable(new ColorDrawable(mediaBrowser.getResources().getColor(2131099661, mediaBrowser.getTheme())));
            List list = mediaBrowser.albumList;
            listPopupWindow.setAdapter(new D5a.Xo(list, list.isEmpty(), new o(mediaBrowser), mediaBrowser.xVH(), new qz(listPopupWindow)));
            r rVar13 = mediaBrowser.binding;
            if (rVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar13 = null;
            }
            listPopupWindow.setAnchorView(rVar13.Uo);
            listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: D5a.psW
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view3, int i2, long j2) {
                    MediaBrowser.Aum(this.f1381n, listPopupWindow, adapterView, view3, i2, j2);
                }
            });
            listPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: D5a.Md
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    MediaBrowser.s(this.f1317n);
                }
            });
            listPopupWindow.setVerticalOffset(0);
            listPopupWindow.setHorizontalOffset(0);
            r rVar14 = mediaBrowser.binding;
            if (rVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar14 = null;
            }
            listPopupWindow.setHeight(Math.min(rVar14.qie.getHeight(), mediaBrowser.getResources().getDimensionPixelOffset(2131165281) * (mediaBrowser.albumList.size() + (mediaBrowser.albumList.isEmpty() ? 1 : 0))));
            listPopupWindow.setWidth(-1);
            listPopupWindow.setModal(true);
            listPopupWindow.show();
            ListView listView = listPopupWindow.getListView();
            if (listView != null) {
                listView.setClipToOutline(true);
            }
            ListView listView2 = listPopupWindow.getListView();
            if (listView2 != null) {
                listView2.setClipChildren(true);
            }
            ListView listView3 = listPopupWindow.getListView();
            if (listView3 != null) {
                parent = listView3.getParent();
            } else {
                parent = null;
            }
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                view2 = null;
            }
            if (view2 != null) {
                view2.setClipToOutline(true);
            }
            ListView listView4 = listPopupWindow.getListView();
            if (listView4 != null) {
                parent2 = listView4.getParent();
            } else {
                parent2 = null;
            }
            if (parent2 instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent2;
            }
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o9(MediaBrowser mediaBrowser, View view) {
        mediaBrowser.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pS(MediaBrowser mediaBrowser) {
        mediaBrowser.eo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean tEO(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat v0j(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insetsJ2 = windowInsetsCompat.J2(WindowInsetsCompat.Type.xMQ());
        Intrinsics.checkNotNull(view);
        view.setPadding(view.getPaddingLeft(), insetsJ2.rl, view.getPaddingRight(), insetsJ2.nr);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wKp(MediaBrowser mediaBrowser, View view) {
        mediaBrowser.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xzo(MediaBrowser mediaBrowser) {
        mediaBrowser.uQ();
        return Unit.INSTANCE;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (uG()) {
            I4p(null, false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.alightcreative.app.motion.activities.mediabrowser.j, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        boolean booleanExtra;
        String stringExtra;
        int i2;
        super.onCreate(savedInstanceState);
        r rVarT = r.t(getLayoutInflater());
        this.binding = rVarT;
        r rVar = null;
        if (rVarT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVarT = null;
        }
        setContentView(rVarT.getRoot());
        r rVar2 = this.binding;
        if (rVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar2 = null;
        }
        ViewCompat.Org(rVar2.getRoot(), new OnApplyWindowInsetsListener() { // from class: D5a.afx
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                return MediaBrowser.v0j(view, windowInsetsCompat);
            }
        });
        Intent intent = getIntent();
        int i3 = 0;
        if (intent != null) {
            booleanExtra = intent.getBooleanExtra("MediaFillMode", false);
        } else {
            booleanExtra = false;
        }
        this.isMediaFillMode = booleanExtra;
        Intent intent2 = getIntent();
        int intExtra = 30;
        if (intent2 != null) {
            intExtra = intent2.getIntExtra("projectFPS", 30);
        }
        this.projectFPS = intExtra;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            stringExtra = intent3.getStringExtra("projectId");
        } else {
            stringExtra = null;
        }
        this.projectId = stringExtra;
        this.fpsDurationPoint = this.projectFPS * 10;
        r rVar3 = this.binding;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar3 = null;
        }
        rVar3.mUb.setOnClickListener(new View.OnClickListener() { // from class: D5a.l3D
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.o9(this.f1363n, view);
            }
        });
        r rVar4 = this.binding;
        if (rVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar4 = null;
        }
        rVar4.f9612X.setOnClickListener(new View.OnClickListener() { // from class: D5a.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.wKp(this.f1343n, view);
            }
        });
        r rVar5 = this.binding;
        if (rVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar5 = null;
        }
        rVar5.nr.setOnClickListener(new View.OnClickListener() { // from class: D5a.s4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.QgZ(this.f1389n, view);
            }
        });
        r rVar6 = this.binding;
        if (rVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar6 = null;
        }
        rVar6.f9619t.setOnClickListener(new View.OnClickListener() { // from class: D5a.UGc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.j(this.f1330n, view);
            }
        });
        r rVar7 = this.binding;
        if (rVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar7 = null;
        }
        rVar7.rl.setOnClickListener(new View.OnClickListener() { // from class: D5a.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.H(this.f1323n, view);
            }
        });
        r rVar8 = this.binding;
        if (rVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar8 = null;
        }
        rVar8.nY.setEnabled(!this.isMediaFillMode);
        r rVar9 = this.binding;
        if (rVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar9 = null;
        }
        rVar9.nY.setOnClickListener(new View.OnClickListener() { // from class: D5a.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.waP(this.f1387n, view);
            }
        });
        r rVar10 = this.binding;
        if (rVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar10 = null;
        }
        rVar10.f9615g.setOnClickListener(new View.OnClickListener() { // from class: D5a.SPz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.LPV(this.f1329n, view);
            }
        });
        r rVar11 = this.binding;
        if (rVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar11 = null;
        }
        RecyclerView recyclerView = rVar11.ViF;
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new aC(recyclerView, this));
        r rVar12 = this.binding;
        if (rVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar12 = null;
        }
        rVar12.ViF.addOnItemTouchListener(new fg(this, this));
        bZm(null);
        r rVar13 = this.binding;
        if (rVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar13 = null;
        }
        rVar13.Uo.setOnClickListener(new View.OnClickListener() { // from class: D5a.ci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.n7b(this.f1344n, view);
            }
        });
        r rVar14 = this.binding;
        if (rVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar14 = null;
        }
        rVar14.gh.setOnClickListener(new View.OnClickListener() { // from class: D5a.g9s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.Lp6(this.f1350n, view);
            }
        });
        r rVar15 = this.binding;
        if (rVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar15 = null;
        }
        rVar15.ck.setOnClickListener(new View.OnClickListener() { // from class: D5a.rv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.g6(this.f1388n, view);
            }
        });
        this.linkImageFrame = MathKt.roundToInt((I7a.n() / 1000.0f) * this.projectFPS);
        r rVar16 = this.binding;
        if (rVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar16 = null;
        }
        rVar16.Ik.setMinValue(1);
        r rVar17 = this.binding;
        if (rVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar17 = null;
        }
        rVar17.Ik.setMaxValue((this.projectFPS * 10) + 50);
        r rVar18 = this.binding;
        if (rVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar18 = null;
        }
        rVar18.Ik.setValue(this.linkImageFrame);
        r rVar19 = this.binding;
        if (rVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar19 = null;
        }
        rVar19.f9618r.setText(TimeKt.formatFrameNumber(this.linkImageFrame, this.projectFPS * 100, "mm:ss:ff"));
        r rVar20 = this.binding;
        if (rVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar20 = null;
        }
        rVar20.Ik.setLimitRange(true);
        r rVar21 = this.binding;
        if (rVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar21 = null;
        }
        rVar21.Ik.setOnStartTrackingTouch(new Function0() { // from class: D5a.Zs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBrowser.Mh();
            }
        });
        r rVar22 = this.binding;
        if (rVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar22 = null;
        }
        rVar22.Ik.setOnStopTrackingTouch(new Function0() { // from class: D5a.P
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBrowser.jO(this.f1321n);
            }
        });
        r rVar23 = this.binding;
        if (rVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar23 = null;
        }
        rVar23.Ik.setOnSpinAbs(new Function1() { // from class: D5a.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaBrowser.Toy(this.f1370n, ((Integer) obj).intValue());
            }
        });
        r rVar24 = this.binding;
        if (rVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar24 = null;
        }
        ThumbnailView thumbnailView = rVar24.f9620v;
        thumbnailView.getViewTreeObserver().addOnGlobalLayoutListener(new C(thumbnailView, this));
        r rVar25 = this.binding;
        if (rVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar25 = null;
        }
        rVar25.xMQ.setOnClickListener(new View.OnClickListener() { // from class: D5a.iF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.Th(this.f1354n, view);
            }
        });
        r rVar26 = this.binding;
        if (rVar26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar26 = null;
        }
        RecyclerView recyclerView2 = rVar26.ViF;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        gridLayoutManager.MPw(10);
        gridLayoutManager.Ro(true);
        recyclerView2.setLayoutManager(gridLayoutManager);
        r rVar27 = this.binding;
        if (rVar27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar27 = null;
        }
        rVar27.WPU.setOnClickListener(new View.OnClickListener() { // from class: D5a.yg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.XNZ(this.f1396n, view);
            }
        });
        r rVar28 = this.binding;
        if (rVar28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar28 = null;
        }
        rVar28.f9617o.setOnClickListener(new View.OnClickListener() { // from class: D5a.pO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowser.lNy(this.f1380n, view);
            }
        });
        r rVar29 = this.binding;
        if (rVar29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar29 = null;
        }
        View view = rVar29.ty;
        if (this.isMediaFillMode) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        r rVar30 = this.binding;
        if (rVar30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar30 = null;
        }
        rVar30.ty.setOnTouchListener(new View.OnTouchListener() { // from class: D5a.Sis
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return MediaBrowser.I9f(view2, motionEvent);
            }
        });
        r rVar31 = this.binding;
        if (rVar31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar31 = null;
        }
        ConstraintLayout constraintLayout = rVar31.f9610S;
        if (XoT.fuX.HI(this)) {
            i3 = 8;
        }
        constraintLayout.setVisibility(i3);
        r rVar32 = this.binding;
        if (rVar32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar = rVar32;
        }
        rVar.XQ.setOnClickListener(new View.OnClickListener() { // from class: D5a.QJ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MediaBrowser.D76(this.f1324n, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        wKY();
        I7a.O(X4T(this.linkImageFrame));
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mediaListLoader.nr();
        z.WPU();
    }
}
