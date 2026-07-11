package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Wre {
    private static final Map HI = new HashMap();
    private final Intent KN;
    private boolean Uo;
    private ServiceConnection az;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f59571n;
    private final DAz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f59572t;
    private IInterface ty;
    private final rv6 xMQ;
    private final List nr = new ArrayList();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Set f59570O = new HashSet();
    private final Object J2 = new Object();
    private final IBinder.DeathRecipient gh = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.qf
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            Wre.gh(this.f59585n);
        }
    };
    private final AtomicInteger qie = new AtomicInteger(0);
    private final WeakReference mUb = new WeakReference(null);

    public final IInterface O() {
        return this.ty;
    }

    static /* bridge */ /* synthetic */ void HI(final Wre wre, final TaskCompletionSource taskCompletionSource) {
        wre.f59570O.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.Ln
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f59568n.XQ(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void Ik(Wre wre, u uVar) {
        if (wre.ty != null || wre.Uo) {
            if (!wre.Uo) {
                uVar.run();
                return;
            } else {
                wre.rl.nr("Waiting to bind to the service.", new Object[0]);
                wre.nr.add(uVar);
                return;
            }
        }
        wre.rl.nr("Initiate binding to the service.", new Object[0]);
        wre.nr.add(uVar);
        I28 i28 = new I28(wre, null);
        wre.az = i28;
        wre.Uo = true;
        if (wre.f59571n.bindService(wre.KN, i28, 1)) {
            return;
        }
        wre.rl.nr("Failed to bind to the service.", new Object[0]);
        wre.Uo = false;
        Iterator it = wre.nr.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(new af());
        }
        wre.nr.clear();
    }

    private final RemoteException WPU() {
        return new RemoteException(String.valueOf(this.f59572t).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aYN() {
        Iterator it = this.f59570O.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(WPU());
        }
        this.f59570O.clear();
    }

    public static /* synthetic */ void gh(Wre wre) {
        wre.rl.nr("reportBinderDeath", new Object[0]);
        android.support.v4.media.j.n(wre.mUb.get());
        wre.rl.nr("%s : Binder has died.", wre.f59572t);
        Iterator it = wre.nr.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(wre.WPU());
        }
        wre.nr.clear();
        synchronized (wre.J2) {
            wre.aYN();
        }
    }

    static /* bridge */ /* synthetic */ void o(Wre wre) {
        wre.rl.nr("unlinkToDeath", new Object[0]);
        wre.ty.asBinder().unlinkToDeath(wre.gh, 0);
    }

    static /* bridge */ /* synthetic */ void r(Wre wre) {
        wre.rl.nr("linkToDeath", new Object[0]);
        try {
            wre.ty.asBinder().linkToDeath(wre.gh, 0);
        } catch (RemoteException e2) {
            wre.rl.t(e2, "linkToDeath failed", new Object[0]);
        }
    }

    public final void S(TaskCompletionSource taskCompletionSource) {
        synchronized (this.J2) {
            this.f59570O.remove(taskCompletionSource);
        }
        t().post(new iwV(this));
    }

    final /* synthetic */ void XQ(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.J2) {
            this.f59570O.remove(taskCompletionSource);
        }
    }

    public final void Z(u uVar, TaskCompletionSource taskCompletionSource) {
        t().post(new lej(this, uVar.c(), taskCompletionSource, uVar));
    }

    public final Handler t() {
        Handler handler;
        Map map = HI;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f59572t)) {
                    HandlerThread handlerThread = new HandlerThread(this.f59572t, 10);
                    handlerThread.start();
                    map.put(this.f59572t, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f59572t);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public Wre(Context context, DAz dAz, String str, Intent intent, rv6 rv6Var, M m2) {
        this.f59571n = context;
        this.rl = dAz;
        this.f59572t = str;
        this.KN = intent;
        this.xMQ = rv6Var;
    }
}
