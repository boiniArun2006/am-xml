package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.t;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53956c;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        int i2 = -1;
        if (!TextUtils.equals("VPAID", rVar2.f54173f)) {
            if (!TextUtils.equals("VPAID", rVar.f54173f)) {
                Integer num = rVar.f54172e;
                int iIntValue = num == null ? 0 : num.intValue();
                Integer num2 = rVar2.f54172e;
                int iIntValue2 = num2 == null ? 0 : num2.intValue();
                int i3 = this.f53954a;
                if (iIntValue2 <= i3 || iIntValue > i3) {
                    if (iIntValue <= i3 || iIntValue2 > i3) {
                        t tVarA = t.a(rVar2.f54171d);
                        t tVar = t.MEDIA_TYPE_MP4;
                        Integer num3 = tVarA == tVar ? 3 : tVarA == t.MEDIA_TYPE_3GPP ? 2 : tVarA == t.MEDIA_TYPE_WEBM ? 1 : -1;
                        t tVarA2 = t.a(rVar.f54171d);
                        if (tVarA2 == tVar) {
                            i2 = 3;
                        } else if (tVarA2 == t.MEDIA_TYPE_3GPP) {
                            i2 = 2;
                        } else if (tVarA2 == t.MEDIA_TYPE_WEBM) {
                            i2 = 1;
                        }
                        int iCompareTo = num3.compareTo(i2);
                        if (iCompareTo != 0) {
                            return iCompareTo;
                        }
                        if (iIntValue >= iIntValue2) {
                            if (iIntValue <= iIntValue2) {
                                Integer num4 = rVar.f54169b;
                                int iIntValue3 = num4 == null ? 0 : num4.intValue();
                                Integer num5 = rVar.f54170c;
                                int iIntValue4 = num5 == null ? 0 : num5.intValue();
                                Integer num6 = rVar2.f54169b;
                                int iIntValue5 = num6 == null ? 0 : num6.intValue();
                                Integer num7 = rVar2.f54170c;
                                int i5 = iIntValue3 * iIntValue4;
                                int iIntValue6 = iIntValue5 * (num7 == null ? 0 : num7.intValue());
                                int i7 = this.f53955b * this.f53956c;
                                int iAbs = Math.abs(i5 - i7);
                                int iAbs2 = Math.abs(iIntValue6 - i7);
                                if (iAbs >= iAbs2) {
                                    if (iAbs <= iAbs2) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public g(int i2, int i3, int i5) {
        this.f53954a = i2;
        this.f53955b = i3;
        this.f53956c = i5;
    }
}
