package vv;

import J2B.Dsr;
import Vy.Pl;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.json.JSONObject;
import upM.CN3;

/* JADX INFO: renamed from: vv.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2410n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pl f74765n;

    public static C2410n O(Vy.n nVar) {
        Pl pl = (Pl) nVar;
        CN3.nr(nVar, "AdSession is null");
        CN3.gh(pl);
        CN3.KN(pl);
        CN3.Uo(pl);
        CN3.az(pl);
        C2410n c2410n = new C2410n(pl);
        pl.qie().az(c2410n);
        return c2410n;
    }

    private void nr(float f3) {
        if (f3 < 0.0f || f3 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    private void t(float f3) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    public void J2() {
        CN3.t(this.f74765n);
        this.f74765n.qie().KN("firstQuartile");
    }

    public void KN() {
        CN3.t(this.f74765n);
        this.f74765n.qie().KN("pause");
    }

    public void Uo() {
        CN3.t(this.f74765n);
        this.f74765n.qie().KN("midpoint");
    }

    public void gh() {
        CN3.t(this.f74765n);
        this.f74765n.qie().KN("thirdQuartile");
    }

    public void n(EnumC2409j enumC2409j) {
        CN3.nr(enumC2409j, "InteractionType is null");
        CN3.t(this.f74765n);
        JSONObject jSONObject = new JSONObject();
        upM.w6.xMQ(jSONObject, "interactionType", enumC2409j);
        this.f74765n.qie().mUb("adUserInteraction", jSONObject);
    }

    public void rl() {
        CN3.t(this.f74765n);
        this.f74765n.qie().KN("complete");
    }

    public void xMQ() {
        CN3.t(this.f74765n);
        this.f74765n.qie().KN("resume");
    }

    private C2410n(Pl pl) {
        this.f74765n = pl;
    }

    public void mUb(float f3, float f4) {
        t(f3);
        nr(f4);
        CN3.t(this.f74765n);
        JSONObject jSONObject = new JSONObject();
        upM.w6.xMQ(jSONObject, "duration", Float.valueOf(f3));
        upM.w6.xMQ(jSONObject, "mediaPlayerVolume", Float.valueOf(f4));
        upM.w6.xMQ(jSONObject, "deviceVolume", Float.valueOf(Dsr.nr().t()));
        this.f74765n.qie().mUb(TtmlNode.START, jSONObject);
    }

    public void qie(float f3) {
        nr(f3);
        CN3.t(this.f74765n);
        JSONObject jSONObject = new JSONObject();
        upM.w6.xMQ(jSONObject, "mediaPlayerVolume", Float.valueOf(f3));
        upM.w6.xMQ(jSONObject, "deviceVolume", Float.valueOf(Dsr.nr().t()));
        this.f74765n.qie().mUb("volumeChange", jSONObject);
    }
}
