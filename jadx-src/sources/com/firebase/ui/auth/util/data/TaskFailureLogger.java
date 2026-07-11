package com.firebase.ui.auth.util.data;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class TaskFailureLogger implements OnFailureListener {
    private String mMessage;
    private String mTag;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(@NonNull Exception exc) {
        Log.w(this.mTag, this.mMessage, exc);
    }

    public TaskFailureLogger(@NonNull String str, @NonNull String str2) {
        this.mTag = str;
        this.mMessage = str2;
    }
}
