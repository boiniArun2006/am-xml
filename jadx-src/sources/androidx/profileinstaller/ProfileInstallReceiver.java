package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.ProfileInstaller;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    class ResultDiagnostics implements ProfileInstaller.DiagnosticsCallback {
        ResultDiagnostics() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void n(int i2, Object obj) {
            ProfileInstaller.rl.n(i2, obj);
            ProfileInstallReceiver.this.setResultCode(i2);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void rl(int i2, Object obj) {
            ProfileInstaller.rl.rl(i2, obj);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            ProfileInstaller.mUb(context, new androidx.credentials.j(), new ResultDiagnostics(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    ProfileInstaller.gh(context, new androidx.credentials.j(), new ResultDiagnostics());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        ProfileInstaller.t(context, new androidx.credentials.j(), new ResultDiagnostics());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            n(new ResultDiagnostics());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        ResultDiagnostics resultDiagnostics = new ResultDiagnostics();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            BenchmarkOperation.rl(context, resultDiagnostics);
        } else {
            resultDiagnostics.n(16, null);
        }
    }

    static void n(ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        Process.sendSignal(Process.myPid(), 10);
        diagnosticsCallback.n(12, null);
    }
}
