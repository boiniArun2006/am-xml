package gIX;

import QmE.iF;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.monorepo.settings.ExportedVideoAttachment;
import com.google.firebase.auth.FirebaseAuth;
import gIX.afx;
import gIX.rv6;
import java.io.File;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class afx {

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ UUID E2;
        Object J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ SceneThumbnailMaker f67406N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f67407O;
        final /* synthetic */ rWZ.n P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f67408S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ rWZ.n f67409T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        final /* synthetic */ cBL.j f67410U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ kgE.fuX f67411X;
        final /* synthetic */ ExportedVideoAttachment Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f67412Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ iF f67413e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Scene f67414g;
        final /* synthetic */ Si.Xo jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67415n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f67416o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f67417r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f67418t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ ExportParams f67419v;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ComponentActivity componentActivity, Scene scene, UUID uuid, iF iFVar, kgE.fuX fux, rWZ.n nVar, SceneThumbnailMaker sceneThumbnailMaker, ExportParams exportParams, ExportedVideoAttachment exportedVideoAttachment, Si.Xo xo, cBL.j jVar, rWZ.n nVar2, Continuation continuation) {
            super(2, continuation);
            this.f67408S = componentActivity;
            this.f67414g = scene;
            this.E2 = uuid;
            this.f67413e = iFVar;
            this.f67411X = fux;
            this.f67409T = nVar;
            this.f67406N = sceneThumbnailMaker;
            this.f67419v = exportParams;
            this.Xw = exportedVideoAttachment;
            this.jB = xo;
            this.f67410U = jVar;
            this.P5 = nVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File gh(String str, ComponentActivity componentActivity, Bitmap bitmap) {
            return nKK.Ik(str + " QR", nKK.qie(componentActivity, str, null, rv6.w6.C0944w6.KN, bitmap, null, 36, null), componentActivity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File mUb(String str, ComponentActivity componentActivity, String str2, Bitmap bitmap) {
            return nKK.Ik(str + " link", nKK.mUb(componentActivity, str2, bitmap), componentActivity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File qie(String str, ComponentActivity componentActivity, rv6.w6.j jVar, Bitmap bitmap) {
            return nKK.Ik(str + " attachment", nKK.qie(componentActivity, str, null, jVar, bitmap, null, 36, null), componentActivity);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f67408S, this.f67414g, this.E2, this.f67413e, this.f67411X, this.f67409T, this.f67406N, this.f67419v, this.Xw, this.jB, this.f67410U, this.P5, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0192  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objMUb;
            Bitmap bitmap;
            Object objXMQ;
            String str;
            final String str2;
            C c2;
            final String str3;
            final Bitmap bitmap2;
            final ComponentActivity componentActivity;
            Qk.fuX fux;
            File file;
            File file2;
            aC aCVarN;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f67412Z;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
                String uid = firebaseAuth.getUid();
                if (uid == null) {
                    uid = "";
                }
                String str4 = uid;
                ComponentActivity componentActivity2 = this.f67408S;
                List listListOf = CollectionsKt.listOf(SceneKt.getProjectInfo(this.f67414g, HI0.afx.Z(componentActivity2, this.E2)));
                iF iFVar = this.f67413e;
                kgE.fuX fux2 = this.f67411X;
                List listListOf2 = CollectionsKt.listOf(this.f67414g);
                List listMutableListOf = CollectionsKt.mutableListOf(this.f67409T);
                SceneThumbnailMaker sceneThumbnailMaker = this.f67406N;
                this.f67412Z = 1;
                objMUb = QJ.mUb(componentActivity2, str4, listListOf, iFVar, fux2, listListOf2, listMutableListOf, sceneThumbnailMaker, this);
                if (objMUb == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    componentActivity = (ComponentActivity) this.f67416o;
                    Bitmap bitmap3 = (Bitmap) this.f67417r;
                    String str5 = (String) this.J2;
                    String str6 = (String) this.f67407O;
                    str3 = (String) this.f67418t;
                    c2 = (C) this.f67415n;
                    ResultKt.throwOnFailure(obj);
                    str = str6;
                    bitmap = null;
                    str2 = str5;
                    bitmap2 = bitmap3;
                    objXMQ = obj;
                    fux = (Qk.fuX) objXMQ;
                    if (fux != null) {
                        ComponentActivity componentActivity3 = this.f67408S;
                        rWZ.n nVar = this.f67409T;
                        final Bitmap bitmapN = (c2 == null || (aCVarN = c2.n()) == null) ? bitmap : aCVarN.n();
                        if (str3 != null) {
                            x0X.n nVarN = x0X.w6.n(new Function0() { // from class: gIX.ci
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return afx.j.mUb(str2, componentActivity, str3, bitmapN);
                                }
                            });
                            if (nVarN instanceof n.C1266n) {
                                nKK.aYN(componentActivity, (Throwable) ((n.C1266n) nVarN).n(), "Template Export Failed", "Something went wrong while trying to create a link image.");
                            } else if (!(nVarN instanceof n.w6)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            file = (File) x0X.w6.nr(nVarN);
                        } else {
                            file = bitmap;
                        }
                        if (bitmap2 != null) {
                            x0X.n nVarN2 = x0X.w6.n(new Function0() { // from class: gIX.g9s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return afx.j.gh(str2, componentActivity, bitmap2);
                                }
                            });
                            if (nVarN2 instanceof n.C1266n) {
                                nKK.aYN(componentActivity, (Throwable) ((n.C1266n) nVarN2).n(), "Template Export Failed", "Something went wrong while trying to create a QR code image.");
                            } else if (!(nVarN2 instanceof n.w6)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            file2 = (File) x0X.w6.nr(nVarN2);
                        } else {
                            file2 = bitmap;
                        }
                        Y48.eO.n(componentActivity3, fux.rl(), fux.mUb(), fux.nr(), fux.xMQ(), fux.O(), fux.n(), fux.KN(), fux.Uo(), fux.J2(), fux.gh(), fux.t(), nVar, str, str2, file, file2);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objMUb = obj;
            }
            C c4 = (C) objMUb;
            String strT = c4 != null ? c4.t() : null;
            String strRl = strT != null ? afx.rl(strT, "link") : null;
            final String title = this.f67414g.getTitle();
            Bitmap bitmapCk = strT != null ? nKK.ck(afx.rl(strT, "qr"), null, 2, null) : null;
            final Bitmap bitmapHI = strT != null ? nKK.HI(afx.rl(strT, "videoqr"), Boxing.boxInt(0)) : null;
            final ComponentActivity componentActivity4 = this.f67408S;
            final rv6.w6.j jVarO = nKK.O(this.f67414g);
            File file3 = bitmapHI != null ? (File) x0X.w6.nr(x0X.w6.n(new Function0() { // from class: gIX.SPz
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return afx.j.qie(title, componentActivity4, jVarO, bitmapHI);
                }
            })) : null;
            Pair pairRl = nKK.rl(this.f67408S, this.f67414g, this.f67419v, this.Xw, file3, jVarO);
            Scene scene = (Scene) pairRl.component1();
            ExportParams exportParams = (ExportParams) pairRl.component2();
            boolean z2 = bitmapCk == null || file3 == null;
            ComponentActivity componentActivity5 = this.f67408S;
            Si.Xo xo = this.jB;
            UUID uuid = this.E2;
            String string = componentActivity5.getResources().getString(2132019052);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = this.f67408S.getResources().getString(2132020229);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            iF iFVar2 = this.f67413e;
            cBL.j jVar = this.f67410U;
            rWZ.n nVar2 = this.P5;
            this.f67415n = c4;
            this.f67418t = strT;
            this.f67407O = strRl;
            this.J2 = title;
            this.f67417r = bitmapCk;
            this.f67416o = componentActivity4;
            this.f67412Z = 2;
            String str7 = strT;
            bitmap = null;
            String str8 = strRl;
            Bitmap bitmap4 = bitmapCk;
            objXMQ = Qk.j.xMQ(componentActivity5, scene, xo, uuid, exportParams, com.safedk.android.utils.n.f63223d, "video/mp4", string, string2, (4096 & 256) != 0 ? SceneKt.getSha1(scene) : null, iFVar2, jVar, nVar2, (4096 & 4096) != 0 ? false : z2, this);
            if (objXMQ == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str8;
            str2 = title;
            c2 = c4;
            str3 = str7;
            bitmap2 = bitmap4;
            componentActivity = componentActivity4;
            fux = (Qk.fuX) objXMQ;
            if (fux != null) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final void t(ComponentActivity componentActivity, Scene scene, Si.Xo xo, UUID projectID, ExportParams params, iF eventLogger, kgE.fuX iapManager, cBL.j watermarkOptions, rWZ.n nVar, rWZ.n templateToggleExportSnapshot, SceneThumbnailMaker thumbnailMaker, ExportedVideoAttachment exportedVideoAttachment) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(projectID, "projectID");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(watermarkOptions, "watermarkOptions");
        Intrinsics.checkNotNullParameter(templateToggleExportSnapshot, "templateToggleExportSnapshot");
        Intrinsics.checkNotNullParameter(thumbnailMaker, "thumbnailMaker");
        Intrinsics.checkNotNullParameter(exportedVideoAttachment, "exportedVideoAttachment");
        GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new j(componentActivity, scene, projectID, eventLogger, iapManager, templateToggleExportSnapshot, thumbnailMaker, params, exportedVideoAttachment, xo, watermarkOptions, nVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rl(String str, String str2) {
        String string = Uri.parse(str).buildUpon().appendQueryParameter("source", str2).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
