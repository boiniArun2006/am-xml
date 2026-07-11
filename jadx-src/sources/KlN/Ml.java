package KlN;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml extends ContentObserver {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f5788O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f5789n;
    private final w6 nr;
    private final AudioManager rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f5790t;

    private float n() {
        return this.f5790t.n(this.rl.getStreamVolume(3), this.rl.getStreamMaxVolume(3));
    }

    private boolean rl(float f3) {
        return f3 != this.f5788O;
    }

    private void t() {
        this.nr.a(this.f5788O);
    }

    public void O() {
        this.f5789n.getContentResolver().unregisterContentObserver(this);
    }

    public Ml(Handler handler, Context context, j jVar, w6 w6Var) {
        super(handler);
        this.f5789n = context;
        this.rl = (AudioManager) context.getSystemService("audio");
        this.f5790t = jVar;
        this.nr = w6Var;
    }

    public void nr() {
        this.f5788O = n();
        t();
        this.f5789n.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        super.onChange(z2);
        float fN = n();
        if (rl(fN)) {
            this.f5788O = fN;
            t();
        }
    }
}
