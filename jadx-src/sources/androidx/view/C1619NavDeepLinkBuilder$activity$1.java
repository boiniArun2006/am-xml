package androidx.view;

import android.content.Context;
import android.content.ContextWrapper;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.navigation.NavDeepLinkBuilder$activity$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "it", c.f62177j, "(Landroid/content/Context;)Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
final class C1619NavDeepLinkBuilder$activity$1 extends Lambda implements Function1<Context, Context> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1619NavDeepLinkBuilder$activity$1 f40075n = new C1619NavDeepLinkBuilder$activity$1();

    C1619NavDeepLinkBuilder$activity$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Context invoke(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ContextWrapper contextWrapper = it instanceof ContextWrapper ? (ContextWrapper) it : null;
        if (contextWrapper != null) {
            return contextWrapper.getBaseContext();
        }
        return null;
    }
}
