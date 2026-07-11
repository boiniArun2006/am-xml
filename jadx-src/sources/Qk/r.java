package Qk;

import GJW.vd;
import HI0.Lu;
import Qk.r;
import QmE.iF;
import android.app.Activity;
import android.content.Context;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneKt;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.Moshi;
import java.io.EOFException;
import java.io.File;
import java.util.Iterator;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FileTreeWalk;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import xAo.rv6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class r {

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ String E2;
        final /* synthetic */ Si.Xo J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ rWZ.n f8320N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Scene f8321O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ String f8322S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ cBL.j f8323T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ iF f8324X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ String f8325Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f8326e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f8327g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8328n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ ExportParams f8329o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ UUID f8330r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f8331t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ xAo.I28 f8332v;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ComponentActivity componentActivity, Scene scene, Si.Xo xo, UUID uuid, ExportParams exportParams, String str, String str2, String str3, String str4, String str5, iF iFVar, cBL.j jVar, rWZ.n nVar, xAo.I28 i28, Continuation continuation) {
            super(2, continuation);
            this.f8331t = componentActivity;
            this.f8321O = scene;
            this.J2 = xo;
            this.f8330r = uuid;
            this.f8329o = exportParams;
            this.f8325Z = str;
            this.f8322S = str2;
            this.f8327g = str3;
            this.E2 = str4;
            this.f8326e = str5;
            this.f8324X = iFVar;
            this.f8323T = jVar;
            this.f8320N = nVar;
            this.f8332v = i28;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f8331t, this.f8321O, this.J2, this.f8330r, this.f8329o, this.f8325Z, this.f8322S, this.f8327g, this.E2, this.f8326e, this.f8324X, this.f8323T, this.f8320N, this.f8332v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objXMQ;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f8328n;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ComponentActivity componentActivity = this.f8331t;
                Scene scene = this.f8321O;
                Si.Xo xo = this.J2;
                UUID uuid = this.f8330r;
                ExportParams exportParams = this.f8329o;
                String str = this.f8325Z;
                String str2 = this.f8322S;
                String str3 = this.f8327g;
                String str4 = this.E2;
                String str5 = this.f8326e;
                iF iFVar = this.f8324X;
                cBL.j jVar = this.f8323T;
                rWZ.n nVar = this.f8320N;
                this.f8328n = 1;
                objXMQ = Qk.j.xMQ(componentActivity, scene, xo, uuid, exportParams, str, str2, str3, str4, (4096 & 256) != 0 ? SceneKt.getSha1(scene) : str5, iFVar, jVar, nVar, (4096 & 4096) != 0 ? false : false, this);
                if (objXMQ == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objXMQ = obj;
            }
            final fuX fux = (fuX) objXMQ;
            if (fux != null) {
                xAo.I28 i28 = this.f8332v;
                final ComponentActivity componentActivity2 = this.f8331t;
                i28.r(rv6.f75310n, new Function1() { // from class: Qk.Q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return r.j.O(componentActivity2, fux, (ComponentActivity) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(ComponentActivity componentActivity, fuX fux, ComponentActivity componentActivity2) {
            Y48.eO.rl(componentActivity, fux.rl(), fux.mUb(), fux.nr(), fux.xMQ(), fux.O(), fux.n(), fux.KN(), fux.Uo(), fux.J2(), fux.gh(), fux.t(), null, null, null, null, null, 63488, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Ik() {
        return "cleanOldExports OUT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String S() {
        return "cleanOldShares IN";
    }

    public static final void ViF(ComponentActivity componentActivity, Scene scene, Si.Xo xo, UUID projectID, ExportParams params, String extension, String mimeType, String progressMessage, String shareMessage, String originHash, iF eventLogger, cBL.j watermarkOptions, xAo.I28 crisperManager, rWZ.n nVar) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(projectID, "projectID");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(progressMessage, "progressMessage");
        Intrinsics.checkNotNullParameter(shareMessage, "shareMessage");
        Intrinsics.checkNotNullParameter(originHash, "originHash");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(watermarkOptions, "watermarkOptions");
        Intrinsics.checkNotNullParameter(crisperManager, "crisperManager");
        GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new j(componentActivity, scene, xo, projectID, params, extension, mimeType, progressMessage, shareMessage, originHash, eventLogger, watermarkOptions, nVar, crisperManager, null), 3, null);
    }

    public static final void WPU(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(cacheDir, "export");
        if (fileResolve.exists()) {
            FilesKt.deleteRecursively(fileResolve);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String XQ() {
        return "cleanOldShares OUT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(int i2, File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isFile() && System.currentTimeMillis() - it.lastModified() > ((long) i2);
    }

    public static final void aYN(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(cacheDir, AppLovinEventTypes.USER_SHARED_LINK);
        if (fileResolve.exists()) {
            FilesKt.deleteRecursively(fileResolve);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az() {
        return "Export directory does not exist";
    }

    public static final long g(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        File cacheDir = activity.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(cacheDir, "export");
        if (!fileResolve.exists()) {
            return 0L;
        }
        Iterator<File> it = FilesKt.walk$default(fileResolve, null, 1, null).iterator();
        double length = 0.0d;
        while (it.hasNext()) {
            length += it.next().isDirectory() ? 0.0d : r4.length();
        }
        return (long) length;
    }

    public static final void gh(Context context) {
        Sequence sequenceAsSequence;
        Sequence<File> sequenceFilter;
        Intrinsics.checkNotNullParameter(context, "context");
        XoT.C.Uo(context, new Function0() { // from class: Qk.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.qie();
            }
        });
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(cacheDir, "export");
        if (!fileResolve.exists()) {
            XoT.C.Uo(context, new Function0() { // from class: Qk.QJ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.az();
                }
            });
            return;
        }
        File[] fileArrListFiles = fileResolve.listFiles();
        if (fileArrListFiles != null && (sequenceAsSequence = ArraysKt.asSequence(fileArrListFiles)) != null && (sequenceFilter = SequencesKt.filter(sequenceAsSequence, new Function1() { // from class: Qk.l3D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(r.ty((File) obj));
            }
        })) != null) {
            for (final File file : sequenceFilter) {
                Intrinsics.checkNotNull(file);
                File fileResolve2 = FilesKt.resolve(file, "meta.json");
                if (fileResolve2.exists()) {
                    Dsr dsr = null;
                    try {
                        Moshi moshiN = Lu.n();
                        String text$default = FilesKt.readText$default(fileResolve2, null, 1, null);
                        JsonAdapter jsonAdapterAdapter = moshiN.adapter(Dsr.class);
                        Intrinsics.checkNotNull(jsonAdapterAdapter);
                        dsr = (Dsr) jsonAdapterAdapter.fromJson(text$default);
                    } catch (JsonDataException e2) {
                        XoT.C.ty(context, "Error parsing '" + fileResolve2 + "'", e2);
                    } catch (EOFException e3) {
                        XoT.C.ty(context, "Error parsing '" + fileResolve2 + "'", e3);
                    }
                    if (dsr != null && HI0.afx.o(context, dsr.getProjectID()).exists()) {
                        Long l2 = (Long) CollectionsKt.maxOrNull((Iterable) dsr.getShareDates());
                        if (System.currentTimeMillis() - (l2 != null ? l2.longValue() : dsr.getExportDate()) < BrandSafetyUtils.f61441g * Math.min(14, dsr.getShareDates().size() + 5)) {
                            XoT.C.Uo(context, new Function0() { // from class: Qk.c
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return r.HI(file);
                                }
                            });
                        }
                    }
                }
                XoT.C.Uo(context, new Function0() { // from class: Qk.s4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.ck(file);
                    }
                });
                FilesKt.deleteRecursively(file);
            }
        }
        XoT.C.Uo(context, new Function0() { // from class: Qk.UGc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.Ik();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o() {
        return "Export directory does not exist";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String qie() {
        return "cleanOldExports IN";
    }

    public static final void r(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        XoT.C.Uo(context, new Function0() { // from class: Qk.qz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.S();
            }
        });
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(cacheDir, AppLovinEventTypes.USER_SHARED_LINK);
        if (!fileResolve.exists()) {
            XoT.C.Uo(context, new Function0() { // from class: Qk.Pl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.o();
                }
            });
            return;
        }
        FileTreeWalk fileTreeWalkWalk$default = FilesKt.walk$default(fileResolve, null, 1, null);
        final int i2 = BrandSafetyUtils.f61441g;
        Iterator it = SequencesKt.filter(fileTreeWalkWalk$default, new Function1() { // from class: Qk.Xo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(r.Z(i2, (File) obj));
            }
        }).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        XoT.C.Uo(context, new Function0() { // from class: Qk.eO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.XQ();
            }
        });
    }

    public static final long te(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        File cacheDir = activity.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(cacheDir, AppLovinEventTypes.USER_SHARED_LINK);
        if (!fileResolve.exists()) {
            return 0L;
        }
        Iterator<File> it = FilesKt.walk$default(fileResolve, null, 1, null).iterator();
        double length = 0.0d;
        while (it.hasNext()) {
            length += it.next().isDirectory() ? 0.0d : r4.length();
        }
        return (long) length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HI(File file) {
        return "cleanOldExports : keep '" + file.getName() + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ck(File file) {
        return "cleanOldExports : delete '" + file.getName() + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ty(File file) {
        return file.isDirectory();
    }
}
