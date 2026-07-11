package six;

import com.alightcreative.app.motion.scene.SceneType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Dsr {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SceneType.values().length];
            try {
                iArr[SceneType.SCENE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SceneType.ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SceneType.PRESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final fuX n(SceneType sceneType, String str) {
        Intrinsics.checkNotNullParameter(sceneType, "<this>");
        if (str != null) {
            return j.$EnumSwitchMapping$0[sceneType.ordinal()] == 3 ? fuX.J2 : fuX.f73288O;
        }
        int i2 = j.$EnumSwitchMapping$0[sceneType.ordinal()];
        if (i2 == 1) {
            return fuX.f73290n;
        }
        if (i2 == 2) {
            return fuX.f73293t;
        }
        if (i2 == 3) {
            return fuX.J2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ fuX rl(SceneType sceneType, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return n(sceneType, str);
    }
}
