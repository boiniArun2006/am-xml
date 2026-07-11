package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f60690n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f60691t;

    class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel, (j) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Timer[] newArray(int i2) {
            return new Timer[i2];
        }

        j() {
        }
    }

    /* synthetic */ Timer(Parcel parcel, j jVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Timer() {
        this(KN(), n());
    }

    public static Timer J2(long j2) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j2);
        return new Timer(KN() + (micros - n()), micros);
    }

    private static long KN() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    private static long n() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public long O() {
        return this.f60690n;
    }

    public long nr(Timer timer) {
        return timer.f60691t - this.f60691t;
    }

    public long rl() {
        return this.f60690n + t();
    }

    public long t() {
        return nr(new Timer());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f60690n);
        parcel.writeLong(this.f60691t);
    }

    Timer(long j2, long j3) {
        this.f60690n = j2;
        this.f60691t = j3;
    }

    public void Uo() {
        this.f60690n = KN();
        this.f60691t = n();
    }

    private Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
