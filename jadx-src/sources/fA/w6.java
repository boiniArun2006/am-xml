package fA;

import Vwv.I28;
import Vwv.Wre;
import Vwv.n;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class w6 implements n.InterfaceC0407n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f66596n;
    private final Vwv.w6 rl;

    @Override // Vwv.n.InterfaceC0407n
    public JSONObject a() {
        return this.f66596n;
    }

    @Override // Vwv.n.InterfaceC0407n
    public void a(JSONObject jSONObject) {
        this.f66596n = jSONObject;
    }

    public void n(JSONObject jSONObject, HashSet hashSet, long j2) {
        this.rl.t(new I28(this, hashSet, jSONObject, j2));
    }

    public void rl() {
        this.rl.t(new Vwv.Ml(this));
    }

    public void t(JSONObject jSONObject, HashSet hashSet, long j2) {
        this.rl.t(new Wre(this, hashSet, jSONObject, j2));
    }

    public w6(Vwv.w6 w6Var) {
        this.rl = w6Var;
    }
}
