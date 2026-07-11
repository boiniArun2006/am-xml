package yzg;

import Ej.I28;
import Ej.Wre;
import Ej.n;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class w6 implements n.InterfaceC0084n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f76221n;
    private final Ej.w6 rl;

    @Override // Ej.n.InterfaceC0084n
    public JSONObject a() {
        return this.f76221n;
    }

    @Override // Ej.n.InterfaceC0084n
    public void a(JSONObject jSONObject) {
        this.f76221n = jSONObject;
    }

    public void n(JSONObject jSONObject, HashSet hashSet, long j2) {
        this.rl.t(new I28(this, hashSet, jSONObject, j2));
    }

    public void rl() {
        this.rl.t(new Ej.Ml(this));
    }

    public void t(JSONObject jSONObject, HashSet hashSet, long j2) {
        this.rl.t(new Wre(this, hashSet, jSONObject, j2));
    }

    public w6(Ej.w6 w6Var) {
        this.rl = w6Var;
    }
}
