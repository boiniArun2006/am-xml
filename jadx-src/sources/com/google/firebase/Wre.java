package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import pa.C2332j;
import uOq.C2403c;
import uOq.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Wre {
    private static final Object gh = new Object();
    static final Map qie = new ArrayMap();
    private final oSp.n KN;
    private final C2403c Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f60047n;
    private final uOq.Pl nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final qz f60048t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final AtomicBoolean f60046O = new AtomicBoolean(false);
    private final AtomicBoolean J2 = new AtomicBoolean();
    private final List xMQ = new CopyOnWriteArrayList();
    private final List mUb = new CopyOnWriteArrayList();

    public interface j {
        void onBackgroundStateChanged(boolean z2);
    }

    private static class w6 extends BroadcastReceiver {
        private static AtomicReference rl = new AtomicReference();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Context f60050n;

        /* JADX INFO: Access modifiers changed from: private */
        public static void rl(Context context) {
            if (rl.get() == null) {
                w6 w6Var = new w6(context);
                if (androidx.compose.animation.core.fuX.n(rl, null, w6Var)) {
                    context.registerReceiver(w6Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void t() {
            this.f60050n.unregisterReceiver(this);
        }

        public w6(Context context) {
            this.f60050n = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (Wre.gh) {
                try {
                    Iterator it = Wre.qie.values().iterator();
                    while (it.hasNext()) {
                        ((Wre) it.next()).r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            t();
        }
    }

    private static class n implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static AtomicReference f60049n = new AtomicReference();

        private n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void rl(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f60049n.get() == null) {
                    n nVar = new n();
                    if (androidx.compose.animation.core.fuX.n(f60049n, null, nVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(nVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z2) {
            synchronized (Wre.gh) {
                try {
                    for (Wre wre : new ArrayList(Wre.qie.values())) {
                        if (wre.f60046O.get()) {
                            wre.ViF(z2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ViF(boolean z2) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.xMQ.iterator();
        while (it.hasNext()) {
            ((j) it.next()).onBackgroundStateChanged(z2);
        }
    }

    public static Wre Z(Context context, qz qzVar) {
        return XQ(context, qzVar, "[DEFAULT]");
    }

    public static Wre az() {
        Wre wre;
        synchronized (gh) {
            try {
                wre = (Wre) qie.get("[DEFAULT]");
                if (wre == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((Ip.Wre) wre.KN.get()).KN();
            } catch (Throwable th) {
                throw th;
            }
        }
        return wre;
    }

    private static List gh() {
        ArrayList arrayList = new ArrayList();
        synchronized (gh) {
            try {
                Iterator it = qie.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((Wre) it.next()).HI());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static /* synthetic */ void n(Wre wre, boolean z2) {
        if (z2) {
            wre.getClass();
        } else {
            ((Ip.Wre) wre.KN.get()).KN();
        }
    }

    public static Wre o(Context context) {
        synchronized (gh) {
            try {
                if (qie.containsKey("[DEFAULT]")) {
                    return az();
                }
                qz qzVarN = qz.n(context);
                if (qzVarN == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return Z(context, qzVarN);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (!UserManagerCompat.n(this.f60047n)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + HI());
            w6.rl(this.f60047n);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + HI());
        this.nr.ck(WPU());
        ((Ip.Wre) this.KN.get()).KN();
    }

    public static /* synthetic */ C2332j rl(Wre wre, Context context) {
        return new C2332j(context, wre.Ik(), (WU.w6) wre.nr.n(WU.w6.class));
    }

    public static Wre ty(String str) {
        Wre wre;
        String str2;
        synchronized (gh) {
            try {
                wre = (Wre) qie.get(aYN(str));
                if (wre == null) {
                    List listGh = gh();
                    if (listGh.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", listGh);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((Ip.Wre) wre.KN.get()).KN();
            } finally {
            }
        }
        return wre;
    }

    private void xMQ() {
        Preconditions.checkState(!this.J2.get(), "FirebaseApp was deleted");
    }

    public String Ik() {
        return Base64Utils.encodeUrlSafeNoPadding(HI().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(ck().t().getBytes(Charset.defaultCharset()));
    }

    public boolean WPU() {
        return "[DEFAULT]".equals(HI());
    }

    public boolean equals(Object obj) {
        if (obj instanceof Wre) {
            return this.rl.equals(((Wre) obj).HI());
        }
        return false;
    }

    public int hashCode() {
        return this.rl.hashCode();
    }

    protected Wre(final Context context, String str, qz qzVar) {
        this.f60047n = (Context) Preconditions.checkNotNull(context);
        this.rl = Preconditions.checkNotEmpty(str);
        this.f60048t = (qz) Preconditions.checkNotNull(qzVar);
        Pl plRl = FirebaseInitProvider.rl();
        m6x.w6.rl("Firebase");
        m6x.w6.rl("ComponentDiscovery");
        List listRl = uOq.Wre.t(context, ComponentDiscoveryService.class).rl();
        m6x.w6.n();
        m6x.w6.rl("Runtime");
        Pl.n nVarJ2 = uOq.Pl.az(JWp.Pl.INSTANCE).nr(listRl).t(new FirebaseCommonRegistrar()).t(new ExecutorsRegistrar()).rl(uOq.w6.Ik(context, Context.class, new Class[0])).rl(uOq.w6.Ik(this, Wre.class, new Class[0])).rl(uOq.w6.Ik(qzVar, qz.class, new Class[0])).J2(new m6x.n());
        if (UserManagerCompat.n(context) && FirebaseInitProvider.t()) {
            nVarJ2.rl(uOq.w6.Ik(plRl, Pl.class, new Class[0]));
        }
        uOq.Pl plO = nVarJ2.O();
        this.nr = plO;
        m6x.w6.n();
        this.Uo = new C2403c(new oSp.n() { // from class: com.google.firebase.Ml
            @Override // oSp.n
            public final Object get() {
                return Wre.rl(this.f60043n, context);
            }
        });
        this.KN = plO.O(Ip.Wre.class);
        Uo(new j() { // from class: com.google.firebase.I28
            @Override // com.google.firebase.Wre.j
            public final void onBackgroundStateChanged(boolean z2) {
                Wre.n(this.f60042n, z2);
            }
        });
        m6x.w6.n();
    }

    public static Wre XQ(Context context, qz qzVar, String str) {
        Wre wre;
        n.rl(context);
        String strAYN = aYN(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (gh) {
            Map map = qie;
            Preconditions.checkState(!map.containsKey(strAYN), "FirebaseApp name " + strAYN + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            wre = new Wre(context, strAYN, qzVar);
            map.put(strAYN, wre);
        }
        wre.r();
        return wre;
    }

    private static String aYN(String str) {
        return str.trim();
    }

    public String HI() {
        xMQ();
        return this.rl;
    }

    public void KN(CN3 cn3) {
        xMQ();
        Preconditions.checkNotNull(cn3);
        this.mUb.add(cn3);
    }

    public boolean S() {
        xMQ();
        return ((C2332j) this.Uo.get()).rl();
    }

    public void Uo(j jVar) {
        xMQ();
        if (this.f60046O.get() && BackgroundDetector.getInstance().isInBackground()) {
            jVar.onBackgroundStateChanged(true);
        }
        this.xMQ.add(jVar);
    }

    public qz ck() {
        xMQ();
        return this.f60048t;
    }

    public Object mUb(Class cls) {
        xMQ();
        return this.nr.n(cls);
    }

    public Context qie() {
        xMQ();
        return this.f60047n;
    }

    public String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.rl).add("options", this.f60048t).toString();
    }
}
