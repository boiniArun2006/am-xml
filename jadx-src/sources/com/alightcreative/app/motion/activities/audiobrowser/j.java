package com.alightcreative.app.motion.activities.audiobrowser;

import D5a.Dsr;
import HI0.AsyncTaskC1374z;
import HI0.Q;
import HI0.eO;
import SJ0.Zs;
import XoT.C;
import XoT.qz;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.MediaPlayerCreateFailed;
import com.alightcreative.app.motion.persist.j;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import tu.SPz;
import tu.Z;
import tu.aC;
import tu.ci;
import tu.r;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001KB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0019\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u001d\u0010\"\u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0004R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/alightcreative/app/motion/activities/audiobrowser/j;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Ltu/Z;", "mediaInfo", "p5", "(Ltu/Z;)V", "rV9", "media", "", "E", "(Ltu/Z;)Z", "FX", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "audioList", "B", "(Ljava/util/List;)V", "onStop", "LSJ0/Zs;", c.f62177j, "LSJ0/Zs;", "_binding", "Lcom/alightcreative/app/motion/persist/j$j;", "t", "Lcom/alightcreative/app/motion/persist/j$j;", "audioBrowserMode", "LD5a/Dsr;", "O", "LD5a/Dsr;", "bucketMode", "", "J2", "Ljava/lang/String;", "bucketId", "r", "bucketName", "Landroid/media/MediaPlayer;", "o", "Landroid/media/MediaPlayer;", "audioPreviewPlayer", "Landroid/net/Uri;", "Z", "Landroid/net/Uri;", "audioPreviewQueuedUri", "Landroid/os/Handler;", "S", "Landroid/os/Handler;", "seekHandler", "Ljava/lang/Runnable;", "g", "Ljava/lang/Runnable;", "updateSeekBar", "v", "()LSJ0/Zs;", "binding", "E2", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioBucketFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioBucketFragment.kt\ncom/alightcreative/app/motion/activities/audiobrowser/AudioBucketFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AsyncTaskExt.kt\ncom/alightcreative/ext/AsyncTaskWrapper\n*L\n1#1,285:1\n1#2:286\n49#3,4:287\n71#3:291\n*S KotlinDebug\n*F\n+ 1 AudioBucketFragment.kt\ncom/alightcreative/app/motion/activities/audiobrowser/AudioBucketFragment\n*L\n207#1:287,4\n207#1:291\n*E\n"})
public final class j extends Fragment {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f44895e = 8;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private Uri audioPreviewQueuedUri;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Zs _binding;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private MediaPlayer audioPreviewPlayer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private j.EnumC0648j audioBrowserMode = j.EnumC0648j.f45855n;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Dsr bucketMode = Dsr.f1304r;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private String bucketId = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private String bucketName = "";

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Handler seekHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Runnable updateSeekBar = new Wre();

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function1 {
        I28(Object obj) {
            super(1, obj, j.class, "showMediaInfo", "showMediaInfo(Lcom/alightcreative/mediacore/mediainfo/MediaSummaryInfo;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Z p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Boolean.valueOf(((j) this.receiver).E(p0));
        }
    }

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function1 {
        Ml(Object obj) {
            super(1, obj, j.class, "onItemPlayPauseClicked", "onItemPlayPauseClicked(Lcom/alightcreative/mediacore/mediainfo/MediaSummaryInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Z) obj);
            return Unit.INSTANCE;
        }

        public final void n(Z p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((j) this.receiver).rV9(p0);
        }
    }

    public static final class Wre implements Runnable {
        Wre() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.seekHandler.removeCallbacks(this);
            MediaPlayer mediaPlayer = j.this.audioPreviewPlayer;
            if (mediaPlayer == null) {
                return;
            }
            int currentPosition = mediaPlayer.getCurrentPosition();
            RecyclerView.Adapter adapter = j.this.v().J2.getAdapter();
            D5a.j jVar = adapter instanceof D5a.j ? (D5a.j) adapter : null;
            if (jVar != null) {
                jVar.nY(currentPosition);
            }
            j.this.seekHandler.postDelayed(this, 15L);
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.audiobrowser.j$j, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ j rl(Companion companion, String str, Long l2, String str2, String str3, Long l5, String str4, String str5, String str6, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                l2 = null;
            }
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            if ((i2 & 8) != 0) {
                str3 = null;
            }
            if ((i2 & 16) != 0) {
                l5 = null;
            }
            if ((i2 & 32) != 0) {
                str4 = null;
            }
            if ((i2 & 64) != 0) {
                str5 = null;
            }
            if ((i2 & 128) != 0) {
                str6 = null;
            }
            return companion.n(str, l2, str2, str3, l5, str4, str5, str6);
        }

        public final j n(String browserMode, Long l2, String str, String str2, Long l5, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(browserMode, "browserMode");
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putString("audioBrowserMode", browserMode);
            if (l2 != null) {
                bundle.putLong("genreId", l2.longValue());
            }
            if (str != null) {
                bundle.putString("genreName", str);
            }
            if (l5 != null) {
                bundle.putLong("albumId", l5.longValue());
            }
            if (str3 != null) {
                bundle.putString("albumName", str3);
            }
            if (str2 != null) {
                bundle.putString("artistName", str2);
            }
            if (str4 != null) {
                bundle.putString("bucketId", str4);
            }
            if (str5 != null) {
                bundle.putString("bucketName", str5);
            }
            jVar.setArguments(bundle);
            return jVar;
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.EnumC0648j.values().length];
            try {
                iArr[j.EnumC0648j.f45855n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.EnumC0648j.f45858t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.EnumC0648j.f45853O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.EnumC0648j.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j.EnumC0648j.f45857r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {
        w6(Object obj) {
            super(1, obj, j.class, "onMediaSelected", "onMediaSelected(Lcom/alightcreative/mediacore/mediainfo/MediaSummaryInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Z) obj);
            return Unit.INSTANCE;
        }

        public final void n(Z p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((j) this.receiver).p5(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(j jVar, Unit unit) {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        Zs zs = jVar._binding;
        if (zs != null && (recyclerView = zs.J2) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    private final void FX() {
        this.seekHandler.removeCallbacks(this.updateSeekBar);
        MediaPlayer mediaPlayer = this.audioPreviewPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = this.audioPreviewPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.audioPreviewPlayer = null;
        this.audioPreviewQueuedUri = null;
        RecyclerView.Adapter adapter = v().J2.getAdapter();
        D5a.j jVar = adapter instanceof D5a.j ? (D5a.j) adapter : null;
        if (jVar != null) {
            jVar.iF(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String P5() {
        return "MediaPlayerCreateFailed, MediaPlayer object is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(j jVar, MediaPlayerCreateFailed mediaPlayerCreateFailed) {
        Intrinsics.checkNotNullParameter(mediaPlayerCreateFailed, "<unused var>");
        C.mUb(jVar, new Function0() { // from class: m.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.app.motion.activities.audiobrowser.j.P5();
            }
        });
        jVar.FX();
        new AlertDialog.Builder(jVar.getContext()).setMessage(2132019599).setNegativeButton("OK", new DialogInterface.OnClickListener() { // from class: m.QJ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                com.alightcreative.app.motion.activities.audiobrowser.j.M7(dialogInterface, i2);
            }
        }).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Xw(final j jVar, Z z2, MediaPlayer newPlayer) {
        Intrinsics.checkNotNullParameter(newPlayer, "newPlayer");
        if (Intrinsics.areEqual(jVar.audioPreviewQueuedUri, z2.nY())) {
            jVar.seekHandler.removeCallbacks(jVar.updateSeekBar);
            MediaPlayer mediaPlayer = jVar.audioPreviewPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = jVar.audioPreviewPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            jVar.audioPreviewPlayer = newPlayer;
            jVar.audioPreviewQueuedUri = null;
            newPlayer.start();
            RecyclerView.Adapter adapter = jVar.v().J2.getAdapter();
            D5a.j jVar2 = adapter instanceof D5a.j ? (D5a.j) adapter : null;
            if (jVar2 != null) {
                jVar2.fD(newPlayer.getDuration());
            }
            jVar.seekHandler.postDelayed(jVar.updateSeekBar, 15L);
            newPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: m.l3D
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer3) {
                    com.alightcreative.app.motion.activities.audiobrowser.j.jB(this.f70587n, mediaPlayer3);
                }
            });
        } else {
            newPlayer.release();
        }
        return Unit.INSTANCE;
    }

    private final void a() {
        if (this.bucketMode != Dsr.f1304r) {
            v().Uo.setText(this.bucketName);
            return;
        }
        int i2 = n.$EnumSwitchMapping$0[this.audioBrowserMode.ordinal()];
        if (i2 == 1) {
            v().Uo.setText(2132017290);
            return;
        }
        if (i2 == 2) {
            v().Uo.setText(2132017284);
            return;
        }
        if (i2 == 3) {
            v().Uo.setText(2132017285);
        } else if (i2 == 4) {
            v().Uo.setText(2132017288);
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            v().Uo.setText(2132017287);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Zs v() {
        Zs zs = this._binding;
        Intrinsics.checkNotNull(zs);
        return zs;
    }

    public void B(final List audioList) {
        Object next;
        boolean zContains$default;
        Object next2;
        Intrinsics.checkNotNullParameter(audioList, "audioList");
        j.EnumC0648j enumC0648j = this.audioBrowserMode;
        if (enumC0648j == j.EnumC0648j.J2) {
            Iterator it = audioList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (Intrinsics.areEqual(((Z) next2).r(), getResources().getString(2132020367))) {
                        break;
                    }
                }
            }
            Z z2 = (Z) next2;
            if (z2 != null) {
                qz.O(audioList, audioList.indexOf(z2), 0);
            }
        } else if (enumC0648j == j.EnumC0648j.f45853O) {
            Iterator it2 = audioList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                String strJ2 = ((Z) next).J2();
                if (strJ2 != null) {
                    String string = getResources().getString(2132020367);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String lowerCase = string.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    zContains$default = StringsKt.contains$default((CharSequence) strJ2, (CharSequence) lowerCase, false, 2, (Object) null);
                } else {
                    zContains$default = false;
                }
                if (zContains$default) {
                    break;
                }
            }
            Z z3 = (Z) next;
            if (z3 != null) {
                qz.O(audioList, audioList.indexOf(z3), 0);
            }
        }
        if (this._binding == null) {
            return;
        }
        RecyclerView recyclerView = v().J2;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        linearLayoutManager.MPw(10);
        linearLayoutManager.Ro(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = v().J2;
        RecyclerView.Adapter adapter = v().J2.getAdapter();
        D5a.j jVar = adapter instanceof D5a.j ? (D5a.j) adapter : null;
        recyclerView2.setAdapter(new D5a.j(audioList, jVar != null ? jVar.XQ() : null, this.audioBrowserMode, this.bucketMode, new w6(this), new Ml(this), new I28(this)));
        HI0.qz.nr(null, new Function0() { // from class: m.aC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.app.motion.activities.audiobrowser.j.J(this.f70583n, audioList);
            }
        }, 1, null).Uo(new Function1() { // from class: m.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.app.motion.activities.audiobrowser.j.D(this.f70575n, (Unit) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = Zs.t(inflater, container, false);
        DrawerLayout drawerLayoutRl = v().getRoot();
        Intrinsics.checkNotNullExpressionValue(drawerLayoutRl, "getRoot(...)");
        return drawerLayoutRl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        v().rl.setOnClickListener(new View.OnClickListener() { // from class: m.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                com.alightcreative.app.motion.activities.audiobrowser.j.eF(this.f70589n, view2);
            }
        });
        a();
        FragmentActivity activity = getActivity();
        AudioBrowserActivity audioBrowserActivity = activity instanceof AudioBrowserActivity ? (AudioBrowserActivity) activity : null;
        if (audioBrowserActivity != null) {
            audioBrowserActivity.UhV(this.audioBrowserMode, this.bucketMode, this.bucketId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E(Z media) {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        aC aCVar = null;
        SPz sPzTe = r.te(new Q(context), media.nY(), false, 4, null);
        if (sPzTe instanceof aC) {
            aCVar = (aC) sPzTe;
        }
        if (aCVar == null) {
            Toast.makeText(context, 2132018962, 0).show();
            return false;
        }
        new AlertDialog.Builder(context).setMessage((((((("title: " + aCVar.mUb() + "\n") + "mimeType: " + aCVar.KN() + "\n") + "fullySupported: " + r.az(aCVar) + "\n") + "duration: " + aCVar.t() + "\n") + "bitrate: " + aCVar.rl() + "\n") + "fileSize: " + aCVar.nr() + "\n") + aCVar.n() + "\n").setPositiveButton(2132017436, new DialogInterface.OnClickListener() { // from class: m.eO
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                com.alightcreative.app.motion.activities.audiobrowser.j.M(dialogInterface, i2);
            }
        }).create().show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(j jVar, List list) {
        Context context = jVar.getContext();
        if (context != null) {
            ci.t(list, context);
            return Unit.INSTANCE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M7(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaPlayer bzg(j jVar, Z z2) throws MediaPlayerCreateFailed {
        MediaPlayer mediaPlayerCreate = MediaPlayer.create(jVar.getContext(), z2.nY());
        if (mediaPlayerCreate != null) {
            return mediaPlayerCreate;
        }
        throw new MediaPlayerCreateFailed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eF(j jVar, View view) {
        if (jVar.isAdded()) {
            jVar.getParentFragmentManager().Zmq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jB(j jVar, MediaPlayer mediaPlayer) {
        jVar.FX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p5(Z mediaInfo) {
        AudioBrowserActivity audioBrowserActivity;
        FragmentActivity activity = getActivity();
        if (activity instanceof AudioBrowserActivity) {
            audioBrowserActivity = (AudioBrowserActivity) activity;
        } else {
            audioBrowserActivity = null;
        }
        if (audioBrowserActivity != null) {
            audioBrowserActivity.EWS(mediaInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rV9(final Z mediaInfo) {
        D5a.j jVar;
        Uri uriXQ;
        D5a.j jVar2;
        RecyclerView.Adapter adapter = v().J2.getAdapter();
        D5a.j jVar3 = null;
        if (adapter instanceof D5a.j) {
            jVar = (D5a.j) adapter;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            uriXQ = jVar.XQ();
        } else {
            uriXQ = null;
        }
        if (Intrinsics.areEqual(uriXQ, mediaInfo.nY())) {
            MediaPlayer mediaPlayer = this.audioPreviewPlayer;
            if (mediaPlayer != null) {
                RecyclerView.Adapter adapter2 = v().J2.getAdapter();
                if (adapter2 instanceof D5a.j) {
                    jVar3 = (D5a.j) adapter2;
                }
                if (jVar3 != null) {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                        jVar3.g(false);
                        jVar3.notifyItemChanged(jVar3.Z());
                        this.seekHandler.removeCallbacks(this.updateSeekBar);
                        return;
                    }
                    mediaPlayer.start();
                    jVar3.g(true);
                    jVar3.notifyItemChanged(jVar3.Z());
                    this.seekHandler.postDelayed(this.updateSeekBar, 15L);
                    return;
                }
                return;
            }
            return;
        }
        if (this.audioPreviewQueuedUri == null) {
            RecyclerView.Adapter adapter3 = v().J2.getAdapter();
            if (adapter3 instanceof D5a.j) {
                jVar2 = (D5a.j) adapter3;
            } else {
                jVar2 = null;
            }
            if (jVar2 != null) {
                jVar2.iF(mediaInfo.nY());
            }
            this.audioPreviewQueuedUri = mediaInfo.nY();
            AsyncTaskC1374z asyncTaskC1374zUo = HI0.qz.nr(null, new Function0() { // from class: m.qz
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.alightcreative.app.motion.activities.audiobrowser.j.bzg(this.f70590n, mediaInfo);
                }
            }, 1, null).Uo(new Function1() { // from class: m.Pl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.alightcreative.app.motion.activities.audiobrowser.j.Xw(this.f70579n, mediaInfo, (MediaPlayer) obj);
                }
            });
            Function1 function1 = new Function1() { // from class: m.Xo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.alightcreative.app.motion.activities.audiobrowser.j.U(this.f70582n, (MediaPlayerCreateFailed) obj);
                }
            };
            if (asyncTaskC1374zUo.getStatus() == AsyncTask.Status.PENDING) {
                asyncTaskC1374zUo.J2(new eO(asyncTaskC1374zUo.nr(), Reflection.getOrCreateKotlinClass(MediaPlayerCreateFailed.class), asyncTaskC1374zUo, function1));
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null && (string6 = arguments.getString("audioBrowserMode")) != null) {
            this.audioBrowserMode = j.EnumC0648j.valueOf(string6);
        }
        Bundle arguments2 = getArguments();
        String str = "?";
        if (arguments2 != null && (string4 = arguments2.getString("bucketId")) != null && string4.length() > 0) {
            this.bucketMode = Dsr.J2;
            this.bucketId = string4;
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (string5 = arguments3.getString("bucketName")) == null) {
                string5 = "?";
            }
            this.bucketName = string5;
            this.audioBrowserMode = j.EnumC0648j.f45857r;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            long j2 = arguments4.getLong("albumId", -1L);
            if (j2 != -1) {
                this.bucketMode = Dsr.f1302n;
                this.bucketId = String.valueOf(j2);
                Bundle arguments5 = getArguments();
                if (arguments5 == null || (string3 = arguments5.getString("albumName")) == null) {
                    string3 = "?";
                }
                this.bucketName = string3;
                this.audioBrowserMode = j.EnumC0648j.f45858t;
            }
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (string2 = arguments6.getString("artistName")) != null && string2.length() > 0) {
            this.bucketMode = Dsr.f1305t;
            this.bucketId = string2;
            this.bucketName = string2;
            this.audioBrowserMode = j.EnumC0648j.f45853O;
        }
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            long j3 = arguments7.getLong("genreId", -1L);
            if (j3 != -1) {
                this.bucketMode = Dsr.f1300O;
                this.bucketId = String.valueOf(j3);
                Bundle arguments8 = getArguments();
                if (arguments8 != null && (string = arguments8.getString("genreName")) != null) {
                    str = string;
                }
                this.bucketName = str;
                this.audioBrowserMode = j.EnumC0648j.J2;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        FX();
        super.onStop();
    }
}
