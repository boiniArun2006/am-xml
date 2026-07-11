package yc;

import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class oJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final M f76079n = n("52CCBC", "46A8D6");

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SceneElementType.values().length];
            try {
                iArr[SceneElementType.Shape.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SceneElementType.Drawing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SceneElementType.Scene.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SceneElementType.Text.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SceneElementType.Audio.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SceneElementType.Camera.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SceneElementType.NullObject.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final M O(M m2, long j2) {
        Intrinsics.checkNotNullParameter(m2, "<this>");
        return nr(new M(GeometryKt.mix(m2.rl(), m2.n(), ((((long) 191) * j2) % ((long) 7)) / 7.0f), GeometryKt.mix(m2.rl(), m2.n(), ((j2 * ((long) 773)) % ((long) 31)) / 31.0f)));
    }

    public static final M n(String start, String end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        return new M(HI0.qf.t(HI0.gnv.Uo(start) | (-16777216)), HI0.qf.t(HI0.gnv.Uo(end) | (-16777216)));
    }

    public static final M nr(M m2) {
        Intrinsics.checkNotNullParameter(m2, "<this>");
        return new M(m2.rl(), GeometryKt.mix(m2.rl(), m2.n(), 0.5f));
    }

    public static final M rl(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return O((sceneElement.getType() != SceneElementType.Shape || sceneElement.getLiveShape().getId() == null) ? t(sceneElement.getType()) : f76079n, sceneElement.getId());
    }

    public static final M t(SceneElementType sceneElementType) {
        Intrinsics.checkNotNullParameter(sceneElementType, "<this>");
        switch (j.$EnumSwitchMapping$0[sceneElementType.ordinal()]) {
            case 1:
                return n("48C3F5", "156AE0");
            case 2:
                return n("6F92D5", "A772D4");
            case 3:
                return n("F16586", "F66A28");
            case 4:
                return n("FAD961", "F89436");
            case 5:
                return n("5236D1", "AF62D6");
            case 6:
                return n("D13665", "AA214A");
            case 7:
                return n("BDC3CE", "A2AEC6");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
