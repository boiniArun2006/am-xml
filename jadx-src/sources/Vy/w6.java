package Vy;

import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final fuX f11409O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final aC f11410n;
    private final Wre nr;
    private final aC rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f11411t;

    public static w6 n(Wre wre, fuX fux, aC aCVar, aC aCVar2, boolean z2) {
        upM.CN3.nr(wre, "CreativeType is null");
        upM.CN3.nr(fux, "ImpressionType is null");
        upM.CN3.nr(aCVar, "Impression owner is null");
        upM.CN3.rl(aCVar, wre, fux);
        return new w6(wre, fux, aCVar, aCVar2, z2);
    }

    public JSONObject nr() {
        JSONObject jSONObject = new JSONObject();
        upM.w6.xMQ(jSONObject, "impressionOwner", this.f11410n);
        upM.w6.xMQ(jSONObject, "mediaEventsOwner", this.rl);
        upM.w6.xMQ(jSONObject, "creativeType", this.nr);
        upM.w6.xMQ(jSONObject, "impressionType", this.f11409O);
        upM.w6.xMQ(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f11411t));
        return jSONObject;
    }

    public boolean rl() {
        return aC.NATIVE == this.f11410n;
    }

    public boolean t() {
        return aC.NATIVE == this.rl;
    }

    private w6(Wre wre, fuX fux, aC aCVar, aC aCVar2, boolean z2) {
        this.nr = wre;
        this.f11409O = fux;
        this.f11410n = aCVar;
        if (aCVar2 == null) {
            this.rl = aC.NONE;
        } else {
            this.rl = aCVar2;
        }
        this.f11411t = z2;
    }
}
