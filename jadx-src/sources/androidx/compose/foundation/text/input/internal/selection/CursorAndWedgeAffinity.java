package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011\u0088\u0001\u000b\u0092\u0001\u00020\n¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", "", "", "cursor", "t", "(I)J", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "wedgeAffinity", "nr", "(ILandroidx/compose/foundation/text/input/internal/WedgeAffinity;)J", "", "value", "O", "(J)J", c.f62177j, "(J)I", "rl", "(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "", "mUb", "(J)Ljava/lang/String;", "xMQ", InneractiveMediationNameConsts.OTHER, "", "J2", "(JLjava/lang/Object;)Z", "J", "Uo", "KN", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,560:1\n80#2:561\n80#2:562\n85#2:563\n90#2:564\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity\n*L\n527#1:561\n533#1:562\n544#1:563\n548#1:564\n*E\n"})
public final class CursorAndWedgeAffinity {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long value;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WedgeAffinity.values().length];
            try {
                iArr[WedgeAffinity.f20375n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WedgeAffinity.f20376t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static boolean J2(long j2, Object obj) {
        return (obj instanceof CursorAndWedgeAffinity) && j2 == ((CursorAndWedgeAffinity) obj).getValue();
    }

    public static long O(long j2) {
        return j2;
    }

    public static final int Uo(long j2) {
        return (int) (j2 >> 32);
    }

    public static String mUb(long j2) {
        return "CursorAndWedgeAffinity(value=" + j2 + ')';
    }

    public static long nr(int i2, WedgeAffinity wedgeAffinity) {
        int i3 = -1;
        int i5 = wedgeAffinity == null ? -1 : WhenMappings.$EnumSwitchMapping$0[wedgeAffinity.ordinal()];
        if (i5 != -1) {
            i3 = 1;
            if (i5 == 1) {
                i3 = 0;
            } else if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return O((((long) i2) << 32) | (((long) i3) & 4294967295L));
    }

    public static long t(int i2) {
        return O((((long) i2) << 32) | (((long) (-1)) & 4294967295L));
    }

    public static int xMQ(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return J2(this.value, obj);
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public int hashCode() {
        return xMQ(this.value);
    }

    public String toString() {
        return mUb(this.value);
    }

    public static final int n(long j2) {
        return Uo(j2);
    }

    public static final WedgeAffinity rl(long j2) {
        return KN(j2);
    }

    public static final WedgeAffinity KN(long j2) {
        int i2 = (int) (j2 & 4294967295L);
        if (i2 < 0) {
            return null;
        }
        if (i2 == 0) {
            return WedgeAffinity.f20375n;
        }
        return WedgeAffinity.f20376t;
    }
}
