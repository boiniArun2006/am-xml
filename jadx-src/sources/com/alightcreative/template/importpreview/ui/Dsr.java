package com.alightcreative.template.importpreview.ui;

import HI0.Q;
import QmE.iF;
import QmE.j;
import Si.Xo;
import Si.o;
import a.C1498j;
import android.content.Context;
import android.net.Uri;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import com.alightcreative.app.motion.scene.BlendingMode;
import com.alightcreative.app.motion.scene.CameraElementKt;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.KeyableEdgeDecoration;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.MediaUriInfoKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.ShapeElementKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeRef;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import com.alightcreative.app.motion.scene.rendering.TextureCropModeKt;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.template.importpreview.ui.CN3;
import com.alightcreative.template.importpreview.ui.w6;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import tu.Ew;
import xr.Pl;
import xr.j;
import yc.m8h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Dsr extends uW.w6 {
    public static final j HI = new j(null);
    public static final int ck = 8;
    private final String KN;
    private final LM.Wre Uo;
    private final o az;
    private final WK.I28 gh;
    private final gY.j mUb;
    private final iF qie;
    private final Scene ty;
    private final xr.j xMQ;

    public static final class j {

        /* JADX INFO: renamed from: com.alightcreative.template.importpreview.ui.Dsr$j$j, reason: collision with other inner class name */
        public static final class C0681j implements ViewModelProvider.Factory {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ xr.j f46918O;
            final /* synthetic */ String nr;
            final /* synthetic */ n rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ LM.Wre f46919t;

            C0681j(n nVar, LM.Wre wre, String str, xr.j jVar) {
                this.rl = nVar;
                this.f46919t = wre;
                this.nr = str;
                this.f46918O = jVar;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public ViewModel t(Class modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Dsr dsrN = this.rl.n(this.f46919t, this.nr, this.f46918O);
                Intrinsics.checkNotNull(dsrN, "null cannot be cast to non-null type T of com.alightcreative.template.importpreview.ui.TemplateImportPreviewViewModel.Companion.provideFactory.<no name provided>.create");
                return dsrN;
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final ViewModelProvider.Factory n(n assistedFactory, LM.Wre projectHolder, String projectPackageId, xr.j origin) {
            Intrinsics.checkNotNullParameter(assistedFactory, "assistedFactory");
            Intrinsics.checkNotNullParameter(projectHolder, "projectHolder");
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            Intrinsics.checkNotNullParameter(origin, "origin");
            return new C0681j(assistedFactory, projectHolder, projectPackageId, origin);
        }
    }

    public interface n {
        Dsr n(LM.Wre wre, String str, xr.j jVar);
    }

    static /* synthetic */ void HI(Dsr dsr, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        dsr.ty(z2);
    }

    public static /* synthetic */ void nHg(Dsr dsr, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        dsr.N(z2);
    }

    public final void Z() {
        HI(this, false, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dsr(LM.Wre projectHolder, String projectPackageId, xr.j origin, gY.j createPlayerHelperUseCase, WK.I28 newFeatureManager, iF eventLogger) {
        super(new Function1() { // from class: xr.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.template.importpreview.ui.Dsr.az((Pl) obj);
            }
        });
        Intrinsics.checkNotNullParameter(projectHolder, "projectHolder");
        Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(createPlayerHelperUseCase, "createPlayerHelperUseCase");
        Intrinsics.checkNotNullParameter(newFeatureManager, "newFeatureManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.Uo = projectHolder;
        this.KN = projectPackageId;
        this.xMQ = origin;
        this.mUb = createPlayerHelperUseCase;
        this.gh = newFeatureManager;
        this.qie = eventLogger;
        this.az = createPlayerHelperUseCase.n(projectHolder.KN(), "template_preview_player_helper");
        this.ty = Scene.copy$default(projectHolder.KN().getRootScene(), null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048575, null);
    }

    private final Scene Ik() {
        return this.Uo.KN().getRootScene();
    }

    private final void X() {
        LM.Wre.ty(this.Uo, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C az(Pl it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return aC.xMQ(it);
    }

    public static /* synthetic */ void e(Dsr dsr, Context context, Uri uri, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = 0;
        }
        dsr.E2(context, uri, j2);
    }

    private final void ty(boolean z2) {
        xMQ(CN3.n.f46916n);
        N(z2);
    }

    public final void E2(Context context, Uri newUri, long j2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(newUri, "newUri");
        zd.Ml mlR = r();
        if (mlR == null) {
            return;
        }
        Uri uriT = mlR.t();
        Scene sceneIk = Ik();
        Set setKN = aC.KN(this.ty, uriT);
        if (setKN.isEmpty()) {
            throw new IllegalStateException("Unexpected empty list of elements to replace");
        }
        Set set = setKN;
        Q q2 = new Q(context);
        MediaUriInfo mediaUriInfoMediaUriInfoOf = MediaUriInfoKt.mediaUriInfoOf(q2, newUri, sceneIk);
        if (mediaUriInfoMediaUriInfoOf == null) {
            throw new IllegalStateException(("Cannot resolve media at uri " + newUri).toString());
        }
        Scene sceneQie = aC.qie(sceneIk, CollectionsKt.emptyList(), set, mediaUriInfoMediaUriInfoOf, j2, aC.J2(this.ty, uriT), zd.w6.ck(this.ty, uriT), q2);
        this.Uo.KN().setScene(sceneQie);
        Pl pl = (Pl) nr();
        if (pl != null) {
            mUb(Pl.rl(pl, zd.w6.az(pl.t(), sceneQie, this.ty), null, null, false, false, false, this.gh.rl(WK.Ml.f11454Z), null, null, 446, null));
        }
        iF iFVar = this.qie;
        String str = this.KN;
        String string = this.Uo.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iFVar.n(new j.pIF(str, string, this.ty.getType(), mlR.J2(), zd.w6.KN(mediaUriInfoMediaUriInfoOf), this.xMQ));
    }

    public final void N(boolean z2) {
        a.w6 w6VarGh;
        o oVarNr;
        if (z2) {
            iF iFVar = this.qie;
            String str = this.KN;
            String string = this.Uo.Uo().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            iFVar.n(new j.Ch(str, string, this.ty.getType(), this.xMQ));
        }
        Pl pl = (Pl) nr();
        if (pl != null && (w6VarGh = pl.gh()) != null && (oVarNr = w6VarGh.nr()) != null) {
            oVarNr.pause();
            oVarNr.release();
        }
        Pl pl3 = (Pl) nr();
        mUb(pl3 != null ? Pl.rl(pl3, null, null, null, false, false, false, false, null, null, 127, null) : null);
        this.az.wTp();
    }

    public final void S(Context context) {
        Uri uriMUb;
        Intrinsics.checkNotNullParameter(context, "context");
        Pl pl = (Pl) nr();
        if (pl != null && (uriMUb = pl.mUb()) != null) {
            a.w6 w6VarGh = pl.gh();
            E2(context, uriMUb, w6VarGh != null ? w6VarGh.XQ() : 0L);
        }
        ty(false);
    }

    public final void T(long j2, long j3, Context context, Uri trimmingUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trimmingUri, "trimmingUri");
        iF iFVar = this.qie;
        String str = this.KN;
        String string = this.Uo.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iFVar.n(new j.tQj(str, string, this.ty.getType(), this.xMQ));
        MediaUriInfo mediaUriInfoMediaUriInfoOf = MediaUriInfoKt.mediaUriInfoOf(new Q(context), trimmingUri, Ik());
        if (mediaUriInfoMediaUriInfoOf == null) {
            return;
        }
        int orientation = mediaUriInfoMediaUriInfoOf.getOrientation();
        Pair pair = TuplesKt.to(Integer.valueOf(mediaUriInfoMediaUriInfoOf.getWidth()), Integer.valueOf(mediaUriInfoMediaUriInfoOf.getHeight()));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        Pair pair2 = (orientation % 90 != 0 || orientation % 180 == 0) ? TuplesKt.to(Integer.valueOf(mediaUriInfoMediaUriInfoOf.getWidth()), Integer.valueOf(mediaUriInfoMediaUriInfoOf.getHeight())) : TuplesKt.to(Integer.valueOf(mediaUriInfoMediaUriInfoOf.getHeight()), Integer.valueOf(mediaUriInfoMediaUriInfoOf.getWidth()));
        int iIntValue3 = ((Number) pair2.component1()).intValue();
        int iIntValue4 = ((Number) pair2.component2()).intValue();
        Scene scene = new Scene(null, 0, iIntValue3, iIntValue4, iIntValue3, iIntValue4, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048515, null);
        int i2 = (int) j3;
        float f3 = iIntValue / 2.0f;
        float f4 = iIntValue2 / 2.0f;
        o oVarN = this.mUb.n(SceneKt.SceneHolder(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, CollectionsKt.listOf(ShapeElementKt.ShapeElement(TransformKt.rotatedBy(m8h.t(scene, SceneElement.copy$default(CameraElementKt.makeDefaultCamera(scene), null, 0, i2, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -5, 127, null), 0, 4, null), orientation), 0, i2, CubicBSplineKt.toCompound(tTF.j.n((-iIntValue) / 2.0f, (-iIntValue2) / 2.0f, f3, f4)), (55264 & 16) != 0 ? KeyableKt.keyable(new SolidColor(1.0f, 1.0f, 1.0f, 1.0f)) : null, (55264 & 32) != 0 ? null : null, (55264 & 64) != 0 ? null : trimmingUri, (55264 & 128) != 0 ? 0L : 0L, (55264 & 256) != 0 ? "" : null, (55264 & 512) != 0 ? 0 : 0, (55264 & 1024) != 0 ? Integer.MAX_VALUE : 0, (55264 & 2048) != 0 ? FillType.COLOR : FillType.MEDIA, (55264 & 4096) != 0 ? false : false, (55264 & 8192) != 0 ? LiveShapeRef.INSTANCE.getNONE() : new LiveShapeRef("com.alightcreative.shapes.rect", MapsKt.mapOf(TuplesKt.to("size", new KeyableUserParameterValue(new Vector2D(f3, f4))))), (55264 & 16384) != 0 ? BlendingMode.NORMAL : null, (55264 & 32768) != 0 ? KeyableEdgeDecoration.INSTANCE.getNO_STROKE() : null)), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null)), "template_preview_trimmer_player_helper");
        Pl pl = (Pl) nr();
        if (pl != null) {
            mUb(Pl.rl(pl, null, null, null, false, false, false, false, trimmingUri, new a.w6(j2, oVarN, null, 4, null), 127, null));
        }
        xMQ(CN3.w6.f46917n);
    }

    public final void ViF(int i2) {
        Pl pl;
        Integer numNr;
        Pl pl3 = (Pl) nr();
        if ((pl3 != null && !pl3.J2()) || ((pl = (Pl) nr()) != null && pl.Uo())) {
            Pl pl4 = (Pl) nr();
            mUb(pl4 != null ? Pl.rl(pl4, null, null, null, false, true, false, false, null, null, 463, null) : null);
        }
        Pl pl5 = (Pl) nr();
        if (pl5 != null && pl5.KN()) {
            iF();
        }
        Pl pl6 = (Pl) nr();
        if (pl6 != null && (numNr = pl6.nr()) != null && numNr.intValue() == i2) {
            Pl pl7 = (Pl) nr();
            if (pl7 != null) {
                iF iFVar = this.qie;
                String str = this.KN;
                String string = this.Uo.Uo().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                iFVar.n(new j.tZ(str, string, this.ty.getType(), ((zd.Ml) pl7.t().get(i2)).J2(), this.xMQ));
            }
            xMQ(CN3.Wre.f46913n);
            return;
        }
        xMQ(CN3.I28.f46911n);
        Pl pl8 = (Pl) nr();
        if (pl8 != null) {
            iF iFVar2 = this.qie;
            String str2 = this.KN;
            String string2 = this.Uo.Uo().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            iFVar2.n(new j.qhS(str2, string2, this.ty.getType(), ((zd.Ml) pl8.t().get(i2)).J2(), this.xMQ));
            pl8.xMQ().nY(this.Uo, ((zd.Ml) pl8.t().get(i2)).O());
        }
        Pl pl9 = (Pl) nr();
        mUb(pl9 != null ? Pl.rl(pl9, null, Integer.valueOf(i2), null, false, false, false, false, null, null, 509, null) : null);
    }

    public final void WPU() {
        this.gh.n(WK.Ml.f11454Z);
        Pl pl = (Pl) nr();
        mUb(pl != null ? Pl.rl(pl, null, null, null, false, false, false, false, null, null, 447, null) : null);
    }

    public final void aYN() {
        a.w6 w6VarGh;
        o oVarNr;
        a.w6 w6VarGh2;
        o oVarNr2;
        this.az.pause();
        Xo.j.rl(this.az, null, 1, null);
        Pl pl = (Pl) nr();
        if (pl != null && (w6VarGh2 = pl.gh()) != null && (oVarNr2 = w6VarGh2.nr()) != null) {
            oVarNr2.pause();
        }
        Pl pl3 = (Pl) nr();
        if (pl3 == null || (w6VarGh = pl3.gh()) == null || (oVarNr = w6VarGh.nr()) == null) {
            return;
        }
        Xo.j.rl(oVarNr, null, 1, null);
    }

    public final w6 ck(Context context, Uri newUri) {
        Uri uriT;
        MediaUriInfo mediaUriInfoMediaUriInfoOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(newUri, "newUri");
        w6.n nVar = w6.n.f46951n;
        zd.Ml mlR = r();
        if (mlR == null || (uriT = mlR.t()) == null || (mediaUriInfoMediaUriInfoOf = MediaUriInfoKt.mediaUriInfoOf(new Q(context), newUri, Ik())) == null || zd.w6.KN(mediaUriInfoMediaUriInfoOf) != Ew.f73884r) {
            return nVar;
        }
        long jCk = zd.w6.ck(this.ty, uriT);
        long jUo = zd.w6.Uo(mediaUriInfoMediaUriInfoOf);
        return jCk - ((long) d.f62986a) > jUo ? w6.C0683w6.f46952n : ((long) Sdk.SDKError.Reason.NATIVE_ASSET_ERROR_VALUE) + jCk < jUo ? new w6.j(jCk, jUo) : nVar;
    }

    public final void iF() {
        this.gh.n(WK.Ml.f11457o);
        Pl pl = (Pl) nr();
        mUb(pl != null ? Pl.rl(pl, null, null, null, false, false, false, false, null, null, 503, null) : null);
    }

    @Override // androidx.view.ViewModel
    protected void onCleared() {
        a.w6 w6VarGh;
        o oVarNr;
        a.w6 w6VarGh2;
        o oVarNr2;
        this.az.pause();
        this.az.release();
        Pl pl = (Pl) nr();
        if (pl != null && (w6VarGh2 = pl.gh()) != null && (oVarNr2 = w6VarGh2.nr()) != null) {
            oVarNr2.pause();
        }
        Pl pl3 = (Pl) nr();
        if (pl3 == null || (w6VarGh = pl3.gh()) == null || (oVarNr = w6VarGh.nr()) == null) {
            return;
        }
        oVarNr.release();
    }

    public final void te() {
        a.w6 w6VarGh;
        o oVarNr;
        this.az.pause();
        Pl pl = (Pl) nr();
        if (pl == null || (w6VarGh = pl.gh()) == null || (oVarNr = w6VarGh.nr()) == null) {
            return;
        }
        oVarNr.pause();
    }

    private final zd.Ml r() {
        Integer numNr;
        Pl pl = (Pl) nr();
        if (pl == null || (numNr = pl.nr()) == null) {
            return null;
        }
        return (zd.Ml) pl.t().get(numNr.intValue());
    }

    @Override // uW.w6
    public void Uo() {
        Integer num;
        List listXMQ = zd.w6.xMQ(Ik());
        if (!listXMQ.isEmpty()) {
            num = 0;
        } else {
            num = null;
        }
        C1498j c1498j = new C1498j(this.az, null, 2, null);
        if (num != null) {
            c1498j.nY(this.Uo, ((zd.Ml) listXMQ.get(num.intValue())).O());
        }
        Unit unit = Unit.INSTANCE;
        boolean zRl = this.gh.rl(WK.Ml.f11457o);
        WK.I28 i28 = this.gh;
        WK.Ml ml = WK.Ml.f11458r;
        boolean zRl2 = i28.rl(ml);
        if (zRl2) {
            this.gh.n(ml);
        }
        mUb(new Pl(listXMQ, num, c1498j, zRl, zRl2, true, false, null, null, 448, null));
    }

    public final void XQ() {
        Pl pl = (Pl) nr();
        if (pl != null) {
            iF iFVar = this.qie;
            String str = this.KN;
            String string = this.Uo.Uo().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            SceneType type = this.ty.getType();
            int size = pl.t().size();
            List<zd.Ml> listT = pl.t();
            int i2 = 0;
            if (listT == null || !listT.isEmpty()) {
                for (zd.Ml ml : listT) {
                    if (!Intrinsics.areEqual(ml.t(), ml.O()) && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            iFVar.n(new j.epX(str, string, type, size, i2, this.xMQ));
            pl.xMQ().az();
        }
    }

    public final void fD() {
        Integer numNr;
        zd.Ml mlR = r();
        if (mlR != null) {
            Uri uriT = mlR.t();
            TextureCropMode textureCropModeNextTextureCropMode = TextureCropModeKt.nextTextureCropMode(mlR.nr());
            Set setKN = aC.KN(this.ty, uriT);
            if (!setKN.isEmpty()) {
                this.Uo.KN().setScene(aC.mUb(Ik(), CollectionsKt.emptyList(), setKN, textureCropModeNextTextureCropMode));
                Pl pl = (Pl) nr();
                if (pl != null && (numNr = pl.nr()) != null) {
                    mUb(Pl.rl(pl, zd.w6.ty(pl.t(), numNr.intValue(), textureCropModeNextTextureCropMode), null, null, false, false, false, false, null, null, 510, null));
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unexpected empty list of elements to replace");
        }
    }

    public final void g() {
        Pl pl = (Pl) nr();
        if (pl != null) {
            iF iFVar = this.qie;
            String str = this.KN;
            String string = this.Uo.Uo().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            SceneType type = this.ty.getType();
            int size = pl.t().size();
            List<zd.Ml> listT = pl.t();
            int i2 = 0;
            if (listT == null || !listT.isEmpty()) {
                for (zd.Ml ml : listT) {
                    if (!Intrinsics.areEqual(ml.t(), ml.O()) && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            iFVar.n(new j.H9(str, string, type, size, i2, this.xMQ));
            pl.xMQ().az();
            X();
        }
    }

    public final void nY() {
        Object obj;
        Pl pl = (Pl) nr();
        if (pl != null) {
            if (this.xMQ instanceof j.C1276j) {
                obj = CN3.Ml.f46912n;
            } else if (pl.Uo()) {
                obj = CN3.Dsr.f46910n;
            } else {
                obj = CN3.C0680CN3.f46909n;
            }
            xMQ(obj);
        }
    }

    public final void o() {
        Object obj;
        Pl pl = (Pl) nr();
        if (pl != null) {
            if (!(this.xMQ instanceof j.C1276j) && pl.J2()) {
                obj = CN3.fuX.f46914n;
            } else {
                obj = CN3.j.f46915n;
            }
            xMQ(obj);
        }
    }
}
