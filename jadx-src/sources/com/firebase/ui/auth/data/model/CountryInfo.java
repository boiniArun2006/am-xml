package com.firebase.ui.auth.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.text.Collator;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public final class CountryInfo implements Comparable<CountryInfo>, Parcelable {
    public static final Parcelable.Creator<CountryInfo> CREATOR = new Parcelable.Creator<CountryInfo>() { // from class: com.firebase.ui.auth.data.model.CountryInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CountryInfo createFromParcel(Parcel parcel) {
            return new CountryInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CountryInfo[] newArray(int i2) {
            return new CountryInfo[i2];
        }
    };
    private final Collator mCollator;
    private final int mCountryCode;
    private final Locale mLocale;

    public CountryInfo(Locale locale, int i2) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        this.mCollator = collator;
        collator.setStrength(0);
        this.mLocale = locale;
        this.mCountryCode = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        Locale locale;
        if (this == obj) {
            return true;
        }
        if (obj != null && CountryInfo.class == obj.getClass()) {
            CountryInfo countryInfo = (CountryInfo) obj;
            if (this.mCountryCode == countryInfo.mCountryCode && ((locale = this.mLocale) == null ? countryInfo.mLocale == null : locale.equals(countryInfo.mLocale))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(CountryInfo countryInfo) {
        Locale locale = Locale.getDefault();
        return this.mCollator.compare(this.mLocale.getDisplayCountry().toUpperCase(locale), countryInfo.mLocale.getDisplayCountry().toUpperCase(locale));
    }

    public int getCountryCode() {
        return this.mCountryCode;
    }

    public Locale getLocale() {
        return this.mLocale;
    }

    public int hashCode() {
        Locale locale = this.mLocale;
        return ((locale != null ? locale.hashCode() : 0) * 31) + this.mCountryCode;
    }

    public String toShortString() {
        return localeToEmoji(this.mLocale) + " +" + this.mCountryCode;
    }

    public String toString() {
        return localeToEmoji(this.mLocale) + " " + this.mLocale.getDisplayCountry() + " +" + this.mCountryCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeSerializable(this.mLocale);
        parcel.writeInt(this.mCountryCode);
    }

    public static String localeToEmoji(Locale locale) {
        String country = locale.getCountry();
        return new String(Character.toChars(Character.codePointAt(country, 0) - (-127397))) + new String(Character.toChars(Character.codePointAt(country, 1) - (-127397)));
    }

    protected CountryInfo(Parcel parcel) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        this.mCollator = collator;
        collator.setStrength(0);
        this.mLocale = (Locale) parcel.readSerializable();
        this.mCountryCode = parcel.readInt();
    }
}
