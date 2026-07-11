package iWe;

import O2.o;
import android.content.Context;
import com.safedk.android.analytics.brandsafety.creatives.g;
import java.net.URI;
import oK9.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class w6 extends I28 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final yMa.j f68128t = yMa.j.O();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f68129n;
    private final Context rl;

    private boolean HI(int i2) {
        return i2 == -1 || i2 > 0;
    }

    private URI Uo(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e2) {
            f68128t.gh("getResultUrl throws exception %s", e2.getMessage());
            return null;
        }
    }

    private boolean ck(String str) {
        if (str == null) {
            return false;
        }
        return g.f62375e.equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    private boolean Ik(long j2) {
        return j2 >= 0;
    }

    private boolean KN(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return o.n(uri, context);
    }

    private boolean az(int i2) {
        return i2 > 0;
    }

    private boolean gh(String str) {
        return (str == null || xMQ(str) || str.length() > 255) ? false : true;
    }

    private boolean r(String str) {
        return str == null;
    }

    private boolean ty(long j2) {
        return j2 >= 0;
    }

    private boolean xMQ(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    boolean qie(fuX.Ml ml) {
        return (ml == null || ml == fuX.Ml.HTTP_METHOD_UNKNOWN) ? false : true;
    }

    @Override // iWe.I28
    public boolean t() {
        if (mUb(this.f68129n.nHg())) {
            f68128t.mUb("URL is missing:" + this.f68129n.nHg());
            return false;
        }
        URI uriUo = Uo(this.f68129n.nHg());
        if (uriUo == null) {
            f68128t.mUb("URL cannot be parsed");
            return false;
        }
        if (!KN(uriUo, this.rl)) {
            f68128t.mUb("URL fails allowlist rule: " + uriUo);
            return false;
        }
        if (!gh(uriUo.getHost())) {
            f68128t.mUb("URL host is null or invalid");
            return false;
        }
        if (!ck(uriUo.getScheme())) {
            f68128t.mUb("URL scheme is null or invalid");
            return false;
        }
        if (!r(uriUo.getUserInfo())) {
            f68128t.mUb("URL user info is null");
            return false;
        }
        if (!HI(uriUo.getPort())) {
            f68128t.mUb("URL port is less than or equal to 0");
            return false;
        }
        if (!qie(this.f68129n.wTp() ? this.f68129n.g() : null)) {
            f68128t.mUb("HTTP Method is null or invalid: " + this.f68129n.g());
            return false;
        }
        if (this.f68129n.v() && !az(this.f68129n.te())) {
            f68128t.mUb("HTTP ResponseCode is a negative value:" + this.f68129n.te());
            return false;
        }
        if (this.f68129n.rV9() && !ty(this.f68129n.fD())) {
            f68128t.mUb("Request Payload is a negative value:" + this.f68129n.fD());
            return false;
        }
        if (this.f68129n.bzg() && !ty(this.f68129n.e())) {
            f68128t.mUb("Response Payload is a negative value:" + this.f68129n.e());
            return false;
        }
        if (!this.f68129n.s7N() || this.f68129n.ViF() <= 0) {
            f68128t.mUb("Start time of the request is null, or zero, or a negative value:" + this.f68129n.ViF());
            return false;
        }
        if (this.f68129n.Xw() && !Ik(this.f68129n.X())) {
            f68128t.mUb("Time to complete the request is a negative value:" + this.f68129n.X());
            return false;
        }
        if (this.f68129n.U() && !Ik(this.f68129n.N())) {
            f68128t.mUb("Time from the start of the request to the start of the response is null or a negative value:" + this.f68129n.N());
            return false;
        }
        if (this.f68129n.jB() && this.f68129n.T() > 0) {
            if (this.f68129n.v()) {
                return true;
            }
            f68128t.mUb("Did not receive a HTTP Response Code");
            return false;
        }
        f68128t.mUb("Time from the start of the request to the end of the response is null, negative or zero:" + this.f68129n.T());
        return false;
    }

    w6(fuX fux, Context context) {
        this.rl = context;
        this.f68129n = fux;
    }

    private boolean mUb(String str) {
        return xMQ(str);
    }
}
