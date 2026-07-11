package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Stable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Stable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00028\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/layout/StableValue;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "value", c.f62177j, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "nr", "(Ljava/lang/Object;)Ljava/lang/String;", "", "t", "(Ljava/lang/Object;)I", InneractiveMediationNameConsts.OTHER, "", "rl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
final class StableValue<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object value;

    public static Object n(Object obj) {
        return obj;
    }

    public static String nr(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public static boolean rl(Object obj, Object obj2) {
        return (obj2 instanceof StableValue) && Intrinsics.areEqual(obj, ((StableValue) obj2).getValue());
    }

    public static int t(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final /* synthetic */ Object getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return rl(this.value, obj);
    }

    public int hashCode() {
        return t(this.value);
    }

    public String toString() {
        return nr(this.value);
    }
}
