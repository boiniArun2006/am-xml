package androidx.privacysandbox.ads.adservices.adid;

import android.content.Context;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerApi31Ext9Impl;", c.f62177j, "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerApi31Ext9Impl;"}, k = 3, mv = {1, 8, 0})
final class AdIdManager$Companion$obtain$1 extends Lambda implements Function1<Context, AdIdManagerApi31Ext9Impl> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Context f40728n;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final AdIdManagerApi31Ext9Impl invoke(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new AdIdManagerApi31Ext9Impl(this.f40728n);
    }
}
