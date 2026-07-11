package v2a;

import android.os.Process;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f74609n;

    public j(String str) {
        this.f74609n = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }
}
