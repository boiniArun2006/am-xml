package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
public class CombineContinuationsWorker extends Worker {
    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        return (ListenableWorker.Result) VMRunner.invoke("0mjlnOUphANFIDuH", new Object[]{this});
    }

    public CombineContinuationsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
