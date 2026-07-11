package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import oK9.C;
import oK9.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new j();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f60663O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60664n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Timer f60665t;

    class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public PerfSession createFromParcel(Parcel parcel) {
            return new PerfSession(parcel, (j) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public PerfSession[] newArray(int i2) {
            return new PerfSession[i2];
        }

        j() {
        }
    }

    /* synthetic */ PerfSession(Parcel parcel, j jVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PerfSession(String str, O2.j jVar) {
        this.f60663O = false;
        this.f60664n = str;
        this.f60665t = jVar.n();
    }

    public static PerfSession t(String str) {
        PerfSession perfSession = new PerfSession(str.replace("-", ""), new O2.j());
        perfSession.xMQ(mUb());
        return perfSession;
    }

    public boolean J2() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f60665t.t()) > com.google.firebase.perf.config.j.Uo().g();
    }

    public String KN() {
        return this.f60664n;
    }

    public boolean O() {
        return this.f60663O;
    }

    public boolean Uo() {
        return this.f60663O;
    }

    public Timer nr() {
        return this.f60665t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f60664n);
        parcel.writeByte(this.f60663O ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f60665t, 0);
    }

    public void xMQ(boolean z2) {
        this.f60663O = z2;
    }

    public static boolean mUb() {
        com.google.firebase.perf.config.j jVarUo = com.google.firebase.perf.config.j.Uo();
        if (jVarUo.s7N() && Math.random() < jVarUo.fD()) {
            return true;
        }
        return false;
    }

    public static C[] rl(List list) {
        if (list.isEmpty()) {
            return null;
        }
        C[] cArr = new C[list.size()];
        C cN = ((PerfSession) list.get(0)).n();
        boolean z2 = false;
        for (int i2 = 1; i2 < list.size(); i2++) {
            C cN2 = ((PerfSession) list.get(i2)).n();
            if (!z2 && ((PerfSession) list.get(i2)).Uo()) {
                cArr[0] = cN2;
                cArr[i2] = cN;
                z2 = true;
            } else {
                cArr[i2] = cN2;
            }
        }
        if (!z2) {
            cArr[0] = cN;
        }
        return cArr;
    }

    public C n() {
        C.w6 w6VarMUb = C.HI().mUb(this.f60664n);
        if (this.f60663O) {
            w6VarMUb.xMQ(o.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (C) w6VarMUb.build();
    }

    private PerfSession(Parcel parcel) {
        this.f60663O = false;
        this.f60664n = parcel.readString();
        this.f60663O = parcel.readByte() != 0;
        this.f60665t = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
