package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import iWe.I28;
import jMi.C;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Trace extends com.google.firebase.perf.application.n implements Parcelable, Avf.j {
    private final O2.j E2;
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final GaugeManager f60644O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final List f60645S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private Timer f60646X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final List f60647Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f60648e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C f60649g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WeakReference f60650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f60651o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map f60652r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Trace f60653t;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final yMa.j f60642T = yMa.j.O();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final Map f60641N = new ConcurrentHashMap();

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new j();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final Parcelable.Creator f60643v = new n();

    class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i2) {
            return new Trace[i2];
        }

        j() {
        }
    }

    class n implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i2) {
            return new Trace[i2];
        }

        n() {
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z2, j jVar) {
        this(parcel, z2);
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    private Trace(String str) {
        this(str, C.gh(), new O2.j(), com.google.firebase.perf.application.j.rl(), GaugeManager.getInstance());
    }

    private Counter az(String str) {
        Counter counter = (Counter) this.f60652r.get(str);
        if (counter != null) {
            return counter;
        }
        Counter counter2 = new Counter(str);
        this.f60652r.put(str, counter2);
        return counter2;
    }

    public static Trace t(String str) {
        return new Trace(str);
    }

    private void ty(Timer timer) {
        if (this.f60645S.isEmpty()) {
            return;
        }
        Trace trace = (Trace) this.f60645S.get(this.f60645S.size() - 1);
        if (trace.f60646X == null) {
            trace.f60646X = timer;
        }
    }

    public String J2() {
        return this.J2;
    }

    Timer KN() {
        return this.f60648e;
    }

    Timer O() {
        return this.f60646X;
    }

    List Uo() {
        List listUnmodifiableList;
        synchronized (this.f60647Z) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f60647Z) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return listUnmodifiableList;
    }

    @Nullable
    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.f60651o.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f60651o);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        Counter counter = str != null ? (Counter) this.f60652r.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.n();
    }

    boolean mUb() {
        return this.f60648e != null;
    }

    @Override // Avf.j
    public void n(PerfSession perfSession) {
        if (perfSession == null) {
            f60642T.mUb("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (!mUb() || qie()) {
                return;
            }
            this.f60647Z.add(perfSession);
        }
    }

    Map nr() {
        return this.f60652r;
    }

    boolean qie() {
        return this.f60646X != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeParcelable(this.f60653t, 0);
        parcel.writeString(this.J2);
        parcel.writeList(this.f60645S);
        parcel.writeMap(this.f60652r);
        parcel.writeParcelable(this.f60648e, 0);
        parcel.writeParcelable(this.f60646X, 0);
        synchronized (this.f60647Z) {
            parcel.writeList(this.f60647Z);
        }
    }

    List xMQ() {
        return this.f60645S;
    }

    private void rl(String str, String str2) {
        if (!qie()) {
            if (!this.f60651o.containsKey(str) && this.f60651o.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            I28.nr(str, str2);
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.J2));
    }

    protected void finalize() throws Throwable {
        try {
            if (gh()) {
                f60642T.gh("Trace '%s' is started but not stopped when it is destructed!", this.J2);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    boolean gh() {
        if (mUb() && !qie()) {
            return true;
        }
        return false;
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j2) {
        String strO = I28.O(str);
        if (strO != null) {
            f60642T.nr("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strO);
            return;
        }
        if (!mUb()) {
            f60642T.gh("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.J2);
        } else {
            if (qie()) {
                f60642T.gh("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.J2);
                return;
            }
            Counter counterAz = az(str.trim());
            counterAz.t(j2);
            f60642T.rl("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(counterAz.n()), this.J2);
        }
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z2;
        try {
            str = str.trim();
            str2 = str2.trim();
            rl(str, str2);
            f60642T.rl("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.J2);
            z2 = true;
        } catch (Exception e2) {
            f60642T.nr("Can not set attribute '%s' with value '%s' (%s)", str, str2, e2.getMessage());
            z2 = false;
        }
        if (z2) {
            this.f60651o.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j2) {
        String strO = I28.O(str);
        if (strO != null) {
            f60642T.nr("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strO);
            return;
        }
        if (!mUb()) {
            f60642T.gh("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.J2);
        } else if (qie()) {
            f60642T.gh("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.J2);
        } else {
            az(str.trim()).nr(j2);
            f60642T.rl("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j2), this.J2);
        }
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (qie()) {
            f60642T.t("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f60651o.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.j.Uo().s7N()) {
            f60642T.n("Trace feature is disabled.");
            return;
        }
        String strJ2 = I28.J2(this.J2);
        if (strJ2 != null) {
            f60642T.nr("Cannot start trace '%s'. Trace name is invalid.(%s)", this.J2, strJ2);
            return;
        }
        if (this.f60648e != null) {
            f60642T.nr("Trace '%s' has already started, should not start again!", this.J2);
            return;
        }
        this.f60648e = this.E2.n();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f60650n);
        n(perfSession);
        if (perfSession.O()) {
            this.f60644O.collectGaugeMetricOnce(perfSession.nr());
        }
    }

    @Keep
    public void stop() {
        if (!mUb()) {
            f60642T.nr("Trace '%s' has not been started so unable to stop!", this.J2);
            return;
        }
        if (qie()) {
            f60642T.nr("Trace '%s' has already stopped, should not stop again!", this.J2);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f60650n);
        unregisterForAppState();
        Timer timerN = this.E2.n();
        this.f60646X = timerN;
        if (this.f60653t == null) {
            ty(timerN);
            if (!this.J2.isEmpty()) {
                this.f60649g.aYN(new com.google.firebase.perf.metrics.j(this).n(), getAppState());
                if (SessionManager.getInstance().perfSession().O()) {
                    this.f60644O.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().nr());
                    return;
                }
                return;
            }
            f60642T.t("Trace name is empty, no log is sent to server");
        }
    }

    public Trace(String str, C c2, O2.j jVar, com.google.firebase.perf.application.j jVar2) {
        this(str, c2, jVar, jVar2, GaugeManager.getInstance());
    }

    public Trace(String str, C c2, O2.j jVar, com.google.firebase.perf.application.j jVar2, GaugeManager gaugeManager) {
        super(jVar2);
        this.f60650n = new WeakReference(this);
        this.f60653t = null;
        this.J2 = str.trim();
        this.f60645S = new ArrayList();
        this.f60652r = new ConcurrentHashMap();
        this.f60651o = new ConcurrentHashMap();
        this.E2 = jVar;
        this.f60649g = c2;
        this.f60647Z = Collections.synchronizedList(new ArrayList());
        this.f60644O = gaugeManager;
    }

    private Trace(Parcel parcel, boolean z2) {
        super(z2 ? null : com.google.firebase.perf.application.j.rl());
        this.f60650n = new WeakReference(this);
        this.f60653t = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.J2 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f60645S = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f60652r = concurrentHashMap;
        this.f60651o = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f60648e = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f60646X = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f60647Z = listSynchronizedList;
        parcel.readList(listSynchronizedList, PerfSession.class.getClassLoader());
        if (z2) {
            this.f60649g = null;
            this.E2 = null;
            this.f60644O = null;
        } else {
            this.f60649g = C.gh();
            this.E2 = new O2.j();
            this.f60644O = GaugeManager.getInstance();
        }
    }
}
