package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.aC;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0013\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/Messenger;", c.f62177j, "(Landroid/content/Intent;)Landroid/os/Messenger;", "", "onCreate", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDestroy", "Landroid/os/HandlerThread;", "Landroid/os/HandlerThread;", "getHandlerThread$com_google_firebase_firebase_sessions", "()Landroid/os/HandlerThread;", "handlerThread", "Lcom/google/firebase/sessions/SessionLifecycleService$n;", "t", "Lcom/google/firebase/sessions/SessionLifecycleService$n;", "messageHandler", "O", "Landroid/os/Messenger;", "messenger", "J2", "j", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionLifecycleService extends Service {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Messenger messenger;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final HandlerThread handlerThread = new HandlerThread("FirebaseSessions_HandlerThread");

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private n messageHandler;

    public static final class n extends Handler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f60801n;
        private long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final ArrayList f60802t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            this.f60802t = new ArrayList();
        }

        private final void J2(Messenger messenger) {
            try {
                if (this.f60801n) {
                    KN(messenger, aC.J2.n().t().rl());
                    return;
                }
                String strN = fuX.f60807n.n().n();
                Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
                if (strN != null) {
                    KN(messenger, strN);
                }
            } catch (IllegalStateException e2) {
                Log.w("SessionLifecycleService", "Failed to send session to client.", e2);
            }
        }

        private final void KN(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f60802t.remove(messenger);
            } catch (Exception e2) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e2);
            }
        }

        private final boolean O(long j2) {
            return j2 - this.rl > Duration.m1663getInWholeMillisecondsimpl(pu.Dsr.f72063t.n().rl());
        }

        private final void Uo() {
            try {
                aC.j jVar = aC.J2;
                jVar.n().n();
                Log.d("SessionLifecycleService", "Generated new session.");
                n();
                fuX.f60807n.n().rl(jVar.n().t().rl());
            } catch (IllegalStateException e2) {
                Log.w("SessionLifecycleService", "Failed to generate new session.", e2);
            }
        }

        private final void n() {
            Log.d("SessionLifecycleService", "Broadcasting new session");
            Dsr.f60793n.n().n(aC.J2.n().t());
            for (Messenger it : new ArrayList(this.f60802t)) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                J2(it);
            }
        }

        private final void nr(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.f60801n) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.f60801n = true;
                Uo();
            } else if (O(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                Uo();
            }
            this.rl = message.getWhen();
        }

        private final void rl(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.rl = message.getWhen();
        }

        private final void t(Message message) {
            this.f60802t.add(message.replyTo);
            Messenger messenger = message.replyTo;
            Intrinsics.checkNotNullExpressionValue(messenger, "msg.replyTo");
            J2(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f60802t.size());
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (this.rl > msg.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.rl + '.');
                return;
            }
            int i2 = msg.what;
            if (i2 == 1) {
                nr(msg);
                return;
            }
            if (i2 == 2) {
                rl(msg);
                return;
            }
            if (i2 == 4) {
                t(msg);
                return;
            }
            Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
            super.handleMessage(msg);
        }
    }

    private final Messenger n(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger messengerN = n(intent);
        if (messengerN != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messengerN;
            n nVar = this.messageHandler;
            if (nVar != null) {
                nVar.sendMessage(messageObtain);
            }
        }
        Messenger messenger = this.messenger;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.handlerThread.start();
        Looper looper = this.handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "handlerThread.looper");
        this.messageHandler = new n(looper);
        this.messenger = new Messenger(this.messageHandler);
        Log.d("SessionLifecycleService", "Service created on process " + Process.myPid());
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }
}
