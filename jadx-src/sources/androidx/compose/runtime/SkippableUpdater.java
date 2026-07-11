package androidx.compose.runtime;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\r¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/SkippableUpdater;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "t", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "", "rl", "(Landroidx/compose/runtime/Composer;)I", InneractiveMediationNameConsts.OTHER, "", c.f62177j, "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "composer", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class SkippableUpdater<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Composer composer;

    public static boolean n(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && Intrinsics.areEqual(composer, ((SkippableUpdater) obj).getComposer());
    }

    public static int rl(Composer composer) {
        return composer.hashCode();
    }

    public static String t(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    public boolean equals(Object obj) {
        return n(this.composer, obj);
    }

    public int hashCode() {
        return rl(this.composer);
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final /* synthetic */ Composer getComposer() {
        return this.composer;
    }

    public String toString() {
        return t(this.composer);
    }
}
