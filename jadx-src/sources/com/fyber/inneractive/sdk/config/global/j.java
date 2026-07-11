package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53371b;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    @Override // com.fyber.inneractive.sdk.config.global.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(e eVar) {
        boolean z2;
        boolean z3;
        if (!TextUtils.isEmpty(this.f53370a)) {
            String version = InneractiveAdManager.getVersion();
            IAlog.a("%s: shouldApply - running version: %s", "j", version);
            IAlog.a("%s: shouldApply - filter version: %s", "j", this.f53370a);
            String[] strArrSplit = version.split("\\.", 4);
            String[] strArrSplit2 = this.f53370a.split("\\.", 4);
            String str = strArrSplit2[strArrSplit2.length - 1];
            if (str.equals("*")) {
                for (int i2 = 0; i2 < strArrSplit2.length - 1; i2++) {
                    if (strArrSplit.length < i2) {
                        IAlog.a("%s: shouldApplyByAsterix - running version is shorter than filter. applying", "j");
                    } else if (!strArrSplit[i2].equals(strArrSplit2[i2])) {
                        IAlog.a("%s: shouldApplyByAsterix - running version does not comply with filter. applying", "j");
                    }
                    z3 = true;
                }
                IAlog.a("%s: shouldApplyByAsterix - version aligned with filter. do not apply", "j");
                z3 = false;
                IAlog.a("%s: shouldApply - * version match: %b", "j", Boolean.valueOf(!z3));
                return z3 ? this.f53371b : !this.f53371b;
            }
            if (str.equals("+")) {
                int i3 = 0;
                while (true) {
                    if (i3 >= strArrSplit2.length - 1) {
                        IAlog.a("%s: shouldApplyByAsterix - version aligned with filter. do not apply", "j");
                        break;
                    }
                    if (strArrSplit.length < i3) {
                        IAlog.a("%s: shouldApplyByPlus - running version is shorter than filter. applying", "j");
                        break;
                    }
                    try {
                        int iIntValue = Integer.valueOf(strArrSplit2[i3]).intValue();
                        int iIntValue2 = Integer.valueOf(strArrSplit[i3]).intValue();
                        if (iIntValue2 > iIntValue) {
                            IAlog.a("%s: shouldApplyByPlus - running version is greater than the filter's version. no filter needed", "j");
                            break;
                        }
                        if (iIntValue2 < iIntValue) {
                            IAlog.a("%s: shouldApplyByPlus - running version is lower than the filter's version. applying filter ", "j");
                            break;
                        }
                        i3++;
                    } catch (NumberFormatException e2) {
                        IAlog.a("%s: shouldApplyByPlus - Error in version string! Not a number. %s", "j", e2.getMessage());
                    }
                }
                z2 = false;
                IAlog.a("%s: shouldApply - + version match: %b", "j", Boolean.valueOf(!z2));
                return !z2 ? this.f53371b : !this.f53371b;
            }
            boolean zEqualsIgnoreCase = this.f53370a.equalsIgnoreCase(version);
            IAlog.a("%s: shouldApply - exact version match: %b", "j", Boolean.valueOf(zEqualsIgnoreCase));
            if (!zEqualsIgnoreCase) {
                return this.f53371b;
            }
            if (!this.f53371b) {
                return true;
            }
        }
        return false;
        z2 = true;
        IAlog.a("%s: shouldApply - + version match: %b", "j", Boolean.valueOf(!z2));
        if (!z2) {
        }
    }

    public final String toString() {
        return "sdk - " + this.f53370a + " include: " + this.f53371b;
    }

    public j(boolean z2, String str) {
        this.f53370a = str;
        this.f53371b = z2;
    }
}
