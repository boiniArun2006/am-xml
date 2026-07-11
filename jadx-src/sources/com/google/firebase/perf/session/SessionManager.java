package com.google.firebase.perf.session;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.application.j;
import com.google.firebase.perf.application.n;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import oK9.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Keep
public class SessionManager extends n {
    private static final SessionManager instance = new SessionManager();
    private final j appStateMonitor;
    private final Set<WeakReference<Avf.j>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.t(UUID.randomUUID().toString()), j.rl());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    private void logGaugeMetadataIfCollectionEnabled(Ml ml) {
        if (this.perfSession.O()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.KN(), ml);
        }
    }

    public static /* synthetic */ void rl(SessionManager sessionManager, Context context, PerfSession perfSession) {
        sessionManager.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.O()) {
            sessionManager.gaugeManager.logGaugeMetadata(perfSession.KN(), Ml.FOREGROUND);
        }
    }

    private void startOrStopCollectingGauges(Ml ml) {
        if (this.perfSession.O()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, ml);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @VisibleForTesting
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        Ml ml = Ml.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(ml);
        startOrStopCollectingGauges(ml);
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<Avf.j> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final PerfSession perfSession = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: Avf.n
            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.rl(this.f134n, context, perfSession);
            }
        });
    }

    @VisibleForTesting
    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.J2()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<Avf.j> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    @Override // com.google.firebase.perf.application.n, com.google.firebase.perf.application.j.n
    public void onUpdateAppState(Ml ml) {
        super.onUpdateAppState(ml);
        if (this.appStateMonitor.J2()) {
            return;
        }
        if (ml == Ml.FOREGROUND) {
            updatePerfSession(PerfSession.t(UUID.randomUUID().toString()));
        } else if (this.perfSession.J2()) {
            updatePerfSession(PerfSession.t(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(ml);
        }
    }

    public void updatePerfSession(PerfSession perfSession) {
        if (perfSession.KN() == this.perfSession.KN()) {
            return;
        }
        this.perfSession = perfSession;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<Avf.j>> it = this.clients.iterator();
                while (it.hasNext()) {
                    Avf.j jVar = it.next().get();
                    if (jVar != null) {
                        jVar.n(perfSession);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.n());
        startOrStopCollectingGauges(this.appStateMonitor.n());
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, j jVar) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = jVar;
        registerForAppState();
    }
}
