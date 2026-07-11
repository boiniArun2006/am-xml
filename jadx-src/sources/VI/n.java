package VI;

import K7m.CN3;
import WJ.phkN.HFAkacKHsU;
import a88.Pl;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g4f.Dsr;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pl f10862n;

    private void J2(float f3) {
        if (f3 < 0.0f || f3 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    private void O(float f3) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    public static n Uo(a88.n nVar) {
        Pl pl = (Pl) nVar;
        CN3.nr(nVar, "AdSession is null");
        CN3.gh(pl);
        CN3.KN(pl);
        CN3.Uo(pl);
        CN3.az(pl);
        n nVar2 = new n(pl);
        pl.ty().t(nVar2);
        return nVar2;
    }

    public void KN() {
        CN3.t(this.f10862n);
        this.f10862n.ty().xMQ("firstQuartile");
    }

    public void gh() {
        CN3.t(this.f10862n);
        this.f10862n.ty().xMQ("resume");
    }

    public void mUb() {
        CN3.t(this.f10862n);
        this.f10862n.ty().xMQ("pause");
    }

    public void n(j jVar) {
        CN3.nr(jVar, "InteractionType is null");
        CN3.t(this.f10862n);
        JSONObject jSONObject = new JSONObject();
        K7m.w6.KN(jSONObject, "interactionType", jVar);
        this.f10862n.ty().gh("adUserInteraction", jSONObject);
    }

    public void nr() {
        CN3.t(this.f10862n);
        this.f10862n.ty().xMQ("complete");
    }

    public void qie() {
        CN3.t(this.f10862n);
        this.f10862n.ty().xMQ("skipped");
    }

    public void rl() {
        CN3.t(this.f10862n);
        this.f10862n.ty().xMQ("bufferFinish");
    }

    public void t() {
        CN3.t(this.f10862n);
        this.f10862n.ty().xMQ(HFAkacKHsU.EngTPNT);
    }

    public void ty() {
        CN3.t(this.f10862n);
        this.f10862n.ty().xMQ("thirdQuartile");
    }

    public void xMQ() {
        CN3.t(this.f10862n);
        this.f10862n.ty().xMQ("midpoint");
    }

    private n(Pl pl) {
        this.f10862n = pl;
    }

    public void HI(float f3) {
        J2(f3);
        CN3.t(this.f10862n);
        JSONObject jSONObject = new JSONObject();
        K7m.w6.KN(jSONObject, "mediaPlayerVolume", Float.valueOf(f3));
        K7m.w6.KN(jSONObject, "deviceVolume", Float.valueOf(Dsr.nr().t()));
        this.f10862n.ty().gh("volumeChange", jSONObject);
    }

    public void az(float f3, float f4) {
        O(f3);
        J2(f4);
        CN3.t(this.f10862n);
        JSONObject jSONObject = new JSONObject();
        K7m.w6.KN(jSONObject, "duration", Float.valueOf(f3));
        K7m.w6.KN(jSONObject, "mediaPlayerVolume", Float.valueOf(f4));
        K7m.w6.KN(jSONObject, "deviceVolume", Float.valueOf(Dsr.nr().t()));
        this.f10862n.ty().gh(TtmlNode.START, jSONObject);
    }
}
