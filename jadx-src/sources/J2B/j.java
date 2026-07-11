package J2B;

import J2B.Ml;
import Vy.Pl;
import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class j implements Ml.j {
    private static j J2 = new j(new Ml());

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f4431O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected upM.Wre f4432n = new upM.Wre();
    private Ml nr;
    private Date rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f4433t;

    public static j n() {
        return J2;
    }

    private void nr() {
        if (!this.f4433t || this.rl == null) {
            return;
        }
        Iterator it = w6.O().n().iterator();
        while (it.hasNext()) {
            ((Pl) it.next()).qie().gh(t());
        }
    }

    public void O() {
        Date dateN = this.f4432n.n();
        Date date = this.rl;
        if (date == null || dateN.after(date)) {
            this.rl = dateN;
            nr();
        }
    }

    @Override // J2B.Ml.j
    public void a(boolean z2) {
        if (!this.f4431O && z2) {
            O();
        }
        this.f4431O = z2;
    }

    public void rl(Context context) {
        if (this.f4433t) {
            return;
        }
        this.nr.rl(context);
        this.nr.n(this);
        this.nr.xMQ();
        this.f4431O = this.nr.Uo();
        this.f4433t = true;
    }

    public Date t() {
        Date date = this.rl;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    private j(Ml ml) {
        this.nr = ml;
    }
}
