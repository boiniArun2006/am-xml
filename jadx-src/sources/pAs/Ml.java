package pAs;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml extends ContentObserver {
    private final AtomicReference J2;
    private final ExecutorService KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final w6 f71625O;
    private final AtomicBoolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f71626n;
    private final pAs.j nr;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AudioManager f71627t;

    class j implements Runnable {

        /* JADX INFO: renamed from: pAs.Ml$j$j, reason: collision with other inner class name */
        class RunnableC1093j implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ float f71629n;

            RunnableC1093j(float f3) {
                this.f71629n = f3;
            }

            @Override // java.lang.Runnable
            public void run() {
                Ml.this.f71625O.a(this.f71629n);
            }
        }

        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fN = Ml.this.n();
            Ml.this.Uo.set(false);
            if (((Float) Ml.this.J2.getAndSet(Float.valueOf(fN))).floatValue() != fN) {
                Ml.this.f71626n.post(new RunnableC1093j(fN));
            }
        }
    }

    private void KN() {
        this.KN.submit(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.nr.n(this.f71627t.getStreamVolume(3), this.f71627t.getStreamMaxVolume(3));
    }

    public void J2() {
        this.rl.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        if (this.Uo.getAndSet(true)) {
            return;
        }
        KN();
    }

    public Ml(Handler handler, Context context, pAs.j jVar, w6 w6Var) {
        super(handler);
        this.J2 = new AtomicReference(Float.valueOf(-1.0f));
        this.Uo = new AtomicBoolean(false);
        this.KN = Executors.newSingleThreadExecutor();
        this.f71626n = handler;
        this.rl = context;
        this.f71627t = (AudioManager) context.getSystemService("audio");
        this.nr = jVar;
        this.f71625O = w6Var;
    }

    public void nr() {
        KN();
        this.rl.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }
}
