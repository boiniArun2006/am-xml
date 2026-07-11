package com.google.android.play.integrity.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class DAz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f59565n;

    private static String J2(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e2);
                str2 = str2 + qfEYuUHwj.JTdCKxlSeyBk + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int O(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", J2(this.f59565n, str, objArr));
        }
        return 0;
    }

    public final int n(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", J2(this.f59565n, str, objArr));
        }
        return 0;
    }

    public final int nr(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", J2(this.f59565n, str, objArr));
        }
        return 0;
    }

    public final int rl(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", J2(this.f59565n, str, objArr));
        }
        return 0;
    }

    public final int t(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", J2(this.f59565n, str, objArr), th);
        }
        return 0;
    }

    public DAz(String str) {
        this.f59565n = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }
}
