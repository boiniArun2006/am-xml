package com.alightcreative.export.preview;

import GJW.vd;
import HI0.afx;
import HI0.lej;
import QmE.iF;
import QmE.j;
import SJ0.Pl;
import XoT.C;
import Y48.l3D;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.database.sqlite.cL.PtsLKY;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.alightcreative.app.motion.activities.SaveToStorageActivity;
import com.alightcreative.export.preview.ExportPreviewActivity;
import com.alightcreative.monorepo.settings.ExportedVideoAttachment;
import com.alightcreative.share.n;
import com.facebook.drawee.view.SimpleDraweeView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import eVj.aC;
import ep.oxM.esLNYym;
import gIX.DAz;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kP.InterfaceC2210n;
import kgE.fuX;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import x0X.n;
import xAo.Z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\u0095\u0001\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJC\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001b\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0003J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b*\u0010\u0003J\u000f\u0010+\u001a\u00020\u0011H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00103\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u000101H\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0004H\u0017¢\u0006\u0004\b5\u0010\u0003J\u0015\u00107\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u0019¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0004H\u0014¢\u0006\u0004\b9\u0010\u0003J\u000f\u0010:\u001a\u00020\u0004H\u0014¢\u0006\u0004\b:\u0010\u0003J\u000f\u0010;\u001a\u00020\u0004H\u0014¢\u0006\u0004\b;\u0010\u0003R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001e\u0010p\u001a\n\u0012\u0004\u0012\u00020m\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010vR\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010|\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u001c\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00190w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010yR*\u0010\u0085\u0001\u001a\u0004\u0018\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008b\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008b\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008b\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008b\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001a\u0010\u009a\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010vR\u001f\u0010\u009d\u0001\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u0088\u0001\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010,R\u0018\u0010\u009f\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010IR\u001f\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u00030¡\u00010 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001¨\u0006¥\u0001"}, d2 = {"Lcom/alightcreative/export/preview/ExportPreviewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "mI", "Ljava/io/File;", "linkData", "qrData", "a63", "(Ljava/io/File;Ljava/io/File;)V", "data", "saveToStorageTarget", "", "mimeType", "", "saveCompleteMsgId", "", "indexMedia", "LrWZ/n;", "exportSnapshot", "Lp6", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;IZLrWZ/n;)V", "", "mimeTypes", "Landroid/net/Uri;", "uris", InneractiveMediationDefs.GENDER_FEMALE, "(Ljava/util/List;Ljava/util/List;Ljava/io/File;)V", "ub", "(Ljava/util/List;)V", "Toy", "wKp", "position", "type", "nO", "(II)V", "v0j", "Bu", "(Ljava/io/File;)V", "Th", "vl", CmcdData.STREAMING_FORMAT_SS, "jO", "()Z", "Lcom/alightcreative/share/n;", "shareInfo", "y", "(Lcom/alightcreative/share/n;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "uri", "UF", "(Landroid/net/Uri;)V", "onResume", "onPause", "onDestroy", "LSJ0/Pl;", "r", "LSJ0/Pl;", "binding", "LQmE/iF;", "o", "LQmE/iF;", "QZ6", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "Z", "LkgE/fuX;", "getIapManager", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LxAo/I28;", "S", "LxAo/I28;", "F", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LnYs/Ml;", "g", "LnYs/Ml;", "tFV", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "LkP/n;", "E2", "LkP/n;", "VwL", "()LkP/n;", "setInjet", "(LkP/n;)V", "injet", "Landroid/os/Handler;", "e", "Landroid/os/Handler;", "handler", "Ljava/lang/ref/WeakReference;", "Landroidx/media3/ui/PlayerView;", "X", "Ljava/lang/ref/WeakReference;", "exportPreviewWeakReference", "Landroidx/media3/exoplayer/ExoPlayer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/media3/exoplayer/ExoPlayer;", "player", "N", "Ljava/lang/String;", "", "v", "Ljava/util/List;", "Xw", "Landroid/net/Uri;", "contentUri", "jB", "contentUris", "U", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "()Landroidx/media3/ui/PlayerView;", "Mh", "(Landroidx/media3/ui/PlayerView;)V", "playerView", "", "P5", "J", "videoSeekToTime", "M7", "I", "rvSelectedPosition", "p5", "rvSelectedType", "eF", "exportWidth", "E", "exportHeight", "M", "sceneTotalTime", "com/alightcreative/export/preview/ExportPreviewActivity$CN3", "FX", "Lcom/alightcreative/export/preview/ExportPreviewActivity$CN3;", "updateTimeTask", "B", "projectId", "Lkotlin/Lazy;", "JVN", "isSmartphone", "D", "qrAlertShown", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/activity/result/ActivityResultLauncher;", "saveToStorageActivityResultLauncher", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExportPreviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportPreviewActivity.kt\ncom/alightcreative/export/preview/ExportPreviewActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,950:1\n1863#2:951\n1864#2:954\n278#3,2:952\n257#3,2:955\n257#3,2:957\n257#3,2:959\n257#3,2:961\n257#3,2:963\n257#3,2:965\n161#3,8:967\n*S KotlinDebug\n*F\n+ 1 ExportPreviewActivity.kt\ncom/alightcreative/export/preview/ExportPreviewActivity\n*L\n339#1:951\n339#1:954\n339#1:952,2\n342#1:955,2\n344#1:957,2\n349#1:959,2\n351#1:961,2\n354#1:963,2\n355#1:965,2\n225#1:967,8\n*E\n"})
public final class ExportPreviewActivity extends com.alightcreative.export.preview.j {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private String projectId;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean qrAlertShown;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public InterfaceC2210n injet;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private int rvSelectedPosition;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private String mimeType;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private long videoSeekToTime;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private ExoPlayer player;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private PlayerView playerView;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private WeakReference exportPreviewWeakReference;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Uri contentUri;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public fuX iapManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public iF eventLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Pl binding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Handler handler = new Handler();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private List mimeTypes = new ArrayList();

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private List contentUris = new ArrayList();

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private int rvSelectedType = 2131558448;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private int exportWidth = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private int exportHeight = -1;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private int sceneTotalTime = -1;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private final CN3 updateTimeTask = new CN3();

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final Lazy isSmartphone = LazyKt.lazy(new Function0() { // from class: Y48.CN3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(ExportPreviewActivity.xVH(this.f12001n));
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher saveToStorageActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: Y48.fuX
        @Override // androidx.view.result.ActivityResultCallback
        public final void n(Object obj) {
            ExportPreviewActivity.g6(this.f12012n, (ActivityResult) obj);
        }
    });

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class CN3 implements Runnable {
        CN3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExoPlayer exoPlayer = ExportPreviewActivity.this.player;
            if (exoPlayer == null) {
                return;
            }
            Pl pl = ExportPreviewActivity.this.binding;
            if (pl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pl = null;
            }
            pl.iF.setProgress((int) exoPlayer.getCurrentPosition());
            ExportPreviewActivity.this.handler.postDelayed(this, 100L);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class I28 implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f46605n;

        I28() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            if (z2) {
                ExportPreviewActivity.this.videoSeekToTime = seekBar.getProgress();
                ExoPlayer exoPlayer = ExportPreviewActivity.this.player;
                if (exoPlayer != null) {
                    exoPlayer.seekTo(ExportPreviewActivity.this.videoSeekToTime);
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            ExportPreviewActivity.this.handler.removeCallbacks(ExportPreviewActivity.this.updateTimeTask);
            ExoPlayer exoPlayer = ExportPreviewActivity.this.player;
            if (exoPlayer != null && exoPlayer.isPlaying()) {
                ExportPreviewActivity.this.vl();
                this.f46605n = true;
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            ExportPreviewActivity.this.handler.removeCallbacks(ExportPreviewActivity.this.updateTimeTask);
            ExportPreviewActivity.this.videoSeekToTime = seekBar.getProgress();
            ExoPlayer exoPlayer = ExportPreviewActivity.this.player;
            if (exoPlayer != null) {
                exoPlayer.seekTo(ExportPreviewActivity.this.videoSeekToTime);
            }
            if (this.f46605n) {
                this.f46605n = false;
                ExportPreviewActivity.this.Th();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class Ml implements Player.Listener {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f46607t;

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i2) {
            Pl pl = null;
            if (i2 == 3) {
                Pl pl3 = ExportPreviewActivity.this.binding;
                if (pl3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pl3 = null;
                }
                pl3.f9262r.setEnabled(true);
                Pl pl4 = ExportPreviewActivity.this.binding;
                if (pl4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pl = pl4;
                }
                pl.iF.setMax((int) this.f46607t.getDuration());
                return;
            }
            if (i2 == 4 && this.f46607t.getCurrentPosition() >= this.f46607t.getDuration()) {
                ExportPreviewActivity.this.vl();
                Pl pl5 = ExportPreviewActivity.this.binding;
                if (pl5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pl5 = null;
                }
                AppCompatSeekBar appCompatSeekBar = pl5.iF;
                Pl pl6 = ExportPreviewActivity.this.binding;
                if (pl6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pl = pl6;
                }
                appCompatSeekBar.setProgress(pl.iF.getMax());
                ExportPreviewActivity.this.videoSeekToTime = 0L;
            }
        }

        Ml(ExoPlayer exoPlayer) {
            this.f46607t = exoPlayer;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    /* synthetic */ class Wre extends FunctionReferenceImpl implements Function1 {
        Wre(Object obj) {
            super(1, obj, ExportPreviewActivity.class, "onShareResultFirebaseLog", "onShareResultFirebaseLog(Lcom/alightcreative/share/ShareResultReceiverInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((com.alightcreative.share.n) obj);
            return Unit.INSTANCE;
        }

        public final void n(com.alightcreative.share.n p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ExportPreviewActivity) this.receiver).y(p0);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class n extends LinearSnapHelper {
        final /* synthetic */ com.alightcreative.export.preview.n KN;
        final /* synthetic */ RecyclerView Uo;
        final /* synthetic */ List xMQ;

        n(RecyclerView recyclerView, com.alightcreative.export.preview.n nVar, List list) {
            this.Uo = recyclerView;
            this.KN = nVar;
            this.xMQ = list;
        }

        @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
        public View KN(RecyclerView.LayoutManager layoutManager) {
            int iFcU;
            String str;
            Intrinsics.checkNotNullParameter(layoutManager, PtsLKY.lrestbNTkAi);
            View viewKN = super.KN(layoutManager);
            if (viewKN != null && (iFcU = layoutManager.fcU(viewKN)) != ExportPreviewActivity.this.rvSelectedPosition && this.Uo.getScrollState() == 0) {
                ExportPreviewActivity.this.rvSelectedPosition = iFcU;
                ExportPreviewActivity.this.rvSelectedType = this.KN.getItemViewType(iFcU);
                iF iFVarQZ6 = ExportPreviewActivity.this.QZ6();
                switch (ExportPreviewActivity.this.rvSelectedType) {
                    case 2131558444:
                    case 2131558445:
                        str = "link";
                        break;
                    case 2131558446:
                    case 2131558447:
                        str = "qr_code";
                        break;
                    case 2131558448:
                    case 2131558449:
                        str = "video";
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                iFVarQZ6.n(new j.RzR(str));
                Pl pl = ExportPreviewActivity.this.binding;
                Pl pl3 = null;
                if (pl == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pl = null;
                }
                pl.f9258Z.setEnabled(ExportPreviewActivity.this.rvSelectedPosition != 0);
                Pl pl4 = ExportPreviewActivity.this.binding;
                if (pl4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pl3 = pl4;
                }
                pl3.Ik.setEnabled(ExportPreviewActivity.this.rvSelectedPosition != this.xMQ.size() - 1);
                ExportPreviewActivity exportPreviewActivity = ExportPreviewActivity.this;
                exportPreviewActivity.nO(iFcU, exportPreviewActivity.rvSelectedType);
            }
            return viewKN;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46608n;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ExportPreviewActivity.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46608n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC2210n interfaceC2210nVwL = ExportPreviewActivity.this.VwL();
                Eu.I28 i28 = Eu.I28.f2374FX;
                this.f46608n = 1;
                obj = Eu.Wre.n(interfaceC2210nVwL, i28, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            ExportPreviewActivity exportPreviewActivity = ExportPreviewActivity.this;
            if (!(nVar instanceof n.C1266n)) {
                if (nVar instanceof n.w6) {
                    if (((Boolean) ((n.w6) nVar).n()).booleanValue()) {
                        exportPreviewActivity.finish();
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class w6 extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        protected int te() {
            return -1;
        }

        w6(Context context) {
            super(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Aum(int i2, rWZ.n nVar, ExportPreviewActivity exportPreviewActivity, int i3, String str, View view) {
        int i5;
        Ken.n nVar2 = i2 == 2131558448 ? Ken.n.f5628t : Ken.n.f5625O;
        if (nVar != null) {
            if (i2 == 2131558444) {
                exportPreviewActivity.QZ6().n(new j.Lc(rWZ.n.rl(nVar, 0L, 0L, null, 0, 0, 0, null, null, null, null, null, null, false, false, 0, 0, 0, 0, null, false, null, rWZ.j.Uo(DAz.f67201n), null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, false, false, -2097153, 31, null)));
            } else if (i2 != 2131558446) {
                exportPreviewActivity.QZ6().n(new j.FKk(nVar));
            } else {
                exportPreviewActivity.QZ6().n(new j.Lc(rWZ.n.rl(nVar, 0L, 0L, null, 0, 0, 0, null, null, null, null, null, null, false, false, 0, 0, 0, 0, null, false, null, rWZ.j.Uo(DAz.f67202t), null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, false, false, -2097153, 31, null)));
            }
            i5 = 2131558444;
        } else {
            i5 = 2131558444;
        }
        if (i2 != i5) {
            com.alightcreative.share.j.iF(exportPreviewActivity, (Uri) exportPreviewActivity.contentUris.get(i3), (String) exportPreviewActivity.mimeTypes.get(i3), str, exportPreviewActivity.QZ6(), nVar2, new Wre(exportPreviewActivity));
            return;
        }
        String stringExtra = exportPreviewActivity.getIntent().getStringExtra("TEMPLATE_LINK");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.alightcreative.share.j.ViF(exportPreviewActivity, stringExtra, exportPreviewActivity.getResources().getText(2132020152).toString(), exportPreviewActivity.QZ6(), null, null, 24, null);
    }

    private final void Bu(File data) {
        final l3D l3d = new l3D(data);
        final int iRl = l3d.rl();
        if (iRl <= 0) {
            return;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        Pl pl = this.binding;
        Pl pl3 = null;
        if (pl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl = null;
        }
        pl.az.setText((intRef.element + 1) + "/" + iRl);
        Pl pl4 = this.binding;
        if (pl4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl4 = null;
        }
        pl4.qie.setImageBitmap(l3d.n(0));
        Pl pl5 = this.binding;
        if (pl5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl5 = null;
        }
        pl5.f9261o.setEnabled(intRef.element != 0);
        Pl pl6 = this.binding;
        if (pl6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl6 = null;
        }
        pl6.ck.setEnabled(intRef.element != iRl + (-1));
        Pl pl7 = this.binding;
        if (pl7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl7 = null;
        }
        pl7.f9261o.setOnClickListener(new View.OnClickListener() { // from class: Y48.Ml
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportPreviewActivity.p0N(intRef, this, l3d, iRl, view);
            }
        });
        Pl pl8 = this.binding;
        if (pl8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pl3 = pl8;
        }
        pl3.ck.setOnClickListener(new View.OnClickListener() { // from class: Y48.I28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportPreviewActivity.Uf(intRef, this, l3d, iRl, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HBN(w6 w6Var, ExportPreviewActivity exportPreviewActivity, LinearLayoutManager linearLayoutManager, View view) {
        w6Var.ck(exportPreviewActivity.rvSelectedPosition + 1);
        linearLayoutManager.wKY(w6Var);
    }

    private final boolean JVN() {
        return ((Boolean) this.isSmartphone.getValue()).booleanValue();
    }

    private final void Lp6(File data, File saveToStorageTarget, String mimeType, int saveCompleteMsgId, boolean indexMedia, rWZ.n exportSnapshot) {
        if (saveToStorageTarget != null) {
            wKp();
            iF iFVarQZ6 = QZ6();
            Bundle bundle = new Bundle();
            bundle.putString("format", mimeType);
            bundle.putInt("duration_seconds", this.sceneTotalTime);
            bundle.putInt("width", this.exportWidth);
            bundle.putInt("height", this.exportHeight);
            bundle.putString("target", "save");
            Unit unit = Unit.INSTANCE;
            iFVarQZ6.n(new j.fuX("share_exportedmedia", bundle));
            String str = this.projectId;
            String[] strArr = str != null ? new String[]{str} : null;
            ActivityResultLauncher activityResultLauncher = this.saveToStorageActivityResultLauncher;
            Intent intentPutExtra = new Intent(this, (Class<?>) SaveToStorageActivity.class).putExtra("internalPath", data.getAbsolutePath()).putExtra("targetPath", saveToStorageTarget.getAbsolutePath()).putExtra("mimeType", mimeType).putExtra("saveCompleteMessage", getString(saveCompleteMsgId)).putExtra("indexMedia", indexMedia).putExtra("exportFormat", exportSnapshot != null ? exportSnapshot.KN() : 0).putExtra("projectIds", strArr);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            activityResultLauncher.n(intentPutExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qu(w6 w6Var, ExportPreviewActivity exportPreviewActivity, LinearLayoutManager linearLayoutManager, View view) {
        w6Var.ck(exportPreviewActivity.rvSelectedPosition - 1);
        linearLayoutManager.wKY(w6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T3L(ExportPreviewActivity exportPreviewActivity, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        exportPreviewActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Th() {
        this.handler.removeCallbacks(this.updateTimeTask);
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return;
        }
        exoPlayer.play();
        this.exportPreviewWeakReference = new WeakReference(this.playerView);
        Pl pl = this.binding;
        if (pl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl = null;
        }
        pl.f9262r.setImageDrawable(ResourcesCompat.J2(getResources(), 2131231866, getTheme()));
        this.handler.postDelayed(this.updateTimeTask, 100L);
    }

    private final void Toy() {
        Pl pl = this.binding;
        Pl pl3 = null;
        if (pl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl = null;
        }
        pl.nY.setVisibility(0);
        Pl pl4 = this.binding;
        if (pl4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pl3 = pl4;
        }
        pl3.f9259g.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uf(Ref.IntRef intRef, ExportPreviewActivity exportPreviewActivity, l3D l3d, int i2, View view) {
        intRef.element++;
        Pl pl = exportPreviewActivity.binding;
        Pl pl3 = null;
        if (pl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl = null;
        }
        pl.qie.setImageBitmap(l3d.n(intRef.element));
        Pl pl4 = exportPreviewActivity.binding;
        if (pl4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl4 = null;
        }
        pl4.ck.setEnabled(intRef.element != i2 + (-1));
        Pl pl5 = exportPreviewActivity.binding;
        if (pl5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl5 = null;
        }
        pl5.f9261o.setEnabled(intRef.element != 0);
        Pl pl6 = exportPreviewActivity.binding;
        if (pl6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pl3 = pl6;
        }
        pl3.az.setText((intRef.element + 1) + "/" + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zmq(ExportPreviewActivity exportPreviewActivity, View view) {
        ExoPlayer exoPlayer = exportPreviewActivity.player;
        if (exoPlayer == null) {
            return;
        }
        if (exoPlayer.isPlaying()) {
            exportPreviewActivity.vl();
            exportPreviewActivity.handler.removeCallbacks(exportPreviewActivity.updateTimeTask);
        } else {
            exoPlayer.seekTo(exportPreviewActivity.videoSeekToTime);
            exportPreviewActivity.Th();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Zn(com.alightcreative.share.n nVar) {
        return "onShareResult shareInfo=" + nVar;
    }

    private final void a63(File linkData, File qrData) {
        Uri uriKN = FileProvider.KN(this, "com.alightcreative.app.motion.fileprovider", linkData);
        Uri uriKN2 = FileProvider.KN(this, "com.alightcreative.app.motion.fileprovider", qrData);
        List list = this.contentUris;
        Intrinsics.checkNotNull(uriKN);
        list.add(uriKN);
        this.mimeTypes.add(MimeTypes.IMAGE_PNG);
        List list2 = this.contentUris;
        Intrinsics.checkNotNull(uriKN2);
        list2.add(uriKN2);
        this.mimeTypes.add(MimeTypes.IMAGE_PNG);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void f(List mimeTypes, List uris, File data) {
        Pl pl;
        Pl pl3;
        Pl pl4;
        Pl pl5;
        Pl pl6;
        Pl pl7;
        Pl pl8 = this.binding;
        if (pl8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl8 = null;
        }
        PlayerView playerView = pl8.J2;
        Pl pl9 = this.binding;
        if (pl9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl9 = null;
        }
        LinearLayout linearLayout = pl9.XQ;
        Pl pl10 = this.binding;
        if (pl10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl10 = null;
        }
        SimpleDraweeView simpleDraweeView = pl10.mUb;
        Pl pl11 = this.binding;
        if (pl11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl11 = null;
        }
        ConstraintLayout constraintLayout = pl11.gh;
        Pl pl12 = this.binding;
        if (pl12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl12 = null;
        }
        ImageView imageView = pl12.qie;
        Pl pl13 = this.binding;
        if (pl13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl13 = null;
        }
        RecyclerView recyclerView = pl13.WPU;
        Pl pl14 = this.binding;
        if (pl14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl14 = null;
        }
        RecyclerView recyclerView2 = pl14.aYN;
        Pl pl15 = this.binding;
        if (pl15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl15 = null;
        }
        ImageButton imageButton = pl15.f9258Z;
        Pl pl16 = this.binding;
        if (pl16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl16 = null;
        }
        Iterator it = CollectionsKt.listOf((Object[]) new View[]{playerView, linearLayout, simpleDraweeView, constraintLayout, imageView, recyclerView, recyclerView2, imageButton, pl16.Ik}).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(4);
        }
        String str = (String) mimeTypes.get(0);
        switch (str.hashCode()) {
            case -1487394660:
                if (!str.equals("image/jpeg")) {
                    return;
                }
                break;
            case -1248325150:
                if (str.equals("application/zip")) {
                    Pl pl17 = this.binding;
                    if (pl17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        pl17 = null;
                    }
                    pl17.gh.setVisibility(0);
                    Pl pl18 = this.binding;
                    if (pl18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        pl18 = null;
                    }
                    pl18.qie.setVisibility(0);
                    Bu(data);
                    Pl pl19 = this.binding;
                    if (pl19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        pl = null;
                    } else {
                        pl = pl19;
                    }
                    pl.ViF.setVisibility(8);
                    return;
                }
                return;
            case -879267568:
                if (str.equals("image/gif")) {
                    Pl pl20 = this.binding;
                    if (pl20 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        pl20 = null;
                    }
                    pl20.mUb.setVisibility(0);
                    SY6.j jVarBuild = ((Hwc.I28) Hwc.w6.Uo().rl((Uri) uris.get(0)).nY(true)).build();
                    Intrinsics.checkNotNullExpressionValue(jVarBuild, "build(...)");
                    Pl pl21 = this.binding;
                    if (pl21 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        pl3 = null;
                    } else {
                        pl3 = pl21;
                    }
                    pl3.mUb.setController(jVarBuild);
                    return;
                }
                return;
            case -879264467:
                if (!str.equals("image/jpg")) {
                    return;
                }
                break;
            case -879258763:
                if (!str.equals(MimeTypes.IMAGE_PNG)) {
                    return;
                }
                break;
            case 1331848029:
                if (str.equals("video/mp4")) {
                    Pl pl22 = this.binding;
                    if (pl22 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        pl22 = null;
                    }
                    LinearLayout previewBottomHolder = pl22.XQ;
                    Intrinsics.checkNotNullExpressionValue(previewBottomHolder, "previewBottomHolder");
                    previewBottomHolder.setVisibility(0);
                    if (uris.size() == 1) {
                        Pl pl23 = this.binding;
                        if (pl23 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            pl23 = null;
                        }
                        PlayerView exportPlayerView = pl23.J2;
                        Intrinsics.checkNotNullExpressionValue(exportPlayerView, "exportPlayerView");
                        exportPlayerView.setVisibility(0);
                        Pl pl24 = this.binding;
                        if (pl24 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            pl7 = null;
                        } else {
                            pl7 = pl24;
                        }
                        this.playerView = pl7.J2;
                        UF((Uri) uris.get(0));
                        return;
                    }
                    if (JVN()) {
                        Pl pl25 = this.binding;
                        if (pl25 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            pl6 = null;
                        } else {
                            pl6 = pl25;
                        }
                        RecyclerView previewItemList = pl6.WPU;
                        Intrinsics.checkNotNullExpressionValue(previewItemList, "previewItemList");
                        previewItemList.setVisibility(0);
                    } else {
                        Pl pl26 = this.binding;
                        if (pl26 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            pl26 = null;
                        }
                        RecyclerView previewItemListTablet = pl26.aYN;
                        Intrinsics.checkNotNullExpressionValue(previewItemListTablet, "previewItemListTablet");
                        previewItemListTablet.setVisibility(0);
                        Pl pl27 = this.binding;
                        if (pl27 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            pl27 = null;
                        }
                        pl27.f9258Z.setEnabled(this.rvSelectedPosition != 0);
                        Pl pl28 = this.binding;
                        if (pl28 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            pl28 = null;
                        }
                        pl28.Ik.setEnabled(this.rvSelectedPosition != uris.size() - 1);
                        Pl pl29 = this.binding;
                        if (pl29 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            pl29 = null;
                        }
                        ImageButton prevItemButton = pl29.f9258Z;
                        Intrinsics.checkNotNullExpressionValue(prevItemButton, "prevItemButton");
                        prevItemButton.setVisibility(0);
                        Pl pl30 = this.binding;
                        if (pl30 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            pl5 = null;
                        } else {
                            pl5 = pl30;
                        }
                        ImageButton nextItemButton = pl5.Ik;
                        Intrinsics.checkNotNullExpressionValue(nextItemButton, "nextItemButton");
                        nextItemButton.setVisibility(0);
                    }
                    ub(uris);
                    return;
                }
                return;
            default:
                return;
        }
        Pl pl31 = this.binding;
        if (pl31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl31 = null;
        }
        pl31.mUb.setVisibility(0);
        Pl pl32 = this.binding;
        if (pl32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl4 = null;
        } else {
            pl4 = pl32;
        }
        pl4.mUb.setImageURI(((Uri) uris.get(0)).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g6(ExportPreviewActivity exportPreviewActivity, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        exportPreviewActivity.Toy();
        if (result.getResultCode() == -1) {
            Pl pl = exportPreviewActivity.binding;
            if (pl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pl = null;
            }
            pl.nY.setImageDrawable(ResourcesCompat.J2(exportPreviewActivity.getResources(), 2131231659, exportPreviewActivity.getTheme()));
        }
    }

    private final boolean jO() {
        if (this.qrAlertShown) {
            return false;
        }
        nYs.j jVarInvoke = tFV().invoke();
        if (jVarInvoke != null && !jVarInvoke.s7N()) {
            return false;
        }
        nYs.j jVarInvoke2 = tFV().invoke();
        return (jVarInvoke2 != null ? jVarInvoke2.HI() : null) == ExportedVideoAttachment.QR_CODE_OUTRO && this.mimeTypes.size() > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n7b(rWZ.n nVar, int i2, ExportPreviewActivity exportPreviewActivity, int i3, File file, File file2, int i5, boolean z2, View view) {
        int i7;
        if (nVar != null) {
            if (i2 == 2131558444) {
                exportPreviewActivity.QZ6().n(new j.nH(rWZ.n.rl(nVar, 0L, 0L, null, 0, 0, 0, null, null, null, null, null, null, false, false, 0, 0, 0, 0, null, false, null, rWZ.j.Uo(DAz.f67201n), null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, false, false, -2097153, 31, null)));
            } else if (i2 != 2131558446) {
                exportPreviewActivity.QZ6().n(new j.QaP(nVar));
            } else {
                exportPreviewActivity.QZ6().n(new j.nH(rWZ.n.rl(nVar, 0L, 0L, null, 0, 0, 0, null, null, null, null, null, null, false, false, 0, 0, 0, 0, null, false, null, rWZ.j.Uo(DAz.f67202t), null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, false, false, -2097153, 31, null)));
            }
            i7 = 2131558444;
        } else {
            i7 = 2131558444;
        }
        if (i2 != i7) {
            exportPreviewActivity.Lp6(file, file2, (String) exportPreviewActivity.mimeTypes.get(i5), i3, z2, nVar);
        } else {
            afx.O(exportPreviewActivity).setPrimaryClip(ClipData.newPlainText("Alight Motion Project Link", exportPreviewActivity.getIntent().getStringExtra("TEMPLATE_LINK")));
            Toast.makeText(exportPreviewActivity, i3, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nO(int position, int type) {
        Pl pl = this.binding;
        Pl pl3 = null;
        if (pl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl = null;
        }
        pl.nY.setImageDrawable(ResourcesCompat.J2(getResources(), 2131231965, getTheme()));
        Toy();
        switch (type) {
            case 2131558448:
            case 2131558449:
                Pl pl4 = this.binding;
                if (pl4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pl4 = null;
                }
                LinearLayout previewBottomHolder = pl4.XQ;
                Intrinsics.checkNotNullExpressionValue(previewBottomHolder, "previewBottomHolder");
                aC.Uo(previewBottomHolder, 200L, null, 2, null);
                ExoPlayer exoPlayer = this.player;
                if (exoPlayer != null) {
                    exoPlayer.seekTo(this.videoSeekToTime);
                }
                Pl pl5 = this.binding;
                if (pl5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pl5 = null;
                }
                AppCompatSeekBar appCompatSeekBar = pl5.iF;
                ExoPlayer exoPlayer2 = this.player;
                appCompatSeekBar.setProgress(exoPlayer2 != null ? (int) exoPlayer2.getCurrentPosition() : 0);
                break;
            default:
                Pl pl6 = this.binding;
                if (pl6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pl6 = null;
                }
                LinearLayout previewBottomHolder2 = pl6.XQ;
                Intrinsics.checkNotNullExpressionValue(previewBottomHolder2, "previewBottomHolder");
                aC.nr(previewBottomHolder2, 200L, null, 2, null);
                ExoPlayer exoPlayer3 = this.player;
                if (exoPlayer3 != null && exoPlayer3.isPlaying()) {
                    vl();
                }
                break;
        }
        switch (type) {
            case 2131558444:
            case 2131558445:
                Pl pl7 = this.binding;
                if (pl7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pl7 = null;
                }
                pl7.te.setText(getResources().getText(2132020085));
                Pl pl8 = this.binding;
                if (pl8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pl3 = pl8;
                }
                pl3.E2.setText(getResources().getText(2132020146));
                v0j(position, 2131558444);
                break;
            case 2131558446:
            case 2131558447:
                Pl pl9 = this.binding;
                if (pl9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pl9 = null;
                }
                pl9.te.setText(getResources().getText(2132020086));
                Pl pl10 = this.binding;
                if (pl10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pl3 = pl10;
                }
                pl3.E2.setText(getResources().getText(2132020147));
                v0j(position, 2131558446);
                break;
            case 2131558448:
            case 2131558449:
                Pl pl11 = this.binding;
                if (pl11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pl11 = null;
                }
                pl11.te.setText(getResources().getText(2132020087));
                Pl pl12 = this.binding;
                if (pl12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pl3 = pl12;
                }
                pl3.E2.setText(getResources().getText(2132020148));
                v0j(position, 2131558448);
                break;
        }
    }

    static /* synthetic */ void o9(ExportPreviewActivity exportPreviewActivity, int i2, int i3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 2131558448;
        }
        exportPreviewActivity.v0j(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0N(Ref.IntRef intRef, ExportPreviewActivity exportPreviewActivity, l3D l3d, int i2, View view) {
        intRef.element--;
        Pl pl = exportPreviewActivity.binding;
        Pl pl3 = null;
        if (pl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl = null;
        }
        pl.qie.setImageBitmap(l3d.n(intRef.element));
        Pl pl4 = exportPreviewActivity.binding;
        if (pl4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl4 = null;
        }
        pl4.f9261o.setEnabled(intRef.element != 0);
        Pl pl5 = exportPreviewActivity.binding;
        if (pl5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl5 = null;
        }
        pl5.ck.setEnabled(intRef.element != i2 + (-1));
        Pl pl6 = exportPreviewActivity.binding;
        if (pl6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pl3 = pl6;
        }
        pl3.az.setText((intRef.element + 1) + "/" + i2);
    }

    private final void s() {
        this.handler.removeCallbacks(this.updateTimeTask);
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return;
        }
        this.videoSeekToTime = exoPlayer.getCurrentPosition();
        Pl pl = this.binding;
        Pl pl3 = null;
        if (pl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl = null;
        }
        pl.iF.setProgress(0);
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.onPause();
        }
        exoPlayer.release();
        this.player = null;
        this.exportPreviewWeakReference = null;
        Pl pl4 = this.binding;
        if (pl4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pl3 = pl4;
        }
        pl3.f9262r.setImageDrawable(ResourcesCompat.J2(getResources(), 2131231878, getTheme()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vl() {
        this.handler.removeCallbacks(this.updateTimeTask);
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return;
        }
        this.videoSeekToTime = exoPlayer.getCurrentPosition();
        exoPlayer.pause();
        Pl pl = null;
        this.exportPreviewWeakReference = null;
        Pl pl3 = this.binding;
        if (pl3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pl = pl3;
        }
        pl.f9262r.setImageDrawable(ResourcesCompat.J2(getResources(), 2131231878, getTheme()));
    }

    private final void wKp() {
        Pl pl = this.binding;
        Pl pl3 = null;
        if (pl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl = null;
        }
        pl.nY.setVisibility(4);
        Pl pl4 = this.binding;
        if (pl4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pl3 = pl4;
        }
        pl3.f9259g.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(final com.alightcreative.share.n shareInfo) {
        if (shareInfo instanceof n.C0679n) {
            C.Uo(this, new Function0() { // from class: Y48.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ExportPreviewActivity.Zn(shareInfo);
                }
            });
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar.setProjectsShared(jVar.getProjectsShared() + 1);
            iF iFVarQZ6 = QZ6();
            Bundle bundle = new Bundle();
            String str = this.mimeType;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mimeType");
                str = null;
            }
            bundle.putString("format", str);
            bundle.putInt("duration_seconds", this.sceneTotalTime);
            bundle.putInt("width", this.exportWidth);
            bundle.putInt("height", this.exportHeight);
            bundle.putString("target", ((n.C0679n) shareInfo).n());
            Unit unit = Unit.INSTANCE;
            iFVarQZ6.n(new j.fuX("share_exportedmedia", bundle));
        }
    }

    public final xAo.I28 F() {
        xAo.I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    public final void Mh(PlayerView playerView) {
        this.playerView = playerView;
    }

    public final iF QZ6() {
        iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void UF(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Pl pl = this.binding;
        Pl pl3 = null;
        if (pl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl = null;
        }
        pl.f9262r.setEnabled(false);
        MediaItem mediaItemFromUri = MediaItem.fromUri(uri);
        Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "fromUri(...)");
        if (this.player != null) {
            s();
        }
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(this).build();
        this.player = exoPlayerBuild;
        if (exoPlayerBuild != null) {
            exoPlayerBuild.addListener(new Ml(exoPlayerBuild));
            exoPlayerBuild.setSeekParameters(SeekParameters.EXACT);
            PlayerView playerView = this.playerView;
            if (playerView != null) {
                playerView.setPlayer(this.player);
            }
            exoPlayerBuild.clearMediaItems();
            exoPlayerBuild.setMediaItem(mediaItemFromUri);
            exoPlayerBuild.prepare();
            exoPlayerBuild.seekTo(this.videoSeekToTime);
        }
        PlayerView playerView2 = this.playerView;
        if (playerView2 != null) {
            playerView2.setOnTouchListener(new View.OnTouchListener() { // from class: Y48.Pl
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return ExportPreviewActivity.X4T(this.f12008n, view, motionEvent);
                }
            });
        }
        Pl pl4 = this.binding;
        if (pl4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl4 = null;
        }
        pl4.f9262r.setOnClickListener(new View.OnClickListener() { // from class: Y48.Xo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportPreviewActivity.Zmq(this.f12010n, view);
            }
        });
        Pl pl5 = this.binding;
        if (pl5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pl3 = pl5;
        }
        pl3.iF.setOnSeekBarChangeListener(new I28());
    }

    public final InterfaceC2210n VwL() {
        InterfaceC2210n interfaceC2210n = this.injet;
        if (interfaceC2210n != null) {
            return interfaceC2210n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injet");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str = this.mimeType;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mimeType");
            str = null;
        }
        if (Intrinsics.areEqual(str, "video/mp4")) {
            this.handler.removeCallbacks(this.updateTimeTask);
            this.handler.postDelayed(this.updateTimeTask, 100L);
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null) {
                exoPlayer.seekTo(this.videoSeekToTime);
            }
        }
        if (jO()) {
            this.qrAlertShown = true;
            new AlertDialog.Builder(this).o(2132019926).Uo(2132019925).setPositiveButton(2132019777, new DialogInterface.OnClickListener() { // from class: Y48.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ExportPreviewActivity.Vvq(dialogInterface, i2);
                }
            }).create().show();
        }
        super.onResume();
    }

    public final nYs.Ml tFV() {
        nYs.Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat EF(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insetsJ2 = windowInsetsCompat.J2(WindowInsetsCompat.Type.xMQ());
        Intrinsics.checkNotNull(view);
        view.setPadding(view.getPaddingLeft(), insetsJ2.rl, view.getPaddingRight(), insetsJ2.nr);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Vvq(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X4T(ExportPreviewActivity exportPreviewActivity, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Pl pl = exportPreviewActivity.binding;
            if (pl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pl = null;
            }
            pl.f9262r.performClick();
        }
        return true;
    }

    private final void mI() {
        QZ6().n(j.R6.f8446n);
        nYs.j jVarInvoke = tFV().invoke();
        if (jVarInvoke != null && jVarInvoke.Xw()) {
            GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new j(null), 3, null);
        } else {
            F().r(Z.f75270n, new Function1() { // from class: Y48.C
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ExportPreviewActivity.T3L(this.f12000n, (ComponentActivity) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uG(ExportPreviewActivity exportPreviewActivity, View view) {
        exportPreviewActivity.mI();
    }

    private final void ub(List uris) {
        RecyclerView recyclerView;
        Pl pl = null;
        if (JVN()) {
            Pl pl3 = this.binding;
            if (pl3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pl3 = null;
            }
            recyclerView = pl3.WPU;
            recyclerView.addItemDecoration(new IHa.j(2131165964));
        } else {
            Pl pl4 = this.binding;
            if (pl4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pl4 = null;
            }
            recyclerView = pl4.aYN;
        }
        Intrinsics.checkNotNull(recyclerView);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 0, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        com.alightcreative.export.preview.n nVar = new com.alightcreative.export.preview.n(uris, this, JVN());
        recyclerView.setAdapter(nVar);
        new n(recyclerView, nVar, uris).rl(recyclerView);
        final w6 w6Var = new w6(getApplicationContext());
        Pl pl5 = this.binding;
        if (pl5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl5 = null;
        }
        pl5.f9258Z.setOnClickListener(new View.OnClickListener() { // from class: Y48.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportPreviewActivity.Qu(w6Var, this, linearLayoutManager, view);
            }
        });
        Pl pl6 = this.binding;
        if (pl6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pl = pl6;
        }
        pl.Ik.setOnClickListener(new View.OnClickListener() { // from class: Y48.w6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportPreviewActivity.HBN(w6Var, this, linearLayoutManager, view);
            }
        });
    }

    private final void v0j(final int position, final int type) {
        String str;
        String str2;
        rWZ.n nVarRl;
        File fileResolve;
        int intExtra;
        final String stringExtra = getIntent().getStringExtra("CHOOSE_DLG_TITLE");
        Intrinsics.checkNotNull(stringExtra);
        final boolean booleanExtra = getIntent().getBooleanExtra("INDEX_MEDIA", false);
        this.exportWidth = getIntent().getIntExtra("EXPORT_WIDTH", -1);
        this.exportHeight = getIntent().getIntExtra("EXPORT_HEIGHT", -1);
        this.sceneTotalTime = getIntent().getIntExtra(esLNYym.UoOhvCGDByots, -1);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (type != 2131558444) {
            if (type != 2131558446) {
                str = "DATA_FILE";
            } else {
                str = "TEMPLATE_QR_DATA";
            }
        } else {
            str = "TEMPLATE_LINK_DATA";
        }
        Serializable serializableN = lej.n(intent, str, File.class);
        Intrinsics.checkNotNull(serializableN);
        final File file = (File) serializableN;
        Intent intent2 = getIntent();
        if (type == 2131558448) {
            str2 = "EXPORT_SNAPSHOT";
        } else {
            str2 = "TEMPLATE_TOGGLE_EXPORT_SNAPSHOT";
        }
        Bundle bundleExtra = intent2.getBundleExtra(str2);
        Pl pl = null;
        if (bundleExtra != null) {
            nVarRl = rWZ.w6.rl(bundleExtra);
        } else {
            nVarRl = null;
        }
        if (type == 2131558448) {
            Intent intent3 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
            fileResolve = (File) lej.n(intent3, "SAVETOSTORAGETARGET", File.class);
        } else {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            Intrinsics.checkNotNullExpressionValue(externalStoragePublicDirectory, "let(...)");
            fileResolve = FilesKt.resolve(FilesKt.resolve(externalStoragePublicDirectory, "Alight Motion"), getIntent().getStringExtra("TEMPLATE_TITLE") + " [" + System.currentTimeMillis() + "v" + position + "].jpg");
        }
        final File file2 = fileResolve;
        if (type == 2131558444) {
            intExtra = 2132017504;
        } else {
            intExtra = getIntent().getIntExtra("SAVE_COMPLETE_MSG", -1);
        }
        final int i2 = intExtra;
        Pl pl3 = this.binding;
        if (pl3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl3 = null;
        }
        LinearLayout linearLayout = pl3.ViF;
        final rWZ.n nVar = nVarRl;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: Y48.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportPreviewActivity.n7b(nVar, type, this, i2, file, file2, position, booleanExtra, view);
            }
        });
        Pl pl4 = this.binding;
        if (pl4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pl = pl4;
        }
        pl.fD.setOnClickListener(new View.OnClickListener() { // from class: Y48.qz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportPreviewActivity.Aum(type, nVar, this, position, stringExtra, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean xVH(ExportPreviewActivity exportPreviewActivity) {
        if (exportPreviewActivity.getResources().getConfiguration().screenWidthDp < 500.0f) {
            return true;
        }
        return false;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        mI();
    }

    @Override // com.alightcreative.export.preview.j, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Pl plT = Pl.t(getLayoutInflater());
        this.binding = plT;
        Pl pl = null;
        if (plT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            plT = null;
        }
        setContentView(plT.getRoot());
        Pl pl3 = this.binding;
        if (pl3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl3 = null;
        }
        ViewCompat.Org(pl3.getRoot(), new OnApplyWindowInsetsListener() { // from class: Y48.Dsr
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                return ExportPreviewActivity.EF(view, windowInsetsCompat);
            }
        });
        F().Ik(this);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        Serializable serializableN = lej.n(intent, "DATA_FILE", File.class);
        Intrinsics.checkNotNull(serializableN);
        File file = (File) serializableN;
        String stringExtra = getIntent().getStringExtra("MIMETYPE");
        Intrinsics.checkNotNull(stringExtra);
        this.mimeType = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("CHOOSE_DLG_TITLE");
        Intrinsics.checkNotNull(stringExtra2);
        Uri uriKN = FileProvider.KN(this, "com.alightcreative.app.motion.fileprovider", file);
        this.contentUri = uriKN;
        List list = this.contentUris;
        if (uriKN == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentUri");
            uriKN = null;
        }
        list.add(uriKN);
        List list2 = this.mimeTypes;
        String str = this.mimeType;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mimeType");
            str = null;
        }
        list2.add(str);
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        File file2 = (File) lej.n(intent2, "TEMPLATE_LINK_DATA", File.class);
        Intent intent3 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
        File file3 = (File) lej.n(intent3, "TEMPLATE_QR_DATA", File.class);
        if (file2 != null && file3 != null) {
            a63(file2, file3);
        }
        this.projectId = getIntent().getStringExtra("P_ID");
        f(this.mimeTypes, this.contentUris, file);
        Pl pl4 = this.binding;
        if (pl4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl4 = null;
        }
        pl4.xMQ.setText(stringExtra2);
        if (this.mimeTypes.size() == 1) {
            o9(this, 0, 0, 2, null);
        } else {
            nO(0, this.rvSelectedType);
        }
        Pl pl5 = this.binding;
        if (pl5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl5 = null;
        }
        pl5.f9256O.setOnClickListener(new View.OnClickListener() { // from class: Y48.aC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportPreviewActivity.uG(this.f12011n, view);
            }
        });
        Pl pl6 = this.binding;
        if (pl6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl6 = null;
        }
        pl6.ty.nr();
        Pl pl7 = this.binding;
        if (pl7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pl = pl7;
        }
        pl.HI.setVisibility(8);
    }

    @Override // com.alightcreative.export.preview.j, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        s();
        Pl pl = this.binding;
        Pl pl3 = null;
        if (pl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pl = null;
        }
        pl.ty.nr();
        Pl pl4 = this.binding;
        if (pl4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pl3 = pl4;
        }
        pl3.HI.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        vl();
        super.onPause();
    }
}
