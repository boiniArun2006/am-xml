package yc;

import CHm.j;
import HI0.AsyncTaskC1374z;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.MediaPlayerCreateFailed;
import com.alightcreative.app.motion.activities.VS;
import com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity;
import com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser;
import com.alightcreative.app.motion.scene.Scene;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Y5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EditActivity f75897n;
    private final HI0.l4Z nr;
    private final SJ0.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final VS f75898t;

    public static final class n implements Grouping {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Iterable f75899n;

        public n(Iterable iterable) {
            this.f75899n = iterable;
        }

        @Override // kotlin.collections.Grouping
        public Object keyOf(Object obj) {
            return ((tu.Z) obj).KN();
        }

        @Override // kotlin.collections.Grouping
        public Iterator sourceIterator() {
            return this.f75899n.iterator();
        }
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[tu.Ew.values().length];
            try {
                iArr[tu.Ew.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tu.Ew.f73884r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[tu.Ew.f73883o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[tu.Ew.f73880Z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Y5(final EditActivity activity, SJ0.Wre addPopupBinding, VS editAddDelegate) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(addPopupBinding, "addPopupBinding");
        Intrinsics.checkNotNullParameter(editAddDelegate, "editAddDelegate");
        this.f75897n = activity;
        this.rl = addPopupBinding;
        this.f75898t = editAddDelegate;
        this.nr = new HI0.l4Z(nSC.f76070n, new Function0() { // from class: yc.cA
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y5.ViF(this.f75926n);
            }
        }).KN(new Function1() { // from class: yc.h6y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y5.nY(activity, this, (Triple) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E2(final SJ0.Wre wre, final Y5 y5, final tu.Z mediaInfo) {
        Intrinsics.checkNotNullParameter(mediaInfo, "mediaInfo");
        RecyclerView.Adapter adapter = wre.rl.getAdapter();
        C c2 = adapter instanceof C ? (C) adapter : null;
        if (Intrinsics.areEqual(c2 != null ? c2.Ik() : null, mediaInfo.nY())) {
            y5.f75897n.C6();
        } else if (y5.f75897n.getAudioPreviewQueuedUri() == null) {
            RecyclerView.Adapter adapter2 = wre.rl.getAdapter();
            C c4 = adapter2 instanceof C ? (C) adapter2 : null;
            if (c4 != null) {
                c4.S(mediaInfo.nY());
            }
            y5.f75897n.tp(mediaInfo.nY());
            AsyncTaskC1374z asyncTaskC1374zUo = HI0.qz.nr(null, new Function0() { // from class: yc.T
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Y5.e(this.f75852n, mediaInfo);
                }
            }, 1, null).Uo(new Function1() { // from class: yc.V1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Y5.X(this.f75887n, mediaInfo, (MediaPlayer) obj);
                }
            });
            Function1 function1 = new Function1() { // from class: yc.oXP
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Y5.T(wre, y5, (MediaPlayerCreateFailed) obj);
                }
            };
            if (asyncTaskC1374zUo.getStatus() != AsyncTask.Status.PENDING) {
                throw new IllegalStateException("Check failed.");
            }
            asyncTaskC1374zUo.J2(new HI0.eO(asyncTaskC1374zUo.nr(), Reflection.getOrCreateKotlinClass(MediaPlayerCreateFailed.class), asyncTaskC1374zUo, function1));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M7(SJ0.Wre wre, View view, int i2, int i3, int i5, int i7) {
        ImageButton mediaListCue = wre.f9388o;
        Intrinsics.checkNotNullExpressionValue(mediaListCue, "mediaListCue");
        mediaListCue.setVisibility(wre.Uo.computeHorizontalScrollOffset() != 0 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String N() {
        return "MediaPlayerCreateFailed, MediaPlayer object is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P5(Y5 y5) {
        y5.nr.nr();
        return Unit.INSTANCE;
    }

    private final boolean S() {
        String mediaBucketId;
        EditActivity editActivity = this.f75897n;
        return Intrinsics.areEqual("All", editActivity.getMediaBucketId()) || (mediaBucketId = editActivity.getMediaBucketId()) == null || StringsKt.isBlank(mediaBucketId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(SJ0.Wre wre, Y5 y5, MediaPlayerCreateFailed mediaPlayerCreateFailed) {
        Intrinsics.checkNotNullParameter(mediaPlayerCreateFailed, "<unused var>");
        XoT.C.mUb(wre, new Function0() { // from class: yc.U4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y5.N();
            }
        });
        y5.f75897n.C6();
        new AlertDialog.Builder(y5.f75897n).Uo(2132019599).mUb("OK", new DialogInterface.OnClickListener() { // from class: yc.lS
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Y5.nHg(dialogInterface, i2);
            }
        }).XQ();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(final Y5 y5) {
        HI0.Ml.ty(y5.f75897n, j.Ml.KN, 0, null, new Function0() { // from class: yc.crp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y5.P5(this.f75947n);
            }
        }, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(Y5 y5, tu.Z z2, MediaPlayer newPlayer) {
        Intrinsics.checkNotNullParameter(newPlayer, "newPlayer");
        if (Intrinsics.areEqual(y5.f75897n.getAudioPreviewQueuedUri(), z2.nY())) {
            MediaPlayer audioPreviewPlayer = y5.f75897n.getAudioPreviewPlayer();
            if (audioPreviewPlayer != null) {
                audioPreviewPlayer.stop();
            }
            MediaPlayer audioPreviewPlayer2 = y5.f75897n.getAudioPreviewPlayer();
            if (audioPreviewPlayer2 != null) {
                audioPreviewPlayer2.release();
            }
            y5.f75897n.Pt(newPlayer);
            y5.f75897n.tp(null);
            newPlayer.start();
        } else {
            newPlayer.release();
        }
        return Unit.INSTANCE;
    }

    private final Triple aYN() {
        List list;
        List arrayList;
        List listEmptyList;
        tu.Z zRl;
        List listKN = XoT.fuX.ty(this.f75897n) ? tu.ci.KN(this.f75897n, SetsKt.setOf(tu.Ew.f73883o), tu.g9s.f73966t.t()) : CollectionsKt.emptyList();
        if (!XoT.fuX.ck(this.f75897n)) {
            return new Triple(CollectionsKt.emptyList(), listKN, new ArrayList());
        }
        List listRl = D5a.O.rl(tu.ci.xMQ(this.f75897n, tu.Ew.f73882n.rl(), null, 4, null), this.f75897n.rst());
        tu.Z z2 = (tu.Z) CollectionsKt.firstOrNull(listRl);
        if (z2 != null) {
            n nVar = new n(listRl);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator itSourceIterator = nVar.sourceIterator();
            while (true) {
                boolean z3 = false;
                if (!itSourceIterator.hasNext()) {
                    break;
                }
                Object next = itSourceIterator.next();
                Object objKeyOf = nVar.keyOf(next);
                Object obj = linkedHashMap.get(objKeyOf);
                if (obj == null && !linkedHashMap.containsKey(objKeyOf)) {
                    z3 = true;
                }
                tu.Z z4 = (tu.Z) next;
                tu.Z z5 = (tu.Z) obj;
                if (z3) {
                    zRl = tu.Z.rl(z4, null, tu.Ew.f73880Z, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217533, null);
                } else {
                    Intrinsics.checkNotNull(z5);
                    zRl = tu.Z.rl(z5, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, z5.xMQ() + 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217535, null);
                }
                linkedHashMap.put(objKeyOf, zRl);
            }
            List mutableList = CollectionsKt.toMutableList(linkedHashMap.values());
            list = listRl;
            mutableList.add(0, tu.Z.rl(z2, null, tu.Ew.f73880Z, 0L, null, null, null, null, null, 0L, null, null, null, this.f75897n.getResources().getString(2132017237), "All", 0, 0, 0, 0L, 0L, listRl.size() + 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073205245, null));
            arrayList = mutableList;
        } else {
            list = listRl;
            arrayList = new ArrayList();
        }
        String mediaBucketId = this.f75897n.getMediaBucketId();
        if (mediaBucketId == null || StringsKt.isBlank(mediaBucketId)) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            for (Object obj2 : list) {
                if (Intrinsics.areEqual(((tu.Z) obj2).KN(), this.f75897n.getMediaBucketId())) {
                    listEmptyList.add(obj2);
                }
            }
        }
        String mediaBucketId2 = this.f75897n.getMediaBucketId();
        if (mediaBucketId2 != null && !StringsKt.isBlank(mediaBucketId2) && listEmptyList.isEmpty()) {
            this.f75897n.rH("All");
            EditActivity editActivity = this.f75897n;
            editActivity.aP(editActivity.getResources().getString(2132017237));
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar.setMediaBucketID("All");
            jVar.setMediaBucketName(this.f75897n.getResources().getString(2132017237));
        }
        return !S() ? new Triple(listEmptyList, listKN, arrayList) : new Triple(list, listKN, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bzg(List list, final Y5 y5, final SJ0.Wre wre, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!list.isEmpty()) {
            EditActivity editActivity = y5.f75897n;
            com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(editActivity, editActivity.rst(), false, 4, null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final tu.Z z2 = (tu.Z) it.next();
                String strUo = z2.Uo();
                if (strUo == null) {
                    strUo = "?";
                }
                com.alightcreative.widget.nKK.ck(nkk, strUo, null, false, null, new Function0() { // from class: yc.Ogx
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Y5.Xw(this.f75824n, z2);
                    }
                }, 14, null);
            }
            nkk.X(y5.f75897n.getResources().getDimensionPixelSize(2131166272));
            com.alightcreative.widget.nKK.N(nkk, view, 0, 0, new Function0() { // from class: yc.DC
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Y5.jB(wre);
                }
            }, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaPlayer e(Y5 y5, tu.Z z2) throws MediaPlayerCreateFailed {
        MediaPlayer mediaPlayerCreate = MediaPlayer.create(y5.f75897n, z2.nY());
        if (mediaPlayerCreate != null) {
            return mediaPlayerCreate;
        }
        throw new MediaPlayerCreateFailed();
    }

    private final void eF(tu.Z z2) {
        EditActivity editActivity = this.f75897n;
        editActivity.rH(z2.KN());
        editActivity.aP(z2.Uo());
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        String strKN = z2.KN();
        if (strKN == null) {
            strKN = "All";
        }
        jVar.setMediaBucketID(strKN);
        String strUo = z2.Uo();
        if (strUo == null) {
            strUo = editActivity.getResources().getString(2132017237);
            Intrinsics.checkNotNullExpressionValue(strUo, "getString(...)");
        }
        jVar.setMediaBucketName(strUo);
        RecyclerView.Adapter adapter = this.rl.Uo.getAdapter();
        g9s g9sVar = adapter instanceof g9s ? (g9s) adapter : null;
        if (g9sVar != null) {
            g9sVar.Z(editActivity.getMediaBucketName());
        }
        RecyclerView.Adapter adapter2 = this.rl.Uo.getAdapter();
        g9s g9sVar2 = adapter2 instanceof g9s ? (g9s) adapter2 : null;
        if (g9sVar2 != null) {
            g9sVar2.notifyItemChanged(0);
        }
        this.nr.nr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fD(Y5 y5, tu.Z it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = j.$EnumSwitchMapping$0[it.ViF().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                y5.f75898t.az(it.nY(), false);
                y5.f75897n.UCQ(true);
                return Unit.INSTANCE;
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void g(final SJ0.Wre wre, List list) {
        RecyclerView recyclerView = wre.rl;
        int i2 = 0;
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this.f75897n, 2, 0, false);
        gridLayoutManager.MPw(10);
        gridLayoutManager.Ro(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        List listT = com.alightcreative.app.motion.persist.j.INSTANCE.getRecentlyUsedAudios().t();
        ArrayList arrayList = new ArrayList();
        Iterator it = listT.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.areEqual(((tu.Z) next).nY().getPath(), str)) {
                    obj = next;
                    break;
                }
            }
            tu.Z z2 = (tu.Z) obj;
            if (z2 != null) {
                arrayList.add(z2);
            }
        }
        List listTake = CollectionsKt.take(arrayList, 3);
        final List mutableList = CollectionsKt.toMutableList((Collection) list);
        Iterator it3 = listTake.iterator();
        while (it3.hasNext()) {
            mutableList.add(i2, (tu.Z) it3.next());
            i2++;
        }
        HI0.qz.nr(null, new Function0() { // from class: yc.tI
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y5.te(mutableList, this);
            }
        }, 1, null).Uo(new Function1() { // from class: yc.Pmq
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y5.iF(wre, (Unit) obj);
            }
        });
        RecyclerView recyclerView2 = wre.rl;
        List list2 = CollectionsKt.toList(mutableList);
        RecyclerView.Adapter adapter = wre.rl.getAdapter();
        C c2 = adapter instanceof C ? (C) adapter : null;
        recyclerView2.setAdapter(new C(list2, listTake, c2 != null ? c2.Ik() : null, new Function1() { // from class: yc.mrQ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y5.fD(this.f76028n, (tu.Z) obj);
            }
        }, new Function1() { // from class: yc.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y5.E2(wre, this, (tu.Z) obj);
            }
        }, new Function0() { // from class: yc.Pp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y5.s7N(this.f75832n);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit iF(SJ0.Wre wre, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RecyclerView.Adapter adapter = wre.rl.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jB(SJ0.Wre wre) {
        RecyclerView.Adapter adapter = wre.Uo.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nY(EditActivity editActivity, Y5 y5, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "<destruct>");
        List list = (List) triple.component1();
        List list2 = (List) triple.component2();
        List list3 = (List) triple.component3();
        int i2 = 0;
        boolean z2 = !XoT.fuX.ck(editActivity) && editActivity.getSelectedAddPopupTab() == EditActivity.j.f44485t;
        boolean z3 = !XoT.fuX.ty(editActivity) && editActivity.getSelectedAddPopupTab() == EditActivity.j.f44480O;
        ConstraintLayout constraintLayout = y5.rl.f9381S;
        if (!z2 && !z3) {
            i2 = 4;
        }
        constraintLayout.setVisibility(i2);
        if (XoT.fuX.ck(editActivity)) {
            y5.wTp(y5.rl, list, list3);
        }
        if (XoT.fuX.ty(editActivity)) {
            y5.g(y5.rl, list2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p5(SJ0.Wre wre, View view) {
        wre.Uo.smoothScrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rV9(Y5 y5) {
        EditActivity editActivity = y5.f75897n;
        Scene sceneG = HW.C.g(editActivity);
        Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[]{TuplesKt.to("projectFPS", Integer.valueOf(sceneG != null ? sceneG.getFramesPerHundredSeconds() / 100 : 30)), TuplesKt.to("projectId", y5.f75897n.Uo())}, 2);
        Intent intent = new Intent(editActivity, (Class<?>) MediaBrowser.class);
        intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(editActivity, intent, 11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s7N(Y5 y5) {
        EditActivity editActivity = y5.f75897n;
        Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[]{TuplesKt.to("projectId", editActivity.Uo())}, 1);
        Intent intent = new Intent(editActivity, (Class<?>) AudioBrowserActivity.class);
        intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(editActivity, intent, 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit te(List list, Y5 y5) {
        tu.ci.t(list, y5.f75897n);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Y5 y5, tu.Z it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = j.$EnumSwitchMapping$0[it.ViF().ordinal()];
        if (i2 == 1) {
            VS.WPU(y5.f75898t, it.nY(), false, false, 0, 12, null);
        } else {
            if (i2 != 2) {
                if (i2 == 3 || i2 == 4) {
                    throw new IllegalStateException();
                }
                throw new NoWhenBranchMatchedException();
            }
            VS.bzg(y5.f75898t, it.nY(), false, false, 0, 0, 0, 60, null);
        }
        y5.f75897n.UCQ(true);
        return Unit.INSTANCE;
    }

    public final HI0.l4Z WPU() {
        return this.nr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Triple ViF(Y5 y5) {
        return y5.aYN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Xw(Y5 y5, tu.Z z2) {
        y5.eF(z2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nHg(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private final void wTp(final SJ0.Wre wre, List list, final List list2) {
        Object next;
        String mediaBucketName;
        int iIntValue = 0;
        if (list2.isEmpty()) {
            wre.WPU.setVisibility(0);
            return;
        }
        if (S() && ((mediaBucketName = this.f75897n.getMediaBucketName()) == null || StringsKt.isBlank(mediaBucketName))) {
            EditActivity editActivity = this.f75897n;
            editActivity.aP(editActivity.getResources().getString(2132017237));
        }
        wre.WPU.setVisibility(4);
        RecyclerView recyclerView = wre.Uo;
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this.f75897n, 2, 0, false);
        gridLayoutManager.MPw(10);
        gridLayoutManager.Ro(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        wre.Uo.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: yc.N
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i2, int i3, int i5, int i7) {
                Y5.M7(wre, view, i2, i3, i5, i7);
            }
        });
        wre.f9388o.setOnClickListener(new View.OnClickListener() { // from class: yc.IG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Y5.p5(wre, view);
            }
        });
        List<String> listT = com.alightcreative.app.motion.persist.j.INSTANCE.getRecentlyUsedMedia().t();
        ArrayList arrayList = new ArrayList();
        for (String str : listT) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(((tu.Z) next).nY().getPath(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            tu.Z z2 = (tu.Z) next;
            if (z2 != null) {
                arrayList.add(z2);
            }
        }
        Integer intOrNull = StringsKt.toIntOrNull(com.alightcreative.app.motion.persist.j.INSTANCE.getRecentMediaSize());
        if (intOrNull != null) {
            iIntValue = intOrNull.intValue();
        }
        List listTake = CollectionsKt.take(arrayList, iIntValue);
        wre.Uo.setAdapter(new g9s(CollectionsKt.plus((Collection) listTake, (Iterable) list), listTake.size(), this.f75897n.getMediaBucketName(), new Function1() { // from class: yc.FPL
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y5.v(this.f75737n, (tu.Z) obj);
            }
        }, new Function0() { // from class: yc.g9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y5.rV9(this.f75989n);
            }
        }, new Function1() { // from class: yc.L0y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y5.bzg(list2, this, wre, (View) obj);
            }
        }, !XoT.fuX.HI(this.f75897n), new Function0() { // from class: yc.CM
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y5.U(this.f75709n);
            }
        }));
    }
}
