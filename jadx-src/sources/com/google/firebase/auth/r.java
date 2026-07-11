package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class r implements Continuation {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f60220n;
    private final /* synthetic */ ActionCodeSettings rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ FirebaseUser f60221t;

    r(FirebaseUser firebaseUser, String str, ActionCodeSettings actionCodeSettings) {
        this.f60220n = str;
        this.rl = actionCodeSettings;
        this.f60221t = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f60221t.uG()).wTp((String) Preconditions.checkNotNull(((Dsr) task.getResult()).t()), this.f60220n, this.rl);
    }
}
