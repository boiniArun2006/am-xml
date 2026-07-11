package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import androidx.compose.animation.core.fuX;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.Wre;
import com.google.firebase.remoteconfig.internal.C1916c;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.Xo;
import com.google.firebase.remoteconfig.internal.eO;
import com.google.firebase.remoteconfig.internal.qz;
import com.google.firebase.remoteconfig.internal.r;
import com.google.firebase.remoteconfig.internal.s4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import s9b.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class w6 implements FP.j {
    private final ED.n J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final I28 f60788O;
    private final oSp.n Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f60789n;
    private final Wre nr;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ScheduledExecutorService f60790t;
    private Map xMQ;
    private static final Clock mUb = DefaultClock.getInstance();
    private static final Random gh = new Random();
    private static final Map qie = new HashMap();

    w6(Context context, ScheduledExecutorService scheduledExecutorService, Wre wre, I28 i28, ED.n nVar, oSp.n nVar2) {
        this(context, scheduledExecutorService, wre, i28, nVar, nVar2, true);
    }

    public static /* synthetic */ SHQ.j rl() {
        return null;
    }

    synchronized qz KN(String str, com.google.firebase.remoteconfig.internal.Wre wre, C1916c c1916c) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new qz(this.f60788O, ck(this.nr) ? this.Uo : new oSp.n() { // from class: N67.Pl
            @Override // oSp.n
            public final Object get() {
                return com.google.firebase.remoteconfig.w6.rl();
            }
        }, this.f60790t, mUb, gh, wre, xMQ(this.nr.ck().rl(), str, c1916c), c1916c, this.xMQ);
    }

    public synchronized com.google.firebase.remoteconfig.j O(String str) throws Throwable {
        Throwable th;
        try {
            try {
                com.google.firebase.remoteconfig.internal.Wre wreJ2 = J2(str, "fetch");
                com.google.firebase.remoteconfig.internal.Wre wreJ22 = J2(str, "activate");
                com.google.firebase.remoteconfig.internal.Wre wreJ23 = J2(str, "defaults");
                C1916c c1916cTy = ty(this.rl, this.KN, str);
                Xo xoMUb = mUb(wreJ22, wreJ23);
                final r rVarGh = gh(this.nr, str, this.Uo);
                if (rVarGh != null) {
                    try {
                        xoMUb.rl(new BiConsumer() { // from class: N67.qz
                            @Override // com.google.android.gms.common.util.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                rVarGh.n((String) obj, (com.google.firebase.remoteconfig.internal.CN3) obj2);
                            }
                        });
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                return nr(this.nr, str, this.f60788O, this.J2, this.f60790t, wreJ2, wreJ22, wreJ23, KN(str, wreJ2, c1916cTy), xoMUb, c1916cTy, az(wreJ22, wreJ23));
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    synchronized com.google.firebase.remoteconfig.j nr(Wre wre, String str, I28 i28, ED.n nVar, Executor executor, com.google.firebase.remoteconfig.internal.Wre wre2, com.google.firebase.remoteconfig.internal.Wre wre3, com.google.firebase.remoteconfig.internal.Wre wre4, qz qzVar, Xo xo, C1916c c1916c, ko7.I28 i282) throws Throwable {
        w6 w6Var;
        String str2;
        try {
            try {
                if (this.f60789n.containsKey(str)) {
                    w6Var = this;
                    str2 = str;
                } else {
                    w6Var = this;
                    str2 = str;
                    com.google.firebase.remoteconfig.j jVar = new com.google.firebase.remoteconfig.j(this.rl, wre, i28, HI(wre, str) ? nVar : null, executor, wre2, wre3, wre4, qzVar, xo, c1916c, qie(wre, i28, qzVar, wre3, this.rl, str, c1916c), i282);
                    jVar.WPU();
                    w6Var.f60789n.put(str2, jVar);
                    qie.put(str2, jVar);
                }
                return (com.google.firebase.remoteconfig.j) w6Var.f60789n.get(str2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    synchronized eO qie(Wre wre, I28 i28, qz qzVar, com.google.firebase.remoteconfig.internal.Wre wre2, Context context, String str, C1916c c1916c) {
        return new eO(wre, i28, qzVar, wre2, context, str, c1916c, this.f60790t);
    }

    private static class j implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final AtomicReference f60791n = new AtomicReference();

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void rl(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f60791n;
            if (atomicReference.get() == null) {
                j jVar = new j();
                if (fuX.n(atomicReference, null, jVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(jVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z2) {
            w6.Ik(z2);
        }
    }

    protected w6(Context context, ScheduledExecutorService scheduledExecutorService, Wre wre, I28 i28, ED.n nVar, oSp.n nVar2, boolean z2) {
        this.f60789n = new HashMap();
        this.xMQ = new HashMap();
        this.rl = context;
        this.f60790t = scheduledExecutorService;
        this.nr = wre;
        this.f60788O = i28;
        this.J2 = nVar;
        this.Uo = nVar2;
        this.KN = wre.ck().t();
        j.rl(context);
        if (z2) {
            Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f60787n.Uo();
                }
            });
        }
    }

    private static boolean HI(Wre wre, String str) {
        return str.equals("firebase") && ck(wre);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void Ik(boolean z2) {
        Iterator it = qie.values().iterator();
        while (it.hasNext()) {
            ((com.google.firebase.remoteconfig.j) it.next()).Z(z2);
        }
    }

    private com.google.firebase.remoteconfig.internal.Wre J2(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.Wre.KN(this.f60790t, s4.t(this.rl, String.format("%s_%s_%s_%s.json", "frc", this.KN, str, str2)));
    }

    private Xo mUb(com.google.firebase.remoteconfig.internal.Wre wre, com.google.firebase.remoteconfig.internal.Wre wre2) {
        return new Xo(this.f60790t, wre, wre2);
    }

    static C1916c ty(Context context, String str, String str2) {
        return new C1916c(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    com.google.firebase.remoteconfig.j Uo() {
        return O("firebase");
    }

    ConfigFetchHttpClient xMQ(String str, String str2, C1916c c1916c) {
        return new ConfigFetchHttpClient(this.rl, this.nr.ck().t(), str, str2, c1916c.t(), c1916c.t());
    }

    private ko7.I28 az(com.google.firebase.remoteconfig.internal.Wre wre, com.google.firebase.remoteconfig.internal.Wre wre2) {
        return new ko7.I28(wre, ko7.j.n(wre, wre2), this.f60790t);
    }

    private static boolean ck(Wre wre) {
        return wre.HI().equals("[DEFAULT]");
    }

    private static r gh(Wre wre, String str, oSp.n nVar) {
        if (ck(wre) && str.equals("firebase")) {
            return new r(nVar);
        }
        return null;
    }

    @Override // FP.j
    public void n(String str, q6T.Wre wre) {
        O(str).ck().O(wre);
    }
}
