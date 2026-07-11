package mc;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Wre implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f70880n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Nge.j f70881t;

    @Override // mc.j
    public boolean a() {
        return this.f70880n.a();
    }

    @Override // mc.j
    public void b() {
        this.f70880n.b();
    }

    @Override // mc.j
    public boolean c() {
        return this.f70880n.c();
    }

    @Override // mc.j
    public String d() {
        return null;
    }

    @Override // mc.j
    public void destroy() {
        this.f70881t = null;
        this.f70880n.destroy();
    }

    @Override // mc.j
    public String i() {
        return null;
    }

    @Override // mc.j
    public boolean j() {
        return false;
    }

    @Override // mc.j
    public void a(String str) {
        Nge.j jVar = this.f70881t;
        if (jVar != null) {
            jVar.onIgniteServiceAuthenticationFailed(str);
        }
    }

    @Override // mc.j
    public void b(String str) {
        Nge.j jVar = this.f70881t;
        if (jVar != null) {
            jVar.onIgniteServiceConnectionFailed(str);
        }
    }

    @Override // mc.j
    public void c(String str) {
        Nge.j jVar = this.f70881t;
        if (jVar != null) {
            jVar.onIgniteServiceAuthenticated(str);
        }
    }

    @Override // mc.j
    public final String e() {
        return this.f70880n.e();
    }

    @Override // mc.j
    public boolean f() {
        return this.f70880n.f();
    }

    @Override // mc.j
    public Context g() {
        return this.f70880n.g();
    }

    @Override // mc.j
    public boolean h() {
        return this.f70880n.h();
    }

    @Override // mc.j
    public IIgniteServiceAPI k() {
        return this.f70880n.k();
    }

    @Override // mc.j
    public void l() {
        this.f70880n.l();
    }

    @Override // mc.j
    public final void n(j jVar) {
        this.f70880n.n(jVar);
    }

    public void onCredentialsRequestFailed(String str) {
        this.f70880n.onCredentialsRequestFailed(str);
    }

    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f70880n.onCredentialsRequestSuccess(str, str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f70880n.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f70880n.onServiceDisconnected(componentName);
    }

    @Override // mc.j
    public final void rl(j jVar) {
        this.f70880n.rl(jVar);
    }

    @Override // mc.j
    public void t(ComponentName componentName, IBinder iBinder) {
        Nge.j jVar = this.f70881t;
        if (jVar != null) {
            jVar.onIgniteServiceConnected(componentName, iBinder);
        }
    }

    public Wre(j jVar, Nge.j jVar2) {
        this.f70880n = jVar;
        this.f70881t = jVar2;
        jVar.rl(this);
        jVar.n(this);
    }
}
