package com.firebase.ui.auth.data.model;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public final class PhoneNumber {
    private static final PhoneNumber EMPTY_PHONE_NUMBER = new PhoneNumber("", "", "");
    private final String mCountryCode;
    private final String mCountryIso;
    private final String mPhoneNumber;

    public static boolean isCountryValid(PhoneNumber phoneNumber) {
        return (phoneNumber == null || EMPTY_PHONE_NUMBER.equals(phoneNumber) || TextUtils.isEmpty(phoneNumber.getCountryCode()) || TextUtils.isEmpty(phoneNumber.getCountryIso())) ? false : true;
    }

    public static boolean isValid(PhoneNumber phoneNumber) {
        return (phoneNumber == null || EMPTY_PHONE_NUMBER.equals(phoneNumber) || TextUtils.isEmpty(phoneNumber.getPhoneNumber()) || TextUtils.isEmpty(phoneNumber.getCountryCode()) || TextUtils.isEmpty(phoneNumber.getCountryIso())) ? false : true;
    }

    public String getCountryCode() {
        return this.mCountryCode;
    }

    public String getCountryIso() {
        return this.mCountryIso;
    }

    public String getPhoneNumber() {
        return this.mPhoneNumber;
    }

    public PhoneNumber(String str, String str2, String str3) {
        this.mPhoneNumber = str;
        this.mCountryIso = str2;
        this.mCountryCode = str3;
    }
}
