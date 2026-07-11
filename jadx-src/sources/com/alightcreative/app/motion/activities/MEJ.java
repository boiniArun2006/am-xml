package com.alightcreative.app.motion.activities;

import com.alightcreative.account.LicenseInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class MEJ extends Ct {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LicenseInfo f44635n;

    public /* synthetic */ MEJ(LicenseInfo licenseInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : licenseInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MEJ) && Intrinsics.areEqual(this.f44635n, ((MEJ) obj).f44635n);
    }

    public int hashCode() {
        LicenseInfo licenseInfo = this.f44635n;
        if (licenseInfo == null) {
            return 0;
        }
        return licenseInfo.hashCode();
    }

    public String toString() {
        return "LicenseCard(activeLicense=" + this.f44635n + ")";
    }

    public MEJ(LicenseInfo licenseInfo) {
        super(null);
        this.f44635n = licenseInfo;
    }

    public final LicenseInfo n() {
        return this.f44635n;
    }
}
