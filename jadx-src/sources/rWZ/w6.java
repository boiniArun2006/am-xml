package rWZ;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 {
    public static final Bundle n(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Pair pair = TuplesKt.to("AVAILABLE_STORAGE", Long.valueOf(nVar.t()));
        Pair pair2 = TuplesKt.to("ESTIMATED_FILE_SIZE", Long.valueOf(nVar.J2()));
        Pair pair3 = TuplesKt.to("FILE_SIZE", nVar.HI());
        Pair pair4 = TuplesKt.to("EXPORT_FORMAT", Integer.valueOf(nVar.KN()));
        Pair pair5 = TuplesKt.to("EXPORT_WIDTH", Integer.valueOf(nVar.az()));
        Pair pair6 = TuplesKt.to("EXPORT_HEIGHT", Integer.valueOf(nVar.mUb()));
        Pair pair7 = TuplesKt.to("EXPORT_CODEC", nVar.Uo());
        Pair pair8 = TuplesKt.to("EXPORT_IMAGE_FORMAT", nVar.gh());
        Pair pair9 = TuplesKt.to("EXPORT_FPS", nVar.xMQ());
        Pair pair10 = TuplesKt.to("EXPORT_QUALITY", nVar.qie());
        Pair pair11 = TuplesKt.to("PROJECT_ID", nVar.T());
        Pair pair12 = TuplesKt.to("PROJECT_TYPE", nVar.s7N());
        Pair pair13 = TuplesKt.to("CREATED_FROM_PP", Boolean.valueOf(nVar.nr()));
        Pair pair14 = TuplesKt.to("CREATED_FROM_XML", Boolean.valueOf(nVar.O()));
        Pair pair15 = TuplesKt.to("PROJECT_DURATION", Integer.valueOf(nVar.E2()));
        Pair pair16 = TuplesKt.to("PROJECT_WIDTH", Integer.valueOf(nVar.wTp()));
        Pair pair17 = TuplesKt.to("PROJECT_HEIGHT", Integer.valueOf(nVar.X()));
        Pair pair18 = TuplesKt.to("PROJECT_FPS", Integer.valueOf(nVar.e()));
        Pair pair19 = TuplesKt.to("PROJECT_BACKGROUND", nVar.fD());
        Pair pair20 = TuplesKt.to("HAS_WATERMARK", Boolean.valueOf(nVar.Ik()));
        Pair pair21 = TuplesKt.to("PROJECT_PACKAGE_ID", nVar.N());
        Pair pair22 = TuplesKt.to("PROJECT_PACKAGE_SHARING_FORMAT", nVar.nHg());
        Pair pair23 = TuplesKt.to("NUM_LAYERS", Integer.valueOf(nVar.WPU()));
        Pair pair24 = TuplesKt.to("NUM_LIVE_SHAPE", Integer.valueOf(nVar.aYN()));
        Pair pair25 = TuplesKt.to("NUM_VECTOR_SHAPE", Integer.valueOf(nVar.te()));
        Pair pair26 = TuplesKt.to("NUM_TEXT", Integer.valueOf(nVar.g()));
        Pair pair27 = TuplesKt.to("NUM_DRAWING", Integer.valueOf(nVar.XQ()));
        Pair pair28 = TuplesKt.to("NUM_AUDIO", Integer.valueOf(nVar.o()));
        Pair pair29 = TuplesKt.to("NUM_CAMERA", Integer.valueOf(nVar.Z()));
        Pair pair30 = TuplesKt.to("NUM_NULL_OBJECT", Integer.valueOf(nVar.ViF()));
        Pair pair31 = TuplesKt.to("NUM_GROUP", Integer.valueOf(nVar.S()));
        Pair pair32 = TuplesKt.to("NUM_PHOTO", Integer.valueOf(nVar.nY()));
        Pair pair33 = TuplesKt.to("NUM_VIDEO", Integer.valueOf(nVar.iF()));
        List listUo = nVar.v().Uo();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listUo, 10));
        Iterator it = listUo.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return BundleKt.n(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, TuplesKt.to("TEMPLATE_PP_ID_LIST", arrayList.toArray(new String[0])), TuplesKt.to("EXPORTED_WITH_TEMPLATE_TOGGLE_ON", Boolean.valueOf(nVar.ty())), TuplesKt.to("HAS_SPEED_KEYFRAMES", Boolean.valueOf(nVar.ck())));
    }

    public static final n rl(Bundle bundle) {
        pq.w6 w6Var;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        long j2 = bundle.getLong("AVAILABLE_STORAGE");
        long j3 = bundle.getLong("ESTIMATED_FILE_SIZE");
        Long lValueOf = Long.valueOf(bundle.getLong("FILE_SIZE"));
        int i2 = bundle.getInt("EXPORT_FORMAT");
        int i3 = bundle.getInt("EXPORT_WIDTH");
        int i5 = bundle.getInt("EXPORT_HEIGHT");
        String string = bundle.getString("EXPORT_CODEC");
        String string2 = bundle.getString("EXPORT_IMAGE_FORMAT");
        Integer numValueOf = Integer.valueOf(bundle.getInt("EXPORT_FPS"));
        Double dValueOf = Double.valueOf(bundle.getDouble("EXPORT_QUALITY"));
        String string3 = bundle.getString("PROJECT_ID", "");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = bundle.getString("PROJECT_TYPE", "");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        boolean z2 = bundle.getBoolean("CREATED_FROM_PP");
        boolean z3 = bundle.getBoolean("CREATED_FROM_XML");
        int i7 = bundle.getInt("PROJECT_DURATION");
        int i8 = bundle.getInt("PROJECT_WIDTH");
        int i9 = bundle.getInt("PROJECT_HEIGHT");
        int i10 = bundle.getInt("PROJECT_FPS");
        String string5 = bundle.getString("PROJECT_BACKGROUND", "");
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        boolean z4 = bundle.getBoolean("HAS_WATERMARK");
        String string6 = bundle.getString("PROJECT_PACKAGE_ID");
        int i11 = bundle.getInt("NUM_LAYERS");
        int i12 = bundle.getInt("NUM_LIVE_SHAPE");
        int i13 = bundle.getInt("NUM_VECTOR_SHAPE");
        int i14 = bundle.getInt("NUM_TEXT");
        int i15 = bundle.getInt("NUM_DRAWING");
        int i16 = bundle.getInt("NUM_AUDIO");
        int i17 = bundle.getInt("NUM_CAMERA");
        int i18 = bundle.getInt("NUM_NULL_OBJECT");
        int i19 = bundle.getInt("NUM_GROUP");
        int i20 = bundle.getInt("NUM_PHOTO");
        int i21 = bundle.getInt("NUM_VIDEO");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("TEMPLATE_PP_ID_LIST");
        if (stringArrayList == null || (w6Var = j.mUb(stringArrayList)) == null) {
            w6Var = new pq.w6();
        }
        return new n(j2, j3, lValueOf, i2, i3, i5, string, string2, numValueOf, dValueOf, string3, string4, z2, z3, i7, i8, i9, i10, string5, z4, string6, null, null, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, w6Var, bundle.getBoolean("EXPORTED_WITH_TEMPLATE_TOGGLE_ON"), bundle.getBoolean("HAS_SPEED_KEYFRAMES"));
    }

    public static final pq.Ml t(n nVar, boolean z2) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        pq.Ml ml = new pq.Ml();
        ml.nr("available_storage", Long.valueOf(nVar.t()));
        ml.nr("estimated_file_size", Long.valueOf(nVar.J2()));
        Long lHI = nVar.HI();
        if (lHI != null) {
            ml.nr("file_size", Long.valueOf(lHI.longValue()));
        }
        String strN = j.n(nVar.KN());
        if (strN != null) {
            ml.O("export_format", strN);
        }
        ml.nr("export_width", Integer.valueOf(nVar.az()));
        ml.nr("export_height", Integer.valueOf(nVar.mUb()));
        String strUo = nVar.Uo();
        if (strUo != null) {
            ml.O("export_codec", strUo);
        }
        String strGh = nVar.gh();
        if (strGh != null) {
            ml.O("export_image_format", strGh);
        }
        Integer numXMQ = nVar.xMQ();
        if (numXMQ != null) {
            ml.nr("export_fps", Integer.valueOf(numXMQ.intValue()));
        }
        Double dQie = nVar.qie();
        if (dQie != null) {
            ml.nr("export_quality", Double.valueOf(dQie.doubleValue()));
        }
        ml.O("project_id", nVar.T());
        ml.O("project_type", nVar.s7N());
        ml.KN("created_from_project_package", nVar.nr());
        ml.KN("created_from_xml", nVar.O());
        ml.nr("project_duration", Integer.valueOf(nVar.E2()));
        ml.nr("project_width", Integer.valueOf(nVar.wTp()));
        ml.nr("project_height", Integer.valueOf(nVar.X()));
        ml.nr("project_fps", Integer.valueOf(nVar.e()));
        ml.O("project_background", nVar.fD());
        ml.KN("has_watermark", nVar.Ik());
        String strN2 = nVar.N();
        if (strN2 != null) {
            ml.O("project_package_id", strN2);
        }
        String strNHg = nVar.nHg();
        if (strNHg != null) {
            ml.O("project_package_sharing_format", strNHg);
        }
        if (z2 && nVar.r() != null) {
            ml.J2("layers", nVar.r());
        }
        ml.nr("num_layers", Integer.valueOf(nVar.WPU()));
        ml.nr("num_live_shape", Integer.valueOf(nVar.aYN()));
        ml.nr("num_vector_shape", Integer.valueOf(nVar.te()));
        ml.nr("num_text", Integer.valueOf(nVar.g()));
        ml.nr("num_drawing", Integer.valueOf(nVar.XQ()));
        ml.nr("num_audio", Integer.valueOf(nVar.o()));
        ml.nr("num_camera", Integer.valueOf(nVar.Z()));
        ml.nr("num_null_object", Integer.valueOf(nVar.ViF()));
        ml.nr("num_group", Integer.valueOf(nVar.S()));
        ml.nr("num_photo", Integer.valueOf(nVar.nY()));
        ml.nr("num_video", Integer.valueOf(nVar.iF()));
        ml.J2("template_pp_id_list", nVar.v());
        ml.KN("exported_with_template_toggle_on", nVar.ty());
        ml.KN("has_speed_keyframes", nVar.ck());
        return ml;
    }
}
