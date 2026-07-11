package androidx.compose.ui.node;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/DelegatableNode;", "", "Nxk", "()Ljava/lang/Object;", "traverseKey", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface TraversableNode extends DelegatableNode {
    Object Nxk();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/TraversableNode$Companion;", "", "()V", "TraverseDescendantsAction", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f32650n = new Companion();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TraverseDescendantsAction {
            private static final /* synthetic */ TraverseDescendantsAction[] J2;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f32653r;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final TraverseDescendantsAction f32652n = new TraverseDescendantsAction("ContinueTraversal", 0);

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final TraverseDescendantsAction f32654t = new TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public static final TraverseDescendantsAction f32651O = new TraverseDescendantsAction("CancelTraversal", 2);

            private static final /* synthetic */ TraverseDescendantsAction[] n() {
                return new TraverseDescendantsAction[]{f32652n, f32654t, f32651O};
            }

            public static TraverseDescendantsAction valueOf(String str) {
                return (TraverseDescendantsAction) Enum.valueOf(TraverseDescendantsAction.class, str);
            }

            public static TraverseDescendantsAction[] values() {
                return (TraverseDescendantsAction[]) J2.clone();
            }

            static {
                TraverseDescendantsAction[] traverseDescendantsActionArrN = n();
                J2 = traverseDescendantsActionArrN;
                f32653r = EnumEntriesKt.enumEntries(traverseDescendantsActionArrN);
            }

            private TraverseDescendantsAction(String str, int i2) {
            }
        }

        private Companion() {
        }
    }
}
