package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class NetworkConnectedController extends ConstraintController<NetworkState> {
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean rl(WorkSpec workSpec) {
        return workSpec.mUb.rl() == NetworkType.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public boolean t(NetworkState networkState) {
        return Build.VERSION.SDK_INT >= 26 ? (networkState.n() && networkState.nr()) ? false : true : !networkState.n();
    }

    public NetworkConnectedController(Context context, TaskExecutor taskExecutor) {
        super(Trackers.t(context, taskExecutor).nr());
    }
}
