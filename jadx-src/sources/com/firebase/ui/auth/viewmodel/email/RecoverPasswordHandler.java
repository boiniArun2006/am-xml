package com.firebase.ui.auth.viewmodel.email;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.viewmodel.AuthViewModelBase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class RecoverPasswordHandler extends AuthViewModelBase<String> {
    public RecoverPasswordHandler(Application application) {
        super(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startReset$0(String str, Task task) {
        Resource resourceForFailure;
        if (task.isSuccessful()) {
            resourceForFailure = Resource.forSuccess(str);
        } else {
            resourceForFailure = Resource.forFailure(task.getException());
        }
        setResult(resourceForFailure);
    }

    public void startReset(@NonNull final String str, @Nullable ActionCodeSettings actionCodeSettings) {
        Task taskIk;
        setResult(Resource.forLoading());
        if (actionCodeSettings != null) {
            taskIk = getAuth().r(str, actionCodeSettings);
        } else {
            taskIk = getAuth().Ik(str);
        }
        taskIk.addOnCompleteListener(new OnCompleteListener() { // from class: CB.o
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f820n.lambda$startReset$0(str, task);
            }
        });
    }
}
