package com.google.firebase.firestore;

import android.content.Context;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class eO implements com.google.firebase.CN3, FirebaseFirestore.j {
    private final Pe.C J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final oSp.j f60352O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f60353n = new HashMap();
    private final oSp.j nr;
    private final com.google.firebase.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f60354t;

    synchronized FirebaseFirestore n(String str) throws Throwable {
        try {
            try {
                FirebaseFirestore firebaseFirestoreGh = (FirebaseFirestore) this.f60353n.get(str);
                if (firebaseFirestoreGh == null) {
                    firebaseFirestoreGh = FirebaseFirestore.gh(this.f60354t, this.rl, this.nr, this.f60352O, str, this, this.J2);
                    this.f60353n.put(str, firebaseFirestoreGh);
                }
                return firebaseFirestoreGh;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    eO(Context context, com.google.firebase.Wre wre, oSp.j jVar, oSp.j jVar2, Pe.C c2) {
        this.f60354t = context;
        this.rl = wre;
        this.nr = jVar;
        this.f60352O = jVar2;
        this.J2 = c2;
        wre.KN(this);
    }
}
