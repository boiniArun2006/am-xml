package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class NetworkUnmeteredController extends ConstraintController<NetworkState> {
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean rl(WorkSpec workSpec) {
        if (workSpec.mUb.rl() != NetworkType.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && workSpec.mUb.rl() == NetworkType.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    public NetworkUnmeteredController(Context context, TaskExecutor taskExecutor) {
        super(Trackers.t(context, taskExecutor).nr());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public boolean t(NetworkState networkState) {
        if (networkState.n() && !networkState.rl()) {
            return false;
        }
        return true;
    }
}
