package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Immutable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\bJ\u001e\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "rl", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/animation/SizeTransform;)Landroidx/compose/animation/ContentTransform;", "SlideDirection", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "", "", "value", c.f62177j, "(I)I", "", "O", "(I)Ljava/lang/String;", "nr", InneractiveMediationNameConsts.OTHER, "", "rl", "(ILjava/lang/Object;)Z", "I", "Companion", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @JvmInline
    public static final class SlideDirection {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f14985t = n(0);
        private static final int nr = n(1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final int f14984O = n(2);
        private static final int J2 = n(3);
        private static final int Uo = n(4);
        private static final int KN = n(5);

        public static int n(int i2) {
            return i2;
        }

        public static int nr(int i2) {
            return Integer.hashCode(i2);
        }

        public static boolean rl(int i2, Object obj) {
            return (obj instanceof SlideDirection) && i2 == ((SlideDirection) obj).getValue();
        }

        public static final boolean t(int i2, int i3) {
            return i2 == i3;
        }

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public boolean equals(Object obj) {
            return rl(this.value, obj);
        }

        public int hashCode() {
            return nr(this.value);
        }

        public static String O(int i2) {
            return t(i2, f14985t) ? "Left" : t(i2, nr) ? "Right" : t(i2, f14984O) ? "Up" : t(i2, J2) ? "Down" : t(i2, Uo) ? "Start" : t(i2, KN) ? "End" : "Invalid";
        }

        public String toString() {
            return O(this.value);
        }
    }

    ContentTransform rl(ContentTransform contentTransform, SizeTransform sizeTransform);
}
