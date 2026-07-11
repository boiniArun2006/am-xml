package androidx.work.impl.constraints.controllers;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class NetworkNotRoamingController extends ConstraintController<NetworkState> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f42894O = Logger.J2("NetworkNotRoamingCtrlr");

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean rl(WorkSpec workSpec) {
        return workSpec.mUb.rl() == NetworkType.NOT_ROAMING;
    }

    public NetworkNotRoamingController(Context context, TaskExecutor taskExecutor) {
        super(Trackers.t(context, taskExecutor).nr());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public boolean t(NetworkState networkState) {
        if (networkState.n() && networkState.t()) {
            return false;
        }
        return true;
    }
}
