package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class o implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f60882n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I28 f60883t;

    class j implements Continuation {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f60885n;
        final /* synthetic */ TaskCompletionSource nr;
        final /* synthetic */ List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Executor f60886t;

        j(List list, List list2, Executor executor, TaskCompletionSource taskCompletionSource) {
            this.f60885n = list;
            this.rl = list2;
            this.f60886t = executor;
            this.nr = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Task then(Task task) {
            if (task.isSuccessful()) {
                fuX fux = (fuX) task.getResult();
                this.f60885n.addAll(fux.nr());
                this.rl.addAll(fux.rl());
                if (fux.t() != null) {
                    o.this.Ik(null, fux.t()).continueWithTask(this.f60886t, this);
                } else {
                    this.nr.setResult(new fuX(this.f60885n, this.rl, null));
                }
            } else {
                this.nr.setException(task.getException());
            }
            return Tasks.forResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task Ik(Integer num, String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Z.rl().J2(new Dsr(this, num, str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    O6.fuX HI() {
        return new O6.fuX(this.f60882n, this.f60883t.O());
    }

    public Ml KN(Uri uri) {
        Ml ml = new Ml(this, uri);
        ml.Xw();
        return ml;
    }

    public Task Uo() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Z.rl().J2(new CN3(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public o az() {
        return new o(this.f60882n.buildUpon().path("").build(), this.f60883t);
    }

    public Task ck() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Executor executorN = Z.rl().n();
        Ik(null, null).continueWithTask(executorN, new j(arrayList, arrayList2, executorN, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return ((o) obj).toString().equals(toString());
        }
        return false;
    }

    public o gh() {
        String path = this.f60882n.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        if (path.equals("/")) {
            return null;
        }
        int iLastIndexOf = path.lastIndexOf(47);
        return new o(this.f60882n.buildUpon().path(iLastIndexOf != -1 ? path.substring(0, iLastIndexOf) : "/").build(), this.f60883t);
    }

    public String mUb() {
        String path = this.f60882n.getPath();
        int iLastIndexOf = path.lastIndexOf(47);
        return iLastIndexOf != -1 ? path.substring(iLastIndexOf + 1) : path;
    }

    public Task nr() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Z.rl().J2(new w6(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public qf o(InputStream inputStream) {
        Preconditions.checkArgument(inputStream != null, "stream cannot be null");
        qf qfVar = new qf(this, (C) null, inputStream);
        qfVar.Xw();
        return qfVar;
    }

    public String qie() {
        return this.f60882n.getPath();
    }

    public qf r(byte[] bArr) {
        Preconditions.checkArgument(bArr != null, "bytes cannot be null");
        qf qfVar = new qf(this, (C) null, bArr);
        qfVar.Xw();
        return qfVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int compareTo(o oVar) {
        return this.f60882n.compareTo(oVar.f60882n);
    }

    public String toString() {
        return "gs://" + this.f60882n.getAuthority() + this.f60882n.getEncodedPath();
    }

    public I28 ty() {
        return this.f60883t;
    }

    o(Uri uri, I28 i28) {
        boolean z2;
        if (uri != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "storageUri cannot be null");
        Preconditions.checkArgument(i28 != null, "FirebaseApp cannot be null");
        this.f60882n = uri;
        this.f60883t = i28;
    }

    com.google.firebase.Wre J2() {
        return ty().n();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public o rl(String str) {
        Preconditions.checkArgument(!TextUtils.isEmpty(str), "childName cannot be null or empty");
        return new o(this.f60882n.buildUpon().appendEncodedPath(O6.Ml.rl(O6.Ml.n(str))).build(), this.f60883t);
    }

    public Ml xMQ(File file) {
        return KN(Uri.fromFile(file));
    }
}
