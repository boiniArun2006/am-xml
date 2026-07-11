package com.google.firebase.firestore.remote;

import JP.j;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import io.grpc.QJ;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class eO extends JP.j {
    private static final QJ.CN3 nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final QJ.CN3 f60435t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final VtZ.j f60436n;
    private final VtZ.j rl;

    static {
        QJ.Ml ml = io.grpc.QJ.f68177O;
        f60435t = QJ.CN3.O("Authorization", ml);
        nr = QJ.CN3.O("x-firebase-appcheck", ml);
    }

    public static /* synthetic */ void rl(Task task, j.AbstractC0157j abstractC0157j, Task task2, Task task3) {
        io.grpc.QJ qj = new io.grpc.QJ();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            wqP.QJ.n("FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
            if (str != null) {
                qj.ck(f60435t, "Bearer " + str);
            }
        } else {
            Exception exception = task.getException();
            if (exception instanceof FirebaseApiNotAvailableException) {
                wqP.QJ.n("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
            } else {
                if (!(exception instanceof FirebaseNoSignedInUserException)) {
                    wqP.QJ.nr("FirestoreCallCredentials", "Failed to get auth token: %s.", exception);
                    abstractC0157j.rl(io.grpc.SPz.az.ck(exception));
                    return;
                }
                wqP.QJ.n("FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
            }
        }
        if (task2.isSuccessful()) {
            String str2 = (String) task2.getResult();
            if (str2 != null && !str2.isEmpty()) {
                wqP.QJ.n("FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                qj.ck(nr, str2);
            }
        } else {
            Exception exception2 = task2.getException();
            if (!(exception2 instanceof FirebaseApiNotAvailableException)) {
                wqP.QJ.nr("FirestoreCallCredentials", "Failed to get AppCheck token: %s.", exception2);
                abstractC0157j.rl(io.grpc.SPz.az.ck(exception2));
                return;
            }
            wqP.QJ.n("FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
        }
        abstractC0157j.n(qj);
    }

    @Override // JP.j
    public void n(j.n nVar, Executor executor, final j.AbstractC0157j abstractC0157j) {
        final Task taskN = this.f60436n.n();
        final Task taskN2 = this.rl.n();
        Tasks.whenAll((Task<?>[]) new Task[]{taskN, taskN2}).addOnCompleteListener(wqP.qz.rl, new OnCompleteListener() { // from class: com.google.firebase.firestore.remote.Xo
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                eO.rl(taskN, abstractC0157j, taskN2, task);
            }
        });
    }

    eO(VtZ.j jVar, VtZ.j jVar2) {
        this.f60436n = jVar;
        this.rl = jVar2;
    }
}
