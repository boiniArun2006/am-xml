package com.google.firebase.functions;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.functions.FirebaseFunctionsException;
import com.google.firebase.functions.n;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import mCM.C2292c;
import mCM.QJ;
import mCM.eO;
import mCM.l3D;
import mCM.z;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n {
    private static boolean qie;
    private String J2;
    private String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f60498O;
    private String Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f60499n;
    private final mCM.j nr;
    private final OkHttpClient rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C2292c f60500t;
    private E8.j xMQ;
    public static final j mUb = new j(null);
    private static final TaskCompletionSource gh = new TaskCompletionSource();

    public static final class j {

        /* JADX INFO: renamed from: com.google.firebase.functions.n$j$j, reason: collision with other inner class name */
        public static final class C0807j implements ProviderInstaller.ProviderInstallListener {
            @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
            public void onProviderInstallFailed(int i2, Intent intent) {
                Log.d("FirebaseFunctions", "Failed to update ssl context");
                n.gh.setResult(null);
            }

            C0807j() {
            }

            @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
            public void onProviderInstalled() {
                n.gh.setResult(null);
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Uo(Context context) {
            Intrinsics.checkNotNullParameter(context, "$context");
            ProviderInstaller.installIfNeededAsync(context, new C0807j());
        }

        public final n O(com.google.firebase.Wre app, String regionOrCustomDomain) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(regionOrCustomDomain, "regionOrCustomDomain");
            Preconditions.checkNotNull(app, "You must call FirebaseApp.initializeApp first.");
            Preconditions.checkNotNull(regionOrCustomDomain);
            I28 i28 = (I28) app.mUb(I28.class);
            Preconditions.checkNotNull(i28, "Functions component does not exist.");
            n nVarN = i28.n(regionOrCustomDomain);
            Intrinsics.checkNotNull(nVarN);
            return nVarN;
        }

        public final n nr(com.google.firebase.Wre app) {
            Intrinsics.checkNotNullParameter(app, "app");
            return O(app, "us-central1");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void J2(final Context context, Executor executor) {
            synchronized (n.gh) {
                if (!n.qie) {
                    n.qie = true;
                    Unit unit = Unit.INSTANCE;
                    executor.execute(new Runnable() { // from class: mCM.qz
                        @Override // java.lang.Runnable
                        public final void run() {
                            n.j.Uo(context);
                        }
                    });
                }
            }
        }

        public final n t() {
            com.google.firebase.Wre wreAz = com.google.firebase.Wre.az();
            Intrinsics.checkNotNullExpressionValue(wreAz, "getInstance()");
            return O(wreAz, "us-central1");
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.functions.n$n, reason: collision with other inner class name */
    public static final class C0808n implements Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f60501n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ n f60502t;

        C0808n(TaskCompletionSource taskCompletionSource, n nVar) {
            this.f60501n = taskCompletionSource;
            this.f60502t = nVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call ignored, IOException e2) {
            Intrinsics.checkNotNullParameter(ignored, "ignored");
            Intrinsics.checkNotNullParameter(e2, "e");
            if (e2 instanceof InterruptedIOException) {
                this.f60501n.setException(new FirebaseFunctionsException("DEADLINE_EXCEEDED", FirebaseFunctionsException.j.DEADLINE_EXCEEDED, null, e2));
            } else {
                this.f60501n.setException(new FirebaseFunctionsException("INTERNAL", FirebaseFunctionsException.j.INTERNAL, null, e2));
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call ignored, Response response) throws IOException {
            Intrinsics.checkNotNullParameter(ignored, "ignored");
            Intrinsics.checkNotNullParameter(response, "response");
            FirebaseFunctionsException.j jVarT = FirebaseFunctionsException.j.f60486t.t(response.code());
            ResponseBody responseBodyBody = response.body();
            Intrinsics.checkNotNull(responseBodyBody);
            String strString = responseBodyBody.string();
            FirebaseFunctionsException firebaseFunctionsExceptionN = FirebaseFunctionsException.INSTANCE.n(jVarT, strString, this.f60502t.f60500t);
            if (firebaseFunctionsExceptionN != null) {
                this.f60501n.setException(firebaseFunctionsExceptionN);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(strString);
                Object objOpt = jSONObject.opt("data");
                if (objOpt == null) {
                    objOpt = jSONObject.opt("result");
                }
                if (objOpt == null) {
                    this.f60501n.setException(new FirebaseFunctionsException("Response is missing data field.", FirebaseFunctionsException.j.INTERNAL, null));
                } else {
                    this.f60501n.setResult(new l3D(this.f60502t.f60500t.n(objOpt)));
                }
            } catch (JSONException e2) {
                this.f60501n.setException(new FirebaseFunctionsException("Response is not valid JSON object.", FirebaseFunctionsException.j.INTERNAL, null, e2));
            }
        }
    }

    public n(Context context, String str, String str2, mCM.j jVar, Executor executor, Executor uiExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(uiExecutor, "uiExecutor");
        this.f60499n = executor;
        this.rl = new OkHttpClient();
        this.f60500t = new C2292c();
        Object objCheckNotNull = Preconditions.checkNotNull(jVar);
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(contextProvider)");
        this.nr = (mCM.j) objCheckNotNull;
        Object objCheckNotNull2 = Preconditions.checkNotNull(str);
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull2, "checkNotNull(projectId)");
        this.f60498O = (String) objCheckNotNull2;
        this.KN = "https://%1$s-%2$s.cloudfunctions.net/%3$s";
        try {
            new URL(str2);
            this.J2 = "us-central1";
            this.Uo = str2;
        } catch (MalformedURLException unused) {
            this.J2 = str2;
            this.Uo = null;
        }
        mUb.J2(context, uiExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task HI(n this$0, URL url, Object obj, eO options, Task task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            return this$0.xMQ(url, obj, (z) task.getResult(), options);
        }
        Exception exception = task.getException();
        Intrinsics.checkNotNull(exception);
        return Tasks.forException(exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task az(n this$0, String name, Object obj, eO options, Task task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            return this$0.xMQ(this$0.Ik(name), obj, (z) task.getResult(), options);
        }
        Exception exception = task.getException();
        Intrinsics.checkNotNull(exception);
        return Tasks.forException(exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task qie(n this$0, eO options, Task it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(it, "it");
        return this$0.nr.n(options.f70666t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task ty(n this$0, eO options, Task it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(it, "it");
        return this$0.nr.n(options.f70666t);
    }

    private final Task xMQ(URL url, Object obj, z zVar, eO eOVar) {
        Preconditions.checkNotNull(url, "url cannot be null");
        HashMap map = new HashMap();
        map.put("data", this.f60500t.rl(obj));
        Request.Builder builderPost = new Request.Builder().url(url).post(RequestBody.create(MediaType.parse("application/json"), new JSONObject(map).toString()));
        Intrinsics.checkNotNull(zVar);
        if (zVar.rl() != null) {
            builderPost = builderPost.header("Authorization", "Bearer " + zVar.rl());
        }
        if (zVar.t() != null) {
            builderPost = builderPost.header("Firebase-Instance-ID-Token", zVar.t());
        }
        if (zVar.n() != null) {
            builderPost = builderPost.header("X-Firebase-AppCheck", zVar.n());
        }
        Call callNewCall = eOVar.n(this.rl).newCall(builderPost.build());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        callNewCall.enqueue(new C0808n(taskCompletionSource, this));
        Task task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "tcs.task");
        return task;
    }

    public final URL Ik(String function) {
        Intrinsics.checkNotNullParameter(function, "function");
        E8.j jVar = this.xMQ;
        if (jVar != null) {
            this.KN = d.f62221v + jVar.n() + ':' + jVar.rl() + "/%2$s/%1$s/%3$s";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(this.KN, Arrays.copyOf(new Object[]{this.J2, this.f60498O, function}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        if (this.Uo != null && jVar == null) {
            str = this.Uo + '/' + function;
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final QJ ck(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new QJ(this, name, new eO());
    }

    public final Task gh(final URL url, final Object obj, final eO options) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(options, "options");
        Task taskContinueWithTask = gh.getTask().continueWithTask(this.f60499n, new Continuation() { // from class: mCM.C
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return com.google.firebase.functions.n.ty(this.f70649n, options, task);
            }
        }).continueWithTask(this.f60499n, new Continuation() { // from class: mCM.o
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return com.google.firebase.functions.n.HI(this.f70671n, url, obj, options, task);
            }
        });
        Intrinsics.checkNotNullExpressionValue(taskContinueWithTask, "providerInstalled.task\n …context, options)\n      }");
        return taskContinueWithTask;
    }

    public final Task mUb(final String name, final Object obj, final eO options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(options, "options");
        Task taskContinueWithTask = gh.getTask().continueWithTask(this.f60499n, new Continuation() { // from class: mCM.Dsr
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return com.google.firebase.functions.n.qie(this.f70653n, options, task);
            }
        }).continueWithTask(this.f60499n, new Continuation() { // from class: mCM.aC
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return com.google.firebase.functions.n.az(this.f70661n, name, obj, options, task);
            }
        });
        Intrinsics.checkNotNullExpressionValue(taskContinueWithTask, "providerInstalled.task\n …context, options)\n      }");
        return taskContinueWithTask;
    }

    public final void r(String host, int i2) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.xMQ = new E8.j(host, i2);
    }
}
