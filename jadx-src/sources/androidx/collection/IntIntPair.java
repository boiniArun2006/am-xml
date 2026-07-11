package androidx.collection;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000f\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u0018"}, d2 = {"Landroidx/collection/IntIntPair;", "", "", "first", "second", "rl", "(II)J", "", "packedValue", "t", "(J)J", "", "KN", "(J)Ljava/lang/String;", "Uo", "(J)I", InneractiveMediationNameConsts.OTHER, "", "nr", "(JLjava/lang/Object;)Z", c.f62177j, "J", "O", "J2", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,82:1\n29#2:83\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n46#1:83\n*E\n"})
public final class IntIntPair {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final long packedValue;

    public static final int J2(long j2) {
        return (int) (j2 & 4294967295L);
    }

    public static final int O(long j2) {
        return (int) (j2 >> 32);
    }

    public static int Uo(long j2) {
        return Long.hashCode(j2);
    }

    public static final /* synthetic */ IntIntPair n(long j2) {
        return new IntIntPair(j2);
    }

    public static boolean nr(long j2, Object obj) {
        return (obj instanceof IntIntPair) && j2 == ((IntIntPair) obj).getPackedValue();
    }

    public static long rl(int i2, int i3) {
        return t((((long) i3) & 4294967295L) | (((long) i2) << 32));
    }

    public static long t(long j2) {
        return j2;
    }

    public boolean equals(Object obj) {
        return nr(this.packedValue, obj);
    }

    public int hashCode() {
        return Uo(this.packedValue);
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public static String KN(long j2) {
        return '(' + O(j2) + ", " + J2(j2) + ')';
    }

    public String toString() {
        return KN(this.packedValue);
    }

    private /* synthetic */ IntIntPair(long j2) {
        this.packedValue = j2;
    }
}
