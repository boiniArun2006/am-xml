package com.firebase.ui.auth.data.remote;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.util.data.TaskFailureLogger;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class ProfileMerger implements Continuation<AuthResult, Task<AuthResult>> {
    private final IdpResponse mResponse;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.tasks.Continuation
    public Task<AuthResult> then(@NonNull Task<AuthResult> task) {
        final AuthResult result = task.getResult();
        FirebaseUser firebaseUserU = result.U();
        String displayName = firebaseUserU.getDisplayName();
        Uri photoUrl = firebaseUserU.getPhotoUrl();
        if (!TextUtils.isEmpty(displayName) && photoUrl != null) {
            return Tasks.forResult(result);
        }
        User user = this.mResponse.getUser();
        if (TextUtils.isEmpty(displayName)) {
            displayName = user.getName();
        }
        if (photoUrl == null) {
            photoUrl = user.getPhotoUri();
        }
        return firebaseUserU.xVH(new UserProfileChangeRequest.j().rl(displayName).t(photoUrl).n()).addOnFailureListener(new TaskFailureLogger("ProfileMerger", "Error updating profile")).continueWithTask(new Continuation() { // from class: JgN.C
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return Tasks.forResult(result);
            }
        });
    }

    public ProfileMerger(IdpResponse idpResponse) {
        this.mResponse = idpResponse;
    }
}
