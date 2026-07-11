package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.net.ConnectivityManagerCompat;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.alightcreative.gl.egl.il.inFlMLxL;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
public class NetworkStateTracker extends ConstraintTracker<NetworkState> {
    static final String mUb = Logger.J2("NetworkStateTracker");
    private NetworkStateCallback KN;
    private final ConnectivityManager Uo;
    private NetworkStateBroadcastReceiver xMQ;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    private class NetworkStateBroadcastReceiver extends BroadcastReceiver {
        NetworkStateBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            Logger.t().n(NetworkStateTracker.mUb, "Network broadcast received", new Throwable[0]);
            NetworkStateTracker networkStateTracker = NetworkStateTracker.this;
            networkStateTracker.nr(networkStateTracker.Uo());
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    @RequiresApi
    private class NetworkStateCallback extends ConnectivityManager.NetworkCallback {
        NetworkStateCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Logger.t().n(NetworkStateTracker.mUb, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            NetworkStateTracker networkStateTracker = NetworkStateTracker.this;
            networkStateTracker.nr(networkStateTracker.Uo());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Logger.t().n(NetworkStateTracker.mUb, "Network connection lost", new Throwable[0]);
            NetworkStateTracker networkStateTracker = NetworkStateTracker.this;
            networkStateTracker.nr(networkStateTracker.Uo());
        }
    }

    private static boolean mUb() {
        return true;
    }

    boolean xMQ() {
        try {
            NetworkCapabilities networkCapabilities = this.Uo.getNetworkCapabilities(this.Uo.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e2) {
            Logger.t().rl(mUb, "Unable to validate active network", e2);
            return false;
        }
    }

    NetworkState Uo() {
        NetworkInfo activeNetworkInfo = this.Uo.getActiveNetworkInfo();
        boolean z2 = false;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zXMQ = xMQ();
        boolean zN = ConnectivityManagerCompat.n(this.Uo);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z2 = true;
        }
        return new NetworkState(z3, zXMQ, zN, z2);
    }

    public NetworkStateTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        this.Uo = (ConnectivityManager) this.rl.getSystemService("connectivity");
        if (mUb()) {
            this.KN = new NetworkStateCallback();
        } else {
            this.xMQ = new NetworkStateBroadcastReceiver();
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void J2() {
        if (mUb()) {
            try {
                Logger.t().n(mUb, "Unregistering network callback", new Throwable[0]);
                this.Uo.unregisterNetworkCallback(this.KN);
                return;
            } catch (IllegalArgumentException | SecurityException e2) {
                Logger.t().rl(mUb, inFlMLxL.xVqLMmi, e2);
                return;
            }
        }
        Logger.t().n(mUb, "Unregistering broadcast receiver", new Throwable[0]);
        this.rl.unregisterReceiver(this.xMQ);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public NetworkState rl() {
        return Uo();
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void O() {
        if (mUb()) {
            try {
                Logger.t().n(mUb, "Registering network callback", new Throwable[0]);
                this.Uo.registerDefaultNetworkCallback(this.KN);
                return;
            } catch (IllegalArgumentException | SecurityException e2) {
                Logger.t().rl(mUb, "Received exception while registering network callback", e2);
                return;
            }
        }
        Logger.t().n(mUb, "Registering broadcast receiver", new Throwable[0]);
        this.rl.registerReceiver(this.xMQ, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
}
