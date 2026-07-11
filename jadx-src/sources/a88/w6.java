package a88;

import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Dsr f12729O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C f12730n;
    private final Wre nr;
    private final C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f12731t;

    public static w6 n(Wre wre, Dsr dsr, C c2, C c4, boolean z2) {
        K7m.CN3.nr(wre, "CreativeType is null");
        K7m.CN3.nr(dsr, "ImpressionType is null");
        K7m.CN3.nr(c2, "Impression owner is null");
        K7m.CN3.rl(c2, wre, dsr);
        return new w6(wre, dsr, c2, c4, z2);
    }

    public JSONObject nr() {
        JSONObject jSONObject = new JSONObject();
        K7m.w6.KN(jSONObject, "impressionOwner", this.f12730n);
        K7m.w6.KN(jSONObject, "mediaEventsOwner", this.rl);
        K7m.w6.KN(jSONObject, "creativeType", this.nr);
        K7m.w6.KN(jSONObject, "impressionType", this.f12729O);
        K7m.w6.KN(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f12731t));
        return jSONObject;
    }

    public boolean rl() {
        return C.NATIVE == this.f12730n;
    }

    public boolean t() {
        return C.NATIVE == this.rl;
    }

    private w6(Wre wre, Dsr dsr, C c2, C c4, boolean z2) {
        this.nr = wre;
        this.f12729O = dsr;
        this.f12730n = c2;
        if (c4 == null) {
            this.rl = C.NONE;
        } else {
            this.rl = c4;
        }
        this.f12731t = z2;
    }
}
