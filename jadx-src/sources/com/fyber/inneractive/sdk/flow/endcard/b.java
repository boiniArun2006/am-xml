package com.fyber.inneractive.sdk.flow.endcard;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53586a = IAlog.a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f53587b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f53588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f53589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53591f;

    public abstract void a(ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar);

    public void a(JSONArray jSONArray) {
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        return f().b();
    }

    public abstract n c();

    public abstract com.fyber.inneractive.sdk.util.g g();

    public abstract l h();

    public abstract com.fyber.inneractive.sdk.model.vast.i i();

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract boolean l();

    public static boolean b(com.fyber.inneractive.sdk.config.global.features.v vVar) {
        if (vVar != null) {
            Boolean boolC = vVar.c("shouldEnableEndCardAutoClick");
            if (boolC != null ? boolC.booleanValue() : false) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final void a() {
        n nVar = this.f53589d;
        if (nVar != null) {
            nVar.a();
        }
    }

    public com.fyber.inneractive.sdk.player.ui.c d() {
        com.fyber.inneractive.sdk.config.global.features.v vVar = this.f53588c.f53989g;
        com.fyber.inneractive.sdk.player.ui.c cVar = new com.fyber.inneractive.sdk.player.ui.c();
        cVar.f56414a = l();
        cVar.f56419f = i();
        boolean zB = b(vVar);
        Integer numValueOf = Integer.valueOf(a(vVar));
        if (zB) {
            cVar.f56417d = numValueOf;
        }
        return cVar;
    }

    public final n f() {
        if (this.f53589d == null) {
            this.f53589d = c();
        }
        return this.f53589d;
    }

    public b(int i2, x0 x0Var) {
        this.f53588c = x0Var;
        this.f53591f = i2;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void destroy() {
        e();
        n nVar = this.f53589d;
        if (nVar != null) {
            nVar.destroy();
            this.f53589d = null;
        }
    }

    public void e() {
        a();
    }

    public void m() {
        IAlog.a("%s loading success for %s", i(), this.f53586a);
    }

    public void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.a("%s loading failed for %s", inneractiveInfrastructureError.getCause(), i(), this.f53586a);
    }

    public static int a(com.fyber.inneractive.sdk.config.global.features.v vVar) {
        if (vVar != null) {
            Integer numA = vVar.a("autoClickDelay");
            int iIntValue = numA != null ? numA.intValue() : 3;
            if (iIntValue >= 0 && iIntValue <= 10) {
                return iIntValue;
            }
        }
        return 3;
    }
}
