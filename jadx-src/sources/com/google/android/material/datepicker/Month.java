package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new j();
    final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final int f58926O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private String f58927Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Calendar f58928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final long f58929o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f58930r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final int f58931t;

    class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i2) {
            return new Month[i2];
        }

        j() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.rl(parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f58931t == month.f58931t && this.f58926O == month.f58926O;
    }

    static Month nr() {
        return new Month(Xo.Uo());
    }

    int J2(int i2) {
        int i3 = this.f58928n.get(7);
        if (i2 <= 0) {
            i2 = this.f58928n.getFirstDayOfWeek();
        }
        int i5 = i3 - i2;
        return i5 < 0 ? i5 + this.J2 : i5;
    }

    int KN(long j2) {
        Calendar calendarT = Xo.t(this.f58928n);
        calendarT.setTimeInMillis(j2);
        return calendarT.get(5);
    }

    long Uo(int i2) {
        Calendar calendarT = Xo.t(this.f58928n);
        calendarT.set(5, i2);
        return calendarT.getTimeInMillis();
    }

    Month gh(int i2) {
        Calendar calendarT = Xo.t(this.f58928n);
        calendarT.add(2, i2);
        return new Month(calendarT);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f58931t), Integer.valueOf(this.f58926O)});
    }

    long mUb() {
        return this.f58928n.getTimeInMillis();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f58928n.compareTo(month.f58928n);
    }

    int qie(Month month) {
        if (this.f58928n instanceof GregorianCalendar) {
            return ((month.f58926O - this.f58926O) * 12) + (month.f58931t - this.f58931t);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f58926O);
        parcel.writeInt(this.f58931t);
    }

    String xMQ() {
        if (this.f58927Z == null) {
            this.f58927Z = w6.J2(this.f58928n.getTimeInMillis());
        }
        return this.f58927Z;
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarT = Xo.t(calendar);
        this.f58928n = calendarT;
        this.f58931t = calendarT.get(2);
        this.f58926O = calendarT.get(1);
        this.J2 = calendarT.getMaximum(7);
        this.f58930r = calendarT.getActualMaximum(5);
        this.f58929o = calendarT.getTimeInMillis();
    }

    static Month rl(int i2, int i3) {
        Calendar calendarXMQ = Xo.xMQ();
        calendarXMQ.set(1, i2);
        calendarXMQ.set(2, i3);
        return new Month(calendarXMQ);
    }

    static Month t(long j2) {
        Calendar calendarXMQ = Xo.xMQ();
        calendarXMQ.setTimeInMillis(j2);
        return new Month(calendarXMQ);
    }
}
