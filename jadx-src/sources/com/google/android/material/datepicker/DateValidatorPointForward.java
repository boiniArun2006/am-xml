package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f58887n;

    class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward[] newArray(int i2) {
            return new DateValidatorPointForward[i2];
        }

        j() {
        }
    }

    /* synthetic */ DateValidatorPointForward(long j2, j jVar) {
        this(j2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f58887n == ((DateValidatorPointForward) obj).f58887n;
    }

    private DateValidatorPointForward(long j2) {
        this.f58887n = j2;
    }

    public static DateValidatorPointForward n(long j2) {
        return new DateValidatorPointForward(j2);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean T(long j2) {
        return j2 >= this.f58887n;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f58887n)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f58887n);
    }
}
