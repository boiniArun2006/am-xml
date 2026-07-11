package com.alightcreative.backup.domain.usecases.internal;

import TFv.Lu;
import TFv.SPz;
import TFv.rv6;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.SceneType;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.Ew;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class l3D implements wtO.Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.firebase.firestore.s4 f46581n;
    private final rv6 nr;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SPz f46582t;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(l3D l3d, Ew ew, FirebaseFirestoreException firebaseFirestoreException) {
        if (ew == null) {
            return;
        }
        SPz sPz = l3d.f46582t;
        List listNr = ew.nr();
        Intrinsics.checkNotNullExpressionValue(listNr, "getDocuments(...)");
        List<com.google.firebase.firestore.fuX> listFilterNotNull = CollectionsKt.filterNotNull(listNr);
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.firestore.fuX fux : listFilterNotNull) {
            String strXMQ = fux.xMQ();
            Intrinsics.checkNotNullExpressionValue(strXMQ, "getId(...)");
            ProjectInfo.j jVarNr = l3d.nr(strXMQ, (FirestoreCloudProjectPackage) wQ.Ml.n(fux, FirestoreCloudProjectPackage.class));
            if (jVarNr != null) {
                arrayList.add(jVarNr);
            }
        }
        sPz.t(arrayList);
    }

    private final ProjectInfo.j nr(String str, FirestoreCloudProjectPackage firestoreCloudProjectPackage) {
        if (firestoreCloudProjectPackage == null || firestoreCloudProjectPackage.getProjects().isEmpty()) {
            return null;
        }
        FirestoreSharedProjectInfo firestoreSharedProjectInfo = (FirestoreSharedProjectInfo) CollectionsKt.first((List) firestoreCloudProjectPackage.getProjects());
        String title = firestoreSharedProjectInfo.getTitle();
        int width = firestoreCloudProjectPackage.getWidth();
        int height = firestoreCloudProjectPackage.getHeight();
        int duration = firestoreCloudProjectPackage.getDuration();
        int fphs = firestoreCloudProjectPackage.getFphs();
        Timestamp shareDate = firestoreCloudProjectPackage.getShareDate();
        long jN = shareDate != null ? wQ.z.n(shareDate) : 0L;
        long size = firestoreCloudProjectPackage.getSize();
        String upperCase = firestoreSharedProjectInfo.getType().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new ProjectInfo.j(str, title, width, height, duration, fphs, jN, size, SceneType.valueOf(upperCase), firestoreCloudProjectPackage.getMaxFFVer(), firestoreCloudProjectPackage.getMedThumbUrl());
    }

    @Override // wtO.Wre
    public rv6 n() {
        return this.nr;
    }

    @Override // wtO.Wre
    public void rl(String str) {
        if (Intrinsics.areEqual(str, this.rl)) {
            return;
        }
        this.rl = str;
        com.google.firebase.firestore.s4 s4Var = this.f46581n;
        if (s4Var != null) {
            s4Var.remove();
        }
        if (str == null) {
            this.f46581n = null;
            this.f46582t.t(CollectionsKt.emptyList());
            return;
        }
        this.f46581n = FirebaseFirestore.J2().t("account/" + str + "/projects").nr(new com.google.firebase.firestore.Dsr() { // from class: com.alightcreative.backup.domain.usecases.internal.QJ
            @Override // com.google.firebase.firestore.Dsr
            public final void n(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
                l3D.O(this.f46532n, (Ew) obj, firebaseFirestoreException);
            }
        });
    }

    public l3D() {
        SPz sPzN = Lu.n(CollectionsKt.emptyList());
        this.f46582t = sPzN;
        this.nr = sPzN;
    }
}
