package com.google.firebase.firestore;

import pUk.C2331c;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class n extends afx {
    public CN3 gh(String str) {
        AbstractC2418c.t(str, "Provided document path must not be null.");
        return CN3.xMQ((C2331c) this.f60346n.qie().rl(C2331c.o(str)), this.rl);
    }

    n(C2331c c2331c, FirebaseFirestore firebaseFirestore) {
        super(uh.Ln.rl(c2331c), firebaseFirestore);
        if (c2331c.ty() % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + c2331c.t() + " has " + c2331c.ty());
    }
}
