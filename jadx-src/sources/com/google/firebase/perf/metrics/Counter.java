package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60639n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicLong f60640t;

    class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Counter[] newArray(int i2) {
            return new Counter[i2];
        }

        j() {
        }
    }

    /* synthetic */ Counter(Parcel parcel, j jVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Counter(String str) {
        this.f60639n = str;
        this.f60640t = new AtomicLong(0L);
    }

    long n() {
        return this.f60640t.get();
    }

    void nr(long j2) {
        this.f60640t.set(j2);
    }

    String rl() {
        return this.f60639n;
    }

    public void t(long j2) {
        this.f60640t.addAndGet(j2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f60639n);
        parcel.writeLong(this.f60640t.get());
    }

    private Counter(Parcel parcel) {
        this.f60639n = parcel.readString();
        this.f60640t = new AtomicLong(parcel.readLong());
    }
}
