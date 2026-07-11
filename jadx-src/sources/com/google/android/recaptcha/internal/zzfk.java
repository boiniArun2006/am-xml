package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzfk {
    private final List zza;

    public zzfk() {
        this(true);
    }

    public zzfk(boolean z2) {
        this.zza = zzf(CollectionsKt.listOf((Object[]) new String[]{"www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"}));
    }

    private final boolean zzd(String str) {
        List list = this.zza;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (StringsKt.startsWith$default(str, (String) it.next(), false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private static final List zzf(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(d.f62220u + ((String) it.next()) + "/");
        }
        return arrayList;
    }

    public static final boolean zzc(Uri uri) {
        return zze(uri);
    }

    private static final boolean zze(Uri uri) {
        if (!TextUtils.isEmpty(uri.toString()) && Intrinsics.areEqual("https", uri.getScheme()) && !TextUtils.isEmpty(uri.getHost())) {
            return true;
        }
        return false;
    }

    public final boolean zza(Uri uri) {
        if (zze(uri) && zzd(uri.toString())) {
            return true;
        }
        return false;
    }

    public final boolean zzb(String str) {
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNull(uri);
        if (zze(uri) && zzd(uri.toString())) {
            return true;
        }
        return false;
    }
}
