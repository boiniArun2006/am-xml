package com.google.firebase.firestore;

import com.google.firebase.firestore.fuX;
import java.util.Map;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Z extends fuX {
    static Z ty(FirebaseFirestore firebaseFirestore, pUk.fuX fux, boolean z2, boolean z3) {
        return new Z(firebaseFirestore, fux.getKey(), fux, z2, z3);
    }

    @Override // com.google.firebase.firestore.fuX
    public Map KN(fuX.j jVar) {
        AbstractC2418c.t(jVar, "Provided serverTimestampBehavior value must not be null.");
        Map mapKN = super.KN(jVar);
        wqP.n.t(mapKN != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return mapKN;
    }

    @Override // com.google.firebase.firestore.fuX
    public Object az(Class cls, fuX.j jVar) {
        AbstractC2418c.t(jVar, "Provided serverTimestampBehavior value must not be null.");
        Object objAz = super.az(cls, jVar);
        wqP.n.t(objAz != null, "Object in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return objAz;
    }

    private Z(FirebaseFirestore firebaseFirestore, pUk.C c2, pUk.fuX fux, boolean z2, boolean z3) {
        super(firebaseFirestore, c2, fux, z2, z3);
    }

    @Override // com.google.firebase.firestore.fuX
    public Object qie(Class cls) {
        boolean z2;
        Object objQie = super.qie(cls);
        if (objQie != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "Object in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return objQie;
    }
}
