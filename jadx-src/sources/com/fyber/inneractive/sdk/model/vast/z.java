package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class z implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer[] f54189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54190b;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(z zVar) {
        if (zVar == null) {
            return 1;
        }
        int iMax = Math.max(this.f54189a.length, zVar.f54189a.length);
        int i2 = 0;
        while (i2 < iMax) {
            Integer[] numArr = this.f54189a;
            int iIntValue = numArr.length > i2 ? numArr[i2].intValue() : 0;
            Integer[] numArr2 = zVar.f54189a;
            int iIntValue2 = numArr2.length > i2 ? numArr2[i2].intValue() : 0;
            if (iIntValue > iIntValue2) {
                return 1;
            }
            if (iIntValue2 > iIntValue) {
                return -1;
            }
            i2++;
        }
        return 0;
    }

    public final String toString() {
        return this.f54190b;
    }

    public z(String str) throws y {
        this.f54189a = new Integer[0];
        if (!TextUtils.isEmpty(str) && str.matches("^[0-9.]+$")) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : str.split("\\.")) {
                arrayList.add(Integer.valueOf(com.fyber.inneractive.sdk.util.v.a(str2, 0)));
            }
            this.f54189a = (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
            this.f54190b = str;
            return;
        }
        throw new y();
    }
}
