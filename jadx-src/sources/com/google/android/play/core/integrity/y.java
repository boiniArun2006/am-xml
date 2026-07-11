package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f59561c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy
    private boolean f59563e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DAz f59559a = new DAz("IntegrityDialogWrapper");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f59562d = new Object();

    abstract Task b(Activity activity, Bundle bundle);

    public final Task a(Activity activity, int i2) {
        synchronized (this.f59562d) {
            try {
                if (this.f59563e) {
                    return Tasks.forResult(0);
                }
                this.f59563e = true;
                this.f59559a.n("checkAndShowDialog(%s)", Integer.valueOf(i2));
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i2);
                bundle.putString("package.name", this.f59560b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f59561c);
                return b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    y(String str, long j2) {
        this.f59560b = str;
        this.f59561c = j2;
    }
}
