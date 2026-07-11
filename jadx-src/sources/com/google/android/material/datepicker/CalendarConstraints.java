package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.ObjectsCompat;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new j();
    private Month J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final DateValidator f58878O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final int f58879Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Month f58880n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f58881o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f58882r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Month f58883t;

    public interface DateValidator extends Parcelable {
        boolean T(long j2);
    }

    class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i2) {
            return new CalendarConstraints[i2];
        }

        j() {
        }
    }

    public static final class n {
        static final long J2 = Xo.n(Month.rl(1900, 0).f58929o);
        static final long Uo = Xo.n(Month.rl(AdError.BROKEN_MEDIA_ERROR_CODE, 11).f58929o);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private DateValidator f58884O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f58885n;
        private int nr;
        private long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Long f58886t;

        public CalendarConstraints n() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f58884O);
            Month monthT = Month.t(this.f58885n);
            Month monthT2 = Month.t(this.rl);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l2 = this.f58886t;
            return new CalendarConstraints(monthT, monthT2, dateValidator, l2 == null ? null : Month.t(l2.longValue()), this.nr, null);
        }

        n(CalendarConstraints calendarConstraints) {
            this.f58885n = J2;
            this.rl = Uo;
            this.f58884O = DateValidatorPointForward.n(Long.MIN_VALUE);
            this.f58885n = calendarConstraints.f58880n.f58929o;
            this.rl = calendarConstraints.f58883t.f58929o;
            this.f58886t = Long.valueOf(calendarConstraints.J2.f58929o);
            this.nr = calendarConstraints.f58882r;
            this.f58884O = calendarConstraints.f58878O;
        }

        public n rl(long j2) {
            this.f58886t = Long.valueOf(j2);
            return this;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i2, j jVar) {
        this(month, month2, dateValidator, month3, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f58880n.equals(calendarConstraints.f58880n) && this.f58883t.equals(calendarConstraints.f58883t) && ObjectsCompat.n(this.J2, calendarConstraints.J2) && this.f58882r == calendarConstraints.f58882r && this.f58878O.equals(calendarConstraints.f58878O);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i2) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f58880n = month;
        this.f58883t = month2;
        this.J2 = month3;
        this.f58882r = i2;
        this.f58878O = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i2 < 0 || i2 > Xo.xMQ().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f58879Z = month.qie(month2) + 1;
        this.f58881o = (month2.f58926O - month.f58926O) + 1;
    }

    public DateValidator J2() {
        return this.f58878O;
    }

    int KN() {
        return this.f58882r;
    }

    Month Uo() {
        return this.f58883t;
    }

    Month gh() {
        return this.f58880n;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f58880n, this.f58883t, this.J2, Integer.valueOf(this.f58882r), this.f58878O});
    }

    Month mUb() {
        return this.J2;
    }

    int qie() {
        return this.f58881o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f58880n, 0);
        parcel.writeParcelable(this.f58883t, 0);
        parcel.writeParcelable(this.J2, 0);
        parcel.writeParcelable(this.f58878O, 0);
        parcel.writeInt(this.f58882r);
    }

    int xMQ() {
        return this.f58879Z;
    }
}
