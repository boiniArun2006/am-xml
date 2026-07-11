package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class DAz implements ServiceConnection {
    private final String E2;
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private n f52662O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final String f52663S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final int f52664Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f52665g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f52666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f52667o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Messenger f52668r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f52669t;

    public static final class j extends Handler {
        j() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (VmF.j.nr(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(message, "message");
                DAz.this.J2(message);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public interface n {
        void n(Bundle bundle);
    }

    public final void O() {
        this.J2 = false;
    }

    protected abstract void Uo(Bundle bundle);

    public final boolean mUb() {
        synchronized (this) {
            boolean z2 = false;
            if (this.J2) {
                return false;
            }
            if (nKK.o(this.f52665g) == -1) {
                return false;
            }
            Intent intentQie = nKK.qie(this.f52666n);
            if (intentQie != null) {
                z2 = true;
                this.J2 = true;
                this.f52666n.bindService(intentQie, this, 1);
            }
            return z2;
        }
    }

    public DAz(Context context, int i2, int i3, int i5, String applicationId, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f52666n = applicationContext != null ? applicationContext : context;
        this.f52667o = i2;
        this.f52664Z = i3;
        this.f52663S = applicationId;
        this.f52665g = i5;
        this.E2 = str;
        this.f52669t = new j();
    }

    private final void KN() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f52663S);
        String str = this.E2;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        Uo(bundle);
        Message messageObtain = Message.obtain((Handler) null, this.f52667o);
        messageObtain.arg1 = this.f52665g;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.f52669t);
        try {
            Messenger messenger = this.f52668r;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (RemoteException unused) {
            nr(null);
        }
    }

    private final void nr(Bundle bundle) {
        if (this.J2) {
            this.J2 = false;
            n nVar = this.f52662O;
            if (nVar != null) {
                nVar.n(bundle);
            }
        }
    }

    protected final void J2(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.what == this.f52664Z) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                nr(null);
            } else {
                nr(data);
            }
            try {
                this.f52666n.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f52668r = new Messenger(service);
        KN();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f52668r = null;
        try {
            this.f52666n.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        nr(null);
    }

    public final void xMQ(n nVar) {
        this.f52662O = nVar;
    }
}
