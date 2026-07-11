package com.pairip.application;

import android.content.Context;
import com.alightcreative.app.motion.AlightMotionApplication;
import com.pairip.SignatureCheck;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class Application extends AlightMotionApplication {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        VMRunner.setContext(context);
        SignatureCheck.verifyIntegrity(context);
        super.attachBaseContext(context);
    }
}
