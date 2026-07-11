package com.fyber.inneractive.sdk.flow.vast;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f53951b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        com.fyber.inneractive.sdk.model.vast.c cVar = (com.fyber.inneractive.sdk.model.vast.c) obj;
        com.fyber.inneractive.sdk.model.vast.c cVar2 = (com.fyber.inneractive.sdk.model.vast.c) obj2;
        int iA = v.a(cVar.f54126h, cVar2.f54126h);
        if (iA != 0) {
            return iA;
        }
        com.fyber.inneractive.sdk.model.vast.i iVar = cVar.f54119a;
        com.fyber.inneractive.sdk.model.vast.i iVar2 = com.fyber.inneractive.sdk.model.vast.i.Html;
        int i2 = Integer.MAX_VALUE;
        int i3 = iVar == iVar2 ? 1 : iVar == com.fyber.inneractive.sdk.model.vast.i.Iframe ? 2 : iVar == com.fyber.inneractive.sdk.model.vast.i.Static ? 3 : Integer.MAX_VALUE;
        com.fyber.inneractive.sdk.model.vast.i iVar3 = cVar2.f54119a;
        if (iVar3 == iVar2) {
            i2 = 1;
        } else if (iVar3 == com.fyber.inneractive.sdk.model.vast.i.Iframe) {
            i2 = 2;
        } else if (iVar3 == com.fyber.inneractive.sdk.model.vast.i.Static) {
            i2 = 3;
        }
        int iA2 = v.a(i3, i2);
        if (iA2 != 0) {
            return iA2;
        }
        int iCompare = Float.compare(Math.abs((cVar.f54121c / cVar.f54122d) - this.f53951b), Math.abs((cVar2.f54121c / cVar2.f54122d) - this.f53951b));
        if (iCompare != 0) {
            return iCompare;
        }
        return v.a(Math.abs((cVar.f54121c * cVar.f54122d) - this.f53950a), Math.abs((cVar2.f54121c * cVar2.f54122d) - this.f53950a));
    }

    public d(int i2, int i3) {
        int i5 = i2 * i3;
        this.f53950a = i5;
        float f3 = i2 / i3;
        this.f53951b = f3;
        IAlog.a("IACompanionAdsPriorityComparator: screenWidth = %s, screenHeight = %s, mMaxArea = %s, mAspectRatio = %s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i5), Float.valueOf(f3));
        IAlog.d("IACompanionAdsPriorityComparator: screenWidth = %s, screenHeight = %s, mMaxArea = %s, mAspectRatio = %s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i5), Float.valueOf(f3));
    }
}
