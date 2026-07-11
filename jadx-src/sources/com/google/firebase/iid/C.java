package com.google.firebase.iid;

import Ip.aC;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C {
    private final s9b.I28 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final oSp.n f60505O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.firebase.Wre f60506n;
    private final oSp.n nr;
    private final Pl rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rpc f60507t;

    C(com.google.firebase.Wre wre, Pl pl, Rpc rpc, oSp.n nVar, oSp.n nVar2, s9b.I28 i28) {
        this.f60506n = wre;
        this.rl = pl;
        this.f60507t = rpc;
        this.nr = nVar;
        this.f60505O = nVar2;
        this.J2 = i28;
    }

    public C(com.google.firebase.Wre wre, Pl pl, oSp.n nVar, oSp.n nVar2, s9b.I28 i28) {
        this(wre, pl, new Rpc(wre.qie()), nVar, nVar2, i28);
    }

    static boolean J2(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private Bundle KN(String str, String str2, String str3, Bundle bundle) {
        aC.j jVarRl;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f60506n.ck().t());
        bundle.putString("gmsv", Integer.toString(this.rl.nr()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.rl.n());
        bundle.putString("app_ver_name", this.rl.rl());
        bundle.putString("firebase-app-name-hash", t());
        try {
            String strRl = ((com.google.firebase.installations.Wre) Tasks.await(this.J2.n(false))).rl();
            if (TextUtils.isEmpty(strRl)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strRl);
            }
        } catch (InterruptedException e2) {
            e = e2;
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        } catch (ExecutionException e3) {
            e = e3;
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        Ip.aC aCVar = (Ip.aC) this.f60505O.get();
        N03.Dsr dsr = (N03.Dsr) this.nr.get();
        if (aCVar != null && dsr != null && (jVarRl = aCVar.rl("fire-iid")) != aC.j.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(jVarRl.rl()));
            bundle.putString("Firebase-Client", dsr.getUserAgent());
        }
        return bundle;
    }

    private String O(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString(MRAIDPresenter.ERROR);
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String strValueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 21);
        sb.append("Unexpected response: ");
        sb.append(strValueOf);
        Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private static String n(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private String t() {
        try {
            return n(MessageDigest.getInstance("SHA-1").digest(this.f60506n.HI().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    final /* synthetic */ String Uo(Task task) {
        return O((Bundle) task.getResult(IOException.class));
    }

    public Task nr(String str, String str2, String str3) {
        return rl(xMQ(str, str2, str3, new Bundle()));
    }

    private Task rl(Task task) {
        return task.continueWith(n.n(), new Continuation(this) { // from class: com.google.firebase.iid.aC

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final C f60525n;

            {
                this.f60525n = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                return this.f60525n.Uo(task2);
            }
        });
    }

    private Task xMQ(String str, String str2, String str3, Bundle bundle) {
        KN(str, str2, str3, bundle);
        return this.f60507t.send(bundle);
    }
}
