package mc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.brandsafety.l;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 implements j {
    public IIgniteServiceAPI E2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public j f70864N;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final String f70866S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f70869Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public tUa.j f70871g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f70873o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f70874r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f70876v;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f70872n = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f70875t = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f70865O = 0;
    public boolean J2 = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f70870e = new Bundle();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final Object f70868X = new Object();
    public String Xw = null;
    public final n jB = new n(this);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final EDL.j f70867T = new EDL.j(this);

    @Override // mc.j
    public final boolean a() {
        IIgniteServiceAPI iIgniteServiceAPI;
        return this.J2 && (iIgniteServiceAPI = this.E2) != null && iIgniteServiceAPI.asBinder().isBinderAlive();
    }

    @Override // mc.j
    public final void b() {
        if (TextUtils.isEmpty(this.f70866S)) {
            eh.n.rl("%s : unable to authenticate - there is no ignite on the device", "IgniteAuthenticationComponent");
            return;
        }
        if (!a()) {
            tGr.w6.f73452n.execute(this.jB);
        } else {
            if (!this.f70872n || f()) {
                nr();
                return;
            }
            Object[] objArr = {"IgniteAuthenticationComponent"};
            eh.j jVar = eh.n.rl.f63842n;
            if (jVar != null) {
                jVar.i("%s : already authenticated", objArr);
            }
        }
    }

    @Override // mc.j
    public final void c(String str) {
        String str2;
        eh.n.n("%s: onAuthenticationSuccess", "IgniteAuthenticationComponent");
        this.f70875t = false;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.Xw = str;
        this.f70870e.putString("clientToken", str);
        this.f70872n = true;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            try {
                str2 = new String(Base64.decode(str.split("\\.")[1], 8), C.UTF8_NAME);
            } catch (Exception e2) {
                eh.n.rl("%s : decodeJwtBody : %s", "JwtUtil", e2.toString());
                str2 = "";
            }
        }
        if (!str2.isEmpty()) {
            try {
                long jOptLong = new JSONObject(str2).optLong(l.f62670y);
                this.f70865O = jOptLong;
                long millis = TimeUnit.SECONDS.toMillis(jOptLong);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(millis);
                    str3 = simpleDateFormat.format(calendar.getTime());
                } catch (Exception unused) {
                }
                eh.n.n("%s : Ignite session will exp in: %s", "IgniteAuthenticationComponent", str3);
            } catch (Exception e3) {
                Msr.n.n(Msr.Ml.ONE_DT_GENERAL_ERROR, e3);
                eh.n.rl("%s: resolveSessionExpiryTime : unable resolve session expiration : %s", "IgniteAuthenticationComponent", e3.toString());
            }
        }
        j jVar = this.f70864N;
        if (jVar != null) {
            jVar.c(str);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.J2 = false;
        this.f70865O = 0L;
        b("Service : " + (componentName != null ? componentName.getClassName() : "Ignite") + " disconnected");
    }

    @Override // mc.j
    public final void a(String str) {
        eh.n.rl("%s : onAuthenticationFailed : %s", "IgniteAuthenticationComponent", str);
        this.f70875t = false;
        j jVar = this.f70864N;
        if (jVar != null) {
            jVar.a(str);
        }
    }

    @Override // mc.j
    public final String d() {
        return this.f70866S;
    }

    @Override // mc.j
    public final void destroy() {
        if (this.f70874r != null && a()) {
            this.f70874r.unbindService(this);
            this.f70874r = null;
        }
        this.f70876v = null;
        this.f70864N = null;
        this.E2 = null;
    }

    @Override // mc.j
    public final String e() {
        return this.Xw;
    }

    @Override // mc.j
    public final boolean f() {
        return this.f70865O > 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > this.f70865O;
    }

    @Override // mc.j
    public final Context g() {
        return this.f70874r;
    }

    @Override // mc.j
    public final boolean h() {
        return this.f70872n;
    }

    @Override // mc.j
    public final String i() {
        return this.f70871g.f73467n;
    }

    @Override // mc.j
    public final boolean j() {
        return this.f70871g.rl;
    }

    @Override // mc.j
    public final IIgniteServiceAPI k() {
        return this.E2;
    }

    @Override // mc.j
    public final void n(j jVar) {
        this.f70864N = jVar;
    }

    @Override // Nge.n
    public final void onCredentialsRequestFailed(String str) {
        eh.n.rl("%s: onCredentialsRequestFailed: %s", "IgniteAuthenticationComponent", str);
        b(str);
    }

    @Override // Nge.n
    public final void onCredentialsRequestSuccess(String str, String str2) {
        this.f70873o = str;
        this.f70869Z = str2;
        nr();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        eh.n.n("%s : onIgniteConnected", "IgniteAuthenticationComponent");
        this.E2 = IIgniteServiceAPI.Stub.asInterface(iBinder);
        this.J2 = true;
        tGr.w6.f73452n.execute(new w6(this, new Ml(this, componentName, iBinder)));
    }

    @Override // mc.j
    public final void rl(j jVar) {
        this.f70876v = jVar;
    }

    @Override // mc.j
    public final void t(ComponentName componentName, IBinder iBinder) {
        j jVar = this.f70876v;
        if (jVar != null) {
            jVar.t(componentName, iBinder);
        }
    }

    public I28(Context context) {
        String str = null;
        this.f70874r = context.getApplicationContext();
        Intent intent = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
        Context context2 = this.f70874r;
        if (context2 != null) {
            List<ResolveInfo> listQueryIntentServices = context2.getPackageManager().queryIntentServices(intent, 0);
            if (listQueryIntentServices.size() > 0) {
                str = listQueryIntentServices.get(0).serviceInfo.packageName;
            }
        }
        this.f70866S = str;
        this.f70871g = new tUa.j(false, "");
    }

    @Override // mc.j
    public final void l() {
        b();
    }

    public final void nr() {
        if (a()) {
            String str = this.f70873o;
            String str2 = this.f70869Z;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !this.f70875t) {
                if ((f() || !this.f70872n) && this.E2 != null) {
                    try {
                        this.f70875t = true;
                        this.f70870e.putInt("sdkFlowTypeKey", 1);
                        this.E2.authenticate(this.f70873o, this.f70869Z, this.f70870e, this.f70867T);
                    } catch (RemoteException e2) {
                        this.f70875t = false;
                        Msr.n.n(Msr.Ml.ONE_DT_AUTHENTICATION_ERROR, e2);
                        eh.n.rl("%s: startAuthenticationProcess: unable to start authentication : %s", "IgniteAuthenticationComponent", e2.toString());
                    }
                }
            }
        }
    }

    @Override // mc.j
    public final void b(String str) {
        eh.n.rl("%s : onIgniteFailedToConnect : %s", "IgniteAuthenticationComponent", str);
        j jVar = this.f70876v;
        if (jVar != null) {
            jVar.b(str);
        }
    }

    @Override // mc.j
    public final boolean c() {
        return f() || !a();
    }
}
