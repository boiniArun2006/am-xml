package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.vd;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class SPz extends AsyncTask {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HttpURLConnection f52215n;
    public final ci rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Exception f52216t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f52214O = SPz.class.getCanonicalName();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public j() {
        }
    }

    public SPz(HttpURLConnection httpURLConnection, ci requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f52215n = httpURLConnection;
        this.rl = requests;
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f52215n + ", requests: " + this.rl + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SPz(ci requests) {
        this(null, requests);
        Intrinsics.checkNotNullParameter(requests, "requests");
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return n((Void[]) objArr);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public List n(Void... params) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            try {
                HttpURLConnection httpURLConnection = this.f52215n;
                if (httpURLConnection == null) {
                    return this.rl.J2();
                }
                return GraphRequest.ty.HI(httpURLConnection, this.rl);
            } catch (Exception e2) {
                this.f52216t = e2;
                return null;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            rl((List) obj);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        Handler handler;
        if (!VmF.j.nr(this)) {
            try {
                super.onPreExecute();
                if (s4.fD()) {
                    String str = f52214O;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str2 = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                    vd.piY(str, str2);
                }
                if (this.rl.qie() == null) {
                    if (Thread.currentThread() instanceof HandlerThread) {
                        handler = new Handler();
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    this.rl.ViF(handler);
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    protected void rl(List result) {
        if (!VmF.j.nr(this)) {
            try {
                Intrinsics.checkNotNullParameter(result, "result");
                super.onPostExecute(result);
                Exception exc = this.f52216t;
                if (exc != null) {
                    String str = f52214O;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str2 = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                    vd.piY(str, str2);
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}
