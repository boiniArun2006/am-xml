package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class NetworkMeteredController extends ConstraintController<NetworkState> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f42893O = Logger.J2("NetworkMeteredCtrlr");

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean rl(WorkSpec workSpec) {
        return workSpec.mUb.rl() == NetworkType.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public boolean t(NetworkState networkState) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (networkState.n() && networkState.rl()) ? false : true;
        }
        Logger.t().n(f42893O, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !networkState.n();
    }

    public NetworkMeteredController(Context context, TaskExecutor taskExecutor) {
        super(Trackers.t(context, taskExecutor).nr());
    }
}
