package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new j();
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final int f59406O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f59407Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f59408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f59409o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f59410r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n f59411t;

    class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i2) {
            return new TimeModel[i2];
        }

        j() {
        }
    }

    public TimeModel(int i2, int i3, int i5, int i7) {
        this.J2 = i2;
        this.f59410r = i3;
        this.f59409o = i5;
        this.f59406O = i7;
        this.f59407Z = t(i2);
        this.f59408n = new n(59);
        this.f59411t = new n(i7 == 1 ? 23 : 12);
    }

    private static int t(int i2) {
        return i2 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.J2 == timeModel.J2 && this.f59410r == timeModel.f59410r && this.f59406O == timeModel.f59406O && this.f59409o == timeModel.f59409o;
    }

    public static String n(Resources resources, CharSequence charSequence) {
        return rl(resources, charSequence, "%02d");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f59406O), Integer.valueOf(this.J2), Integer.valueOf(this.f59410r), Integer.valueOf(this.f59409o)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.J2);
        parcel.writeInt(this.f59410r);
        parcel.writeInt(this.f59409o);
        parcel.writeInt(this.f59406O);
    }

    public static String rl(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
