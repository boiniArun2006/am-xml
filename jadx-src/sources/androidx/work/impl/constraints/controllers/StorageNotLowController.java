package androidx.work.impl.constraints.controllers;

import android.content.Context;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class StorageNotLowController extends ConstraintController<Boolean> {
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean rl(WorkSpec workSpec) {
        return workSpec.mUb.xMQ();
    }

    public StorageNotLowController(Context context, TaskExecutor taskExecutor) {
        super(Trackers.t(context, taskExecutor).O());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public boolean t(Boolean bool) {
        return !bool.booleanValue();
    }
}
