package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f60519n;
    private final Map rl = new ArrayMap();

    interface j {
        Task start();
    }

    synchronized Task n(String str, String str2, j jVar) {
        final Pair pair = new Pair(str, str2);
        Task task = (Task) this.rl.get(pair);
        if (task != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return task;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(strValueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        Task taskContinueWithTask = jVar.start().continueWithTask(this.f60519n, new Continuation(this, pair) { // from class: com.google.firebase.iid.z

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final QJ f60543n;
            private final Pair rl;

            {
                this.f60543n = this;
                this.rl = pair;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                this.f60543n.rl(this.rl, task2);
                return task2;
            }
        });
        this.rl.put(pair, taskContinueWithTask);
        return taskContinueWithTask;
    }

    final /* synthetic */ Task rl(Pair pair, Task task) {
        synchronized (this) {
            this.rl.remove(pair);
        }
        return task;
    }

    QJ(Executor executor) {
        this.f60519n = executor;
    }
}
