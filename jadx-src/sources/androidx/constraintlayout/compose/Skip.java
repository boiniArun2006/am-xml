package androidx.constraintlayout.compose;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Landroidx/constraintlayout/compose/Skip;", "", "", "t", "(Ljava/lang/String;)Ljava/lang/String;", "", "rl", "(Ljava/lang/String;)I", InneractiveMediationNameConsts.OTHER, "", c.f62177j, "(Ljava/lang/String;Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
public final class Skip {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String description;

    public static boolean n(String str, Object obj) {
        return (obj instanceof Skip) && Intrinsics.areEqual(str, ((Skip) obj).getDescription());
    }

    public static int rl(String str) {
        return str.hashCode();
    }

    public static String t(String str) {
        return "Skip(description=" + str + ')';
    }

    public boolean equals(Object obj) {
        return n(this.description, obj);
    }

    public int hashCode() {
        return rl(this.description);
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final /* synthetic */ String getDescription() {
        return this.description;
    }

    public String toString() {
        return t(this.description);
    }
}
