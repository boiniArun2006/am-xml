package VO;

import JP.DAz;
import JP.I28;
import JP.nKK;
import JP.qz;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.util.Log;
import io.grpc.CN3;
import io.grpc.ManagedChannelProvider;
import io.grpc.aC;
import io.grpc.z;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j extends CN3 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ManagedChannelProvider f10874t = mUb();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final z f10875n;
    private Context rl;

    static final class n extends nKK {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Runnable f10876O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final nKK f10877n;
        private final Object nr = new Object();
        private final Context rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final ConnectivityManager f10878t;

        private class Ml extends BroadcastReceiver {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private boolean f10879n;

            private Ml() {
                this.f10879n = false;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z2 = this.f10879n;
                boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f10879n = z3;
                if (!z3 || z2) {
                    return;
                }
                n.this.f10877n.mUb();
            }
        }

        /* JADX INFO: renamed from: VO.j$n$j, reason: collision with other inner class name */
        class RunnableC0387j implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ w6 f10880n;

            RunnableC0387j(w6 w6Var) {
                this.f10880n = w6Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                n.this.f10878t.unregisterNetworkCallback(this.f10880n);
            }
        }

        /* JADX INFO: renamed from: VO.j$n$n, reason: collision with other inner class name */
        class RunnableC0388n implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Ml f10882n;

            RunnableC0388n(Ml ml) {
                this.f10882n = ml;
            }

            @Override // java.lang.Runnable
            public void run() {
                n.this.rl.unregisterReceiver(this.f10882n);
            }
        }

        private class w6 extends ConnectivityManager.NetworkCallback {
            private w6() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                n.this.f10877n.mUb();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean z2) {
                if (z2) {
                    return;
                }
                n.this.f10877n.mUb();
            }
        }

        private void Ik() {
            if (this.f10878t != null) {
                w6 w6Var = new w6();
                this.f10878t.registerDefaultNetworkCallback(w6Var);
                this.f10876O = new RunnableC0387j(w6Var);
            } else {
                Ml ml = new Ml();
                this.rl.registerReceiver(ml, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f10876O = new RunnableC0388n(ml);
            }
        }

        private void r() {
            synchronized (this.nr) {
                try {
                    Runnable runnable = this.f10876O;
                    if (runnable != null) {
                        runnable.run();
                        this.f10876O = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // JP.n
        public I28 KN(DAz dAz, io.grpc.n nVar) {
            return this.f10877n.KN(dAz, nVar);
        }

        @Override // JP.nKK
        public qz gh(boolean z2) {
            return this.f10877n.gh(z2);
        }

        @Override // JP.nKK
        public void mUb() {
            this.f10877n.mUb();
        }

        @Override // JP.n
        public String n() {
            return this.f10877n.n();
        }

        @Override // JP.nKK
        public void qie(qz qzVar, Runnable runnable) {
            this.f10877n.qie(qzVar, runnable);
        }

        n(nKK nkk, Context context) {
            this.f10877n = nkk;
            this.rl = context;
            if (context != null) {
                this.f10878t = (ConnectivityManager) context.getSystemService("connectivity");
                try {
                    Ik();
                    return;
                } catch (SecurityException e2) {
                    Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e2);
                    return;
                }
            }
            this.f10878t = null;
        }

        @Override // JP.nKK
        public nKK az() {
            r();
            return this.f10877n.az();
        }
    }

    public static j gh(z zVar) {
        return new j(zVar);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    private static ManagedChannelProvider mUb() {
        try {
            try {
                ManagedChannelProvider managedChannelProvider = (ManagedChannelProvider) KaW.CN3.class.asSubclass(ManagedChannelProvider.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                if (aC.n(managedChannelProvider)) {
                    return managedChannelProvider;
                }
                Log.w("AndroidChannelBuilder", "OkHttpChannelProvider.isAvailable() returned false");
                return null;
            } catch (Exception e2) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e2);
                return null;
            }
        } catch (ClassCastException e3) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e3);
            return null;
        }
    }

    @Override // io.grpc.CN3, io.grpc.Wre
    protected z O() {
        return this.f10875n;
    }

    @Override // io.grpc.Wre, io.grpc.z
    public nKK n() {
        return new n(this.f10875n.n(), this.rl);
    }

    public j xMQ(Context context) {
        this.rl = context;
        return this;
    }

    private j(z zVar) {
        this.f10875n = (z) Xo.ck(zVar, "delegateBuilder");
    }
}
