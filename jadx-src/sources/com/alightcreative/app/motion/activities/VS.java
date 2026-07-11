package com.alightcreative.app.motion.activities;

import LdY.Ml;
import QmE.j;
import android.content.DialogInterface;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import com.alightcreative.app.motion.activities.mediabrowser.AddVisualMediaInfo;
import com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser;
import com.alightcreative.app.motion.scene.AudioElementKt;
import com.alightcreative.app.motion.scene.BlendingMode;
import com.alightcreative.app.motion.scene.CameraElementKt;
import com.alightcreative.app.motion.scene.CameraProperties;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.CompoundCubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.Drawing;
import com.alightcreative.app.motion.scene.DrawingElementKt;
import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.KeyableEdgeDecoration;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.KeyableSolidColor;
import com.alightcreative.app.motion.scene.KeyableTransform;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.MediaUriInfoKt;
import com.alightcreative.app.motion.scene.NestedSceneElementKt;
import com.alightcreative.app.motion.scene.NullObjectElementKt;
import com.alightcreative.app.motion.scene.ReTimingMethod;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.ShapeElementKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.StyledText;
import com.alightcreative.app.motion.scene.StyledTextAlign;
import com.alightcreative.app.motion.scene.TextElementKt;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.liveshape.LiveShape;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeRef;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import d.AbstractC1951j;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import yc.Qik;
import yc.rrk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class VS {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EditActivity f44798n;
    private final Random rl;

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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tu.SPz HI(HI0.Q q2, Uri uri) {
        return tu.r.te(q2, uri, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tu.SPz Xw(HI0.Q q2, Uri uri) {
        return tu.r.te(q2, uri, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair aYN(EditActivity editActivity, Uri uri) {
        try {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = editActivity.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                try {
                    fileInputStream.skip(assetFileDescriptorOpenAssetFileDescriptor.getStartOffset());
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(fileInputStream, null, options);
                    Pair pair = TuplesKt.to(options, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                    CloseableKt.closeFinally(assetFileDescriptorOpenAssetFileDescriptor, null);
                    return pair;
                } finally {
                }
            } finally {
            }
        } catch (IOException e2) {
            try {
                InputStream inputStreamOpenInputStream = editActivity.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    return null;
                }
                try {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options2);
                    Pair pair2 = TuplesKt.to(options2, null);
                    CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                    return pair2;
                } finally {
                }
            } catch (IOException unused) {
                return TuplesKt.to(null, e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit fD(VS vs, EditActivity editActivity, Ref.IntRef intRef, MediaBrowser.j jVar, Ml.j jVar2, ArrayList resultList) {
        String str;
        int size;
        Pair pairUo;
        Intrinsics.checkNotNullParameter(resultList, "resultList");
        Iterator it = resultList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            yc.rrk rrkVar = (yc.rrk) next;
            if (rrkVar instanceof rrk.j) {
                rrk.j jVar3 = (rrk.j) rrkVar;
                int iO = jVar3.O();
                int iRl = jVar3.rl();
                Pair pairN = jVar3.nr() ? HI0.h.n(AbstractC1951j.Uo(iRl, iO, vs.p5().get_scene().getWidth(), vs.p5().get_scene().getHeight())) : AbstractC1951j.Uo(iO, iRl, vs.p5().get_scene().getWidth(), vs.p5().get_scene().getHeight());
                int iIntValue = ((Number) pairN.component1()).intValue();
                int iIntValue2 = ((Number) pairN.component2()).intValue();
                MediaUriInfoKt.updateCache(new MediaUriInfo(jVar3.n().xMQ(), jVar3.n().t(), jVar3.n().Uo(), jVar3.t(), jVar3.n().O(), 0L, null, jVar3.O(), jVar3.rl(), jVar3.n().nr(), 0L, 0, 3168, null));
                float f3 = iIntValue / 2.0f;
                float f4 = iIntValue2 / 2.0f;
                editActivity.X(SceneHolder.DefaultImpls.add$default(vs.p5(), ShapeElementKt.ShapeElement(TransformKt.rotatedBy(vs.eF(editActivity), jVar3.n().nr()), HW.C.qie(editActivity, intRef.element), HW.C.gh(editActivity, intRef.element) + jVar3.n().n(), CubicBSplineKt.toCompound(tTF.j.n((-iIntValue) / 2.0f, (-iIntValue2) / 2.0f, f3, f4)), (55264 & 16) != 0 ? KeyableKt.keyable(new SolidColor(1.0f, 1.0f, 1.0f, 1.0f)) : null, (55264 & 32) != 0 ? null : jVar3.n().xMQ(), (55264 & 64) != 0 ? null : null, (55264 & 128) != 0 ? 0L : 0L, (55264 & 256) != 0 ? "" : jVar3.n().Uo(), (55264 & 512) != 0 ? 0 : 0, (55264 & 1024) != 0 ? Integer.MAX_VALUE : 0, (55264 & 2048) != 0 ? FillType.COLOR : FillType.MEDIA, (55264 & 4096) != 0 ? false : false, (55264 & 8192) != 0 ? LiveShapeRef.INSTANCE.getNONE() : new LiveShapeRef("com.alightcreative.shapes.rect", MapsKt.mapOf(TuplesKt.to("size", new KeyableUserParameterValue(new Vector2D(f3, f4))))), (55264 & 16384) != 0 ? BlendingMode.NORMAL : null, (55264 & 32768) != 0 ? KeyableEdgeDecoration.INSTANCE.getNO_STROKE() : null), 0, 2, null), false);
                if (jVar == MediaBrowser.j.f45515t) {
                    intRef.element += jVar3.n().n();
                }
            } else if (rrkVar instanceof rrk.n) {
                rrk.n nVar = (rrk.n) rrkVar;
                Uri uriXMQ = nVar.n().xMQ();
                int iQie = nVar.rl().qie();
                int iJ2 = nVar.rl().J2();
                long jO = nVar.n().O();
                int iXMQ = nVar.rl().xMQ();
                String strT = nVar.n().t();
                String strUo = nVar.n().Uo();
                String strKN = nVar.rl().KN();
                long jT2 = nVar.rl().t();
                tu.u uVarGh = nVar.rl().gh();
                MediaUriInfoKt.updateCache(new MediaUriInfo(uriXMQ, strT, strUo, strKN, jO, 0L, null, iQie, iJ2, iXMQ, jT2, uVarGh != null ? uVarGh.O() : -1, 96, null));
                int iXMQ2 = nVar.rl().xMQ();
                if (iXMQ2 == 0) {
                    pairUo = AbstractC1951j.Uo(nVar.rl().qie(), nVar.rl().J2(), vs.p5().get_scene().getWidth(), vs.p5().get_scene().getHeight());
                    int iIntValue3 = ((Number) pairUo.component1()).intValue();
                    int iIntValue4 = ((Number) pairUo.component2()).intValue();
                    int iJ22 = nVar.n().J2();
                    int iT = (int) ((nVar.rl().t() / ((long) 1000)) - ((long) nVar.n().rl()));
                    float f5 = iIntValue3 / 2.0f;
                    Iterator it2 = it;
                    float f6 = iIntValue4 / 2.0f;
                    editActivity.X(SceneHolder.DefaultImpls.add$default(vs.p5(), ShapeElementKt.ShapeElement(TransformKt.rotatedBy(vs.eF(editActivity), nVar.rl().xMQ()), HW.C.qie(editActivity, intRef.element), HW.C.gh(editActivity, intRef.element) + (iT - iJ22), CubicBSplineKt.toCompound(tTF.j.n((-iIntValue3) / 2.0f, (-iIntValue4) / 2.0f, f5, f6)), (55264 & 16) != 0 ? KeyableKt.keyable(new SolidColor(1.0f, 1.0f, 1.0f, 1.0f)) : null, (55264 & 32) != 0 ? null : null, (55264 & 64) != 0 ? null : nVar.n().xMQ(), (55264 & 128) != 0 ? 0L : 0L, (55264 & 256) != 0 ? "" : nVar.n().Uo(), (55264 & 512) != 0 ? 0 : iJ22, (55264 & 1024) != 0 ? Integer.MAX_VALUE : iT, (55264 & 2048) != 0 ? FillType.COLOR : FillType.MEDIA, (55264 & 4096) != 0 ? false : false, (55264 & 8192) != 0 ? LiveShapeRef.INSTANCE.getNONE() : new LiveShapeRef("com.alightcreative.shapes.rect", MapsKt.mapOf(TuplesKt.to("size", new KeyableUserParameterValue(new Vector2D(f5, f6))))), (55264 & 16384) != 0 ? BlendingMode.NORMAL : null, (55264 & 32768) != 0 ? KeyableEdgeDecoration.INSTANCE.getNO_STROKE() : null), 0, 2, null), false);
                    if (jVar == MediaBrowser.j.f45515t) {
                        intRef.element += nVar.n().n();
                    }
                    it = it2;
                } else {
                    if (iXMQ2 != 90) {
                        if (iXMQ2 != 180) {
                            if (iXMQ2 != 270) {
                                throw new IllegalStateException();
                            }
                        }
                        pairUo = AbstractC1951j.Uo(nVar.rl().qie(), nVar.rl().J2(), vs.p5().get_scene().getWidth(), vs.p5().get_scene().getHeight());
                        int iIntValue32 = ((Number) pairUo.component1()).intValue();
                        int iIntValue42 = ((Number) pairUo.component2()).intValue();
                        int iJ222 = nVar.n().J2();
                        int iT2 = (int) ((nVar.rl().t() / ((long) 1000)) - ((long) nVar.n().rl()));
                        float f53 = iIntValue32 / 2.0f;
                        Iterator it22 = it;
                        float f62 = iIntValue42 / 2.0f;
                        editActivity.X(SceneHolder.DefaultImpls.add$default(vs.p5(), ShapeElementKt.ShapeElement(TransformKt.rotatedBy(vs.eF(editActivity), nVar.rl().xMQ()), HW.C.qie(editActivity, intRef.element), HW.C.gh(editActivity, intRef.element) + (iT2 - iJ222), CubicBSplineKt.toCompound(tTF.j.n((-iIntValue32) / 2.0f, (-iIntValue42) / 2.0f, f53, f62)), (55264 & 16) != 0 ? KeyableKt.keyable(new SolidColor(1.0f, 1.0f, 1.0f, 1.0f)) : null, (55264 & 32) != 0 ? null : null, (55264 & 64) != 0 ? null : nVar.n().xMQ(), (55264 & 128) != 0 ? 0L : 0L, (55264 & 256) != 0 ? "" : nVar.n().Uo(), (55264 & 512) != 0 ? 0 : iJ222, (55264 & 1024) != 0 ? Integer.MAX_VALUE : iT2, (55264 & 2048) != 0 ? FillType.COLOR : FillType.MEDIA, (55264 & 4096) != 0 ? false : false, (55264 & 8192) != 0 ? LiveShapeRef.INSTANCE.getNONE() : new LiveShapeRef("com.alightcreative.shapes.rect", MapsKt.mapOf(TuplesKt.to("size", new KeyableUserParameterValue(new Vector2D(f53, f62))))), (55264 & 16384) != 0 ? BlendingMode.NORMAL : null, (55264 & 32768) != 0 ? KeyableEdgeDecoration.INSTANCE.getNO_STROKE() : null), 0, 2, null), false);
                        if (jVar == MediaBrowser.j.f45515t) {
                        }
                        it = it22;
                    }
                    pairUo = HI0.h.n(AbstractC1951j.Uo(nVar.rl().J2(), nVar.rl().qie(), vs.p5().get_scene().getWidth(), vs.p5().get_scene().getHeight()));
                    int iIntValue322 = ((Number) pairUo.component1()).intValue();
                    int iIntValue422 = ((Number) pairUo.component2()).intValue();
                    int iJ2222 = nVar.n().J2();
                    int iT22 = (int) ((nVar.rl().t() / ((long) 1000)) - ((long) nVar.n().rl()));
                    float f532 = iIntValue322 / 2.0f;
                    Iterator it222 = it;
                    float f622 = iIntValue422 / 2.0f;
                    editActivity.X(SceneHolder.DefaultImpls.add$default(vs.p5(), ShapeElementKt.ShapeElement(TransformKt.rotatedBy(vs.eF(editActivity), nVar.rl().xMQ()), HW.C.qie(editActivity, intRef.element), HW.C.gh(editActivity, intRef.element) + (iT22 - iJ2222), CubicBSplineKt.toCompound(tTF.j.n((-iIntValue322) / 2.0f, (-iIntValue422) / 2.0f, f532, f622)), (55264 & 16) != 0 ? KeyableKt.keyable(new SolidColor(1.0f, 1.0f, 1.0f, 1.0f)) : null, (55264 & 32) != 0 ? null : null, (55264 & 64) != 0 ? null : nVar.n().xMQ(), (55264 & 128) != 0 ? 0L : 0L, (55264 & 256) != 0 ? "" : nVar.n().Uo(), (55264 & 512) != 0 ? 0 : iJ2222, (55264 & 1024) != 0 ? Integer.MAX_VALUE : iT22, (55264 & 2048) != 0 ? FillType.COLOR : FillType.MEDIA, (55264 & 4096) != 0 ? false : false, (55264 & 8192) != 0 ? LiveShapeRef.INSTANCE.getNONE() : new LiveShapeRef("com.alightcreative.shapes.rect", MapsKt.mapOf(TuplesKt.to("size", new KeyableUserParameterValue(new Vector2D(f532, f622))))), (55264 & 16384) != 0 ? BlendingMode.NORMAL : null, (55264 & 32768) != 0 ? KeyableEdgeDecoration.INSTANCE.getNO_STROKE() : null), 0, 2, null), false);
                    if (jVar == MediaBrowser.j.f45515t) {
                    }
                    it = it222;
                }
            } else {
                continue;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = resultList.iterator();
        while (it3.hasNext()) {
            yc.rrk rrkVar2 = (yc.rrk) it3.next();
            yc.ys8 ys8Var = rrkVar2 instanceof yc.ys8 ? (yc.ys8) rrkVar2 : null;
            if (ys8Var != null) {
                arrayList.add(ys8Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = resultList.iterator();
        while (it4.hasNext()) {
            yc.rrk rrkVar3 = (yc.rrk) it4.next();
            yc.jL jLVar = rrkVar3 instanceof yc.jL ? (yc.jL) rrkVar3 : null;
            if (jLVar != null) {
                arrayList2.add(jLVar);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it5 = resultList.iterator();
        while (it5.hasNext()) {
            yc.rrk rrkVar4 = (yc.rrk) it5.next();
            yc.xTb xtb = rrkVar4 instanceof yc.xTb ? (yc.xTb) rrkVar4 : null;
            if (xtb != null) {
                arrayList3.add(xtb);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it6 = resultList.iterator();
        while (it6.hasNext()) {
            yc.rrk rrkVar5 = (yc.rrk) it6.next();
            yc.l lVar = rrkVar5 instanceof yc.l ? (yc.l) rrkVar5 : null;
            if (lVar != null) {
                arrayList4.add(lVar);
            }
        }
        if (arrayList.isEmpty()) {
            str = "";
            size = 0;
        } else {
            size = arrayList.size();
            str = editActivity.getResources().getString(2132018962) + " (" + arrayList.size() + ")\n";
        }
        if (!arrayList2.isEmpty()) {
            size += arrayList2.size();
            str = editActivity.getResources().getString(2132020378) + " (" + arrayList2.size() + ")\n";
        }
        if (!arrayList3.isEmpty()) {
            size += arrayList3.size();
            str = editActivity.getResources().getString(2132020424) + " (" + arrayList3.size() + ")\n";
        }
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size();
            str = editActivity.getResources().getString(2132020423) + " (" + arrayList4.size() + ")\n";
        }
        if (!StringsKt.isBlank(str) && size > 0) {
            new AlertDialog.Builder(editActivity).o(size == resultList.size() ? 2132017211 : 2132017212).KN(str).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.NB
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    VS.E2(dialogInterface, i2);
                }
            }).create().show();
        }
        jVar2.n();
        return Unit.INSTANCE;
    }

    public VS(EditActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f44798n = activity;
        this.rl = new Random();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Ik(tu.SPz sPz) {
        return "addAudio:MediaInfo: " + sPz;
    }

    private final void M7(Uri uri, tu.aC aCVar, long j2, String str, boolean z2, int i2, int i3, int i5) {
        boolean z3;
        EditActivity editActivity = this.f44798n;
        int iXMQ = aCVar.xMQ();
        if (iXMQ == 0) {
            z3 = false;
        } else {
            if (iXMQ != 90) {
                if (iXMQ != 180) {
                    if (iXMQ != 270) {
                        throw new IllegalStateException();
                    }
                }
                z3 = false;
            }
            z3 = true;
        }
        QmE.iF iFVarLm1 = editActivity.lm1();
        Bundle bundle = new Bundle();
        bundle.putLong("fileSize", j2);
        bundle.putInt("width", aCVar.qie());
        bundle.putInt("height", aCVar.J2());
        bundle.putLong("duration", aCVar.t());
        bundle.putString("mime", aCVar.KN());
        bundle.putInt("rotation", aCVar.xMQ());
        tu.u uVarGh = aCVar.gh();
        bundle.putInt("fphs", uVarGh != null ? uVarGh.O() : -1);
        Unit unit = Unit.INSTANCE;
        iFVarLm1.n(new j.fuX("add_layer_video", bundle));
        Pair pairN = z3 ? HI0.h.n(AbstractC1951j.Uo(aCVar.J2(), aCVar.qie(), p5().get_scene().getWidth(), p5().get_scene().getHeight())) : AbstractC1951j.Uo(aCVar.qie(), aCVar.J2(), p5().get_scene().getWidth(), p5().get_scene().getHeight());
        int iIntValue = ((Number) pairN.component1()).intValue();
        int iIntValue2 = ((Number) pairN.component2()).intValue();
        if (uri.getPath() != null) {
            com.alightcreative.app.motion.persist.j.INSTANCE.getRecentlyUsedMedia();
        }
        int iT = (int) ((aCVar.t() / ((long) 1000)) - ((long) i5));
        float f3 = iIntValue / 2.0f;
        float f4 = iIntValue2 / 2.0f;
        editActivity.X(SceneHolder.DefaultImpls.add$default(p5(), ShapeElementKt.ShapeElement(TransformKt.rotatedBy(eF(editActivity), aCVar.xMQ()), HW.C.qie(editActivity, i2), (iT - i3) + HW.C.gh(editActivity, i2), CubicBSplineKt.toCompound(tTF.j.n((-iIntValue) / 2.0f, (-iIntValue2) / 2.0f, f3, f4)), (55264 & 16) != 0 ? KeyableKt.keyable(new SolidColor(1.0f, 1.0f, 1.0f, 1.0f)) : null, (55264 & 32) != 0 ? null : null, (55264 & 64) != 0 ? null : uri, (55264 & 128) != 0 ? 0L : 0L, (55264 & 256) != 0 ? "" : str, (55264 & 512) != 0 ? 0 : i3, (55264 & 1024) != 0 ? Integer.MAX_VALUE : iT, (55264 & 2048) != 0 ? FillType.COLOR : FillType.MEDIA, (55264 & 4096) != 0 ? false : false, (55264 & 8192) != 0 ? LiveShapeRef.INSTANCE.getNONE() : new LiveShapeRef("com.alightcreative.shapes.rect", MapsKt.mapOf(TuplesKt.to("size", new KeyableUserParameterValue(new Vector2D(f3, f4))))), (55264 & 16384) != 0 ? BlendingMode.NORMAL : null, (55264 & 32768) != 0 ? KeyableEdgeDecoration.INSTANCE.getNO_STROKE() : null), 0, 2, null), z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String U(tu.SPz sPz) {
        return "addVideo:MediaInfo: " + sPz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViF(EditActivity editActivity, Uri uri, String str, String str2, long j2, int i2, VS vs, boolean z2, int i3, Pair pair) {
        Pair pair2 = pair == null ? TuplesKt.to(null, null) : pair;
        BitmapFactory.Options options = (BitmapFactory.Options) pair2.component1();
        IOException iOException = (IOException) pair2.component2();
        if (options == null) {
            if (iOException != null) {
                HI0.fuX.O(editActivity, 2132017208, editActivity.getString(2132017207) + "\n\n" + iOException.getLocalizedMessage());
            } else {
                HI0.fuX.nr(editActivity, 2132017208, 2132017207);
            }
            return Unit.INSTANCE;
        }
        String path = uri.getPath();
        if (path != null) {
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar.setRecentlyUsedMedia(com.alightcreative.app.motion.persist.n.J2(jVar.getRecentlyUsedMedia(), path));
        }
        int i5 = options.outWidth;
        int i7 = options.outHeight;
        String str3 = options.outMimeType;
        if (str3 == null) {
            str3 = "image/*";
        }
        MediaUriInfoKt.updateCache(new MediaUriInfo(uri, str, str2, str3, j2, 0L, null, i5, i7, i2, 0L, 0, 3168, null));
        vs.g(uri, j2, str2, options, i2, z2, i3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void WPU(VS vs, Uri uri, boolean z2, boolean z3, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = true;
        }
        if ((i3 & 4) != 0) {
            z3 = true;
        }
        if ((i3 & 8) != 0) {
            i2 = I7a.n();
        }
        vs.S(uri, z2, z3, i2);
    }

    static /* synthetic */ void X(VS vs, UUID uuid, boolean z2, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        vs.e(uuid, z2, str);
    }

    public static /* synthetic */ void bzg(VS vs, Uri uri, boolean z2, boolean z3, int i2, int i3, int i5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        boolean z5 = (i7 & 4) != 0 ? false : z3;
        if ((i7 & 8) != 0) {
            i2 = HW.C.ty(vs.f44798n);
        }
        vs.rV9(uri, z4, z5, i2, (i7 & 16) != 0 ? 0 : i3, (i7 & 32) != 0 ? 0 : i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(EditActivity editActivity, Uri uri, VS vs, final tu.SPz mediaInfo) {
        Intrinsics.checkNotNullParameter(mediaInfo, "mediaInfo");
        XoT.C.Uo(editActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.Kef
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VS.Ik(mediaInfo);
            }
        });
        if (mediaInfo instanceof tu.C) {
            tu.C c2 = (tu.C) mediaInfo;
            Toast.makeText(editActivity, c2.n() != 0 ? c2.n() : 2132018962, 0).show();
        } else {
            if (!(mediaInfo instanceof tu.aC)) {
                throw new NoWhenBranchMatchedException();
            }
            tu.aC aCVar = (tu.aC) mediaInfo;
            MediaUriInfoKt.updateCache(new MediaUriInfo(uri, aCVar.O(), aCVar.mUb(), aCVar.KN(), aCVar.nr(), 0L, null, 0, 0, 0, aCVar.t(), 0, 3040, null));
            vs.r(uri, aCVar);
        }
        return Unit.INSTANCE;
    }

    private final void e(UUID uuid, boolean z2, String str) {
        EditActivity editActivity = this.f44798n;
        File fileZ = HI0.afx.Z(editActivity, uuid);
        if (fileZ.exists()) {
            Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(fileZ, null, 1, null), false, false, false, 14, null);
            if (sceneUnserializeScene$default.getType() == SceneType.ELEMENT) {
                QmE.iF iFVarLm1 = editActivity.lm1();
                Bundle bundle = new Bundle();
                bundle.putInt("width", sceneUnserializeScene$default.getWidth());
                bundle.putInt("height", sceneUnserializeScene$default.getHeight());
                bundle.putInt("duration", sceneUnserializeScene$default.getTotalTime());
                Unit unit = Unit.INSTANCE;
                iFVarLm1.n(new j.fuX("add_layer_element", bundle));
            } else {
                QmE.iF iFVarLm12 = editActivity.lm1();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("width", sceneUnserializeScene$default.getWidth());
                bundle2.putInt("height", sceneUnserializeScene$default.getHeight());
                bundle2.putInt("duration", sceneUnserializeScene$default.getTotalTime());
                Unit unit2 = Unit.INSTANCE;
                iFVarLm12.n(new j.fuX("add_layer_project", bundle2));
            }
            Qik.j.n(editActivity, SceneHolder.DefaultImpls.add$default(p5(), NestedSceneElementKt.NestedSceneElement(eF(editActivity), HW.C.ty(editActivity), TimeKt.roundToFrameEndTime(HW.C.ty(editActivity) + sceneUnserializeScene$default.getTotalTime(), p5().get_scene().getFramesPerHundredSeconds()), sceneUnserializeScene$default, z2 ? uuid : null, (16288 & 32) != 0 ? 0L : 0L, (16288 & 64) != 0 ? "" : sceneUnserializeScene$default.getTitle(), (16288 & 128) != 0 ? 0 : 0, (16288 & 256) != 0 ? Integer.MAX_VALUE : sceneUnserializeScene$default.getTotalTime(), (16288 & 512) != 0 ? FillType.INTRINSIC : null, (16288 & 1024) != 0 ? KeyableKt.keyable(ColorKt.SolidColor()) : null, (16288 & 2048) != 0 ? false : false, (16288 & 4096) != 0 ? BlendingMode.NORMAL : null, (16288 & 8192) != 0 ? null : str), 0, 2, null), false, 2, null);
        }
    }

    private final void g(Uri uri, long j2, String str, BitmapFactory.Options options, int i2, boolean z2, int i3) {
        int i5 = options.outWidth;
        int i7 = options.outHeight;
        String str2 = options.outMimeType;
        if (str2 == null) {
            str2 = "image/*";
        }
        nY(uri, j2, str, i5, i7, str2, i2, z2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa A[Catch: all -> 0x00fd, TryCatch #5 {all -> 0x00fd, blocks: (B:36:0x00d5, B:50:0x0104, B:51:0x011f, B:45:0x00fa, B:48:0x0100), top: B:90:0x00d5, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100 A[Catch: all -> 0x00fd, TryCatch #5 {all -> 0x00fd, blocks: (B:36:0x00d5, B:50:0x0104, B:51:0x011f, B:45:0x00fa, B:48:0x0100), top: B:90:0x00d5, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104 A[Catch: all -> 0x00fd, TryCatch #5 {all -> 0x00fd, blocks: (B:36:0x00d5, B:50:0x0104, B:51:0x011f, B:45:0x00fa, B:48:0x0100), top: B:90:0x00d5, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #5 {all -> 0x00fd, blocks: (B:36:0x00d5, B:50:0x0104, B:51:0x011f, B:45:0x00fa, B:48:0x0100), top: B:90:0x00d5, outer: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList iF(ArrayList arrayList, EditActivity editActivity, HI0.Q q2) {
        Boolean bool;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            yc.Zs zs = (yc.Zs) next;
            int i2 = j.$EnumSwitchMapping$0[zs.KN().ordinal()];
            if (i2 == 1) {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = editActivity.getContentResolver().openAssetFileDescriptor(zs.xMQ(), "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                            try {
                                fileInputStream.skip(assetFileDescriptorOpenAssetFileDescriptor.getStartOffset());
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeStream(fileInputStream, null, options);
                                int iNr = zs.nr();
                                if (iNr == 0) {
                                    bool = Boolean.FALSE;
                                    if (bool != null) {
                                        int i3 = options.outWidth;
                                        int i5 = options.outHeight;
                                        boolean zBooleanValue = bool.booleanValue();
                                        String outMimeType = options.outMimeType;
                                        Intrinsics.checkNotNullExpressionValue(outMimeType, "outMimeType");
                                        arrayList2.add(new rrk.j(i3, i5, zBooleanValue, outMimeType, zs));
                                    } else {
                                        arrayList2.add(yc.ys8.f76174n);
                                    }
                                    CloseableKt.closeFinally(fileInputStream, null);
                                    CloseableKt.closeFinally(assetFileDescriptorOpenAssetFileDescriptor, null);
                                } else if (iNr == 90) {
                                    bool = Boolean.TRUE;
                                    if (bool != null) {
                                    }
                                    CloseableKt.closeFinally(fileInputStream, null);
                                    CloseableKt.closeFinally(assetFileDescriptorOpenAssetFileDescriptor, null);
                                } else {
                                    if (iNr != 180) {
                                        if (iNr != 270) {
                                            bool = null;
                                        }
                                    }
                                    if (bool != null) {
                                    }
                                    CloseableKt.closeFinally(fileInputStream, null);
                                    CloseableKt.closeFinally(assetFileDescriptorOpenAssetFileDescriptor, null);
                                }
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    CloseableKt.closeFinally(fileInputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                CloseableKt.closeFinally(assetFileDescriptorOpenAssetFileDescriptor, th3);
                                throw th4;
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (IOException e2) {
                    try {
                        InputStream inputStreamOpenInputStream = editActivity.getContentResolver().openInputStream(zs.xMQ());
                        if (inputStreamOpenInputStream != null) {
                            try {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options2);
                                arrayList2.add(yc.ys8.f76174n);
                                CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    CloseableKt.closeFinally(inputStreamOpenInputStream, th5);
                                    throw th6;
                                }
                            }
                        } else {
                            continue;
                        }
                    } catch (IOException unused) {
                        TuplesKt.to(null, e2);
                    }
                }
            } else if (i2 != 2) {
                continue;
            } else {
                tu.SPz sPzTe = tu.r.te(q2, zs.xMQ(), false, 4, null);
                if (sPzTe instanceof tu.C) {
                    arrayList2.add(yc.ys8.f76174n);
                } else {
                    if (!(sPzTe instanceof tu.aC)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tu.aC aCVar = (tu.aC) sPzTe;
                    if (aCVar.gh() == null || !aCVar.gh().mUb()) {
                        arrayList2.add(yc.jL.f76017n);
                    } else if (aCVar.t() / ((long) 1000) < 15) {
                        arrayList2.add(yc.xTb.f76156n);
                    } else {
                        int iMax = Math.max(aCVar.qie(), aCVar.J2());
                        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                        if (iMax > (jVar.getMaxResWithVideo() * 16) / 9 || Math.min(aCVar.qie(), aCVar.J2()) > jVar.getMaxResWithVideo()) {
                            arrayList2.add(yc.l.f76022n);
                        } else {
                            arrayList2.add(new rrk.n(aCVar, zs));
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jB(EditActivity editActivity, Uri uri, String str, String str2, long j2, VS vs, boolean z2, int i2, int i3, int i5, final tu.SPz mediaInfo) {
        Integer num;
        Intrinsics.checkNotNullParameter(mediaInfo, "mediaInfo");
        XoT.C.Uo(editActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.Zvi
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VS.U(mediaInfo);
            }
        });
        if (mediaInfo instanceof tu.C) {
            tu.C c2 = (tu.C) mediaInfo;
            Toast.makeText(editActivity, c2.n() != 0 ? c2.n() : 2132018962, 0).show();
        } else {
            if (!(mediaInfo instanceof tu.aC)) {
                throw new NoWhenBranchMatchedException();
            }
            tu.aC aCVar = (tu.aC) mediaInfo;
            int iQie = aCVar.qie();
            int iJ2 = aCVar.J2();
            int iXMQ = aCVar.xMQ();
            String strKN = aCVar.KN();
            long jT2 = aCVar.t();
            tu.u uVarGh = aCVar.gh();
            MediaUriInfoKt.updateCache(new MediaUriInfo(uri, str, str2, strKN, j2, 0L, null, iQie, iJ2, iXMQ, jT2, uVarGh != null ? uVarGh.O() : -1, 96, null));
            if (aCVar.gh() == null || !aCVar.gh().mUb()) {
                num = 2132020378;
            } else if (aCVar.t() / ((long) 1000) < 15) {
                num = 2132020424;
            } else {
                int iMax = Math.max(aCVar.qie(), aCVar.J2());
                com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                num = (iMax > (jVar.getMaxResWithVideo() * 16) / 9 || Math.min(aCVar.qie(), aCVar.J2()) > jVar.getMaxResWithVideo()) ? 2132020423 : null;
            }
            if (num != null) {
                AlertDialog.Builder builderO = new AlertDialog.Builder(editActivity).o(num.intValue());
                Resources resources = editActivity.getResources();
                tu.u uVarGh2 = aCVar.gh();
                String strKN2 = uVarGh2 != null ? uVarGh2.KN() : null;
                tu.Ml mlN = aCVar.n();
                String strO = mlN != null ? mlN.O() : null;
                tu.u uVarGh3 = aCVar.gh();
                Integer numValueOf = Integer.valueOf(uVarGh3 != null ? uVarGh3.xMQ() : 0);
                tu.u uVarGh4 = aCVar.gh();
                Integer numValueOf2 = Integer.valueOf(uVarGh4 != null ? uVarGh4.Uo() : 0);
                tu.u uVarGh5 = aCVar.gh();
                Integer numValueOf3 = Integer.valueOf(uVarGh5 != null ? uVarGh5.gh() : 0);
                tu.u uVarGh6 = aCVar.gh();
                Integer numValueOf4 = Integer.valueOf(uVarGh6 != null ? uVarGh6.J2() : 0);
                tu.u uVarGh7 = aCVar.gh();
                builderO.KN(resources.getString(2132020379, str2, strKN2, strO, numValueOf, numValueOf2, numValueOf3, numValueOf4, TimeKt.formatFPS(uVarGh7 != null ? uVarGh7.O() : 0), Integer.valueOf(aCVar.rl()), TimeKt.formatTimeMillis$default((int) (aCVar.t() / ((long) 1000)), "hhh:mm:ss.ttt", false, 4, null))).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.vE
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i7) {
                        VS.P5(dialogInterface, i7);
                    }
                }).create().show();
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(str2);
            vs.M7(uri, aCVar, j2, str2, z2, i2, i3, i5);
        }
        return Unit.INSTANCE;
    }

    private final void nY(Uri uri, long j2, String str, int i2, int i3, String str2, int i5, boolean z2, int i7) {
        boolean z3;
        EditActivity editActivity = this.f44798n;
        if (i5 == 0) {
            z3 = false;
        } else {
            if (i5 != 90) {
                if (i5 != 180) {
                    if (i5 != 270) {
                        throw new IllegalStateException();
                    }
                }
                z3 = false;
            }
            z3 = true;
        }
        QmE.iF iFVarLm1 = editActivity.lm1();
        Bundle bundle = new Bundle();
        bundle.putInt("rotation", i5);
        bundle.putLong("fileSize", j2);
        bundle.putString("mime", str2);
        bundle.putInt("width", i2);
        bundle.putInt("height", i3);
        Unit unit = Unit.INSTANCE;
        iFVarLm1.n(new j.fuX("add_layer_image", bundle));
        Pair pairN = z3 ? HI0.h.n(AbstractC1951j.Uo(i3, i2, p5().get_scene().getWidth(), p5().get_scene().getHeight())) : AbstractC1951j.Uo(i2, i3, p5().get_scene().getWidth(), p5().get_scene().getHeight());
        int iIntValue = ((Number) pairN.component1()).intValue();
        float f3 = iIntValue / 2.0f;
        float fIntValue = ((Number) pairN.component2()).intValue() / 2.0f;
        editActivity.X(SceneHolder.DefaultImpls.add$default(p5(), ShapeElementKt.ShapeElement(TransformKt.rotatedBy(eF(editActivity), i5), HW.C.ty(editActivity), HW.C.az(editActivity) + i7, CubicBSplineKt.toCompound(tTF.j.n((-iIntValue) / 2.0f, (-r1) / 2.0f, f3, fIntValue)), (55264 & 16) != 0 ? KeyableKt.keyable(new SolidColor(1.0f, 1.0f, 1.0f, 1.0f)) : null, (55264 & 32) != 0 ? null : uri, (55264 & 64) != 0 ? null : null, (55264 & 128) != 0 ? 0L : 0L, (55264 & 256) != 0 ? "" : str, (55264 & 512) != 0 ? 0 : 0, (55264 & 1024) != 0 ? Integer.MAX_VALUE : 0, (55264 & 2048) != 0 ? FillType.COLOR : FillType.MEDIA, (55264 & 4096) != 0 ? false : false, (55264 & 8192) != 0 ? LiveShapeRef.INSTANCE.getNONE() : new LiveShapeRef("com.alightcreative.shapes.rect", MapsKt.mapOf(TuplesKt.to("size", new KeyableUserParameterValue(new Vector2D(f3, fIntValue))))), (55264 & 16384) != 0 ? BlendingMode.NORMAL : null, (55264 & 32768) != 0 ? KeyableEdgeDecoration.INSTANCE.getNO_STROKE() : null), 0, 2, null), z2);
    }

    private final SceneHolder p5() {
        return this.f44798n.getSceneHolder();
    }

    private final void r(Uri uri, tu.aC aCVar) {
        EditActivity editActivity = this.f44798n;
        QmE.iF iFVarLm1 = editActivity.lm1();
        Bundle bundle = new Bundle();
        bundle.putLong("fileSize", aCVar.nr());
        bundle.putString("mime", aCVar.KN());
        bundle.putLong("duration", aCVar.t());
        Unit unit = Unit.INSTANCE;
        iFVarLm1.n(new j.fuX("add_layer_audio", bundle));
        SceneHolder sceneHolderP5 = p5();
        int iTy = HW.C.ty(editActivity);
        long j2 = 1000;
        int iAz = HW.C.az(editActivity) + ((int) (aCVar.t() / j2));
        String strMUb = aCVar.mUb();
        if (strMUb == null) {
            Scene scene = p5().get_scene();
            String string = editActivity.getString(2132017279);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            strMUb = SceneKt.makeNumberedLabel(scene, string);
        }
        SceneElement sceneElementAdd$default = SceneHolder.DefaultImpls.add$default(sceneHolderP5, AudioElementKt.AudioElement(iTy, iAz, 0, (int) (aCVar.t() / j2), (144 & 16) != 0 ? 0L : 0L, false, strMUb, (144 & 128) != 0 ? KeyableKt.keyable(1.0f) : null, uri), 0, 2, null);
        String path = uri.getPath();
        if (path != null) {
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar.setRecentlyUsedAudios(com.alightcreative.app.motion.persist.n.J2(jVar.getRecentlyUsedAudios(), path));
        }
        Qik.j.n(editActivity, sceneElementAdd$default, false, 2, null);
    }

    public static /* synthetic */ void ty(VS vs, Uri uri, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        vs.az(uri, z2);
    }

    public final void N(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        EditActivity editActivity = this.f44798n;
        X(this, id, true, null, 4, null);
        QmE.iF iFVarLm1 = editActivity.lm1();
        String string = editActivity.getProjectHolder().Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iFVarLm1.n(new j.T(string, rWZ.C.f73042S));
    }

    public final void S(final Uri uri, boolean z2, final boolean z3, final int i2) {
        String str;
        String str2;
        String name;
        Intrinsics.checkNotNullParameter(uri, "uri");
        final EditActivity editActivity = this.f44798n;
        if (z2) {
            editActivity.getContentResolver().takePersistableUriPermission(uri, 1);
        }
        Cursor cursorQuery = editActivity.getContentResolver().query(uri, null, null, null, null);
        str = "Image";
        if (cursorQuery != null) {
            int columnIndex = cursorQuery.getColumnIndex("_display_name");
            int columnIndex2 = cursorQuery.getColumnIndex("_size");
            int columnIndex3 = cursorQuery.getColumnIndex("orientation");
            int columnIndex4 = cursorQuery.getColumnIndex("_data");
            cursorQuery.moveToFirst();
            String string = columnIndex >= 0 ? cursorQuery.getString(columnIndex) : null;
            str = string != null ? string : "Image";
            Long lValueOf = columnIndex2 >= 0 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
            jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
            Integer numValueOf = columnIndex3 >= 0 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
            iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            String string2 = columnIndex4 >= 0 ? cursorQuery.getString(columnIndex4) : null;
            if (string2 != null) {
                name = new File(string2).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            } else {
                name = str;
            }
            cursorQuery.close();
            str2 = str;
            str = name;
        } else {
            str2 = "Image";
        }
        String scheme = uri.getScheme();
        kPg.fuX fux = kPg.fuX.f69922n;
        if (Intrinsics.areEqual(scheme, fux.rl())) {
            kPg.n nVarT = fux.t(uri);
            if (nVarT == null) {
                HI0.fuX.nr(editActivity, 2132017208, 2132017207);
                return;
            } else {
                nY(uri, jLongValue, str2, nVarT.J2(), nVarT.rl(), nVarT.t(), iIntValue, z3, i2);
                return;
            }
        }
        final int i3 = iIntValue;
        final long j2 = jLongValue;
        final String str3 = str2;
        final String str4 = str;
        HI0.qz.nr(null, new Function0() { // from class: com.alightcreative.app.motion.activities.j8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VS.aYN(editActivity, uri);
            }
        }, 1, null).Uo(new Function1() { // from class: com.alightcreative.app.motion.activities.pm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VS.ViF(editActivity, uri, str4, str3, j2, i3, this, z3, i2, (Pair) obj);
            }
        });
        QmE.iF iFVarLm1 = editActivity.lm1();
        String string3 = editActivity.getProjectHolder().Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        iFVarLm1.n(new j.T(string3, rWZ.C.f73051t));
    }

    public final void T() {
        EditActivity editActivity = this.f44798n;
        SceneHolder sceneHolderP5 = p5();
        KeyableTransform keyableTransformEF = eF(editActivity);
        int iTy = HW.C.ty(editActivity);
        int iAz = HW.C.az(editActivity) + com.alightcreative.app.motion.persist.j.INSTANCE.getDefaultLayerDuration();
        Scene scene = p5().get_scene();
        String string = editActivity.getResources().getString(2132020257);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Qik.j.n(editActivity, SceneHolder.DefaultImpls.add$default(sceneHolderP5, NullObjectElementKt.NullObjectElement$default(keyableTransformEF, iTy, iAz, 0L, SceneKt.makeNumberedLabel(scene, string), 0, 0, 104, null), 0, 2, null), false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void XQ() {
        EditActivity editActivity = this.f44798n;
        SceneHolder sceneHolderP5 = p5();
        KeyableTransform keyableTransformEF = eF(editActivity);
        int iTy = HW.C.ty(editActivity);
        int iAz = HW.C.az(editActivity) + com.alightcreative.app.motion.persist.j.INSTANCE.getDefaultLayerDuration();
        Scene scene = p5().get_scene();
        String string = editActivity.getString(2132017709);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SceneElement sceneElementAdd$default = SceneHolder.DefaultImpls.add$default(sceneHolderP5, DrawingElementKt.DrawingElement(keyableTransformEF, iTy, iAz, (16248 & 8) != 0 ? KeyableKt.keyable(new SolidColor(1.0f, 1.0f, 1.0f, 1.0f)) : null, (16248 & 16) != 0 ? null : null, (16248 & 32) != 0 ? null : null, (16248 & 64) != 0 ? 0L : 0L, (16248 & 128) != 0 ? "" : SceneKt.makeNumberedLabel(scene, string), (16248 & 256) != 0 ? 0 : 0, (16248 & 512) != 0 ? Integer.MAX_VALUE : 0, (16248 & 1024) != 0 ? FillType.INTRINSIC : null, (16248 & 2048) != 0 ? false : false, (16248 & 4096) != 0 ? BlendingMode.NORMAL : null, (16248 & 8192) != 0 ? Drawing.INSTANCE.getEMPTY() : null), 0, 2, null);
        editActivity.lm1().n(new j.fuX("add_layer_drawing", null, 2, 0 == true ? 1 : 0));
        Qik.j.n(editActivity, sceneElementAdd$default, false, 2, null);
    }

    public final void Z() {
        EditActivity editActivity = this.f44798n;
        int width = p5().get_rootScene().getWidth();
        int height = p5().get_rootScene().getHeight();
        int exportWidth = p5().get_rootScene().getExportWidth();
        int exportHeight = p5().get_rootScene().getExportHeight();
        ReTimingMethod reTimingMethod = ReTimingMethod.OFF;
        String str = null;
        int i2 = 0;
        List list = null;
        Scene scene = new Scene(str, i2, width, height, exportWidth, exportHeight, list, p5().get_rootScene().getFramesPerHundredSeconds(), SolidColor.INSTANCE.getTRANSPARENT(), null, null, null, reTimingMethod, 0, 0, 0, false, 0L, null, null, 1044035, null);
        SceneHolder sceneHolderP5 = p5();
        KeyableTransform keyableTransformEF = eF(editActivity);
        int iTy = HW.C.ty(editActivity);
        int iAz = HW.C.az(editActivity) + 2000;
        Scene scene2 = p5().get_scene();
        String string = editActivity.getResources().getString(2132019347);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Qik.j.n(editActivity, SceneHolder.DefaultImpls.add$default(sceneHolderP5, NestedSceneElementKt.NestedSceneElement(keyableTransformEF, iTy, iAz, scene, null, (16288 & 32) != 0 ? 0L : 0L, (16288 & 64) != 0 ? "" : SceneKt.makeNumberedLabel(scene2, string), (16288 & 128) != 0 ? 0 : 0, (16288 & 256) != 0 ? Integer.MAX_VALUE : 0, (16288 & 512) != 0 ? FillType.INTRINSIC : null, (16288 & 1024) != 0 ? KeyableKt.keyable(ColorKt.SolidColor()) : null, (16288 & 2048) != 0 ? false : false, (16288 & 4096) != 0 ? BlendingMode.NORMAL : null, (16288 & 8192) != 0 ? null : null), 0, 2, null), false, 2, null);
    }

    public final void az(final Uri uri, boolean z2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        final EditActivity editActivity = this.f44798n;
        if (z2) {
            editActivity.getContentResolver().takePersistableUriPermission(uri, 1);
        }
        final HI0.Q q2 = new HI0.Q(editActivity);
        HI0.qz.nr(null, new Function0() { // from class: com.alightcreative.app.motion.activities.JC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VS.HI(q2, uri);
            }
        }, 1, null).Uo(new Function1() { // from class: com.alightcreative.app.motion.activities.AA
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VS.ck(editActivity, uri, this, (tu.SPz) obj);
            }
        });
        QmE.iF iFVarLm1 = editActivity.lm1();
        String string = editActivity.getProjectHolder().Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iFVarLm1.n(new j.T(string, rWZ.C.J2));
    }

    public final void nHg(E3 shapeOption) {
        LiveShapeRef liveShapeRef;
        KeyableEdgeDecoration no_stroke;
        String string;
        String name;
        Intrinsics.checkNotNullParameter(shapeOption, "shapeOption");
        EditActivity editActivity = this.f44798n;
        boolean z2 = (shapeOption.t() == null || ((CubicBSpline) CollectionsKt.first((List) LiveShapeScriptKt.getShapeOutline(shapeOption.t()).getContours())).getClosed()) ? false : true;
        QmE.iF iFVarLm1 = editActivity.lm1();
        Bundle bundle = new Bundle();
        bundle.putString("id", shapeOption.n());
        bundle.putBoolean("live", shapeOption.t() != null);
        bundle.putBoolean("closed", true ^ z2);
        Unit unit = Unit.INSTANCE;
        iFVarLm1.n(new j.fuX("add_layer_shape", bundle));
        SceneHolder sceneHolderP5 = p5();
        KeyableTransform keyableTransformEF = eF(editActivity);
        int iTy = HW.C.ty(editActivity);
        int iAz = HW.C.az(editActivity) + com.alightcreative.app.motion.persist.j.INSTANCE.getDefaultLayerDuration();
        CompoundCubicBSpline compoundCubicBSplineFitIn = shapeOption.t() == null ? CubicBSplineKt.fitIn(CubicBSplineKt.centeredAtOrigin(shapeOption.rl()), p5().get_scene().getWidth() / 2.0f, p5().get_scene().getHeight() / 2.0f) : shapeOption.rl();
        if (shapeOption.t() == null) {
            liveShapeRef = LiveShapeRef.INSTANCE.getNONE();
        } else {
            String id = shapeOption.t().getId();
            List<UserParameter> parameters = shapeOption.t().getParameters();
            ArrayList arrayList = new ArrayList();
            for (UserParameter userParameter : parameters) {
                KeyableUserParameterValue defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter);
                Pair pair = defaultKeyableUserParameterValue != null ? TuplesKt.to(userParameter.getName(), defaultKeyableUserParameterValue) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            liveShapeRef = new LiveShapeRef(id, MapsKt.toMap(arrayList));
        }
        KeyableSolidColor keyableSolidColorKeyable = KeyableKt.keyable(HI0.qf.t(Color.rgb(this.rl.nextInt(200) + 55, this.rl.nextInt(200) + 55, this.rl.nextInt(200) + 55)));
        if (z2) {
            KeyableEdgeDecoration no_stroke2 = KeyableEdgeDecoration.INSTANCE.getNO_STROKE();
            no_stroke = no_stroke2.copy((16339 & 1) != 0 ? no_stroke2.type : null, (16339 & 2) != 0 ? no_stroke2.direction : null, (16339 & 4) != 0 ? no_stroke2.enabled : true, (16339 & 8) != 0 ? no_stroke2.color : KeyableKt.keyable(HI0.qf.t(Color.rgb(this.rl.nextInt(200) + 55, this.rl.nextInt(200) + 55, this.rl.nextInt(200) + 55))), (16339 & 16) != 0 ? no_stroke2.alpha : null, (16339 & 32) != 0 ? no_stroke2.size : KeyableKt.keyable(20.0f), (16339 & 64) != 0 ? no_stroke2.hardness : null, (16339 & 128) != 0 ? no_stroke2.offset : null, (16339 & 256) != 0 ? no_stroke2.cap : null, (16339 & 512) != 0 ? no_stroke2.join : null, (16339 & 1024) != 0 ? no_stroke2.startStyle : null, (16339 & 2048) != 0 ? no_stroke2.endStyle : null, (16339 & 4096) != 0 ? no_stroke2.endSize : 0.0f, (16339 & 8192) != 0 ? no_stroke2.borderId : 0);
        } else {
            no_stroke = KeyableEdgeDecoration.INSTANCE.getNO_STROKE();
        }
        KeyableEdgeDecoration keyableEdgeDecoration = no_stroke;
        FillType fillType = z2 ? FillType.NONE : FillType.COLOR;
        Scene scene = p5().get_scene();
        LiveShape liveShapeT = shapeOption.t();
        if (liveShapeT == null || (name = liveShapeT.getName()) == null || (string = Iy.w6.rl(name, editActivity)) == null) {
            string = editActivity.getString(2132020125);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        Qik.j.n(editActivity, SceneHolder.DefaultImpls.add$default(sceneHolderP5, ShapeElementKt.ShapeElement(keyableTransformEF, iTy, iAz, compoundCubicBSplineFitIn, (55264 & 16) != 0 ? KeyableKt.keyable(new SolidColor(1.0f, 1.0f, 1.0f, 1.0f)) : keyableSolidColorKeyable, (55264 & 32) != 0 ? null : null, (55264 & 64) != 0 ? null : null, (55264 & 128) != 0 ? 0L : 0L, (55264 & 256) != 0 ? "" : SceneKt.makeNumberedLabel(scene, string), (55264 & 512) != 0 ? 0 : 0, (55264 & 1024) != 0 ? Integer.MAX_VALUE : 0, (55264 & 2048) != 0 ? FillType.COLOR : fillType, (55264 & 4096) != 0 ? false : false, (55264 & 8192) != 0 ? LiveShapeRef.INSTANCE.getNONE() : liveShapeRef, (55264 & 16384) != 0 ? BlendingMode.NORMAL : null, (55264 & 32768) != 0 ? KeyableEdgeDecoration.INSTANCE.getNO_STROKE() : keyableEdgeDecoration), 0, 2, null), false, 2, null);
    }

    public final void o() {
        EditActivity editActivity = this.f44798n;
        CameraProperties cameraProperties = CameraProperties.INSTANCE.getDEFAULT();
        float fCalcCameraZoom = CameraElementKt.calcCameraZoom(p5().get_scene(), ((Number) KeyableKt.valueAtTime(cameraProperties.getFov(), 0.0f)).floatValue());
        int iTy = HW.C.ty(editActivity);
        int totalTime = p5().get_rootScene().getTotalTime() != 0 ? p5().get_rootScene().getTotalTime() : com.alightcreative.app.motion.persist.j.INSTANCE.getDefaultLayerDuration() + HW.C.az(editActivity);
        SceneHolder sceneHolderP5 = p5();
        KeyableTransform keyableTransform = new KeyableTransform(KeyableKt.keyable(new Vector3D(p5().get_scene().getWidth() / 2.0f, p5().get_scene().getHeight() / 2.0f, -fCalcCameraZoom)), null, null, null, 0.0f, 0.0f, null, null, false, 510, null);
        int iCoerceAtMost = RangesKt.coerceAtMost(iTy, totalTime - 1);
        CameraProperties cameraPropertiesCopy$default = CameraProperties.copy$default(cameraProperties, null, null, false, KeyableKt.keyable(fCalcCameraZoom), KeyableKt.keyable(fCalcCameraZoom / 10.0f), null, false, null, KeyableKt.keyable(fCalcCameraZoom), KeyableKt.keyable(fCalcCameraZoom * 2.0f), 231, null);
        Scene scene = p5().get_scene();
        String string = editActivity.getResources().getString(2132017392);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Qik.j.n(editActivity, SceneHolder.DefaultImpls.add$default(sceneHolderP5, CameraElementKt.CameraElement$default(keyableTransform, iCoerceAtMost, totalTime, 0L, SceneKt.makeNumberedLabel(scene, string), 0, 0, cameraPropertiesCopy$default, 0L, 360, null), 0, 2, null), false, 2, null);
    }

    public final void rV9(final Uri uri, boolean z2, final boolean z3, final int i2, final int i3, final int i5) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        final EditActivity editActivity = this.f44798n;
        if (z2) {
            editActivity.getContentResolver().takePersistableUriPermission(uri, 1);
        }
        Cursor cursorQuery = editActivity.getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            HI0.fuX.nr(editActivity, 2132017214, 2132017213);
            return;
        }
        int columnIndex = cursorQuery.getColumnIndex("_display_name");
        int columnIndex2 = cursorQuery.getColumnIndex("_size");
        int columnIndex3 = cursorQuery.getColumnIndex("_data");
        cursorQuery.moveToFirst();
        final String string = cursorQuery.getString(columnIndex);
        final long j2 = cursorQuery.getLong(columnIndex2);
        String string2 = columnIndex3 >= 0 ? cursorQuery.getString(columnIndex3) : null;
        String name = string2 != null ? new File(string2).getName() : string;
        cursorQuery.close();
        final HI0.Q q2 = new HI0.Q(editActivity);
        final String str = name;
        HI0.qz.nr(null, new Function0() { // from class: com.alightcreative.app.motion.activities.qy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VS.Xw(q2, uri);
            }
        }, 1, null).Uo(new Function1() { // from class: com.alightcreative.app.motion.activities.SmR
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VS.jB(editActivity, uri, str, string, j2, this, z3, i2, i3, i5, (tu.SPz) obj);
            }
        });
        QmE.iF iFVarLm1 = editActivity.lm1();
        String string3 = editActivity.getProjectHolder().Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        iFVarLm1.n(new j.T(string3, rWZ.C.f73041O));
    }

    public final void s7N(String projectId, String projectPackageId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
        EditActivity editActivity = this.f44798n;
        UUID uuidFromString = UUID.fromString(projectId);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        e(uuidFromString, false, projectPackageId);
        QmE.iF iFVarLm1 = editActivity.lm1();
        String string = editActivity.getProjectHolder().Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iFVarLm1.n(new j.T(string, rWZ.C.f73044X));
    }

    public final void te(ArrayList addMediaInfoList, final MediaBrowser.j jVar, boolean z2) {
        String str;
        String str2;
        int i2;
        String name;
        Intrinsics.checkNotNullParameter(addMediaInfoList, "addMediaInfoList");
        final EditActivity editActivity = this.f44798n;
        if (z2) {
            Iterator it = addMediaInfoList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                editActivity.getContentResolver().takePersistableUriPermission(((AddVisualMediaInfo) next).getUri(), 1);
            }
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it2 = addMediaInfoList.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (true) {
            if (!it2.hasNext()) {
                final HI0.Q q2 = new HI0.Q(editActivity);
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = HW.C.ty(editActivity);
                final Ml.j jVarCk = editActivity.ck();
                HI0.qz.nr(null, new Function0() { // from class: com.alightcreative.app.motion.activities.AB
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return VS.iF(arrayList, editActivity, q2);
                    }
                }, 1, null).Uo(new Function1() { // from class: com.alightcreative.app.motion.activities.T3f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return VS.fD(this.f44775n, editActivity, intRef, jVar, jVarCk, (ArrayList) obj);
                    }
                });
                return;
            }
            Object next2 = it2.next();
            Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
            AddVisualMediaInfo addVisualMediaInfo = (AddVisualMediaInfo) next2;
            Cursor cursorQuery = editActivity.getContentResolver().query(addVisualMediaInfo.getUri(), null, null, null, null);
            if (cursorQuery != null) {
                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                int columnIndex2 = cursorQuery.getColumnIndex("_size");
                int columnIndex3 = cursorQuery.getColumnIndex("orientation");
                int columnIndex4 = cursorQuery.getColumnIndex("_data");
                cursorQuery.moveToFirst();
                String string = columnIndex >= 0 ? cursorQuery.getString(columnIndex) : null;
                String str3 = string != null ? string : "Image";
                Long lValueOf = columnIndex2 >= 0 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
                Integer numValueOf = columnIndex3 >= 0 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                String string2 = columnIndex4 >= 0 ? cursorQuery.getString(columnIndex4) : null;
                if (string2 != null) {
                    name = new File(string2).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                } else {
                    name = str3;
                }
                cursorQuery.close();
                str = name;
                str2 = str3;
                i2 = iIntValue;
            } else {
                tu.Ew ewValueOf = tu.Ew.valueOf(addVisualMediaInfo.getTypeName());
                tu.Ew ew = tu.Ew.J2;
                String str4 = ewValueOf == ew ? "Image" : ewValueOf == tu.Ew.f73884r ? "Video" : "";
                str = ewValueOf != ew ? ewValueOf == tu.Ew.f73884r ? "Video" : "" : "Image";
                str2 = str4;
                i2 = 0;
            }
            arrayList.add(new yc.Zs(addVisualMediaInfo.getUri(), tu.Ew.valueOf(addVisualMediaInfo.getTypeName()), str2, jLongValue, i2, str, addVisualMediaInfo.getDuration(), (int) addVisualMediaInfo.getStartTrim(), (int) addVisualMediaInfo.getEndTrim()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v() {
        EditActivity editActivity = this.f44798n;
        editActivity.lm1().n(new j.fuX("add_layer_vectordrawing", null, 2, 0 == true ? 1 : 0));
        SceneHolder sceneHolderP5 = p5();
        KeyableTransform keyableTransformEF = eF(editActivity);
        int iTy = HW.C.ty(editActivity);
        int iAz = HW.C.az(editActivity) + com.alightcreative.app.motion.persist.j.INSTANCE.getDefaultLayerDuration();
        CompoundCubicBSpline compoundCubicBSpline = new CompoundCubicBSpline(CollectionsKt.listOf(new CubicBSpline(CollectionsKt.emptyList(), false, false, 4, null)));
        KeyableSolidColor keyableSolidColorKeyable = KeyableKt.keyable(HI0.qf.t(Color.rgb(this.rl.nextInt(200) + 55, this.rl.nextInt(200) + 55, this.rl.nextInt(200) + 55)));
        Scene scene = p5().get_scene();
        String string = editActivity.getString(2132020125);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Qik.j.n(editActivity, SceneHolder.DefaultImpls.add$default(sceneHolderP5, ShapeElementKt.ShapeElement(keyableTransformEF, iTy, iAz, compoundCubicBSpline, (55264 & 16) != 0 ? KeyableKt.keyable(new SolidColor(1.0f, 1.0f, 1.0f, 1.0f)) : keyableSolidColorKeyable, (55264 & 32) != 0 ? null : null, (55264 & 64) != 0 ? null : null, (55264 & 128) != 0 ? 0L : 0L, (55264 & 256) != 0 ? "" : SceneKt.makeNumberedLabel(scene, string), (55264 & 512) != 0 ? 0 : 0, (55264 & 1024) != 0 ? Integer.MAX_VALUE : 0, (55264 & 2048) != 0 ? FillType.COLOR : null, (55264 & 4096) != 0 ? false : false, (55264 & 8192) != 0 ? LiveShapeRef.INSTANCE.getNONE() : null, (55264 & 16384) != 0 ? BlendingMode.NORMAL : null, (55264 & 32768) != 0 ? KeyableEdgeDecoration.INSTANCE.getNO_STROKE() : null), 0, 2, null), false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void wTp() {
        EditActivity editActivity = this.f44798n;
        SceneHolder sceneHolderP5 = p5();
        KeyableTransform keyableTransformEF = eF(editActivity);
        int iTy = HW.C.ty(editActivity);
        int iAz = HW.C.az(editActivity) + com.alightcreative.app.motion.persist.j.INSTANCE.getDefaultLayerDuration();
        FillType fillType = FillType.COLOR;
        String str = "";
        float f3 = 18.0f;
        StyledTextAlign styledTextAlign = null;
        int i2 = 0;
        String str2 = "googlefonts?name=Roboto&weight=400";
        SceneElement sceneElementTextElement = TextElementKt.TextElement(keyableTransformEF, iTy, iAz, new StyledText(str, f3, styledTextAlign, i2, str2, 12, null), (14048 & 16) != 0 ? KeyableKt.keyable(new SolidColor(1.0f, 1.0f, 1.0f, 1.0f)) : KeyableSolidColor.INSTANCE.getGRAY(), (14048 & 32) != 0 ? null : null, (14048 & 64) != 0 ? null : null, (14048 & 128) != 0 ? 0L : 0L, (14048 & 256) != 0 ? "" : "", (14048 & 512) != 0 ? 0 : 0, (14048 & 1024) != 0 ? Integer.MAX_VALUE : 0, (14048 & 2048) != 0 ? FillType.COLOR : fillType, (14048 & 4096) != 0 ? false : false, (14048 & 8192) != 0 ? BlendingMode.NORMAL : null);
        editActivity.lm1().n(new j.fuX("add_layer_text", null, 2, 0 == true ? 1 : 0));
        Qik.j.n(editActivity, SceneHolder.DefaultImpls.add$default(sceneHolderP5, sceneElementTextElement, 0, 2, null), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E2(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P5(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private final KeyableTransform eF(EditActivity editActivity) {
        if (p5().getUserPreviewMode().nr()) {
            return yc.m8h.n(editActivity, p5().get_scene(), CameraElementKt.getActiveCameraAtTime(p5().get_scene(), HW.C.XQ(editActivity)));
        }
        return TransformKt.scaledBy$default(TransformKt.translatedBy(new KeyableTransform(KeyableKt.keyable(new Vector3D(p5().get_scene().getWidth() / 2.0f, p5().get_scene().getHeight() / 2.0f, 0.0f, 4, null)), null, null, null, 0.0f, 0.0f, null, null, false, 510, null), GeometryKt.unaryMinus(yc.RP.rl(p5().getUserPreviewMode()))), new Vector2D(1.0f / yc.RP.KN(p5().getUserPreviewMode()), 1.0f / yc.RP.KN(p5().getUserPreviewMode())), 0.0f, 0.0f, 6, null);
    }
}
