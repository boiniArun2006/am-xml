package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class InneractiveUserConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53535a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Gender f53536b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f53537c = null;

    public enum Gender {
        MALE,
        FEMALE
    }

    public static boolean ageIsValid(int i2) {
        return i2 >= 1 && i2 <= 120;
    }

    public int getAge() {
        return this.f53535a;
    }

    public Gender getGender() {
        return this.f53536b;
    }

    @Deprecated
    public String getZipCode() {
        return this.f53537c;
    }

    public InneractiveUserConfig setGender(Gender gender) {
        if (gender != null) {
            this.f53536b = gender;
            return this;
        }
        IAlog.f("The gender is invalid. Please use one of the suggested InneractiveAdView.Gender", new Object[0]);
        return this;
    }

    @Deprecated
    public InneractiveUserConfig setZipCode(String str) {
        if (str == null || !Pattern.compile("(^\\d{5}$)|(^\\d{5}-\\d{4}$)").matcher(str).matches()) {
            IAlog.c("The zipcode format is invalid. Please use a valid value.", new Object[0]);
            return this;
        }
        this.f53537c = str;
        return this;
    }

    @Deprecated
    public InneractiveUserConfig setAge(int i2) {
        if (ageIsValid(i2)) {
            this.f53535a = i2;
            return this;
        }
        IAlog.f("The Age is invalid. Please use a number between 1 and 120", new Object[0]);
        return this;
    }
}
